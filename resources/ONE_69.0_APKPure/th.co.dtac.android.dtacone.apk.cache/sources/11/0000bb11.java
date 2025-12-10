package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.aq */
/* loaded from: classes5.dex */
public class C9240aq extends AbstractC9747w<LinearLayout> implements save, writeReplace {
    private static int get = 1;
    private static int valueOf;
    private final C9235am ThreeDS2Service;
    private final C9235am values;

    private C9240aq(Context context, InterfaceC9500jo interfaceC9500jo, InterfaceC9502jq interfaceC9502jq) {
        this(context, C9235am.get(context, interfaceC9500jo, interfaceC9502jq), C9235am.ThreeDS2ServiceInstance(context, interfaceC9500jo, interfaceC9502jq));
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9747w
    public /* synthetic */ LinearLayout get(Context context) {
        int i = get;
        int i2 = i ^ 43;
        int i3 = ((i & 43) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        valueOf = i5 % 128;
        if (i5 % 2 != 0) {
            values(context);
            throw null;
        }
        LinearLayout values = values(context);
        int i6 = valueOf;
        int i7 = i6 & 59;
        int i8 = ((((i6 ^ 59) | i7) << 1) - (~(-((i6 | 59) & (~i7))))) - 1;
        get = i8 % 128;
        if (i8 % 2 != 0) {
            return values;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    public void valueOf(setAllCaps setallcaps) {
        int i = valueOf;
        int i2 = (i & (-108)) | ((~i) & 107);
        int i3 = (i & 107) << 1;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        get = i4 % 128;
        if (i4 % 2 != 0) {
            this.values.valueOf(setallcaps);
            this.ThreeDS2Service.valueOf(setallcaps);
            valueOf = (get + 95) % 128;
            return;
        }
        this.values.valueOf(setallcaps);
        this.ThreeDS2Service.valueOf(setallcaps);
        throw null;
    }

    public LinearLayout values(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = C9364et.getWarnings;
        layoutParams.setMargins(i, C9364et.ThreeDS2ServiceInstance, i, C9364et.ThreeDS2Service);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.addView(this.values.ThreeDS2Service());
        linearLayout.addView(this.ThreeDS2Service.ThreeDS2Service());
        int i2 = valueOf;
        int i3 = i2 ^ 33;
        get = ((((i2 & 33) | i3) << 1) - i3) % 128;
        return linearLayout;
    }

    public static C9240aq get(Context context, InterfaceC9500jo interfaceC9500jo, InterfaceC9502jq interfaceC9502jq) {
        C9240aq c9240aq = new C9240aq(context, interfaceC9500jo, interfaceC9502jq);
        int i = valueOf;
        int i2 = i & 103;
        int i3 = (i ^ 103) | i2;
        get = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        return c9240aq;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public isEmpty get() {
        C9232aj c9232aj = new C9232aj(this.values.get(), this.ThreeDS2Service.get());
        int i = valueOf;
        int i2 = i & 9;
        get = (i2 + ((i ^ 9) | i2)) % 128;
        return c9232aj;
    }

    public C9240aq(Context context, C9235am c9235am, C9235am c9235am2) {
        super(context);
        this.values = c9235am;
        this.ThreeDS2Service = c9235am2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void valueOf(InterfaceC9359eo interfaceC9359eo) {
        int i = valueOf;
        int i2 = i & 73;
        int i3 = i | 73;
        int i4 = (i2 & i3) + (i3 | i2);
        get = i4 % 128;
        if (i4 % 2 != 0) {
            this.values.valueOf(interfaceC9359eo);
            this.ThreeDS2Service.valueOf(interfaceC9359eo);
            return;
        }
        this.values.valueOf(interfaceC9359eo);
        this.ThreeDS2Service.valueOf(interfaceC9359eo);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void values(InterfaceC9362er interfaceC9362er) {
        int i = valueOf;
        int i2 = ((i | 103) << 1) - (((~i) & 103) | (i & (-104)));
        get = i2 % 128;
        if (i2 % 2 != 0) {
            this.values.values(interfaceC9362er);
            this.ThreeDS2Service.values(interfaceC9362er);
            return;
        }
        this.values.values(interfaceC9362er);
        this.ThreeDS2Service.values(interfaceC9362er);
        throw null;
    }
}