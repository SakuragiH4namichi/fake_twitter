package jp.ebiten.katsu.domain.repository;

import java.util.List;
import java.util.Optional;

import jp.ebiten.katsu.domain.entity.Tweet;

public interface TweetRepository {
	//Idで取得するも良し、Timestamp順に取得するもよし。後で変える。
	//メソッド名は、構造上なんでもよし。そこが利点。
	Optional<Tweet> findById(Long id);
	List<Tweet> findAll();
	Tweet save(Tweet tweet); 
	void deleteById(Long id);
}
