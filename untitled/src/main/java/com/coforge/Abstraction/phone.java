package com.coforge.Abstraction;

public interface phone {
    public abstract void call();
    public static final String country="India";
}
interface Mobile{
    void call();
    void message();
    void playAudioSongs();
}
interface SmartPhone{
    void call();
    void message();
    void playAudioSongs();
    void playVideo();
    void netSurf();
    void payment();

}
interface MyPhone extends phone,Mobile,SmartPhone{
    void calender();
    void email();
}