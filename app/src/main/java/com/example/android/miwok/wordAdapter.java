package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by pawan on 24-02-2018.
 */

public class wordAdapter extends ArrayAdapter<word>
{ int colors_resouce;
    public wordAdapter(@NonNull Context context,ArrayList<word> words,int color) {
        super(context,0, words);
        colors_resouce = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        word currentNumber = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_lang);
        // set this text on the name TextView
        nameTextView.setText(currentNumber.get_miwok_translation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.eng_lang);
        // set this text on the number TextView
        numberTextView.setText(currentNumber.get_eng_translations());

        // Find the imageview in the list_item.xml layout with the ID version_number
        ImageView show_image = (ImageView) listItemView.findViewById(R.id.image_display);
        //set the required image
        if(currentNumber.has_image()) {
            show_image.setImageResource(currentNumber.getImages_resourceid());
        }
        else{
            show_image.setVisibility(View.GONE);
        }
                // Set the theme color for the list item
                    View textContainer = listItemView.findViewById(R.id.text_container);
                // Find the color that the resource ID maps to
                       int color = ContextCompat.getColor(getContext(), colors_resouce);
               // Set the background color of the text container View
                       textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
