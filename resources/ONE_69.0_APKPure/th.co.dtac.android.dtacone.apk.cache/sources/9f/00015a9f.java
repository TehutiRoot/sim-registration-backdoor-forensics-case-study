package th.p047co.dtac.android.dtacone.viewmodel.otp_transaction;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.otp_transaction.OtpTransactionRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.otp_transaction.OtpTransactionViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class OtpTransactionViewModelFactory_Factory implements Factory<OtpTransactionViewModelFactory> {

    /* renamed from: a */
    public final Provider f106990a;

    /* renamed from: b */
    public final Provider f106991b;

    /* renamed from: c */
    public final Provider f106992c;

    /* renamed from: d */
    public final Provider f106993d;

    public OtpTransactionViewModelFactory_Factory(Provider<OtpTransactionRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<ServerErrorService> provider4) {
        this.f106990a = provider;
        this.f106991b = provider2;
        this.f106992c = provider3;
        this.f106993d = provider4;
    }

    public static OtpTransactionViewModelFactory_Factory create(Provider<OtpTransactionRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<ServerErrorService> provider4) {
        return new OtpTransactionViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static OtpTransactionViewModelFactory newInstance(OtpTransactionRepository otpTransactionRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new OtpTransactionViewModelFactory(otpTransactionRepository, configurationRepository, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public OtpTransactionViewModelFactory get() {
        return newInstance((OtpTransactionRepository) this.f106990a.get(), (ConfigurationRepository) this.f106991b.get(), (Rx2ThreadService) this.f106992c.get(), (ServerErrorService) this.f106993d.get());
    }
}