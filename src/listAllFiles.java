import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class listAllFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("C:\\program3list");
		f1.mkdir();
		File file3=new File("C:\\program3list\\firstfile.txt");
	      file3.createNewFile();
	      File file4=new File("C:\\program3list\\secondfile.doc");
	      file4.createNewFile();
	      File file5=new File("C:\\program3list\\abc123.txt");
	      file5.createNewFile();
	      FilenameFilter  filter=new FilenameFilter() {
			public boolean accept(File f1, String name) {
				//return name.matches("[a-zA-z]+\\.[a-z]+");
		        //return name.matches("[a-c]{3}[1-3]{3}+\\.[a-z]+");
				return name.matches("[a-z]+\\.[a-z]+");
			}
	    	  
	      };
	      File[] files = f1.listFiles(filter);
          for (int i = 0; i < files.length; i++) {
              System.out.println(files[i].getName());
          }

	}

}
