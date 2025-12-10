package th.p047co.dtac.android.dtacone.manager.cardreader.usb;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import com.feitian.readerdk.Tool.C6139DK;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.perf.util.Constants;

/* renamed from: th.co.dtac.android.dtacone.manager.cardreader.usb.UsbDeviceService */
/* loaded from: classes7.dex */
public class UsbDeviceService {

    /* renamed from: a */
    public UsbManager f85005a;

    /* renamed from: b */
    public UsbDevice f85006b;

    /* renamed from: c */
    public UsbDeviceConnection f85007c;

    /* renamed from: d */
    public UsbInterface f85008d;

    /* renamed from: e */
    public UsbEndpoint f85009e;

    /* renamed from: f */
    public UsbEndpoint f85010f;

    public UsbDeviceService(UsbManager usbManager, UsbDevice usbDevice) {
        this.f85005a = usbManager;
        this.f85006b = usbDevice;
    }

    public int open() {
        release();
        UsbInterface usbInterface = this.f85006b.getInterface(0);
        this.f85008d = usbInterface;
        int endpointCount = usbInterface.getEndpointCount();
        for (int i = 0; i < endpointCount; i++) {
            UsbEndpoint endpoint = this.f85008d.getEndpoint(i);
            int direction = endpoint.getDirection();
            if (2 == endpoint.getType()) {
                if (direction == 0) {
                    this.f85010f = endpoint;
                } else if (128 == direction) {
                    this.f85009e = endpoint;
                }
            }
        }
        if (this.f85009e == null || this.f85010f == null) {
            return C6139DK.RETURN_ERROR;
        }
        UsbDeviceConnection openDevice = this.f85005a.openDevice(this.f85006b);
        this.f85007c = openDevice;
        if (openDevice == null) {
            return C6139DK.RETURN_ERROR;
        }
        openDevice.claimInterface(this.f85008d, true);
        return 0;
    }

    public int read(byte[] bArr, int[] iArr) {
        do {
            try {
                int bulkTransfer = this.f85007c.bulkTransfer(this.f85009e, bArr, bArr.length, 6000);
                iArr[0] = bulkTransfer;
                if (bulkTransfer < 10) {
                    return C6139DK.RETURN_ERROR;
                }
            } catch (Exception unused) {
                iArr[0] = 0;
                return C6139DK.RETURN_ERROR;
            }
        } while ((bArr[7] & 128) != 0);
        if ((bArr[8] & SignedBytes.MAX_POWER_OF_TWO) != 0) {
            return C6139DK.RETURN_ERROR;
        }
        return 0;
    }

    public int release() {
        UsbDeviceConnection usbDeviceConnection = this.f85007c;
        if (usbDeviceConnection != null) {
            if (!usbDeviceConnection.releaseInterface(this.f85008d)) {
                this.f85007c.close();
            }
            this.f85007c = null;
            return 0;
        }
        return C6139DK.TRANS_RETURN_ERROR;
    }

    public int write(byte[] bArr, int i) {
        try {
            this.f85007c.bulkTransfer(this.f85010f, bArr, i, Constants.MAX_URL_LENGTH);
            return 0;
        } catch (Exception unused) {
            return C6139DK.RETURN_ERROR;
        }
    }
}