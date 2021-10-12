package fr.dauphine.javaavance.td1;

import java.util.ArrayList;
import java.util.Objects;

public class Polyline{
	private final ArrayList<Point> list;
	private int maxsize;
	public Polyline(ArrayList<Point> pl, int maxsize) {
	this.list = pl;
	this.maxsize=maxsize;
	}
	public int nbpoints() {
		return list.size();
	}
    public int getmaxsize() {
        return maxsize;
    }

    public void pointcapacity(int maxsize) {
        if (nbpoints() > maxsize)
            throw new IllegalStateException("la taille max ne peut être inférieur à la taille actuelle: " + nbpoints());
        this.maxsize = maxsize;
    }
    public boolean add(Point p) {
        if (nbpoints() == getmaxsize())
            throw new IllegalStateException("taille max atteinte: " + getmaxsize());
        else Objects.requireNonNull(p);
        return list.add(p);
    }
    public boolean contains(Point p) {
    	for(int i = 0 ; i < list.size(); i++) {
    		p.equals(list.get(i));	
    	}
		return true;
    	
    }
	//Conseils du prof:
	//méthode add class polyline 
// lever une exception pour vérifier si la liste est pleine
// throw new illegal state exception("La liste est pleine")
	//else 
	//list[nb++]=object.requirenonnull(P)
	
}
