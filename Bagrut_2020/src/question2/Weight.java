package question2;

public class Weight {

  private int kilo;
  private int gram;

  public Weight(int kilo, int gram) {
    this.kilo = kilo;
    this.gram = gram;
  }

  public Weight(int x) {
    this.kilo = x / 1000;
    this.gram = x % 1000;
  }


  //region Given
  public int getKilo() {
    return kilo;
  }

  public void setKilo(int kilo) {
    this.kilo = kilo;
  }

  public int getGram() {
    return gram;
  }

  public void setGram(int gram) {
    this.gram = gram;
  }
  //endregion

  public void add(Weight other) {
    this.kilo += other.getKilo();
    this.gram += other.getGram();
  }

  public boolean less(Weight other) {
    return ((this.getKilo() * 1000 + this.gram) < (other.getKilo() * 1000 + other.getGram()));
  }


}
