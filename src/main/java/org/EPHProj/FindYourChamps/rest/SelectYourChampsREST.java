package org.EPHProj.FindYourChamps.rest;

import org.EPHProj.FindYourChamps.query.LolDataServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/select-your-champs")
public class SelectYourChampsREST {
    @Autowired
    private LolDataServices lolDataServices;
    @RequestMapping(value = "/get-champs", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<String>> getChamps() throws IOException {
        List list = new ArrayList();
        list.add(lolDataServices.getLOL_STATIC_DATA_V3());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
