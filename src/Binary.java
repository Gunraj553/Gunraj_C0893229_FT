abstract class Binary extends Arithmetic {
    private Arithmetic leftOperand;
    private Arithmetic rightOperand;

    public Arithmetic getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(Arithmetic leftOperand) {
        this.leftOperand = leftOperand;
    }

    public Arithmetic getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(Arithmetic rightOperand) {
        this.rightOperand = rightOperand;
    }
}