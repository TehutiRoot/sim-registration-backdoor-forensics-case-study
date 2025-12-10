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
    public final Provider f81651a;

    /* renamed from: b */
    public final Provider f81652b;

    public PhotoListAdapter_Factory(Provider<Application> provider, Provider<BitmapUtil> provider2) {
        this.f81651a = provider;
        this.f81652b = provider2;
    }

    public static PhotoListAdapter_Factory create(Provider<Application> provider, Provider<BitmapUtil> provider2) {
        return new PhotoListAdapter_Factory(provider, provider2);
    }

    public static PhotoListAdapter newInstance(Application application, BitmapUtil bitmapUtil) {
        return new PhotoListAdapter(application, bitmapUtil);
    }

    @Override // javax.inject.Provider
    public PhotoListAdapter get() {
        return newInstance((Application) this.f81651a.get(), (BitmapUtil) this.f81652b.get());
    }
}