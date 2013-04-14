import june.*;
public class Test extends Spell{
  public void cast(){
    Enchanted target = getTarget();
    target.onFire(false);
    }
  }