package tecloscan;

import Vo.ConfiguracionEscanerVO;
import Vo.LoteVO;
import Vo.ResolucionVO;
import Vo.SuministroPapelVO;
import Vo.TamanioPapaelVO;
import Vo.TipoArchivosVO;
import Vo.TipoPixelVO;
import com.fujitsu.pfu.fiscn.sdk.Fiscn;
import com.fujitsu.pfu.fiscn.sdk.FiscnException;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TecloScan
  extends Fiscn
{
  public TecloScan()
    throws FiscnException
  {}
  
  public void consultaTest(LoteVO lote, int startNumber, boolean isReemplazoImg, String currentImage)
  {
    System.out.println("Scanner JAR Presente");
    Scan app = null;
    try
    {
      app = new Scan();
      
      app.initialize(app);
      
      app.setScanTo(0);
      app.setCompressionType(1);
      
      app.setFileType(lote.getConfiguracionEscaner().getTipoArchivos().getValor().intValue());
      app.setPixelType(lote.getConfiguracionEscaner().getTipoPixel().getValor().intValue());
      if (lote.getConfiguracionEscaner().getResolucion().getValor() == 99)
      {
        app.setCustomResolution(lote.getConfiguracionEscaner().getResolucion().getValor());
        app.setResolution((int)lote.getConfiguracionEscaner().getResolucion().getWidth());
      }
      else
      {
        app.setResolution(lote.getConfiguracionEscaner().getResolucion().getValor());
      }
      app.setContrast(lote.getConfiguracionEscaner().getContraste().intValue());
      app.setBrightness(lote.getConfiguracionEscaner().getBrillo().intValue());
      
      app.setPaperSupply(lote.getConfiguracionEscaner().getSuministroPapel().getValor().intValue());
      if (isReemplazoImg)
      {
        app.setFileCounter(-1L);
        app.setFileName(lote.getRutaAlmacenamiento() + currentImage);
      }
      else
      {
        app.setFileCounter(startNumber);
        app.setFileName(lote.getRutaAlmacenamiento() + lote.getConfiguracionEscaner().getNombreNomenclatura());
      }
      app.setShowSourceUI(false);
      
      app.openScanner2();
      
      app.startScan();
      
      app.closeScanner();
    }
    catch (FiscnException ex)
    {
      System.err.println("An error occurred. Error code: " + ex.getErrorCode());
      
      System.out.println(ex.getStackTrace());
    }
    finally
    {
      if (app != null) {
        app.unInitialize();
      }
    }
  }
  
  public void consultaTest2(LoteVO lote, int startNumber, boolean isReemplazoImg, String currentImage)
  {
    Scan app = null;
    try
    {
      app = new Scan();
      
      app.initialize(app);
      
      app.setAutoBorderDetection(true);
      
      app.setPixelType(lote.getConfiguracionEscaner().getTipoPixel().getValor().intValue());
      
      app.setThreshold(-2);
      app.setCropMarginSize(-5.0F);
      app.setCropPriority(1);
      app.setOrientation(0);
      
      app.setScanTo(0);
      app.setCompressionType(5);
      app.setFileType(lote.getConfiguracionEscaner().getTipoArchivos().getValor().intValue());
      if ((lote.getConfiguracionEscaner().getResolucion().getValor() == 99) || 
        (lote.getConfiguracionEscaner().getTamanioPapael().getValor().intValue() == 14))
      {
        app.setCustomResolution(lote.getConfiguracionEscaner().getResolucion().getValor());
        app.setResolution((int)lote.getConfiguracionEscaner().getResolucion().getWidth());
      }
      else
      {
        app.setResolution(lote.getConfiguracionEscaner().getResolucion().getValor());
      }
      app.setContrast(lote.getConfiguracionEscaner().getContraste().intValue());
      app.setBrightness(lote.getConfiguracionEscaner().getBrillo().intValue());
      if ((lote.getConfiguracionEscaner().getTamanioPapael().getValor().intValue() == 99) || 
        (lote.getConfiguracionEscaner().getTamanioPapael().getValor().intValue() == 14))
      {
        app.setPaperSupply(2);
        app.setUnit(0);
        app.setPaperSize(99);
        app.setCustomPaperLength(9.505F);
        app.setCustomPaperWidth(5.515F);
      }
      else
      {
        app.setPaperSize(lote.getConfiguracionEscaner().getTamanioPapael().getValor().intValue());
      }
      if (isReemplazoImg)
      {
        app.setFileCounter(-1L);
        app.setFileName(lote.getRutaAlmacenamiento() + currentImage);
      }
      else
      {
        app.setFileCounter(startNumber);
        app.setFileName(lote.getRutaAlmacenamiento() + lote.getConfiguracionEscaner().getNombreNomenclatura());
      }
      app.setShowSourceUI(false);
      
      app.openScanner2();
      
      app.startScan();
      
      app.closeScanner();
    }
    catch (FiscnException ex)
    {
      System.err.println("An error occurred. Error code: " + ex.getErrorCode());
      
      System.out.println(ex.getStackTrace());
    }
    finally
    {
      if (app != null) {
        app.unInitialize();
      }
    }
  }
  
  public static void main(String[] args)
    throws FiscnException
  {
    TecloScan scan = new TecloScan();
    Methods met = new Methods();
    
    List<String> extensionesvalidas = new ArrayList();
    extensionesvalidas.add(".TIF");
    extensionesvalidas.add(".tif");
    extensionesvalidas.add(".JPG");
    extensionesvalidas.add(".JPEG");
    extensionesvalidas.add(".jpg");
    extensionesvalidas.add(".jpeg");
    extensionesvalidas.add(".png");
    extensionesvalidas.add(".PNG");
    try
    {
      LoteVO lote = met.convertFileToJson();
      System.out.println(lote.getRutaAlmacenamiento());
      List<String> listImages = met.getImages(lote.getRutaAlmacenamiento(), extensionesvalidas, true);
      
      scan.consultaTest2(lote, lote.getNextNumber(), false, null);
      System.exit(0);
    }
    catch (FileNotFoundException ex)
    {
      Logger.getLogger(TecloScan.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
