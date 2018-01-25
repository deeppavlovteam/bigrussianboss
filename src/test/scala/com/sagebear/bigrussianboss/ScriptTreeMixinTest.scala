package com.sagebear.bigrussianboss

import com.sagebear.bigrussianboss.Script.Node
import com.sagebear.bigrussianboss.Syntax._
import org.scalatest.FlatSpec

import scala.language.postfixOps

class ScriptTreeMixinTest extends FlatSpec {
  val examples: Script = примеры(
    Пример(
      Клиент приветствует,
      Оператор приветствует,
      Клиент спрашивает Про_покупку_пива,
      Оператор спрашивает Адрес,
      Клиент говорит Свой_адрес,
      Оператор отвечает Где_купить_пиво,
      Оператор прощается,
      Клиент прощается
    ),

    Пример(
      Клиент приветствует,
      Оператор приветствует,
      Клиент спрашивает Про_покупку_пива,
      Оператор спрашивает (Телефон и Адрес),
      Клиент говорит Свой_адрес,
      Оператор спрашивает Телефон,
      Клиент говорит Глупости,
      Оператор спрашивает Телефон,
      Клиент говорит Свой_телефон,
      Оператор отвечает Где_купить_пиво,
      Оператор прощается,
      Клиент прощается
    )
  )

  it should "work" in {
    println(examples)
  }
}