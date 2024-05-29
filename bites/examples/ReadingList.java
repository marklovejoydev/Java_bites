package bites.examples;

public class ReadingList {

    String[] unread = new String[4];

    public static void main(String[] args) {
        ReadingList readingList = new ReadingList();
        readingList.add("space and time");
        readingList.add("art of war");
        System.out.println(readingList.unread[0]);
        System.out.println(readingList.unread[1]);
        System.out.println(readingList.unread[2]);
        System.out.println(readingList.unread[3]);
    }

    private void add(String book) {
        Boolean continueSearch = true;
        Integer index = 0;
        while(continueSearch) {
            if(unread[index] == null){
                unread[index] = book;
                continueSearch = false;
            } else {
                index++;
            }
        }
    }
}
