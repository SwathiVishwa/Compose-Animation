package com.app.compose_animation


data class Card(val id: Int, val value: Int)
object LocalData {
    fun shuffleCards(cards: List<Card>): MutableList<Card> {
        return cards.shuffled().toMutableList()
    }

    fun getCardList(): List<Card> {
        return listOf(
            Card(
                id = 1,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 2,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 3,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 4,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 5,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 6,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 7,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 8,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 9,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 10,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 11,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 11,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 12,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 13,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 14,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 15,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 16,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 17,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 18,
                value = R.drawable.ic_backside
            ),
            Card(
                id = 19,
                value = R.drawable.ic_backside
            ),
        )

    }

    fun getCards(): List<Card> {
        return listOf(
            Card(
                id = 1,
                value = R.drawable.clubs1
            ),
            Card(
                id = 2,
                value = R.drawable.clubs2
            ),
            Card(
                id = 3,
                value = R.drawable.clubs3
            ),
            Card(
                id = 4,
                value = R.drawable.clubs4
            ),
            Card(
                id = 5,
                value = R.drawable.clubs5
            ),
            Card(
                id = 6,
                value = R.drawable.clubs6
            ),
            Card(
                id = 7,
                value = R.drawable.clubs7
            ),
            Card(
                id = 8,
                value = R.drawable.clubs8
            ),
            Card(
                id = 9,
                value = R.drawable.clubs9
            ),
            Card(
                id = 10,
                value = R.drawable.clubs10
            ), Card(
                id = 1,
                value = R.drawable.clubs1
            ),
            Card(
                id = 2,
                value = R.drawable.clubs2
            ),
            Card(
                id = 3,
                value = R.drawable.clubs3
            ),
            Card(
                id = 4,
                value = R.drawable.clubs4
            ),
            Card(
                id = 5,
                value = R.drawable.clubs5
            ),
            Card(
                id = 6,
                value = R.drawable.clubs6
            ),
            Card(
                id = 7,
                value = R.drawable.clubs7
            ),
            Card(
                id = 8,
                value = R.drawable.clubs8
            ),
            Card(
                id = 9,
                value = R.drawable.clubs9
            ),
            Card(
                id = 10,
                value = R.drawable.clubs10
            )
        )
    }
}