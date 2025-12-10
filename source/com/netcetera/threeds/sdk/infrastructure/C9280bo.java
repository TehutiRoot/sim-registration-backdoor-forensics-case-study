package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.widget.LinearLayout;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bo */
/* loaded from: classes5.dex */
public class C9280bo extends AbstractC9272bh<LinearLayout> implements save {
    private static int ThreeDS2Service$InitializationCallback = 1;
    private static int initialize;
    private final propertyNames ThreeDS2Service;
    private final C9278bm ThreeDS2ServiceInstance;
    private final C9248an getWarnings;
    private final C9248an valueOf;
    private final C9278bm values;

    public C9280bo(Context context, propertyNames propertynames, C9278bm c9278bm, C9278bm c9278bm2, C9248an c9248an, C9248an c9248an2) {
        super(context);
        this.ThreeDS2Service = propertynames;
        this.values = c9278bm;
        this.ThreeDS2ServiceInstance = c9278bm2;
        this.valueOf = c9248an;
        this.getWarnings = c9248an2;
    }

    public static C9280bo get(Context context, propertyNames propertynames, C9281bp c9281bp, C9245al c9245al, C9252ar c9252ar, C9252ar c9252ar2) {
        C9280bo c9280bo = new C9280bo(context, propertynames, new C9278bm(context, c9281bp, c9245al), new C9278bm(context, c9252ar, c9252ar2), new C9248an(context, c9281bp, c9252ar), new C9248an(context, c9245al, c9252ar2));
        int i = ThreeDS2Service$InitializationCallback;
        int i2 = i & 61;
        int i3 = (i ^ 61) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        initialize = i4 % 128;
        if (i4 % 2 == 0) {
            return c9280bo;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9272bh
    public void ThreeDS2Service(setAllCaps setallcaps) {
        int i = initialize;
        int i2 = i & 49;
        int i3 = (i | 49) & (~i2);
        int i4 = -(-(i2 << 1));
        ThreeDS2Service$InitializationCallback = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        if (putIfAbsent.get.equals(setallcaps.cbConfiguration())) {
            int i5 = ThreeDS2Service$InitializationCallback;
            int i6 = i5 ^ 23;
            int i7 = (i5 & 23) << 1;
            initialize = ((i6 & i7) + (i7 | i6)) % 128;
            ((LinearLayout) ThreeDS2Service()).addView(this.values.ThreeDS2Service());
            ((LinearLayout) ThreeDS2Service()).addView(this.ThreeDS2Service.ThreeDS2Service());
            ((LinearLayout) ThreeDS2Service()).addView(this.ThreeDS2ServiceInstance.ThreeDS2Service());
            int i8 = initialize;
            int i9 = i8 & 91;
            ThreeDS2Service$InitializationCallback = ((((i8 | 91) & (~i9)) - (~(i9 << 1))) - 1) % 128;
        } else {
            ((LinearLayout) ThreeDS2Service()).addView(this.ThreeDS2Service.ThreeDS2Service());
            ((LinearLayout) ThreeDS2Service()).addView(this.values.ThreeDS2Service());
            ((LinearLayout) ThreeDS2Service()).addView(this.ThreeDS2ServiceInstance.ThreeDS2Service());
            int i10 = initialize;
            int i11 = i10 & 119;
            ThreeDS2Service$InitializationCallback = ((((i10 | 119) & (~i11)) - (~(i11 << 1))) - 1) % 128;
        }
        this.ThreeDS2Service.valueOf(setallcaps);
        this.values.valueOf(setallcaps);
        this.ThreeDS2ServiceInstance.valueOf(setallcaps);
        int i12 = ThreeDS2Service$InitializationCallback;
        int i13 = i12 & 19;
        int i14 = -(-(i12 | 19));
        initialize = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9272bh
    public /* synthetic */ LinearLayout ThreeDS2ServiceInstance(Context context) {
        ThreeDS2Service$InitializationCallback = (initialize + 113) % 128;
        LinearLayout ThreeDS2Service = ThreeDS2Service(context);
        ThreeDS2Service$InitializationCallback = (initialize + 73) % 128;
        return ThreeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9272bh
    public /* synthetic */ LinearLayout valueOf(Context context) {
        int i = ThreeDS2Service$InitializationCallback;
        int i2 = i & 119;
        int i3 = (((i | 119) & (~i2)) - (~(-(-(i2 << 1))))) - 1;
        initialize = i3 % 128;
        if (i3 % 2 != 0) {
            values(context);
            throw null;
        }
        LinearLayout values = values(context);
        int i4 = initialize;
        int i5 = i4 & 15;
        int i6 = (i4 | 15) & (~i5);
        int i7 = -(-(i5 << 1));
        ThreeDS2Service$InitializationCallback = (((i6 | i7) << 1) - (i6 ^ i7)) % 128;
        return values;
    }

    public LinearLayout values(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        int i = initialize;
        int i2 = (-2) - (~((i ^ 72) + ((i & 72) << 1)));
        ThreeDS2Service$InitializationCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
        return linearLayout;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9272bh
    public void ThreeDS2ServiceInstance(setAllCaps setallcaps) {
        int i = ThreeDS2Service$InitializationCallback;
        int i2 = i & 25;
        int i3 = (i ^ 25) | i2;
        initialize = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        if (putIfAbsent.get.equals(setallcaps.cbConfiguration())) {
            int i4 = initialize;
            int i5 = (i4 & (-120)) | ((~i4) & 119);
            int i6 = -(-((i4 & 119) << 1));
            ThreeDS2Service$InitializationCallback = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
            ((LinearLayout) ThreeDS2Service()).addView(this.values.ThreeDS2Service());
            ((LinearLayout) ThreeDS2Service()).addView(this.ThreeDS2Service.ThreeDS2Service());
            ((LinearLayout) ThreeDS2Service()).addView(this.ThreeDS2ServiceInstance.ThreeDS2Service());
            this.ThreeDS2Service.valueOf(setallcaps);
            this.values.valueOf(setallcaps);
            this.ThreeDS2ServiceInstance.valueOf(setallcaps);
            initialize = (ThreeDS2Service$InitializationCallback + CameraActivity.REQUEST_CODE) % 128;
        } else {
            ((LinearLayout) ThreeDS2Service()).addView(this.ThreeDS2Service.ThreeDS2Service());
            ((LinearLayout) ThreeDS2Service()).addView(this.valueOf.ThreeDS2Service());
            ((LinearLayout) ThreeDS2Service()).addView(this.getWarnings.ThreeDS2Service());
            this.ThreeDS2Service.valueOf(setallcaps);
            this.valueOf.valueOf(setallcaps);
            this.getWarnings.valueOf(setallcaps);
            ThreeDS2ServiceInstance();
            int i7 = ThreeDS2Service$InitializationCallback;
            int i8 = i7 ^ 67;
            int i9 = ((i7 & 67) | i8) << 1;
            int i10 = -i8;
            initialize = (((i9 | i10) << 1) - (i9 ^ i10)) % 128;
        }
        ThreeDS2Service$InitializationCallback = ((-2) - (~(initialize + 48))) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void valueOf(InterfaceC9370eo interfaceC9370eo) {
        int i = ThreeDS2Service$InitializationCallback;
        initialize = ((i ^ 31) + ((i & 31) << 1)) % 128;
        this.values.valueOf(interfaceC9370eo);
        this.ThreeDS2ServiceInstance.valueOf(interfaceC9370eo);
        this.valueOf.valueOf(interfaceC9370eo);
        this.getWarnings.valueOf(interfaceC9370eo);
        int i2 = ThreeDS2Service$InitializationCallback;
        int i3 = ((i2 & (-46)) | ((~i2) & 45)) + ((i2 & 45) << 1);
        initialize = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void values(InterfaceC9373er interfaceC9373er) {
        int i = initialize;
        int i2 = i & 119;
        int i3 = i | 119;
        ThreeDS2Service$InitializationCallback = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        this.values.values(interfaceC9373er);
        this.ThreeDS2ServiceInstance.values(interfaceC9373er);
        this.valueOf.values(interfaceC9373er);
        this.getWarnings.values(interfaceC9373er);
        int i4 = initialize;
        int i5 = ((i4 | 103) << 1) - (((~i4) & 103) | (i4 & (-104)));
        ThreeDS2Service$InitializationCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public LinearLayout ThreeDS2Service(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        initialize = (ThreeDS2Service$InitializationCallback + 25) % 128;
        return linearLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
        if (r5.getWarnings.valueOf() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
        if (r5.getWarnings.valueOf() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.C9280bo.ThreeDS2Service$InitializationCallback;
        r3 = r0 & 57;
        r0 = r0 | 57;
        com.netcetera.threeds.sdk.infrastructure.C9280bo.initialize = (((r3 | r0) << 1) - (r0 ^ r3)) % 128;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ThreeDS2ServiceInstance() {
        /*
            Method dump skipped, instructions count: 191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9280bo.ThreeDS2ServiceInstance():void");
    }
}
