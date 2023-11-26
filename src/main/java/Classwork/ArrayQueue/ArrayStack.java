package Classwork.ArrayQueue;

public class ArrayStack {
    public ArrayStack() {
        size = 10;
    }

    int size;
    int topIndex;
    Book[] books;

    public ArrayStack(int size) {
        this.size = size;
    }
    public void push(Book book){
        if(books == null) {
            books = new Book[size];
            books[0] = book;
            topIndex = 0;
        }
        else {
            int counter = 0;
            while(books[counter] != null){
                counter++;
            }
            if(counter != (size - 1)) {
                books[counter] = book;
                topIndex++;
            }else{
                expand();
            }
        }
    }
    public void expand(){
        Book[] books2 = new Book[books.length * 2];
        System.arraycopy(books,0,books2,0,books.length);
        books = books2;
    }
    public void optimize(){
        if(books.length /4 >= topIndex){
           Book[] books2 = new Book[books.length / 2];
           System.arraycopy(books,0,books2,0,books.length);
           books = books2;
        }
    }
    public Book pull() {
        int counter = 0;
        while(books[counter + 1] != null) {
            counter++;
        }
        Book temp = books[counter];
        books[counter] = null;
        topIndex--;
        optimize();
        return temp;
    }


}
