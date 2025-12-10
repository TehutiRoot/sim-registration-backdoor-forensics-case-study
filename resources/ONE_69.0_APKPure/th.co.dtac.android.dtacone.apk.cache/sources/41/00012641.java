package th.p047co.dtac.android.dtacone.repository.take_photo;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.util.Converter;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.repository.take_photo.TakePhotoRepository_Factory */
/* loaded from: classes8.dex */
public final class TakePhotoRepository_Factory implements Factory<TakePhotoRepository> {

    /* renamed from: a */
    public final Provider f86970a;

    /* renamed from: b */
    public final Provider f86971b;

    /* renamed from: c */
    public final Provider f86972c;

    public TakePhotoRepository_Factory(Provider<RTRApiRx2> provider, Provider<Converter> provider2, Provider<RtrRx2Repository> provider3) {
        this.f86970a = provider;
        this.f86971b = provider2;
        this.f86972c = provider3;
    }

    public static TakePhotoRepository_Factory create(Provider<RTRApiRx2> provider, Provider<Converter> provider2, Provider<RtrRx2Repository> provider3) {
        return new TakePhotoRepository_Factory(provider, provider2, provider3);
    }

    public static TakePhotoRepository newInstance(RTRApiRx2 rTRApiRx2, Converter converter, RtrRx2Repository rtrRx2Repository) {
        return new TakePhotoRepository(rTRApiRx2, converter, rtrRx2Repository);
    }

    @Override // javax.inject.Provider
    public TakePhotoRepository get() {
        return newInstance((RTRApiRx2) this.f86970a.get(), (Converter) this.f86971b.get(), (RtrRx2Repository) this.f86972c.get());
    }
}