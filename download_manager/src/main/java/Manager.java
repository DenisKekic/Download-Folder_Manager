import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.logging.FileHandler;

public class Manager {

    public void folder_manager(){

        File downloadFolder = new File("H:\\Download_test");
        File folder_videos = new File("H:\\Downloads_videos");
        File folder_music = new File("H:\\Downloads_music");
        File folder_test = new File("H:\\Download_test2");
        //Path folder_pdf = Path.of("H:\\Downloads_pdf");
        String folder_images = "H:/Downloads_images";
        //private String folder_videos = "";
        String folder_ = "H:/Downloads_";

        Path downloadFolder2 = Paths.get("H:\\Download_test2");

        File[] content = downloadFolder.listFiles();

        for (File file : content) {
            String fileNamePath = file.getPath();

            if(fileNamePath.contains(".txt")){
                Path source = Paths.get(fileNamePath);
                try {
                    Files.move(source, downloadFolder2,StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(fileNamePath);
                System.out.println("Moved");
            }
            else{
                //System.out.println("Not Moved");
            }
        }
    }
}
