package ch.hellorin.challengames

import java.time.Duration
import java.util.*

data class ChallengeDto(
        val id: Long,
        val name: String,
        val description: String,
        val deadline: Date?,
        val status: StatusDto,
        val totalTime: Duration?,
        val submitter: PlayerDto?,
        val challengee: PlayerDto,
        val game: GameDto,
        val raters: List<PlayerDto>,
        val ratings: List<RatingDto>,
        val comments : List<CommentDto>
)