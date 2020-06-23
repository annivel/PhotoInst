package tools;

import instPages.DriverPage;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class SaveStep extends DriverPage {
    public static int ID = 0;

    public void savePhoto(String urlPhoto) {
        InputStream inputStream = null;
        try {
            inputStream = new URL(urlPhoto).openStream();
            Files.copy(inputStream, Paths.get("img" + ID + ".png"), StandardCopyOption.REPLACE_EXISTING);
            ID++;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
