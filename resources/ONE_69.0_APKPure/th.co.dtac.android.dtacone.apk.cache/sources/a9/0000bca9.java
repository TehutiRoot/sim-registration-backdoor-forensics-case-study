package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.jv */
/* loaded from: classes5.dex */
public class C9508jv implements InterfaceC9496jk {
    public static long ThreeDS2Service = 0;
    private static int cleanup = 1;
    public static int get = 0;
    private static int getSDKVersion = 0;
    public static char valueOf = 61622;
    private final String ThreeDS2ServiceInstance;
    private final String values;

    public C9508jv(String str, String str2) {
        this.values = str;
        this.ThreeDS2ServiceInstance = str2;
    }

    public static InterfaceC9496jk ConfigParameters() {
        getSDKVersion = (cleanup + 113) % 128;
        InterfaceC9496jk onError = onError();
        cleanup = (getSDKVersion + 117) % 128;
        return onError;
    }

    public static InterfaceC9496jk cleanup() {
        int i = cleanup + CameraActivity.REQUEST_CODE;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            int i2 = 83 / 0;
            return onError();
        }
        return onError();
    }

    public static InterfaceC9496jk getSDKInfo() {
        int i = cleanup + 93;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            InterfaceC9496jk onError = onError();
            int i2 = cleanup + 71;
            getSDKVersion = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 0 / 0;
            }
            return onError;
        }
        onError();
        throw null;
    }

    public static InterfaceC9496jk getSDKVersion() {
        Object[] objArr = new Object[1];
        values((-1381579461) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) Color.green(0), "\uaacb똪䭫⪅敫꘣謏ყ\udb59", "㬌ꛅ肭ௌ", "\u0000\u0000\u0000\u0000", objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        values(TextUtils.lastIndexOf("", '0', 0) - 1400304347, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), "蜍쪈炊풡\udd49髥懯", "⒣褍\uebac甛", "\u0000\u0000\u0000\u0000", objArr2);
        C9508jv c9508jv = new C9508jv(intern, ((String) objArr2[0]).intern());
        int i = getSDKVersion + 33;
        cleanup = i % 128;
        if (i % 2 != 0) {
            return c9508jv;
        }
        throw null;
    }

    public static InterfaceC9496jk getWarnings() {
        Object[] objArr = new Object[1];
        values((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2094915944, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), "\uea69㴂⽇잇豞㢯㉤", "棛\udde1獼榇", "\u0000\u0000\u0000\u0000", objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        values((ViewConfiguration.getKeyRepeatDelay() >> 16) - 1400304348, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "蜍쪈炊풡\udd49髥懯", "⒣褍\uebac甛", "\u0000\u0000\u0000\u0000", objArr2);
        C9508jv c9508jv = new C9508jv(intern, ((String) objArr2[0]).intern());
        int i = getSDKVersion + 67;
        cleanup = i % 128;
        if (i % 2 == 0) {
            int i2 = 84 / 0;
        }
        return c9508jv;
    }

    public static InterfaceC9496jk initialize() {
        getSDKVersion = (cleanup + 9) % 128;
        InterfaceC9496jk onError = onError();
        getSDKVersion = (cleanup + 69) % 128;
        return onError;
    }

    public static InterfaceC9496jk onCompleted() {
        Object[] objArr = new Object[1];
        values(2094915943 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), "\uea69㴂⽇잇豞㢯㉤", "棛\udde1獼榇", "\u0000\u0000\u0000\u0000", objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        values((ViewConfiguration.getWindowTouchSlop() >> 8) - 1400304348, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), "蜍쪈炊풡\udd49髥懯", "⒣褍\uebac甛", "\u0000\u0000\u0000\u0000", objArr2);
        C9508jv c9508jv = new C9508jv(intern, ((String) objArr2[0]).intern());
        int i = getSDKVersion + 59;
        cleanup = i % 128;
        if (i % 2 == 0) {
            int i2 = 56 / 0;
        }
        return c9508jv;
    }

    public static InterfaceC9496jk onError() {
        Object[] objArr = new Object[1];
        values(TextUtils.lastIndexOf("", '0') - 1119172121, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "岻貍莎⫏≕\ue704瞬", "\ue6bd䫉鶽\ue446", "\u0000\u0000\u0000\u0000", objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        values((-1400304348) - (Process.myPid() >> 22), (char) TextUtils.getCapsMode("", 0, 0), "蜍쪈炊풡\udd49髥懯", "⒣褍\uebac甛", "\u0000\u0000\u0000\u0000", objArr2);
        C9508jv c9508jv = new C9508jv(intern, ((String) objArr2[0]).intern());
        cleanup = (getSDKVersion + 77) % 128;
        return c9508jv;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9496jk
    public String ThreeDS2Service() {
        int i = getSDKVersion + 89;
        int i2 = i % 128;
        cleanup = i2;
        if (i % 2 != 0) {
            String str = this.values;
            int i3 = i2 + 67;
            getSDKVersion = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public int ThreeDS2ServiceInstance() {
        int i;
        int i2 = cleanup;
        int i3 = i2 + 107;
        getSDKVersion = i3 % 128;
        if (i3 % 2 != 0) {
            i = 59;
        } else {
            i = 16;
        }
        int i4 = i2 + 77;
        getSDKVersion = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return i;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String get() {
        String str;
        int i = getSDKVersion + 107;
        int i2 = i % 128;
        cleanup = i2;
        if (i % 2 == 0) {
            str = this.ThreeDS2ServiceInstance;
            int i3 = 5 / 0;
        } else {
            str = this.ThreeDS2ServiceInstance;
        }
        int i4 = i2 + 85;
        getSDKVersion = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String valueOf() {
        Object obj;
        int i = cleanup + 5;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            values(ViewConfiguration.getWindowTouchSlop() - 101, (char) (ViewConfiguration.getDoubleTapTimeout() / 119), "蓠벊\ua7cdꤓ㥌\u139e㟿哻䙋ᅋ", "潮鹥ᯏ\uda5b", "\u0000\u0000\u0000\u0000", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            values(ViewConfiguration.getWindowTouchSlop() >> 8, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), "蓠벊\ua7cdꤓ㥌\u139e㟿哻䙋ᅋ", "潮鹥ᯏ\uda5b", "\u0000\u0000\u0000\u0000", objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        cleanup = (getSDKVersion + 65) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9496jk
    public int values() {
        int i = (getSDKVersion + 1) % 128;
        cleanup = i;
        getSDKVersion = (i + 27) % 128;
        return 4;
    }

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
            long r6 = com.netcetera.threeds.sdk.infrastructure.C9508jv.ThreeDS2Service     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = com.netcetera.threeds.sdk.infrastructure.C9508jv.get     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            char r2 = com.netcetera.threeds.sdk.infrastructure.C9508jv.valueOf     // Catch: java.lang.Throwable -> L7c
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9508jv.values(int, char, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void");
    }
}