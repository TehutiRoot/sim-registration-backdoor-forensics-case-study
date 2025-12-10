package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.netcetera.threeds.sdk.infrastructure.setInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

/* loaded from: classes5.dex */
public class setSecondaryProgress implements setProgressDrawableTiled {
    public static char ThreeDS2Service = 31396;
    public static int ThreeDS2ServiceInstance = 54;
    public static char cleanup = 3543;
    public static boolean get = true;
    private static int getSDKInfo = 1;
    public static char getSDKVersion = 65251;
    public static char getWarnings = 64073;
    private static int initialize = 0;
    public static char[] valueOf = {151, 166, 159, 129, 155, 175, 164, 170, 168, Typography.cent, 138, Typography.copyright, Ascii.MAX, 'z', Typography.pound};
    public static boolean values = true;

    private setInterpolator ThreeDS2Service(C9640nr c9640nr) {
        setInterpolator.ThreeDS2Service threeDS2Service = new setInterpolator.ThreeDS2Service();
        Object[] objArr = new Object[1];
        get(127 - (Process.myPid() >> 22), null, null, "\u008e\u008d\u008c\u0087\u0081\u0089\u008b\u008a\u0081\u0087\u0089\u0085\u0088\u0087\u0083", objArr);
        setInterpolator.ThreeDS2Service ThreeDS2Service2 = threeDS2Service.ThreeDS2Service(c9640nr.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), ""));
        Object[] objArr2 = new Object[1];
        values("둪➟⪷袉菶\ueb1aꐰ퉆縣̨", ':' - AndroidCharacter.getMirror('0'), objArr2);
        setInterpolator.ThreeDS2Service ThreeDS2ServiceInstance2 = ThreeDS2Service2.ThreeDS2ServiceInstance(c9640nr.ThreeDS2ServiceInstance(((String) objArr2[0]).intern(), ""));
        Object[] objArr3 = new Object[1];
        get(127 - Color.green(0), null, null, "\u0082\u008f\u0081\u0088\u008c\u0085\u008f\u0083\u0088", objArr3);
        setInterpolator.ThreeDS2Service values2 = ThreeDS2ServiceInstance2.values(c9640nr.ThreeDS2ServiceInstance(((String) objArr3[0]).intern(), ""));
        Object[] objArr4 = new Object[1];
        values("\udbc5섩魆뼂ᵁ沾\uf65aᦳ菶\ueb1aꐰ퉆縣̨", ((byte) KeyEvent.getModifierMetaStateMask()) + 15, objArr4);
        setInterpolator.ThreeDS2Service threeDS2Service2 = values2.get(c9640nr.ThreeDS2ServiceInstance(((String) objArr4[0]).intern(), ""));
        Object[] objArr5 = new Object[1];
        values("ᚔ\u0b00㣅灆訬깔", 4 - TextUtils.lastIndexOf("", '0'), objArr5);
        setInterpolator.ThreeDS2Service initialize2 = threeDS2Service2.initialize(c9640nr.ThreeDS2ServiceInstance(((String) objArr5[0]).intern(), ""));
        Object[] objArr6 = new Object[1];
        values("य\ud9f7鯦鶶\udcad荹衖橜쫀㵊", 10 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr6);
        setInterpolator.ThreeDS2Service valueOf2 = initialize2.valueOf(c9640nr.ThreeDS2ServiceInstance(((String) objArr6[0]).intern(), ""));
        Object[] objArr7 = new Object[1];
        values("㝸ꎸƯ\ueaa1㟼\uf864縣̨子ﲖ螣膵鮿츛뺒揓\udc2a칺衖橜쫀㵊", 22 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr7);
        setInterpolator values3 = valueOf2.ThreeDS2Service(get(c9640nr.getSDKVersion(((String) objArr7[0]).intern()))).values();
        initialize = (getSDKInfo + 75) % 128;
        return values3;
    }

    private Map<String, String> get(C9640nr c9640nr) {
        String next;
        Object obj;
        try {
            Map<String, Object> valueOf2 = c9640nr.valueOf();
            HashMap hashMap = new HashMap();
            Iterator<String> it = valueOf2.keySet().iterator();
            while (it.hasNext()) {
                int i = initialize + 43;
                getSDKInfo = i % 128;
                if (i % 2 == 0) {
                    next = it.next();
                    obj = valueOf2.get(next);
                    int i2 = 33 / 0;
                    if (!(obj instanceof String)) {
                        getSDKInfo = (initialize + 83) % 128;
                    }
                    hashMap.put(next, (String) obj);
                    getSDKInfo = (initialize + 83) % 128;
                } else {
                    next = it.next();
                    obj = valueOf2.get(next);
                    if (!(obj instanceof String)) {
                        getSDKInfo = (initialize + 83) % 128;
                    }
                    hashMap.put(next, (String) obj);
                    getSDKInfo = (initialize + 83) % 128;
                }
            }
            return hashMap;
        } catch (setId unused) {
            return new HashMap();
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressDrawableTiled
    public String ThreeDS2ServiceInstance(setMax setmax) {
        getSDKInfo = (initialize + 85) % 128;
        C9640nr ThreeDS2ServiceInstance2 = C9640nr.ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        get(View.getDefaultSize(0, 0) + 127, null, null, "\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr[0]).intern(), setmax.get());
        Object[] objArr2 = new Object[1];
        values("\u0e71Ǧ趰쇏සੀ", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5, objArr2);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr2[0]).intern(), setmax.valueOf());
        Object[] objArr3 = new Object[1];
        values("य\ud9f7樝တ\uf4b4\uf094", (ViewConfiguration.getScrollBarSize() >> 8) + 6, objArr3);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr3[0]).intern(), setmax.ThreeDS2Service());
        Object[] objArr4 = new Object[1];
        values("ႎ憅ማ탥", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, objArr4);
        ThreeDS2ServiceInstance2.values(((String) objArr4[0]).intern(), ThreeDS2ServiceInstance(setmax.values()));
        String c9640nr = ThreeDS2ServiceInstance2.toString();
        int i = getSDKInfo + 39;
        initialize = i % 128;
        if (i % 2 == 0) {
            return c9640nr;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressDrawableTiled
    public List<setInterpolator> valueOf(String str) throws setId {
        if (C9658om.ThreeDS2Service(str)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        C9612nl values2 = C9612nl.values(str);
        initialize = (getSDKInfo + 45) % 128;
        int i = 0;
        while (i < values2.ThreeDS2ServiceInstance()) {
            arrayList.add(ThreeDS2Service(values2.ThreeDS2Service(i)));
            i++;
            getSDKInfo = (initialize + 85) % 128;
        }
        return arrayList;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressDrawableTiled
    public String values(List<setInterpolator> list) {
        getSDKInfo = (initialize + 125) % 128;
        String c9612nl = ThreeDS2ServiceInstance(list).toString();
        int i = getSDKInfo + 49;
        initialize = i % 128;
        if (i % 2 != 0) {
            int i2 = 14 / 0;
        }
        return c9612nl;
    }

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
            char r11 = com.netcetera.threeds.sdk.infrastructure.setSecondaryProgress.cleanup     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r10 = r8 >>> 5
            char r11 = com.netcetera.threeds.sdk.infrastructure.setSecondaryProgress.getWarnings     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 - r9
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L5b
            r3[r5] = r7     // Catch: java.lang.Throwable -> L5b
            int r9 = r7 + r4
            int r10 = r7 << 4
            char r11 = com.netcetera.threeds.sdk.infrastructure.setSecondaryProgress.ThreeDS2Service     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + r11
            r9 = r9 ^ r10
            int r7 = r7 >>> 5
            char r10 = com.netcetera.threeds.sdk.infrastructure.setSecondaryProgress.getSDKVersion     // Catch: java.lang.Throwable -> L5b
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setSecondaryProgress.values(java.lang.String, int, java.lang.Object[]):void");
    }

    private C9612nl ThreeDS2ServiceInstance(List<setInterpolator> list) {
        int i = initialize + 47;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            C9612nl values2 = C9612nl.values();
            for (setInterpolator setinterpolator : list) {
                getSDKInfo = (initialize + 13) % 128;
                values2.ThreeDS2Service(valueOf(setinterpolator));
            }
            int i2 = getSDKInfo + 11;
            initialize = i2 % 128;
            if (i2 % 2 == 0) {
                return values2;
            }
            throw null;
        }
        C9612nl.values();
        list.iterator();
        throw null;
    }

    private C9640nr valueOf(setInterpolator setinterpolator) {
        C9640nr ThreeDS2ServiceInstance2 = C9640nr.ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        get(View.MeasureSpec.getSize(0) + 127, null, null, "\u008e\u008d\u008c\u0087\u0081\u0089\u008b\u008a\u0081\u0087\u0089\u0085\u0088\u0087\u0083", objArr);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr[0]).intern(), setinterpolator.ThreeDS2ServiceInstance());
        Object[] objArr2 = new Object[1];
        values("둪➟⪷袉菶\ueb1aꐰ퉆縣̨", View.resolveSizeAndState(0, 0, 0) + 10, objArr2);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr2[0]).intern(), setinterpolator.get());
        Object[] objArr3 = new Object[1];
        get((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, null, null, "\u0082\u008f\u0081\u0088\u008c\u0085\u008f\u0083\u0088", objArr3);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr3[0]).intern(), setinterpolator.values());
        Object[] objArr4 = new Object[1];
        values("\udbc5섩魆뼂ᵁ沾\uf65aᦳ菶\ueb1aꐰ퉆縣̨", Color.rgb(0, 0, 0) + 16777230, objArr4);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr4[0]).intern(), setinterpolator.valueOf());
        Object[] objArr5 = new Object[1];
        values("ᚔ\u0b00㣅灆訬깔", ((byte) KeyEvent.getModifierMetaStateMask()) + 6, objArr5);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr5[0]).intern(), setinterpolator.getSDKInfo());
        Object[] objArr6 = new Object[1];
        values("य\ud9f7鯦鶶\udcad荹衖橜쫀㵊", (ViewConfiguration.getWindowTouchSlop() >> 8) + 9, objArr6);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr6[0]).intern(), setinterpolator.ThreeDS2Service());
        if (!setinterpolator.getWarnings().isEmpty()) {
            Object[] objArr7 = new Object[1];
            values("㝸ꎸƯ\ueaa1㟼\uf864縣̨子ﲖ螣膵鮿츛뺒揓\udc2a칺衖橜쫀㵊", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 22, objArr7);
            ThreeDS2ServiceInstance2.values(((String) objArr7[0]).intern(), C9640nr.values(setinterpolator.getWarnings()));
            initialize = (getSDKInfo + 51) % 128;
        }
        int i = getSDKInfo + 51;
        initialize = i % 128;
        if (i % 2 != 0) {
            int i2 = 20 / 0;
        }
        return ThreeDS2ServiceInstance2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r9 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(int r6, int[] r7, java.lang.String r8, java.lang.String r9, java.lang.Object[] r10) {
        /*
            if (r9 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r9 = r9.getBytes(r0)
        L8:
            byte[] r9 = (byte[]) r9
            if (r8 == 0) goto L10
            char[] r8 = r8.toCharArray()
        L10:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.values
            monitor-enter(r0)
            char[] r1 = com.netcetera.threeds.sdk.infrastructure.setSecondaryProgress.valueOf     // Catch: java.lang.Throwable -> L42
            int r2 = com.netcetera.threeds.sdk.infrastructure.setSecondaryProgress.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            boolean r3 = com.netcetera.threeds.sdk.infrastructure.setSecondaryProgress.get     // Catch: java.lang.Throwable -> L42
            r4 = 0
            if (r3 == 0) goto L4d
            int r7 = r9.length     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r7     // Catch: java.lang.Throwable -> L42
            char[] r7 = new char[r7]     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r4     // Catch: java.lang.Throwable -> L42
        L25:
            int r8 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            if (r8 >= r3) goto L44
            int r8 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            r3 = r9[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + r6
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r7[r8] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
            goto L25
        L42:
            r6 = move-exception
            goto Lab
        L44:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r6
            return
        L4d:
            boolean r9 = com.netcetera.threeds.sdk.infrastructure.setSecondaryProgress.values     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L7e
            int r7 = r8.length     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r7     // Catch: java.lang.Throwable -> L42
            char[] r7 = new char[r7]     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r4     // Catch: java.lang.Throwable -> L42
        L58:
            int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            if (r9 >= r3) goto L75
            int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r6
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r7[r9] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
            goto L58
        L75:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r6
            return
        L7e:
            int r8 = r7.length     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service = r8     // Catch: java.lang.Throwable -> L42
            char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L42
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r4     // Catch: java.lang.Throwable -> L42
        L85:
            int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            if (r9 >= r3) goto La2
            int r9 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2Service     // Catch: java.lang.Throwable -> L42
            int r3 = r3 + (-1)
            int r5 = com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r5
            r3 = r7[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r6
            char r3 = r1[r3]     // Catch: java.lang.Throwable -> L42
            int r3 = r3 - r2
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L42
            r8[r9] = r3     // Catch: java.lang.Throwable -> L42
            int r5 = r5 + 1
            com.netcetera.threeds.sdk.infrastructure.ThreeDS2Service.InitializationCallback.ThreeDS2ServiceInstance = r5     // Catch: java.lang.Throwable -> L42
            goto L85
        La2:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r10[r4] = r6
            return
        Lab:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setSecondaryProgress.get(int, int[], java.lang.String, java.lang.String, java.lang.Object[]):void");
    }
}