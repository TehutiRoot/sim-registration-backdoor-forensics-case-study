package com.netcetera.threeds.sdk.infrastructure;

import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setLineSpacing;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.dh */
/* loaded from: classes5.dex */
public class C9321dh implements keys {
    private static int ThreeDS2ServiceInstance = 1;
    public static int get = 187;
    private static int values;
    private final InterfaceC9641ns ThreeDS2Service = C9642nt.ThreeDS2ServiceInstance(C9321dh.class);
    private final isEmpty valueOf;

    public C9321dh(isEmpty isempty) {
        this.valueOf = isempty;
    }

    private void ThreeDS2Service(setLineSpacing.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        int i = ThreeDS2ServiceInstance + 15;
        values = i % 128;
        if (i % 2 != 0) {
            TextUtils.getOffsetAfter("", 1);
            Process.getGidForName("");
            CdmaCellLocation.convertQuartSecToDecDegrees(1);
            threeDS2ServiceInstance.get(EnumC9560load.ThreeDS2ServiceInstance);
        } else {
            TextUtils.getOffsetAfter("", 0);
            Process.getGidForName("");
            CdmaCellLocation.convertQuartSecToDecDegrees(0);
            threeDS2ServiceInstance.get(EnumC9560load.ThreeDS2ServiceInstance);
        }
        int i2 = values + 7;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.keys
    public void valueOf(setLineSpacing.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        int i = ThreeDS2ServiceInstance;
        int i2 = (i + 55) % 128;
        values = i2;
        isEmpty isempty = this.valueOf;
        if (isempty == null) {
            int i3 = i2 + 9;
            ThreeDS2ServiceInstance = i3 % 128;
            if (i3 % 2 == 0) {
                ThreeDS2Service(threeDS2ServiceInstance);
                int i4 = 27 / 0;
            } else {
                ThreeDS2Service(threeDS2ServiceInstance);
            }
            values = (ThreeDS2ServiceInstance + 119) % 128;
        } else if (isempty instanceof C9262bi) {
            int i5 = i + 115;
            values = i5 % 128;
            if (i5 % 2 == 0) {
                String valueOf = ((C9262bi) isempty).valueOf();
                if (C9658om.values((CharSequence) valueOf)) {
                    ThreeDS2ServiceInstance = (values + 107) % 128;
                    ThreeDS2Service(threeDS2ServiceInstance);
                    return;
                }
                ViewConfiguration.getZoomControlsTimeout();
                AudioTrack.getMinVolume();
                TypedValue.complexToFraction(0, 0.0f, 0.0f);
                threeDS2ServiceInstance.ThreeDS2ServiceInstance(valueOf);
                return;
            }
            C9658om.values((CharSequence) ((C9262bi) isempty).valueOf());
            throw null;
        }
    }
}