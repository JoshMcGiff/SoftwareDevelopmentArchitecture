class Bus {
    private int distance; // Distance of the bus from the starting point - assume the starting point is the start of the route eg: 301 bus starts at Westbury (distance = 0 at Westbury)

    public Bus(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
