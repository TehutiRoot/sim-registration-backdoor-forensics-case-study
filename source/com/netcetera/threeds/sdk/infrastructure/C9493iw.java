package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setLineSpacing;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.iw */
/* loaded from: classes5.dex */
public class C9493iw {
    private static int ThreeDS2Service = 0;
    private static int cleanup = 1;
    private final InterfaceC9398fv ThreeDS2ServiceInstance;
    private final setPointerIcon get;
    private final setHighlightColor valueOf;
    private final InterfaceC9499jc values;

    public C9493iw(setHighlightColor sethighlightcolor, setPointerIcon setpointericon, InterfaceC9398fv interfaceC9398fv, InterfaceC9499jc interfaceC9499jc) {
        this.valueOf = sethighlightcolor;
        this.get = setpointericon;
        this.ThreeDS2ServiceInstance = interfaceC9398fv;
        this.values = interfaceC9499jc;
    }

    private setLineSpacing.ThreeDS2ServiceInstance ThreeDS2Service() {
        setLineSpacing.ThreeDS2ServiceInstance valueOf = new setLineSpacing.ThreeDS2ServiceInstance(this.valueOf.ThreeDS2Service(), this.valueOf.get(), (put) getCause.ThreeDS2ServiceInstance(put.class, this.valueOf.getSDKInfo().ThreeDS2Service()), this.valueOf.cleanup(), this.valueOf.getWarnings(), this.valueOf.getSDKVersion(), this.values).valueOf(new setTitleMarginEnd());
        int i = cleanup;
        int i2 = (i & 65) + (i | 65);
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            return valueOf;
        }
        throw null;
    }

    public static C9493iw get(setHighlightColor sethighlightcolor, InterfaceC9398fv interfaceC9398fv, InterfaceC9499jc interfaceC9499jc) {
        C9493iw c9493iw = new C9493iw(sethighlightcolor, new setPointerIcon(), interfaceC9398fv, interfaceC9499jc);
        int i = cleanup;
        int i2 = i & 47;
        int i3 = (i | 47) & (~i2);
        int i4 = -(-(i2 << 1));
        ThreeDS2Service = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        return c9493iw;
    }

    public setCustomInsertionActionModeCallback ThreeDS2ServiceInstance(setId setid) {
        int i = ThreeDS2Service;
        int i2 = i & 125;
        int i3 = -(-((i ^ 125) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        cleanup = i4 % 128;
        if (i4 % 2 != 0) {
            entrySet valueOf = this.get.valueOf(setid.ThreeDS2Service());
            if (valueOf == null) {
                int i5 = cleanup;
                int i6 = i5 & CameraActivity.REQUEST_CODE;
                int i7 = -(-(i5 | CameraActivity.REQUEST_CODE));
                int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                ThreeDS2Service = i8 % 128;
                if (i8 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            String valueOf2 = valueOf.valueOf();
            setSubtitleTextAppearance setsubtitletextappearance = new setSubtitleTextAppearance(keySet.ThreeDS2Service, this.valueOf.ThreeDS2Service(), this.valueOf.cleanup(), put.ThreeDS2Service(this.ThreeDS2ServiceInstance.ThreeDS2Service()), this.valueOf.get(), null, valueOf, remove.get, valueOf2, (String) C9669om.cleanup(setid.getMessage(), valueOf2), keySet.ThreeDS2ServiceInstance);
            int i9 = cleanup + 119;
            ThreeDS2Service = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 41 / 0;
            }
            return setsubtitletextappearance;
        }
        this.get.valueOf(setid.ThreeDS2Service());
        throw null;
    }

    public setLineSpacing valueOf() {
        setLineSpacing values;
        int i = cleanup;
        int i2 = i & 37;
        int i3 = (i2 - (~((i ^ 37) | i2))) - 1;
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 != 0) {
            values = ThreeDS2Service().values();
            int i4 = 23 / 0;
        } else {
            values = ThreeDS2Service().values();
        }
        int i5 = cleanup;
        int i6 = (i5 & 66) + (i5 | 66);
        ThreeDS2Service = ((~i6) + (i6 << 1)) % 128;
        return values;
    }

    public setLineSpacing valueOf(keys keysVar) {
        int i = cleanup;
        int i2 = i ^ 113;
        int i3 = -(-((i & 113) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 == 0) {
            setLineSpacing.ThreeDS2ServiceInstance ThreeDS2Service2 = ThreeDS2Service();
            keysVar.valueOf(ThreeDS2Service2);
            return ThreeDS2Service2.values();
        }
        setLineSpacing.ThreeDS2ServiceInstance ThreeDS2Service3 = ThreeDS2Service();
        keysVar.valueOf(ThreeDS2Service3);
        ThreeDS2Service3.values();
        throw null;
    }
}
