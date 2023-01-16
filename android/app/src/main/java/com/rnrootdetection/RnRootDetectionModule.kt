package com.rnrootdetection

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.kimchangyoun.rootbeerFresh.RootBeer

class RnRootDetectionModule(reactContext: ReactApplicationContext) :
  ReactContextBaseJavaModule(reactContext) {
  val rootBeer: RootBeer = RootBeer(reactContext)

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  fun multiply(a: Double, b: Double, promise: Promise) {
    promise.resolve(a * b)
  }

  @ReactMethod
  fun isRooted(promise: Promise) {
    promise.resolve(rootBeer.isRooted)
  }

  companion object {
    const val NAME = "RnRootDetection"
  }
}
