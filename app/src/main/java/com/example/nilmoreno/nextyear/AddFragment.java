package com.example.nilmoreno.nextyear;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment {

    TextView detailTextView;
    Bundle args;
    String text;

    public AddFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        args=getArguments();
        if (args != null)
        {
            detailTextView = (TextView) this.getActivity().findViewById(R.id.detailTextView);
            text = args.getString("opcion añadida");
        }
        else
        {
            Toast toast = Toast.makeText(getActivity(), "Opció vacía", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        detailTextView = (TextView) this.getActivity().findViewById(R.id.detailTextView);
        if (args != null)
        {
            detailTextView.setText(text);
        }
    }
}
