package th.p047co.dtac.android.dtacone.configuration.fragment;

import androidx.fragment.app.Fragment;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("th.co.dtac.android.dtacone.configuration.PerFragment")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.fragment.FragmentModule_FragmentFactory */
/* loaded from: classes7.dex */
public final class FragmentModule_FragmentFactory implements Factory<Fragment> {

    /* renamed from: a */
    public final FragmentModule f83518a;

    public FragmentModule_FragmentFactory(FragmentModule fragmentModule) {
        this.f83518a = fragmentModule;
    }

    public static FragmentModule_FragmentFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_FragmentFactory(fragmentModule);
    }

    public static Fragment fragment(FragmentModule fragmentModule) {
        return (Fragment) Preconditions.checkNotNullFromProvides(fragmentModule.m19770a());
    }

    @Override // javax.inject.Provider
    public Fragment get() {
        return fragment(this.f83518a);
    }
}