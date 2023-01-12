
import com.skillbox.airport.Airport;


import static com.skillbox.airport.Airport.*;

public class Airplanes {
    public static void main (String[] args){
        Airport airport = getInstance();

        int a = airport.getAllAircrafts().size();
        System.out.println(a);
    }

}
