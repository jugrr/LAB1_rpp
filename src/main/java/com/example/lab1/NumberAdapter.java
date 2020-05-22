package com.example.lab1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NumberAdapter extends ArrayAdapter<Enumeration> {
    private LayoutInflater inflater;
    private int layout;
    private List<Enumeration> numbers;

    public NumberAdapter(Context context, int resource, List<Enumeration> numbers) {
        super(context, resource, numbers);
        this.numbers = numbers;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view=inflater.inflate(this.layout, parent, false);
        ImageView flagView = (ImageView) view.findViewById(R.id.pic);
        TextView nameView = (TextView) view.findViewById(R.id.number);
        Enumeration number = numbers.get(position);
        flagView.setImageResource(number.getPicResource());
        nameView.setText(number.getNumber());
        (view.findViewById(R.id.bg)).setBackgroundColor(number.getColor());

        return view;
    }
}