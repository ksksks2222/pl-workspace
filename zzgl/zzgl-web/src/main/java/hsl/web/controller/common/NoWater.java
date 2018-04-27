package hsl.web.controller.common;

import java.awt.image.BufferedImage;

import com.google.code.kaptcha.GimpyEngine;
import com.google.code.kaptcha.util.Configurable;

public class NoWater extends Configurable implements GimpyEngine {

	@Override
	public BufferedImage getDistortedImage(BufferedImage baseImage) {
		 return baseImage;
	}

}
