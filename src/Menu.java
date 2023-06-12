import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Menu {

    private List<Plato> platos= new ArrayList<>();

    public void QuemarDatos(){

    }
    public boolean AñadirPlato (String nombre, Double precio, int calorias, int tiempoprep){

        if(BusquedaNombre(nombre)==null){
            platos.add(new Plato(nombre, precio, calorias, tiempoprep));
            return true;
        }else {
            return false;
        }
    }

    public Plato BusquedaNombre (String nombre) {


        for (int i = 0; i < platos.size(); i++) {

            if (nombre.equals(platos.get(i).getNombre())) {
                return platos.get(i);
            }
        }
        return null;
    }

    public boolean ModificarPlato( String Nombre, Double precio, int calorias, int tiempoprep){
       Plato x= BusquedaNombre(Nombre);
       if(x!=null){
       x.setCalorias(calorias);
       x.setPrecio(precio);
       x.setTiempoprep(tiempoprep);
       return true;
       } else{
           return false;
       }
    }


    public boolean EliminarPlato(String Nombre){
        Plato x=BusquedaNombre(Nombre);
        if(x!=null){
            platos.remove(x);
            return true;
        }else{
            return false;
        }

    }
    @Override
    public String toString() {
        return "Menu" +
                "\nplatos:" + platos ;
    }
}
