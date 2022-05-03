import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class guiForm extends JFrame
{
  //  private JFrame frame        ;
    private JPanel rootPanel;
    //private JButton button1;
    //private JTextArea textArea1;

    public guiForm(List<String> list)
    {
        super("simple GUI");
        this.setBounds(0,0,700,1000);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(600, 700);

        DefaultMutableTreeNode root     = new DefaultMutableTreeNode("news.kraft-s.ru");
        DefaultMutableTreeNode group    = new DefaultMutableTreeNode("Group");

        StringBuilder stringBuilder1 = new StringBuilder();
        for (String s : list)
        {
            stringBuilder1.append(s).append("\n");
            group    = new DefaultMutableTreeNode(s);
            root.add(group);
        }



        Container contentPane = getContentPane();
        /* Определение последовательного расположения
         * с выравниванием компонентов по центру */
        rootPanel.setLayout (new FlowLayout(FlowLayout.CENTER));

        JTree tree1 = new JTree(root);
        JScrollPane jscrollpane = new JScrollPane(tree1);
        jscrollpane.setBounds(0,0,50,100);
        jscrollpane.setPreferredSize(new Dimension(250, 700));
        rootPanel.add(jscrollpane);

        JTree tree2 = new JTree(root);
        JScrollPane jscrollpane2 = new JScrollPane(tree2);
        jscrollpane2.setBounds(0,0,50,100);
        jscrollpane2.setPreferredSize(new Dimension(250, 700));
        rootPanel.add(jscrollpane2);

        // добавляем компоненты
        // добавляем компоненты
        rootPanel.add( new JButton("Школа"   ));
        rootPanel.add( new JButton("Институт"));
        rootPanel.add( new JButton("Академия"));
        setContentPane(rootPanel);

        // Открываем окно
        setVisible(true);
    }
    //public static void main(String[] args) {new guiForm();}
}
