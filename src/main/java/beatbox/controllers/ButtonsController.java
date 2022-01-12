package beatbox.controllers;

import beatbox.models.SoundBank;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;

public class ButtonsController {
    
    private SoundBank soundBank;

    public ButtonsController() {
        this.soundBank = new SoundBank();
    }

    public final EventHandler<MouseEvent> clickPress = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            Button button = (Button) event.getSource();
            System.out.println("Mouse event: ");

            switch (button.getId()) {
                case "qButton":
                    System.out.println(button.getId());
                    soundBank.playSample("q");
                    break;
                case "wButton":
                    System.out.println(button.getId());
                    soundBank.playSample("w");
                    break;
                case "eButton":
                    System.out.println(button.getId());
                    soundBank.playSample("e");
                    break;
                case "aButton":
                    System.out.println(button.getId());
                    soundBank.playSample("a");
                    break;
                case "sButton":
                    System.out.println(button.getId());
                    soundBank.playSample("s");
                    break;
                case "dButton":
                    System.out.println(button.getId());
                    soundBank.playSample("d");
                    break;
                case "zButton":
                    System.out.println(button.getId());
                    soundBank.playSample("z");
                    break;
                case "xButton":
                    System.out.println(button.getId());
                    soundBank.playSample("x");
                    break;
                case "cButton":
                    System.out.println(button.getId());
                    soundBank.playSample("c");
                    break;
                
                default:
                    break;
            }
            
            event.consume();
        }
    };

    public final EventHandler<KeyEvent> keyPress = new EventHandler<KeyEvent>() {
        @Override
        public void handle(KeyEvent event) {
            KeyCode key = event.getCode();
            System.out.println("Key event: ");

            if (!key.isLetterKey()) {
                return;
            }
            
            switch (key.getChar()) {
                case "Q":
                    System.out.println(key);
                    soundBank.playSample("q");
                    break;
                case "W":
                    System.out.println(key);
                    soundBank.playSample("w");
                    break;
                case "E":
                    System.out.println(key);
                    soundBank.playSample("e");
                    break;
                case "A":
                    System.out.println(key);
                    soundBank.playSample("a");
                    break;
                case "S":
                    System.out.println(key);
                    soundBank.playSample("s");
                    break;
                case "D":
                    System.out.println(key);
                    soundBank.playSample("d");
                    break;
                case "Z":
                    System.out.println(key);
                    soundBank.playSample("z");
                    break;
                case "X":
                    System.out.println(key);
                    soundBank.playSample("x");
                    break;
                case "C":
                    System.out.println(key);
                    soundBank.playSample("c");
                    break;
                
                default:
                    System.out.println(
                        key + " key pressed: " + 
                        "This key is not handled by ButtonsController.class"
                    );
                    break;
            }

            event.consume();
        }
    };
}