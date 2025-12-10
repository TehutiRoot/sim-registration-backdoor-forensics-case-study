package th.p047co.dtac.android.dtacone.manager.cardreader.usb;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.hardware.usb.UsbRequest;
import android.os.Handler;
import androidx.core.p005os.EnvironmentCompat;
import com.feitian.readerdk.Tool.C6150DK;
import com.feitian.readerdk.Tool.C6151Tool;
import com.feitian.readerdk.deviceconnect.IDeviceConnect;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.perf.util.Constants;
import java.nio.ByteBuffer;
import th.p047co.dtac.android.dtacone.manager.cardreader.usb.AndroidUsbDeviceConnect;

/* renamed from: th.co.dtac.android.dtacone.manager.cardreader.usb.AndroidUsbDeviceConnect */
/* loaded from: classes7.dex */
public class AndroidUsbDeviceConnect implements IDeviceConnect {

    /* renamed from: a */
    public UsbManager f84880a;

    /* renamed from: b */
    public UsbDevice f84881b;

    /* renamed from: c */
    public UsbDeviceConnection f84882c;

    /* renamed from: d */
    public UsbInterface f84883d;

    /* renamed from: e */
    public UsbEndpoint f84884e;

    /* renamed from: f */
    public UsbEndpoint f84885f;

    /* renamed from: g */
    public UsbEndpoint f84886g;

    /* renamed from: j */
    public Handler f84889j;

    /* renamed from: k */
    public UsbRequest f84890k;

    /* renamed from: l */
    public ByteBuffer f84891l;

    /* renamed from: m */
    public Thread f84892m;

    /* renamed from: h */
    public String f84887h = "";

    /* renamed from: i */
    public String f84888i = "";

    /* renamed from: n */
    public volatile boolean f84893n = false;

    /* renamed from: o */
    public boolean f84894o = true;

    public AndroidUsbDeviceConnect(UsbManager usbManager, UsbDevice usbDevice) {
        this.f84880a = usbManager;
        this.f84881b = usbDevice;
    }

    /* renamed from: a */
    public static /* synthetic */ void m19341a(AndroidUsbDeviceConnect androidUsbDeviceConnect) {
        androidUsbDeviceConnect.m19339c();
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceIctl(String str, Object obj) {
        this.f84889j = (Handler) obj;
        m19337e();
        return 0;
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceRead(byte[] bArr, int[] iArr) {
        try {
            int bulkTransfer = this.f84882c.bulkTransfer(this.f84884e, bArr, bArr.length, 6000);
            iArr[0] = bulkTransfer;
            if (bulkTransfer > 0) {
                m19340b("usb read", C6151Tool.byte2HexStr(bArr, bulkTransfer));
            }
            if (bulkTransfer < 10 || (bArr[7] & 128) != 0) {
                return C6150DK.RETURN_ERROR;
            }
            if ((bArr[8] & SignedBytes.MAX_POWER_OF_TWO) != 0) {
                return C6150DK.RETURN_ERROR;
            }
            return 0;
        } catch (Exception unused) {
            iArr[0] = 0;
            return C6150DK.RETURN_ERROR;
        }
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceTransmit(byte[] bArr, int i, byte[] bArr2, int[] iArr) {
        if (IDeviceWrite(bArr, i) != 0) {
            return C6150DK.TRANS_RETURN_ERROR;
        }
        return IDeviceRead(bArr2, iArr);
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceWrite(byte[] bArr, int i) {
        try {
            m19340b("usb write", C6151Tool.byte2HexStr(bArr, i));
            this.f84882c.bulkTransfer(this.f84885f, bArr, i, Constants.MAX_URL_LENGTH);
            return 0;
        } catch (Exception unused) {
            return C6150DK.RETURN_ERROR;
        }
    }

    /* renamed from: b */
    public void m19340b(String str, String str2) {
    }

    /* renamed from: c */
    public final /* synthetic */ void m19339c() {
        Handler handler;
        while (this.f84893n && this.f84882c != null) {
            try {
                this.f84891l.clear();
                UsbRequest usbRequest = this.f84890k;
                ByteBuffer byteBuffer = this.f84891l;
                if (usbRequest.queue(byteBuffer, byteBuffer.capacity())) {
                    UsbRequest requestWait = this.f84882c.requestWait();
                    if (this.f84893n && requestWait != null && requestWait == this.f84890k) {
                        this.f84891l.flip();
                        byte[] bArr = new byte[this.f84891l.remaining()];
                        this.f84891l.get(bArr);
                        int m19338d = m19338d(bArr);
                        if (m19338d != 61441 && (handler = this.f84889j) != null) {
                            handler.obtainMessage(C6150DK.CARD_STATUS, m19338d, -1).sendToTarget();
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Exception e) {
                m19340b("UsbPoll", "Exception: " + e);
                return;
            }
        }
    }

    public int close() {
        stopPolling();
        UsbDeviceConnection usbDeviceConnection = this.f84882c;
        if (usbDeviceConnection != null) {
            try {
                usbDeviceConnection.releaseInterface(this.f84883d);
            } catch (Exception unused) {
            }
            try {
                this.f84882c.close();
            } catch (Exception unused2) {
            }
            this.f84882c = null;
            return 0;
        }
        return 0;
    }

    /* renamed from: d */
    public final int m19338d(byte[] bArr) {
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
        return C6150DK.TRANS_RETURN_ERROR;
    }

    /* renamed from: e */
    public final void m19337e() {
        stopPolling();
        if (this.f84882c != null && this.f84886g != null) {
            UsbRequest usbRequest = new UsbRequest();
            this.f84890k = usbRequest;
            usbRequest.initialize(this.f84882c, this.f84886g);
            this.f84891l = ByteBuffer.allocate(this.f84886g.getMaxPacketSize());
            this.f84893n = true;
            Thread thread = new Thread(new Runnable() { // from class: s4
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidUsbDeviceConnect.m19341a(AndroidUsbDeviceConnect.this);
                }
            }, "UsbPoll");
            this.f84892m = thread;
            thread.start();
        }
    }

    public String getManufacturerName() {
        return this.f84888i;
    }

    public int getProductId() {
        UsbDevice usbDevice = this.f84881b;
        if (usbDevice == null) {
            return C6150DK.RETURN_ERROR;
        }
        return usbDevice.getProductId();
    }

    public String getReaderName() {
        return this.f84887h;
    }

    public int getVendorId() {
        UsbDevice usbDevice = this.f84881b;
        if (usbDevice == null) {
            return C6150DK.RETURN_ERROR;
        }
        return usbDevice.getVendorId();
    }

    public int open() {
        int i;
        close();
        UsbInterface usbInterface = this.f84881b.getInterface(0);
        this.f84883d = usbInterface;
        if (usbInterface == null) {
            return C6150DK.RETURN_ERROR;
        }
        int endpointCount = usbInterface.getEndpointCount();
        int i2 = 0;
        while (true) {
            if (i2 >= endpointCount) {
                break;
            }
            UsbEndpoint endpoint = this.f84883d.getEndpoint(i2);
            if (endpoint.getType() == 2) {
                if (endpoint.getDirection() == 128) {
                    this.f84884e = endpoint;
                } else {
                    this.f84885f = endpoint;
                }
            } else if (endpoint.getType() == 3 && endpoint.getDirection() == 128) {
                this.f84886g = endpoint;
            }
            i2++;
        }
        if (this.f84884e == null || this.f84885f == null) {
            return C6150DK.RETURN_ERROR;
        }
        UsbDeviceConnection openDevice = this.f84880a.openDevice(this.f84881b);
        this.f84882c = openDevice;
        if (openDevice == null) {
            return C6150DK.RETURN_ERROR;
        }
        openDevice.claimInterface(this.f84883d, true);
        byte[] bArr = new byte[256];
        if (this.f84882c.controlTransfer(128, 6, 769, 0, bArr, 256, Constants.MAX_URL_LENGTH) > 2 && (bArr[1] & 255) == 3) {
            StringBuilder sb = new StringBuilder();
            for (int i3 = 2; i3 < (bArr[0] & 255); i3 += 2) {
                sb.append((char) bArr[i3]);
            }
            this.f84888i = sb.toString();
        } else {
            this.f84888i = "FT CCID Card";
        }
        if (this.f84882c.controlTransfer(128, 6, 770, 0, bArr, 256, Constants.MAX_URL_LENGTH) > 2 && (bArr[1] & 255) == 3) {
            StringBuilder sb2 = new StringBuilder();
            for (i = 2; i < (bArr[0] & 255); i += 2) {
                sb2.append((char) bArr[i]);
            }
            this.f84887h = sb2.toString();
        } else {
            this.f84887h = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return 0;
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public void releaseReource() {
    }

    public void stopPolling() {
        this.f84893n = false;
        UsbRequest usbRequest = this.f84890k;
        if (usbRequest != null) {
            try {
                usbRequest.cancel();
            } catch (Exception unused) {
            }
        }
        Thread thread = this.f84892m;
        this.f84892m = null;
        if (thread != null) {
            thread.interrupt();
            try {
                thread.join(300L);
            } catch (InterruptedException unused2) {
            }
        }
        UsbRequest usbRequest2 = this.f84890k;
        if (usbRequest2 != null) {
            try {
                usbRequest2.close();
            } catch (Exception unused3) {
            }
            this.f84890k = null;
        }
    }
}
