package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sort {
	public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add(new CookieRatio("lcl",9));
        list.add(new CookieRatio("fx",23));
        list.add(new CookieRatio("wqx",29));
        Comparator comp = new myCompare();
        Collections.sort(list,comp);  
        for(int i = 0;i<list.size();i++){
        	CookieRatio p = (CookieRatio)list.get(i);
            System.out.println(p.getName());
        }  
	}
}
