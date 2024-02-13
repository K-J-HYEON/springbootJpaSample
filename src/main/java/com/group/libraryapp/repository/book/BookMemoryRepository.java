package com.group.libraryapp.repository.book;

import com.group.libraryapp.service.book.BookRepository;
import org.springframework.stereotype.Repository;

@Repository
public class BookMemoryRepository implements BookRepository {

    @Override
    public void saveBook() {
        System.out.println("MemoryRepository");
    }
}
