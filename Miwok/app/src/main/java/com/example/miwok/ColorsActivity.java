package com.example.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        // Create a list of words
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("red", "weṭeṭṭi",R.drawable.color_red,R.raw.audio_color_red));
        words.add(new word("green", "chokokki",R.drawable.color_green,R.raw.audio_color_green));
        words.add(new word("brown", "ṭakaakki",R.drawable.color_brown,R.raw.audio_color_brown));
        words.add(new word("gray", "ṭopoppi",R.drawable.color_gray,R.raw.audio_color_gray));
        words.add(new word("black", "kululli",R.drawable.color_black,R.raw.audio_color_black));
        words.add(new word("white", "kelelli",R.drawable.color_white,R.raw.audio_color_white));
        words.add(new word("dusty yellow", "ṭopiisә",R.drawable.color_dusty_yellow,R.raw.audio_color_dusty_yellow));
        words.add(new word("mustard yellow", "chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.audio_color_mustard_yellow));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_colors);

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
                word w=words.get(position);
                mediaPlayer=MediaPlayer.create(ColorsActivity.this,w.getAudioResourceID());
                mediaPlayer.start();
            }
        });
    }
}