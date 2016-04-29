import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EditFile {
	
	public static void main(String...args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("raw_file.txt"));
		StringBuffer strBfr;
    		try {
        		StringBuilder sb = new StringBuilder();
        		String line = br.readLine();

        		while (line != null) {
            		sb.append(line);
            		sb.append("\n");
            		line = br.readLine();
        		}

        		//System.out.println(sb.toString());
			strBfr = new StringBuffer(sb.toString()); //to be able to make changes to the string
			//System.out.println(strBfr);
    		} finally {
        			br.close();
    		}
		
		
	}
	
}
