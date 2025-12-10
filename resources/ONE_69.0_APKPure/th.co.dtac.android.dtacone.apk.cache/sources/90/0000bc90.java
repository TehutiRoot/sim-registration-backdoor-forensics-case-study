package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setNavigationIcon;
import com.netcetera.threeds.sdk.infrastructure.setTitleMarginEnd;
import java.util.List;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.iz */
/* loaded from: classes5.dex */
public class C9484iz implements InterfaceC9489jd {
    private static int ThreeDS2Service = 1;
    private static int valueOf;
    private final C9493jh get;
    private final C9490je values;

    public C9484iz(C9490je c9490je, C9493jh c9493jh) {
        this.values = c9490je;
        this.get = c9493jh;
    }

    public static InterfaceC9489jd get() {
        C9484iz c9484iz = new C9484iz(new C9490je(), C9493jh.valueOf());
        int i = ThreeDS2Service;
        int i2 = ((i ^ 22) + ((i & 22) << 1)) - 1;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return c9484iz;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9487jb
    public List<setCustomSelectionActionModeCallback> ThreeDS2Service(C9612nl c9612nl) {
        int i = ThreeDS2Service;
        valueOf = ((((i ^ 93) | (i & 93)) << 1) - (((~i) & 93) | (i & (-94)))) % 128;
        List<setCustomSelectionActionModeCallback> ThreeDS2Service2 = this.get.ThreeDS2Service(c9612nl);
        int i2 = ThreeDS2Service;
        int i3 = (((i2 & (-16)) | ((~i2) & 15)) - (~((i2 & 15) << 1))) - 1;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9488jc
    public void valueOf(setCustomSelectionActionModeCallback setcustomselectionactionmodecallback) {
        int i = ThreeDS2Service;
        int i2 = ((i ^ 7) | (i & 7)) << 1;
        int i3 = -(((~i) & 7) | (i & (-8)));
        int i4 = (i2 & i3) + (i3 | i2);
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        this.values.valueOf(setcustomselectionactionmodecallback);
        if (i5 != 0) {
            throw null;
        }
        int i6 = valueOf;
        ThreeDS2Service = (((i6 | 35) << 1) - (i6 ^ 35)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9489jd
    public void values(setTitleMarginEnd.ThreeDS2Service threeDS2Service) {
        int i = ThreeDS2Service;
        int i2 = i & 29;
        valueOf = (((((i ^ 29) | i2) << 1) - (~(-((i | 29) & (~i2))))) - 1) % 128;
        this.values.ThreeDS2Service(threeDS2Service);
        this.get.get(threeDS2Service);
        int i3 = valueOf;
        int i4 = i3 ^ 15;
        int i5 = ((i3 & 15) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        ThreeDS2Service = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 7 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9487jb
    public void valueOf(setNavigationIcon.valueOf valueof, put putVar, List<setCustomSelectionActionModeCallback> list) {
        int i = valueOf;
        int i2 = ((i ^ 58) + ((i & 58) << 1)) - 1;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            this.get.valueOf(valueof, putVar, list);
            int i3 = 36 / 0;
        } else {
            this.get.valueOf(valueof, putVar, list);
        }
        int i4 = ThreeDS2Service;
        valueOf = ((((i4 | 36) << 1) - (i4 ^ 36)) - 1) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9488jc
    public setCustomSelectionActionModeCallback values(put putVar) {
        valueOf = (ThreeDS2Service + 55) % 128;
        setCustomSelectionActionModeCallback values = this.values.values(putVar);
        int i = valueOf;
        int i2 = (i ^ 113) + ((i & 113) << 1);
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            return values;
        }
        throw null;
    }
}