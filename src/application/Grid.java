package application;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.Scene;
import javafx.application.Platform;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Set;
public class Grid extends GridBuild implements Initializable{
    @FXML
    private AnchorPane scene;
    @FXML
    private Circle circle;
    @FXML
    private Rectangle racket,racket2,racket3,racket4,racket5,danger1,danger2;
    @FXML
    private Button startButton,exitButton,myButton,tButton,backkButton;
    private Stage stage;
	private Scene scenee;
	private Set<KeyCode> pressedKeys = new HashSet<>(); 
    private int racketSize = 5,velocityX = 2,velocityY = -4,clashwithBorder=0,clashwithracket=0,
    		totalScore = 0,racketV = 200,racketX=0,racketY = 100,racket2Size = 800,racket2V = 500,
    		racket2X = 56,racket2Y=26,racket3Size=5,racket4Size=100,racket5Size=80,gridsBreakCount=0;

    public void playGame(ActionEvent event){
        startButton.setVisible(false);
        backkButton.setVisible(false);
        LetsPlay();}
    
    public void logout(ActionEvent event){
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("EXIT");
		alert.setHeaderText("You're are about to exit!");
		alert.setContentText("Do you really want to exit?: ");
		if(alert.showAndWait().get() == ButtonType.OK) {
		Stage stage = (Stage)scene.getScene().getWindow();
		System.out.println("You have successfully logged out!");
		stage.close();}} 

    public void backk(ActionEvent event) throws IOException {
    	//myButton.setVisible(false);
    	Parent root = FXMLLoader.load(getClass().getResource("first.fxml"));
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scenee = new Scene(root, 1385,750);
    	String cs1 = this.getClass().getResource("first.css").toExternalForm();
    	stage.setTitle("Grid Game");
    	scenee.getStylesheets().add(cs1);
    	stage.setScene(scenee);
    	stage.show();}
    
    Timeline t = new Timeline(new KeyFrame(Duration.millis(10),new EventHandler<ActionEvent>(){
        public void handle(ActionEvent event){Animation();}}));
    
    public void LetsPlay() {
        LETS_create_GRIDS();totalScore = 0;t.play();}
    
    public void initialize(URL url, ResourceBundle resourceBundle) {
        racket.setWidth(racketSize);racket2.setWidth(racket2Size);racket2.setLayoutX(racket2X);racket2.setLayoutX(racket2Y);
        racket3.setWidth(racket3Size);racket4.setWidth(racket4Size);racket5.setWidth(racket5Size);t.setCycleCount(Animation.INDEFINITE);}
    
    public void score(){totalScore+=8;} 
    
    public void racket3Shift() {
        double racket3Y = racket3.getLayoutY();
        double racket3V = 10.0;

        if (pressedKeys.contains(KeyCode.DIGIT3)) {
            racket3.setLayoutY(racket3Y - racket3V);
        } else if (pressedKeys.contains(KeyCode.DIGIT4)) {
            racket3.setLayoutY(racket3Y + racket3V);
        }
    }
    public void racket4Shift() {
        double racket4Y = racket4.getLayoutY();
        double racket4V = 10.0;

        if (pressedKeys.contains(KeyCode.DIGIT1)) {
            racket4.setLayoutY(racket4Y - racket4V);
        } else if (pressedKeys.contains(KeyCode.DIGIT2)) {
            racket4.setLayoutY(racket4Y + racket4V);
        }
    }
    public void racket5Shift() {
        double racket5Y = racket5.getLayoutY();
        double racket5V = 10.0;

        if (pressedKeys.contains(KeyCode.DIGIT5)) {
            racket5.setLayoutY(racket5Y - racket5V);
        } else if (pressedKeys.contains(KeyCode.DIGIT6)) {
            racket5.setLayoutY(racket5Y + racket5V);
        }
    }


    public void racketShift(){
        if(pressedKeys.contains(KeyCode.UP)){racket.setLayoutY(racketY - racketV);} 
        else if(pressedKeys.contains(KeyCode.DOWN)){racket.setLayoutY(racketY + racketV);}}
    
    public void racket2Shift(){
        if(pressedKeys.contains(KeyCode.LEFT)){racket2.setLayoutX(racket2X - racket2V);} 
        else if(pressedKeys.contains(KeyCode.RIGHT)){racket2.setLayoutX(racket2X + racket2V);}}
    
    private void Animation(){
        clash__Racket();clash__Racket2();clash__Racket3();clash__Racket4();clash__Racket5();Circle();extractGrids();clash__Borders();
        dangerousClash1();dangerousClash2();setupKeyListeners();}
    
    private void Circle(){
        circle.setLayoutX(circle.getLayoutX()+velocityX);circle.setLayoutY(circle.getLayoutY()+velocityY);}
    
    private void setupKeyListeners(){
    	scene.setOnKeyPressed(event -> handleKeyPress(event.getCode()));
        scene.setOnKeyReleased(event -> handleKeyRelease(event.getCode()));
        scene.requestFocus();}
    
    public void handleKeyPress(KeyCode keyCode){
        pressedKeys.add(keyCode);
        racketShift();
        pressedKeys.add(keyCode);
        racket2Shift();
        pressedKeys.add(keyCode);
        racket3Shift();
        pressedKeys.add(keyCode);
        racket4Shift();
        pressedKeys.add(keyCode);
        racket5Shift();
        }

    public void handleKeyRelease(KeyCode keyCode){pressedKeys.remove(keyCode);}

    public void extractGrids(){
        Iterator<Rectangle> iterator= grids.iterator();
        while(iterator.hasNext()){
        	Rectangle grid = iterator.next();
            if(clash__Grid(grid)==1){iterator.remove();}}
        if (grids.isEmpty()){t.stop();
            Platform.runLater(() -> {
                try {
                	FXMLLoader loader = new FXMLLoader(getClass().getResource("gameover.fxml"));
                    Parent root = loader.load();
                    SceneController sceneController = loader.getController();
                    sceneController.setScore(totalScore);
                    sceneController.setgridsBreak(gridsBreakCount);
                    sceneController.setBorderClash(clashwithBorder);
                    sceneController.setRacketClash(clashwithracket);
                    totalScore=0;
                   
                    AnchorPane anchorPane = new AnchorPane();
                    anchorPane.getChildren().add(root);
                    Scene scent = new Scene(anchorPane, 1385, 750);
                    Stage stage = new Stage();
                    String css = this.getClass().getResource("gamover.css").toExternalForm();
                    stage.setTitle("Game Over");
                    scent.getStylesheets().add(css);
                    stage.setScene(scent);
                    stage.show();
                }catch(IOException e){e.printStackTrace();}});}}

    ////////////////////////////////////CLASHING PART START////////////////////////////////////////
    
    private void clash__Borders(){
        int r=(int)circle.getRadius(),lX=(int) circle.getLayoutX(),lY=(int) circle.getLayoutY();
        if(lX-radius<0||lX+radius>sceneX){clashwithBorder+=1;totalScore-=4;velocityX *= -1.2;}else{velocityX*=1.2;}
        if(lY-r<0||lY+radius>sceneY){clashwithBorder+=1;totalScore-=4;velocityY*=-1.2;}else{velocityY*=1.2;}}

    private void clash__Racket(){
        if(circle.getBoundsInParent().intersects(racket.getBoundsInParent())){clashwithracket++;totalScore -= 2;
            double lX=circle.getLayoutX(),lY=circle.getLayoutY(),rLX=racket.getLayoutX(),rLY=racket.getLayoutY(),rW=racket.getWidth(),rH=racket.getHeight(),r=circle.getRadius();
            if(lX>=(rLX+rW-r)||lX<=(rLX+r)){velocityX *= -1.2;}else{velocityX *= 1.2;}
            if(lY>=(rLY+rH-r)||lY<=(rLY+r)){velocityY *= -1.2;}else{velocityY *= 1.2;}}}
    
    private void clash__Racket2(){
        if(circle.getBoundsInParent().intersects(racket2.getBoundsInParent())){clashwithracket++;totalScore -= 2;
            double lX=circle.getLayoutX(),lY=circle.getLayoutY(),rLX=racket2.getLayoutX(),rLY=racket2.getLayoutY(),rW=racket2.getWidth(),rH=racket2.getHeight(),r=circle.getRadius();
            if(lX>=(rLX+rW-r)||lX<=(rLX+r)){velocityX *= -1.2;}else{velocityX *= 1.2;}
            if(lY>=(rLY+rH-r)||lY<=(rLY+r)){velocityY *= -1.2;}else{velocityY *= 1.2;}}}
    
    private void clash__Racket3(){
        if(circle.getBoundsInParent().intersects(racket3.getBoundsInParent())){clashwithracket++;totalScore -= 2;
            double lX=circle.getLayoutX(),lY=circle.getLayoutY(),rLX=racket3.getLayoutX(),rLY=racket3.getLayoutY(),rW=racket3.getWidth(),rH=racket3.getHeight(),r=circle.getRadius();
            if(lX>=(rLX+rW-r)||lX<=(rLX+r)){velocityX *= -1.2;}else{velocityX *= 1.2;}
            if(lY>=(rLY+rH-r)||lY<=(rLY+r)){velocityY *= -1.2;}else{velocityY *= 1.2;}}}
    
    private void clash__Racket4(){
        if(circle.getBoundsInParent().intersects(racket4.getBoundsInParent())){clashwithracket++;totalScore -= 2;
            double lX=circle.getLayoutX(),lY=circle.getLayoutY(),rLX=racket4.getLayoutX(),rLY=racket4.getLayoutY(),rW=racket4.getWidth(),rH=racket4.getHeight(),r=circle.getRadius();
            if(lX>=(rLX+rW-r)||lX<=(rLX+r)){velocityX *= -1.2;}else{velocityX *= 1.2;}
            if(lY>=(rLY+rH-r)||lY<=(rLY+r)){velocityY *= -1.2;}else{velocityY *= 1.2;}}}
    
    private void clash__Racket5(){
        if(circle.getBoundsInParent().intersects(racket5.getBoundsInParent())){clashwithracket++;totalScore -= 2;
            double lX=circle.getLayoutX(),lY=circle.getLayoutY(),rLX=racket5.getLayoutX(),rLY=racket5.getLayoutY(),rW=racket5.getWidth(),rH=racket5.getHeight(),r=circle.getRadius();
            if(lX>=(rLX+rW-r)||lX<=(rLX+r)){velocityX *= -1.2;}else{velocityX *= 1.2;}
            if(lY>=(rLY+rH-r)||lY<=(rLY+r)){velocityY *= -1.2;}else{velocityY *= 1.2;}}}
    
    private int clash__Grid(Rectangle grid) {
        if(circle.getBoundsInParent().intersects(grid.getBoundsInParent())){gridsBreakCount++;
            double lX=circle.getLayoutX(),lY=circle.getLayoutY(),gridX=grid.getX(),gridY=grid.getY(),gridW= grid.getWidth(),gridH = grid.getHeight(),r=circle.getRadius();
            if(lX>=(gridX+gridW-r)||lX<=(gridX+radius)){velocityX*=1.2;}else{velocityX*=-1.2;}
            if(lY>=(gridY+gridH-radius)||lY<=(gridY+radius)){velocityY*=1.2;}else{velocityY*=-1.2;}
            scene.getChildren().remove(grid);score();return 1;}return 0;}
    
    ////////////////////////////////////CLASHING PART ENDS////////////////////////////////////////
        
    ////////////////////////////////////GAME OVER PART STARTS////////////////////////////////////////

    public void dangerousClash1(){
        if(circle.getBoundsInParent().intersects(danger1.getBoundsInParent())){
        	for(Node brick : grids){scene.getChildren().remove(brick);}
            grids.clear();t.stop();
            Platform.runLater(() ->{
                try {
                	FXMLLoader loader = new FXMLLoader(getClass().getResource("gameover.fxml"));
                    Parent root = loader.load();
                    SceneController sceneController = loader.getController();
                    sceneController.setScore(totalScore);
                    sceneController.setgridsBreak(gridsBreakCount);
                    sceneController.setBorderClash(clashwithBorder);
                    sceneController.setRacketClash(clashwithracket);
                    totalScore=0;
                    
                    AnchorPane anchorPane = new AnchorPane();
                    anchorPane.getChildren().add(root);
                    Scene scent = new Scene(anchorPane, 1385, 750);
                    Stage stage = new Stage();
                    String css = this.getClass().getResource("gamover.css").toExternalForm();
                    stage.setTitle("Game Over");
                    scent.getStylesheets().add(css);
                    stage.setScene(scent);
                    stage.show();
                }catch(IOException e){e.printStackTrace();}});
            
            racket.setWidth(racketSize);velocityX=-1;velocityY=-3;
            int maxX = 1050;int maxY = 580;
            Random random = new Random();
            int randomX = random.nextInt(maxX + 1),randomY = random.nextInt(maxY + 1);
            circle.setLayoutX(randomX);circle.setLayoutY(randomY);
            racket.setLayoutX(racketX);racket.setLayoutX(racketY);
            exitButton.setVisible(true);
            startButton.setVisible(true);}}
    
    public void dangerousClash2(){
        if (circle.getBoundsInParent().intersects(danger2.getBoundsInParent())) {
            for(Node brick : grids){scene.getChildren().remove(brick);}
            grids.clear();t.stop();
        	Platform.runLater(() ->{
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("gameover.fxml"));
                    Parent root = loader.load();
                    SceneController sceneController = loader.getController();
                    sceneController.setScore(totalScore);
                    sceneController.setgridsBreak(gridsBreakCount);
                    sceneController.setBorderClash(clashwithBorder);
                    sceneController.setRacketClash(clashwithracket);
                    totalScore=0;    
                    
                    AnchorPane anchorPane = new AnchorPane();
                    anchorPane.getChildren().add(root);
                    Scene scent = new Scene(anchorPane, 1385, 750);
                    Stage stage = new Stage();
                    String css = this.getClass().getResource("gamover.css").toExternalForm();
                    stage.setTitle("Game Over");
                    scent.getStylesheets().add(css);
                    stage.setScene(scent);
                    stage.show();}
                catch(IOException e){e.printStackTrace();}});
        	
            racket2.setWidth(racket2Size);
            velocityX = -5;velocityY = -5;
            int maxX = 1050,maxY = 580;
            Random random = new Random();
            int randomX = random.nextInt(maxX + 1),randomY = random.nextInt(maxY + 1);
            circle.setLayoutX(randomX);circle.setLayoutY(randomY);
            racket2.setLayoutX(racket2X);racket2.setLayoutX(racket2Y);
            startButton.setVisible(true);
            exitButton.setVisible(true);}}
    ////////////////////////////////////GAME OVER PART ENDS////////////////////////////////////////
}
