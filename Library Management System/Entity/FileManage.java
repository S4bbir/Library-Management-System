package Entity;
import java.io.*;
import javax.swing.*;


public class FileManage {

    // string for storing the input data
    private String bookList;
    private String name;
    private String id;
    private String gender;
    private String borrowingFor;
    private String leaveAMassage;

    // file for adding data to store into text file
    private File file;
    private FileWriter fwriter;

    // creating constractor
    public FileManage() {
    }

    public FileManage(String bookList, String name, String id, String gender, String borrowingFor, String leaveAMassage) {
        this.bookList = bookList;
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.borrowingFor = borrowingFor;
        this.leaveAMassage = leaveAMassage;
    }

    public void insertValues() {
        try {
            // get the file
            file = new File("./Data/userdata.txt");

            // create file if not exist
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            // do nothing
            else {
            }

            // writing in the file
            fwriter = new FileWriter(file, true); // for not overriding
            fwriter.write("\n");
            fwriter.write("\n");
            fwriter.write("    Name: " + name + "\n");
            fwriter.write("    ID : " + id + "\n");
            fwriter.write("    Gender: " + gender + "\n");
            fwriter.write("    Borrowing for: " + borrowingFor + "\n");
            fwriter.write("    Book list: " + bookList + "\n");
            fwriter.write("    Massage: " + leaveAMassage + "\n");
            fwriter.write("\n");

            // writing and saving
            fwriter.flush();
            // closing the file
            fwriter.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error File");
        }
    }

}