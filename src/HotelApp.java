public class HotelApp {
    public static void main(String[] args) {

        FrontDesk frontDesk = new FrontDesk();

        frontDesk.pickUpVehicle("DAR 1383");
        frontDesk.cleanRoom(278);
        frontDesk.requestCart(3);
    }
}