package net.PugGam3erp.decormod.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum SnakeVariant {
    DEFAULT(0),
    RED(1),
    BLACK(2);

    private static final SnakeVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(SnakeVariant::getId)).toArray(SnakeVariant[]::new);
    private final int id;

    SnakeVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static SnakeVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}