package th.p047co.dtac.android.dtacone.manager.cardreader.usb;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.hardware.usb.UsbRequest;
import android.os.Handler;
import androidx.core.p005os.EnvironmentCompat;
import com.feitian.readerdk.Tool.C6139DK;
import com.feitian.readerdk.Tool.C6140Tool;
import com.feitian.readerdk.deviceconnect.IDeviceConnect;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.perf.util.Constants;
import java.nio.ByteBuffer;
import th.p047co.dtac.android.dtacone.manager.cardreader.usb.AndroidUsbDeviceConnect;

/* renamed from: th.co.dtac.android.dtacone.manager.cardreader.usb.AndroidUsbDeviceConnect */
/* loaded from: classes7.dex */
public class AndroidUsbDeviceConnect implements IDeviceConnect {

    /* renamed from: a */
    public UsbManager f84990a;

    /* renamed from: b */
    public UsbDevice f84991b;

    /* renamed from: c */
    public UsbDeviceConnection f84992c;

    /* renamed from: d */
    public UsbInterface f84993d;

    /* renamed from: e */
    public UsbEndpoint f84994e;

    /* renamed from: f */
    public UsbEndpoint f84995f;

    /* renamed from: g */
    public UsbEndpoint f84996g;

    /* renamed from: j */
    public Handler f84999j;

    /* renamed from: k */
    public UsbRequest f85000k;

    /* renamed from: l */
    public ByteBuffer f85001l;

    /* renamed from: m */
    public Thread f85002m;

    /* renamed from: h */
    public String f84997h = "";

    /* renamed from: i */
    public String f84998i = "";

    /* renamed from: n */
    public volatile boolean f85003n = false;

    /* renamed from: o */
    public boolean f85004o = true;

    public AndroidUsbDeviceConnect(UsbManager usbManager, UsbDevice usbDevice) {
        this.f84990a = usbManager;
        this.f84991b = usbDevice;
    }

    /* renamed from: a */
    public static /* synthetic */ void m19509a(AndroidUsbDeviceConnect androidUsbDeviceConnect) {
        androidUsbDeviceConnect.m19507c();
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceIctl(String str, Object obj) {
        this.f84999j = (Handler) obj;
        m19505e();
        return 0;
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceRead(byte[] bArr, int[] iArr) {
        try {
            int bulkTransfer = this.f84992c.bulkTransfer(this.f84994e, bArr, bArr.length, 6000);
            iArr[0] = bulkTransfer;
            if (bulkTransfer > 0) {
                m19508b("usb read", C6140Tool.byte2HexStr(bArr, bulkTransfer));
            }
            if (bulkTransfer < 10 || (bArr[7] & 128) != 0) {
                return C6139DK.RETURN_ERROR;
            }
            if ((bArr[8] & SignedBytes.MAX_POWER_OF_TWO) != 0) {
                return C6139DK.RETURN_ERROR;
            }
            return 0;
        } catch (Exception unused) {
            iArr[0] = 0;
            return C6139DK.RETURN_ERROR;
        }
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceTransmit(byte[] bArr, int i, byte[] bArr2, int[] iArr) {
        if (IDeviceWrite(bArr, i) != 0) {
            return C6139DK.TRANS_RETURN_ERROR;
        }
        return IDeviceRead(bArr2, iArr);
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceWrite(byte[] bArr, int i) {
        try {
            m19508b("usb write", C6140Tool.byte2HexStr(bArr, i));
            this.f84992c.bulkTransfer(this.f84995f, bArr, i, Constants.MAX_URL_LENGTH);
            return 0;
        } catch (Exception unused) {
            return C6139DK.RETURN_ERROR;
        }
    }

    /* renamed from: b */
    public void m19508b(String str, String str2) {
    }

    /* renamed from: c */
    public final /* synthetic */ void m19507c() {
        Handler handler;
        while (this.f85003n && this.f84992c != null) {
            try {
                this.f85001l.clear();
                UsbRequest usbRequest = this.f85000k;
                ByteBuffer byteBuffer = this.f85001l;
                if (usbRequest.queue(byteBuffer, byteBuffer.capacity())) {
                    UsbRequest requestWait = this.f84992c.requestWait();
                    if (this.f85003n && requestWait != null && requestWait == this.f85000k) {
                        this.f85001l.flip();
                        byte[] bArr = new byte[this.f85001l.remaining()];
                        this.f85001l.get(bArr);
                        int m19506d = m19506d(bArr);
                        if (m19506d != 61441 && (handler = this.f84999j) != null) {
                            handler.obtainMessage(C6139DK.CARD_STATUS, m19506d, -1).sendToTarget();
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Exception e) {
                m19508b("UsbPoll", "Exception: " + e);
                return;
            }
        }
    }

    public int close() {
        stopPolling();
        UsbDeviceConnection usbDeviceConnection = this.f84992c;
        if (usbDeviceConnection != null) {
            try {
                usbDeviceConnection.releaseInterface(this.f84993d);
            } catch (Exception unused) {
            }
            try {
                this.f84992c.close();
            } catch (Exception unused2) {
            }
            this.f84992c = null;
            return 0;
        }
        return 0;
    }

    /* renamed from: d */
    public final int m19506d(byte[] bArr) {
        if (bArr.length >= 2) {
            int i = bArr[1] & 255;
            if (i == 2) {
                return 3;
            }
            if (i != 3) {
                return 2;
            }
            return 1;
        }
        return C6139DK.TRANS_RETURN_ERROR;
    }

    /* renamed from: e */
    public final void m19505e() {
        stopPolling();
        if (this.f84992c != null && this.f84996g != null) {
            UsbRequest usbRequest = new UsbRequest();
            this.f85000k = usbRequest;
            usbRequest.initialize(this.f84992c, this.f84996g);
            this.f85001l = ByteBuffer.allocate(this.f84996g.getMaxPacketSize());
            this.f85003n = true;
            Thread thread = new Thread(new Runnable() { // from class: s4
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidUsbDeviceConnect.m19509a(AndroidUsbDeviceConnect.this);
                }
            }, "UsbPoll");
            this.f85002m = thread;
            thread.start();
        }
    }

    public String getManufacturerName() {
        return this.f84998i;
    }

    public int getProductId() {
        UsbDevice usbDevice = this.f84991b;
        if (usbDevice == null) {
            return C6139DK.RETURN_ERROR;
        }
        return usbDevice.getProductId();
    }

    public String getReaderName() {
        return this.f84997h;
    }

    public int getVendorId() {
        UsbDevice usbDevice = this.f84991b;
        if (usbDevice == null) {
            return C6139DK.RETURN_ERROR;
        }
        return usbDevice.getVendorId();
    }

    public int open() {
        int i;
        close();
        UsbInterface usbInterface = this.f84991b.getInterface(0);
        this.f84993d = usbInterface;
        if (usbInterface == null) {
            return C6139DK.RETURN_ERROR;
        }
        int endpointCount = usbInterface.getEndpointCount();
        int i2 = 0;
        while (true) {
            if (i2 >= endpointCount) {
                break;
            }
            UsbEndpoint endpoint = this.f84993d.getEndpoint(i2);
            if (endpoint.getType() == 2) {
                if (endpoint.getDirection() == 128) {
                    this.f84994e = endpoint;
                } else {
                    this.f84995f = endpoint;
                }
            } else if (endpoint.getType() == 3 && endpoint.getDirection() == 128) {
                this.f84996g = endpoint;
            }
            i2++;
        }
        if (this.f84994e == null || this.f84995f == null) {
            return C6139DK.RETURN_ERROR;
        }
        UsbDeviceConnection openDevice = this.f84990a.openDevice(this.f84991b);
        this.f84992c = openDevice;
        if (openDevice == null) {
            return C6139DK.RETURN_ERROR;
        }
        openDevice.claimInterface(this.f84993d, true);
        byte[] bArr = new byte[256];
        if (this.f84992c.controlTransfer(128, 6, 769, 0, bArr, 256, Constants.MAX_URL_LENGTH) > 2 && (bArr[1] & 255) == 3) {
            StringBuilder sb = new StringBuilder();
            for (int i3 = 2; i3 < (bArr[0] & 255); i3 += 2) {
                sb.append((char) bArr[i3]);
            }
            this.f84998i = sb.toString();
        } else {
            this.f84998i = "FT CCID Card";
        }
        if (this.f84992c.controlTransfer(128, 6, 770, 0, bArr, 256, Constants.MAX_URL_LENGTH) > 2 && (bArr[1] & 255) == 3) {
            StringBuilder sb2 = new StringBuilder();
            for (i = 2; i < (bArr[0] & 255); i += 2) {
                sb2.append((char) bArr[i]);
            }
            this.f84997h = sb2.toString();
        } else {
            this.f84997h = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return 0;
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public void releaseReource() {
    }

    public void stopPolling() {
        this.f85003n = false;
        UsbRequest usbRequest = this.f85000k;
        if (usbRequest != null) {
            try {
                usbRequest.cancel();
            } catch (Exception unused) {
            }
        }
        Thread thread = this.f85002m;
        this.f85002m = null;
        if (thread != null) {
            thread.interrupt();
            try {
                thread.join(300L);
            } catch (InterruptedException unused2) {
            }
        }
        UsbRequest usbRequest2 = this.f85000k;
        if (usbRequest2 != null) {
            try {
                usbRequest2.close();
            } catch (Exception unused3) {
            }
            this.f85000k = null;
        }
    }
}