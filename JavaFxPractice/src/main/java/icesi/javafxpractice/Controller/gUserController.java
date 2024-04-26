package icesi.javafxpractice.Controller;

import icesi.javafxpractice.model.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;


public class gUserController implements Initializable {
    private TableView<User> tableId;
    private TableColumn<User, String> codeCol;
    private TableColumn<User, String> nameCol;
    private Button btnUser;
    private ObservableList<User> users;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        users = FXCollections.observableArrayList();
        tableId.setItems(users);
        codeCol.setCellValueFactory(new PropertyValueFactory<>("code"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
    }
    public void addUser(ActionEvent event) {
        users.add(new User("name","email","password"));
    }

}
