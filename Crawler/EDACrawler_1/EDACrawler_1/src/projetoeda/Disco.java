package projetoeda;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Disco {
    public void save(String path, ArrayList<String> imagens){
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(path+".hm"));
            
            os.writeObject(imagens);
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<String> open(String nome){
        try(ObjectInputStream is = new ObjectInputStream(new FileInputStream(nome))){
           return (ArrayList) is.readObject();
        } 
        catch(Exception ex){
            ex.printStackTrace();
        }
        return new ArrayList();    
    }
    
    public void dowloadImagePackage(String url, String imageName, String path){
        try{
            //buscar a imagem na internet
            URL link = new URL(url);
            File ficheiro = new File(path+imageName); 
            BufferedImage imagem = ImageIO.read(link);
            //guardar a imagem 
            ImageIO.write(imagem, "jpg", ficheiro);
            

        } catch (Exception ex) {
        } 
    }
    
    
    
}
