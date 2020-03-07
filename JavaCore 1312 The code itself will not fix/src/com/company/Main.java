package com.company;

/*

1312 The code itself will not fix
Correct the code so that the program runs and displays "I am a translator from English."
The main method cannot be changed!

Requirements:
1. The program should display the phrase - "I am a translator from English."
2. The translate method should return a string - "I am a translator from English."
3. The Translator class does not have to be abstract.
4. The main method should display the result of calling the translate method on an object of type EnglishTranslator.


 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public static class Translator {
        public String translate() {

            return "Я переводчик с английского";
        }
    }

}


