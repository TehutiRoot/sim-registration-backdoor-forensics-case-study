package com.netcetera.threeds.sdk.api.configparameters.builder;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.api.configparameters.ConfigParameters;
import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.infrastructure.C9621nj;
import com.netcetera.threeds.sdk.infrastructure.C9653nt;
import com.netcetera.threeds.sdk.infrastructure.C9669om;
import com.netcetera.threeds.sdk.infrastructure.InterfaceC9652ns;
import es.dmoral.toasty.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class ConfigurationBuilder {
    private static int ConfigParameters = 0;
    public static char ThreeDS2Service = 56319;
    public static int ThreeDS2ServiceInstance = 30;
    public static char get = 50598;
    private static int onError = 1;
    public static char valueOf = 20733;
    public static char values = 13874;
    private String cleanup;
    private String getWarnings;
    private final InterfaceC9652ns getSDKVersion = C9653nt.ThreeDS2ServiceInstance(ConfigurationBuilder.class);
    private final ConfigParameters initialize = new ConfigParameters();
    private final List<SchemeConfiguration> getSDKInfo = new ArrayList();

    private void ThreeDS2Service(String str) throws InvalidInputException {
        int i = onError + 73;
        ConfigParameters = i % 128;
        if (i % 2 == 0) {
            if (valueOf((ConfigurationBuilder) str)) {
                ConfigParameters = (onError + 59) % 128;
                ConfigParameters configParameters = this.initialize;
                Object[] objArr = new Object[1];
                ThreeDS2ServiceInstance((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32, "\u000b￼\u0004\ufff8\t\ufff8\u0007\ufff6\u0006�\u0005\u0000\ufff6￼\ufffa\u0000\r￼\ufffb\ufff6\ufffb￼\u000b\ufffa\u0000\t\u000b\n￼\t\n\t￼", (ViewConfiguration.getWindowTouchSlop() >> 8) + 135, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29, true, objArr);
                configParameters.addParam(null, ((String) objArr[0]).intern(), str);
            }
            ConfigParameters = (onError + 45) % 128;
            return;
        }
        valueOf((ConfigurationBuilder) str);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r7 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2ServiceInstance(int r6, java.lang.String r7, int r8, int r9, boolean r10, java.lang.Object[] r11) {
        /*
            if (r7 == 0) goto L6
            char[] r7 = r7.toCharArray()
        L6:
            char[] r7 = (char[]) r7
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.apiKey.get
            monitor-enter(r0)
            char[] r1 = new char[r6]     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
        L10:
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            if (r3 >= r6) goto L31
            char r3 = r7[r3]     // Catch: java.lang.Throwable -> L2f
            com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf = r3     // Catch: java.lang.Throwable -> L2f
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            int r4 = com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 + r8
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
            r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            char r4 = r1[r3]     // Catch: java.lang.Throwable -> L2f
            int r5 = com.netcetera.threeds.sdk.api.configparameters.builder.ConfigurationBuilder.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
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
            if (r9 <= 0) goto L48
            com.netcetera.threeds.sdk.infrastructure.apiKey.values = r9     // Catch: java.lang.Throwable -> L2f
            char[] r7 = new char[r6]     // Catch: java.lang.Throwable -> L2f
            java.lang.System.arraycopy(r1, r2, r7, r2, r6)     // Catch: java.lang.Throwable -> L2f
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
            int r9 = r6 - r8
            java.lang.System.arraycopy(r7, r2, r1, r9, r8)     // Catch: java.lang.Throwable -> L2f
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
            int r9 = r6 - r8
            java.lang.System.arraycopy(r7, r8, r1, r2, r9)     // Catch: java.lang.Throwable -> L2f
        L48:
            if (r10 == 0) goto L60
            char[] r7 = new char[r6]     // Catch: java.lang.Throwable -> L2f
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
        L4e:
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            if (r8 >= r6) goto L5f
            int r9 = r6 - r8
            int r9 = r9 + (-1)
            char r9 = r1[r9]     // Catch: java.lang.Throwable -> L2f
            r7[r8] = r9     // Catch: java.lang.Throwable -> L2f
            int r8 = r8 + 1
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r8     // Catch: java.lang.Throwable -> L2f
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.api.configparameters.builder.ConfigurationBuilder.ThreeDS2ServiceInstance(int, java.lang.String, int, int, boolean, java.lang.Object[]):void");
    }

    private ConfigurationBuilder get(String str, String str2, String str3) throws InvalidInputException {
        int i = ConfigParameters + 29;
        onError = i % 128;
        if (i % 2 == 0) {
            get(str2);
            this.initialize.addParam(str, str2, str3);
            int i2 = 50 / 0;
        } else {
            get(str2);
            this.initialize.addParam(str, str2, str3);
        }
        return this;
    }

    private void valueOf(String str) throws InvalidInputException {
        onError = (ConfigParameters + 69) % 128;
        ConfigParameters configParameters = this.initialize;
        Object[] objArr = new Object[1];
        valueOf("镦䯑\ued1c즉㙩ꓡ筶䵮", 7 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
        configParameters.addParam(null, ((String) objArr[0]).intern(), str);
        int i = onError + 115;
        ConfigParameters = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (valueOf((com.netcetera.threeds.sdk.api.configparameters.builder.ConfigurationBuilder) r10.getSchemeId()) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        ThreeDS2Service(r10.getSchemeName(), r10.getSchemeId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (valueOf((com.netcetera.threeds.sdk.api.configparameters.builder.ConfigurationBuilder) r10.getSchemeId()) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void values(com.netcetera.threeds.sdk.api.configparameters.builder.SchemeConfiguration r10) throws com.netcetera.threeds.sdk.api.exceptions.InvalidInputException {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.api.configparameters.builder.ConfigurationBuilder.values(com.netcetera.threeds.sdk.api.configparameters.builder.SchemeConfiguration):void");
    }

    public ConfigurationBuilder apiKey(String str) {
        int i = (ConfigParameters + 31) % 128;
        onError = i;
        this.getWarnings = str;
        int i2 = i + 63;
        ConfigParameters = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
        }
        return this;
    }

    public ConfigParameters build() throws InvalidInputException {
        Iterator<SchemeConfiguration> it;
        int i = onError + 31;
        ConfigParameters = i % 128;
        if (i % 2 != 0) {
            valueOf(this.getWarnings);
            ThreeDS2Service(this.cleanup);
            it = this.getSDKInfo.iterator();
            int i2 = 29 / 0;
        } else {
            valueOf(this.getWarnings);
            ThreeDS2Service(this.cleanup);
            it = this.getSDKInfo.iterator();
        }
        while (it.hasNext()) {
            int i3 = ConfigParameters + 3;
            onError = i3 % 128;
            if (i3 % 2 != 0) {
                values(it.next());
            } else {
                values(it.next());
                throw null;
            }
        }
        return this.initialize;
    }

    public ConfigurationBuilder configureScheme(SchemeConfiguration schemeConfiguration) {
        ConfigParameters = (onError + 93) % 128;
        this.getSDKInfo.add(schemeConfiguration);
        int i = onError + 97;
        ConfigParameters = i % 128;
        if (i % 2 != 0) {
            int i2 = 72 / 0;
        }
        return this;
    }

    public ConfigurationBuilder restrictedParameters(List<String> list) {
        ConfigParameters = (onError + 43) % 128;
        this.cleanup = C9669om.values(list, ",");
        ConfigParameters = (onError + 7) % 128;
        return this;
    }

    private ConfigurationBuilder valueOf(String str, String str2) throws InvalidInputException {
        ConfigParameters = (onError + 91) % 128;
        get(str);
        ConfigParameters configParameters = this.initialize;
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance(18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\ufffb\u0000�\u0005\ufff9\ufff7\b\r\ufffa\u0004\u0001\ufffb\ufff7\u0003�\u0011\u000b", TextUtils.indexOf("", "", 0, 0) + 134, 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), false, objArr);
        configParameters.addParam(((String) objArr[0]).intern(), str, str2);
        int i = ConfigParameters + 125;
        onError = i % 128;
        if (i % 2 == 0) {
            int i2 = 6 / 0;
        }
        return this;
    }

    private ConfigurationBuilder ThreeDS2Service(String str, String str2) throws InvalidInputException {
        ConfigParameters = (onError + 59) % 128;
        get(str);
        ConfigParameters configParameters = this.initialize;
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance(14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "￼\f\f�\u0002\ufff8\f�\ufff8\ufffa\u0006\ufffe\u0001", 133 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2 - (ViewConfiguration.getFadingEdgeLength() >> 16), true, objArr);
        configParameters.addParam(((String) objArr[0]).intern(), str, str2);
        onError = (ConfigParameters + 97) % 128;
        return this;
    }

    private <T> boolean valueOf(T t) {
        if (t != null) {
            onError = (ConfigParameters + 57) % 128;
            return true;
        }
        onError = (ConfigParameters + 31) % 128;
        return false;
    }

    private void get(String str) throws InvalidInputException {
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance((-16777206) - Color.rgb(0, 0, 0), "￩￼\b\u0000\u000e\ufffe\u0003\u0000\b\u0000", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + BuildConfig.VERSION_CODE, 4 - (Process.myTid() >> 22), false, objArr);
        C9621nj.ThreeDS2Service(str, ((String) objArr[0]).intern());
        ConfigParameters configParameters = this.initialize;
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance(11 - TextUtils.lastIndexOf("", '0', 0, 0), "\ufff9\u0005�\u000b\u000b\ufffb\u0000�\u0005\ufff9\ufff7\u0006", 134 - (ViewConfiguration.getTapTimeout() >> 16), 4 - TextUtils.getOffsetAfter("", 0), false, objArr2);
        String paramValue = configParameters.getParamValue(null, ((String) objArr2[0]).intern());
        ArrayList arrayList = new ArrayList();
        if (paramValue != null) {
            arrayList.addAll(Arrays.asList(paramValue.split(",")));
        }
        if (!arrayList.contains(str)) {
            arrayList.add(str);
            ConfigParameters configParameters2 = this.initialize;
            Object[] objArr3 = new Object[1];
            ThreeDS2ServiceInstance(Color.argb(0, 0, 0, 0) + 12, "\ufff9\u0005�\u000b\u000b\ufffb\u0000�\u0005\ufff9\ufff7\u0006", View.MeasureSpec.getSize(0) + 134, 4 - ExpandableListView.getPackedPositionGroup(0L), false, objArr3);
            configParameters2.removeParam(null, ((String) objArr3[0]).intern());
            ConfigParameters configParameters3 = this.initialize;
            Object[] objArr4 = new Object[1];
            ThreeDS2ServiceInstance(View.MeasureSpec.getMode(0) + 12, "\ufff9\u0005�\u000b\u000b\ufffb\u0000�\u0005\ufff9\ufff7\u0006", (ViewConfiguration.getWindowTouchSlop() >> 8) + 134, 4 - ((Process.getThreadPriority(0) + 20) >> 6), false, objArr4);
            configParameters3.addParam(null, ((String) objArr4[0]).intern(), C9669om.values(arrayList, ","));
            onError = (ConfigParameters + 97) % 128;
        }
        ConfigParameters = (onError + 11) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(java.lang.String r12, int r13, java.lang.Object[] r14) {
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
            char r11 = com.netcetera.threeds.sdk.api.configparameters.builder.ConfigurationBuilder.valueOf     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r10 = r8 >>> 5
            char r11 = com.netcetera.threeds.sdk.api.configparameters.builder.ConfigurationBuilder.get     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 - r9
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
            r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
            int r9 = r7 + r4
            int r10 = r7 << 4
            char r11 = com.netcetera.threeds.sdk.api.configparameters.builder.ConfigurationBuilder.ThreeDS2Service     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 >>> 5
            char r10 = com.netcetera.threeds.sdk.api.configparameters.builder.ConfigurationBuilder.values     // Catch: java.lang.Throwable -> L5b
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.api.configparameters.builder.ConfigurationBuilder.valueOf(java.lang.String, int, java.lang.Object[]):void");
    }

    private ConfigurationBuilder ThreeDS2Service(String str, List<String> list) throws InvalidInputException {
        int i = onError + 119;
        ConfigParameters = i % 128;
        if (i % 2 != 0) {
            get(str);
            ConfigParameters configParameters = this.initialize;
            Object[] objArr = new Object[1];
            valueOf("芍ᩴ絸ﮤყ\uf4a3뼝李相\uf86c祒퇩ٵ経赚ὑ롺紞犭퍞囱ꄛ", 89 << Drawable.resolveOpacity(1, 1), objArr);
            configParameters.addParam(((String) objArr[0]).intern(), str, C9669om.values(list, ","));
        } else {
            get(str);
            ConfigParameters configParameters2 = this.initialize;
            Object[] objArr2 = new Object[1];
            valueOf("芍ᩴ絸ﮤყ\uf4a3뼝李相\uf86c祒퇩ٵ経赚ὑ롺紞犭퍞囱ꄛ", Drawable.resolveOpacity(0, 0) + 22, objArr2);
            configParameters2.addParam(((String) objArr2[0]).intern(), str, C9669om.values(list, ","));
        }
        return this;
    }

    private ConfigurationBuilder values(String str, String str2) throws InvalidInputException {
        int i = ConfigParameters + 81;
        onError = i % 128;
        if (i % 2 == 0) {
            get(str);
            ConfigParameters configParameters = this.initialize;
            Object[] objArr = new Object[1];
            valueOf("芍ᩴ絸ﮤყ\uf4a3図쥿㿮㊍ܑ✊\uf19b뻾㙩ꓡ优\uf4c8\ue622㷼", 116 >> (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            configParameters.addParam(((String) objArr[0]).intern(), str, str2);
        } else {
            get(str);
            ConfigParameters configParameters2 = this.initialize;
            Object[] objArr2 = new Object[1];
            valueOf("芍ᩴ絸ﮤყ\uf4a3図쥿㿮㊍ܑ✊\uf19b뻾㙩ꓡ优\uf4c8\ue622㷼", 21 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            configParameters2.addParam(((String) objArr2[0]).intern(), str, str2);
        }
        onError = (ConfigParameters + 61) % 128;
        return this;
    }
}
