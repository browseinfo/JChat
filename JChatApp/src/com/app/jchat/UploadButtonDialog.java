package com.app.jchat;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UploadButtonDialog extends DialogFragment {
	public UploadButtonDialog() {
        // Empty constructor required for DialogFragment
    }
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.custom_upload_dialog, container);
        
        String names[] ={"A","B","C","D"};
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity().getApplicationContext());
//        LayoutInflater inflater = getLayoutInflater();
//        View convertView = (View) inflater.inflate(R.layout.custom_upload_dialog, null);
        alertDialog.setView(view);
        alertDialog.setTitle("Upload");
        ListView lv = (ListView) view.findViewById(R.id.listUploadItems);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(),android.R.layout.simple_list_item_1,names);
        lv.setAdapter(adapter);
        alertDialog.create().show();
        
        return view;
    }
}
