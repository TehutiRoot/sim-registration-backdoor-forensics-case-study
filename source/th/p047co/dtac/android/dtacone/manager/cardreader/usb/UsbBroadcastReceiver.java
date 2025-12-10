package th.p047co.dtac.android.dtacone.manager.cardreader.usb;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Build;
import th.p047co.dtac.android.dtacone.MobileRTRApplication;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;

/* renamed from: th.co.dtac.android.dtacone.manager.cardreader.usb.UsbBroadcastReceiver */
/* loaded from: classes7.dex */
public class UsbBroadcastReceiver extends BroadcastReceiver {
    public static final String ACTION_USB_PERMISSION = "th.co.dtac.android.dtacone.USB_PERMISSION";

    /* renamed from: a */
    public static PendingIntent m19336a(Context context) {
        int i;
        Intent intent = new Intent(ACTION_USB_PERMISSION).setClass(context, UsbBroadcastReceiver.class).setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        } else {
            i = 0;
        }
        return PendingIntent.getBroadcast(context, 0, intent, i);
    }

    /* renamed from: c */
    public static UsbDevice m19334c(Intent intent) {
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("device", UsbDevice.class);
            return (UsbDevice) parcelableExtra;
        }
        return (UsbDevice) intent.getParcelableExtra("device");
    }

    /* renamed from: b */
    public final CardReaderService m19335b(Context context) {
        return ((MobileRTRApplication) context.getApplicationContext()).component().getBluetoothService();
    }

    /* renamed from: d */
    public final boolean m19333d(UsbDevice usbDevice) {
        return usbDevice != null;
    }

    public boolean isAllowUsbPermission(Intent intent) {
        return intent.getBooleanExtra("permission", false);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        UsbDevice usbDevice;
        Object parcelableExtra;
        String action = intent.getAction();
        UsbDevice m19334c = m19334c(intent);
        StringBuilder sb = new StringBuilder();
        sb.append("USB receiver action : ");
        sb.append(action);
        sb.append(" device: ");
        sb.append(m19334c);
        if (m19333d(m19334c)) {
            action.hashCode();
            char c = 65535;
            switch (action.hashCode()) {
                case -2114103349:
                    if (action.equals("android.hardware.usb.action.USB_DEVICE_ATTACHED")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1608292967:
                    if (action.equals("android.hardware.usb.action.USB_DEVICE_DETACHED")) {
                        c = 1;
                        break;
                    }
                    break;
                case -902998121:
                    if (action.equals(ACTION_USB_PERMISSION)) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    UsbManager usbManager = (UsbManager) context.getSystemService("usb");
                    if (usbManager == null) {
                        return;
                    }
                    if (usbManager.hasPermission(m19334c)) {
                        m19335b(context).connectDevice(m19334c);
                        return;
                    } else {
                        usbManager.requestPermission(m19334c, m19336a(context));
                        return;
                    }
                case 1:
                    if (m19335b(context).isConnected()) {
                        m19335b(context).disconnectDevice(m19334c);
                        return;
                    }
                    return;
                case 2:
                    boolean booleanExtra = intent.getBooleanExtra("permission", false);
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelableExtra = intent.getParcelableExtra("device", UsbDevice.class);
                        usbDevice = (UsbDevice) parcelableExtra;
                    } else {
                        usbDevice = (UsbDevice) intent.getParcelableExtra("device");
                    }
                    if (booleanExtra && usbDevice != null) {
                        m19335b(context).connectDevice(usbDevice);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
