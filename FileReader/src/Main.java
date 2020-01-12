import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    ArrayList<Double> arrayData = new ArrayList<Double>();


    public static void main(String[] args) throws IOException {
        String Templine;



        try {
            BufferedReader bufertIn = new BufferedReader(new FileReader("C:\\Users\\Felix\\OneDrive - System Provider Edenborgh AB\\Dokument\\Java2019\\FileReader\\temp.txt.txt"));
            while ((Templine = bufertIn.readLine()) != null) {
                System.out.println(Templine);
                double StoD = Double.parseDouble(Templine);
                arrayData = StoD;



            }
        }
        catch(Exception e){
                System.out.println("File ERROR!");
            }


    }
    public double getDifference(){
        double smallest = arrayData.get(0);
        double laragest = arrayData.get(0);
        for(int i=0; i<arrayData.size(); i++){
            if(arrayData.get(i)>laragest){
                laragest = arrayData.get(i);
                System.out.println(laragest);
                return laragest;
            }
            else if(arrayData.get(i)<smallest){
                smallest = arrayData.get(i);
                System.out.println(smallest);
                return smallest;
            }

        }

    }
}
