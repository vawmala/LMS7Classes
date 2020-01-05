package com.company;

public class Main {

    public static void main(String[] args) {
	PostOffice postOffice = new PostOffice();
//	postOffice.postOfficeNumber = 5;
//  postOffice.index = 69050;
//  postOffice.address = "Zaporozhye city, Soborniy str. 127";
//  postOffice.info();
        postOffice.setPostOfficeNumber(5);
        System.out.println(postOffice.getPostOfficeNumber());
        postOffice.setAddress("Zaporozhye city, Soborniy str. 127");
        System.out.println(postOffice.getAddress());
        postOffice.setIndex(69050);
        System.out.println(postOffice.getIndex());



    Book book = new Book();
//	book.author = "Mark Twen";
//	book.title = "Tom Soyer";
//	book.genre = "story";
//  book.info();
        book.setAuthor("Mark Twen");
        System.out.println(book.getAuthor());
        book.setTitle("Tom Soyer");
        System.out.println(book.getTitle());
        book.setGenre("story");
        System.out.println(book.getGenre());


	CustomerStore customerStore = new CustomerStore();
//    customerStore.email = "99vladik991@gmail.com";
//    customerStore.mobilePhone = "0994516540";
//    customerStore.name = "Vlad Ablakatov";
//    customerStore.info();
        customerStore.setEmail("99vladik991@gmail.com");
        System.out.println(customerStore.getEmail());
        customerStore.setMobilePhone("0994516540");
        System.out.println(customerStore.getMobilePhone());
        customerStore.setName("Vlad Ablakatov");
        System.out.println(customerStore.getName());


    }
}
