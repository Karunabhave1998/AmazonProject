package com.example.amazonapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class ProfileFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_profile, container, false);
        // Inflate the layout for this fragment
        return root;
    }
    public void amazon(View view) {
        Toast.makeText(getContext(), "Welcome to Amazon", Toast.LENGTH_SHORT).show();
    }

    public void notification(View view) {
        Toast.makeText(getContext(), "see all the notifications", Toast.LENGTH_SHORT).show();
    }

    public void search(View view) {
        Toast.makeText(getContext(), "search here", Toast.LENGTH_SHORT).show();

    }

    public void contact(View view) {
        Toast.makeText(getContext(), "see profile", Toast.LENGTH_SHORT).show();

    }

    public void button1(View view) {
        Toast.makeText(getContext(), "select your orders", Toast.LENGTH_SHORT).show();

    }

    public void button2(View view) {
        Toast.makeText(getContext(), "Thank you visit again", Toast.LENGTH_SHORT).show();

    }

    public void button3(View view) {
        Toast.makeText(getContext(), "see once your account", Toast.LENGTH_SHORT).show();

    }

    public void button4(View view) {
        Toast.makeText(getContext(), "your collection list", Toast.LENGTH_SHORT).show();

    }

    public void yourorders(View view) {
        Toast.makeText(getContext(), "select your orders", Toast.LENGTH_SHORT).show();

    }

    public void button5(View view) {
        Toast.makeText(getContext(), "see Homepage", Toast.LENGTH_SHORT).show();
    }

    public void yourwishlist(View view) {
        Toast.makeText(getContext(), "your collection list", Toast.LENGTH_SHORT).show();
    }

    public void button6(View view) {
        Toast.makeText(getContext(), "create a new List", Toast.LENGTH_SHORT).show();
    }

    public void youraccount(View view) {
        Toast.makeText(getContext(), "your account", Toast.LENGTH_SHORT).show();
    }

    public void seeall(View view) {
        Toast.makeText(getContext(), "see all the list", Toast.LENGTH_SHORT).show();
    }

    public void b1(View view) {
        Toast.makeText(getContext(), "your Orders", Toast.LENGTH_SHORT).show();
    }

    public void b2(View view) {
        Toast.makeText(getContext(), "Your Adderss", Toast.LENGTH_SHORT).show();
    }

    public void b3(View view) {
        Toast.makeText(getContext(), "Amazon Pay balance", Toast.LENGTH_SHORT).show();


    }

    public void b4(View view) {
        Toast.makeText(getContext(), "Manage Your Profile", Toast.LENGTH_SHORT).show();

    }

    public void b5(View view) {
        Toast.makeText(getContext(), "Amazon Pay UPI", Toast.LENGTH_SHORT).show();

    }

    public void b6(View view) {
        Toast.makeText(getContext(), "View Amazon Pay Balance", Toast.LENGTH_SHORT).show();

    }

    public void Buyagain(View view) {
        Toast.makeText(getContext(), "Buy Again", Toast.LENGTH_SHORT).show();

    }

    public void visit(View view) {
        Toast.makeText(getContext(), "Thank You Visit Again", Toast.LENGTH_SHORT).show();

    }
}