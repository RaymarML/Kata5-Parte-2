
package kata5P2.main;
import java.io.IOException;
import kata5P2.view.MailListReaderBD;
import kata5P2.model.Mail;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.model.Histogram;
import java.util.List;
import kata5P2.view.HistogramDisplay;

public class Kata5 {
    
    static List<String> listMails;
    static Histogram c;
    
    public static void main(String[] args) throws IOException{
        input();
        process();
        output();
    }
    

    
    public static void input() throws IOException{
        MailListReaderBD a = new MailListReaderBD();
        listMails = a.read("jdbc:sqlite:Kata5.db", "EMAIL");
    }
    
    public static void process(){
        MailHistogramBuilder b = new MailHistogramBuilder();
        c = b.build(listMails);

    }
    
    public static void output(){
        new HistogramDisplay(c).execute();
    }
}
