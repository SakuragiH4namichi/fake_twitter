package jp.ebiten.katsu.interf.controller;

import jp.ebiten.katsu.domain.entity.Tweet;
import jp.ebiten.katsu.domain.usecase.TweetUseCase;
import jp.ebiten.katsu.interf.dto.TweetRequestDTO;
import jp.ebiten.katsu.interf.dto.TweetResponseDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tweets")
public class TweetController {
	
	private final TweetUseCase tweetUseCase;
	
	public TweetController(TweetUseCase tweetUseCase) {
		this.tweetUseCase = tweetUseCase;
	}
	
	@GetMapping
	public ResponseEntity<List<TweetResponseDTO>> getTweetList() {
		List<Tweet> tweets = tweetUseCase.getTweetList();
		
		System.out.println("Tweets found: " + tweets.size());
		
		List<TweetResponseDTO> tweetResponseDTOs = tweets.stream()
				.map(TweetResponseDTO::new)
				.collect(Collectors.toList());
		
		return new ResponseEntity<>(tweetResponseDTOs, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> storeTweet(@RequestBody TweetRequestDTO tweetRequestDTO) {
		Tweet tweet = new Tweet();
		tweet.setContent(tweetRequestDTO.getContent());
		tweet.setTimestamp(tweetRequestDTO.getTimestamp());
		tweetUseCase.storeTweet(tweet);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
