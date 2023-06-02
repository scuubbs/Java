public class Frog extends Pond {
    public String name;
    public int age=5;
    public double tongueSpeed=5;
    public boolean isFroglet;
    public static String species = "Rare Pepe" ;

    public Frog(String frogName, double ageInYears, double frogTongueSpeed){
        this(frogName);
        age=(int) (ageInYears*12);
        tongueSpeed=frogTongueSpeed;
    }
    public Frog(String frogName){
        name = frogName;
    }
    public void grow(){
        grow(1);
    }
    public void grow(int months){
        if(age>29) {
            tongueSpeed -= months;
            if(tongueSpeed<6) tongueSpeed=5;
        }
        age+=months;
        if(age<12) tongueSpeed+=1;
        if(age>11 && isFroglet) isFroglet=false;
    }
    public void eat(Fly food){
        if(food.isDead()) return;
        if(tongueSpeed>food.speed) {
            if(food.mass>=.5*age) grow();
            food.setMass(0);
        } else {
            food.grow(1);
        }
    }
    public static void setSpecies(String species) {
        Frog.species = species;
    }
    public static String getSpecies(){
        return species;
    }
    @Override
    public String toString(){
        if(isFroglet) {
            return "My name is "+name+" and Im a rare froglet! Im " +age+" months old and my tongue has a speed of "+tongueSpeed;
        } else {
            return "My name is "+name+" and Im a rare frog! Im " +age+" months old and my tongue has a speed of "+tongueSpeed;
        }
    }
}    
