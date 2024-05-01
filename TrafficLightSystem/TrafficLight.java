class TrafficLight {
    private String currentState;

    public TrafficLight() {
        this.currentState = "RED"; // Initial state
    }

    // ps: I'm very impressed with myself for making this as a colourblind person 🤩
    // TODO: Figure out what the states should be below:
    public void change() {
        switch (currentState) {
            case "RED":
                System.out.println("Red Light - STOP for 30 seconds.");
//                currentState = what state should I be, what comes after red?;
                break;
            case "GREEN":
                System.out.println("Green Light - GO for 60 seconds.");
//                currentState = what state should I be, what comes after green?;
                break;
            case "ORANGE":
                System.out.println("ORANGE Light - CAUTION for 10 seconds.");
//                currentState = what state should I be, what comes after orange?;
                break;
            default:
                System.out.println("Invalid State");
                break;
        }
    }
}