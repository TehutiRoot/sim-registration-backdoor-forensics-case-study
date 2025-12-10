package com.netcetera.threeds.sdk.infrastructure;

import java.util.List;

/* loaded from: classes5.dex */
public class setLogoDescription implements setAllCaps {
    private static int getSchemeEncryptionPublicKey = 0;
    private static int getSchemeLogo = 1;
    private final String ConfigParameters;
    private final String ConfigurationBuilder;
    private final String SchemeConfiguration;
    private final put ThreeDS2Service;
    private final String ThreeDS2Service$InitializationCallback;
    private final String ThreeDS2ServiceInstance;
    private final String addParam;
    private final String amexConfiguration;
    private final String apiKey;
    private final setSelectAllOnFocus build;
    private final putIfAbsent cbConfiguration;
    private final List<setCustomSelectionActionModeCallback> cleanup;
    private final String configureScheme;
    private final getLocalizedMessage createTransaction;
    private final String dinersSchemeConfiguration;
    private final String eftposConfiguration;
    private final String get;
    private final List<setCursorVisible> getParamValue;
    private final String getSDKInfo;
    private final Integer getSDKVersion;
    private final String getSchemeId;
    private final String getSchemeLogoDark;
    private final String getSchemeName;
    private final String getSchemePublicRootKeys;
    private final String getWarnings;
    private final getSuppressed initialize;
    private final String jcbConfiguration;
    private final String mastercardSchemeConfiguration;
    private final getInfo newSchemeConfiguration;
    private final setIncludeFontPadding onCompleted;
    private final setIncludeFontPadding onError;
    private final getVersion removeParam;
    private final String restrictedParameters;
    private final setSelectAllOnFocus unionSchemeConfiguration;
    private final keySet valueOf;
    private final String values;
    private final String visaSchemeConfiguration;

    public setLogoDescription(keySet keyset, String str, String str2, put putVar, String str3, List<setCustomSelectionActionModeCallback> list, getSuppressed getsuppressed, Integer num, String str4, String str5, getLocalizedMessage getlocalizedmessage, String str6, setIncludeFontPadding setincludefontpadding, setIncludeFontPadding setincludefontpadding2, String str7, String str8, String str9, getVersion getversion, List<setCursorVisible> list2, String str10, String str11, setSelectAllOnFocus setselectallonfocus, String str12, String str13, String str14, setSelectAllOnFocus setselectallonfocus2, String str15, String str16, String str17, String str18, String str19, String str20, getInfo getinfo, putIfAbsent putifabsent, String str21, String str22, String str23) {
        this.valueOf = keyset;
        this.ThreeDS2ServiceInstance = str;
        this.values = str2;
        this.ThreeDS2Service = putVar;
        this.get = str3;
        this.cleanup = list;
        this.initialize = getsuppressed;
        this.getSDKVersion = num;
        this.getWarnings = str4;
        this.getSDKInfo = str5;
        this.createTransaction = getlocalizedmessage;
        this.ConfigParameters = str6;
        this.onCompleted = setincludefontpadding;
        this.onError = setincludefontpadding2;
        this.ThreeDS2Service$InitializationCallback = str7;
        this.ConfigurationBuilder = str8;
        this.apiKey = str9;
        this.removeParam = getversion;
        this.getParamValue = list2;
        this.addParam = str10;
        this.configureScheme = str11;
        this.build = setselectallonfocus;
        this.mastercardSchemeConfiguration = str12;
        this.restrictedParameters = str13;
        this.SchemeConfiguration = str14;
        this.unionSchemeConfiguration = setselectallonfocus2;
        this.visaSchemeConfiguration = str15;
        this.dinersSchemeConfiguration = str16;
        this.amexConfiguration = str17;
        this.jcbConfiguration = str18;
        this.getSchemeName = str19;
        this.eftposConfiguration = str20;
        this.newSchemeConfiguration = getinfo;
        this.cbConfiguration = putifabsent;
        this.getSchemeId = str21;
        this.getSchemeLogoDark = str22;
        this.getSchemePublicRootKeys = str23;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMarqueeRepeatLimit
    public getInfo ConfigParameters() {
        int i = getSchemeEncryptionPublicKey;
        int i2 = ((i & 111) + (i | 111)) % 128;
        getSchemeLogo = i2;
        getInfo getinfo = this.newSchemeConfiguration;
        getSchemeEncryptionPublicKey = (i2 + 93) % 128;
        return getinfo;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String ConfigurationBuilder() {
        int i = getSchemeLogo + 88;
        int i2 = ((~i) + (i << 1)) % 128;
        getSchemeEncryptionPublicKey = i2;
        String str = this.apiKey;
        getSchemeLogo = (i2 + 25) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public List<setCursorVisible> SchemeConfiguration() {
        int i = getSchemeLogo;
        List<setCursorVisible> list = this.getParamValue;
        int i2 = ((i & (-36)) | ((~i) & 35)) + ((i & 35) << 1);
        getSchemeEncryptionPublicKey = i2 % 128;
        if (i2 % 2 == 0) {
            return list;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public put ThreeDS2Service() {
        int i = getSchemeEncryptionPublicKey;
        put putVar = this.ThreeDS2Service;
        int i2 = (((i & (-30)) | ((~i) & 29)) - (~(-(-((i & 29) << 1))))) - 1;
        getSchemeLogo = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
        return putVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String ThreeDS2Service$InitializationCallback() {
        int i = getSchemeEncryptionPublicKey;
        int i2 = (((i & 56) + (i | 56)) - 1) % 128;
        getSchemeLogo = i2;
        String str = this.ConfigParameters;
        int i3 = i2 ^ 41;
        int i4 = ((i2 & 41) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        getSchemeEncryptionPublicKey = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 53 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public String ThreeDS2ServiceInstance() {
        int i = getSchemeLogo;
        String str = this.values;
        getSchemeEncryptionPublicKey = ((((i ^ 45) | (i & 45)) << 1) - (((~i) & 45) | (i & (-46)))) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String addParam() {
        int i = getSchemeLogo;
        int i2 = i & 103;
        int i3 = (i2 + ((i ^ 103) | i2)) % 128;
        getSchemeEncryptionPublicKey = i3;
        String str = this.ConfigurationBuilder;
        int i4 = i3 ^ 29;
        getSchemeLogo = ((((i3 & 29) | i4) << 1) - i4) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String amexConfiguration() {
        int i = getSchemeLogo;
        String str = this.visaSchemeConfiguration;
        int i2 = i & 45;
        int i3 = -(-((i ^ 45) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        getSchemeEncryptionPublicKey = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public setIncludeFontPadding apiKey() {
        int i = getSchemeLogo;
        int i2 = i & 71;
        int i3 = (i | 71) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        getSchemeEncryptionPublicKey = i5 % 128;
        if (i5 % 2 == 0) {
            return this.onError;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public getVersion build() {
        int i = getSchemeEncryptionPublicKey;
        int i2 = i & 97;
        int i3 = ((((i ^ 97) | i2) << 1) - (~(-((i | 97) & (~i2))))) - 1;
        getSchemeLogo = i3 % 128;
        int i4 = i3 % 2;
        getVersion getversion = this.removeParam;
        if (i4 == 0) {
            int i5 = 65 / 0;
        }
        return getversion;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public putIfAbsent cbConfiguration() {
        int i = getSchemeLogo;
        putIfAbsent putifabsent = this.cbConfiguration;
        getSchemeEncryptionPublicKey = (((i ^ 116) + ((i & 116) << 1)) - 1) % 128;
        return putifabsent;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSingleLine
    public getSuppressed cleanup() {
        int i = getSchemeEncryptionPublicKey;
        int i2 = i & 105;
        int i3 = -(-((i ^ 105) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getSchemeLogo = i4 % 128;
        if (i4 % 2 != 0) {
            return this.initialize;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String configureScheme() {
        int i = getSchemeLogo + 97;
        getSchemeEncryptionPublicKey = i % 128;
        if (i % 2 == 0) {
            return this.addParam;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String createTransaction() {
        int i = getSchemeLogo;
        String str = this.getWarnings;
        int i2 = i ^ 37;
        getSchemeEncryptionPublicKey = ((((i & 37) | i2) << 1) - i2) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String dinersSchemeConfiguration() {
        int i = getSchemeEncryptionPublicKey;
        int i2 = i & 63;
        int i3 = ((i2 - (~(-(-((i ^ 63) | i2))))) - 1) % 128;
        getSchemeLogo = i3;
        String str = this.amexConfiguration;
        getSchemeEncryptionPublicKey = ((i3 ^ 15) + ((i3 & 15) << 1)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String eftposConfiguration() {
        int i = getSchemeEncryptionPublicKey;
        int i2 = (((i & 37) - (~(-(-(i | 37))))) - 1) % 128;
        getSchemeLogo = i2;
        String str = this.dinersSchemeConfiguration;
        getSchemeEncryptionPublicKey = (((i2 | 13) << 1) - (i2 ^ 13)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public keySet get() {
        int i = getSchemeLogo;
        int i2 = i & 11;
        int i3 = (i ^ 11) | i2;
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        getSchemeEncryptionPublicKey = i4;
        keySet keyset = this.valueOf;
        int i5 = (i4 ^ 117) + ((i4 & 117) << 1);
        getSchemeLogo = i5 % 128;
        if (i5 % 2 != 0) {
            return keyset;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String getParamValue() {
        int i = getSchemeEncryptionPublicKey;
        String str = this.ThreeDS2Service$InitializationCallback;
        getSchemeLogo = ((i & 43) + (i | 43)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAllCaps
    public setSelectAllOnFocus getSDKInfo() {
        setSelectAllOnFocus setselectallonfocus;
        int i = getSchemeEncryptionPublicKey;
        int i2 = (((i ^ 117) | (i & 117)) << 1) - ((i & (-118)) | ((~i) & 117));
        getSchemeLogo = i2 % 128;
        if (i2 % 2 == 0) {
            setselectallonfocus = this.unionSchemeConfiguration;
            int i3 = 23 / 0;
        } else {
            setselectallonfocus = this.unionSchemeConfiguration;
        }
        getSchemeLogo = (((i | 73) << 1) - (i ^ 73)) % 128;
        return setselectallonfocus;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSingleLine
    public Integer getSDKVersion() {
        int i = getSchemeEncryptionPublicKey + 61;
        int i2 = i % 128;
        getSchemeLogo = i2;
        if (i % 2 != 0) {
            Integer num = this.getSDKVersion;
            int i3 = i2 ^ 37;
            int i4 = ((((i2 & 37) | i3) << 1) - (~(-i3))) - 1;
            getSchemeEncryptionPublicKey = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 36 / 0;
            }
            return num;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String getSchemeId() {
        int i = getSchemeEncryptionPublicKey;
        String str = this.getSchemeName;
        int i2 = ((i | 121) << 1) - (i ^ 121);
        getSchemeLogo = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String getSchemeLogo() {
        int i = getSchemeEncryptionPublicKey;
        int i2 = i & 1;
        int i3 = (i ^ 1) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        getSchemeLogo = i4 % 128;
        if (i4 % 2 != 0) {
            return this.getSchemeLogoDark;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String getSchemeName() {
        int i = getSchemeEncryptionPublicKey;
        int i2 = (((i & 32) + (i | 32)) - 1) % 128;
        getSchemeLogo = i2;
        String str = this.getSchemeId;
        getSchemeEncryptionPublicKey = (i2 + 23) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String getSchemePublicRootKeys() {
        int i = getSchemeLogo;
        String str = this.getSchemePublicRootKeys;
        int i2 = i & 63;
        int i3 = (i2 - (~((i ^ 63) | i2))) - 1;
        getSchemeEncryptionPublicKey = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSingleLine
    public List<setCustomSelectionActionModeCallback> getWarnings() {
        int i = getSchemeLogo;
        int i2 = (i & (-86)) | ((~i) & 85);
        int i3 = (i & 85) << 1;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getSchemeEncryptionPublicKey = i4 % 128;
        if (i4 % 2 == 0) {
            return this.cleanup;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAllCaps
    public setSelectAllOnFocus initialize() {
        int i = getSchemeLogo;
        int i2 = i + 121;
        getSchemeEncryptionPublicKey = i2 % 128;
        if (i2 % 2 == 0) {
            setSelectAllOnFocus setselectallonfocus = this.build;
            int i3 = i & 19;
            int i4 = i3 + ((i ^ 19) | i3);
            getSchemeEncryptionPublicKey = i4 % 128;
            if (i4 % 2 == 0) {
                return setselectallonfocus;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String jcbConfiguration() {
        int i = (getSchemeEncryptionPublicKey + 33) % 128;
        getSchemeLogo = i;
        String str = this.restrictedParameters;
        getSchemeEncryptionPublicKey = ((i ^ 109) + ((i & 109) << 1)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String mastercardSchemeConfiguration() {
        int i = getSchemeEncryptionPublicKey;
        String str = this.mastercardSchemeConfiguration;
        int i2 = i & 59;
        int i3 = (i ^ 59) | i2;
        getSchemeLogo = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String newSchemeConfiguration() {
        int i = getSchemeEncryptionPublicKey + 13;
        int i2 = i % 128;
        getSchemeLogo = i2;
        if (i % 2 != 0) {
            String str = this.jcbConfiguration;
            int i3 = i2 & 77;
            int i4 = i3 + ((i2 ^ 77) | i3);
            getSchemeEncryptionPublicKey = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String onCompleted() {
        int i = getSchemeLogo;
        int i2 = i & 31;
        int i3 = (i ^ 31) | i2;
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        getSchemeEncryptionPublicKey = i4;
        String str = this.getSDKInfo;
        int i5 = i4 + 63;
        getSchemeLogo = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public getLocalizedMessage onError() {
        int i = getSchemeLogo;
        getLocalizedMessage getlocalizedmessage = this.createTransaction;
        int i2 = i + 109;
        getSchemeEncryptionPublicKey = i2 % 128;
        if (i2 % 2 == 0) {
            return getlocalizedmessage;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public setIncludeFontPadding removeParam() {
        int i = getSchemeLogo;
        int i2 = ((i & 105) + (i | 105)) % 128;
        getSchemeEncryptionPublicKey = i2;
        setIncludeFontPadding setincludefontpadding = this.onCompleted;
        int i3 = i2 + 93;
        getSchemeLogo = i3 % 128;
        if (i3 % 2 != 0) {
            return setincludefontpadding;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String restrictedParameters() {
        int i = getSchemeEncryptionPublicKey;
        int i2 = ((((i ^ 65) | (i & 65)) << 1) - (((~i) & 65) | (i & (-66)))) % 128;
        getSchemeLogo = i2;
        String str = this.configureScheme;
        getSchemeEncryptionPublicKey = (((i2 | 87) << 1) - (i2 ^ 87)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String unionSchemeConfiguration() {
        String str;
        int i = getSchemeEncryptionPublicKey;
        int i2 = i ^ 45;
        int i3 = ((((i & 45) | i2) << 1) - (~(-i2))) - 1;
        int i4 = i3 % 128;
        getSchemeLogo = i4;
        if (i3 % 2 == 0) {
            str = this.eftposConfiguration;
            int i5 = 99 / 0;
        } else {
            str = this.eftposConfiguration;
        }
        getSchemeEncryptionPublicKey = ((i4 & 25) + (i4 | 25)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public String valueOf() {
        int i = (getSchemeEncryptionPublicKey + 75) % 128;
        getSchemeLogo = i;
        String str = this.ThreeDS2ServiceInstance;
        int i2 = (((i & (-52)) | ((~i) & 51)) - (~(-(-((i & 51) << 1))))) - 1;
        getSchemeEncryptionPublicKey = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public String values() {
        int i = getSchemeEncryptionPublicKey + 71;
        getSchemeLogo = i % 128;
        if (i % 2 != 0) {
            return this.get;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String visaSchemeConfiguration() {
        int i = getSchemeEncryptionPublicKey;
        int i2 = (((((i ^ 99) | (i & 99)) << 1) - (~(-(((~i) & 99) | (i & (-100)))))) - 1) % 128;
        getSchemeLogo = i2;
        String str = this.SchemeConfiguration;
        int i3 = (((i2 | 20) << 1) - (i2 ^ 20)) - 1;
        getSchemeEncryptionPublicKey = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
