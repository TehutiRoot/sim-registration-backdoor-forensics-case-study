package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;

/* loaded from: classes5.dex */
public class setMultiChoiceModeListener implements setFastScrollEnabled {
    private static int ThreeDS2Service = 0;
    public static char[] ThreeDS2ServiceInstance = {13772, 13776, 13765, 13743, 13774, 13790, 13739, 13773, 13775};
    private static int get = 1;
    public static char valueOf = 3;

    @Override // com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled
    public setFastScrollEnabled.valueOf ThreeDS2ServiceInstance() {
        int i = get + 9;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            return setFastScrollEnabled.valueOf.get;
        }
        setFastScrollEnabled.valueOf valueof = setFastScrollEnabled.valueOf.valueOf;
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled
    public setFastScrollEnabled.valueOf valueOf(String str) {
        int i = get + 25;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            setFastScrollEnabled.valueOf valueof = setFastScrollEnabled.valueOf.valueOf;
            if (valueof.ThreeDS2Service().equals(str)) {
                int i2 = ThreeDS2Service + 27;
                get = i2 % 128;
                if (i2 % 2 != 0) {
                    return valueof;
                }
                throw null;
            }
            setFastScrollEnabled.valueOf valueof2 = setFastScrollEnabled.valueOf.ThreeDS2ServiceInstance;
            if (valueof2.ThreeDS2Service().equals(str)) {
                return valueof2;
            }
            setFastScrollEnabled.valueOf valueof3 = setFastScrollEnabled.valueOf.get;
            if (!valueof3.ThreeDS2Service().equals(str)) {
                return null;
            }
            return valueof3;
        }
        setFastScrollEnabled.valueOf.valueOf.ThreeDS2Service().equals(str);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled
    public setFastScrollEnabled.ThreeDS2ServiceInstance values() {
        Object obj;
        int i = get + 41;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            values(2 >>> View.combineMeasuredStates(0, 1), "\u0003\u0002\u0000\b㘌", (byte) (View.resolveSize(0, 1) + 31), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            values(View.combineMeasuredStates(0, 0) + 5, "\u0003\u0002\u0000\b㘌", (byte) (93 - View.resolveSize(0, 0)), objArr2);
            obj = objArr2[0];
        }
        return setFastScrollEnabled.ThreeDS2ServiceInstance.valueOf(((String) obj).intern());
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r11 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void values(int r10, java.lang.String r11, byte r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setMultiChoiceModeListener.values(int, java.lang.String, byte, java.lang.Object[]):void");
    }
}
