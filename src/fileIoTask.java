import java.io.File;
import java.io.IOException;
public class fileIoTask {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		//CREATE A DIRECTORY
		File f = new File("C:\\program");
		File f1=new File("C:\\program1");
		f1.mkdir();
		if(!(f.exists()&&f.isDirectory()))
			f.mkdir();
		else
			System.out.println("directory already exists!");
		//GET PARENT OF A DIRECTORY
	      System.out.println(f.getParent());
	     
	      //CHECK WHETHER FILE IS HIDDEN OR NOT
	      System.out.println(f.isHidden());
	      
	      //CREATE A NEW FILE
	      File file1=new File("C:\\program\\newfile.txt");
	      File file2=new File("C:\\program\\secondfile.txt");
	      file2.createNewFile();
	      System.out.println(file2.getParent());
	      boolean createdfile=file1.createNewFile();
          if(createdfile) {
        	  System.out.println("File created!");
          }
          else
          {
        	  System.out.println("File creation issue");
          }
   
           //MOVE FILES FROM ONE FOLDER TO ANOTHER
//         
//          sourcefile.renameTo(new File("C:\\program1"));
          
          
	}

	

}
