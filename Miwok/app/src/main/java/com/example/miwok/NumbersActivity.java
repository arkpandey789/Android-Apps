package com.example.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        // Create a list of words
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("one", "lutti", R.drawable.number_one, R.raw.audio_number_one));
        words.add(new word("two", "otiiko", R.drawable.number_two, R.raw.audio_number_two));
        words.add(new word("three", "tolookosu", R.drawable.number_three, R.raw.audio_number_three));
        words.add(new word("four", "oyyisa", R.drawable.number_four, R.raw.audio_number_four));
        words.add(new word("five", "massokka", R.drawable.number_five, R.raw.audio_number_five));
        words.add(new word("six", "temmokka", R.drawable.number_six, R.raw.audio_number_six));
        words.add(new word("seven", "kenekaku", R.drawable.number_seven, R.raw.audio_number_seven));
        words.add(new word("eight", "kawinta", R.drawable.number_eight, R.raw.audio_number_eight));
        words.add(new word("nine", "wo’e", R.drawable.number_nine, R.raw.audio_number_nine));
        words.add(new word("ten", "na’aacha", R.drawable.number_ten, R.raw.audio_number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.rootview);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word w = words.get(position);
                mediaPlayer = MediaPlayer.create(NumbersActivity.this, w.getAudioResourceID());
                mediaPlayer.start();
            }
        });
    }
}
