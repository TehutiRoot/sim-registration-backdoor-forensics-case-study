package com.feitian.readerdk.deviceconnect;

import android.os.Handler;
import com.feitian.readerdk.Tool.C6150DK;
import com.feitian.readerdk.Tool.C6151Tool;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class AndroidBlueToothDeviceConnect implements IDeviceConnect {

    /* renamed from: l */
    public static byte[] f43533l = new byte[8192];

    /* renamed from: m */
    public static byte[] f43534m = new byte[8192];

    /* renamed from: n */
    public static byte[] f43535n = new byte[8192];

    /* renamed from: a */
    public final InputStream f43536a;

    /* renamed from: b */
    public final OutputStream f43537b;

    /* renamed from: e */
    public C6152a f43540e;

    /* renamed from: d */
    public Handler f43539d = null;

    /* renamed from: f */
    public boolean f43541f = true;

    /* renamed from: g */
    public int[] f43542g = new int[1];

    /* renamed from: h */
    public int[] f43543h = new int[1];

    /* renamed from: i */
    public boolean f43544i = false;

    /* renamed from: j */
    public boolean f43545j = false;

    /* renamed from: k */
    public int f43546k = 0;

    /* renamed from: c */
    public boolean f43538c = true;

    /* renamed from: com.feitian.readerdk.deviceconnect.AndroidBlueToothDeviceConnect$a */
    /* loaded from: classes3.dex */
    public class C6152a extends Thread {

        /* renamed from: a */
        public byte[] f43547a = new byte[1024];

        /* renamed from: b */
        public int f43548b = 0;

        /* renamed from: c */
        public int f43549c = 0;

        public C6152a() {
        }

        /* renamed from: a */
        public void m49344a() {
            AndroidBlueToothDeviceConnect.this.f43538c = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            byte b;
            AndroidBlueToothDeviceConnect.this.Dprint("mReaderThread", "read thread start");
            while (AndroidBlueToothDeviceConnect.this.f43538c) {
                try {
                    int read = AndroidBlueToothDeviceConnect.this.f43536a.read(this.f43547a);
                    this.f43548b = read;
                    AndroidBlueToothDeviceConnect.this.Dprint("Reader:", C6151Tool.byte2HexStr(this.f43547a, read));
                    AndroidBlueToothDeviceConnect androidBlueToothDeviceConnect = AndroidBlueToothDeviceConnect.this;
                    if (androidBlueToothDeviceConnect.f43544i) {
                        androidBlueToothDeviceConnect.Dprint("pipe wirte", C6151Tool.byte2HexStr(this.f43547a, this.f43548b));
                        byte[] bArr = this.f43547a;
                        if (bArr[0] == 80 && (((b = bArr[1]) == 2 || b == 3) && this.f43548b == 2)) {
                            AndroidBlueToothDeviceConnect androidBlueToothDeviceConnect2 = AndroidBlueToothDeviceConnect.this;
                            if (androidBlueToothDeviceConnect2.f43539d != null) {
                                if (b == 2) {
                                    androidBlueToothDeviceConnect2.Dprint("handler", "send card absent");
                                    AndroidBlueToothDeviceConnect.this.f43539d.obtainMessage(C6150DK.CARD_STATUS, 3, -1).sendToTarget();
                                } else if (b == 3) {
                                    androidBlueToothDeviceConnect2.Dprint("handler", "send card present");
                                    AndroidBlueToothDeviceConnect.this.f43539d.obtainMessage(C6150DK.CARD_STATUS, 1, -1).sendToTarget();
                                }
                            }
                        } else {
                            System.arraycopy(bArr, 0, AndroidBlueToothDeviceConnect.f43535n, AndroidBlueToothDeviceConnect.this.f43546k, this.f43548b);
                            this.f43549c = C6151Tool.dw2i(AndroidBlueToothDeviceConnect.f43535n, 1) + 10;
                            AndroidBlueToothDeviceConnect.this.f43546k += this.f43548b;
                            if (this.f43549c == AndroidBlueToothDeviceConnect.this.f43546k) {
                                AndroidBlueToothDeviceConnect.this.m49346h();
                            }
                        }
                    } else {
                        byte[] bArr2 = this.f43547a;
                        if (bArr2[0] == 80) {
                            if (androidBlueToothDeviceConnect.f43539d != null) {
                                byte b2 = bArr2[1];
                                if (b2 == 2) {
                                    androidBlueToothDeviceConnect.Dprint("handler", "send card absent");
                                    AndroidBlueToothDeviceConnect.this.f43539d.obtainMessage(C6150DK.CARD_STATUS, 3, -1).sendToTarget();
                                } else if (b2 == 3) {
                                    androidBlueToothDeviceConnect.Dprint("handler", "send card present");
                                    AndroidBlueToothDeviceConnect.this.f43539d.obtainMessage(C6150DK.CARD_STATUS, 1, -1).sendToTarget();
                                }
                            }
                        } else {
                            androidBlueToothDeviceConnect.Dprint("Reader:", "dirty data:" + C6151Tool.byte2HexStr(this.f43547a, this.f43548b));
                        }
                    }
                } catch (IOException e) {
                    AndroidBlueToothDeviceConnect.this.f43538c = false;
                    AndroidBlueToothDeviceConnect.this.Dprint("Reader:", e.getMessage());
                    AndroidBlueToothDeviceConnect.this.Dprint("Reader:", "mread io exception");
                }
            }
            AndroidBlueToothDeviceConnect.this.Dprint("mReaderThread", "read thread end");
        }
    }

    public AndroidBlueToothDeviceConnect(InputStream inputStream, OutputStream outputStream) {
        this.f43536a = inputStream;
        this.f43537b = outputStream;
        C6152a c6152a = new C6152a();
        this.f43540e = c6152a;
        c6152a.start();
    }

    public void Dprint(String str, String str2) {
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceIctl(String str, Object obj) {
        this.f43539d = (Handler) obj;
        return 0;
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceRead(byte[] bArr, int[] iArr) {
        int m49353a = m49353a(bArr, iArr);
        this.f43546k = 0;
        return m49353a;
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceTransmit(byte[] bArr, int i, byte[] bArr2, int[] iArr) {
        return 0;
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public int IDeviceWrite(byte[] bArr, int i) {
        try {
            this.f43537b.write(bArr, 0, i);
            this.f43537b.flush();
            Dprint("OutStream", "send success:[" + Integer.toString(i) + "]" + C6151Tool.byte2HexStr(bArr, i));
            return 0;
        } catch (IOException unused) {
            this.f43544i = false;
            Dprint("OutStream", "exception write faild!!");
            return 612;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
        r9.f43544i = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
        return r10;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m49353a(byte[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.feitian.readerdk.deviceconnect.AndroidBlueToothDeviceConnect.m49353a(byte[], int[]):int");
    }

    /* renamed from: g */
    public final int m49347g(byte[] bArr, int i, int i2) {
        do {
            try {
                if (this.f43546k >= i2) {
                    Dprint("Pipe read", C6151Tool.byte2HexStr(f43535n, i + i2));
                    System.arraycopy(f43535n, i, bArr, i, i2);
                    return 0;
                }
                this.f43545j = false;
            } catch (Exception unused) {
                return 612;
            }
        } while (m49345i(50000L) != 61444);
        return C6150DK.TIMEOUT;
    }

    /* renamed from: h */
    public synchronized void m49346h() {
        this.f43545j = true;
        notify();
    }

    /* renamed from: i */
    public synchronized int m49345i(long j) {
        if (!this.f43545j) {
            long currentTimeMillis = System.currentTimeMillis();
            while (true) {
                try {
                    wait(j);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (this.f43545j) {
                    break;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                long j2 = currentTimeMillis2 - currentTimeMillis;
                if (j2 >= j) {
                    return C6150DK.TIMEOUT;
                }
                j -= j2;
                currentTimeMillis = currentTimeMillis2;
            }
        }
        return 0;
    }

    @Override // com.feitian.readerdk.deviceconnect.IDeviceConnect
    public void releaseReource() {
        this.f43540e.m49344a();
    }
}
