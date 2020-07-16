package kg.itacademy.lastexamm.service;

import kg.itacademy.lastexamm.entity.Request;
import kg.itacademy.lastexamm.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RequestServiceImpl implements RequestService {
    @Autowired
    private RequestRepository requestRepository;


    @Override
    public List<Request> getAll() {
        return requestRepository.findAll();
    }

    @Override
    public Request create(Request request) {
        return requestRepository.save(request);
    }

    @Override
    public Request deleteById(Long id) {
        Request  request = getById(id);
        if(request != null){
            requestRepository.deleteById(id);

        }
        return request ;
    }

    @Override
    public Request getById(Long id) {
        return requestRepository.findById(id).orElse(null);
    }

    @Override
    public List<Request> searchByGenre(String genre) {
        return requestRepository.findAllByGenre(genre);
    }

    @Override
    public List<Request> searchByBookName(String bookname) {
        return requestRepository.findAllByBookName(bookname);
    }
}
