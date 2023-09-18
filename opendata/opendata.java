import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;



public class Parking {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dati.comune.roma.it/catalog/dataset/baee58ee-d3b5-4d40-a5b2-87f5875ef167/resource/113d22e4-d2e4-48dc-9726-d254dd160b5f/download/parcheggi_scambio.csv");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int status = con.getResponseCode();

            if (status == 200) { // Request was successful
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                boolean headersPrinted = false; // print headers only once

                while ((inputLine = in.readLine()) != null) {
                    if (!headersPrinted) {
                        headersPrinted = true;
                    } else {
                        String[] del = inputLine.split(",");
                        for (String parking : del) {
                            System.out.println(parking);
                        }
                    }
                }
                in.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



