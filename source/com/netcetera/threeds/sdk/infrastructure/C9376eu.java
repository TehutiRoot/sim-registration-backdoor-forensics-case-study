package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.eu */
/* loaded from: classes5.dex */
public class C9376eu {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum values uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.netcetera.threeds.sdk.infrastructure.eu$ThreeDS2Service */
    /* loaded from: classes5.dex */
    public static final class ThreeDS2Service {
        public static final ThreeDS2Service ThreeDS2ServiceInstance;
        public static char[] get = null;
        private static int getSDKVersion = 1;
        private static int initialize;
        private static final /* synthetic */ ThreeDS2Service[] valueOf;
        public static final ThreeDS2Service values;
        private final String ThreeDS2Service;

        static {
            ThreeDS2ServiceInstance();
            Object[] objArr = new Object[1];
            valueOf("\u0000\u0000\u0000\u0000\u0000\u0000\u0000", new int[]{0, 7, 17, 4}, false, objArr);
            ThreeDS2Service threeDS2Service = new ThreeDS2Service(((String) objArr[0]).intern(), 0, "");
            values = threeDS2Service;
            Object[] objArr2 = new Object[1];
            valueOf(null, new int[]{7, 7, 125, 6}, true, objArr2);
            String intern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            valueOf("\u0000\u0001", new int[]{14, 2, 43, 1}, false, objArr3);
            ThreeDS2Service threeDS2Service2 = new ThreeDS2Service(intern, 1, ((String) objArr3[0]).intern());
            ThreeDS2ServiceInstance = threeDS2Service2;
            valueOf = new ThreeDS2Service[]{threeDS2Service, threeDS2Service2};
            int i = getSDKVersion + 85;
            initialize = i % 128;
            if (i % 2 == 0) {
                return;
            }
            throw null;
        }

        private ThreeDS2Service(String str, int i, String str2) {
            this.ThreeDS2Service = str2;
        }

        public static void ThreeDS2ServiceInstance() {
            get = new char[]{'*', Matrix.MATRIX_TYPE_RANDOM_UT, AbstractJsonLexerKt.END_LIST, 'd', 'd', 'e', AbstractJsonLexerKt.END_LIST, 207, 210, 201, 198, 190, 195, 194, '.', AbstractJsonLexerKt.BEGIN_LIST};
        }

        public static ThreeDS2Service valueOf(String str) {
            getSDKVersion = (initialize + 1) % 128;
            ThreeDS2Service threeDS2Service = (ThreeDS2Service) Enum.valueOf(ThreeDS2Service.class, str);
            initialize = (getSDKVersion + 71) % 128;
            return threeDS2Service;
        }

        public static ThreeDS2Service[] values() {
            int i = initialize + 69;
            getSDKVersion = i % 128;
            if (i % 2 != 0) {
                return (ThreeDS2Service[]) valueOf.clone();
            }
            valueOf.clone();
            throw null;
        }

        public String valueOf() {
            int i = initialize;
            String str = this.ThreeDS2Service;
            getSDKVersion = (i + 27) % 128;
            return str;
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
                char[] r8 = com.netcetera.threeds.sdk.infrastructure.C9376eu.ThreeDS2Service.get     // Catch: java.lang.Throwable -> L38
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
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9376eu.ThreeDS2Service.valueOf(java.lang.String, int[], boolean, java.lang.Object[]):void");
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum values uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.netcetera.threeds.sdk.infrastructure.eu$valueOf */
    /* loaded from: classes5.dex */
    public static final class valueOf {
        private static final /* synthetic */ valueOf[] ThreeDS2Service;
        public static long ThreeDS2ServiceInstance = 0;
        private static int cleanup = 1;
        private static int initialize;
        public static char[] valueOf;
        public static final valueOf values;
        private final String get;

        static {
            ThreeDS2Service();
            Object[] objArr = new Object[1];
            values((char) (55345 - (ViewConfiguration.getLongPressTimeout() >> 16)), View.resolveSize(0, 0), 16 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
            valueOf valueof = new valueOf(((String) objArr[0]).intern(), 0, String.valueOf(true));
            values = valueof;
            ThreeDS2Service = new valueOf[]{valueof};
            cleanup = (initialize + 65) % 128;
        }

        private valueOf(String str, int i, String str2) {
            this.get = str2;
        }

        public static void ThreeDS2Service() {
            valueOf = new char[]{55410, 18908, 64315, 28017, 40649, '\"', 45685, 9153, 21780, 51055, 26838, 39446, 3181, 48580, 12058, 20846};
            ThreeDS2ServiceInstance = 3709911535390396844L;
        }

        public static valueOf valueOf(String str) {
            cleanup = (initialize + 81) % 128;
            valueOf valueof = (valueOf) Enum.valueOf(valueOf.class, str);
            cleanup = (initialize + 97) % 128;
            return valueof;
        }

        public static valueOf[] values() {
            initialize = (cleanup + 33) % 128;
            valueOf[] valueofArr = (valueOf[]) ThreeDS2Service.clone();
            cleanup = (initialize + 91) % 128;
            return valueofArr;
        }

        public String ThreeDS2ServiceInstance() {
            int i = initialize;
            String str = this.get;
            cleanup = (i + 69) % 128;
            return str;
        }

        private static void values(char c, int i, int i2, Object[] objArr) {
            String str;
            synchronized (ConfigParameters.valueOf) {
                try {
                    char[] cArr = new char[i2];
                    ConfigParameters.ThreeDS2Service = 0;
                    while (true) {
                        int i3 = ConfigParameters.ThreeDS2Service;
                        if (i3 < i2) {
                            cArr[i3] = (char) ((valueOf[i + i3] ^ (i3 * ThreeDS2ServiceInstance)) ^ c);
                            ConfigParameters.ThreeDS2Service = i3 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            objArr[0] = str;
        }
    }

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
    /* renamed from: com.netcetera.threeds.sdk.infrastructure.eu$values */
    /* loaded from: classes5.dex */
    public static final class values {
        public static final values ThreeDS2Service;
        private static final /* synthetic */ values[] ThreeDS2ServiceInstance;
        public static final values get;
        private static int getWarnings = 1;
        private static int initialize;
        public static int valueOf;
        private final String values;

        static {
            ThreeDS2ServiceInstance();
            Object[] objArr = new Object[1];
            valueOf((ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16, "\u0006\u0003\ufffb￼\t\u0016\ufffa\u0003\u0000\ufffa\u0002\ufffa\ufff8\t\ufffb\uffff", Color.argb(0, 0, 0, 0) + BitmapUtil.IMAGE_180_DEGREE, false, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            valueOf(2 - View.MeasureSpec.getSize(0), 2 - (Process.myTid() >> 22), "\u0000\u0001", 154 - ExpandableListView.getPackedPositionChild(0L), false, objArr2);
            values valuesVar = new values(intern, 0, ((String) objArr2[0]).intern());
            get = valuesVar;
            Object[] objArr3 = new Object[1];
            valueOf(14 - (KeyEvent.getMaxKeyCode() >> 16), 17 - Process.getGidForName(""), "\u0001\ufff5\b�\ufff7\u0013\ufff7\u0003\u0001\u0004\u0000\ufff9\b\ufff9\ufff5\t\b\u0003", 183 - View.MeasureSpec.makeMeasureSpec(0, 0), false, objArr3);
            String intern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            valueOf(1 - TextUtils.indexOf("", ""), 3 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0001\uffff", ExpandableListView.getPackedPositionChild(0L) + 157, false, objArr4);
            values valuesVar2 = new values(intern2, 1, ((String) objArr4[0]).intern());
            ThreeDS2Service = valuesVar2;
            ThreeDS2ServiceInstance = new values[]{valuesVar, valuesVar2};
            initialize = (getWarnings + 67) % 128;
        }

        private values(String str, int i, String str2) {
            this.values = str2;
        }

        public static void ThreeDS2ServiceInstance() {
            valueOf = 107;
        }

        public static values valueOf(String str) {
            initialize = (getWarnings + 105) % 128;
            values valuesVar = (values) Enum.valueOf(values.class, str);
            getWarnings = (initialize + 125) % 128;
            return valuesVar;
        }

        public static values[] values() {
            getWarnings = (initialize + CameraActivity.REQUEST_CODE) % 128;
            values[] valuesVarArr = (values[]) ThreeDS2ServiceInstance.clone();
            int i = getWarnings + 33;
            initialize = i % 128;
            if (i % 2 == 0) {
                return valuesVarArr;
            }
            throw null;
        }

        public String get() {
            int i = getWarnings;
            String str = this.values;
            int i2 = i + CameraActivity.REQUEST_CODE;
            initialize = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 41 / 0;
            }
            return str;
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
                char[] r1 = new char[r7]     // Catch: java.lang.Throwable -> L2f
                r2 = 0
                com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
            L10:
                int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                if (r3 >= r7) goto L31
                char r3 = r8[r3]     // Catch: java.lang.Throwable -> L2f
                com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf = r3     // Catch: java.lang.Throwable -> L2f
                int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                int r4 = com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf     // Catch: java.lang.Throwable -> L2f
                int r4 = r4 + r9
                char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
                r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
                int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                char r4 = r1[r3]     // Catch: java.lang.Throwable -> L2f
                int r5 = com.netcetera.threeds.sdk.infrastructure.C9376eu.values.valueOf     // Catch: java.lang.Throwable -> L2f
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
                if (r6 <= 0) goto L48
                com.netcetera.threeds.sdk.infrastructure.apiKey.values = r6     // Catch: java.lang.Throwable -> L2f
                char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
                java.lang.System.arraycopy(r1, r2, r6, r2, r7)     // Catch: java.lang.Throwable -> L2f
                int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
                int r9 = r7 - r8
                java.lang.System.arraycopy(r6, r2, r1, r9, r8)     // Catch: java.lang.Throwable -> L2f
                int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
                int r9 = r7 - r8
                java.lang.System.arraycopy(r6, r8, r1, r2, r9)     // Catch: java.lang.Throwable -> L2f
            L48:
                if (r10 == 0) goto L60
                char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
                com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
            L4e:
                int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                if (r8 >= r7) goto L5f
                int r9 = r7 - r8
                int r9 = r9 + (-1)
                char r9 = r1[r9]     // Catch: java.lang.Throwable -> L2f
                r6[r8] = r9     // Catch: java.lang.Throwable -> L2f
                int r8 = r8 + 1
                com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r8     // Catch: java.lang.Throwable -> L2f
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
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9376eu.values.valueOf(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
        }
    }
}
