package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public final class setContentInsetStartWithNavigation implements setTouchscreenBlocksFocus {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;
    private final Runnable values;

    public setContentInsetStartWithNavigation(Runnable runnable) {
        this.values = runnable;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTouchscreenBlocksFocus
    public void ThreeDS2Service(setId setid) {
        int i = get;
        int i2 = ((i & (-40)) | ((~i) & 39)) + ((i & 39) << 1);
        ThreeDS2ServiceInstance = i2 % 128;
        int i3 = i2 % 2;
        this.values.run();
        if (i3 != 0) {
            int i4 = ThreeDS2ServiceInstance;
            int i5 = i4 & 79;
            int i6 = (i4 ^ 79) | i5;
            get = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
            return;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTouchscreenBlocksFocus
    public void ThreeDS2ServiceInstance(setAllCaps setallcaps) {
        int i = get;
        int i2 = (i ^ 73) + ((i & 73) << 1);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            this.values.run();
            int i3 = ThreeDS2ServiceInstance + 39;
            get = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            throw null;
        }
        this.values.run();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTouchscreenBlocksFocus
    public void get(setPopupTheme setpopuptheme) {
        int i = get;
        int i2 = (i ^ 21) + ((i & 21) << 1);
        ThreeDS2ServiceInstance = i2 % 128;
        int i3 = i2 % 2;
        this.values.run();
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        int i5 = get;
        int i6 = i5 & 103;
        ThreeDS2ServiceInstance = (((((i5 ^ 103) | i6) << 1) - (~(-((i5 | 103) & (~i6))))) - 1) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTouchscreenBlocksFocus
    public void valueOf(setCustomInsertionActionModeCallback setcustominsertionactionmodecallback) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 59;
        int i3 = -(-((i ^ 59) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        get = i4 % 128;
        int i5 = i4 % 2;
        this.values.run();
        if (i5 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTouchscreenBlocksFocus
    public void values(setId setid) {
        int i = ThreeDS2ServiceInstance;
        get = (((((i ^ 81) | (i & 81)) << 1) - (~(-(((~i) & 81) | (i & (-82)))))) - 1) % 128;
        this.values.run();
        int i2 = ThreeDS2ServiceInstance;
        int i3 = (((i2 ^ 115) | (i2 & 115)) << 1) - (((~i2) & 115) | (i2 & (-116)));
        get = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 44 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTouchscreenBlocksFocus
    public void valueOf(setId setid) {
        int i = get;
        int i2 = i | 109;
        int i3 = i2 << 1;
        int i4 = -((~(i & 109)) & i2);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        ThreeDS2ServiceInstance = i5 % 128;
        int i6 = i5 % 2;
        this.values.run();
        if (i6 == 0) {
            throw null;
        }
        int i7 = ThreeDS2ServiceInstance;
        int i8 = i7 & 7;
        int i9 = (i7 ^ 7) | i8;
        get = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
    }
}
