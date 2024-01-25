//kode ini akan menghasilkan tampilan OK pada layar 
//untuk mengatur Visual Code agar bisa digunakan untuk JavaFX 
//https://www.youtube.com/watch?v=ombuBCzClzo
//unduh library JavaFX di https://openjfx.io/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TesJavaFX extends Application {
@Override // Override method start method pada class Application

public void start(Stage primaryStage) {
// membuat scene dan menempatkan suatu button pada scene
Button btOK = new Button("OK");
Scene scene = new Scene(btOK, 600, 250);
primaryStage.setTitle("MyJavaFX"); // Set judul stage
// menempatkan scene pada stage 
primaryStage.setScene(scene); 
primaryStage.show(); // Display stage
}

/* main method hanya diperlukan 
 untuk IDE yg tdk support JavaFX */
public static void main(String[] args) {
Application.launch(args);
}
}


