package kg.itacademy.lastexamm.service;

import kg.itacademy.lastexamm.entity.Request;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RequestService {
    List<Request> getAll();
    Request create(Request request);
    Request deleteById(Long id);
    Request getById(Long id);

    List<Request> searchByGenre(String genre);
    List<Request> searchByBookName(String bookname);
}

