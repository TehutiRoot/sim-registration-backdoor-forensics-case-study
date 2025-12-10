package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.KotlinVersion;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
public class setDividerDrawable {
    public static char[] ThreeDS2Service = {18, Matrix.MATRIX_TYPE_RANDOM_LT, 'I', '\"', Matrix.MATRIX_TYPE_RANDOM_LT, 'I', '0', 'W', 'i', 'k', 'p', 'l', 'f', 'B', '0', 'H', Matrix.MATRIX_TYPE_RANDOM_LT, '4', '\"', Matrix.MATRIX_TYPE_RANDOM_LT, 'f', 188, Typography.paragraph, 131, 257, 237, 200, 221, 260, 252, 252, 257, 258, 256, 251, 256, 256, 231, 197, 211, 254, 254, 232, ':', 'p', 'j', 'k', 'N', Typography.less, AbstractJsonLexerKt.END_LIST, 'q', 'p', 'j', 'k', 'b', AbstractJsonLexerKt.END_LIST, 'k', 'r', 'n', 'l', 'n', 'l', 'm', ':', 'p', 'j', 'k', 'G', '9', 'c', 'j', 'g', 'i', 'b', 'i', 'k', 'B', '6', Matrix.MATRIX_TYPE_ZERO, 'e', 'j', 'i', 'i', AbstractJsonLexerKt.UNICODE_ESC, Matrix.MATRIX_TYPE_RANDOM_LT, '5', AbstractJsonLexerKt.END_LIST, 'H', 143, 144, 144, 142, 142, 142, '9', Matrix.MATRIX_TYPE_RANDOM_LT, '\"', 'N', 'N', 'I', Matrix.MATRIX_TYPE_RANDOM_LT, '\"', '5', 'G', 'K', '9', 'N', 'N', 'I', Matrix.MATRIX_TYPE_RANDOM_LT, '\"', 'I', Matrix.MATRIX_TYPE_RANDOM_LT, '\"', 'N', 'N', 'I', Matrix.MATRIX_TYPE_RANDOM_LT};
    private static int get = 1;
    private static int valueOf;
    private final String values;

    public setDividerDrawable(String str) {
        this.values = str;
    }

    public static setDividerDrawable ThreeDS2ServiceInstance(Context context) {
        get = (valueOf + 19) % 128;
        int i = Build.VERSION.SDK_INT;
        Object[] objArr = new Object[1];
        valueOf("\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{0, 20, 0, 0}, false, objArr);
        String format = String.format(((String) objArr[0]).intern(), Build.MANUFACTURER, Build.MODEL, Integer.valueOf(i));
        String packageName = context.getPackageName();
        Object[] objArr2 = new Object[1];
        valueOf("\u0000\u0001\u0000", new int[]{20, 3, WebSocketProtocol.PAYLOAD_SHORT, 0}, false, objArr2);
        String intern = ((String) objArr2[0]).intern();
        try {
            intern = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            get = (valueOf + 81) % 128;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Object[] objArr3 = new Object[1];
        valueOf("\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{23, 20, 147, 0}, true, objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        valueOf("\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000", new int[]{43, 20, 0, 18}, false, objArr4);
        if (C9600mq.ThreeDS2Service(((String) objArr4[0]).intern())) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr5 = new Object[1];
            valueOf("\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{63, 24, 0, 22}, false, objArr5);
            sb.append(((String) objArr5[0]).intern());
            sb.append(KotlinVersion.CURRENT);
            intern2 = sb.toString();
        }
        Object[] objArr6 = new Object[1];
        valueOf("\u0001\u0000\u0001\u0001\u0000\u0000\u0000", new int[]{87, 7, 95, 0}, false, objArr6);
        String intern3 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        valueOf("\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000", new int[]{94, 24, 0, 0}, true, objArr7);
        setDividerDrawable setdividerdrawable = new setDividerDrawable(String.format(((String) objArr7[0]).intern(), format, packageName, intern, intern3, intern2));
        valueOf = (get + 71) % 128;
        return setdividerdrawable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(java.lang.String r12, int[] r13, boolean r14, java.lang.Object[] r15) {
        /*
            if (r12 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r12 = r12.getBytes(r0)
        L8:
            byte[] r12 = (byte[]) r12
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.values
            monitor-enter(r0)
            r1 = 0
            r2 = r13[r1]     // Catch: java.lang.Throwable -> L38
            r3 = 1
            r4 = r13[r3]     // Catch: java.lang.Throwable -> L38
            r5 = 2
            r6 = r13[r5]     // Catch: java.lang.Throwable -> L38
            r7 = 3
            r7 = r13[r7]     // Catch: java.lang.Throwable -> L38
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.setDividerDrawable.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            char[] r9 = new char[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r8, r2, r9, r1, r4)     // Catch: java.lang.Throwable -> L38
            if (r12 == 0) goto L49
            char[] r2 = new char[r4]     // Catch: java.lang.Throwable -> L38
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
            r8 = 0
        L27:
            int r10 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r10 >= r4) goto L48
            r11 = r12[r10]     // Catch: java.lang.Throwable -> L38
            if (r11 != r3) goto L3a
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L38
            int r11 = r11 << r3
            int r11 = r11 + r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L38
            r2[r10] = r8     // Catch: java.lang.Throwable -> L38
            goto L41
        L38:
            r12 = move-exception
            goto L8d
        L3a:
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L38
            int r11 = r11 << r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L38
            r2[r10] = r8     // Catch: java.lang.Throwable -> L38
        L41:
            char r8 = r2[r10]     // Catch: java.lang.Throwable -> L38
            int r10 = r10 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r10     // Catch: java.lang.Throwable -> L38
            goto L27
        L48:
            r9 = r2
        L49:
            if (r7 <= 0) goto L58
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r9, r1, r12, r1, r4)     // Catch: java.lang.Throwable -> L38
            int r2 = r4 - r7
            java.lang.System.arraycopy(r12, r1, r9, r2, r7)     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r12, r7, r9, r1, r2)     // Catch: java.lang.Throwable -> L38
        L58:
            if (r14 == 0) goto L6f
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L38
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
        L5e:
            int r14 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r14 >= r4) goto L6e
            int r2 = r4 - r14
            int r2 = r2 - r3
            char r2 = r9[r2]     // Catch: java.lang.Throwable -> L38
            r12[r14] = r2     // Catch: java.lang.Throwable -> L38
            int r14 = r14 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r14     // Catch: java.lang.Throwable -> L38
            goto L5e
        L6e:
            r9 = r12
        L6f:
            if (r6 <= 0) goto L84
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L38
        L73:
            int r12 = com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
            if (r12 >= r4) goto L84
            char r14 = r9[r12]     // Catch: java.lang.Throwable -> L38
            r2 = r13[r5]     // Catch: java.lang.Throwable -> L38
            int r14 = r14 - r2
            char r14 = (char) r14     // Catch: java.lang.Throwable -> L38
            r9[r12] = r14     // Catch: java.lang.Throwable -> L38
            int r12 = r12 + 1
            com.netcetera.threeds.sdk.infrastructure.ConfigurationBuilder.ThreeDS2Service = r12     // Catch: java.lang.Throwable -> L38
            goto L73
        L84:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L38
            r12.<init>(r9)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            r15[r1] = r12
            return
        L8d:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setDividerDrawable.valueOf(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    public String get() {
        int i = get;
        int i2 = i + 53;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            String str = this.values;
            valueOf = (i + 121) % 128;
            return str;
        }
        throw null;
    }
}
