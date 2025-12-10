package th.p047co.dtac.android.dtacone.configuration;

import android.telephony.TelephonyManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideTelephonyManagerFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideTelephonyManagerFactory implements Factory<TelephonyManager> {

    /* renamed from: a */
    public final AndroidModule f83084a;

    public AndroidModule_ProvideTelephonyManagerFactory(AndroidModule androidModule) {
        this.f83084a = androidModule;
    }

    public static AndroidModule_ProvideTelephonyManagerFactory create(AndroidModule androidModule) {
        return new AndroidModule_ProvideTelephonyManagerFactory(androidModule);
    }

    public static TelephonyManager provideTelephonyManager(AndroidModule androidModule) {
        return (TelephonyManager) Preconditions.checkNotNullFromProvides(androidModule.m19625t());
    }

    @Override // javax.inject.Provider
    public TelephonyManager get() {
        return provideTelephonyManager(this.f83084a);
    }
}
