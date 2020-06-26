package Vo;

public class EstatusProcesoVO
{
  private Long idEstatusProceso;
  private String codigoEstatusProceso;
  private String descripcion;
  
  public Long getIdEstatusProceso()
  {
    return this.idEstatusProceso;
  }
  
  public void setIdEstatusProceso(Long idEstatusProceso)
  {
    this.idEstatusProceso = idEstatusProceso;
  }
  
  public String getCodigoEstatusProceso()
  {
    return this.codigoEstatusProceso;
  }
  
  public void setCodigoEstatusProceso(String codigoEstatusProceso)
  {
    this.codigoEstatusProceso = codigoEstatusProceso;
  }
  
  public String getDescripcion()
  {
    return this.descripcion;
  }
  
  public void setDescripcion(String descripcion)
  {
    this.descripcion = descripcion;
  }
}
