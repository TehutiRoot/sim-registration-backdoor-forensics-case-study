package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setInitialScale implements setLayoutMode {
    private static int ThreeDS2ServiceInstance = 0;
    private static int values = 1;
    private final setImageTintBlendMode get;
    private final setImageBitmap valueOf;

    public setInitialScale(setImageBitmap setimagebitmap, setImageTintBlendMode setimagetintblendmode) {
        this.valueOf = setimagebitmap;
        this.get = setimagetintblendmode;
    }

    public static setInitialScale valueOf() {
        setInitialScale setinitialscale = new setInitialScale(new setImageBitmap(), new setScaleType());
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 19;
        int i3 = -(-((i ^ 19) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        values = i4 % 128;
        if (i4 % 2 != 0) {
            return setinitialscale;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLayoutMode
    public setPersistentDrawingCache ThreeDS2Service() {
        int i = values;
        int i2 = i & 79;
        ThreeDS2ServiceInstance = (i2 + ((i ^ 79) | i2)) % 128;
        setPersistentDrawingCache ThreeDS2Service = ThreeDS2Service("");
        int i3 = values;
        int i4 = i3 ^ 97;
        int i5 = ((i3 & 97) | i4) << 1;
        int i6 = -i4;
        int i7 = (i5 & i6) + (i5 | i6);
        ThreeDS2ServiceInstance = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 29 / 0;
        }
        return ThreeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setLayoutMode
    public setPersistentDrawingCache values(String str) {
        int i = values;
        int i2 = (i & 59) + (i | 59);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            setPersistentDrawingCache ThreeDS2Service = ThreeDS2Service(str);
            int i3 = ThreeDS2ServiceInstance;
            values = ((((i3 ^ 49) | (i3 & 49)) << 1) - (((~i3) & 49) | (i3 & (-50)))) % 128;
            return ThreeDS2Service;
        }
        ThreeDS2Service(str);
        throw null;
    }

    private setPersistentDrawingCache ThreeDS2Service(String str) {
        setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay = new setHorizontalScrollbarOverlay(this.valueOf.ThreeDS2ServiceInstance(this.get.values(), this.get.valueOf()), str);
        int i = values;
        int i2 = i & 111;
        int i3 = ((i ^ 111) | i2) << 1;
        int i4 = -((i | 111) & (~i2));
        ThreeDS2ServiceInstance = ((i3 & i4) + (i4 | i3)) % 128;
        return sethorizontalscrollbaroverlay;
    }
}