public class Main {
    public static void main(String[] args) {
        String expression = "1 -> 0";
        Expression parsedExpression = PropositionParser.parse(expression);
        boolean result = parsedExpression.evaluate();
        System.out.println("Result: " + result); // Should print: Result: false
    }
}