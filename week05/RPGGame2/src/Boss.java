import java.awt.image.BufferedImage;

/**
 * Created by georgezsiga on 4/10/17.
 */
public class Boss extends Monster {

  public Boss(BufferedImage image, int posX, int posY) {
    super(image, posX, posY);
    this.level = 1;
    this.maxHP = (2 * levelOfGame * 6) + 6;
    this.currentHP = (2 * levelOfGame * gameLogic.rollTheDice()) + gameLogic.rollTheDice();
    this.defendDP = ((levelOfGame / 2) * gameLogic.rollTheDice()) + (gameLogic.rollTheDice() / 2);
    this.strikeSP = (levelOfGame * gameLogic.rollTheDice()) + levelOfGame;
  }

  @Override
  public String toString() {
    return "Boss " +
        "(level " + level +
        ") HP: " + currentHP +
        "/" + maxHP +
        " | DP: " + defendDP +
        " | SP: " + strikeSP;
  }
}
