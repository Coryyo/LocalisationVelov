package com.example.yoanncorreia.localisationvelov;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by christophe on 16/02/15.
 */


public class ListViewAdapterPerso extends ArrayAdapter<Field> {

    private final Context context;
    private final List<Field> values;
    private View rowView;


    public ListViewAdapterPerso(Context context, List<Field> values) {
        super(context, R.layout.list_view_detail_item, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        rowView = inflater.inflate(R.layout.list_view_detail_item, parent, false);
        TextView firstLine = (TextView) rowView.findViewById(R.id.textView);
        TextView secondLine = (TextView) rowView.findViewById(R.id.textView2);
        TextView thirdLine = (TextView) rowView.findViewById(R.id.textView3);
        TextView fourLine = (TextView) rowView.findViewById(R.id.textView4);

        firstLine.setText(values.get(position).getName());
        secondLine.setText(values.get(position).getAddress());
        thirdLine.setText(values.get(position).getStatus());
        fourLine.setText(" Number bike stands : "+values.get(position).getBike_stands());

        return rowView;
    }

}
