package com.netcetera.threeds.sdk.infrastructure;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import java.util.UUID;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mf */
/* loaded from: classes5.dex */
public class C9578mf implements InterfaceC9577me<AppCompatActivity> {
    private static int valueOf = 0;
    private static int values = 1;
    private String ThreeDS2ServiceInstance;

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9577me
    public /* synthetic */ void ThreeDS2ServiceInstance(AppCompatActivity appCompatActivity, InterfaceC9591ms interfaceC9591ms) {
        int i = valueOf;
        int i2 = i & 57;
        int i3 = (i | 57) & (~i2);
        int i4 = -(-(i2 << 1));
        values = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        values(appCompatActivity, interfaceC9591ms);
        int i5 = values;
        int i6 = i5 & 35;
        valueOf = ((((i5 ^ 35) | i6) << 1) - ((i5 | 35) & (~i6))) % 128;
    }

    public void values(AppCompatActivity appCompatActivity, InterfaceC9591ms interfaceC9591ms) {
        C9592mt c9592mt = new C9592mt();
        c9592mt.ThreeDS2ServiceInstance(interfaceC9591ms);
        c9592mt.valueOf(C9585mm.valueOf());
        c9592mt.initialize();
        interfaceC9591ms.ThreeDS2ServiceInstance(c9592mt);
        this.ThreeDS2ServiceInstance = UUID.randomUUID().toString();
        FragmentTransaction beginTransaction = appCompatActivity.getSupportFragmentManager().beginTransaction();
        beginTransaction.add(c9592mt, this.ThreeDS2ServiceInstance);
        beginTransaction.commitAllowingStateLoss();
        int i = valueOf + 124;
        values = ((~i) + (i << 1)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9577me
    public /* bridge */ /* synthetic */ boolean ThreeDS2ServiceInstance(AppCompatActivity appCompatActivity) {
        int i = valueOf;
        values = (((i ^ 66) + ((i & 66) << 1)) - 1) % 128;
        boolean ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance2(appCompatActivity);
        int i2 = values;
        int i3 = i2 & 17;
        int i4 = (i2 ^ 17) | i3;
        valueOf = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
        return ThreeDS2ServiceInstance2;
    }

    /* renamed from: ThreeDS2ServiceInstance  reason: avoid collision after fix types in other method */
    public boolean ThreeDS2ServiceInstance2(AppCompatActivity appCompatActivity) {
        int i = values;
        boolean z = true;
        valueOf = ((((i ^ 47) | (i & 47)) << 1) - (((~i) & 47) | (i & (-48)))) % 128;
        if (appCompatActivity.getSupportFragmentManager().findFragmentByTag((String) C9658om.ThreeDS2Service(this.ThreeDS2ServiceInstance, "")) != null) {
            int i2 = valueOf;
            values = ((i2 ^ 93) + ((i2 & 93) << 1)) % 128;
        } else {
            int i3 = valueOf;
            int i4 = i3 ^ 13;
            int i5 = -(-((i3 & 13) << 1));
            values = ((i4 & i5) + (i5 | i4)) % 128;
            z = false;
        }
        int i6 = valueOf;
        int i7 = i6 & 27;
        int i8 = i7 + ((i6 ^ 27) | i7);
        values = i8 % 128;
        if (i8 % 2 != 0) {
            return z;
        }
        throw null;
    }
}