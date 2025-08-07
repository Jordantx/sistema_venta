package sistemaBodega.Bodega.endity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
	
	
		private static final long serialVersionUID = 1L;
		
		@Id 
		@GeneratedValue(strategy=GenerationType.IDENTITY) 
		private Integer id_usuario;
			
		@Column(nullable = false)
		private String usuario;
		
		
		@Column(nullable = false)
		private String contrasena;
		
		@Column(nullable = false)
		private String rol;
		
		
		private String estado;
		
		
	    public Usuario() {}


		public Usuario(Integer id_usuario, String usuario, String contrasena, String rol, String estado) {
			super();
			this.id_usuario = id_usuario;
			this.usuario = usuario;
			this.contrasena = contrasena;
			this.rol = rol;
			this.estado = estado;
		}

		/**
		 * @return the id_usuario
		 */
		public Integer getId_usuario() {
			return id_usuario;
		}

		/**
		 * @param id_usuario the id_usuario to set
		 */
		public void setId_usuario(Integer id_usuario) {
			this.id_usuario = id_usuario;
		}

		/**
		 * @return the usuario
		 */
		public String getUsuario() {
			return usuario;
		}

		/**
		 * @param usuario the usuario to set
		 */
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		/**
		 * @return the contrasena
		 */
		public String getContrasena() {
			return contrasena;
		}

		/**
		 * @param contrasena the contrasena to set
		 */
		public void setContrasena(String contrasena) {
			this.contrasena = contrasena;
		}

		/**
		 * @return the rol
		 */
		public String getRol() {
			return rol;
		}

		/**
		 * @param rol the rol to set
		 */
		public void setRol(String rol) {
			this.rol = rol;
		}

		/**
		 * @return the estado
		 */
		public String getEstado() {
			return estado;
		}

		/**
		 * @param estado the estado to set
		 */
		public void setEstado(String estado) {
			this.estado = estado;
		}

		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
}
