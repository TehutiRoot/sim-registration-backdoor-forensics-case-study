package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.InputDeviceCompat;
import java.nio.ByteBuffer;

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
public final class entrySet implements printStackTrace {
    public static final entrySet ConfigParameters;
    public static final entrySet ConfigurationBuilder;
    private static int SchemeConfiguration = 0;
    public static final entrySet ThreeDS2Service;
    public static final entrySet ThreeDS2Service$InitializationCallback;
    public static final entrySet ThreeDS2ServiceInstance;
    public static final entrySet addParam;
    public static final entrySet apiKey;
    private static final /* synthetic */ entrySet[] build;
    public static final entrySet cleanup;
    private static int configureScheme = 1;
    public static final entrySet createTransaction;
    public static final entrySet get;
    public static long getParamValue;
    public static final entrySet getSDKInfo;
    public static final entrySet getSDKVersion;
    public static final entrySet getWarnings;
    public static final entrySet initialize;
    public static final entrySet onCompleted;
    public static final entrySet onError;
    public static char[] removeParam;
    public static final entrySet valueOf;
    public static final entrySet values;
    private final String mastercardSchemeConfiguration;
    private final String restrictedParameters;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        ThreeDS2Service((char) (Color.argb(0, 0, 0, 0) + 6769), ViewConfiguration.getTouchSlop() >> 8, View.resolveSize(0, 0) + 14, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2Service((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2, objArr2);
        String intern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        ThreeDS2Service((char) (Color.green(0) + 63009), 17 - (ViewConfiguration.getFadingEdgeLength() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24, objArr3);
        entrySet entryset = new entrySet(intern, 0, intern2, ((String) objArr3[0]).intern());
        ThreeDS2ServiceInstance = entryset;
        Object[] objArr4 = new Object[1];
        ThreeDS2Service((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 42 - TextUtils.indexOf("", "", 0, 0), TextUtils.getOffsetBefore("", 0) + 14, objArr4);
        String intern3 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        ThreeDS2Service((char) TextUtils.getTrimmedLength(""), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 56, 3 - View.combineMeasuredStates(0, 0), objArr5);
        String intern4 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        ThreeDS2Service((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), Process.getGidForName("") + 60, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 73, objArr6);
        entrySet entryset2 = new entrySet(intern3, 1, intern4, ((String) objArr6[0]).intern());
        values = entryset2;
        Object[] objArr7 = new Object[1];
        ThreeDS2Service((char) (View.MeasureSpec.getMode(0) + 47057), 133 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 14, objArr7);
        String intern5 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        ThreeDS2Service((char) (58738 - Color.red(0)), Color.green(0) + 146, 2 - TextUtils.indexOf((CharSequence) "", '0'), objArr8);
        String intern6 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        ThreeDS2Service((char) (Color.rgb(0, 0, 0) + 16777216), 149 - (ViewConfiguration.getEdgeSlop() >> 16), 27 - Process.getGidForName(""), objArr9);
        entrySet entryset3 = new entrySet(intern5, 2, intern6, ((String) objArr9[0]).intern());
        ThreeDS2Service = entryset3;
        Object[] objArr10 = new Object[1];
        ThreeDS2Service((char) (ViewConfiguration.getPressedStateDuration() >> 16), 177 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 14 - ((Process.getThreadPriority(0) + 20) >> 6), objArr10);
        String intern7 = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        ThreeDS2Service((char) TextUtils.getTrimmedLength(""), 190 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 3 - ExpandableListView.getPackedPositionGroup(0L), objArr11);
        String intern8 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        ThreeDS2Service((char) (5019 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 194, 78 - TextUtils.lastIndexOf("", '0'), objArr12);
        entrySet entryset4 = new entrySet(intern7, 3, intern8, ((String) objArr12[0]).intern());
        get = entryset4;
        Object[] objArr13 = new Object[1];
        ThreeDS2Service((char) (Process.getGidForName("") + 1), 272 - TextUtils.indexOf((CharSequence) "", '0', 0), 13 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr13);
        String intern9 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        ThreeDS2Service((char) ((Process.myPid() >> 22) + 13380), 287 - Color.alpha(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2, objArr14);
        String intern10 = ((String) objArr14[0]).intern();
        Object[] objArr15 = new Object[1];
        ThreeDS2Service((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 8223), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 290, Color.green(0) + 42, objArr15);
        entrySet entryset5 = new entrySet(intern9, 4, intern10, ((String) objArr15[0]).intern());
        valueOf = entryset5;
        Object[] objArr16 = new Object[1];
        ThreeDS2Service((char) (ViewConfiguration.getLongPressTimeout() >> 16), 332 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 14 - (ViewConfiguration.getEdgeSlop() >> 16), objArr16);
        String intern11 = ((String) objArr16[0]).intern();
        Object[] objArr17 = new Object[1];
        ThreeDS2Service((char) (25307 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (Process.myTid() >> 22) + 346, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, objArr17);
        String intern12 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        ThreeDS2Service((char) (1875 - TextUtils.lastIndexOf("", '0', 0)), 349 - Drawable.resolveOpacity(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 87, objArr18);
        entrySet entryset6 = new entrySet(intern11, 5, intern12, ((String) objArr18[0]).intern());
        cleanup = entryset6;
        Object[] objArr19 = new Object[1];
        ThreeDS2Service((char) (ViewConfiguration.getLongPressTimeout() >> 16), 437 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 13 - TextUtils.indexOf((CharSequence) "", '0'), objArr19);
        String intern13 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        ThreeDS2Service((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 451 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 3, objArr20);
        String intern14 = ((String) objArr20[0]).intern();
        Object[] objArr21 = new Object[1];
        ThreeDS2Service((char) (1066 - ((Process.getThreadPriority(0) + 20) >> 6)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 452, Drawable.resolveOpacity(0, 0) + 117, objArr21);
        entrySet entryset7 = new entrySet(intern13, 6, intern14, ((String) objArr21[0]).intern());
        getSDKVersion = entryset7;
        Object[] objArr22 = new Object[1];
        ThreeDS2Service((char) ((-1) - Process.getGidForName("")), 571 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 13 - ImageFormat.getBitsPerPixel(0), objArr22);
        String intern15 = ((String) objArr22[0]).intern();
        Object[] objArr23 = new Object[1];
        ThreeDS2Service((char) (KeyEvent.keyCodeFromString("") + 48746), 584 - (ViewConfiguration.getScrollDefaultDelay() >> 16), Process.getGidForName("") + 4, objArr23);
        String intern16 = ((String) objArr23[0]).intern();
        Object[] objArr24 = new Object[1];
        ThreeDS2Service((char) TextUtils.indexOf("", "", 0), View.getDefaultSize(0, 0) + 587, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 96, objArr24);
        entrySet entryset8 = new entrySet(intern15, 7, intern16, ((String) objArr24[0]).intern());
        getSDKInfo = entryset8;
        Object[] objArr25 = new Object[1];
        ThreeDS2Service((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 48856), ((byte) KeyEvent.getModifierMetaStateMask()) + 684, (ViewConfiguration.getLongPressTimeout() >> 16) + 14, objArr25);
        String intern17 = ((String) objArr25[0]).intern();
        Object[] objArr26 = new Object[1];
        ThreeDS2Service((char) (ViewConfiguration.getTapTimeout() >> 16), 697 - (ViewConfiguration.getTouchSlop() >> 8), 3 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr26);
        String intern18 = ((String) objArr26[0]).intern();
        Object[] objArr27 = new Object[1];
        ThreeDS2Service((char) (38447 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 699, 77 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr27);
        entrySet entryset9 = new entrySet(intern17, 8, intern18, ((String) objArr27[0]).intern());
        initialize = entryset9;
        Object[] objArr28 = new Object[1];
        ThreeDS2Service((char) (61031 - (KeyEvent.getMaxKeyCode() >> 16)), Drawable.resolveOpacity(0, 0) + 776, 14 - TextUtils.getOffsetAfter("", 0), objArr28);
        String intern19 = ((String) objArr28[0]).intern();
        Object[] objArr29 = new Object[1];
        ThreeDS2Service((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 791 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 3 - View.getDefaultSize(0, 0), objArr29);
        String intern20 = ((String) objArr29[0]).intern();
        Object[] objArr30 = new Object[1];
        ThreeDS2Service((char) (6426 - TextUtils.getCapsMode("", 0, 0)), View.getDefaultSize(0, 0) + 793, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, objArr30);
        entrySet entryset10 = new entrySet(intern19, 9, intern20, ((String) objArr30[0]).intern());
        getWarnings = entryset10;
        Object[] objArr31 = new Object[1];
        ThreeDS2Service((char) Color.alpha(0), 806 - TextUtils.getOffsetBefore("", 0), ImageFormat.getBitsPerPixel(0) + 15, objArr31);
        String intern21 = ((String) objArr31[0]).intern();
        Object[] objArr32 = new Object[1];
        ThreeDS2Service((char) (4722 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 820 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3, objArr32);
        String intern22 = ((String) objArr32[0]).intern();
        Object[] objArr33 = new Object[1];
        ThreeDS2Service((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 823 - Color.blue(0), 15 - TextUtils.indexOf((CharSequence) "", '0'), objArr33);
        entrySet entryset11 = new entrySet(intern21, 10, intern22, ((String) objArr33[0]).intern());
        onCompleted = entryset11;
        Object[] objArr34 = new Object[1];
        ThreeDS2Service((char) (36866 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 839, TextUtils.getTrimmedLength("") + 14, objArr34);
        String intern23 = ((String) objArr34[0]).intern();
        Object[] objArr35 = new Object[1];
        ThreeDS2Service((char) (Color.blue(0) + 27544), TextUtils.lastIndexOf("", '0', 0) + 854, 2 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr35);
        String intern24 = ((String) objArr35[0]).intern();
        Object[] objArr36 = new Object[1];
        ThreeDS2Service((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 4316), TextUtils.lastIndexOf("", '0', 0) + 857, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, objArr36);
        entrySet entryset12 = new entrySet(intern23, 11, intern24, ((String) objArr36[0]).intern());
        createTransaction = entryset12;
        Object[] objArr37 = new Object[1];
        ThreeDS2Service((char) (8219 - KeyEvent.normalizeMetaState(0)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 880, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 13, objArr37);
        String intern25 = ((String) objArr37[0]).intern();
        Object[] objArr38 = new Object[1];
        ThreeDS2Service((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6421), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 893, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3, objArr38);
        String intern26 = ((String) objArr38[0]).intern();
        Object[] objArr39 = new Object[1];
        ThreeDS2Service((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 6998), 898 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 11 - Color.argb(0, 0, 0, 0), objArr39);
        entrySet entryset13 = new entrySet(intern25, 12, intern26, ((String) objArr39[0]).intern());
        onError = entryset13;
        Object[] objArr40 = new Object[1];
        ThreeDS2Service((char) (ViewConfiguration.getLongPressTimeout() >> 16), 908 - View.MeasureSpec.getMode(0), 13 - Process.getGidForName(""), objArr40);
        String intern27 = ((String) objArr40[0]).intern();
        Object[] objArr41 = new Object[1];
        ThreeDS2Service((char) ExpandableListView.getPackedPositionType(0L), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 921, TextUtils.indexOf("", "", 0) + 3, objArr41);
        String intern28 = ((String) objArr41[0]).intern();
        Object[] objArr42 = new Object[1];
        ThreeDS2Service((char) View.getDefaultSize(0, 0), 925 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 21, objArr42);
        entrySet entryset14 = new entrySet(intern27, 13, intern28, ((String) objArr42[0]).intern());
        ConfigParameters = entryset14;
        Object[] objArr43 = new Object[1];
        ThreeDS2Service((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf("", "", 0, 0) + 946, 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr43);
        String intern29 = ((String) objArr43[0]).intern();
        Object[] objArr44 = new Object[1];
        ThreeDS2Service((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2034), 960 - Gravity.getAbsoluteGravity(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3, objArr44);
        String intern30 = ((String) objArr44[0]).intern();
        Object[] objArr45 = new Object[1];
        ThreeDS2Service((char) (ViewConfiguration.getEdgeSlop() >> 16), 963 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 21, objArr45);
        entrySet entryset15 = new entrySet(intern29, 14, intern30, ((String) objArr45[0]).intern());
        ThreeDS2Service$InitializationCallback = entryset15;
        Object[] objArr46 = new Object[1];
        ThreeDS2Service((char) (19629 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 984, 14 - View.resolveSize(0, 0), objArr46);
        String intern31 = ((String) objArr46[0]).intern();
        Object[] objArr47 = new Object[1];
        ThreeDS2Service((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 61998), (ViewConfiguration.getJumpTapTimeout() >> 16) + 998, ExpandableListView.getPackedPositionGroup(0L) + 3, objArr47);
        String intern32 = ((String) objArr47[0]).intern();
        Object[] objArr48 = new Object[1];
        ThreeDS2Service((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 3957), 1002 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 24, objArr48);
        entrySet entryset16 = new entrySet(intern31, 15, intern32, ((String) objArr48[0]).intern());
        addParam = entryset16;
        Object[] objArr49 = new Object[1];
        ThreeDS2Service((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.red(0) + InputDeviceCompat.SOURCE_GAMEPAD, TextUtils.lastIndexOf("", '0', 0, 0) + 15, objArr49);
        String intern33 = ((String) objArr49[0]).intern();
        Object[] objArr50 = new Object[1];
        ThreeDS2Service((char) (53481 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1039, 4 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr50);
        String intern34 = ((String) objArr50[0]).intern();
        Object[] objArr51 = new Object[1];
        ThreeDS2Service((char) (59836 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.getOffsetAfter("", 0) + 1042, 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr51);
        entrySet entryset17 = new entrySet(intern33, 16, intern34, ((String) objArr51[0]).intern());
        apiKey = entryset17;
        Object[] objArr52 = new Object[1];
        ThreeDS2Service((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1067 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13, objArr52);
        String intern35 = ((String) objArr52[0]).intern();
        Object[] objArr53 = new Object[1];
        ThreeDS2Service((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 1079 - TextUtils.indexOf((CharSequence) "", '0'), 3 - ((Process.getThreadPriority(0) + 20) >> 6), objArr53);
        String intern36 = ((String) objArr53[0]).intern();
        Object[] objArr54 = new Object[1];
        ThreeDS2Service((char) (42656 - Color.argb(0, 0, 0, 0)), 1082 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 25 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr54);
        entrySet entryset18 = new entrySet(intern35, 17, intern36, ((String) objArr54[0]).intern());
        ConfigurationBuilder = entryset18;
        build = new entrySet[]{entryset, entryset2, entryset3, entryset4, entryset5, entryset6, entryset7, entryset8, entryset9, entryset10, entryset11, entryset12, entryset13, entryset14, entryset15, entryset16, entryset17, entryset18};
        int i = configureScheme + 93;
        SchemeConfiguration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private entrySet(String str, int i, String str2, String str3) {
        this.restrictedParameters = str2;
        this.mastercardSchemeConfiguration = str3;
    }

    public static void ThreeDS2ServiceInstance() {
        char[] cArr = new char[1108];
        ByteBuffer.wrap("\u001a4¾êS±ôe\u0089\u0007-ÃÆ\u0084\u009bA<}Ñ%uô\u000eã£-Du\u00001¤ùI£ölR\u008d¿À\u0018\tedÁ«*òw~Ð;=U\u0099\u0098âçO$¨bôºQ\u0082º\u0091\u00071`mÌ¼)ôr0ß\u000e8J\u0084×\u0000E¤\u009bIÀî\u0014\u0093v7²Üõ\u00810&\fËTo\u0085\u0014\u0092¹\\^\u0007\u00001¤ùI \u0000M¤¬Iáî(\u0093E7\u008aÜÓ\u0081_&\u001eËto¨\u0014Ð¹\u0005^Z\u0002\u0090§çLÞñ,\u0096O:\u0089ßÑ\u0084\u000f)fÎ}r½\u0017Â¼\u000faZ\u0005\u008aª Oêôw\u0099I=\u009aâ\u0092\u0087\u0015,+Ñyuö\u001aé¿\td]\b\u0093\u00ad§R¬÷3\u009cq@\u0095å\u0090\u008a\r/*Ônxô\u001dïÂ\u0003gL\u000b\u009d°¨Uüú:\u009frC\u0082è\u008e\u008d\u00142/×d{¢ ôÅ\njH\u000e\u0098³ËX¦·\u0094\u0013Jþ\u0011YÅ$§\u0080ck$6á\u0091Ý|\u0085ØT£C\u000e\u008dé×åCA\u008b¬Ó\u0000S¤¬Iüî/\u0093\u00047\u0080ÜÓ\u0081\f&;Ëpo½\u0014Æ¹\u001f^\u0015\u0002\u0092§®Lýñ0\u0096V:ËßÑ\u0084\u0005)%Îjr½\u0017Å¼\u000faW\u0000E¤\u009bIÀî\u0014\u0093v7²Üõ\u00810&\fËTo\u0085\u0014\u0091¹\\^\u0004\u00002¤ùI£\u0013Ý·uZcý¢\u0080Ë$\u0002ÏK\u0092\u00845±Ø\u00ad|#\u0007Sª\u0095MÄ\u0011\u0007´5_xâå\u0085Ì)\u0012ÌY\u0097\u0094:³Ýáa!\u0004Y¯ÖrÎ\u0016\u0013¹y\\vç®\u008aÚ.\u001cñ@\u0094\u0082?¼Â±f#\tm¬Ôwù\u001b\u0007¾=A|ä¬\u008f¢S:ö\u0002\u0099Ô<þÇþk;\u000e!Ñ\u0097tÚ\u0018\u0017£.F\u007fé¡\u008cçPYûT\u009e\u0099!³Äøhn3sÖ\u0090yÔ\u001dJ NKqî¾±õU\u001eøW\u0083\u008c&\u008c\u0000E¤\u009bIÀî\u0014\u0093v7²Üõ\u00810&\fËTo\u0085\u0014\u0091¹\\^\u00074v\u0090½}ä \\\u0084¤iäÎ0³R\u0017\u0091üÈ¡\f\u0006wëCO 4Ï\u0099\u0000~K\"\u0086\u0087½l¯Ñ\u0003¶E\u001a\u0080ÿÎ¤\f\t*îyR¨7Ð\u009cUAb%\u008c\u008a®o±Ô\u001a¹Z\u001d\u0095ÂÂ§\u0003\f5ñ{Uº:å\u009f\u0013D\u0000\u0000E¤\u009bIÀî\u0014\u0093v7²Üõ\u00810&\fËTo\u0085\u0014\u0091¹\\^\u0006bîÆ%+}\u0007\u0012£òN´éb\u0094\u00110ÍÛÂ\u0086D!nÌehø\u0013\u0096¾TY\u0014\u0005Ï ³K«ök\u0091V=ÐØ\u008e\u0083L.2É4uþ\u0010Õ»Sf\b\u0002Ú\u00adôHúóG\u009e\u0015:Éå\u0087\u0080\u000f+UÖ5rç\u001d¦¸Yc\u000b\u000fÚªäUøðh\u009b9G\u0093â\u00ad\u008dC(`Ó>\u007fì\u001a ÅV`[\fÍ·öR½ýh\u0098:DÕï\u0093\u008aM5sÐ}|ò' Â\u0010m\r\tÊ´\u008e_üúV¥>AÒì\u009b\u0097H2\fÝ:yç$¬ÏBj\u0016\u0016Ï±\u0087\\ü\u0000E¤\u009bIÀî\u0014\u0093v7²Üõ\u00810&\fËTo\u0085\u0014\u0091¹\\^\u0002\u00002¤ùI¥\u0004n \u0082MÌê\u0010\u0097.3\u0082Øð\u00850\"\u000fÏ^k\u009e\u0010ý½fZi\u0006µ£\u0081HÏõ\u0016\u0092(>¨Ûí\u0080w-\u0005ÊKvÒ\u0013ÿ¸(e|\u0001ö®\u009dKÅð\u0013\u009dm9¦æ¸\u0083>(\bÕ\u0007q§\u001eç»'`h\fµ©\u009bVÐó\u001a\u0098PDíáü\u008e<+\u001aÐ\u0001|º\u0019äÆlcp\u000f¡´\u008eQýþY\u009bYG½ì¤\u0089\u000668ÓF\u007f\u008b$ÔÁ<nq\n¹·ñ\\\u0082ù\u001d¦_B»ï¦\u0094\u001a1YÞ{z¹'ÜÌhig\u0015«²ã_Ù\u0004\u0017¡WMëêõ\u0097*<sÙr\u0085Ä\"ÜÏ$tg\u0010ø½øZÝ\u0007G¬RH\u009aõö\u0092{?bäL\u0080\u0085-ÐÊ\u0013wc\u0013³¸àeÍ\u0002\u0005¯\u0010\u0000E¤\u009bIÀî\u0014\u0093v7²Üõ\u00810&\fËTo\u0085\u0014\u0090¹\\^\u0004¾Y\u001a\u0093÷É\u0000T¤»Ióî5\u0093W7\u008cÜÕ\u0081\u000b&!Ë~o´\u0014\u0083¹%^q\u0002Þ§\u0089Lÿñ-\u0096\u0002:¹ßÑ\u0084\u001e))Îhr¶\u0017È¼\u0019aV\u0005\u0098ªëO®ô\u0003\u0099R=\u0088âÜ\u0087\b,%Ñnu¢\u001aö¿\u0007d_\bÚ\u00ad\u008aRÈ÷u\u009cl@\u0082åÓ\u008a\u001c/+Ô}x±\u001dùÂFgF\u000b\u008b°áUäú<\u009fhCÅèØ\u008d\u00162,×`{¶ »Å\u0002jB\u000e\u0084³\u009fXüý9¢\u007fFÃëÞ\u0090\u00105]Úb~¹#ïÈ\u000bmE\u0011\u0093¶\u009d[å\u0000 ¥uI\u0091îÅ\u0093\u001d8YÝk\u0081º&¹¾\u009d\u001aC÷\u0018PÌ-®\u0089jb-?è\u0098Ôu\u008cÑ]ªH\u0007\u0084àß\u00003¤ùI \u0096k2\u0087ßÉx\u0015\u0005+¡¡Jö\u0017%°\u000b]ZùÕ\u0082â/,Èn\u0094ñ1\u008aÚÚgV\u0000i¬¡Iø\u0012 ¿\u0010XPä\u0083\u0081ë*!÷<\u0093±<\u0093Ù\u0081b\f\u000fg«£t½\u0011gº/GqãÙ\u008cã)\u0003òU\u009eõ;\u0088ÄÖa\u001f\n\u0011Ö¼sð\u001cv¹\u0019BAî\u0098\u008bÚT'ñi\u009d´&\u008fÃÉl\\\t\\Õ¸~¡\u001b7¤\u001bANí\u0098¶ÆSküp\u0098¼%ñÎÔk\u00114[Ðâî\"Jü§§\u0000s}\u0011ÙÕ2\u0092oWÈk%3\u0081âú÷W;°a\u00003¤ùI¡\u0019[½°Pë÷$\u008aM.\u0084Å\u008c\u0098\u0001?7Òev©\rÜ \u0012\u0000E¤\u009bIÀî\u0014\u0093v7²Üõ\u00810&\fËTo\u0085\u0014\u0090¹\\^\u0001\u0012@¶\u008a[Õ\u0000I¤§Iäî:\u0093H7\u0084ÜÒ\u0081_&\u0001ËBo\u0095\u0014\u0083¹\u000f^Z\u0002\u009a§¢\u0090G4\u0099ÙÂ~\u0016\u0003t§°L÷\u00112¶\u000e[Vÿ\u0087\u0084\u0092)^Î\u0002k«Ïa\"?\u0010\u0095´{Y8þæ\u0083\u0094'XÌ\u000e\u0091\u00836àÛ¿\u007fg\u0004\u0011©ÃN\u0088\u0012A·o\\%áê\u0086\u0090*\u0017Ï\f\u0094À9îÞ² ^\u0084\u0080iÛÎ\u000f³m\u0017©üî¡+\u0006\u0017ëOO\u009e4\u008b\u0099G~\u0018\u0019%½ïP²\u001b\u001f¿ñR²õl\u0088\u001e,ÒÇ\u0084\u009a\t=SÐ\u0004tÏ\u0000E¤\u009bIÀî\u0014\u0093v7²Üõ\u00810&\fËTo\u0085\u0014\u0090¹\\^\u0002\u00003¤ùI¥\u0000I¤§Iäî:\u0093H7\u0084ÜÒ\u0081_&;Ëto¨\u0014Ê¹\r^Y\u0002Þ§©Låñ4\u0096@:\u008eßÆ\u0000E¤\u009bIÀî\u0014\u0093v7²Üõ\u00810&\fËTo\u0085\u0014\u0097¹\\^\u0007\u0007Æ£\u000bNR\u0000T¤»Ióî5\u0093W7\u008cÜÕ\u0081\u000b&!Ë~o´\u0014\u0083¹\u0018^\\\u0002\u0093§¢Lôñy\u0096M:\u009eßÀLëè5\u0005n¢ºßØ{\u001c\u0090[Í\u009ej¢\u0087ú#+X9õò\u0012¨ò\u001aV×»\u008f\u000f «ÏF\u0087áA\u009c#8ðÓ§\u008ee)HÄE`Ý\u001b®¶kQ5\rï¨ÞCÄþK\u009975öÐ¬\u008b|&@Á\u001e\u0000E¤\u009bIÀî\u0014\u0093v7²Üõ\u00810&\fËTo\u0085\u0014\u0097¹\\^\u0001ÐÝt\u0010\u0099OéíM\u0011 ]\u0007\u008bzøÞ>5nh¬Ï\u0081\"\u008c\u0086\u0014ýgP¢·üë&N\u0017¥\r\u0018\u0082\u007fþÓ?6emµÀ\u0089'×\u0000E¤\u009bIÀî\u0014\u0093v7²Üõ\u00810&\fËTo\u0085\u0014\u0097¹\\^\u0000\u00004¤ùI§¦ó\u0002\u0010ïAH\u008f5á\u0091 z6'¼\u0080\u0087mßÉ\u0014²f\u001f¯øá¤7\u0001\bê^WÙ0ä\u009c*y}\"±\u008f\u0093hÝÔ\u001d".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1108);
        removeParam = cArr;
        getParamValue = 8626679733883675849L;
    }

    public static entrySet valueOf(String str) {
        int i = SchemeConfiguration + 3;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            return (entrySet) Enum.valueOf(entrySet.class, str);
        }
        Enum.valueOf(entrySet.class, str);
        throw null;
    }

    public static entrySet[] values() {
        int i = SchemeConfiguration + 25;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 24 / 0;
            return (entrySet[]) build.clone();
        }
        return (entrySet[]) build.clone();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        int i = SchemeConfiguration + 117;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = 57 / 0;
            return this.restrictedParameters;
        }
        return this.restrictedParameters;
    }

    private static void ThreeDS2Service(char c, int i, int i2, Object[] objArr) {
        String str;
        synchronized (ConfigParameters.valueOf) {
            try {
                char[] cArr = new char[i2];
                ConfigParameters.ThreeDS2Service = 0;
                while (true) {
                    int i3 = ConfigParameters.ThreeDS2Service;
                    if (i3 < i2) {
                        cArr[i3] = (char) ((removeParam[i + i3] ^ (i3 * getParamValue)) ^ c);
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

    public String valueOf() {
        int i = SchemeConfiguration;
        int i2 = i + 23;
        configureScheme = i2 % 128;
        if (i2 % 2 != 0) {
            String str = this.mastercardSchemeConfiguration;
            int i3 = i + 11;
            configureScheme = i3 % 128;
            if (i3 % 2 != 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }
}