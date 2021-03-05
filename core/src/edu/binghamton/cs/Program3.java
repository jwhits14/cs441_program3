package edu.binghamton.cs;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Program3 extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Button select_x;
	Button select_o;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("board.png");
	}

	@Override
	public void render () {
		tick();
		Gdx.gl.glClearColor((float) (66/255.0), (float) (245/255.0), (float) (197/255.0), 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 225, 350, 1000, 1000);
		batch.draw()
		batch.end();
	}

	public void tick() {

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
