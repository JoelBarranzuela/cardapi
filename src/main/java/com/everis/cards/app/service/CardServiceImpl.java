package com.everis.cards.app.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import com.everis.cards.app.entity.Card;
import com.everis.cards.app.entity.CardResponse;

import io.reactivex.Observable;

@Service
public class CardServiceImpl implements CardService {

  @Override
  public Observable<CardResponse> getAllCards(String documentNumber) {
    List<Card> cards = IntStream.rangeClosed(1, 6)
        .mapToObj(number -> new Card("111122223333444" + number, number < 4 ? true : false))
        .collect(Collectors.toList());
    CardResponse cardResponse = new CardResponse(cards);
    return Observable.just(cardResponse);
  }

}
