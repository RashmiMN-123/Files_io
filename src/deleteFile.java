import java.io.File;
import java.io.IOException;

public class deleteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("C:\\program3del");
		f1.mkdir();
		File file3=new File("C:\\program3del\\firstfile.txt");
	      file3.createNewFile();
	      file3.delete();
	      f1.delete();
	}

}
