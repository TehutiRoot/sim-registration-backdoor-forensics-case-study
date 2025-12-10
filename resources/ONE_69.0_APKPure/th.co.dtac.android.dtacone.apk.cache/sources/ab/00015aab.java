package th.p047co.dtac.android.dtacone.viewmodel.otp_v3;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.otp_v3.OtpV3Repository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.otp_v3.OtpV3ViewModel_Factory */
/* loaded from: classes9.dex */
public final class OtpV3ViewModel_Factory implements Factory<OtpV3ViewModel> {

    /* renamed from: a */
    public final Provider f107013a;

    /* renamed from: b */
    public final Provider f107014b;

    /* renamed from: c */
    public final Provider f107015c;

    public OtpV3ViewModel_Factory(Provider<OtpV3Repository> provider, Provider<Rx2ThreadService> provider2, Provider<MrtrErrorService> provider3) {
        this.f107013a = provider;
        this.f107014b = provider2;
        this.f107015c = provider3;
    }

    public static OtpV3ViewModel_Factory create(Provider<OtpV3Repository> provider, Provider<Rx2ThreadService> provider2, Provider<MrtrErrorService> provider3) {
        return new OtpV3ViewModel_Factory(provider, provider2, provider3);
    }

    public static OtpV3ViewModel newInstance(OtpV3Repository otpV3Repository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new OtpV3ViewModel(otpV3Repository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public OtpV3ViewModel get() {
        return newInstance((OtpV3Repository) this.f107013a.get(), (Rx2ThreadService) this.f107014b.get(), (MrtrErrorService) this.f107015c.get());
    }
}