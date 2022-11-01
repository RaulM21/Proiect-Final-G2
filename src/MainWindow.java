import BuyLaptop.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainWindow
{
    private final int intrari = 3;
    private final int intrari_email = 1;
    private int contor = 1;
    private int contor_email = 1;
    private ArrayList<Laptop> laptop;
    private ArrayList<String> email;
    private JTextField txtProcesor;
    private JTextField txtVideo;
    private JTextField txtRam;
    private JButton btnAdauga;
    private JLabel lblMesaj;
    private JList lstLaptop;
    private JPanel panel;
    private JLabel lblProcesor;
    private JLabel lblVideo;
    private JLabel lblRam;
    private JButton btnConfig;
    private JButton btnEmail;
    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblConfig;
    private JLabel lblEmailConfirm;
    private JButton btnContact;
    private JLabel lblContact;
    private JButton btnCauta;
    private JLabel lblCauta;
    private JTextField txtCauta;
    private JLabel lblCautaConfirm;
    private JLabel lblSpatiere;

    public MainWindow()
    {
        laptop = new ArrayList<Laptop>();
        email = new ArrayList<String>();

        lblProcesor.setText("Procesor : ");
        lblVideo.setText("Placa video : ");
        lblRam.setText("Mem. RAM : ");
        lblEmail.setText("Email-ul tau : ");
        lblEmailConfirm.setText(" ");
        lblConfig.setText(" ");
        lblContact.setText(" ");
        lblCauta.setText("Cauta cap. RAM : ");
        lblMesaj.setText("Aveti grija la introducere !");

        btnAdauga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String procesor = txtProcesor.getText();
                String video = txtVideo.getText();
                String ramString = txtRam.getText();
                int ram = 0;

                if(contor <= intrari)
                {
                    if (!ramString.isEmpty())
                    {
                        ram = Integer.parseInt(ramString);
                    }

                    if (!procesor.isEmpty() && !video.isEmpty() && !ramString.isEmpty())
                    {
                        Laptop l = new Laptop(procesor, video, ram);
                        laptop.add(l);
                        refreshList();
                        lblMesaj.setText("Adaugare reusita. " + l.StringBuffer());
                        contor++;
                    }
                    else lblMesaj.setText("Campul nu poate fi gol.");
                }
                else lblMesaj.setText("Ai introdus nr. maxim de laptop-uri.");
            }
        });

        btnConfig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblConfig.setText("Configuratia noastra de top este Ryzen9, RTX3090 si 128GB RAM.");
            }
        });

        btnEmail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String emailIntrod = txtEmail.getText();
                if(contor_email <= intrari_email)
                {
                    if (!emailIntrod.isEmpty()) {
                        email.add(emailIntrod);
                        lblEmailConfirm.setText("Email introdus cu succes.");
                        contor_email++;
                    } else lblEmailConfirm.setText("Campul nu poate fi gol.");
                }
                else lblEmailConfirm.setText("Nu se poate introduce mai mult de o adresa !"); //eveniment introd. >1 email
            }
        });

        btnContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblContact.setText("08:00 - 18:00 business.email@qmail.com sau la nr. tel. 1234567890.");
            }
        });

        btnCauta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean OK = false;
                int ram_cautat = Integer.parseInt(txtCauta.getText());

                if(laptop.isEmpty())
                    lblCautaConfirm.setText("Nu exista nicio inregistrare !"); //eveniment arraylist gol
                else
                {
                    for (int i = 0; i < laptop.size(); i++)
                    {
                        if (laptop.get(i).getRam() == ram_cautat)
                        {
                            lblCautaConfirm.setText("Gasit ! : " + laptop.get(i).toString());
                            OK = true;
                        }
                    }
                    if (OK == false)
                        lblCautaConfirm.setText("Laptopul cu " + ram_cautat + "GB RAM nu a fost gasit.");
                }
            }
        });
    }
    private void refreshList()
    {
        lstLaptop.setListData(laptop.toArray());
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Aplicatie Proiect 2");

        frame.setContentPane(new MainWindow().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,600);
        frame.setVisible(true);
    }
}
