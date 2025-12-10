package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class setTitleMarginEnd extends setTitleMarginStart {
    public static final String ThreeDS2Service;
    public static long ThreeDS2ServiceInstance = 0;
    private static int cleanup = 0;
    private static int getSDKInfo = 1;
    private values get;
    private ThreeDS2Service valueOf;
    private valueOf values;

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
    /* loaded from: classes5.dex */
    public static final class ThreeDS2Service {
        public static final ThreeDS2Service ThreeDS2Service;
        private static int ThreeDS2Service$InitializationCallback = 1;
        public static int ThreeDS2ServiceInstance;
        private static final /* synthetic */ ThreeDS2Service[] cleanup;
        public static int get;
        public static byte[] getSDKVersion;
        public static short[] getWarnings;
        public static int initialize;
        private static int onCompleted;
        public static final ThreeDS2Service valueOf;
        public static final ThreeDS2Service values;
        private final String getSDKInfo;

        static {
            ThreeDS2Service();
            Object[] objArr = new Object[1];
            valueOf((byte) Gravity.getAbsoluteGravity(0, 0), (short) (ExpandableListView.getPackedPositionType(0L) - 76), Process.getGidForName("") - 350959107, (KeyEvent.getMaxKeyCode() >> 16) - 63, (ViewConfiguration.getScrollDefaultDelay() >> 16) - 1226275794, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            valueOf((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (short) (ExpandableListView.getPackedPositionType(0L) + 17), (-350959105) - TextUtils.indexOf("", ""), (-63) - Color.argb(0, 0, 0, 0), (-1226275831) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
            ThreeDS2Service threeDS2Service = new ThreeDS2Service(intern, 0, ((String) objArr2[0]).intern());
            values = threeDS2Service;
            Object[] objArr3 = new Object[1];
            valueOf((byte) (Process.myPid() >> 22), (short) (AndroidCharacter.getMirror('0') - 'b'), TextUtils.indexOf("", "", 0) - 350959102, (-64) - Process.getGidForName(""), (-1226275794) - View.MeasureSpec.getMode(0), objArr3);
            String intern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            valueOf((byte) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (short) ((-11) - (ViewConfiguration.getScrollBarSize() >> 8)), (-350959099) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 62, (-1226275830) - Color.argb(0, 0, 0, 0), objArr4);
            ThreeDS2Service threeDS2Service2 = new ThreeDS2Service(intern2, 1, ((String) objArr4[0]).intern());
            valueOf = threeDS2Service2;
            Object[] objArr5 = new Object[1];
            valueOf((byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (short) (ExpandableListView.getPackedPositionGroup(0L) + 19), (-350959096) - TextUtils.indexOf("", ""), 65521 - AndroidCharacter.getMirror('0'), KeyEvent.getDeadChar(0, 0) - 1226275795, objArr5);
            ThreeDS2Service threeDS2Service3 = new ThreeDS2Service(((String) objArr5[0]).intern(), 2, null);
            ThreeDS2Service = threeDS2Service3;
            cleanup = new ThreeDS2Service[]{threeDS2Service, threeDS2Service2, threeDS2Service3};
            ThreeDS2Service$InitializationCallback = (onCompleted + 25) % 128;
        }

        private ThreeDS2Service(String str, int i, String str2) {
            this.getSDKInfo = str2;
        }

        public static void ThreeDS2Service() {
            initialize = 1226275880;
            getSDKVersion = new byte[]{-59, 75, 39, -59, -15, -20, -59, 48, 14, -59, 13, 7, -53, -20, -28, -14, -16, -18, -18, -29, -26};
            ThreeDS2ServiceInstance = 62;
            get = 350959108;
        }

        public static ThreeDS2Service valueOf(String str) {
            int i = ThreeDS2Service$InitializationCallback + 91;
            onCompleted = i % 128;
            if (i % 2 != 0) {
                Enum.valueOf(ThreeDS2Service.class, str);
                throw null;
            }
            ThreeDS2Service threeDS2Service = (ThreeDS2Service) Enum.valueOf(ThreeDS2Service.class, str);
            int i2 = ThreeDS2Service$InitializationCallback + 115;
            onCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 0;
            }
            return threeDS2Service;
        }

        public static ThreeDS2Service[] values() {
            onCompleted = (ThreeDS2Service$InitializationCallback + 99) % 128;
            ThreeDS2Service[] threeDS2ServiceArr = (ThreeDS2Service[]) cleanup.clone();
            int i = ThreeDS2Service$InitializationCallback + 29;
            onCompleted = i % 128;
            if (i % 2 == 0) {
                return threeDS2ServiceArr;
            }
            throw null;
        }

        public String get() {
            int i = (ThreeDS2Service$InitializationCallback + 91) % 128;
            onCompleted = i;
            String str = this.getSDKInfo;
            ThreeDS2Service$InitializationCallback = (i + 51) % 128;
            return str;
        }

        public static ThreeDS2Service get(String str) {
            ThreeDS2Service[] values2;
            int length;
            int i;
            int i2 = onCompleted + 79;
            ThreeDS2Service$InitializationCallback = i2 % 128;
            if (i2 % 2 == 0) {
                values2 = values();
                length = values2.length;
                i = 1;
            } else {
                values2 = values();
                length = values2.length;
                i = 0;
            }
            ThreeDS2Service$InitializationCallback = (onCompleted + 7) % 128;
            while (i < length) {
                onCompleted = (ThreeDS2Service$InitializationCallback + 65) % 128;
                ThreeDS2Service threeDS2Service = values2[i];
                if (C9669om.ThreeDS2ServiceInstance((CharSequence) threeDS2Service.get(), (CharSequence) str)) {
                    int i3 = onCompleted + 97;
                    ThreeDS2Service$InitializationCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 62 / 0;
                    }
                    return threeDS2Service;
                }
                i++;
                onCompleted = (ThreeDS2Service$InitializationCallback + 119) % 128;
            }
            return ThreeDS2Service;
        }

        private static void valueOf(byte b, short s, int i, int i2, int i3, Object[] objArr) {
            String obj;
            synchronized (createTransaction.ThreeDS2ServiceInstance) {
                try {
                    StringBuilder sb = new StringBuilder();
                    int i4 = ThreeDS2ServiceInstance;
                    int i5 = i2 + i4;
                    int i6 = i5 == -1 ? 1 : 0;
                    if (i6 != 0) {
                        byte[] bArr = getSDKVersion;
                        if (bArr != null) {
                            i5 = (byte) (bArr[get + i] + i4);
                        } else {
                            i5 = (short) (getWarnings[get + i] + i4);
                        }
                    }
                    if (i5 > 0) {
                        createTransaction.values = ((i + i5) - 2) + get + i6;
                        char c = (char) (i3 + initialize);
                        createTransaction.get = c;
                        sb.append(c);
                        createTransaction.valueOf = createTransaction.get;
                        createTransaction.ThreeDS2Service = 1;
                        while (createTransaction.ThreeDS2Service < i5) {
                            byte[] bArr2 = getSDKVersion;
                            if (bArr2 != null) {
                                int i7 = createTransaction.values;
                                createTransaction.values = i7 - 1;
                                createTransaction.get = (char) (createTransaction.valueOf + (((byte) (bArr2[i7] + s)) ^ b));
                            } else {
                                short[] sArr = getWarnings;
                                int i8 = createTransaction.values;
                                createTransaction.values = i8 - 1;
                                createTransaction.get = (char) (createTransaction.valueOf + (((short) (sArr[i8] + s)) ^ b));
                            }
                            sb.append(createTransaction.get);
                            createTransaction.valueOf = createTransaction.get;
                            createTransaction.ThreeDS2Service++;
                        }
                    }
                    obj = sb.toString();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            objArr[0] = obj;
        }
    }

    /* loaded from: classes5.dex */
    public static class valueOf {
        private static int ThreeDS2Service = 1;
        private static int get;
        private final getStackTrace values;

        public valueOf(getStackTrace getstacktrace) {
            this.values = getstacktrace;
        }

        public getStackTrace get() {
            int i = (get + 87) % 128;
            ThreeDS2Service = i;
            getStackTrace getstacktrace = this.values;
            int i2 = i & 7;
            int i3 = ((i ^ 7) | i2) << 1;
            int i4 = -((i | 7) & (~i2));
            int i5 = (i3 & i4) + (i4 | i3);
            get = i5 % 128;
            if (i5 % 2 == 0) {
                return getstacktrace;
            }
            throw null;
        }
    }

    /* loaded from: classes5.dex */
    public static class values {
        public static char[] ThreeDS2Service = {'8', 'p'};
        private static int getWarnings = 1;
        private static int initialize;
        private String ThreeDS2ServiceInstance;
        private String get;
        private getInfo getSDKInfo;
        private String valueOf;
        private String values;

        public void ThreeDS2Service(String str) {
            int i = initialize + 17;
            getWarnings = i % 128;
            if (i % 2 != 0) {
                if (C9669om.ThreeDS2ServiceInstance(str)) {
                    this.get = str;
                    getWarnings = (initialize + 39) % 128;
                    return;
                }
                return;
            }
            C9669om.ThreeDS2ServiceInstance(str);
            throw null;
        }

        public String ThreeDS2ServiceInstance() {
            initialize = (getWarnings + 3) % 128;
            Object[] objArr = new Object[1];
            valueOf("\u0001\u0001", new int[]{0, 2, 64, 2}, true, objArr);
            String intern = ((String) objArr[0]).intern();
            initialize = (getWarnings + 111) % 128;
            return intern;
        }

        public String get() {
            int i = (initialize + 73) % 128;
            getWarnings = i;
            String str = this.get;
            initialize = (i + 43) % 128;
            return str;
        }

        public getInfo getSDKVersion() {
            int i = initialize + 101;
            int i2 = i % 128;
            getWarnings = i2;
            if (i % 2 != 0) {
                getInfo getinfo = this.getSDKInfo;
                initialize = (i2 + 11) % 128;
                return getinfo;
            }
            throw null;
        }

        public void valueOf(String str) {
            int i = (initialize + 103) % 128;
            getWarnings = i;
            this.ThreeDS2ServiceInstance = str;
            int i2 = i + 51;
            initialize = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public String values() {
            int i = getWarnings + 71;
            initialize = i % 128;
            if (i % 2 == 0) {
                return this.values;
            }
            throw null;
        }

        public void ThreeDS2ServiceInstance(getInfo getinfo) {
            int i = initialize;
            this.getSDKInfo = getinfo;
            getWarnings = (i + 25) % 128;
        }

        public void get(String str) {
            int i = getWarnings + 7;
            initialize = i % 128;
            int i2 = i % 2;
            this.valueOf = str;
            if (i2 != 0) {
                int i3 = 68 / 0;
            }
        }

        public String valueOf() {
            int i = getWarnings + 1;
            initialize = i % 128;
            if (i % 2 == 0) {
                return this.valueOf;
            }
            throw null;
        }

        public void values(String str) {
            int i = (initialize + 33) % 128;
            getWarnings = i;
            this.values = str;
            int i2 = i + 9;
            initialize = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
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
                char[] r8 = com.netcetera.threeds.sdk.infrastructure.setTitleMarginEnd.values.ThreeDS2Service     // Catch: java.lang.Throwable -> L38
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
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setTitleMarginEnd.values.valueOf(java.lang.String, int[], boolean, java.lang.Object[]):void");
        }

        public String ThreeDS2Service() {
            int i = initialize;
            String str = this.ThreeDS2ServiceInstance;
            getWarnings = (i + 59) % 128;
            return str;
        }
    }

    static {
        cleanup();
        Object[] objArr = new Object[1];
        ThreeDS2Service("매暜އ⒎얱\ue2b8莣ꂢ䇝滆࿒\u2cf6췹\ueae4", TextUtils.getOffsetAfter("", 0) + 57097, objArr);
        ThreeDS2Service = ((String) objArr[0]).intern();
        int i = getSDKInfo + 105;
        cleanup = i % 128;
        if (i % 2 != 0) {
            int i2 = 24 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public setTitleMarginEnd(java.lang.Boolean r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = 57098(0xdf0a, float:8.0011E-41)
            int r0 = r0 - r4
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "매暜އ⒎얱\ue2b8莣ꂢ䇝滆࿒\u2cf6췹\ueae4"
            ThreeDS2Service(r2, r0, r1)
            r0 = 0
            r0 = r1[r0]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r5.<init>(r6, r7, r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setTitleMarginEnd.<init>(java.lang.Boolean, java.lang.String, java.lang.String):void");
    }

    public static void cleanup() {
        ThreeDS2ServiceInstance = -9177412769661929051L;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart, com.netcetera.threeds.sdk.infrastructure.setCustomSelectionActionModeCallback
    public String ThreeDS2Service() {
        int i = cleanup + 93;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            return super.ThreeDS2Service();
        }
        super.ThreeDS2Service();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart, com.netcetera.threeds.sdk.infrastructure.setCustomSelectionActionModeCallback
    public Boolean ThreeDS2ServiceInstance() {
        Boolean ThreeDS2ServiceInstance2;
        int i = getSDKInfo + 117;
        cleanup = i % 128;
        if (i % 2 != 0) {
            ThreeDS2ServiceInstance2 = super.ThreeDS2ServiceInstance();
            int i2 = 29 / 0;
        } else {
            ThreeDS2ServiceInstance2 = super.ThreeDS2ServiceInstance();
        }
        int i3 = cleanup + 119;
        getSDKInfo = i3 % 128;
        if (i3 % 2 != 0) {
            return ThreeDS2ServiceInstance2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart, com.netcetera.threeds.sdk.infrastructure.setCustomSelectionActionModeCallback
    public String get() {
        int i = cleanup + 99;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            String str = super.get();
            getSDKInfo = (cleanup + 21) % 128;
            return str;
        }
        super.get();
        throw null;
    }

    public ThreeDS2Service getSDKInfo() {
        int i = getSDKInfo + 93;
        int i2 = i % 128;
        cleanup = i2;
        if (i % 2 == 0) {
            ThreeDS2Service threeDS2Service = this.valueOf;
            int i3 = i2 + 7;
            getSDKInfo = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 60 / 0;
            }
            return threeDS2Service;
        }
        throw null;
    }

    public valueOf getWarnings() {
        int i = cleanup;
        int i2 = i + 67;
        getSDKInfo = i2 % 128;
        if (i2 % 2 != 0) {
            valueOf valueof = this.values;
            int i3 = i + 23;
            getSDKInfo = i3 % 128;
            if (i3 % 2 != 0) {
                return valueof;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart, com.netcetera.threeds.sdk.infrastructure.setCustomSelectionActionModeCallback
    public String valueOf() {
        int i = getSDKInfo + 53;
        cleanup = i % 128;
        if (i % 2 != 0) {
            int i2 = 87 / 0;
            return super.valueOf();
        }
        return super.valueOf();
    }

    public values values() {
        int i = getSDKInfo + CameraActivity.REQUEST_CODE;
        cleanup = i % 128;
        if (i % 2 != 0) {
            int i2 = 29 / 0;
            return this.get;
        }
        return this.get;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public setTitleMarginEnd() {
        /*
            r6 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = 0
            int r2 = android.graphics.Color.rgb(r1, r1, r1)
            r3 = 16834313(0x100df09, float:2.3669907E-38)
            int r2 = r2 + r3
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "매暜އ⒎얱\ue2b8莣ꂢ䇝滆࿒\u2cf6췹\ueae4"
            ThreeDS2Service(r5, r2, r4)
            r2 = r4[r1]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            int r4 = android.graphics.Color.green(r1)
            r5 = 39509(0x9a55, float:5.5364E-41)
            int r5 = r5 - r4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "맧⎂赦眾킖멥\u2435膑"
            ThreeDS2Service(r4, r5, r3)
            r1 = r3[r1]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            r3 = 0
            r6.<init>(r0, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setTitleMarginEnd.<init>():void");
    }

    public void ThreeDS2Service(values valuesVar) {
        int i = getSDKInfo + 67;
        cleanup = i % 128;
        int i2 = i % 2;
        this.get = valuesVar;
        if (i2 != 0) {
            throw null;
        }
    }

    public void ThreeDS2ServiceInstance(valueOf valueof) {
        int i = (cleanup + 95) % 128;
        getSDKInfo = i;
        this.values = valueof;
        int i2 = i + 51;
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
    }

    public void ThreeDS2Service(ThreeDS2Service threeDS2Service) {
        int i = getSDKInfo;
        this.valueOf = threeDS2Service;
        int i2 = i + 115;
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
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
            long r5 = com.netcetera.threeds.sdk.infrastructure.setTitleMarginEnd.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setTitleMarginEnd.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }
}
