package tn.isamm.Model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courrier")
public class Courrier {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	
	private int num_courr;
	@Column
	private String date_courr;
	@Column
	private String objet_courr;
	@Column
	private int reference_courr;
	private Documents doc;
	public Courrier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Courrier(int num_courr, String date_courr, String objet_courr,
			int reference_courr, Documents doc) {
		super();
		this.num_courr = num_courr;
		this.date_courr = date_courr;
		this.objet_courr = objet_courr;
		this.reference_courr = reference_courr;
		this.doc = doc;
	}

	public int getNum_courr() {
		return num_courr;
	}
	public void setNum_courr(int num_courr) {
		this.num_courr = num_courr;
	}
	public String getDate_courr() {
		return date_courr;
	}
	public void setDate_courr(String date_courr) {
		this.date_courr = date_courr;
	}
	public String getObjet_courr() {
		return objet_courr;
	}
	public void setObjet_courr(String objet_courr) {
		this.objet_courr = objet_courr;
	}
	public int getReference_courr() {
		return reference_courr;
	}
	public void setReference_courr(int reference_courr) {
		this.reference_courr = reference_courr;
	}
	@Embedded
	public Documents getDoc() {
		return doc;
	}

	public void setDoc(Documents doc) {
		this.doc = doc;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((date_courr == null) ? 0 : date_courr.hashCode());
		result = prime * result + ((doc == null) ? 0 : doc.hashCode());
		result = prime * result + num_courr;
		result = prime * result
				+ ((objet_courr == null) ? 0 : objet_courr.hashCode());
		result = prime * result + reference_courr;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Courrier other = (Courrier) obj;
		if (date_courr == null) {
			if (other.date_courr != null)
				return false;
		} else if (!date_courr.equals(other.date_courr))
			return false;
		if (doc == null) {
			if (other.doc != null)
				return false;
		} else if (!doc.equals(other.doc))
			return false;
		if (num_courr != other.num_courr)
			return false;
		if (objet_courr == null) {
			if (other.objet_courr != null)
				return false;
		} else if (!objet_courr.equals(other.objet_courr))
			return false;
		if (reference_courr != other.reference_courr)
			return false;
		return true;
	}
	
	
}
