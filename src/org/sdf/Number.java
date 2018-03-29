package org.sdf;

public class Number extends Expression {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int eval() {
        System.out.println("Evaluation d'un noeud");
        return value;
    }
}