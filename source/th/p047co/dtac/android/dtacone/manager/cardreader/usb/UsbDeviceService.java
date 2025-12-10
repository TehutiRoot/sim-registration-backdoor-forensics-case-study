package th.p047co.dtac.android.dtacone.manager.cardreader.usb;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import com.feitian.readerdk.Tool.C6150DK;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.perf.util.Constants;

/* renamed from: th.co.dtac.android.dtacone.manager.cardreader.usb.UsbDeviceService */
/* loaded from: classes7.dex */
public class UsbDeviceService {

    /* renamed from: a */
    public UsbManager f84895a;

    /* renamed from: b */
    public UsbDevice f84896b;

    /* renamed from: c */
    public UsbDeviceConnection f84897c;

    /* renamed from: d */
    public UsbInterface f84898d;

    /* renamed from: e */
    public UsbEndpoint f84899e;

    /* renamed from: f */
    public UsbEndpoint f84900f;

    public UsbDeviceService(UsbManager usbManager, UsbDevice usbDevice) {
        this.f84895a = usbManager;
        this.f84896b = usbDevice;
    }

    public int open() {
        release();
        UsbInterface usbInterface = this.f84896b.getInterface(0);
        this.f84898d = usbInterface;
        int endpointCount = usbInterface.getEndpointCount();
        for (int i = 0; i < endpointCount; i++) {
            UsbEndpoint endpoint = this.f84898d.getEndpoint(i);
            int direction = endpoint.getDirection();
            if (2 == endpoint.getType()) {
                if (direction == 0) {
                    this.f84900f = endpoint;
                } else if (128 == direction) {
                    this.f84899e = endpoint;
                }
            }
        }
        if (this.f84899e == null || this.f84900f == null) {
            return C6150DK.RETURN_ERROR;
        }
        UsbDeviceConnection openDevice = this.f84895a.openDevice(this.f84896b);
        this.f84897c = openDevice;
        if (openDevice == null) {
            return C6150DK.RETURN_ERROR;
        }
        openDevice.claimInterface(this.f84898d, true);
        return 0;
    }

    public int read(byte[] bArr, int[] iArr) {
        do {
            try {
                int bulkTransfer = this.f84897c.bulkTransfer(this.f84899e, bArr, bArr.length, 6000);
                iArr[0] = bulkTransfer;
                if (bulkTransfer < 10) {
                    return C6150DK.RETURN_ERROR;
                }
            } catch (Exception unused) {
                iArr[0] = 0;
                return C6150DK.RETURN_ERROR;
            }
        } while ((bArr[7] & 128) != 0);
        if ((bArr[8] & SignedBytes.MAX_POWER_OF_TWO) != 0) {
            return C6150DK.RETURN_ERROR;
        }
        return 0;
    }

    public int release() {
        UsbDeviceConnection usbDeviceConnection = this.f84897c;
        if (usbDeviceConnection != null) {
            if (!usbDeviceConnection.releaseInterface(this.f84898d)) {
                this.f84897c.close();
            }
            this.f84897c = null;
            return 0;
        }
        return C6150DK.TRANS_RETURN_ERROR;
    }

    public int write(byte[] bArr, int i) {
        try {
            this.f84897c.bulkTransfer(this.f84900f, bArr, i, Constants.MAX_URL_LENGTH);
            return 0;
        } catch (Exception unused) {
            return C6150DK.RETURN_ERROR;
        }
    }
}
