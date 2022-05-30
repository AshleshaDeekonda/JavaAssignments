package com.cg.assignment2;

abstract class Persistence {
	
	public abstract void persist();
	}
	class FilePersistence extends Persistence{

		@Override
		public void persist() {
			// TODO Auto-generated method stub
			System.out.println("The Client Data is stored in terms of Files");
		}
		
	}

	class DatabasePersistence extends Persistence{

		@Override
		public void persist() {
			System.out.println("The client data is stored in terms of Database");
		}
		
	}
	public class FileAndDatabase {

		public static void main(String[] args) {
			Persistence perFile=new FilePersistence();
			perFile.persist();
			
			Persistence perDatabase=new DatabasePersistence();
			perDatabase.persist();
		}
	
	

}
