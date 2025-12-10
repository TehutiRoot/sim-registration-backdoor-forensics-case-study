package com.netcetera.threeds.sdk.infrastructure;

import ch.qos.logback.core.CoreConstants;
import kotlin.text.Typography;
import org.apache.http.message.TokenParser;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum get uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class remove implements printStackTrace {
    public static final remove ThreeDS2Service;
    public static final remove ThreeDS2ServiceInstance;
    private static final /* synthetic */ remove[] cleanup;
    public static final remove get;
    private static int getSDKInfo = 1;
    private static int getSDKVersion;
    public static char[] valueOf;
    public static final remove values;
    private String getWarnings;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        values("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000", new int[]{0, 11, 0, 0}, true, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        values("\u0000", new int[]{11, 1, 177, 1}, false, objArr2);
        remove removeVar = new remove(intern, 0, ((String) objArr2[0]).intern());
        get = removeVar;
        Object[] objArr3 = new Object[1];
        values("\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000", new int[]{12, 14, 121, 0}, true, objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        values("\u0000", new int[]{26, 1, 159, 1}, false, objArr4);
        remove removeVar2 = new remove(intern2, 1, ((String) objArr4[0]).intern());
        ThreeDS2Service = removeVar2;
        Object[] objArr5 = new Object[1];
        values("\u0001\u0001", new int[]{27, 2, 38, 2}, true, objArr5);
        String intern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        values("\u0001", new int[]{29, 1, 197, 0}, false, objArr6);
        remove removeVar3 = new remove(intern3, 2, ((String) objArr6[0]).intern());
        values = removeVar3;
        Object[] objArr7 = new Object[1];
        values("\u0001\u0000\u0000", new int[]{30, 3, 0, 0}, false, objArr7);
        String intern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        values("\u0000", new int[]{33, 1, 47, 0}, true, objArr8);
        remove removeVar4 = new remove(intern4, 3, ((String) objArr8[0]).intern());
        ThreeDS2ServiceInstance = removeVar4;
        cleanup = new remove[]{removeVar, removeVar2, removeVar3, removeVar4};
        int i = getSDKInfo + 103;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }

    private remove(String str, int i, String str2) {
        this.getWarnings = str2;
    }

    public static void ThreeDS2ServiceInstance() {
        valueOf = new char[]{CoreConstants.PERCENT_CHAR, 'G', 'K', 'Y', 'Y', 'K', 'D', 'E', 'K', 'M', 'N', 'z', 'e', 196, 198, 205, 196, 197, 210, 210, 196, Typography.half, 190, 196, 198, 199, 'y', Typography.less, 'q', 132, TokenParser.f74560SP, 'B', 'K', '8'};
    }

    public static remove valueOf(String str) {
        getSDKVersion = (getSDKInfo + 63) % 128;
        remove removeVar = (remove) Enum.valueOf(remove.class, str);
        getSDKInfo = (getSDKVersion + 87) % 128;
        return removeVar;
    }

    public static remove[] values() {
        getSDKInfo = (getSDKVersion + 91) % 128;
        remove[] removeVarArr = (remove[]) cleanup.clone();
        getSDKInfo = (getSDKVersion + 83) % 128;
        return removeVarArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        String str;
        int i = getSDKVersion + 113;
        int i2 = i % 128;
        getSDKInfo = i2;
        if (i % 2 == 0) {
            str = this.getWarnings;
            int i3 = 9 / 0;
        } else {
            str = this.getWarnings;
        }
        getSDKVersion = (i2 + 97) % 128;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void values(java.lang.String r12, int[] r13, boolean r14, java.lang.Object[] r15) {
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
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.remove.valueOf     // Catch: java.lang.Throwable -> L38
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.remove.values(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }
}
