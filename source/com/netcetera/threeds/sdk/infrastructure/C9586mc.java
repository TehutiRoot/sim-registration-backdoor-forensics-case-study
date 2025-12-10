package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.app.FragmentTransaction;
import java.util.UUID;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mc */
/* loaded from: classes5.dex */
public class C9586mc implements InterfaceC9588me<Activity> {
    private static int ThreeDS2Service = 1;
    private static int get;
    private String values;

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9588me
    public void ThreeDS2ServiceInstance(Activity activity, InterfaceC9602ms interfaceC9602ms) {
        DialogFragmentC9595ml dialogFragmentC9595ml = new DialogFragmentC9595ml();
        dialogFragmentC9595ml.ThreeDS2Service(interfaceC9602ms);
        dialogFragmentC9595ml.ThreeDS2Service(C9596mm.valueOf());
        dialogFragmentC9595ml.initialize();
        interfaceC9602ms.ThreeDS2ServiceInstance(dialogFragmentC9595ml);
        this.values = UUID.randomUUID().toString();
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        beginTransaction.add(dialogFragmentC9595ml, this.values);
        beginTransaction.commitAllowingStateLoss();
        int i = get + 15;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9588me
    public boolean ThreeDS2ServiceInstance(Activity activity) {
        int i = get;
        int i2 = i & 5;
        int i3 = ((i | 5) & (~i2)) + (i2 << 1);
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 != 0) {
            boolean z = false;
            if (activity.getFragmentManager().findFragmentByTag((String) C9669om.ThreeDS2Service(this.values, "")) != null) {
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
        activity.getFragmentManager().findFragmentByTag((String) C9669om.ThreeDS2Service(this.values, ""));
        throw null;
    }
}
