package com.hellohasan.sixthclass.ListView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.hellohasan.sixthclass.R;
import com.hellohasan.sixthclass.RecyclerView.MovieListActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AndroidTopicListActivity extends AppCompatActivity {

    @BindView(R.id.topicListView)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_topic_list);
        ButterKnife.bind(this);

        final String[] topicList = getResources().getStringArray(R.array.topic_list);

        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topicList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), topicList[i], Toast.LENGTH_SHORT).show();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Long: " + topicList[i], Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }

    public void showMovieList(View view) {
        startActivity(new Intent(this, MovieListActivity.class));
    }
}
