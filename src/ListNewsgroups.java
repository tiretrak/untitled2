/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.net.nntp.NNTPClient;
import org.apache.commons.net.nntp.NewsgroupInfo;

public final class ListNewsgroups
{
    ArrayList <String> myArray = new ArrayList<>();

    //public static void main(String[] args)
    public  ListNewsgroups(String[] args)
    {
        if (args.length < 1)
        {
            System.err.println("Usage: newsgroups newsserver [pattern]");
            return;
        }

        NNTPClient client = new NNTPClient();
        String pattern = args.length >= 2 ? args[1] : "";

        try
        {
            client.connect(args[0]);

            int j = 0;
            try {
                for(String s : client.iterateNewsgroupListing(pattern)) {
                    j++;
                    //System.out.println(s);
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            //System.out.println(j);

            j = 0;
            for(NewsgroupInfo n : client.iterateNewsgroups(pattern)) {
                myArray.add(n.getNewsgroup());
                j++;
                System.out.println(n.getNewsgroup());

            }
            System.out.println(j);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (client.isConnected()) {
                    client.disconnect();
                }
            }
            catch (IOException e)
            {
                System.err.println("Error disconnecting from server.");
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
    ArrayList<String> getNewsGroup()
    {
        return myArray;
    }


//    public static void main(String[] args) {
//        ListNewsgroups listNews = new ListNewsgroups(args);
//        List<String> list = Arrays.asList("Мама мыла раму.", "Долго и скучала.", "Вечер уж настал", "Вечер уж настал", "Вечер уж настал", "Вечер уж настал", "Вечер уж настал", "Вечер уж настал");
//        listNews.getNewsGroup();
//        guiForm ourform = new guiForm(listNews.getNewsGroup());
//    }

}


