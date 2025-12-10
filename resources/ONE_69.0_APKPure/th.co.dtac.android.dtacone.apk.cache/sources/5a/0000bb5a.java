package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;

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
public final class computeIfAbsent implements printStackTrace {
    public static long ThreeDS2Service = 0;
    private static int cleanup = 0;
    public static final computeIfAbsent get;
    private static int initialize = 1;
    private static final /* synthetic */ computeIfAbsent[] valueOf;
    public static final computeIfAbsent values;
    private final String ThreeDS2ServiceInstance;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance("㹁⿒㸘閬줜壩\ud945", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance("䢫긑䣲늼ܕ", 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
        computeIfAbsent computeifabsent = new computeIfAbsent(intern, 0, ((String) objArr2[0]).intern());
        get = computeifabsent;
        Object[] objArr3 = new Object[1];
        ThreeDS2ServiceInstance("\udc35ꢻ\udc7b숔乿㡱", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        ThreeDS2ServiceInstance("࿘ⓜྖ双{", 1 - TextUtils.getOffsetAfter("", 0), objArr4);
        computeIfAbsent computeifabsent2 = new computeIfAbsent(intern2, 1, ((String) objArr4[0]).intern());
        values = computeifabsent2;
        valueOf = new computeIfAbsent[]{computeifabsent, computeifabsent2};
        initialize = (cleanup + 17) % 128;
    }

    private computeIfAbsent(String str, int i, String str2) {
        this.ThreeDS2ServiceInstance = str2;
    }

    public static void ThreeDS2ServiceInstance() {
        ThreeDS2Service = -1327130237921532277L;
    }

    public static computeIfAbsent valueOf(String str) {
        int i = cleanup + 105;
        initialize = i % 128;
        int i2 = i % 2;
        computeIfAbsent computeifabsent = (computeIfAbsent) Enum.valueOf(computeIfAbsent.class, str);
        if (i2 == 0) {
            int i3 = 8 / 0;
        }
        int i4 = initialize + 15;
        cleanup = i4 % 128;
        if (i4 % 2 == 0) {
            return computeifabsent;
        }
        throw null;
    }

    public static computeIfAbsent[] values() {
        int i = initialize + 93;
        cleanup = i % 128;
        if (i % 2 == 0) {
            return (computeIfAbsent[]) valueOf.clone();
        }
        valueOf.clone();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        String str;
        int i = cleanup + 89;
        int i2 = i % 128;
        initialize = i2;
        if (i % 2 == 0) {
            str = this.ThreeDS2ServiceInstance;
            int i3 = 95 / 0;
        } else {
            str = this.ThreeDS2ServiceInstance;
        }
        cleanup = (i2 + 125) % 128;
        return str;
    }

    @Override // java.lang.Enum
    public String toString() {
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance("怷둜恥ቤ劲\udf01縜췘冀㒏略聽后껓፦⩄껝Ĵ覛來", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        StringBuilder sb = new StringBuilder(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance("ᜤ狵\u1756䧑鐛蒴潮\udcaa赦\uf226⻐鄏⌝桺䣓㬶\ud9ce잝툮庲羳", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(this.ThreeDS2ServiceInstance);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sb.append('}');
        String sb2 = sb.toString();
        int i = initialize + 67;
        cleanup = i % 128;
        if (i % 2 != 0) {
            int i2 = 19 / 0;
        }
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2ServiceInstance(java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
            monitor-enter(r0)
            long r1 = com.netcetera.threeds.sdk.infrastructure.computeIfAbsent.ThreeDS2Service     // Catch: java.lang.Throwable -> L3a
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2Service(r1, r8, r9)     // Catch: java.lang.Throwable -> L3a
            r9 = 4
            com.netcetera.threeds.sdk.infrastructure.getWarnings.values = r9     // Catch: java.lang.Throwable -> L3a
        L14:
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            if (r1 >= r2) goto L3c
            int r1 = r1 + (-4)
            com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            char r2 = r8[r1]     // Catch: java.lang.Throwable -> L3a
            int r3 = r1 % 4
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L3a
            r2 = r2 ^ r3
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L3a
            int r4 = com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L3a
            long r6 = com.netcetera.threeds.sdk.infrastructure.computeIfAbsent.ThreeDS2Service     // Catch: java.lang.Throwable -> L3a
            long r4 = r4 * r6
            long r2 = r2 ^ r4
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L3a
            char r2 = (char) r3     // Catch: java.lang.Throwable -> L3a
            r8[r1] = r2     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            int r1 = r1 + 1
            com.netcetera.threeds.sdk.infrastructure.getWarnings.values = r1     // Catch: java.lang.Throwable -> L3a
            goto L14
        L3a:
            r8 = move-exception
            goto L48
        L3c:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            int r2 = r2 - r9
            r1.<init>(r8, r9, r2)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            r8 = 0
            r10[r8] = r1
            return
        L48:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.computeIfAbsent.ThreeDS2ServiceInstance(java.lang.String, int, java.lang.Object[]):void");
    }
}