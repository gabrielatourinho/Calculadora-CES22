
package calculadora;

import javax.swing.JFrame;

public class Calculadora {

    int value;
    int keep;
    char toDo;
    
    void binaryOperation(char op) {
        keep = value;
        value = 0;
        toDo = op;
    }
    void add() { binaryOperation('+'); }
    void subtract() { binaryOperation('-'); }
    void multiply() { binaryOperation('*'); }
    void divide() { binaryOperation('/'); }
    void compute() {
        switch (toDo) {
            case '+':
                value = keep+value;
                break;
            case '-':
                value = keep-value;
                break;
            case '*':
                value = keep*value;
                break;
            case '/':
                value = keep/value;
                break;
            default:
                break;
        }
        keep = 0;
    }
    void clear() {
        value = 0;
        keep = 0;
    }
    void digit(int x) {
        value = value*10 + x;
    }
    int display() {
        return(value);
    }
    Calculadora() {clear(); }
    
    public static void main(String[] args) {
        
       JFrame c = new CalculadoraFrame();
       c.setVisible(true);
    }
    
}
