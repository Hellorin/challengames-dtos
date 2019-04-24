package ch.hellorin.challengames

import java.util.*

data class CommentDto(
        val text : String,
        val date: Date,
        val author: PlayerDto
)