package name.mikanoshi.customiuizer.subs;

import android.os.Bundle;
import android.preference.Preference;

import name.mikanoshi.customiuizer.SubFragment;

public class System_PopupNotif extends SubFragment {

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		findPreference("pref_key_system_popupnotif_apps").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
			@Override
			public boolean onPreferenceClick(Preference preference) {
				openApps("pref_key_system_popupnotif_apps");
				return true;
			}
		});
	}

}
