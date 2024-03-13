class Main {
    public static void main(String[] args) {
        Stream stream1 = new Stream();
        stream1.addGroup(new Group("Group A"));
        stream1.addGroup(new Group("Group B"));

        Stream stream2 = new Stream();
        stream2.addGroup(new Group("Group C"));
        stream2.addGroup(new Group("Group D"));
        stream2.addGroup(new Group("Group E"));

        StreamComparator comparator = new StreamComparator();
        int result = comparator.compare(stream1, stream2);
        if (result < 0) {
            System.out.println("В Stream 1 меньше групп чем в Stream 2");
        } else if (result == 0) {
            System.out.println("Оба потока имеют одинаковое количество групп");
        } else {
            System.out.println("В Stream 2 больше групп чем в  Stream 1");
        }
    }
}