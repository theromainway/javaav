package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class TestPoint {
	public static boolean isSameAs(Point pa, Point pb) {
		return pa==pb;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point(3, 6);
		Point p2=new Point(7, 8);
		System.out.println(p1.getX()+" "+p1.getY());
		System.out.println(Point.nbpts+" points ont été créé!");
		System.out.println(p2.toString());
		// Exercise 3
		Point p3=new Point(1,2);
		Point p4=p3;
		Point p5=new Point(1,2);
		System.out.println(p3==p4); //== verifie l'égalité des adresses donc vrai
		System.out.println(p3==p5); // cf haut
		System.out.println(isSameAs(p4, p3));
		System.out.println(isSameAs(p1, p5));
		//Last question
		 Point px=new Point(4,5);
		 Point py=px;
		 Point pz=new Point(4,5);
		 ArrayList<Point> list = new ArrayList<>();
		 list.add(px);
		 System.out.println(list.indexOf(py));
		 System.out.println(list.indexOf(pz));
	}
}
