package com.philippsalata;

import com.philippsalata.drive.Drive;
import com.philippsalata.drive.HDDDrive;
import com.philippsalata.drive.SSDDrive;
import com.philippsalata.file.File;
import com.philippsalata.file.imagefile.GIFImageFile;
import com.philippsalata.file.imagefile.JPEGImageFile;
import com.philippsalata.file.musicfile.MP3MusicFile;
import com.philippsalata.usbdevise.MemoryStick;
import com.philippsalata.usbdevise.Mouse;
import com.philippsalata.usbdevise.USBDevice;


public class Main {

    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("name1.gif", 100);
        JPEGImageFile jpg1 = new JPEGImageFile("name1.jpg", 200, 80);

        MP3MusicFile mp3_1 = new MP3MusicFile("name1.mp3", 999, "Trivium", "Ember to Inferno", 5);

        Drive drive = new HDDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3_1);

        drive.listFiles();
        MemoryStick.

        File file = drive.findFile("name1.gif");
        System.out.println(file.getSize());


    }
}
