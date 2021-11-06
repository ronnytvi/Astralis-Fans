package rannygaming.developers.astralisnewsapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import rannygaming.developers.astralisnewsapp.R;

public class Adapter extends PagerAdapter {
    
    private Context ctx;
    private int[] ImageArray = new int[] {R.drawable.glaive, R.drawable.device, R.drawable.dupreeh, R.drawable.magisk,
            R.drawable.xypix, R.drawable.bubzkij, R.drawable.zonic};

    Adapter(Context context) {ctx = context;}
    
    @Override
    public int getCount() {
        return ImageArray.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(ctx);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(ImageArray[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
