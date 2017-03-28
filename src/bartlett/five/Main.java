package bartlett.five;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private Stage primaryStage;
	private BorderPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		try {
		
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("High Heat Statistics");

			initRootLayout();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void initRootLayout(){
		try{
			FXMLLoader loader= new FXMLLoader();
			loader.setLocation(Main.class.getResource("/bartlett/five/BaseballManager.FXML"));
			rootLayout = (BorderPane) loader.load();
			Scene scene = new Scene(rootLayout);
			BaseballManagerController controller = loader.getController();
			controller.setMainApp(this);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
