package test.utilities.terminate;

import dmk.utilities.terminate.TerminateManager;

public class TestDrive {

public static void main(String[] args) {
		
		System.out.println("## START ##");
		
		TerminateManager terminateManager = TerminateManager.getInstance();
		terminateManager.regist(new TerminateImplements());
		
		System.out.println("## END ##");
		
	}
}
