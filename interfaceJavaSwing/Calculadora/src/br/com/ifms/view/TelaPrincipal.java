/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifms.view;

/**
 *
 * @author laboratorioa
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private double number1= 0;
    private double number2= 0;
    private double aux= 0;
    private int function = 0;
    private boolean enter= false;
    private boolean operador= false;
    private boolean umaVezPonto= false;
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jButton1.setText("Retrocesso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("C");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("CE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)))
        );

        jButton6.setText("7");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("8");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("9");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("/");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setText("4");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("5");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("6");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("*");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton16.setText("3");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("-");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton19.setText("2");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("1");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton3.setText("0");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton21.setText("+");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("=");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton24.setText(".");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton5.setText("+/-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20)
                    .addComponent(jButton19)
                    .addComponent(jButton16)
                    .addComponent(jButton17))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton21)
                    .addComponent(jButton24)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        aux=0;
        number1= 0;
        number2= 0;
        function=0;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String s= jTextField1.getText();
            if (s.length() > 0) {
                s = s.substring (0, s.length() - 1);
            }
            jTextField1.setText(s);
        }
        catch(Exception e){
            return;
        }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextField1.setHorizontalAlignment(jTextField1.RIGHT);
        operador= false;
        if (!jTextField1.getText().equals("0") && enter==false) {
            jTextField1.setText(jTextField1.getText() + 7);
        } else {
            jTextField1.setText("");
            jTextField1.setText(jTextField1.getText() + 7);
            enter=false;
        }
         //botao7
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextField1.setHorizontalAlignment(jTextField1.RIGHT);
        operador= false;
         if (!jTextField1.getText().equals("0") && enter==false) {
            jTextField1.setText(jTextField1.getText() + 8);
        } else {
            jTextField1.setText("");
            jTextField1.setText(jTextField1.getText() + 8);
            enter=false;
        }
        //botão8
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    	operador= false;
        jTextField1.setHorizontalAlignment(jTextField1.RIGHT);
         if (!jTextField1.getText().equals("0") && enter==false) {
            jTextField1.setText(jTextField1.getText() + 9);
        } else {
            jTextField1.setText("");
            jTextField1.setText(jTextField1.getText() + 9);
            enter=false;
        }
        //botão9
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
    	operador= true;
    	umaVezPonto= false;
        if(function!=0 && enter!=true){
        	try{
        		number2 = Double.parseDouble(jTextField1.getText());
        	}
        	catch(Exception e){
                    if(operador==true){
                        function=4;

                    }
                    return;
        	}
        	
	        if(function == 1){
	            aux+=number2;
	            jTextField1.setText(Double.toString(aux));
	        }
	        else if(function==2){
	            aux-=number2;
	            jTextField1.setText(Double.toString(aux));
	            
	        }
	        else if(function==3){
	            aux*=number2;
	            jTextField1.setText(Double.toString(aux));
	           	
	        }
	        else if(function==4){
	            aux/=number2;
	            jTextField1.setText(Double.toString(aux));
	           
	        }
	        function= 4;
	        enter= true;
	        
        }
        else if(function==0){
        	enter= false;
	        number1 = Double.parseDouble(jTextField1.getText());
                try{
                    number1 = Double.parseDouble(jTextField1.getText());
        	}
        	catch(Exception e){
        		return;
        	}
	        if(aux==0) aux= number1;
	        else aux/= number1;
	        jTextField1.setText("");
	        function= 4;
	}
	else if(function!=0 || enter==true){
            function= 4;
        }
        //divisão  
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    	operador= false;
        jTextField1.setHorizontalAlignment(jTextField1.RIGHT);
         if (!jTextField1.getText().equals("0") && enter==false) {
            jTextField1.setText(jTextField1.getText() + 4);
        } else {
            jTextField1.setText("");
            jTextField1.setText(jTextField1.getText() + 4);
            enter=false;
        }
        //botão4
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    	operador= false;
        jTextField1.setHorizontalAlignment(jTextField1.RIGHT);
         if (!jTextField1.getText().equals("0") && enter==false) {
            jTextField1.setText(jTextField1.getText() + 5);
        } else {
            jTextField1.setText("");
            jTextField1.setText(jTextField1.getText() + 5);
            enter=false;
        }
        //botão5
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    	operador= false;
        jTextField1.setHorizontalAlignment(jTextField1.RIGHT);
         if (!jTextField1.getText().equals("0") && enter==false) {
            jTextField1.setText(jTextField1.getText() + 6);
        } else {
            jTextField1.setText("");
            jTextField1.setText(jTextField1.getText() + 6);
            enter=false;
        }
        //botão6
    }//GEN-LAST:event_jButton13ActionPerformed

    private int e= 0;
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_jButton14ActionPerformed
        operador= true;
        umaVezPonto= false;
        
        if(function!=0 && enter!=true){
        	try{
        		number2 = Double.parseDouble(jTextField1.getText());
        	}
        	catch(Exception e){
                    if(operador==true){
                        function=3;

                    }
                    return;
        	}
        	
	        if(function == 1){
	            aux+=number2;
	            jTextField1.setText(Double.toString(aux));
	        }
	        else if(function==2){
	            aux-=number2;
	            jTextField1.setText(Double.toString(aux));
	            
	        }
	        else if(function==3){
	            aux*=number2;
	            jTextField1.setText(Double.toString(aux));
	           	
	        }
	        else if(function==4){
	            aux/=number2;
	            jTextField1.setText(Double.toString(aux));
	           
	        }
	        function= 3;
	        enter= true;
	        
        }
        else if(function==0){
        	enter= false;
	        try{
                    number1 = Double.parseDouble(jTextField1.getText());
        	}
        	catch(Exception e){
        		return;
        	}
	        if(aux==0) aux= number1;
	        else aux*= number1;
	        jTextField1.setText("");
	        function= 3;
	}
	else if(function!=0 || enter==true){
            function= 3;
        }
        
        //multiplicação  
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
    	operador= false;
        jTextField1.setHorizontalAlignment(jTextField1.RIGHT);
         if (!jTextField1.getText().equals("0") && enter==false) {
            jTextField1.setText(jTextField1.getText() + 3);
        } else {
            jTextField1.setText("");
            jTextField1.setText(jTextField1.getText() + 3);
            enter=false;
        }
        //botão3
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
    	operador= true;
    	umaVezPonto= false;
   
        if(function!=0 && enter!=true){
        	try{
                    number2 = Double.parseDouble(jTextField1.getText());
        	}
        	catch(Exception e){
                        
                    if(operador==true){
                        function=2;

                    }
                        
                    return;
        	}
        	
	        if(function == 1){
	            aux+=number2;
	            jTextField1.setText(Double.toString(aux));
	        }
	        else if(function==2){
	            aux-=number2;
	            jTextField1.setText(Double.toString(aux));
	            
	        }
	        else if(function==3){
	            aux*=number2;
	            jTextField1.setText(Double.toString(aux));
	           	
	        }
	        else if(function==4){
	            aux/=number2;
	            jTextField1.setText(Double.toString(aux));
	           
	        }
	        function= 2;
	        enter= true;
	        
        }
        else if(function==0){
        	enter= false;
	        try{
                    number1 = Double.parseDouble(jTextField1.getText());
        	}
        	catch(Exception e){
        		return;
        	}
	        if(aux==0) aux= number1;
	        else aux-= number1;
	        jTextField1.setText("");
	        function= 2;
	}
	else if(function!=0 || enter==true){
            function= 2;
        }
        
        if(operador==true){
            function=2;
            System.out.println(function);
        }
        
        //subtração  
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
    	operador= false;
        jTextField1.setHorizontalAlignment(jTextField1.RIGHT);
         if (!jTextField1.getText().equals("0") && enter==false) {
            jTextField1.setText(jTextField1.getText() + 2);
        } else {
            jTextField1.setText("");
            jTextField1.setText(jTextField1.getText() + 2);
            enter=false;
        }
        //botão2
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
    	operador= false;
        jTextField1.setHorizontalAlignment(jTextField1.RIGHT);
         if (!jTextField1.getText().equals("0") && enter==false) {
            jTextField1.setText(jTextField1.getText() + 1);
        } else {
            jTextField1.setText("");
            jTextField1.setText(jTextField1.getText() + 1);
            enter=false;
        }
        //botão1
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    	operador= false;
        jTextField1.setHorizontalAlignment(jTextField1.RIGHT);
         if (!jTextField1.getText().equals("0") && enter==false) {
            jTextField1.setText(jTextField1.getText() + 0);
        } else {
            jTextField1.setText("");
            jTextField1.setText(jTextField1.getText() + 0);
            enter=false;
        }
        //botao0
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        //soma
        operador= true;
        umaVezPonto= false;
        if(function!=0 && enter!=true){
        	try{
        		number2 = Double.parseDouble(jTextField1.getText());
        	}
        	catch(Exception e){
                    if(operador==true){
                        function=1;

                    }
                    return;
        	}
        	
	        if(function == 1){
	            aux+=number2;
	            jTextField1.setText(Double.toString(aux));
	        }
	        else if(function==2){
	            aux-=number2;
	            jTextField1.setText(Double.toString(aux));
	            
	        }
	        else if(function==3){
	            aux*=number2;
	            jTextField1.setText(Double.toString(aux));
	           	
	        }
	        else if(function==4){
	            aux/=number2;
	            jTextField1.setText(Double.toString(aux));
	           
	        }
	        function= 1;
	        enter= true;
	        
        }
        else if(function==0){
        	enter= false;
	        try{
                    number1 = Double.parseDouble(jTextField1.getText());
        	}
        	catch(Exception e){
        		return;
        	}
	        if(aux==0) aux= number1;
	        else aux+= number1;
	        jTextField1.setText("");
	        function= 1;
	}
	else if(function!=0 || enter==true){
            function= 1;
        }
        //adicao   
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        enter= true;
        
        try{
            number2 = Double.parseDouble(jTextField1.getText());
        }
        catch(Exception e){
            return;
        }
        
        if(operador!=true){
	        if(function == 1){
	            aux+=number2;
	            jTextField1.setText(Double.toString(aux));
	            aux=0;
	        }
	        else if(function==2){
	            aux-=number2;
	            jTextField1.setText(Double.toString(aux));
	            aux=0;
	        }
	        else if(function==3){
	            aux*=number2;
	            jTextField1.setText(Double.toString(aux));
	            aux=0;
	        }
	        else if(function==4){
	            aux/=number2;
	            jTextField1.setText(Double.toString(aux));
	            aux=0;
	        }
	        
	    }

	    aux=0;
		umaVezPonto= false;
	    function=0;
    
        //enter
    }//GEN-LAST:event_jButton22ActionPerformed

   
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
  
   
        jTextField1.setHorizontalAlignment(jTextField1.RIGHT);
        if (!jTextField1.getText().equals("0") && umaVezPonto==false && enter==false) {
            jTextField1.setText(jTextField1.getText() + ".");
            umaVezPonto= true;
        }
        else if (!jTextField1.getText().equals("0") && umaVezPonto==false && operador==false && enter==false) {
            jTextField1.setText(jTextField1.getText() + ".");
            umaVezPonto= true;
        }
        else if(jTextField1.getText().equals("0")){
            jTextField1.setText(jTextField1.getText() + ".");
            umaVezPonto= true;
        }
    
         //botao.
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         if(!jTextField1.getText().equals("0")){
	        try{
                    number1 = Double.parseDouble(jTextField1.getText());
        	}
        	catch(Exception e){
        		return;
        	}
	       
                number1= -1*number1;
	        jTextField1.setText(" "+number1);
	       
	    }
	   
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}