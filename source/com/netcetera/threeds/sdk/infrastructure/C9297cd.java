package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.media.AudioTrack;
import android.view.ViewConfiguration;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cd */
/* loaded from: classes5.dex */
public class C9297cd {
    public static int ThreeDS2Service = 0;
    private static int addParam = 0;
    public static long get = 0;
    private static int getParamValue = 1;
    public static char values = 59743;
    private final InterfaceC9390fn ConfigParameters;
    private final InterfaceC9396ft ThreeDS2Service$InitializationCallback;
    private final InterfaceC9515js ThreeDS2ServiceInstance;
    private final InterfaceC9385fi cleanup;
    private final InterfaceC9394fr createTransaction;
    private final InterfaceC9395fs getSDKInfo;
    private final InterfaceC9399fw getSDKVersion;
    private final InterfaceC9397fu getWarnings;
    private final InterfaceC9391fo initialize;
    private final InterfaceC9402fz onCompleted;
    private final InterfaceC9404ga onError;
    private final setWidth valueOf;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.cd$2 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C92982 {
        static final /* synthetic */ int[] ThreeDS2Service;
        private static int ThreeDS2ServiceInstance = 0;
        private static int values = 1;

        static {
            int[] iArr = new int[getLocalizedMessage.values().length];
            ThreeDS2Service = iArr;
            try {
                iArr[getLocalizedMessage.values.ordinal()] = 1;
                int i = ThreeDS2ServiceInstance;
                int i2 = ((i ^ 31) | (i & 31)) << 1;
                int i3 = -(((~i) & 31) | (i & (-32)));
                values = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ThreeDS2Service[getLocalizedMessage.get.ordinal()] = 2;
                int i4 = ThreeDS2ServiceInstance;
                int i5 = i4 & 121;
                int i6 = ((i4 ^ 121) | i5) << 1;
                int i7 = -((i4 | 121) & (~i5));
                values = ((i6 & i7) + (i7 | i6)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ThreeDS2Service[getLocalizedMessage.ThreeDS2Service.ordinal()] = 3;
                int i8 = values;
                ThreeDS2ServiceInstance = ((i8 & 37) + (i8 | 37)) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ThreeDS2Service[getLocalizedMessage.valueOf.ordinal()] = 4;
                int i9 = values;
                int i10 = i9 ^ 45;
                int i11 = (i9 & 45) << 1;
                ThreeDS2ServiceInstance = ((i10 & i11) + (i11 | i10)) % 128;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ThreeDS2Service[getLocalizedMessage.ThreeDS2ServiceInstance.ordinal()] = 5;
                int i12 = ThreeDS2ServiceInstance;
                int i13 = i12 | 73;
                values = (((i13 << 1) - (~(-((~(i12 & 73)) & i13)))) - 1) % 128;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ThreeDS2Service[getLocalizedMessage.getWarnings.ordinal()] = 6;
                int i14 = values;
                int i15 = i14 & 85;
                int i16 = (i14 | 85) & (~i15);
                int i17 = i15 << 1;
                ThreeDS2ServiceInstance = ((i16 ^ i17) + ((i16 & i17) << 1)) % 128;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ThreeDS2Service[getLocalizedMessage.getSDKInfo.ordinal()] = 7;
                int i18 = values;
                int i19 = i18 & 89;
                int i20 = (i18 | 89) & (~i19);
                int i21 = i19 << 1;
                ThreeDS2ServiceInstance = ((i20 ^ i21) + ((i20 & i21) << 1)) % 128;
            } catch (NoSuchFieldError unused7) {
            }
            int i22 = values;
            ThreeDS2ServiceInstance = ((i22 ^ 23) + ((i22 & 23) << 1)) % 128;
        }
    }

    public C9297cd(InterfaceC9515js interfaceC9515js, setWidth setwidth, InterfaceC9397fu interfaceC9397fu, InterfaceC9395fs interfaceC9395fs, InterfaceC9391fo interfaceC9391fo, InterfaceC9385fi interfaceC9385fi, InterfaceC9399fw interfaceC9399fw, InterfaceC9402fz interfaceC9402fz, InterfaceC9396ft interfaceC9396ft, InterfaceC9404ga interfaceC9404ga, InterfaceC9390fn interfaceC9390fn, InterfaceC9394fr interfaceC9394fr) {
        this.ThreeDS2ServiceInstance = interfaceC9515js;
        this.valueOf = setwidth;
        this.getWarnings = interfaceC9397fu;
        this.getSDKInfo = interfaceC9395fs;
        this.initialize = interfaceC9391fo;
        this.cleanup = interfaceC9385fi;
        this.getSDKVersion = interfaceC9399fw;
        this.onCompleted = interfaceC9402fz;
        this.ThreeDS2Service$InitializationCallback = interfaceC9396ft;
        this.onError = interfaceC9404ga;
        this.ConfigParameters = interfaceC9390fn;
        this.createTransaction = interfaceC9394fr;
    }

    public static C9297cd get(InterfaceC9515js interfaceC9515js, setWidth setwidth, InterfaceC9401fy interfaceC9401fy) {
        C9297cd c9297cd = new C9297cd(interfaceC9515js, setwidth, interfaceC9401fy, interfaceC9401fy, interfaceC9401fy, interfaceC9401fy, interfaceC9401fy, interfaceC9401fy, interfaceC9401fy, interfaceC9401fy, interfaceC9401fy, interfaceC9401fy);
        int i = getParamValue + 79;
        addParam = i % 128;
        if (i % 2 == 0) {
            return c9297cd;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(int r8, char r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object[] r13) {
        /*
            if (r12 == 0) goto L6
            char[] r12 = r12.toCharArray()
        L6:
            char[] r12 = (char[]) r12
            if (r11 == 0) goto Le
            char[] r11 = r11.toCharArray()
        Le:
            char[] r11 = (char[]) r11
            if (r10 == 0) goto L16
            char[] r10 = r10.toCharArray()
        L16:
            char[] r10 = (char[]) r10
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.cleanup.get
            monitor-enter(r0)
            java.lang.Object r11 = r11.clone()     // Catch: java.lang.Throwable -> L7c
            char[] r11 = (char[]) r11     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r12 = r12.clone()     // Catch: java.lang.Throwable -> L7c
            char[] r12 = (char[]) r12     // Catch: java.lang.Throwable -> L7c
            r1 = 0
            char r2 = r11[r1]     // Catch: java.lang.Throwable -> L7c
            r9 = r9 ^ r2
            char r9 = (char) r9     // Catch: java.lang.Throwable -> L7c
            r11[r1] = r9     // Catch: java.lang.Throwable -> L7c
            r9 = 2
            char r2 = r12[r9]     // Catch: java.lang.Throwable -> L7c
            char r8 = (char) r8     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 + r8
            char r8 = (char) r2     // Catch: java.lang.Throwable -> L7c
            r12[r9] = r8     // Catch: java.lang.Throwable -> L7c
            int r8 = r10.length     // Catch: java.lang.Throwable -> L7c
            char[] r9 = new char[r8]     // Catch: java.lang.Throwable -> L7c
            com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L7c
        L3b:
            int r2 = com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            if (r2 >= r8) goto L7e
            int r3 = r2 + 2
            int r3 = r3 % 4
            int r4 = r2 + 3
            int r4 = r4 % 4
            int r2 = r2 % 4
            char r2 = r11[r2]     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 * 32718
            char r3 = r12[r3]     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 + r3
            r5 = 65535(0xffff, float:9.1834E-41)
            int r2 = r2 % r5
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L7c
            com.netcetera.threeds.sdk.infrastructure.cleanup.values = r2     // Catch: java.lang.Throwable -> L7c
            char r6 = r11[r4]     // Catch: java.lang.Throwable -> L7c
            int r6 = r6 * 32718
            int r6 = r6 + r3
            int r6 = r6 / r5
            char r3 = (char) r6     // Catch: java.lang.Throwable -> L7c
            r12[r4] = r3     // Catch: java.lang.Throwable -> L7c
            r11[r4] = r2     // Catch: java.lang.Throwable -> L7c
            int r3 = com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            char r4 = r10[r3]     // Catch: java.lang.Throwable -> L7c
            r2 = r2 ^ r4
            long r4 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r6 = com.netcetera.threeds.sdk.infrastructure.C9297cd.get     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = com.netcetera.threeds.sdk.infrastructure.C9297cd.ThreeDS2Service     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            char r2 = com.netcetera.threeds.sdk.infrastructure.C9297cd.values     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L7c
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L7c
            r9[r3] = r2     // Catch: java.lang.Throwable -> L7c
            int r3 = r3 + 1
            com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance = r3     // Catch: java.lang.Throwable -> L7c
            goto L3b
        L7c:
            r8 = move-exception
            goto L87
        L7e:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L7c
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
            r13[r1] = r8
            return
        L87:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9297cd.valueOf(int, char, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void");
    }

    public getOrDefault values(setAllCaps setallcaps, Context context) {
        addParam = (getParamValue + 21) % 128;
        switch (C92982.ThreeDS2Service[setallcaps.onError().ordinal()]) {
            case 1:
                getOrDefault ThreeDS2ServiceInstance = this.onCompleted.ThreeDS2ServiceInstance(context, this.ThreeDS2ServiceInstance, this.getWarnings, this.cleanup, this.onError, this.createTransaction);
                getParamValue = (addParam + 67) % 128;
                return ThreeDS2ServiceInstance;
            case 2:
                return this.ThreeDS2Service$InitializationCallback.ThreeDS2Service(context, this.ThreeDS2ServiceInstance, this.getWarnings, this.cleanup, this.onError, this.createTransaction);
            case 3:
                return this.getSDKVersion.valueOf(context, this.ThreeDS2ServiceInstance, this.getWarnings, this.cleanup, this.onError, this.createTransaction);
            case 4:
                return this.getSDKInfo.values(context, this.ThreeDS2ServiceInstance, this.valueOf, this.cleanup, this.onError, setHintTextColor.valueOf(setallcaps.mastercardSchemeConfiguration()), this.createTransaction);
            case 5:
                return new C9308cn(context, this.initialize);
            case 6:
                return new C9309co(context, this.ConfigParameters, setHintTextColor.valueOf(setallcaps.mastercardSchemeConfiguration()));
            case 7:
                C9317cu c9317cu = new C9317cu(context, this.ThreeDS2ServiceInstance, this.cleanup, this.onError, this.createTransaction);
                getParamValue = (addParam + 35) % 128;
                return c9317cu;
            default:
                Object[] objArr = new Object[1];
                valueOf(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), "茣倘锶㝥顅屪茕㡄뛱䒸豛웎㌞磽昔\uedb7轹呜臚韽", "陫츅綷ẜ", "\u0000\u0000\u0000\u0000", objArr);
                throw new RuntimeException(((String) objArr[0]).intern());
        }
    }
}
