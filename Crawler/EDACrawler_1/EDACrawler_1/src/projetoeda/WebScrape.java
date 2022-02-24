package projetoeda;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScrape {
    String url; 
    String urlLinks; 
    boolean crawlFlag = true;
    boolean imagesFlag = false;
    boolean videosFlag = false;
    String filtro = null;
    ArrayList<String> imgArray;
    ArrayList<String> vidArray;
    ArrayList<Integer> profundidade;
    Set<URL> links;
    int recursionLimit;
    int iterator;
    
    public WebScrape(){
        iterator = 1;
        imgArray = new ArrayList<>();
        vidArray = new ArrayList<>();
        profundidade = new ArrayList();
    }
    public void setURL(String url){
        this.url = url; 
    }
    
    public String getURL(){
        return this.url; 
    }
    
    public void setCrawlFlag(boolean flag){
       this.crawlFlag = flag; 
    }
    
    public boolean getCrawlFlag(){
        return this.crawlFlag; 
    }

    public boolean getImagesFlag() {
        return imagesFlag;
    }

    public void setImagesFlag(boolean imagesFlag) {
        this.imagesFlag = imagesFlag;
    }

    public boolean getVideosFlag() {
        return videosFlag;
    }

    public void setVideosFlag(boolean videosFlag) {
        this.videosFlag = videosFlag;
    }
    
    
    public void setFiltro(String filtro){
        this.filtro = filtro; 
    }
    
    public String getFiltro(){
        return this.filtro; 
    }
    
      public Set<URL> getLinks() {
        return links;
    }

    public void setLinks(Set<URL> links) {
        this.links = links;
    }

    public int getRecursionLimit() {
        return recursionLimit;
    }

    public void setRecursionLimit(int recursionLimit) {
        this.recursionLimit = recursionLimit;
    }

    public int getIterator() {
        return iterator;
    }

    public void setIterator(int iterator) {
        this.iterator = iterator;
    }
 
    public void WebSpider(){
        try{
            URL startUrl = new URL(this.getURL());
            imgArray = new ArrayList<>();
            links = new HashSet<>();
            recursionLimit = 3;
            iterator = 1;
            crawl(initURLS(startUrl));
        }catch(Exception ex){
                
        }
    }  
    
    private void crawl(Set<URL> urls){
        urls.removeAll(this.links);
        if(! urls.isEmpty()){
            Set<URL> newURLS = new HashSet<>();
            try{
                this.links.addAll(urls);
                for (URL ligs : urls) {
                    this.urlLinks = ligs.toString(); 
                    Document document = Jsoup.connect(urlLinks).get();
                    Elements linksPagina = document.select("a[href^=http]");
                    buscarImagens();
                    for (Element element : linksPagina) {
                        String urlText = element.attr("abs:href");
                        URL discoveredURL = new URL(urlText);
                        newURLS.add(discoveredURL);
                    }
                }
            }catch(Exception | Error e){   
            }
            
            if(!(iterator == recursionLimit)){
                iterator++;
                crawl(newURLS);
            }
        }
        
    }
    
    private Set<URL> initURLS(final URL startURL) {
        return Collections.singleton(startURL);
    }
    
    
    private void buscarImagens() {
        Iterator<Element> auxImg = new Iterator<Element>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Element next() {
                return null;
            }
        };
        Iterator<Element> auxVid = new Iterator<Element>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Element next() {
                return null;
            }
        };
        String srcImg = "";
        String srcVid = "";
        try{
            Document document; 
            if(getCrawlFlag()){
                document = Jsoup.connect(url).get();//Conectar ao site
            }else{
                document = Jsoup.connect(urlLinks).get();
            }
            
            if(getImagesFlag()){
                Elements imagens = document.select("img");//filtrar o DOM em apenas imagens
                auxImg = imagens.iterator();
                
            }
            if(getVideosFlag()){
                Elements videos = document.select("source[type^=video]");
                auxVid = videos.iterator();
            }
            //Acoplar cada imagem recebida em um arraylist 
            while (auxImg.hasNext() || auxVid.hasNext()) {
                //Analisar se é uma pesquisa por tema e filtar imagens com um alt correspondente
                if(this.getFiltro() != null){
                    try{
                        String temaImg = auxImg.next().attr("alt");
                        String temaVid = auxVid.next().attr("abs:src");
                        if(temaImg.toLowerCase().contains(filtro.toLowerCase()) || temaVid.toLowerCase().contains(filtro.toLowerCase())){
                            
                            if (getImagesFlag()){
                                srcImg = auxImg.next().attr("abs:src"); // receber apenas o src
                                imgArray.add(srcImg);
                            }
                            if(getVideosFlag()){
                                srcVid = temaVid;
                                vidArray.add(srcVid);
                            }
                        }
                    }catch(NullPointerException | IllegalArgumentException ex){ 
                        ex.printStackTrace();
                    }catch(NoSuchElementException e){
                        
                    }
                    if(!getCrawlFlag()){
                        profundidade.add(this.getIterator());
                    }else{
                        profundidade.add(1);
                    }
                }else{
                    try{
                        if(getImagesFlag()){
                            srcImg = auxImg.next().attr("abs:src"); // receber apenas o src
                            imgArray.add(srcImg);
                        }
                        if(getVideosFlag()){
                            srcVid = auxVid.next().attr("abs:src");
                            vidArray.add(srcVid);
                        }
                         
                    }catch(NullPointerException | IllegalArgumentException ex){
                        ex.printStackTrace();
                    }catch(NoSuchElementException e){
                        
                    }
                    if(!getCrawlFlag()){
                            profundidade.add(this.getIterator());
                        }else{
                            profundidade.add(1);
                    } 
                }
            }          
        }catch(Exception ex){
            //ex.printStackTrace();
        }
    }
    
    
    public ArrayList<String> getImagens(){
        if(this.getCrawlFlag()){
            this.buscarImagens();
            return this.imgArray; 
        }else{
            this.WebSpider();
            return this.imgArray;
        }
    }
    
    public ArrayList<String> getVideos(){
       if(this.getCrawlFlag()){
            this.buscarImagens();
            return this.vidArray; 
        }else{
            this.WebSpider();
            return this.vidArray;
        } 
    }
    
    public ArrayList<Integer> getProfundidade(){
        return this.profundidade; 
    }
}
