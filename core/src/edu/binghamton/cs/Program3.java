package edu.binghamton.cs;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class Program3 extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	ShapeRenderer sr;
	boolean o_x_flag;
	TextButton o_x_button;
	Skin skin;
	Handler buttonHandler;
	float x, y, dx, dy;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("board.png");
		sr = new ShapeRenderer();
		o_x_flag = false;
		//buttonHandler = new Handler();
		x = 0;
		y = 0;
		dx = 1;
		dy = 1;
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor((float) (66/255.0), (float) (245/255.0), (float) (197/255.0), 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		if(x > 100) {
			dx = dx * -1;
		}
		if(x < 0) {
			dx = dx * -1;
		}
		if(y > 100) {
			dy = dy * -1;
		}
		if(y < 0) {
			dy = dy * -1;
		}
		x = x + dx;
		y = y + dy;
		batch.draw(img, x, y, 1000, 1000);
		batch.end();
		//skin = new Skin();
//		buttonHandler = new Handler();
//		o_x_button = new TextButton("Switch Symbol",skin,"small");
//		o_x_button.setSize(200,100);
//		o_x_button.setPosition(500,1250);
//		o_x_button.addListener(new InputListener(){
//			@Override
//			public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
//
//			}
//			@Override
//			public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
//				o_x_flag = !o_x_flag;
//				return true;
//			}
//		});
	}

	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

}
