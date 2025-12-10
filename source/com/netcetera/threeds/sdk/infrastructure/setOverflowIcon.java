package com.netcetera.threeds.sdk.infrastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class setOverflowIcon implements setSubtitleTextColor<List<setCursorVisible>, C9623nl> {
    private static int ThreeDS2Service = 0;
    private static int valueOf = 1;

    public List<setCursorVisible> ThreeDS2ServiceInstance(C9623nl c9623nl) {
        ArrayList arrayList = new ArrayList();
        ThreeDS2Service = ((-2) - (~(valueOf + 10))) % 128;
        int i = 0;
        while (i < c9623nl.ThreeDS2ServiceInstance()) {
            ThreeDS2Service = (valueOf + 59) % 128;
            Object values = c9623nl.values(i);
            if (values instanceof JSONObject) {
                int i2 = (-2) - ((valueOf + 36) ^ (-1));
                ThreeDS2Service = i2 % 128;
                if (i2 % 2 == 0) {
                    C9651nr ThreeDS2Service2 = C9651nr.ThreeDS2Service((JSONObject) values);
                    Iterator<String> it = ThreeDS2Service2.get();
                    while (it.hasNext()) {
                        String next = it.next();
                        arrayList.add(new setCursorVisible(next, ThreeDS2Service2.values(next)));
                        int i3 = ThreeDS2Service;
                        valueOf = (((i3 & (-22)) | ((~i3) & 21)) + ((i3 & 21) << 1)) % 128;
                    }
                } else {
                    C9651nr.ThreeDS2Service((JSONObject) values).get();
                    throw null;
                }
            }
            int i4 = ((i ^ 64) | (i & 64)) << 1;
            int i5 = -(((~i) & 64) | (i & (-65)));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            int i7 = i6 & (-63);
            int i8 = (i6 ^ (-63)) | i7;
            i = (i7 | i8) + (i7 & i8);
            int i9 = valueOf;
            int i10 = (i9 | 29) << 1;
            int i11 = -(i9 ^ 29);
            ThreeDS2Service = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
        }
        int i12 = ThreeDS2Service;
        int i13 = (i12 | 99) << 1;
        int i14 = -(((~i12) & 99) | (i12 & (-100)));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        valueOf = i15 % 128;
        if (i15 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitleTextColor
    public /* synthetic */ List<setCursorVisible> valueOf(C9623nl c9623nl) {
        int i = valueOf + 77;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        List<setCursorVisible> ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(c9623nl);
        if (i2 != 0) {
            int i3 = 23 / 0;
        }
        return ThreeDS2ServiceInstance;
    }
}
