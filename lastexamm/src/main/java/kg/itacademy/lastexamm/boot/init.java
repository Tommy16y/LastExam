package kg.itacademy.lastexamm.boot;

import kg.itacademy.lastexamm.entity.Request;
import kg.itacademy.lastexamm.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class init implements CommandLineRunner {
    @Autowired
    private RequestService requestService;
    @Override
    public void run(String... args) throws Exception {
        requestService.create(new Request(1L,"Tommy","horror","normal","in new book","inst:salimakm"));
        requestService.create(new Request(2L,"Jhon","comedy","bad","in new book","inst:jack"));
        requestService.create(new Request(3L,"Ekko","comedy","bad","in new book","inst:jack"));
        requestService.create(new Request(4L,"Jhon","horror","bad","in new book","inst:jack"));


    }
}
