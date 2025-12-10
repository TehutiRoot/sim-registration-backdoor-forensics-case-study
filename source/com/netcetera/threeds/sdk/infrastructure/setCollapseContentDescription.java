package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.infrastructure.setNavigationIcon;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class setCollapseContentDescription {
    private static int ConfigParameters = 0;
    public static char ThreeDS2Service = 36609;
    public static char ThreeDS2ServiceInstance = 20237;
    public static char[] get = {13816, 13801, 13814, 13806, 13824, 13817, 13811, 13775, 13800, 13778, 13769, 13802, 13815, 13820, 13782, 13774, 13772, 13807, 13822, 13785, 13790, 13794, 13819, 13787, 13812, 13821, 13809, 13804, 13813, 13779, 13810, 13805, 13823, 13783, 13818, 13795};
    public static char getSDKInfo = 6119;
    private static int onError = 1;
    public static char valueOf = 6;
    public static char values = 41749;
    private final setOverflowIcon cleanup;
    private final setSubtitleTextColor<setTitleMargin, C9651nr> getSDKVersion;
    private final setSubtitleTextColor<String, String> getWarnings;
    private final InterfaceC9498jb initialize;

    public setCollapseContentDescription(setSubtitleTextColor<setTitleMargin, C9651nr> setsubtitletextcolor, InterfaceC9498jb interfaceC9498jb, setOverflowIcon setoverflowicon, setNavigationContentDescription setnavigationcontentdescription) {
        this.getSDKVersion = setsubtitletextcolor;
        this.initialize = interfaceC9498jb;
        this.cleanup = setoverflowicon;
        this.getWarnings = setnavigationcontentdescription;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r11 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(int r10, java.lang.String r11, byte r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setCollapseContentDescription.valueOf(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    private void values(C9651nr c9651nr, setNavigationIcon.valueOf valueof) {
        onError = (ConfigParameters + 23) % 128;
        InterfaceC9498jb interfaceC9498jb = this.initialize;
        Object[] objArr = new Object[1];
        values("헑뷄䓜䀖䍐띟졖㩗◱ꚑᵠ릏᳜墸瘇阝", View.resolveSize(0, 0) + 16, objArr);
        List<setCustomSelectionActionModeCallback> ThreeDS2Service2 = interfaceC9498jb.ThreeDS2Service(c9651nr.cleanup(((String) objArr[0]).intern()));
        valueof.ThreeDS2Service(ThreeDS2Service2);
        this.initialize.valueOf(valueof, values(), ThreeDS2Service2);
        ConfigParameters = (onError + 99) % 128;
    }

    public abstract void ThreeDS2Service(C9651nr c9651nr, setNavigationIcon.valueOf valueof);

    public setSubtitleTextColor<String, String> ThreeDS2ServiceInstance() {
        int i = onError + 103;
        int i2 = i % 128;
        ConfigParameters = i2;
        int i3 = i % 2;
        if (i3 == 0) {
            setSubtitleTextColor<String, String> setsubtitletextcolor = this.getWarnings;
            ConfigParameters = i2;
            if (i3 != 0) {
                int i4 = 43 / 0;
            }
            return setsubtitletextcolor;
        }
        throw null;
    }

    public final setTitleTextColor get(C9651nr c9651nr) {
        setNavigationIcon.valueOf valueof = new setNavigationIcon.valueOf();
        Object[] objArr = new Object[1];
        valueOf(10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0017\u0004\u0003\r\n\u0014\u0019\u0000\u001a\u0017", (byte) (98 - View.MeasureSpec.getSize(0)), objArr);
        valueof.getParamValue(c9651nr.values(((String) objArr[0]).intern()));
        Object[] objArr2 = new Object[1];
        valueOf(Color.green(0) + 10, "\u0000\u0013\u001b\u000e\n\u0014\u0019\u0000\u001a\u0017", (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 53), objArr2);
        valueof.ConfigurationBuilder(c9651nr.values(((String) objArr2[0]).intern()));
        Object[] objArr3 = new Object[1];
        valueOf(20 - Color.green(0), "\u0000!\u000e\u0002\u0002\u001a㗯㗯\u0002\u000e\u001a!\t\u000e\n\u0014\u0019\u0000\u001a\u0017", (byte) (37 - MotionEvent.axisFromString("")), objArr3);
        valueof.addParam(c9651nr.values(((String) objArr3[0]).intern()));
        Object[] objArr4 = new Object[1];
        valueOf(9 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0013\u0000\u000e\t\u0012\u001c\u0005\u0019㘓", (byte) (52 - TextUtils.lastIndexOf("", '0', 0)), objArr4);
        valueof.removeParam(c9651nr.values(((String) objArr4[0]).intern()));
        Object[] objArr5 = new Object[1];
        valueOf((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15, "\u0002\u000e\n\u001a\u000e\u001a\u001f\u0002\u0002\u000b\u0007\u0006\u0000\t\u001d\u0019", (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 76), objArr5);
        valueof.apiKey(c9651nr.values(((String) objArr5[0]).intern()));
        Object[] objArr6 = new Object[1];
        values("\udf8aź嗚헩ሀ䑀萒\uebde줜톣鳄ﺠ", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, objArr6);
        valueof.build(c9651nr.values(((String) objArr6[0]).intern()));
        Object[] objArr7 = new Object[1];
        valueOf(20 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0000#\u0014\u0004\b\u0002\u0019\u001a#\u001a\u0019\f\u001b\n\"\u0014\u0014\u001e㘫", (byte) (67 - (ViewConfiguration.getFadingEdgeLength() >> 16)), objArr7);
        valueof.values(c9651nr.values(((String) objArr7[0]).intern()));
        Object[] objArr8 = new Object[1];
        valueOf((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, "\u0000#\u0014\u0004\b\u0002\u0019\u001a#\u001a\u0019\f\u001a\u0010\u0012\u0004\u0002\b", (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 107), objArr8);
        valueof.ThreeDS2ServiceInstance(c9651nr.values(((String) objArr8[0]).intern()));
        Object[] objArr9 = new Object[1];
        values("ꇑ픍ᦨ㖶煬\udf20剹ѥꖬ\ue819ٔ伍럩\ue85f뜈訅⻩\ue1ec", 17 - (KeyEvent.getMaxKeyCode() >> 16), objArr9);
        valueof.getSDKInfo(c9651nr.values(((String) objArr9[0]).intern()));
        Object[] objArr10 = new Object[1];
        valueOf(14 - TextUtils.lastIndexOf("", '0', 0), "!\u0014\n\u0017\u001e\u0018\u0018\u0019\u0010\u0019\u0010\u0014\u0002\u001e㘓", (byte) (28 - ImageFormat.getBitsPerPixel(0)), objArr10);
        valueof.initialize(c9651nr.values(((String) objArr10[0]).intern()));
        Object[] objArr11 = new Object[1];
        values("뜈訅淶䓋襄ሡ欟䅫ꂄﾲᅔ䆏◱ꚑ", 14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr11);
        valueof.getWarnings(c9651nr.values(((String) objArr11[0]).intern()));
        Object[] objArr12 = new Object[1];
        valueOf(ExpandableListView.getPackedPositionGroup(0L) + 16, "㙟㙟\u0001\u0012\u001d\u0019\u0000\t\u001d\f\u0002\u0014\u0012\u0004\u0002\b", (byte) (106 - View.MeasureSpec.getMode(0)), objArr12);
        valueof.onError(c9651nr.values(((String) objArr12[0]).intern()));
        Object[] objArr13 = new Object[1];
        valueOf(22 - View.MeasureSpec.getSize(0), "\u000e\u0002\u0002\u001f\u001e\u0018\u0018\u0019\u0010\u0019\u0006\u000e\u0015\u0004\n\u0018\u001a\f\u0012\u0004\u0002\b", (byte) ((-16777148) - Color.rgb(0, 0, 0)), objArr13);
        valueof.ThreeDS2Service$InitializationCallback(c9651nr.values(((String) objArr13[0]).intern()));
        Object[] objArr14 = new Object[1];
        valueOf(25 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0005\r\u0006\u0012\t\u0000\u001d\u0017\u0000!\u001e\u001a\u0000\t\u0004\u0017\u0000\t\u001d\u0019\u0010\u0014\u0002\u001e㙗", (byte) (96 - MotionEvent.axisFromString("")), objArr14);
        valueof.createTransaction(c9651nr.values(((String) objArr14[0]).intern()));
        Object[] objArr15 = new Object[1];
        valueOf(TextUtils.lastIndexOf("", '0', 0, 0) + 13, " \u001f\u0005#\u0019\f\u001a\u0010\u0012\u0004\u0002\b", (byte) (45 - View.combineMeasuredStates(0, 0)), objArr15);
        valueof.onCompleted(c9651nr.values(((String) objArr15[0]).intern()));
        Object[] objArr16 = new Object[1];
        values("աﵿ擉點ٔ伍럩\ue85f뜈訅⻩\ue1ec", View.MeasureSpec.getSize(0) + 11, objArr16);
        valueof.ConfigParameters(c9651nr.values(((String) objArr16[0]).intern()));
        Object[] objArr17 = new Object[1];
        values("ⓙ鵊\ue31d传憚ꔟ㛐朅\udf8aź贖蹾띖\ue64a", 13 - TextUtils.lastIndexOf("", '0'), objArr17);
        valueof.ThreeDS2ServiceInstance(c9651nr.ThreeDS2ServiceInstance(((String) objArr17[0]).intern()));
        setSubtitleTextColor<String, String> setsubtitletextcolor = this.getWarnings;
        Object[] objArr18 = new Object[1];
        valueOf(7 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0017\u0004\u0003\u0007\u0015\u0003㗟", (byte) (9 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr18);
        valueof.get(setsubtitletextcolor.valueOf(c9651nr.values(((String) objArr18[0]).intern())));
        Object[] objArr19 = new Object[1];
        valueOf((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15, "\u000e\u001e㗿㗿\u0013\u001c\"\u000e\u0002\u000e\u0000\u0007\u001d\u0019", (byte) (KeyEvent.getDeadChar(0, 0) + 22), objArr19);
        valueof.valueOf((put) c9651nr.ThreeDS2ServiceInstance(((String) objArr19[0]).intern(), put.class));
        Object[] objArr20 = new Object[1];
        valueOf(12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u000e\u001e㘿㘿\u0013\u001c!\u000e\u0005\u0011㙕", (byte) (View.getDefaultSize(0, 0) + 86), objArr20);
        valueof.valueOf((keySet) c9651nr.ThreeDS2ServiceInstance(((String) objArr20[0]).intern(), keySet.class));
        Object[] objArr21 = new Object[1];
        values("\udf8aź嗚헩챳\uf4d9\udb46שּ\udd2d㆛⤧꺏㛐朅", 14 - TextUtils.getOffsetAfter("", 0), objArr21);
        valueof.valueOf((remove) c9651nr.ThreeDS2ServiceInstance(((String) objArr21[0]).intern(), remove.class));
        Object[] objArr22 = new Object[1];
        values("\udf8aź嗚헩餓닽\udc12㱋♏쪔⎤鳢ኯꓟ倧ꗵ", 16 - (Process.myPid() >> 22), objArr22);
        valueof.ThreeDS2Service((keySet) c9651nr.ThreeDS2ServiceInstance(((String) objArr22[0]).intern(), keySet.class));
        Object[] objArr23 = new Object[1];
        valueOf((ViewConfiguration.getTapTimeout() >> 16) + 9, "\u0002\u000e\n\u001a\u0007\u0014\u0018\u0016㘵", (byte) ((Process.myTid() >> 22) + 54), objArr23);
        valueof.valueOf((entrySet) c9651nr.ThreeDS2ServiceInstance(((String) objArr23[0]).intern(), entrySet.class));
        Object[] objArr24 = new Object[1];
        values("ꇑ픍ᦨ㖶煬\udf20剹ѥꖬ\ue819ٔ伍럩\ue85f뜈訅\uf49eﵦ襄ሡ\udc18筱ᱝ靠ꏖ횯", 26 - View.getDefaultSize(0, 0), objArr24);
        valueof.ThreeDS2ServiceInstance((getVersion) c9651nr.ThreeDS2ServiceInstance(((String) objArr24[0]).intern(), getVersion.class));
        Object[] objArr25 = new Object[1];
        valueOf(View.combineMeasuredStates(0, 0) + 9, "\u0017\u0004\u0007\r\t\f\u0005\u0011㘱", (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 50), objArr25);
        valueof.valueOf((getLocalizedMessage) c9651nr.ThreeDS2ServiceInstance(((String) objArr25[0]).intern(), getLocalizedMessage.class));
        Object[] objArr26 = new Object[1];
        valueOf(11 - Color.blue(0), "\u0002\t\u0012\u001c\u0004\u0007\u0004\u0015\u0005\u000f㘼", (byte) (83 - (ViewConfiguration.getTapTimeout() >> 16)), objArr26);
        valueof.get((replace) c9651nr.ThreeDS2ServiceInstance(((String) objArr26[0]).intern(), replace.class));
        Object[] objArr27 = new Object[1];
        values("ꇑ픍ᦨ㖶煬\udf20剹ѥᨘ蘱\udb46שּ뼾幻萒\uebde⫣聇套孨襄ሡ", TextUtils.indexOf((CharSequence) "", '0') + 23, objArr27);
        valueof.values((getSuppressed) c9651nr.ThreeDS2ServiceInstance(((String) objArr27[0]).intern(), getSuppressed.class));
        setSubtitleTextColor<setTitleMargin, C9651nr> setsubtitletextcolor2 = this.getSDKVersion;
        Object[] objArr28 = new Object[1];
        valueOf(7 - (ViewConfiguration.getJumpTapTimeout() >> 16), "\u0007\u0005\u0018\u0011\u0013\u001c㙅", (byte) (70 - Gravity.getAbsoluteGravity(0, 0)), objArr28);
        valueof.ThreeDS2ServiceInstance(setsubtitletextcolor2.valueOf(c9651nr.getSDKVersion(((String) objArr28[0]).intern())));
        setSubtitleTextColor<setTitleMargin, C9651nr> setsubtitletextcolor3 = this.getSDKVersion;
        Object[] objArr29 = new Object[1];
        valueOf((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11, "\u0007\u0000\u0005\r\u0002\u000e\u0018\u0011\u0013\u001c㙪", (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 106), objArr29);
        valueof.ThreeDS2Service(setsubtitletextcolor3.valueOf(c9651nr.getSDKVersion(((String) objArr29[0]).intern())));
        setOverflowIcon setoverflowicon = this.cleanup;
        Object[] objArr30 = new Object[1];
        valueOf(19 - (ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0000#\u0014\u0004\b\u0002\u0019\u001a\"\b\u0002\b#\u0002\u0005\u001b\u0019\f㙦", (byte) (113 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr30);
        valueof.get(setoverflowicon.ThreeDS2ServiceInstance(c9651nr.cleanup(((String) objArr30[0]).intern())));
        values(c9651nr, valueof);
        ThreeDS2Service(c9651nr, valueof);
        setTitleTextColor ThreeDS2ServiceInstance2 = valueof.ThreeDS2ServiceInstance();
        int i = onError + 63;
        ConfigParameters = i % 128;
        if (i % 2 != 0) {
            int i2 = 95 / 0;
        }
        return ThreeDS2ServiceInstance2;
    }

    public abstract put values();

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void values(java.lang.String r12, int r13, java.lang.Object[] r14) {
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
            char r11 = com.netcetera.threeds.sdk.infrastructure.setCollapseContentDescription.ThreeDS2Service     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r10 = r8 >>> 5
            char r11 = com.netcetera.threeds.sdk.infrastructure.setCollapseContentDescription.getSDKInfo     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 - r9
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
            r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
            int r9 = r7 + r4
            int r10 = r7 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.setCollapseContentDescription.values     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 >>> 5
            char r10 = com.netcetera.threeds.sdk.infrastructure.setCollapseContentDescription.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L5b
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setCollapseContentDescription.values(java.lang.String, int, java.lang.Object[]):void");
    }
}
