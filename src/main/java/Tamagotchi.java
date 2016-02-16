import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Tamagotchi {
  public static final int MAX_FOOD = 10;
  private String mTamagotchiName;
  private int mFoodCount;

  public Tamagotchi(String TamagotchiName, int MAX_FOOD) {
    mTamagotchiName = TamagotchiName;
    mFoodCount = MAX_FOOD;
  }
  //click submit btn

  public boolean play() {
    mFoodCount -= 1;
    return mFoodCount;
  }

  public boolean feed() {
    mFoodCount += 1;
    return mFoodCount;
  }

  public boolean isEmpty() {
    return mFoodCount == 0;
  }

  public void load() {
    mFoodCount = MAX_FOOD;
  }

  public String getTamagotchiName() {
    return mTamagotchiName;
  }
}
