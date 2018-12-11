// -*- mode: java; c-basic-offset: 2; -*-
// Copyright © 2017-2018 Massachusetts Institute of Technology, All rights reserved.
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0

package com.google.appinventor.components.runtime;


import com.google.appinventor.components.runtime.shadows.org.osmdroid.tileprovider.modules.ShadowMapTileModuleProviderBase;
import com.google.appinventor.components.runtime.shadows.org.osmdroid.views.ShadowMapView;
import org.junit.Before;
import org.junit.Test;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test class for Switch component.
 *
 * @author srlane@mit.edu (Susan Rati Lane)
 */
@Config(shadows = {ShadowMapView.class, ShadowMapTileModuleProviderBase.class})

public class CheckboxTest extends ToggleTestBase {

  private CheckBox aCheckbox;

  @Before
  public void SetUp() {
    super.setUp();
    aCheckbox = new CheckBox(getForm());
    aToggle = aCheckbox;
  }

  @Test
  public void testCheckboxSharedDefaults() {
    testToggleDefaults();
  }

  @Test
  public void testCheckboxSharedProperties() {
    testTogglelProperties();
  }

  @Test
  public void testCheckboxEnabled() {
    testToggleEnabled();
  }

  @Test
  public void testCheckboxChecked() {
    aCheckbox.Checked(false);
    assertFalse(aCheckbox.Checked());

    aCheckbox.Checked(true);
    assertTrue(aCheckbox.Checked());
  }

}
