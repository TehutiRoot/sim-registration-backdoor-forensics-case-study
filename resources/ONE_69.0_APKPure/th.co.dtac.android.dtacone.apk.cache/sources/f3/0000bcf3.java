package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.app.FragmentTransaction;
import java.util.UUID;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mc */
/* loaded from: classes5.dex */
public class C9575mc implements InterfaceC9577me<Activity> {
    private static int ThreeDS2Service = 1;
    private static int get;
    private String values;

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9577me
    public void ThreeDS2ServiceInstance(Activity activity, InterfaceC9591ms interfaceC9591ms) {
        DialogFragmentC9584ml dialogFragmentC9584ml = new DialogFragmentC9584ml();
        dialogFragmentC9584ml.ThreeDS2Service(interfaceC9591ms);
        dialogFragmentC9584ml.ThreeDS2Service(C9585mm.valueOf());
        dialogFragmentC9584ml.initialize();
        interfaceC9591ms.ThreeDS2ServiceInstance(dialogFragmentC9584ml);
        this.values = UUID.randomUUID().toString();
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        beginTransaction.add(dialogFragmentC9584ml, this.values);
        beginTransaction.commitAllowingStateLoss();
        int i = get + 15;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9577me
    public boolean ThreeDS2ServiceInstance(Activity activity) {
        int i = get;
        int i2 = i & 5;
        int i3 = ((i | 5) & (~i2)) + (i2 << 1);
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 != 0) {
            boolean z = false;
            if (activity.getFragmentManager().findFragmentByTag((String) C9658om.ThreeDS2Service(this.values, "")) != null) {
                int i4 = ThreeDS2Service;
                int i5 = i4 ^ 113;
                int i6 = ((i4 & 113) | i5) << 1;
                int i7 = -i5;
                int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
                get = i8 % 128;
                if (i8 % 2 == 0) {
                    z = true;
                }
            } else {
                ThreeDS2Service = (get + 111) % 128;
            }
            int i9 = ThreeDS2Service;
            get = (((i9 | 79) << 1) - (i9 ^ 79)) % 128;
            return z;
        }
        activity.getFragmentManager().findFragmentByTag((String) C9658om.ThreeDS2Service(this.values, ""));
        throw null;
    }
}