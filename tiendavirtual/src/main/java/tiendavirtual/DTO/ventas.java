package tiendavirtual.DTO;

public class ventas {
	private int codigo_venta;
	private int cedula_cliente;
	private int cedula_usuario;
	private String ivaventa;
	private String total_venta;
	private String valor_venta;
	public ventas(int codigo_venta, int cedula_cliente, int cedula_usuario, String ivaventa, String total_venta,
			String valor_venta) {
		super();
		this.codigo_venta = codigo_venta;
		this.cedula_cliente = cedula_cliente;
		this.cedula_usuario = cedula_usuario;
		this.ivaventa = ivaventa;
		this.total_venta = total_venta;
		this.valor_venta = valor_venta;
	}
	public int getCodigo_venta() {
		return codigo_venta;
	}
	public void setCodigo_venta(int codigo_venta) {
		this.codigo_venta = codigo_venta;
	}
	public int getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(int cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	public int getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(int cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	public String getIvaventa() {
		return ivaventa;
	}
	public void setIvaventa(String ivaventa) {
		this.ivaventa = ivaventa;
	}
	public String getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(String total_venta) {
		this.total_venta = total_venta;
	}
	public String getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(String valor_venta) {
		this.valor_venta = valor_venta;
	}
	
	

}
