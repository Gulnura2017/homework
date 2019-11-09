package com.company;

public class dataTypes {
public static void main(String arg[]) {

    byte chikagoSpeedlimit = 120;
    byte NewYorkSpeedlimit = 120;
    byte laSpeedlimit = chikagoSpeedlimit;
    System.out.println("Chicago speed limit is " + chikagoSpeedlimit);
    System.out.println("New York speed limit is " + NewYorkSpeedlimit);
    System.out.println("Los Angeles speed limit is " + laSpeedlimit);


    int youTubeViews = 16000000, nambaViews = 10000000;
    float whiteRainLevel = 10.0f, subtArt = 6.9f, elonViews = 9.08f;
    System.out.println("White rain Composition is: " + whiteRainLevel);
    System.out.println("Sub Art level is: " + subtArt);
    System.out.println("Elon views: " + elonViews);

    System.out.println(youTubeViews + " " + nambaViews);
    System.out.println("Youtube views: " + youTubeViews);

    long chinaPopupalion = 150000000000l;

    System.out.println(chinaPopupalion);
    int chinaPopulationInt = 150000000;
    int indiaPopulation = chinaPopulationInt;
    byte devXStudentCount = 25;
    short jobOpeningsForSoftwareEngeneers = 500;

    int devXStudentCountInt = devXStudentCount;

    /*Smaller dataTypes cannot hold larger ones, despite  a values are in a valid range;
    byte jobOpenings = jobOpeningsForSoftwareEngeneers;
    */
    float largestDecimalsPointForFloat = 0.9999999999f;
    System.out.println(largestDecimalsPointForFloat);
    float roundDecimalPointChekc = 22.5634567f;
}
}
