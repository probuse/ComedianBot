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
        jokeList.add(new Joke("Have you heard the one about the Corduroy pillow?",
                              "It is making HEADLINES!"));
        jokeList.add(new Joke("What is red and bad for your teeth?",
                               "A brick."));

        return jokeList;
    }

    public static ArrayList<Joke> getJokeListTwo(){
        ArrayList<Joke> jokeList = new ArrayList<Joke>();

        jokeList.add(new Joke("Why didn't the melons get married?",
                              "Because they cantaloupe!"));
        jokeList.add(new Joke("What did the cobbler say when the cat entered his shop?",
                              "Shoe!"));
        jokeList.add(new Joke("What did the Buddhist say to the hotdog vendor?",
                              "Make me one with everything!"));
        jokeList.add(new Joke("The face of a child can say it all",
                              "especially the mouth part of the face."));
        jokeList.add(new Joke("Why did the cookie go to the hospital",
                              "Because he felt crummy."));
        jokeList.add(new Joke("I intend to live forever.....",
                              "So far, so good."));
        return jokeList;
    }
}
