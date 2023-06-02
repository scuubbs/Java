public class Pond {
    public static void main(String[] args){
        Frog Peepo = new Frog("Peepo");
        Frog Pepe = new Frog("Pepe", .84, 15);
        Frog Pepaw = new Frog("Pepaw", 4.6, 5);
        Frog scuubbs = new Frog("Scuubbs");

        Fly Fly1 = new Fly(1,3);
        Fly Fly2 = new Fly(6);
        Fly Bob =  new Fly(3);

        Frog.setSpecies("1331 Frogs");
        System.out.println(Peepo.toString());
        Peepo.eat(Fly2);
        Fly2.toString();
        Peepo.grow(8);
        System.out.println(Fly2.toString());
        System.out.println(Peepo.toString());
        System.out.println(Bob.toString());
        Peepo.grow(4);
        System.out.println(Pepaw.toString());
        System.out.println(Pepe.toString());
    }    
}