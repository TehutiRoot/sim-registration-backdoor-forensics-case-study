package th.p047co.dtac.android.dtacone.adapter.online_register;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.adapter.online_register.AdditionalImageAdapter_Factory */
/* loaded from: classes7.dex */
public final class AdditionalImageAdapter_Factory implements Factory<AdditionalImageAdapter> {

    /* renamed from: a */
    public final Provider f81420a;

    /* renamed from: b */
    public final Provider f81421b;

    public AdditionalImageAdapter_Factory(Provider<Activity> provider, Provider<BitmapUtil> provider2) {
        this.f81420a = provider;
        this.f81421b = provider2;
    }

    public static AdditionalImageAdapter_Factory create(Provider<Activity> provider, Provider<BitmapUtil> provider2) {
        return new AdditionalImageAdapter_Factory(provider, provider2);
    }

    public static AdditionalImageAdapter newInstance(Activity activity, BitmapUtil bitmapUtil) {
        return new AdditionalImageAdapter(activity, bitmapUtil);
    }

    @Override // javax.inject.Provider
    public AdditionalImageAdapter get() {
        return newInstance((Activity) this.f81420a.get(), (BitmapUtil) this.f81421b.get());
    }
}