package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bn */
/* loaded from: classes5.dex */
public class C9279bn implements setProperty {
    private static int ThreeDS2Service = 0;
    private static int get = 1;
    public static int values = 1;

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(int r6, int r7, java.lang.String r8, int r9, boolean r10, java.lang.Object[] r11) {
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
            int r5 = com.netcetera.threeds.sdk.infrastructure.C9279bn.values     // Catch: java.lang.Throwable -> L2f
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9279bn.ThreeDS2Service(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
    }

    public String ThreeDS2ServiceInstance(String str) {
        int i = (get + 17) % 128;
        ThreeDS2Service = i;
        if (str == null) {
            int i2 = i + 17;
            get = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 38 / 0;
            }
            return null;
        }
        Object[] objArr = new Object[1];
        ThreeDS2Service(32 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 38 - Color.blue(0), "\ufff7￠￡ￜ4+\u0014￠5￤￩3\u001c\u0014￡\ufff7￢￢\u0014￠5￤￩3\u001c\u0014￡ￜ4+\u0014￠￡\u000b\u0014￦\u0014\uffd9", View.MeasureSpec.makeMeasureSpec(0, 0) + 73, true, objArr);
        String str2 = get(str, ((String) objArr[0]).intern(), '*', Typography.amp);
        Object[] objArr2 = new Object[1];
        ThreeDS2Service(1 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 1, "\u0000", 12 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), false, objArr2);
        String intern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        ThreeDS2Service(4 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 6, " 0￼\uffde\uffde\ufffa", 67 - Drawable.resolveOpacity(0, 0), false, objArr3);
        String replaceAll = str2.replaceAll(intern, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        ThreeDS2Service(22 - View.MeasureSpec.makeMeasureSpec(0, 0), 23 - TextUtils.getOffsetAfter("", 0), "￦7￮9￤￪￦\ufffb￥\u0018￦7￮9￤\ufffb\uffdd\u0018￪\u0018\u000f￥\u0018", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 68, false, objArr4);
        String intern2 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        ThreeDS2Service(TextUtils.lastIndexOf("", '0', 0, 0) + 8, 8 - Process.getGidForName(""), "\ufff0�\ufff2￥\uffff#�\uffff#", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 64, true, objArr5);
        String replaceAll2 = replaceAll.replaceAll(intern2, ((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        ThreeDS2Service(1 - Color.alpha(0), 39 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "￠￡\u000b\u0014￦\u0014\uffd9\ufff7￠￡ￜ4+\u0014￠5￤￩3\u001c\u0014￡\ufff7￢\uffde\u0014￠5￤￩3\u001c\u0014￡ￜ4+\u0014", 72 - TextUtils.indexOf((CharSequence) "", '0', 0), true, objArr6);
        return get(replaceAll2, ((String) objArr6[0]).intern(), Typography.amp, '*');
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        if ((r0 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        r0 = 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        r4 = android.text.Html.fromHtml(r4, r0);
        r3.setText(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        r0 = 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        r3.setText(android.text.Html.fromHtml(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.C9279bn.get + 61;
        com.netcetera.threeds.sdk.infrastructure.C9279bn.ThreeDS2Service = r0 % 128;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.setProperty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void get(android.widget.TextView r3, java.lang.String r4) {
        /*
            r2 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9279bn.get
            int r0 = r0 + 123
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9279bn.ThreeDS2Service = r1
            int r0 = r0 % 2
            r1 = 24
            if (r0 == 0) goto L17
            java.lang.String r4 = r2.ThreeDS2ServiceInstance(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L38
            goto L1f
        L17:
            java.lang.String r4 = r2.ThreeDS2ServiceInstance(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L38
        L1f:
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9279bn.get
            int r0 = r0 + 61
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9279bn.ThreeDS2Service = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L35
            r0 = 22
        L2d:
            android.text.Spanned r4 = p000.AbstractC19986g72.m31224a(r4, r0)
            r3.setText(r4)
            goto L3f
        L35:
            r0 = 63
            goto L2d
        L38:
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            r3.setText(r4)
        L3f:
            int r3 = com.netcetera.threeds.sdk.infrastructure.C9279bn.ThreeDS2Service
            int r3 = r3 + 73
            int r4 = r3 % 128
            com.netcetera.threeds.sdk.infrastructure.C9279bn.get = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L4c
            return
        L4c:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9279bn.get(android.widget.TextView, java.lang.String):void");
    }

    private String get(String str, String str2, char c, char c2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (matcher.find()) {
            sb.append((CharSequence) str, i, matcher.start());
            StringBuilder sb2 = new StringBuilder();
            String group = matcher.group();
            for (int i2 = 0; i2 < group.length(); i2++) {
                int i3 = ThreeDS2Service + 87;
                get = i3 % 128;
                if (i3 % 2 != 0) {
                    if (group.charAt(i2) == c) {
                        sb2.append(c2);
                    } else {
                        sb2.append(group.charAt(i2));
                    }
                } else {
                    group.charAt(i2);
                    throw null;
                }
            }
            sb.append((CharSequence) sb2);
            i = matcher.end();
        }
        if (i < str.length()) {
            int i4 = get + 113;
            ThreeDS2Service = i4 % 128;
            if (i4 % 2 != 0) {
                sb.append((CharSequence) str, i, str.length());
                int i5 = 2 / 0;
            } else {
                sb.append((CharSequence) str, i, str.length());
            }
        }
        return sb.toString();
    }
}
