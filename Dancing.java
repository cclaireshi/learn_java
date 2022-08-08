abstract class Dancer {
    public void act() {
        System.out.println("spin");
        doTrick();
    }

    public void doTrick() {
        System.out.println("float");
    }

    abstract void hardJump();
}

abstract class testClass extends Dancer {
}

class Acrobat extends Dancer {
    @Override
    public void act() {
        super.act();
        System.out.println("flip");
    }

    @Override
    public void doTrick() {
        System.out.println(" somersault ");
    }

    @Override
    public void hardJump() {
        System.out.println("Doing a hardJump from Acrobat");
    }
}

class Salsaer extends Dancer {
    @Override
    public void hardJump() {
        System.out.println("Doing a hardJump from Salsaer");
    }
}

public class Dancing {
    public static void main(String[] args) {

        Dancer alice = new Acrobat();
        alice.act();
        // Dancer da = new Dancer();
        // da.hardJump();
        Acrobat bob = new Acrobat();
        bob.hardJump();

        Dancer mike = new Acrobat();
        mike.hardJump();

        Salsaer claire = new Salsaer();
        Dancer[] dancers = {alice, mike, bob, claire};
        // Dancer[] dancers = new Dancer[4];
        // dancers[0] = alice;
        // dancers[1] = bob;
        // dancers[2] = mike;
        // dancers[3]= claire;

        System.out.println("-------------");
        for (Dancer d: dancers) {
            d.hardJump();
        }
        // Dancer a = new Dancer();
        // ((Acrobat) mike).hardJump();
    }
}
