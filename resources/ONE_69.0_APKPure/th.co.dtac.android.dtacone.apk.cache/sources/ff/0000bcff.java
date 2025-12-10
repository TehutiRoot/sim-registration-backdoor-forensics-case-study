package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.util.TypedValue;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mn */
/* loaded from: classes5.dex */
public class C9586mn {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;
    private final values valueOf;
    private final int values;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ThreeDS2Service uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.netcetera.threeds.sdk.infrastructure.mn$values */
    /* loaded from: classes5.dex */
    public static final class values {
        public static final values ThreeDS2Service;
        public static boolean ThreeDS2ServiceInstance = false;
        public static char[] get = null;
        public static boolean getSDKInfo = false;
        private static int getSDKVersion = 0;
        private static final /* synthetic */ values[] getWarnings;
        private static int initialize = 1;
        public static int valueOf;
        public static final values values;

        static {
            ThreeDS2ServiceInstance();
            Object[] objArr = new Object[1];
            values(127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), null, null, "\u0085\u0084\u0083\u0081\u0082\u0081", objArr);
            values valuesVar = new values(((String) objArr[0]).intern(), 0);
            ThreeDS2Service = valuesVar;
            Object[] objArr2 = new Object[1];
            values(Color.green(0) + 127, null, null, "\u0083\u0088\u0087\u0086\u0084", objArr2);
            values valuesVar2 = new values(((String) objArr2[0]).intern(), 1);
            values = valuesVar2;
            getWarnings = new values[]{valuesVar, valuesVar2};
            initialize = (getSDKVersion + 103) % 128;
        }

        private values(String str, int i) {
        }

        public static void ThreeDS2ServiceInstance() {
            getSDKInfo = true;
            get = new char[]{337, 343, 338, 323, 331, 342, 319, 321};
            ThreeDS2ServiceInstance = true;
            valueOf = 254;
        }

        public static values valueOf(String str) {
            int i = initialize + 57;
            getSDKVersion = i % 128;
            if (i % 2 == 0) {
                return (values) Enum.valueOf(values.class, str);
            }
            Enum.valueOf(values.class, str);
            throw null;
        }

        public static values[] values() {
            initialize = (getSDKVersion + 101) % 128;
            values[] valuesVarArr = (values[]) getWarnings.clone();
            int i = getSDKVersion + 13;
            initialize = i % 128;
            if (i % 2 != 0) {
                return valuesVarArr;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
            r9 = r9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void values(int r6, int[] r7, java.lang.String r8, java.lang.String r9, java.lang.Object[] r10) {
            /*
                if (r9 == 0) goto L8
                java.lang.String r0 = "ISO-8859-1"
                byte[] r9 = r9.getBytes(r0)
            L8:
                byte[] r9 = (byte[]) r9
                if (r8 == 0) goto L10
                char[] r8 = r8.toCharArray()
            L10:
                char[] r8 = (char[]) r8
                java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.values
                monitor-enter(r0)
                char[] r1 = com.netcetera.threeds.sdk.infrastructure.C9586mn.values.get     // Catch: java.lang.Throwable -> L42
                int r2 = com.netcetera.threeds.sdk.infrastructure.C9586mn.values.valueOf     // Catch: java.lang.Throwable -> L42
                boolean r3 = com.netcetera.threeds.sdk.infrastructure.C9586mn.values.getSDKInfo     // Catch: java.lang.Throwable -> L42
                r4 = 0
                if (r3 == 0) goto L4d
                int r7 = r9.length     // Catch: java.lang.Throwable -> L42
                com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r7     // Catch: java.lang.Throwable -> L42
                char[] r7 = new char[r7]     // Catch: java.lang.Throwable -> L42
                com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r4     // Catch: java.lang.Throwable -> L42
            L25:
                int r8 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
                if (r8 >= r3) goto L44
                int r8 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
                int r3 = r3 + (-1)
                int r5 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                int r3 = r3 - r5
                r3 = r9[r3]     // Catch: java.lang.Throwable -> L42
                int r3 = r3 + r6
                char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
                int r3 = r3 - r2
                char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
                r7[r8] = r3     // Catch: java.lang.Throwable -> L42
                int r5 = r5 + 1
                com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
                goto L25
            L42:
                r6 = move-exception
                goto Lab
            L44:
                java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
                r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                r10[r4] = r6
                return
            L4d:
                boolean r9 = com.netcetera.threeds.sdk.infrastructure.C9586mn.values.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                if (r9 == 0) goto L7e
                int r7 = r8.length     // Catch: java.lang.Throwable -> L42
                com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r7     // Catch: java.lang.Throwable -> L42
                char[] r7 = new char[r7]     // Catch: java.lang.Throwable -> L42
                com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r4     // Catch: java.lang.Throwable -> L42
            L58:
                int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
                if (r9 >= r3) goto L75
                int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
                int r3 = r3 + (-1)
                int r5 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                int r3 = r3 - r5
                char r3 = r8[r3]     // Catch: java.lang.Throwable -> L42
                int r3 = r3 - r6
                char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
                int r3 = r3 - r2
                char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
                r7[r9] = r3     // Catch: java.lang.Throwable -> L42
                int r5 = r5 + 1
                com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
                goto L58
            L75:
                java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
                r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                r10[r4] = r6
                return
            L7e:
                int r8 = r7.length     // Catch: java.lang.Throwable -> L42
                com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r8     // Catch: java.lang.Throwable -> L42
                char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L42
                com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r4     // Catch: java.lang.Throwable -> L42
            L85:
                int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
                if (r9 >= r3) goto La2
                int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
                int r3 = r3 + (-1)
                int r5 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
                int r3 = r3 - r5
                r3 = r7[r3]     // Catch: java.lang.Throwable -> L42
                int r3 = r3 - r6
                char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
                int r3 = r3 - r2
                char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
                r8[r9] = r3     // Catch: java.lang.Throwable -> L42
                int r5 = r5 + 1
                com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
                goto L85
            La2:
                java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
                r6.<init>(r8)     // Catch: java.lang.Throwable -> L42
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
                r10[r4] = r6
                return
            Lab:
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9586mn.values.values(int, int[], java.lang.String, java.lang.String, java.lang.Object[]):void");
        }
    }

    private C9586mn(values valuesVar, int i) {
        this.valueOf = valuesVar;
        this.values = i;
    }

    public static C9586mn ThreeDS2ServiceInstance() {
        C9586mn c9586mn = new C9586mn(values.ThreeDS2Service, 0);
        int i = ThreeDS2Service;
        int i2 = (-2) - (~((i ^ 72) + ((i & 72) << 1)));
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return c9586mn;
        }
        throw null;
    }

    public int get() {
        int i = ThreeDS2Service;
        int i2 = ((((i & (-64)) | ((~i) & 63)) - (~(-(-((i & 63) << 1))))) - 1) % 128;
        ThreeDS2ServiceInstance = i2;
        int i3 = this.values;
        int i4 = i2 + 55;
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    public values values() {
        int i = ThreeDS2Service;
        int i2 = i & 21;
        int i3 = ((i ^ 21) | i2) << 1;
        int i4 = -((i | 21) & (~i2));
        int i5 = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        ThreeDS2ServiceInstance = i5;
        values valuesVar = this.valueOf;
        int i6 = (i5 & 49) + (i5 | 49);
        ThreeDS2Service = i6 % 128;
        if (i6 % 2 == 0) {
            return valuesVar;
        }
        throw null;
    }

    public static C9586mn ThreeDS2ServiceInstance(int i) {
        C9586mn c9586mn = new C9586mn(values.values, i);
        int i2 = ThreeDS2ServiceInstance + 35;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
        return c9586mn;
    }
}