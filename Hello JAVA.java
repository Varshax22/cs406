import java.applet.Applet;
import java.awt.Graphics;

public class HelloApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("HELLO JAVA", 20, 20);
    }
}


<html>
<body>
<applet code="HelloApplet.class" width="300" height="300"></applet>
</body>
</html>
