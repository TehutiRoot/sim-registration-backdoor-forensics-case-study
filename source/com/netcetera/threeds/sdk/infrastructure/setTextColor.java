package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.netcetera.threeds.sdk.infrastructure.getTextColor;
import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class setTextColor {
    private static int ThreeDS2ServiceInstance = 0;
    private static int getWarnings = 1;
    private final getTextColor.ThreeDS2ServiceInstance ThreeDS2Service;
    private Set<String> get = new HashSet();
    private final setHeadingTextColor valueOf;
    private final setDrawingCacheEnabled values;

    public setTextColor(setHeadingTextColor setheadingtextcolor, setDrawingCacheEnabled setdrawingcacheenabled, getTextColor.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        this.valueOf = setheadingtextcolor;
        this.values = setdrawingcacheenabled;
        this.ThreeDS2Service = threeDS2ServiceInstance;
    }

    public static setTextColor values(Context context, setScrollingCacheEnabled setscrollingcacheenabled, setFastScrollEnabled setfastscrollenabled) {
        setTextColor settextcolor = new setTextColor(setHeadingTextColor.get(context, setscrollingcacheenabled, setfastscrollenabled), new setDrawingCacheEnabled(), getTextColor.ThreeDS2Service());
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 121;
        int i3 = (i ^ 121) | i2;
        getWarnings = ((i2 & i3) + (i3 | i2)) % 128;
        return settextcolor;
    }

    public void get(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, Locale locale) {
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i | 86) << 1) - (i ^ 86);
        int i3 = (~i2) + (i2 << 1);
        getWarnings = i3 % 128;
        if (i3 % 2 == 0) {
            this.get = this.values.get(configParameters);
            values(this.valueOf.ThreeDS2ServiceInstance(locale));
            int i4 = 51 / 0;
        } else {
            this.get = this.values.get(configParameters);
            values(this.valueOf.ThreeDS2ServiceInstance(locale));
        }
        int i5 = ThreeDS2ServiceInstance + 49;
        getWarnings = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        throw null;
    }

    public void valueOf(setFastScrollEnabled.valueOf valueof, String str) {
        int i = ThreeDS2ServiceInstance + 47;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            values(this.valueOf.ThreeDS2Service(valueof, str));
        } else {
            values(this.valueOf.ThreeDS2Service(valueof, str));
            throw null;
        }
    }

    private void values(Map<LabelCustomization, setDarkTextColor.valueOf> map) {
        int i = getWarnings;
        ThreeDS2ServiceInstance = (((i | 85) << 1) - (i ^ 85)) % 128;
        Iterator<LabelCustomization> it = map.keySet().iterator();
        ThreeDS2ServiceInstance = (getWarnings + 83) % 128;
        while (it.hasNext()) {
            int i2 = getWarnings;
            int i3 = (i2 & 97) + (i2 | 97);
            ThreeDS2ServiceInstance = i3 % 128;
            if (i3 % 2 == 0) {
                LabelCustomization next = it.next();
                getHeadingTextColor valueOf = valueOf(next, map);
                if (valueOf.getSDKInfo()) {
                    this.ThreeDS2Service.values(next.ThreeDS2ServiceInstance(), valueOf);
                    int i4 = ThreeDS2ServiceInstance;
                    int i5 = (i4 & (-96)) | ((~i4) & 95);
                    int i6 = (i4 & 95) << 1;
                    getWarnings = ((i5 & i6) + (i6 | i5)) % 128;
                } else {
                    this.ThreeDS2Service.ThreeDS2ServiceInstance(next.ThreeDS2ServiceInstance(), valueOf);
                    int i7 = ThreeDS2ServiceInstance;
                    int i8 = (i7 & (-88)) | ((~i7) & 87);
                    int i9 = (i7 & 87) << 1;
                    getWarnings = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
                }
                int i10 = getWarnings;
                int i11 = i10 | 61;
                ThreeDS2ServiceInstance = ((i11 << 1) - ((~(i10 & 61)) & i11)) % 128;
            } else {
                valueOf(it.next(), map).getSDKInfo();
                throw null;
            }
        }
        int i12 = ThreeDS2ServiceInstance;
        int i13 = ((i12 ^ 63) - (~(-(-((i12 & 63) << 1))))) - 1;
        getWarnings = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public getTextColor valueOf() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 105;
        int i3 = -(-((i ^ 105) | i2));
        getWarnings = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        getTextColor valueOf = this.ThreeDS2Service.valueOf();
        int i4 = ThreeDS2ServiceInstance;
        int i5 = ((i4 ^ 23) | (i4 & 23)) << 1;
        int i6 = -(((~i4) & 23) | (i4 & (-24)));
        getWarnings = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
        return valueOf;
    }

    private getHeadingTextColor valueOf(LabelCustomization labelCustomization, Map<LabelCustomization, setDarkTextColor.valueOf> map) {
        getHeadingTextColor ThreeDS2Service;
        int i = getWarnings;
        ThreeDS2ServiceInstance = ((i ^ 57) + ((i & 57) << 1)) % 128;
        try {
            if (!this.get.contains(labelCustomization.ThreeDS2ServiceInstance())) {
                setDarkTextColor.valueOf valueof = map.get(labelCustomization);
                if (valueof != null) {
                    int i2 = getWarnings;
                    int i3 = i2 & 57;
                    int i4 = (i2 | 57) & (~i3);
                    int i5 = i3 << 1;
                    ThreeDS2ServiceInstance = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
                    ThreeDS2Service = valueof.values();
                    int i6 = ThreeDS2ServiceInstance;
                    int i7 = i6 & 19;
                    int i8 = ((i6 ^ 19) | i7) << 1;
                    int i9 = -((i6 | 19) & (~i7));
                    getWarnings = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
                } else {
                    ThreeDS2Service = getHeadingTextColor.ThreeDS2Service();
                    int i10 = getWarnings;
                    int i11 = i10 & 35;
                    ThreeDS2ServiceInstance = (((i10 | 35) & (~i11)) + (i11 << 1)) % 128;
                }
                int i12 = ThreeDS2ServiceInstance + 66;
                int i13 = (~i12) + (i12 << 1);
                getWarnings = i13 % 128;
                if (i13 % 2 != 0) {
                    return ThreeDS2Service;
                }
                throw null;
            }
            int i14 = ThreeDS2ServiceInstance;
            int i15 = i14 & 83;
            int i16 = i14 | 83;
            getWarnings = ((i15 & i16) + (i16 | i15)) % 128;
            getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get();
            int i17 = getWarnings;
            ThreeDS2ServiceInstance = ((i17 & 29) + (i17 | 29)) % 128;
            return getheadingtextcolor;
        } catch (SecurityException unused) {
            return getHeadingTextColor.ThreeDS2ServiceInstance();
        } catch (RuntimeException unused2) {
            return getHeadingTextColor.ThreeDS2Service();
        }
    }
}
