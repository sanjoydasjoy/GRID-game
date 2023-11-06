package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class Main extends Application {
    //private MediaPlayer mediaPlayer;

    @Override
//    public void start(Stage stage) {
//        try {
//           // music();
//            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//            Scene scene = new Scene(root, 1385, 750);
//            
//            String css = getClass().getResource("application.css").toExternalForm();
//            stage.setTitle("Grid Killing");
//            scene.getStylesheets().add(css);
//            stage.setScene(scene);
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    
    public void start(Stage stage) {
        try {
           // music();
            Parent root = FXMLLoader.load(getClass().getResource("first.fxml"));
            Scene scene = new Scene(root, 1385, 750);
//            Image image = new Image("htp.jpg");
//            stage.getIcons().add(image);
            String css = getClass().getResource("first.css").toExternalForm();
            stage.setTitle("Grid Game");
            scene.getStylesheets().add(css);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void music() {
//        try {
//            String musicFile = "peo.mp3";
//            Media sound = new Media(getClass().getResource(musicFile).toURI().toString());
//            mediaPlayer = new MediaPlayer(sound);
//            mediaPlayer.play();
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        }
    

    public static void main(String[] args) {
        launch(args);
    }
}
