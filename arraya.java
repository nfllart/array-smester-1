import javax.swing.*;

public class arraya {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("masukkan nama,kelas,atau nisn");
        String[] nama = {"Achmad", "Jtaro", "Iqbal"};
        String[] jurusan = {"RPL" , "TKJ, GAME DEV"};
        String[] nisn = {"1234", "5678", "8765"};
        String[][] kelompok = {nama, jurusan, nisn};
        int b = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (a.equalsIgnoreCase(kelompok[i][j])) {
                    JOptionPane.showMessageDialog(null,
                            ("Nama: " + kelompok[0][j] + "\njurusan: " + kelompok[1][j] + "\nnisn: " + kelompok[2][j]));
                    b = 1;
                } else {
                    JOptionPane.showMessageDialog(null,"inputan anda salah");
                }
            }
        }
        if (b == 0) {
            JOptionPane.showMessageDialog(null, "Anda salah");
        }
    }
}
