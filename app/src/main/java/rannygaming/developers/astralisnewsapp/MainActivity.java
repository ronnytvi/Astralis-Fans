package rannygaming.developers.astralisnewsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import rannygaming.developers.astralisnewsapp.R;

public class MainActivity extends AppCompatActivity {
    CardView news1;
    CardView news2;
    CardView news3;
    CardView news4;
    CardView news5;
    CardView news6;
    CardView news7;
    CardView news8;
    CardView news9;
    CardView news10;

    static ImageView news1image;
    static ImageView news2image;
    static ImageView news3image;
    static ImageView news4image;
    static ImageView news5image;
    static ImageView news6image;
    static ImageView news7image;
    static ImageView news8image;
    static ImageView news9image;
    static ImageView news10image;

    static TextView news1tv;
    static TextView news2tv;
    static TextView news3tv;
    static TextView news4tv;
    static TextView news5tv;
    static TextView news6tv;
    static TextView news7tv;
    static TextView news8tv;
    static TextView news9tv;
    static TextView news10tv;

    static String title;
    static String image_path;
    static String text;
    static String source;
    static String author;
    static String sourceName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        news1 = findViewById(R.id.cv1);
        news2 = findViewById(R.id.cv2);
        news3 = findViewById(R.id.cv3);
        news4 = findViewById(R.id.cv4);
        news5 = findViewById(R.id.cv5);
        news6 = findViewById(R.id.cv6);
        news7 = findViewById(R.id.cv7);
        news8 = findViewById(R.id.cv8);
        news9 = findViewById(R.id.cv9);
        news10 = findViewById(R.id.cv10);

        news1tv = findViewById(R.id.tv1);
        news2tv = findViewById(R.id.tv2);
        news3tv = findViewById(R.id.tv3);
        news4tv = findViewById(R.id.tv4);
        news5tv = findViewById(R.id.tv5);;
        news6tv = findViewById(R.id.tv6);
        news7tv = findViewById(R.id.tv7);
        news8tv = findViewById(R.id.tv8);
        news9tv = findViewById(R.id.tv9);
        news10tv = findViewById(R.id.tv10);

        news1image = findViewById(R.id.img1);
        news2image = findViewById(R.id.img2);
        news3image = findViewById(R.id.img3);
        news4image = findViewById(R.id.img4);
        news5image = findViewById(R.id.img5);
        news6image = findViewById(R.id.img6);
        news7image = findViewById(R.id.img7);
        news8image = findViewById(R.id.img8);
        news9image = findViewById(R.id.img9);
        news10image = findViewById(R.id.img10);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        return true;
                    case R.id.team:
                        startActivity(new Intent(getApplicationContext(), TeamActivity.class));
                        overridePendingTransition(0,0);
                        finish();
                        return true;
                    /*case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        overridePendingTransition(0,0);
                        finish();
                        return true;*/
                }

                return false;
            }
        });

        new LoadData().execute();
        //Toast.makeText(MainActivity.this,LoadData.dbTitle, Toast.LENGTH_SHORT).show();

        news1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = news.get(0).title;
                image_path = news.get(0).image;
                text = news.get(0).text;
                source = news.get(0).source;
                author = news.get(0).author;
                sourceName = news.get(0).sourceName;

                Intent intent = new Intent(MainActivity.this, NewsViewerActivity.class);
                startActivity(intent);
            }
        });
        news2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = news.get(1).title;
                image_path = news.get(1).image;
                text = news.get(1).text;
                source = news.get(1).source;
                author = news.get(1).author;
                sourceName = news.get(1).sourceName;

                Intent intent = new Intent(MainActivity.this, NewsViewerActivity.class);
                startActivity(intent);
            }
        });
        news3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = news.get(2).title;
                image_path = news.get(2).image;
                text = news.get(2).text;
                source = news.get(2).source;
                author = news.get(2).author;
                sourceName = news.get(2).sourceName;

                Intent intent = new Intent(MainActivity.this, NewsViewerActivity.class);
                startActivity(intent);
            }
        });
        news4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = news.get(3).title;
                image_path = news.get(3).image;
                text = news.get(3).text;
                source = news.get(3).source;
                author = news.get(3).author;
                sourceName = news.get(3).sourceName;

                Intent intent = new Intent(MainActivity.this, NewsViewerActivity.class);
                startActivity(intent);
            }
        });
        news5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = news.get(4).title;
                image_path = news.get(4).image;
                text = news.get(4).text;
                source = news.get(4).source;
                author = news.get(4).author;
                sourceName = news.get(4).sourceName;

                Intent intent = new Intent(MainActivity.this, NewsViewerActivity.class);
                startActivity(intent);
            }
        });
        news6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = news.get(5).title;
                image_path = news.get(5).image;
                text = news.get(5).text;
                source = news.get(5).source;
                author = news.get(5).author;
                sourceName = news.get(5).sourceName;

                Intent intent = new Intent(MainActivity.this, NewsViewerActivity.class);
                startActivity(intent);
            }
        });
        news7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = news.get(6).title;
                image_path = news.get(6).image;
                text = news.get(6).text;
                source = news.get(6).source;
                author = news.get(6).author;
                sourceName = news.get(6).sourceName;

                Intent intent = new Intent(MainActivity.this, NewsViewerActivity.class);
                startActivity(intent);
            }
        });
        news8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = news.get(7).title;
                image_path = news.get(7).image;
                text = news.get(7).text;
                source = news.get(7).source;
                author = news.get(7).author;
                sourceName = news.get(7).sourceName;

                Intent intent = new Intent(MainActivity.this, NewsViewerActivity.class);
                startActivity(intent);
            }
        });
        news9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = news.get(8).title;
                image_path = news.get(8).image;
                text = news.get(8).text;
                source = news.get(8).source;
                author = news.get(8).author;
                sourceName = news.get(8).sourceName;

                Intent intent = new Intent(MainActivity.this, NewsViewerActivity.class);
                startActivity(intent);
            }
        });
        news10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title = news.get(9).title;
                image_path = news.get(9).image;
                text = news.get(9).text;
                source = news.get(9).source;
                author = news.get(9).author;
                sourceName = news.get(9).sourceName;

                Intent intent = new Intent(MainActivity.this, NewsViewerActivity.class);
                startActivity(intent);
            }
        });
    }

    public static class News {
        String title;
        String image;
        String text;
        String source;
        String author;
        String sourceName;

        News(String title, String image, String text, String source, String author, String sourceName){
            this.title = title;
            this.image = image;
            this.text = text;
            this.source = source;
            this.author = author;
            this.sourceName = sourceName;
        }
    }

    private static List<News> news;

    static class LoadData extends AsyncTask<Void, Void, Void> {
        String error = "";
        static String dbTitle = "";
        String dbImage = "";
        String dbText = "";
        String dbSource = "";
        String dbAuthor = "";
        String dbSourceName = "";

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection(Config.url, Config.user, Config.password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM (SELECT * FROM news ORDER BY id DESC LIMIT 10) news ORDER BY id DESC");
                news = new ArrayList<>();
                while (resultSet.next()) {
                    dbTitle = resultSet.getString(3);
                    dbImage = resultSet.getString(4);
                    dbText = resultSet.getString(5);
                    dbSource = resultSet.getString(6);
                    dbAuthor = resultSet.getString(7);
                    dbSourceName = resultSet.getString(8);
                    InitData(dbTitle, dbImage, dbText, dbSource, dbAuthor, dbSourceName);
                }
                connection.close();
            } catch (Exception e) {
                error = e.toString();
            }
            return null;
        }

        private List<News> InitData(String title, String image_path, String text, String source, String author, String sourceName){
            news.add(new News(title, image_path, text, source, author, sourceName));
            return news;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Glide.with(news1image.getContext()).load(news.get(0).image).into(news1image);
            news1tv.setText(news.get(0).title);

            Glide.with(news2image.getContext()).load(news.get(1).image).into(news2image);
            news2tv.setText(news.get(1).title);

            Glide.with(news3image.getContext()).load(news.get(2).image).into(news3image);
            news3tv.setText(news.get(2).title);

            Glide.with(news4image.getContext()).load(news.get(3).image).into(news4image);
            news4tv.setText(news.get(3).title);

            Glide.with(news5image.getContext()).load(news.get(4).image).into(news5image);
            news5tv.setText(news.get(4).title);

            Glide.with(news6image.getContext()).load(news.get(5).image).into(news6image);
            news6tv.setText(news.get(5).title);

            Glide.with(news7image.getContext()).load(news.get(6).image).into(news7image);
            news7tv.setText(news.get(6).title);

            Glide.with(news8image.getContext()).load(news.get(7).image).into(news8image);
            news8tv.setText(news.get(7).title);

            Glide.with(news9image.getContext()).load(news.get(8).image).into(news9image);
            news9tv.setText(news.get(8).title);

            Glide.with(news10image.getContext()).load(news.get(9).image).into(news10image);
            news10tv.setText(news.get(9).title);

            super.onPostExecute(aVoid);
        }
    }

}