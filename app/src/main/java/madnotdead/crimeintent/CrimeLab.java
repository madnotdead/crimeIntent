package madnotdead.crimeintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by thecocacolauser on 6/8/16.
 */
public class CrimeLab {

    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimes;

    public static CrimeLab get(Context context){
        if(sCrimeLab == null)
            return new CrimeLab(context);

        return sCrimeLab;
    }

    private CrimeLab(Context contex){
        mCrimes = new ArrayList<>();

        Crime crime = null;
        for (int i = 0; i < 100; i++) {
            crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i % 2 == 0);
            mCrimes.add(crime);
        }
    }

    public List<Crime> getCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id){

        for (Crime crime:mCrimes) {

                if(crime.getId().equals(id)){
                    return crime;
                }

        }
        return null;
    }
}
