package io.ionic.starter;

import android.content.Intent;
import android.os.Bundle;
import co.hied.BranchDeepLinks;
import com.getcapacitor.BridgeActivity;
import com.getcapacitor.Plugin;
import java.util.ArrayList;

public class MainActivity extends BridgeActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializes the Bridge
        registerPlugin(BranchDeepLinks.class);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        this.setIntent(intent);
        super.onNewIntent(intent);
    }
}
