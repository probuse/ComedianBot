package etwin.comedianbot;

/**
 * Created by probuse on 12/17/17.
 */

public class ComedianBot extends JokeBot {

    public ComedianBot(String name) {
        super(null);
        setName(name);
        jokesIKnow = JokeWriter.getJokeListTwo();

    }

    public void performShow(){
        talk("Good evening everyone, my name is " + getName());
        talk("Why don't i tell you some of my favorite jokes?");

        for (Joke oneJoke : jokesIKnow){
            sayJoke(oneJoke);
        }

        talk("Thanks everyone, Goodnight!");
    }

    @Override
    public void sayJoke(Joke joke) {
        talk(joke.getJokeSetup() + "..." + joke.getJokePunchline());
    }
}
