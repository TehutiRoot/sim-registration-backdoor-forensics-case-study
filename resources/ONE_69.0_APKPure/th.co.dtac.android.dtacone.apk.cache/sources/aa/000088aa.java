package com.feitian.readerdk.deviceconnect;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.os.Handler;
import androidx.core.p005os.EnvironmentCompat;
import com.feitian.readerdk.Tool.C6139DK;
import com.feitian.readerdk.Tool.C6140Tool;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes3.dex */
public class AndroidUsbDeviceConnect implements IDeviceConnect {
    public static final int USB_ENDPOINT_XFER_INT = 3;

    /* renamed from: a */
    public UsbManager f43563a;

    /* renamed from: b */
    public UsbDevice f43564b;

    /* renamed from: c */
    public UsbInterface f43565c;

    /* renamed from: g */
    public UsbEndpoint f43569g;

    /* renamed from: h */
    public UsbEndpoint f43570h;

    /* renamed from: i */
    public UsbEndpoint f43571i;

    /* renamed from: j */
    public Handler f43572j;
    public UsbDeviceConnection mConnection = null;

    /* renamed from: d */
    public String f43566d = "";

    /* renamed from: e */
    public String f43567e = "";

    /* renamed from: f */
    public boolean f43568f = true;

    /* renamed from: l */
    public AndroidUsbDeviceConnect f43574l = null;

    /* renamed from: k */
    public C6142a f43573k = new C6142a();

    /* renamed from: com.feitian.readerdk.deviceconnect.AndroidUsbDeviceConnect$a */
    /* loaded from: classes3.dex */
    public class C6142a extends Thread {

        /* renamed from: a */
        public int f43575a;

        public C6142a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                AndroidUsbDeviceConnect androidUsbDeviceConnect = AndroidUsbDeviceConnect.this;
                if (androidUsbDeviceConnect.f43572j != null) {
                    int checkCardStatues = androidUsbDeviceConnect.checkCardStatues(0);
                    this.f43575a = checkCardStatues;
                    if (checkCardStatues == 61441) {
                        return;
                    }
                    if (3 == checkCardStatues) {
                        AndroidUsbDeviceConnect.this.f43572j.obtainMessage(C6139DK.CARD_STATUS, 3, -1).sendToTarget();
                    } else if (1 == checkCardStatues) {
                        AndroidUsbDeviceConnect.this.f43572j.obtainMessage(C6139DK.CARD_STATUS, 1, -1).sendToTarget();
                    } else {
                        AndroidUsbDeviceConnect.this.f43572j.obtainMessage(C6139DK.CARD_STATUS, 2, -1).sendToTarget();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public AndroidUsbDeviceConnect(UsbManager usbManager, UsbDevice usbDevice) {
        this.f43563a = usbManager;
        this.f43564b = usbDevice;
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceIctl(String str, Object obj) {
        this.f43572j = (Handler) obj;
        this.f43573k.start();
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        if ((r7[8] & com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        return com.feitian.readerdk.Tool.C6139DK.RETURN_ERROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        return 0;
     */
    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int IDeviceRead(byte[] r7, int[] r8) {
        /*
            r6 = this;
        L0:
            r0 = 65281(0xff01, float:9.1478E-41)
            r1 = 0
            android.hardware.usb.UsbDeviceConnection r2 = r6.mConnection     // Catch: java.lang.Exception -> L31
            android.hardware.usb.UsbEndpoint r3 = r6.f43569g     // Catch: java.lang.Exception -> L31
            int r4 = r7.length     // Catch: java.lang.Exception -> L31
            r5 = 6000(0x1770, float:8.408E-42)
            int r2 = r2.bulkTransfer(r3, r7, r4, r5)     // Catch: java.lang.Exception -> L31
            r8[r1] = r2     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = "usb read"
            java.lang.String r4 = com.feitian.readerdk.Tool.C6140Tool.byte2HexStr(r7, r2)     // Catch: java.lang.Exception -> L31
            r6.m49340a(r3, r4)     // Catch: java.lang.Exception -> L31
            r3 = 10
            if (r2 >= r3) goto L1f
            return r0
        L1f:
            r2 = 7
            r2 = r7[r2]     // Catch: java.lang.Exception -> L31
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L27
            goto L0
        L27:
            r2 = 8
            r7 = r7[r2]     // Catch: java.lang.Exception -> L31
            r7 = r7 & 64
            if (r7 == 0) goto L30
            return r0
        L30:
            return r1
        L31:
            r8[r1] = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.feitian.readerdk.deviceconnect.AndroidUsbDeviceConnect.IDeviceRead(byte[], int[]):int");
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
            m49340a("usb write", C6140Tool.byte2HexStr(bArr, i));
            this.mConnection.bulkTransfer(this.f43570h, bArr, i, Constants.MAX_URL_LENGTH);
            return 0;
        } catch (Exception unused) {
            return C6139DK.RETURN_ERROR;
        }
    }

    /* renamed from: a */
    public void m49340a(String str, String str2) {
    }

    public int checkCardStatues(int i) {
        byte[] bArr = new byte[16];
        try {
            if (this.mConnection.bulkTransfer(this.f43571i, bArr, 16, i) == 2) {
                byte b = bArr[1];
                if ((b & 255) == 2) {
                    return 3;
                }
                if ((b & 255) != 3) {
                    return 2;
                }
                return 1;
            }
            return C6139DK.TRANS_RETURN_ERROR;
        } catch (Exception unused) {
            return C6139DK.TRANS_RETURN_ERROR;
        }
    }

    public int close() {
        UsbDeviceConnection usbDeviceConnection = this.mConnection;
        if (usbDeviceConnection != null) {
            usbDeviceConnection.releaseInterface(this.f43565c);
            this.mConnection.close();
            this.mConnection = null;
            return 0;
        }
        return C6139DK.TRANS_RETURN_ERROR;
    }

    public String getManufacturerName() {
        return this.f43567e;
    }

    public int getProductId() {
        UsbDevice usbDevice = this.f43564b;
        if (usbDevice == null) {
            return C6139DK.RETURN_ERROR;
        }
        return usbDevice.getProductId();
    }

    public String getReaderName() {
        return this.f43566d;
    }

    public int getVendorId() {
        UsbDevice usbDevice = this.f43564b;
        if (usbDevice == null) {
            return C6139DK.RETURN_ERROR;
        }
        return usbDevice.getVendorId();
    }

    public int open() {
        int i;
        if (this.f43564b.getVendorId() != 2414) {
            return 61443;
        }
        close();
        UsbInterface usbInterface = this.f43564b.getInterface(0);
        this.f43565c = usbInterface;
        int endpointCount = usbInterface.getEndpointCount();
        int i2 = 0;
        while (true) {
            if (i2 >= endpointCount) {
                break;
            }
            UsbEndpoint endpoint = this.f43565c.getEndpoint(i2);
            int direction = endpoint.getDirection();
            int type = endpoint.getType();
            if (2 == type) {
                if (direction == 0) {
                    this.f43570h = endpoint;
                } else if (128 == direction) {
                    this.f43569g = endpoint;
                }
            } else if (3 == type && 128 == direction) {
                this.f43571i = endpoint;
            }
            i2++;
        }
        if (this.f43569g == null || this.f43570h == null) {
            return C6139DK.RETURN_ERROR;
        }
        UsbDeviceConnection openDevice = this.f43563a.openDevice(this.f43564b);
        this.mConnection = openDevice;
        if (openDevice == null) {
            return C6139DK.RETURN_ERROR;
        }
        openDevice.claimInterface(this.f43565c, true);
        byte[] bArr = new byte[256];
        int controlTransfer = this.mConnection.controlTransfer(128, 6, 769, 0, bArr, 256, Constants.MAX_URL_LENGTH);
        this.f43567e = "";
        if (controlTransfer < 2) {
            this.f43567e = String.valueOf("") + "FT CCID Card";
        } else if ((bArr[1] & 255) == 3) {
            for (int i3 = 2; i3 < (bArr[0] & 255); i3 += 2) {
                this.f43567e = String.valueOf(this.f43567e) + ((char) bArr[i3]);
            }
        } else {
            this.f43567e = String.valueOf("") + "FT CCID Card";
        }
        if (this.mConnection.controlTransfer(128, 6, 770, 0, bArr, 256, Constants.MAX_URL_LENGTH) < 2) {
            this.f43566d = String.valueOf(this.f43566d) + EnvironmentCompat.MEDIA_UNKNOWN;
        } else if ((bArr[1] & 255) == 3) {
            for (i = 2; i < (bArr[0] & 255); i += 2) {
                this.f43566d = String.valueOf(this.f43566d) + ((char) bArr[i]);
            }
        } else {
            this.f43566d = String.valueOf(this.f43566d) + EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return 0;
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public void releaseReource() {
    }
}