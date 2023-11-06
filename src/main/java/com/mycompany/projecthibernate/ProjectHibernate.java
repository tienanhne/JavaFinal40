/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projecthibernate;

import GUI.LoadingStart;
import static GUI.LoadingStart.jLabel3;
import static GUI.LoadingStart.jProgressBar1;
import GUI.LoginPage;

/**
 *
 * @author hp
 */
public class ProjectHibernate {

    public static void main(String[] args) {
        HibernateUtils.getSessionFactory();
        LoadingStart load = new LoadingStart();
        load.setVisible(true);
        LoginPage login = new LoginPage();
        int i = 0;
        try {
            while (i <= 100) {
                jProgressBar1.setValue(i);
                Thread.sleep(300);
                i += 5;
                if (i % 2 == 0) {
                    jLabel3.setText("Loading..");
                } else {
                    jLabel3.setText("Loading...");
                }
                if (i == 100) {
                    load.setVisible(false);
                    login.setVisible(true);
                }
            }
        } catch (Exception e) {
        }

    }
}
