package com.example.weatherforecast;

        import android.os.Bundle;

        import androidx.fragment.app.Fragment;

        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

public class DetailFragment extends Fragment {

    public DetailFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle data = getArguments();
        String detailData = null;
        if (data != null) {
            detailData = data.getString("data");
        }

        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        TextView detailTextView = (TextView)view.findViewById(R.id.detail_textview);
        detailTextView.setText(detailData);

        return view;
    }
}
