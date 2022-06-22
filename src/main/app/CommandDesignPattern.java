package main.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandDesignPattern {
	public static void main (String [] args)throws IOException, InterruptedException {
		String [] command = {"ping", "google.com"};
//		System.out.println("Hello World!");		
		ProcessBuilder processBuilder = new ProcessBuilder("ping", "google.com");
		processBuilder.directory(new File(System.getProperty("user.home")));
		
		try {
			Process process = processBuilder.start();
			BufferedReader reader = 
	                new BufferedReader (new InputStreamReader(process.getInputStream()));
	            
	            String line;
	            
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	            
	            int exitCode = process.waitFor(); 
	            
	            System.out.println ("\nExited with error code : " + exitCode);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void RunCommand() {
		RunCommand runCommand = new RunCommand();
		EdlCommands edlCommands = new EdlCommands();
		
		runCommand.SetCommand(new RunEdlCommands(edlCommands));
		runCommand.Run();
	}
}
