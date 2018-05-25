/* Jiayin Xie(Jason) May 24th, 2018 ICS3U
 * This program allows user to enter a series of scores, and sort it at ascending
 * sequence, and find the maximum, minimum, range, average, and the numbers of students
 * each levels.
 */

package U3A6_Marks;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jixie2824
 */
public class U3A6_MarksFrame extends javax.swing.JFrame {

    /**
     * Creates new form U3A6_MarksFrame
     */
    ArrayList <Integer> mark = new ArrayList();
    
    public int findMaximum(){             //method that finds the highest score
        Collections.sort(mark);
        int m=mark.get(mark.size()-1);
        return m;
    }
    
    public int findMinimum(){             //method that finds the lowest score
        Collections.sort(mark);
        int m=mark.get(0);
        return m;
    }
    
    public double findAverage(){          //method that finds the average
        double average=0;
        for (int i = 0; i<=mark.size()-1; i++)
        {
            average+=mark.get(i);
        }
        average=average/mark.size();
        
        DecimalFormat a = new DecimalFormat("###.##");;//round up the result to hundreth
        average=Double.parseDouble(a.format(average));
        
        return average;
    }
    
    public int findLevelR(){     //method that finds the number of students at level R
        ArrayList <Integer> LR = new ArrayList();
        
        for(int i = 0; i < mark.size(); i++){
            if(mark.get(i)<50){
                LR.add(mark.get(i));
            }
        }
        return LR.size();
    }
    
    public int findLevel1(){     //method that finds the number of students at level 1
        ArrayList <Integer> L1 = new ArrayList();


        for(int i = 0; i < mark.size(); i++){
            if(mark.get(i)<60&&mark.get(i)>=50){
                L1.add(mark.get(i));
            }
        }
        return L1.size();
    }
    
    public int findLevel2(){     //method that finds the number of students at level 2
        ArrayList <Integer> L2 = new ArrayList();
        
        for(int i = 0; i < mark.size(); i++){
            if(mark.get(i)<70&&mark.get(i)>=60){
                L2.add(mark.get(i));
            }
        }
        return L2.size();
    }
    
    public int findLevel3(){     //method that finds the number of students at level 3
        ArrayList <Integer> L3 = new ArrayList();

        for(int i = 0; i < mark.size(); i++){
            if(mark.get(i)<80&&mark.get(i)>=70){
                L3.add(mark.get(i));
            }
        }
        return L3.size();
    }
    
    public int findLevel4(){     //method that finds the number of students at level 4
        ArrayList <Integer> L4 = new ArrayList();
        
        for(int i = 0; i < mark.size(); i++){
            if(mark.get(i)>=80){
                L4.add(mark.get(i));
            }
        }
        return L4.size();
    }
    
    public U3A6_MarksFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        markIn = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        markListOut = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        analysisOut = new javax.swing.JTextArea();
        Sort = new javax.swing.JButton();
        Analyze = new javax.swing.JButton();
        hintLabel = new javax.swing.JLabel();
        Initialize = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Mark Program");

        jLabel2.setText("Student Mark");

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBar(null);

        markListOut.setEditable(false);
        markListOut.setColumns(20);
        markListOut.setRows(5);
        jScrollPane2.setViewportView(markListOut);

        analysisOut.setEditable(false);
        analysisOut.setColumns(20);
        analysisOut.setRows(5);
        jScrollPane3.setViewportView(analysisOut);

        Sort.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Sort.setText("Sort");
        Sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortActionPerformed(evt);
            }
        });

        Analyze.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Analyze.setText("Analyze");
        Analyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalyzeActionPerformed(evt);
            }
        });

        hintLabel.setForeground(new java.awt.Color(255, 0, 0));

        Initialize.setBackground(new java.awt.Color(255, 102, 102));
        Initialize.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Initialize.setForeground(new java.awt.Color(153, 0, 0));
        Initialize.setText("Initialize");
        Initialize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InitializeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(markIn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(Add))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(hintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(Sort)
                        .addGap(53, 53, 53)
                        .addComponent(Analyze)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Initialize)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(markIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(hintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sort)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Initialize)
                        .addComponent(Analyze))))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortActionPerformed
        Collections.sort(mark); //sort the entered value by ascending sequence
        String outputString="";
        
        for (int i = 0; i < mark.size();  i++)  {
              outputString+=mark.get(i)+" \n";
        }  
        markListOut.setText(outputString);
    }//GEN-LAST:event_SortActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        int m;         //add the number from input box(between 0 and 100)into the arraylist for further calculations
        m=Integer.parseInt(markIn.getText());
        if(m<=100&&m>=0)
            {
                mark.add(m); 
                hintLabel.setText("");
            }
            else
            {
                hintLabel.setText("Please enter scores within 1-100");
            }
        

        markIn.setText("");
    }//GEN-LAST:event_AddActionPerformed

    private void AnalyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalyzeActionPerformed
        double average=findAverage(); 
        int max=findMaximum(); //find max, min, avg, and num of students at each levels.
        int min=findMinimum();
        int range=max-min;
        int LRnum = findLevelR();
        int L1num = findLevel1();
        int L2num = findLevel2();
        int L3num = findLevel3();
        int L4num = findLevel4();
        
        
        
        
        
        analysisOut.setText("average = "+average+"\nMaximum = "+max
            +"\nMinimum = "+min+"\nRange = "+range+"\n\nNumber of each levels\nLR = "+LRnum
            +"\nL1 = "+L1num+"\nL2 = "+L2num+"\nL3 = "+L3num+"\nL4 = "+L4num);
        
        
    }//GEN-LAST:event_AnalyzeActionPerformed

    private void InitializeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InitializeActionPerformed
        mark.clear(); //clear the arraylist.
        analysisOut.setText(""); //clear the output box on the right.
        markListOut.setText(""); //clear the output box on the left.
    }//GEN-LAST:event_InitializeActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(U3A6_MarksFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(U3A6_MarksFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(U3A6_MarksFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(U3A6_MarksFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new U3A6_MarksFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Analyze;
    private javax.swing.JButton Initialize;
    private javax.swing.JButton Sort;
    private javax.swing.JTextArea analysisOut;
    private javax.swing.JLabel hintLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField markIn;
    private javax.swing.JTextArea markListOut;
    // End of variables declaration//GEN-END:variables
}
