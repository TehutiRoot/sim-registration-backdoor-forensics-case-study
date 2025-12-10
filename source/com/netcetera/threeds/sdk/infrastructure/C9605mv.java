package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mv */
/* loaded from: classes5.dex */
public final class C9605mv {

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
    /* renamed from: com.netcetera.threeds.sdk.infrastructure.mv$ThreeDS2ServiceInstance */
    /* loaded from: classes5.dex */
    public static final class ThreeDS2ServiceInstance {
        public static final ThreeDS2ServiceInstance ThreeDS2Service;
        public static int ThreeDS2ServiceInstance = 0;
        public static final ThreeDS2ServiceInstance get;
        private static int getSDKVersion = 1;
        private static int getWarnings;
        private static final /* synthetic */ ThreeDS2ServiceInstance[] initialize;
        public static final ThreeDS2ServiceInstance valueOf;
        public static final ThreeDS2ServiceInstance values;
        private final String cleanup;

        static {
            ThreeDS2ServiceInstance();
            Object[] objArr = new Object[1];
            get(2 - (ViewConfiguration.getLongPressTimeout() >> 16), 4 - View.MeasureSpec.getSize(0), "\ufffa\b\ufff8\u0007", 128 - (Process.myPid() >> 22), false, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            get((ViewConfiguration.getWindowTouchSlop() >> 8) + 3, KeyEvent.keyCodeFromString("") + 4, "\n\ufff7￨\u0018", 144 - (Process.myTid() >> 22), true, objArr2);
            ThreeDS2ServiceInstance threeDS2ServiceInstance = new ThreeDS2ServiceInstance(intern, 0, ((String) objArr2[0]).intern());
            ThreeDS2Service = threeDS2ServiceInstance;
            Object[] objArr3 = new Object[1];
            get(4 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 4 - View.getDefaultSize(0, 0), "\b\ufffb\u0007\ufff9", 127 - View.MeasureSpec.getSize(0), false, objArr3);
            String intern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            get((ViewConfiguration.getEdgeSlop() >> 16) + 2, 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u000b\u0017￩\ufff8", 143 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), false, objArr4);
            ThreeDS2ServiceInstance threeDS2ServiceInstance2 = new ThreeDS2ServiceInstance(intern2, 1, ((String) objArr4[0]).intern());
            values = threeDS2ServiceInstance2;
            Object[] objArr5 = new Object[1];
            get(Color.green(0) + 2, 5 - View.resolveSizeAndState(0, 0, 0), "\u0001\u0004\ufff7\u0004\u0004", TextUtils.getCapsMode("", 0, 0) + 131, false, objArr5);
            String intern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            get(4 - (ViewConfiguration.getTapTimeout() >> 16), 4 - MotionEvent.axisFromString(""), "\u0007\n\n\uffdd\n", 157 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), true, objArr6);
            ThreeDS2ServiceInstance threeDS2ServiceInstance3 = new ThreeDS2ServiceInstance(intern3, 2, ((String) objArr6[0]).intern());
            get = threeDS2ServiceInstance3;
            Object[] objArr7 = new Object[1];
            get((ViewConfiguration.getTapTimeout() >> 16) + 7, 12 - View.MeasureSpec.getSize(0), "\b\u0014\u0001\ufff6\u0003\ufffe\ufffb\u0001\ufff6\u0003￼\ufffe", 128 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), true, objArr7);
            String intern4 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            get((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 11, "\t￣\u0006\u000b\ufffe\t\ufff0\u0006\u0004\u000b\ufffe", 152 - (ViewConfiguration.getTouchSlop() >> 8), false, objArr8);
            ThreeDS2ServiceInstance threeDS2ServiceInstance4 = new ThreeDS2ServiceInstance(intern4, 3, ((String) objArr8[0]).intern());
            valueOf = threeDS2ServiceInstance4;
            initialize = new ThreeDS2ServiceInstance[]{threeDS2ServiceInstance, threeDS2ServiceInstance2, threeDS2ServiceInstance3, threeDS2ServiceInstance4};
            int i = getWarnings + 55;
            getSDKVersion = i % 128;
            if (i % 2 == 0) {
                int i2 = 96 / 0;
            }
        }

        private ThreeDS2ServiceInstance(String str, int i, String str2) {
            this.cleanup = str2;
        }

        public static void ThreeDS2ServiceInstance() {
            ThreeDS2ServiceInstance = 53;
        }

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
            r8 = r8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void get(int r6, int r7, java.lang.String r8, int r9, boolean r10, java.lang.Object[] r11) {
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
                int r5 = com.netcetera.threeds.sdk.infrastructure.C9605mv.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
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
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9605mv.ThreeDS2ServiceInstance.get(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
        }

        public static ThreeDS2ServiceInstance valueOf(String str) {
            getSDKVersion = (getWarnings + 31) % 128;
            ThreeDS2ServiceInstance threeDS2ServiceInstance = (ThreeDS2ServiceInstance) Enum.valueOf(ThreeDS2ServiceInstance.class, str);
            getSDKVersion = (getWarnings + 35) % 128;
            return threeDS2ServiceInstance;
        }

        public static ThreeDS2ServiceInstance[] values() {
            getWarnings = (getSDKVersion + 79) % 128;
            ThreeDS2ServiceInstance[] threeDS2ServiceInstanceArr = (ThreeDS2ServiceInstance[]) initialize.clone();
            getWarnings = (getSDKVersion + 59) % 128;
            return threeDS2ServiceInstanceArr;
        }
    }
}
