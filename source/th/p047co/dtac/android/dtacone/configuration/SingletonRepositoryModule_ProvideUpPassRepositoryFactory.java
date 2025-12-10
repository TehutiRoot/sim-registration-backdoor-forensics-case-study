package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.upPass.UpPassApi;
import th.p047co.dtac.android.dtacone.repository.upPass.UpPassRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideUpPassRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideUpPassRepositoryFactory implements Factory<UpPassRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83406a;

    /* renamed from: b */
    public final Provider f83407b;

    /* renamed from: c */
    public final Provider f83408c;

    /* renamed from: d */
    public final Provider f83409d;

    /* renamed from: e */
    public final Provider f83410e;

    /* renamed from: f */
    public final Provider f83411f;

    public SingletonRepositoryModule_ProvideUpPassRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<UpPassApi> provider, Provider<RtrRx2Repository> provider2, Provider<PreferencesViewModel> provider3, Provider<BitmapUtil> provider4, Provider<FileUtil> provider5) {
        this.f83406a = singletonRepositoryModule;
        this.f83407b = provider;
        this.f83408c = provider2;
        this.f83409d = provider3;
        this.f83410e = provider4;
        this.f83411f = provider5;
    }

    public static SingletonRepositoryModule_ProvideUpPassRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<UpPassApi> provider, Provider<RtrRx2Repository> provider2, Provider<PreferencesViewModel> provider3, Provider<BitmapUtil> provider4, Provider<FileUtil> provider5) {
        return new SingletonRepositoryModule_ProvideUpPassRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3, provider4, provider5);
    }

    public static UpPassRepository provideUpPassRepository(SingletonRepositoryModule singletonRepositoryModule, UpPassApi upPassApi, RtrRx2Repository rtrRx2Repository, PreferencesViewModel preferencesViewModel, BitmapUtil bitmapUtil, FileUtil fileUtil) {
        return (UpPassRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideUpPassRepository(upPassApi, rtrRx2Repository, preferencesViewModel, bitmapUtil, fileUtil));
    }

    @Override // javax.inject.Provider
    public UpPassRepository get() {
        return provideUpPassRepository(this.f83406a, (UpPassApi) this.f83407b.get(), (RtrRx2Repository) this.f83408c.get(), (PreferencesViewModel) this.f83409d.get(), (BitmapUtil) this.f83410e.get(), (FileUtil) this.f83411f.get());
    }
}
