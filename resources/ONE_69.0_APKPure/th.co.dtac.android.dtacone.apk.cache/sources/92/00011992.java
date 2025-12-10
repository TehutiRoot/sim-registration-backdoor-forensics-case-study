package th.p047co.dtac.android.dtacone.manager.cardreader.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.MobileRTRApplication;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/manager/cardreader/bluetooth/BluetoothReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/content/Context;)Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;", "Landroid/bluetooth/BluetoothDevice;", "device", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/bluetooth/BluetoothDevice;)Z", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.manager.cardreader.bluetooth.BluetoothReceiver */
/* loaded from: classes7.dex */
public final class BluetoothReceiver extends BroadcastReceiver {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public static final String f84989a = BluetoothReceiver.class.getSimpleName();

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/manager/cardreader/bluetooth/BluetoothReceiver$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.manager.cardreader.bluetooth.BluetoothReceiver$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* renamed from: a */
    public final CardReaderService m19511a(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type th.co.dtac.android.dtacone.MobileRTRApplication");
        CardReaderService bluetoothService = ((MobileRTRApplication) applicationContext).component().getBluetoothService();
        Intrinsics.checkNotNullExpressionValue(bluetoothService, "context.applicationConte…        .bluetoothService");
        return bluetoothService;
    }

    /* renamed from: b */
    public final boolean m19510b(BluetoothDevice bluetoothDevice) {
        return bluetoothDevice != null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String action = intent.getAction();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (m19510b(bluetoothDevice) && action != null) {
            int hashCode = action.hashCode();
            String str = null;
            if (hashCode != -301431627) {
                if (hashCode != 1167529923) {
                    if (hashCode == 1821585647 && action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                        if (bluetoothDevice != null) {
                            str = bluetoothDevice.getName();
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(" receive status ACTION_ACL_DISCONNECTED");
                        m19511a(context).disconnectDevice(bluetoothDevice);
                    }
                } else if (action.equals("android.bluetooth.device.action.FOUND")) {
                    if (bluetoothDevice != null) {
                        str = bluetoothDevice.getName();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Found : ");
                    sb2.append(str);
                }
            } else if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                if (bluetoothDevice != null) {
                    str = bluetoothDevice.getName();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" receive status ACTION_ACL_CONNECTED");
                m19511a(context).connectDevice(bluetoothDevice);
            }
        }
    }
}