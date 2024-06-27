package com.coforge.Abstraction;

public class AbcMain {
    public static void main(String[] args) {
        AbcPhone abcPhone=new AbcPhone(1233445,"samsung",120000);
        System.out.println(abcPhone);
        abcPhone.calender();
        abcPhone.call();
        abcPhone.email();
        abcPhone.playAudioSongs();
        abcPhone.netSurf();
    }



}
