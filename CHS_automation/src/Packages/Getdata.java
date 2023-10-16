//This class is used to get data from excel and the data retrieved is stored in ArrayList.

package Packages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Getdata {
    public static ArrayList<String> getData(String data) throws IOException {
        FileInputStream f = new FileInputStream("C:\\Users\\ITsyn\\OneDrive\\Documents\\Auto\\Teatdata1.xlsx");
        XSSFWorkbook b = new XSSFWorkbook(f);
        int s = b.getNumberOfSheets();
        int k = 0;
        int col = 0;
        ArrayList<String> a = new ArrayList<String>();
        for (int i = 0; i < s; i++) {
            if (b.getSheetName(i).equalsIgnoreCase("Custdetails")) {
                XSSFSheet sheet = b.getSheetAt(i);
                Iterator<Row> r = sheet.iterator();
                Row fr = r.next();
                Iterator<Cell> c = fr.cellIterator();
                while (c.hasNext()) {
                    Cell v = c.next();
                    if (v.getStringCellValue().equalsIgnoreCase("no")) {
                        col = k;
                    }
                    k++;
                }

                while (r.hasNext()) {
                    Row ro = r.next();
                    if (ro.getCell(col).getStringCellValue().equalsIgnoreCase(data)) {
                        Iterator<Cell> cell = ro.cellIterator();
                        while (cell.hasNext()) {
                            Cell g = cell.next();
                            if (g.getCellType() == CellType.STRING) {
                                a.add(g.getStringCellValue());
                            } else {
                                a.add(NumberToTextConverter.toText(g.getNumericCellValue()));
                            }
                        }
                    }
                }
            }
        }
        return a;
    }
    public static ArrayList<String> getAccounts(String data) throws IOException {
        FileInputStream f = new FileInputStream("C:\\Users\\ITsyn\\OneDrive\\Documents\\Auto\\Teatdata1.xlsx");
        XSSFWorkbook b = new XSSFWorkbook(f);
        int s = b.getNumberOfSheets();
        int k = 0;
        int col = 0;
        ArrayList<String> a = new ArrayList<String>();
        for (int i = 0; i < s; i++) {
            if (b.getSheetName(i).equalsIgnoreCase("Accounts")) {
                XSSFSheet sheet = b.getSheetAt(i);
                Iterator<Row> r = sheet.iterator();
                Row fr = r.next();
                Iterator<Cell> c = fr.cellIterator();
                while (c.hasNext()) {
                    Cell v = c.next();
                    if (v.getStringCellValue().equalsIgnoreCase("no")) {
                        col = k;
                    }
                    k++;
                }

                while (r.hasNext()) {
                    Row ro = r.next();
                    if (ro.getCell(col).getStringCellValue().equalsIgnoreCase(data)) {
                        Iterator<Cell> cell = ro.cellIterator();
                        while (cell.hasNext()) {
                            Cell g = cell.next();
                            if (g.getCellType() == CellType.STRING) {
                                a.add(g.getStringCellValue());
                            } else {
                                a.add(NumberToTextConverter.toText(g.getNumericCellValue()));
                            }
                        }
                    }
                }
            }
        }
        return a;
    }

}
