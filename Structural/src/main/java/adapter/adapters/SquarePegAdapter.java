package adapter.adapters;

import adapter.round.RoundPeg;
import adapter.square.SquarePeg;

import java.beans.PropertyEditorSupport;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return  (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }
}
