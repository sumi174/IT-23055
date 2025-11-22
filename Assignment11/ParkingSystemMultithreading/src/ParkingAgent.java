public class ParkingAgent extends Thread {
    private ParkingPool pool;

    public ParkingAgent(String name, ParkingPool pool) {
        super(name);
        this.pool = pool;
    }

    @Override
    public void run() {
        while (true) {
            RegistrarParking parking = pool.getNextParking();
            System.out.println(getName() + " is processing Parking Request: " + parking.getParkingId());

            try {
                Thread.sleep(2000); // simulate parking time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(getName() + " completed Parking Request: " + parking.getParkingId());
        }
    }
}
