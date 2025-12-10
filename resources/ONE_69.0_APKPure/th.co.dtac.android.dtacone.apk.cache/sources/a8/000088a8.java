package com.feitian.readerdk.deviceconnect;

import android.os.Handler;
import com.feitian.readerdk.Tool.C6139DK;
import com.feitian.readerdk.Tool.C6140Tool;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class AndroidBlueToothDeviceConnect implements IDeviceConnect {

    /* renamed from: l */
    public static byte[] f43545l = new byte[8192];

    /* renamed from: m */
    public static byte[] f43546m = new byte[8192];

    /* renamed from: n */
    public static byte[] f43547n = new byte[8192];

    /* renamed from: a */
    public final InputStream f43548a;

    /* renamed from: b */
    public final OutputStream f43549b;

    /* renamed from: e */
    public C6141a f43552e;

    /* renamed from: d */
    public Handler f43551d = null;

    /* renamed from: f */
    public boolean f43553f = true;

    /* renamed from: g */
    public int[] f43554g = new int[1];

    /* renamed from: h */
    public int[] f43555h = new int[1];

    /* renamed from: i */
    public boolean f43556i = false;

    /* renamed from: j */
    public boolean f43557j = false;

    /* renamed from: k */
    public int f43558k = 0;

    /* renamed from: c */
    public boolean f43550c = true;

    /* renamed from: com.feitian.readerdk.deviceconnect.AndroidBlueToothDeviceConnect$a */
    /* loaded from: classes3.dex */
    public class C6141a extends Thread {

        /* renamed from: a */
        public byte[] f43559a = new byte[1024];

        /* renamed from: b */
        public int f43560b = 0;

        /* renamed from: c */
        public int f43561c = 0;

        public C6141a() {
        }

        /* renamed from: a */
        public void m49341a() {
            AndroidBlueToothDeviceConnect.this.f43550c = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            byte b;
            AndroidBlueToothDeviceConnect.this.Dprint("mReaderThread", "read thread start");
            while (AndroidBlueToothDeviceConnect.this.f43550c) {
                try {
                    int read = AndroidBlueToothDeviceConnect.this.f43548a.read(this.f43559a);
                    this.f43560b = read;
                    AndroidBlueToothDeviceConnect.this.Dprint("Reader:", C6140Tool.byte2HexStr(this.f43559a, read));
                    AndroidBlueToothDeviceConnect androidBlueToothDeviceConnect = AndroidBlueToothDeviceConnect.this;
                    if (androidBlueToothDeviceConnect.f43556i) {
                        androidBlueToothDeviceConnect.Dprint("pipe wirte", C6140Tool.byte2HexStr(this.f43559a, this.f43560b));
                        byte[] bArr = this.f43559a;
                        if (bArr[0] == 80 && (((b = bArr[1]) == 2 || b == 3) && this.f43560b == 2)) {
                            AndroidBlueToothDeviceConnect androidBlueToothDeviceConnect2 = AndroidBlueToothDeviceConnect.this;
                            if (androidBlueToothDeviceConnect2.f43551d != null) {
                                if (b == 2) {
                                    androidBlueToothDeviceConnect2.Dprint("handler", "send card absent");
                                    AndroidBlueToothDeviceConnect.this.f43551d.obtainMessage(C6139DK.CARD_STATUS, 3, -1).sendToTarget();
                                } else if (b == 3) {
                                    androidBlueToothDeviceConnect2.Dprint("handler", "send card present");
                                    AndroidBlueToothDeviceConnect.this.f43551d.obtainMessage(C6139DK.CARD_STATUS, 1, -1).sendToTarget();
                                }
                            }
                        } else {
                            System.arraycopy(bArr, 0, AndroidBlueToothDeviceConnect.f43547n, AndroidBlueToothDeviceConnect.this.f43558k, this.f43560b);
                            this.f43561c = C6140Tool.dw2i(AndroidBlueToothDeviceConnect.f43547n, 1) + 10;
                            AndroidBlueToothDeviceConnect.this.f43558k += this.f43560b;
                            if (this.f43561c == AndroidBlueToothDeviceConnect.this.f43558k) {
                                AndroidBlueToothDeviceConnect.this.m49343h();
                            }
                        }
                    } else {
                        byte[] bArr2 = this.f43559a;
                        if (bArr2[0] == 80) {
                            if (androidBlueToothDeviceConnect.f43551d != null) {
                                byte b2 = bArr2[1];
                                if (b2 == 2) {
                                    androidBlueToothDeviceConnect.Dprint("handler", "send card absent");
                                    AndroidBlueToothDeviceConnect.this.f43551d.obtainMessage(C6139DK.CARD_STATUS, 3, -1).sendToTarget();
                                } else if (b2 == 3) {
                                    androidBlueToothDeviceConnect.Dprint("handler", "send card present");
                                    AndroidBlueToothDeviceConnect.this.f43551d.obtainMessage(C6139DK.CARD_STATUS, 1, -1).sendToTarget();
                                }
                            }
                        } else {
                            androidBlueToothDeviceConnect.Dprint("Reader:", "dirty data:" + C6140Tool.byte2HexStr(this.f43559a, this.f43560b));
                        }
                    }
                } catch (IOException e) {
                    AndroidBlueToothDeviceConnect.this.f43550c = false;
                    AndroidBlueToothDeviceConnect.this.Dprint("Reader:", e.getMessage());
                    AndroidBlueToothDeviceConnect.this.Dprint("Reader:", "mread io exception");
                }
            }
            AndroidBlueToothDeviceConnect.this.Dprint("mReaderThread", "read thread end");
        }
    }

    public AndroidBlueToothDeviceConnect(InputStream inputStream, OutputStream outputStream) {
        this.f43548a = inputStream;
        this.f43549b = outputStream;
        C6141a c6141a = new C6141a();
        this.f43552e = c6141a;
        c6141a.start();
    }

    public void Dprint(String str, String str2) {
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceIctl(String str, Object obj) {
        this.f43551d = (Handler) obj;
        return 0;
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceRead(byte[] bArr, int[] iArr) {
        int m49350a = m49350a(bArr, iArr);
        this.f43558k = 0;
        return m49350a;
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceTransmit(byte[] bArr, int i, byte[] bArr2, int[] iArr) {
        return 0;
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceWrite(byte[] bArr, int i) {
        try {
            this.f43549b.write(bArr, 0, i);
            this.f43549b.flush();
            Dprint("OutStream", "send success:[" + Integer.toString(i) + "]" + C6140Tool.byte2HexStr(bArr, i));
            return 0;
        } catch (IOException unused) {
            this.f43556i = false;
            Dprint("OutStream", "exception write faild!!");
            return 612;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
        r9.f43556i = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
        return r10;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m49350a(byte[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.feitian.readerdk.deviceconnect.AndroidBlueToothDeviceConnect.m49350a(byte[], int[]):int");
    }

    /* renamed from: g */
    public final int m49344g(byte[] bArr, int i, int i2) {
        do {
            try {
                if (this.f43558k >= i2) {
                    Dprint("Pipe read", C6140Tool.byte2HexStr(f43547n, i + i2));
                    System.arraycopy(f43547n, i, bArr, i, i2);
                    return 0;
                }
                this.f43557j = false;
            } catch (Exception unused) {
                return 612;
            }
        } while (m49342i(50000L) != 61444);
        return C6139DK.TIMEOUT;
    }

    /* renamed from: h */
    public synchronized void m49343h() {
        this.f43557j = true;
        notify();
    }

    /* renamed from: i */
    public synchronized int m49342i(long j) {
        if (!this.f43557j) {
            long currentTimeMillis = System.currentTimeMillis();
            while (true) {
                try {
                    wait(j);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (this.f43557j) {
                    break;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                long j2 = currentTimeMillis2 - currentTimeMillis;
                if (j2 >= j) {
                    return C6139DK.TIMEOUT;
                }
                j -= j2;
                currentTimeMillis = currentTimeMillis2;
            }
        }
        return 0;
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public void releaseReource() {
        this.f43552e.m49341a();
    }
}