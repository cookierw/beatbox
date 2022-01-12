package beatbox.models;

import java.util.TreeMap;

public class SoundBank {

    private TreeMap<String, Sound> sampleMap;
    
    public SoundBank() {
        // Load all the sounds in the kit
        loadKit();
    }

    private void loadKit() {
        Sound.init();

        this.sampleMap = new TreeMap<>();
        
        // Load map with pad names/ids : Sound.CASE
        sampleMap.put("z", Sound.KICK);
        sampleMap.put("x", Sound.CLAP);
        sampleMap.put("c", Sound.SNARE);
        sampleMap.put("a", Sound.INST_1);
        sampleMap.put("s", Sound.HIHAT_O);
        sampleMap.put("d", Sound.HIHAT_C);
        sampleMap.put("q", Sound.INST_2);
        sampleMap.put("w", Sound.INST_3);
        sampleMap.put("e", Sound.INST_4);
    }

    public void playSample(String key) {
        // Look up sample in map and invoke play method
        this.sampleMap.get(key).play();
    }
}
