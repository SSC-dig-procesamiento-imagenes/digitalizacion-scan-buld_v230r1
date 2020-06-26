package tecloscan;

import Vo.LoteVO;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Methods
{
  public LoteVO convertFileToJson()
    throws FileNotFoundException
  {
    Gson gson = new Gson();
    LoteVO lote = (LoteVO)gson.fromJson(new FileReader("C:\\TECLO_PROCESSING\\lote.txt"), LoteVO.class);
    return lote;
  }
  
  public List<String> getImages(String path, List<String> extension, boolean validarExtension)
  {
    File f = new File(path);
    File[] files = f.listFiles();
    List<String> imagesvalid = null;
    if (files != null)
    {
      imagesvalid = new ArrayList();
      for (int i = 0; i < files.length; i++)
      {
        File file = files[i];
        if (file != null) {
          if (validarExtension) {
            for (int j = 0; j < extension.size(); j++) {
              if (file.getName().endsWith((String)extension.get(j))) {
                imagesvalid.add(file.getName());
              }
            }
          } else {
            imagesvalid.add(file.getName());
          }
        }
      }
    }
    return imagesvalid;
  }
}
