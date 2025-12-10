package th.p047co.dtac.android.dtacone.repository.otp_transaction;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.repository.otp_transaction.OtpTransactionRepository_Factory */
/* loaded from: classes8.dex */
public final class OtpTransactionRepository_Factory implements Factory<OtpTransactionRepository> {

    /* renamed from: a */
    public final Provider f86957a;

    public OtpTransactionRepository_Factory(Provider<RTRApiRx2> provider) {
        this.f86957a = provider;
    }

    public static OtpTransactionRepository_Factory create(Provider<RTRApiRx2> provider) {
        return new OtpTransactionRepository_Factory(provider);
    }

    public static OtpTransactionRepository newInstance(RTRApiRx2 rTRApiRx2) {
        return new OtpTransactionRepository(rTRApiRx2);
    }

    @Override // javax.inject.Provider
    public OtpTransactionRepository get() {
        return newInstance((RTRApiRx2) this.f86957a.get());
    }
}