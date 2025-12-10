package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.take_photo.TakePhotoRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideTakePhotoRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideTakePhotoRepositoryFactory implements Factory<TakePhotoRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83403a;

    /* renamed from: b */
    public final Provider f83404b;

    /* renamed from: c */
    public final Provider f83405c;

    public SingletonRepositoryModule_ProvideTakePhotoRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2) {
        this.f83403a = singletonRepositoryModule;
        this.f83404b = provider;
        this.f83405c = provider2;
    }

    public static SingletonRepositoryModule_ProvideTakePhotoRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2) {
        return new SingletonRepositoryModule_ProvideTakePhotoRepositoryFactory(singletonRepositoryModule, provider, provider2);
    }

    public static TakePhotoRepository provideTakePhotoRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository) {
        return (TakePhotoRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideTakePhotoRepository(rTRApiRx2, rtrRx2Repository));
    }

    @Override // javax.inject.Provider
    public TakePhotoRepository get() {
        return provideTakePhotoRepository(this.f83403a, (RTRApiRx2) this.f83404b.get(), (RtrRx2Repository) this.f83405c.get());
    }
}
