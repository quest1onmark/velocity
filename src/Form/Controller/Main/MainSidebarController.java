package Form.Controller.Main;

import Handler.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainSidebarController {

    @FXML
    private Label lblUserName;

    @FXML
    private Button btnTeam;

    @FXML
    private ImageView pcbUserPicture;

    @FXML
    private Button btnSettings;

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnAbout;

    @FXML
    private Button btnWelcome;

    public ViewHandler viewHandler;

    public MainSidebarController(ViewHandler viewHandler) {
        this.viewHandler = viewHandler;
    }

    @FXML
    public void initialize() {
        this.lblUserName.setText(viewHandler.applicationHandler.LoggedInUser.getName());
    }

    @FXML
    void welcome(ActionEvent event) {
    }

    @FXML
    void team(ActionEvent event) {

    }

    @FXML
    void play(ActionEvent event) {

    }

    @FXML
    void settings(ActionEvent event) {

    }

    @FXML
    void about(ActionEvent event) {

    }

    private void LoadNewCenter(String name) {

    }
}
