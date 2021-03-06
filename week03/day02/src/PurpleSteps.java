import javax.swing.*;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 * Created by georgezsiga on 3/28/17.
 */
public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/purple-steps/r3.png]

    drawline(graphics);
  }

    public static void drawline(Graphics graphics2) {
        int z = 10;
        for (int i = 300; i >= 300-(19*z); ) {
          i = i - z;
          graphics2.setColor(Color.BLACK);
          graphics2.fillRect(300 - i, 300 - i, 10, 10);
          graphics2.setColor(new Color(153, 58, 164));
          graphics2.fillRect(300 - i + 1, 300 - i + 1, 8, 8);
        }
      }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
