package AircraftCarrier;

/**
 * Created by georgezsiga on 4/4/17.
 */
public class Battle {


  public void fight() {
  }

  public static void main(String[] args) {
    AircraftCarrier ship1 = new AircraftCarrier(40000);
    ship1.addPlanes("F35");
    ship1.addPlanes("F35");
    ship1.addPlanes("F35");
    ship1.addPlanes("F16");
    ship1.addPlanes("F16");
    ship1.fill();
    ship1.getPlanesStatus();

    AircraftCarrier ship2 = new AircraftCarrier(20000);
    ship2.addPlanes("F35");
    ship2.addPlanes("F35");
    ship2.addPlanes("F16");
    ship2.fill();


  }
}

