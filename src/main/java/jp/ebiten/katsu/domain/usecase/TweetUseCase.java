package jp.ebiten.katsu.domain.usecase;

import java.util.List;

import jp.ebiten.katsu.domain.entity.Tweet;

public interface TweetUseCase {
	
	List<Tweet> getTweetList();
	void storeTweet(Tweet tweet); 
	void deleteTweet(Long id);
}
