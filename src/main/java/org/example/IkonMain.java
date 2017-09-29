package org.example;

import com.airhacks.afterburner.injection.Injector;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class IkonMain extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        IkonView view = new IkonView();
        Scene scene = new Scene(view.getView(), 390, 80);
        stage.setTitle("ikon");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        Injector.forgetAll();
    }
}
