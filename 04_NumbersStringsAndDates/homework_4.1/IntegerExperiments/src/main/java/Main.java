public class Main {

  public static void main(String[] args) {
    Container container = new Container();
    container.count += 23678;
    int number = container.count;

    int sum = sumDigits(number);

    System.out.println(sum);

  }

  /* Реализуйте метод sumDigits который возвращает сумму цифр числа, пример:
  передано 12345, метод должен вернуть 15
  если передано null, то должен вернуть -1

  Запустите тесты TestSumDigits для проверки корректности работы метода

  не меняйте название метода, его возвращаемое значение и модификаторы доступа (public).
  В противном случае тестовый метод не сможет проверить ваш код
   */

  public static int sumDigits(int number) {
    String text = String.valueOf(number);
    int sum = 0;
    if (number != null) {
      for (int i = 0; i < text.length(); i++) {
        sum += Integer.parseInt(String.valueOf(text.charAt(i)));
      }
      return sum;
    } else {
      return -1;
    }
  }
}


