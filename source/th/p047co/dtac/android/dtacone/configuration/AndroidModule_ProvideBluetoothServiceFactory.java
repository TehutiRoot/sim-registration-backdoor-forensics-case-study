package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import th.p047co.dtac.android.dtacone.manager.cardreader.bluetooth.BluetoothService;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideBluetoothServiceFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideBluetoothServiceFactory implements Factory<BluetoothService> {

    /* renamed from: a */
    public final AndroidModule f83058a;

    public AndroidModule_ProvideBluetoothServiceFactory(AndroidModule androidModule) {
        this.f83058a = androidModule;
    }

    public static AndroidModule_ProvideBluetoothServiceFactory create(AndroidModule androidModule) {
        return new AndroidModule_ProvideBluetoothServiceFactory(androidModule);
    }

    public static BluetoothService provideBluetoothService(AndroidModule androidModule) {
        return (BluetoothService) Preconditions.checkNotNullFromProvides(androidModule.m19641d());
    }

    @Override // javax.inject.Provider
    public BluetoothService get() {
        return provideBluetoothService(this.f83058a);
    }
}
