package utils;


import javax.swing.JTable;

public class JTableUtils {

    public static void minMaxWidth(JTable jTabla, Integer... minMaxWidth) {
        if (jTabla.getModel().getRowCount() != 0) {
            for (int i = 0; i < minMaxWidth.length; i++) {
                jTabla.getColumnModel().getColumn(i).setMinWidth(minMaxWidth[i]);
                jTabla.getColumnModel().getColumn(i).setMaxWidth(minMaxWidth[i]);
                jTabla.getColumnModel().getColumn(i).setPreferredWidth(minMaxWidth[i]);
            }
        }
    }
}
