package Proxy;

import Factory.GameLevel;
import Factory.LevelCreator;

public interface LevelChanger {
	
	void restoreLevel(LevelCreator levelCreatorFactory, GameLevel currentGameLevel);
}
