package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.net.SyslogConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.d */
/* loaded from: classes5.dex */
public class C9323d extends getSchemeEncryptionPublicKeyId {
    static final String[] ThreeDS2Service;
    private static char ThreeDS2ServiceInstance = 0;
    private static int cleanup = 1;
    public static logo get;
    private static char getSDKInfo;
    private static int getSDKVersion;
    private static char getWarnings;
    private static char initialize;
    public static long valueOf;
    private static int values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.d$valueOf */
    /* loaded from: classes5.dex */
    public static class valueOf extends ClassLoader {
        private static int ThreeDS2Service = 76;
        private static int ThreeDS2ServiceInstance = -558534136;
        private static int cleanup = 1;
        private static int get = -1705756227;
        private static short[] getSDKVersion;
        private static int getWarnings;
        private static byte[] valueOf = {-61, 0, 18, -11, 41, -33, -1, 1, 3, -14, 35, -24, -10, 5, 3};
        private final ClassLoader values;

        public valueOf(ClassLoader classLoader) {
            super(classLoader);
            this.values = classLoader;
        }

        private static void valueOf(short s, byte b, int i, int i2, int i3, Object[] objArr) {
            int i4;
            String sb;
            synchronized (restrictedParameters.values) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i5 = ThreeDS2Service;
                    int i6 = i2 + i5;
                    if (i6 == -1) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    if (i4 != 0) {
                        byte[] bArr = valueOf;
                        if (bArr != null) {
                            i6 = (byte) (bArr[get + i] + i5);
                        } else {
                            i6 = (short) (getSDKVersion[get + i] + i5);
                        }
                    }
                    if (i6 > 0) {
                        restrictedParameters.ThreeDS2Service = ((i + i6) - 2) + get + i4;
                        char c = (char) (i3 + ThreeDS2ServiceInstance);
                        restrictedParameters.valueOf = c;
                        sb2.append(c);
                        restrictedParameters.ThreeDS2ServiceInstance = restrictedParameters.valueOf;
                        restrictedParameters.get = 1;
                        while (restrictedParameters.get < i6) {
                            byte[] bArr2 = valueOf;
                            if (bArr2 != null) {
                                int i7 = restrictedParameters.ThreeDS2Service;
                                restrictedParameters.ThreeDS2Service = i7 - 1;
                                restrictedParameters.valueOf = (char) (restrictedParameters.ThreeDS2ServiceInstance + (((byte) (bArr2[i7] + s)) ^ b));
                            } else {
                                short[] sArr = getSDKVersion;
                                int i8 = restrictedParameters.ThreeDS2Service;
                                restrictedParameters.ThreeDS2Service = i8 - 1;
                                restrictedParameters.valueOf = (char) (restrictedParameters.ThreeDS2ServiceInstance + (((short) (sArr[i8] + s)) ^ b));
                            }
                            sb2.append(restrictedParameters.valueOf);
                            restrictedParameters.ThreeDS2ServiceInstance = restrictedParameters.valueOf;
                            restrictedParameters.get++;
                        }
                    }
                    sb = sb2.toString();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            objArr[0] = sb;
        }

        public final boolean ThreeDS2ServiceInstance(String str) {
            boolean z = true;
            try {
                Object[] objArr = new Object[1];
                valueOf((short) TextUtils.getOffsetAfter("", 0), (byte) KeyEvent.keyCodeFromString(""), KeyEvent.getDeadChar(0, 0) + 1705756227, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 77, 558534238 - (Process.myTid() >> 22), objArr);
                Method declaredMethod = ClassLoader.class.getDeclaredMethod((String) objArr[0], String.class);
                declaredMethod.setAccessible(true);
                if (((Class) declaredMethod.invoke(this.values, str)) != null) {
                    int i = cleanup + 117;
                    int i2 = i % 128;
                    getWarnings = i2;
                    if (i % 2 != 0) {
                        z = false;
                    }
                    int i3 = i2 + 87;
                    cleanup = i3 % 128;
                    if (i3 % 2 != 0) {
                        return z;
                    }
                    throw null;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    static {
        valueOf();
        ExpandableListView.getPackedPositionForChild(0, 0);
        TextUtils.getCapsMode("", 0, 0);
        TextUtils.getTrimmedLength("");
        ExpandableListView.getPackedPositionForGroup(0);
        ExpandableListView.getPackedPositionGroup(0L);
        TextUtils.indexOf("", "", 0, 0);
        Process.getGidForName("");
        Process.myTid();
        Color.red(0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        valueOf = -1L;
        get = null;
        Object[] objArr = new Object[1];
        ThreeDS2Service("\ue39c\ueddeḣ\ue552㺅즉椌棎\uecc5뱼៌殨\ud922鐒镴Ⳝ鬰\ue276ꕷ垐ﳤ覶೭ꭽӈ\u085cᘴ癰ꐂ㒝ꖠາʞ菬\ue6ec㞩\uddf7旲", View.getDefaultSize(0, 0) + 37, objArr);
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance(41 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0002\u000f\u0012ￎ\u0005\u0004\u000b\u0003\u0001\u0002\f\f\u0001￣\ufff8ￎ\u0013\u000b\u0003\u0001\u0002\f\f\u0001\u0003ￎ\u0004\u0005\u0013\u000f\u0010\u0018ￎ\u0004\t\u000f\u0012\u0004\u000e\u0001ￎ\u0016", true, 6 - Color.red(0), 156 - View.resolveSize(0, 0), objArr2);
        Object[] objArr3 = new Object[1];
        ThreeDS2ServiceInstance((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39, "\u0005\uffff�\u0010\u0005\u000b\n￨\u0005\u0002\u0001\uffff\u0015\uffff\b\u0001\uffdf\b�\u000f\u000f�\f\f\uffff\b\u000b\n\u0001\u000eￊ\uffff\u000b\u0000\u0001ￊ\uffdd\f\f\b", false, 22 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 160 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr3);
        String str = (String) objArr3[0];
        Object[] objArr4 = new Object[1];
        ThreeDS2ServiceInstance((ViewConfiguration.getTouchSlop() >> 8) + 37, "\b\uffdf\u0001\b\uffff\u0015\uffff\u0001\u0002\u0005￨\u0015\u0010\u0005\u0012\u0005\u0010\uffff\uffddￊ\u0001\u0000\u000b\uffffￊ\u000e\u0001\n\u000b\b\uffff\f\f�\u000f\u000f�", true, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 34, (ViewConfiguration.getLongPressTimeout() >> 16) + SyslogConstants.LOG_LOCAL4, objArr4);
        String str2 = (String) objArr4[0];
        Object[] objArr5 = new Object[1];
        ThreeDS2Service("ᛡ㓪歊㢬䟅血\uf18c谕榌\ue641亦⦭쨊眏쯳\udeca⾳숼륏\uea6c䎦퀭\ue463殺䳛꣢爁瓗㬆䡅濗뢺쯳\udecaꁅ갷륏\uea6c䎦퀭뻑쓪荲씶\ue552텷", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 45, objArr5);
        String str3 = (String) objArr5[0];
        Object[] objArr6 = new Object[1];
        ThreeDS2ServiceInstance(37 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\n\u0005\u0007\u000b\u000b\u0004ￊ\u000e\u0001\n\u000b\b\uffff\f\f�ￊ\u000b\u0010\u000f\u0005\b\f\f�ￊ\t\u000b\uffff\u0003\n\u0005\u0007\u000b\u000b￤ￊ\u0003", true, TextUtils.lastIndexOf("", '0', 0, 0) + 30, 159 - Process.getGidForName(""), objArr6);
        String str4 = (String) objArr6[0];
        Object[] objArr7 = new Object[1];
        ThreeDS2Service("ᛡ㓪歊㢬䟅血\uf18c谕榌\ue641亦⦭쨊眏쯳\udeca⾳숼륏\uea6c䎦퀭ຉ뾐䎦퀭\ud906⩞鑐ꃈ㇖⚙\uf33aტ峮跴卮煐䎦퀭\ud906⩞鑐ꃈ", (ViewConfiguration.getEdgeSlop() >> 16) + 44, objArr7);
        String str5 = (String) objArr7[0];
        Object[] objArr8 = new Object[1];
        ThreeDS2Service("ᛡ㓪歊㢬䟅血\uf18c谕榌\ue641亦⦭쨊眏쯳\udeca⾳숼륏\uea6c䎦퀭濗뢺쯳\udecaۓ닻ᦪ鯯륏\uea6c阱쐈좮\udafd柭琵亦⦭膵琨\uf594栮", 44 - KeyEvent.keyCodeFromString(""), objArr8);
        String str6 = (String) objArr8[0];
        Object[] objArr9 = new Object[1];
        ThreeDS2Service("\uecc5뱼抜᜔\uddda鄡\uea3c余躵蠟疊콲鬰\ue276ꕷ垐ﳤ覶\ue463殺斍踆࣯뀍柭琵慾랿\uee94玅\uf41d\uf883⋏쪨\ue1c9뿀䉷㵰", TextUtils.getCapsMode("", 0, 0) + 38, objArr9);
        String str7 = (String) objArr9[0];
        Object[] objArr10 = new Object[1];
        ThreeDS2Service("\uecc5뱼抜᜔\uddda鄡\uea3c余躵蠟疊콲鬰\ue276ꕷ垐ﳤ覶\ue463殺斍踆࣯뀍柭琵慾랿\uee94玅夜ᨇ\uf4ca\ue27c뺘绹ը瞍\ude96ᖥ㪟鄷", 42 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr10);
        String str8 = (String) objArr10[0];
        Object[] objArr11 = new Object[1];
        ThreeDS2ServiceInstance(22 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\uffe7\u0004\u000b\u000f\u0004\u0011\u0000\r\u0003\u0007\u000e\u000e\nￍ\u000b\b\u0001ￍ\uffe7\u000e\u000e\n", false, 6 - ExpandableListView.getPackedPositionType(0L), 157 - View.resolveSizeAndState(0, 0, 0), objArr11);
        String str9 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        ThreeDS2Service("\uecc5뱼抜᜔\uddda鄡\uea3c余躵蠟疊콲兎ﶓ息竣䕢Ѷ\uedcb᷹뫃噜\udff0檃", 23 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr12);
        String str10 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        ThreeDS2Service("\uecc5뱼抜᜔\uddda鄡\uea3c余躵蠟疊콲鬰\ue276ꕷ垐ﳤ覶\uee94玅ᘴ癰ꐂ㒝ꖠາʞ菬\ue6ec㞩\uddf7旲", 30 - MotionEvent.axisFromString(""), objArr13);
        String str11 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        ThreeDS2Service("\uecc5뱼抜᜔\uddda鄡\uea3c余躵蠟疊콲鰜ᥡ婣ଫ\uddda鄡冥촟", 19 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr14);
        String str12 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        ThreeDS2Service("ᛡ㓪歊㢬綾鯢嚕㋰卭鼒芈ꊗ䏧⛻䳮\udfa4㪟鄷ࢯ磔\uecc5뱼婣ଫ\uddda鄡冥촟", 26 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr15);
        String str13 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        ThreeDS2ServiceInstance(38 - TextUtils.indexOf("", ""), "\u0000\u0002\u0001\f￪\b\f\f￥ￋ\u000b\f\u0006\u0011\ufffe\u0011\f\u000b\u000b\ufffeￋ\b\f\f\u0005\u0001\u000b\ufffe\u0010ￋ\u0011\u0003\u0006\u0014\u0010ￋ\n\f", true, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, View.getDefaultSize(0, 0) + 159, objArr16);
        String str14 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        ThreeDS2ServiceInstance((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 45, "\uffc9￣\n\n\u0006￠\r\r\n\r￠\u0013\ufffe\u0000\u000b\u000f\u0004\n\t\ufffe\n\b\uffc9\u000e\u0012\u0004\u0001\u000f\uffc9\u000e￼\t\uffff\u0003\n\n\u0006\uffc9\u0012\r￼\u000b\u000b\u0000\r", false, 20 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + SyslogConstants.LOG_LOCAL4, objArr17);
        String str15 = (String) objArr17[0];
        Object[] objArr18 = new Object[1];
        ThreeDS2ServiceInstance(TextUtils.indexOf((CharSequence) "", '0') + 39, "\u0013\u000fￊ\t\u000b\uffff\u000e\u0001\f\f�\u000e\ufff3\u0007\u000b\u000b￤ￊ\u000e\u0001\f\f�\u000e\u0013ￊ\u0007\u000b\u000b\u0004\u0000\n�\u000fￊ\u0010\u0002\u0005", true, 6 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 160 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr18);
        String str16 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        ThreeDS2Service("\uda98贴Ẹꖯ\uec9bၡ䆬و돌聩㤛崳ᶌ④쨊眏\uf501ꁿ\ueff4\ue989❠\udfcb⣙\uf2f4", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23, objArr19);
        String str17 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        ThreeDS2Service("\uda98贴Ẹꖯ\uec9bၡ䆬و돌聩㤛崳ᶌ④쨊眏\uf501ꁿ\ueff4\ue989❠\udfcb陴妇䚞恫ಅ㉭\uddf7旲", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 28, objArr20);
        String str18 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        ThreeDS2ServiceInstance(View.MeasureSpec.getMode(0) + 35, "\u0012\u0014￭\u0005\u0014\b\u000f\u0004\r\u0005ￎ\u0017\u0005\t\u0013\b\u0015ￎ\u0005\u0010\t\u0003ￎ\u0001\u0012\u0014ￎ\r\u0005\u0014\b\u000f\u0004ￎ￡", false, TextUtils.getTrimmedLength("") + 8, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 157, objArr21);
        String str19 = (String) objArr21[0];
        Object[] objArr22 = new Object[1];
        ThreeDS2Service("嗼Ԥ뮟쏸插슝穦킁", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8, objArr22);
        String str20 = (String) objArr22[0];
        Object[] objArr23 = new Object[1];
        ThreeDS2Service("亦⦭懛궵눙坬੨\uf21bꕿҐ彙튏杸鰥ꤗ\uf5b6䁾讝ἳ\uda24", 20 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr23);
        String str21 = (String) objArr23[0];
        Object[] objArr24 = new Object[1];
        ThreeDS2ServiceInstance(26 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u000e\u0013\u0006\b\u0005\r\u000e￢\u0004\r\b\uffefￍ\u0004\r\b\u000fￍ\u0004\b\u0018\r\u0000\u0002ￍ\u000f", true, 2 - TextUtils.indexOf("", "", 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 157, objArr24);
        String str22 = (String) objArr24[0];
        Object[] objArr25 = new Object[1];
        ThreeDS2ServiceInstance(28 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0007\u0017\f\uffff\u0001ￌ\u000e\r\u0012\u0003\u0003\u0010\u0006\ufff2ￌ\u0011\n\u0007\u0012\u0013ￌ\u0003\f\u0007\u000eￌ\u0003", true, Color.alpha(0) + 9, (ViewConfiguration.getLongPressTimeout() >> 16) + 158, objArr25);
        String str23 = (String) objArr25[0];
        Object[] objArr26 = new Object[1];
        ThreeDS2ServiceInstance(32 - View.getDefaultSize(0, 0), "ￏ\u0006\u000f\u0015\u0013\u001aￏ￢\u0013\u000eￗￕ￦\u000f\u0015\u0013\u001a\u0015\u0010\u0011ￏ\u0004\u0002\u000f\u001a\n\u0006ￏ\u0011\n\u000f\u0006", false, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 16, 155 - (Process.myTid() >> 22), objArr26);
        ThreeDS2Service = new String[]{(String) objArr[0], (String) objArr2[0], str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, (String) objArr26[0]};
        cleanup = (getSDKVersion + 7) % 128;
    }

    private static logo ThreeDS2Service(int i) {
        try {
            if (get(new RuntimeException())) {
                return new logo(i, (-2054018157) ^ i);
            }
        } catch (Exception unused) {
        }
        logo logoVar = new logo(i, i);
        getSDKVersion = (cleanup + 91) % 128;
        return logoVar;
    }

    private static logo ThreeDS2ServiceInstance(int i, int i2) {
        boolean z;
        if ((i2 & 32) == 0) {
            getSDKVersion = (cleanup + 103) % 128;
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance(34 - ExpandableListView.getPackedPositionChild(0L), "\u0003\u0011\r\u000e\ufff6ￌ\u0002\u0003\u0011\r\u000e\u0016ￌ\u0002\u0007\r\u0010\u0002\f\uffffￌ\u0014\u0000\r\u0010ￌ\u0003\u0002\u0003\u0005\u0002\u0007\u0010￠\u0002", true, (ViewConfiguration.getTapTimeout() >> 16) + 28, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 158, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance(36 - (ViewConfiguration.getJumpTapTimeout() >> 16), "\u000f\b\u0014\u0005￭\uffff￣\ufff8ￎ\u0004\u0005\u0013\u000f\u0010\u0018ￎ\u0004\t\u000f\u0012\u0004\u000e\u0001ￎ\u0016\u0002\u000f\u0012ￎ\u0005\u0004\u000b\u000f\u000f￨\u0004", true, 31 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 156, objArr2);
        if (!ThreeDS2Service(intern, ((String) objArr2[0]).intern())) {
            int i3 = cleanup + 81;
            getSDKVersion = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (!z || !ThreeDS2Service(ThreeDS2Service)) {
                return new logo(i, i);
            }
        }
        logo logoVar = new logo(i, i ^ 1);
        cleanup = (getSDKVersion + 103) % 128;
        return logoVar;
    }

    /* renamed from: b */
    private static native byte[] m33368b(int i, int i2);

    public static int get(Context context, int i) {
        cleanup = (getSDKVersion + 45) % 128;
        int valueOf2 = valueOf(context, i, 0);
        getSDKVersion = (cleanup + 85) % 128;
        return valueOf2;
    }

    public static void valueOf() {
        values = 60;
        initialize = (char) 27673;
        getSDKInfo = (char) 24376;
        ThreeDS2ServiceInstance = (char) 64702;
        getWarnings = (char) 59742;
    }

    private static boolean get(Exception exc) {
        StackTraceElement[] stackTrace;
        int length;
        int i;
        int i2 = getSDKVersion + 11;
        cleanup = i2 % 128;
        if (i2 % 2 == 0) {
            stackTrace = exc.getStackTrace();
            length = stackTrace.length;
            i = 1;
        } else {
            stackTrace = exc.getStackTrace();
            length = stackTrace.length;
            i = 0;
        }
        while (i < length) {
            char[] charArray = stackTrace[i].getClassName().toCharArray();
            int length2 = charArray.length;
            long j = 0;
            int i3 = 0;
            while (i3 < length2) {
                j = ((j << 1) ^ charArray[i3]) & 1099511627775L;
                i3++;
                getSDKVersion = (cleanup + 23) % 128;
            }
            if (j == 401672907667L) {
                return true;
            }
            i++;
        }
        cleanup = (getSDKVersion + 17) % 128;
        return false;
    }

    public static int valueOf(Context context, int i, int i2) {
        cleanup = (getSDKVersion + 95) % 128;
        int i3 = valueOf(i, i2).get();
        getSDKVersion = (cleanup + 13) % 128;
        return i3;
    }

    private static boolean ThreeDS2Service(String... strArr) {
        int i = cleanup + CameraActivity.REQUEST_CODE;
        getSDKVersion = i % 128;
        int i2 = i % 2;
        int length = strArr.length;
        int i3 = 0;
        while (i3 < length) {
            String str = strArr[i3];
            try {
                try {
                    Class.forName(str, false, C9323d.class.getClassLoader());
                    return true;
                } catch (Exception unused) {
                    if (new valueOf(ClassLoader.getSystemClassLoader()).ThreeDS2ServiceInstance(str)) {
                        return true;
                    }
                    try {
                        if (Build.VERSION.SDK_INT < 28) {
                            int i4 = cleanup + 57;
                            getSDKVersion = i4 % 128;
                            if (i4 % 2 != 0) {
                                String str2 = Build.VERSION.RELEASE;
                                Object[] objArr = new Object[1];
                                ThreeDS2Service("㱻怚", 1 % TextUtils.indexOf("", ""), objArr);
                                if (str2.equals((String) objArr[0])) {
                                    continue;
                                }
                            } else {
                                String str3 = Build.VERSION.RELEASE;
                                Object[] objArr2 = new Object[1];
                                ThreeDS2Service("㱻怚", TextUtils.indexOf("", "") + 1, objArr2);
                                if (str3.equals((String) objArr2[0])) {
                                    continue;
                                }
                            }
                            Object[] objArr3 = new Object[1];
                            ThreeDS2Service("⾳숼퓅箙\uf667\uf82a㏇䮖뻑쓪\uda98贴", (Process.myTid() >> 22) + 12, objArr3);
                            Method declaredMethod = Class.class.getDeclaredMethod((String) objArr3[0], String.class, Boolean.TYPE, ClassLoader.class);
                            declaredMethod.setAccessible(true);
                            try {
                                declaredMethod.invoke(null, str, Boolean.FALSE, ClassLoader.getSystemClassLoader());
                                return true;
                            } catch (InvocationTargetException e) {
                                e.getTargetException();
                                i3++;
                                cleanup = (getSDKVersion + 109) % 128;
                            }
                        } else {
                            continue;
                        }
                    } catch (IllegalAccessException | NoSuchMethodException unused2) {
                    }
                    i3++;
                    cleanup = (getSDKVersion + 109) % 128;
                }
            } catch (Exception unused3) {
                Class.forName(str, false, ClassLoader.getSystemClassLoader());
                return true;
            }
        }
        return false;
    }

    public static synchronized logo valueOf(int i, int i2) {
        synchronized (C9323d.class) {
            try {
                cleanup = (getSDKVersion + 87) % 128;
                logo ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(i, i2);
                if (i != ThreeDS2ServiceInstance2.get()) {
                    int i3 = cleanup + 59;
                    getSDKVersion = i3 % 128;
                    if (i3 % 2 == 0) {
                        return ThreeDS2ServiceInstance2;
                    }
                    throw null;
                } else if ((i2 & 64) != 0 && C9524k.m33361a(i2) != 0) {
                    return new logo(i, i ^ 102);
                } else {
                    logo ThreeDS2Service2 = ThreeDS2Service(i);
                    if (i != ThreeDS2Service2.get()) {
                        return ThreeDS2Service2;
                    }
                    return get(i, i2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [int, byte[]] */
    private static synchronized logo get(int i, int i2) {
        String ThreeDS2Service2;
        CharBuffer decode;
        synchronized (C9323d.class) {
            int i3 = getSDKVersion + 21;
            cleanup = i3 % 128;
            ?? r1 = i3 % 2;
            try {
                if (r1 == 0) {
                    byte[] m33368b = m33368b(i, i2);
                    Object[] objArr = new Object[1];
                    ThreeDS2Service("턭䪌틹祁\uf514\ud87b", 4 << TextUtils.lastIndexOf("", (char) 14), objArr);
                    decode = Charset.forName((String) objArr[0]).newDecoder().decode(ByteBuffer.wrap(m33368b));
                } else {
                    byte[] m33368b2 = m33368b(i, i2);
                    Object[] objArr2 = new Object[1];
                    ThreeDS2Service("턭䪌틹祁\uf514\ud87b", 4 - TextUtils.lastIndexOf("", '0'), objArr2);
                    decode = Charset.forName((String) objArr2[0]).newDecoder().decode(ByteBuffer.wrap(m33368b2));
                }
                ThreeDS2Service2 = decode.toString();
                cleanup = (getSDKVersion + 3) % 128;
            } catch (CharacterCodingException unused) {
                ThreeDS2Service2 = newSchemeConfiguration.ThreeDS2Service((byte[]) r1);
            }
            Object[] objArr3 = new Object[1];
            ThreeDS2Service("\uef5e繅", 1 - Color.red(0), objArr3);
            int indexOf = ThreeDS2Service2.indexOf((String) objArr3[0]);
            int parseInt = Integer.parseInt(ThreeDS2Service2.substring(0, indexOf));
            String substring = ThreeDS2Service2.substring(indexOf + 1);
            if (i == parseInt) {
                return new logo(i, parseInt);
            }
            Object[] objArr4 = new Object[1];
            ThreeDS2Service("\uef5e繅", 1 - Color.green(0), objArr4);
            String[] split = substring.split((String) objArr4[0]);
            if (6 != split.length) {
                return new logo(i, parseInt);
            }
            return new logo(i, parseInt, split[0], split[1], split[2], split[3], split[4], split[5]);
        }
    }

    public static int ThreeDS2ServiceInstance(long j) {
        int i;
        int i2 = cleanup + 111;
        int i3 = i2 % 128;
        getSDKVersion = i3;
        if (i2 % 2 != 0) {
            i = (((int) j) | (-1437226411)) ^ (((int) (j >> 31)) | 1437226410);
        } else {
            i = (((int) j) & (-1437226411)) | (((int) (j >> 32)) & 1437226410);
        }
        cleanup = (i3 + 61) % 128;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r7 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2ServiceInstance(int r6, java.lang.String r7, boolean r8, int r9, int r10, java.lang.Object[] r11) {
        /*
            if (r7 == 0) goto L6
            char[] r7 = r7.toCharArray()
        L6:
            char[] r7 = (char[]) r7
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.unionSchemeConfiguration.ThreeDS2Service
            monitor-enter(r0)
            char[] r1 = new char[r6]     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            com.netcetera.threeds.sdk.infrastructure.unionSchemeConfiguration.get = r2     // Catch: java.lang.Throwable -> L2f
        L10:
            int r3 = com.netcetera.threeds.sdk.infrastructure.unionSchemeConfiguration.get     // Catch: java.lang.Throwable -> L2f
            if (r3 >= r6) goto L31
            char r3 = r7[r3]     // Catch: java.lang.Throwable -> L2f
            com.netcetera.threeds.sdk.infrastructure.unionSchemeConfiguration.valueOf = r3     // Catch: java.lang.Throwable -> L2f
            int r3 = com.netcetera.threeds.sdk.infrastructure.unionSchemeConfiguration.get     // Catch: java.lang.Throwable -> L2f
            int r4 = com.netcetera.threeds.sdk.infrastructure.unionSchemeConfiguration.valueOf     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 + r10
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
            r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
            int r3 = com.netcetera.threeds.sdk.infrastructure.unionSchemeConfiguration.get     // Catch: java.lang.Throwable -> L2f
            char r4 = r1[r3]     // Catch: java.lang.Throwable -> L2f
            int r5 = com.netcetera.threeds.sdk.infrastructure.C9323d.values     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 - r5
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
            r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
            int r3 = r3 + 1
            com.netcetera.threeds.sdk.infrastructure.unionSchemeConfiguration.get = r3     // Catch: java.lang.Throwable -> L2f
            goto L10
        L2f:
            r6 = move-exception
            goto L69
        L31:
            if (r9 <= 0) goto L48
            com.netcetera.threeds.sdk.infrastructure.unionSchemeConfiguration.ThreeDS2ServiceInstance = r9     // Catch: java.lang.Throwable -> L2f
            char[] r7 = new char[r6]     // Catch: java.lang.Throwable -> L2f
            java.lang.System.arraycopy(r1, r2, r7, r2, r6)     // Catch: java.lang.Throwable -> L2f
            int r9 = com.netcetera.threeds.sdk.infrastructure.unionSchemeConfiguration.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            int r10 = r6 - r9
            java.lang.System.arraycopy(r7, r2, r1, r10, r9)     // Catch: java.lang.Throwable -> L2f
            int r9 = com.netcetera.threeds.sdk.infrastructure.unionSchemeConfiguration.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            int r10 = r6 - r9
            java.lang.System.arraycopy(r7, r9, r1, r2, r10)     // Catch: java.lang.Throwable -> L2f
        L48:
            if (r8 == 0) goto L60
            char[] r7 = new char[r6]     // Catch: java.lang.Throwable -> L2f
            com.netcetera.threeds.sdk.infrastructure.unionSchemeConfiguration.get = r2     // Catch: java.lang.Throwable -> L2f
        L4e:
            int r8 = com.netcetera.threeds.sdk.infrastructure.unionSchemeConfiguration.get     // Catch: java.lang.Throwable -> L2f
            if (r8 >= r6) goto L5f
            int r9 = r6 - r8
            int r9 = r9 + (-1)
            char r9 = r1[r9]     // Catch: java.lang.Throwable -> L2f
            r7[r8] = r9     // Catch: java.lang.Throwable -> L2f
            int r8 = r8 + 1
            com.netcetera.threeds.sdk.infrastructure.unionSchemeConfiguration.get = r8     // Catch: java.lang.Throwable -> L2f
            goto L4e
        L5f:
            r1 = r7
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9323d.ThreeDS2ServiceInstance(int, java.lang.String, boolean, int, int, java.lang.Object[]):void");
    }

    public static long get(long j) {
        BigInteger valueOf2;
        int i = (cleanup + 43) % 128;
        getSDKVersion = i;
        if (j < 0) {
            int i2 = i + 61;
            cleanup = i2 % 128;
            valueOf2 = BigInteger.valueOf(i2 % 2 == 0 ? j - Long.MAX_VALUE : j & Long.MAX_VALUE).subtract(BigInteger.valueOf(Long.MIN_VALUE));
        } else {
            valueOf2 = BigInteger.valueOf(j);
        }
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance(10 - ExpandableListView.getPackedPositionType(0L), "&\ufff8\ufff7\ufff6\ufff5&\ufffa￼\ufff4\ufff4", true, Color.red(0) + 10, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 119, objArr);
        BigInteger bigInteger = new BigInteger(((String) objArr[0]).intern(), 16);
        Object[] objArr2 = new Object[1];
        ThreeDS2Service("軮缠ཤա놗烏\uf422䡷懫褜뿨꘣\u0e72愛䏹ᣁ✜⻘", TextUtils.indexOf((CharSequence) "", '0') + 19, objArr2);
        return valueOf2.modPow(bigInteger, new BigInteger(((String) objArr2[0]).intern(), 16)).longValue();
    }

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
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.SchemeConfiguration.values
            monitor-enter(r0)
            int r1 = r12.length     // Catch: java.lang.Throwable -> L5b
            char[] r1 = new char[r1]     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            com.netcetera.threeds.sdk.infrastructure.SchemeConfiguration.ThreeDS2Service = r2     // Catch: java.lang.Throwable -> L5b
            r3 = 2
            char[] r3 = new char[r3]     // Catch: java.lang.Throwable -> L5b
        L14:
            int r4 = com.netcetera.threeds.sdk.infrastructure.SchemeConfiguration.ThreeDS2Service     // Catch: java.lang.Throwable -> L5b
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
            char r11 = com.netcetera.threeds.sdk.infrastructure.C9323d.initialize     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r10 = r8 >>> 5
            char r11 = com.netcetera.threeds.sdk.infrastructure.C9323d.getSDKInfo     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 - r9
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
            r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
            int r9 = r7 + r4
            int r10 = r7 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.C9323d.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 >>> 5
            char r10 = com.netcetera.threeds.sdk.infrastructure.C9323d.getWarnings     // Catch: java.lang.Throwable -> L5b
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
            int r4 = com.netcetera.threeds.sdk.infrastructure.SchemeConfiguration.ThreeDS2Service     // Catch: java.lang.Throwable -> L5b
            char r6 = r3[r2]     // Catch: java.lang.Throwable -> L5b
            r1[r4] = r6     // Catch: java.lang.Throwable -> L5b
            int r6 = r4 + 1
            char r5 = r3[r5]     // Catch: java.lang.Throwable -> L5b
            r1[r6] = r5     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 + 2
            com.netcetera.threeds.sdk.infrastructure.SchemeConfiguration.ThreeDS2Service = r4     // Catch: java.lang.Throwable -> L5b
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9323d.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }
}
