package jp.ebiten.katsu.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Tweet {
	
	@Id
	@Getter
	@Setter
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tweetId;
	
	@Getter
	@Setter
	@Column(name = "content")
	private String content;
	
	@Getter
	@Setter
	@Column(name = "timestamp")
	private Timestamp timestamp;
	
	
	//コンストラクタ
	public Tweet() {
	}
	
	//ファクトリーメソッド
	public static Tweet createTweetInstanceThreeArgs(Long tweetId, String content, Timestamp timestamp) {
		Tweet tweet = createTweetInstanceThreeArgs(tweetId, content, timestamp);
		return tweet;
	}
	
	//ファクトリーメソッド
	public static Tweet createTweetInstanceOneArgs(Tweet tweet) {
		return tweet;
	}
}
