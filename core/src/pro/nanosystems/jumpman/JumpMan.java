package pro.nanosystems.jumpman;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class JumpMan extends ApplicationAdapter {
    // TODO (1) Copy all images to android/assets folder
    // TODO (2) Declare Object from SpriteBatch:  SpriteBatch batch;
    // TODO (3) Declare Object from Texture:  Texture background;

    SpriteBatch batch;
    Texture background;


    @Override
    public void create() {
        // TODO (4) Instantiate batch Object:  batch = new SpriteBatch();
        batch = new SpriteBatch();
        // TODO (5) Instantiate background Object:  background = new Texture("bg.png");
        background = new Texture("bg.png");
    }

    @Override
    public void render() {
        // TODO (6) Begin draw scene: batch.begin();
        batch.begin();
        // draw scene
        // TODO (7) Draw background texture:  batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        // TODO (8) End draw scene: batch.end();
        batch.end();
    }

    @Override
    public void dispose() {
        // TODO (9) destroy or dispose or free up memory: batch.dispose();
        batch.dispose();
        // TODO (10) destroy or dispose or free up memory: background.dispose();
        background.dispose();

    }
}
