package com.metaxiii.fr.firstchild.controller;

import com.metaxiii.fr.firstchild.entity.Item;
import lombok.AllArgsConstructor;
import org.javatuples.Pair;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ItemController {
    @GetMapping("/")
    public ResponseEntity<Pair<Item, Item>> item() {
        return new ResponseEntity<>(Pair.with(new Item(), new Item()), HttpStatus.OK);
    }
}
