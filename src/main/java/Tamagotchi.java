public class Tamagotchi {
  private String mTamagotchiName;
  public static final int MAX_FOOD = 11;
  private int mFoodCount;

  public Tamagotchi(String name) {
    mTamagotchiName = name;
    mFoodCount = MAX_FOOD;
  }

  public int play() {
    mFoodCount -= 1;
      return mFoodCount;
  }

  public Object feed() {
    mFoodCount += 1;
    if (mFoodCount == 10) {
      return "I'm Full";
    } else {
      return mFoodCount;
    }
  }

  public String getTamagotchiName() {
    return mTamagotchiName;
  }
}
