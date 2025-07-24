package sistemaBodega.Bodega.endity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
@Entity
@Table(name="pedido")

public class Pedido implements Serializable{
	   private static final long serialVersionUID = 1L;

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id_pedido;

	    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = ISO.DATE)
	    private LocalDate fecha;

	    @Column
	    private String estado;

	    @ManyToOne
	    @JoinColumn(name = "id_usuario", nullable = false)
	    private Usuario usuario;

	    @OneToMany(mappedBy = "id_detalle_pedido", cascade = CascadeType.ALL)
	    private List<DetallePedido> detalles = new ArrayList<>();
	    
	    public Pedido() {}

		public Pedido(Integer id_pedido, LocalDate fecha, String estado, Usuario usuario,
				List<DetallePedido> detalles) {
			super();
			this.id_pedido = id_pedido;
			this.fecha = fecha;
			this.estado = estado;
			this.usuario = usuario;
			this.detalles = detalles;
		}

		/**
		 * @return the id_pedido
		 */
		public Integer getId_pedido() {
			return id_pedido;
		}

		/**
		 * @param id_pedido the id_pedido to set
		 */
		public void setId_pedido(Integer id_pedido) {
			this.id_pedido = id_pedido;
		}

		/**
		 * @return the fecha
		 */
		public LocalDate getFecha() {
			return fecha;
		}

		/**
		 * @param fecha the fecha to set
		 */
		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
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
		 * @return the usuario
		 */
		public Usuario getUsuario() {
			return usuario;
		}

		/**
		 * @param usuario the usuario to set
		 */
		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		/**
		 * @return the detalles
		 */
		public List<DetallePedido> getDetalles() {
			return detalles;
		}

		/**
		 * @param detalles the detalles to set
		 */
		public void setDetalles(List<DetallePedido> detalles) {
			this.detalles = detalles;
		}

		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	    
	    
	    
	    
}
