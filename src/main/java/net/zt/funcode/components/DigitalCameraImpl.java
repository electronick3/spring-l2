package net.zt.funcode.components;

import net.zt.funcode.annotation.OtherDigitalCamera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class DigitalCameraImpl implements Camera {
	
	
	@Autowired
	private CameraRoll cameraRoll;
	
	@Value("false")
	private boolean broken;
	
	
	public CameraRoll getCameraRoll() {
		return cameraRoll;
	}

	public void setCameraRoll(CameraRoll cameraRoll) {
		this.cameraRoll = cameraRoll;
	}


	public boolean isBroken() {
		return broken;
	}

   public void breaking(){
	   
	   this.broken=true;
   }

   

	public void doPhotograph(){
		
		if(isBroken()){
			
			System.out.println("У фотика сломана матрица!");
			return;
		}
		    System.out.println("Сделана фотография jpeg");
		    cameraRoll.processing();
		
		
	}

	@PostConstruct
	public void ready() {
		
		System.out.println("Фотоаппарат is ready to use!");
		
	}
}