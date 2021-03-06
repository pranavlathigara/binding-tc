package com.artfulbits.sample;

import android.app.Activity;

import org.junit.*;
import org.junit.runner.*;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

/** First robolectric test. */
@Config(sdk = 18)
@RunWith(RobolectricTestRunner.class)
public class LoginFillRobolectricTest {

  @Test
  public void test_00_CreateActivity() {
    final Activity activity = Robolectric.buildActivity(MainActivity.class).get();

    assertTrue(null != activity);
  }
}
