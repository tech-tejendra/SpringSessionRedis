package TechTejendra.SpringSessionJDBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
public class Config {

	@Bean
	@Primary
	public LettuceConnectionFactory redisConnectionFactory() {
		
		RedisStandaloneConfiguration a = new RedisStandaloneConfiguration();
		//a.setPassword(redisPassword);
		//a.setDatabase(0);
		a.setPort(6379);
		a.setHostName("localhost");
		
		//LettuceClientConfiguration c = LettuceClientConfiguration.builder().useSsl().build();
		
		LettuceConnectionFactory l = new LettuceConnectionFactory(a);
		
		return l;
	}

}
