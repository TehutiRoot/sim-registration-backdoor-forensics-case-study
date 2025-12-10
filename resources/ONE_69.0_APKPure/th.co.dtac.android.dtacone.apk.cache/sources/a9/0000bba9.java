package com.netcetera.threeds.sdk.infrastructure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.eq */
/* loaded from: classes5.dex */
public class C9361eq implements InterfaceC9360ep, Serializable {
    private static int get = 0;
    private static int valueOf = 1;
    private HashMap<String, Serializable> ThreeDS2Service = new HashMap<>();

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9359eo
    public void ThreeDS2Service(String str, List<String> list) {
        this.ThreeDS2Service.put(str, new ArrayList(list));
        int i = get;
        int i2 = i & 95;
        int i3 = (i | 95) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        valueOf = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9362er
    public Integer get(String str, int i) {
        int i2 = get;
        int i3 = i2 | 105;
        valueOf = (((i3 << 1) - (~(-((~(i2 & 105)) & i3)))) - 1) % 128;
        Integer num = (Integer) get(str, (String) Integer.valueOf(i));
        int i4 = get;
        int i5 = i4 & 27;
        valueOf = (i5 + ((i4 ^ 27) | i5)) % 128;
        return num;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9362er
    public String valueOf(String str, String str2) {
        int i = get + 7;
        valueOf = i % 128;
        int i2 = i % 2;
        String str3 = (String) get(str, str2);
        if (i2 != 0) {
            int i3 = valueOf;
            int i4 = i3 & 97;
            int i5 = (((i3 | 97) & (~i4)) - (~(i4 << 1))) - 1;
            get = i5 % 128;
            if (i5 % 2 == 0) {
                return str3;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9359eo
    public void values(String str, String str2) {
        int i = valueOf;
        int i2 = i & 51;
        int i3 = (i ^ 51) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        get = i4 % 128;
        int i5 = i4 % 2;
        this.ThreeDS2Service.put(str, str2);
        if (i5 != 0) {
            throw null;
        }
        int i6 = get;
        int i7 = i6 & 53;
        int i8 = (((i6 | 53) & (~i7)) - (~(i7 << 1))) - 1;
        valueOf = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 51 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9362er
    public Boolean get(String str, boolean z) {
        int i = get;
        int i2 = (((i | 44) << 1) - (i ^ 44)) - 1;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) get(str, (String) Boolean.valueOf(z));
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return bool;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9359eo
    public void values(String str, int i) {
        int i2 = get;
        int i3 = i2 & 63;
        valueOf = ((((i2 | 63) & (~i3)) - (~(i3 << 1))) - 1) % 128;
        this.ThreeDS2Service.put(str, Integer.valueOf(i));
        int i4 = valueOf;
        int i5 = i4 & 1;
        int i6 = ((i4 ^ 1) | i5) << 1;
        int i7 = -((i4 | 1) & (~i5));
        get = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9362er
    public List<String> get(String str, List<String> list) {
        List<String> list2 = (List) get(str, (String) new ArrayList(list));
        int i = get;
        int i2 = i & 107;
        int i3 = (i ^ 107) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return list2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9359eo
    public void values(String str, boolean z) {
        int i = get;
        int i2 = i & 9;
        int i3 = (i ^ 9) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        this.ThreeDS2Service.put(str, Boolean.valueOf(z));
        if (i5 == 0) {
            int i6 = 55 / 0;
        }
        int i7 = valueOf;
        int i8 = (i7 & 15) + (i7 | 15);
        get = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    private <T extends Serializable> T get(String str, T t) {
        int i = valueOf;
        int i2 = ((i | 16) << 1) - (i ^ 16);
        get = ((~i2) + (i2 << 1)) % 128;
        T t2 = (T) C9653oh.ThreeDS2Service(this.ThreeDS2Service.get(str), t);
        int i3 = get;
        int i4 = i3 & 13;
        int i5 = (i4 - (~((i3 ^ 13) | i4))) - 1;
        valueOf = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return t2;
    }
}