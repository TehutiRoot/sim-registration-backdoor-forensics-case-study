package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class getTransactionStatus {
    private static int cleanup = 1;
    private static int getSDKVersion = 0;
    public static int values = 47;
    private final List<String> ThreeDS2Service;
    private final showProgress ThreeDS2ServiceInstance;
    private final hideProgress get;
    private final hideProgress getWarnings;
    private final String valueOf;

    public getTransactionStatus(String str, List<String> list, showProgress showprogress, hideProgress hideprogress, hideProgress hideprogress2) {
        this.valueOf = str;
        this.ThreeDS2Service = list;
        this.ThreeDS2ServiceInstance = showprogress;
        this.get = hideprogress;
        this.getWarnings = hideprogress2;
    }

    public List<String> ThreeDS2Service() {
        List<String> list;
        int i = cleanup + 85;
        int i2 = i % 128;
        getSDKVersion = i2;
        if (i % 2 != 0) {
            list = this.ThreeDS2Service;
            int i3 = 67 / 0;
        } else {
            list = this.ThreeDS2Service;
        }
        int i4 = i2 + 43;
        cleanup = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return list;
    }

    public String ThreeDS2ServiceInstance() {
        int i = getSDKVersion + 13;
        int i2 = i % 128;
        cleanup = i2;
        if (i % 2 != 0) {
            String str = this.valueOf;
            getSDKVersion = (i2 + 101) % 128;
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (ThreeDS2Service().equals(r6.ThreeDS2Service()) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (ThreeDS2Service().equals(r6.ThreeDS2Service()) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r6.ThreeDS2Service() != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        r6 = com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.getSDKVersion + 59;
        com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.cleanup = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        if ((r6 % 2) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        r6 = 71 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
        if (values() == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
        if (values().equals(r6.values()) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
        com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.getSDKVersion = (com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.cleanup + 13) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
        if (r6.values() == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
        r6 = com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.cleanup + 1;
        com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.getSDKVersion = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
        if ((r6 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
        if (valueOf() == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
        if (valueOf().equals(r6.valueOf()) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
        if (r6.valueOf() == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b9, code lost:
        if (get() == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cc, code lost:
        if (r6.get() != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ce, code lost:
        r6 = com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.getSDKVersion + 13;
        com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.cleanup = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d8, code lost:
        if ((r6 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00da, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
        return get().equals(r6.get());
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.cleanup
            int r0 = r0 + 17
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.getSDKVersion = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto Ldd
            r0 = 1
            if (r5 != r6) goto L11
            return r0
        L11:
            r2 = 0
            if (r6 == 0) goto Ldc
            java.lang.Class r3 = r6.getClass()
            java.lang.Class<com.netcetera.threeds.sdk.infrastructure.getTransactionStatus> r4 = com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.class
            if (r4 == r3) goto L1e
            goto Ldc
        L1e:
            com.netcetera.threeds.sdk.infrastructure.getTransactionStatus r6 = (com.netcetera.threeds.sdk.infrastructure.getTransactionStatus) r6
            java.util.List r3 = r5.ThreeDS2Service()
            if (r3 == 0) goto L53
            int r3 = com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.cleanup
            int r3 = r3 + 85
            int r4 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.getSDKVersion = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L44
            java.util.List r3 = r5.ThreeDS2Service()
            java.util.List r4 = r6.ThreeDS2Service()
            boolean r3 = r3.equals(r4)
            r4 = 75
            int r4 = r4 / r2
            if (r3 != 0) goto L69
            goto L59
        L44:
            java.util.List r3 = r5.ThreeDS2Service()
            java.util.List r4 = r6.ThreeDS2Service()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L69
            goto L59
        L53:
            java.util.List r3 = r6.ThreeDS2Service()
            if (r3 == 0) goto L69
        L59:
            int r6 = com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.getSDKVersion
            int r6 = r6 + 59
            int r0 = r6 % 128
            com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.cleanup = r0
            int r6 = r6 % 2
            if (r6 != 0) goto L68
            r6 = 71
            int r6 = r6 / r2
        L68:
            return r2
        L69:
            com.netcetera.threeds.sdk.infrastructure.showProgress r3 = r5.values()
            if (r3 == 0) goto L86
            com.netcetera.threeds.sdk.infrastructure.showProgress r3 = r5.values()
            com.netcetera.threeds.sdk.infrastructure.showProgress r4 = r6.values()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L99
            int r6 = com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.cleanup
            int r6 = r6 + 13
            int r6 = r6 % 128
            com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.getSDKVersion = r6
            goto L8c
        L86:
            com.netcetera.threeds.sdk.infrastructure.showProgress r3 = r6.values()
            if (r3 == 0) goto L99
        L8c:
            int r6 = com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.cleanup
            int r6 = r6 + r0
            int r0 = r6 % 128
            com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.getSDKVersion = r0
            int r6 = r6 % 2
            if (r6 != 0) goto L98
            return r2
        L98:
            throw r1
        L99:
            com.netcetera.threeds.sdk.infrastructure.hideProgress r1 = r5.valueOf()
            if (r1 == 0) goto Lae
            com.netcetera.threeds.sdk.infrastructure.hideProgress r1 = r5.valueOf()
            com.netcetera.threeds.sdk.infrastructure.hideProgress r3 = r6.valueOf()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lb5
            goto Lb4
        Lae:
            com.netcetera.threeds.sdk.infrastructure.hideProgress r1 = r6.valueOf()
            if (r1 == 0) goto Lb5
        Lb4:
            return r2
        Lb5:
            com.netcetera.threeds.sdk.infrastructure.hideProgress r1 = r5.get()
            if (r1 == 0) goto Lc8
            com.netcetera.threeds.sdk.infrastructure.hideProgress r0 = r5.get()
            com.netcetera.threeds.sdk.infrastructure.hideProgress r6 = r6.get()
            boolean r0 = r0.equals(r6)
            goto Ldb
        Lc8:
            com.netcetera.threeds.sdk.infrastructure.hideProgress r6 = r6.get()
            if (r6 != 0) goto Lda
            int r6 = com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.getSDKVersion
            int r6 = r6 + 13
            int r1 = r6 % 128
            com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.cleanup = r1
            int r6 = r6 % 2
            if (r6 != 0) goto Ldb
        Lda:
            r0 = 0
        Ldb:
            return r0
        Ldc:
            return r2
        Ldd:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.equals(java.lang.Object):boolean");
    }

    public hideProgress get() {
        int i = cleanup + 101;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            return this.getWarnings;
        }
        throw null;
    }

    public boolean getSDKVersion() {
        cleanup = (getSDKVersion + 45) % 128;
        boolean ThreeDS2ServiceInstance = this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance();
        boolean z = !this.ThreeDS2Service.isEmpty();
        boolean valueOf = this.get.valueOf();
        if (!(!ThreeDS2ServiceInstance) && z) {
            int i = cleanup + 77;
            getSDKVersion = i % 128;
            if (i % 2 == 0) {
                if (valueOf) {
                    return true;
                }
            } else {
                throw null;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = cleanup + 19;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[2];
            objArr[1] = this.ThreeDS2Service;
            objArr[0] = this.ThreeDS2ServiceInstance;
            objArr[4] = this.get;
            objArr[2] = this.getWarnings;
            return Objects.hash(objArr);
        }
        return Objects.hash(this.ThreeDS2Service, this.ThreeDS2ServiceInstance, this.get, this.getWarnings);
    }

    public String toString() {
        Object[] objArr = new Object[1];
        valueOf(150 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 6, "\ufffa\u0005\u000e\ufffe\u0014\uffdd\fￜ\b\u0007\uffff\u0002\u0000\u000e\u000b\ufffa\r\u0002\b\u0007\uffef", 21 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), false, objArr);
        StringBuilder sb = new StringBuilder(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        valueOf(147 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 26 - (ViewConfiguration.getPressedStateDuration() >> 16), "￮\u000b\u000b\u0010￬\u0011\ufffe\b\u0005\uffff\uffe7\u0001\u0015\u000f￡\n\uffff\u000b\u0000\u0001\u0000￨\u0005\u000f\u0010\uffd9\u0000\u000f", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28, false, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(this.ThreeDS2Service);
        Object[] objArr3 = new Object[1];
        valueOf(142 - View.resolveSizeAndState(0, 0, 0), 16 - TextUtils.indexOf("", "", 0), "\u0003\r\n\u0004￬\u0006\u001a￦\u000f\u0004\u0010\u0005\u0006\u0005\uffde\uffc8ￍ\uffc1\u0005\u0014￦\u000f\u0004\u0013\u001a\u0011\u0015\n\u0010\u000f\ufff1\u0016", 33 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), false, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(this.ThreeDS2ServiceInstance);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArr4 = new Object[1];
        valueOf(138 - TextUtils.indexOf((CharSequence) "", '0', 0), 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\ufff0\u0013\u000b\u0013\ufff6\t\u0017\u0013\u0019\u0016\u0007\t￭\b￡\uffd0ￄ\b\u0017", 20 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), false, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(this.get);
        Object[] objArr5 = new Object[1];
        valueOf((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 141, 13 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\ufff5\u000e\u0015\u0004\uffe7\u0012\n\u0012\uffef\u0016\u0007ￃￏ￠\u0007￬\b\u0006\u0015\u0018\u0012\u0016\b", Color.green(0) + 23, true, objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(this.getWarnings);
        Object[] objArr6 = new Object[1];
        valueOf((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 128, 8 - Drawable.resolveOpacity(0, 0), "\u0014\u001c\u0010�\"\u0013ￏￛ￬", 9 - TextUtils.indexOf("", "", 0, 0), true, objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(this.valueOf);
        sb.append('}');
        String sb2 = sb.toString();
        getSDKVersion = (cleanup + 95) % 128;
        return sb2;
    }

    public hideProgress valueOf() {
        hideProgress hideprogress = this.get;
        cleanup = (getSDKVersion + 115) % 128;
        return hideprogress;
    }

    public showProgress values() {
        int i = cleanup;
        showProgress showprogress = this.ThreeDS2ServiceInstance;
        getSDKVersion = (i + 57) % 128;
        return showprogress;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(int r6, int r7, java.lang.String r8, int r9, boolean r10, java.lang.Object[] r11) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.apiKey.get
            monitor-enter(r0)
            char[] r1 = new char[r9]     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
        L10:
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            if (r3 >= r9) goto L31
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L2f
            com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf = r3     // Catch: java.lang.Throwable -> L2f
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            int r4 = com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 + r6
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
            r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            char r4 = r1[r3]     // Catch: java.lang.Throwable -> L2f
            int r5 = com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.values     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 - r5
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
            r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
            int r3 = r3 + 1
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r3     // Catch: java.lang.Throwable -> L2f
            goto L10
        L2f:
            r6 = move-exception
            goto L69
        L31:
            if (r7 <= 0) goto L48
            com.netcetera.threeds.sdk.infrastructure.apiKey.values = r7     // Catch: java.lang.Throwable -> L2f
            char[] r6 = new char[r9]     // Catch: java.lang.Throwable -> L2f
            java.lang.System.arraycopy(r1, r2, r6, r2, r9)     // Catch: java.lang.Throwable -> L2f
            int r7 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
            int r8 = r9 - r7
            java.lang.System.arraycopy(r6, r2, r1, r8, r7)     // Catch: java.lang.Throwable -> L2f
            int r7 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
            int r8 = r9 - r7
            java.lang.System.arraycopy(r6, r7, r1, r2, r8)     // Catch: java.lang.Throwable -> L2f
        L48:
            if (r10 == 0) goto L60
            char[] r6 = new char[r9]     // Catch: java.lang.Throwable -> L2f
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
        L4e:
            int r7 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            if (r7 >= r9) goto L5f
            int r8 = r9 - r7
            int r8 = r8 + (-1)
            char r8 = r1[r8]     // Catch: java.lang.Throwable -> L2f
            r6[r7] = r8     // Catch: java.lang.Throwable -> L2f
            int r7 = r7 + 1
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r7     // Catch: java.lang.Throwable -> L2f
            goto L4e
        L5f:
            r1 = r6
        L60:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            r11[r2] = r6
            return
        L69:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getTransactionStatus.valueOf(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
    }
}
