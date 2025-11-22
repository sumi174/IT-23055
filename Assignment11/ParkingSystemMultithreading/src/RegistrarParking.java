public class RegistrarParking {
    private static int nextId = 1;
    private int parkingId;

    public RegistrarParking() {
        this.parkingId = nextId++;
    }

    public int getParkingId() {
        return parkingId;
    }
}
