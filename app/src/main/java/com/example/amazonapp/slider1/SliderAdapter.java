package com.example.amazonapp.slider1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.amazonapp.R;


import java.util.List;

public class SliderAdapter extends PagerAdapter {

    Context context;
  List<Slider_ItemsModel> slider_itemsModelList;

    public SliderAdapter(Context context, List<Slider_ItemsModel> slider_itemsModelList) {
        this.context = context;
        this.slider_itemsModelList = slider_itemsModelList;
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup cotainer, int position)
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View sliderLayout = inflater.inflate(R.layout.slide_image,null);

        ImageView featured_image = sliderLayout.findViewById(R.id.imgaeSlide);
        featured_image.setImageResource(slider_itemsModelList.get(position).getImage());
        cotainer.addView(sliderLayout);
        return sliderLayout;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object)
    {
        container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return slider_itemsModelList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o ) {

        return view == o;
    }
}
