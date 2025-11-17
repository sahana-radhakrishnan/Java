import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            // Trying to open a file that may not exist
            FileReader fr = new FileReader("myfile.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file does not exist in the specified path.");
        } catch (IOException e) {
            System.out.println("Error while reading the file.");
        }
    }
}
