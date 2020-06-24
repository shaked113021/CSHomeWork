package question5;

public class Competitor {

  private int minuets;
  private int seconds;
  private String name;

  public Competitor(int minuets, int seconds, String name) {
    this.minuets = minuets;
    this.seconds = seconds;
    if(seconds > 59) {
      this.minuets += seconds / 60;
      this.seconds = seconds % 60;
    }

    this.name = name;
  }

  public int getMinuets() {
    return minuets;
  }

  public void setMinuets(int minuets) {
    this.minuets = minuets;
  }

  public int getSeconds() {
    return seconds;
  }

  public void setSeconds(int seconds) {
    this.seconds = seconds;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
