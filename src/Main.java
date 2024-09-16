public class Main {
    public static void main(String[] args) {
        Library library = new Library();


        Book book1 = new Book("1984", "George Orwell", "12345", 3);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "67890", 2);

        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        library.registerMember(member1);
        library.registerMember(member2);

        library.lendBook("12345", "M001");
        library.lendBook("67890", "M002");

        System.out.println("Copies of 1984 available: " + book1.getCopiesAvailable());
        System.out.println("Copies of To Kill a Mockingbird available: " + book2.getCopiesAvailable());
    }
}
