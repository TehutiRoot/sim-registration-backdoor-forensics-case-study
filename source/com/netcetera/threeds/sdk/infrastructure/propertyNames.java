package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.widget.LinearLayout;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class propertyNames extends AbstractC9272bh<LinearLayout> {
    private static int getWarnings = 1;
    private static int valueOf;
    LinearLayout ThreeDS2Service;
    LinearLayout ThreeDS2ServiceInstance;
    private final C9752store[] values;

    public propertyNames(Context context, C9752store[] c9752storeArr) {
        super(context);
        this.values = c9752storeArr;
    }

    public static propertyNames ThreeDS2Service(Context context, C9752store... c9752storeArr) {
        propertyNames propertynames = new propertyNames(context, c9752storeArr);
        int i = getWarnings;
        valueOf = (((((i ^ 15) | (i & 15)) << 1) - (~(-(((~i) & 15) | (i & (-16)))))) - 1) % 128;
        return propertynames;
    }

    private LinearLayout cleanup(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = C9375et.getWarnings;
        layoutParams.setMargins(i, C9375et.ThreeDS2ServiceInstance, i, C9375et.ThreeDS2Service);
        linearLayout.setLayoutParams(layoutParams);
        valueOf = (getWarnings + 7) % 128;
        return linearLayout;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9272bh
    public /* synthetic */ LinearLayout ThreeDS2ServiceInstance(Context context) {
        int i = valueOf;
        int i2 = ((i & (-24)) | ((~i) & 23)) + ((i & 23) << 1);
        getWarnings = i2 % 128;
        if (i2 % 2 == 0) {
            values(context);
            throw null;
        }
        LinearLayout values = values(context);
        int i3 = valueOf;
        int i4 = i3 & 63;
        int i5 = (i4 - (~((i3 ^ 63) | i4))) - 1;
        getWarnings = i5 % 128;
        if (i5 % 2 != 0) {
            return values;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9272bh
    public /* synthetic */ LinearLayout valueOf(Context context) {
        int i = valueOf;
        getWarnings = ((-2) - (~((i & 64) + (i | 64)))) % 128;
        LinearLayout ThreeDS2Service = ThreeDS2Service(context);
        int i2 = getWarnings;
        int i3 = i2 ^ 107;
        int i4 = ((i2 & 107) | i3) << 1;
        int i5 = -i3;
        valueOf = (((i4 | i5) << 1) - (i4 ^ i5)) % 128;
        return ThreeDS2Service;
    }

    public LinearLayout values(Context context) {
        int i;
        int i2;
        LinearLayout cleanup = cleanup(context);
        this.ThreeDS2ServiceInstance = cleanup;
        cleanup.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        C9752store[] c9752storeArr = this.values;
        int length = c9752storeArr.length;
        int i3 = getWarnings;
        int i4 = i3 & 103;
        valueOf = ((((i3 ^ 103) | i4) << 1) - ((i3 | 103) & (~i4))) % 128;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = (valueOf + 65) % 128;
            getWarnings = i7;
            C9752store c9752store = c9752storeArr[i5];
            if (i6 == 0) {
                int i8 = i7 & 15;
                valueOf = (((i7 | 15) & (~i8)) + (i8 << 1)) % 128;
                i = 0;
            } else {
                i = C9375et.ThreeDS2ServiceInstance;
                int i9 = getWarnings;
                int i10 = ((i9 ^ 15) | (i9 & 15)) << 1;
                int i11 = -(((~i9) & 15) | (i9 & (-16)));
                valueOf = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
            }
            if (i6 == this.values.length - 1) {
                int i12 = valueOf;
                int i13 = ((-2) - (~((i12 ^ 100) + ((i12 & 100) << 1)))) % 128;
                getWarnings = i13;
                valueOf = (((i13 & 8) + (8 | i13)) - 1) % 128;
                i2 = 0;
            } else {
                i2 = C9375et.ThreeDS2ServiceInstance;
                int i14 = getWarnings;
                int i15 = i14 & 47;
                valueOf = ((((i14 ^ 47) | i15) << 1) - ((i14 | 47) & (~i15))) % 128;
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(i, 0, i2, 0);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.addView(c9752store.ThreeDS2Service());
            this.ThreeDS2ServiceInstance.addView(linearLayout);
            i6++;
            int i16 = (-2) - (~((i5 & (-55)) + (i5 | (-55))));
            int i17 = (i16 ^ 58) + ((i16 & 58) << 1);
            i5 = (~i17) + (i17 << 1);
            int i18 = valueOf;
            getWarnings = (((i18 ^ 70) + ((i18 & 70) << 1)) - 1) % 128;
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.ThreeDS2Service = linearLayout2;
        linearLayout2.setLayoutParams(layoutParams);
        this.ThreeDS2Service.setVisibility(8);
        this.ThreeDS2ServiceInstance.addView(this.ThreeDS2Service);
        LinearLayout linearLayout3 = this.ThreeDS2ServiceInstance;
        int i19 = getWarnings;
        int i20 = (i19 & 76) + (i19 | 76);
        int i21 = (~i20) + (i20 << 1);
        valueOf = i21 % 128;
        if (i21 % 2 != 0) {
            int i22 = 65 / 0;
        }
        return linearLayout3;
    }

    public LinearLayout ThreeDS2Service(Context context) {
        int i = getWarnings;
        valueOf = (((i & 70) + (i | 70)) - 1) % 128;
        LinearLayout cleanup = cleanup(context);
        this.ThreeDS2ServiceInstance = cleanup;
        cleanup.setOrientation(1);
        C9752store[] c9752storeArr = this.values;
        int length = c9752storeArr.length;
        int i2 = getWarnings;
        valueOf = (((i2 & (-114)) | ((~i2) & 113)) + ((i2 & 113) << 1)) % 128;
        int i3 = 0;
        while (i3 < length) {
            C9752store c9752store = c9752storeArr[i3];
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.addView(c9752store.ThreeDS2Service());
            this.ThreeDS2ServiceInstance.addView(linearLayout);
            int i4 = (i3 & (-2)) | ((~i3) & 1);
            int i5 = (i3 & 1) << 1;
            i3 = ((i5 & i4) << 1) + (i4 ^ i5);
            getWarnings = ((-2) - ((valueOf + 106) ^ (-1))) % 128;
        }
        LinearLayout linearLayout2 = this.ThreeDS2ServiceInstance;
        int i6 = getWarnings;
        int i7 = (i6 & 56) + (i6 | 56);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        valueOf = i8 % 128;
        if (i8 % 2 == 0) {
            return linearLayout2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9272bh
    public void ThreeDS2ServiceInstance(setAllCaps setallcaps) {
        C9752store[] c9752storeArr;
        int length;
        int i = valueOf;
        int i2 = ((i | 55) << 1) - (i ^ 55);
        int i3 = i2 % 128;
        getWarnings = i3;
        if (i2 % 2 == 0) {
            c9752storeArr = this.values;
            length = c9752storeArr.length;
        } else {
            c9752storeArr = this.values;
            length = c9752storeArr.length;
        }
        valueOf = (i3 + 113) % 128;
        int i4 = 0;
        while (i4 < length) {
            int i5 = valueOf;
            int i6 = ((i5 | 25) << 1) - (i5 ^ 25);
            getWarnings = i6 % 128;
            if (i6 % 2 == 0) {
                c9752storeArr[i4].valueOf(setallcaps);
                int i7 = (i4 ^ 65) + ((i4 & 65) << 1);
                i4 = (i7 ^ (-34)) + ((i7 & (-34)) << 1);
            } else {
                c9752storeArr[i4].valueOf(setallcaps);
                i4++;
            }
            int i8 = getWarnings;
            int i9 = i8 ^ 47;
            valueOf = ((((i8 & 47) | i9) << 1) - i9) % 128;
        }
        int length2 = this.values.length;
        int i10 = valueOf;
        int i11 = i10 ^ 101;
        int i12 = -(-((i10 & 101) << 1));
        getWarnings = ((i11 & i12) + (i12 | i11)) % 128;
        int i13 = 0;
        while (i13 < this.values.length) {
            int i14 = getWarnings;
            int i15 = i14 & 63;
            int i16 = ((i14 | 63) & (~i15)) + (i15 << 1);
            valueOf = i16 % 128;
            if (i16 % 2 != 0) {
                if (this.ThreeDS2ServiceInstance.getChildAt(i13).getVisibility() != 97) {
                    int i17 = i13 & (-122);
                    int i18 = (i13 ^ (-122)) | i17;
                    int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                    int i20 = i19 ^ CameraActivity.REQUEST_CODE;
                    int i21 = ((i19 & CameraActivity.REQUEST_CODE) | i20) << 1;
                    int i22 = -i20;
                    i13 = ((i22 & i21) << 1) + (i21 ^ i22);
                    int i23 = valueOf;
                    getWarnings = (((i23 & 97) - (~(i23 | 97))) - 1) % 128;
                }
                int i24 = ~length2;
                int i25 = -(-(length2 << 1));
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                int i27 = getWarnings;
                int i28 = i27 & 83;
                int i29 = -(-((i27 ^ 83) | i28));
                valueOf = ((i28 & i29) + (i29 | i28)) % 128;
                length2 = i26;
                int i172 = i13 & (-122);
                int i182 = (i13 ^ (-122)) | i172;
                int i192 = (i172 ^ i182) + ((i182 & i172) << 1);
                int i202 = i192 ^ CameraActivity.REQUEST_CODE;
                int i212 = ((i192 & CameraActivity.REQUEST_CODE) | i202) << 1;
                int i222 = -i202;
                i13 = ((i222 & i212) << 1) + (i212 ^ i222);
                int i232 = valueOf;
                getWarnings = (((i232 & 97) - (~(i232 | 97))) - 1) % 128;
            } else {
                if (this.ThreeDS2ServiceInstance.getChildAt(i13).getVisibility() != 8) {
                    int i1722 = i13 & (-122);
                    int i1822 = (i13 ^ (-122)) | i1722;
                    int i1922 = (i1722 ^ i1822) + ((i1822 & i1722) << 1);
                    int i2022 = i1922 ^ CameraActivity.REQUEST_CODE;
                    int i2122 = ((i1922 & CameraActivity.REQUEST_CODE) | i2022) << 1;
                    int i2222 = -i2022;
                    i13 = ((i2222 & i2122) << 1) + (i2122 ^ i2222);
                    int i2322 = valueOf;
                    getWarnings = (((i2322 & 97) - (~(i2322 | 97))) - 1) % 128;
                }
                int i242 = ~length2;
                int i252 = -(-(length2 << 1));
                int i262 = (i242 ^ i252) + ((i252 & i242) << 1);
                int i272 = getWarnings;
                int i282 = i272 & 83;
                int i292 = -(-((i272 ^ 83) | i282));
                valueOf = ((i282 & i292) + (i292 | i282)) % 128;
                length2 = i262;
                int i17222 = i13 & (-122);
                int i18222 = (i13 ^ (-122)) | i17222;
                int i19222 = (i17222 ^ i18222) + ((i18222 & i17222) << 1);
                int i20222 = i19222 ^ CameraActivity.REQUEST_CODE;
                int i21222 = ((i19222 & CameraActivity.REQUEST_CODE) | i20222) << 1;
                int i22222 = -i20222;
                i13 = ((i22222 & i21222) << 1) + (i21222 ^ i22222);
                int i23222 = valueOf;
                getWarnings = (((i23222 & 97) - (~(i23222 | 97))) - 1) % 128;
            }
        }
        if (length2 == 1) {
            int i30 = valueOf;
            int i31 = ((i30 ^ 59) | (i30 & 59)) << 1;
            int i32 = -(((~i30) & 59) | (i30 & (-60)));
            getWarnings = ((i31 ^ i32) + ((i32 & i31) << 1)) % 128;
            this.ThreeDS2Service.setVisibility(0);
            int i33 = getWarnings;
            int i34 = i33 ^ 77;
            int i35 = -(-((i33 & 77) << 1));
            valueOf = ((i34 ^ i35) + ((i35 & i34) << 1)) % 128;
        }
        int i36 = valueOf;
        getWarnings = (((i36 ^ 66) + ((i36 & 66) << 1)) - 1) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9272bh
    public void ThreeDS2Service(setAllCaps setallcaps) {
        int i = getWarnings;
        int i2 = (((i ^ 66) + ((i & 66) << 1)) - 1) % 128;
        valueOf = i2;
        C9752store[] c9752storeArr = this.values;
        int length = c9752storeArr.length;
        getWarnings = ((((i2 & (-98)) | ((~i2) & 97)) - (~((i2 & 97) << 1))) - 1) % 128;
        int i3 = 0;
        while (i3 < length) {
            int i4 = getWarnings;
            int i5 = (i4 | 115) << 1;
            int i6 = -(((~i4) & 115) | (i4 & (-116)));
            valueOf = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
            c9752storeArr[i3].valueOf(setallcaps);
            int i7 = i3 & 73;
            int i8 = (i3 | 73) & (~i7);
            int i9 = -(-(i7 << 1));
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            int i11 = ((i10 ^ (-72)) | (i10 & (-72))) << 1;
            int i12 = -((i10 & 71) | ((~i10) & (-72)));
            i3 = ((i11 | i12) << 1) - (i11 ^ i12);
            getWarnings = (valueOf + 73) % 128;
        }
        int i13 = valueOf;
        int i14 = (i13 & 64) + (i13 | 64);
        int i15 = (~i14) + (i14 << 1);
        getWarnings = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
    }
}
