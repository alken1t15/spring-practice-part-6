package kz.alken1t.alex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("kz.alken1t.alex")
public class SpringConfig {

    @Bean
    public MusicPlayer musicPlayer(){
        List<Music> musicList = new ArrayList<>();

        {
            musicList.add(rockMusic());
            musicList.add(classicalMusic());
            musicList.add(hipHop());
        }
        return new MusicPlayer(musicList);
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public HipHop hipHop(){
        return new HipHop();
    }
}