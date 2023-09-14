package JAVA_Jungsuk.chapter_16;

import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
class SourceViewer extends Frame {
    TextField tf = new TextField();
    TextArea ta = new TextArea();
    SourceViewer(String title) {
        super(title);
        add(tf, "North");
        add(ta, "Center");
        tf.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                displaySource();
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        setBounds(500, 200, 500, 300);
        setVisible(true);
    }
    void displaySource() {
        URL url = null;
        BufferedReader input = null;
        String address = tf.getText().trim();
        String line = "";
        ta.setText("");
        try {
            if(!address.startsWith("http://"))
                address = "http://"+address;
            url = new URL(address);
            input =
                    new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            while((line=input.readLine()) !=null) {
                ta.append(line);
                ta.append("\n");
            }
            input.close();
        } catch(Exception e) {
            ta.setText(" URL .");
        }
    } // displaySource()
    public static void main(String[] args) {
        SourceViewer mainWin = new SourceViewer("Source Viewer");
    }
}
