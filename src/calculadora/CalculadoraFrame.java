/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * @author Gabriela
 */
public class CalculadoraFrame extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraFrame
     */
    public CalculadoraFrame() {
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

        CalculadoraDisplay = new javax.swing.JTextField();
        Botao1 = new javax.swing.JButton();
        Botao4 = new javax.swing.JButton();
        Botao7 = new javax.swing.JButton();
        BotaoCE = new javax.swing.JButton();
        Botao2 = new javax.swing.JButton();
        Botao5 = new javax.swing.JButton();
        Botao8 = new javax.swing.JButton();
        Botao0 = new javax.swing.JButton();
        Botao3 = new javax.swing.JButton();
        Botao6 = new javax.swing.JButton();
        Botao9 = new javax.swing.JButton();
        BotaoIgual = new javax.swing.JButton();
        BotaoMais = new javax.swing.JButton();
        BotaoMenos = new javax.swing.JButton();
        BotaoMult = new javax.swing.JButton();
        BotaoDiv = new javax.swing.JButton();
        BotaoBack = new javax.swing.JButton();
        BotaoSinal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Botao1.setText("1");
        Botao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao1MouseClicked(evt);
            }
        });
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1ActionPerformed(evt);
            }
        });

        Botao4.setText("4");
        Botao4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao4MouseClicked(evt);
            }
        });
        Botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao4ActionPerformed(evt);
            }
        });

        Botao7.setText("7");
        Botao7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao7MouseClicked(evt);
            }
        });
        Botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao7ActionPerformed(evt);
            }
        });

        BotaoCE.setText("CE");
        BotaoCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoCEMouseClicked(evt);
            }
        });
        BotaoCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCEActionPerformed(evt);
            }
        });

        Botao2.setText("2");
        Botao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao2MouseClicked(evt);
            }
        });
        Botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2ActionPerformed(evt);
            }
        });

        Botao5.setText("5");
        Botao5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao5MouseClicked(evt);
            }
        });
        Botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao5ActionPerformed(evt);
            }
        });

        Botao8.setText("8");
        Botao8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao8MouseClicked(evt);
            }
        });
        Botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao8ActionPerformed(evt);
            }
        });

        Botao0.setText("0");
        Botao0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao0MouseClicked(evt);
            }
        });
        Botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao0ActionPerformed(evt);
            }
        });

        Botao3.setText("3");
        Botao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao3MouseClicked(evt);
            }
        });
        Botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao3ActionPerformed(evt);
            }
        });

        Botao6.setText("6");
        Botao6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao6MouseClicked(evt);
            }
        });
        Botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao6ActionPerformed(evt);
            }
        });

        Botao9.setText("9");
        Botao9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao9MouseClicked(evt);
            }
        });
        Botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao9ActionPerformed(evt);
            }
        });

        BotaoIgual.setText("=");
        BotaoIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoIgualMouseClicked(evt);
            }
        });
        BotaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIgualActionPerformed(evt);
            }
        });

        BotaoMais.setText("+");
        BotaoMais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoMaisMouseClicked(evt);
            }
        });
        BotaoMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMaisActionPerformed(evt);
            }
        });

        BotaoMenos.setText("-");
        BotaoMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoMenosMouseClicked(evt);
            }
        });
        BotaoMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMenosActionPerformed(evt);
            }
        });

        BotaoMult.setText("*");
        BotaoMult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoMultMouseClicked(evt);
            }
        });
        BotaoMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMultActionPerformed(evt);
            }
        });

        BotaoDiv.setText("/");
        BotaoDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoDivMouseClicked(evt);
            }
        });
        BotaoDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDivActionPerformed(evt);
            }
        });

        BotaoBack.setText("<--");
        BotaoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoBackMouseClicked(evt);
            }
        });
        BotaoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBackActionPerformed(evt);
            }
        });

        BotaoSinal.setText("+/-");
        BotaoSinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoSinalMouseClicked(evt);
            }
        });
        BotaoSinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CalculadoraDisplay)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Botao4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Botao7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Botao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Botao5)
                                    .addComponent(Botao8)
                                    .addComponent(Botao2)))
                            .addComponent(Botao0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoIgual))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoMult, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoMais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BotaoSinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotaoBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CalculadoraDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Botao7)
                            .addComponent(Botao8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Botao4)
                            .addComponent(Botao5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(Botao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Botao2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Botao0)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Botao9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoIgual))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoDiv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoMult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoMenos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoMais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoSinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao1ActionPerformed

    private void Botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao4ActionPerformed

    private void Botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao7ActionPerformed

    private void BotaoCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCEActionPerformed

    private void Botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao2ActionPerformed

    private void Botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao5ActionPerformed

    private void Botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao8ActionPerformed

    private void Botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao0ActionPerformed

    private void Botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao3ActionPerformed

    private void Botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao6ActionPerformed

    private void Botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao9ActionPerformed

    private void BotaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIgualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoIgualActionPerformed

    private void BotaoMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoMaisActionPerformed

    private void BotaoMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoMenosActionPerformed

    private void BotaoMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoMultActionPerformed

    private void BotaoDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoDivActionPerformed
  
    private void BotaoCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCEMouseClicked
        CalculadoraDisplay.setText("");
    }//GEN-LAST:event_BotaoCEMouseClicked

    private void Botao0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao0MouseClicked
        String valor = CalculadoraDisplay.getText();
        CalculadoraDisplay.setText(valor + "0");
    }//GEN-LAST:event_Botao0MouseClicked

    private void Botao1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao1MouseClicked
        String valor = CalculadoraDisplay.getText();
        CalculadoraDisplay.setText(valor + "1");
    }//GEN-LAST:event_Botao1MouseClicked

    private void Botao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao2MouseClicked
        String valor = CalculadoraDisplay.getText();
        CalculadoraDisplay.setText(valor + "2");
    }//GEN-LAST:event_Botao2MouseClicked

    private void Botao3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao3MouseClicked
        String valor = CalculadoraDisplay.getText();
        CalculadoraDisplay.setText(valor + "3");
    }//GEN-LAST:event_Botao3MouseClicked

    private void Botao4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao4MouseClicked
        String valor = CalculadoraDisplay.getText();
        CalculadoraDisplay.setText(valor + "4");
    }//GEN-LAST:event_Botao4MouseClicked

    private void Botao5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao5MouseClicked
        String valor = CalculadoraDisplay.getText();
        CalculadoraDisplay.setText(valor + "5");
    }//GEN-LAST:event_Botao5MouseClicked

    private void Botao6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao6MouseClicked
        String valor = CalculadoraDisplay.getText();
        CalculadoraDisplay.setText(valor + "6");
    }//GEN-LAST:event_Botao6MouseClicked

    private void Botao7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao7MouseClicked
        String valor = CalculadoraDisplay.getText();
        CalculadoraDisplay.setText(valor + "7");
    }//GEN-LAST:event_Botao7MouseClicked

    private void Botao8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao8MouseClicked
        String valor = CalculadoraDisplay.getText();
        CalculadoraDisplay.setText(valor + "8");
    }//GEN-LAST:event_Botao8MouseClicked

    private void Botao9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao9MouseClicked
        String valor = CalculadoraDisplay.getText();
        CalculadoraDisplay.setText(valor + "9");
    }//GEN-LAST:event_Botao9MouseClicked

    private void BotaoMaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoMaisMouseClicked
        String valor = CalculadoraDisplay.getText();
        Calculadora c = new Calculadora();
        for(int i = 0; i <= valor.length() - 1; i++){
            if (valor.charAt(i) == '+' || valor.charAt(i) == '-' || valor.charAt(i) == '*' || valor.charAt(i) == '/')
                c.binaryOperation(valor.charAt(i));
            else if (valor.charAt(i) == '0' || valor.charAt(i) == '1' || valor.charAt(i) == '2' || valor.charAt(i) == '3' || valor.charAt(i) == '4' || valor.charAt(i) == '5' || valor.charAt(i) == '6' || valor.charAt(i) == '7' || valor.charAt(i) == '8' || valor.charAt(i) == '9')
                switch (valor.charAt(i)){
                    case '0':
                        c.digit(0);
                        break;
                    case '1':
                        c.digit(1);
                        break;
                    case '2':
                        c.digit(2);
                        break;
                    case '3':
                        c.digit(3);
                        break;
                    case '4':
                        c.digit(4);
                        break;
                    case '5':
                        c.digit(5);
                        break;
                    case '6':
                        c.digit(6);
                        break;
                    case '7':
                        c.digit(7);
                        break;
                    case '8':
                        c.digit(8);
                        break;
                    case '9':
                        c.digit(9);
                        break;
                    default:
                        break;
                }
        }
        c.compute();
        
        CalculadoraDisplay.setText("" + c.display());
        valor = CalculadoraDisplay.getText();
        CalculadoraDisplay.setText(valor + "+");
    }//GEN-LAST:event_BotaoMaisMouseClicked

    private void BotaoMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoMenosMouseClicked
        String valor = CalculadoraDisplay.getText();
        Calculadora c = new Calculadora();
        for(int i = 0; i <= valor.length() - 1; i++){
            if (valor.charAt(i) == '+' || valor.charAt(i) == '-' || valor.charAt(i) == '*' || valor.charAt(i) == '/')
                c.binaryOperation(valor.charAt(i));
            else if (valor.charAt(i) == '0' || valor.charAt(i) == '1' || valor.charAt(i) == '2' || valor.charAt(i) == '3' || valor.charAt(i) == '4' || valor.charAt(i) == '5' || valor.charAt(i) == '6' || valor.charAt(i) == '7' || valor.charAt(i) == '8' || valor.charAt(i) == '9')
                switch (valor.charAt(i)){
                    case '0':
                        c.digit(0);
                        break;
                    case '1':
                        c.digit(1);
                        break;
                    case '2':
                        c.digit(2);
                        break;
                    case '3':
                        c.digit(3);
                        break;
                    case '4':
                        c.digit(4);
                        break;
                    case '5':
                        c.digit(5);
                        break;
                    case '6':
                        c.digit(6);
                        break;
                    case '7':
                        c.digit(7);
                        break;
                    case '8':
                        c.digit(8);
                        break;
                    case '9':
                        c.digit(9);
                        break;
                    default:
                        break;
                }
        }
        c.compute();
        
        CalculadoraDisplay.setText("" + c.display());
        valor = CalculadoraDisplay.getText();
        CalculadoraDisplay.setText(valor + "-");
    }//GEN-LAST:event_BotaoMenosMouseClicked

    private void BotaoMultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoMultMouseClicked
        String valor = CalculadoraDisplay.getText();
        Calculadora c = new Calculadora();
        for(int i = 0; i <= valor.length() - 1; i++){
            if (valor.charAt(i) == '+' || valor.charAt(i) == '-' || valor.charAt(i) == '*' || valor.charAt(i) == '/')
                c.binaryOperation(valor.charAt(i));
            else if (valor.charAt(i) == '0' || valor.charAt(i) == '1' || valor.charAt(i) == '2' || valor.charAt(i) == '3' || valor.charAt(i) == '4' || valor.charAt(i) == '5' || valor.charAt(i) == '6' || valor.charAt(i) == '7' || valor.charAt(i) == '8' || valor.charAt(i) == '9')
                switch (valor.charAt(i)){
                    case '0':
                        c.digit(0);
                        break;
                    case '1':
                        c.digit(1);
                        break;
                    case '2':
                        c.digit(2);
                        break;
                    case '3':
                        c.digit(3);
                        break;
                    case '4':
                        c.digit(4);
                        break;
                    case '5':
                        c.digit(5);
                        break;
                    case '6':
                        c.digit(6);
                        break;
                    case '7':
                        c.digit(7);
                        break;
                    case '8':
                        c.digit(8);
                        break;
                    case '9':
                        c.digit(9);
                        break;
                    default:
                        break;
                }
        }
        c.compute();
        
        CalculadoraDisplay.setText("" + c.display());
        valor = CalculadoraDisplay.getText();
        CalculadoraDisplay.setText(valor + "*");
    }//GEN-LAST:event_BotaoMultMouseClicked

    private void BotaoDivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoDivMouseClicked
        String valor = CalculadoraDisplay.getText();
        Calculadora c = new Calculadora();
        for(int i = 0; i <= valor.length() - 1; i++){
            if (valor.charAt(i) == '+' || valor.charAt(i) == '-' || valor.charAt(i) == '*' || valor.charAt(i) == '/')
                c.binaryOperation(valor.charAt(i));
            else if (valor.charAt(i) == '0' || valor.charAt(i) == '1' || valor.charAt(i) == '2' || valor.charAt(i) == '3' || valor.charAt(i) == '4' || valor.charAt(i) == '5' || valor.charAt(i) == '6' || valor.charAt(i) == '7' || valor.charAt(i) == '8' || valor.charAt(i) == '9')
                switch (valor.charAt(i)){
                    case '0':
                        c.digit(0);
                        break;
                    case '1':
                        c.digit(1);
                        break;
                    case '2':
                        c.digit(2);
                        break;
                    case '3':
                        c.digit(3);
                        break;
                    case '4':
                        c.digit(4);
                        break;
                    case '5':
                        c.digit(5);
                        break;
                    case '6':
                        c.digit(6);
                        break;
                    case '7':
                        c.digit(7);
                        break;
                    case '8':
                        c.digit(8);
                        break;
                    case '9':
                        c.digit(9);
                        break;
                    default:
                        break;
                }
        }
        c.compute();
        
        CalculadoraDisplay.setText("" + c.display());
        valor = CalculadoraDisplay.getText();
        CalculadoraDisplay.setText(valor + "/");
    }//GEN-LAST:event_BotaoDivMouseClicked

    private void BotaoIgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoIgualMouseClicked
        String valor = CalculadoraDisplay.getText();
        Calculadora c = new Calculadora();
        for(int i = 0; i <= valor.length() - 1; i++){
            if (valor.charAt(i) == '+' || valor.charAt(i) == '-' || valor.charAt(i) == '*' || valor.charAt(i) == '/')
                c.binaryOperation(valor.charAt(i));
            else if (valor.charAt(i) == '0' || valor.charAt(i) == '1' || valor.charAt(i) == '2' || valor.charAt(i) == '3' || valor.charAt(i) == '4' || valor.charAt(i) == '5' || valor.charAt(i) == '6' || valor.charAt(i) == '7' || valor.charAt(i) == '8' || valor.charAt(i) == '9')
                switch (valor.charAt(i)){
                    case '0':
                        c.digit(0);
                        break;
                    case '1':
                        c.digit(1);
                        break;
                    case '2':
                        c.digit(2);
                        break;
                    case '3':
                        c.digit(3);
                        break;
                    case '4':
                        c.digit(4);
                        break;
                    case '5':
                        c.digit(5);
                        break;
                    case '6':
                        c.digit(6);
                        break;
                    case '7':
                        c.digit(7);
                        break;
                    case '8':
                        c.digit(8);
                        break;
                    case '9':
                        c.digit(9);
                        break;
                    default:
                        break;
                }
        }
        c.compute();
        
        CalculadoraDisplay.setText("" + c.display());
    }//GEN-LAST:event_BotaoIgualMouseClicked

    private void BotaoSinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSinalActionPerformed

    private void BotaoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoBackActionPerformed

    private void BotaoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoBackMouseClicked
        String valor = CalculadoraDisplay.getText();
        valor = valor.substring(0, valor.length() - 1);
        CalculadoraDisplay.setText(valor);
    }//GEN-LAST:event_BotaoBackMouseClicked

    private void BotaoSinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSinalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSinalMouseClicked

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
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao0;
    private javax.swing.JButton Botao1;
    private javax.swing.JButton Botao2;
    private javax.swing.JButton Botao3;
    private javax.swing.JButton Botao4;
    private javax.swing.JButton Botao5;
    private javax.swing.JButton Botao6;
    private javax.swing.JButton Botao7;
    private javax.swing.JButton Botao8;
    private javax.swing.JButton Botao9;
    private javax.swing.JButton BotaoBack;
    private javax.swing.JButton BotaoCE;
    private javax.swing.JButton BotaoDiv;
    private javax.swing.JButton BotaoIgual;
    private javax.swing.JButton BotaoMais;
    private javax.swing.JButton BotaoMenos;
    private javax.swing.JButton BotaoMult;
    private javax.swing.JButton BotaoSinal;
    private javax.swing.JTextField CalculadoraDisplay;
    // End of variables declaration//GEN-END:variables
}
