package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.LogEntry;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtm = DateTimeFormatter.ISO_DATE_TIME;
		
		Set<LogEntry> log = new HashSet<>(); 
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(" ");
				String name = fields[0];
				LocalDateTime instant = LocalDateTime.parse(fields[1], dtm);
				log.add(new LogEntry(name, instant));
				line = br.readLine();
			}
			
			System.out.println("Total users: " + log.size());
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
		
	}

}
