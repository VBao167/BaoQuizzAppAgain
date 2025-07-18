package com.knvb.quizzappagain;

import com.knvb.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {
    public void handleQuestionManagement(ActionEvent action) throws IOException{
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Question Management");
        stage.show();
    }
}
