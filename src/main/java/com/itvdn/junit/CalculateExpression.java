package com.itvdn.junit;

import java.util.Stack;

public class CalculateExpression {
    public double calculateExpression(String expression) {
        Stack<Double> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                // If the current character is a digit, parse the entire number
                StringBuilder num = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    num.append(expression.charAt(i));
                    i++;
                }
                i--; // Adjust the index to account for the last digit

                operandStack.push(Double.parseDouble(num.toString()));
            } else if (isOperator(c)) {
                // If the current character is an operator, process operators with higher or equal precedence
                while (!operatorStack.isEmpty() && hasHigherPrecedence(operatorStack.peek(), c)) {
                    processOperation(operandStack, operatorStack);
                }
                // Push the current operator onto the stack
                operatorStack.push(c);
            }
        }

        // Process any remaining operators in the stacks
        while (!operatorStack.isEmpty()) {
            processOperation(operandStack, operatorStack);
        }

        // The result should be the only element left in the operand stack
        return operandStack.pop();
    }

    private void processOperation(Stack<Double> operandStack, Stack<Character> operatorStack) {
        char operator = operatorStack.pop();

        if (operator == '/' && operandStack.peek() == 0.0) {
            // Handle division by zero
            throw new ArithmeticException("Division by zero");
        }

        double operand2 = operandStack.pop();
        double operand1 = operandStack.pop();

        switch (operator) {
            case '+':
                operandStack.push(operand1 + operand2);
                break;
            case '-':
                operandStack.push(operand1 - operand2);
                break;
            case '*':
                operandStack.push(operand1 * operand2);
                break;
            case '/':
                operandStack.push(operand1 / operand2);
                break;
        }
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    private boolean hasHigherPrecedence(char op1, char op2) {
        return (op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-');
    }
}
