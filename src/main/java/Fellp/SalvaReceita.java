package Fellp;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Fellp.*;

import java.util.Arrays;
import java.util.regex.*;

public class SalvaReceita {

    public void SalvaReceita(ArrayList <Ingrediente> Menu) throws Exception{

        Path receita = Paths.get("src/main/java/Fellp/Receita.txt");
        String temp = "";
        for (int i = 0; i < Menu.size();i++){

            temp = temp + Menu.get(i).toString();

        }
        Files.write(receita,temp.getBytes());
        }



    }



