import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.logging.FileHandler;

public class Manager {

    public void folder_manager(){

        File downloadFolder = new File("H:\\Downloads");

        Path folder_files = Paths.get("H:\\Downloads_files");
        Path folder_videos = Paths.get("H:\\Downloads_videos");
        Path folder_image = Paths.get("H:\\Downloads_images");
        Path folder_zip = Paths.get("H:\\Downloads_zip");
        Path folder_exe = Paths.get("H:\\Downloads_exe");
        Path folder_code = Paths.get("H:\\Downloads_code");
        Path folder_illustrator = Paths.get("H:\\Downloads_Illustrator");

        File[] content = downloadFolder.listFiles();

        for (File file : content) {
            String fileNamePath = file.getPath();

            if(fileNamePath.contains(".txt") || fileNamePath.contains(".md") || fileNamePath.contains(".pdf") || fileNamePath.contains(".docx") || fileNamePath.contains(".xls") || fileNamePath.endsWith(".PDF") || fileNamePath.endsWith(".odt") || fileNamePath.endsWith(".pptx") || fileNamePath.endsWith(".accdb")|| fileNamePath.endsWith(".potx") || fileNamePath.endsWith(".drawio")){
                Path source = Paths.get(fileNamePath);
                Path target = Paths.get(folder_files.toAbsolutePath().toString() + "\\" + file.getName());
                try {
                    Files.move(source, target,StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(fileNamePath);
                System.out.println("Moved");
            }
            else if(fileNamePath.endsWith(".mp4") || fileNamePath.endsWith(".m4v") || fileNamePath.endsWith(".mov")){
                Path source = Paths.get(fileNamePath);
                Path target = Paths.get(folder_videos.toAbsolutePath().toString() + "\\" + file.getName());
                try {
                    Files.move(source, target,StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(fileNamePath);
                System.out.println("Moved");
            }
            else if(fileNamePath.endsWith(".zip") || fileNamePath.endsWith(".rar")){
                Path source = Paths.get(fileNamePath);
                Path target = Paths.get(folder_zip.toAbsolutePath().toString() + "\\" + file.getName());
                try {
                    Files.move(source, target,StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(fileNamePath);
                System.out.println("Moved");
            }
            else if(fileNamePath.endsWith(".jpg") || fileNamePath.endsWith(".png") || fileNamePath.endsWith(".jpeg") || fileNamePath.endsWith(".PNG") || fileNamePath.endsWith(".jfif")){
                Path source = Paths.get(fileNamePath);
                Path target = Paths.get(folder_image.toAbsolutePath().toString() + "\\" + file.getName());
                try {
                    Files.move(source, target,StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(fileNamePath);
                System.out.println("Moved");
            }
            else if(fileNamePath.endsWith(".exe") || fileNamePath.endsWith(".msi") ){
                Path source = Paths.get(fileNamePath);
                Path target = Paths.get(folder_exe.toAbsolutePath().toString() + "\\" + file.getName());
                try {
                    Files.move(source, target,StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(fileNamePath);
                System.out.println("Moved");
            }
            else if(fileNamePath.endsWith(".c") || fileNamePath.endsWith(".js") || fileNamePath.endsWith(".java") || fileNamePath.endsWith(".h") || fileNamePath.endsWith(".sql")){
                Path source = Paths.get(fileNamePath);
                Path target = Paths.get(folder_code.toAbsolutePath().toString() + "\\" + file.getName());
                try {
                    Files.move(source, target,StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(fileNamePath);
                System.out.println("Moved");
            }
            else if(fileNamePath.endsWith(".ai")){
                Path source = Paths.get(fileNamePath);
                Path target = Paths.get(folder_illustrator.toAbsolutePath().toString() + "\\" + file.getName());
                try {
                    Files.move(source, target,StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(fileNamePath);
                System.out.println("Moved");
            }
        }
    }
}
