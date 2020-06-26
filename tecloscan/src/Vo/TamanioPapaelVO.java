package Vo;

public class TamanioPapaelVO
{
  private Long idTamanioPapel;
  private Integer valor;
  private String nombre;
  private String ancho;
  private String alto;
  private UnidadMedidaVO UnidadMedida;
  
  public Long getIdTamanioPapel()
  {
    return this.idTamanioPapel;
  }
  
  public void setIdTamanioPapel(Long idTamanioPapel)
  {
    this.idTamanioPapel = idTamanioPapel;
  }
  
  public Integer getValor()
  {
    return this.valor;
  }
  
  public void setValor(Integer valor)
  {
    this.valor = valor;
  }
  
  public String getNombre()
  {
    return this.nombre;
  }
  
  public void setNombre(String nombre)
  {
    this.nombre = nombre;
  }
  
  public String getAncho()
  {
    return this.ancho;
  }
  
  public void setAncho(String ancho)
  {
    this.ancho = ancho;
  }
  
  public String getAlto()
  {
    return this.alto;
  }
  
  public void setAlto(String alto)
  {
    this.alto = alto;
  }
  
  public UnidadMedidaVO getUnidadMedida()
  {
    return this.UnidadMedida;
  }
  
  public void setUnidadMedida(UnidadMedidaVO unidadMedida)
  {
    this.UnidadMedida = unidadMedida;
  }
}
