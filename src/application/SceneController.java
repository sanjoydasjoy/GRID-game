package application;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    public Button backButton,tButton,startt,myButton;
    @FXML
    public Label scoreLabel,racketLabel,gridLabel,borderLabel,howtoplay;
    public void setScore(int score) {
        scoreLabel.setText("Your Score is: " + score);}
    public void setgridsBreak(int grid) {
    	gridLabel.setText("*Number of Grids Smashed: " + grid);}
    public void setBorderClash(int border) {
    	racketLabel.setText("*Number of Times Border Clashed: " + border);}
    public void setRacketClash(int racket) {
    	borderLabel.setText("*Number of Times Racket Clashed: " + racket);}
    
    public void instructions(ActionEvent event) throws IOException {
    	myButton.setVisible(false);
    	Parent root = FXMLLoader.load(getClass().getResource("newscene.fxml"));
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	Scene scenee = new Scene(root, 1385,750);
    	String cs1 = this.getClass().getResource("xtra.css").toExternalForm();
    	stage.setTitle("Grid Game");
    	scenee.getStylesheets().add(cs1);
    	stage.setScene(scenee);
    	stage.show();}

    public void back(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("first.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 1385, 750);
        String css = this.getClass().getResource("first.css").toExternalForm();
        stage.setTitle("Grid Game");
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();}
    
    public void front(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, 1385, 750);
        String css = this.getClass().getResource("application.css").toExternalForm();
        stage.setTitle("Grid Game");
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();}

    public void loggout(ActionEvent event){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("EXIT");
        alert.setHeaderText("Do you want to close this app?: ");
        if (alert.showAndWait().get() == ButtonType.OK) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            System.out.println("You have successfully logged out!");
            stage.close();}
        }
}
