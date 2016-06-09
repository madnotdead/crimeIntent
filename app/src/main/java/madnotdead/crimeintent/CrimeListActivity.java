package madnotdead.crimeintent;

import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Leandro on 08/06/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}
