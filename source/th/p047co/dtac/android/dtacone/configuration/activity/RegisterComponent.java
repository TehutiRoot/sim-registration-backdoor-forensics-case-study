package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.RegisterActivity;
import th.p047co.dtac.android.dtacone.view.fragment.register.RegisterNonSimRFragment;
import th.p047co.dtac.android.dtacone.view.fragment.register.RegisterOtpRequestFragment;
import th.p047co.dtac.android.dtacone.view.fragment.register.RegisterOtpVerifyFragment;
import th.p047co.dtac.android.dtacone.view.fragment.register.RegisterSimRFragment;

@Subcomponent(modules = {ActivityModule.class})
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.RegisterComponent */
/* loaded from: classes7.dex */
public interface RegisterComponent extends AbstractActivityComponent<RegisterActivity> {
    void inject(RegisterNonSimRFragment registerNonSimRFragment);

    void inject(RegisterOtpRequestFragment registerOtpRequestFragment);

    void inject(RegisterOtpVerifyFragment registerOtpVerifyFragment);

    void inject(RegisterSimRFragment registerSimRFragment);
}
