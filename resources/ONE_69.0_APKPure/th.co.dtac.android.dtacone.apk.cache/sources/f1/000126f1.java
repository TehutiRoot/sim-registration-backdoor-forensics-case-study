package th.p047co.dtac.android.dtacone.util.bitmap.filter;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.util.bitmap.filter.GrayScaleFilter_Factory */
/* loaded from: classes8.dex */
public final class GrayScaleFilter_Factory implements Factory<GrayScaleFilter> {

    /* renamed from: a */
    public final Provider f87122a;

    public GrayScaleFilter_Factory(Provider<Activity> provider) {
        this.f87122a = provider;
    }

    public static GrayScaleFilter_Factory create(Provider<Activity> provider) {
        return new GrayScaleFilter_Factory(provider);
    }

    public static GrayScaleFilter newInstance(Activity activity) {
        return new GrayScaleFilter(activity);
    }

    @Override // javax.inject.Provider
    public GrayScaleFilter get() {
        return newInstance((Activity) this.f87122a.get());
    }
}