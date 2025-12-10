package th.p047co.dtac.android.dtacone.viewmodel.upPass;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.repository.upPass.UpPassRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel_Factory */
/* loaded from: classes9.dex */
public final class UpPassViewModel_Factory implements Factory<UpPassViewModel> {

    /* renamed from: a */
    public final Provider f107164a;

    /* renamed from: b */
    public final Provider f107165b;

    public UpPassViewModel_Factory(Provider<UpPassRepository> provider, Provider<MrtrErrorService> provider2) {
        this.f107164a = provider;
        this.f107165b = provider2;
    }

    public static UpPassViewModel_Factory create(Provider<UpPassRepository> provider, Provider<MrtrErrorService> provider2) {
        return new UpPassViewModel_Factory(provider, provider2);
    }

    public static UpPassViewModel newInstance(UpPassRepository upPassRepository, MrtrErrorService mrtrErrorService) {
        return new UpPassViewModel(upPassRepository, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public UpPassViewModel get() {
        return newInstance((UpPassRepository) this.f107164a.get(), (MrtrErrorService) this.f107165b.get());
    }
}