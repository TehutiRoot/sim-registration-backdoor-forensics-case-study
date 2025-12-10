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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.otp_transaction.OtpTransactionViewModel_Factory */
/* loaded from: classes9.dex */
public final class OtpTransactionViewModel_Factory implements Factory<OtpTransactionViewModel> {

    /* renamed from: a */
    public final Provider f106994a;

    /* renamed from: b */
    public final Provider f106995b;

    /* renamed from: c */
    public final Provider f106996c;

    /* renamed from: d */
    public final Provider f106997d;

    public OtpTransactionViewModel_Factory(Provider<OtpTransactionRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<ServerErrorService> provider4) {
        this.f106994a = provider;
        this.f106995b = provider2;
        this.f106996c = provider3;
        this.f106997d = provider4;
    }

    public static OtpTransactionViewModel_Factory create(Provider<OtpTransactionRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<ServerErrorService> provider4) {
        return new OtpTransactionViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static OtpTransactionViewModel newInstance(OtpTransactionRepository otpTransactionRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new OtpTransactionViewModel(otpTransactionRepository, configurationRepository, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public OtpTransactionViewModel get() {
        return newInstance((OtpTransactionRepository) this.f106994a.get(), (ConfigurationRepository) this.f106995b.get(), (Rx2ThreadService) this.f106996c.get(), (ServerErrorService) this.f106997d.get());
    }
}