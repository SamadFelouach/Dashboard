package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CardFrame {
    public  String My_image;



    @FXML private ImageView imageview;





    @FXML

    public void browse(ActionEvent event) throws FileNotFoundException {
        FileChooser cardChooser = new FileChooser();
        cardChooser.setInitialDirectory(new File("C:\\Users\\Avicii\\Desktop\\GI2\\ProjetJava\\src\\sample\\workspace"));
        File FileSelected =cardChooser.showOpenDialog(null);

  //Filtrer les fichier selectionnees
        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png");
        Image image = new Image(new FileInputStream(FileSelected.getAbsolutePath()));
        if (FileSelected !=null){
            imageview.setImage(image);
            My_image =FileSelected.getAbsolutePath();
            System.out.println("Chemin de l'mage" + My_image);
        }else
            System.out.println("erreur");
    }

    public void scannerOperation(ActionEvent event) throws IOException {
          System.out.println("ok");
    }
}
