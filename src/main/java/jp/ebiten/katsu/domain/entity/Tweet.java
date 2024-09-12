package jp.ebiten.katsu.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
public class Tweet {
	
	@Id
	@Getter
	@Setter
	@Column(name = "tweet_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Getter
	@Setter
	@Column(name = "content")
	private String content;
	
	@Getter
	@Setter
	@Column(name = "createdAt")
	private LocalDateTime createdAt;
}
