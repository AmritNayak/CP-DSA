package hrcautomation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Milestone1 {

    public static void main(String[] args) throws FileNotFoundException {

//        Connection con=getConnection();

        ArrayList<Milestone_pojo> AllInvoices = new ArrayList<>();
        // pehle invoice1 ke lie dekh lena kaam kar rha ya nhi
        // agar han to ye likh dena 2 aur 3 ke lie
//        String[] files = {"invoice1.txt", "invoice2.txt", "invoice3.txt"};

        String[] files = {"invoice1.txt"};
        for (String file: files) {
            AllInvoices.add(getInvoiceData(file));
        }

        for (Milestone_pojo invoice: AllInvoices) {
            System.out.println(invoice.toString());
            // db me add kardena aage ka jaise ham unpaid time kie the


        }

    }

    public static Milestone_pojo getInvoiceData(String filename) throws FileNotFoundException {
        File file = new File("src\\hrcautomation\\" + filename);
        Scanner sc = new Scanner(file);
        String data = "";
        Pattern p;
        Matcher m;

        while (sc.hasNextLine())
            data += sc.nextLine();

        String userRegex = "USER\\sID:\\s[A-Z]{4}",
                casesRegex = "CASES:\\s\\d+.\\d{4}",
                poundsRegex = "POUNDS:\\s\\d+.\\d{4}",
                invoiceCodeRegex = "#:\\s\\d+",
                packRegex = "PACK:\\s\\d+",
                sizeRegex = "SIZE:\\s\\d+.\\d+\\s[A-Z]+",
                priceRegex = "PRICE:\\s\\d+.\\d+",
                brokerRegex = "BROKER\\s:\\s\\w+\\s[A-Z]+",
                vendorNumberRegex = "VENDOR\\sNUMBER:\\s+\\d+",
                reasonRegex = "REASON:\\s[A-Z]{2}\\s[A-Z]{3}\\s[A-Z]{2}\\s[0-9]{2}-[0-9]{2}-[0-9]{4}";

        String userId, reason, cases, pounds, itemDescription, size, unitPrice, broker, vendorNumber;
        int invoiceCode, pack;
        Milestone_pojo invoice = new Milestone_pojo();

        p = Pattern.compile(userRegex);
        m = p.matcher(data);
        userId = m.find() ? m.group(0).split(" ")[2] : null;
        invoice.setuserId(userId);

        p = Pattern.compile(casesRegex);
        m = p.matcher(data);
        cases = m.find() ? m.group(0).split(" ")[1] : null;
        invoice.setcases(cases);

        p = Pattern.compile(poundsRegex);
        m = p.matcher(data);
        pounds = m.find() ? m.group(0).split(" ")[1] : null;
        invoice.setpounds(pounds);

        p = Pattern.compile(invoiceCodeRegex);
        m = p.matcher(data);
        invoiceCode = m.find() ? Integer.parseInt(m.group(0).split(" ")[1]) : 0;
        invoice.setinvoiceCode(invoiceCode);

        p = Pattern.compile(packRegex);
        m = p.matcher(data);
        pack = m.find() ? Integer.parseInt(m.group(0).split(" ")[1]) : 0;
        invoice.setpack(pack);

        p = Pattern.compile(sizeRegex);
        m = p.matcher(data);
        size = m.find() ? m.group(0).split(" ")[1] : null;
        invoice.setsize(size);

        p = Pattern.compile(priceRegex);
        m = p.matcher(data);
        unitPrice = m.find() ? m.group(0).split(" ")[1] : null;
        invoice.setunitPrice(unitPrice);

        p = Pattern.compile(brokerRegex);
        m = p.matcher(data);
        broker = m.find() ? m.group(0).split(" ")[2] : null;
        invoice.setBroker(broker);

        p = Pattern.compile(vendorNumberRegex);
        m = p.matcher(data);
        vendorNumber = m.find() ? m.group(0).split(" ")[3] : null;
        invoice.setVendorNumber(vendorNumber);

        p = Pattern.compile(reasonRegex);
        m = p.matcher(data);
        reason = m.find() ? m.group(0).substring(8) : null;
        invoice.setreason(reason);

        return invoice;

    }

    public static Connection getConnection() {
        Connection con = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/";
        String DBname = "project";
        String username = "root";
        String password = "root";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url + DBname, username, password);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

}
