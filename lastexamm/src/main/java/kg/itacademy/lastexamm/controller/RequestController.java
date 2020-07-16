package kg.itacademy.lastexamm.controller;


import kg.itacademy.lastexamm.entity.Request;
import kg.itacademy.lastexamm.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/request")
public class RequestController {
    @Autowired
    private RequestService requestService;

    @GetMapping(value = "/allRequest")
    public List<Request> getAll(){
        return requestService.getAll();

    }
    @GetMapping(value = "/byId/{id}")
    public Request getById(@PathVariable Long id){
        return requestService.getById(id);

    }
    @GetMapping(value = "/byBookName/{bookname}")
    public List<Request> searchByBookName(@PathVariable String bookname){
        return  requestService.searchByBookName(bookname);
    }
    @GetMapping(value = "/byGenre/{genre}")
    public List<Request> searchByGenre(@PathVariable String genre){
        return requestService.searchByGenre(genre);
    }
    @PostMapping
    public Request create(@RequestBody Request request){
        return  requestService.create(request);
    }
    @DeleteMapping
    public Request deleteById(@RequestParam(value= "deleteid") Long id){
        return requestService.deleteById(id);
    }

}
