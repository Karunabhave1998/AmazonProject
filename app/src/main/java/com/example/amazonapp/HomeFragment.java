package com.example.amazonapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.amazonapp.slider1.SliderAdapter;
import com.example.amazonapp.slider1.Slider_ItemsModel;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;



public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerAdapterClass recyclerAdapterClass;
    RecyclerModelClass recyclerModelClass;
    List<RecyclerModelClass> recyclerModelClassList = new ArrayList<>();


    private List<Slider_ItemsModel> listItems;
    private ViewPager page;
    private TabLayout tabLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = root.findViewById(R.id.mainRecycler);
        page = root.findViewById(R.id.imageSliderViewPager);
        tabLayout = root.findViewById(R.id.my_tablayout);

        // we are creating array list for storing our image urls.


        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        recyclerAdapterClass = new RecyclerAdapterClass(getActivity(), recyclerModelClassList);
        recyclerView.setAdapter(recyclerAdapterClass);


        loadHorizontalRecycler();


        listItems = new ArrayList<>();
        listItems.add(new Slider_ItemsModel(R.drawable.slideimage1));
        listItems.add(new Slider_ItemsModel(R.drawable.imageslider3));
        listItems.add(new Slider_ItemsModel(R.drawable.slideimage2));
        listItems.add(new Slider_ItemsModel(R.drawable.sliderimage5));
        listItems.add(new Slider_ItemsModel(R.drawable.sliderimage7));

        SliderAdapter sliderAdapter = new SliderAdapter(getContext(), listItems);
        page.setAdapter(sliderAdapter);

        java.util.Timer timer = new java.util.Timer();
        timer.scheduleAtFixedRate(new The_slide_timer(), 2000, 3000);
        tabLayout.setupWithViewPager(page, true);










        // passing this array list inside our adapter class.


        // below method is used to set auto cycle direction in left to
        // right direction you can change according to requirement.

        // setadapter to sliderview.


        // below method is use to set
        // scroll time in seconds.





        return root;
    }
public class The_slide_timer extends TimerTask
{
    @Override
    public void run() {

          getActivity().runOnUiThread(new Runnable() {
              @Override
              public void run() {

                  if(page.getCurrentItem()<listItems.size()-1)
                  {
                      page.setCurrentItem(page.getCurrentItem()+1);
                  }
                  else
                  {
                      page.setCurrentItem(0);
                  }

              }
          });



    }
}





    private void loadHorizontalRecycler() {

        recyclerModelClass = new RecyclerModelClass(R.drawable.img_2,"Prime");
        recyclerModelClassList.add(recyclerModelClass);
        recyclerModelClass = new RecyclerModelClass(R.drawable.img_13,"Fashion");
        recyclerModelClassList.add(recyclerModelClass);
        recyclerModelClass = new RecyclerModelClass(R.drawable.img_3,"Mobiles");
        recyclerModelClassList.add(recyclerModelClass);
        recyclerModelClass = new RecyclerModelClass(R.drawable.img_4,"Electronics");
        recyclerModelClassList.add(recyclerModelClass);
        recyclerModelClass = new RecyclerModelClass(R.drawable.img_5,"MiniTv");
        recyclerModelClassList.add(recyclerModelClass);

        recyclerModelClass = new RecyclerModelClass(R.drawable.img_6,"Home");
        recyclerModelClassList.add(recyclerModelClass);
        recyclerModelClass = new RecyclerModelClass(R.drawable.img_7,"Appliances");
        recyclerModelClassList.add(recyclerModelClass);
        recyclerModelClass = new RecyclerModelClass(R.drawable.img_8,"Book Toys");
        recyclerModelClassList.add(recyclerModelClass);
        recyclerModelClass = new RecyclerModelClass(R.drawable.img_9,"Furniture");
        recyclerModelClassList.add(recyclerModelClass);
        recyclerModelClass = new RecyclerModelClass(R.drawable.img_11,"Beauty");
        recyclerModelClassList.add(recyclerModelClass);

        recyclerModelClass = new RecyclerModelClass(R.drawable.img_12,"Alexa");
        recyclerModelClassList.add(recyclerModelClass);
        recyclerAdapterClass.notifyDataSetChanged();
    }


}
