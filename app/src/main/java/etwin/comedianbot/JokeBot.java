package etwin.comedianbot;

import java.util.ArrayList;

/**
 * Created by probuse on 12/17/17.
 */

public class JokeBot extends Bot {

    public static ArrayList<Joke> jokesIKnow = null;

    public JokeBot(ArrayList<Joke> jokesIKnow){
        jokesIKnow = jokesIKnow;
    }

    public void tellJoke() {
        Double randomNumDouble = new Double(Math.random()*jokesIKnow.size());
        int randomInt = randomNumDouble.intValue();

        Joke myJoke = jokesIKnow.get(randomInt);

        sayJoke(myJoke);
    }

    public void sayJoke(Joke joke){
        talk(joke.getJokeSetup());
        talk(joke.getJokePunchline());
    }
}
