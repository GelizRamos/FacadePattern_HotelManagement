public class Valet implements HotelService {
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet Service: Picking up vehicle with plate number " + plateNumber);
    }
}