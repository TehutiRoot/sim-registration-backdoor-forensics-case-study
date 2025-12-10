package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
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
import androidx.core.view.InputDeviceCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import ch.qos.logback.core.net.SyslogConstants;
import com.netcetera.threeds.sdk.infrastructure.SchemeConfiguration;
import es.dmoral.toasty.BuildConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import th.p047co.dtac.android.dtacone.util.MapLocation;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class cbConfiguration extends getSchemeEncryptionPublicKeyId {
    public static encryptionPublicKey ThreeDS2Service = null;
    public static long ThreeDS2ServiceInstance = 0;
    private static final jcbConfiguration[] cleanup;
    private static int createTransaction = 0;
    private static final String[] get;
    private static char[] getSDKInfo = null;
    private static final jcbConfiguration[] getSDKVersion;
    private static final String[] getWarnings;
    private static final jcbConfiguration[] initialize;
    private static int onCompleted = 1;
    private static long onError;
    private static final String[] valueOf;
    private static final String[] values;

    static {
        ThreeDS2Service();
        Object[] objArr = new Object[1];
        values((char) View.combineMeasuredStates(0, 0), KeyEvent.keyCodeFromString("") + 8, 870 - (Process.myPid() >> 22), objArr);
        String str = (String) objArr[0];
        AudioTrack.getMinVolume();
        TypedValue.complexToFloat(0);
        ViewConfiguration.getMaximumFlingVelocity();
        KeyEvent.getModifierMetaStateMask();
        TextUtils.lastIndexOf("", '0', 0, 0);
        TextUtils.getOffsetAfter("", 0);
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getDoubleTapTimeout();
        TextUtils.indexOf("", "", 0);
        ThreeDS2ServiceInstance = -1L;
        ThreeDS2Service = null;
        Object[] objArr2 = new Object[1];
        values((char) (ViewConfiguration.getTapTimeout() >> 16), 14 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 295, objArr2);
        String str2 = (String) objArr2[0];
        Object[] objArr3 = new Object[1];
        values((char) (8052 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26, 308 - Process.getGidForName(""), objArr3);
        String str3 = (String) objArr3[0];
        Object[] objArr4 = new Object[1];
        values((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 21408), 17 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 335, objArr4);
        String str4 = (String) objArr4[0];
        Object[] objArr5 = new Object[1];
        values((char) (7467 - TextUtils.indexOf((CharSequence) "", '0', 0)), MotionEvent.axisFromString("") + 18, 353 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr5);
        String str5 = (String) objArr5[0];
        Object[] objArr6 = new Object[1];
        values((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27521), Gravity.getAbsoluteGravity(0, 0) + 15, 370 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr6);
        String str6 = (String) objArr6[0];
        Object[] objArr7 = new Object[1];
        values((char) Gravity.getAbsoluteGravity(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36, 383 - Process.getGidForName(""), objArr7);
        String[] strArr = {str2, str3, str4, str5, str6, (String) objArr7[0]};
        valueOf = strArr;
        Object[] objArr8 = new Object[1];
        values((char) (Color.rgb(0, 0, 0) + 16777216), 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 420 - ImageFormat.getBitsPerPixel(0), objArr8);
        String str7 = (String) objArr8[0];
        Object[] objArr9 = new Object[1];
        values((char) (14740 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, Color.rgb(0, 0, 0) + 16777649, objArr9);
        String str8 = (String) objArr9[0];
        Object[] objArr10 = new Object[1];
        values((char) (65273 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 22 - KeyEvent.keyCodeFromString(""), 446 - View.resolveSize(0, 0), objArr10);
        String str9 = (String) objArr10[0];
        Object[] objArr11 = new Object[1];
        values((char) (61011 - Process.getGidForName("")), 31 - Color.argb(0, 0, 0, 0), Color.green(0) + 468, objArr11);
        String str10 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        values((char) TextUtils.getCapsMode("", 0, 0), 12 - View.getDefaultSize(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 499, objArr12);
        String str11 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        values((char) (51792 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11, 511 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr13);
        String str12 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        values((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 11 - MotionEvent.axisFromString(""), 523 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr14);
        String str13 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        values((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 59953), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 11, 535 - View.combineMeasuredStates(0, 0), objArr15);
        String str14 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        values((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23365), 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 548, objArr16);
        String str15 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        values((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 14 - (ViewConfiguration.getPressedStateDuration() >> 16), 559 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr17);
        String str16 = (String) objArr17[0];
        Object[] objArr18 = new Object[1];
        values((char) (31845 - TextUtils.getCapsMode("", 0, 0)), 12 - TextUtils.indexOf("", ""), (ViewConfiguration.getTapTimeout() >> 16) + 573, objArr18);
        String str17 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        values((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), MotionEvent.axisFromString("") + 25, 585 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr19);
        String str18 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        values((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 28 - KeyEvent.normalizeMetaState(0), 609 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr20);
        String[] strArr2 = {str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, (String) objArr20[0]};
        get = strArr2;
        Object[] objArr21 = new Object[1];
        values((char) (ExpandableListView.getPackedPositionGroup(0L) + 18809), KeyEvent.normalizeMetaState(0) + 31, ExpandableListView.getPackedPositionChild(0L) + 638, objArr21);
        Object[] objArr22 = new Object[1];
        values((char) (1688 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 24, KeyEvent.keyCodeFromString("") + 668, objArr22);
        Object[] objArr23 = new Object[1];
        values((char) ((ViewConfiguration.getTouchSlop() >> 8) + 39210), Color.red(0) + 28, 691 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr23);
        Object[] objArr24 = new Object[1];
        values((char) View.MeasureSpec.makeMeasureSpec(0, 0), 14 - Drawable.resolveOpacity(0, 0), 719 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr24);
        values = new String[]{(String) objArr21[0], (String) objArr22[0], (String) objArr23[0], (String) objArr24[0]};
        String[] strArr3 = (String[]) Arrays.copyOf(strArr, 19);
        getWarnings = strArr3;
        System.arraycopy(strArr2, 0, strArr3, 6, 13);
        Object[] objArr25 = new Object[1];
        values((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 8345), 52 - Process.getGidForName(""), 732 - TextUtils.lastIndexOf("", '0'), objArr25);
        String str19 = (String) objArr25[0];
        Object[] objArr26 = new Object[1];
        values((char) (26668 - View.combineMeasuredStates(0, 0)), 23 - TextUtils.getOffsetBefore("", 0), 256 - ExpandableListView.getPackedPositionGroup(0L), objArr26);
        Object[] objArr27 = new Object[1];
        values((char) View.MeasureSpec.makeMeasureSpec(0, 0), (Process.myTid() >> 22) + 10, TextUtils.getCapsMode("", 0, 0) + 786, objArr27);
        Object[] objArr28 = new Object[1];
        values((char) (ExpandableListView.getPackedPositionType(0L) + 7980), 6 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 796 - TextUtils.indexOf("", "", 0), objArr28);
        Object[] objArr29 = new Object[1];
        values((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 9, ImageFormat.getBitsPerPixel(0) + 804, objArr29);
        jcbConfiguration jcbconfiguration = new jcbConfiguration((String) objArr26[0], (String) objArr27[0], (String) objArr28[0], (String) objArr29[0]);
        Object[] objArr30 = new Object[1];
        values((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43676), 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 811, objArr30);
        Object[] objArr31 = new Object[1];
        values((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 7 - Color.argb(0, 0, 0, 0), 828 - Color.alpha(0), objArr31);
        Object[] objArr32 = new Object[1];
        values((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6505), 7 - Color.alpha(0), (ViewConfiguration.getTouchSlop() >> 8) + 835, objArr32);
        Object[] objArr33 = new Object[1];
        values((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11, 842 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr33);
        Object[] objArr34 = new Object[1];
        values((char) (12375 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 14, 853 - (ViewConfiguration.getTapTimeout() >> 16), objArr34);
        jcbConfiguration jcbconfiguration2 = new jcbConfiguration((String) objArr30[0], (String) objArr31[0], (String) objArr32[0], (String) objArr33[0], (String) objArr34[0]);
        Object[] objArr35 = new Object[1];
        values((char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", "", 0) + 16, 279 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr35);
        Object[] objArr36 = new Object[1];
        values((char) View.getDefaultSize(0, 0), 3 - (ViewConfiguration.getScrollBarSize() >> 8), AndroidCharacter.getMirror('0') + 819, objArr36);
        Object[] objArr37 = new Object[1];
        values((char) (27993 - View.resolveSize(0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 22, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 878, objArr37);
        Object[] objArr38 = new Object[1];
        values((char) View.MeasureSpec.getSize(0), Color.green(0) + 25, 900 - (ViewConfiguration.getEdgeSlop() >> 16), objArr38);
        Object[] objArr39 = new Object[1];
        values((char) KeyEvent.normalizeMetaState(0), 28 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 924, objArr39);
        jcbConfiguration jcbconfiguration3 = new jcbConfiguration((String) objArr35[0], (String) objArr36[0], str, (String) objArr37[0], (String) objArr38[0], (String) objArr39[0]);
        Object[] objArr40 = new Object[1];
        values((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 11 - TextUtils.getOffsetAfter("", 0), 953 - Color.argb(0, 0, 0, 0), objArr40);
        Object[] objArr41 = new Object[1];
        values((char) (View.MeasureSpec.getMode(0) + 22233), TextUtils.lastIndexOf("", '0') + 9, 964 - Color.alpha(0), objArr41);
        Object[] objArr42 = new Object[1];
        values((char) (1718 - TextUtils.indexOf((CharSequence) "", '0', 0)), 6 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionChild(0L) + 973, objArr42);
        Object[] objArr43 = new Object[1];
        values((char) View.resolveSizeAndState(0, 0, 0), KeyEvent.getDeadChar(0, 0) + 6, 978 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr43);
        jcbConfiguration jcbconfiguration4 = new jcbConfiguration((String) objArr40[0], (String) objArr41[0], (String) objArr42[0], (String) objArr43[0]);
        Object[] objArr44 = new Object[1];
        values((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 34899), (ViewConfiguration.getFadingEdgeLength() >> 16) + 16, TextUtils.lastIndexOf("", '0', 0) + 985, objArr44);
        Object[] objArr45 = new Object[1];
        values((char) ((-16770712) - Color.rgb(0, 0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 7, ((Process.getThreadPriority(0) + 20) >> 6) + 835, objArr45);
        Object[] objArr46 = new Object[1];
        values((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 803, objArr46);
        jcbConfiguration jcbconfiguration5 = new jcbConfiguration((String) objArr44[0], (String) objArr45[0], (String) objArr46[0]);
        Object[] objArr47 = new Object[1];
        values((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14, 1000 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr47);
        Object[] objArr48 = new Object[1];
        values((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 1 - Color.green(0), 1015 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr48);
        jcbConfiguration jcbconfiguration6 = new jcbConfiguration((String) objArr47[0], (String) objArr48[0]);
        Object[] objArr49 = new Object[1];
        values((char) View.resolveSizeAndState(0, 0, 0), MotionEvent.axisFromString("") + 10, 1015 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr49);
        Object[] objArr50 = new Object[1];
        values((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), TextUtils.getCapsMode("", 0, 0) + 1, 1024 - View.getDefaultSize(0, 0), objArr50);
        jcbConfiguration jcbconfiguration7 = new jcbConfiguration((String) objArr49[0], (String) objArr50[0]);
        Object[] objArr51 = new Object[1];
        values((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 42149), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, (ViewConfiguration.getTouchSlop() >> 8) + InputDeviceCompat.SOURCE_GAMEPAD, objArr51);
        Object[] objArr52 = new Object[1];
        values((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 3 - Color.alpha(0), Drawable.resolveOpacity(0, 0) + 867, objArr52);
        Object[] objArr53 = new Object[1];
        values((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), '7' - AndroidCharacter.getMirror('0'), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 827, objArr53);
        Object[] objArr54 = new Object[1];
        values((char) ((KeyEvent.getMaxKeyCode() >> 16) + 10657), KeyEvent.normalizeMetaState(0) + 8, TextUtils.indexOf((CharSequence) "", '0') + 1042, objArr54);
        Object[] objArr55 = new Object[1];
        values((char) TextUtils.indexOf("", "", 0, 0), Color.red(0) + 11, 841 - ImageFormat.getBitsPerPixel(0), objArr55);
        Object[] objArr56 = new Object[1];
        values((char) (12374 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14, 853 - View.combineMeasuredStates(0, 0), objArr56);
        jcbConfiguration jcbconfiguration8 = new jcbConfiguration((String) objArr51[0], (String) objArr52[0], (String) objArr53[0], (String) objArr54[0], (String) objArr55[0], (String) objArr56[0]);
        Object[] objArr57 = new Object[1];
        values((char) ((Process.getThreadPriority(0) + 20) >> 6), 20 - View.getDefaultSize(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 1049, objArr57);
        Object[] objArr58 = new Object[1];
        values((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 20, ExpandableListView.getPackedPositionChild(0L) + 1070, objArr58);
        Object[] objArr59 = new Object[1];
        values((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 31, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1087, objArr59);
        Object[] objArr60 = new Object[1];
        values((char) ((Process.getThreadPriority(0) + 20) >> 6), (Process.myPid() >> 22) + 26, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1119, objArr60);
        Object[] objArr61 = new Object[1];
        values((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 23, (ViewConfiguration.getLongPressTimeout() >> 16) + 1145, objArr61);
        Object[] objArr62 = new Object[1];
        values((char) (56323 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33, TextUtils.indexOf((CharSequence) "", '0') + 1169, objArr62);
        jcbConfiguration jcbconfiguration9 = new jcbConfiguration((String) objArr57[0], (String) objArr58[0], (String) objArr59[0], (String) objArr60[0], (String) objArr61[0], (String) objArr62[0], str);
        Object[] objArr63 = new Object[1];
        values((char) (38854 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14, TextUtils.getOffsetAfter("", 0) + 1201, objArr63);
        Object[] objArr64 = new Object[1];
        values((char) ((Process.myPid() >> 22) + 7980), 8 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 797 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr64);
        jcbConfiguration jcbconfiguration10 = new jcbConfiguration((String) objArr63[0], (String) objArr64[0]);
        Object[] objArr65 = new Object[1];
        values((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 20442), 30 - TextUtils.indexOf("", "", 0, 0), View.resolveSizeAndState(0, 0, 0) + 1214, objArr65);
        Object[] objArr66 = new Object[1];
        values((char) ((-1) - TextUtils.lastIndexOf("", '0')), 11 - View.getDefaultSize(0, 0), 1243 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr66);
        jcbConfiguration jcbconfiguration11 = new jcbConfiguration((String) objArr65[0], (String) objArr66[0]);
        Object[] objArr67 = new Object[1];
        values((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4594), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1255, objArr67);
        Object[] objArr68 = new Object[1];
        values((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 5 - TextUtils.getOffsetBefore("", 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1274, objArr68);
        jcbConfiguration jcbconfiguration12 = new jcbConfiguration((String) objArr67[0], (String) objArr68[0]);
        Object[] objArr69 = new Object[1];
        values((char) View.getDefaultSize(0, 0), 19 - Gravity.getAbsoluteGravity(0, 0), 1279 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr69);
        jcbConfiguration jcbconfiguration13 = new jcbConfiguration((String) objArr69[0]);
        Object[] objArr70 = new Object[1];
        values((char) Color.red(0), 16 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1298, objArr70);
        jcbConfiguration jcbconfiguration14 = new jcbConfiguration((String) objArr70[0]);
        Object[] objArr71 = new Object[1];
        values((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.indexOf("", "") + 19, 1314 - TextUtils.getCapsMode("", 0, 0), objArr71);
        jcbConfiguration jcbconfiguration15 = new jcbConfiguration((String) objArr71[0]);
        Object[] objArr72 = new Object[1];
        values((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 48310), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19, View.combineMeasuredStates(0, 0) + 1333, objArr72);
        jcbConfiguration jcbconfiguration16 = new jcbConfiguration((String) objArr72[0]);
        Object[] objArr73 = new Object[1];
        values((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 23 - TextUtils.indexOf("", "", 0, 0), Drawable.resolveOpacity(0, 0) + 1352, objArr73);
        jcbConfiguration jcbconfiguration17 = new jcbConfiguration((String) objArr73[0]);
        Object[] objArr74 = new Object[1];
        values((char) (Process.myTid() >> 22), View.resolveSize(0, 0) + 21, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1376, objArr74);
        jcbConfiguration jcbconfiguration18 = new jcbConfiguration((String) objArr74[0]);
        Object[] objArr75 = new Object[1];
        values((char) ('0' - AndroidCharacter.getMirror('0')), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, 1396 - View.resolveSizeAndState(0, 0, 0), objArr75);
        jcbConfiguration jcbconfiguration19 = new jcbConfiguration((String) objArr75[0], str);
        Object[] objArr76 = new Object[1];
        values((char) (58459 - View.combineMeasuredStates(0, 0)), Gravity.getAbsoluteGravity(0, 0) + 28, TextUtils.getCapsMode("", 0, 0) + 1420, objArr76);
        jcbConfiguration jcbconfiguration20 = new jcbConfiguration((String) objArr76[0], str);
        Object[] objArr77 = new Object[1];
        values((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 27 - TextUtils.indexOf("", ""), KeyEvent.getDeadChar(0, 0) + 1448, objArr77);
        jcbConfiguration jcbconfiguration21 = new jcbConfiguration((String) objArr77[0], str);
        Object[] objArr78 = new Object[1];
        values((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 31 - (ViewConfiguration.getEdgeSlop() >> 16), 1476 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr78);
        jcbConfiguration jcbconfiguration22 = new jcbConfiguration((String) objArr78[0], str);
        Object[] objArr79 = new Object[1];
        values((char) View.MeasureSpec.makeMeasureSpec(0, 0), 26 - MotionEvent.axisFromString(""), TextUtils.getTrimmedLength("") + 1506, objArr79);
        jcbConfiguration jcbconfiguration23 = new jcbConfiguration((String) objArr79[0], str);
        Object[] objArr80 = new Object[1];
        values((char) (51189 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 32, 1533 - KeyEvent.keyCodeFromString(""), objArr80);
        initialize = new jcbConfiguration[]{jcbconfiguration, jcbconfiguration2, jcbconfiguration3, jcbconfiguration4, jcbconfiguration5, jcbconfiguration6, jcbconfiguration7, jcbconfiguration8, jcbconfiguration9, jcbconfiguration10, jcbconfiguration11, jcbconfiguration12, jcbconfiguration13, jcbconfiguration14, jcbconfiguration15, jcbconfiguration16, jcbconfiguration17, jcbconfiguration18, jcbconfiguration19, jcbconfiguration20, jcbconfiguration21, jcbconfiguration22, jcbconfiguration23, new jcbConfiguration((String) objArr80[0], str)};
        Object[] objArr81 = new Object[1];
        values((char) (ImageFormat.getBitsPerPixel(0) + 31812), 13 - TextUtils.lastIndexOf("", '0', 0, 0), MotionEvent.axisFromString("") + 1566, objArr81);
        Object[] objArr82 = new Object[1];
        values((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 12, 1580 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr82);
        String str20 = (String) objArr82[0];
        Object[] objArr83 = new Object[1];
        values((char) (44906 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), View.getDefaultSize(0, 0) + 11, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1590, objArr83);
        String str21 = (String) objArr83[0];
        Object[] objArr84 = new Object[1];
        values((char) (ViewConfiguration.getEdgeSlop() >> 16), 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1601, objArr84);
        String str22 = (String) objArr84[0];
        Object[] objArr85 = new Object[1];
        values((char) View.MeasureSpec.makeMeasureSpec(0, 0), View.resolveSizeAndState(0, 0, 0) + 11, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1611, objArr85);
        String str23 = (String) objArr85[0];
        Object[] objArr86 = new Object[1];
        values((char) (58573 - TextUtils.getCapsMode("", 0, 0)), 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1622 - TextUtils.lastIndexOf("", '0'), objArr86);
        String str24 = (String) objArr86[0];
        Object[] objArr87 = new Object[1];
        values((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 11 - TextUtils.indexOf("", ""), (ViewConfiguration.getScrollBarSize() >> 8) + 1634, objArr87);
        String str25 = (String) objArr87[0];
        Object[] objArr88 = new Object[1];
        values((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18078), 11 - (Process.myTid() >> 22), Process.getGidForName("") + 1646, objArr88);
        String str26 = (String) objArr88[0];
        Object[] objArr89 = new Object[1];
        values((char) TextUtils.indexOf("", "", 0), ExpandableListView.getPackedPositionType(0L) + 11, (-16775560) - Color.rgb(0, 0, 0), objArr89);
        String str27 = (String) objArr89[0];
        Object[] objArr90 = new Object[1];
        values((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 51186), MotionEvent.axisFromString("") + 12, (KeyEvent.getMaxKeyCode() >> 16) + 1667, objArr90);
        String str28 = (String) objArr90[0];
        Object[] objArr91 = new Object[1];
        values((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getOffsetBefore("", 0) + 11, (KeyEvent.getMaxKeyCode() >> 16) + 1678, objArr91);
        String str29 = (String) objArr91[0];
        Object[] objArr92 = new Object[1];
        values((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.combineMeasuredStates(0, 0) + 11, View.getDefaultSize(0, 0) + 1689, objArr92);
        String str30 = (String) objArr92[0];
        Object[] objArr93 = new Object[1];
        values((char) TextUtils.getOffsetBefore("", 0), 11 - (ViewConfiguration.getPressedStateDuration() >> 16), 1699 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr93);
        String str31 = (String) objArr93[0];
        Object[] objArr94 = new Object[1];
        values((char) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11, 1712 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr94);
        String str32 = (String) objArr94[0];
        Object[] objArr95 = new Object[1];
        values((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 38766), Color.green(0) + 11, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1722, objArr95);
        String str33 = (String) objArr95[0];
        Object[] objArr96 = new Object[1];
        values((char) (TextUtils.getOffsetAfter("", 0) + 61677), ExpandableListView.getPackedPositionChild(0L) + 12, View.combineMeasuredStates(0, 0) + 1733, objArr96);
        String str34 = (String) objArr96[0];
        Object[] objArr97 = new Object[1];
        values((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 11 - ExpandableListView.getPackedPositionType(0L), Gravity.getAbsoluteGravity(0, 0) + 1744, objArr97);
        jcbConfiguration jcbconfiguration24 = new jcbConfiguration((String) objArr81[0], str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, (String) objArr97[0]);
        Object[] objArr98 = new Object[1];
        values((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3926), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, 1755 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr98);
        Object[] objArr99 = new Object[1];
        values((char) (TextUtils.getOffsetAfter("", 0) + 7439), ExpandableListView.getPackedPositionChild(0L) + 8, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1776, objArr99);
        jcbConfiguration jcbconfiguration25 = new jcbConfiguration((String) objArr98[0], (String) objArr99[0]);
        Object[] objArr100 = new Object[1];
        values((char) View.combineMeasuredStates(0, 0), TextUtils.getOffsetBefore("", 0) + 18, 1785 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr100);
        Object[] objArr101 = new Object[1];
        values((char) (61551 - View.resolveSizeAndState(0, 0, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1803, objArr101);
        jcbConfiguration jcbconfiguration26 = new jcbConfiguration((String) objArr100[0], 28, (String) objArr101[0]);
        Object[] objArr102 = new Object[1];
        values((char) View.getDefaultSize(0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 14, MotionEvent.axisFromString("") + 1823, objArr102);
        Object[] objArr103 = new Object[1];
        values((char) Drawable.resolveOpacity(0, 0), TextUtils.lastIndexOf("", '0') + 16, 1837 - ((Process.getThreadPriority(0) + 20) >> 6), objArr103);
        jcbConfiguration jcbconfiguration27 = new jcbConfiguration((String) objArr102[0], 28, (String) objArr103[0]);
        Object[] objArr104 = new Object[1];
        values((char) (25542 - Color.alpha(0)), 10 - TextUtils.indexOf((CharSequence) "", '0', 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1851, objArr104);
        Object[] objArr105 = new Object[1];
        values((char) KeyEvent.getDeadChar(0, 0), AndroidCharacter.getMirror('0') - '!', 1862 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr105);
        Object[] objArr106 = new Object[1];
        values((char) (KeyEvent.getDeadChar(0, 0) + 45209), 16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength("") + 1878, objArr106);
        Object[] objArr107 = new Object[1];
        values((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15, TextUtils.indexOf("", "") + 1894, objArr107);
        getSDKVersion = new jcbConfiguration[]{jcbconfiguration24, jcbconfiguration25, jcbconfiguration26, jcbconfiguration27, new jcbConfiguration((String) objArr104[0], 28, (String) objArr105[0], (String) objArr106[0], (String) objArr107[0])};
        Object[] objArr108 = new Object[1];
        values((char) ((Process.getThreadPriority(0) + 20) >> 6), 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1909, objArr108);
        Object[] objArr109 = new Object[1];
        values((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 5, 1922 - ExpandableListView.getPackedPositionGroup(0L), objArr109);
        jcbConfiguration jcbconfiguration28 = new jcbConfiguration((String) objArr108[0], (String) objArr109[0]);
        Object[] objArr110 = new Object[1];
        values((char) Color.blue(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15, View.MeasureSpec.makeMeasureSpec(0, 0) + 1927, objArr110);
        Object[] objArr111 = new Object[1];
        values((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 15274), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, 1942 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr111);
        Object[] objArr112 = new Object[1];
        values((char) (ExpandableListView.getPackedPositionChild(0L) + 47453), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15, 1961 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr112);
        jcbConfiguration jcbconfiguration29 = new jcbConfiguration((String) objArr110[0], (String) objArr111[0], (String) objArr112[0]);
        Object[] objArr113 = new Object[1];
        values((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 21 - (Process.myTid() >> 22), 1976 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr113);
        Object[] objArr114 = new Object[1];
        values((char) (34700 - Color.green(0)), 10 - View.resolveSize(0, 0), 1995 - ImageFormat.getBitsPerPixel(0), objArr114);
        jcbConfiguration jcbconfiguration30 = new jcbConfiguration((String) objArr113[0], (String) objArr114[0]);
        Object[] objArr115 = new Object[1];
        values((char) ExpandableListView.getPackedPositionGroup(0L), Color.argb(0, 0, 0, 0) + 11, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2006, objArr115);
        Object[] objArr116 = new Object[1];
        values((char) (29176 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 6 - (Process.myPid() >> 22), View.MeasureSpec.getMode(0) + 155, objArr116);
        jcbConfiguration jcbconfiguration31 = new jcbConfiguration((String) objArr115[0], (String) objArr116[0]);
        Object[] objArr117 = new Object[1];
        values((char) Color.argb(0, 0, 0, 0), 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2016 - TextUtils.indexOf((CharSequence) "", '0'), objArr117);
        Object[] objArr118 = new Object[1];
        values((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 34700), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10, 1996 - (KeyEvent.getMaxKeyCode() >> 16), objArr118);
        cleanup = new jcbConfiguration[]{jcbconfiguration28, jcbconfiguration29, jcbconfiguration30, jcbconfiguration31, new jcbConfiguration((String) objArr117[0], (String) objArr118[0])};
        int i = createTransaction + 87;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static void ThreeDS2Service() {
        char[] cArr = new char[2045];
        ByteBuffer.wrap("¢w\u0000gêÔÕ\u0016Àcª¶\u0095\u001a\u0080Vïî\u0005q:ï/ýE\u0018\u0000[\u000eò\u0000:ê\u0091\u0000aêßÕ\u0006Àaª«\u0095\u001c\u0080BjùUø@\\*\u0098\u0015ö\u0000%ê\u008eÕÝÀ6«\u007f\u0095¯\u0080\\kqU\u0091@Ä+r\u0015¸\u0000Èë\u0001ÕµÀå«\u0019\u0096R\u0080ík;Va@\u0085+Ç\u0000aêßÕ\u0006Àaª«\u0095\u001c\u0080BjùUø@\\*\u0098\u0015ö\u0000%ê\u008eÕÝÀ6«\u007f\u0095¯\u0080\\kqU\u0091@Ä+r\u0015¸\u0000Èë\u0001ÕµÀå«\u0019\u0096R\u0080ðk:Vm@\u0093+Ç\u0016a\u0000·)ÅÃ+üúé\u0096\u0083M¼°©¯CM|\u0017iº\u0003n<\u0017)É\u0000GêÞÕ\u000eÀwª¢\u0095\u001c\u0080Uj¿\u0000rêÞÕLÀqª±\u0095\u001c\u0080Jj³U¦@Q*\u0085\u0015è\u00008jp\u0080Ê¿\u001dª~À¿ÿEêV\u0000¬?âX\u0007²é\u008d8\u0098Tò\u008fÍrØh2\u0096\rÌ\u0018tr±MÊX\u0017²¡\u008dã\u0098\u001aóK\u0000nêÔÕ\u000fÀfª·\u0095\u0013q\u008f\u009b*¤ô±\u0092ÛNäê\u0000/êÁÕ\u0010À|ª§\u0095Z\u0080Kj¸Uì@L*\u0086\u0015þ\u0000?\u0000vêÓÕ\rÀkª£\u0095\u0000\u0080Cj¤Uü\u0000/êÕÕ\u0003Àgª¥\u0095Z\u0080Kj¾Uû@Z*Å\u0015ë\u0000>ê\u0092ÕÈÀ6«|\u0095¤\u0080\u0001k\fU·@ð+D\u0015È\u0000¨ëfÕ\u0099ÀÄ«1\u0096#\u0080Ók\u0006VC@£+í\u0016E\u0000\u008dëçÖ2ÀÙ«Å\u0096<\u0081gkÎV\u0005Ap+«\u0000/êÂÕ\u001bÀ`ª°\u0095\u0010\u0080KjøUä@P*\u0088\u0015´\u0000 ê\u0094ÕÌÀ1«r\u0095ï\u0080\u0001kL\u0000bêØÕ\u0005À}ª«\u0095\rh^\u0082ò½`¨OÂ\u009aý6èn\u0002\u008e=Ç(aBè}Úh\u0001\u0082¿½÷¨\u0015Ã]ý\u008eè*\u0003z=\u008a(ÌCh\u0000rêÞÕLÀcª¶\u0095\u001a\u0080Bj¢Uë@M*Ä\u0015ö\u0000#ê\u0099ÕËÀ3\u0000/êÕÕ\u0007Àeªë\u0095\u0004\u0080CjºUý@f*\u009a\u0015ò\u0000<ê\u0098\u001f[õ¡Êsß\u0011µ\u009f\u008ar\u009f=uÀJ\u0097_(5ê\nÀ\u001fZõèÊ©ßN´\u0006\u008aÔ\u009fht3Jÿ_\u00964'\ný\u001f\u0095ôYS\u008f¹u\u0086§\u0093ÅùKÆ¦Óé9\u0014\u0006C\u0013üy>F\u0014S\u008b¹8\u0086`\u0093\u0086øÔ\u001d\u0003÷ùÈ+ÝI·Ç\u0088*\u009dew\u0098HÏ]p7²\b\u0098\u001d\u0011÷´ÈïÝ\u0006¶Xk®\u0081C¾\u009a«áÁjþ\u0085ëÂ\u0001;>|+çA\u001f~hk¬\u0081\u001f¾J\u0000/êÂÕ\u001bÀ`ª°\u0095\u0010\u0080KjøUä@P*\u0088\u0015´\u0000 ê\u0094ÕÌÀ<«O\u0095¬\u0080\u0013kOU¸@ê+U\u0015¸\u0000üë,Õ\u0098ÀÞ«;\u0096R\u0080Ïk\nVM@¤+¬\u0016@\u0000\u008b\u0000/êÕÕ\u0007Àeªë\u0095\u0017\u0080Uj£U×@^*\u009a\u0015è9»ÓAì\u0093ùñ\u0093\u007f¬\u0083¹ÁS7lCyÙ\u0013\u0017,b9½þÖ\u0014,+þ>\u009cT\u0012kÿ~°\u0094M«\u001a¾¥ÔgëMþ×\u0014w+#>ÀU\u0086kT~ï\u0095¿«_¾\u0018î{\u0004\u0096;O.4Dä{Dn\u001f\u0084¬»°®\u0004ÄÜûàît\u0004À;\u0098.iE7{án@\u0085\u0018»ì®µÅ\u0007ûÁî\u0093\u0005w;À.\u0096E&x*n\u0085\u0000/êÕÕ\u0007Àeªë\u0095\u0017\u0080Uj£Ué@Z*\u0089\u0015þÊ` \u009a\u001fH\n*`¤_XJ\u001a ì\u009f \u008a\u000fà×ß»\u0000/êÕÕ\u0007Àeªë\u0095\u0017\u0080Uj£Uå@\\*\u008d\u0015õê\u001e\u0000ä?6*T@Ú\u007f&jd\u0080\u0092¿ÖªzÀ²ÿÏ[j±\u0090\u008eB\u009b ñ®ÎRÛ\u00101æ\u000e»\u001b\u0011qÜN¹\u0000/êÕÕ\u0007Àeªë\u0095\u0017\u0080Uj£Uø@^*\u008b\u0015ò\u0000<ê\u009e|J\u0096°©b¼\u0000Ö\u008eérü0\u0016Æ)²<5Vâi\u009b\u0000/êÕÕ\u0003Àgª¥\u0095Z\u0080Bj¸Uÿ@W*\u0086\u0015ô\u0000-ê\u0099ÕÝÀp«>\u0095¹\u0080\u0010k\fU¶@ö+B\u0015\u008c\u0000/êÜÕ\fÀgªë\u0095\u0002\u0080Oj¹Uì@V*\u009d\u0015è\u0000cê¿ÕÝÀ+«C\u0095©\u0080\u0013kQU±@á+p\u0015\u0088\u0000ôë-Õ\u009fÀÙIV£»\u009cb\u0089\u0019ãÉÜiÉ2#\u0081\u001c\u0093\t)cý\\ÍI[£á\u009cº\u0089Sâ?ÜõÉ&\"4\u001cÈ\t\u0091b:\\³I\u0082¢_\u009cí\u0089¦âWß\u001bÉ«\u0006·ìZÓ\u0083Æø¬(\u0093\u0088\u0086Ól`SrFÈ,\u001c\u0013,\u0006ºì\u0000Ó[Æ²\u00adÞ\u0093\u0014\u0086ÇmËS>Fr-Þ\u0099\u0005sèL1YJ3\u009a\f:\u0019aóÒÌÎÙz³¢\u008c\u009e\u0099\ns¾LæY\u001b2_\f\u0086\u0019-ò_Ì³Ùß²n\u008c¢\u0099ÂrML£Yî\u0000/êÕÕ\u0007Àeªë\u0095\u001b\u0080CjºUý@^*\u009f\u0015þ\u0000?ê\u0089 ¶Ê[õ\u0082àù\u008arµ\u0088 ÚJ8ux`Ã\n\u00165q úÊ\u0017õNàµ\u008býµ= \u0086K\u0095u.`l\u000bÚ5Q bË õ\u0016à\u0002\u008bê¶÷ WK\u0083vß`:\u000b~6Û RËoö¯à\u001b\u008bX¶®¡õKMvªaç\u000b\"6\u0094!öË\u001eöyá¿\u008b\u001c\u0000GêÔÕ\fÀjª©\u0095\u001a\u0080Rj¾Uç@W\u001fYõóÊ%ßQµ\u0087\u008a.\u009fd\u0000cêÙÕ\u0010À|ª©\u0095\u001c\u0080Sjºªî@B\u007fÐjÿ\u0000*?\u0086*ÞÀ>ÿwêÑ\u0080X¿cªµ@\u0017\u007f[j \u0001é\u0000vêÓÕ\rÀkªü\u0095C\u0080V\u0019\u000fó¼ÌdÙ\u001e³Þ\u008ct\u0099-\u0000gêÔÕ\fÀvª¶\u0095\u001c\u0080Ej\u0088Uð@\u0001*Ü01Ú\u0082åZð \u009aà¥J°\u0013ZÞe¦pW\u001a\u008a%\u00920,Ú\u009f\u0000sêÕÕ\t\u0000eêÜÕ\u0017À\u007fª¥\u0095\u0001\u0080Ij¥m\u0018\u0087\u0098¸K\u00adjÇÏøYí\u0011\u0007ú8¸-\rGÖxâms\u0087Ë¸\u0085\u00ad&Æ\nøðíY\u0006\u00158à-¹\u0000AêßÕ\u0006Àaª«\u0095\u001c\u0080Bj÷UÛ@}*¡\u0015»\u0000.ê\u0088ÕÇÀ3«d\u0095á\u0080\u0014kLU¦@¥+N\u0015ß\u0000®\u0000AêßÕ\u0006Àaª«\u0095\u001c\u0080Bj÷UÛ@}*¡\u0015»\u0000.ê\u0088ÕÇÀ3«d\u0095á\u0080\u0014kLU¦@¥+N\u0015ß\u0000®ë\u0016ÕÌÀ\u009f\u0000rêÞÕLÀ{ª¥\u0095\u0007\u0080Bj Ué@K*\u008fV¾¼\u0007\u0083×\u0096®ü{ÃÅÖ\u008c<f\u0006ÁìdÓºÆÜ¬K\u0093ô\u0000rêÐÕ\fÀpª¬\u0095\u0000\u0088!b\u008d]\u001fH0\"å\u001dI\b\u0011âñÝ¸È\u001e¢\u0097\u009dª\u0088mbÏ]\u0093Hh\u0000rêÞÕLÀxª¡\u0095\u0007\u0080Hj²Uä@\u0017*\u009b\u0015þ\u0000!ê\u0088\u00001\u0000rêÞÕLÀ`ª¡\u0095\u0016\u0080Sj¥Uí\u00000¤ÖNzqèdÕ\u000e\u00151¸$îÎ\u0017ñ\u0002äí\u008e<±P¤\u008cN,qid\u008f)ÇÃeü¯éÞ\u0083:¼¬©¿C@\u0000rêÞÕLÀqª±\u0095\u001c\u0080Jj³U¦@_*\u0083\u0015õ\u0000+ê\u0098ÕÜÀ/«b\u0095¨\u0080\u001ckW\u0000gêÔÕ\fÀvª¶\u0095\u001c\u0080EjøUû@]*\u0081\u0015´\u0000+ê\u0098ÕÀÀ:«b\u0095¨\u0080\u0011\u0000gêÔÕ\fÀvª¶\u0095\u001c\u0080Ej\u0088Uð@\u0001*Ü\u0015´\u0000?ê\u0099ÕÅÀ\u0000«h\u0095ù\u0080Dk\fU³@à+X\u0015\u0082\u0000êë Õ\u0099Àô«$\u00965\u0080\u0088\u0000gêÔÕ\fÀvª¶\u0095\u001c\u0080EjøUï@V*\u0085\u0015ü\u0000 ê\u0098ÕñÀ,«t\u0095ª\u0080]kDU±@ë+S\u0015\u0095\u0000ñë*\u0000gêÔÕ\fÀvª¶\u0095\u001c\u0080EjøUþ@[*\u0085\u0015ã\u0000têËÕÞÀp«f\u0095£\u0080\u001dk[Uì@³+FÜd6Ý\t\u000e\u001cwv«I\u0013\\\n¶§\u0089ï\u009cQö¶ÉÿÜ?6\u0096\tÂ\u001c2wvI\u009d\\\t·\u0018\u0089á\u009c©÷RÉ\u0081Üõ7/\t\u008b\u001cÁw<JQ\\Å·T\u008a\u0015\u0097´}\u0018B\u008aW·=m\u0002Ü\u0017\u0094ý}Â!×\u009e½H\u00828\u0097øO«¥\u0007\u009a\u0095\u008f¨årÚÃÏ\u008b%g\u001a<\u000f\u0081eTZ'O»¥F\u009a\u0002\u008fïä¥Ú|Ï\u0085$\u009c\u001ad\u000f2d\u0088Z[O3¤à\u009aQ\u008f\u001bäëÙ \u0000AêßÕ\u0006Àaª«\u0095\u001c\u0080BjúUð@\u0001*Ü\u0011\u0083û/Ä½Ñ\u0080»@\u0084í\u0091»{BDWQ¬;r\u0004\u0019\u0011Íû`Ä>Ñ×ºÏ\u0084Y\u0091ç\u0000têÔÕ\u0011Àgªé\u0000iêßÕ\u000bÀgªê\u0095\u0006\u0080Pj´U¦@H*\u008f\u0015ö\u00009êÐÕÞÀ-«\u007f\u0095±\u0080\u0001\u0000qêÔÕ\u000fÀfªê\u0095\u001d\u0080QjùUå@X*\u0083\u0015õ\u0000'ê\u0098Õ×À,\u0000qêÔÕ\u000fÀfªê\u0095\u0006\u0080@jùUî@X*\u0081\u0015þ\u0000\u0013ê\u009eÕÏÀ2«u\u0095³\u0080\u0013¼ÇVbi¹|Ð\u0016\\)°<öÖOéRüì\u00968©r¼\u009eV.iv|\u009a\u0017Ï)\u0003<½\u0000rêÞÕLÀxª¡\u0095\u0007\u0080Hj²Uä@\u0017*\u008b\u0015õ\u0000(ê\u008fÕÁÀ6«t\u0095ï\u0080\u0003kFU¹@ð+R\u0000rêÞÕLÀqª«\u0095\u001a\u0080RjùUù@\\*\u0087\u0015î\u0000bê\u009cÕØÀ;«O\u0095¯\u0080\u0013kNU±\u0000rêÞÕLÀ|ª \u0095\u0018\u0080\bjµUý@P*\u0086\u0015ÿ\u0000bê\u009bÕÇÀ1«w\u0095¤\u0080\u0000kSU¦@ì+X\u0015\u0093ä)\u000e\u00851\u0017$8NíqAd\u0019\u008eù±°¤\u0016Î\u009fñ¢äb\u000eÏ1\u0099$`Oeqüd@\u008f\u0016±è¤»Ï\u001fñÌä±\u000f{1Ï$\u0084\u0000rêÞÕLÀ`ª½\u0095\u0006\u0080Rj²Uå@\u0017*\u0088\u0015î\u0000%ê\u0091ÕÊÀq«v\u0095¨\u0080\u001ckDU±@÷+F\u0015\u0095\u0000ñë'Õ\u008e\u0000rêÞÕLÀ`ª½\u0095\u0006\u0080Rj²Uå@f*\u008f\u0015ã\u00008êÓÕÌÀ*«y\u0095\u00ad\u0080\u0016k\rU²@ì+X\u0015\u0080\u0000ýë;Õ\u008aÀÙ«5\u0096c\u0080Ê\u0000rêÞÕLÀeª¡\u0095\u001b\u0080Bj¸Uú@\u0017*\u0088\u0015î\u0000%ê\u0091ÕÊÀq«v\u0095¨\u0080\u001ckDU±@÷+F\u0015\u0095\u0000ñë'Õ\u008eÇ\u0086-*\u0012¸\u0007\u0091mURïG¶\u00adL\u0092\u000e\u0087\u0092ízÒ\u0003ÇÓ-d\u0012t\u0007Él\u0091R\\Gê¬³\u0092\u000e\u0087\u0017ì«Ò}Ç\u000b,Ø\u0012|\u0007/lÚQ\u0090G$¬ï|$\u0096\u0097©U¼\u001cÖîéXü\u0000\u0016¥)\u0085<\u000fVÄiº|j\u0096Ì\u00001ê\u0084ÕWÀ&ªñ\u0095G\u0080\u0017jâU½@\f*Þ¯XEíz>oO\u0005\u0098:./~Å\u008búÔïe\u0085µ\u00001ê\u0084ÕWÀ&ªñ\u0095G\u0080\u0017jâU½@\f*Ò\u00001ê\u0084ÕWÀ&ªñ\u0095G\u0080\u0017jâU½@\u000f*Úäü\u000eI1\u009a$ëN<q\u008adÚ\u008e/±p¤ÂÎ\u0015\u00001ê\u0084ÕWÀ&ªñ\u0095G\u0080\u0017jâU½@\u000f*ÞF¬¬\u0019\u0093Ê\u0086»ìlÓÚÆ\u008a,\u007f\u0013 \u0006\u0092lA\u00001ê\u0084ÕWÀ&ªñ\u0095G\u0080\u0017jâU½@\u000f*ÒÇÃ-v\u0012¥\u0007Ôm\u0003RµGå\u00ad\u0010\u0092O\u0087üí(\u00001ê\u0084ÕWÀ&ªñ\u0095G\u0080\u0017jâU½@\u000e*Ø\u00001ê\u0084ÕWÀ&ªñ\u0095G\u0080\u0017jâU½@\u000e*Þ\u00001ê\u0084ÕWÀ&ªñ\u0095G\u0080\u0017jâU½@\u000e*Ü\u00001ê\u0084ÕWÀ&ªñ\u0095G\u0080\u0017jâU½@\u000e*Ò\u0097_}êB9WH=\u009f\u0002)\u0017yý\u008cÂÓ×o½´ðÜ\u001ai%º0ËZ\u001ceªpú\u009a\u000f¥P°ìÚ5\u00001ê\u0084ÕWÀ&ªñ\u0095G\u0080\u0017jâU½@\u0001*Þ\u000f1å\u0082Ú@Ï\u000b¥÷\u009aW\u008f\u0007eîZ¬O\u0004%ó\u001a½\u000f\u007fåÙÚ\u0099Ï}¤)\u009aå\u008fjd\u0014ZïO¶\u001dN÷ÐÈ\tÝn·¤\u0088\u0013\u009dM\u0000gêÔÕ\u0016À@ª\u00ad\u0095\u0018\u0080uj²Uú@P*\u008b\u0015÷\u0000\u0002ê\u0088ÕÃÀ=«u\u0095³ðW\u001aç%=0MZ\u009fe+py\u009a\u008b¥Õ°gÚ´åÅð\u0012\u001aª%ô0\u0001[Oe\u0099p/\u009b|\u0000gêÔÕ\u0016À@ª±\u0095\u0017\u0080Uj´Uú@P*\u0088\u0015þ\u0000>ê´ÕÊ\u00003ê\u0080ÕRÀ!ªò\u0095E\u0080\u0016jçU¸@\t*Ú\u0015«\u0000|êÍÕ\u009ec¡\u0089\u0012¶Ð£\u0091ÉgöÅã\u0089\tr6+#¶IH\u00000ê\u0081ÕRÀ#ªô\u0095E\u0080\u0016jçU¸@\t*Ú\u0015«\u0000|êÍÕ\u009e°üZ\u001aeÊp²\u001an%ß0\u008dÚ}å$ðÂ\u009aE¥g°°Z\u0002e\u0006pö\u00000ê\u0080ÕPÀ ªð\u0095@\u0080\u0010jàU°@\u0000*Û\u0015©\u0000\u007fêÉÕ\u009b\u0000/êÁÕ\u0010À|ª§\u0095Z\u0080Oj¸Uø@V*\u0098\u0015ï\u0000?\u00000ê×Õ\u0004À3ªþ\u0000/êÁÕ\u0010À|ª§\u0095Z\u0080Uj²Uä@_*Å\u0015ö\u0000-ê\u008dÕÝ;ÌÑhî¨ûÔ\u0091\u0003®±»îQRnD{ý\u0011-.T;\u0081Ñ?îvû\u009c\u0090\u0095®\u0019»¶¹0S\u0084l\\y\b\u0013Ô,l9)ÓÔì¶ù\u0016\u0093Â¬é¹cSÎ\u0000/êÔÕ\u0016Àpªë\u0095\u0018\u0080Cj³Uá@X*µ\u0015ø\u0000#ê\u0099ÕËÀ<«c\u0095ï\u0080\nkNU¸\u0087îmQR\u009bGú-;\u0012\u008d\u0007Ëí8ÒoÇÆ\u0000/êÔÕ\u0016Àpªë\u0095\u0018\u0080Ij¢Uæ@M*\u0099\u0000/êÕÕ\u0003Àgª¥\u0095Z\u0080Bj¸Uÿ@W*\u0086\u0015ô\u0000-ê\u0099ÕÝÀp«>\u0095¥\u0080\u0002k\fUµ@õ+F\u0015\u0094\u0000¶ë1Õ\u0097ÀÇ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2045);
        getSDKInfo = cArr;
        onError = -7053506766836405583L;
    }

    private static HashMap<String, String> ThreeDS2ServiceInstance() {
        String[] split;
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            Object[] objArr = new Object[1];
            values((char) (Process.myTid() >> 22), 8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Color.argb(0, 0, 0, 0) + 1, objArr);
            String ThreeDS2ServiceInstance2 = configureScheme.ThreeDS2ServiceInstance((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            values((char) (61362 - (ViewConfiguration.getTapTimeout() >> 16)), 5 - KeyEvent.getDeadChar(0, 0), 7 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
            for (String str2 : ThreeDS2ServiceInstance2.split((String) objArr2[0])) {
                createTransaction = (onCompleted + 77) % 128;
                Object[] objArr3 = new Object[1];
                values((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.getCapsMode("", 0, 0) + 1, ImageFormat.getBitsPerPixel(0) + 14, objArr3);
                String replace = str2.replace((String) objArr3[0], "");
                Object[] objArr4 = new Object[1];
                values((char) (3759 - View.combineMeasuredStates(0, 0)), 1 - (KeyEvent.getMaxKeyCode() >> 16), MotionEvent.axisFromString("") + 15, objArr4);
                String replace2 = replace.replace((String) objArr4[0], "");
                Object[] objArr5 = new Object[1];
                values((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.normalizeMetaState(0) + 2, 15 - KeyEvent.normalizeMetaState(0), objArr5);
                String[] split2 = replace2.split((String) objArr5[0]);
                String str3 = split2[0];
                if (split2.length < 2) {
                    int i = onCompleted + 85;
                    createTransaction = i % 128;
                    if (i % 2 == 0) {
                        str = "";
                    } else {
                        throw null;
                    }
                } else {
                    str = split2[1];
                }
                hashMap.put(str3, str);
            }
        } catch (IOException unused) {
        }
        return hashMap;
    }

    private static int cleanup(int i) {
        int i2 = 0;
        while (true) {
            String[] strArr = values;
            if (i2 < strArr.length) {
                if (C9543l.m33351d(strArr[i2]) == 0) {
                    int i3 = i ^ (i2 + 252);
                    createTransaction = (onCompleted + 5) % 128;
                    return i3;
                }
                i2++;
                onCompleted = (createTransaction + 37) % 128;
            } else {
                return i;
            }
        }
    }

    private static encryptionPublicKey get(int i) {
        ArrayList arrayList = new ArrayList();
        HashMap<String, String> ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance();
        onCompleted = (createTransaction + 31) % 128;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            jcbConfiguration[] jcbconfigurationArr = initialize;
            if (i3 >= jcbconfigurationArr.length) {
                break;
            }
            createTransaction = (onCompleted + 61) % 128;
            jcbConfiguration jcbconfiguration = jcbconfigurationArr[i3];
            String str = jcbconfiguration.valueOf;
            String[] strArr = jcbconfiguration.ThreeDS2Service;
            String m33350e = C9572m.m33350e(str);
            boolean valueOf2 = valueOf(m33350e, strArr);
            String str2 = ThreeDS2ServiceInstance2.get(str);
            boolean valueOf3 = valueOf(str2, strArr);
            if (valueOf2) {
                onCompleted = (createTransaction + 91) % 128;
            } else if (!valueOf3) {
                m33350e = "";
            } else {
                m33350e = str2;
            }
            if (!TextUtils.isEmpty(m33350e)) {
                i2 = (i3 + 10) ^ i;
                i4++;
                StringBuilder sb = new StringBuilder();
                sb.append(jcbconfigurationArr[i3].valueOf);
                Object[] objArr = new Object[1];
                values((char) (TextUtils.getTrimmedLength("") + 41549), '1' - AndroidCharacter.getMirror('0'), AndroidCharacter.getMirror('0') - '0', objArr);
                sb.append((String) objArr[0]);
                sb.append(m33350e);
                arrayList.add(sb.toString());
            }
            i3++;
        }
        if (i4 > 2) {
            return new encryptionPublicKey(i, i2, arrayList, null);
        }
        return new encryptionPublicKey(i, i, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:
        return r6 ^ 263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.cbConfiguration.createTransaction + 59;
        com.netcetera.threeds.sdk.infrastructure.cbConfiguration.onCompleted = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
        if ((r0 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9543l.m33351d(((java.lang.String) r1[0]).intern()) == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0061, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9543l.m33351d(((java.lang.String) r1[0]).intern()) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int getSDKInfo(int r6) {
        /*
            int r0 = com.netcetera.threeds.sdk.infrastructure.cbConfiguration.createTransaction
            int r0 = r0 + 31
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.cbConfiguration.onCompleted = r1
            int r0 = r0 % 2
            r1 = 1
            java.lang.String r2 = ""
            r3 = 0
            if (r0 != 0) goto L3b
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            int r0 = r0 << 20
            char r0 = (char) r0
            int r4 = android.graphics.Color.alpha(r3)
            int r4 = 38 - r4
            r5 = 67
            int r2 = android.text.TextUtils.indexOf(r2, r5)
            r5 = 25774(0x64ae, float:3.6117E-41)
            int r2 = r5 >>> r2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            values(r0, r4, r2, r1)
            r0 = r1[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9543l.m33351d(r0)
            if (r0 != 0) goto L66
            goto L63
        L3b:
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            int r0 = r0 >> 16
            char r0 = (char) r0
            int r4 = android.graphics.Color.alpha(r3)
            int r4 = r4 + 47
            r5 = 48
            int r2 = android.text.TextUtils.indexOf(r2, r5)
            int r2 = 182 - r2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            values(r0, r4, r2, r1)
            r0 = r1[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9543l.m33351d(r0)
            if (r0 != 0) goto L66
        L63:
            r6 = r6 ^ 263(0x107, float:3.69E-43)
            return r6
        L66:
            int r0 = com.netcetera.threeds.sdk.infrastructure.cbConfiguration.createTransaction
            int r0 = r0 + 59
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.cbConfiguration.onCompleted = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L73
            return r6
        L73:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.cbConfiguration.getSDKInfo(int):int");
    }

    private static int getSDKVersion(int i) {
        createTransaction = (onCompleted + 75) % 128;
        Object[] objArr = new Object[1];
        values((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22568), (KeyEvent.getMaxKeyCode() >> 16) + 17, MotionEvent.axisFromString("") + 133, objArr);
        Object[] objArr2 = new Object[1];
        values((char) (AndroidCharacter.getMirror('0') - '0'), TextUtils.indexOf((CharSequence) "", '0') + 7, (ViewConfiguration.getLongPressTimeout() >> 16) + 149, objArr2);
        if (C9434h.m33356b((String) objArr[0], (String) objArr2[0]) == 1) {
            int i2 = i ^ 251;
            createTransaction = (onCompleted + 19) % 128;
            return i2;
        }
        onCompleted = (createTransaction + 79) % 128;
        return i;
    }

    private static int getWarnings(int i) {
        createTransaction = (onCompleted + 99) % 128;
        Object[] objArr = new Object[1];
        values((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 22569), ExpandableListView.getPackedPositionGroup(0L) + 17, 132 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        Object[] objArr2 = new Object[1];
        values((char) (29177 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (Process.myPid() >> 22) + 6, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 155, objArr2);
        if (C9434h.m33356b((String) objArr[0], (String) objArr2[0]) == 1) {
            onCompleted = (createTransaction + 47) % 128;
            return i ^ 260;
        }
        Object[] objArr3 = new Object[1];
        values((char) TextUtils.indexOf("", ""), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, 161 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
        Object[] objArr4 = new Object[1];
        values((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 9 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 174 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr4);
        if (C9434h.m33356b((String) objArr3[0], (String) objArr4[0]) == 1) {
            return i ^ 261;
        }
        return i;
    }

    private static int initialize(int i) {
        Object[] objArr = new Object[1];
        values((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), Color.alpha(0) + 13, ExpandableListView.getPackedPositionGroup(0L) + 110, objArr);
        String m33350e = C9572m.m33350e((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        values((char) (TextUtils.lastIndexOf("", '0') + 27167), 9 - Color.blue(0), TextUtils.indexOf("", "", 0, 0) + CameraActivity.REQUEST_CODE, objArr2);
        if (m33350e.contains((String) objArr2[0])) {
            createTransaction = (onCompleted + 71) % 128;
            return i ^ ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
        }
        onCompleted = (createTransaction + 37) % 128;
        return i;
    }

    private static boolean valueOf(String str, String[] strArr) {
        int i = (createTransaction + CameraActivity.REQUEST_CODE) % 128;
        onCompleted = i;
        if (str == null) {
            return false;
        }
        if (strArr == null) {
            createTransaction = (i + 35) % 128;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            createTransaction = (onCompleted + 31) % 128;
            return true;
        } else if (getSchemePublicRootKeys.get(str, strArr) != 0) {
            int i2 = (onCompleted + 33) % 128;
            createTransaction = i2;
            onCompleted = (i2 + 45) % 128;
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9599n.m33349b(((java.lang.String) r9[0]).intern()) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9599n.m33349b(((java.lang.String) r10[0]).intern()) != 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9599n.m33349b(((java.lang.String) r9[0]).intern()) == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.netcetera.threeds.sdk.infrastructure.encryptionPublicKey values(int r17) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.cbConfiguration.values(int):com.netcetera.threeds.sdk.infrastructure.encryptionPublicKey");
    }

    private static int ThreeDS2Service(int i) {
        createTransaction = (onCompleted + 23) % 128;
        try {
            Object[] objArr = new Object[1];
            values((char) (Color.rgb(0, 0, 0) + 16787946), 13 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 89, objArr);
            Object[] objArr2 = new Object[1];
            values((char) (ExpandableListView.getPackedPositionChild(0L) + 1), ExpandableListView.getPackedPositionType(0L) + 8, 102 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
            if (C9434h.m33356b((String) objArr[0], (String) objArr2[0]) == 1) {
                return i ^ SyslogConstants.LOG_LOCAL4;
            }
            createTransaction = (onCompleted + 99) % 128;
            return i;
        } catch (Exception unused) {
            return i ^ 161;
        }
    }

    public static int ThreeDS2Service(Context context, int i) {
        createTransaction = (onCompleted + 117) % 128;
        int valueOf2 = valueOf(context, i, 0);
        onCompleted = (createTransaction + 9) % 128;
        return valueOf2;
    }

    private static int valueOf(int i) {
        int m33348a = C9648o.m33348a();
        if (m33348a <= 0) {
            createTransaction = (onCompleted + 25) % 128;
            return i;
        }
        int i2 = i ^ (m33348a + MapLocation.REQUEST_LOCATION);
        int i3 = onCompleted + 51;
        createTransaction = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    public static int valueOf(Context context, int i, int i2) {
        createTransaction = (onCompleted + 23) % 128;
        int i3 = ThreeDS2ServiceInstance(context, i, i2).get();
        createTransaction = (onCompleted + 53) % 128;
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int ThreeDS2ServiceInstance(int r7) {
        /*
            int r0 = com.netcetera.threeds.sdk.infrastructure.cbConfiguration.onCompleted
            int r0 = r0 + 89
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.cbConfiguration.createTransaction = r0
            r0 = -1
            r1 = 0
            r2 = 0
        Lb:
            com.netcetera.threeds.sdk.infrastructure.jcbConfiguration[] r3 = com.netcetera.threeds.sdk.infrastructure.cbConfiguration.cleanup
            int r3 = r3.length
            if (r2 >= r3) goto L4a
            int r3 = com.netcetera.threeds.sdk.infrastructure.cbConfiguration.onCompleted
            int r3 = r3 + 105
            int r3 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.cbConfiguration.createTransaction = r3
            r3 = 0
        L19:
            com.netcetera.threeds.sdk.infrastructure.jcbConfiguration[] r4 = com.netcetera.threeds.sdk.infrastructure.cbConfiguration.cleanup
            r4 = r4[r2]
            java.lang.String[] r5 = r4.ThreeDS2Service
            int r6 = r5.length
            if (r3 >= r6) goto L47
            int r6 = com.netcetera.threeds.sdk.infrastructure.cbConfiguration.onCompleted
            int r6 = r6 + 61
            int r6 = r6 % 128
            com.netcetera.threeds.sdk.infrastructure.cbConfiguration.createTransaction = r6
            int r6 = r0 + 1
            java.lang.String r4 = r4.valueOf
            r5 = r5[r3]
            int r4 = com.netcetera.threeds.sdk.infrastructure.C9434h.m33356b(r4, r5)
            r5 = 1
            if (r4 != r5) goto L43
            int r1 = com.netcetera.threeds.sdk.infrastructure.cbConfiguration.createTransaction
            int r1 = r1 + 33
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.cbConfiguration.onCompleted = r1
            int r0 = r0 + 171
            r7 = r7 ^ r0
            return r7
        L43:
            int r3 = r3 + 1
            r0 = r6
            goto L19
        L47:
            int r2 = r2 + 1
            goto Lb
        L4a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.cbConfiguration.ThreeDS2ServiceInstance(int):int");
    }

    private static int values() {
        onCompleted = (createTransaction + 73) % 128;
        int i = 0;
        while (true) {
            String[] strArr = getWarnings;
            if (i >= strArr.length) {
                return -1;
            }
            if (C9543l.m33352a(strArr[i]) == 0) {
                createTransaction = (onCompleted + 103) % 128;
                return i;
            }
            i++;
            onCompleted = (createTransaction + 113) % 128;
        }
    }

    public static encryptionPublicKey ThreeDS2ServiceInstance(Context context, int i, int i2) {
        int valueOf2;
        encryptionPublicKey encryptionpublickey;
        int i3;
        int values2;
        int i4 = onCompleted + 87;
        createTransaction = i4 % 128;
        if (i4 % 2 == 0 ? (valueOf2 = valueOf(i)) != i : (valueOf2 = valueOf(i)) != i) {
            return new encryptionPublicKey(i, valueOf2, null, null);
        }
        Object[] objArr = new Object[1];
        values((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16777236, 230 - Color.alpha(0), objArr);
        Object[] objArr2 = new Object[1];
        values((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 6 - ExpandableListView.getPackedPositionType(0L), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, objArr2);
        if (C9434h.valueOf((String) objArr[0], (String) objArr2[0]) != 0) {
            return new encryptionPublicKey(i, i ^ 262, null, null);
        }
        int cleanup2 = cleanup(i);
        if (cleanup2 != i) {
            return new encryptionPublicKey(i, cleanup2, null, null);
        }
        int initialize2 = initialize(i);
        if (initialize2 != i) {
            return new encryptionPublicKey(i, initialize2, null, null);
        }
        int sDKVersion = getSDKVersion(i);
        if (sDKVersion != i) {
            return new encryptionPublicKey(i, sDKVersion, null, null);
        }
        if (C9251b.m33362e() > 0) {
            return new encryptionPublicKey(i, i, null, null);
        }
        Object[] objArr3 = new Object[1];
        values((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 26668), Gravity.getAbsoluteGravity(0, 0) + 23, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 256, objArr3);
        String m33350e = C9572m.m33350e((String) objArr3[0]);
        if ((m33350e == null || C9392g.m33357b(m33350e, 42) != 1986687685) && (i3 = (encryptionpublickey = get(i)).get()) != i) {
            return new encryptionPublicKey(i, i3, encryptionpublickey.values(), null);
        }
        encryptionPublicKey values3 = values(i);
        int i5 = values3.get();
        if (i5 != i) {
            return new encryptionPublicKey(i, i5, null, values3.ThreeDS2Service());
        }
        Object[] objArr4 = new Object[1];
        values((char) ((Process.getThreadPriority(0) + 20) >> 6), 16 - Color.blue(0), 279 - Drawable.resolveOpacity(0, 0), objArr4);
        String m33350e2 = C9572m.m33350e((String) objArr4[0]);
        int m33357b = m33350e2 != null ? C9392g.m33357b(m33350e2, 42) : 0;
        if (m33357b != 1986687685 && m33357b != -1514516938 && (values2 = values()) >= 0) {
            onCompleted = (createTransaction + 95) % 128;
            int i6 = (values2 + BuildConfig.VERSION_CODE) ^ i;
            if (i6 != i) {
                encryptionPublicKey encryptionpublickey2 = new encryptionPublicKey(i, i6, null, null);
                createTransaction = (onCompleted + 55) % 128;
                return encryptionpublickey2;
            }
        }
        int ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(i);
        if (ThreeDS2ServiceInstance2 != i) {
            return new encryptionPublicKey(i, ThreeDS2ServiceInstance2, null, null);
        }
        int ThreeDS2Service2 = ThreeDS2Service(i);
        if (ThreeDS2Service2 != i) {
            return new encryptionPublicKey(i, ThreeDS2Service2, null, null);
        }
        int warnings = getWarnings(i);
        if (warnings != i) {
            return new encryptionPublicKey(i, warnings, null, null);
        }
        int sDKInfo = getSDKInfo(i);
        if (sDKInfo != i) {
            return new encryptionPublicKey(i, sDKInfo, null, null);
        }
        return new encryptionPublicKey(i, sDKInfo, null, null);
    }

    private static void values(char c, int i, int i2, Object[] objArr) {
        String str;
        synchronized (SchemeConfiguration.Builder.valueOf) {
            try {
                char[] cArr = new char[i];
                SchemeConfiguration.Builder.values = 0;
                while (true) {
                    int i3 = SchemeConfiguration.Builder.values;
                    if (i3 < i) {
                        cArr[i3] = (char) ((getSDKInfo[i2 + i3] ^ (i3 * onError)) ^ c);
                        SchemeConfiguration.Builder.values = i3 + 1;
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