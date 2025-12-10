package th.p047co.dtac.android.dtacone.repository.otp_v3;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.repository.otp_v3.OtpV3Repository_Factory */
/* loaded from: classes8.dex */
public final class OtpV3Repository_Factory implements Factory<OtpV3Repository> {

    /* renamed from: a */
    public final Provider f86960a;

    public OtpV3Repository_Factory(Provider<RTRApiRx2> provider) {
        this.f86960a = provider;
    }

    public static OtpV3Repository_Factory create(Provider<RTRApiRx2> provider) {
        return new OtpV3Repository_Factory(provider);
    }

    public static OtpV3Repository newInstance(RTRApiRx2 rTRApiRx2) {
        return new OtpV3Repository(rTRApiRx2);
    }

    @Override // javax.inject.Provider
    public OtpV3Repository get() {
        return newInstance((RTRApiRx2) this.f86960a.get());
    }
}