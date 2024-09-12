package jp.ebiten.katsu.domain.usecase;

import jp.ebiten.katsu.domain.entity.Tweet;

import java.util.List;

public interface TweetUseCase {
	
	List<Tweet> getTweetList();
	void storeTweet(Tweet tweet); 
	void deleteTweet(Long id);
}
