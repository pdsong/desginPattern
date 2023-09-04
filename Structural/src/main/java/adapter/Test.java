package adapter;

import adapter.adapters.SquarePegAdapter;
import adapter.round.RoundHole;
import adapter.round.RoundPeg;
import adapter.square.SquarePeg;

public class Test {
    public static void main(String[] args) {
        RoundHole hole=new RoundHole(5);
        RoundPeg peg=new RoundPeg(5);
        if(hole.fits(peg))
            System.out.println("peg r5 fits hole r5");
        SquarePeg sPeg1=new SquarePeg(2);
        SquarePeg sPeg2=new SquarePeg(20);

        SquarePegAdapter smallPegAdapter=new SquarePegAdapter(sPeg1);
        SquarePegAdapter largePegAdapter=new SquarePegAdapter(sPeg2);
        if(hole.fits(smallPegAdapter))
            System.out.println("square w2 fits round r5");
        if(!hole.fits(largePegAdapter))
            System.out.println("square w20 dont fits round r5");


    }
}
