package io.bootify.thymeleaf.book;

import java.util.List;


public interface BookService {

    List<BookDTO> findAll();

    BookDTO get(Long id);

    Long create(BookDTO bookDTO);

    void update(Long id, BookDTO bookDTO);

    void delete(Long id);

}
