package Proxy;

import Factory.GameLevel;
import Factory.LevelCreator;

public class RealLevelChanger implements LevelChanger {

	@Override
	public void restoreLevel(LevelCreator levelCreatorFactory, GameLevel currentGameLevel) {
		currentGameLevel = levelCreatorFactory.createLevel();
		currentGameLevel.loadLevelResources();
	}

}
