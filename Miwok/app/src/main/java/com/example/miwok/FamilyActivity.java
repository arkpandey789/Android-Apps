package com.example.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        // Create a list of words
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("father", "apa",R.drawable.family_father,R.raw.audio_family_father));
        words.add(new word("mother", "ata",R.drawable.family_mother,R.raw.audio_family_mother));
        words.add(new word("son", "angsi",R.drawable.family_son,R.raw.audio_family_son));
        words.add(new word("daughter", "tune",R.drawable.family_daughter,R.raw.audio_family_daughter));
        words.add(new word("older brother", "taachi",R.drawable.family_older_brother,R.raw.audio_family_older_brother));
        words.add(new word("younger brother", "chalitti",R.drawable.family_younger_brother,R.raw.audio_family_younger_brother));
        words.add(new word("older sister", "tete",R.drawable.family_older_sister,R.raw.audio_family_older_sister));
        words.add(new word("younger sister", "kolliti",R.drawable.family_younger_sister,R.raw.audio_family_younger_sister));
        words.add(new word("grandmother", "ama",R.drawable.family_grandmother,R.raw.audio_family_grandmother));
        words.add(new word("grandfather", "pappa",R.drawable.family_grandfather,R.raw.audio_family_grandfather));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_family);

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
                mediaPlayer=MediaPlayer.create(FamilyActivity.this,w.getAudioResourceID());
                mediaPlayer.start();
            }
        });
    }
}