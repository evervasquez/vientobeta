package com.ygs.yurimaguas1;

import com.ygs.yurimaguas1.view.RadialPickerLayout;
import com.ygs.yurimaguas1.view.RadialPickerLayout.OnValueSelectedListener;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentView extends Fragment implements OnValueSelectedListener{
	private RadialPickerLayout mTimePicker;
	public FragmentView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.time_picker_dialog, container,false);
		mTimePicker = (RadialPickerLayout) view.findViewById(R.id.time_picker);
        mTimePicker.setOnValueSelectedListener(this);
        mTimePicker.initialize(getActivity(), 2, 2, true);
		return view;
	}

	@Override
	public void onValueSelected(int pickerIndex, int newValue,
			boolean autoAdvance) {
		// TODO Auto-generated method stub
		
	}
	
}
