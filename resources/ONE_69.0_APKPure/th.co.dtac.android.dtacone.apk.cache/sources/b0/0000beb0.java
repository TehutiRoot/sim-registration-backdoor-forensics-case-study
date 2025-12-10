package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.text.Typography;
import org.apache.http.message.TokenParser;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes5.dex */
public final class setMinWidth {
    public static final String ConfigParameters;
    public static final String ConfigurationBuilder;
    public static char SchemeConfiguration = 0;
    public static final String ThreeDS2Service;
    public static final String ThreeDS2Service$InitializationCallback;
    public static final String ThreeDS2ServiceInstance;
    public static final String addParam;
    public static final String apiKey;
    public static long build = 0;
    public static final String cleanup;
    public static char[] configureScheme = null;
    public static final String createTransaction;
    private static int dinersSchemeConfiguration = 1;
    public static final String get;
    public static final String getParamValue;
    public static final String getSDKInfo;
    public static final String getSDKVersion;
    public static final String getWarnings;
    public static final String initialize;
    private static int jcbConfiguration;
    public static char[] mastercardSchemeConfiguration;
    public static final String onCompleted;
    public static final String onError;
    public static final String removeParam;
    public static final String restrictedParameters;
    public static final DateFormat valueOf;
    public static final String values;

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
    public static final class ThreeDS2Service {
        public static final ThreeDS2Service ThreeDS2Service;
        public static final ThreeDS2Service ThreeDS2ServiceInstance;
        private static int cleanup = 1;
        public static final ThreeDS2Service get;
        private static final /* synthetic */ ThreeDS2Service[] getSDKInfo;
        private static int initialize;
        public static final ThreeDS2Service valueOf;
        public static char[] values;
        private final String getWarnings;

        static {
            valueOf();
            Object[] objArr = new Object[1];
            get("\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{0, 6, 0, 5}, false, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            get("\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{0, 6, 0, 5}, false, objArr2);
            ThreeDS2Service threeDS2Service = new ThreeDS2Service(intern, 0, ((String) objArr2[0]).intern());
            ThreeDS2ServiceInstance = threeDS2Service;
            Object[] objArr3 = new Object[1];
            get("\u0000\u0000\u0001\u0000\u0000\u0000\u0000", new int[]{6, 7, 0, 1}, true, objArr3);
            String intern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            get("\u0000\u0000\u0001\u0000\u0000\u0000\u0000", new int[]{6, 7, 0, 1}, true, objArr4);
            ThreeDS2Service threeDS2Service2 = new ThreeDS2Service(intern2, 1, ((String) objArr4[0]).intern());
            get = threeDS2Service2;
            Object[] objArr5 = new Object[1];
            get("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{13, 14, 78, 0}, true, objArr5);
            String intern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            get("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{13, 14, 78, 0}, true, objArr6);
            ThreeDS2Service threeDS2Service3 = new ThreeDS2Service(intern3, 2, ((String) objArr6[0]).intern());
            ThreeDS2Service = threeDS2Service3;
            Object[] objArr7 = new Object[1];
            get("\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{27, 13, 177, 0}, true, objArr7);
            String intern4 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            get("\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{27, 13, 177, 0}, true, objArr8);
            ThreeDS2Service threeDS2Service4 = new ThreeDS2Service(intern4, 3, ((String) objArr8[0]).intern());
            valueOf = threeDS2Service4;
            getSDKInfo = new ThreeDS2Service[]{threeDS2Service, threeDS2Service2, threeDS2Service3, threeDS2Service4};
            int i = initialize + 89;
            cleanup = i % 128;
            if (i % 2 != 0) {
                return;
            }
            throw null;
        }

        private ThreeDS2Service(String str, int i, String str2) {
            this.getWarnings = str2;
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
                char[] r8 = com.netcetera.threeds.sdk.infrastructure.setMinWidth.ThreeDS2Service.values     // Catch: java.lang.Throwable -> L38
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
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setMinWidth.ThreeDS2Service.get(java.lang.String, int[], boolean, java.lang.Object[]):void");
        }

        public static void valueOf() {
            values = new char[]{TokenParser.f74644SP, 'G', 'H', 'D', 'H', 'G', '*', 'T', 'T', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'J', 'I', 'K', 'P', 158, 158, Typography.nbsp, 153, Typography.nbsp, Typography.pound, 155, 151, 151, 159, 159, 158, 159, 129, 257, 257, 259, 252, 259, 259, 250, 252, 255, 258, 258, 260};
        }

        public static ThreeDS2Service[] values() {
            int i = initialize + 31;
            cleanup = i % 128;
            if (i % 2 != 0) {
                ThreeDS2Service[] threeDS2ServiceArr = (ThreeDS2Service[]) getSDKInfo.clone();
                cleanup = (initialize + 81) % 128;
                return threeDS2ServiceArr;
            }
            getSDKInfo.clone();
            throw null;
        }

        public String ThreeDS2ServiceInstance() {
            int i = initialize + 1;
            cleanup = i % 128;
            if (i % 2 != 0) {
                return this.getWarnings;
            }
            throw null;
        }

        public static ThreeDS2Service valueOf(String str) {
            int i = initialize + 7;
            cleanup = i % 128;
            int i2 = i % 2;
            ThreeDS2Service threeDS2Service = (ThreeDS2Service) Enum.valueOf(ThreeDS2Service.class, str);
            if (i2 == 0) {
                int i3 = 90 / 0;
            }
            return threeDS2Service;
        }
    }

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), ViewConfiguration.getTouchSlop() >> 8, 21 - TextUtils.getOffsetBefore("", 0), objArr);
        restrictedParameters = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance((char) ExpandableListView.getPackedPositionGroup(0L), (Process.myPid() >> 22) + 21, 3 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
        getParamValue = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        get((ViewConfiguration.getJumpTapTimeout() >> 16) + 9, "\u0014\u0017\u0002\u0007\u0017\f\u0003\u0011㘏", (byte) (16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr3);
        addParam = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        ThreeDS2ServiceInstance((char) (52098 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 14 - TextUtils.getTrimmedLength(""), objArr4);
        removeParam = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        ThreeDS2ServiceInstance((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 39, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, objArr5);
        apiKey = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        get(16 - TextUtils.getOffsetAfter("", 0), "\u0014\u0017\u0002\u0007\u0002\f\u0004\t\u0002\u0017\u0018\u0006\u0006\u0017\u0001\f", (byte) (98 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr6);
        ConfigurationBuilder = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        ThreeDS2ServiceInstance((char) (TextUtils.getOffsetAfter("", 0) + 12008), 49 - Color.blue(0), 12 - Color.green(0), objArr7);
        ThreeDS2Service$InitializationCallback = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        get(11 - TextUtils.getOffsetBefore("", 0), "\u0007\u0017\u0010\n\u0000\t\u0005\u0012\u0005\u0017㘤", (byte) (59 - Drawable.resolveOpacity(0, 0)), objArr8);
        ConfigParameters = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        ThreeDS2ServiceInstance((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 55009), KeyEvent.getDeadChar(0, 0) + 61, View.MeasureSpec.getMode(0) + 18, objArr9);
        onError = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        ThreeDS2ServiceInstance((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 36179), (ViewConfiguration.getWindowTouchSlop() >> 8) + 79, KeyEvent.normalizeMetaState(0) + 10, objArr10);
        onCompleted = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        ThreeDS2ServiceInstance((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29999), KeyEvent.normalizeMetaState(0) + 89, 9 - (Process.myTid() >> 22), objArr11);
        createTransaction = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        get((ViewConfiguration.getWindowTouchSlop() >> 8) + 6, "\u0003\u0000\t\u000b\u000e\u0004", (byte) (KeyEvent.getDeadChar(0, 0) + 109), objArr12);
        initialize = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        ThreeDS2ServiceInstance((char) (58606 - (ViewConfiguration.getTapTimeout() >> 16)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 98, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4, objArr13);
        getSDKInfo = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        get(5 - TextUtils.getTrimmedLength(""), "\u0013\u0003\u0014\r㘧", (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 73), objArr14);
        getWarnings = ((String) objArr14[0]).intern();
        Object[] objArr15 = new Object[1];
        get(14 - View.combineMeasuredStates(0, 0), "\u0018\u0004㘰㘰\u0010\u0012\u0015\u0004\u0014\u0017\u0001\u0018\u0001\f", (byte) (71 - (ViewConfiguration.getJumpTapTimeout() >> 16)), objArr15);
        cleanup = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        ThreeDS2ServiceInstance((char) (1399 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 102, 9 - ((Process.getThreadPriority(0) + 20) >> 6), objArr16);
        getSDKVersion = ((String) objArr16[0]).intern();
        Object[] objArr17 = new Object[1];
        get(9 - TextUtils.lastIndexOf("", '0'), "\u0003\u0013\u0001\u0002\u0014\u0017\u0001\u0018\u0001\f", (byte) (123 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr17);
        get = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        ThreeDS2ServiceInstance((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 111 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.keyCodeFromString("") + 5, objArr18);
        ThreeDS2Service = ((String) objArr18[0]).intern();
        Object[] objArr19 = new Object[1];
        get(7 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0013\u0005\u0001\u0015\u0004\u0013", (byte) (56 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr19);
        ThreeDS2ServiceInstance = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        ThreeDS2ServiceInstance((char) (38879 - ImageFormat.getBitsPerPixel(0)), ExpandableListView.getPackedPositionGroup(0L) + 116, 15 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr20);
        values = ((String) objArr20[0]).intern();
        Object[] objArr21 = new Object[1];
        ThreeDS2ServiceInstance((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9291), 131 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr21);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((String) objArr21[0]).intern(), Locale.getDefault());
        valueOf = simpleDateFormat;
        Object[] objArr22 = new Object[1];
        get(View.MeasureSpec.makeMeasureSpec(0, 0) + 3, "\u000b\u0007㘘", (byte) ((-16777153) - Color.rgb(0, 0, 0)), objArr22);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(((String) objArr22[0]).intern()));
        dinersSchemeConfiguration = (jcbConfiguration + 89) % 128;
    }

    public static void ThreeDS2ServiceInstance() {
        configureScheme = new char[]{'a', 18536, 36988, 55373, 8260, 26709, 45095, 63546, 16385, 34816, 53297, 6378, 24822, 43251, 61658, 14553, 32929, 51384, 4273, 22667, 41118, 'N', 18467, 36953, 52199, 33788, 23528, 5065, 60352, 41981, 31653, 13243, 35730, 17281, 7060, 54115, 43900, 25450, 'e', 18558, 36970, 55371, 8258, 26744, 45101, 63520, 16385, 34821, 53268, 11917, 26262, 48770, 63139, 3754, 18073, 40645, 54991, 28411, 42725, 65271, 13833, 54915, 40589, 18057, 3732, 63159, 48824, 26319, 11972, 38631, 24288, 1785, 52739, 46652, 32267, 9767, 60980, 22087, 7772, 36146, 50492, 7480, 21794, 44298, 58683, 15714, 30071, 52566, 1356, 30017, 15697, 58720, 44399, 21868, 7521, 50447, 36117, 13600, 58498, 44173, 29841, 15545, 1282, 19731, 38147, 56631, 9525, 27966, 46431, 64847, 17766, 'a', 18556, 36968, 55405, 8276, 38793, 57218, 1932, 20385, 47010, 65458, 10185, 28632, 55252, 8190, 18425, 36618, 63235, 16181, 26380, 9269, 27705, 46125, 64529, 1073, 19517, 37984, 56444, 25700, 44136, 62553, 15525, 17583, 36003};
        build = -1884406606406596596L;
        mastercardSchemeConfiguration = new char[]{13809, 13772, 13813, 13817, 13801, 13769, 13774, 13790, 13806, 13802, 13779, 13812, 13775, 13785, 13795, 13819, 13777, 13821, 13822, 13815, 13807, 13811, 13800, 13768, 13823};
        SchemeConfiguration = (char) 5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r11 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(int r10, java.lang.String r11, byte r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setMinWidth.get(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    private static void ThreeDS2ServiceInstance(char c, int i, int i2, Object[] objArr) {
        String str;
        synchronized (ConfigParameters.valueOf) {
            try {
                char[] cArr = new char[i2];
                ConfigParameters.ThreeDS2Service = 0;
                while (true) {
                    int i3 = ConfigParameters.ThreeDS2Service;
                    if (i3 < i2) {
                        cArr[i3] = (char) ((configureScheme[i + i3] ^ (i3 * build)) ^ c);
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