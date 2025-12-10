package th.p047co.dtac.android.dtacone.configuration;

import androidx.fragment.app.Fragment;

/* renamed from: th.co.dtac.android.dtacone.configuration.AbstractFragmentComponent */
/* loaded from: classes7.dex */
public interface AbstractFragmentComponent<T extends Fragment> {
    Fragment fragment();

    void inject(T t);
}