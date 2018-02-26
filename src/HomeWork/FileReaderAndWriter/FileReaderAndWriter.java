package HomeWork.FileReaderAndWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderAndWriter {
    public static void main(String[] args) throws IOException {
        String text = "some text4";
        String text2 ="some text5";
        FileWriter fileWriter = new FileWriter("Test file");
        FileReader fileReader = new FileReader("Test file");
        Scanner scanner = new Scanner(fileReader);

        fileWriter.write(System.lineSeparator()+text);
        fileWriter.append("\n"+text2);
        fileWriter.append(System.lineSeparator()+text);

        fileWriter.close();

        while (scanner.hasNext()){
        System.out.println(scanner.nextLine());
        }
        fileReader.close();

    }
}
