/*
CSD2221 Individual Programming Assignment 2017 - Task 3
By Antanas Icikovic
ID: M00537517
Last edited: 30 November 2017 22:14


To Do:

*/
package task3;

import java.util.Comparator;

class OrderComparator implements Comparator<Shark> {
    @Override
    public int compare(Shark o1, Shark o2) {

           return o1.getRealName().compareTo(o2.getRealName());
   }
}

