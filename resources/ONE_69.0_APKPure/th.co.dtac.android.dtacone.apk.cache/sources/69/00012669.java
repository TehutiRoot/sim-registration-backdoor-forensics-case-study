package th.p047co.dtac.android.dtacone.util;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.Fragment;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.AbstractFragmentComponent;
import th.p047co.dtac.android.dtacone.configuration.HasApplicationComponent;
import th.p047co.dtac.android.dtacone.configuration.MobileRTRComponent;
import th.p047co.dtac.android.dtacone.configuration.activity.HasActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.fragment.HasFragmentComponent;

/* renamed from: th.co.dtac.android.dtacone.util.ComponentUtil */
/* loaded from: classes8.dex */
public class ComponentUtil {
    public static <C extends AbstractActivityComponent> C getActivityComponent(Activity activity, Class<C> cls) {
        return cls.cast(((HasActivityComponent) activity).component());
    }

    public static MobileRTRComponent getApplicationComponent(Application application) {
        return ((HasApplicationComponent) application).component();
    }

    public static <F extends AbstractFragmentComponent> F getFragmentComponent(Fragment fragment, Class<F> cls) {
        return cls.cast(((HasFragmentComponent) fragment).component());
    }
}