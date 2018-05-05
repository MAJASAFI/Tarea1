
package job3;

public class job3
{
 public static void main(String[] args) {
        ciudad sps = new ciudad("San Pedro Sula",
                                    1000000,
                                    5000);
        
        System.out.println("Nombre: " + sps.nombre);
        System.out.println("Habitantes: " + sps.habitantes);
        System.out.println("Extension: " + sps.extension + " km2");
        System.out.println("Densidad: " + sps.obtenerdensidad() + " hab por km2");
    }
}
 
class ciudad
{
String nombre;
int habitantes;
int extension;

ciudad(String nombre, int habitantes, int extension)
{
    this.nombre=nombre;
    this.habitantes=habitantes;
    this.extension=extension;
}

int obtenerdensidad()
{
 int densidad= habitantes/extension;
 return densidad;
}

}

