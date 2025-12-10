package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.apache.http.message.TokenParser;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
abstract class getSchemeLogoDark {
    private static long ConfigParameters = 0;
    private static int ConfigurationBuilder = 1;
    private static Class ThreeDS2Service;
    private static boolean ThreeDS2Service$InitializationCallback;
    private static Class ThreeDS2ServiceInstance;
    private static int addParam;
    private static int cleanup;
    private static char createTransaction;
    private static get get;
    private static char[] getSDKInfo;
    private static Field getSDKVersion;
    private static Method getWarnings;
    private static Map<Member, Object> initialize;
    private static boolean onCompleted;
    private static int onError;
    private static Class valueOf;
    private static List<values> values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark$1 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C94201 {
        static final /* synthetic */ int[] ThreeDS2Service;
        private static int ThreeDS2ServiceInstance = 1;
        private static int valueOf;
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[values.values().length];
            ThreeDS2Service = iArr;
            try {
                iArr[values.valueOf.ordinal()] = 1;
                int i = ThreeDS2ServiceInstance;
                valueOf = ((i & 103) + (i | 103)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[valueOf.values().length];
            values = iArr2;
            try {
                iArr2[valueOf.valueOf.ordinal()] = 1;
                ThreeDS2ServiceInstance = (valueOf + 49) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                values[valueOf.ThreeDS2ServiceInstance.ordinal()] = 2;
                int i2 = ThreeDS2ServiceInstance;
                valueOf = ((i2 ^ 109) + ((i2 & 109) << 1)) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                values[valueOf.ThreeDS2Service.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class ThreeDS2Service {
        private static int ThreeDS2ServiceInstance = 1;
        private static int valueOf;
        private valueOf ThreeDS2Service = valueOf.valueOf;
        private final Set<values> values = EnumSet.noneOf(values.class);

        private boolean ThreeDS2Service() {
            int i = ThreeDS2ServiceInstance + 73;
            valueOf = i % 128;
            if (i % 2 != 0) {
                if (this.ThreeDS2Service != valueOf.ThreeDS2ServiceInstance) {
                    return false;
                }
            } else if (this.ThreeDS2Service != valueOf.ThreeDS2ServiceInstance) {
                return false;
            }
            valueOf = (ThreeDS2ServiceInstance + 33) % 128;
            return true;
        }

        public static /* synthetic */ Set valueOf(ThreeDS2Service threeDS2Service) {
            int i = ThreeDS2ServiceInstance;
            valueOf = ((i & CameraActivity.REQUEST_CODE) + (i | CameraActivity.REQUEST_CODE)) % 128;
            Set<values> set = threeDS2Service.values;
            valueOf = ((i & 113) + (i | 113)) % 128;
            return set;
        }

        public final void get(ThreeDS2Service threeDS2Service) {
            int i = valueOf;
            int i2 = ((i | 9) << 1) - (i ^ 9);
            ThreeDS2ServiceInstance = i2 % 128;
            if (i2 % 2 != 0 ? !(!threeDS2Service.get()) : threeDS2Service.get()) {
                ThreeDS2ServiceInstance = (valueOf + 91) % 128;
                this.values.addAll(threeDS2Service.values);
                valueOf(threeDS2Service.ThreeDS2Service());
                int i3 = valueOf;
                ThreeDS2ServiceInstance = ((i3 ^ 81) + ((i3 & 81) << 1)) % 128;
            }
            valueOf = (ThreeDS2ServiceInstance + 95) % 128;
        }

        public final int values(int i) {
            int i2;
            int i3;
            valueOf = (ThreeDS2ServiceInstance + 87) % 128;
            if (this.values.isEmpty()) {
                int i4 = ThreeDS2ServiceInstance;
                int i5 = (i4 ^ 33) + ((i4 & 33) << 1);
                valueOf = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            } else {
                i = (i & Integer.MIN_VALUE) | (i ^ Integer.MIN_VALUE);
            }
            if (ThreeDS2Service()) {
                int i6 = valueOf;
                int i7 = ((i6 | 3) << 1) - (i6 ^ 3);
                ThreeDS2ServiceInstance = i7 % 128;
                if (i7 % 2 != 0) {
                    i2 = 1073741824;
                } else {
                    throw null;
                }
            } else {
                ThreeDS2ServiceInstance = (valueOf + 103) % 128;
                i2 = 0;
            }
            int i8 = (i & i2) | (i ^ i2);
            Iterator<values> it = this.values.iterator();
            int i9 = ThreeDS2ServiceInstance;
            valueOf = ((i9 ^ 53) + ((i9 & 53) << 1)) % 128;
            while (it.hasNext()) {
                int i10 = valueOf;
                int i11 = ((i10 | 67) << 1) - (i10 ^ 67);
                ThreeDS2ServiceInstance = i11 % 128;
                if (i11 % 2 == 0) {
                    i3 = 0 - (71 / it.next().ordinal());
                } else {
                    int i12 = -it.next().ordinal();
                    i3 = 1 << ((i12 ^ 29) + ((i12 & 29) << 1));
                }
                i8 = (i8 & i3) | (i8 ^ i3);
            }
            int i13 = valueOf;
            int i14 = (i13 & 103) + (i13 | 103);
            ThreeDS2ServiceInstance = i14 % 128;
            if (i14 % 2 != 0) {
                return i8;
            }
            throw null;
        }

        public final void valueOf(boolean z) {
            valueOf valueof;
            int i = valueOf;
            int i2 = (i ^ 15) + ((i & 15) << 1);
            ThreeDS2ServiceInstance = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = C94201.values[this.ThreeDS2Service.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    if (z) {
                        int i4 = ThreeDS2ServiceInstance;
                        int i5 = (i4 ^ 81) + ((i4 & 81) << 1);
                        valueOf = i5 % 128;
                        valueof = i5 % 2 != 0 ? valueOf.ThreeDS2ServiceInstance : valueOf.ThreeDS2ServiceInstance;
                    } else {
                        valueof = valueOf.ThreeDS2Service;
                    }
                    this.ThreeDS2Service = valueof;
                    int i6 = valueOf;
                    ThreeDS2ServiceInstance = (((i6 | 45) << 1) - (i6 ^ 45)) % 128;
                    return;
                }
                return;
            }
            int i7 = C94201.values[this.ThreeDS2Service.ordinal()];
            throw null;
        }

        public final boolean get() {
            int i = ThreeDS2ServiceInstance;
            int i2 = ((i | 49) << 1) - (i ^ 49);
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            Set<values> set = this.values;
            if (i3 != 0) {
                set.isEmpty();
                throw null;
            } else if (set.isEmpty()) {
                int i4 = valueOf;
                ThreeDS2ServiceInstance = (((i4 | 89) << 1) - (i4 ^ 89)) % 128;
                return false;
            } else {
                int i5 = valueOf;
                int i6 = (i5 & 47) + (i5 | 47);
                ThreeDS2ServiceInstance = i6 % 128;
                return i6 % 2 != 0;
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum valueOf uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes5.dex */
    public static final class get {
        public static final get ThreeDS2Service;
        private static char[] ThreeDS2ServiceInstance = null;
        private static int cleanup = 0;
        public static final get get;
        private static int getWarnings = 1;
        private static char initialize;
        public static final get valueOf;
        private static final /* synthetic */ get[] values;

        static {
            ThreeDS2ServiceInstance();
            Object[] objArr = new Object[1];
            valueOf(KeyEvent.keyCodeFromString("") + 3, (byte) (67 - KeyEvent.normalizeMetaState(0)), "\r\u000f㘑", objArr);
            get getVar = new get((String) objArr[0], 0);
            valueOf = getVar;
            Object[] objArr2 = new Object[1];
            valueOf(5 - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 52), "\u0004\r\b\u0007\u0004\n", objArr2);
            get getVar2 = new get((String) objArr2[0], 1);
            ThreeDS2Service = getVar2;
            Object[] objArr3 = new Object[1];
            valueOf((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 114), "\u000b\u0003\u000b\f\u0002\b㙇", objArr3);
            get getVar3 = new get((String) objArr3[0], 2);
            get = getVar3;
            values = new get[]{getVar, getVar2, getVar3};
            getWarnings = (cleanup + 95) % 128;
        }

        private get(String str, int i) {
        }

        public static void ThreeDS2ServiceInstance() {
            ThreeDS2ServiceInstance = new char[]{13781, 13774, 13786, 13783, 13772, 13790, 13779, 13775, 13777, 13785, 13773, 13782, 13787, 13784, 13768, 13780};
            initialize = (char) 4;
        }

        public static get valueOf(String str) {
            getWarnings = (cleanup + 59) % 128;
            return (get) Enum.valueOf(get.class, str);
        }

        public static get[] values() {
            cleanup = (getWarnings + 39) % 128;
            get[] getVarArr = (get[]) values.clone();
            int i = getWarnings + 29;
            cleanup = i % 128;
            if (i % 2 == 0) {
                return getVarArr;
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
        private static void valueOf(int r10, byte r11, java.lang.String r12, java.lang.Object[] r13) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.get.valueOf(int, byte, java.lang.String, java.lang.Object[]):void");
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum valueOf uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes5.dex */
    public static final class valueOf {
        public static final valueOf ThreeDS2Service;
        public static final valueOf ThreeDS2ServiceInstance;
        private static int cleanup = 1;
        private static char[] get;
        private static int initialize;
        public static final valueOf valueOf;
        private static final /* synthetic */ valueOf[] values;

        static {
            get();
            Object[] objArr = new Object[1];
            get(true, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{0, 11, 150, 0}, objArr);
            valueOf valueof = new valueOf((String) objArr[0], 0);
            valueOf = valueof;
            Object[] objArr2 = new Object[1];
            get(false, "\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{11, 11, 0, 0}, objArr2);
            valueOf valueof2 = new valueOf((String) objArr2[0], 1);
            ThreeDS2ServiceInstance = valueof2;
            Object[] objArr3 = new Object[1];
            get(true, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001", new int[]{22, 15, 0, 0}, objArr3);
            valueOf valueof3 = new valueOf((String) objArr3[0], 2);
            ThreeDS2Service = valueof3;
            values = new valueOf[]{valueof, valueof2, valueof3};
            cleanup = (initialize + 45) % 128;
        }

        private valueOf(String str, int i) {
        }

        public static void get() {
            get = new char[]{'m', 218, 229, 231, 224, 220, 219, 228, 228, 225, 225, TokenParser.f74560SP, 'F', Matrix.MATRIX_TYPE_RANDOM_LT, Matrix.MATRIX_TYPE_RANDOM_UT, 'P', 'K', 'M', 'K', 'S', Matrix.MATRIX_TYPE_RANDOM_LT, 'D', '\"', 'D', Matrix.MATRIX_TYPE_RANDOM_LT, 'S', 'K', 'M', 'K', 'P', Matrix.MATRIX_TYPE_RANDOM_UT, Matrix.MATRIX_TYPE_RANDOM_LT, 'F', 'P', 'Y', 'Q', 'N'};
        }

        public static valueOf valueOf(String str) {
            initialize = (cleanup + 97) % 128;
            valueOf valueof = (valueOf) Enum.valueOf(valueOf.class, str);
            cleanup = (initialize + 79) % 128;
            return valueof;
        }

        public static valueOf[] values() {
            Object clone;
            int i = cleanup + 47;
            initialize = i % 128;
            if (i % 2 != 0) {
                clone = values.clone();
            } else {
                clone = values.clone();
            }
            valueOf[] valueofArr = (valueOf[]) clone;
            initialize = (cleanup + 71) % 128;
            return valueofArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
            r13 = r13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void get(boolean r12, java.lang.String r13, int[] r14, java.lang.Object[] r15) {
            /*
                if (r13 == 0) goto L8
                java.lang.String r0 = "ISO-8859-1"
                byte[] r13 = r13.getBytes(r0)
            L8:
                byte[] r13 = (byte[]) r13
                java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.amexConfiguration.ThreeDS2ServiceInstance
                monitor-enter(r0)
                r1 = 0
                r2 = r14[r1]     // Catch: java.lang.Throwable -> L39
                r3 = 1
                r4 = r14[r3]     // Catch: java.lang.Throwable -> L39
                r5 = 2
                r6 = r14[r5]     // Catch: java.lang.Throwable -> L39
                r7 = 3
                r7 = r14[r7]     // Catch: java.lang.Throwable -> L39
                char[] r8 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.valueOf.get     // Catch: java.lang.Throwable -> L39
                char[] r9 = new char[r4]     // Catch: java.lang.Throwable -> L39
                java.lang.System.arraycopy(r8, r2, r9, r1, r4)     // Catch: java.lang.Throwable -> L39
                if (r13 == 0) goto L4b
                char[] r2 = new char[r4]     // Catch: java.lang.Throwable -> L39
                com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r1     // Catch: java.lang.Throwable -> L39
                r8 = 0
            L27:
                int r10 = com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get     // Catch: java.lang.Throwable -> L39
                if (r10 >= r4) goto L4a
                r11 = r13[r10]     // Catch: java.lang.Throwable -> L39
                if (r11 != r3) goto L3b
                char r11 = r9[r10]     // Catch: java.lang.Throwable -> L39
                int r11 = r11 * 2
                int r11 = r11 + r3
                int r11 = r11 - r8
                char r8 = (char) r11     // Catch: java.lang.Throwable -> L39
                r2[r10] = r8     // Catch: java.lang.Throwable -> L39
                goto L43
            L39:
                r12 = move-exception
                goto L8f
            L3b:
                char r11 = r9[r10]     // Catch: java.lang.Throwable -> L39
                int r11 = r11 * 2
                int r11 = r11 - r8
                char r8 = (char) r11     // Catch: java.lang.Throwable -> L39
                r2[r10] = r8     // Catch: java.lang.Throwable -> L39
            L43:
                char r8 = r2[r10]     // Catch: java.lang.Throwable -> L39
                int r10 = r10 + 1
                com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r10     // Catch: java.lang.Throwable -> L39
                goto L27
            L4a:
                r9 = r2
            L4b:
                if (r7 <= 0) goto L5a
                char[] r13 = new char[r4]     // Catch: java.lang.Throwable -> L39
                java.lang.System.arraycopy(r9, r1, r13, r1, r4)     // Catch: java.lang.Throwable -> L39
                int r2 = r4 - r7
                java.lang.System.arraycopy(r13, r1, r9, r2, r7)     // Catch: java.lang.Throwable -> L39
                java.lang.System.arraycopy(r13, r7, r9, r1, r2)     // Catch: java.lang.Throwable -> L39
            L5a:
                if (r12 == 0) goto L71
                char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L39
                com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r1     // Catch: java.lang.Throwable -> L39
            L60:
                int r13 = com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get     // Catch: java.lang.Throwable -> L39
                if (r13 >= r4) goto L70
                int r2 = r4 - r13
                int r2 = r2 - r3
                char r2 = r9[r2]     // Catch: java.lang.Throwable -> L39
                r12[r13] = r2     // Catch: java.lang.Throwable -> L39
                int r13 = r13 + 1
                com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r13     // Catch: java.lang.Throwable -> L39
                goto L60
            L70:
                r9 = r12
            L71:
                if (r6 <= 0) goto L86
                com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r1     // Catch: java.lang.Throwable -> L39
            L75:
                int r12 = com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get     // Catch: java.lang.Throwable -> L39
                if (r12 >= r4) goto L86
                char r13 = r9[r12]     // Catch: java.lang.Throwable -> L39
                r2 = r14[r5]     // Catch: java.lang.Throwable -> L39
                int r13 = r13 - r2
                char r13 = (char) r13     // Catch: java.lang.Throwable -> L39
                r9[r12] = r13     // Catch: java.lang.Throwable -> L39
                int r12 = r12 + 1
                com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r12     // Catch: java.lang.Throwable -> L39
                goto L75
            L86:
                java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L39
                r12.<init>(r9)     // Catch: java.lang.Throwable -> L39
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
                r15[r1] = r12
                return
            L8f:
                monitor-exit(r0)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.valueOf.get(boolean, java.lang.String, int[], java.lang.Object[]):void");
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum valueOf uses external variables
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
        private static values ThreeDS2Service = null;
        public static final values ThreeDS2ServiceInstance;
        private static long cleanup = 0;
        private static final /* synthetic */ values[] get;
        private static int getSDKInfo = 1;
        private static int getSDKVersion;
        public static final values valueOf;
        private static values values;

        static {
            ThreeDS2ServiceInstance();
            Object[] objArr = new Object[1];
            get("㾒\uf2a7ꗿ堮\u0b7b㶿", 52541 - TextUtils.indexOf("", "", 0, 0), objArr);
            values valuesVar = new values((String) objArr[0], 0);
            valueOf = valuesVar;
            Object[] objArr2 = new Object[1];
            get("㾉栲郌㥠意", ExpandableListView.getPackedPositionChild(0L) + 22434, objArr2);
            ThreeDS2Service = new values((String) objArr2[0], 1);
            Object[] objArr3 = new Object[1];
            get("㾋\ue61f貪댰", (ViewConfiguration.getLongPressTimeout() >> 16) + 55697, objArr3);
            values = new values((String) objArr3[0], 2);
            Object[] objArr4 = new Object[1];
            get("㾟⊱\u05eb栛䭑궔邺", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7477, objArr4);
            values valuesVar2 = new values((String) objArr4[0], 3);
            ThreeDS2ServiceInstance = valuesVar2;
            get = new values[]{valuesVar, ThreeDS2Service, values, valuesVar2};
            getSDKInfo = (getSDKVersion + 47) % 128;
        }

        private values(String str, int i) {
        }

        public static void ThreeDS2ServiceInstance() {
            cleanup = 6467833913186533322L;
        }

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
            r7 = r7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void get(java.lang.String r7, int r8, java.lang.Object[] r9) {
            /*
                if (r7 == 0) goto L6
                char[] r7 = r7.toCharArray()
            L6:
                char[] r7 = (char[]) r7
                java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.mastercardSchemeConfiguration.get
                monitor-enter(r0)
                com.netcetera.threeds.sdk.infrastructure.mastercardSchemeConfiguration.ThreeDS2ServiceInstance = r8     // Catch: java.lang.Throwable -> L2e
                int r8 = r7.length     // Catch: java.lang.Throwable -> L2e
                char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L2e
                r1 = 0
                com.netcetera.threeds.sdk.infrastructure.mastercardSchemeConfiguration.ThreeDS2Service = r1     // Catch: java.lang.Throwable -> L2e
            L13:
                int r2 = com.netcetera.threeds.sdk.infrastructure.mastercardSchemeConfiguration.ThreeDS2Service     // Catch: java.lang.Throwable -> L2e
                int r3 = r7.length     // Catch: java.lang.Throwable -> L2e
                if (r2 >= r3) goto L30
                char r3 = r7[r2]     // Catch: java.lang.Throwable -> L2e
                int r4 = com.netcetera.threeds.sdk.infrastructure.mastercardSchemeConfiguration.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
                int r4 = r4 * r2
                r3 = r3 ^ r4
                long r3 = (long) r3     // Catch: java.lang.Throwable -> L2e
                long r5 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.values.cleanup     // Catch: java.lang.Throwable -> L2e
                long r3 = r3 ^ r5
                int r4 = (int) r3     // Catch: java.lang.Throwable -> L2e
                char r3 = (char) r4     // Catch: java.lang.Throwable -> L2e
                r8[r2] = r3     // Catch: java.lang.Throwable -> L2e
                int r2 = com.netcetera.threeds.sdk.infrastructure.mastercardSchemeConfiguration.ThreeDS2Service     // Catch: java.lang.Throwable -> L2e
                int r2 = r2 + 1
                com.netcetera.threeds.sdk.infrastructure.mastercardSchemeConfiguration.ThreeDS2Service = r2     // Catch: java.lang.Throwable -> L2e
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
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.values.get(java.lang.String, int, java.lang.Object[]):void");
        }

        public static values valueOf(String str) {
            getSDKVersion = (getSDKInfo + 81) % 128;
            return (values) Enum.valueOf(values.class, str);
        }

        public static values[] values() {
            Object clone;
            int i = getSDKInfo + 11;
            getSDKVersion = i % 128;
            if (i % 2 != 0) {
                clone = get.clone();
            } else {
                clone = get.clone();
            }
            values[] valuesVarArr = (values[]) clone;
            getSDKInfo = (getSDKVersion + 65) % 128;
            return valuesVarArr;
        }
    }

    static {
        get getVar;
        Class<?> cls;
        ThreeDS2ServiceInstance();
        ViewConfiguration.getMinimumFlingVelocity();
        ViewConfiguration.getTapTimeout();
        ViewConfiguration.getMinimumFlingVelocity();
        Color.alpha(0);
        ViewConfiguration.getKeyRepeatTimeout();
        Process.getElapsedCpuTime();
        ViewConfiguration.getScrollFriction();
        ViewConfiguration.getTapTimeout();
        values = new ArrayList();
        Object[] objArr = new Object[1];
        ThreeDS2Service((-1480731830) - (ViewConfiguration.getWindowTouchSlop() >> 8), "獄蔉撕–눔\udac1粹喹ᓾ遭\uef4e\ue52b꠲\ue986ꫛ", "闖첀ꃁ\ue4f0", (char) (38089 - Color.red(0)), "䩬뷓즧誔", objArr);
        String property = System.getProperty((String) objArr[0]);
        get getVar2 = get.get;
        get = getVar2;
        if (property == null) {
            addParam = (ConfigurationBuilder + 31) % 128;
        } else {
            try {
                if (Integer.parseInt(property.substring(0, 1)) >= 2) {
                    addParam = (ConfigurationBuilder + 47) % 128;
                    getVar = get.valueOf;
                } else {
                    getVar = get.ThreeDS2Service;
                }
                getVar2 = getVar;
            } catch (NumberFormatException unused) {
            }
        }
        get = getVar2;
        try {
            Object[] objArr2 = new Object[1];
            ThreeDS2Service((-581598001) - View.MeasureSpec.getSize(0), "骿坋暈后\uf775ఖ筱蹼㸉ᘃ漕푸腂쯽ဟ筮犥Ⓧ饦聊㵹\ue38a༠\uf6b3몮\uf6dbἃꂊ澶\uddd3\uf2a9磾㕻騋噥", "闖첀ꃁ\ue4f0", (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), "콒善⯝顙", objArr2);
            cls = Class.forName(((String) objArr2[0]).intern(), true, ClassLoader.getSystemClassLoader());
            valueOf = cls;
        } catch (ClassNotFoundException unused2) {
        }
        if (cls != null) {
            values.add(values.valueOf);
            try {
                Class cls2 = valueOf;
                Object[] objArr3 = new Object[1];
                ThreeDS2ServiceInstance(null, TextUtils.indexOf("", "", 0, 0) + 127, null, "\u0088\u009d\u008d\u0091\u0084\u0098\u0098\u0091¢\u008c\u008b\u008a\u0089\u0082\u0081\u008c\u0082\u009d\u008b\u008b¡\u0088", objArr3);
                Field declaredField = cls2.getDeclaredField(((String) objArr3[0]).intern());
                declaredField.setAccessible(true);
                initialize = (HashMap) declaredField.get(valueOf);
                Class cls3 = valueOf;
                Object[] objArr4 = new Object[1];
                ThreeDS2Service(ViewConfiguration.getScrollBarFadeDuration() >> 16, "䫎딼岝墬\udb8aክ狩훷勠ｅ⼫\uf201", "闖첀ꃁ\ue4f0", (char) View.resolveSizeAndState(0, 0, 0), "\uda87ޅ⽅⦈", objArr4);
                Field declaredField2 = cls3.getDeclaredField(((String) objArr4[0]).intern());
                getSDKVersion = declaredField2;
                declaredField2.setAccessible(true);
                Class cls4 = valueOf;
                Object[] objArr5 = new Object[1];
                ThreeDS2ServiceInstance(null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), null, "\u008c\u008b\u008a\u0089\u0082\u0081\u0098\u0091\u008e\u0096 \u0096\u0085\u009f\u0082\u009d\u008b\u009e\u008e\u0096", objArr5);
                getWarnings = cls4.getDeclaredMethod(((String) objArr5[0]).intern(), Member.class, Object.class, Object[].class);
                Object[] objArr6 = new Object[1];
                ThreeDS2ServiceInstance(null, 127 - Drawable.resolveOpacity(0, 0), null, "\u009d\u008b\u008b¡\u008c\u008b\u008a\u0089\u0082\u0081¤¢£\u0090\u008c\u0082\u0088\u008b\u009c\u0094\u0090\u008c\u0096\u008b\u0085\u008c\u008e\u0091\u0090\u009e\u0084\u008b\u0085\u0090\u0082\u008c", objArr6);
                ThreeDS2Service = Class.forName(((String) objArr6[0]).intern(), true, ClassLoader.getSystemClassLoader());
                Class cls5 = valueOf;
                Object[] objArr7 = new Object[1];
                ThreeDS2ServiceInstance(null, 127 - View.MeasureSpec.getMode(0), null, "\u008c\u008b\u008a\u0089\u0082\u0081\u009d\u008b\u008b\u008a\u008e\u0087", objArr7);
                cls5.getDeclaredMethod(((String) objArr7[0]).intern(), Member.class, ThreeDS2Service);
            } catch (Exception unused3) {
            }
            get.equals(get.ThreeDS2Service);
            ConfigurationBuilder = (addParam + 55) % 128;
        }
        ConfigurationBuilder = (addParam + 91) % 128;
        get.equals(get.ThreeDS2Service);
        ConfigurationBuilder = (addParam + 55) % 128;
    }

    public static String ThreeDS2Service(String str, long j, ThreeDS2Service threeDS2Service) throws IOException {
        int i = addParam + 9;
        ConfigurationBuilder = i % 128;
        if (i % 2 == 0) {
            String[] strArr = new String[0];
            strArr[1] = str;
            return values(strArr, false, j, threeDS2Service);
        }
        return values(new String[]{str}, false, j, threeDS2Service);
    }

    public static void ThreeDS2ServiceInstance() {
        cleanup = 245;
        ThreeDS2Service$InitializationCallback = true;
        onCompleted = true;
        getSDKInfo = new char[]{322, 346, 354, 343, 359, 277, 362, 360, 361, 349, 356, 345, 344, 355, 351, 291, 342, 297, 294, 365, 255, 350, 315, 353, 328, 366, 325, 357, 352, 363, 324, 348, 317, 312, 333, 340};
        ConfigParameters = -1949881884431313450L;
        onError = 0;
        createTransaction = (char) 0;
    }

    private static int valueOf(Member member) {
        int i;
        if (!(member instanceof Method)) {
            int i2 = ConfigurationBuilder + 65;
            addParam = i2 % 128;
            if (i2 % 2 == 0 ? !(member instanceof Constructor) : !(member instanceof Constructor)) {
                Object[] objArr = new Object[1];
                ThreeDS2ServiceInstance(null, 127 - (Process.myTid() >> 22), null, "\u0090\u0089\u008d\u0082\u008f\u0084\u008b\u0086\u0085\u008b\u0089\u008d\u0087\u0085\u0089\u0088\u008e\u008b\u008d\u0086\u0085\u008b\u0086\u008c\u008b\u008a\u0089\u0082\u0083\u0086\u0082\u0084\u0086\u0089\u0088\u0087\u0083\u0086\u0085\u0082\u0084\u0083\u0082\u0081", objArr);
                throw new IllegalArgumentException((String) objArr[0]);
            }
        }
        try {
            if (get == get.valueOf && ((i = Build.VERSION.SDK_INT) == 21 || i == 22)) {
                Object[] objArr2 = new Object[1];
                ThreeDS2Service(TextUtils.getTrimmedLength(""), "锼㎹頬뭞쫿\uf411啸덮ⅶ\uf2bd㯽縗\u0ec7뙓㚙勜醲唦靮ᷨ跙筂韁탊蘠耓ሓ≭\ue551䅡\ue8fa礤", "闖첀ꃁ\ue4f0", (char) (758 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "䒎辊\uf617켂", objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                Object[] objArr3 = new Object[1];
                ThreeDS2ServiceInstance(null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, "\u008c\u008b\u008a\u0089\u0082\u0081\u0089\u0085\u0091", objArr3);
                Field declaredField = cls.getDeclaredField((String) objArr3[0]);
                declaredField.setAccessible(true);
                Object[] objArr4 = new Object[1];
                ThreeDS2Service((ViewConfiguration.getJumpTapTimeout() >> 16) + 1940245220, "ᓯ\udf80指䒨껸骬ꃑ蜠\ue812忈彩\uda38敨呉ᘲ〲늶Ὂ䪎⛥ᒿ\ue59a覹涎ꒉ䄹꺋", "闖첀ꃁ\ue4f0", (char) (4393 - ExpandableListView.getPackedPositionType(0L)), "\ue41eꗊ⥳눑", objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                ThreeDS2Service(1862436191 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "唠\ueebdꥄ홙\ue15e舤踰橶菆着=", "闖첀ꃁ\ue4f0", (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), "弤ʅ繯\uefdd", objArr5);
                Field declaredField2 = cls2.getDeclaredField((String) objArr5[0]);
                declaredField2.setAccessible(true);
                int i3 = declaredField2.getInt(declaredField.get(member));
                int i4 = addParam + 43;
                ConfigurationBuilder = i4 % 128;
                if (i4 % 2 != 0) {
                    return i3;
                }
                throw null;
            }
        } catch (Throwable unused) {
        }
        return member.getModifiers();
    }

    public static Object values(Class cls, Class[] clsArr, Object[] objArr, ThreeDS2Service threeDS2Service) throws IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        addParam = (ConfigurationBuilder + 55) % 128;
        Object values2 = values(cls.getConstructor(clsArr), cls, objArr, threeDS2Service);
        addParam = (ConfigurationBuilder + 43) % 128;
        return values2;
    }

    public static String ThreeDS2Service(String str, String str2, ThreeDS2Service threeDS2Service) {
        String str3;
        ConfigurationBuilder = (addParam + 91) % 128;
        File values2 = values(str, threeDS2Service);
        if (values2 != null && valueOf(values2, threeDS2Service) && values2.isFile()) {
            try {
                Scanner useDelimiter = new Scanner(new FileInputStream(values2)).useDelimiter(str2);
                if (useDelimiter.hasNext()) {
                    int i = addParam + 15;
                    ConfigurationBuilder = i % 128;
                    if (i % 2 != 0) {
                        str3 = useDelimiter.next();
                    } else {
                        useDelimiter.next();
                        throw null;
                    }
                } else {
                    str3 = "";
                }
                useDelimiter.close();
                addParam = (ConfigurationBuilder + 83) % 128;
                return str3;
            } catch (IOException unused) {
            }
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.values.contains(com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.values.ThreeDS2ServiceInstance) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.values> ThreeDS2ServiceInstance(java.lang.reflect.Member r5) {
        /*
            boolean r0 = r5 instanceof java.lang.reflect.Method
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L2e
            int r0 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ConfigurationBuilder
            int r0 = r0 + 67
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.addParam = r0
            boolean r0 = r5 instanceof java.lang.reflect.Constructor
            if (r0 == 0) goto L13
            goto L2e
        L13:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r0 = 0
            float r3 = android.graphics.PointF.length(r0, r0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            int r0 = 127 - r0
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "\u0090\u0089\u008d\u0082\u008f\u0084\u008b\u0086\u0085\u008b\u0089\u008d\u0087\u0085\u0089\u0088\u008e\u008b\u008d\u0086\u0085\u008b\u0086\u008c\u008b\u008a\u0089\u0082\u0083\u0086\u0082\u0084\u0086\u0089\u0088\u0087\u0083\u0086\u0085\u0082\u0084\u0083\u0082\u0081"
            ThreeDS2ServiceInstance(r2, r0, r2, r4, r3)
            r0 = r3[r1]
            java.lang.String r0 = (java.lang.String) r0
            r5.<init>(r0)
            throw r5
        L2e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.List<com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark$values> r1 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.values
            com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark$values r3 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.values.valueOf
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L78
            int r1 = valueOf(r5)
            r4 = r1 & 256(0x100, float:3.59E-43)
            if (r4 != 0) goto L75
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r4
            if (r1 == 0) goto L4b
            goto L75
        L4b:
            java.util.Map<java.lang.reflect.Member, java.lang.Object> r1 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.initialize
            if (r1 == 0) goto L78
            int r4 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.addParam
            int r4 = r4 + 103
            int r4 = r4 % 128
            com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ConfigurationBuilder = r4
            java.util.Set r1 = r1.keySet()
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L78
            int r1 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ConfigurationBuilder
            int r1 = r1 + 115
            int r4 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.addParam = r4
            int r1 = r1 % 2
            if (r1 != 0) goto L71
            r0.add(r3)
            goto L78
        L71:
            r0.add(r3)
            throw r2
        L75:
            r0.add(r3)
        L78:
            java.util.List<com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark$values> r1 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.values
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L92
            int r1 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.addParam
            int r1 = r1 + 115
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ConfigurationBuilder = r1
            java.util.List<com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark$values> r1 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.values
            com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark$values r2 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.values.ThreeDS2ServiceInstance
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto La7
        L92:
            int r5 = r5.getModifiers()
            r5 = r5 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto La7
            int r5 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ConfigurationBuilder
            int r5 = r5 + 19
            int r5 = r5 % 128
            com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.addParam = r5
            com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark$values r5 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.values.ThreeDS2ServiceInstance
            r0.add(r5)
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ThreeDS2ServiceInstance(java.lang.reflect.Member):java.util.List");
    }

    public static Object values(String str, Object obj, ThreeDS2Service threeDS2Service) throws IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        addParam = (ConfigurationBuilder + 107) % 128;
        Object values2 = values(str, obj, null, null, threeDS2Service);
        int i = addParam + 95;
        ConfigurationBuilder = i % 128;
        if (i % 2 != 0) {
            return values2;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Object values(String str, Object obj, Class[] clsArr, Object[] objArr, ThreeDS2Service threeDS2Service) throws IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int i = ConfigurationBuilder + 95;
        addParam = i % 128;
        if (i % 2 == 0) {
            Class cls = !(obj instanceof Class) ? obj.getClass() : (Class) obj;
            if (clsArr == null) {
                int i2 = addParam + 105;
                ConfigurationBuilder = i2 % 128;
                clsArr = i2 % 2 == 0 ? new Class[0] : new Class[0];
            }
            try {
                Object values2 = values(cls.getMethod(str, clsArr), obj, objArr, threeDS2Service);
                addParam = (ConfigurationBuilder + 15) % 128;
                return values2;
            } catch (InstantiationException unused) {
                return null;
            }
        }
        boolean z = obj instanceof Class;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(int r8, java.lang.String r9, java.lang.String r10, char r11, java.lang.String r12, java.lang.Object[] r13) {
        /*
            if (r12 == 0) goto L6
            char[] r12 = r12.toCharArray()
        L6:
            char[] r12 = (char[]) r12
            if (r10 == 0) goto Le
            char[] r10 = r10.toCharArray()
        Le:
            char[] r10 = (char[]) r10
            if (r9 == 0) goto L16
            char[] r9 = r9.toCharArray()
        L16:
            char[] r9 = (char[]) r9
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.C9287build.valueOf
            monitor-enter(r0)
            java.lang.Object r12 = r12.clone()     // Catch: java.lang.Throwable -> L7c
            char[] r12 = (char[]) r12     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r10 = r10.clone()     // Catch: java.lang.Throwable -> L7c
            char[] r10 = (char[]) r10     // Catch: java.lang.Throwable -> L7c
            r1 = 0
            char r2 = r12[r1]     // Catch: java.lang.Throwable -> L7c
            r11 = r11 ^ r2
            char r11 = (char) r11     // Catch: java.lang.Throwable -> L7c
            r12[r1] = r11     // Catch: java.lang.Throwable -> L7c
            r11 = 2
            char r2 = r10[r11]     // Catch: java.lang.Throwable -> L7c
            char r8 = (char) r8     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 + r8
            char r8 = (char) r2     // Catch: java.lang.Throwable -> L7c
            r10[r11] = r8     // Catch: java.lang.Throwable -> L7c
            int r8 = r9.length     // Catch: java.lang.Throwable -> L7c
            char[] r11 = new char[r8]     // Catch: java.lang.Throwable -> L7c
            com.netcetera.threeds.sdk.infrastructure.C9287build.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L7c
        L3b:
            int r2 = com.netcetera.threeds.sdk.infrastructure.C9287build.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            if (r2 >= r8) goto L7e
            int r3 = r2 + 2
            int r3 = r3 % 4
            int r4 = r2 + 3
            int r4 = r4 % 4
            int r2 = r2 % 4
            char r2 = r12[r2]     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 * 32718
            char r3 = r10[r3]     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 + r3
            r5 = 65535(0xffff, float:9.1834E-41)
            int r2 = r2 % r5
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L7c
            com.netcetera.threeds.sdk.infrastructure.C9287build.ThreeDS2Service = r2     // Catch: java.lang.Throwable -> L7c
            char r6 = r12[r4]     // Catch: java.lang.Throwable -> L7c
            int r6 = r6 * 32718
            int r6 = r6 + r3
            int r6 = r6 / r5
            char r3 = (char) r6     // Catch: java.lang.Throwable -> L7c
            r10[r4] = r3     // Catch: java.lang.Throwable -> L7c
            r12[r4] = r2     // Catch: java.lang.Throwable -> L7c
            int r3 = com.netcetera.threeds.sdk.infrastructure.C9287build.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            char r4 = r9[r3]     // Catch: java.lang.Throwable -> L7c
            r2 = r2 ^ r4
            long r4 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r6 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ConfigParameters     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.onError     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            char r2 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.createTransaction     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L7c
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L7c
            r11[r3] = r2     // Catch: java.lang.Throwable -> L7c
            int r3 = r3 + 1
            com.netcetera.threeds.sdk.infrastructure.C9287build.ThreeDS2ServiceInstance = r3     // Catch: java.lang.Throwable -> L7c
            goto L3b
        L7c:
            r8 = move-exception
            goto L87
        L7e:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L7c
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
            r13[r1] = r8
            return
        L87:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ThreeDS2Service(int, java.lang.String, java.lang.String, char, java.lang.String, java.lang.Object[]):void");
    }

    private static Object values(Member member, Object obj, Object[] objArr, ThreeDS2Service threeDS2Service) throws IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object newInstance;
        Object invoke;
        List<values> ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(member);
        if (threeDS2Service != null) {
            ThreeDS2Service.valueOf(threeDS2Service).addAll(ThreeDS2ServiceInstance2);
        }
        if (!ThreeDS2ServiceInstance2.isEmpty() && ThreeDS2ServiceInstance2.size() == 1 && C94201.ThreeDS2Service[ThreeDS2ServiceInstance2.get(0).ordinal()] == 1) {
            if (threeDS2Service != null) {
                threeDS2Service.valueOf(true);
            }
            if (member instanceof Method) {
                int i = Build.VERSION.SDK_INT;
                if (i == 21 || i == 22) {
                    synchronized (getSchemeLogoDark.class) {
                        getSDKVersion.setBoolean(valueOf, true);
                        invoke = getWarnings.invoke(valueOf, member, obj, objArr);
                        getSDKVersion.setBoolean(valueOf, false);
                    }
                    return invoke;
                }
                return getWarnings.invoke(valueOf, member, obj, objArr);
            }
            synchronized (getSchemeLogoDark.class) {
                getSDKVersion.setBoolean(valueOf, true);
                newInstance = ((Constructor) member).newInstance(objArr);
                getSDKVersion.setBoolean(valueOf, false);
            }
            return newInstance;
        }
        if (threeDS2Service != null) {
            threeDS2Service.valueOf(false);
        }
        if (member instanceof Constructor) {
            return ((Constructor) member).newInstance(objArr);
        }
        return ((Method) member).invoke(obj, objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0097, code lost:
        if (((java.lang.Boolean) values((java.lang.String) r1[0], r14, r15)).booleanValue() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean valueOf(java.io.File r14, com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ThreeDS2Service r15) {
        /*
            int r0 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.addParam
            int r0 = r0 + 117
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ConfigurationBuilder = r0
            r0 = 0
            int r1 = android.graphics.Color.red(r0)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r2 = "崖묛ꦻ뺇\uee25峼"
            java.lang.String r3 = "闖첀ꃁ\ue4f0"
            int r4 = android.view.KeyEvent.getModifierMetaStateMask()     // Catch: java.lang.Exception -> Lbc
            byte r4 = (byte) r4     // Catch: java.lang.Exception -> Lbc
            r5 = 33800(0x8408, float:4.7364E-41)
            int r4 = r4 + r5
            char r4 = (char) r4     // Catch: java.lang.Exception -> Lbc
            java.lang.String r5 = "뺬\ueebeܣ놄"
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> Lbc
            r6 = r8
            ThreeDS2Service(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> Lbc
            r1 = r8[r0]     // Catch: java.lang.Exception -> Lbc
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lbc
            java.lang.Object r1 = values(r1, r14, r15)     // Catch: java.lang.Exception -> Lbc
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> Lbc
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> Lbc
            if (r1 != 0) goto Lbb
            int r1 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.addParam
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ConfigurationBuilder = r2
            int r1 = r1 % 2
            r2 = -1
            r3 = 994792212(0x3b4b5314, float:0.003102486)
            if (r1 != 0) goto L6f
            int r1 = android.view.ViewConfiguration.getMaximumFlingVelocity()     // Catch: java.lang.Exception -> Lbc
            int r1 = r1 / 65
            int r8 = r1 + r3
            java.lang.String r9 = "\ue3f2麨ෳ倠\uf130톃\udaaa䳃ꛭ\uf00cర"
            java.lang.String r10 = "闖첀ꃁ\ue4f0"
            int r1 = android.graphics.ImageFormat.getBitsPerPixel(r0)     // Catch: java.lang.Exception -> Lbc
            int r2 = r2 % r1
            char r11 = (char) r2     // Catch: java.lang.Exception -> Lbc
            java.lang.String r12 = "ᒣ䭓༻㝥"
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> Lbc
            r13 = r1
            ThreeDS2Service(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> Lbc
            r1 = r1[r0]     // Catch: java.lang.Exception -> Lbc
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lbc
            java.lang.Object r1 = values(r1, r14, r15)     // Catch: java.lang.Exception -> Lbc
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> Lbc
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> Lbc
            if (r1 != 0) goto Lbb
            goto L99
        L6f:
            int r1 = android.view.ViewConfiguration.getMaximumFlingVelocity()     // Catch: java.lang.Exception -> Lbc
            int r1 = r1 >> 16
            int r8 = r1 + r3
            java.lang.String r9 = "\ue3f2麨ෳ倠\uf130톃\udaaa䳃ꛭ\uf00cర"
            java.lang.String r10 = "闖첀ꃁ\ue4f0"
            int r1 = android.graphics.ImageFormat.getBitsPerPixel(r0)     // Catch: java.lang.Exception -> Lbc
            int r2 = r2 - r1
            char r11 = (char) r2     // Catch: java.lang.Exception -> Lbc
            java.lang.String r12 = "ᒣ䭓༻㝥"
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> Lbc
            r13 = r1
            ThreeDS2Service(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> Lbc
            r1 = r1[r0]     // Catch: java.lang.Exception -> Lbc
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lbc
            java.lang.Object r1 = values(r1, r14, r15)     // Catch: java.lang.Exception -> Lbc
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> Lbc
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> Lbc
            if (r1 != 0) goto Lbb
        L99:
            int r1 = android.view.ViewConfiguration.getScrollDefaultDelay()     // Catch: java.lang.Exception -> Lbc
            int r1 = r1 >> 16
            int r1 = r1 + 127
            java.lang.String r2 = "\u0082\u0098\u0096\u0097\u0088\u0096"
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> Lbc
            r4 = 0
            ThreeDS2ServiceInstance(r4, r1, r4, r2, r3)     // Catch: java.lang.Exception -> Lbc
            r1 = r3[r0]     // Catch: java.lang.Exception -> Lbc
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lbc
            java.lang.Object r15 = values(r1, r14, r15)     // Catch: java.lang.Exception -> Lbc
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.lang.Exception -> Lbc
            boolean r14 = r15.booleanValue()     // Catch: java.lang.Exception -> Lbc
            if (r14 == 0) goto Lba
            goto Lbb
        Lba:
            return r0
        Lbb:
            return r7
        Lbc:
            boolean r14 = r14.exists()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.valueOf(java.io.File, com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark$ThreeDS2Service):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r9 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2ServiceInstance(java.lang.String r6, int r7, int[] r8, java.lang.String r9, java.lang.Object[] r10) {
        /*
            if (r9 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r9 = r9.getBytes(r0)
        L8:
            byte[] r9 = (byte[]) r9
            if (r6 == 0) goto L10
            char[] r6 = r6.toCharArray()
        L10:
            char[] r6 = (char[]) r6
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.removeParam.valueOf
            monitor-enter(r0)
            char[] r1 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.getSDKInfo     // Catch: java.lang.Throwable -> L42
            int r2 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.cleanup     // Catch: java.lang.Throwable -> L42
            boolean r3 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ThreeDS2Service$InitializationCallback     // Catch: java.lang.Throwable -> L42
            r4 = 0
            if (r3 == 0) goto L4d
            int r6 = r9.length     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.removeParam.ThreeDS2Service = r6     // Catch: java.lang.Throwable -> L42
            char[] r6 = new char[r6]     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.removeParam.get = r4     // Catch: java.lang.Throwable -> L42
        L25:
            int r8 = com.netcetera.threeds.sdk.infrastructure.removeParam.get     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.removeParam.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            if (r8 >= r3) goto L44
            int r8 = com.netcetera.threeds.sdk.infrastructure.removeParam.get     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.removeParam.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.netcetera.threeds.sdk.infrastructure.removeParam.get     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            r3 = r9[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + r7
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r6[r8] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.netcetera.threeds.sdk.infrastructure.removeParam.get = r5     // Catch: java.lang.Throwable -> L42
            goto L25
        L42:
            r6 = move-exception
            goto Lab
        L44:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r7
            return
        L4d:
            boolean r9 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.onCompleted     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L7e
            int r8 = r6.length     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.removeParam.ThreeDS2Service = r8     // Catch: java.lang.Throwable -> L42
            char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.removeParam.get = r4     // Catch: java.lang.Throwable -> L42
        L58:
            int r9 = com.netcetera.threeds.sdk.infrastructure.removeParam.get     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.removeParam.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            if (r9 >= r3) goto L75
            int r9 = com.netcetera.threeds.sdk.infrastructure.removeParam.get     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.removeParam.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.netcetera.threeds.sdk.infrastructure.removeParam.get     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            char r3 = r6[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r7
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r8[r9] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.netcetera.threeds.sdk.infrastructure.removeParam.get = r5     // Catch: java.lang.Throwable -> L42
            goto L58
        L75:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r6
            return
        L7e:
            int r6 = r8.length     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.removeParam.ThreeDS2Service = r6     // Catch: java.lang.Throwable -> L42
            char[] r6 = new char[r6]     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.removeParam.get = r4     // Catch: java.lang.Throwable -> L42
        L85:
            int r9 = com.netcetera.threeds.sdk.infrastructure.removeParam.get     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.removeParam.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            if (r9 >= r3) goto La2
            int r9 = com.netcetera.threeds.sdk.infrastructure.removeParam.get     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.removeParam.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.netcetera.threeds.sdk.infrastructure.removeParam.get     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            r3 = r8[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r7
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r6[r9] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.netcetera.threeds.sdk.infrastructure.removeParam.get = r5     // Catch: java.lang.Throwable -> L42
            goto L85
        La2:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r7
            return
        Lab:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ThreeDS2ServiceInstance(java.lang.String, int, int[], java.lang.String, java.lang.Object[]):void");
    }

    private static String values(String[] strArr, boolean z, long j, ThreeDS2Service threeDS2Service) throws IOException {
        try {
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance(null, Process.getGidForName("") + 128, null, "\u008d\u0082\u0094\u0082", objArr);
            Object[] objArr2 = new Object[1];
            ThreeDS2Service(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, "ꕴ꽠", "闖첀ꃁ\ue4f0", (char) (46660 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "፨Ԯ䎌皶", objArr2);
            Process process = (Process) values((String) objArr[0], Runtime.getRuntime(), new Class[]{String[].class, String[].class, File.class}, new Object[]{new String[]{(String) objArr2[0]}, null, null}, threeDS2Service);
            getSchemeId getschemeid = new getSchemeId(process.getInputStream());
            getSchemeId getschemeid2 = new getSchemeId(process.getErrorStream());
            DataOutputStream dataOutputStream = new DataOutputStream(process.getOutputStream());
            getschemeid.start();
            getschemeid2.start();
            ConfigurationBuilder = (addParam + 53) % 128;
            int i = 0;
            while (i <= 0) {
                String str = strArr[0];
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                Object[] objArr3 = new Object[1];
                ThreeDS2ServiceInstance(null, 127 - TextUtils.getOffsetAfter("", 0), null, "\u0095", objArr3);
                sb.append((String) objArr3[0]);
                String obj = sb.toString();
                Object[] objArr4 = new Object[1];
                ThreeDS2Service((-2041054439) - ExpandableListView.getPackedPositionGroup(0L), "식恵딓틕ꯝ", "闖첀ꃁ\ue4f0", (char) (32667 - KeyEvent.getDeadChar(0, 0)), "ᦠ埻鮆\uf27f", objArr4);
                dataOutputStream.write(obj.getBytes((String) objArr4[0]));
                dataOutputStream.flush();
                i++;
                ConfigurationBuilder = (addParam + 23) % 128;
            }
            Object[] objArr5 = new Object[1];
            ThreeDS2Service(1828614189 - (Process.myTid() >> 22), "紽鋫ެ\u12c6뒅", "闖첀ꃁ\ue4f0", (char) (KeyEvent.keyCodeFromString("") + 26898), "ⴞﹰቬ瑩", objArr5);
            Object[] objArr6 = new Object[1];
            ThreeDS2Service((KeyEvent.getMaxKeyCode() >> 16) - 2041054439, "식恵딓틕ꯝ", "闖첀ꃁ\ue4f0", (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 32667), "ᦠ埻鮆\uf27f", objArr6);
            dataOutputStream.write(((String) objArr5[0]).getBytes((String) objArr6[0]));
            dataOutputStream.flush();
            try {
                if (j < 0) {
                    process.waitFor();
                } else {
                    values(process, j, TimeUnit.MILLISECONDS);
                    addParam = (ConfigurationBuilder + 111) % 128;
                }
                try {
                    dataOutputStream.close();
                } catch (IOException unused) {
                }
                getschemeid.join(100L);
                getschemeid2.join(10L);
                try {
                    process.destroy();
                } catch (Exception unused2) {
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getschemeid.values());
                sb2.append(getschemeid2.values());
                return sb2.toString();
            } catch (InterruptedException e) {
                throw e;
            } catch (Throwable th2) {
                try {
                    process.destroy();
                } catch (Exception unused3) {
                }
                throw th2;
            }
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof NullPointerException) && !(cause instanceof IllegalArgumentException)) {
                int i2 = ConfigurationBuilder;
                int i3 = i2 + 63;
                addParam = i3 % 128;
                if (i3 % 2 == 0) {
                    if (!(cause instanceof SecurityException)) {
                        if (cause instanceof IOException) {
                            int i4 = i2 + 87;
                            addParam = i4 % 128;
                            if (i4 % 2 != 0) {
                                throw ((IOException) cause);
                            }
                            throw ((IOException) cause);
                        }
                        Object[] objArr7 = new Object[1];
                        ThreeDS2Service((Process.myPid() >> 22) - 730174467, "컹悒熳薄\uf346肗쎕鳅\ue4c9櫆Ⲕ깆㤄礫纅\ue35a졻쮵戍䬶題⻂끙廝㬕③鉕", "闖첀ꃁ\ue4f0", (char) (63131 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\ufdcc穫鯔䇶", objArr7);
                        throw new IOException((String) objArr7[0]);
                    }
                } else {
                    boolean z2 = cause instanceof SecurityException;
                    throw null;
                }
            }
            throw ((RuntimeException) cause);
        } catch (Exception unused4) {
            Object[] objArr72 = new Object[1];
            ThreeDS2Service((Process.myPid() >> 22) - 730174467, "컹悒熳薄\uf346肗쎕鳅\ue4c9櫆Ⲕ깆㤄礫纅\ue35a졻쮵戍䬶題⻂끙廝㬕③鉕", "闖첀ꃁ\ue4f0", (char) (63131 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\ufdcc穫鯔䇶", objArr72);
            throw new IOException((String) objArr72[0]);
        }
    }

    private static boolean values(Process process, long j, TimeUnit timeUnit) throws InterruptedException {
        ConfigurationBuilder = (addParam + 55) % 128;
        long nanoTime = System.nanoTime();
        long nanos = timeUnit.toNanos(j);
        do {
            try {
                process.exitValue();
                return true;
            } catch (IllegalThreadStateException unused) {
                if (nanos > 0) {
                    Thread.sleep(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L));
                }
                nanos = timeUnit.toNanos(j) - (System.nanoTime() - nanoTime);
                if (nanos <= 0) {
                    addParam = (ConfigurationBuilder + 69) % 128;
                    return false;
                }
            }
        } while (nanos <= 0);
        addParam = (ConfigurationBuilder + 69) % 128;
        return false;
    }

    public static File values(String str, ThreeDS2Service threeDS2Service) {
        int i = addParam + 67;
        ConfigurationBuilder = i % 128;
        try {
            File file = (File) (i % 2 == 0 ? values(File.class, new Class[]{String.class}, new Object[]{str}, threeDS2Service) : values(File.class, new Class[]{String.class}, new Object[]{str}, threeDS2Service));
            addParam = (ConfigurationBuilder + 75) % 128;
            return file;
        } catch (Exception unused) {
            return new File(str);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(3:3|(5:6|7|8|10|4)|12)(0)|13|(6:15|16|17|18|19|(2:21|22)(1:(1:25)(1:26)))|31|18|19|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String values(android.content.Context r12, java.lang.String r13, com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ThreeDS2Service r14) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.values(android.content.Context, java.lang.String, com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark$ThreeDS2Service):java.lang.String");
    }
}
