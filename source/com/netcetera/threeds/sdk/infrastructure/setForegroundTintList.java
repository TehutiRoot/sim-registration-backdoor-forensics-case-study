package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatDelegate;
import ch.qos.logback.core.net.SyslogConstants;
import com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class setForegroundTintList implements setTextFontSize {
    static final String ThreeDS2Service;
    static final String ThreeDS2ServiceInstance;
    public static int get = 0;
    private static int getSDKVersion = 1;
    private static int getWarnings;
    static final String valueOf;
    static final String values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.setForegroundTintList$2 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C97382 {
        private static int ThreeDS2Service = 1;
        static final /* synthetic */ int[] valueOf;
        private static int values;

        static {
            int[] iArr = new int[getHeadingTextColor.values.values().length];
            valueOf = iArr;
            try {
                iArr[getHeadingTextColor.values.ThreeDS2ServiceInstance.ordinal()] = 1;
                int i = values;
                int i2 = i & 7;
                int i3 = -(-((i ^ 7) | i2));
                ThreeDS2Service = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[getHeadingTextColor.values.values.ordinal()] = 2;
                int i4 = values;
                ThreeDS2Service = ((((i4 | 9) << 1) - (~(-(((~i4) & 9) | (i4 & (-10)))))) - 1) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            int i5 = values;
            int i6 = (i5 ^ 55) + ((i5 & 55) << 1);
            ThreeDS2Service = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            throw null;
        }
    }

    static {
        get();
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance(Drawable.resolveOpacity(0, 0) + 1, 2 - KeyEvent.keyCodeFromString(""), "\u0002\ufffe", 193 - Color.blue(0), false, objArr);
        values = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance(4 - (ViewConfiguration.getLongPressTimeout() >> 16), 5 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "￼\b\u0006\ufff9", 180 - View.resolveSizeAndState(0, 0, 0), false, objArr2);
        ThreeDS2Service = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        ThreeDS2ServiceInstance(View.MeasureSpec.getMode(0) + 2, ((byte) KeyEvent.getModifierMetaStateMask()) + 3, "\u0000\u0000", (ViewConfiguration.getWindowTouchSlop() >> 8) + SyslogConstants.LOG_LOCAL6, true, objArr3);
        ThreeDS2ServiceInstance = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        ThreeDS2ServiceInstance((ViewConfiguration.getTapTimeout() >> 16) + 1, 2 - ExpandableListView.getPackedPositionType(0L), "\t\ufff7", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + SyslogConstants.LOG_LOCAL7, false, objArr4);
        valueOf = ((String) objArr4[0]).intern();
        getSDKVersion = (getWarnings + 23) % 128;
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
            int r5 = com.netcetera.threeds.sdk.infrastructure.setForegroundTintList.get     // Catch: java.lang.Throwable -> L2f
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setForegroundTintList.ThreeDS2ServiceInstance(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
    }

    public static void get() {
        get = AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR;
    }

    private void values(C9651nr c9651nr, List<com.netcetera.threeds.sdk.api.security.Warning> list) {
        if (list != null) {
            getWarnings = (getSDKVersion + 31) % 128;
            if (!list.isEmpty()) {
                C9623nl values2 = C9623nl.values();
                for (com.netcetera.threeds.sdk.api.security.Warning warning : list) {
                    values2.get(warning.getId());
                }
                Object[] objArr = new Object[1];
                ThreeDS2ServiceInstance(1 - ((Process.getThreadPriority(0) + 20) >> 6), 3 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0002\ufffe", 193 - Color.argb(0, 0, 0, 0), false, objArr);
                c9651nr.values(((String) objArr[0]).intern(), values2);
                getWarnings = (getSDKVersion + 119) % 128;
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTextFontSize
    public String ThreeDS2Service(getTextFontSize gettextfontsize) throws setId {
        getSDKVersion = (getWarnings + 71) % 128;
        C9651nr ThreeDS2ServiceInstance2 = C9651nr.ThreeDS2ServiceInstance();
        getTextColor valueOf2 = gettextfontsize.valueOf();
        List<com.netcetera.threeds.sdk.api.security.Warning> ThreeDS2ServiceInstance3 = gettextfontsize.ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance(1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), '2' - AndroidCharacter.getMirror('0'), "\t\ufff7", 185 - Color.red(0), false, objArr);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr[0]).intern(), gettextfontsize.get().valueOf());
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance(2 - Color.argb(0, 0, 0, 0), 2 - Gravity.getAbsoluteGravity(0, 0), "\u0000\u0000", View.getDefaultSize(0, 0) + SyslogConstants.LOG_LOCAL6, true, objArr2);
        get(ThreeDS2ServiceInstance2, ((String) objArr2[0]).intern(), valueOf2.values());
        Object[] objArr3 = new Object[1];
        ThreeDS2ServiceInstance(4 - (KeyEvent.getMaxKeyCode() >> 16), 4 - (ViewConfiguration.getPressedStateDuration() >> 16), "￼\b\u0006\ufff9", 180 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), false, objArr3);
        get(ThreeDS2ServiceInstance2, ((String) objArr3[0]).intern(), valueOf2.ThreeDS2ServiceInstance());
        values(ThreeDS2ServiceInstance2, ThreeDS2ServiceInstance3);
        String c9651nr = ThreeDS2ServiceInstance2.toString();
        getWarnings = (getSDKVersion + 51) % 128;
        return c9651nr;
    }

    private void get(C9651nr c9651nr, String str, Map<String, getHeadingTextColor> map) {
        if (map != null) {
            getWarnings = (getSDKVersion + 119) % 128;
            if (map.isEmpty()) {
                return;
            }
            C9651nr sDKVersion = c9651nr.getSDKVersion(str);
            Iterator<Map.Entry<String, getHeadingTextColor>> it = map.entrySet().iterator();
            while (!(!it.hasNext())) {
                getWarnings = (getSDKVersion + 1) % 128;
                Map.Entry<String, getHeadingTextColor> next = it.next();
                getHeadingTextColor value = next.getValue();
                String key = next.getKey();
                int i = C97382.valueOf[value.cleanup().ordinal()];
                if (i == 1) {
                    sDKVersion.ThreeDS2Service(key, value.values().get(0));
                } else if (i == 2) {
                    sDKVersion.values(key, C9623nl.valueOf(value.values()));
                }
            }
            c9651nr.values(str, sDKVersion);
        }
    }
}
