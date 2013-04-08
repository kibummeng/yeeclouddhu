package test;

import java.util.Comparator;

import java.util.Collection;

import java.util.*;
public class myCompare implements Comparator{
 
    public int compare(Object o1,Object o2) {
        CookieRatio p1=(CookieRatio)o1;
        CookieRatio p2=(CookieRatio)o2;  
       if(p1.ratio<p2.ratio)
           return 1;
       else
           return 0;
       }
 
}
