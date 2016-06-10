package madnotdead.crimeintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {

    private static final String EXTRA_CRIME_ID = "madnotdead.crimeintent.crime_id";

    public static Intent newIntent(Context context, UUID crimeId){

        Intent i = new Intent(context, CrimeActivity.class);
        i.putExtra(EXTRA_CRIME_ID, crimeId);
        return i;
    }

    @Override
    protected Fragment createFragment() {

        UUID crimeId = (UUID)getIntent()
                .getSerializableExtra(EXTRA_CRIME_ID);

        return CrimeFragment.newInstance(crimeId);
    }
}
