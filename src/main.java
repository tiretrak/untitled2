//import javax.swing.*;
import java.util.List;
import java.util.Arrays;

public class main {

    public static void main(String[] args)
    {
      ListNewsgroups listNews = new ListNewsgroups(args);
      List<String> list = Arrays.asList("Мама мыла раму.", "Долго и скучала.", "Вечер уж настал", "Вечер уж настал", "Вечер уж настал", "Вечер уж настал", "Вечер уж настал", "Вечер уж настал");
      listNews.getNewsGroup();
      guiForm ourform = new guiForm(listNews.getNewsGroup());
//      guiForm ourform = new guiForm(list);

        // from, тессттттимпрлаопр
        // subject,
        // newsgroup,
        // filename,
        // server,
        // organization;

//        String[]  message_args = new String[6];
//        message_args [0] = "Алик";
//        message_args[1] = "вкусный шашлык";
//        message_args[2] = "kraft-s.test";
//        message_args[3] = "none";
//        message_args[4] = "news.kraft-s.ru";
//        message_args[5] = "Шашлычная";

//        PostMessage PostNews = new PostMessage(args);
    }

}
