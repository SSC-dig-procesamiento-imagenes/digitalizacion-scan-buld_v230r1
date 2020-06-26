package Vo;

public class TipoArchivosVO
{
  private Long idTipoArchivos;
  private Integer valor;
  private String nombre;
  private String extencion;
  
  public Long getIdTipoArchivos()
  {
    return this.idTipoArchivos;
  }
  
  public void setIdTipoArchivos(Long idTipoArchivos)
  {
    this.idTipoArchivos = idTipoArchivos;
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
  
  public String getExtencion()
  {
    return this.extencion;
  }
  
  public void setExtencion(String extencion)
  {
    this.extencion = extencion;
  }
}
