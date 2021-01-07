package com.everis.cards.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.cards.app.entity.CardResponse;
import com.everis.cards.app.service.CardServiceImpl;

import io.reactivex.Observable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/core/cards")
@ApiModel("/core/cards")
public class CardController {

  @Autowired
  CardServiceImpl service;

  @ApiOperation(value = "Todas las tarjetas", response = CardResponse.class)
  @ApiResponse(code = 200, message = "Api ok", response = CardResponse.class)
  @GetMapping
  public Observable<CardResponse> getAllCards(@RequestParam("documentNumber") String documentNumber) {
    return service.getAllCards(documentNumber);

  }

}
