package com.everis.cards.app.service;

import com.everis.cards.app.entity.CardResponse;

import io.reactivex.Observable;

public interface CardService {
  Observable<CardResponse> getAllCards(String documentNumber);
}
