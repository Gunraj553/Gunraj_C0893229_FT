public class Main {
    public static void main(String[] args) {
        Sum term = new Sum();
        term.setLeftOperand(new Number(3));
        Product product_result = new Product();
        product_result.setLeftOperand(new Number(2));
        product_result.setRightOperand(new Number(5));
        term.setRightOperand(product_result);

        System.out.println(evaluate(term));
        System.out.println(term.toString());
    }

    public static int evaluate(Arithmetic term) {
        return term.evaluate();
    }

}