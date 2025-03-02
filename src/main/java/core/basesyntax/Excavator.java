package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("ExcavatorDoWork");
    }

    @Override
    public void stopWork() {
        System.out.println("ExcavatorStopWork");
    }
}
