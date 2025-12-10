package th.p047co.dtac.android.dtacone.adapter.settings;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.adapter.settings.OtherMenuAdapter_Factory */
/* loaded from: classes7.dex */
public final class OtherMenuAdapter_Factory implements Factory<OtherMenuAdapter> {

    /* renamed from: a */
    public final Provider f81521a;

    public OtherMenuAdapter_Factory(Provider<Activity> provider) {
        this.f81521a = provider;
    }

    public static OtherMenuAdapter_Factory create(Provider<Activity> provider) {
        return new OtherMenuAdapter_Factory(provider);
    }

    public static OtherMenuAdapter newInstance(Activity activity) {
        return new OtherMenuAdapter(activity);
    }

    @Override // javax.inject.Provider
    public OtherMenuAdapter get() {
        return newInstance((Activity) this.f81521a.get());
    }
}
