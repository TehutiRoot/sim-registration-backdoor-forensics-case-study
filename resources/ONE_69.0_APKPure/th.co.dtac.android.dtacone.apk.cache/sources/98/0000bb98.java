package com.netcetera.threeds.sdk.infrastructure;

import android.app.Service;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class eftposConfiguration extends Service {
    private static int ThreeDS2Service$InitializationCallback = 1;
    private static final long[] ThreeDS2ServiceInstance;
    private static int cleanup;
    private static final long[] get;
    private static short[] getSDKInfo;
    private static int getSDKVersion;
    private static byte[] getWarnings;
    private static int initialize;
    private static int valueOf;
    private Messenger ThreeDS2Service;
    Messenger values;

    /* loaded from: classes5.dex */
    public class valueOf extends Handler {
        private static int ThreeDS2ServiceInstance = 1;
        private static int valueOf;

        public valueOf(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Message obtain;
            Messenger messenger;
            int i = ThreeDS2ServiceInstance;
            int i2 = ((i | 45) << 1) - (i ^ 45);
            valueOf = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    eftposConfiguration.this.values = message.replyTo;
                    obtain = Message.obtain(null, 1, eftposConfiguration.ThreeDS2Service(message.arg1), 0, null);
                    messenger = eftposConfiguration.this.values;
                } else {
                    eftposConfiguration.this.values = message.replyTo;
                    obtain = Message.obtain(null, 1, eftposConfiguration.ThreeDS2Service(message.arg1), 0, null);
                    messenger = eftposConfiguration.this.values;
                }
                messenger.send(obtain);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    static {
        values();
        get = new long[]{472001035, -601740789};
        ThreeDS2ServiceInstance = new long[]{221583250, 341780918};
        initialize = (ThreeDS2Service$InitializationCallback + 25) % 128;
    }

    public static int ThreeDS2Service(int i) {
        int values;
        int i2 = initialize + 107;
        ThreeDS2Service$InitializationCallback = i2 % 128;
        if (i2 % 2 != 0 ? (values = values(i)) != i : (values = values(i)) != i) {
            return values;
        }
        initialize = (ThreeDS2Service$InitializationCallback + 59) % 128;
        return i;
    }

    private static void ThreeDS2ServiceInstance(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        int i4;
        String sb;
        synchronized (restrictedParameters.values) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i5 = cleanup;
                int i6 = i2 + i5;
                if (i6 == -1) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    byte[] bArr = getWarnings;
                    if (bArr != null) {
                        i6 = (byte) (bArr[valueOf + i] + i5);
                    } else {
                        i6 = (short) (getSDKInfo[valueOf + i] + i5);
                    }
                }
                if (i6 > 0) {
                    restrictedParameters.ThreeDS2Service = ((i + i6) - 2) + valueOf + i4;
                    char c = (char) (i3 + getSDKVersion);
                    restrictedParameters.valueOf = c;
                    sb2.append(c);
                    restrictedParameters.ThreeDS2ServiceInstance = restrictedParameters.valueOf;
                    restrictedParameters.get = 1;
                    while (restrictedParameters.get < i6) {
                        byte[] bArr2 = getWarnings;
                        if (bArr2 != null) {
                            int i7 = restrictedParameters.ThreeDS2Service;
                            restrictedParameters.ThreeDS2Service = i7 - 1;
                            restrictedParameters.valueOf = (char) (restrictedParameters.ThreeDS2ServiceInstance + (((byte) (bArr2[i7] + s)) ^ b));
                        } else {
                            short[] sArr = getSDKInfo;
                            int i8 = restrictedParameters.ThreeDS2Service;
                            restrictedParameters.ThreeDS2Service = i8 - 1;
                            restrictedParameters.valueOf = (char) (restrictedParameters.ThreeDS2ServiceInstance + (((short) (sArr[i8] + s)) ^ b));
                        }
                        sb2.append(restrictedParameters.valueOf);
                        restrictedParameters.ThreeDS2ServiceInstance = restrictedParameters.valueOf;
                        restrictedParameters.get++;
                    }
                }
                sb = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = sb;
    }

    private static int get(int i) {
        BufferedInputStream bufferedInputStream;
        try {
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance((short) (Color.red(0) - 95), (byte) TextUtils.getCapsMode("", 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 555478690, TextUtils.indexOf("", "", 0) - 70, (-1224336586) - View.MeasureSpec.getSize(0), objArr);
            bufferedInputStream = new BufferedInputStream(new FileInputStream((String) objArr[0]));
        } catch (IOException unused) {
        }
        if (visaSchemeConfiguration.ThreeDS2Service(bufferedInputStream, get) != 0) {
            int i2 = i ^ 242;
            bufferedInputStream.close();
            int i3 = ThreeDS2Service$InitializationCallback + 31;
            initialize = i3 % 128;
            if (i3 % 2 == 0) {
                return i2;
            }
            throw null;
        }
        bufferedInputStream.close();
        ThreeDS2Service$InitializationCallback = (initialize + 83) % 128;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bd, code lost:
        if (r0 != 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int valueOf(int r21) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.eftposConfiguration.valueOf(int):int");
    }

    public static void values() {
        valueOf = -555478664;
        cleanup = 92;
        getSDKVersion = 1224336633;
        getWarnings = new byte[]{96, 103, 90, 103, 99, -97, 42, 91, 104, 83, -91, Framer.STDIN_FRAME_PREFIX, 85, 94, 99, -94, 123, -93, -84, -79, -16, -83, -76, -89, -76, -80, -20, 117, 89, 92, 92, 94, -96, Ascii.SYN, 98, 102, 100, 92, 102, 81, -93, Ascii.ESC, 108, -106, Ascii.ESC, 89, 101, -93, 0, 0, 0, 0};
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Messenger messenger = new Messenger(new valueOf(Looper.getMainLooper()));
        this.ThreeDS2Service = messenger;
        IBinder binder = messenger.getBinder();
        initialize = (ThreeDS2Service$InitializationCallback + 87) % 128;
        return binder;
    }

    private static int values(int i) {
        int valueOf2 = valueOf(i);
        if (valueOf2 != i) {
            ThreeDS2Service$InitializationCallback = (initialize + 55) % 128;
            return valueOf2;
        }
        int i2 = get(i);
        if (i2 != i) {
            ThreeDS2Service$InitializationCallback = (initialize + 5) % 128;
            return i2;
        }
        return i;
    }
}