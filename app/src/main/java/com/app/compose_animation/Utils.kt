package com.app.compose_animation


data class Card(val id: Int, val imgResource: Int)
object LocalData {
    fun shuffleCards(cards: List<Card>): MutableList<Card> {
        return cards.shuffled().toMutableList()
    }

    fun getCardList(): List<Card> {
        return listOf(
            Card(
                id = 1,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 2,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 3,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 4,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 5,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 6,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 7,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 8,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 9,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 10,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 11,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 11,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 12,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 13,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 14,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 15,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 16,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 17,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 18,
                imgResource = R.drawable.ic_backside
            ),
            Card(
                id = 19,
                imgResource = R.drawable.ic_backside
            ),
        )

    }

    fun getCards(): List<Card> {
        return listOf(
            Card(
                id = 1,
                imgResource = R.drawable.clubs1
            ),
            Card(
                id = 2,
                imgResource = R.drawable.clubs2
            ),
            Card(
                id = 3,
                imgResource = R.drawable.clubs3
            ),
            Card(
                id = 4,
                imgResource = R.drawable.clubs4
            ),
            Card(
                id = 5,
                imgResource = R.drawable.clubs5
            ),
            Card(
                id = 6,
                imgResource = R.drawable.clubs6
            ),
            Card(
                id = 7,
                imgResource = R.drawable.clubs7
            ),
            Card(
                id = 8,
                imgResource = R.drawable.clubs8
            ),
            Card(
                id = 9,
                imgResource = R.drawable.clubs9
            ),
            Card(
                id = 10,
                imgResource = R.drawable.clubs10
            ), Card(
                id = 1,
                imgResource = R.drawable.clubs1
            ),
            Card(
                id = 2,
                imgResource = R.drawable.clubs2
            ),
            Card(
                id = 3,
                imgResource = R.drawable.clubs3
            ),
            Card(
                id = 4,
                imgResource = R.drawable.clubs4
            ),
            Card(
                id = 5,
                imgResource = R.drawable.clubs5
            ),
            Card(
                id = 6,
                imgResource = R.drawable.clubs6
            ),
            Card(
                id = 7,
                imgResource = R.drawable.clubs7
            ),
            Card(
                id = 8,
                imgResource = R.drawable.clubs8
            ),
            Card(
                id = 9,
                imgResource = R.drawable.clubs9
            ),
            Card(
                id = 10,
                imgResource = R.drawable.clubs10
            )
        )
    }
}