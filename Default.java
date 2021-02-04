public class Default {
    public static void main(String[] args) throws TrainStateException, TrainIsDrivingNow, NotEnoughPassengers {
        //ексепшени не закетчені, бо нам БУкасов цього ще не пояснював на лекціях
        Train tomas = new Train();
        tomas.stopDriving();
        tomas.addPassengers(5);
        tomas.removePassengers(1);
        tomas.setName("TomASS");
        tomas.startDriving();
        tomas.setSpeed(80);
        tomas.setSpeed(19);
        tomas.stopDriving();
        tomas.changeSpeed(1);
//        System.out.println(tomas);
        tomas.getTrainStats();

        System.out.println();

        Train tu_tu_ruu = new Train();
        tu_tu_ruu.setSpeed(100);
//        System.out.println(mx);
        tu_tu_ruu.getTrainStats();
    }
}


