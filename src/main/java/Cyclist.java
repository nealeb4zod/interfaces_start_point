public class Cyclist extends Athlete implements ICycle{

    @Override
    public void cycle(int distance) {
        this.distanceTravelled += distance;
    }
}
