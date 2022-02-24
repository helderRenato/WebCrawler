package projetoeda;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main extends javax.swing.JFrame {
    CardLayout cardLayout; 
    JFileChooser fileChooser; 
    WebScrape webScrape; 
    String pasta = System.getProperty("java.class.path");
    String path; 
    Disco disco;
    int contador; 
    ArrayList<String> imagens; 
    ArrayList<String> videos; 
    ArrayList<Integer> profundidade; 
    boolean results = false; 
    public Main() {
        initComponents(); 
        cardLayout = (CardLayout) (rigthLayout.getLayout()); 
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftLayout = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        other = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rigthLayout = new javax.swing.JPanel();
        homeLayout = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        searchButton = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        imagensPanel = new javax.swing.JPanel();
        filterPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        temaFilter = new javax.swing.JTextField();
        crawlFlagFilter = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        imagesFilter = new javax.swing.JCheckBox();
        videosFilter = new javax.swing.JCheckBox();
        offlineLayout = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        searchOfflineField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        imagensPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftLayout.setBackground(new java.awt.Color(12, 10, 110));
        leftLayout.setPreferredSize(new java.awt.Dimension(200, 500));

        homePanel.setBackground(new java.awt.Color(12, 10, 110));
        homePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                homePanelMouseMoved(evt);
            }
        });
        homePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homePanelMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jLabel1.setText("HOME");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        other.setBackground(new java.awt.Color(12, 10, 110));
        other.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                otherMouseMoved(evt);
            }
        });
        other.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                otherMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                otherMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/offline.png"))); // NOI18N
        jLabel3.setText("OFFLINE MODE");

        javax.swing.GroupLayout otherLayout = new javax.swing.GroupLayout(other);
        other.setLayout(otherLayout);
        otherLayout.setHorizontalGroup(
            otherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        otherLayout.setVerticalGroup(
            otherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout leftLayoutLayout = new javax.swing.GroupLayout(leftLayout);
        leftLayout.setLayout(leftLayoutLayout);
        leftLayoutLayout.setHorizontalGroup(
            leftLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(other, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftLayoutLayout.setVerticalGroup(
            leftLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayoutLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(other, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(445, Short.MAX_VALUE))
        );

        getContentPane().add(leftLayout, java.awt.BorderLayout.LINE_START);

        rigthLayout.setBackground(new java.awt.Color(255, 255, 255));
        rigthLayout.setLayout(new java.awt.CardLayout());

        homeLayout.setBackground(new java.awt.Color(255, 255, 255));

        searchPanel.setOpaque(false);

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search .png"))); // NOI18N
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton)
                .addGap(18, 18, 18))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imagensPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout imagensPanelLayout = new javax.swing.GroupLayout(imagensPanel);
        imagensPanel.setLayout(imagensPanelLayout);
        imagensPanelLayout.setHorizontalGroup(
            imagensPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 804, Short.MAX_VALUE)
        );
        imagensPanelLayout.setVerticalGroup(
            imagensPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(imagensPanel);

        filterPanel.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setText("filtros: ");

        crawlFlagFilter.setText("all ");
        crawlFlagFilter.setOpaque(false);
        crawlFlagFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crawlFlagFilterActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar Resultado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        imagesFilter.setText("Images");
        imagesFilter.setOpaque(false);
        imagesFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagesFilterActionPerformed(evt);
            }
        });

        videosFilter.setText("Vídeos");
        videosFilter.setOpaque(false);
        videosFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                videosFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout filterPanelLayout = new javax.swing.GroupLayout(filterPanel);
        filterPanel.setLayout(filterPanelLayout);
        filterPanelLayout.setHorizontalGroup(
            filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(temaFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(crawlFlagFilter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(videosFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagesFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(12, 12, 12))
        );
        filterPanelLayout.setVerticalGroup(
            filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(temaFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crawlFlagFilter)
                    .addComponent(jButton1)
                    .addComponent(imagesFilter)
                    .addComponent(videosFilter))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout homeLayoutLayout = new javax.swing.GroupLayout(homeLayout);
        homeLayout.setLayout(homeLayoutLayout);
        homeLayoutLayout.setHorizontalGroup(
            homeLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(filterPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(homeLayoutLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        homeLayoutLayout.setVerticalGroup(
            homeLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );

        rigthLayout.add(homeLayout, "homeLayout");

        offlineLayout.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carregar.png"))); // NOI18N
        jButton2.setText("carregar ficheiro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        searchOfflineField.setEditable(false);

        imagensPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout imagensPanel1Layout = new javax.swing.GroupLayout(imagensPanel1);
        imagensPanel1.setLayout(imagensPanel1Layout);
        imagensPanel1Layout.setHorizontalGroup(
            imagensPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 831, Short.MAX_VALUE)
        );
        imagensPanel1Layout.setVerticalGroup(
            imagensPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(imagensPanel1);

        javax.swing.GroupLayout offlineLayoutLayout = new javax.swing.GroupLayout(offlineLayout);
        offlineLayout.setLayout(offlineLayoutLayout);
        offlineLayoutLayout.setHorizontalGroup(
            offlineLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offlineLayoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(offlineLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                    .addGroup(offlineLayoutLayout.createSequentialGroup()
                        .addComponent(searchOfflineField)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        offlineLayoutLayout.setVerticalGroup(
            offlineLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offlineLayoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(offlineLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchOfflineField))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
        );

        rigthLayout.add(offlineLayout, "a1");

        getContentPane().add(rigthLayout, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homePanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseMoved
        homePanel.setBackground(new java.awt.Color(26, 63, 123));
    }//GEN-LAST:event_homePanelMouseMoved

    private void homePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseExited
        homePanel.setBackground(new java.awt.Color(12, 10, 110));
    }//GEN-LAST:event_homePanelMouseExited

    private void homePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseClicked
        cardLayout.show(rigthLayout, "homeLayout");
    }//GEN-LAST:event_homePanelMouseClicked

    private void otherMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otherMouseMoved
        other.setBackground(new java.awt.Color(26, 63, 123));
    }//GEN-LAST:event_otherMouseMoved

    private void otherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otherMouseClicked
        cardLayout.show(rigthLayout, "a1");
    }//GEN-LAST:event_otherMouseClicked

    private void otherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otherMouseExited
        other.setBackground(new java.awt.Color(12, 10, 110));
    }//GEN-LAST:event_otherMouseExited

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        try {
            //Verificar se foi uma url bem posta
            URL u = new URL(searchField.getText());
            webScrape = new WebScrape();
            webScrape.setURL(searchField.getText());
            //Fazer a pesquisa tendo em conta os seus filtros 
            //Analisar se foi uma pesquisa feita por tema e ter em consideração o alt das imagens
            if(!temaFilter.getText().isEmpty()){
                webScrape.setFiltro(temaFilter.getText());
            }
            //Analisar se a flag foi acionada então visitar os links dos links 
            if(crawlFlagFilter.isSelected()){
                webScrape.setCrawlFlag(false);
            }
            if(imagesFilter.isSelected()){
                webScrape.setImagesFlag(true);
            }
            if(videosFilter.isSelected()){
                webScrape.setVideosFlag(true);
            }

            this.attImagesPanel(webScrape);
            this.validate();
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(this, "Escreva uma URL válida", "Erro", JOptionPane.ERROR_MESSAGE); 
        }
        
    }//GEN-LAST:event_searchButtonMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Guardar o resultado da pesquisa se o resultador for vazio retornar um erro
        if(results){
            JFrame frame = new JFrame(); 
            fileChooser = new JFileChooser(); 
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int opcao = fileChooser.showSaveDialog(frame);
            
            if(opcao == JFileChooser.APPROVE_OPTION){
                disco = new Disco(); 
                path = System.getProperty("java.class.path"); 
                int index = path.lastIndexOf(";"); 
                if(index >= 0){
                    path = path.substring(index + 1);    
                }
                //Criar um array Cópia para alocar as imagens e o link usado
                ArrayList<String> ficheiro = new ArrayList(); 
                //Primeira posição do array reservada para o link
                ficheiro.add(webScrape.getURL()); 
                for(String str : imagens){
                    //retirar o http do nome da imagem 
                    index = str.lastIndexOf("/");
                    String imageName = str.substring(index); 
                    
                    disco.dowloadImagePackage(str, imageName, path);
                    //alocar os caminhos das imagens no array
                    File file = new File(path+imageName); 
                    ficheiro.add(file.getAbsolutePath()); 
                }
                
                //salvar o ficheiro
                disco.save(fileChooser.getSelectedFile().getAbsolutePath(), ficheiro);
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Não pode guardar resultados vazios", "Erro", JOptionPane.ERROR_MESSAGE); 
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("HM File", "hm");
        fileChooser.setFileFilter(filtro);
        int opcao = fileChooser.showOpenDialog(new JFrame());
        imagensPanel1.removeAll();
        //Abrir o ficheiro
        if(opcao == JFileChooser.APPROVE_OPTION){
            //Aceitar apenas ficheiro com a extensão hm
                String extensao = "";
                //Retirar a extensão depois do "." do ficheiro
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                String nome = file.getName();
                int size = nome.lastIndexOf(".");
                if (size == -1) {
                    extensao = "";
                }
                extensao = nome.substring(size);
            
            if(extensao.compareTo(".hm") == 0){
                disco = new Disco();
                ArrayList<String> ficheiro = new ArrayList();
                ficheiro = disco.open(fileChooser.getSelectedFile().getAbsolutePath());
                
                
                imagensPanel1.setLayout(new GridLayout(32, 32));
                for (int i = 1 ; i < ficheiro.size() ; i++) {
                    try {
                        Image image = ImageIO.read(new File(ficheiro.get(i)));
                        JLabel img = new JLabel();
                        ImageIcon icon = new ImageIcon(image);
                        img.setIcon(icon);
                        imagensPanel1.add(img);
                        searchOfflineField.setText(ficheiro.get(0));
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(this, "Ficheiro Danificado", "erro", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }
                this.validate(); 
            }else{
                JOptionPane.showMessageDialog(this, "Ficheiro não suportado", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void crawlFlagFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crawlFlagFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crawlFlagFilterActionPerformed

    private void imagesFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagesFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagesFilterActionPerformed

    private void videosFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_videosFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_videosFilterActionPerformed

    //Atualizar as imagens mostradas no JFrame
    public void attImagesPanel(WebScrape webScrape){
        imagensPanel.removeAll();
        jScrollPane1.updateUI();
        imagens = webScrape.getImagens();
        videos = webScrape.getVideos();
        imagensPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        imagensPanel.setPreferredSize(new Dimension(1000, 20000));
        //Mensagem de erro para nada encontrado 
        try{
            if(imagens.isEmpty() && videos.isEmpty()){
                JLabel error = new JLabel();
                ImageIcon icon = new ImageIcon(getClass().getResource("../images/noResults.png"));
                error.setIcon(icon);
                error.setText("Sem Resultados");
                imagensPanel.add(error);
                results = false;
            }else{
                results = true;
            }
        }catch(IndexOutOfBoundsException ex){
            
        }
        profundidade = webScrape.getProfundidade();
        contador = 0;
        for (String str: imagens) {
            try{
                URL url = new URL(str);
                BufferedImage image = ImageIO.read(url);
                BufferedImage resized = resizeImage(image);
                ImageIcon icon = new ImageIcon(resized);
                JLabel img = new JLabel("   |    Profundidade: " + profundidade.get(contador));
                img.setIcon(icon);
                imagensPanel.add(img);
                contador++;
                
            }catch(SocketTimeoutException ex){
                JOptionPane.showMessageDialog(this, "site não responde, verifique a sua conexão ou tente mais tarde", "erro", JOptionPane.ERROR_MESSAGE);
            }catch(MalformedURLException ex){
                
            }catch(IOException | NullPointerException ex){
                
            }
        }
        for(String str:videos){
            try{
                JLabel vid = new JLabel(str + "  |   Profundidade: " + profundidade.get(contador));
                imagensPanel.add(vid);
                contador++;
                
            }catch(NullPointerException ex){
                
            }
        }
    }
    
    public int calculatedWidth(BufferedImage img){
        int width = img.getWidth();
        if(width == 0)
            width++;
        int height = img.getHeight();
        if(height == 0)
            height++;
        int newWidth = 100*(width/height);
        return newWidth;
    }
    
    public BufferedImage resizeImage(BufferedImage originalImage){
        int calculatedWidth = calculatedWidth(originalImage);
        if(calculatedWidth(originalImage) == 0){
            calculatedWidth++;
        }
        Image resized = originalImage.getScaledInstance(calculatedWidth, 100, Image.SCALE_DEFAULT);
        BufferedImage outResized = new BufferedImage(calculatedWidth, 100, BufferedImage.TYPE_INT_ARGB);
        outResized.getGraphics().drawImage(resized, 0, 0, null);
        return outResized;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox crawlFlagFilter;
    private javax.swing.JPanel filterPanel;
    private javax.swing.JPanel homeLayout;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel imagensPanel;
    private javax.swing.JPanel imagensPanel1;
    private javax.swing.JCheckBox imagesFilter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel leftLayout;
    private javax.swing.JPanel offlineLayout;
    private javax.swing.JPanel other;
    private javax.swing.JPanel rigthLayout;
    private javax.swing.JLabel searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField searchOfflineField;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextField temaFilter;
    private javax.swing.JCheckBox videosFilter;
    // End of variables declaration//GEN-END:variables
}
