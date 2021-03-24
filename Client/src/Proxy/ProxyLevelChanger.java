package Proxy;

import Factory.EasyLevelCreator;
import Factory.ExtremeLevelCreator;
import Factory.GameLevel;
import Factory.HardLevelCreator;
import Factory.LevelCreator;
import Factory.NormalLevelCreator;

public class ProxyLevelChanger implements LevelChanger {
	
	private RealLevelChanger realLevelChanger = new RealLevelChanger();
	
	@Override
	public void restoreLevel(LevelCreator levelCreatorFactory, GameLevel currentGameLevel) {
		switch (currentGameLevel.getGameLevelName()) {
			case "EASY_LVL":				
				levelCreatorFactory = new EasyLevelCreator();
				realLevelChanger.restoreLevel(levelCreatorFactory, currentGameLevel);
				break;
			case "NORMAL_LVL":
				levelCreatorFactory = new NormalLevelCreator();
				realLevelChanger.restoreLevel(levelCreatorFactory, currentGameLevel);
   				break;
			case "HARD_LVL":
				levelCreatorFactory = new HardLevelCreator();
				realLevelChanger.restoreLevel(levelCreatorFactory, currentGameLevel);
				break;
			case "EXTREME_LVL":
				levelCreatorFactory = new ExtremeLevelCreator();
				realLevelChanger.restoreLevel(levelCreatorFactory, currentGameLevel);
   				break;
		}
	}

}
