import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EditFile {
	public static void main(){
		EditFile ef = new EditFile();
		try {
		String contents = ef.readFile("raw_file.txt");
		}
		catch(IOException e){
			System.out.println("your code is worse!");
		}
		System.out.println(contents);
		StringBuffer sb = new StringBuffer(contents);
		
	}
	String readFile(String fileName) throws IOException {
    		BufferedReader br = new BufferedReader(new FileReader(fileName));
    		try {
        		StringBuilder sb = new StringBuilder();
        		String line = br.readLine();

        		while (line != null) {
            		sb.append(line);
            		sb.append("\n");
            		line = br.readLine();
        		}
        		return sb.toString();
    		} finally {
        			br.close();
    		}
	}
}
