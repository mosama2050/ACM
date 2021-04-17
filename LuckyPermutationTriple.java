/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author osama
 */
public class LuckyPermutationTriple {

    public static void main(String[] args) throws IOException {
       FastReaderr in = new FastReaderr(System.in);
       PrintWriter out = new PrintWriter(System.out);
      
        int n = in.nextInt();
        
       
        
        if (n % 2 == 0) {
            out.print("-1");
        } else {
            
           for (int i = 0; i < n; i++) {
            out.print(i + " ");
        }
        out.println();
        for (int i = 0; i < n; i++) {
            out.print(i + " ");
        }
        out.println();


            for (int i = 0; i < n; i++) {
              out.print((2 * i) % n + " ");
            }
        }
                
		out.close();
    }
}
class FastReaderr{
    
        BufferedReader br;
        StringTokenizer st;
 
       public FastReaderr(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public FastReaderr(FileReader fileReader) {
			br = new BufferedReader(fileReader);
		}
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
 