package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_pre2post.MrtrPre2PostRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideMrtrPre2PostRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideMrtrPre2PostRepositoryFactory implements Factory<MrtrPre2PostRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83255a;

    /* renamed from: b */
    public final Provider f83256b;

    /* renamed from: c */
    public final Provider f83257c;

    /* renamed from: d */
    public final Provider f83258d;

    /* renamed from: e */
    public final Provider f83259e;

    /* renamed from: f */
    public final Provider f83260f;

    public SingletonRepositoryModule_ProvideMrtrPre2PostRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<FileUtil> provider4, Provider<CompressImage> provider5) {
        this.f83255a = singletonRepositoryModule;
        this.f83256b = provider;
        this.f83257c = provider2;
        this.f83258d = provider3;
        this.f83259e = provider4;
        this.f83260f = provider5;
    }

    public static SingletonRepositoryModule_ProvideMrtrPre2PostRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<FileUtil> provider4, Provider<CompressImage> provider5) {
        return new SingletonRepositoryModule_ProvideMrtrPre2PostRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrPre2PostRepository provideMrtrPre2PostRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository, FileUtil fileUtil, CompressImage compressImage) {
        return (MrtrPre2PostRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideMrtrPre2PostRepository(rTRApiRx2, rtrRx2Repository, configurationRepository, fileUtil, compressImage));
    }

    @Override // javax.inject.Provider
    public MrtrPre2PostRepository get() {
        return provideMrtrPre2PostRepository(this.f83255a, (RTRApiRx2) this.f83256b.get(), (RtrRx2Repository) this.f83257c.get(), (ConfigurationRepository) this.f83258d.get(), (FileUtil) this.f83259e.get(), (CompressImage) this.f83260f.get());
    }
}
