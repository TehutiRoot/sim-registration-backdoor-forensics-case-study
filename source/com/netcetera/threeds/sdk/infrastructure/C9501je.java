package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setTitleMarginEnd;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.je */
/* loaded from: classes5.dex */
public class C9501je implements InterfaceC9499jc {
    private static int ThreeDS2ServiceInstance = 0;
    private static int get = 1;
    private setTitleMarginEnd ThreeDS2Service;
    private setTitleMarginEnd.ThreeDS2Service values = setTitleMarginEnd.ThreeDS2Service.ThreeDS2Service;

    public void ThreeDS2Service(setTitleMarginEnd.ThreeDS2Service threeDS2Service) {
        int i = get;
        int i2 = ((i ^ 88) + ((i & 88) << 1)) - 1;
        ThreeDS2ServiceInstance = i2 % 128;
        int i3 = i2 % 2;
        this.values = threeDS2Service;
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9499jc
    public void valueOf(setCustomSelectionActionModeCallback setcustomselectionactionmodecallback) {
        int i = get;
        ThreeDS2ServiceInstance = ((-2) - (~(((i | 22) << 1) - (i ^ 22)))) % 128;
        if (setcustomselectionactionmodecallback instanceof setTitleMarginEnd) {
            setTitleMarginEnd settitlemarginend = new setTitleMarginEnd();
            settitlemarginend.ThreeDS2Service(this.values);
            setTitleMarginEnd settitlemarginend2 = (setTitleMarginEnd) setcustomselectionactionmodecallback;
            settitlemarginend.ThreeDS2ServiceInstance(settitlemarginend2.getWarnings());
            settitlemarginend.ThreeDS2Service(settitlemarginend2.values());
            this.ThreeDS2Service = settitlemarginend;
            int i2 = get;
            int i3 = i2 & 91;
            int i4 = (i2 | 91) & (~i3);
            int i5 = i3 << 1;
            ThreeDS2ServiceInstance = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
        }
        int i6 = get;
        int i7 = i6 & 31;
        int i8 = ((i6 | 31) & (~i7)) + (i7 << 1);
        ThreeDS2ServiceInstance = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9499jc
    public setCustomSelectionActionModeCallback values(put putVar) {
        int i = get;
        int i2 = (i & (-88)) | ((~i) & 87);
        int i3 = (i & 87) << 1;
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        ThreeDS2ServiceInstance = i4;
        if (this.ThreeDS2Service != null) {
            get = ((i4 & 79) + (i4 | 79)) % 128;
            if (put.ThreeDS2ServiceInstance.equals(putVar)) {
                int i5 = ThreeDS2ServiceInstance + 115;
                get = i5 % 128;
                if (i5 % 2 != 0) {
                    if (!setTitleMarginEnd.ThreeDS2Service.ThreeDS2Service.equals(this.ThreeDS2Service.getSDKInfo())) {
                        int i6 = ThreeDS2ServiceInstance;
                        get = (((i6 | 37) << 1) - (i6 ^ 37)) % 128;
                        if (setTitleMarginEnd.ThreeDS2Service.valueOf.equals(this.ThreeDS2Service.getSDKInfo())) {
                            int i7 = get;
                            int i8 = i7 & 9;
                            int i9 = -(-(i7 | 9));
                            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                            ThreeDS2ServiceInstance = i10 % 128;
                            if (i10 % 2 == 0) {
                                this.ThreeDS2Service.ThreeDS2ServiceInstance(null);
                                int i11 = ThreeDS2ServiceInstance;
                                int i12 = i11 & 23;
                                int i13 = -(-((i11 ^ 23) | i12));
                                get = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
                            } else {
                                this.ThreeDS2Service.ThreeDS2ServiceInstance(null);
                                throw null;
                            }
                        }
                        setTitleMarginEnd settitlemarginend = this.ThreeDS2Service;
                        int i14 = ThreeDS2ServiceInstance;
                        int i15 = i14 & 51;
                        get = ((i15 - (~(-(-((i14 ^ 51) | i15))))) - 1) % 128;
                        return settitlemarginend;
                    }
                } else {
                    setTitleMarginEnd.ThreeDS2Service.ThreeDS2Service.equals(this.ThreeDS2Service.getSDKInfo());
                    throw null;
                }
            }
        }
        int i16 = get;
        int i17 = i16 & 103;
        ThreeDS2ServiceInstance = ((((i16 ^ 103) | i17) << 1) - ((i16 | 103) & (~i17))) % 128;
        return null;
    }
}
