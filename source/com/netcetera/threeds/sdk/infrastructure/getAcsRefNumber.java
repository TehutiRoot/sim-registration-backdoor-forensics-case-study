package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public class getAcsRefNumber implements setAcsRefNumber {
    private static int ThreeDS2ServiceInstance = 1;
    private static int valueOf;
    private Resources get;

    public getAcsRefNumber(Resources resources) {
        this.get = resources;
    }

    public static setAcsRefNumber ThreeDS2Service(Context context) {
        getAcsRefNumber getacsrefnumber = new getAcsRefNumber(context.getResources());
        ThreeDS2ServiceInstance = (valueOf + 109) % 128;
        return getacsrefnumber;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsRefNumber
    public Drawable values(int i) throws setId {
        int i2 = ThreeDS2ServiceInstance;
        int i3 = i2 & 27;
        int i4 = (((i2 | 27) & (~i3)) - (~(i3 << 1))) - 1;
        valueOf = i4 % 128;
        try {
            if (i4 % 2 == 0) {
                return this.get.getDrawable(i, null);
            }
            this.get.getDrawable(i, null);
            throw null;
        } catch (Exception e) {
            throw setForegroundGravity.toString.valueOf(Integer.valueOf(i), e);
        }
    }
}
