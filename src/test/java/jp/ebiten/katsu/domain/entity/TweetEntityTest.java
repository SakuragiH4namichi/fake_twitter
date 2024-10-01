package jp.ebiten.katsu.domain.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TweetEntityTest {

	@Test
	void testNoArgsConstructor() {
		Tweet tweet = new Tweet();
		assertNotNull(tweet);
		assertNull(tweet.getId());
		assertNull(tweet.getContent());
		assertNull(tweet.getUser());
		assertNull(tweet.getCreatedAt());
	}
}
