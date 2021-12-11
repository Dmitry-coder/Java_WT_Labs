package task9_11;

public class Basket {

    public Ball head;       // указатель на первый элемент
    public Ball tail;       // указатель последний элемент

    void addToEnd(String color, int weight) {          //добавление в конец списка
        if (weight > 0) {                     //не создавать элемент, если коэффицент = 0
            Ball a = new Ball();  //создаём новый элемент
            a.color = color;
            a.weight = weight;
            if (tail == null) {         //если список пуст, то указываем ссылки начала и конца на новый элемент
                head = a;               //т.е. список теперь состоит из одного элемента
                tail = a;
            } else {
                tail.next = a;          //иначе "старый" последний элемент теперь ссылается на новый
                tail = a;               //а в указатель на последний элемент записываем адрес нового элемента
            }
        }
    }

    public int countWeight(Basket a) {
        Ball b = a.head;
        int allWeight = 0;
        while (b != null) {
            allWeight += b.weight;
            b = b.next;
        }
        return allWeight;
    }

    public int countBlueBalls(Basket a) {
        Ball b = a.head;
        int count = 0;
        String blue = "синий";
        while (b != null) {
            if (b.color.equals(blue)) {
                count++;
            }
            b = b.next;
        }
        return count;
    }
}
