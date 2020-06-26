package Vo;

public class ConfiguracionEscanerVO
{
  private Long idConfiguracionEscaner;
  private String nombreConfiguracionEscaner;
  private String nombreNomenclatura;
  private Integer contraste;
  private Integer brillo;
  private EscanerVO escaner;
  private TamanioPapaelVO tamanioPapael;
  private ResolucionVO resolucion;
  private TipoPixelVO tipoPixel;
  private TipoArchivosVO tipoArchivos;
  private SuministroPapelVO suministroPapel;
  
  public ConfiguracionEscanerVO() {}
  
  public ConfiguracionEscanerVO(Long idConfiguracionEscaner, String nombreConfiguracionEscaner, String nombreNomenclatura, Integer contraste, Integer brillo, EscanerVO escaner, TamanioPapaelVO tamanioPapael, ResolucionVO resolucion, TipoPixelVO tipoPixel, TipoArchivosVO tipoArchivos, SuministroPapelVO suministroPapel)
  {
    this.idConfiguracionEscaner = idConfiguracionEscaner;
    this.nombreConfiguracionEscaner = nombreConfiguracionEscaner;
    this.nombreNomenclatura = nombreNomenclatura;
    this.contraste = contraste;
    this.brillo = brillo;
    this.escaner = escaner;
    this.tamanioPapael = tamanioPapael;
    this.resolucion = resolucion;
    this.tipoPixel = tipoPixel;
    this.tipoArchivos = tipoArchivos;
    this.suministroPapel = suministroPapel;
  }
  
  public Long getIdConfiguracionEscaner()
  {
    return this.idConfiguracionEscaner;
  }
  
  public void setIdConfiguracionEscaner(Long idConfiguracionEscaner)
  {
    this.idConfiguracionEscaner = idConfiguracionEscaner;
  }
  
  public String getNombreConfiguracionEscaner()
  {
    return this.nombreConfiguracionEscaner;
  }
  
  public void setNombreConfiguracionEscaner(String nombreConfiguracionEscaner)
  {
    this.nombreConfiguracionEscaner = nombreConfiguracionEscaner;
  }
  
  public String getNombreNomenclatura()
  {
    return this.nombreNomenclatura;
  }
  
  public void setNombreNomenclatura(String nombreNomenclatura)
  {
    this.nombreNomenclatura = nombreNomenclatura;
  }
  
  public Integer getContraste()
  {
    return this.contraste;
  }
  
  public void setContraste(Integer contraste)
  {
    this.contraste = contraste;
  }
  
  public Integer getBrillo()
  {
    return this.brillo;
  }
  
  public void setBrillo(Integer brillo)
  {
    this.brillo = brillo;
  }
  
  public EscanerVO getEscaner()
  {
    return this.escaner;
  }
  
  public void setEscaner(EscanerVO escaner)
  {
    this.escaner = escaner;
  }
  
  public TamanioPapaelVO getTamanioPapael()
  {
    return this.tamanioPapael;
  }
  
  public void setTamanioPapael(TamanioPapaelVO tamanioPapael)
  {
    this.tamanioPapael = tamanioPapael;
  }
  
  public ResolucionVO getResolucion()
  {
    return this.resolucion;
  }
  
  public void setResolucion(ResolucionVO resolucion)
  {
    this.resolucion = resolucion;
  }
  
  public TipoPixelVO getTipoPixel()
  {
    return this.tipoPixel;
  }
  
  public void setTipoPixel(TipoPixelVO tipoPixel)
  {
    this.tipoPixel = tipoPixel;
  }
  
  public TipoArchivosVO getTipoArchivos()
  {
    return this.tipoArchivos;
  }
  
  public void setTipoArchivos(TipoArchivosVO tipoArchivos)
  {
    this.tipoArchivos = tipoArchivos;
  }
  
  public SuministroPapelVO getSuministroPapel()
  {
    return this.suministroPapel;
  }
  
  public void setSuministroPapel(SuministroPapelVO suministroPapel)
  {
    this.suministroPapel = suministroPapel;
  }
}
