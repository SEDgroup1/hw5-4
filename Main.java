import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main (String[] args) throws Exception 
    {
        if (args.length != 1) {
            System.out.println("Input Error");
            System.exit(1);
        }
        
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        
        Window window = null;

        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            String[] tokens = line.split(" ");
            
            if(tokens[0].equals("window"))
            {
                if(tokens[1].equals("IconWindow"))
                {
                    window = new IconWindow(tokens[2]);
                }
                else if(tokens[1].equals("TransientWindow"))
                {
                    window = new TransientWindow(tokens[2]);
                }
            }
            else if(tokens[0].equals("drawBorder") && window != null)
            {
                window.drawBorder();
            }
            else if(tokens[0].equals("drawCloseBox") && window != null)
            {
                window.drawCloseBox();
            }
            else 
            {
                System.out.println("Input Error");
            }
        }
        reader.close();
    }
    
}
