package comGoogle.TrafficLight;

public enum TrafficSignal {
//https://github.com/4PEAT/advanced-features/blob/main/Day03/Task01.md
    RED("RED Signal: Stop for 30 seconds.",30),
    YELLOW("YELLOW Signal: Get ready for 5 seconds.",5),
    GREEN("GREEN Signal: Go for 60 seconds.",60);

    private final String message;
    private final int duration;

    TrafficSignal(String message, int duration) {
        this.message = message;
        this.duration = duration;

    }

    public String getMessage() {
        return message;
    }

    public int getDuration() {
        return duration;
    }



}
