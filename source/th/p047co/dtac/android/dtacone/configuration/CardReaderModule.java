package th.p047co.dtac.android.dtacone.configuration;

import android.app.Application;
import android.hardware.usb.UsbManager;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderHandler;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.cardreader.bluetooth.BluetoothService;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0017JF\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0017¨\u0006\u0014"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/CardReaderModule;", "", "()V", "provideCardReaderHandler", "Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderHandler;", "bus", "Lth/co/dtac/android/dtacone/manager/bus/RxBus;", "provideCardReaderService", "Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;", "usbManager", "Landroid/hardware/usb/UsbManager;", "cardReaderHandler", "threadService", "Lth/co/dtac/android/dtacone/manager/service/RxThreadService;", "application", "Landroid/app/Application;", "bluetoothService", "Lth/co/dtac/android/dtacone/manager/cardreader/bluetooth/BluetoothService;", "temporaryCache", "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@Module
/* renamed from: th.co.dtac.android.dtacone.configuration.CardReaderModule */
/* loaded from: classes7.dex */
public class CardReaderModule {
    public static final int $stable = 0;

    @Provides
    @Singleton
    @NotNull
    public CardReaderHandler provideCardReaderHandler(@NotNull RxBus<Object> bus) {
        Intrinsics.checkNotNullParameter(bus, "bus");
        return new CardReaderHandler(Looper.getMainLooper(), bus);
    }

    @Provides
    @Singleton
    @NotNull
    public CardReaderService provideCardReaderService(@NotNull UsbManager usbManager, @NotNull CardReaderHandler cardReaderHandler, @NotNull RxBus<Object> bus, @NotNull RxThreadService threadService, @NotNull Application application, @NotNull BluetoothService bluetoothService, @NotNull TemporaryCache temporaryCache) {
        Intrinsics.checkNotNullParameter(usbManager, "usbManager");
        Intrinsics.checkNotNullParameter(cardReaderHandler, "cardReaderHandler");
        Intrinsics.checkNotNullParameter(bus, "bus");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(bluetoothService, "bluetoothService");
        Intrinsics.checkNotNullParameter(temporaryCache, "temporaryCache");
        return new CardReaderService(usbManager, cardReaderHandler, bus, threadService, application, bluetoothService, temporaryCache);
    }
}
