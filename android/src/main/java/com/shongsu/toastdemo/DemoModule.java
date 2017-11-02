package com.shongsu.toastdemo;

  import android.widget.Toast;

  import com.facebook.react.bridge.NativeModule;
  import com.facebook.react.bridge.ReactApplicationContext;
  import com.facebook.react.bridge.ReactContext;
  import com.facebook.react.bridge.ReactContextBaseJavaModule;
  import com.facebook.react.bridge.ReactMethod;

  public class DemoModule extends ReactContextBaseJavaModule {

    public DemoModule(ReactApplicationContext reactContext) {
      super(reactContext);
    }

    @Override
    public String getName() {
      return "DemoModule";
    }

    @ReactMethod
    public void alert(String message) {
      Toast.makeText(getReactApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
  }
