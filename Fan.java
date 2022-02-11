public class Fan {
    enum Direction {
        FORWARD,
        REVERSE
    }
    enum Speed {
        OFF,
        ONE,
        TWO,
        THREE
    }
    private Speed fanSpeed = Speed.OFF;
    private Direction fanDirection = Direction.FORWARD;

    public void pullLeftCord() {
        switch(fanSpeed) {
            case OFF:
                fanSpeed = Speed.ONE;
                break;
            case ONE:
                fanSpeed = Speed.TWO;
                break;
            case TWO:
                fanSpeed = Speed.THREE;
                break;
            case THREE:
                fanSpeed = Speed.OFF;
                break;
        }
    }

    public void pullRightCord() {
        if (fanDirection == Direction.FORWARD) {
            fanDirection = Direction.REVERSE;
        } else {
            fanDirection = Direction.FORWARD;
        }
    }

    public Speed getSpeed() {
        return fanSpeed;
    }

    public Direction getFanDirection() {
        return fanDirection;
    }


    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + fanSpeed +
                ", fanDirection=" + fanDirection +
                '}';
    }
}
