package problem3_Rocket;
// 2016112158 김희수
import javax.swing.table.*;

public class RocketTable extends AbstractTableModel {
    protected Rocket[] rockets;
    protected String[] columnNames =
            new String[] { "Name", "Price", "Apogee" };
    public RocketTable(Rocket[] rockets) {
        this.rockets = rockets;
    }
    public int getColumnCount() {
        return columnNames.length;
    }
    public String getColumnName(int i) {
        return columnNames[i];
    }
    public int getRowCount() {
        return rockets.length;
    }
    public Object getValueAt(int row, int col) {
        if(columnNames[col] == "Name")
            return rockets[row].getName();
        else if (columnNames[col] == "Price")
            return rockets[row].getPrice();
        else if(columnNames[col] == "Apogee")
            return rockets[row].getApogee();
        else
            return null;
    }
}
