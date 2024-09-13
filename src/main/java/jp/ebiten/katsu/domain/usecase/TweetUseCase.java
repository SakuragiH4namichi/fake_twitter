package jp.ebiten.katsu.domain.usecase;

import jp.ebiten.katsu.domain.entity.Tweet;

import java.time.LocalDateTime;
import java.util.List;

public interface TweetUseCase {
	
	List<Tweet> getTweetList();
	void storeTweet(String content, LocalDateTime createdAt); 
	void deleteTweet(Long id);
}
