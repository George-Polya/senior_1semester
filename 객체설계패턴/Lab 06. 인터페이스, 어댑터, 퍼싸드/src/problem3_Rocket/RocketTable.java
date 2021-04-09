package problem3_Rocket;

/**
 * 2016112158 김희수
 * 주어진 UML대로 AbstractTableModel을 상속받아서 RocketTable클래스를 선언.
 * Rocket배열 rockets를 클래스 안에 선언해 aggregation 구현
 * getColumnCount 메소드는 column의 개수를 리턴. 즉, columnNames 배열의 길이를 리턴
 * getColumnName 메소드는 파라미터에 해당하는 column의 이름을 리턴.
 * getRowCount 메소드는 테이블 안의 로켓의 개수를 리턴. 따라서 rockets 배열의 길이를 리턴
 * getValueAt 메소드는 찾고자 하는 rocket(row)의 column에 해당하는 값을 리턴.
 * */



import javax.swing.table.*;

public class RocketTable extends AbstractTableModel {
    protected Rocket[] rockets;
    protected String[] columnNames = new String[] { "Name", "Price", "Apogee" };

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
