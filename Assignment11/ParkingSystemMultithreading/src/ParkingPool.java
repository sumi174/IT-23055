import java.util.LinkedList;
import java.util.Queue;

public class ParkingPool {
    private Queue<RegistrarParking> parkingQueue = new LinkedList<>();

    public synchronized void addParkingRequest(RegistrarParking parking) {
        parkingQueue.add(parking);
        System.out.println("New Parking Request Added: " + parking.getParkingId());
        notifyAll();
    }

    public synchronized RegistrarParking getNextParking() {
        while (parkingQueue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return parkingQueue.poll();
    }
}
