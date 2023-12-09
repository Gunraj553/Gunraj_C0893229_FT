class Sum extends Binary {
    @Override
    public int evaluate() {
        return getLeftOperand().evaluate() + getRightOperand().evaluate();
    }

    @Override
    public String toString() {
        return getLeftOperand().toString() + " + " + getRightOperand().toString();
    }
}

