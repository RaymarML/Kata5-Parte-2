
package kata5P2.main;
import java.io.IOException;
import kata5P2.view.MailListReader;
import kata5P2.model.Mail;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.model.Histogram;
import java.util.List;
import kata5P2.view.HistogramDisplay;

public class Kata4 {
    
    static List<Mail> listMails;
    static Histogram c;
    
    public static void main(String[] args) throws IOException{
        input();
        process();
        output();
    }
    

    
    public static void input() throws IOException{
        MailListReader a = new MailListReader();
        listMails = a.read("C:\\Users\\Armando\\Desktop\\a.txt");
    }
    
    public static void process(){
        MailHistogramBuilder b = new MailHistogramBuilder();
        c = b.build(listMails);

    }
    
    public static void output(){
        new HistogramDisplay(c).execute();
    }
}
