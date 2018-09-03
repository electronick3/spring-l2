package net.zt.funcode.components;

import org.springframework.stereotype.Component;

import net.zt.funcode.annotation.UnproducableCameraRoll;

@Component("cameraRoll")
@UnproducableCameraRoll(usingCameraRollClass=ColorCameraRoll.class)
public class BlackAndWhiteCameraRoll implements CameraRoll {
	
	
	public void processing(){
		
		System.out.println("-1 черно-белый кадр");
		
	}


}
