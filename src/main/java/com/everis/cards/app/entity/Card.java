package com.everis.cards.app.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("Card Api")
public class Card {
  @ApiModelProperty(example = "1111222233334441", position = 1)
  private String cardNumber;
  @ApiModelProperty(example = "TRUE", position = 2)
  private Boolean active;

}
