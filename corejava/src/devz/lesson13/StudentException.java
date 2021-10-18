/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devz.lesson13;

/**
 *
 * @author devzo
 */
public class StudentException extends Exception {

    /**
     * Creates a new instance of <code>StudentException</code> without detail
     * message.
     */
    public StudentException() {
    }

    /**
     * Constructs an instance of <code>StudentException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public StudentException(String msg) {
        super(msg);
    }
}
