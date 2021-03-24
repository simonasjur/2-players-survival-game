package Memento;

import java.util.HashMap;
import java.util.Map;

public class PlayerCaretaker {
	
	protected Map<String, Map<String, PlayerMemento>> mementoHistory = new HashMap<String, Map<String, PlayerMemento>>();
	
    public void addMemento(String nickname, String mementoMessage, PlayerMemento memento) {
        if (mementoMessage != null && mementoMessage.trim().length() != 0 && memento != null) {
            Map<String, PlayerMemento> mementoMessageMap = mementoHistory.get(nickname);
            if (mementoMessageMap == null) {
                mementoMessageMap = new HashMap<String, PlayerMemento>();
                mementoHistory.put(nickname, mementoMessageMap);
            }
            mementoMessageMap.put(mementoMessage, memento);
            System.out.printf("Snapshot of player nickname '%s' stored with message '%s'.\n", memento.getNickname(),
                    mementoMessage);
        }
    }

    public PlayerMemento getMemento(String nickname, String mementoMessage) {
        PlayerMemento memento = null;
        if (mementoMessage != null && mementoMessage.trim().length() != 0) {
            Map<String, PlayerMemento> mementoMessageMap = mementoHistory.get(nickname);
            if (mementoMessageMap != null) {
                memento = mementoMessageMap.get(mementoMessage);
                if (memento != null) {
                    System.out.printf("Snapshot of player nickname '%s' with message '%s' restored\n", memento.getNickname(),
                            mementoMessage);
                } else {
                    System.err.println("Not able to find the memento!");
                }
            }
        }
        return memento;
    }

    public void printStoredMementoObjects() {
        System.out.println("======================================================");
        mementoHistory.forEach((nickname, mementoMessageMap) -> {
            mementoMessageMap.forEach((message, memento) -> {
                System.out.printf("Nickname: '%d', Message: '%s', Memento: '%s'\n", nickname, message, memento);
            });
        });
        System.out.println("======================================================");
    }
 }
