// Generated by Dagger (https://google.github.io/dagger).
package org.sagebionetworks.research.motor_control_module.inject;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class TappingStepModule_ProvideTappingStepTypeKeyFactory implements Factory<String> {
  private static final TappingStepModule_ProvideTappingStepTypeKeyFactory INSTANCE =
      new TappingStepModule_ProvideTappingStepTypeKeyFactory();

  @Override
  public String get() {
    return proxyProvideTappingStepTypeKey();
  }

  public static TappingStepModule_ProvideTappingStepTypeKeyFactory create() {
    return INSTANCE;
  }

  public static String proxyProvideTappingStepTypeKey() {
    return Preconditions.checkNotNull(
        TappingStepModule.provideTappingStepTypeKey(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}