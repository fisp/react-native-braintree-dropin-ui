package tech.power.RNBraintreeDropIn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;

import android.content.Context;
import expo.modules.core.interfaces.Package;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;

public class RNBraintreeDropInPackage implements ReactPackage {
    @Override
    public List<? extends ReactActivityLifecycleListener> createReactActivityLifecycleListeners(Context activityContext) {
      return Collections.singletonList(new MyLibReactActivityLifecycleListener());
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
      return Arrays.<NativeModule>asList(new RNBraintreeDropInModule(reactContext));
    }

    // Deprecated from RN 0.47
    public List<Class<? extends JavaScriptModule>> createJSModules() {
      return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
      return Collections.emptyList();
    }
}
