/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdsp;

/**
 *
 * @author usuario
 */
public class Operation extends Expression{
    private char Operator;
    private Expression right;
    private Expression left;
    public double evaluate(){
        switch (Operator){
            case '+': return left.evaluate() + right.evaluate();
            case '*': return left.evaluate() + right.evaluate();
        }
        return 0;
    }
}
