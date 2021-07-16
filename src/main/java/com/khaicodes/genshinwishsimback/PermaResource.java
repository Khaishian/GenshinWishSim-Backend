package com.khaicodes.genshinwishsimback;

import com.khaicodes.genshinwishsimback.perma.Item;
import com.khaicodes.genshinwishsimback.perma.PermanentBanner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/permanentbanner")
public class PermaResource {
//    @GetMapping("/10")
//    public ResponseEntity<List<Item>> wishx10 () {
//        List<Item> rolls = new ArrayList<>();
//        PermanentBanner perma = new PermanentBanner( 99999);
//        Item[] items = perma.wishx10v2();
//        for(Item item : items){
//            rolls.add(item);
//        }
//        return new ResponseEntity<>(rolls, HttpStatus.OK);
//    }

    PermanentBanner perma = new PermanentBanner( 99999);
    @GetMapping("/10")
    public ResponseEntity<Item[]> wishx10 () {
        Item[] items = perma.wishx10v2();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @GetMapping("/reset")
    public ResponseEntity<?> wishx10Reset () {
        perma = new PermanentBanner( 99999);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
