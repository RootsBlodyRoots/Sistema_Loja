package br.senai.sc.sisloj;

import br.senai.sc.sisloj.views.Cadastrocliente;
import java.sql.SQLException;
import javax.swing.JFrame;

public class SisLoj {

    public static void main(String[] args) throws SQLException {
      
        
        
         JFrame frame = new JFrame("Cadastro de cliente");
         Cadastrocliente Cadcli = new Cadastrocliente();
          
        
        frame.setSize(500, 500);
        frame.add(Cadcli);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
     
            
            
        }
    }
    
