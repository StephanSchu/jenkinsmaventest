/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smks.jenkinsmaventest;

/**
 *
 * @author stephanschu
 */
public class Run {
    public static void main(String[] args) {
        Stuff s = new Stuff();
        s.doStuff();
        MoreStuff ms = new MoreStuff();
        ms.stuff();
    }
}
