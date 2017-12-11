package c.assignment_102;

/**
 * Created by abhi on 11/12/17.
 */

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class placeHolder extends ListFragment {

    Button layoutBtn;
    public placeHolder(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View listFragment= inflater.inflate(R.layout.list_fragment, container, false);

        String[] buttonLabel = {"Layout 1","Layout 2","Layout 3","Layout 4","Layout 5",};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.row, R.id.layoutBtn, buttonLabel);
        setListAdapter(adapter);

        return listFragment;
    }
}
