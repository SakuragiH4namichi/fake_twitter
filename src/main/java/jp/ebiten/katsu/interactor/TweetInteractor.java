package jp.ebiten.katsu.interactor;

import jp.ebiten.katsu.domain.entity.Tweet;
import jp.ebiten.katsu.domain.repository.TweetRepository;
import jp.ebiten.katsu.domain.usecase.TweetUseCase;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetInteractor implements TweetUseCase {
	private final TweetRepository tweetRepository;
	
	public TweetInteractor(TweetRepository tweetRepository) {
		this.tweetRepository = tweetRepository;
	}
	
	@Override
	public List<Tweet> getTweetList() {
		return tweetRepository.findAll();
	}
	
	@Override
	public void storeTweet(Tweet tweet) {
		tweetRepository.save(tweet);
	}
	
	@Override
	public void deleteTweet(Long id) {
		tweetRepository.deleteById(id);
	}
}
