public class NotEnoughPassengers extends Throwable {
    public NotEnoughPassengers(String cannot_abandon_outside) {
        super(cannot_abandon_outside);
    }
}
