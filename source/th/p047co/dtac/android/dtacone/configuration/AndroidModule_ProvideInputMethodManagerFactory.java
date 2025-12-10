package th.p047co.dtac.android.dtacone.configuration;

import android.view.inputmethod.InputMethodManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideInputMethodManagerFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideInputMethodManagerFactory implements Factory<InputMethodManager> {

    /* renamed from: a */
    public final AndroidModule f83072a;

    public AndroidModule_ProvideInputMethodManagerFactory(AndroidModule androidModule) {
        this.f83072a = androidModule;
    }

    public static AndroidModule_ProvideInputMethodManagerFactory create(AndroidModule androidModule) {
        return new AndroidModule_ProvideInputMethodManagerFactory(androidModule);
    }

    public static InputMethodManager provideInputMethodManager(AndroidModule androidModule) {
        return (InputMethodManager) Preconditions.checkNotNullFromProvides(androidModule.m19634k());
    }

    @Override // javax.inject.Provider
    public InputMethodManager get() {
        return provideInputMethodManager(this.f83072a);
    }
}
