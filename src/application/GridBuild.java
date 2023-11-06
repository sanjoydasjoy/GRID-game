package application;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.util.ArrayList;
public class GridBuild{
    @FXML
    private AnchorPane scene;

    public int gridW = 18,gridH = 18,racketSize = 5,sceneX = 1385,scenex = 0,
    sceneY = 750,sceney = 0,velocityX = 2,velocityY = -4,r = 8,c = 48,
    totalScore = 0,racketV = 200,racketH = 200,racketY = 100,radius = 15,circleX,circleY,racket2Size = 5,racket2V = 200,racket2X = 100;
    
    public ArrayList<Rectangle>grids=new ArrayList<>();
    public void LETS_create_GRIDS() {
        	for(int d=13;d<35;d++){
                Rectangle grid = new Rectangle(d*gridW,41*gridH,gridW,gridH);
                grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
                scene.getChildren().add(grid);grids.add(grid);}
        	for(int d=13;d<35;d++){
                Rectangle grid = new Rectangle(d*gridW,40*gridH,gridW,gridH);
                grid.setFill(Color.BLUE);grid.setStroke(Color.BLUE);
                scene.getChildren().add(grid);grids.add(grid);}
        	for(int d=13;d<35;d++){
                Rectangle grid = new Rectangle(d*gridW,39*gridH,gridW,gridH);
                grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
                scene.getChildren().add(grid);grids.add(grid);}
        	for(int d=13;d<35;d++){
                Rectangle grid = new Rectangle(d*gridW,38*gridH,gridW,gridH);
                grid.setFill(Color.RED);grid.setStroke(Color.RED);
                scene.getChildren().add(grid);grids.add(grid);}
        	for(int d=13;d<35;d++){
                Rectangle grid = new Rectangle(d*gridW,37*gridH,gridW,gridH);
                grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
                scene.getChildren().add(grid);grids.add(grid);}
        	for(int d=13;d<35;d++){
                Rectangle grid = new Rectangle(d*gridW,36*gridH,gridW,gridH);
                grid.setFill(Color.BLUE);grid.setStroke(Color.BLUE);
                scene.getChildren().add(grid);grids.add(grid);}
        	for(int d=13;d<35;d++){
                Rectangle grid = new Rectangle(d*gridW,35*gridH,gridW,gridH);
                grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
                scene.getChildren().add(grid);grids.add(grid);}
        	for(int d=13;d<35;d++){
                Rectangle grid = new Rectangle(d*gridW,34*gridH,gridW,gridH);
                grid.setFill(Color.RED);grid.setStroke(Color.RED);
                scene.getChildren().add(grid);grids.add(grid);}

    	
            for(int s=30;s<45;s++){
                Rectangle grid = new Rectangle(12*gridW,s*gridH,gridW,gridH);
                grid.setFill(Color.RED);grid.setStroke(Color.RED);
                scene.getChildren().add(grid);grids.add(grid);}
            for(int s=30;s<35;s++){
                Rectangle grid = new Rectangle(14*gridW,s*gridH,gridW,gridH);
                grid.setFill(Color.RED);grid.setStroke(Color.RED);
                scene.getChildren().add(grid);grids.add(grid);}
            for(int s=30;s<35;s++){
                Rectangle grid = new Rectangle(15*gridW,s*gridH,gridW,gridH);
                grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
                scene.getChildren().add(grid);grids.add(grid);}
            
            for(int s=30;s<35;s++){
                Rectangle grid = new Rectangle(16*gridW,s*gridH,gridW,gridH);
                grid.setFill(Color.BLUE);grid.setStroke(Color.BLUE);
                scene.getChildren().add(grid);grids.add(grid);}
            for(int s=30;s<35;s++){
                Rectangle grid = new Rectangle(17*gridW,s*gridH,gridW,gridH);
                grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
                scene.getChildren().add(grid);grids.add(grid);}
            
            for(int s=30;s<35;s++){
                Rectangle grid = new Rectangle(18*gridW,s*gridH,gridW,gridH);
                grid.setFill(Color.RED);grid.setStroke(Color.RED);
                scene.getChildren().add(grid);grids.add(grid);}
            for(int s=30;s<35;s++){
                Rectangle grid = new Rectangle(13*gridW,s*gridH,gridW,gridH);
                grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
                scene.getChildren().add(grid);grids.add(grid);}
        
        for(int s=15;s<45;s++){
                Rectangle grid = new Rectangle(35*gridW,s*gridH,gridW,gridH);
                grid.setFill(Color.RED);grid.setStroke(Color.RED);
                scene.getChildren().add(grid);grids.add(grid);}
        for(int s=15;s<45;s++){
            Rectangle grid = new Rectangle(36*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
        
        for(int s=15;s<45;s++){
            Rectangle grid = new Rectangle(37*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
        for(int s=15;s<45;s++){
            Rectangle grid = new Rectangle(38*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
        
        for(int s=15;s<45;s++){
            Rectangle grid = new Rectangle(39*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.BLUE);grid.setStroke(Color.BLUE);
            scene.getChildren().add(grid);grids.add(grid);}
        for(int s=15;s<45;s++){
            Rectangle grid = new Rectangle(40*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
        
        for(int s=15;s<45;s++){
            Rectangle grid = new Rectangle(41*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
        for(int s=15;s<45;s++){
            Rectangle grid = new Rectangle(42*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
        for(int s=15;s<45;s++){
            Rectangle grid = new Rectangle(43*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
        
        
        
        
        
        
        for(int s=15;s<45;s++){
            Rectangle grid = new Rectangle(76*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
        for(int s=15;s<45;s++){
            Rectangle grid = new Rectangle(47*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=47;d<78;d++){
            Rectangle grid = new Rectangle(d*gridW,41*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=47;d<78;d++){
            Rectangle grid = new Rectangle(d*gridW,15*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
    	
        for(int s=16;s<41;s++){
            Rectangle grid = new Rectangle(75*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
        for(int s=16;s<41;s++){
            Rectangle grid = new Rectangle(48*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=48;d<76;d++){
            Rectangle grid = new Rectangle(d*gridW,40*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=48;d<76;d++){
            Rectangle grid = new Rectangle(d*gridW,16*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
    	
    	
        for(int s=17;s<40;s++){
            Rectangle grid = new Rectangle(74*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
        for(int s=17;s<39;s++){
            Rectangle grid = new Rectangle(49*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=49;d<74;d++){
            Rectangle grid = new Rectangle(d*gridW,39*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=49;d<74;d++){
            Rectangle grid = new Rectangle(d*gridW,17*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
        
    	
        for(int s=18;s<39;s++){
            Rectangle grid = new Rectangle(73*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
        for(int s=18;s<38;s++){
            Rectangle grid = new Rectangle(50*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=50;d<73;d++){
            Rectangle grid = new Rectangle(d*gridW,38*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=50;d<73;d++){
            Rectangle grid = new Rectangle(d*gridW,18*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
    	
    	
        for(int s=19;s<38;s++){
            Rectangle grid = new Rectangle(72*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
        for(int s=19;s<38;s++){
            Rectangle grid = new Rectangle(51*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=51;d<72;d++){
            Rectangle grid = new Rectangle(d*gridW,37*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=51;d<72;d++){
            Rectangle grid = new Rectangle(d*gridW,19*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
    	
    	
    	
    	
    	
        for(int s=20;s<37;s++){
            Rectangle grid = new Rectangle(71*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
        for(int s=20;s<36;s++){
            Rectangle grid = new Rectangle(52*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=52;d<71;d++){
            Rectangle grid = new Rectangle(d*gridW,36*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=53;d<72;d++){
            Rectangle grid = new Rectangle(d*gridW,20*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
    	
        for(int s=21;s<36;s++){
            Rectangle grid = new Rectangle(70*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
        for(int s=21;s<36;s++){
            Rectangle grid = new Rectangle(53*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=53;d<70;d++){
            Rectangle grid = new Rectangle(d*gridW,35*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=53;d<70;d++){
            Rectangle grid = new Rectangle(d*gridW,21*gridH,gridW,gridH);
            grid.setFill(Color.RED);grid.setStroke(Color.RED);
            scene.getChildren().add(grid);grids.add(grid);}
    	
        for(int s=22;s<35;s++){
            Rectangle grid = new Rectangle(69*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
        for(int s=22;s<34;s++){
            Rectangle grid = new Rectangle(54*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=54;d<70;d++){
            Rectangle grid = new Rectangle(d*gridW,34*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=55;d<70;d++){
            Rectangle grid = new Rectangle(d*gridW,22*gridH,gridW,gridH);
            grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
            scene.getChildren().add(grid);grids.add(grid);}
    	
    	
    	
    	for(int d=10;d<77;d++){
            Rectangle grid = new Rectangle(d*gridW,9*gridH,gridW,gridH);
            grid.setFill(Color.YELLOW);grid.setStroke(Color.YELLOW);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int d=10;d<77;d++){
            Rectangle grid = new Rectangle(d*gridW,8*gridH,gridW,gridH);
            grid.setFill(Color.ORANGE);grid.setStroke(Color.ORANGE);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int s=10;s<42;s++){
            Rectangle grid = new Rectangle(10*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.PURPLE);grid.setStroke(Color.PURPLE);
            scene.getChildren().add(grid);grids.add(grid);}
    	for(int s=10;s<42;s++){
            Rectangle grid = new Rectangle(11*gridW,s*gridH,gridW,gridH);
            grid.setFill(Color.LIGHTGREEN);grid.setStroke(Color.LIGHTGREEN);
            scene.getChildren().add(grid);grids.add(grid);}
    	
    	Rectangle grid = new Rectangle(290,270,gridW,gridH);
        grid.setFill(Color.WHITE);grid.setStroke(Color.WHITE);
        scene.getChildren().add(grid);grids.add(grid);
        Rectangle grid2 = new Rectangle(290,290,gridW,gridH);
        grid2.setFill(Color.RED);grid2.setStroke(Color.RED);
        scene.getChildren().add(grid2);grids.add(grid2);
        Rectangle grid3 = new Rectangle(310,270,gridW,gridH);
        grid3.setFill(Color.RED);grid3.setStroke(Color.RED);
        scene.getChildren().add(grid3);grids.add(grid3);
        Rectangle grid4 = new Rectangle(310,290,gridW,gridH);
        grid4.setFill(Color.WHITE);grid4.setStroke(Color.WHITE);
        scene.getChildren().add(grid4);grids.add(grid4);
        
    	Rectangle grid5 = new Rectangle(450,410,gridW,gridH);
        grid5.setFill(Color.WHITE);grid5.setStroke(Color.WHITE);
        scene.getChildren().add(grid5);grids.add(grid5);
        Rectangle grid6 = new Rectangle(450,430,gridW,gridH);
        grid6.setFill(Color.RED);grid6.setStroke(Color.RED);
        scene.getChildren().add(grid6);grids.add(grid6);
        Rectangle grid7 = new Rectangle(470,410,gridW,gridH);
        grid7.setFill(Color.RED);grid7.setStroke(Color.RED);
        scene.getChildren().add(grid7);grids.add(grid7);
        Rectangle grid8 = new Rectangle(470,430,gridW,gridH);
        grid8.setFill(Color.WHITE);grid8.setStroke(Color.WHITE);
        scene.getChildren().add(grid8);grids.add(grid8);
    	
    	
    	
    	

        }
}
