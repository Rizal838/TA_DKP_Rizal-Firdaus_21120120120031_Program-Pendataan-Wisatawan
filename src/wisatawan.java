import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class wisatawan {
    private JTextField epengunjung;
    private JTextField etelepon;
    private JComboBox cbnegara;
    private JRadioButton rb_pria;
    private JRadioButton rb_wanita;
    private JCheckBox cbmotor;
    private JCheckBox cbmobil;
    private JTextArea arearesume;
    private JButton clearButton;
    private JButton exitButton;
    private JButton prosesButton;
    private JPanel data;




    public static void main(String[]args){
        JFrame frame = new JFrame("wisatawan");
        frame.setContentPane(new wisatawan().data);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public wisatawan() {
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                epengunjung.setText("");
                etelepon.setText("");
                arearesume.setText("");
            }
        });


        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        prosesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int indocombo;
            String pilihan;
            char kelamin;
            String daftarkendaraan="";


                int Kode;
                int perulangan = 0, jumlah = 0;


                do {


                    String strData = JOptionPane.showInputDialog(null,
                            "Masukkan kode Program",
                            JOptionPane.QUESTION_MESSAGE);

                    Kode = Integer.parseInt(strData);
                    jumlah += Kode;
                    if (Kode != 1)
                        perulangan += 1;
                } while (Kode != 1);



            indocombo = cbnegara.getSelectedIndex();
            pilihan= (String) cbnegara.getSelectedItem();

            kelamin = 'P';

            if(rb_pria.isSelected()){
                kelamin='P';
            }else{
                kelamin='W';
            }

            if (cbmotor.isSelected())
                daftarkendaraan+=cbmotor.getText()+"\n";
            if (cbmobil.isSelected())
                daftarkendaraan+=cbmobil.getText()+"\n";

                arearesume.setText(
                                "Nama Pengunjung    :\t"+epengunjung.getText()+"\n"+
                                "Nomor Telepon      :\t"+etelepon.getText()+"\n"+
                                "Status             :\t"+pilihan+"\n"+
                                "kelamin            :\t"+kelamin+"\n"+
                                "Jenis Kendaraan    :\t"+daftarkendaraan+"\n");
            }
        });

    }
}

