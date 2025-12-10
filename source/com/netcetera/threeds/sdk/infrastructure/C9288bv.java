package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.Gravity;
import android.view.KeyEvent;
import android.widget.CheckBox;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bv */
/* loaded from: classes5.dex */
public class C9288bv extends storeToXML {
    private static int ThreeDS2Service = 0;
    private static int get = 1;
    public static int[] valueOf = {-1722589392, 363861946, -772079611, 1341649186, -2041911936, 1301139042, 1713338263, 3596174, 2050909193, 697447726, 139449583, -1065322442, -1526963496, -1375887616, 496425172, -1100542473, -1525370867, -889532290};

    public C9288bv(Context context, InterfaceC9511jo interfaceC9511jo) {
        super(context, interfaceC9511jo);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML
    public keys ThreeDS2ServiceInstance(keys keysVar) {
        C9374es c9374es = new C9374es(keysVar, computeIfPresent.get);
        int i = ThreeDS2Service + 7;
        get = i % 128;
        if (i % 2 != 0) {
            return c9374es;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML, com.netcetera.threeds.sdk.infrastructure.InterfaceC9367elements
    public /* bridge */ /* synthetic */ keys get(keys keysVar) {
        ThreeDS2Service = (get + 7) % 128;
        keys keysVar2 = super.get(keysVar);
        ThreeDS2Service = (get + 101) % 128;
        return keysVar2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML, com.netcetera.threeds.sdk.infrastructure.save
    public /* bridge */ /* synthetic */ void valueOf(InterfaceC9370eo interfaceC9370eo) {
        ThreeDS2Service = (get + 47) % 128;
        super.valueOf(interfaceC9370eo);
        get = (ThreeDS2Service + 51) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML, com.netcetera.threeds.sdk.infrastructure.save
    public /* synthetic */ void values(InterfaceC9373er interfaceC9373er) {
        int i = get + 63;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        super.values(interfaceC9373er);
        if (i2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML
    public String ThreeDS2ServiceInstance() {
        Object obj;
        int i = ThreeDS2Service + 91;
        get = i % 128;
        int[] iArr = {58489992, 1336329588, 1673760144, 1278207108, 1038873614, -1629430946, -69431017, 1043301129, 1062771091, 358038207, -1677037470, 1879502608, -573367016, 1780046214, -925590892, -782442397};
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            get(iArr, Gravity.getAbsoluteGravity(1, 1) * 125, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            get(iArr, Gravity.getAbsoluteGravity(0, 0) + 31, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML
    public String get(setAllCaps setallcaps) {
        ThreeDS2Service = (get + 15) % 128;
        String unionSchemeConfiguration = setallcaps.unionSchemeConfiguration();
        int i = get + 55;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            return unionSchemeConfiguration;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML, com.netcetera.threeds.sdk.infrastructure.contains
    public /* bridge */ /* synthetic */ void valueOf(setAllCaps setallcaps) {
        ThreeDS2Service = (get + 47) % 128;
        super.valueOf(setallcaps);
        get = (ThreeDS2Service + 47) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML
    public keys values(keys keysVar) {
        C9374es c9374es = new C9374es(keysVar, computeIfPresent.valueOf);
        get = (ThreeDS2Service + 15) % 128;
        return c9374es;
    }

    private static void get(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (onError.ThreeDS2ServiceInstance) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) valueOf.clone();
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

    @Override // com.netcetera.threeds.sdk.infrastructure.storeToXML
    public void ThreeDS2ServiceInstance(CheckBox checkBox) {
        Object obj;
        int i = ThreeDS2Service + 93;
        get = i % 128;
        int[] iArr = {344190766, -470946042, 1190147270, -651521655, 615540544, 506810619, 1418931164, 2035194533, -1317744971, 847949963, -1781547621, -312035635, -1203736053, -1156054145, 1809241260, 604348645, 1061499419, -2108933499};
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            get(iArr, 41 >>> (KeyEvent.getMaxKeyCode() >>> 15), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            get(iArr, 35 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
            obj = objArr2[0];
        }
        values(checkBox, ((String) obj).intern());
    }
}
