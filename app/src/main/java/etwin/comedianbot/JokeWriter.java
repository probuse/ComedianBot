package etwin.comedianbot;

import java.util.ArrayList;

/**
 * Created by probuse on 12/17/17.
 */

public class JokeWriter {

    public static ArrayList<Joke> getJokeListOne(){
        ArrayList<Joke> jokeList = new ArrayList<Joke>();

        jokeList.add(new Joke("Why couldn't the bicycle stand up?",
                              "Because it was too tired"));
        jokeList.add(new Joke("What do you call a cheese that is not yours?",
                              "Nacho Cheese!"));
        jokeList.add(new Joke("Before I criticize a man, i like to walk a mile in his shoes",
                              "That way when i criticize him, i am a mile away and have his shoes."));
        jokeList.add(new Joke("What do you call a fish with no eye?",
                              "Fssssh"));
        jokeList.add(new Joke("Have you heard the one about "));
    }
}
