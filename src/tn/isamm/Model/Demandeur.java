package tn.isamm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="demandeur")
public class Demandeur {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private int id_dem;
	     
	    @Column
	    private String nom_dem;
	    @Column
	    private String prenom_dem;
	    @Column
	    private String fonction_dem;
	    @Column
	    private String objet_demande;
	    @Column
	    private String login;
	    @Column
	    private String motDePasse;
	    
	    
	    
		public Demandeur() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Demandeur(int id_dem, String nom_dem, String prenom_dem,
				String fonction_dem, String objet_demande, String login,
				String motDePasse) {
			super();
			this.id_dem = id_dem;
			this.nom_dem = nom_dem;
			this.prenom_dem = prenom_dem;
			this.fonction_dem = fonction_dem;
			this.objet_demande = objet_demande;
			this.login = login;
			this.motDePasse = motDePasse;
		}
		

		public int getId_dem() {
			return id_dem;
		}
		public void setId_dem(int id_dem) {
			this.id_dem = id_dem;
		}
		public String getNom_dem() {
			return nom_dem;
		}
		public void setNom_dem(String nom_dem) {
			this.nom_dem = nom_dem;
		}
		public String getPrenom_dem() {
			return prenom_dem;
		}
		public void setPrenom_dem(String prenom_dem) {
			this.prenom_dem = prenom_dem;
		}
		public String getFonction_dem() {
			return fonction_dem;
		}
		public void setFonction_dem(String fonction_dem) {
			this.fonction_dem = fonction_dem;
		}
		public String getObjet_demande() {
			return objet_demande;
		}
		public void setObjet_demande(String objet_demande) {
			this.objet_demande = objet_demande;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getMotDePasse() {
			return motDePasse;
		}
		public void setMotDePasse(String motDePasse) {
			this.motDePasse = motDePasse;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((fonction_dem == null) ? 0 : fonction_dem.hashCode());
			result = prime * result + id_dem;
			result = prime * result + ((login == null) ? 0 : login.hashCode());
			result = prime * result
					+ ((motDePasse == null) ? 0 : motDePasse.hashCode());
			result = prime * result
					+ ((nom_dem == null) ? 0 : nom_dem.hashCode());
			result = prime * result
					+ ((objet_demande == null) ? 0 : objet_demande.hashCode());
			result = prime * result
					+ ((prenom_dem == null) ? 0 : prenom_dem.hashCode());
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
			Demandeur other = (Demandeur) obj;
			if (fonction_dem == null) {
				if (other.fonction_dem != null)
					return false;
			} else if (!fonction_dem.equals(other.fonction_dem))
				return false;
			if (id_dem != other.id_dem)
				return false;
			if (login == null) {
				if (other.login != null)
					return false;
			} else if (!login.equals(other.login))
				return false;
			if (motDePasse == null) {
				if (other.motDePasse != null)
					return false;
			} else if (!motDePasse.equals(other.motDePasse))
				return false;
			if (nom_dem == null) {
				if (other.nom_dem != null)
					return false;
			} else if (!nom_dem.equals(other.nom_dem))
				return false;
			if (objet_demande == null) {
				if (other.objet_demande != null)
					return false;
			} else if (!objet_demande.equals(other.objet_demande))
				return false;
			if (prenom_dem == null) {
				if (other.prenom_dem != null)
					return false;
			} else if (!prenom_dem.equals(other.prenom_dem))
				return false;
			return true;
		}
	     
	    
}
