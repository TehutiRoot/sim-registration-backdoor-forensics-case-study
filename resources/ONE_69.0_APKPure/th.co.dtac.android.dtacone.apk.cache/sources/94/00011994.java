package th.p047co.dtac.android.dtacone.manager.cardreader.bluetooth;

import android.bluetooth.BluetoothAdapter;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/manager/cardreader/bluetooth/BluetoothService;", "", "()V", "getBluetoothService", "Landroid/bluetooth/BluetoothAdapter;", "isSupportBluetooth", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.manager.cardreader.bluetooth.BluetoothService */
/* loaded from: classes7.dex */
public class BluetoothService {
    public static final int $stable = 0;

    @Nullable
    public final BluetoothAdapter getBluetoothService() {
        return BluetoothAdapter.getDefaultAdapter();
    }

    public boolean isSupportBluetooth() {
        if (getBluetoothService() != null) {
            return true;
        }
        return false;
    }
}