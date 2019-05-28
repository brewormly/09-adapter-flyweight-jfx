package ohm.softa.a09.resource;

import javafx.scene.image.Image;

public class FxImageLoaderAdapter {
	private final ResourceLoader<Image> imageResourceLoader = new ResourceLoader<>(Image::new);

	public Image loadImage(String path) {
		return imageResourceLoader.loadResource(ClassLoader.getSystemClassLoader(), path);
	}

}
