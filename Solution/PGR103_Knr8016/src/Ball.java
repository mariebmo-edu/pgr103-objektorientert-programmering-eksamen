public class Ball extends Equipment{

    //Adding variables unique to class - inheriting from Equipment
    BallType ballType;
    boolean needsAir;


    //Constructor
    public Ball(int id, String lockerNum, boolean needsReplacement, BallType ballType, boolean needsAir) {
        super(id, lockerNum, needsReplacement);
        this.ballType = ballType;
        this.needsAir = needsAir;
    }


    //Getters and setters
    public BallType getBallType() {
        return ballType;
    }

    public void setBallType(BallType ballType) {
        this.ballType = ballType;
    }

    public boolean isNeedsAir() {
        return needsAir;
    }

    public void setNeedsAir(boolean needsAir) {
        this.needsAir = needsAir;
    }

    //Overrides
    @Override
    public String toString() {
        return "Ball, id: " + id + ", type: " + ballType + ", LockerNum: " + lockerNum + ", Needs Replacement: " + needsReplacement + ", Needs Air: " + needsAir;
    }
}
