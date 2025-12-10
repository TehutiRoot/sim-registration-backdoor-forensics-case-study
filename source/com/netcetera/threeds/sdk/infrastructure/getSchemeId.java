package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes5.dex */
public class getSchemeId extends Thread {
    private static int ThreeDS2Service = -759576341;
    private static byte[] cleanup = {0};
    private static short[] getSDKInfo = null;
    private static int getSDKVersion = 1;
    private static int getWarnings = 0;
    private static int valueOf = 55;
    private static int values = 1104414876;
    private final StringBuilder ThreeDS2ServiceInstance = new StringBuilder();
    private final BufferedReader get;

    public getSchemeId(InputStream inputStream) {
        this.get = new BufferedReader(new InputStreamReader(inputStream));
    }

    private static void valueOf(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        int i4;
        String sb;
        synchronized (restrictedParameters.values) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i5 = valueOf;
                int i6 = i2 + i5;
                if (i6 == -1) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    byte[] bArr = cleanup;
                    if (bArr != null) {
                        i6 = (byte) (bArr[ThreeDS2Service + i] + i5);
                    } else {
                        i6 = (short) (getSDKInfo[ThreeDS2Service + i] + i5);
                    }
                }
                if (i6 > 0) {
                    restrictedParameters.ThreeDS2Service = ((i + i6) - 2) + ThreeDS2Service + i4;
                    char c = (char) (i3 + values);
                    restrictedParameters.valueOf = c;
                    sb2.append(c);
                    restrictedParameters.ThreeDS2ServiceInstance = restrictedParameters.valueOf;
                    restrictedParameters.get = 1;
                    while (restrictedParameters.get < i6) {
                        byte[] bArr2 = cleanup;
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

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                String readLine = this.get.readLine();
                if (readLine != null) {
                    StringBuilder sb = this.ThreeDS2ServiceInstance;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(readLine);
                    Object[] objArr = new Object[1];
                    valueOf((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (byte) TextUtils.getCapsMode("", 0, 0), Drawable.resolveOpacity(0, 0) + 759576341, (-55) - ((byte) KeyEvent.getModifierMetaStateMask()), Process.getGidForName("") - 1104414865, objArr);
                    sb2.append((String) objArr[0]);
                    sb.append(sb2.toString());
                    getWarnings = (getSDKVersion + 5) % 128;
                } else {
                    this.get.close();
                    getSDKVersion = (getWarnings + 95) % 128;
                    return;
                }
            } catch (IOException unused) {
                return;
            }
        }
    }

    public String values() {
        getWarnings = (getSDKVersion + 39) % 128;
        String obj = this.ThreeDS2ServiceInstance.toString();
        getSDKVersion = (getWarnings + 35) % 128;
        return obj;
    }
}
