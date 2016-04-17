import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EditFile {
	
	public static void main(String...args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("raw_file.txt"));
    		try {
        		StringBuilder sb = new StringBuilder();
        		String line = br.readLine();

        		while (line != null) {
            		sb.append(line);
            		sb.append("\n");
            		line = br.readLine();
        		}
        		System.out.println(sb.toString());
    		} finally {
        			br.close();
    		}
		
		
	}
	
}
