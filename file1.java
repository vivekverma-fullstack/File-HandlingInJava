import java.io.File;
import java.io.IOException;

class file1{
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\lenovo\\OneDrive\\Desktop\\Java Files\\File Handling\\myfile.txt");
            if (file.createNewFile()) {
                System.out.println("File Created: "+ file.getName());
            } else{
                System.out.println("File already Created");
            }
            if (file.exists()) {
                System.out.println("File Name: "+  file.getName());
                System.out.println("File Path: "+file.getAbsolutePath());
                System.out.println("Writable: "+file.canWrite());
                System.out.println("Readable: "+file.canRead());
                System.out.println("File Sizxe: "+file.length() + " bytes");
            }
        } catch(IOException e){
                System.out.println("An error accoured.");
                e.printStackTrace();
        }
    }
}