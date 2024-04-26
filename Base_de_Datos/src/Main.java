

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String route = "C:\\Users\\franc\\Downloads\\MOCK_DATA.csv";
        List<Persona> personas = new ArrayList<>();

        try {
            FileReader lector = new FileReader(route);
            BufferedReader bufferedLector = new BufferedReader(lector);

            String linea;
            // Leer la primera línea (encabezados) y descartarla
            bufferedLector.readLine();
            
         // Leer el resto del archivo línea por línea
            while ((linea = bufferedLector.readLine()) != null) {
                // Dividir la línea en partes usando el delimitador coma
                String[] partes = linea.split(",");
                
                // Crear un objeto Persona con los datos obtenidos
                Persona persona = new Persona(
                    Integer.parseInt(partes[0]), 
                    partes[1], 
                    partes[2], 
                    partes[3], 
                    partes[4], 
                    partes[5]
                );
                
                // Agregar la persona a la lista
                personas.add(persona);
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Imprimir la lista de personas
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
    
}