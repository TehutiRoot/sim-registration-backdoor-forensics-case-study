package com.netcetera.threeds.sdk.infrastructure;

import android.telephony.cdma.CdmaCellLocation;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import kotlin.text.Typography;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class getHeadingTextColor {
    private static final getHeadingTextColor ThreeDS2Service;
    private static final getHeadingTextColor ThreeDS2ServiceInstance;
    private static final getHeadingTextColor get;
    private static int getWarnings = 1;
    private static int initialize;
    private static final getHeadingTextColor valueOf;
    public static char[] values;
    private final values cleanup;
    private final List<String> getSDKInfo;
    private final boolean getSDKVersion;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ThreeDS2ServiceInstance uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes5.dex */
    public static final class values {
        public static long ThreeDS2Service = 0;
        public static final values ThreeDS2ServiceInstance;
        private static final /* synthetic */ values[] get;
        private static int initialize = 1;
        private static int valueOf;
        public static final values values;

        static {
            valueOf();
            Object[] objArr = new Object[1];
            ThreeDS2Service("ለ艢㋓ꍕ厡쀽", 36973 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
            values valuesVar = new values(((String) objArr[0]).intern(), 0);
            ThreeDS2ServiceInstance = valuesVar;
            Object[] objArr2 = new Object[1];
            ThreeDS2Service("ሚﱪ컏\ud933ꮎ뗫葆隨愜獳巑ⱈ㺶ऒ᭶", View.resolveSizeAndState(0, 0, 0) + 61027, objArr2);
            values valuesVar2 = new values(((String) objArr2[0]).intern(), 1);
            values = valuesVar2;
            get = new values[]{valuesVar, valuesVar2};
            valueOf = (initialize + 15) % 128;
        }

        private values(String str, int i) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
            r7 = r7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void ThreeDS2Service(java.lang.String r7, int r8, java.lang.Object[] r9) {
            /*
                if (r7 == 0) goto L6
                char[] r7 = r7.toCharArray()
            L6:
                char[] r7 = (char[]) r7
                java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.initialize.values
                monitor-enter(r0)
                com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2Service = r8     // Catch: java.lang.Throwable -> L2e
                int r8 = r7.length     // Catch: java.lang.Throwable -> L2e
                char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L2e
                r1 = 0
                com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L2e
            L13:
                int r2 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
                int r3 = r7.length     // Catch: java.lang.Throwable -> L2e
                if (r2 >= r3) goto L30
                char r3 = r7[r2]     // Catch: java.lang.Throwable -> L2e
                int r4 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2Service     // Catch: java.lang.Throwable -> L2e
                int r4 = r4 * r2
                r3 = r3 ^ r4
                long r3 = (long) r3     // Catch: java.lang.Throwable -> L2e
                long r5 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.values.ThreeDS2Service     // Catch: java.lang.Throwable -> L2e
                long r3 = r3 ^ r5
                int r4 = (int) r3     // Catch: java.lang.Throwable -> L2e
                char r3 = (char) r4     // Catch: java.lang.Throwable -> L2e
                r8[r2] = r3     // Catch: java.lang.Throwable -> L2e
                int r2 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
                int r2 = r2 + 1
                com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2e
                goto L13
            L2e:
                r7 = move-exception
                goto L39
            L30:
                java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L2e
                r7.<init>(r8)     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
                r9[r1] = r7
                return
            L39:
                monitor-exit(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.values.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
        }

        public static void valueOf() {
            ThreeDS2Service = 91059005434237531L;
        }

        public static values[] values() {
            initialize = (valueOf + 51) % 128;
            values[] valuesVarArr = (values[]) get.clone();
            initialize = (valueOf + 57) % 128;
            return valuesVarArr;
        }

        public static values valueOf(String str) {
            initialize = (valueOf + 25) % 128;
            values valuesVar = (values) Enum.valueOf(values.class, str);
            int i = initialize + 9;
            valueOf = i % 128;
            if (i % 2 == 0) {
                return valuesVar;
            }
            throw null;
        }
    }

    static {
        getSDKVersion();
        Object[] objArr = new Object[1];
        get("\u0001\u0001\u0001\u0001", new int[]{11, 4, 0, 1}, false, objArr);
        get = values(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        get("\u0001\u0000\u0000\u0001", new int[]{15, 4, 189, 1}, true, objArr2);
        valueOf = values(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        get("\u0000\u0001\u0001\u0001", new int[]{19, 4, 0, 0}, false, objArr3);
        ThreeDS2Service = values(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        get("\u0000\u0000\u0001\u0001", new int[]{23, 4, 0, 0}, true, objArr4);
        ThreeDS2ServiceInstance = values(((String) objArr4[0]).intern());
        int i = initialize + 33;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            return;
        }
        throw null;
    }

    private getHeadingTextColor(List<String> list, boolean z, values valuesVar) {
        this.getSDKInfo = list;
        this.getSDKVersion = z;
        this.cleanup = valuesVar;
    }

    public static getHeadingTextColor ThreeDS2Service() {
        int i = getWarnings + 59;
        initialize = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2ServiceInstance;
        }
        throw null;
    }

    public static getHeadingTextColor ThreeDS2ServiceInstance() {
        int i = getWarnings + 93;
        int i2 = i % 128;
        initialize = i2;
        if (i % 2 == 0) {
            getHeadingTextColor getheadingtextcolor = ThreeDS2Service;
            int i3 = i2 + 23;
            getWarnings = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 11 / 0;
            }
            return getheadingtextcolor;
        }
        throw null;
    }

    public static getHeadingTextColor get() {
        int i = getWarnings + 31;
        initialize = i % 128;
        if (i % 2 == 0) {
            return get;
        }
        throw null;
    }

    public static void getSDKVersion() {
        values = new char[]{'M', 158, 190, Typography.times, 196, 197, 188, Typography.pound, 186, 211, 24, 24, 'A', 'K', ':', 135, 255, 238, 247, CoreConstants.RIGHT_PARENTHESIS_CHAR, 'K', ':', '1', 26, '2', ':', 'K'};
    }

    public static getHeadingTextColor valueOf() {
        int i = initialize;
        getHeadingTextColor getheadingtextcolor = valueOf;
        getWarnings = (i + CameraActivity.REQUEST_CODE) % 128;
        return getheadingtextcolor;
    }

    public static getHeadingTextColor values(CharSequence charSequence) {
        String str;
        if (charSequence != null) {
            str = String.valueOf(charSequence);
            initialize = (getWarnings + 97) % 128;
        } else {
            getWarnings = (initialize + 81) % 128;
            str = null;
        }
        return ThreeDS2Service(str);
    }

    public values cleanup() {
        int i = getWarnings + 71;
        int i2 = i % 128;
        initialize = i2;
        if (i % 2 == 0) {
            values valuesVar = this.cleanup;
            getWarnings = (i2 + 47) % 128;
            return valuesVar;
        }
        throw null;
    }

    public boolean getSDKInfo() {
        int i = (initialize + 107) % 128;
        getWarnings = i;
        boolean z = this.getSDKVersion;
        int i2 = i + 115;
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        return new com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor(java.util.Collections.singletonList(r3), true, com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.values.ThreeDS2ServiceInstance);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        r3 = ThreeDS2Service();
        com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.getWarnings = (com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.initialize + 17) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r3) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r3) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor ThreeDS2Service(java.lang.String r3) {
        /*
            int r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.getWarnings
            int r0 = r0 + 41
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.initialize = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L17
            boolean r0 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r3)
            r1 = 92
            int r1 = r1 / 0
            if (r0 == 0) goto L2a
            goto L1d
        L17:
            boolean r0 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r3)
            if (r0 == 0) goto L2a
        L1d:
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = new com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor
            java.util.List r3 = java.util.Collections.singletonList(r3)
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor$values r1 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.values.ThreeDS2ServiceInstance
            r2 = 1
            r0.<init>(r3, r2, r1)
            return r0
        L2a:
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r3 = ThreeDS2Service()
            int r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.initialize
            int r0 = r0 + 17
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.getWarnings = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2Service(java.lang.String):com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
        if ((!r6.matches(((java.lang.String) r2[0]).intern())) != true) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
        r1 = new java.lang.Object[1];
        get("\u0000", new int[]{10, 1, 0, 1}, false, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
        if (((java.lang.String) r1[0]).intern().equals(r6) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
        com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.initialize = (com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.getWarnings + 109) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
        r6 = get(r4);
        r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.getWarnings + 29;
        com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.initialize = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
        if ((r0 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (r6.matches(((java.lang.String) r2[0]).intern()) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor ThreeDS2ServiceInstance(java.lang.String r6) {
        /*
            boolean r0 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r6)
            if (r0 == 0) goto L80
            int r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.getWarnings
            int r0 = r0 + 35
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.initialize = r1
            int r0 = r0 % 2
            java.lang.String r1 = "\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001"
            r2 = 119(0x77, float:1.67E-43)
            r3 = 10
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L32
            int[] r0 = new int[]{r5, r3, r2, r5}
            java.lang.Object[] r2 = new java.lang.Object[r4]
            get(r1, r0, r5, r2)
            r0 = r2[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r6.matches(r0)
            if (r0 == 0) goto L80
            goto L4a
        L32:
            int[] r0 = new int[]{r5, r3, r2, r5}
            java.lang.Object[] r2 = new java.lang.Object[r4]
            get(r1, r0, r4, r2)
            r0 = r2[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r6.matches(r0)
            r0 = r0 ^ r4
            if (r0 == r4) goto L80
        L4a:
            int[] r0 = new int[]{r3, r4, r5, r4}
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "\u0000"
            get(r2, r0, r5, r1)
            r0 = r1[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L6c
            int r6 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.getWarnings
            int r6 = r6 + 109
            int r6 = r6 % 128
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.initialize = r6
            goto L6d
        L6c:
            r4 = 0
        L6d:
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r6 = get(r4)
            int r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.getWarnings
            int r0 = r0 + 29
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.initialize = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L7e
            return r6
        L7e:
            r6 = 0
            throw r6
        L80:
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r6 = ThreeDS2Service()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance(java.lang.String):com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor");
    }

    public static getHeadingTextColor get(long j) {
        initialize = (getWarnings + 85) % 128;
        getHeadingTextColor ThreeDS2Service2 = ThreeDS2Service(Long.toString(j));
        int i = getWarnings + 103;
        initialize = i % 128;
        if (i % 2 != 0) {
            int i2 = 30 / 0;
        }
        return ThreeDS2Service2;
    }

    public static getHeadingTextColor valueOf(double d) {
        getWarnings = (initialize + 77) % 128;
        if (d % 1.0d > 0.0d) {
            return ThreeDS2Service(Double.toString(d));
        }
        getHeadingTextColor getheadingtextcolor = get((long) d);
        initialize = (getWarnings + 101) % 128;
        return getheadingtextcolor;
    }

    private static getHeadingTextColor values(String str) {
        getHeadingTextColor getheadingtextcolor = new getHeadingTextColor(Collections.singletonList(str), false, values.ThreeDS2ServiceInstance);
        int i = getWarnings + 113;
        initialize = i % 128;
        if (i % 2 == 0) {
            return getheadingtextcolor;
        }
        throw null;
    }

    public static getHeadingTextColor get(boolean z) {
        initialize = (getWarnings + 37) % 128;
        getHeadingTextColor ThreeDS2Service2 = ThreeDS2Service(Boolean.toString(z));
        initialize = (getWarnings + 125) % 128;
        return ThreeDS2Service2;
    }

    public List<String> values() {
        int i = getWarnings;
        int i2 = i + 5;
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
            List<String> list = this.getSDKInfo;
            initialize = (i + 39) % 128;
            return list;
        }
        throw null;
    }

    public static getHeadingTextColor get(String str) {
        if (!C9670on.ThreeDS2ServiceInstance(str)) {
            getHeadingTextColor ThreeDS2Service2 = ThreeDS2Service();
            int i = initialize + 95;
            getWarnings = i % 128;
            if (i % 2 != 0) {
                return ThreeDS2Service2;
            }
            throw null;
        }
        int i2 = getWarnings + 111;
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
            return valueOf(Double.parseDouble(str));
        }
        valueOf(Double.parseDouble(str));
        throw null;
    }

    public static getHeadingTextColor valueOf(boolean z) {
        String num;
        int i = getWarnings;
        initialize = (i + 109) % 128;
        if (!z) {
            num = Integer.toString(0);
        } else {
            initialize = (i + 81) % 128;
            num = Integer.toString(1);
        }
        return ThreeDS2Service(num);
    }

    public static getHeadingTextColor ThreeDS2Service(List<String> list) {
        getWarnings = (initialize + 125) % 128;
        if (list != null) {
            ListIterator<String> listIterator = list.listIterator();
            getWarnings = (initialize + 69) % 128;
            while (listIterator.hasNext()) {
                if (!(!C9669om.ThreeDS2Service(listIterator.next()))) {
                    int i = getWarnings + 27;
                    initialize = i % 128;
                    if (i % 2 != 0) {
                        listIterator.remove();
                        int i2 = 28 / 0;
                    } else {
                        listIterator.remove();
                    }
                }
            }
            if (!list.isEmpty()) {
                return new getHeadingTextColor(Collections.unmodifiableList(new ArrayList(list)), true, values.values);
            }
        }
        return ThreeDS2Service();
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(java.lang.String r12, int[] r13, boolean r14, java.lang.Object[] r15) {
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
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.values     // Catch: java.lang.Throwable -> L38
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.get(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }
}
