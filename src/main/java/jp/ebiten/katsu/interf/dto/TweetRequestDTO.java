package jp.ebiten.katsu.interf.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class TweetRequestDTO {

	private Long tweetId;

	private String content;

	private Timestamp timestamp;	
}
