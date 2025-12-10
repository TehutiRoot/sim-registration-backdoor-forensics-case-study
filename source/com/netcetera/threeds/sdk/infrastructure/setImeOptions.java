package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setImeOptions {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;
    private final setFreezesText valueOf;
    private final setSearchResultHighlights values;

    public setImeOptions(setSearchResultHighlights setsearchresulthighlights, setFreezesText setfreezestext) {
        this.values = setsearchresulthighlights;
        this.valueOf = setfreezestext;
    }

    public static setImeOptions ThreeDS2Service(InterfaceC9401fy interfaceC9401fy) {
        C9582lz c9582lz = (C9582lz) AuthenticationRequestParameters.valueOf(C9582lz.class);
        setPrivateImeOptions ThreeDS2ServiceInstance2 = setPrivateImeOptions.ThreeDS2ServiceInstance(interfaceC9401fy.values(), interfaceC9401fy.valueOf(c9582lz), interfaceC9401fy.valueOf(c9582lz));
        setImeOptions setimeoptions = new setImeOptions(ThreeDS2ServiceInstance2, ThreeDS2ServiceInstance2);
        int i = get;
        int i2 = i ^ 61;
        ThreeDS2ServiceInstance = (((((i & 61) | i2) << 1) - (~(-i2))) - 1) % 128;
        return setimeoptions;
    }

    public setAllCaps ThreeDS2Service(setTextIsSelectable settextisselectable) {
        this.values.get(settextisselectable);
        setLogoDescription setlogodescription = new setLogoDescription(settextisselectable.get(), settextisselectable.valueOf(), settextisselectable.ThreeDS2ServiceInstance(), settextisselectable.ThreeDS2Service(), settextisselectable.values(), settextisselectable.getWarnings(), settextisselectable.cleanup(), settextisselectable.getSDKVersion(), settextisselectable.createTransaction(), settextisselectable.onCompleted(), settextisselectable.onError(), settextisselectable.ThreeDS2Service$InitializationCallback(), settextisselectable.removeParam(), settextisselectable.apiKey(), settextisselectable.getParamValue(), settextisselectable.addParam(), settextisselectable.ConfigurationBuilder(), settextisselectable.build(), settextisselectable.SchemeConfiguration(), settextisselectable.configureScheme(), settextisselectable.restrictedParameters(), this.valueOf.values(), settextisselectable.mastercardSchemeConfiguration(), settextisselectable.jcbConfiguration(), settextisselectable.visaSchemeConfiguration(), this.valueOf.ThreeDS2ServiceInstance(), settextisselectable.amexConfiguration(), settextisselectable.eftposConfiguration(), settextisselectable.dinersSchemeConfiguration(), settextisselectable.newSchemeConfiguration(), settextisselectable.getSchemeId(), settextisselectable.unionSchemeConfiguration(), settextisselectable.ConfigParameters(), settextisselectable.cbConfiguration(), settextisselectable.getSchemeName(), settextisselectable.getSchemeLogo(), settextisselectable.getSchemePublicRootKeys());
        int i = get;
        int i2 = i ^ 43;
        int i3 = ((i & 43) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i3 | i4);
        ThreeDS2ServiceInstance = i5 % 128;
        if (i5 % 2 != 0) {
            return setlogodescription;
        }
        throw null;
    }
}
