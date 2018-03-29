package org.sdf;

public class Plus extends Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Plus(Expression leftExpression, Expression rightExpression) {
        super();
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(Expression leftExpression) {
        this.leftExpression = leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(Expression rightExpression) {
        this.rightExpression = rightExpression;
    }

    @Override
    public int eval() {
        System.out.println("Evaluation d'un noeud");
        return leftExpression.eval() + rightExpression.eval();
    }
}
