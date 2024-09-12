package jp.ebiten.katsu.interf.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class TweetResponseDTO {
	
	private Long tweetId;

	private String content;
	
	private Timestamp timestamp;
	
	public TweetResponseDTO(Long tweetId, String content, Timestamp timestamp) {
		this.tweetId = tweetId;
		this.content = content;
		this.timestamp = timestamp;
	}
	
}
