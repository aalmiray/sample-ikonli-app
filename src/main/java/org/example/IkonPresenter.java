package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.inject.Inject;

public class IkonPresenter {
    @FXML private TextField name;

    @Inject IkonService ikonService;

    public void sayHello() {
        // Watch out! this code is executed inside the UI thread.
        ikonService.sayHello(name.getText());
    }
}
