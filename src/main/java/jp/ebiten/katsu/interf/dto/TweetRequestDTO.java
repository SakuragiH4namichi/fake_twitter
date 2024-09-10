package jp.ebiten.katsu.interf.dto;

import lombok.Getter;

import java.sql.Timestamp;

import jp.ebiten.katsu.domain.entity.Tweet;

public class TweetRequestDTO {
	
	@Getter
	private Long tweetId;
	
	@Getter
	private String content;
	
	@Getter
	private Timestamp timestamp;
	
	public TweetRequestDTO() {
	}
	
	public TweetRequestDTO(Tweet tweet) {
		this.tweetId = tweet.getTweetId();
		this.content = tweet.getContent();
		this.timestamp = tweet.getTimestamp();
	}
}
