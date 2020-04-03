/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw_1920_m03_i_c11.funciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dmorenoar
 */
public class GestionFicheros {

    //Definir la ruta donde ejecutamos el proyecto
    static String path = System.getProperty("user.dir");

    //Definir el separador del SO
    static String separador = File.separator;

    //Definir la ruta al proyecto (Dónde se guardarán nuestros ficheros o directorios)
    static String rutaCarpeta = path + separador + "files";

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public static void createFile(String nameFile) throws IOException {
        //Creamos vínculo a la ruta
        File file = new File(rutaCarpeta + separador + nameFile);

        System.out.println(file.getAbsolutePath());
        
        if (file.exists()) {
            System.out.println("El fichero ya existe");
        } else {
            //Creamos la carpeta si no existe
            file.createNewFile();
        }
    }
    
    /*EJEMPLO!!! NO TIENE VALOR*/
    public static String[] listarArchivos(){
        
        //Consulta al fichero
        String[] lista = new String[2];
        lista[0] = "C/Documentos/Archivos";
        
        return lista;
    }
    
    public static void leerFichero(String nombreFile) throws FileNotFoundException, IOException{
        /*LEEMOS DE UN FICHERO*/
       File ficheroLeer = new File (rutaCarpeta + separador + nombreFile);
       
       //Creamos el Stream de lectura
       FileReader fr = new FileReader(ficheroLeer);
       
       BufferedReader br = new BufferedReader(fr);
       System.out.println("LEER EL CONTENIDO TOTAL DE UN FICHERO");
       
       String linea= "";
       
       while(linea != null){
           linea = br.readLine();
           if(linea != null)
                System.out.println(linea);
           /*
            if(linea != null){
                System.out.println(linea);
            }
           */
           //VERSIÓN PRO
           /*FICHERO CON EL FORMATO, Indicando 
           (User Password nomUsu Calle num piso)
           dani 12346 dmorenoar Venur 12 4º1ª
           pepe Password
           
           Recupero la línea -> dani 123456
           Utilizo el método de la clase String split para separar la línea en 2 posiciones
           Indico a split que el separador es un espacio ""
           valor[0] -> dani
           valor[1] -> 123456
           
           Introduce tu nombre: danieleee -> nomUser
           
           Recorro con un bucle todas las líneas, verificando si existe el usuario
           
           if(nomUser.equals(valor[0]){
                System.out.println("Usuario existe");
           }
           
           System.out.println("Tu usuario es: " + valor[0]);
           System.out.println("Tu password es: " + valor[1]);
           
           */
           
           
           
       }
       
       br.close();
    }
    
}
