#Chain of Responsibility Design Pattern

The Chain of Responsibility pattern is a behavior pattern in which a group of objects is chained

together in a sequence and a responsibility (a request) is provided in order to be handled by the group.

For example

From the sample code, we have ```MediaPlayer``` class that can play mp3 and mp4, but not WAV audio my format.
```Mp3Handler``` can play mp3 audio file, but if passed mp4 audio file, it delegates that to ```Mp4Handler```.
If passed WAV audio format, it displays file not supported.

the chain if the form

audio File -> MediaPlayer -> Mp3Handler -> Mp4Handler || File not supported
