package madnotdead.crimeintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Leandro on 08/06/2016.
 */
public class CrimeListFragment extends Fragment {

    private RecyclerView mCrimeRecycleView;
    private CrimeAdapter mAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_crime_list,container,false);

        mCrimeRecycleView = (RecyclerView)v.findViewById(R.id.crime_recycler_views);

        mCrimeRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private void UpdateUI(){
        CrimeLab crimeLab = CrimeLab.get(getActivity());
        List<Crime> crimes = crimeLab.getCrimes();

        mAdapter  = new CrimeAdapter(crimes);
        mCrimeRecycleView.setAdapter(mAdapter);
    }

    private class CrimeHolder extends RecyclerView.ViewHolder{

        public TextView mTitleTextView;
        public CrimeHolder(View itemView) {
            super(itemView);

            mTitleTextView = (TextView)itemView;
        }
    }

    private class CrimeAdapter extends RecyclerView.Adapter<CrimeHolder>{

        private List<Crime> mCrimes;

        public CrimeAdapter(List<Crime> crimes){
            mCrimes = crimes;
        }
        @Override
        public CrimeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(android.R.layout.simple_list_item_1,parent,false);

            return new CrimeHolder(view);
        }

        @Override
        public void onBindViewHolder(CrimeHolder holder, int position) {

            Crime mCrime = mCrimes.get(position);

            holder.mTitleTextView.setText(mCrime.getTitle());
        }

        @Override
        public int getItemCount() {
            return mCrimes.size();
        }
    }

}
