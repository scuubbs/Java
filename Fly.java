
public class Fly extends Pond {
    public double mass=5;
    public double speed=10;

    public Fly(double flymass, double flyspeed){
        mass = flymass;
        speed = flyspeed;
    }

    public Fly(double flymass){
        mass = flymass;
    }
    
    public double getMass() {
        return mass;

    }
    public double getSpeed() {
        return speed;
    }

    public void setMass(double flymass) {
        mass = flymass;
    }

    public void setSpeed(double flyspeed) {
        speed = flyspeed;
    }
    public void grow(int addedmass){
        mass+=addedmass;
        if(mass<20){
            speed = speed+addedmass;
            if(speed>20) speed=20;
        } else {
            speed -= (mass % 20) * .5;
        }
    }
    public boolean isDead(){
        if(mass<=0) return true;
        else return false;
    }

    @Override
    public String toString(){
        if(mass==0) {
            return "Im dead but I used to be a fly with speed "+speed;
        } else return "Im a speedy fly with speed "+speed+" and mass "+mass;
    }
}
