package rannygaming.developers.astralisnewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import rannygaming.developers.astralisnewsapp.R;

public class NewsViewerActivity extends AppCompatActivity {

    ImageView btnClose;
    TextView tvTitle, tvText, tvSource, tvAuthor;
    ImageView image;
    String sourceName = MainActivity.sourceName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_viewer);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        tvTitle = findViewById(R.id.tvTitlePage);
        tvText = findViewById(R.id.tvText);
        tvText.setMovementMethod(new ScrollingMovementMethod());
        tvSource = findViewById(R.id.tvSource);
        tvAuthor = findViewById(R.id.tvAuthor);
        image = findViewById(R.id.imgPicture);

        btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        tvTitle.setText(MainActivity.title);
        Glide.with(image.getContext()).load(MainActivity.image_path).into(image);
        tvText.setText(MainActivity.text);
        tvSource.setText(MainActivity.source);
        if (sourceName.equals("astralis.gg")){
            tvSource.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_astralis, 0, 0, 0);
            tvAuthor.setVisibility(View.INVISIBLE);
        }
        if (sourceName.equals("twitter.com")){
            tvSource.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_twitter, 0, 0, 0);
            tvAuthor.setVisibility(View.INVISIBLE);
        }
        if (sourceName.equals("hltv.org")){
            tvSource.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_hltv, 0, 0, 0);
        }
        if (sourceName.equals("instagram.com")){
            tvSource.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_instagram, 0, 0, 0);
            tvAuthor.setVisibility(View.INVISIBLE);
        }
        tvAuthor.setText(MainActivity.author);

    }
}