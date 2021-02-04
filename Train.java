import static java.lang.Math.abs;

public class Train {
    private String name = "No name train";
    private boolean isDriving = true;
    private int passengers = 0;
    private int stationCounter = 0;
    private double speed = 6;

    public void addPassengers(int count) throws TrainIsDrivingNow {
        if (!isDriving) {
            this.passengers += count;
        } else {
            throw new TrainIsDrivingNow("Cannot enter inside during driving");
        }
    }

    public void removePassengers(int count) throws TrainIsDrivingNow, NotEnoughPassengers {
        if (!isDriving) {
            if (this.passengers - count < 0) {
                throw new NotEnoughPassengers("Negative number passengers");
            } else {
                this.passengers -= count;
            }
        } else {
            throw new TrainIsDrivingNow("Cannot abandon outside during driving");
        }
    }

    public void startDriving() throws TrainStateException {
        if (!isDriving) {
            this.isDriving = true;
        } else {
            throw new TrainStateException("Train is driving");
        }
    }

    public void stopDriving() throws TrainStateException {
        if (isDriving) {
            if (speed < 20) {
                this.isDriving = false;
                stationCounter++;
            } else {
                throw new TrainStateException("Allah akbar poezdu((");
            }
        } else {
            throw new TrainStateException("Start driving at first");
        }
    }

    public boolean isDriving() {
        return isDriving;
    }

    public void changeSpeed(int difference) throws TrainStateException {
        if (abs(difference) > 10) {
            throw new TrainStateException("Cannot change speed more than 10");
        } else if (this.speed + difference < 5) {
            throw new TrainStateException("Cannot change speed less than 5");
        } else {
            this.speed += difference;
        }
    }

    public void getTrainStats() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) throws NotEnoughPassengers {
        if (passengers >= 0) {
            this.passengers = passengers;
        } else {
            throw new NotEnoughPassengers("Cannot set negative value");
        }
    }

    public void setDriving(boolean driving) {
        this.isDriving = driving;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "NAME:" + name +
                "\nPASSENGERS:" + passengers +
                "\nIS DRIVING:" + isDriving +
                "\nSPEED:" + speed +
                "\nSTATIONS WERE VISITED:" + stationCounter;
    }
}
