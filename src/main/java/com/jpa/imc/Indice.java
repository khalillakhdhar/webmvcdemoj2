package com.jpa.imc;


public class Indice {
private double poids,taille;

public Indice() {
	super();
	// TODO Auto-generated constructor stub
}

public Indice(double poids, double taille) {
	super();
	this.poids = poids;
	this.taille = taille;
}

public double getPoids() {
	return poids;
}

public void setPoids(double poids) {
	this.poids = poids;
}

public double getTaille() {
	return taille;
}

public void setTaille(double taille) {
	this.taille = taille;
}
public long imc()
{
double im=this.poids/ Math.pow(taille, 2);
return Math.round(im);
}
public String interpretation()
{
	if(this.imc()<20)
		return "maigre";
	else if(this.imc()<=25)
		return "idéale";
	else
		return "surpoid";
	
}

@Override
public String toString() {
	return "Indice [poids=" + poids + ", taille=" + taille + ", imc=" + imc() + ", interpretation="
			+ interpretation() + "]";
}


}
