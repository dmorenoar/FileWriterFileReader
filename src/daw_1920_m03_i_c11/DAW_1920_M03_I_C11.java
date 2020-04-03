/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw_1920_m03_i_c11;

import daw_1920_m03_i_c11.funciones.GestionFicheros;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dmorenoar
 */
public class DAW_1920_M03_I_C11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
       //Opción: Leer de consola y guardar en programa 
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
       /* 
       int num = Integer.parseInt(bf.readLine());
       String palabra = bf.readLine(); //De forma natural leemos String
       */

       //Hola(String) -> H o l a (Char)
       
       //Salida en pantalla
       //System.out.println("Hola tu num es: " + num);
       
       /*Opción: Leer/Escribir de fichero */
       
       /*CREAR UNA CARPETA*/
       //Definir la ruta donde ejecutamos el proyecto
       String path = System.getProperty("user.dir");
       
       //Definir el separador del SO
       String separador = File.separator;
       
       //Definir la ruta al proyecto (Dónde se guardarán nuestros ficheros o directorios)
       String rutaCarpeta = path + separador + "files";
       
       //Creamos vínculo a la ruta
       File carpeta = new File(rutaCarpeta);
       
       if(carpeta.exists()){
           System.out.println("La carpeta ya existe");
       }else{
          //Creamos la carpeta si no existe
           carpeta.mkdir(); 
       }
       
       /*CREAR UN FICHERO*/
       //Creamos la ruta al fichero
       //Usamos el separador para crear dentro de la carpeta
       String rutaFile = rutaCarpeta + separador + "file1.txt"; 
       
       //Lo crea en la raíz
       String rutaFile2 = rutaCarpeta + "filesfile1.txt"; 
       
       //Creamos el vínculo al fichero
       File file1 = new File(rutaFile);

       if(file1.exists()){
           System.out.println("El fichero existe");
       }else{
           System.out.println("Procedemos a crear el fichero..");
           file1.createNewFile();
       }
       
       System.out.println("Ruta del fichero: " + file1.getAbsolutePath());
       System.out.println("Tam del fichero: " + file1.length());
       
       /*LISTAR CONTENIDO DE UNA CARPETA*/
       String[] lista = carpeta.list();
       System.out.println("Fichero pos 0: " + lista[0]);
       System.out.println("Total ficheros directorio: " + lista.length);
       
       //Al crear un vínculo debo indicarle la ruta dónde encontrar el fichero o directorio
       //De lo contrario, lo intenta buscar en la raíz del proyecto
       File fAux = new File(rutaCarpeta + separador + lista[0]);
       
       System.out.println(fAux.getName());
       System.out.println(fAux.getAbsolutePath());
       
       System.out.println(fAux.isFile());
       System.out.println(fAux.isDirectory());
       
       if(fAux.isFile()){
           System.out.println("Es un fichero");
       }else{
           System.out.println("Es un directorio");
       
       File fDire = new File(rutaCarpeta + separador + lista[1]);
       
       System.out.println(fDire.getName());
       System.out.println(fDire.isFile());
       System.out.println(fDire.isDirectory());
       
       if(fDire.isFile()){
           System.out.println("Es un fichero");
       }else{
           System.out.println("Es un directorio");
       }}
       
       File fDire = new File(rutaCarpeta + separador + lista[1]);
       
       System.out.println(fDire.getName());
       System.out.println(fDire.isFile());
       System.out.println(fDire.isDirectory());
       
       if(fDire.isFile()){
           System.out.println("Es un fichero");
       }else{
           System.out.println("Es un directorio");
       }
       
       /*BORRAR UN DOCUMENTO*/
       
       //Crear un vínculo a la ruta del fichero/directorio
       File fBorrar = new File(rutaCarpeta + separador + "file1.txt");
       
       System.out.println("Ruta: " + fBorrar.getAbsolutePath());
       //Comprobar que el fichero que me pone el user existe
       /*
        1 - file1.txt
        2 - pepe.txt
        3 - text.txt
       */
       System.out.println("Borramos el fichero:");
       
       /*ojo!!! El fichero file1.txt si se crea pero automáticamente lo borramos aquí!*/
       fBorrar.delete(); 
       
       /*RENOMBRAR UN FICHERO*/
       //Vínculo al fichero antiguo
       File fAntiguo = new File(rutaCarpeta + separador + "pepe.txt");
       
       //Vínculo al fichero nuevo
       File fNuevo = new File(rutaCarpeta + separador + "pepito.txt");
       
       fAntiguo.renameTo(fNuevo);
       
       
       /*EJEMPLO!!! NO TIENE VALOR
       GestionFicheros.createFile("users.txt");
       
       Recorrer el array, pero esta lleno de rutas indicando el fichero
       
       0 - file1.txt <----- listaArchivos[0].getName()
       1 - file2.txt <----- listaArchivos[1].getName()
       
       Necesitamos el vínculo de la ruta completa para trabajar con el fichero
       FileReader --- listaArchivos[posUsu].getAsbolutePath()
       
       listaArchivos[0].getAbsolutePath() -> C:\Users\dmorenoar\Documents\NetBeansProjects\DAW_1920_M03_I_C11\files\file1.txt
       
       GestionFicheros.listarArchivos();

       File fAuxiliar;
       String nom;
       
       fAuxiliar = new File(rutaCarpeta + separador + "pepe.txt");
       
       fAuxiliar = new File(rutaCarpeta + separador + "pepe.txt");
       */
       System.out.println("Hola a tod@s,\n"
               + "el otro día");
       
       System.out.println("Hola, el otro día");

       
       //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
       /*BufferedReader br = new BufferedReader(fr);
       
       //Recuperamos la 1era línea
       String linea1 = br.readLine();
       System.out.println(linea1);
       
       br.close();
       */
       /*LEER EL CONTENIDO TOTAL DE UN FICHERO*/
       GestionFicheros.leerFichero("fileLeer.txt"); 
       
       /*ESCRIBIR EN UN FICHERO*/
       //Vínculo al fichero
       File fileEscribir = new File(rutaCarpeta + separador + "fileLeer.txt");
       
       //Creamos el stream al fichero
       //FileWriter fw = new FileWriter(fileEscribir); //Sobreescribe
       FileWriter fw = new FileWriter(fileEscribir, true); //Añade
       
       //Creamos nuestro buffer de escritura sobre filewriter
       BufferedWriter bw = new BufferedWriter(fw);
       
       //Escribo contenido
       bw.write("\nEscribo al final del fichero");
       bw.write("\ndani 123468 \n"
               + "tom password\n"
               + "tom2 114");
       
       //Obligamos al buffer a actualizarse
       bw.flush();
       
       //Cerramos el buffer
       bw.close();
       
       /*
       Vamos a darte de alta en el sistema:
       Introduce tu user -> userName
       Introduce tu pass -> userPass
       bw.write("\nusername password");

       */
    
    }
    
}
