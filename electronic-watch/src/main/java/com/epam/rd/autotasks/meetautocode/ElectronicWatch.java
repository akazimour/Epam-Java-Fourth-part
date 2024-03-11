package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hour = seconds / 3600;
        int remainder = seconds % 3600;
        int nextHour = 0;
        int hh = hour > 23 ? ((hour == 24 ? 0 : remainder > 0 ? nextHour = 3600 - remainder : remainder)) : hour;
        int min = remainder > 59 ? (remainder % 60 > 0 ? remainder / 60 : remainder/60):remainder/60;
        int sec = remainder % 60;

        Integer mm = min;
        Integer ss = sec;

        String stringMM = mm.toString();
        String stringSS = ss.toString();
        String minutes = stringMM.length() < 2 ? "0" + stringMM : stringMM;
        String secs = stringSS.length() < 2 ? "0" + stringSS : stringSS;

        System.out.println(hh+":"+minutes+":"+secs);


    }
}
