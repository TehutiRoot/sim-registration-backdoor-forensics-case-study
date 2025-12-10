package th.p047co.dtac.android.dtacone.configuration;

import android.app.Activity;

/* renamed from: th.co.dtac.android.dtacone.configuration.AbstractActivityComponent */
/* loaded from: classes7.dex */
public interface AbstractActivityComponent<T extends Activity> {
    Activity activity();

    void inject(T t);
}