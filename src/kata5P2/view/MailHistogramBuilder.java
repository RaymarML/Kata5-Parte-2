package kata5P2.view;

import kata5P2.model.Histogram;
import kata5P2.model.Mail;
import java.util.List;

public class MailHistogramBuilder {
    
    public MailHistogramBuilder(){}
    
    public Histogram<String> build (List<String> mails){
        Histogram<String> histogram = new Histogram();
        for (String mail : mails) {
            histogram.increment(mail);
        }
        return histogram;
    }
}
