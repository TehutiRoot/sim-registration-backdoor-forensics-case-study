package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ji */
/* loaded from: classes5.dex */
public class C9494ji implements setSubtitleTextColor<setCustomSelectionActionModeCallback, C9640nr> {
    private static int ThreeDS2Service = 1;
    private static int ThreeDS2ServiceInstance;
    public static int[] values = {319337923, -1057041721, 1656260070, -495528326, -1253986133, -1074539193, -1760317858, 808249643, 171021485, 112949154, 2128004486, 1359079355, -1660672430, -383090187, 1791422820, -58011574, -1150714395, -487797880};

    public setCustomSelectionActionModeCallback ThreeDS2Service(C9640nr c9640nr) {
        Object[] objArr = new Object[1];
        ThreeDS2Service(new int[]{1239259534, 1088951149, -1986866203, -1502815704, 1080150492, -625838398, 1539321721, 673412150, -1168666049, 171812439}, KeyEvent.normalizeMetaState(0) + 20, objArr);
        Boolean sDKInfo = c9640nr.getSDKInfo(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        ThreeDS2Service(new int[]{-1714905459, 249607378}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3, objArr2);
        String values2 = c9640nr.values(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        ThreeDS2Service(new int[]{1765575280, -515118293}, (-16777214) - Color.rgb(0, 0, 0), objArr3);
        String values3 = c9640nr.values(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        ThreeDS2Service(new int[]{1356790975, 934164416}, TextUtils.lastIndexOf("", '0', 0, 0) + 5, objArr4);
        setTitleMarginStart settitlemarginstart = new setTitleMarginStart(sDKInfo, values2, values3, c9640nr.values(((String) objArr4[0]).intern()));
        ThreeDS2Service = (ThreeDS2ServiceInstance + 117) % 128;
        return settitlemarginstart;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitleTextColor
    public /* synthetic */ setCustomSelectionActionModeCallback valueOf(C9640nr c9640nr) {
        int i = ThreeDS2Service + 107;
        ThreeDS2ServiceInstance = i % 128;
        C9640nr c9640nr2 = c9640nr;
        if (i % 2 == 0) {
            setCustomSelectionActionModeCallback ThreeDS2Service2 = ThreeDS2Service(c9640nr2);
            ThreeDS2ServiceInstance = (ThreeDS2Service + 43) % 128;
            return ThreeDS2Service2;
        }
        ThreeDS2Service(c9640nr2);
        throw null;
    }

    private static void ThreeDS2Service(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (onError.ThreeDS2ServiceInstance) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) values.clone();
                onError.valueOf = 0;
                while (true) {
                    int i2 = onError.valueOf;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        int i4 = iArr[i2 + 1];
                        char c3 = (char) (i4 >> 16);
                        cArr[2] = c3;
                        char c4 = (char) i4;
                        cArr[3] = c4;
                        onError.values = (c << 16) + c2;
                        onError.ThreeDS2Service = (c3 << 16) + c4;
                        onError.valueOf(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = onError.values ^ iArr2[i5];
                            onError.values = i6;
                            onError.ThreeDS2Service = onError.ThreeDS2Service(i6) ^ onError.ThreeDS2Service;
                            int i7 = onError.values;
                            onError.values = onError.ThreeDS2Service;
                            onError.ThreeDS2Service = i7;
                        }
                        int i8 = onError.values;
                        onError.values = onError.ThreeDS2Service;
                        onError.ThreeDS2Service = i8;
                        onError.ThreeDS2Service = i8 ^ iArr2[16];
                        onError.values ^= iArr2[17];
                        int i9 = onError.values;
                        cArr[0] = (char) (i9 >>> 16);
                        cArr[1] = (char) i9;
                        int i10 = onError.ThreeDS2Service;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        onError.valueOf(iArr2);
                        int i11 = onError.valueOf;
                        int i12 = i11 << 1;
                        cArr2[i12] = cArr[0];
                        cArr2[i12 + 1] = cArr[1];
                        cArr2[i12 + 2] = cArr[2];
                        cArr2[i12 + 3] = cArr[3];
                        onError.valueOf = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str;
    }
}