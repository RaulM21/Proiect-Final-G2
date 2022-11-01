import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class ReclamatiiForm extends MainWindow {
    private JPanel panelRec;
    private JTextArea textArea1;
    private JButton adaugaReclamatieBut;
    private JLabel lblReclamatii;

    public ReclamatiiForm(){

        adaugaReclamatieBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textRec = textArea1.getText();
                if (!textRec.isEmpty()) {
                    try
                    {
                        FileWriter f = new FileWriter("Reclamatii.txt");       // scriere in fisierul "Reclamatii.txt"
                        f.append(textRec);
                        f.close();
                    }
                    catch (Exception ex)
                    {
                        System.out.println(ex);
                    }
                    lblReclamatii.setText("Reclamatie introdusa cu succes.");
                }
                else lblReclamatii.setText("Campul nu poate fi gol.");

                System.out.println("Scris cu succes.");
            }
        });
    }
    void setVisible()
    {
        JFrame frame2= new JFrame("Reclamatii");
        frame2.setContentPane(new ReclamatiiForm().panelRec);
        frame2.pack();
        frame2.setSize(500,250);
        frame2.setVisible(true);
    }


}
