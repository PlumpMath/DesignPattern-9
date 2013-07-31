package com.lcx.DesignPattern.State.sample1;

public class Main {

	public static void main(String[] args) {
		Work emergencyProject = new Work();
		emergencyProject.setHour(9);
		emergencyProject.writeProgram();
		emergencyProject.setHour(10);
		emergencyProject.writeProgram();
		emergencyProject.setHour(12);
		emergencyProject.writeProgram();
		emergencyProject.setHour(13);
		emergencyProject.writeProgram();
		emergencyProject.setHour(14);
		emergencyProject.writeProgram();
		emergencyProject.setHour(17);

		emergencyProject.setFinished(false);
//		emergencyProject.setFinished(true);
		
		emergencyProject.writeProgram();
		emergencyProject.setHour(19);
		emergencyProject.writeProgram();
		emergencyProject.setHour(22);
		emergencyProject.writeProgram();
	}

}
