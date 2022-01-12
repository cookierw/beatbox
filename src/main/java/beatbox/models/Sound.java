package beatbox.models;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

// TODO: Use mixer to manage volumes
public enum Sound {
    KICK("kick.wav"),
    SNARE("snare.wav"),
    CLAP("clap.wav"),
    HIHAT_C("hh_c.wav"),
    HIHAT_O("hh_o.wav"),
    INST_1("inst_1.wav"),
    INST_2("inst_2.wav"),
    INST_3("inst_3.wav"),
    INST_4("inst_4.wav");

    private Clip clip;
    private AudioInputStream ais;

    private Sound(String sample) {
        loadSound(sample);
    }

    private void loadSound(String sample) {
        try {
            // Load sample.wav file into AudioInputStream
            URL url = this.getClass().getResource(
                "/samples/TOYS/" + sample
            );
            ais = AudioSystem.getAudioInputStream(url);
            
            System.out.println(url);

            // Initialize the clip
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (NullPointerException e) {
            System.err.println("File not found!");
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            System.err.println(
                "File type not supported. Ensure file is in wav format"
            );
        } catch (LineUnavailableException | IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void play() {
        // Stop the clip if running
        if (clip.isRunning()) clip.stop();
        
        // Must reset frame!
        clip.setFramePosition(0);
        clip.loop(0);

        clip.start();
        System.out.println("Clip played");
    }

    public void stop() {
        clip.stop();
    }

    static void init() {
        values();
    }
}
