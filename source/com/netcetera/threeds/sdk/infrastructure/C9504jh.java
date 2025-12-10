package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setNavigationIcon;
import com.netcetera.threeds.sdk.infrastructure.setTitleMarginEnd;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.jh */
/* loaded from: classes5.dex */
public class C9504jh implements InterfaceC9498jb {
    private static int get = 0;
    private static int valueOf = 1;
    private final C9503jg ThreeDS2Service;
    private final C9505ji values;

    public C9504jh(C9505ji c9505ji, C9503jg c9503jg) {
        this.values = c9505ji;
        this.ThreeDS2Service = c9503jg;
    }

    public static C9504jh valueOf() {
        C9504jh c9504jh = new C9504jh(new C9505ji(), new C9503jg());
        get = (valueOf + 101) % 128;
        return c9504jh;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9498jb
    public List<setCustomSelectionActionModeCallback> ThreeDS2Service(C9623nl c9623nl) {
        ArrayList arrayList = new ArrayList();
        get = (valueOf + 83) % 128;
        int i = 0;
        while (i < c9623nl.ThreeDS2ServiceInstance()) {
            int i2 = get;
            int i3 = i2 ^ 53;
            int i4 = ((i2 & 53) | i3) << 1;
            int i5 = -i3;
            int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
            valueOf = i6 % 128;
            if (i6 % 2 == 0) {
                C9651nr c9651nr = C9651nr.get(c9623nl.valueOf(i));
                arrayList.add((setCustomSelectionActionModeCallback) C9664oh.ThreeDS2Service(this.ThreeDS2Service.values(c9651nr), this.values.ThreeDS2Service(c9651nr)));
                i = ((i & 36) << 1) + ((i & (-37)) | ((~i) & 36));
            } else {
                C9651nr c9651nr2 = C9651nr.get(c9623nl.valueOf(i));
                arrayList.add((setCustomSelectionActionModeCallback) C9664oh.ThreeDS2Service(this.ThreeDS2Service.values(c9651nr2), this.values.ThreeDS2Service(c9651nr2)));
                int i7 = i & 104;
                int i8 = i | 104;
                int i9 = (i7 & i8) + (i8 | i7);
                i = (-2) - (~((i9 & (-102)) + (i9 | (-102))));
            }
        }
        int i10 = valueOf;
        int i11 = (((i10 | 62) << 1) - (i10 ^ 62)) - 1;
        get = i11 % 128;
        if (i11 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    public void get(setTitleMarginEnd.ThreeDS2Service threeDS2Service) {
        int i = valueOf;
        get = ((((i | 54) << 1) - (i ^ 54)) - 1) % 128;
        this.ThreeDS2Service.ThreeDS2Service(threeDS2Service);
        int i2 = get;
        int i3 = (i2 ^ 61) + ((i2 & 61) << 1);
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 88 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9498jb
    public void valueOf(setNavigationIcon.valueOf valueof, put putVar, List<setCustomSelectionActionModeCallback> list) {
        int i = valueOf + 4;
        get = ((~i) + (i << 1)) % 128;
        this.ThreeDS2Service.ThreeDS2ServiceInstance(valueof, putVar, list);
        int i2 = get;
        int i3 = (i2 & (-56)) | ((~i2) & 55);
        int i4 = -(-((i2 & 55) << 1));
        valueOf = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
    }
}
