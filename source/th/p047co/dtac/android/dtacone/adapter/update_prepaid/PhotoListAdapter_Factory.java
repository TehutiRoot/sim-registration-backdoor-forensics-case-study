package th.p047co.dtac.android.dtacone.adapter.update_prepaid;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.adapter.update_prepaid.PhotoListAdapter_Factory */
/* loaded from: classes7.dex */
public final class PhotoListAdapter_Factory implements Factory<PhotoListAdapter> {

    /* renamed from: a */
    public final Provider f81560a;

    /* renamed from: b */
    public final Provider f81561b;

    public PhotoListAdapter_Factory(Provider<Application> provider, Provider<BitmapUtil> provider2) {
        this.f81560a = provider;
        this.f81561b = provider2;
    }

    public static PhotoListAdapter_Factory create(Provider<Application> provider, Provider<BitmapUtil> provider2) {
        return new PhotoListAdapter_Factory(provider, provider2);
    }

    public static PhotoListAdapter newInstance(Application application, BitmapUtil bitmapUtil) {
        return new PhotoListAdapter(application, bitmapUtil);
    }

    @Override // javax.inject.Provider
    public PhotoListAdapter get() {
        return newInstance((Application) this.f81560a.get(), (BitmapUtil) this.f81561b.get());
    }
}
