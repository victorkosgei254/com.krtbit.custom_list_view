package com.kritbit.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<LanguageModelClass> {
    private ArrayList<LanguageModelClass> languageList;
    Context context;

    public CustomAdapter(ArrayList<LanguageModelClass> data, Context context)
    {
        super(context,R.layout.item_list_layout,data);
        this.languageList = data;
        this.context = context;
    }

    //View lookup cache
    private static class  ViewHolder{
        TextView languageName, languageDesc;
        ImageView languageLogo;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       //Get the data item for this position
        LanguageModelClass languageModelClass = getItem(position);

        //Check if an existing view is being reused otherwise inflate(display) the view
        ViewHolder viewHolder;
        final View result;
        if(convertView == null)
        {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list_layout,
                    parent,
                    false);
            viewHolder.languageName = (TextView) convertView.findViewById(R.id.lang_title);
            viewHolder.languageDesc = (TextView) convertView.findViewById(R.id.lang_usage);
            viewHolder.languageLogo = (ImageView) convertView.findViewById(R.id.lang_icon);
            result = convertView;
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        //Get the data from model class
        viewHolder.languageName.setText(languageModelClass.getLanguage_name());
        viewHolder.languageDesc.setText(languageModelClass.getLanguage_use());
        viewHolder.languageLogo.setImageResource(languageModelClass.getLanguage_logo());

        return  convertView;
    }
}
