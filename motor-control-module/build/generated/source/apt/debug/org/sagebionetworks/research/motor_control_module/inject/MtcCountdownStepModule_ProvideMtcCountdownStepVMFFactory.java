// Generated by Dagger (https://google.github.io/dagger).
package org.sagebionetworks.research.motor_control_module.inject;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.sagebionetworks.research.presentation.model.interfaces.StepView;
import org.sagebionetworks.research.presentation.show_step.show_step_view_model_factories.ShowStepViewModelFactory;

public final class MtcCountdownStepModule_ProvideMtcCountdownStepVMFFactory
    implements Factory<ShowStepViewModelFactory<?, ? extends StepView>> {
  private static final MtcCountdownStepModule_ProvideMtcCountdownStepVMFFactory INSTANCE =
      new MtcCountdownStepModule_ProvideMtcCountdownStepVMFFactory();

  @Override
  public ShowStepViewModelFactory<?, ? extends StepView> get() {
    return proxyProvideMtcCountdownStepVMF();
  }

  public static MtcCountdownStepModule_ProvideMtcCountdownStepVMFFactory create() {
    return INSTANCE;
  }

  public static ShowStepViewModelFactory<?, ? extends StepView> proxyProvideMtcCountdownStepVMF() {
    return Preconditions.checkNotNull(
        MtcCountdownStepModule.provideMtcCountdownStepVMF(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}