/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.clementlevallois.nocodeapp.web.front.logview;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;

/**
 *
 * @author LEVALLOIS
 */
@Stateless
public class NotificationService {

    @Inject
    private BeanManager beanManager;

    public void create(String message) {
        Notification newNotification = new Notification();
        newNotification.setMessage(message);
        if (beanManager != null) {
            beanManager.fireEvent(newNotification);
        }else{
            System.out.println("bean manager is null");
        }
    }

    public List<Notification> list() {
        return new ArrayList();
    }

}
