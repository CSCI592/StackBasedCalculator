/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shayimsh
 */
public class calcFrame extends javax.swing.JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String exp = "";
    
    /**
     * Creates new form calcFrame
     */
    public calcFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        screen = new javax.swing.JTextArea();
        clearB = new javax.swing.JButton();
        sevenB = new javax.swing.JButton();
        oneB = new javax.swing.JButton();
        fourB = new javax.swing.JButton();
        zeroB = new javax.swing.JButton();
        powerB = new javax.swing.JButton();
        eightB = new javax.swing.JButton();
        fiveB = new javax.swing.JButton();
        twoB = new javax.swing.JButton();
        disB = new javax.swing.JButton();
        openParB = new javax.swing.JButton();
        nineB = new javax.swing.JButton();
        sixB = new javax.swing.JButton();
        threeB = new javax.swing.JButton();
        closeParB = new javax.swing.JButton();
        divB = new javax.swing.JButton();
        multB = new javax.swing.JButton();
        subtB = new javax.swing.JButton();
        addB = new javax.swing.JButton();
        equalB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        screen.setColumns(20);
        screen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        screen.setRows(1);
        screen.setTabSize(1);
        screen.setText("0");
        screen.setToolTipText("");
        jScrollPane1.setViewportView(screen);

        clearB.setText("<--");
        clearB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        clearB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clearB.setPreferredSize(new java.awt.Dimension(82, 40));
        clearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBActionPerformed(evt);
            }
        });

        sevenB.setText("7");
        sevenB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        sevenB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sevenB.setPreferredSize(new java.awt.Dimension(82, 40));
        sevenB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBActionPerformed(evt);
            }
        });

        oneB.setText("1");
        oneB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        oneB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        oneB.setPreferredSize(new java.awt.Dimension(82, 40));
        oneB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBActionPerformed(evt);
            }
        });

        fourB.setText("4");
        fourB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        fourB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fourB.setPreferredSize(new java.awt.Dimension(82, 40));
        fourB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBActionPerformed(evt);
            }
        });

        zeroB.setText("0");
        zeroB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        zeroB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        zeroB.setPreferredSize(new java.awt.Dimension(82, 40));
        zeroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBActionPerformed(evt);
            }
        });

        powerB.setText("^");
        powerB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        powerB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        powerB.setPreferredSize(new java.awt.Dimension(82, 40));
        powerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerBActionPerformed(evt);
            }
        });

        eightB.setText("8");
        eightB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        eightB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eightB.setPreferredSize(new java.awt.Dimension(82, 40));
        eightB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBActionPerformed(evt);
            }
        });

        fiveB.setText("5");
        fiveB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        fiveB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fiveB.setPreferredSize(new java.awt.Dimension(82, 40));
        fiveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBActionPerformed(evt);
            }
        });

        twoB.setText("2");
        twoB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        twoB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        twoB.setPreferredSize(new java.awt.Dimension(82, 40));
        twoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBActionPerformed(evt);
            }
        });

        disB.setText(".");
        disB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        disB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        disB.setPreferredSize(new java.awt.Dimension(82, 40));
        disB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disBActionPerformed(evt);
            }
        });

        openParB.setText("(");
        openParB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        openParB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        openParB.setPreferredSize(new java.awt.Dimension(82, 40));
        openParB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openParBActionPerformed(evt);
            }
        });

        nineB.setText("9");
        nineB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        nineB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nineB.setPreferredSize(new java.awt.Dimension(82, 40));
        nineB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBActionPerformed(evt);
            }
        });

        sixB.setText("6");
        sixB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        sixB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sixB.setPreferredSize(new java.awt.Dimension(82, 40));
        sixB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBActionPerformed(evt);
            }
        });

        threeB.setText("3");
        threeB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        threeB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        threeB.setPreferredSize(new java.awt.Dimension(82, 40));
        threeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBActionPerformed(evt);
            }
        });

        closeParB.setText(")");
        closeParB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        closeParB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        closeParB.setPreferredSize(new java.awt.Dimension(82, 40));
        closeParB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeParBActionPerformed(evt);
            }
        });

        divB.setText("/");
        divB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        divB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        divB.setPreferredSize(new java.awt.Dimension(82, 40));
        divB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divBActionPerformed(evt);
            }
        });

        multB.setText("*");
        multB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        multB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multB.setPreferredSize(new java.awt.Dimension(82, 40));
        multB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multBActionPerformed(evt);
            } 
        });

        subtB.setText("-");
        subtB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        subtB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subtB.setPreferredSize(new java.awt.Dimension(82, 40));
        subtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtBActionPerformed(evt);
            }
        });

        addB.setText("+");
        addB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        addB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addB.setPreferredSize(new java.awt.Dimension(82, 40));
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });

        equalB.setText("=");
        equalB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        equalB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        equalB.setPreferredSize(new java.awt.Dimension(82, 40));
        equalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(clearB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(powerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openParB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sevenB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eightB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nineB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(oneB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fourB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sixB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(zeroB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(equalB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeParB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(powerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(openParB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sevenB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eightB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nineB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fourB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiveB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sixB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oneB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(threeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zeroB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(disB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(closeParB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equalB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

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
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void subtBActionPerformed(java.awt.event.ActionEvent evt) {                                      
       exp += subtB.getText();
    screen.setText(exp); // TODO add your handling code here:
    }                                     

    private void closeParBActionPerformed(java.awt.event.ActionEvent evt) {                                          
       exp += closeParB.getText();
    screen.setText(exp); // TODO add your handling code here:
    }                                         

    private void openParBActionPerformed(java.awt.event.ActionEvent evt) {                                         
       exp += openParB.getText();
    screen.setText(exp);  // TODO add your handling code here:
    }                                        

    private void eightBActionPerformed(java.awt.event.ActionEvent evt) {                                       
      exp += eightB.getText();
    screen.setText(exp);   // TODO add your handling code here:
    }                                      

    private void sevenBActionPerformed(java.awt.event.ActionEvent evt) {                                       
       exp += sevenB.getText();
    screen.setText(exp);  // TODO add your handling code here:
    }                                      

    private void clearBActionPerformed(java.awt.event.ActionEvent evt) {                                       
      exp="";
     screen.setText(exp); // TODO add your handling code here:
    }                                      

    private void zeroBActionPerformed(java.awt.event.ActionEvent evt) {                                      
    exp += zeroB.getText();
    screen.setText(exp);    // TODO add your handling code here:
    }                                     

    private void powerBActionPerformed(java.awt.event.ActionEvent evt) {                                       
exp += powerB.getText();
    screen.setText(exp);        // TODO add your handling code here:
    }                                      

    private void nineBActionPerformed(java.awt.event.ActionEvent evt) {                                      
exp += nineB.getText();
    screen.setText(exp);        // TODO add your handling code here:
    }                                     

    private void fourBActionPerformed(java.awt.event.ActionEvent evt) {                                      
exp += fourB.getText();
    screen.setText(exp);        // TODO add your handling code here:
    }                                     

    private void fiveBActionPerformed(java.awt.event.ActionEvent evt) {                                      
exp += fiveB.getText();
    screen.setText(exp);        // TODO add your handling code here:
    }                                     

    private void sixBActionPerformed(java.awt.event.ActionEvent evt) {                                     
exp += sixB.getText();
    screen.setText(exp);        // TODO add your handling code here:
    }                                    

    private void oneBActionPerformed(java.awt.event.ActionEvent evt) {                                     
exp += oneB.getText();
    screen.setText(exp);        // TODO add your handling code here:
    }                                    

    private void twoBActionPerformed(java.awt.event.ActionEvent evt) {                                     
exp += twoB.getText();
    screen.setText(exp);        // TODO add your handling code here:
    }                                    

    private void threeBActionPerformed(java.awt.event.ActionEvent evt) {                                       
exp += threeB.getText();
    screen.setText(exp);        // TODO add your handling code here:
    }                                      

    private void divBActionPerformed(java.awt.event.ActionEvent evt) {                                     
exp += divB.getText();
    screen.setText(exp);        // TODO add your handling code here:
    }                                    

    private void multBActionPerformed(java.awt.event.ActionEvent evt) {                                      
exp += multB.getText();
    screen.setText(exp);        // TODO add your handling code here:
    }                                     

    private void addBActionPerformed(java.awt.event.ActionEvent evt) {                                     
exp += addB.getText();
    screen.setText(exp);        // TODO add your handling code here:
    }                                    

    private void equalBActionPerformed(java.awt.event.ActionEvent evt) {       
     try{
       Object result = evaluate.evaluatePostfix(infix2postfix.infixToPostFix(exp));  
       if (result == null)
       screen.setText("Invalid Expression");                      
        else 
        screen.setText(Double.toString((double) result)); } 
        catch (Exception e) {
            screen.setText("Invalid Expression");
        }
     
//exp = ""; // TODO add your handling code here:
    }                                      

    private void disBActionPerformed(java.awt.event.ActionEvent evt) {                                     
exp += disB.getText();
    screen.setText(exp);        // TODO add your handling code here:
    }                                    

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
            java.util.logging.Logger.getLogger(calcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calcFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addB;
    private javax.swing.JButton clearB;
    private javax.swing.JButton closeParB;
    private javax.swing.JButton disB;
    private javax.swing.JButton divB;
    private javax.swing.JButton eightB;
    private javax.swing.JButton equalB;
    private javax.swing.JButton fiveB;
    private javax.swing.JButton fourB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton multB;
    private javax.swing.JButton nineB;
    private javax.swing.JButton oneB;
    private javax.swing.JButton openParB;
    private javax.swing.JButton powerB;
    private javax.swing.JTextArea screen;
    private javax.swing.JButton sevenB;
    private javax.swing.JButton sixB;
    private javax.swing.JButton subtB;
    private javax.swing.JButton threeB;
    private javax.swing.JButton twoB;
    private javax.swing.JButton zeroB;
    // End of variables declaration                   
}
