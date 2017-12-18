package etwin.comedianbot;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

public class ObjectActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object);

        ArrayList<Joke> somejokes = JokeWriter.getJokeListOne();
        JokeBot jokeBot = new JokeBot(somejokes);
        jokeBot.tellJoke();
        jokeBot.jokesIKnow = JokeWriter.getJokeListTwo();

        ComedianBot drHilarious = new ComedianBot("DrHilarious");
        drHilarious.performShow();
    }
}


