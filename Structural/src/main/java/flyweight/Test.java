package flyweight;

import flyweight.forest.Forest;

import java.awt.*;
import java.util.Random;

public class Test {
    static int SIZE = 500;
    static int TREES_TO_DRAW = 100000000;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, SIZE), random(0, SIZE), "Summer", Color.GREEN, "Sum");
            forest.plantTree(random(0, SIZE), random(0, SIZE), "Autumn", Color.GREEN, "Aut");

        }
        forest.setSize(SIZE, SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees down");
        System.out.println("--------------------------");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");


    }

    private static int random(int min, int max) {
        return min + (int) Math.random() * ((max - min) + 1);
    }
}

