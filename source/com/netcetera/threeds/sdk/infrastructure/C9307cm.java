package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.PointF;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.C9376eu;
import com.netcetera.threeds.sdk.infrastructure.setLineSpacing;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cm */
/* loaded from: classes5.dex */
public class C9307cm implements keys {
    public static long ThreeDS2ServiceInstance = -3308825767690551762L;
    public static char[] get = {4547, 12234, 28064, 43887, 59737, 9989, 25840, 41647, 57562, 15964, 31762, 47677, 64494, 14844, 30529, 46455, 62248, 12452, 20208, 35977, 51838, 2080, 17947, 34778, 50682, 899, 16719, 40740, 56554, 6790, 22734, 38512, 54334, 4617, 21498, 37252, 44947, 60760, 11071, 26829, 42708, 58528, 8820, 24649, 48728, 65468, 15797, 31621, 47366, 63332, 13593, 29391, 45232, 52815, 3153, 18950, 35822, 51677, 1928, 17765, 33575, 49478, 7822, 23715, 39543, 55304, 5750, 22511, 38365, 54158, 4447, 12088, 27914, 43719, 59570, 9873, 25686, 41513, 58365, 8578, 32714, 48511, 64331};
    private static int getSDKInfo = 1;
    private static int initialize;
    private final isEmpty ThreeDS2Service;
    private final String getSDKVersion;
    private final InterfaceC9652ns valueOf = C9653nt.ThreeDS2ServiceInstance(C9307cm.class);
    private final String values;

    public C9307cm(isEmpty isempty, String str, String str2) {
        this.ThreeDS2Service = isempty;
        this.values = str;
        this.getSDKVersion = str2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.keys
    public void valueOf(setLineSpacing.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        String valueOf;
        isEmpty isempty = this.ThreeDS2Service;
        if (!(isempty instanceof C9273bi)) {
            valueOf = null;
        } else {
            valueOf = ((C9273bi) isempty).valueOf();
        }
        KeyEvent.normalizeMetaState(0);
        PointF.length(0.0f, 0.0f);
        ViewConfiguration.getFadingEdgeLength();
        if (!C9376eu.values.ThreeDS2Service.get().equals(this.values)) {
            getSDKInfo = (initialize + 33) % 128;
            threeDS2ServiceInstance.ThreeDS2Service(valueOf);
            initialize = (getSDKInfo + 31) % 128;
        }
        threeDS2ServiceInstance.valueOf(this.values);
        threeDS2ServiceInstance.get(this.getSDKVersion);
    }
}
