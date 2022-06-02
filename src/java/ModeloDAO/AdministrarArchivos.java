/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.servlet.http.Part;
/**
 *
 * @author Damian
 */
public class AdministrarArchivos {
    
    
     public String guardarArchivo(Part csvPart, File rutaCarpetaArchivos) {
        String rutaAbsoluta = "";
        try {
             Path ruta = Paths.get(csvPart.getSubmittedFileName());
            String nombreArchivo = ruta.getFileName().toString();
            InputStream input = csvPart.getInputStream();

            if (input != null) {
                File file = new File(rutaCarpetaArchivos, nombreArchivo);
                rutaAbsoluta = file.getAbsolutePath();
                Files.copy(input, file.toPath());
            }

            return rutaAbsoluta;

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }

    }
     
     
       public File validarRuta() {
        String ruta = "web/archivosCargaMasiva";
        File archivoCargas = new File(ruta);
       if (archivoCargas.exists() == true) {
            String[] nombresArchivos = archivoCargas.list();
            for(int i = 0;i<nombresArchivos.length;i++  ){
                System.out.println(nombresArchivos[i]);
                File borrarArchivo = new File(ruta+File.separator+nombresArchivos[i]);
                borrarArchivo.delete();
            }
            return archivoCargas;
        }else {
            archivoCargas.mkdirs();
            return archivoCargas;
        }
    }
}

    

