/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mscs.observer;

import java.rmi.Remote;

/**
 *
 * @author samishka
 */
public interface Observer1 extends Remote {

    public void updateObservers() throws Exception;
}
