package com.nam.myui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.nam.myui.FSCLTitlesFragment.ListSelectionListener;

//Several Activity lifecycle methods are instrumented to emit LogCat output
//so you can follow this class' lifecycle
public class FSCLQuoteViewerActivity extends Activity implements
		ListSelectionListener {

	public static String[] mTitleArray;
	public static String[] mQuoteArray;
	private FSCLQuotesFragment mDetailsFragment;

	private static final String TAG = "X42";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Get the string arrays with the titles and quotes
		mTitleArray = getResources().getStringArray(R.array.Titles);
		mQuoteArray = getResources().getStringArray(R.array.Quotes);
		
		setContentView(R.layout.fragmentstaticconfiglayout);

		// Get a reference to the QuotesFragment
		mDetailsFragment = (FSCLQuotesFragment) getFragmentManager()
				.findFragmentById(R.id.details);
	}

	// Called when the user selects an item in the TitlesFragment
	@Override
	public void onListSelection(int index) {
		if (mDetailsFragment.getShownIndex() != index) {

			// Tell the QuoteFragment to show the quote string at position index
			mDetailsFragment.showQuoteAtIndex(index);
		}
	}
	
	@Override
	protected void onDestroy() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onDestroy()");
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onPause()");
		super.onPause();
	}

	@Override
	protected void onRestart() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onRestart()");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onResume()");
		super.onResume();
	}

	@Override
	protected void onStart() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onStart()");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onStop()");
		super.onStop();
	}

}