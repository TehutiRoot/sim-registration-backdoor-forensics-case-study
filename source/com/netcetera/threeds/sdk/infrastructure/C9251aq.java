package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.aq */
/* loaded from: classes5.dex */
public class C9251aq extends AbstractC9758w<LinearLayout> implements save, writeReplace {
    private static int get = 1;
    private static int valueOf;
    private final C9246am ThreeDS2Service;
    private final C9246am values;

    private C9251aq(Context context, InterfaceC9511jo interfaceC9511jo, InterfaceC9513jq interfaceC9513jq) {
        this(context, C9246am.get(context, interfaceC9511jo, interfaceC9513jq), C9246am.ThreeDS2ServiceInstance(context, interfaceC9511jo, interfaceC9513jq));
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9758w
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
        int i = C9375et.getWarnings;
        layoutParams.setMargins(i, C9375et.ThreeDS2ServiceInstance, i, C9375et.ThreeDS2Service);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.addView(this.values.ThreeDS2Service());
        linearLayout.addView(this.ThreeDS2Service.ThreeDS2Service());
        int i2 = valueOf;
        int i3 = i2 ^ 33;
        get = ((((i2 & 33) | i3) << 1) - i3) % 128;
        return linearLayout;
    }

    public static C9251aq get(Context context, InterfaceC9511jo interfaceC9511jo, InterfaceC9513jq interfaceC9513jq) {
        C9251aq c9251aq = new C9251aq(context, interfaceC9511jo, interfaceC9513jq);
        int i = valueOf;
        int i2 = i & 103;
        int i3 = (i ^ 103) | i2;
        get = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        return c9251aq;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public isEmpty get() {
        C9243aj c9243aj = new C9243aj(this.values.get(), this.ThreeDS2Service.get());
        int i = valueOf;
        int i2 = i & 9;
        get = (i2 + ((i ^ 9) | i2)) % 128;
        return c9243aj;
    }

    public C9251aq(Context context, C9246am c9246am, C9246am c9246am2) {
        super(context);
        this.values = c9246am;
        this.ThreeDS2Service = c9246am2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void valueOf(InterfaceC9370eo interfaceC9370eo) {
        int i = valueOf;
        int i2 = i & 73;
        int i3 = i | 73;
        int i4 = (i2 & i3) + (i3 | i2);
        get = i4 % 128;
        if (i4 % 2 != 0) {
            this.values.valueOf(interfaceC9370eo);
            this.ThreeDS2Service.valueOf(interfaceC9370eo);
            return;
        }
        this.values.valueOf(interfaceC9370eo);
        this.ThreeDS2Service.valueOf(interfaceC9370eo);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void values(InterfaceC9373er interfaceC9373er) {
        int i = valueOf;
        int i2 = ((i | 103) << 1) - (((~i) & 103) | (i & (-104)));
        get = i2 % 128;
        if (i2 % 2 != 0) {
            this.values.values(interfaceC9373er);
            this.ThreeDS2Service.values(interfaceC9373er);
            return;
        }
        this.values.values(interfaceC9373er);
        this.ThreeDS2Service.values(interfaceC9373er);
        throw null;
    }
}
