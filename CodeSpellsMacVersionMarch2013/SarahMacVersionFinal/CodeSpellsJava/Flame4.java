import june.*;

public class Flame4 extends Spell{
  public void cast(){
    Enchanted target = getTarget();
	target.onFire(false);
  }
}
