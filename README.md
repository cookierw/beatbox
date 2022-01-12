# BeatBox

Basic drum pad app using Java/JavaFX

## Todo/Goals

    - Implement OptionsController
      - Slider control to manipulate amplitude
      - Selector for drum kits
      - Ability to switch kits
    - Wire up display to show current sample being played
    - Add way to load user kits
    - Implement prefs to persist app state

## License

Released under GPLv2 w/ Classpath Exception

See [LICENSE.txt](http://www.github.com/sean-rw/beatbox/LICENSE.txt) for full text

## Sample/button mappings

Place sounds in package/resources/samples/TOYS with the following naming scheme:

    - "kick.wav":       kick drum       [z] (bottom left)
    - "clap.wav":       handclap        [x] (bottom middle)
    - "snare.wav":      snare drum      [c] (bottom right) 
    - "inst_1.wav":     instrument      [a] (middle left)
    - "hh_o.wav":       open hihat      [s] (middle middle)
    - "hh_c":           closed hihat    [d] (middle right)
    - "inst_2.wav":     instrument      [q] (top left)
    - "inst_3.wav":     instrument      [w] (top middle)
    - "inst_4.wav":     instrument      [e] (top right)
