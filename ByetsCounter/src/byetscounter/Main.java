/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package byetscounter;

/**
 *
 * @author DELL
 */
import java.math.BigInteger;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file=null;
        File outFile=null;
        Scanner read=null;
        PrintWriter printWriter=null;
        int count=0;

        try
        {
           file = new File("I:\\Documents\\Malware\\DataSets\\ISOT_Botnet_DataSet_2010\\" +
                   "ISOT_Botnet_DataSet_2010\\http\\nonmalicious_traffic\\httpFlow.txt");
       //    outFile = new File("I:\\Documents\\Malware\\DataSets\\Week_1\\Monday\\rip\\ripNormalTraffic.txt");
        //  printWriter = new PrintWriter(outFile);
        read = new Scanner(file);

        read.useDelimiter(",");

        while(read.hasNext())
        {
          String hex1 = read.next().trim();
          count++;
        }
        System.out.println(count);
        }
         catch(Exception ex)
        {
            System.out.println(ex.toString());

        }

          finally
        {
            try
            {
                read.close();
                printWriter.close();

            }
            catch (Exception ex)
            {
               // Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.toString());
            }
        }
    }

}
