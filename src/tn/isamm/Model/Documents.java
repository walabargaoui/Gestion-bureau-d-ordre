package tn.isamm.Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;


@Embeddable
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@MappedSuperclass 
public class Documents {
	@Column
	private int num_doc;
	@Column
	private String reference_doc;
	public Documents() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Documents(int num_doc, String reference_doc) {
		super();
		this.num_doc = num_doc;
		this.reference_doc = reference_doc;
	}
	public int getNum_doc() {
		return num_doc;
	}
	public void setNum_doc(int num_doc) {
		this.num_doc = num_doc;
	}
	public String getReference_doc() {
		return reference_doc;
	}
	public void setReference_doc(String reference_doc) {
		this.reference_doc = reference_doc;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num_doc;
		result = prime * result
				+ ((reference_doc == null) ? 0 : reference_doc.hashCode());
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
		Documents other = (Documents) obj;
		if (num_doc != other.num_doc)
			return false;
		if (reference_doc == null) {
			if (other.reference_doc != null)
				return false;
		} else if (!reference_doc.equals(other.reference_doc))
			return false;
		return true;
	}
	


	
}
