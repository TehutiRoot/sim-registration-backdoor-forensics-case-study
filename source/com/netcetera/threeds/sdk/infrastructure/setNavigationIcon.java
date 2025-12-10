package com.netcetera.threeds.sdk.infrastructure;

import androidx.appcompat.app.AppCompatDelegate;
import java.util.List;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public final class setNavigationIcon implements setTitleTextColor {
    private static int logo = 0;
    private static int rootPublicKeyFromAssetCertificate = 1;
    private setTitleMargin ConfigParameters;
    private String ConfigurationBuilder;
    private replace SchemeConfiguration;
    private putIfAbsent SchemeConfiguration$Builder;
    private setIncludeFontPadding ThreeDS2Service;
    private String ThreeDS2Service$InitializationCallback;
    private String ThreeDS2ServiceInstance;
    private String addParam;
    private put amexConfiguration;
    private setTitleMargin apiKey;
    private getSuppressed build;
    private entrySet cbConfiguration;
    private String cleanup;
    private String configureScheme;
    private String createTransaction;
    private String dinersSchemeConfiguration;
    private String eftposConfiguration;
    private String encryptionPublicKey;
    private String get;
    private String getParamValue;
    private setIncludeFontPadding getSDKInfo;
    private getVersion getSDKVersion;
    private String getSchemeEncryptionPublicKey;
    private getInfo getSchemeEncryptionPublicKeyId;
    private String getSchemeId;
    private String getSchemeLogo;
    private String getSchemeLogoDark;
    private remove getSchemeName;
    private keySet getSchemePublicRootKeys;
    private String getWarnings;
    private String ids;
    private String initialize;
    private Integer jcbConfiguration;
    private String logoDark;
    private String mastercardSchemeConfiguration;
    private String newSchemeConfiguration;
    private String onCompleted;
    private List<setCursorVisible> onError;
    private String removeParam;
    private List<setCustomSelectionActionModeCallback> restrictedParameters;
    private keySet unionSchemeConfiguration;
    private getLocalizedMessage valueOf;
    private String values;
    private String visaSchemeConfiguration;

    public static /* synthetic */ String ConfigParameters(setNavigationIcon setnavigationicon, String str) {
        int i = logo;
        int i2 = (i & 3) + (i | 3);
        rootPublicKeyFromAssetCertificate = i2 % 128;
        int i3 = i2 % 2;
        setnavigationicon.getParamValue = str;
        if (i3 != 0) {
            rootPublicKeyFromAssetCertificate = (i + 5) % 128;
            return str;
        }
        throw null;
    }

    public static /* synthetic */ String ConfigurationBuilder(setNavigationIcon setnavigationicon, String str) {
        int i = rootPublicKeyFromAssetCertificate + 125;
        int i2 = i % 128;
        logo = i2;
        int i3 = i % 2;
        setnavigationicon.newSchemeConfiguration = str;
        if (i3 == 0) {
            int i4 = (((i2 ^ 103) | (i2 & 103)) << 1) - ((i2 & (-104)) | ((~i2) & 103));
            rootPublicKeyFromAssetCertificate = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }

    public static /* synthetic */ String SchemeConfiguration(setNavigationIcon setnavigationicon, String str) {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = i | 103;
        int i3 = (i2 << 1) - ((~(i & 103)) & i2);
        logo = i3 % 128;
        int i4 = i3 % 2;
        setnavigationicon.getSchemeLogo = str;
        if (i4 == 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ replace ThreeDS2Service(setNavigationIcon setnavigationicon, replace replaceVar) {
        int i = logo;
        int i2 = i & 125;
        int i3 = (((i | 125) & (~i2)) + (i2 << 1)) % 128;
        rootPublicKeyFromAssetCertificate = i3;
        setnavigationicon.SchemeConfiguration = replaceVar;
        int i4 = i3 & 13;
        int i5 = -(-((i3 ^ 13) | i4));
        logo = ((i4 & i5) + (i4 | i5)) % 128;
        return replaceVar;
    }

    public static /* synthetic */ String ThreeDS2Service$InitializationCallback(setNavigationIcon setnavigationicon, String str) {
        int i = logo;
        int i2 = i & 35;
        int i3 = -(-((i ^ 35) | i2));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        rootPublicKeyFromAssetCertificate = i4;
        setnavigationicon.ConfigurationBuilder = str;
        logo = (((i4 | 33) << 1) - (i4 ^ 33)) % 128;
        return str;
    }

    public static /* synthetic */ entrySet ThreeDS2ServiceInstance(setNavigationIcon setnavigationicon, entrySet entryset) {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = (-2) - (~((i ^ 64) + ((i & 64) << 1)));
        logo = i2 % 128;
        int i3 = i2 % 2;
        setnavigationicon.cbConfiguration = entryset;
        if (i3 == 0) {
            int i4 = (i & (-72)) | ((~i) & 71);
            int i5 = -(-((i & 71) << 1));
            logo = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
            return entryset;
        }
        throw null;
    }

    public static /* synthetic */ String addParam(setNavigationIcon setnavigationicon, String str) {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = ((((i | 76) << 1) - (i ^ 76)) - 1) % 128;
        logo = i2;
        setnavigationicon.dinersSchemeConfiguration = str;
        int i3 = i2 & 13;
        int i4 = -(-((i2 ^ 13) | i3));
        int i5 = (i3 & i4) + (i3 | i4);
        rootPublicKeyFromAssetCertificate = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ String amexConfiguration(setNavigationIcon setnavigationicon, String str) {
        int i = logo;
        int i2 = i & 91;
        int i3 = (i2 + ((i ^ 91) | i2)) % 128;
        rootPublicKeyFromAssetCertificate = i3;
        setnavigationicon.ids = str;
        int i4 = (i3 & (-20)) | ((~i3) & 19);
        int i5 = (i3 & 19) << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        logo = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ String apiKey(setNavigationIcon setnavigationicon, String str) {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = i ^ 67;
        int i3 = -(-((i & 67) << 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        logo = i4 % 128;
        int i5 = i4 % 2;
        setnavigationicon.visaSchemeConfiguration = str;
        if (i5 != 0) {
            int i6 = 70 / 0;
        }
        return str;
    }

    public static /* synthetic */ String build(setNavigationIcon setnavigationicon, String str) {
        int i = logo;
        int i2 = i ^ 11;
        int i3 = ((((i & 11) | i2) << 1) - (~(-i2))) - 1;
        rootPublicKeyFromAssetCertificate = i3 % 128;
        int i4 = i3 % 2;
        setnavigationicon.getSchemeEncryptionPublicKey = str;
        if (i4 != 0) {
            rootPublicKeyFromAssetCertificate = ((-2) - (~((i & 72) + (i | 72)))) % 128;
            return str;
        }
        throw null;
    }

    public static /* synthetic */ String cleanup(setNavigationIcon setnavigationicon, String str) {
        int i = logo;
        int i2 = (i ^ 53) + ((i & 53) << 1);
        int i3 = i2 % 128;
        rootPublicKeyFromAssetCertificate = i3;
        int i4 = i2 % 2;
        setnavigationicon.configureScheme = str;
        if (i4 != 0) {
            int i5 = ((i3 & 32) + (i3 | 32)) - 1;
            logo = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }

    public static /* synthetic */ String configureScheme(setNavigationIcon setnavigationicon, String str) {
        int i = logo;
        int i2 = i + 81;
        rootPublicKeyFromAssetCertificate = i2 % 128;
        int i3 = i2 % 2;
        setnavigationicon.encryptionPublicKey = str;
        if (i3 != 0) {
            rootPublicKeyFromAssetCertificate = (i + 1) % 128;
            return str;
        }
        throw null;
    }

    public static /* synthetic */ String createTransaction(setNavigationIcon setnavigationicon, String str) {
        int i = logo;
        int i2 = i & 29;
        int i3 = (i | 29) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        int i6 = i5 % 128;
        rootPublicKeyFromAssetCertificate = i6;
        int i7 = i5 % 2;
        setnavigationicon.ThreeDS2Service$InitializationCallback = str;
        if (i7 != 0) {
            int i8 = i6 & 43;
            int i9 = (((i6 ^ 43) | i8) << 1) - ((i6 | 43) & (~i8));
            logo = i9 % 128;
            if (i9 % 2 == 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }

    public static /* synthetic */ keySet get(setNavigationIcon setnavigationicon, keySet keyset) {
        int i = rootPublicKeyFromAssetCertificate;
        logo = (i + 113) % 128;
        setnavigationicon.getSchemePublicRootKeys = keyset;
        int i2 = i & 91;
        int i3 = i | 91;
        logo = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
        return keyset;
    }

    public static /* synthetic */ String getParamValue(setNavigationIcon setnavigationicon, String str) {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = i & 115;
        int i3 = (i ^ 115) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        logo = i5;
        int i6 = i4 % 2;
        setnavigationicon.removeParam = str;
        if (i6 == 0) {
            int i7 = i5 + 67;
            rootPublicKeyFromAssetCertificate = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 60 / 0;
            }
            return str;
        }
        throw null;
    }

    public static /* synthetic */ String getSDKInfo(setNavigationIcon setnavigationicon, String str) {
        int i = logo;
        int i2 = ((((i | 36) << 1) - (i ^ 36)) - 1) % 128;
        rootPublicKeyFromAssetCertificate = i2;
        setnavigationicon.createTransaction = str;
        int i3 = i2 & 63;
        int i4 = (((~i3) & (i2 | 63)) - (~(-(-(i3 << 1))))) - 1;
        logo = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return str;
    }

    public static /* synthetic */ String getSDKVersion(setNavigationIcon setnavigationicon, String str) {
        int i = rootPublicKeyFromAssetCertificate;
        logo = (i + 41) % 128;
        setnavigationicon.mastercardSchemeConfiguration = str;
        logo = (i + 21) % 128;
        return str;
    }

    public static /* synthetic */ String getWarnings(setNavigationIcon setnavigationicon, String str) {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = i & 19;
        int i3 = (((i | 19) & (~i2)) - (~(i2 << 1))) - 1;
        int i4 = i3 % 128;
        logo = i4;
        int i5 = i3 % 2;
        setnavigationicon.cleanup = str;
        if (i5 != 0) {
            int i6 = 18 / 0;
        }
        int i7 = (-2) - (~((i4 & 6) + (i4 | 6)));
        rootPublicKeyFromAssetCertificate = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ String initialize(setNavigationIcon setnavigationicon, String str) {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = i & 107;
        int i3 = (i ^ 107) | i2;
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        logo = i4;
        setnavigationicon.getWarnings = str;
        int i5 = i4 & 45;
        rootPublicKeyFromAssetCertificate = (i5 + ((i4 ^ 45) | i5)) % 128;
        return str;
    }

    public static /* synthetic */ String mastercardSchemeConfiguration(setNavigationIcon setnavigationicon, String str) {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = i & 121;
        int i3 = (i ^ 121) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        logo = i4 % 128;
        int i5 = i4 % 2;
        setnavigationicon.logoDark = str;
        if (i5 == 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ String onCompleted(setNavigationIcon setnavigationicon, String str) {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = i & 19;
        int i3 = ((i ^ 19) | i2) << 1;
        int i4 = -((i | 19) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        logo = i6;
        int i7 = i5 % 2;
        setnavigationicon.onCompleted = str;
        if (i7 == 0) {
            int i8 = (i6 ^ 25) + ((i6 & 25) << 1);
            rootPublicKeyFromAssetCertificate = i8 % 128;
            if (i8 % 2 != 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }

    public static /* synthetic */ String onError(setNavigationIcon setnavigationicon, String str) {
        int i = logo;
        int i2 = i & 59;
        int i3 = (((i | 59) & (~i2)) + (i2 << 1)) % 128;
        rootPublicKeyFromAssetCertificate = i3;
        setnavigationicon.addParam = str;
        logo = (((i3 | 25) << 1) - (i3 ^ 25)) % 128;
        return str;
    }

    public static /* synthetic */ String removeParam(setNavigationIcon setnavigationicon, String str) {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = i & 39;
        int i3 = (i2 + ((i ^ 39) | i2)) % 128;
        logo = i3;
        setnavigationicon.eftposConfiguration = str;
        int i4 = i3 + 13;
        rootPublicKeyFromAssetCertificate = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ String restrictedParameters(setNavigationIcon setnavigationicon, String str) {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = (((i | 33) << 1) - (i ^ 33)) % 128;
        logo = i2;
        setnavigationicon.getSchemeLogoDark = str;
        int i3 = i2 + 8;
        rootPublicKeyFromAssetCertificate = ((~i3) + (i3 << 1)) % 128;
        return str;
    }

    public static /* synthetic */ String valueOf(setNavigationIcon setnavigationicon, String str) {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = (i & 69) + (i | 69);
        logo = i2 % 128;
        int i3 = i2 % 2;
        setnavigationicon.ThreeDS2ServiceInstance = str;
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return str;
    }

    public static /* synthetic */ getInfo values(setNavigationIcon setnavigationicon, getInfo getinfo) {
        int i = logo;
        int i2 = i | 95;
        int i3 = i2 << 1;
        int i4 = -((~(i & 95)) & i2);
        int i5 = ((i3 & i4) + (i4 | i3)) % 128;
        rootPublicKeyFromAssetCertificate = i5;
        setnavigationicon.getSchemeEncryptionPublicKeyId = getinfo;
        int i6 = i5 & 29;
        int i7 = ((i5 ^ 29) | i6) << 1;
        int i8 = -((~i6) & (i5 | 29));
        logo = ((i7 & i8) + (i7 | i8)) % 128;
        return getinfo;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCustomInsertionActionModeCallback
    public remove SchemeConfiguration$Builder() {
        int i = logo;
        remove removeVar = this.getSchemeName;
        int i2 = i & 31;
        int i3 = -(-((i ^ 31) | i2));
        rootPublicKeyFromAssetCertificate = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        return removeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public putIfAbsent cbConfiguration() {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = i & 15;
        int i3 = (i ^ 15) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        logo = i4 % 128;
        int i5 = i4 % 2;
        putIfAbsent putifabsent = this.SchemeConfiguration$Builder;
        if (i5 != 0) {
            int i6 = 3 / 0;
        }
        return putifabsent;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String dinersSchemeConfiguration() {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = i & 67;
        int i3 = (i ^ 67) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        logo = i4 % 128;
        int i5 = i4 % 2;
        String str = this.ConfigurationBuilder;
        if (i5 != 0) {
            int i6 = 0 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String eftposConfiguration() {
        String str;
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = i & 17;
        int i3 = i2 + ((i ^ 17) | i2);
        logo = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.getSchemeEncryptionPublicKey;
            int i4 = 57 / 0;
        } else {
            str = this.getSchemeEncryptionPublicKey;
        }
        logo = (i + 101) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCustomInsertionActionModeCallback
    public entrySet getSchemeEncryptionPublicKey() {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = (i & 93) + (i | 93);
        logo = i2 % 128;
        if (i2 % 2 == 0) {
            return this.cbConfiguration;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCustomInsertionActionModeCallback
    public String getSchemeEncryptionPublicKeyId() {
        int i = logo;
        int i2 = i & 107;
        int i3 = (((i ^ 107) | i2) << 1) - ((i | 107) & (~i2));
        rootPublicKeyFromAssetCertificate = i3 % 128;
        if (i3 % 2 != 0) {
            return this.newSchemeConfiguration;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String getSchemeId() {
        int i = logo;
        int i2 = (i ^ CameraActivity.REQUEST_CODE) + ((i & CameraActivity.REQUEST_CODE) << 1);
        rootPublicKeyFromAssetCertificate = i2 % 128;
        int i3 = i2 % 2;
        String str = this.mastercardSchemeConfiguration;
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String getSchemeLogo() {
        int i = rootPublicKeyFromAssetCertificate;
        String str = this.encryptionPublicKey;
        int i2 = i & 97;
        int i3 = -(-((i ^ 97) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        logo = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPopupTheme
    public replace getSchemeLogoDark() {
        int i = (logo + 99) % 128;
        rootPublicKeyFromAssetCertificate = i;
        replace replaceVar = this.SchemeConfiguration;
        int i2 = i & 101;
        int i3 = (i | 101) & (~i2);
        int i4 = -(-(i2 << 1));
        logo = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        return replaceVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String getSchemeName() {
        int i = rootPublicKeyFromAssetCertificate;
        String str = this.logoDark;
        int i2 = i & 105;
        int i3 = -(-((i ^ 105) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        logo = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String getSchemePublicRootKeys() {
        int i = logo;
        int i2 = i & 37;
        int i3 = (i ^ 37) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = i4 % 128;
        rootPublicKeyFromAssetCertificate = i5;
        int i6 = i4 % 2;
        String str = this.ids;
        if (i6 == 0) {
            int i7 = 27 / 0;
        }
        int i8 = i5 & 95;
        int i9 = (((i5 ^ 95) | i8) << 1) - ((i5 | 95) & (~i8));
        logo = i9 % 128;
        if (i9 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCustomInsertionActionModeCallback
    public String ids() {
        int i = logo;
        int i2 = ((((i ^ 47) | (i & 47)) << 1) - (((~i) & 47) | (i & (-48)))) % 128;
        rootPublicKeyFromAssetCertificate = i2;
        String str = this.getSchemeLogo;
        int i3 = i2 & 107;
        logo = (i3 + ((i2 ^ 107) | i3)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String jcbConfiguration() {
        int i = logo;
        int i2 = (i & 121) + (i | 121);
        int i3 = i2 % 128;
        rootPublicKeyFromAssetCertificate = i3;
        if (i2 % 2 != 0) {
            String str = this.getParamValue;
            logo = ((((i3 | 28) << 1) - (i3 ^ 28)) - 1) % 128;
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCustomInsertionActionModeCallback
    public String logo() {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = (((i | 121) << 1) - (~(-(((~i) & 121) | (i & (-122)))))) - 1;
        int i3 = i2 % 128;
        logo = i3;
        if (i2 % 2 == 0) {
            String str = this.eftposConfiguration;
            int i4 = i3 & 83;
            int i5 = (i3 | 83) & (~i4);
            int i6 = i4 << 1;
            rootPublicKeyFromAssetCertificate = ((i5 & i6) + (i5 | i6)) % 128;
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCustomInsertionActionModeCallback
    public keySet logoDark() {
        int i = logo;
        int i2 = (i | 35) << 1;
        int i3 = -(i ^ 35);
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        rootPublicKeyFromAssetCertificate = i4 % 128;
        int i5 = i4 % 2;
        keySet keyset = this.getSchemePublicRootKeys;
        if (i5 == 0) {
            int i6 = 40 / 0;
        }
        return keyset;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String newSchemeConfiguration() {
        int i = logo;
        String str = this.configureScheme;
        int i2 = i ^ 11;
        int i3 = (((i & 11) | i2) << 1) - i2;
        rootPublicKeyFromAssetCertificate = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 58 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String unionSchemeConfiguration() {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = ((i ^ 25) | (i & 25)) << 1;
        int i3 = -(((~i) & 25) | (i & (-26)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        logo = i5;
        int i6 = i4 % 2;
        String str = this.getSchemeLogoDark;
        if (i6 != 0) {
            int i7 = 84 / 0;
        }
        int i8 = i5 ^ 19;
        int i9 = (((i5 & 19) | i8) << 1) - i8;
        rootPublicKeyFromAssetCertificate = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 99 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String visaSchemeConfiguration() {
        int i = logo;
        String str = this.addParam;
        int i2 = i & 43;
        int i3 = ((i ^ 43) | i2) << 1;
        int i4 = -((i | 43) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        rootPublicKeyFromAssetCertificate = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private setNavigationIcon() {
    }

    public static /* synthetic */ setTitleMargin ThreeDS2Service(setNavigationIcon setnavigationicon, setTitleMargin settitlemargin) {
        int i = (rootPublicKeyFromAssetCertificate + 61) % 128;
        logo = i;
        setnavigationicon.apiKey = settitlemargin;
        int i2 = ((i | 105) << 1) - (i ^ 105);
        rootPublicKeyFromAssetCertificate = i2 % 128;
        if (i2 % 2 != 0) {
            return settitlemargin;
        }
        throw null;
    }

    public static /* synthetic */ getSuppressed ThreeDS2ServiceInstance(setNavigationIcon setnavigationicon, getSuppressed getsuppressed) {
        int i = (rootPublicKeyFromAssetCertificate + 117) % 128;
        logo = i;
        setnavigationicon.build = getsuppressed;
        int i2 = i ^ 49;
        rootPublicKeyFromAssetCertificate = (((((i & 49) | i2) << 1) - (~(-i2))) - 1) % 128;
        return getsuppressed;
    }

    public static /* synthetic */ remove get(setNavigationIcon setnavigationicon, remove removeVar) {
        int i = (logo + 35) % 128;
        rootPublicKeyFromAssetCertificate = i;
        setnavigationicon.getSchemeName = removeVar;
        logo = (i + 21) % 128;
        return removeVar;
    }

    public static /* synthetic */ getLocalizedMessage values(setNavigationIcon setnavigationicon, getLocalizedMessage getlocalizedmessage) {
        int i = logo;
        int i2 = ((i | 87) << 1) - (i ^ 87);
        rootPublicKeyFromAssetCertificate = i2 % 128;
        int i3 = i2 % 2;
        setnavigationicon.valueOf = getlocalizedmessage;
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return getlocalizedmessage;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMarqueeRepeatLimit
    public getInfo ConfigParameters() {
        int i = logo;
        int i2 = ((((i | 53) << 1) - (~(-(((~i) & 53) | (i & (-54)))))) - 1) % 128;
        rootPublicKeyFromAssetCertificate = i2;
        getInfo getinfo = this.getSchemeEncryptionPublicKeyId;
        logo = (i2 + 95) % 128;
        return getinfo;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String ConfigurationBuilder() {
        int i = rootPublicKeyFromAssetCertificate;
        String str = this.cleanup;
        logo = (i + 23) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public List<setCursorVisible> SchemeConfiguration() {
        int i = logo;
        List<setCursorVisible> list = this.onError;
        int i2 = i & 117;
        int i3 = i2 + ((i ^ 117) | i2);
        rootPublicKeyFromAssetCertificate = i3 % 128;
        if (i3 % 2 != 0) {
            return list;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String ThreeDS2Service$InitializationCallback() {
        int i = logo;
        String str = this.values;
        int i2 = i & 43;
        int i3 = i2 + ((i ^ 43) | i2);
        rootPublicKeyFromAssetCertificate = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 87 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String addParam() {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = i & 29;
        int i3 = (((i | 29) & (~i2)) + (i2 << 1)) % 128;
        logo = i3;
        String str = this.getWarnings;
        rootPublicKeyFromAssetCertificate = (((((i3 ^ 5) | (i3 & 5)) << 1) - (~(-(((~i3) & 5) | (i3 & (-6)))))) - 1) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String amexConfiguration() {
        int i = rootPublicKeyFromAssetCertificate;
        String str = this.removeParam;
        int i2 = i & 71;
        int i3 = (i ^ 71) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        logo = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public setIncludeFontPadding apiKey() {
        int i = logo;
        setIncludeFontPadding setincludefontpadding = this.getSDKInfo;
        rootPublicKeyFromAssetCertificate = (((i & 30) + (i | 30)) - 1) % 128;
        return setincludefontpadding;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public getVersion build() {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = (i | 61) << 1;
        int i3 = -(i ^ 61);
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        logo = i4 % 128;
        if (i4 % 2 == 0) {
            getVersion getversion = this.getSDKVersion;
            int i5 = i & 81;
            int i6 = (i5 - (~((i ^ 81) | i5))) - 1;
            logo = i6 % 128;
            if (i6 % 2 == 0) {
                return getversion;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSingleLine
    public getSuppressed cleanup() {
        int i = logo;
        getSuppressed getsuppressed = this.build;
        int i2 = ((i | 94) << 1) - (i ^ 94);
        rootPublicKeyFromAssetCertificate = ((~i2) + (i2 << 1)) % 128;
        return getsuppressed;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String configureScheme() {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = i | 85;
        int i3 = (i2 << 1) - (i2 & (~(i & 85)));
        logo = i3 % 128;
        int i4 = i3 % 2;
        String str = this.createTransaction;
        if (i4 != 0) {
            int i5 = 83 / 0;
        }
        int i6 = i & 81;
        logo = ((((i | 81) & (~i6)) - (~(-(-(i6 << 1))))) - 1) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String createTransaction() {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = (-2) - (~((i & 26) + (i | 26)));
        int i3 = i2 % 128;
        logo = i3;
        if (i2 % 2 == 0) {
            String str = this.ThreeDS2ServiceInstance;
            int i4 = i3 + 11;
            rootPublicKeyFromAssetCertificate = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String getParamValue() {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = i & 101;
        int i3 = ((i ^ 101) | i2) << 1;
        int i4 = -((i | 101) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        logo = i5 % 128;
        if (i5 % 2 == 0) {
            return this.initialize;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTextIsSelectable
    public setTitleMargin getSDKInfo() {
        int i = rootPublicKeyFromAssetCertificate;
        setTitleMargin settitlemargin = this.ConfigParameters;
        logo = (i + 17) % 128;
        return settitlemargin;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSingleLine
    public Integer getSDKVersion() {
        int i = logo;
        Integer num = this.jcbConfiguration;
        int i2 = i & 5;
        int i3 = i | 5;
        rootPublicKeyFromAssetCertificate = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return num;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSingleLine
    public List<setCustomSelectionActionModeCallback> getWarnings() {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = (i ^ 111) + ((i & 111) << 1);
        logo = i2 % 128;
        if (i2 % 2 == 0) {
            List<setCustomSelectionActionModeCallback> list = this.restrictedParameters;
            int i3 = ((i | 117) << 1) - (i ^ 117);
            logo = i3 % 128;
            if (i3 % 2 == 0) {
                return list;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTextIsSelectable
    public setTitleMargin initialize() {
        int i = logo;
        setTitleMargin settitlemargin = this.apiKey;
        int i2 = i & 25;
        int i3 = ((i ^ 25) | i2) << 1;
        int i4 = -((i | 25) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        rootPublicKeyFromAssetCertificate = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return settitlemargin;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String mastercardSchemeConfiguration() {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = i & 125;
        int i3 = (i | 125) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        logo = i5 % 128;
        int i6 = i5 % 2;
        String str = this.onCompleted;
        if (i6 != 0) {
            int i7 = 72 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String onCompleted() {
        int i = rootPublicKeyFromAssetCertificate + 49;
        int i2 = i % 128;
        logo = i2;
        if (i % 2 == 0) {
            String str = this.get;
            rootPublicKeyFromAssetCertificate = (((i2 | 65) << 1) - (i2 ^ 65)) % 128;
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public getLocalizedMessage onError() {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = (i ^ 111) + ((i & 111) << 1);
        logo = i2 % 128;
        int i3 = i2 % 2;
        getLocalizedMessage getlocalizedmessage = this.valueOf;
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        return getlocalizedmessage;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public setIncludeFontPadding removeParam() {
        int i = logo;
        int i2 = i & 35;
        int i3 = (((((i ^ 35) | i2) << 1) - (~(-((i | 35) & (~i2))))) - 1) % 128;
        rootPublicKeyFromAssetCertificate = i3;
        setIncludeFontPadding setincludefontpadding = this.ThreeDS2Service;
        int i4 = (i3 ^ 107) + ((i3 & 107) << 1);
        logo = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return setincludefontpadding;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScroller
    public String restrictedParameters() {
        int i = logo;
        int i2 = ((i ^ 67) | (i & 67)) << 1;
        int i3 = -(((~i) & 67) | (i & (-68)));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        rootPublicKeyFromAssetCertificate = i4;
        String str = this.ThreeDS2Service$InitializationCallback;
        int i5 = (i4 & 106) + (i4 | 106);
        logo = ((~i5) + (i5 << 1)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public String valueOf() {
        int i = (rootPublicKeyFromAssetCertificate + 21) % 128;
        logo = i;
        String str = this.dinersSchemeConfiguration;
        int i2 = ((i ^ 13) | (i & 13)) << 1;
        int i3 = -(((~i) & 13) | (i & (-14)));
        rootPublicKeyFromAssetCertificate = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        return str;
    }

    /* loaded from: classes5.dex */
    public static final class valueOf {
        private static int SchemeConfiguration$Builder = 0;
        private static int encryptionPublicKeyFromAssetCertificate = 1;
        private String ConfigParameters;
        private String ConfigurationBuilder;
        private replace SchemeConfiguration;
        private String ThreeDS2Service;
        private String ThreeDS2Service$InitializationCallback;
        private String ThreeDS2ServiceInstance;
        private setTitleMargin addParam;
        private Integer amexConfiguration;
        private String apiKey;
        private String build;
        private String cbConfiguration;
        private getVersion cleanup;
        private String configureScheme;
        private String createTransaction;
        private keySet dinersSchemeConfiguration;
        private String eftposConfiguration;
        private String encryptionPublicKey;
        private getLocalizedMessage get;
        private String getParamValue;
        private String getSDKInfo;
        private String getSDKVersion;
        private String getSchemeEncryptionPublicKey;
        private String getSchemeEncryptionPublicKeyId;
        private String getSchemeId;
        private getInfo getSchemeLogo;
        private keySet getSchemeLogoDark;
        private entrySet getSchemeName;
        private String getSchemePublicRootKeys;
        private setIncludeFontPadding getWarnings;
        private putIfAbsent ids;
        private String initialize;
        private String jcbConfiguration;
        private String logo;
        private String logoDark;
        private List<setCustomSelectionActionModeCallback> mastercardSchemeConfiguration;
        private remove newSchemeConfiguration;
        private List<setCursorVisible> onCompleted;
        private setTitleMargin onError;
        private String removeParam;
        private getSuppressed restrictedParameters;
        private put unionSchemeConfiguration;
        private setIncludeFontPadding valueOf;
        private String values;
        private String visaSchemeConfiguration;

        public valueOf ConfigParameters(String str) {
            int i = SchemeConfiguration$Builder + CameraActivity.REQUEST_CODE;
            encryptionPublicKeyFromAssetCertificate = i % 128;
            if (i % 2 != 0) {
                this.build = str;
                return this;
            }
            this.build = str;
            throw null;
        }

        public valueOf ConfigurationBuilder(String str) {
            int i = SchemeConfiguration$Builder;
            int i2 = i | 7;
            int i3 = i2 << 1;
            int i4 = -((~(i & 7)) & i2);
            int i5 = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            encryptionPublicKeyFromAssetCertificate = i5;
            this.jcbConfiguration = str;
            int i6 = i5 + 43;
            SchemeConfiguration$Builder = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public valueOf SchemeConfiguration(String str) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = i & 31;
            int i3 = (i2 - (~(-(-((i ^ 31) | i2))))) - 1;
            SchemeConfiguration$Builder = i3 % 128;
            if (i3 % 2 == 0) {
                this.logoDark = str;
                SchemeConfiguration$Builder = ((((i | AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR) << 1) - (i ^ AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR)) - 1) % 128;
                return this;
            }
            this.logoDark = str;
            throw null;
        }

        public valueOf ThreeDS2Service(String str) {
            int i = SchemeConfiguration$Builder;
            int i2 = (i ^ 101) + ((i & 101) << 1);
            encryptionPublicKeyFromAssetCertificate = i2 % 128;
            if (i2 % 2 == 0) {
                this.values = str;
                int i3 = 75 / 0;
            } else {
                this.values = str;
            }
            encryptionPublicKeyFromAssetCertificate = (i + 89) % 128;
            return this;
        }

        public valueOf ThreeDS2Service$InitializationCallback(String str) {
            int i = SchemeConfiguration$Builder;
            int i2 = i & 71;
            int i3 = (i2 - (~(-(-((i ^ 71) | i2))))) - 1;
            encryptionPublicKeyFromAssetCertificate = i3 % 128;
            if (i3 % 2 != 0) {
                this.apiKey = str;
                return this;
            }
            this.apiKey = str;
            throw null;
        }

        public valueOf ThreeDS2ServiceInstance(String str) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = (i & (-70)) | ((~i) & 69);
            int i3 = -(-((i & 69) << 1));
            int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            SchemeConfiguration$Builder = i4;
            this.initialize = str;
            int i5 = i4 & 101;
            int i6 = (~i5) & (i4 | 101);
            int i7 = i5 << 1;
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            encryptionPublicKeyFromAssetCertificate = i8 % 128;
            if (i8 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public valueOf addParam(String str) {
            int i = SchemeConfiguration$Builder;
            int i2 = (i & 57) + (i | 57);
            encryptionPublicKeyFromAssetCertificate = i2 % 128;
            if (i2 % 2 == 0) {
                this.visaSchemeConfiguration = str;
                int i3 = 51 / 0;
            } else {
                this.visaSchemeConfiguration = str;
            }
            return this;
        }

        public valueOf apiKey(String str) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = i & 29;
            int i3 = (~i2) & (i | 29);
            int i4 = i2 << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            SchemeConfiguration$Builder = i5 % 128;
            if (i5 % 2 == 0) {
                this.eftposConfiguration = str;
                SchemeConfiguration$Builder = (((i | 57) << 1) - (i ^ 57)) % 128;
                return this;
            }
            this.eftposConfiguration = str;
            throw null;
        }

        public valueOf build(String str) {
            int i = SchemeConfiguration$Builder;
            this.getSchemeEncryptionPublicKey = str;
            int i2 = (i ^ 35) + ((i & 35) << 1);
            encryptionPublicKeyFromAssetCertificate = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 38 / 0;
            }
            return this;
        }

        public valueOf cleanup(String str) {
            int i = SchemeConfiguration$Builder;
            int i2 = (i ^ 51) + ((i & 51) << 1);
            encryptionPublicKeyFromAssetCertificate = i2 % 128;
            if (i2 % 2 == 0) {
                this.ThreeDS2Service$InitializationCallback = str;
                int i3 = 62 / 0;
            } else {
                this.ThreeDS2Service$InitializationCallback = str;
            }
            return this;
        }

        public valueOf configureScheme(String str) {
            int i = SchemeConfiguration$Builder;
            int i2 = i & 79;
            int i3 = (i ^ 79) | i2;
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            int i5 = i4 % 128;
            encryptionPublicKeyFromAssetCertificate = i5;
            if (i4 % 2 != 0) {
                this.encryptionPublicKey = str;
                SchemeConfiguration$Builder = ((-2) - (~(i5 + 86))) % 128;
                return this;
            }
            this.encryptionPublicKey = str;
            throw null;
        }

        public valueOf createTransaction(String str) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = (((i | 98) << 1) - (i ^ 98)) - 1;
            SchemeConfiguration$Builder = i2 % 128;
            if (i2 % 2 == 0) {
                this.getParamValue = str;
                return this;
            }
            this.getParamValue = str;
            throw null;
        }

        public valueOf get(String str) {
            int i = (-2) - (~(encryptionPublicKeyFromAssetCertificate + 74));
            SchemeConfiguration$Builder = i % 128;
            if (i % 2 == 0) {
                this.ThreeDS2ServiceInstance = str;
                return this;
            }
            this.ThreeDS2ServiceInstance = str;
            throw null;
        }

        public valueOf getParamValue(String str) {
            int i = (SchemeConfiguration$Builder + 63) % 128;
            encryptionPublicKeyFromAssetCertificate = i;
            this.getSchemeId = str;
            int i2 = i ^ 41;
            SchemeConfiguration$Builder = ((((i & 41) | i2) << 1) - i2) % 128;
            return this;
        }

        public valueOf getSDKInfo(String str) {
            int i = SchemeConfiguration$Builder;
            int i2 = (i ^ 113) + ((i & 113) << 1);
            encryptionPublicKeyFromAssetCertificate = i2 % 128;
            if (i2 % 2 == 0) {
                this.getSDKInfo = str;
                int i3 = 79 / 0;
            } else {
                this.getSDKInfo = str;
            }
            int i4 = (i | 39) << 1;
            int i5 = -(((~i) & 39) | (i & (-40)));
            int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
            encryptionPublicKeyFromAssetCertificate = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public valueOf getSDKVersion(String str) {
            int i = SchemeConfiguration$Builder;
            int i2 = (i ^ 31) + ((i & 31) << 1);
            int i3 = i2 % 128;
            encryptionPublicKeyFromAssetCertificate = i3;
            if (i2 % 2 == 0) {
                this.removeParam = str;
                int i4 = 62 / 0;
            } else {
                this.removeParam = str;
            }
            SchemeConfiguration$Builder = ((i3 ^ 89) + ((i3 & 89) << 1)) % 128;
            return this;
        }

        public valueOf getWarnings(String str) {
            int i = (encryptionPublicKeyFromAssetCertificate + 87) % 128;
            SchemeConfiguration$Builder = i;
            this.createTransaction = str;
            int i2 = i + 57;
            encryptionPublicKeyFromAssetCertificate = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 0;
            }
            return this;
        }

        public valueOf initialize(String str) {
            int i = SchemeConfiguration$Builder;
            this.ConfigParameters = str;
            int i2 = i & 89;
            int i3 = i | 89;
            encryptionPublicKeyFromAssetCertificate = ((i2 & i3) + (i2 | i3)) % 128;
            return this;
        }

        public valueOf mastercardSchemeConfiguration(String str) {
            int i = SchemeConfiguration$Builder;
            this.getSchemeEncryptionPublicKeyId = str;
            int i2 = i & 3;
            int i3 = (i | 3) & (~i2);
            int i4 = -(-(i2 << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            encryptionPublicKeyFromAssetCertificate = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public valueOf onCompleted(String str) {
            int i = encryptionPublicKeyFromAssetCertificate + 65;
            int i2 = i % 128;
            SchemeConfiguration$Builder = i2;
            if (i % 2 == 0) {
                this.configureScheme = str;
                encryptionPublicKeyFromAssetCertificate = (((i2 | 35) << 1) - ((i2 & (-36)) | ((~i2) & 35))) % 128;
                return this;
            }
            this.configureScheme = str;
            throw null;
        }

        public valueOf onError(String str) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = ((i | 75) << 1) - (i ^ 75);
            SchemeConfiguration$Builder = i2 % 128;
            if (i2 % 2 != 0) {
                this.ConfigurationBuilder = str;
                int i3 = 44 / 0;
            } else {
                this.ConfigurationBuilder = str;
            }
            int i4 = ((i ^ 34) + ((i & 34) << 1)) - 1;
            SchemeConfiguration$Builder = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public valueOf removeParam(String str) {
            int i = SchemeConfiguration$Builder;
            int i2 = (((i & (-110)) | ((~i) & 109)) + ((i & 109) << 1)) % 128;
            encryptionPublicKeyFromAssetCertificate = i2;
            this.cbConfiguration = str;
            int i3 = (i2 & 82) + (i2 | 82);
            SchemeConfiguration$Builder = ((~i3) + (i3 << 1)) % 128;
            return this;
        }

        public valueOf restrictedParameters(String str) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = ~i;
            this.getSchemePublicRootKeys = str;
            int i3 = (((i & (-78)) | (i2 & 77)) - (~(-(-((i & 77) << 1))))) - 1;
            SchemeConfiguration$Builder = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 34 / 0;
            }
            return this;
        }

        public valueOf valueOf(String str) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = i & 113;
            int i3 = ((i | 113) & (~i2)) + (i2 << 1);
            SchemeConfiguration$Builder = i3 % 128;
            if (i3 % 2 == 0) {
                this.ThreeDS2Service = str;
                return this;
            }
            this.ThreeDS2Service = str;
            throw null;
        }

        public valueOf values(String str) {
            int i = ((-2) - (~(SchemeConfiguration$Builder + 70))) % 128;
            encryptionPublicKeyFromAssetCertificate = i;
            this.getSDKVersion = str;
            int i2 = ((i ^ 47) | (i & 47)) << 1;
            int i3 = -(((~i) & 47) | (i & (-48)));
            SchemeConfiguration$Builder = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
            return this;
        }

        public valueOf visaSchemeConfiguration(String str) {
            int i = SchemeConfiguration$Builder;
            int i2 = (i & 31) + (i | 31);
            encryptionPublicKeyFromAssetCertificate = i2 % 128;
            if (i2 % 2 == 0) {
                this.logo = str;
                int i3 = 46 / 0;
            } else {
                this.logo = str;
            }
            int i4 = i & 101;
            int i5 = (i | 101) & (~i4);
            int i6 = -(-(i4 << 1));
            encryptionPublicKeyFromAssetCertificate = ((i5 & i6) + (i6 | i5)) % 128;
            return this;
        }

        public valueOf ThreeDS2ServiceInstance(getVersion getversion) {
            int i = SchemeConfiguration$Builder;
            this.cleanup = getversion;
            int i2 = i + 49;
            encryptionPublicKeyFromAssetCertificate = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 21 / 0;
            }
            return this;
        }

        public valueOf values(getSuppressed getsuppressed) {
            int i = encryptionPublicKeyFromAssetCertificate;
            this.restrictedParameters = getsuppressed;
            SchemeConfiguration$Builder = (((i ^ 78) + ((i & 78) << 1)) - 1) % 128;
            return this;
        }

        public valueOf get(List<setCursorVisible> list) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = ((i ^ 21) + ((i & 21) << 1)) % 128;
            SchemeConfiguration$Builder = i2;
            this.onCompleted = list;
            int i3 = i2 + 99;
            encryptionPublicKeyFromAssetCertificate = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 40 / 0;
            }
            return this;
        }

        public valueOf valueOf(getLocalizedMessage getlocalizedmessage) {
            int i = SchemeConfiguration$Builder;
            this.get = getlocalizedmessage;
            int i2 = (i ^ 27) + ((i & 27) << 1);
            encryptionPublicKeyFromAssetCertificate = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 57 / 0;
            }
            return this;
        }

        public valueOf ThreeDS2Service(setIncludeFontPadding setincludefontpadding) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = i & 15;
            int i3 = (i | 15) & (~i2);
            int i4 = i2 << 1;
            int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
            int i6 = i5 % 128;
            SchemeConfiguration$Builder = i6;
            if (i5 % 2 == 0) {
                this.valueOf = setincludefontpadding;
                int i7 = i6 & 31;
                encryptionPublicKeyFromAssetCertificate = ((i7 - (~((i6 ^ 31) | i7))) - 1) % 128;
                return this;
            }
            this.valueOf = setincludefontpadding;
            throw null;
        }

        public valueOf ThreeDS2ServiceInstance(setTitleMargin settitlemargin) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = i & 83;
            int i3 = -(-((i ^ 83) | i2));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            SchemeConfiguration$Builder = i4 % 128;
            if (i4 % 2 != 0) {
                this.addParam = settitlemargin;
                int i5 = 12 / 0;
            } else {
                this.addParam = settitlemargin;
            }
            return this;
        }

        public valueOf values(getInfo getinfo) {
            int i = SchemeConfiguration$Builder + 109;
            encryptionPublicKeyFromAssetCertificate = i % 128;
            if (i % 2 != 0) {
                this.getSchemeLogo = getinfo;
                return this;
            }
            this.getSchemeLogo = getinfo;
            throw null;
        }

        public valueOf get(replace replaceVar) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = (i ^ 21) + ((i & 21) << 1);
            SchemeConfiguration$Builder = i2 % 128;
            if (i2 % 2 == 0) {
                this.SchemeConfiguration = replaceVar;
                SchemeConfiguration$Builder = (i + 39) % 128;
                return this;
            }
            this.SchemeConfiguration = replaceVar;
            throw null;
        }

        public valueOf valueOf(setIncludeFontPadding setincludefontpadding) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = i ^ 105;
            int i3 = (((i & 105) | i2) << 1) - i2;
            int i4 = i3 % 128;
            SchemeConfiguration$Builder = i4;
            if (i3 % 2 == 0) {
                this.getWarnings = setincludefontpadding;
                int i5 = ((i4 ^ 120) + ((i4 & 120) << 1)) - 1;
                encryptionPublicKeyFromAssetCertificate = i5 % 128;
                if (i5 % 2 != 0) {
                    return this;
                }
                throw null;
            }
            this.getWarnings = setincludefontpadding;
            throw null;
        }

        public valueOf ThreeDS2Service(setTitleMargin settitlemargin) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = ((i | 115) << 1) - (i ^ 115);
            SchemeConfiguration$Builder = i2 % 128;
            if (i2 % 2 != 0) {
                this.onError = settitlemargin;
                int i3 = 69 / 0;
            } else {
                this.onError = settitlemargin;
            }
            int i4 = i & CameraActivity.REQUEST_CODE;
            int i5 = i4 + ((i ^ CameraActivity.REQUEST_CODE) | i4);
            SchemeConfiguration$Builder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 93 / 0;
            }
            return this;
        }

        public valueOf ThreeDS2ServiceInstance(Integer num) {
            int i = SchemeConfiguration$Builder;
            this.amexConfiguration = num;
            encryptionPublicKeyFromAssetCertificate = ((i & 97) + (i | 97)) % 128;
            return this;
        }

        public valueOf valueOf(keySet keyset) {
            int i = SchemeConfiguration$Builder;
            this.dinersSchemeConfiguration = keyset;
            int i2 = (((i | 30) << 1) - (i ^ 30)) - 1;
            encryptionPublicKeyFromAssetCertificate = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 88 / 0;
            }
            return this;
        }

        public setTitleTextColor ThreeDS2ServiceInstance() {
            setNavigationIcon setnavigationicon = new setNavigationIcon();
            setNavigationIcon.ThreeDS2ServiceInstance(setnavigationicon, this.restrictedParameters);
            setNavigationIcon.ThreeDS2Service(setnavigationicon, this.amexConfiguration);
            setNavigationIcon.valueOf(setnavigationicon, this.ThreeDS2ServiceInstance);
            setNavigationIcon.ThreeDS2Service(setnavigationicon, this.ThreeDS2Service);
            setNavigationIcon.ThreeDS2ServiceInstance(setnavigationicon, this.getSchemeId);
            setNavigationIcon.values(setnavigationicon, this.values);
            setNavigationIcon.values(setnavigationicon, this.get);
            setNavigationIcon.get(setnavigationicon, this.getSDKVersion);
            setNavigationIcon.getWarnings(setnavigationicon, this.getSDKInfo);
            setNavigationIcon.initialize(setnavigationicon, this.initialize);
            setNavigationIcon.values(setnavigationicon, this.cleanup);
            setNavigationIcon.values(setnavigationicon, this.valueOf);
            setNavigationIcon.ThreeDS2ServiceInstance(setnavigationicon, this.getWarnings);
            setNavigationIcon.ThreeDS2ServiceInstance(setnavigationicon, this.onCompleted);
            setNavigationIcon.cleanup(setnavigationicon, this.configureScheme);
            setNavigationIcon.getSDKVersion(setnavigationicon, this.build);
            setNavigationIcon.getSDKInfo(setnavigationicon, this.ConfigParameters);
            setNavigationIcon.createTransaction(setnavigationicon, this.createTransaction);
            setNavigationIcon.values(setnavigationicon, this.onError);
            setNavigationIcon.ThreeDS2Service(setnavigationicon, this.addParam);
            setNavigationIcon.ConfigParameters(setnavigationicon, this.removeParam);
            setNavigationIcon.onCompleted(setnavigationicon, this.ThreeDS2Service$InitializationCallback);
            setNavigationIcon.onError(setnavigationicon, this.ConfigurationBuilder);
            setNavigationIcon.ThreeDS2Service$InitializationCallback(setnavigationicon, this.getParamValue);
            setNavigationIcon.getParamValue(setnavigationicon, this.apiKey);
            setNavigationIcon.ThreeDS2Service(setnavigationicon, this.SchemeConfiguration);
            setNavigationIcon.ThreeDS2Service(setnavigationicon, this.mastercardSchemeConfiguration);
            setNavigationIcon.values(setnavigationicon, this.dinersSchemeConfiguration);
            setNavigationIcon.ThreeDS2ServiceInstance(setnavigationicon, this.unionSchemeConfiguration);
            setNavigationIcon.apiKey(setnavigationicon, this.jcbConfiguration);
            setNavigationIcon.ConfigurationBuilder(setnavigationicon, this.cbConfiguration);
            setNavigationIcon.addParam(setnavigationicon, this.visaSchemeConfiguration);
            setNavigationIcon.ThreeDS2ServiceInstance(setnavigationicon, this.getSchemeName);
            setNavigationIcon.get(setnavigationicon, this.newSchemeConfiguration);
            setNavigationIcon.removeParam(setnavigationicon, this.eftposConfiguration);
            setNavigationIcon.SchemeConfiguration(setnavigationicon, this.getSchemeEncryptionPublicKey);
            setNavigationIcon.get(setnavigationicon, this.getSchemeLogoDark);
            setNavigationIcon.restrictedParameters(setnavigationicon, this.getSchemeEncryptionPublicKeyId);
            setNavigationIcon.values(setnavigationicon, this.getSchemeLogo);
            setNavigationIcon.build(setnavigationicon, this.getSchemePublicRootKeys);
            setNavigationIcon.ThreeDS2ServiceInstance(setnavigationicon, this.ids);
            setNavigationIcon.mastercardSchemeConfiguration(setnavigationicon, this.logoDark);
            setNavigationIcon.configureScheme(setnavigationicon, this.encryptionPublicKey);
            setNavigationIcon.amexConfiguration(setnavigationicon, this.logo);
            int i = SchemeConfiguration$Builder;
            encryptionPublicKeyFromAssetCertificate = (((i ^ 14) + ((i & 14) << 1)) - 1) % 128;
            return setnavigationicon;
        }

        public valueOf ThreeDS2Service(List<setCustomSelectionActionModeCallback> list) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = i & 7;
            int i3 = (((i | 7) & (~i2)) - (~(-(-(i2 << 1))))) - 1;
            int i4 = i3 % 128;
            SchemeConfiguration$Builder = i4;
            if (i3 % 2 == 0) {
                this.mastercardSchemeConfiguration = list;
                int i5 = i4 & 31;
                encryptionPublicKeyFromAssetCertificate = (i5 + ((i4 ^ 31) | i5)) % 128;
                return this;
            }
            this.mastercardSchemeConfiguration = list;
            throw null;
        }

        public valueOf valueOf(put putVar) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = i & 69;
            int i3 = i2 + ((i ^ 69) | i2);
            SchemeConfiguration$Builder = i3 % 128;
            if (i3 % 2 == 0) {
                this.unionSchemeConfiguration = putVar;
                return this;
            }
            this.unionSchemeConfiguration = putVar;
            throw null;
        }

        public valueOf valueOf(entrySet entryset) {
            int i = SchemeConfiguration$Builder;
            int i2 = i & 87;
            int i3 = (((i ^ 87) | i2) << 1) - ((i | 87) & (~i2));
            encryptionPublicKeyFromAssetCertificate = i3 % 128;
            if (i3 % 2 != 0) {
                this.getSchemeName = entryset;
                return this;
            }
            this.getSchemeName = entryset;
            throw null;
        }

        public valueOf ThreeDS2Service(keySet keyset) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = (i & (-72)) | ((~i) & 71);
            int i3 = (i & 71) << 1;
            int i4 = (i2 & i3) + (i3 | i2);
            SchemeConfiguration$Builder = i4 % 128;
            if (i4 % 2 == 0) {
                this.getSchemeLogoDark = keyset;
                return this;
            }
            this.getSchemeLogoDark = keyset;
            throw null;
        }

        public valueOf valueOf(remove removeVar) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = (((i & (-52)) | ((~i) & 51)) + ((i & 51) << 1)) % 128;
            SchemeConfiguration$Builder = i2;
            this.newSchemeConfiguration = removeVar;
            encryptionPublicKeyFromAssetCertificate = ((i2 ^ 61) + ((i2 & 61) << 1)) % 128;
            return this;
        }

        public valueOf ThreeDS2Service(putIfAbsent putifabsent) {
            int i = encryptionPublicKeyFromAssetCertificate;
            int i2 = i + 95;
            SchemeConfiguration$Builder = i2 % 128;
            if (i2 % 2 != 0) {
                this.ids = putifabsent;
                int i3 = 17 / 0;
            } else {
                this.ids = putifabsent;
            }
            SchemeConfiguration$Builder = (i + 81) % 128;
            return this;
        }
    }

    public static /* synthetic */ Integer ThreeDS2Service(setNavigationIcon setnavigationicon, Integer num) {
        int i = rootPublicKeyFromAssetCertificate;
        logo = (((i & AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR) + (i | AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR)) - 1) % 128;
        setnavigationicon.jcbConfiguration = num;
        logo = (((i | 51) << 1) - (i ^ 51)) % 128;
        return num;
    }

    public static /* synthetic */ put ThreeDS2ServiceInstance(setNavigationIcon setnavigationicon, put putVar) {
        int i = logo;
        int i2 = i ^ 89;
        rootPublicKeyFromAssetCertificate = (((((i & 89) | i2) << 1) - (~(-i2))) - 1) % 128;
        setnavigationicon.amexConfiguration = putVar;
        rootPublicKeyFromAssetCertificate = ((i ^ 39) + ((i & 39) << 1)) % 128;
        return putVar;
    }

    public static /* synthetic */ String get(setNavigationIcon setnavigationicon, String str) {
        int i = logo;
        int i2 = (i ^ 28) + ((i & 28) << 1);
        rootPublicKeyFromAssetCertificate = ((~i2) + (i2 << 1)) % 128;
        setnavigationicon.initialize = str;
        int i3 = (i & (-120)) | ((~i) & 119);
        int i4 = (i & 119) << 1;
        rootPublicKeyFromAssetCertificate = ((i3 & i4) + (i3 | i4)) % 128;
        return str;
    }

    public static /* synthetic */ getVersion values(setNavigationIcon setnavigationicon, getVersion getversion) {
        int i = (-2) - (~(logo + 102));
        int i2 = i % 128;
        rootPublicKeyFromAssetCertificate = i2;
        int i3 = i % 2;
        setnavigationicon.getSDKVersion = getversion;
        if (i3 != 0) {
            int i4 = (i2 & (-26)) | ((~i2) & 25);
            int i5 = (i2 & 25) << 1;
            int i6 = (i4 & i5) + (i4 | i5);
            logo = i6 % 128;
            if (i6 % 2 == 0) {
                return getversion;
            }
            throw null;
        }
        throw null;
    }

    public static /* synthetic */ String ThreeDS2Service(setNavigationIcon setnavigationicon, String str) {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = (i & 107) + (i | 107);
        logo = i2 % 128;
        int i3 = i2 % 2;
        setnavigationicon.get = str;
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return str;
    }

    public static /* synthetic */ putIfAbsent ThreeDS2ServiceInstance(setNavigationIcon setnavigationicon, putIfAbsent putifabsent) {
        int i = logo;
        int i2 = i & 53;
        int i3 = (i2 + ((i ^ 53) | i2)) % 128;
        rootPublicKeyFromAssetCertificate = i3;
        setnavigationicon.SchemeConfiguration$Builder = putifabsent;
        int i4 = i3 & 97;
        int i5 = -(-((i3 ^ 97) | i4));
        logo = ((i4 & i5) + (i4 | i5)) % 128;
        return putifabsent;
    }

    public static /* synthetic */ keySet values(setNavigationIcon setnavigationicon, keySet keyset) {
        int i = logo;
        rootPublicKeyFromAssetCertificate = ((-2) - (~(i + 24))) % 128;
        setnavigationicon.unionSchemeConfiguration = keyset;
        int i2 = i & 97;
        int i3 = (i ^ 97) | i2;
        rootPublicKeyFromAssetCertificate = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
        return keyset;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public keySet get() {
        int i = logo;
        int i2 = i & 11;
        int i3 = i2 + ((i ^ 11) | i2);
        rootPublicKeyFromAssetCertificate = i3 % 128;
        if (i3 % 2 != 0) {
            return this.unionSchemeConfiguration;
        }
        throw null;
    }

    public static /* synthetic */ List ThreeDS2Service(setNavigationIcon setnavigationicon, List list) {
        int i = logo;
        rootPublicKeyFromAssetCertificate = (i + 81) % 128;
        setnavigationicon.restrictedParameters = list;
        int i2 = i ^ 63;
        int i3 = (((i & 63) | i2) << 1) - i2;
        rootPublicKeyFromAssetCertificate = i3 % 128;
        if (i3 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public static /* synthetic */ setIncludeFontPadding ThreeDS2ServiceInstance(setNavigationIcon setnavigationicon, setIncludeFontPadding setincludefontpadding) {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = i & 9;
        int i3 = ((i ^ 9) | i2) << 1;
        int i4 = -((i | 9) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        logo = i5 % 128;
        int i6 = i5 % 2;
        setnavigationicon.getSDKInfo = setincludefontpadding;
        if (i6 == 0) {
            return setincludefontpadding;
        }
        throw null;
    }

    public static /* synthetic */ setIncludeFontPadding values(setNavigationIcon setnavigationicon, setIncludeFontPadding setincludefontpadding) {
        int i = logo;
        int i2 = i & 91;
        int i3 = -(-((i ^ 91) | i2));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        rootPublicKeyFromAssetCertificate = i4;
        setnavigationicon.ThreeDS2Service = setincludefontpadding;
        int i5 = ((i4 | 35) << 1) - (i4 ^ 35);
        logo = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return setincludefontpadding;
    }

    public static /* synthetic */ String ThreeDS2ServiceInstance(setNavigationIcon setnavigationicon, String str) {
        int i = rootPublicKeyFromAssetCertificate;
        int i2 = ((((i & (-86)) | ((~i) & 85)) - (~((i & 85) << 1))) - 1) % 128;
        logo = i2;
        setnavigationicon.getSchemeId = str;
        int i3 = i2 + 97;
        rootPublicKeyFromAssetCertificate = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
        }
        return str;
    }

    public static /* synthetic */ setTitleMargin values(setNavigationIcon setnavigationicon, setTitleMargin settitlemargin) {
        int i = logo;
        rootPublicKeyFromAssetCertificate = (i + 89) % 128;
        setnavigationicon.ConfigParameters = settitlemargin;
        rootPublicKeyFromAssetCertificate = ((((i ^ 17) | (i & 17)) << 1) - (((~i) & 17) | (i & (-18)))) % 128;
        return settitlemargin;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public put ThreeDS2Service() {
        int i = logo;
        put putVar = this.amexConfiguration;
        int i2 = i & 93;
        int i3 = (i ^ 93) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        rootPublicKeyFromAssetCertificate = i4 % 128;
        if (i4 % 2 != 0) {
            return putVar;
        }
        throw null;
    }

    public static /* synthetic */ List ThreeDS2ServiceInstance(setNavigationIcon setnavigationicon, List list) {
        int i = (logo + 31) % 128;
        rootPublicKeyFromAssetCertificate = i;
        setnavigationicon.onError = list;
        int i2 = i ^ 17;
        int i3 = -(-((i & 17) << 1));
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        logo = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public static /* synthetic */ String values(setNavigationIcon setnavigationicon, String str) {
        int i = logo;
        int i2 = ((i & 17) + (i | 17)) % 128;
        rootPublicKeyFromAssetCertificate = i2;
        setnavigationicon.values = str;
        int i3 = (i2 | 19) << 1;
        int i4 = -(i2 ^ 19);
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        logo = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public String ThreeDS2ServiceInstance() {
        int i = logo;
        int i2 = i & 65;
        int i3 = i | 65;
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        rootPublicKeyFromAssetCertificate = i4;
        String str = this.visaSchemeConfiguration;
        int i5 = i4 & 77;
        int i6 = -(-((i4 ^ 77) | i5));
        logo = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setExtractedText
    public String values() {
        int i = logo;
        String str = this.getSchemeId;
        int i2 = i & 111;
        int i3 = (i ^ 111) | i2;
        rootPublicKeyFromAssetCertificate = ((i2 & i3) + (i3 | i2)) % 128;
        return str;
    }
}
