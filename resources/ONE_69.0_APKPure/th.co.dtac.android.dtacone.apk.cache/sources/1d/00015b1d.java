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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class UpPassViewModelFactory_Factory implements Factory<UpPassViewModelFactory> {

    /* renamed from: a */
    public final Provider f107162a;

    /* renamed from: b */
    public final Provider f107163b;

    public UpPassViewModelFactory_Factory(Provider<UpPassRepository> provider, Provider<MrtrErrorService> provider2) {
        this.f107162a = provider;
        this.f107163b = provider2;
    }

    public static UpPassViewModelFactory_Factory create(Provider<UpPassRepository> provider, Provider<MrtrErrorService> provider2) {
        return new UpPassViewModelFactory_Factory(provider, provider2);
    }

    public static UpPassViewModelFactory newInstance(UpPassRepository upPassRepository, MrtrErrorService mrtrErrorService) {
        return new UpPassViewModelFactory(upPassRepository, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public UpPassViewModelFactory get() {
        return newInstance((UpPassRepository) this.f107162a.get(), (MrtrErrorService) this.f107163b.get());
    }
}