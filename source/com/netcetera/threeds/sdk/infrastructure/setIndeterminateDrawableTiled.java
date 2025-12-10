package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintMode;
import com.netcetera.threeds.sdk.infrastructure.setMinWidth;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class setIndeterminateDrawableTiled implements setProgressDrawable {
    private static int ThreeDS2ServiceInstance = 1;
    public static int get = 108;
    private static int valueOf = 0;
    public static long values = 987571142782808966L;

    private Map<String, String> ThreeDS2ServiceInstance(C9651nr c9651nr) {
        try {
            Map<String, Object> valueOf2 = c9651nr.valueOf();
            HashMap hashMap = new HashMap();
            valueOf = (ThreeDS2ServiceInstance + 35) % 128;
            for (String str : valueOf2.keySet()) {
                valueOf = (ThreeDS2ServiceInstance + 93) % 128;
                Object obj = valueOf2.get(str);
                if (obj instanceof String) {
                    hashMap.put(str, (String) obj);
                }
            }
            return hashMap;
        } catch (setId unused) {
            return new HashMap();
        }
    }

    private C9651nr valueOf(setIndeterminateTintMode setindeterminatetintmode) {
        valueOf = (ThreeDS2ServiceInstance + 5) % 128;
        C9651nr ThreeDS2ServiceInstance2 = C9651nr.ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        valueOf(12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 15, "￼\r\uffef\u0007￼\t\r\u0000\u000f\t\u0004\uffdf￤\u000e\t", Drawable.resolveOpacity(0, 0) + 209, true, objArr);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr[0]).intern(), setindeterminatetintmode.ThreeDS2ServiceInstance());
        Object[] objArr2 = new Object[1];
        valueOf(5 - Gravity.getAbsoluteGravity(0, 0), 9 - Gravity.getAbsoluteGravity(0, 0), "\u0007\ufff9\u0001�\b\u0004\u0001\ufff5\b", ExpandableListView.getPackedPositionChild(0L) + 217, true, objArr2);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr2[0]).intern(), setindeterminatetintmode.ThreeDS2Service());
        Object[] objArr3 = new Object[1];
        valueOf((ViewConfiguration.getScrollBarSize() >> 8) + 14, (ViewConfiguration.getTapTimeout() >> 16) + 18, "\uffff\u0000\uffff\f\uffff\b�\uffff￨\u000f\u0007￼\uffff\f\ufffb�\r￬", 209 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), false, objArr3);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr3[0]).intern(), setindeterminatetintmode.get());
        Object[] objArr4 = new Object[1];
        get("㯪㮞ᑼ\ue788젽朷⽐뷋\uf581♅絭쿼Ɪ桋䭲", ViewConfiguration.getFadingEdgeLength() >> 16, objArr4);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr4[0]).intern(), setindeterminatetintmode.cleanup());
        Object[] objArr5 = new Object[1];
        valueOf(6 - KeyEvent.normalizeMetaState(0), 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "￭\u0002￮\f￼\ufffa\f\ufffe\t\u0012", 211 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), true, objArr5);
        ThreeDS2ServiceInstance2.values(((String) objArr5[0]).intern(), C9623nl.valueOf(setindeterminatetintmode.values()));
        if (C9669om.values(setindeterminatetintmode.cleanup(), setMinWidth.ThreeDS2Service.ThreeDS2Service.ThreeDS2ServiceInstance(), setMinWidth.ThreeDS2Service.valueOf.ThreeDS2ServiceInstance())) {
            C9651nr ThreeDS2ServiceInstance3 = C9651nr.ThreeDS2ServiceInstance();
            Object[] objArr6 = new Object[1];
            get("롻렞㬊죾繫ﮄ餕ⅹ瘑त쬪卝\u2428䜺﴾贶퉇镙⽐뼰", Process.myPid() >> 22, objArr6);
            ThreeDS2ServiceInstance3.ThreeDS2Service(((String) objArr6[0]).intern(), setindeterminatetintmode.getWarnings());
            Object[] objArr7 = new Object[1];
            valueOf(5 - TextUtils.indexOf((CharSequence) "", '0'), 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "ￜ�\f\ufff9\u0001\u0004�\n\n\u0007\n", TextUtils.indexOf((CharSequence) "", '0', 0) + 213, false, objArr7);
            ThreeDS2ServiceInstance3.ThreeDS2Service(((String) objArr7[0]).intern(), setindeterminatetintmode.initialize());
            Object[] objArr8 = new Object[1];
            get("\uf740\uf725靶撂ض筓\ue148ꆮ㤪ꕟ덽펔欀\ueb5b蕤෴鵦㤸", ExpandableListView.getPackedPositionGroup(0L), objArr8);
            ThreeDS2ServiceInstance3.ThreeDS2Service(((String) objArr8[0]).intern(), setindeterminatetintmode.getSDKVersion());
            Object[] objArr9 = new Object[1];
            get("\ue18f\ue1ea콠㲔ᛵ䦖\uf18b鍫\u2fe5\ufd49ꎾ\ue158線", '0' - AndroidCharacter.getMirror('0'), objArr9);
            ThreeDS2ServiceInstance3.ThreeDS2Service(((String) objArr9[0]).intern(), setindeterminatetintmode.getSDKInfo());
            Object[] objArr10 = new Object[1];
            valueOf(9 - Color.alpha(0), 12 - Drawable.resolveOpacity(0, 0), "\n\n￼￤\t\u0006\t\t￼￼\ufffe\ufff8", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 213, true, objArr10);
            ThreeDS2ServiceInstance2.values(((String) objArr10[0]).intern(), ThreeDS2ServiceInstance3);
        }
        if (!setindeterminatetintmode.ConfigParameters().isEmpty()) {
            Object[] objArr11 = new Object[1];
            valueOf(1 - TextUtils.indexOf("", "", 0, 0), Color.red(0) + 21, "\ufff8\u0005\u0006\u0000\u000b\ufff8\u0004\t\u0006�\u0005￠\u0003\ufff8\u0005\u0006\u0000\u000b\u0000\ufffb\ufffb", Color.argb(0, 0, 0, 0) + 213, true, objArr11);
            ThreeDS2ServiceInstance2.values(((String) objArr11[0]).intern(), C9651nr.values(setindeterminatetintmode.ConfigParameters()));
        }
        int i = ThreeDS2ServiceInstance + 71;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2ServiceInstance2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressDrawable
    public List<setIndeterminateTintMode> ThreeDS2Service(String str) throws setId {
        int i = ThreeDS2ServiceInstance + 15;
        valueOf = i % 128;
        if (i % 2 == 0) {
            if (C9669om.ThreeDS2Service(str)) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            C9623nl values2 = C9623nl.values(str);
            int i2 = 0;
            while (i2 < values2.ThreeDS2ServiceInstance()) {
                arrayList.add(valueOf(values2.ThreeDS2Service(i2)));
                i2++;
                ThreeDS2ServiceInstance = (valueOf + 71) % 128;
            }
            return arrayList;
        }
        C9669om.ThreeDS2Service(str);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressDrawable
    public String get(List<setIndeterminateTintMode> list) {
        int i = ThreeDS2ServiceInstance + 69;
        valueOf = i % 128;
        if (i % 2 == 0) {
            C9623nl values2 = C9623nl.values();
            Iterator<setIndeterminateTintMode> it = list.iterator();
            while (it.hasNext()) {
                int i2 = valueOf + 25;
                ThreeDS2ServiceInstance = i2 % 128;
                if (i2 % 2 != 0) {
                    values2.ThreeDS2Service(valueOf(it.next()));
                } else {
                    values2.ThreeDS2Service(valueOf(it.next()));
                    throw null;
                }
            }
            return values2.toString();
        }
        C9623nl.values();
        list.iterator();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
            monitor-enter(r0)
            long r1 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.values     // Catch: java.lang.Throwable -> L3a
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.values     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.get(java.lang.String, int, java.lang.Object[]):void");
    }

    private setIndeterminateTintMode valueOf(C9651nr c9651nr) {
        Object[] objArr = new Object[1];
        valueOf(11 - Color.green(0), 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "￼\r\uffef\u0007￼\t\r\u0000\u000f\t\u0004\uffdf￤\u000e\t", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 208, true, objArr);
        setIndeterminateTintMode.ThreeDS2Service threeDS2Service = new setIndeterminateTintMode.ThreeDS2Service(c9651nr.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), ""), "");
        Object[] objArr2 = new Object[1];
        valueOf((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 5, 9 - (Process.myTid() >> 22), "\u0007\ufff9\u0001�\b\u0004\u0001\ufff5\b", TextUtils.getOffsetAfter("", 0) + 216, true, objArr2);
        threeDS2Service.ThreeDS2Service(c9651nr.ThreeDS2ServiceInstance(((String) objArr2[0]).intern(), ""));
        Object[] objArr3 = new Object[1];
        valueOf(14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 18 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\uffff\u0000\uffff\f\uffff\b�\uffff￨\u000f\u0007￼\uffff\f\ufffb�\r￬", 210 - View.MeasureSpec.getMode(0), false, objArr3);
        threeDS2Service.ThreeDS2ServiceInstance(c9651nr.ThreeDS2ServiceInstance(((String) objArr3[0]).intern(), ""));
        Object[] objArr4 = new Object[1];
        get("㯪㮞ᑼ\ue788젽朷⽐뷋\uf581♅絭쿼Ɪ桋䭲", View.resolveSizeAndState(0, 0, 0), objArr4);
        threeDS2Service.values(c9651nr.ThreeDS2ServiceInstance(((String) objArr4[0]).intern(), ""));
        valueOf = (ThreeDS2ServiceInstance + 37) % 128;
        int i = 0;
        while (true) {
            Object[] objArr5 = new Object[1];
            valueOf(TextUtils.indexOf((CharSequence) "", '0', 0) + 7, 10 - (ViewConfiguration.getEdgeSlop() >> 16), "￭\u0002￮\f￼\ufffa\f\ufffe\t\u0012", 211 - (Process.myPid() >> 22), true, objArr5);
            if (i >= c9651nr.cleanup(((String) objArr5[0]).intern()).ThreeDS2ServiceInstance()) {
                break;
            }
            Object[] objArr6 = new Object[1];
            valueOf(6 - Color.red(0), TextUtils.lastIndexOf("", '0', 0) + 11, "￭\u0002￮\f￼\ufffa\f\ufffe\t\u0012", 211 - TextUtils.indexOf("", "", 0), true, objArr6);
            threeDS2Service.valueOf(c9651nr.cleanup(((String) objArr6[0]).intern()).valueOf(i));
            i++;
        }
        Object[] objArr7 = new Object[1];
        get("㯪㮞ᑼ\ue788젽朷⽐뷋\uf581♅絭쿼Ɪ桋䭲", View.MeasureSpec.getMode(0), objArr7);
        if (C9669om.values(c9651nr.ThreeDS2ServiceInstance(((String) objArr7[0]).intern(), ""), setMinWidth.ThreeDS2Service.ThreeDS2Service.ThreeDS2ServiceInstance(), setMinWidth.ThreeDS2Service.valueOf.ThreeDS2ServiceInstance())) {
            ThreeDS2ServiceInstance = (valueOf + 43) % 128;
            Object[] objArr8 = new Object[1];
            valueOf(9 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12, "\n\n￼￤\t\u0006\t\t￼￼\ufffe\ufff8", 213 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), true, objArr8);
            C9651nr sDKVersion = c9651nr.getSDKVersion(((String) objArr8[0]).intern());
            Object[] objArr9 = new Object[1];
            get("롻렞㬊죾繫ﮄ餕ⅹ瘑त쬪卝\u2428䜺﴾贶퉇镙⽐뼰", Process.getGidForName("") + 1, objArr9);
            threeDS2Service.get(sDKVersion.ThreeDS2ServiceInstance(((String) objArr9[0]).intern(), ""));
            Object[] objArr10 = new Object[1];
            valueOf(ExpandableListView.getPackedPositionGroup(0L) + 6, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, "ￜ�\f\ufff9\u0001\u0004�\n\n\u0007\n", 212 - (Process.myTid() >> 22), false, objArr10);
            threeDS2Service.getSDKInfo(sDKVersion.ThreeDS2ServiceInstance(((String) objArr10[0]).intern(), ""));
            Object[] objArr11 = new Object[1];
            get("\uf740\uf725靶撂ض筓\ue148ꆮ㤪ꕟ덽펔欀\ueb5b蕤෴鵦㤸", View.getDefaultSize(0, 0), objArr11);
            threeDS2Service.initialize(sDKVersion.ThreeDS2ServiceInstance(((String) objArr11[0]).intern(), ""));
            Object[] objArr12 = new Object[1];
            get("\ue18f\ue1ea콠㲔ᛵ䦖\uf18b鍫\u2fe5\ufd49ꎾ\ue158線", KeyEvent.normalizeMetaState(0), objArr12);
            threeDS2Service.getWarnings(sDKVersion.ThreeDS2ServiceInstance(((String) objArr12[0]).intern(), ""));
        }
        Object[] objArr13 = new Object[1];
        valueOf(1 - Drawable.resolveOpacity(0, 0), 16777237 + Color.rgb(0, 0, 0), "\ufff8\u0005\u0006\u0000\u000b\ufff8\u0004\t\u0006�\u0005￠\u0003\ufff8\u0005\u0006\u0000\u000b\u0000\ufffb\ufffb", (Process.myTid() >> 22) + 213, true, objArr13);
        threeDS2Service.ThreeDS2ServiceInstance(ThreeDS2ServiceInstance(c9651nr.getSDKVersion(((String) objArr13[0]).intern())));
        setIndeterminateTintMode ThreeDS2ServiceInstance2 = threeDS2Service.ThreeDS2ServiceInstance();
        valueOf = (ThreeDS2ServiceInstance + 47) % 128;
        return ThreeDS2ServiceInstance2;
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
            int r5 = com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.get     // Catch: java.lang.Throwable -> L2f
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setIndeterminateDrawableTiled.valueOf(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
    }
}
