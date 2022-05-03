package cs491.fa1;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class ForestAdventures extends ApplicationAdapter {
	SpriteBatch batch;
	Texture racoon;
	Texture bunny;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		racoon= new Texture("Game Assets/racoon.png");
		//racoon = new Texture("raccoon.png");
		//bunny = new Texture("Bunny Base Sprite.png");


	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(racoon, 0, 0);
		//batch.draw(bunny, 50, 50);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		racoon.dispose();
	}
}
