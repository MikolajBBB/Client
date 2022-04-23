package com.example.client;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Controller {
    @FXML
    private TextField name;
    @FXML
    private TextField answer;
    @FXML
    private Button send;

    private PrintWriter data;
    public Controller() throws IOException {
        Socket clientSocket = new Socket("127.0.0.1", 6868);
        data = new PrintWriter(clientSocket.getOutputStream(),true);
    }

    @FXML
    void sendd(){
    data.println(name.getText() + ":" + answer.getText() + "\n");
    }
}