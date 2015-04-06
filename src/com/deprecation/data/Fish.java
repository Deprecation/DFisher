package com.deprecation.data;

/**
 * @author Deprecation
 */
public enum Fish {
    MONKFISH(7944);

    private int id;

    Fish(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString().substring(0, 1).toUpperCase() + super.toString().substring(1);
    }
}
