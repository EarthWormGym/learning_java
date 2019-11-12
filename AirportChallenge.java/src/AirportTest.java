import static org.junit.jupiter.api.Assertions.*;

class AirportTest {
    Airport airport = new Airport();
    Plane plane = new Plane();

    @org.junit.jupiter.api.Test
    void allowsPlaneToLand(){
        airport.land(plane);
        assertSame(airport.hangar.get(0), plane);
    }

    @org.junit.jupiter.api.Test
    void allowsPlaneToTakeOff(){
        airport.land(plane);
        airport.takeoff(plane);
        assertEquals(airport.hangar.size(), 0);
    }

}