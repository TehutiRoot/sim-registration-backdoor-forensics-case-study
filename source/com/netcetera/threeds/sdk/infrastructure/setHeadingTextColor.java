package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.netcetera.threeds.sdk.infrastructure.setDarkTextColor;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
public class setHeadingTextColor {
    private static int get = 0;
    private static int values = 1;
    private final setFastScrollEnabled.ThreeDS2ServiceInstance ThreeDS2Service;
    private final setDarkTextColor ThreeDS2ServiceInstance;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.setHeadingTextColor$4 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C97394 {
        private static int ThreeDS2Service = 1;
        private static int get;
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[setFastScrollEnabled.ThreeDS2ServiceInstance.values().length];
            values = iArr;
            try {
                iArr[setFastScrollEnabled.ThreeDS2ServiceInstance.ThreeDS2Service.ordinal()] = 1;
                int i = get;
                int i2 = i & 27;
                ThreeDS2Service = ((i2 - (~((i ^ 27) | i2))) - 1) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[setFastScrollEnabled.ThreeDS2ServiceInstance.get.ordinal()] = 2;
                get = (ThreeDS2Service + 83) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            int i3 = ThreeDS2Service;
            int i4 = (i3 & (-60)) | ((~i3) & 59);
            int i5 = -(-((i3 & 59) << 1));
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            get = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            throw null;
        }
    }

    public setHeadingTextColor(setDarkTextColor setdarktextcolor, setFastScrollEnabled.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        this.ThreeDS2ServiceInstance = setdarktextcolor;
        this.ThreeDS2Service = threeDS2ServiceInstance;
    }

    public static setHeadingTextColor get(Context context, setScrollingCacheEnabled setscrollingcacheenabled, setFastScrollEnabled setfastscrollenabled) {
        setHeadingTextColor setheadingtextcolor = new setHeadingTextColor(setDarkTextColor.ThreeDS2ServiceInstance(context, setscrollingcacheenabled), setfastscrollenabled.values());
        int i = get;
        values = ((((i | 76) << 1) - (i ^ 76)) - 1) % 128;
        return setheadingtextcolor;
    }

    private Map<LabelCustomization, setDarkTextColor.valueOf> values(Locale locale) {
        HashMap hashMap = new HashMap();
        hashMap.put(LabelCustomization.values, this.ThreeDS2ServiceInstance.valueOf());
        hashMap.put(LabelCustomization.ThreeDS2ServiceInstance, this.ThreeDS2ServiceInstance.get());
        hashMap.put(LabelCustomization.valueOf, this.ThreeDS2ServiceInstance.values());
        hashMap.put(LabelCustomization.ThreeDS2Service, this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance());
        hashMap.put(LabelCustomization.get, this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(locale));
        hashMap.put(LabelCustomization.initialize, this.ThreeDS2ServiceInstance.initialize());
        hashMap.put(LabelCustomization.getSDKVersion, this.ThreeDS2ServiceInstance.cleanup());
        hashMap.put(LabelCustomization.cleanup, this.ThreeDS2ServiceInstance.getWarnings());
        hashMap.put(LabelCustomization.getSDKInfo, this.ThreeDS2ServiceInstance.getSDKVersion());
        hashMap.put(LabelCustomization.getWarnings, this.ThreeDS2ServiceInstance.getSDKInfo());
        hashMap.put(LabelCustomization.createTransaction, this.ThreeDS2ServiceInstance.onCompleted());
        hashMap.put(LabelCustomization.onError, this.ThreeDS2ServiceInstance.ConfigParameters());
        hashMap.put(LabelCustomization.ThreeDS2Service$InitializationCallback, this.ThreeDS2ServiceInstance.createTransaction());
        hashMap.put(LabelCustomization.ConfigParameters, this.ThreeDS2ServiceInstance.onError());
        hashMap.put(LabelCustomization.ConfigurationBuilder, this.ThreeDS2ServiceInstance.addParam());
        hashMap.put(LabelCustomization.addParam, this.ThreeDS2ServiceInstance.ConfigurationBuilder());
        hashMap.put(LabelCustomization.removeParam, this.ThreeDS2ServiceInstance.apiKey());
        hashMap.put(LabelCustomization.mastercardSchemeConfiguration, this.ThreeDS2ServiceInstance.removeParam());
        hashMap.put(LabelCustomization.restrictedParameters, this.ThreeDS2ServiceInstance.getParamValue());
        hashMap.put(LabelCustomization.SchemeConfiguration, this.ThreeDS2ServiceInstance.build());
        hashMap.put(LabelCustomization.build, this.ThreeDS2ServiceInstance.configureScheme());
        hashMap.put(LabelCustomization.configureScheme, this.ThreeDS2ServiceInstance.SchemeConfiguration());
        hashMap.put(LabelCustomization.visaSchemeConfiguration, this.ThreeDS2ServiceInstance.restrictedParameters());
        hashMap.put(LabelCustomization.unionSchemeConfiguration, this.ThreeDS2ServiceInstance.mastercardSchemeConfiguration());
        hashMap.put(LabelCustomization.amexConfiguration, this.ThreeDS2ServiceInstance.amexConfiguration());
        hashMap.put(LabelCustomization.jcbConfiguration, this.ThreeDS2ServiceInstance.visaSchemeConfiguration());
        hashMap.put(LabelCustomization.dinersSchemeConfiguration, this.ThreeDS2ServiceInstance.unionSchemeConfiguration());
        hashMap.put(LabelCustomization.getSchemeName, this.ThreeDS2ServiceInstance.jcbConfiguration());
        hashMap.put(LabelCustomization.eftposConfiguration, this.ThreeDS2ServiceInstance.newSchemeConfiguration());
        hashMap.put(LabelCustomization.newSchemeConfiguration, this.ThreeDS2ServiceInstance.getSchemeName());
        hashMap.put(LabelCustomization.getSchemeId, this.ThreeDS2ServiceInstance.cbConfiguration());
        hashMap.put(LabelCustomization.cbConfiguration, this.ThreeDS2ServiceInstance.eftposConfiguration());
        hashMap.put(LabelCustomization.getSchemeLogoDark, this.ThreeDS2ServiceInstance.getSchemeId());
        hashMap.put(LabelCustomization.getSchemeEncryptionPublicKey, this.ThreeDS2ServiceInstance.getSchemeLogo());
        hashMap.put(LabelCustomization.getSchemeLogo, this.ThreeDS2ServiceInstance.getSchemeEncryptionPublicKeyId());
        hashMap.put(LabelCustomization.getSchemePublicRootKeys, this.ThreeDS2ServiceInstance.getSchemePublicRootKeys());
        hashMap.put(LabelCustomization.getSchemeEncryptionPublicKeyId, this.ThreeDS2ServiceInstance.getSchemeLogoDark());
        hashMap.put(LabelCustomization.logo, this.ThreeDS2ServiceInstance.getSchemeEncryptionPublicKey());
        hashMap.put(LabelCustomization.logoDark, this.ThreeDS2ServiceInstance.logo());
        hashMap.put(LabelCustomization.ids, this.ThreeDS2ServiceInstance.SchemeConfiguration$Builder());
        hashMap.put(LabelCustomization.SchemeConfiguration$Builder, this.ThreeDS2ServiceInstance.ids());
        hashMap.put(LabelCustomization.encryptionPublicKey, this.ThreeDS2ServiceInstance.logoDark());
        hashMap.put(LabelCustomization.SDKAlreadyInitializedException, this.ThreeDS2ServiceInstance.encryptionPublicKey());
        hashMap.put(LabelCustomization.encryptionPublicKeyFromAssetCertificate, this.ThreeDS2ServiceInstance.InvalidInputException());
        hashMap.put(LabelCustomization.rootPublicKeyFromAssetCertificate, this.ThreeDS2ServiceInstance.rootPublicKeyFromAssetCertificate());
        hashMap.put(LabelCustomization.InvalidInputException, this.ThreeDS2ServiceInstance.rootPublicKey());
        hashMap.put(LabelCustomization.rootPublicKey, this.ThreeDS2ServiceInstance.SDKAlreadyInitializedException());
        hashMap.put(LabelCustomization.SDKRuntimeException, this.ThreeDS2ServiceInstance.SDKNotInitializedException());
        hashMap.put(LabelCustomization.CertificateInfo, this.ThreeDS2ServiceInstance.getErrorCode());
        hashMap.put(LabelCustomization.toString, this.ThreeDS2ServiceInstance.CertificateInfo());
        hashMap.put(LabelCustomization.getErrorCode, this.ThreeDS2ServiceInstance.SDKRuntimeException());
        hashMap.put(LabelCustomization.SDKNotInitializedException, this.ThreeDS2ServiceInstance.getCertPrefix());
        hashMap.put(LabelCustomization.getType, this.ThreeDS2ServiceInstance.CertificateInfo$CertificateType());
        hashMap.put(LabelCustomization.getCertPrefix, this.ThreeDS2ServiceInstance.getExpiryDate());
        hashMap.put(LabelCustomization.getName, this.ThreeDS2ServiceInstance.getType());
        hashMap.put(LabelCustomization.CertificateInfo$CertificateType, this.ThreeDS2ServiceInstance.getName());
        hashMap.put(LabelCustomization.getExpiryDate, this.ThreeDS2ServiceInstance.getRootCertificates());
        hashMap.put(LabelCustomization.getSchemeConfigurations, this.ThreeDS2ServiceInstance.SchemeInfo());
        hashMap.put(LabelCustomization.getRootCertificates, this.ThreeDS2ServiceInstance.getLicenseExpiryDate());
        hashMap.put(LabelCustomization.getLicenseExpiryDate, this.ThreeDS2ServiceInstance.getSchemeConfigurations());
        hashMap.put(LabelCustomization.SDKInfo, this.ThreeDS2ServiceInstance.SDKInfo());
        hashMap.put(LabelCustomization.SchemeInfo, this.ThreeDS2ServiceInstance.getIds());
        hashMap.put(LabelCustomization.Severity, this.ThreeDS2ServiceInstance.getEncryptionCertificateKid());
        hashMap.put(LabelCustomization.getEncryptionCertificateKid, this.ThreeDS2ServiceInstance.Warning());
        hashMap.put(LabelCustomization.getEncryptionCertificate, this.ThreeDS2ServiceInstance.Severity());
        hashMap.put(LabelCustomization.Warning, this.ThreeDS2ServiceInstance.getEncryptionCertificate());
        hashMap.put(LabelCustomization.getIds, this.ThreeDS2ServiceInstance.getId());
        hashMap.put(LabelCustomization.getMessage, this.ThreeDS2ServiceInstance.getMessage());
        hashMap.put(LabelCustomization.getId, this.ThreeDS2ServiceInstance.getDeviceData());
        hashMap.put(LabelCustomization.getDeviceData, this.ThreeDS2ServiceInstance.getSeverity());
        hashMap.put(LabelCustomization.AuthenticationRequestParameters, this.ThreeDS2ServiceInstance.AuthenticationRequestParameters());
        hashMap.put(LabelCustomization.getSeverity, this.ThreeDS2ServiceInstance.getSDKTransactionID());
        hashMap.put(LabelCustomization.getMessageVersion, this.ThreeDS2ServiceInstance.getSDKEphemeralPublicKey());
        hashMap.put(LabelCustomization.getSDKTransactionID, this.ThreeDS2ServiceInstance.getSDKAppID());
        hashMap.put(LabelCustomization.getSDKEphemeralPublicKey, this.ThreeDS2ServiceInstance.getSDKReferenceNumber());
        hashMap.put(LabelCustomization.getSDKAppID, this.ThreeDS2ServiceInstance.getMessageVersion());
        hashMap.put(LabelCustomization.getSDKReferenceNumber, this.ThreeDS2ServiceInstance.Transaction());
        hashMap.put(LabelCustomization.doChallenge, this.ThreeDS2ServiceInstance.useBridgingExtension());
        hashMap.put(LabelCustomization.useBridgingExtension, this.ThreeDS2ServiceInstance.doChallenge());
        hashMap.put(LabelCustomization.Transaction, this.ThreeDS2ServiceInstance.getAuthenticationRequestParameters());
        hashMap.put(LabelCustomization.getProgressView, this.ThreeDS2ServiceInstance.getValue());
        hashMap.put(LabelCustomization.getAuthenticationRequestParameters, this.ThreeDS2ServiceInstance.ChallengeParameters());
        hashMap.put(LabelCustomization.getValue, this.ThreeDS2ServiceInstance.Transaction$BridgingMessageExtensionVersion());
        hashMap.put(LabelCustomization.set3DSServerTransactionID, this.ThreeDS2ServiceInstance.setAcsTransactionID());
        hashMap.put(LabelCustomization.Transaction$BridgingMessageExtensionVersion, this.ThreeDS2ServiceInstance.setThreeDSRequestorAppURL());
        hashMap.put(LabelCustomization.close, this.ThreeDS2ServiceInstance.setAcsRefNumber());
        hashMap.put(LabelCustomization.ChallengeParameters, this.ThreeDS2ServiceInstance.getAcsSignedContent());
        hashMap.put(LabelCustomization.setThreeDSRequestorAppURL, this.ThreeDS2ServiceInstance.ChallengeStatusReceiver());
        hashMap.put(LabelCustomization.get3DSServerTransactionID, this.ThreeDS2ServiceInstance.getAcsRefNumber());
        hashMap.put(LabelCustomization.setAcsTransactionID, this.ThreeDS2ServiceInstance.getThreeDSRequestorAppURL());
        hashMap.put(LabelCustomization.setAcsSignedContent, this.ThreeDS2ServiceInstance.timedout());
        hashMap.put(LabelCustomization.setAcsRefNumber, this.ThreeDS2ServiceInstance.runtimeError());
        hashMap.put(LabelCustomization.getAcsTransactionID, this.ThreeDS2ServiceInstance.cancelled());
        hashMap.put(LabelCustomization.ChallengeStatusReceiver, this.ThreeDS2ServiceInstance.protocolError());
        hashMap.put(LabelCustomization.getAcsSignedContent, this.ThreeDS2ServiceInstance.getErrorDetails());
        hashMap.put(LabelCustomization.getThreeDSRequestorAppURL, this.ThreeDS2ServiceInstance.getErrorDescription());
        hashMap.put(LabelCustomization.getAcsRefNumber, this.ThreeDS2ServiceInstance.getErrorComponent());
        hashMap.put(LabelCustomization.protocolError, this.ThreeDS2ServiceInstance.getTransactionID());
        hashMap.put(LabelCustomization.runtimeError, this.ThreeDS2ServiceInstance.getTransactionStatus());
        hashMap.put(LabelCustomization.completed, this.ThreeDS2ServiceInstance.getErrorMessageType());
        hashMap.put(LabelCustomization.cancelled, this.ThreeDS2ServiceInstance.CompletionEvent());
        hashMap.put(LabelCustomization.timedout, this.ThreeDS2ServiceInstance.getMessageVersionNumber());
        hashMap.put(LabelCustomization.ErrorMessage, this.ThreeDS2ServiceInstance.getErrorMessage());
        hashMap.put(LabelCustomization.getErrorDescription, this.ThreeDS2ServiceInstance.RuntimeErrorEvent());
        hashMap.put(LabelCustomization.getErrorComponent, this.ThreeDS2ServiceInstance.getCornerRadius());
        hashMap.put(LabelCustomization.getTransactionID, this.ThreeDS2ServiceInstance.ButtonCustomization());
        hashMap.put(LabelCustomization.getErrorDetails, this.ThreeDS2ServiceInstance.setCornerRadius());
        hashMap.put(LabelCustomization.ProtocolErrorEvent, this.ThreeDS2ServiceInstance.getBackgroundColor());
        hashMap.put(LabelCustomization.CompletionEvent, this.ThreeDS2ServiceInstance.isProgressShown());
        hashMap.put(LabelCustomization.getMessageVersionNumber, this.ThreeDS2ServiceInstance.getTextFontSize());
        hashMap.put(LabelCustomization.getErrorMessageType, this.ThreeDS2ServiceInstance.setBackgroundColor());
        hashMap.put(LabelCustomization.getTransactionStatus, this.ThreeDS2ServiceInstance.setDarkBackgroundColor());
        hashMap.put(LabelCustomization.hideProgress, this.ThreeDS2ServiceInstance.getTextFontName());
        hashMap.put(LabelCustomization.showProgress, this.ThreeDS2ServiceInstance.getTextColor());
        hashMap.put(LabelCustomization.getErrorMessage, this.ThreeDS2ServiceInstance.setTextColor());
        hashMap.put(LabelCustomization.RuntimeErrorEvent, this.ThreeDS2ServiceInstance.setDarkTextColor());
        hashMap.put(LabelCustomization.ProgressView, this.ThreeDS2ServiceInstance.getDarkTextColor());
        hashMap.put(LabelCustomization.ButtonCustomization, this.ThreeDS2ServiceInstance.getHeadingTextColor());
        hashMap.put(LabelCustomization.setCornerRadius, this.ThreeDS2ServiceInstance.setHeadingTextFontSize());
        hashMap.put(LabelCustomization.isProgressShown, this.ThreeDS2ServiceInstance.getHeadingDarkTextColor());
        hashMap.put(LabelCustomization.getCornerRadius, this.ThreeDS2ServiceInstance.getHeadingTextFontName());
        hashMap.put(LabelCustomization.getBackgroundColor, this.ThreeDS2ServiceInstance.getHeadingTextFontSize());
        hashMap.put(LabelCustomization.Customization, this.ThreeDS2ServiceInstance.getBorderColor());
        hashMap.put(LabelCustomization.setBackgroundColor, this.ThreeDS2ServiceInstance.TextBoxCustomization());
        hashMap.put(LabelCustomization.getDarkBackgroundColor, this.ThreeDS2ServiceInstance.setBorderWidth());
        hashMap.put(LabelCustomization.setDarkBackgroundColor, this.ThreeDS2ServiceInstance.getBorderWidth());
        hashMap.put(LabelCustomization.getTextFontSize, this.ThreeDS2ServiceInstance.setHeadingDarkTextColor());
        hashMap.put(LabelCustomization.setTextFontSize, this.ThreeDS2ServiceInstance.getDarkBorderColor());
        hashMap.put(LabelCustomization.setTextColor, this.ThreeDS2ServiceInstance.setBorderColor());
        hashMap.put(LabelCustomization.setTextFontName, this.ThreeDS2ServiceInstance.getHeaderText());
        hashMap.put(LabelCustomization.getTextFontName, this.ThreeDS2ServiceInstance.setButtonText());
        hashMap.put(LabelCustomization.getTextColor, this.ThreeDS2ServiceInstance.setHeaderText());
        hashMap.put(LabelCustomization.getDarkTextColor, this.ThreeDS2ServiceInstance.setToolbarCustomization());
        hashMap.put(LabelCustomization.LabelCustomization, this.ThreeDS2ServiceInstance.setTextBoxCustomization());
        hashMap.put(LabelCustomization.setDarkTextColor, this.ThreeDS2ServiceInstance.getToolbarCustomization());
        hashMap.put(LabelCustomization.setHeadingTextColor, this.ThreeDS2ServiceInstance.getLabelCustomization());
        hashMap.put(LabelCustomization.getHeadingTextColor, this.ThreeDS2ServiceInstance.getButtonCustomization());
        hashMap.put(LabelCustomization.getHeadingTextFontName, this.ThreeDS2ServiceInstance.setViewCustomization());
        hashMap.put(LabelCustomization.getHeadingDarkTextColor, this.ThreeDS2ServiceInstance.setLabelCustomization());
        hashMap.put(LabelCustomization.getHeadingTextFontSize, this.ThreeDS2ServiceInstance.setChallengeViewBackgroundColor());
        hashMap.put(LabelCustomization.setHeadingTextFontSize, this.ThreeDS2ServiceInstance.getDarkModeSupported());
        hashMap.put(LabelCustomization.setHeadingTextFontName, this.ThreeDS2ServiceInstance.UiCustomization$UiCustomizationType());
        hashMap.put(LabelCustomization.getBorderColor, this.ThreeDS2ServiceInstance.ViewCustomization());
        hashMap.put(LabelCustomization.getBorderWidth, this.ThreeDS2ServiceInstance.UiCustomization$ButtonType());
        hashMap.put(LabelCustomization.setHeadingDarkTextColor, this.ThreeDS2ServiceInstance.NcaBouncyCastleProvider());
        hashMap.put(LabelCustomization.setBorderWidth, this.ThreeDS2ServiceInstance.getProgressViewBackgroundColor());
        hashMap.put(LabelCustomization.TextBoxCustomization, this.ThreeDS2ServiceInstance.getChallengeViewBackgroundColor());
        hashMap.put(LabelCustomization.setDarkBorderColor, this.ThreeDS2ServiceInstance.setProgressViewBackgroundColor());
        hashMap.put(LabelCustomization.getHeaderText, this.ThreeDS2ServiceInstance.DsRidValues());
        hashMap.put(LabelCustomization.getDarkBorderColor, this.ThreeDS2ServiceInstance.addAlgorithm());
        hashMap.put(LabelCustomization.setBorderColor, this.ThreeDS2ServiceInstance.addKeyInfoConverter());
        hashMap.put(LabelCustomization.ToolbarCustomization, this.ThreeDS2ServiceInstance.setParameter());
        hashMap.put(LabelCustomization.setHeaderText, this.ThreeDS2ServiceInstance.getService());
        hashMap.put(LabelCustomization.setButtonText, this.ThreeDS2ServiceInstance.hasAlgorithm());
        hashMap.put(LabelCustomization.getButtonText, this.ThreeDS2ServiceInstance.addAttributes());
        hashMap.put(LabelCustomization.UiCustomization, this.ThreeDS2ServiceInstance.setContentView());
        hashMap.put(LabelCustomization.setButtonCustomization, this.ThreeDS2ServiceInstance.getKeyInfoConverter());
        hashMap.put(LabelCustomization.getLabelCustomization, this.ThreeDS2ServiceInstance.getPublicKey());
        hashMap.put(LabelCustomization.getToolbarCustomization, this.ThreeDS2ServiceInstance.getPrivateKey());
        hashMap.put(LabelCustomization.setToolbarCustomization, this.ThreeDS2ServiceInstance.onContextItemSelected());
        hashMap.put(LabelCustomization.setTextBoxCustomization, this.ThreeDS2ServiceInstance.openContextMenu());
        hashMap.put(LabelCustomization.getTextBoxCustomization, this.ThreeDS2ServiceInstance.onOptionsItemSelected());
        hashMap.put(LabelCustomization.getButtonCustomization, this.ThreeDS2ServiceInstance.registerForContextMenu());
        hashMap.put(LabelCustomization.setLabelCustomization, this.ThreeDS2ServiceInstance.setVerticalScrollbarThumbDrawable());
        hashMap.put(LabelCustomization.setViewCustomization, this.ThreeDS2ServiceInstance.setVerticalScrollbarTrackDrawable());
        hashMap.put(LabelCustomization.getViewCustomization, this.ThreeDS2ServiceInstance.setFadingEdgeLength());
        int i = get;
        int i2 = (i & 5) + (i | 5);
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    public Map<LabelCustomization, setDarkTextColor.valueOf> ThreeDS2Service(setFastScrollEnabled.valueOf valueof, String str) {
        int i = values;
        int i2 = i ^ 5;
        int i3 = -(-((i & 5) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        get = i4 % 128;
        if (i4 % 2 == 0) {
            if (C97394.values[this.ThreeDS2Service.ordinal()] != 1) {
                Map<LabelCustomization, setDarkTextColor.valueOf> ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(valueof);
                int i5 = get + 5;
                values = i5 % 128;
                if (i5 % 2 != 0) {
                    return ThreeDS2ServiceInstance;
                }
                throw null;
            }
            Map<LabelCustomization, setDarkTextColor.valueOf> map = get(valueof, str);
            int i6 = values;
            int i7 = (((i6 | 50) << 1) - (i6 ^ 50)) - 1;
            get = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 13 / 0;
            }
            return map;
        }
        int i9 = C97394.values[this.ThreeDS2Service.ordinal()];
        throw null;
    }

    public Map<LabelCustomization, setDarkTextColor.valueOf> ThreeDS2ServiceInstance(Locale locale) {
        int i = get;
        int i2 = i & 45;
        int i3 = -(-((i ^ 45) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        values = i4 % 128;
        if (i4 % 2 != 0) {
            if (C97394.values[this.ThreeDS2Service.ordinal()] != 1) {
                Map<LabelCustomization, setDarkTextColor.valueOf> values2 = values(locale);
                int i5 = get;
                int i6 = (i5 ^ 64) + ((i5 & 64) << 1);
                int i7 = (~i6) + (i6 << 1);
                values = i7 % 128;
                if (i7 % 2 != 0) {
                    return values2;
                }
                throw null;
            }
            Map<LabelCustomization, setDarkTextColor.valueOf> ThreeDS2Service = ThreeDS2Service(locale);
            int i8 = get;
            int i9 = i8 ^ 17;
            int i10 = (i8 & 17) << 1;
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            values = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 0 / 0;
            }
            return ThreeDS2Service;
        }
        int i13 = C97394.values[this.ThreeDS2Service.ordinal()];
        throw null;
    }

    private Map<LabelCustomization, setDarkTextColor.valueOf> get(setFastScrollEnabled.valueOf valueof, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(LabelCustomization.onCompleted, this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(valueof));
        hashMap.put(LabelCustomization.getParamValue, this.ThreeDS2ServiceInstance.ThreeDS2Service$InitializationCallback());
        hashMap.put(LabelCustomization.apiKey, this.ThreeDS2ServiceInstance.valueOf(str));
        int i = values + 35;
        get = i % 128;
        if (i % 2 == 0) {
            return hashMap;
        }
        throw null;
    }

    private Map<LabelCustomization, setDarkTextColor.valueOf> ThreeDS2Service(Locale locale) {
        HashMap hashMap = new HashMap();
        hashMap.put(LabelCustomization.values, this.ThreeDS2ServiceInstance.valueOf());
        hashMap.put(LabelCustomization.ThreeDS2ServiceInstance, this.ThreeDS2ServiceInstance.ThreeDS2Service());
        hashMap.put(LabelCustomization.valueOf, this.ThreeDS2ServiceInstance.values());
        hashMap.put(LabelCustomization.ThreeDS2Service, this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance());
        hashMap.put(LabelCustomization.get, this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(locale));
        hashMap.put(LabelCustomization.initialize, this.ThreeDS2ServiceInstance.initialize());
        hashMap.put(LabelCustomization.getSDKVersion, this.ThreeDS2ServiceInstance.cleanup());
        hashMap.put(LabelCustomization.cleanup, this.ThreeDS2ServiceInstance.getWarnings());
        hashMap.put(LabelCustomization.getSDKInfo, this.ThreeDS2ServiceInstance.getSDKVersion());
        hashMap.put(LabelCustomization.getWarnings, this.ThreeDS2ServiceInstance.getSDKInfo());
        hashMap.put(LabelCustomization.createTransaction, this.ThreeDS2ServiceInstance.onCompleted());
        hashMap.put(LabelCustomization.onError, this.ThreeDS2ServiceInstance.ConfigParameters());
        hashMap.put(LabelCustomization.ThreeDS2Service$InitializationCallback, this.ThreeDS2ServiceInstance.createTransaction());
        hashMap.put(LabelCustomization.ConfigParameters, this.ThreeDS2ServiceInstance.onError());
        hashMap.put(LabelCustomization.ConfigurationBuilder, this.ThreeDS2ServiceInstance.addParam());
        hashMap.put(LabelCustomization.addParam, this.ThreeDS2ServiceInstance.ConfigurationBuilder());
        hashMap.put(LabelCustomization.removeParam, this.ThreeDS2ServiceInstance.apiKey());
        hashMap.put(LabelCustomization.mastercardSchemeConfiguration, this.ThreeDS2ServiceInstance.removeParam());
        hashMap.put(LabelCustomization.restrictedParameters, this.ThreeDS2ServiceInstance.getParamValue());
        hashMap.put(LabelCustomization.SchemeConfiguration, this.ThreeDS2ServiceInstance.build());
        hashMap.put(LabelCustomization.build, this.ThreeDS2ServiceInstance.configureScheme());
        hashMap.put(LabelCustomization.configureScheme, this.ThreeDS2ServiceInstance.SchemeConfiguration());
        hashMap.put(LabelCustomization.visaSchemeConfiguration, this.ThreeDS2ServiceInstance.restrictedParameters());
        hashMap.put(LabelCustomization.unionSchemeConfiguration, this.ThreeDS2ServiceInstance.mastercardSchemeConfiguration());
        hashMap.put(LabelCustomization.amexConfiguration, this.ThreeDS2ServiceInstance.dinersSchemeConfiguration());
        hashMap.put(LabelCustomization.jcbConfiguration, this.ThreeDS2ServiceInstance.visaSchemeConfiguration());
        hashMap.put(LabelCustomization.dinersSchemeConfiguration, this.ThreeDS2ServiceInstance.unionSchemeConfiguration());
        hashMap.put(LabelCustomization.getSchemeName, this.ThreeDS2ServiceInstance.jcbConfiguration());
        hashMap.put(LabelCustomization.eftposConfiguration, this.ThreeDS2ServiceInstance.newSchemeConfiguration());
        hashMap.put(LabelCustomization.newSchemeConfiguration, this.ThreeDS2ServiceInstance.getSchemeName());
        hashMap.put(LabelCustomization.getSchemeId, this.ThreeDS2ServiceInstance.cbConfiguration());
        hashMap.put(LabelCustomization.cbConfiguration, this.ThreeDS2ServiceInstance.eftposConfiguration());
        hashMap.put(LabelCustomization.getSchemeLogoDark, this.ThreeDS2ServiceInstance.getSchemeId());
        hashMap.put(LabelCustomization.getSchemeEncryptionPublicKey, this.ThreeDS2ServiceInstance.getSchemeLogo());
        hashMap.put(LabelCustomization.getSchemeLogo, this.ThreeDS2ServiceInstance.getSchemeEncryptionPublicKeyId());
        hashMap.put(LabelCustomization.getSchemePublicRootKeys, this.ThreeDS2ServiceInstance.getSchemePublicRootKeys());
        hashMap.put(LabelCustomization.getSchemeEncryptionPublicKeyId, this.ThreeDS2ServiceInstance.getSchemeLogoDark());
        hashMap.put(LabelCustomization.logo, this.ThreeDS2ServiceInstance.getSchemeEncryptionPublicKey());
        hashMap.put(LabelCustomization.logoDark, this.ThreeDS2ServiceInstance.logo());
        hashMap.put(LabelCustomization.ids, this.ThreeDS2ServiceInstance.SchemeConfiguration$Builder());
        hashMap.put(LabelCustomization.SchemeConfiguration$Builder, this.ThreeDS2ServiceInstance.ids());
        hashMap.put(LabelCustomization.encryptionPublicKey, this.ThreeDS2ServiceInstance.logoDark());
        hashMap.put(LabelCustomization.SDKAlreadyInitializedException, this.ThreeDS2ServiceInstance.encryptionPublicKey());
        hashMap.put(LabelCustomization.encryptionPublicKeyFromAssetCertificate, this.ThreeDS2ServiceInstance.InvalidInputException());
        hashMap.put(LabelCustomization.rootPublicKeyFromAssetCertificate, this.ThreeDS2ServiceInstance.rootPublicKeyFromAssetCertificate());
        hashMap.put(LabelCustomization.InvalidInputException, this.ThreeDS2ServiceInstance.encryptionPublicKeyFromAssetCertificate());
        hashMap.put(LabelCustomization.rootPublicKey, this.ThreeDS2ServiceInstance.SDKAlreadyInitializedException());
        hashMap.put(LabelCustomization.SDKRuntimeException, this.ThreeDS2ServiceInstance.SDKNotInitializedException());
        hashMap.put(LabelCustomization.CertificateInfo, this.ThreeDS2ServiceInstance.getErrorCode());
        hashMap.put(LabelCustomization.toString, this.ThreeDS2ServiceInstance.CertificateInfo());
        hashMap.put(LabelCustomization.getErrorCode, this.ThreeDS2ServiceInstance.SDKRuntimeException());
        hashMap.put(LabelCustomization.SDKNotInitializedException, this.ThreeDS2ServiceInstance.getCertPrefix());
        hashMap.put(LabelCustomization.getType, this.ThreeDS2ServiceInstance.CertificateInfo$CertificateType());
        hashMap.put(LabelCustomization.getCertPrefix, this.ThreeDS2ServiceInstance.getExpiryDate());
        hashMap.put(LabelCustomization.getName, this.ThreeDS2ServiceInstance.getType());
        hashMap.put(LabelCustomization.CertificateInfo$CertificateType, this.ThreeDS2ServiceInstance.getName());
        hashMap.put(LabelCustomization.getExpiryDate, this.ThreeDS2ServiceInstance.getRootCertificates());
        hashMap.put(LabelCustomization.getSchemeConfigurations, this.ThreeDS2ServiceInstance.SchemeInfo());
        hashMap.put(LabelCustomization.getRootCertificates, this.ThreeDS2ServiceInstance.getLicenseExpiryDate());
        hashMap.put(LabelCustomization.getLicenseExpiryDate, this.ThreeDS2ServiceInstance.getSchemeConfigurations());
        hashMap.put(LabelCustomization.SDKInfo, this.ThreeDS2ServiceInstance.SDKInfo());
        hashMap.put(LabelCustomization.SchemeInfo, this.ThreeDS2ServiceInstance.getIds());
        hashMap.put(LabelCustomization.Severity, this.ThreeDS2ServiceInstance.getEncryptionCertificateKid());
        hashMap.put(LabelCustomization.getEncryptionCertificateKid, this.ThreeDS2ServiceInstance.Warning());
        hashMap.put(LabelCustomization.getEncryptionCertificate, this.ThreeDS2ServiceInstance.Severity());
        hashMap.put(LabelCustomization.Warning, this.ThreeDS2ServiceInstance.getEncryptionCertificate());
        hashMap.put(LabelCustomization.getIds, this.ThreeDS2ServiceInstance.getId());
        hashMap.put(LabelCustomization.getMessage, this.ThreeDS2ServiceInstance.getMessage());
        hashMap.put(LabelCustomization.getId, this.ThreeDS2ServiceInstance.getDeviceData());
        hashMap.put(LabelCustomization.getDeviceData, this.ThreeDS2ServiceInstance.getSeverity());
        hashMap.put(LabelCustomization.AuthenticationRequestParameters, this.ThreeDS2ServiceInstance.AuthenticationRequestParameters());
        hashMap.put(LabelCustomization.getSeverity, this.ThreeDS2ServiceInstance.getSDKTransactionID());
        hashMap.put(LabelCustomization.getMessageVersion, this.ThreeDS2ServiceInstance.getSDKEphemeralPublicKey());
        hashMap.put(LabelCustomization.getSDKTransactionID, this.ThreeDS2ServiceInstance.getSDKAppID());
        hashMap.put(LabelCustomization.getSDKEphemeralPublicKey, this.ThreeDS2ServiceInstance.getSDKReferenceNumber());
        hashMap.put(LabelCustomization.getSDKAppID, this.ThreeDS2ServiceInstance.getMessageVersion());
        hashMap.put(LabelCustomization.getSDKReferenceNumber, this.ThreeDS2ServiceInstance.Transaction());
        hashMap.put(LabelCustomization.doChallenge, this.ThreeDS2ServiceInstance.useBridgingExtension());
        hashMap.put(LabelCustomization.useBridgingExtension, this.ThreeDS2ServiceInstance.getProgressView());
        hashMap.put(LabelCustomization.Transaction, this.ThreeDS2ServiceInstance.set3DSServerTransactionID());
        hashMap.put(LabelCustomization.getProgressView, this.ThreeDS2ServiceInstance.close());
        hashMap.put(LabelCustomization.getAuthenticationRequestParameters, this.ThreeDS2ServiceInstance.ChallengeParameters());
        hashMap.put(LabelCustomization.getValue, this.ThreeDS2ServiceInstance.Transaction$BridgingMessageExtensionVersion());
        hashMap.put(LabelCustomization.set3DSServerTransactionID, this.ThreeDS2ServiceInstance.get3DSServerTransactionID());
        hashMap.put(LabelCustomization.Transaction$BridgingMessageExtensionVersion, this.ThreeDS2ServiceInstance.setAcsSignedContent());
        hashMap.put(LabelCustomization.close, this.ThreeDS2ServiceInstance.getAcsTransactionID());
        hashMap.put(LabelCustomization.ChallengeParameters, this.ThreeDS2ServiceInstance.getAcsSignedContent());
        hashMap.put(LabelCustomization.setThreeDSRequestorAppURL, this.ThreeDS2ServiceInstance.ChallengeStatusReceiver());
        hashMap.put(LabelCustomization.get3DSServerTransactionID, this.ThreeDS2ServiceInstance.getAcsRefNumber());
        hashMap.put(LabelCustomization.setAcsTransactionID, this.ThreeDS2ServiceInstance.getThreeDSRequestorAppURL());
        hashMap.put(LabelCustomization.setAcsSignedContent, this.ThreeDS2ServiceInstance.timedout());
        hashMap.put(LabelCustomization.setAcsRefNumber, this.ThreeDS2ServiceInstance.completed());
        hashMap.put(LabelCustomization.getAcsTransactionID, this.ThreeDS2ServiceInstance.cancelled());
        hashMap.put(LabelCustomization.ChallengeStatusReceiver, this.ThreeDS2ServiceInstance.protocolError());
        hashMap.put(LabelCustomization.getAcsSignedContent, this.ThreeDS2ServiceInstance.getErrorDetails());
        hashMap.put(LabelCustomization.getThreeDSRequestorAppURL, this.ThreeDS2ServiceInstance.getErrorDescription());
        hashMap.put(LabelCustomization.getAcsRefNumber, this.ThreeDS2ServiceInstance.getErrorComponent());
        hashMap.put(LabelCustomization.protocolError, this.ThreeDS2ServiceInstance.ErrorMessage());
        hashMap.put(LabelCustomization.runtimeError, this.ThreeDS2ServiceInstance.getTransactionStatus());
        hashMap.put(LabelCustomization.completed, this.ThreeDS2ServiceInstance.ProtocolErrorEvent());
        hashMap.put(LabelCustomization.cancelled, this.ThreeDS2ServiceInstance.CompletionEvent());
        hashMap.put(LabelCustomization.timedout, this.ThreeDS2ServiceInstance.hideProgress());
        hashMap.put(LabelCustomization.ErrorMessage, this.ThreeDS2ServiceInstance.ProgressView());
        hashMap.put(LabelCustomization.getErrorDescription, this.ThreeDS2ServiceInstance.showProgress());
        hashMap.put(LabelCustomization.getErrorComponent, this.ThreeDS2ServiceInstance.getCornerRadius());
        hashMap.put(LabelCustomization.getTransactionID, this.ThreeDS2ServiceInstance.ButtonCustomization());
        hashMap.put(LabelCustomization.getErrorDetails, this.ThreeDS2ServiceInstance.setCornerRadius());
        hashMap.put(LabelCustomization.ProtocolErrorEvent, this.ThreeDS2ServiceInstance.getBackgroundColor());
        hashMap.put(LabelCustomization.CompletionEvent, this.ThreeDS2ServiceInstance.Customization());
        hashMap.put(LabelCustomization.getMessageVersionNumber, this.ThreeDS2ServiceInstance.getTextFontSize());
        hashMap.put(LabelCustomization.getErrorMessageType, this.ThreeDS2ServiceInstance.getDarkBackgroundColor());
        hashMap.put(LabelCustomization.getTransactionStatus, this.ThreeDS2ServiceInstance.setTextFontName());
        hashMap.put(LabelCustomization.hideProgress, this.ThreeDS2ServiceInstance.setTextFontSize());
        hashMap.put(LabelCustomization.showProgress, this.ThreeDS2ServiceInstance.getTextColor());
        hashMap.put(LabelCustomization.getErrorMessage, this.ThreeDS2ServiceInstance.setTextColor());
        hashMap.put(LabelCustomization.RuntimeErrorEvent, this.ThreeDS2ServiceInstance.setDarkTextColor());
        hashMap.put(LabelCustomization.ProgressView, this.ThreeDS2ServiceInstance.LabelCustomization());
        hashMap.put(LabelCustomization.ButtonCustomization, this.ThreeDS2ServiceInstance.setHeadingTextColor());
        hashMap.put(LabelCustomization.setCornerRadius, this.ThreeDS2ServiceInstance.setHeadingTextFontSize());
        hashMap.put(LabelCustomization.isProgressShown, this.ThreeDS2ServiceInstance.getHeadingDarkTextColor());
        hashMap.put(LabelCustomization.getCornerRadius, this.ThreeDS2ServiceInstance.setHeadingTextFontName());
        hashMap.put(LabelCustomization.getBackgroundColor, this.ThreeDS2ServiceInstance.getHeadingTextFontSize());
        hashMap.put(LabelCustomization.Customization, this.ThreeDS2ServiceInstance.getBorderColor());
        hashMap.put(LabelCustomization.setBackgroundColor, this.ThreeDS2ServiceInstance.TextBoxCustomization());
        hashMap.put(LabelCustomization.getDarkBackgroundColor, this.ThreeDS2ServiceInstance.setBorderWidth());
        hashMap.put(LabelCustomization.setDarkBackgroundColor, this.ThreeDS2ServiceInstance.getBorderWidth());
        hashMap.put(LabelCustomization.getTextFontSize, this.ThreeDS2ServiceInstance.ToolbarCustomization());
        hashMap.put(LabelCustomization.setTextFontSize, this.ThreeDS2ServiceInstance.getDarkBorderColor());
        hashMap.put(LabelCustomization.setTextColor, this.ThreeDS2ServiceInstance.setDarkBorderColor());
        hashMap.put(LabelCustomization.setTextFontName, this.ThreeDS2ServiceInstance.setButtonCustomization());
        hashMap.put(LabelCustomization.getTextFontName, this.ThreeDS2ServiceInstance.UiCustomization());
        hashMap.put(LabelCustomization.getTextColor, this.ThreeDS2ServiceInstance.getButtonText());
        hashMap.put(LabelCustomization.getDarkTextColor, this.ThreeDS2ServiceInstance.getTextBoxCustomization());
        hashMap.put(LabelCustomization.LabelCustomization, this.ThreeDS2ServiceInstance.setTextBoxCustomization());
        hashMap.put(LabelCustomization.setDarkTextColor, this.ThreeDS2ServiceInstance.getToolbarCustomization());
        hashMap.put(LabelCustomization.setHeadingTextColor, this.ThreeDS2ServiceInstance.supportDarkMode());
        hashMap.put(LabelCustomization.getHeadingTextColor, this.ThreeDS2ServiceInstance.getViewCustomization());
        hashMap.put(LabelCustomization.getHeadingTextFontName, this.ThreeDS2ServiceInstance.setViewCustomization());
        hashMap.put(LabelCustomization.getHeadingDarkTextColor, this.ThreeDS2ServiceInstance.setLabelCustomization());
        hashMap.put(LabelCustomization.getHeadingTextFontSize, this.ThreeDS2ServiceInstance.setChallengeViewBackgroundColor());
        hashMap.put(LabelCustomization.setHeadingTextFontSize, this.ThreeDS2ServiceInstance.getDarkModeSupported());
        hashMap.put(LabelCustomization.setHeadingTextFontName, this.ThreeDS2ServiceInstance.UiCustomization$UiCustomizationType());
        hashMap.put(LabelCustomization.getBorderColor, this.ThreeDS2ServiceInstance.ViewCustomization());
        hashMap.put(LabelCustomization.getBorderWidth, this.ThreeDS2ServiceInstance.UiCustomization$ButtonType());
        hashMap.put(LabelCustomization.setHeadingDarkTextColor, this.ThreeDS2ServiceInstance.NcaBouncyCastleProvider());
        hashMap.put(LabelCustomization.setBorderWidth, this.ThreeDS2ServiceInstance.getProgressViewBackgroundColor());
        hashMap.put(LabelCustomization.TextBoxCustomization, this.ThreeDS2ServiceInstance.getChallengeViewBackgroundColor());
        hashMap.put(LabelCustomization.setDarkBorderColor, this.ThreeDS2ServiceInstance.setProgressViewBackgroundColor());
        hashMap.put(LabelCustomization.getHeaderText, this.ThreeDS2ServiceInstance.DsRidValues());
        hashMap.put(LabelCustomization.getDarkBorderColor, this.ThreeDS2ServiceInstance.addAlgorithm());
        hashMap.put(LabelCustomization.setBorderColor, this.ThreeDS2ServiceInstance.addKeyInfoConverter());
        hashMap.put(LabelCustomization.ToolbarCustomization, this.ThreeDS2ServiceInstance.setParameter());
        hashMap.put(LabelCustomization.setHeaderText, this.ThreeDS2ServiceInstance.getService());
        hashMap.put(LabelCustomization.setButtonText, this.ThreeDS2ServiceInstance.hasAlgorithm());
        hashMap.put(LabelCustomization.getButtonText, this.ThreeDS2ServiceInstance.addAttributes());
        hashMap.put(LabelCustomization.UiCustomization, this.ThreeDS2ServiceInstance.setContentView());
        hashMap.put(LabelCustomization.setButtonCustomization, this.ThreeDS2ServiceInstance.getKeyInfoConverter());
        hashMap.put(LabelCustomization.getToolbarCustomization, this.ThreeDS2ServiceInstance.getPrivateKey());
        hashMap.put(LabelCustomization.setToolbarCustomization, this.ThreeDS2ServiceInstance.unregisterForContextMenu());
        hashMap.put(LabelCustomization.setTextBoxCustomization, this.ThreeDS2ServiceInstance.openContextMenu());
        hashMap.put(LabelCustomization.getTextBoxCustomization, this.ThreeDS2ServiceInstance.onOptionsItemSelected());
        hashMap.put(LabelCustomization.getButtonCustomization, this.ThreeDS2ServiceInstance.registerForContextMenu());
        hashMap.put(LabelCustomization.setLabelCustomization, this.ThreeDS2ServiceInstance.setHorizontalScrollbarTrackDrawable());
        hashMap.put(LabelCustomization.setViewCustomization, this.ThreeDS2ServiceInstance.setHorizontalScrollbarThumbDrawable());
        hashMap.put(LabelCustomization.getViewCustomization, this.ThreeDS2ServiceInstance.setOnClickListener());
        hashMap.put(LabelCustomization.supportDarkMode, this.ThreeDS2ServiceInstance.setScrollIndicators());
        hashMap.put(LabelCustomization.UiCustomization$UiCustomizationType, this.ThreeDS2ServiceInstance.setOnFocusChangeListener());
        hashMap.put(LabelCustomization.ViewCustomization, this.ThreeDS2ServiceInstance.setOnScrollChangeListener());
        int i = values;
        int i2 = i & 27;
        int i3 = ((i ^ 27) | i2) << 1;
        int i4 = -((i | 27) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        get = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
        return hashMap;
    }

    private Map<LabelCustomization, setDarkTextColor.valueOf> ThreeDS2ServiceInstance(setFastScrollEnabled.valueOf valueof) {
        HashMap hashMap = new HashMap();
        hashMap.put(LabelCustomization.onCompleted, this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(valueof));
        int i = get;
        values = (((i & 46) + (i | 46)) - 1) % 128;
        return hashMap;
    }
}
