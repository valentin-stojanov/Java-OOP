package TrafficLights;

public enum TrafficLight {
    RED,
    GREEN,
    YELLOW,
    ;


    public static TrafficLight change(TrafficLight trafficLight) {
        switch (trafficLight) {
            case YELLOW:
                trafficLight = RED;
                break;
            case RED:
                trafficLight = GREEN;
                break;
            case GREEN:
                trafficLight = YELLOW;
                break;
        }
        return trafficLight;
    }
}
