package cat.udl.eps.fragments.ejflexible;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFrag extends Fragment{

	TextView tview;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
}

	@Override
	public void onViewCreated(@NonNull View v, Bundle savedInstanceState) {
		super.onViewCreated(v, savedInstanceState);
		tview = v.findViewById(R.id.captain);
		}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.detail_fragment, container, false);
		}

	public void mostrarDetalle(String item) {
		tview.setText(item);
		}

}
