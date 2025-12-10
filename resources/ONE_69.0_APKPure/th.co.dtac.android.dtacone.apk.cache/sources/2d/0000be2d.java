package com.netcetera.threeds.sdk.infrastructure;

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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

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
public final class setFastScrollStyle {
    private static final /* synthetic */ setFastScrollStyle[] ConfigParameters;
    private static int ConfigurationBuilder = 1;
    public static final setFastScrollStyle ThreeDS2Service;
    public static final setFastScrollStyle ThreeDS2ServiceInstance;
    private static int apiKey;
    public static final setFastScrollStyle cleanup;
    public static char[] createTransaction;
    public static final setFastScrollStyle get;
    public static final setFastScrollStyle getSDKInfo;
    public static final setFastScrollStyle getSDKVersion;
    public static final setFastScrollStyle getWarnings;
    public static final setFastScrollStyle initialize;
    public static long onCompleted;
    public static long onError;
    public static final setFastScrollStyle valueOf;
    public static final setFastScrollStyle values;
    final String ThreeDS2Service$InitializationCallback;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (Process.myPid() >> 22) + 22, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance((char) (Process.myTid() >> 22), 22 - TextUtils.indexOf("", ""), 40 - MotionEvent.axisFromString(""), objArr2);
        setFastScrollStyle setfastscrollstyle = new setFastScrollStyle(intern, 0, ((String) objArr2[0]).intern());
        get = setfastscrollstyle;
        Object[] objArr3 = new Object[1];
        ThreeDS2ServiceInstance((char) TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0) + 63, 20 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        values("葪셔ญ䯪邠\udd97ᭉ恲귳\uead7㞓絽먮܅䳖覽흴ᰤ套ꛩ\ue39c⥍癸댿\uf8c0䖝芷졩ᔙ勃鿪\ue4a8≤漙듈\uf1ec㺦葑섃", TextUtils.lastIndexOf("", '0', 0) + 17714, objArr4);
        setFastScrollStyle setfastscrollstyle2 = new setFastScrollStyle(intern2, 1, ((String) objArr4[0]).intern());
        ThreeDS2ServiceInstance = setfastscrollstyle2;
        Object[] objArr5 = new Object[1];
        ThreeDS2ServiceInstance((char) (403 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 83 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 17 - KeyEvent.keyCodeFromString(""), objArr5);
        String intern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        values("葪如㾡᷌\uf3f8퇡뜅镴歃䥱⽿ಋ\ue2b6샃ꛚ蓫娔㠲ḛﱯ퉄랻閔殙䧰\u2fdbപ\ue31f섉ꝩ蕆媡㢿ẍﳱ틛", 56806 - TextUtils.lastIndexOf("", '0', 0, 0), objArr6);
        setFastScrollStyle setfastscrollstyle3 = new setFastScrollStyle(intern3, 2, ((String) objArr6[0]).intern());
        valueOf = setfastscrollstyle3;
        Object[] objArr7 = new Object[1];
        values("葊㪱了뢥羼㺅ﶂ벊玆㊞\uf1e6냷矵㛥\uf5ca듏每⫃\ue9dd꠵", 48889 - Gravity.getAbsoluteGravity(0, 0), objArr7);
        String intern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        ThreeDS2ServiceInstance((char) ('0' - AndroidCharacter.getMirror('0')), View.MeasureSpec.getMode(0) + 100, 39 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr8);
        setFastScrollStyle setfastscrollstyle4 = new setFastScrollStyle(intern4, 3, ((String) objArr8[0]).intern());
        ThreeDS2Service = setfastscrollstyle4;
        Object[] objArr9 = new Object[1];
        values("葉\ue468䐀꓃ӣ撯앞┖蔻", ExpandableListView.getPackedPositionGroup(0L) + 24623, objArr9);
        String intern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        values("葪츘႕嬎궐\uf013㪁赎힓ᨋ沛뜹料䰡隮\ud931⎴瘨룯̎喃頟\ue2f0㕤翼쉱ᓭ彬", 19069 - View.combineMeasuredStates(0, 0), objArr10);
        setFastScrollStyle setfastscrollstyle5 = new setFastScrollStyle(intern5, 4, ((String) objArr10[0]).intern());
        values = setfastscrollstyle5;
        Object[] objArr11 = new Object[1];
        ThreeDS2ServiceInstance((char) (ViewConfiguration.getLongPressTimeout() >> 16), AndroidCharacter.getMirror('0') + AbstractJsonLexerKt.BEGIN_LIST, (ViewConfiguration.getFadingEdgeLength() >> 16) + 17, objArr11);
        String intern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        values("葪냮\ued79᧘噈苕뼭\uebe8‣岍褗얟\uf2e6⽷寢遇쳔丹㗣战麛쬹\u07bc㰢楌ꗗ퉁\u0eea㭠矷갎\ud890ᔥ䆥績ꭞ", 13451 - TextUtils.getTrimmedLength(""), objArr12);
        setFastScrollStyle setfastscrollstyle6 = new setFastScrollStyle(intern6, 5, ((String) objArr12[0]).intern());
        getWarnings = setfastscrollstyle6;
        Object[] objArr13 = new Object[1];
        ThreeDS2ServiceInstance((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 204 - AndroidCharacter.getMirror('0'), 15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr13);
        String intern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        values("葪䫪ᥱ\uefd4빘販匵⇌\uf003읩闯摃⫖碌쾪鸃沔㌚ȫ탄Ꝣ痱䐅ઍ\ud933꾴绂䵐Ꮺ\ue267낚蜎喪\u2430\ueab0", 52879 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr14);
        setFastScrollStyle setfastscrollstyle7 = new setFastScrollStyle(intern7, 6, ((String) objArr14[0]).intern());
        getSDKInfo = setfastscrollstyle7;
        Object[] objArr15 = new Object[1];
        ThreeDS2ServiceInstance((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3883), 173 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (Process.myPid() >> 22) + 18, objArr15);
        String intern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        values("葪\u0e6e遹ᩘ걈㙕렭䉨퐣帍\ue017樟ﳦ蛷\u08e2鋇ⓔ껞ャ몈䲒횭墽\ue2a9畓ｐ腚୬鵺❫ꤏ㌋씦伢털寘\uedd4", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 35339, objArr16);
        setFastScrollStyle setfastscrollstyle8 = new setFastScrollStyle(intern8, 7, ((String) objArr16[0]).intern());
        getSDKVersion = setfastscrollstyle8;
        Object[] objArr17 = new Object[1];
        ThreeDS2ServiceInstance((char) ('0' - AndroidCharacter.getMirror('0')), 191 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 7 - TextUtils.lastIndexOf("", '0', 0, 0), objArr17);
        String intern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        ThreeDS2ServiceInstance((char) TextUtils.getCapsMode("", 0, 0), View.MeasureSpec.getSize(0) + 198, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 26, objArr18);
        setFastScrollStyle setfastscrollstyle9 = new setFastScrollStyle(intern9, 8, ((String) objArr18[0]).intern());
        initialize = setfastscrollstyle9;
        Object[] objArr19 = new Object[1];
        values("葙\uf51f書\ud7ad䄊닍⎹鵣໊羜\ue972娤쮆䕚똩⟫酋ȫ珺\ued43帞쿩㢸ꨟ", ((Process.getThreadPriority(0) + 20) >> 6) + 29009, objArr19);
        String intern10 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        ThreeDS2ServiceInstance((char) (TextUtils.getTrimmedLength("") + 32486), 224 - Process.getGidForName(""), 44 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr20);
        setFastScrollStyle setfastscrollstyle10 = new setFastScrollStyle(intern10, 9, ((String) objArr20[0]).intern());
        cleanup = setfastscrollstyle10;
        ConfigParameters = new setFastScrollStyle[]{setfastscrollstyle, setfastscrollstyle2, setfastscrollstyle3, setfastscrollstyle4, setfastscrollstyle5, setfastscrollstyle6, setfastscrollstyle7, setfastscrollstyle8, setfastscrollstyle9, setfastscrollstyle10};
        int i = ConfigurationBuilder + 97;
        apiKey = i % 128;
        if (i % 2 != 0) {
            int i2 = 41 / 0;
        }
    }

    private setFastScrollStyle(String str, int i, String str2) {
        this.ThreeDS2Service$InitializationCallback = str2;
    }

    public static void ThreeDS2ServiceInstance() {
        createTransaction = new char[]{'A', 43407, 21467, 64801, 42851, 20655, 64151, 42199, 20015, 63597, 41386, 19351, 62933, 40707, 18788, 62139, 40067, 18125, 61452, 39533, 17343, 60914, 'a', 43426, 21500, 64790, 42847, 20629, 64172, 42170, 19984, 63561, 41354, 19369, 62969, 40751, 18779, 62109, 40111, 18146, 61558, 39525, 17331, 60927, 38861, 16647, 60275, 38067, 16123, 59595, 37393, 15438, 58811, 36849, 14815, 58112, 36183, 13991, 57585, 35368, 13313, 56923, 34734, 'A', 43407, 21467, 64801, 42851, 20655, 64151, 42194, 20009, 63586, 41405, 19355, 62940, 40723, 18795, 62133, 40084, 18117, 61463, 39530, 466, 43036, 21064, 64690, 42736, 20796, 64260, 42320, 20410, 63993, 40994, 18952, 62544, 40603, 18682, 62259, 40214, 'a', 43426, 21500, 64790, 42847, 20629, 64172, 42170, 19984, 63561, 41354, 19369, 62969, 40751, 18779, 62109, 40111, 18146, 61558, 39525, 17331, 60927, 38861, 16647, 60275, 38067, 16118, 59585, 37380, 15435, 58791, 36838, 14795, 58131, 36171, 14000, 57585, 35368, 13325, 'B', 43392, 21453, 64801, 42852, 20659, 64135, 42176, 20008, 63603, 41403, 19339, 62942, 40722, 18797, 62135, 40084, Matrix.MATRIX_TYPE_RANDOM_REGULAR, 43401, 21465, 64800, 42863, 20652, 64128, 42203, 20014, 63593, 41383, 19351, 62916, 40733, 18812, 62129, 3960, 42659, 23795, 61962, 43077, 24454, 62890, 44017, 16644, 63299, 44685, 17568, 64239, 36923, 17984, 64923, 37816, 18933, Matrix.MATRIX_TYPE_RANDOM_REGULAR, 43401, 21465, 64800, 42863, 20655, 64133, 42183, 'a', 43426, 21500, 64790, 42847, 20629, 64172, 42170, 19984, 63561, 41354, 19369, 62969, 40751, 18779, 62109, 40111, 18146, 61558, 39542, 17333, 60925, 38860, 16651, 60275, 38049, 16107, 32391, 55108, 11546, 33776, 55737, 11891, 33866, 55900, 12534, 34479, 57196, 13647, 35615, 57801, 14269, 35963, 57929, 14340, 36496, 58512, 15699, 37643, 59707, 16375, 38293, 59998, 16385, 38443, 60664, 17065, 39770, 61715, 18218, 40422, 62369, 18514, 40471, 62681, 19173, 41139, 63809, 20239, 42445};
        onCompleted = 8669337900435286476L;
        onError = 2178947788200903691L;
    }

    public static setFastScrollStyle valueOf(String str) {
        int i = ConfigurationBuilder + 51;
        apiKey = i % 128;
        int i2 = i % 2;
        setFastScrollStyle setfastscrollstyle = (setFastScrollStyle) Enum.valueOf(setFastScrollStyle.class, str);
        if (i2 != 0) {
            int i3 = 26 / 0;
        }
        apiKey = (ConfigurationBuilder + 25) % 128;
        return setfastscrollstyle;
    }

    public static setFastScrollStyle[] values() {
        setFastScrollStyle[] setfastscrollstyleArr;
        int i = apiKey + 1;
        ConfigurationBuilder = i % 128;
        if (i % 2 == 0) {
            setfastscrollstyleArr = (setFastScrollStyle[]) ConfigParameters.clone();
            int i2 = 97 / 0;
        } else {
            setfastscrollstyleArr = (setFastScrollStyle[]) ConfigParameters.clone();
        }
        int i3 = ConfigurationBuilder + 69;
        apiKey = i3 % 128;
        if (i3 % 2 == 0) {
            return setfastscrollstyleArr;
        }
        throw null;
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
                        cArr[i3] = (char) ((createTransaction[i + i3] ^ (i3 * onCompleted)) ^ c);
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
            long r5 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.onError     // Catch: java.lang.Throwable -> L2e
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.values(java.lang.String, int, java.lang.Object[]):void");
    }
}