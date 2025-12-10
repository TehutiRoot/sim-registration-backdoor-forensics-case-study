package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatDelegate;
import ch.qos.logback.core.CoreConstants;
import com.facebook.stetho.dumpapp.Framer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.common.base.Ascii;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.p023io.encoding.Base64;
import kotlin.text.Typography;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.json.JSONObject;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public final class notify {
    private static int get = 0;
    private static int valueOf = 1;
    private static final InterfaceC9652ns values = C9653nt.ThreeDS2ServiceInstance(notify.class);

    static {
        int i = get + 115;
        valueOf = i % 128;
        if (i % 2 != 0) {
            return;
        }
        throw null;
    }

    public static finalize ThreeDS2Service() {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.15
            public static int ThreeDS2Service = -464249313;
            public static short[] ThreeDS2ServiceInstance = null;
            public static byte[] get = {Ascii.ESC, Ascii.CAN, ByteSourceJsonBootstrapper.UTF8_BOM_1, 0, Framer.STDOUT_FRAME_PREFIX, Framer.ENTER_FRAME_PREFIX, -46, -1, -4, 9, 42, ByteSourceJsonBootstrapper.UTF8_BOM_3, 65, -84, 5, 1, 78, -83, 10, 73, -61, -22, 78, -54, 59, -82, 13, -15, 15, -8, 12, ByteSourceJsonBootstrapper.UTF8_BOM_1, 17, 17};
            private static int getSDKInfo = 0;
            private static int getSDKVersion = 1;
            public static int valueOf = 7;
            public static int values = -529535336;

            private static void values(byte b, short s, int i, int i2, int i3, Object[] objArr) {
                int i4;
                String obj;
                synchronized (createTransaction.ThreeDS2ServiceInstance) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        int i5 = valueOf;
                        int i6 = i2 + i5;
                        if (i6 == -1) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        if (i4 != 0) {
                            byte[] bArr = get;
                            if (bArr != null) {
                                i6 = (byte) (bArr[values + i] + i5);
                            } else {
                                i6 = (short) (ThreeDS2ServiceInstance[values + i] + i5);
                            }
                        }
                        if (i6 > 0) {
                            createTransaction.values = ((i + i6) - 2) + values + i4;
                            char c = (char) (i3 + ThreeDS2Service);
                            createTransaction.get = c;
                            sb.append(c);
                            createTransaction.valueOf = createTransaction.get;
                            createTransaction.ThreeDS2Service = 1;
                            while (createTransaction.ThreeDS2Service < i6) {
                                byte[] bArr2 = get;
                                if (bArr2 != null) {
                                    int i7 = createTransaction.values;
                                    createTransaction.values = i7 - 1;
                                    createTransaction.get = (char) (createTransaction.valueOf + (((byte) (bArr2[i7] + s)) ^ b));
                                } else {
                                    short[] sArr = ThreeDS2ServiceInstance;
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

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                int i = getSDKInfo + 49;
                getSDKVersion = i % 128;
                if (i % 2 != 0) {
                    if (!c9651nr.onError(str)) {
                        setForegroundGravity setforegroundgravity = setForegroundGravity.useBridgingExtension;
                        Object[] objArr = new Object[1];
                        values((byte) View.getDefaultSize(0, 0), (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), 529535336 + (ViewConfiguration.getWindowTouchSlop() >> 8), (-9) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 447472177 - Color.rgb(0, 0, 0), objArr);
                        C9612name valueOf2 = C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, String.format(((String) objArr[0]).intern(), str)));
                        getSDKVersion = (getSDKInfo + 111) % 128;
                        return valueOf2;
                    }
                    return C9612name.valueOf();
                }
                c9651nr.onError(str);
                throw null;
            }
        };
        int i = valueOf;
        int i2 = i & 45;
        int i3 = ((i ^ 45) | i2) << 1;
        int i4 = -((i | 45) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        get = i5 % 128;
        if (i5 % 2 == 0) {
            return finalizeVar;
        }
        throw null;
    }

    public static /* synthetic */ boolean ThreeDS2ServiceInstance(String str, String str2, String str3, boolean z) {
        int i = get;
        int i2 = i & 1;
        int i3 = -(-((i ^ 1) | i2));
        valueOf = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        boolean z2 = get(str, str2, str3, z);
        int i4 = valueOf;
        int i5 = i4 & 51;
        int i6 = (i4 | 51) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 & i7) + (i6 | i7);
        get = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 72 / 0;
        }
        return z2;
    }

    public static finalize cleanup() {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.14
            public static char[] ThreeDS2ServiceInstance = {'4', 'n', 't', 'r', 'q', 'V', '4', '/', 16, Typography.greater, 'h', Matrix.MATRIX_TYPE_RANDOM_LT, '@', '=', '-', 'S', 'f', 'k', 't', 'k', Matrix.MATRIX_TYPE_RANDOM_REGULAR, '0', CoreConstants.SINGLE_QUOTE_CHAR, Matrix.MATRIX_TYPE_RANDOM_LT, 'l', 'k', Matrix.MATRIX_TYPE_ZERO, '6', 'H', 'p', 'X', '0', 'F', 'f', 'j', 'r', 'k', 'm', 'o', 'k', 'a', ':', 'B', 'f', 'j', 'f', 'k', 'K', '@', '@', 'J', 'q', 'n', 'G', 'I', 'n', 'D', Typography.greater, 'h', Matrix.MATRIX_TYPE_RANDOM_LT, '@', '=', 'I', 'k', 'l', 'l', 'i', 'g', 'i', 'i', 'X', 'v', 242, 248, 246, 217, 184, 179, '1', 'i', 'q', 'V', '5', '0', '8', 's', Matrix.MATRIX_TYPE_RANDOM_LT, 'B', 'B', 'M', 'm', 'h', 'l', 'h', 'D', Typography.less, 'c', 'm', 'q', 'o', 'm', 't', 'l', 'h', 'H', '2', Matrix.MATRIX_TYPE_ZERO, 'r', 'J', '8', '\\', 'm', 'n', 'N', CoreConstants.RIGHT_PARENTHESIS_CHAR, '2', 'T', 'm', 'v', 'm', 'h', Matrix.MATRIX_TYPE_RANDOM_UT, '/', '?', 'B', 'N', 'j', 'X', Matrix.MATRIX_TYPE_ZERO, 'k', 'k', 'i', 'k', 'n', 'n', 'm', 'K', '?', 'B', 'N', 'j', '@', 'F', 'p', 'K', 'I'};
            private static int get = 0;
            private static int values = 1;

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r12 = r12;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void ThreeDS2Service(java.lang.String r12, int[] r13, boolean r14, java.lang.Object[] r15) {
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
                    char[] r8 = com.netcetera.threeds.sdk.infrastructure.notify.C963214.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L38
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
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.notify.C963214.ThreeDS2Service(java.lang.String, int[], boolean, java.lang.Object[]):void");
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                String str2 = (String) C9669om.ThreeDS2Service(C9669om.values(c9651nr.values(str)), "");
                if (!z) {
                    values = (get + 75) % 128;
                    Object[] objArr = new Object[1];
                    ThreeDS2Service("\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{0, 8, 0, 8}, false, objArr);
                    if (!C9669om.values((CharSequence) str2, (CharSequence) ((String) objArr[0]).intern())) {
                        setForegroundGravity setforegroundgravity = setForegroundGravity.useBridgingExtension;
                        Object[] objArr2 = new Object[1];
                        ThreeDS2Service("\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{8, 63, 0, 0}, true, objArr2);
                        C9612name valueOf2 = C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, String.format(((String) objArr2[0]).intern(), str, str2)));
                        values = (get + 75) % 128;
                        return valueOf2;
                    }
                }
                if (z) {
                    Object[] objArr3 = new Object[1];
                    ThreeDS2Service("\u0000\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{71, 7, 132, 0}, false, objArr3);
                    String intern = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    ThreeDS2Service("\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{0, 8, 0, 8}, false, objArr4);
                    String intern2 = ((String) objArr4[0]).intern();
                    Object[] objArr5 = new Object[1];
                    ThreeDS2Service("\u0000\u0001\u0000\u0000\u0001\u0000", new int[]{78, 6, 1, 0}, false, objArr5);
                    if (!C9669om.valueOf(str2, intern, intern2, ((String) objArr5[0]).intern())) {
                        setForegroundGravity setforegroundgravity2 = setForegroundGravity.useBridgingExtension;
                        Object[] objArr6 = new Object[1];
                        ThreeDS2Service("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{84, 62, 2, 43}, false, objArr6);
                        return C9612name.valueOf(new setMenuCallbacks(setforegroundgravity2, str, String.format(((String) objArr6[0]).intern(), str, str2)));
                    }
                }
                return C9612name.valueOf();
            }
        };
        int i = valueOf;
        int i2 = (i & 113) + (i | 113);
        get = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
        }
        return finalizeVar;
    }

    public static finalize get(final int i, final int i2) {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.11
            public static char ThreeDS2Service = 33647;
            public static char get = 37386;
            private static int getSDKVersion = 0;
            public static char getWarnings = 34123;
            private static int initialize = 1;
            public static char valueOf = 63275;

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r12 = r12;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void ThreeDS2Service(java.lang.String r12, int r13, java.lang.Object[] r14) {
                /*
                    if (r12 == 0) goto L6
                    char[] r12 = r12.toCharArray()
                L6:
                    char[] r12 = (char[]) r12
                    java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.onCompleted.valueOf
                    monitor-enter(r0)
                    int r1 = r12.length     // Catch: java.lang.Throwable -> L5b
                    char[] r1 = new char[r1]     // Catch: java.lang.Throwable -> L5b
                    r2 = 0
                    com.netcetera.threeds.sdk.infrastructure.onCompleted.values = r2     // Catch: java.lang.Throwable -> L5b
                    r3 = 2
                    char[] r3 = new char[r3]     // Catch: java.lang.Throwable -> L5b
                L14:
                    int r4 = com.netcetera.threeds.sdk.infrastructure.onCompleted.values     // Catch: java.lang.Throwable -> L5b
                    int r5 = r12.length     // Catch: java.lang.Throwable -> L5b
                    if (r4 >= r5) goto L6e
                    char r5 = r12[r4]     // Catch: java.lang.Throwable -> L5b
                    r3[r2] = r5     // Catch: java.lang.Throwable -> L5b
                    int r4 = r4 + 1
                    char r4 = r12[r4]     // Catch: java.lang.Throwable -> L5b
                    r5 = 1
                    r3[r5] = r4     // Catch: java.lang.Throwable -> L5b
                    r4 = 58224(0xe370, float:8.1589E-41)
                    r6 = 0
                L28:
                    r7 = 16
                    if (r6 >= r7) goto L5d
                    char r7 = r3[r5]     // Catch: java.lang.Throwable -> L5b
                    char r8 = r3[r2]     // Catch: java.lang.Throwable -> L5b
                    int r9 = r8 + r4
                    int r10 = r8 << 4
                    char r11 = com.netcetera.threeds.sdk.infrastructure.notify.C962911.ThreeDS2Service     // Catch: java.lang.Throwable -> L5b
                    int r10 = r10 + r11
                    r9 = r9 ^ r10
                    int r10 = r8 >>> 5
                    char r11 = com.netcetera.threeds.sdk.infrastructure.notify.C962911.getWarnings     // Catch: java.lang.Throwable -> L5b
                    int r10 = r10 + r11
                    r9 = r9 ^ r10
                    int r7 = r7 - r9
                    char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
                    r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
                    int r9 = r7 + r4
                    int r10 = r7 << 4
                    char r11 = com.netcetera.threeds.sdk.infrastructure.notify.C962911.valueOf     // Catch: java.lang.Throwable -> L5b
                    int r10 = r10 + r11
                    r9 = r9 ^ r10
                    int r7 = r7 >>> 5
                    char r10 = com.netcetera.threeds.sdk.infrastructure.notify.C962911.get     // Catch: java.lang.Throwable -> L5b
                    int r7 = r7 + r10
                    r7 = r7 ^ r9
                    int r8 = r8 - r7
                    char r7 = (char) r8     // Catch: java.lang.Throwable -> L5b
                    r3[r2] = r7     // Catch: java.lang.Throwable -> L5b
                    r7 = 40503(0x9e37, float:5.6757E-41)
                    int r4 = r4 - r7
                    int r6 = r6 + 1
                    goto L28
                L5b:
                    r12 = move-exception
                    goto L77
                L5d:
                    int r4 = com.netcetera.threeds.sdk.infrastructure.onCompleted.values     // Catch: java.lang.Throwable -> L5b
                    char r6 = r3[r2]     // Catch: java.lang.Throwable -> L5b
                    r1[r4] = r6     // Catch: java.lang.Throwable -> L5b
                    int r6 = r4 + 1
                    char r5 = r3[r5]     // Catch: java.lang.Throwable -> L5b
                    r1[r6] = r5     // Catch: java.lang.Throwable -> L5b
                    int r4 = r4 + 2
                    com.netcetera.threeds.sdk.infrastructure.onCompleted.values = r4     // Catch: java.lang.Throwable -> L5b
                    goto L14
                L6e:
                    java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L5b
                    r12.<init>(r1, r2, r13)     // Catch: java.lang.Throwable -> L5b
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
                    r14[r2] = r12
                    return
                L77:
                    monitor-exit(r0)
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.notify.C962911.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                initialize = (getSDKVersion + 11) % 128;
                C9623nl cleanup = c9651nr.cleanup(str);
                if (cleanup.ThreeDS2ServiceInstance() >= i) {
                    getSDKVersion = (initialize + 47) % 128;
                    if (cleanup.ThreeDS2ServiceInstance() <= i2) {
                        C9612name valueOf2 = C9612name.valueOf();
                        int i3 = getSDKVersion + 125;
                        initialize = i3 % 128;
                        if (i3 % 2 != 0) {
                            return valueOf2;
                        }
                        throw null;
                    }
                }
                setForegroundGravity setforegroundgravity = setForegroundGravity.useBridgingExtension;
                Object[] objArr = new Object[1];
                ThreeDS2Service("殿ꆯ눼睏㗙䆢뭘╡⇉ﴶ樬綬瀴ኑ䦣∝한攩柷ㆾ뵾\ue747딡⽢㔟㒫虺풚㐨嶪Ʀ\uabfc纨┆\ueef4⳼\ue0a1㷲윟뢣⨝\uf079樬綬瀴ኑ虺풚뭘╡Ѭ퉑㑓ᳩ勆\u3100巾㝃ꖇ厠\uf582ⓘ乭솜阡衦腀嶪죺\u2d9c瀴ኑ虺풚뭘╡Ѭ퉑", ((byte) KeyEvent.getModifierMetaStateMask()) + 79, objArr);
                return C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, String.format(((String) objArr[0]).intern(), str, Integer.valueOf(cleanup.ThreeDS2ServiceInstance()), Integer.valueOf(i), Integer.valueOf(i2))));
            }
        };
        int i3 = valueOf;
        int i4 = ((i3 ^ 109) | (i3 & 109)) << 1;
        int i5 = -(((~i3) & 109) | (i3 & (-110)));
        int i6 = (i4 & i5) + (i5 | i4);
        get = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 10 / 0;
        }
        return finalizeVar;
    }

    public static finalize getSDKInfo() {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.10
            private static int ThreeDS2Service = 1;
            private static int get = 0;
            public static int values = 157;

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r8 = r8;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void values(int r6, int r7, java.lang.String r8, int r9, boolean r10, java.lang.Object[] r11) {
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
                    int r5 = com.netcetera.threeds.sdk.infrastructure.notify.C962810.values     // Catch: java.lang.Throwable -> L2f
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
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.notify.C962810.values(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                String str2 = (String) C9669om.ThreeDS2Service(c9651nr.values(str), "");
                try {
                    new URL(str2);
                    C9612name valueOf2 = C9612name.valueOf();
                    ThreeDS2Service = (get + 1) % 128;
                    return valueOf2;
                } catch (MalformedURLException unused) {
                    setForegroundGravity setforegroundgravity = setForegroundGravity.useBridgingExtension;
                    Object[] objArr = new Object[1];
                    values((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16, 49 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\uffd9ￋ�\u0010\u000e\u0010\u0014!\u0010\u000f￥ￋ\u0006\uffd0\u001e\b\ufffb\f\u001d\f\u0018\u0010\u001f\u0010\u001dￋ\u0006\uffd0\u001e\bￋ\u0014\u001eￋ\u0019\u001a\u001fￋ\fￋ!\f\u0017\u0014\u000fￋ\u0000�\ufff7", View.MeasureSpec.makeMeasureSpec(0, 0) + 242, false, objArr);
                    return C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, String.format(((String) objArr[0]).intern(), str, str2)));
                }
            }
        };
        int i = valueOf;
        int i2 = (i | CameraActivity.REQUEST_CODE) << 1;
        int i3 = -(i ^ CameraActivity.REQUEST_CODE);
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        get = i4 % 128;
        if (i4 % 2 == 0) {
            return finalizeVar;
        }
        throw null;
    }

    public static /* synthetic */ InterfaceC9652ns getWarnings() {
        int i = (-2) - (~(valueOf + 50));
        get = i % 128;
        if (i % 2 == 0) {
            return values;
        }
        throw null;
    }

    public static finalize initialize() {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.8
            public static int ThreeDS2Service = 1737375766;
            public static long ThreeDS2ServiceInstance = 0;
            public static char get = 0;
            private static int valueOf = 1;
            private static int values;

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r12 = r12;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void values(int r8, char r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object[] r13) {
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
                    long r6 = com.netcetera.threeds.sdk.infrastructure.notify.C96468.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
                    long r4 = r4 ^ r6
                    int r2 = com.netcetera.threeds.sdk.infrastructure.notify.C96468.ThreeDS2Service     // Catch: java.lang.Throwable -> L7c
                    long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
                    long r4 = r4 ^ r6
                    char r2 = com.netcetera.threeds.sdk.infrastructure.notify.C96468.get     // Catch: java.lang.Throwable -> L7c
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
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.notify.C96468.values(int, char, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void");
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                int i = valueOf + 65;
                values = i % 128;
                if (i % 2 == 0) {
                    String str2 = (String) C9669om.ThreeDS2Service(c9651nr.values(str), "");
                    if (!C9669om.ThreeDS2Service(str2)) {
                        Object[] objArr = new Object[1];
                        values(View.resolveSize(0, 0), (char) (43927 - TextUtils.indexOf((CharSequence) "", '0')), "\uf539銪", "蛯㐵颊횫", "\u0000\u0000\u0000\u0000", objArr);
                        if (!str2.equals(((String) objArr[0]).intern())) {
                            valueOf = (values + 85) % 128;
                            Object[] objArr2 = new Object[1];
                            values(View.MeasureSpec.getSize(0), (char) (53679 - ImageFormat.getBitsPerPixel(0)), "맚ᨴ", "֚\uf6e0냲ⷑ", "\u0000\u0000\u0000\u0000", objArr2);
                            if (!str2.equals(((String) objArr2[0]).intern())) {
                                C9612name valueOf2 = C9612name.valueOf();
                                valueOf = (values + 11) % 128;
                                return valueOf2;
                            }
                        }
                    }
                    setForegroundGravity setforegroundgravity = setForegroundGravity.useBridgingExtension;
                    Object[] objArr3 = new Object[1];
                    values(1916334667 - Drawable.resolveOpacity(0, 0), (char) View.resolveSizeAndState(0, 0, 0), "颍䘩\uf177\uf174됌\uee9f\u0895퍆엿鸍‵軩邏\udb27⾕誾ᦠህ\ud96cᱨ䀫兗鬥", "䮁㣲彲ቮ", "\u0000\u0000\u0000\u0000", objArr3);
                    return C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, String.format(((String) objArr3[0]).intern(), str)));
                }
                C9669om.ThreeDS2Service((String) C9669om.ThreeDS2Service(c9651nr.values(str), ""));
                throw null;
            }
        };
        get = (valueOf + 11) % 128;
        return finalizeVar;
    }

    public static finalize valueOf() {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.2
            private static int ThreeDS2Service = 1;
            public static char ThreeDS2ServiceInstance = 5;
            private static int get;
            public static char[] values = {13812, 13804, 13754, 13767, 13813, 13822, 13823, 13807, 13799, 13819, 13801, 13814, 13817, 13759, 13800, 13749, 13802, 13811, 13793, 13795, 13803, 13768, 13761, 13815, 13806};

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r11 = r11;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void ThreeDS2Service(int r10, java.lang.String r11, byte r12, java.lang.Object[] r13) {
                /*
                    Method dump skipped, instructions count: 252
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.notify.C96382.ThreeDS2Service(int, java.lang.String, byte, java.lang.Object[]):void");
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                String str2 = (String) C9669om.ThreeDS2Service(c9651nr.values(str), "");
                if (!C9669om.ThreeDS2Service(str2)) {
                    ThreeDS2Service = (get + 55) % 128;
                    Object[] objArr = new Object[1];
                    ThreeDS2Service((ViewConfiguration.getEdgeSlop() >> 16) + 2, "\u0017\u0002", (byte) (View.resolveSize(0, 0) + 69), objArr);
                    if (!str2.equals(((String) objArr[0]).intern())) {
                        Object[] objArr2 = new Object[1];
                        ThreeDS2Service(2 - Gravity.getAbsoluteGravity(0, 0), "\u0017\r", (byte) (KeyEvent.normalizeMetaState(0) + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR), objArr2);
                        if (!str2.equals(((String) objArr2[0]).intern())) {
                            C9612name valueOf2 = C9612name.valueOf();
                            ThreeDS2Service = (get + 33) % 128;
                            return valueOf2;
                        }
                    }
                }
                setForegroundGravity setforegroundgravity = setForegroundGravity.getMessageVersion;
                Object[] objArr3 = new Object[1];
                ThreeDS2Service(TextUtils.lastIndexOf("", '0', 0) + 57, "\u0001\u000b\u0016\u0005\u0013\f\u0007\u0006\u0001\u0011\u000e\u0013\b\u0018\t\u0015\t\u000b\u0007\u0002\u000e\u000b\u0004\u0003\u0001\u0000\u0016\u0004\u0013\u000b\u0005\u000b\u0005\u0001\u0014\u0013\u000e\u0002\u0004\u0014\u0007\u0013\u0005\u000f\u0001\u0007\u0015\u0012\u0004\u0018\u0003\u0002\u0006\u000e\b\u0007", (byte) (104 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr3);
                return C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, String.format(((String) objArr3[0]).intern(), str)));
            }
        };
        int i = get;
        int i2 = (i & 91) + (i | 91);
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
        }
        return finalizeVar;
    }

    public static finalize values() {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.20
            public static int ThreeDS2Service = 1150374549;
            public static int ThreeDS2ServiceInstance = 115;
            public static byte[] get = {-70, 66, -26, 98, -109, Ascii.DC4, 87, 71, -91, -84, -86, 86, ByteSourceJsonBootstrapper.UTF8_BOM_2, -102, 90, Ascii.DC4, -91, -85, 93, 80, -81, -26, Ascii.ETB, -23, 4, -83, -87, -26, 5, -94, -31, 107, 66, -26, 98, -109, 6, -91, 89, -89, 80, -92, 71, -71, -71};
            private static int getSDKVersion = 1;
            private static int getWarnings = 0;
            public static short[] valueOf = null;
            public static int values = -1242471908;

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                int i = getSDKVersion + 15;
                getWarnings = i % 128;
                if (i % 2 == 0) {
                    String str2 = (String) C9669om.ThreeDS2Service(c9651nr.values(str), "");
                    if (!C9670on.ThreeDS2ServiceInstance(str2)) {
                        setForegroundGravity setforegroundgravity = setForegroundGravity.useBridgingExtension;
                        Object[] objArr = new Object[1];
                        ThreeDS2ServiceInstance((byte) ((-87) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 1242471907 - TextUtils.lastIndexOf("", '0', 0, 0), (-115) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (Process.myTid() >> 22) - 1150374469, objArr);
                        C9612name valueOf2 = C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, String.format(((String) objArr[0]).intern(), str, str2)));
                        int i2 = getWarnings + 57;
                        getSDKVersion = i2 % 128;
                        if (i2 % 2 != 0) {
                            return valueOf2;
                        }
                        throw null;
                    }
                    C9612name valueOf3 = C9612name.valueOf();
                    int i3 = getSDKVersion + 63;
                    getWarnings = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 34 / 0;
                    }
                    return valueOf3;
                }
                C9670on.ThreeDS2ServiceInstance((String) C9669om.ThreeDS2Service(c9651nr.values(str), ""));
                throw null;
            }

            private static void ThreeDS2ServiceInstance(byte b, short s, int i, int i2, int i3, Object[] objArr) {
                String obj;
                synchronized (createTransaction.ThreeDS2ServiceInstance) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        int i4 = ThreeDS2ServiceInstance;
                        int i5 = i2 + i4;
                        int i6 = i5 == -1 ? 1 : 0;
                        if (i6 != 0) {
                            byte[] bArr = get;
                            if (bArr != null) {
                                i5 = (byte) (bArr[values + i] + i4);
                            } else {
                                i5 = (short) (valueOf[values + i] + i4);
                            }
                        }
                        if (i5 > 0) {
                            createTransaction.values = ((i + i5) - 2) + values + i6;
                            char c = (char) (i3 + ThreeDS2Service);
                            createTransaction.get = c;
                            sb.append(c);
                            createTransaction.valueOf = createTransaction.get;
                            createTransaction.ThreeDS2Service = 1;
                            while (createTransaction.ThreeDS2Service < i5) {
                                byte[] bArr2 = get;
                                if (bArr2 != null) {
                                    int i7 = createTransaction.values;
                                    createTransaction.values = i7 - 1;
                                    createTransaction.get = (char) (createTransaction.valueOf + (((byte) (bArr2[i7] + s)) ^ b));
                                } else {
                                    short[] sArr = valueOf;
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
        };
        int i = get;
        int i2 = (i & (-100)) | ((~i) & 99);
        int i3 = (i & 99) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return finalizeVar;
        }
        throw null;
    }

    public static finalize ThreeDS2Service(final Integer num) {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.3
            public static int ThreeDS2ServiceInstance = 195;
            private static int valueOf = 0;
            private static int values = 1;

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r8 = r8;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void values(int r6, int r7, java.lang.String r8, int r9, boolean r10, java.lang.Object[] r11) {
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
                    int r5 = com.netcetera.threeds.sdk.infrastructure.notify.C96413.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
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
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.notify.C96413.values(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                values = (valueOf + 45) % 128;
                Integer ThreeDS2ServiceInstance2 = c9651nr.ThreeDS2ServiceInstance(str);
                if (!num.equals(ThreeDS2ServiceInstance2)) {
                    setForegroundGravity setforegroundgravity = setForegroundGravity.Transaction$BridgingMessageExtensionVersion;
                    Object[] objArr = new Object[1];
                    values(18 - View.resolveSize(0, 0), 79 - View.resolveSize(0, 0), "ￌ\u001a\u0004ￓￇ\ufff9\f\n\f\u0010\u001d\f\u000bￇ\u0002ￌ\u001a\u0004\ufff7\b\u0019\b\u0014\f\u001b\f\u0019ￇ\u0002ￌ\u001a\u0004ￇ\u0010\u001aￇ\u0015\u0016\u001bￇ\f\u0018\u001c\b\u0013ￇ\u001b\u0016ￇ\u001b\u000f\fￇ\u0019\f\n\f\u0010\u001d\f\u000bￇ\u001d\b\u0013\u001c\fￕￇ￬\u001f\u0017\f\n\u001b\f\u000bￇ\u0002", 283 - ((byte) KeyEvent.getModifierMetaStateMask()), false, objArr);
                    C9612name valueOf2 = C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, String.format(((String) objArr[0]).intern(), str, num, ThreeDS2ServiceInstance2)));
                    values = (valueOf + 93) % 128;
                    return valueOf2;
                }
                return C9612name.valueOf();
            }
        };
        int i = get;
        valueOf = ((i ^ 59) + ((i & 59) << 1)) % 128;
        return finalizeVar;
    }

    public static finalize ThreeDS2ServiceInstance() {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.18
            public static long ThreeDS2Service = 2496232735325897039L;
            private static int ThreeDS2ServiceInstance = 1;
            private static int values;

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
                    long r5 = com.netcetera.threeds.sdk.infrastructure.notify.C963618.ThreeDS2Service     // Catch: java.lang.Throwable -> L2e
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
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.notify.C963618.get(java.lang.String, int, java.lang.Object[]):void");
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                values = (ThreeDS2ServiceInstance + 103) % 128;
                if (!c9651nr.initialize(str)) {
                    setForegroundGravity setforegroundgravity = setForegroundGravity.useBridgingExtension;
                    Object[] objArr = new Object[1];
                    get("䄟‗荏抅없ꜷ٭\ue9a5䣵⩮贮氙쾐껷ၱ\uf371劬㖦霣瘛\ud94f룂ᯈﵰ屝㾍黊\u0002\ue353䉕▃蓂昊쥵ꢩ", TextUtils.lastIndexOf("", '0', 0, 0) + 24890, objArr);
                    C9612name valueOf2 = C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, String.format(((String) objArr[0]).intern(), str)));
                    ThreeDS2ServiceInstance = (values + 63) % 128;
                    return valueOf2;
                }
                return C9612name.valueOf();
            }
        };
        int i = get;
        int i2 = (i & (-104)) | ((~i) & 103);
        int i3 = (i & 103) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return finalizeVar;
        }
        throw null;
    }

    public static finalize get(Integer num) {
        int i = get;
        int i2 = (i & 27) + (i | 27);
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            return get((Integer) null, num);
        }
        get((Integer) null, num);
        throw null;
    }

    public static finalize valueOf(final String str, final String str2) {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.19
            public static long ThreeDS2ServiceInstance = 1364450437116132046L;
            private static int valueOf = 0;
            private static int values = 1;

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r7 = r7;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void values(java.lang.String r7, int r8, java.lang.Object[] r9) {
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
                    long r5 = com.netcetera.threeds.sdk.infrastructure.notify.C963719.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
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
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.notify.C963719.values(java.lang.String, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x007e, code lost:
                if ((r10 % 2) == 0) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0080, code lost:
                return r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
                return com.netcetera.threeds.sdk.infrastructure.C9612name.valueOf();
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
                if (com.netcetera.threeds.sdk.infrastructure.notify.ThreeDS2ServiceInstance(r9, r1, r2, r11) == false) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
                if (com.netcetera.threeds.sdk.infrastructure.notify.ThreeDS2ServiceInstance(r9, r1, r2, r11) == false) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
                r1 = com.netcetera.threeds.sdk.infrastructure.setForegroundGravity.useBridgingExtension;
                r5 = new java.lang.Object[1];
                values("爵ᕬ┺㗦䖯呤搨瓾蒤霵꜋랊잙홴\ue644\uf6caڍᄝ№㇘䆆們恥瀥肦邱ꍨ댺쎺편\ue277\uf230ˋኝⵜ㴂䷆巁汎簚賘鲒꽕뼯켑\udfac\uefb7︣\u0e73ẽ\u2efd㥤䤏妿槌硹蠃飆ꢅ뭖쬌\udbdc\ueb90﨓\u0a55ᩨ⫻㪚", android.graphics.ImageFormat.getBitsPerPixel(0) + 61380, r5);
                r9 = com.netcetera.threeds.sdk.infrastructure.C9612name.valueOf(new com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks(r1, r10, java.lang.String.format(((java.lang.String) r5[0]).intern(), r10, r1, r2, r9)));
                r10 = com.netcetera.threeds.sdk.infrastructure.notify.C963719.valueOf + 31;
                com.netcetera.threeds.sdk.infrastructure.notify.C963719.values = r10 % 128;
             */
            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.netcetera.threeds.sdk.infrastructure.C9612name ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.C9651nr r9, java.lang.String r10, boolean r11) {
                /*
                    r8 = this;
                    r0 = 1
                    int r1 = com.netcetera.threeds.sdk.infrastructure.notify.C963719.values
                    int r1 = r1 + 83
                    int r2 = r1 % 128
                    com.netcetera.threeds.sdk.infrastructure.notify.C963719.valueOf = r2
                    r2 = 2
                    int r1 = r1 % r2
                    java.lang.String r3 = ""
                    r4 = 0
                    if (r1 == 0) goto L27
                    java.lang.String r9 = r9.values(r10)
                    java.lang.CharSequence r9 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2Service(r9, r3)
                    java.lang.String r9 = (java.lang.String) r9
                    java.lang.String r1 = r1
                    java.lang.String r3 = r2
                    boolean r11 = com.netcetera.threeds.sdk.infrastructure.notify.ThreeDS2ServiceInstance(r9, r1, r3, r11)
                    r1 = 7
                    int r1 = r1 / r4
                    if (r11 != 0) goto L83
                    goto L3b
                L27:
                    java.lang.String r9 = r9.values(r10)
                    java.lang.CharSequence r9 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2Service(r9, r3)
                    java.lang.String r9 = (java.lang.String) r9
                    java.lang.String r1 = r1
                    java.lang.String r3 = r2
                    boolean r11 = com.netcetera.threeds.sdk.infrastructure.notify.ThreeDS2ServiceInstance(r9, r1, r3, r11)
                    if (r11 != 0) goto L83
                L3b:
                    com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks r11 = new com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks
                    com.netcetera.threeds.sdk.infrastructure.setForegroundGravity r1 = com.netcetera.threeds.sdk.infrastructure.setForegroundGravity.useBridgingExtension
                    int r3 = android.graphics.ImageFormat.getBitsPerPixel(r4)
                    r5 = 61380(0xefc4, float:8.6012E-41)
                    int r3 = r3 + r5
                    java.lang.Object[] r5 = new java.lang.Object[r0]
                    java.lang.String r6 = "爵ᕬ┺㗦䖯呤搨瓾蒤霵꜋랊잙홴\ue644\uf6caڍᄝ№㇘䆆們恥瀥肦邱ꍨ댺쎺편\ue277\uf230ˋኝⵜ㴂䷆巁汎簚賘鲒꽕뼯켑\udfac\uefb7︣\u0e73ẽ\u2efd㥤䤏妿槌硹蠃飆ꢅ뭖쬌\udbdc\ueb90﨓\u0a55ᩨ⫻㪚"
                    values(r6, r3, r5)
                    r3 = r5[r4]
                    java.lang.String r3 = (java.lang.String) r3
                    java.lang.String r3 = r3.intern()
                    java.lang.String r5 = r1
                    java.lang.String r6 = r2
                    r7 = 4
                    java.lang.Object[] r7 = new java.lang.Object[r7]
                    r7[r4] = r10
                    r7[r0] = r5
                    r7[r2] = r6
                    r5 = 3
                    r7[r5] = r9
                    java.lang.String r9 = java.lang.String.format(r3, r7)
                    r11.<init>(r1, r10, r9)
                    com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks[] r9 = new com.netcetera.threeds.sdk.infrastructure.setMenuCallbacks[r0]
                    r9[r4] = r11
                    com.netcetera.threeds.sdk.infrastructure.name r9 = com.netcetera.threeds.sdk.infrastructure.C9612name.valueOf(r9)
                    int r10 = com.netcetera.threeds.sdk.infrastructure.notify.C963719.valueOf
                    int r10 = r10 + 31
                    int r11 = r10 % 128
                    com.netcetera.threeds.sdk.infrastructure.notify.C963719.values = r11
                    int r10 = r10 % r2
                    if (r10 == 0) goto L81
                    return r9
                L81:
                    r9 = 0
                    throw r9
                L83:
                    com.netcetera.threeds.sdk.infrastructure.name r9 = com.netcetera.threeds.sdk.infrastructure.C9612name.valueOf()
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.notify.C963719.ThreeDS2ServiceInstance(com.netcetera.threeds.sdk.infrastructure.nr, java.lang.String, boolean):com.netcetera.threeds.sdk.infrastructure.name");
            }
        };
        int i = get;
        int i2 = i & 103;
        valueOf = (i2 + ((i ^ 103) | i2)) % 128;
        return finalizeVar;
    }

    public static finalize values(final String str) {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.24
            public static int ThreeDS2Service = 6;
            public static byte[] ThreeDS2ServiceInstance = {73, -22, 78, -54, 59, PSSSigner.TRAILER_IMPLICIT, -1, ByteSourceJsonBootstrapper.UTF8_BOM_1, 13, 4, 2, -2, 19, Framer.STDERR_FRAME_PREFIX, -12, -49, -22, 78, -54, 59, PSSSigner.TRAILER_IMPLICIT, -1, -15, 17, -2, -11, -8, 51, 37, -14, -55, -16, 9, 11, -21, 86, PSSSigner.TRAILER_IMPLICIT, -1, ByteSourceJsonBootstrapper.UTF8_BOM_1, 13, 4, 2, -2, -13, 82, ByteSourceJsonBootstrapper.UTF8_BOM_2, -3, -12, 84, -79, -5, 84, -76, 11, -20, 4, 12, 69, -84, 5, 1, 78, -83, 10, 73, -61, -22, 78, -54, 59, -82, 13, -15, 15, -8, 12, ByteSourceJsonBootstrapper.UTF8_BOM_1, 17, 17};
            public static int get = -447553014;
            private static int getSDKInfo = 1;
            private static int getSDKVersion = 0;
            public static short[] getWarnings = null;
            public static int valueOf = -2050378925;

            private static void get(byte b, short s, int i, int i2, int i3, Object[] objArr) {
                int i4;
                String obj;
                synchronized (createTransaction.ThreeDS2ServiceInstance) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        int i5 = ThreeDS2Service;
                        int i6 = i2 + i5;
                        if (i6 == -1) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        if (i4 != 0) {
                            byte[] bArr = ThreeDS2ServiceInstance;
                            if (bArr != null) {
                                i6 = (byte) (bArr[get + i] + i5);
                            } else {
                                i6 = (short) (getWarnings[get + i] + i5);
                            }
                        }
                        if (i6 > 0) {
                            createTransaction.values = ((i + i6) - 2) + get + i4;
                            char c = (char) (i3 + valueOf);
                            createTransaction.get = c;
                            sb.append(c);
                            createTransaction.valueOf = createTransaction.get;
                            createTransaction.ThreeDS2Service = 1;
                            while (createTransaction.ThreeDS2Service < i6) {
                                byte[] bArr2 = ThreeDS2ServiceInstance;
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

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str2, boolean z) {
                getSDKInfo = (getSDKVersion + 59) % 128;
                String str3 = (String) C9669om.ThreeDS2Service(c9651nr.values(str2), "");
                if (!C9669om.valueOf(str3, str)) {
                    setForegroundGravity setforegroundgravity = setForegroundGravity.Transaction;
                    Object[] objArr = new Object[1];
                    get((byte) View.getDefaultSize(0, 0), (short) (ImageFormat.getBitsPerPixel(0) + 1), 447553014 + View.combineMeasuredStates(0, 0), (-6) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2050379005 - View.resolveSizeAndState(0, 0, 0), objArr);
                    C9612name valueOf2 = C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str2, String.format(((String) objArr[0]).intern(), str2, str, str3)));
                    int i = getSDKVersion + 41;
                    getSDKInfo = i % 128;
                    if (i % 2 != 0) {
                        return valueOf2;
                    }
                    throw null;
                }
                return C9612name.valueOf();
            }
        };
        int i = get;
        valueOf = ((((i | 8) << 1) - (i ^ 8)) - 1) % 128;
        return finalizeVar;
    }

    public static finalize ThreeDS2Service(final String str, final String str2) {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.7
            public static long ThreeDS2Service = -8653324781693911402L;
            private static int ThreeDS2ServiceInstance = 1;
            private static int get;

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r8 = r8;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void ThreeDS2Service(java.lang.String r8, int r9, java.lang.Object[] r10) {
                /*
                    if (r8 == 0) goto L6
                    char[] r8 = r8.toCharArray()
                L6:
                    char[] r8 = (char[]) r8
                    java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
                    monitor-enter(r0)
                    long r1 = com.netcetera.threeds.sdk.infrastructure.notify.C96457.ThreeDS2Service     // Catch: java.lang.Throwable -> L3a
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
                    long r6 = com.netcetera.threeds.sdk.infrastructure.notify.C96457.ThreeDS2Service     // Catch: java.lang.Throwable -> L3a
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
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.notify.C96457.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str3, boolean z) {
                int i = ThreeDS2ServiceInstance + 107;
                get = i % 128;
                if (i % 2 == 0) {
                    String str4 = (String) C9669om.ThreeDS2Service(c9651nr.values(str3), "");
                    if (notify.ThreeDS2ServiceInstance(str4, str, str2, z)) {
                        setForegroundGravity setforegroundgravity = setForegroundGravity.doChallenge;
                        Object[] objArr = new Object[1];
                        ThreeDS2Service("豣谳噰\ue887曬᮲ᴀ⚣癖倌求⭿碡寡樵ⵗ挘䕄瞦㞣数佑絗㡌濻䪛笳ȉ刖瑓䃸ҷ呯繙乴ो廍禶吻Ꭲ䅁按冭ᗿ䭠滜", Color.green(0), objArr);
                        return C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str3, String.format(((String) objArr[0]).intern(), str3, str4)));
                    }
                    C9612name valueOf2 = C9612name.valueOf();
                    ThreeDS2ServiceInstance = (get + 79) % 128;
                    return valueOf2;
                }
                notify.ThreeDS2ServiceInstance((String) C9669om.ThreeDS2Service(c9651nr.values(str3), ""), str, str2, z);
                throw null;
            }
        };
        int i = valueOf;
        int i2 = i & 23;
        int i3 = ((i ^ 23) | i2) << 1;
        int i4 = -((i | 23) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        get = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return finalizeVar;
    }

    public static finalize ThreeDS2ServiceInstance(final int i) {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.16
            public static char[] ThreeDS2Service = {'P', 13484, 27112, 40454, 54105, 2148, 15546, 29182, 42522, 56085, 4185, 17642, 31215, 44596, 58134, 6255, 19637, 33267, 46605, 60227, 8300, 21745, 35315, 48670, 62283, 10353, 23794, 37373, 50697, 64281, 12387, 25762, 39381, 52748, 854, 14375, 27808, 41422, 54868, 2843, 16467, 29936, 43473, 56882, 4882, 18473, 31876, 45510, 58899, 7000, 20579, 33953, 47553, 60949, 8990, 22608, 36093, 49622, 63023};
            private static int get = 1;
            private static int valueOf = 0;
            public static long values = -1480784358422793011L;

            private static void ThreeDS2Service(char c, int i2, int i3, Object[] objArr) {
                String str;
                synchronized (ConfigParameters.valueOf) {
                    try {
                        char[] cArr = new char[i3];
                        ConfigParameters.ThreeDS2Service = 0;
                        while (true) {
                            int i4 = ConfigParameters.ThreeDS2Service;
                            if (i4 < i3) {
                                cArr[i4] = (char) ((ThreeDS2Service[i2 + i4] ^ (i4 * values)) ^ c);
                                ConfigParameters.ThreeDS2Service = i4 + 1;
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

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                int i2 = get + 71;
                valueOf = i2 % 128;
                if (i2 % 2 == 0) {
                    String str2 = (String) C9669om.ThreeDS2Service(c9651nr.values(str), "");
                    int i3 = C9669om.get(str2);
                    if (str2.length() != i) {
                        setForegroundGravity setforegroundgravity = setForegroundGravity.useBridgingExtension;
                        Object[] objArr = new Object[1];
                        ThreeDS2Service((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ViewConfiguration.getScrollBarSize() >> 8, ExpandableListView.getPackedPositionType(0L) + 59, objArr);
                        return C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, String.format(((String) objArr[0]).intern(), str, Integer.valueOf(i), Integer.valueOf(i3))));
                    }
                    C9612name valueOf2 = C9612name.valueOf();
                    int i4 = get + 53;
                    valueOf = i4 % 128;
                    if (i4 % 2 == 0) {
                        return valueOf2;
                    }
                    throw null;
                }
                String str3 = (String) C9669om.ThreeDS2Service(c9651nr.values(str), "");
                C9669om.get(str3);
                str3.length();
                throw null;
            }
        };
        int i2 = get;
        int i3 = (((i2 | 75) << 1) - (~(-(i2 ^ 75)))) - 1;
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            return finalizeVar;
        }
        throw null;
    }

    public static finalize get(final Integer num, final Integer num2) {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.17
            private static int ThreeDS2Service = 0;
            private static int valueOf = 1;
            public static int values = 61;

            private Map<String, String> valueOf(C9651nr c9651nr, String str) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C9623nl cleanup = c9651nr.cleanup(str);
                for (int i = 0; i < cleanup.ThreeDS2ServiceInstance(); i++) {
                    Object values2 = cleanup.values(i);
                    if (values2 instanceof String) {
                        int i2 = valueOf + 113;
                        ThreeDS2Service = i2 % 128;
                        if (i2 % 2 == 0) {
                            String str2 = (String) values2;
                            linkedHashMap.put(str2, str2);
                        } else {
                            String str3 = (String) values2;
                            linkedHashMap.put(str3, str3);
                            throw null;
                        }
                    } else if (values2 instanceof JSONObject) {
                        C9651nr ThreeDS2Service2 = C9651nr.ThreeDS2Service((JSONObject) values2);
                        Iterator<String> it = ThreeDS2Service2.get();
                        while (it.hasNext()) {
                            int i3 = valueOf + 95;
                            ThreeDS2Service = i3 % 128;
                            if (i3 % 2 != 0) {
                                String next = it.next();
                                linkedHashMap.put(next, ThreeDS2Service2.values(next));
                                int i4 = 41 / 0;
                            } else {
                                String next2 = it.next();
                                linkedHashMap.put(next2, ThreeDS2Service2.values(next2));
                            }
                        }
                    }
                }
                return linkedHashMap;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9651nr ThreeDS2Service(C9651nr c9651nr, String str, boolean z) {
                Map<String, String> valueOf2 = valueOf(c9651nr, str);
                C9623nl values2 = C9623nl.values();
                for (Map.Entry<String, String> entry : valueOf2.entrySet()) {
                    ThreeDS2Service = (valueOf + 53) % 128;
                    String value = entry.getValue();
                    if (!(!z)) {
                        int i = ThreeDS2Service + 117;
                        valueOf = i % 128;
                        if (i % 2 == 0) {
                            int i2 = 4 / 0;
                            if (C9669om.get(entry.getValue()) <= num2.intValue()) {
                            }
                            value = C9669om.ThreeDS2Service(entry.getValue(), num2.intValue());
                        } else {
                            if (C9669om.get(entry.getValue()) <= num2.intValue()) {
                            }
                            value = C9669om.ThreeDS2Service(entry.getValue(), num2.intValue());
                        }
                    }
                    C9651nr ThreeDS2ServiceInstance = C9651nr.ThreeDS2ServiceInstance();
                    ThreeDS2ServiceInstance.ThreeDS2Service(entry.getKey(), value);
                    values2.ThreeDS2Service(ThreeDS2ServiceInstance);
                }
                c9651nr.values(str, values2);
                return c9651nr;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                C9612name valueOf2 = C9612name.valueOf();
                for (Map.Entry<String, String> entry : valueOf(c9651nr, str).entrySet()) {
                    int i = C9669om.get(entry.getValue());
                    if (i > num2.intValue()) {
                        setForegroundGravity setforegroundgravity = setForegroundGravity.useBridgingExtension;
                        Object[] objArr = new Object[1];
                        valueOf(27 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 69, "\u0015\u000e\u0017\u0010\u001d\u0011￣\uffc9\u0004ￎ\u001c\u0006ￕ\uffc9￪\f\u001d\u001e\n\u0015\uffc9￣\uffc9\u0004ￎ\u001c\u0006\ufff9\n\u001b\n\u0016\u000e\u001d\u000e\u001b\uffc9\u0004ￎ\u001c\u0006\uffc9\u001f\n\u0015\u001e\u000e\uffc9\u0015\u000e\u0017\u0010\u001d\u0011\uffc9\u000e!\f\u000e\u000e\r\u000e\rￗ\uffc9\ufff6\n!\uffc9", Process.getGidForName("") + 149, false, objArr);
                        valueOf2.values(C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, String.format(((String) objArr[0]).intern(), str, num2, Integer.valueOf(i)))));
                        valueOf = (ThreeDS2Service + 1) % 128;
                    }
                    int length = entry.getKey().length();
                    Integer num3 = num;
                    if (num3 != null) {
                        int i2 = ThreeDS2Service + 55;
                        valueOf = i2 % 128;
                        if (i2 % 2 != 0) {
                            if (length > num3.intValue()) {
                                setForegroundGravity setforegroundgravity2 = setForegroundGravity.useBridgingExtension;
                                Object[] objArr2 = new Object[1];
                                valueOf(60 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), AndroidCharacter.getMirror('0') + 19, "\u001cￊ\u0005ￏ\u001d\u0007ￊ\u0015\u000f#ￊ\u0016\u000f\u0018\u0011\u001e\u0012ￊ\u000f\"\r\u000f\u000f\u000e\u000f\u000e\uffd8ￊ\ufff7\u000b\"ￊ\u0016\u000f\u0018\u0011\u001e\u0012￤ￊ\u0005ￏ\u001d\u0007ￖￊ￫\r\u001e\u001f\u000b\u0016ￊ￤ￊ\u0005ￏ\u001d\u0007\ufffa\u000b\u001c\u000b\u0017\u000f\u001e\u000f", MotionEvent.axisFromString("") + 148, false, objArr2);
                                valueOf2.values(C9612name.valueOf(new setMenuCallbacks(setforegroundgravity2, str, String.format(((String) objArr2[0]).intern(), str, num, Integer.valueOf(length)))));
                            }
                        } else {
                            throw null;
                        }
                    }
                }
                if (z && !valueOf2.values()) {
                    notify.getWarnings().valueOf(valueOf2.toString());
                    return C9612name.valueOf();
                }
                ThreeDS2Service = (valueOf + 55) % 128;
                return valueOf2;
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
                    int r5 = com.netcetera.threeds.sdk.infrastructure.notify.C963517.values     // Catch: java.lang.Throwable -> L2f
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
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.notify.C963517.valueOf(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
            }
        };
        int i = get + 57;
        valueOf = i % 128;
        if (i % 2 != 0) {
            return finalizeVar;
        }
        throw null;
    }

    public static finalize valueOf(final String... strArr) {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.12
            public static int ThreeDS2Service = 1129988906;
            public static byte[] ThreeDS2ServiceInstance = {-66, -63, 6, Ascii.NAK, Ascii.ETB, -24, 14, -29, Ascii.ETB, Ascii.SUB, Ascii.ETB, -85, 82, Ascii.NAK, -34, 14, -37, -25, 15, Ascii.DC4, -47, ByteSourceJsonBootstrapper.UTF8_BOM_2, 89, Ascii.SYN, -34, 6, -32, -26, -8, -61, 18, 84, -31, Ascii.f52684EM, -15, Ascii.SYN, Ascii.SUB, -37, 14, -37, -89, Base64.padSymbol, -37, -23, 19, -23, Ascii.SYN, Ascii.SUB, 11, -23, 13, -27, -95, 57, 16, -31, Ascii.SYN, -52, 67, -14, Ascii.ETB, -88, Framer.ENTER_FRAME_PREFIX, 10, -90, 42, -39, 70, -29, 15, -27, Ascii.CAN, -28, 5, ByteSourceJsonBootstrapper.UTF8_BOM_1, ByteSourceJsonBootstrapper.UTF8_BOM_1};
            public static int get = 1703820661;
            private static int getSDKInfo = 0;
            private static int getSDKVersion = 1;
            public static short[] getWarnings = null;
            public static int valueOf = 68;

            private static void valueOf(byte b, short s, int i, int i2, int i3, Object[] objArr) {
                int i4;
                String obj;
                synchronized (createTransaction.ThreeDS2ServiceInstance) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        int i5 = valueOf;
                        int i6 = i2 + i5;
                        if (i6 == -1) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        if (i4 != 0) {
                            byte[] bArr = ThreeDS2ServiceInstance;
                            if (bArr != null) {
                                i6 = (byte) (bArr[ThreeDS2Service + i] + i5);
                            } else {
                                i6 = (short) (getWarnings[ThreeDS2Service + i] + i5);
                            }
                        }
                        if (i6 > 0) {
                            createTransaction.values = ((i + i6) - 2) + ThreeDS2Service + i4;
                            char c = (char) (i3 + get);
                            createTransaction.get = c;
                            sb.append(c);
                            createTransaction.valueOf = createTransaction.get;
                            createTransaction.ThreeDS2Service = 1;
                            while (createTransaction.ThreeDS2Service < i6) {
                                byte[] bArr2 = ThreeDS2ServiceInstance;
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

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                Object[] objArr = new Object[1];
                valueOf((byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6), (short) (AndroidCharacter.getMirror('0') + '\f'), (-1129988907) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-69) - Gravity.getAbsoluteGravity(0, 0), Drawable.resolveOpacity(0, 0) - 1703820556, objArr);
                if (!C9615nd.get(strArr, c9651nr.values(((String) objArr[0]).intern()), z)) {
                    Boolean sDKInfo = c9651nr.getSDKInfo(str);
                    if (sDKInfo != null && sDKInfo.booleanValue()) {
                        setForegroundGravity setforegroundgravity = setForegroundGravity.getAuthenticationRequestParameters;
                        Object[] objArr2 = new Object[1];
                        valueOf((byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 101), (short) (65461 - AndroidCharacter.getMirror('0')), (-1129988903) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-69) - View.resolveSize(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1703820581, objArr2);
                        return C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, ((String) objArr2[0]).intern()));
                    }
                    return C9612name.valueOf();
                }
                getSDKVersion = (getSDKInfo + 81) % 128;
                C9612name valueOf2 = C9612name.valueOf();
                int i = getSDKVersion + 27;
                getSDKInfo = i % 128;
                if (i % 2 == 0) {
                    return valueOf2;
                }
                throw null;
            }
        };
        int i = get + 1;
        valueOf = i % 128;
        if (i % 2 != 0) {
            return finalizeVar;
        }
        throw null;
    }

    public static finalize ThreeDS2Service(final int i) {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.13
            private static int ThreeDS2Service = 0;
            private static int ThreeDS2ServiceInstance = 1;

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9651nr ThreeDS2Service(C9651nr c9651nr, String str, boolean z) {
                int i2 = ThreeDS2Service;
                int i3 = (i2 ^ 105) + ((i2 & 105) << 1);
                ThreeDS2ServiceInstance = i3 % 128;
                if (i3 % 2 != 0) {
                    if (z) {
                        c9651nr.ThreeDS2Service(str, C9669om.ThreeDS2Service(c9651nr.values(str), i));
                        int i4 = ThreeDS2ServiceInstance;
                        int i5 = i4 & 53;
                        ThreeDS2Service = (i5 + ((i4 ^ 53) | i5)) % 128;
                    }
                    int i6 = ThreeDS2ServiceInstance;
                    int i7 = ((i6 | 6) << 1) - (i6 ^ 6);
                    int i8 = (~i7) + (i7 << 1);
                    ThreeDS2Service = i8 % 128;
                    if (i8 % 2 == 0) {
                        return c9651nr;
                    }
                    throw null;
                }
                throw null;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                int i2 = ThreeDS2Service;
                int i3 = (i2 & 25) + (i2 | 25);
                ThreeDS2ServiceInstance = i3 % 128;
                if (i3 % 2 != 0) {
                    C9612name ThreeDS2ServiceInstance2 = notify.get(i).ThreeDS2ServiceInstance(c9651nr, str, z);
                    if (!ThreeDS2ServiceInstance2.values()) {
                        int i4 = ThreeDS2Service;
                        int i5 = i4 & 1;
                        ThreeDS2ServiceInstance = ((((~i5) & (i4 | 1)) - (~(-(-(i5 << 1))))) - 1) % 128;
                        if (z) {
                            int i6 = i4 ^ 59;
                            int i7 = (i4 & 59) << 1;
                            ThreeDS2ServiceInstance = ((i6 & i7) + (i7 | i6)) % 128;
                            notify.getWarnings().valueOf(ThreeDS2ServiceInstance2.toString());
                            C9612name valueOf2 = C9612name.valueOf();
                            int i8 = ThreeDS2ServiceInstance;
                            int i9 = i8 & 69;
                            int i10 = -(-((i8 ^ 69) | i9));
                            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                            ThreeDS2Service = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i12 = 76 / 0;
                            }
                            return valueOf2;
                        }
                    }
                    int i13 = ThreeDS2Service;
                    int i14 = i13 & 59;
                    int i15 = ((i13 | 59) & (~i14)) + (i14 << 1);
                    ThreeDS2ServiceInstance = i15 % 128;
                    if (i15 % 2 != 0) {
                        return ThreeDS2ServiceInstance2;
                    }
                    throw null;
                }
                notify.get(i).ThreeDS2ServiceInstance(c9651nr, str, z).values();
                throw null;
            }
        };
        int i2 = get;
        int i3 = ((i2 & 50) + (i2 | 50)) - 1;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 43 / 0;
        }
        return finalizeVar;
    }

    public static finalize ThreeDS2ServiceInstance(final setFastScrollEnabled.valueOf valueof) {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.1
            private static int ThreeDS2ServiceInstance = 0;
            public static long get = 5712354498623016673L;
            private static int valueOf = 1;

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r8 = r8;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void values(java.lang.String r8, int r9, java.lang.Object[] r10) {
                /*
                    if (r8 == 0) goto L6
                    char[] r8 = r8.toCharArray()
                L6:
                    char[] r8 = (char[]) r8
                    java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
                    monitor-enter(r0)
                    long r1 = com.netcetera.threeds.sdk.infrastructure.notify.C96271.get     // Catch: java.lang.Throwable -> L3a
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
                    long r6 = com.netcetera.threeds.sdk.infrastructure.notify.C96271.get     // Catch: java.lang.Throwable -> L3a
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
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.notify.C96271.values(java.lang.String, int, java.lang.Object[]):void");
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                valueOf = (ThreeDS2ServiceInstance + 55) % 128;
                String str2 = (String) C9669om.ThreeDS2Service(c9651nr.values(str), "");
                if (!C9669om.valueOf(str2, setFastScrollEnabled.valueOf.this.ThreeDS2Service())) {
                    setForegroundGravity setforegroundgravity = setForegroundGravity.getSDKReferenceNumber;
                    Object[] objArr = new Object[1];
                    values("늬닼ဩ㺢\uf588麩⌒奊襅咩稠너엖魠랃竄S\udf99\uf37c،峏\ue278⢮쎖魌⛼搡輌ퟁ洱ꆤ䣑ቄ놻鵬ᐁ滤\uf5cd\udad0퇻ꕭ㡏ᘑ鵤\ue1f2糅厜ꚡ㱶荅輐扰磹잖쓀\u2fdc띠ੌ\u0001\ueb7e\uf3e0仕綌뒱칋锑뤟灈ી\ud9a8\uf542㷌䄋ᱩ㋽拏鶁⃤游苺\ud845杷ꯁ", 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
                    C9612name valueOf2 = C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, String.format(((String) objArr[0]).intern(), str, setFastScrollEnabled.valueOf.this.ThreeDS2Service(), str2)));
                    valueOf = (ThreeDS2ServiceInstance + 11) % 128;
                    return valueOf2;
                }
                return C9612name.valueOf();
            }
        };
        valueOf = (get + 51) % 128;
        return finalizeVar;
    }

    public static finalize get(final String... strArr) {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.4
            public static long ThreeDS2Service = -1356255402119998763L;
            private static int ThreeDS2ServiceInstance = 1;
            private static int values;

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r7 = r7;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void values(java.lang.String r7, int r8, java.lang.Object[] r9) {
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
                    long r5 = com.netcetera.threeds.sdk.infrastructure.notify.C96424.ThreeDS2Service     // Catch: java.lang.Throwable -> L2e
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
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.notify.C96424.values(java.lang.String, int, java.lang.Object[]):void");
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                int i = ThreeDS2ServiceInstance + 1;
                values = i % 128;
                if (i % 2 == 0) {
                    String str2 = (String) C9669om.ThreeDS2Service(c9651nr.values(str), "");
                    if (!C9615nd.get(strArr, str2, z)) {
                        setForegroundGravity setforegroundgravity = setForegroundGravity.useBridgingExtension;
                        Object[] objArr = new Object[1];
                        values("튅ී汩䲁꼤辳\ueecb쥡⦟ࡪ梈䮝ꩲ誳\ue557억ⓖܢ枅䘟ꚭ膆\ue078샽⌉β拊嵦붱鰟ﲤ\udfcf㹐Ợ礏妥룍鬖ﯩ\uda05㪡ᗟ瑖哫띏韮\uf616텟\u31e6ဇ炻匤뉜鋢쵏ⶂ\u0c3c潖俶긍躂\ue964젇⣗ର殁䨆ꔎ薩\ue457쒜✰٘曫䅿ꇘ耷\ue34f쏛≩ʀ絸尋볫鼼ﾕ\ude12", TextUtils.indexOf("", "") + 57191, objArr);
                        String intern = ((String) objArr[0]).intern();
                        String[] strArr2 = strArr;
                        Object[] objArr2 = new Object[1];
                        values("틹", View.MeasureSpec.makeMeasureSpec(0, 0) + 41269, objArr2);
                        C9612name valueOf2 = C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, String.format(intern, str, C9669om.values(strArr2, ((String) objArr2[0]).intern()), str2)));
                        values = (ThreeDS2ServiceInstance + 75) % 128;
                        return valueOf2;
                    }
                    return C9612name.valueOf();
                }
                C9615nd.get(strArr, (String) C9669om.ThreeDS2Service(c9651nr.values(str), ""), z);
                throw null;
            }
        };
        int i = get;
        int i2 = i & 63;
        int i3 = (i | 63) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        valueOf = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return finalizeVar;
    }

    public static finalize ThreeDS2ServiceInstance(final String... strArr) {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.5
            public static char ThreeDS2Service = 56870;
            public static char ThreeDS2ServiceInstance = 38957;
            public static char get = 65273;
            private static int getSDKInfo = 1;
            private static int getSDKVersion = 0;
            public static char values = 38995;

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r12 = r12;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void ThreeDS2Service(java.lang.String r12, int r13, java.lang.Object[] r14) {
                /*
                    if (r12 == 0) goto L6
                    char[] r12 = r12.toCharArray()
                L6:
                    char[] r12 = (char[]) r12
                    java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.onCompleted.valueOf
                    monitor-enter(r0)
                    int r1 = r12.length     // Catch: java.lang.Throwable -> L5b
                    char[] r1 = new char[r1]     // Catch: java.lang.Throwable -> L5b
                    r2 = 0
                    com.netcetera.threeds.sdk.infrastructure.onCompleted.values = r2     // Catch: java.lang.Throwable -> L5b
                    r3 = 2
                    char[] r3 = new char[r3]     // Catch: java.lang.Throwable -> L5b
                L14:
                    int r4 = com.netcetera.threeds.sdk.infrastructure.onCompleted.values     // Catch: java.lang.Throwable -> L5b
                    int r5 = r12.length     // Catch: java.lang.Throwable -> L5b
                    if (r4 >= r5) goto L6e
                    char r5 = r12[r4]     // Catch: java.lang.Throwable -> L5b
                    r3[r2] = r5     // Catch: java.lang.Throwable -> L5b
                    int r4 = r4 + 1
                    char r4 = r12[r4]     // Catch: java.lang.Throwable -> L5b
                    r5 = 1
                    r3[r5] = r4     // Catch: java.lang.Throwable -> L5b
                    r4 = 58224(0xe370, float:8.1589E-41)
                    r6 = 0
                L28:
                    r7 = 16
                    if (r6 >= r7) goto L5d
                    char r7 = r3[r5]     // Catch: java.lang.Throwable -> L5b
                    char r8 = r3[r2]     // Catch: java.lang.Throwable -> L5b
                    int r9 = r8 + r4
                    int r10 = r8 << 4
                    char r11 = com.netcetera.threeds.sdk.infrastructure.notify.C96435.ThreeDS2Service     // Catch: java.lang.Throwable -> L5b
                    int r10 = r10 + r11
                    r9 = r9 ^ r10
                    int r10 = r8 >>> 5
                    char r11 = com.netcetera.threeds.sdk.infrastructure.notify.C96435.values     // Catch: java.lang.Throwable -> L5b
                    int r10 = r10 + r11
                    r9 = r9 ^ r10
                    int r7 = r7 - r9
                    char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
                    r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
                    int r9 = r7 + r4
                    int r10 = r7 << 4
                    char r11 = com.netcetera.threeds.sdk.infrastructure.notify.C96435.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L5b
                    int r10 = r10 + r11
                    r9 = r9 ^ r10
                    int r7 = r7 >>> 5
                    char r10 = com.netcetera.threeds.sdk.infrastructure.notify.C96435.get     // Catch: java.lang.Throwable -> L5b
                    int r7 = r7 + r10
                    r7 = r7 ^ r9
                    int r8 = r8 - r7
                    char r7 = (char) r8     // Catch: java.lang.Throwable -> L5b
                    r3[r2] = r7     // Catch: java.lang.Throwable -> L5b
                    r7 = 40503(0x9e37, float:5.6757E-41)
                    int r4 = r4 - r7
                    int r6 = r6 + 1
                    goto L28
                L5b:
                    r12 = move-exception
                    goto L77
                L5d:
                    int r4 = com.netcetera.threeds.sdk.infrastructure.onCompleted.values     // Catch: java.lang.Throwable -> L5b
                    char r6 = r3[r2]     // Catch: java.lang.Throwable -> L5b
                    r1[r4] = r6     // Catch: java.lang.Throwable -> L5b
                    int r6 = r4 + 1
                    char r5 = r3[r5]     // Catch: java.lang.Throwable -> L5b
                    r1[r6] = r5     // Catch: java.lang.Throwable -> L5b
                    int r4 = r4 + 2
                    com.netcetera.threeds.sdk.infrastructure.onCompleted.values = r4     // Catch: java.lang.Throwable -> L5b
                    goto L14
                L6e:
                    java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L5b
                    r12.<init>(r1, r2, r13)     // Catch: java.lang.Throwable -> L5b
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
                    r14[r2] = r12
                    return
                L77:
                    monitor-exit(r0)
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.notify.C96435.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                int i = getSDKInfo + 13;
                getSDKVersion = i % 128;
                if (i % 2 == 0) {
                    String str2 = (String) C9669om.ThreeDS2Service(c9651nr.values(str), "");
                    if (!C9662of.get(strArr, str2)) {
                        setForegroundGravity setforegroundgravity = setForegroundGravity.getSDKTransactionID;
                        Object[] objArr = new Object[1];
                        ThreeDS2Service("깶嬇恍\uea66꤬צּꢆ\udd7bẏ欨辛왵Ġ♐㼥蓃輐潩䨢◽”旗ᕄ럪\ue93e\uf87e䱌㊲\u2fdb౮ḽ㻠른뚅ꢆ\udd7b\uef08然\ufdcd棪瞮푉뽭鞞朎䖠\ud8ec҅\uf3cd뚧\ue91b놊\ue2d8㔽↕\uf1e7鉌කꮎ琟ꄼ齝\u1bfa\ue2c1督ຮ䩹렰唿칷奓䫿\udcc1蚞Ử臀\ufdcd棪瞮푉턵姇\u1bfa\ue2c1督ຮꢚﶘ", 87 - TextUtils.indexOf("", ""), objArr);
                        String intern = ((String) objArr[0]).intern();
                        String[] strArr2 = strArr;
                        Object[] objArr2 = new Object[1];
                        ThreeDS2Service("\udf68椢", 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
                        C9612name valueOf2 = C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, String.format(intern, str, C9669om.values(strArr2, ((String) objArr2[0]).intern()), str2)));
                        int i2 = getSDKVersion + 95;
                        getSDKInfo = i2 % 128;
                        if (i2 % 2 != 0) {
                            return valueOf2;
                        }
                        throw null;
                    }
                    return C9612name.valueOf();
                }
                C9662of.get(strArr, (String) C9669om.ThreeDS2Service(c9651nr.values(str), ""));
                throw null;
            }
        };
        int i = get;
        int i2 = (i | 1) << 1;
        int i3 = -(((~i) & 1) | (i & (-2)));
        valueOf = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return finalizeVar;
    }

    public static finalize get() {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.9
            public static int ThreeDS2Service = -1494017110;
            public static short[] ThreeDS2ServiceInstance = null;
            public static int get = 867007991;
            private static int getSDKInfo = 0;
            private static int getSDKVersion = 1;
            public static int valueOf = 1;
            public static byte[] values = {0, 0, 0, 0, 0, 41, -22, 78, -54, 59, ByteSourceJsonBootstrapper.UTF8_BOM_2, -16, 9, 11, -21, 86, -44, -6, -3, Framer.ENTER_FRAME_PREFIX, -2, -47, -14, 18, Ascii.f52695US, 34, PSSSigner.TRAILER_IMPLICIT, -5, -3, 11, -21, 8, 5, 73, -83, 5, 5, 8, -19, 6, -1, 12, 67, -61, -22, 78, -54, 40, -1, 1, -11, 12, -2, 1, 68, -20, -2, -47, -14, 18, Ascii.f52695US, 34, ByteSourceJsonBootstrapper.UTF8_BOM_2, 3, 66, -84, 5, 1, 78, -78, 13, -2, 67, ByteSourceJsonBootstrapper.UTF8_BOM_2, -16, 9, 11, -21, 86, -82, 13, -15, 15, -8, 12, ByteSourceJsonBootstrapper.UTF8_BOM_1, 17, 17};

            private static void ThreeDS2Service(byte b, short s, int i, int i2, int i3, Object[] objArr) {
                int i4;
                String obj;
                synchronized (createTransaction.ThreeDS2ServiceInstance) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        int i5 = valueOf;
                        int i6 = i2 + i5;
                        if (i6 == -1) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        if (i4 != 0) {
                            byte[] bArr = values;
                            if (bArr != null) {
                                i6 = (byte) (bArr[ThreeDS2Service + i] + i5);
                            } else {
                                i6 = (short) (ThreeDS2ServiceInstance[ThreeDS2Service + i] + i5);
                            }
                        }
                        if (i6 > 0) {
                            createTransaction.values = ((i + i6) - 2) + ThreeDS2Service + i4;
                            char c = (char) (i3 + get);
                            createTransaction.get = c;
                            sb.append(c);
                            createTransaction.valueOf = createTransaction.get;
                            createTransaction.ThreeDS2Service = 1;
                            while (createTransaction.ThreeDS2Service < i6) {
                                byte[] bArr2 = values;
                                if (bArr2 != null) {
                                    int i7 = createTransaction.values;
                                    createTransaction.values = i7 - 1;
                                    createTransaction.get = (char) (createTransaction.valueOf + (((byte) (bArr2[i7] + s)) ^ b));
                                } else {
                                    short[] sArr = ThreeDS2ServiceInstance;
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

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                String str2 = (String) C9669om.ThreeDS2Service(c9651nr.values(str), "");
                Object[] objArr = new Object[1];
                ThreeDS2Service((byte) TextUtils.indexOf("", ""), (short) KeyEvent.normalizeMetaState(0), 1494017110 - Color.green(0), (-2) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 867007981, objArr);
                String intern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                ThreeDS2Service((byte) View.combineMeasuredStates(0, 0), (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 1494017111 + (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) - 2, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 867007959, objArr2);
                String intern2 = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                ThreeDS2Service((byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (short) KeyEvent.normalizeMetaState(0), 1494017112 + (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 2, (-867007944) - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
                String intern3 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                ThreeDS2Service((byte) Color.green(0), (short) TextUtils.indexOf("", "", 0, 0), 1494017113 - (ViewConfiguration.getLongPressTimeout() >> 16), (-2) - Drawable.resolveOpacity(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 867007948, objArr4);
                String intern4 = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                ThreeDS2Service((byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1494017114, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 3, (-867007929) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr5);
                getSDKVersion = (getSDKInfo + 15) % 128;
                for (String str3 : Arrays.asList(intern, intern2, intern3, intern4, ((String) objArr5[0]).intern())) {
                    getSDKInfo = (getSDKVersion + 29) % 128;
                    if (C9669om.get(str2, str3)) {
                        if (!z) {
                            setForegroundGravity setforegroundgravity = setForegroundGravity.useBridgingExtension;
                            Object[] objArr6 = new Object[1];
                            ThreeDS2Service((byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (short) (ViewConfiguration.getFadingEdgeLength() >> 16), View.combineMeasuredStates(0, 0) + 1494017115, (Process.myTid() >> 22) - 2, (-867007900) - Color.red(0), objArr6);
                            return C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, String.format(((String) objArr6[0]).intern(), str, str3)));
                        }
                        InterfaceC9652ns warnings = notify.getWarnings();
                        Object[] objArr7 = new Object[1];
                        ThreeDS2Service((byte) (ViewConfiguration.getEdgeSlop() >> 16), (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 1494017115 - (ViewConfiguration.getEdgeSlop() >> 16), (-2) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-867007900) - TextUtils.getOffsetBefore("", 0), objArr7);
                        warnings.valueOf(String.format(((String) objArr7[0]).intern(), str, str3));
                    }
                }
                try {
                    android.util.Base64.decode(str2.getBytes(Charset.defaultCharset()), 8);
                    getSDKInfo = (getSDKVersion + 89) % 128;
                    return C9612name.valueOf();
                } catch (IllegalArgumentException unused) {
                    setForegroundGravity setforegroundgravity2 = setForegroundGravity.useBridgingExtension;
                    Object[] objArr8 = new Object[1];
                    ThreeDS2Service((byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) TextUtils.indexOf("", "", 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 1494017158, Color.argb(0, 0, 0, 0) - 2, (ViewConfiguration.getTapTimeout() >> 16) - 867007911, objArr8);
                    return C9612name.valueOf(new setMenuCallbacks(setforegroundgravity2, str, ((String) objArr8[0]).intern()));
                }
            }
        };
        int i = get;
        int i2 = i | 71;
        int i3 = i2 << 1;
        int i4 = -((~(i & 71)) & i2);
        valueOf = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        return finalizeVar;
    }

    public static finalize get(final int i) {
        finalize finalizeVar = new finalize() { // from class: com.netcetera.threeds.sdk.infrastructure.notify.6
            public static char ThreeDS2Service = 5;
            private static int get = 0;
            public static char[] valueOf = {13823, 13783, 13822, 13761, 13812, 13807, 13728, 13810, 13817, 13801, 13806, 13748, 13805, 13800, 13814, 13819, 13787, 13759, 13815, 13767, 13754, 13770, 13813, 13821, 13794};
            private static int values = 1;

            @Override // com.netcetera.threeds.sdk.infrastructure.finalize
            public C9612name ThreeDS2ServiceInstance(C9651nr c9651nr, String str, boolean z) {
                int i2 = get + 67;
                values = i2 % 128;
                if (i2 % 2 != 0) {
                    C9612name ThreeDS2ServiceInstance = notify.initialize().ThreeDS2ServiceInstance(c9651nr, str, z);
                    int i3 = C9669om.get((String) C9669om.ThreeDS2Service(c9651nr.values(str), ""));
                    if (i3 > i) {
                        setForegroundGravity setforegroundgravity = setForegroundGravity.useBridgingExtension;
                        Object[] objArr = new Object[1];
                        ThreeDS2ServiceInstance(63 - Drawable.resolveOpacity(0, 0), "\u0014\u0010\n\u0012\u000f\u0003\u000f\u0005\n\u0017\u0002\u0012\u000e\u0018\u0018\n\u0001\u0000\u0014\r\u0005\u0016\u0004\u0014\u0005\u0003\u0001\u0003\u0001\u0003\n\u0015\u0000\u0010\u0014\u0015\u0013\n\f\u0018\n\u0002\u0001\u0007\u0017\u0000\u0013\u0007\u0010\u000e\u0015\u000f\u0005\r\n\u0014\u000b\t\u0017\u0000\u0013\u0007㘋", (byte) (68 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr);
                        C9612name valueOf2 = C9612name.valueOf(new setMenuCallbacks(setforegroundgravity, str, String.format(((String) objArr[0]).intern(), str, Integer.valueOf(i), Integer.valueOf(i3))));
                        get = (values + 73) % 128;
                        return valueOf2;
                    }
                    return ThreeDS2ServiceInstance;
                }
                notify.initialize().ThreeDS2ServiceInstance(c9651nr, str, z);
                C9669om.get((String) C9669om.ThreeDS2Service(c9651nr.values(str), ""));
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
                r11 = r11;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void ThreeDS2ServiceInstance(int r10, java.lang.String r11, byte r12, java.lang.Object[] r13) {
                /*
                    Method dump skipped, instructions count: 252
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.notify.C96446.ThreeDS2ServiceInstance(int, java.lang.String, byte, java.lang.Object[]):void");
            }
        };
        int i2 = get;
        int i3 = i2 & 83;
        int i4 = -(-((i2 ^ 83) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        valueOf = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return finalizeVar;
    }

    private static boolean get(String str, String str2, String str3, boolean z) {
        int i = get;
        int i2 = i ^ 47;
        int i3 = ((i & 47) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        valueOf = i5;
        if (!z) {
            get = ((((i5 & (-92)) | ((~i5) & 91)) - (~((i5 & 91) << 1))) - 1) % 128;
            if (str.length() != str2.length()) {
                int i6 = (valueOf + 105) % 128;
                get = i6;
                int i7 = i6 & 117;
                int i8 = -(-((i6 ^ 117) | i7));
                valueOf = ((i7 & i8) + (i8 | i7)) % 128;
                return false;
            }
        }
        if (!C9670on.ThreeDS2ServiceInstance(str)) {
            int i9 = get;
            int i10 = i9 | 75;
            valueOf = (((i10 << 1) - (~(-((~(i9 & 75)) & i10)))) - 1) % 128;
            return false;
        }
        int i11 = valueOf;
        int i12 = ((i11 & (-34)) | ((~i11) & 33)) + ((i11 & 33) << 1);
        get = i12 % 128;
        if (i12 % 2 == 0) {
            return C9663og.ThreeDS2ServiceInstance(Integer.valueOf(str2), Integer.valueOf(str3)).valueOf(Integer.valueOf((int) Double.parseDouble(str)));
        }
        C9663og.ThreeDS2ServiceInstance(Integer.valueOf(str2), Integer.valueOf(str3)).valueOf(Integer.valueOf((int) Double.parseDouble(str)));
        throw null;
    }
}
