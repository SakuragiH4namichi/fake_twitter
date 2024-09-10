package jp.ebiten.katsu.interf.dto;

import java.sql.Timestamp;

import jp.ebiten.katsu.domain.entity.Tweet;
import lombok.Getter;

public class TweetResponseDTO {
	@Getter
	private Long tweetId;
	
	@Getter
	private String content;
	
	@Getter
	private Timestamp timestamp;
	
	public TweetResponseDTO(Tweet tweet) {
		this.tweetId = tweet.getTweetId();
		this.content = tweet.getContent();
		this.timestamp = tweet.getTimestamp();
	}
}
