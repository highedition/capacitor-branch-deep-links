package co.hied;

import static co.hied.BranchDeepLinks.getBranchInstance;

import androidx.multidex.MultiDexApplication;

public class BranchMultiDexApp extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        getBranchInstance(this);
    }
}
