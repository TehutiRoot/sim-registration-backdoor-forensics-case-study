package th.p047co.dtac.android.dtacone.configuration;

import android.hardware.usb.UsbManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideUsbManagerFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideUsbManagerFactory implements Factory<UsbManager> {

    /* renamed from: a */
    public final AndroidModule f83085a;

    public AndroidModule_ProvideUsbManagerFactory(AndroidModule androidModule) {
        this.f83085a = androidModule;
    }

    public static AndroidModule_ProvideUsbManagerFactory create(AndroidModule androidModule) {
        return new AndroidModule_ProvideUsbManagerFactory(androidModule);
    }

    public static UsbManager provideUsbManager(AndroidModule androidModule) {
        return (UsbManager) Preconditions.checkNotNullFromProvides(androidModule.m19624u());
    }

    @Override // javax.inject.Provider
    public UsbManager get() {
        return provideUsbManager(this.f83085a);
    }
}
