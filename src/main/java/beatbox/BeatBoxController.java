package beatbox;

import beatbox.controllers.ButtonsController;
import beatbox.controllers.OptionsController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
// import javafx.scene.input.DragEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class BeatBoxController {

    private ButtonsController buttonsController;
    private OptionsController optionsController;

    public BeatBoxController() {
        this.buttonsController = new ButtonsController();
        this.optionsController = new OptionsController();
    }

    /** 
     * OptionsController 
     * 
     */
    void setDisplayText(String text) {
        optionsController.setDisplayText(text);
    }
    
    @FXML void volumeChangeEvent(ActionEvent event) {
        // Slider change
        System.out.println(event);
    }
     
    /** 
     * ButtonsController
     * 
     */
    @FXML void buttonPressEvent(MouseEvent event) {
        buttonsController.clickPress.handle(event);
    }

    @FXML void keyPressedEvent(KeyEvent event) {
        buttonsController.keyPress.handle(event);
    }
}
