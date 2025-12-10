package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setNavigationIcon;
import com.netcetera.threeds.sdk.infrastructure.setTitleMarginEnd;
import com.netcetera.threeds.sdk.infrastructure.wait;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.jg */
/* loaded from: classes5.dex */
public class C9503jg implements setSubtitleTextColor<setCustomSelectionActionModeCallback, C9651nr> {
    private static int ThreeDS2Service = 0;
    public static int get = 186;
    private static int valueOf = 1;
    private setTitleMarginEnd.ThreeDS2Service ThreeDS2ServiceInstance = setTitleMarginEnd.ThreeDS2Service.ThreeDS2Service;

    public void ThreeDS2Service(setTitleMarginEnd.ThreeDS2Service threeDS2Service) {
        int i = valueOf;
        this.ThreeDS2ServiceInstance = threeDS2Service;
        int i2 = i + 77;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        throw null;
    }

    public void ThreeDS2ServiceInstance(setNavigationIcon.valueOf valueof, put putVar, List<setCustomSelectionActionModeCallback> list) {
        if (list != null) {
            Iterator<setCustomSelectionActionModeCallback> it = list.iterator();
            while (!(!it.hasNext())) {
                setCustomSelectionActionModeCallback next = it.next();
                if (put.ThreeDS2ServiceInstance.equals(putVar) && !(!(next instanceof setTitleMarginEnd))) {
                    int i = valueOf + 47;
                    ThreeDS2Service = i % 128;
                    if (i % 2 == 0) {
                        setTitleMarginEnd settitlemarginend = (setTitleMarginEnd) next;
                        if (settitlemarginend.getSDKInfo() != null && !settitlemarginend.getSDKInfo().equals(setTitleMarginEnd.ThreeDS2Service.ThreeDS2Service) && settitlemarginend.getSDKInfo().equals(this.ThreeDS2ServiceInstance)) {
                            int i2 = ThreeDS2Service + 99;
                            valueOf = i2 % 128;
                            if (i2 % 2 == 0) {
                                valueof.getSDKVersion(settitlemarginend.values().values());
                                valueof.cleanup(settitlemarginend.values().valueOf());
                                valueof.values(settitlemarginend.values().getSDKVersion());
                                int i3 = 22 / 0;
                            } else {
                                valueof.getSDKVersion(settitlemarginend.values().values());
                                valueof.cleanup(settitlemarginend.values().valueOf());
                                valueof.values(settitlemarginend.values().getSDKVersion());
                            }
                            ThreeDS2Service = (valueOf + 115) % 128;
                            return;
                        }
                    } else {
                        ((setTitleMarginEnd) next).getSDKInfo();
                        throw null;
                    }
                }
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitleTextColor
    public /* synthetic */ setCustomSelectionActionModeCallback valueOf(C9651nr c9651nr) {
        int i = ThreeDS2Service + 17;
        valueOf = i % 128;
        C9651nr c9651nr2 = c9651nr;
        if (i % 2 != 0) {
            return values(c9651nr2);
        }
        values(c9651nr2);
        throw null;
    }

    public setCustomSelectionActionModeCallback values(C9651nr c9651nr) {
        ThreeDS2Service = (valueOf + 107) % 128;
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance((ViewConfiguration.getWindowTouchSlop() >> 8) + 4, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19, "\ufff8\u000b\u0006\t\ufffa\t\u0000\u000b\u0000\ufffa\ufff8\u0003\u0000\u000b\u0010￠\u0005\ufffb\u0000\ufffa", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 291, false, objArr);
        Boolean sDKInfo = c9651nr.getSDKInfo(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance((ViewConfiguration.getTapTimeout() >> 16) + 1, 4 - View.MeasureSpec.getMode(0), "\ufffe\ufffb\u000e\ufffb", 288 - TextUtils.getOffsetBefore("", 0), true, objArr2);
        String values = c9651nr.values(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        ThreeDS2ServiceInstance(Drawable.resolveOpacity(0, 0) + 2, 2 - TextUtils.getOffsetAfter("", 0), "\u0003\ufffe", 288 - TextUtils.indexOf("", "", 0), false, objArr3);
        String values2 = c9651nr.values(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        ThreeDS2ServiceInstance(TextUtils.getOffsetAfter("", 0) + 2, 3 - TextUtils.lastIndexOf("", '0'), "\ufff9\u0006�\u0005", 289 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), true, objArr4);
        String values3 = c9651nr.values(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        ThreeDS2ServiceInstance(TextUtils.getTrimmedLength("") + 8, 14 - KeyEvent.normalizeMetaState(0), "\ufffe\u0006\ufffe\u0000\ufffb\ufffe\ufffe\u0002\u000f\ufffe\ufffe\ufffe\ufffe\ufffe", 236 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), false, objArr5);
        if (((String) objArr5[0]).intern().equalsIgnoreCase(values2)) {
            setTitleMarginEnd settitlemarginend = new setTitleMarginEnd(sDKInfo, values, values3);
            if (C9669om.ThreeDS2ServiceInstance(values)) {
                C9651nr c9651nr2 = C9651nr.get(values);
                setTitleMarginEnd.ThreeDS2Service threeDS2Service = setTitleMarginEnd.ThreeDS2Service.get(c9651nr2.values(wait.values.cleanup));
                if (!threeDS2Service.equals(setTitleMarginEnd.ThreeDS2Service.ThreeDS2Service)) {
                    if (threeDS2Service.equals(this.ThreeDS2ServiceInstance)) {
                        Object[] objArr6 = new Object[1];
                        ThreeDS2ServiceInstance(8 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13, "\n\u0003\u0001￠�\u0010�\uffff\u0004�\b\b\u0001", 286 - (Process.myTid() >> 22), false, objArr6);
                        C9651nr sDKVersion = c9651nr2.getSDKVersion(((String) objArr6[0]).intern());
                        setTitleMarginEnd.values valuesVar = new setTitleMarginEnd.values();
                        Object[] objArr7 = new Object[1];
                        ThreeDS2ServiceInstance(View.MeasureSpec.getSize(0) + 3, (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, "\uffff\u0002\t\f\f\uffff\uffde\r\r￩\ufffe", 285 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), false, objArr7);
                        valuesVar.values(sDKVersion.values(((String) objArr7[0]).intern()));
                        Object[] objArr8 = new Object[1];
                        ThreeDS2ServiceInstance(7 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9, "\u0004￣\u0012\u0012\ufff7\ufff4￮\u0011\u0011", 281 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), false, objArr8);
                        valuesVar.get(sDKVersion.values(((String) objArr8[0]).intern()));
                        Object[] objArr9 = new Object[1];
                        ThreeDS2ServiceInstance(22 - Color.red(0), 25 - (KeyEvent.getMaxKeyCode() >> 16), "\u0005\r\ufffb\uffe7\u0013\f\u000e\b\uffdf\ufffb\u000e\ufffb\uffde\uffff\u0001\b\uffff\u0006\u0006\ufffb\u0002�\u0001\b\u0003", ImageFormat.getBitsPerPixel(0) + 289, true, objArr9);
                        valuesVar.ThreeDS2ServiceInstance((getInfo) sDKVersion.ThreeDS2ServiceInstance(((String) objArr9[0]).intern(), getInfo.class));
                        settitlemarginend.ThreeDS2Service(valuesVar);
                        settitlemarginend.ThreeDS2Service(threeDS2Service);
                    }
                    return settitlemarginend;
                }
            }
            return settitlemarginend;
        }
        int i = valueOf + 61;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2ServiceInstance(int r6, int r7, java.lang.String r8, int r9, boolean r10, java.lang.Object[] r11) {
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
            int r5 = com.netcetera.threeds.sdk.infrastructure.C9503jg.get     // Catch: java.lang.Throwable -> L2f
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9503jg.ThreeDS2ServiceInstance(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
    }
}
