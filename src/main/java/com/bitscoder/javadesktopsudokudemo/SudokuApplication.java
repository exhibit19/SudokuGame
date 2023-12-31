package com.bitscoder.javadesktopsudokudemo;

import com.bitscoder.javadesktopsudokudemo.buildLogic.SudokuBuildLogic;
import com.bitscoder.javadesktopsudokudemo.userInterface.IUserInterfaceContract;
import com.bitscoder.javadesktopsudokudemo.userInterface.UserInterface;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class SudokuApplication extends Application {
    private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage primaryStage) throws IOException {
        uiImpl = new UserInterface(primaryStage);
        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}