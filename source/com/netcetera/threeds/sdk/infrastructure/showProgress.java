package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* loaded from: classes5.dex */
public class showProgress {
    public static int[] ThreeDS2Service = {-1566515671, -1793811987, -965440626, -368810845, -1311376571, 1278125963, -837427258, -610215291, 777425208, -272471169, 1409441476, 473649063, -332813984, 1264065980, 881585611, -1147094568, -311068815, 340933571};
    private static int valueOf = 0;
    private static int values = 1;
    private final String ThreeDS2ServiceInstance;
    private final String get;

    private showProgress(String str, String str2) {
        this.ThreeDS2ServiceInstance = str;
        this.get = str2;
    }

    public static showProgress ThreeDS2ServiceInstance(String str, String str2) {
        showProgress showprogress = new showProgress(str, str2);
        values = (valueOf + 33) % 128;
        return showprogress;
    }

    public static showProgress get() {
        showProgress showprogress = new showProgress("", "");
        int i = values + 47;
        valueOf = i % 128;
        if (i % 2 != 0) {
            int i2 = 16 / 0;
        }
        return showprogress;
    }

    public String ThreeDS2Service() {
        int i = valueOf + 19;
        values = i % 128;
        if (i % 2 != 0) {
            return this.get;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            valueOf = (values + 111) % 128;
            return true;
        } else if (!(obj instanceof showProgress)) {
            return false;
        } else {
            showProgress showprogress = (showProgress) obj;
            if (!Objects.equals(this.ThreeDS2ServiceInstance, showprogress.ThreeDS2ServiceInstance)) {
                valueOf = (values + 57) % 128;
                return false;
            }
            return Objects.equals(this.get, showprogress.get);
        }
    }

    public int hashCode() {
        valueOf = (values + 23) % 128;
        int hash = Objects.hash(this.ThreeDS2ServiceInstance, this.get);
        int i = values + 125;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return hash;
        }
        throw null;
    }

    public String toString() {
        Object[] objArr = new Object[1];
        ThreeDS2Service(new int[]{-2031051608, -1467383887, -2111085827, 19816153, 1022048680, 64910219, -1662573894, 1185043814, 1546939370, -1826954578}, 20 - TextUtils.getOffsetAfter("", 0), objArr);
        StringBuilder sb = new StringBuilder(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        ThreeDS2Service(new int[]{1275432525, -1083761065, -2111085827, 19816153, -770458846, -720531051, -1529851211, 155988300}, 14 - Color.alpha(0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(this.get);
        Object[] objArr3 = new Object[1];
        ThreeDS2Service(new int[]{-503449389, -668424268, -1532682094, 1417988249, -2008864220, 103449560, -1141184875, -1145578029, -1777510698, -14539455, 1757544106, 1001882512}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(this.ThreeDS2ServiceInstance);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sb.append('}');
        String sb2 = sb.toString();
        values = (valueOf + 37) % 128;
        return sb2;
    }

    public String values() {
        int i = valueOf + 81;
        values = i % 128;
        if (i % 2 == 0) {
            int i2 = 84 / 0;
            return this.ThreeDS2ServiceInstance;
        }
        return this.ThreeDS2ServiceInstance;
    }

    private static void ThreeDS2Service(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (onError.ThreeDS2ServiceInstance) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) ThreeDS2Service.clone();
                onError.valueOf = 0;
                while (true) {
                    int i2 = onError.valueOf;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        int i4 = iArr[i2 + 1];
                        char c3 = (char) (i4 >> 16);
                        cArr[2] = c3;
                        char c4 = (char) i4;
                        cArr[3] = c4;
                        onError.values = (c << 16) + c2;
                        onError.ThreeDS2Service = (c3 << 16) + c4;
                        onError.valueOf(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = onError.values ^ iArr2[i5];
                            onError.values = i6;
                            onError.ThreeDS2Service = onError.ThreeDS2Service(i6) ^ onError.ThreeDS2Service;
                            int i7 = onError.values;
                            onError.values = onError.ThreeDS2Service;
                            onError.ThreeDS2Service = i7;
                        }
                        int i8 = onError.values;
                        onError.values = onError.ThreeDS2Service;
                        onError.ThreeDS2Service = i8;
                        onError.ThreeDS2Service = i8 ^ iArr2[16];
                        onError.values ^= iArr2[17];
                        int i9 = onError.values;
                        cArr[0] = (char) (i9 >>> 16);
                        cArr[1] = (char) i9;
                        int i10 = onError.ThreeDS2Service;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        onError.valueOf(iArr2);
                        int i11 = onError.valueOf;
                        int i12 = i11 << 1;
                        cArr2[i12] = cArr[0];
                        cArr2[i12 + 1] = cArr[1];
                        cArr2[i12 + 2] = cArr[2];
                        cArr2[i12 + 3] = cArr[3];
                        onError.valueOf = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str;
    }

    public boolean ThreeDS2ServiceInstance() {
        boolean ThreeDS2ServiceInstance;
        int i = valueOf + 37;
        values = i % 128;
        if (i % 2 == 0) {
            ThreeDS2ServiceInstance = C9669om.ThreeDS2ServiceInstance(this.ThreeDS2ServiceInstance);
            int i2 = 24 / 0;
        } else {
            ThreeDS2ServiceInstance = C9669om.ThreeDS2ServiceInstance(this.ThreeDS2ServiceInstance);
        }
        valueOf = (values + 55) % 128;
        return ThreeDS2ServiceInstance;
    }
}
