public class Topic8Task1 {

  int a;
  int b;

  public Topic8Task1(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public void setA(int a) {
    this.a = a;
  }

  public void setB(int b) {
    this.b = b;
  }

  int getSum() {
    return a + b;
  }

  int getMax() {
    return Math.max(a, b);
  }

  @Override
  public String toString() {
    return "Topic8Task1{" +
        "a=" + a +
        ", b=" + b +
        '}';
  }

  public static void main(String[] args) {
    Topic8Task1 task = new Topic8Task1(4, 6);

    System.out.println(task);
    System.out.println(task.getSum()); // 10
    System.out.println(task.getMax()); // 6

    task.setA(1);
    task.setB(2);

    System.out.println(task);
    System.out.println(task.getSum()); // 3
    System.out.println(task.getMax()); // 2

  }

}