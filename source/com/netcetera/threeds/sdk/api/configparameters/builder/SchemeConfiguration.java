package com.netcetera.threeds.sdk.api.configparameters.builder;

import android.content.res.AssetManager;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.api.utils.DsRidValues;
import com.netcetera.threeds.sdk.infrastructure.C9609mz;
import com.netcetera.threeds.sdk.infrastructure.C9621nj;
import com.netcetera.threeds.sdk.infrastructure.C9664oh;
import com.netcetera.threeds.sdk.infrastructure.C9668ol;
import com.netcetera.threeds.sdk.infrastructure.C9669om;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;

/* loaded from: classes5.dex */
public final class SchemeConfiguration {
    private static int cleanup = 0;
    private static int getSDKInfo = 1;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final String get;
    private final String getSDKVersion;
    private final List<String> initialize;
    private final String valueOf;
    private final String values;

    /* loaded from: classes5.dex */
    public static final class Builder {
        private static int ThreeDS2Service$InitializationCallback = 0;
        private static int onError = 1;
        public static long valueOf = -4014569005793522716L;
        private String ThreeDS2Service;
        private String ThreeDS2ServiceInstance;
        private String cleanup;
        private String get;
        private final String getSDKInfo;
        private final boolean getSDKVersion;
        private final String getWarnings;
        private List<String> initialize;
        private List<String> values;

        private List<? extends Certificate> ThreeDS2Service(AssetManager assetManager, String str) {
            ThreeDS2Service$InitializationCallback = (onError + 27) % 128;
            try {
                List<? extends Certificate> ThreeDS2Service = ThreeDS2Service(assetManager.open(str));
                onError = (ThreeDS2Service$InitializationCallback + 49) % 128;
                return ThreeDS2Service;
            } catch (IOException | CertificateException e) {
                throw new InvalidInputException("Failed to get public key configuration from certificate" + str, e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private String ThreeDS2ServiceInstance(AssetManager assetManager, String str) {
            int i = ThreeDS2Service$InitializationCallback + 63;
            onError = i % 128;
            try {
                if (i % 2 == 0) {
                    return C9668ol.get(ThreeDS2Service(assetManager, str).get(0).getEncoded());
                }
                return C9668ol.get(ThreeDS2Service(assetManager, str).get(0).getEncoded());
            } catch (CertificateEncodingException unused) {
                return C9668ol.get(((Certificate) assetManager.get(0)).getPublicKey().getEncoded());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private String get(AssetManager assetManager, String str) {
            int i = onError + 45;
            ThreeDS2Service$InitializationCallback = i % 128;
            try {
                if (i % 2 != 0) {
                    List<? extends Certificate> ThreeDS2Service = ThreeDS2Service(assetManager, str);
                    return C9668ol.get(ThreeDS2Service.get(ThreeDS2Service.size() >>> 1).getEncoded());
                }
                List<? extends Certificate> ThreeDS2Service2 = ThreeDS2Service(assetManager, str);
                return C9668ol.get(ThreeDS2Service2.get(ThreeDS2Service2.size() - 1).getEncoded());
            } catch (CertificateEncodingException unused) {
                return C9668ol.get(((Certificate) assetManager.get(assetManager.size() - 1)).getPublicKey().getEncoded());
            }
        }

        private SubjectKeyIdentifier valueOf(X509Certificate x509Certificate) {
            onError = (ThreeDS2Service$InitializationCallback + 1) % 128;
            SubjectKeyIdentifier subjectKeyIdentifier = SubjectKeyIdentifier.getInstance(ASN1OctetString.getInstance(x509Certificate.getExtensionValue(Extension.subjectKeyIdentifier.getId())));
            onError = (ThreeDS2Service$InitializationCallback + 53) % 128;
            return subjectKeyIdentifier;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
            if (r3.isEmpty() == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
            return com.netcetera.threeds.sdk.infrastructure.C9669om.values(r3, ",");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
            if (r3 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
            if (r3 != null) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.lang.String values(java.util.List<java.lang.String> r3) {
            /*
                r2 = this;
                int r0 = com.netcetera.threeds.sdk.api.configparameters.builder.SchemeConfiguration.Builder.ThreeDS2Service$InitializationCallback
                int r0 = r0 + 101
                int r1 = r0 % 128
                com.netcetera.threeds.sdk.api.configparameters.builder.SchemeConfiguration.Builder.onError = r1
                int r0 = r0 % 2
                if (r0 != 0) goto L17
                java.util.List r3 = r2.ThreeDS2ServiceInstance(r3)
                r0 = 13
                int r0 = r0 / 0
                if (r3 == 0) goto L2b
                goto L1d
            L17:
                java.util.List r3 = r2.ThreeDS2ServiceInstance(r3)
                if (r3 == 0) goto L2b
            L1d:
                boolean r0 = r3.isEmpty()
                if (r0 == 0) goto L24
                goto L2b
            L24:
                java.lang.String r0 = ","
                java.lang.String r3 = com.netcetera.threeds.sdk.infrastructure.C9669om.values(r3, r0)
                return r3
            L2b:
                java.lang.String r3 = r2.getWarnings
                int r0 = com.netcetera.threeds.sdk.api.configparameters.builder.SchemeConfiguration.Builder.onError
                int r0 = r0 + 105
                int r0 = r0 % 128
                com.netcetera.threeds.sdk.api.configparameters.builder.SchemeConfiguration.Builder.ThreeDS2Service$InitializationCallback = r0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.api.configparameters.builder.SchemeConfiguration.Builder.values(java.util.List):java.lang.String");
        }

        public SchemeConfiguration build() throws InvalidInputException {
            int i = onError + 109;
            ThreeDS2Service$InitializationCallback = i % 128;
            if (i % 2 == 0) {
                String values = values(this.values);
                if (this.getSDKVersion) {
                    String str = this.getSDKInfo;
                    Object[] objArr = new Object[1];
                    valueOf("䮗\ue236ᣮ뚒\ued4d\u1bf4놌\ue852\u0601벸", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43440, objArr);
                    C9621nj.ThreeDS2ServiceInstance(str, ((String) objArr[0]).intern());
                    Object[] objArr2 = new Object[1];
                    valueOf("䮗\udb1c檺祖\u09e5领⠏뾽콏", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37019, objArr2);
                    C9621nj.ThreeDS2ServiceInstance(values, ((String) objArr2[0]).intern());
                    C9621nj.ThreeDS2ServiceInstance(this.ThreeDS2Service, "schemeLogo");
                    C9621nj.ThreeDS2ServiceInstance(this.ThreeDS2ServiceInstance, "schemeEncryptionPublicKey");
                    C9621nj.get(this.initialize, "schemePublicRootKey");
                    ThreeDS2Service$InitializationCallback = (onError + 15) % 128;
                }
                return new SchemeConfiguration(this.getSDKInfo, values, this.ThreeDS2Service, this.get, this.ThreeDS2ServiceInstance, this.cleanup, this.initialize);
            }
            values(this.values);
            throw null;
        }

        public Builder encryptionPublicKey(String str) {
            ThreeDS2Service$InitializationCallback = (onError + 111) % 128;
            this.ThreeDS2ServiceInstance = str;
            this.cleanup = ThreeDS2Service(str);
            int i = onError + 117;
            ThreeDS2Service$InitializationCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 67 / 0;
            }
            return this;
        }

        public Builder encryptionPublicKeyFromAssetCertificate(AssetManager assetManager, String str) {
            ThreeDS2Service$InitializationCallback = (onError + 11) % 128;
            String ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(assetManager, str);
            this.ThreeDS2ServiceInstance = ThreeDS2ServiceInstance;
            this.cleanup = ThreeDS2Service(ThreeDS2ServiceInstance);
            int i = onError + 15;
            ThreeDS2Service$InitializationCallback = i % 128;
            if (i % 2 == 0) {
                return this;
            }
            throw null;
        }

        public Builder ids(List<String> list) {
            int i = ThreeDS2Service$InitializationCallback + 113;
            onError = i % 128;
            if (i % 2 != 0) {
                this.values = list;
                return this;
            }
            this.values = list;
            throw null;
        }

        public Builder logo(String str) {
            int i = onError + 41;
            ThreeDS2Service$InitializationCallback = i % 128;
            if (i % 2 == 0) {
                this.ThreeDS2Service = str;
                return this;
            }
            this.ThreeDS2Service = str;
            throw null;
        }

        public Builder logoDark(String str) {
            int i = onError + 85;
            ThreeDS2Service$InitializationCallback = i % 128;
            if (i % 2 == 0) {
                this.get = str;
                return this;
            }
            this.get = str;
            throw null;
        }

        public Builder rootPublicKey(String... strArr) {
            int i = ThreeDS2Service$InitializationCallback + 51;
            onError = i % 128;
            if (i % 2 == 0) {
                this.initialize = Arrays.asList(strArr);
                int i2 = 71 / 0;
            } else {
                this.initialize = Arrays.asList(strArr);
            }
            int i3 = ThreeDS2Service$InitializationCallback + 45;
            onError = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 82 / 0;
            }
            return this;
        }

        public Builder rootPublicKeyFromAssetCertificate(AssetManager assetManager, String... strArr) {
            onError = (ThreeDS2Service$InitializationCallback + 69) % 128;
            for (String str : strArr) {
                List<String> list = (List) C9664oh.ThreeDS2Service(this.initialize, new ArrayList());
                this.initialize = list;
                list.add(get(assetManager, str));
            }
            onError = (ThreeDS2Service$InitializationCallback + 75) % 128;
            return this;
        }

        private Builder(String str, String str2, boolean z) {
            this.getSDKInfo = str;
            this.getWarnings = str2;
            this.getSDKVersion = z;
        }

        public Builder encryptionPublicKey(String str, String str2) {
            int i = onError;
            int i2 = i + 37;
            ThreeDS2Service$InitializationCallback = i2 % 128;
            if (i2 % 2 == 0) {
                this.ThreeDS2ServiceInstance = str;
                this.cleanup = str2;
                ThreeDS2Service$InitializationCallback = (i + 91) % 128;
                return this;
            }
            this.ThreeDS2ServiceInstance = str;
            this.cleanup = str2;
            throw null;
        }

        public Builder encryptionPublicKeyFromAssetCertificate(AssetManager assetManager, String str, String str2) {
            int i = onError + 35;
            ThreeDS2Service$InitializationCallback = i % 128;
            if (i % 2 != 0) {
                this.ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(assetManager, str);
                this.cleanup = str2;
                int i2 = 51 / 0;
            } else {
                this.ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(assetManager, str);
                this.cleanup = str2;
            }
            return this;
        }

        private List<? extends Certificate> ThreeDS2Service(InputStream inputStream) throws CertificateException {
            ArrayList arrayList = new ArrayList(CertificateFactory.getInstance("X.509").generateCertificates(inputStream));
            ThreeDS2Service$InitializationCallback = (onError + 103) % 128;
            return arrayList;
        }

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
            r7 = r7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void valueOf(java.lang.String r7, int r8, java.lang.Object[] r9) {
            /*
                if (r7 == 0) goto L6
                char[] r7 = r7.toCharArray()
            L6:
                char[] r7 = (char[]) r7
                java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.initialize.values
                monitor-enter(r0)
                com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2Service = r8     // Catch: java.lang.Throwable -> L2e
                int r8 = r7.length     // Catch: java.lang.Throwable -> L2e
                char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L2e
                r1 = 0
                com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L2e
            L13:
                int r2 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
                int r3 = r7.length     // Catch: java.lang.Throwable -> L2e
                if (r2 >= r3) goto L30
                char r3 = r7[r2]     // Catch: java.lang.Throwable -> L2e
                int r4 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2Service     // Catch: java.lang.Throwable -> L2e
                int r4 = r4 * r2
                r3 = r3 ^ r4
                long r3 = (long) r3     // Catch: java.lang.Throwable -> L2e
                long r5 = com.netcetera.threeds.sdk.api.configparameters.builder.SchemeConfiguration.Builder.valueOf     // Catch: java.lang.Throwable -> L2e
                long r3 = r3 ^ r5
                int r4 = (int) r3     // Catch: java.lang.Throwable -> L2e
                char r3 = (char) r4     // Catch: java.lang.Throwable -> L2e
                r8[r2] = r3     // Catch: java.lang.Throwable -> L2e
                int r2 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
                int r2 = r2 + 1
                com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2e
                goto L13
            L2e:
                r7 = move-exception
                goto L39
            L30:
                java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L2e
                r7.<init>(r8)     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
                r9[r1] = r7
                return
            L39:
                monitor-exit(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.api.configparameters.builder.SchemeConfiguration.Builder.valueOf(java.lang.String, int, java.lang.Object[]):void");
        }

        private List<String> ThreeDS2ServiceInstance(List<String> list) {
            if (list == null) {
                int i = onError + 77;
                ThreeDS2Service$InitializationCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 77 / 0;
                }
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (!C9669om.ThreeDS2Service(str)) {
                    arrayList.add(str);
                    onError = (ThreeDS2Service$InitializationCallback + 9) % 128;
                }
            }
            return arrayList;
        }

        private String ThreeDS2Service(String str) {
            try {
                List<? extends Certificate> ThreeDS2Service = ThreeDS2Service(new ByteArrayInputStream(C9668ol.valueOf(str)));
                if (!ThreeDS2Service.isEmpty()) {
                    onError = (ThreeDS2Service$InitializationCallback + 79) % 128;
                    byte[] keyIdentifier = valueOf((X509Certificate) ThreeDS2Service.get(0)).getKeyIdentifier();
                    String ThreeDS2ServiceInstance = C9609mz.ThreeDS2ServiceInstance(Arrays.copyOfRange(keyIdentifier, 2, keyIdentifier.length));
                    onError = (ThreeDS2Service$InitializationCallback + 37) % 128;
                    return ThreeDS2ServiceInstance;
                }
            } catch (NullPointerException | CertificateException unused) {
            }
            return "";
        }
    }

    public SchemeConfiguration(String str, String str2, String str3, String str4, String str5, String str6, List<String> list) {
        this.get = str;
        this.ThreeDS2Service = str2;
        this.values = str3;
        this.ThreeDS2ServiceInstance = str4;
        this.valueOf = str5;
        this.getSDKVersion = str6;
        this.initialize = list;
    }

    public static Builder amexConfiguration() {
        Builder builder = new Builder("amex", DsRidValues.AMEX, false);
        int i = getSDKInfo + 55;
        cleanup = i % 128;
        if (i % 2 != 0) {
            int i2 = 31 / 0;
        }
        return builder;
    }

    public static Builder cbConfiguration() {
        Builder builder = new Builder("cartesBancaires", DsRidValues.f58871CB, false);
        cleanup = (getSDKInfo + 115) % 128;
        return builder;
    }

    public static Builder dinersSchemeConfiguration() {
        Builder builder = new Builder("diners", DsRidValues.DINERS, false);
        int i = getSDKInfo + 55;
        cleanup = i % 128;
        if (i % 2 == 0) {
            return builder;
        }
        throw null;
    }

    public static Builder eftposConfiguration() {
        Builder builder = new Builder("eftpos", DsRidValues.EFTPOS, false);
        int i = cleanup + 51;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            return builder;
        }
        throw null;
    }

    public static Builder jcbConfiguration() {
        Builder builder = new Builder("jcb", DsRidValues.JCB, false);
        getSDKInfo = (cleanup + 17) % 128;
        return builder;
    }

    public static Builder mastercardSchemeConfiguration() {
        Builder builder = new Builder("mastercard", DsRidValues.MASTERCARD, false);
        cleanup = (getSDKInfo + 119) % 128;
        return builder;
    }

    public static Builder newSchemeConfiguration(String str) {
        Builder builder = new Builder(str, null, true);
        int i = getSDKInfo + 111;
        cleanup = i % 128;
        if (i % 2 != 0) {
            int i2 = 49 / 0;
        }
        return builder;
    }

    public static Builder unionSchemeConfiguration() {
        Builder builder = new Builder("union", DsRidValues.UNION, false);
        cleanup = (getSDKInfo + 67) % 128;
        return builder;
    }

    public static Builder visaSchemeConfiguration() {
        Builder builder = new Builder("visa", DsRidValues.VISA, false);
        getSDKInfo = (cleanup + 35) % 128;
        return builder;
    }

    public String getSchemeEncryptionPublicKey() {
        int i = cleanup;
        String str = this.valueOf;
        getSDKInfo = (i + 53) % 128;
        return str;
    }

    public String getSchemeEncryptionPublicKeyId() {
        int i = getSDKInfo + 119;
        int i2 = i % 128;
        cleanup = i2;
        if (i % 2 == 0) {
            String str = this.getSDKVersion;
            getSDKInfo = (i2 + 3) % 128;
            return str;
        }
        throw null;
    }

    public String getSchemeId() {
        String str;
        int i = cleanup + 93;
        int i2 = i % 128;
        getSDKInfo = i2;
        if (i % 2 == 0) {
            str = this.ThreeDS2Service;
            int i3 = 94 / 0;
        } else {
            str = this.ThreeDS2Service;
        }
        int i4 = i2 + 39;
        cleanup = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String getSchemeLogo() {
        int i = (cleanup + 55) % 128;
        getSDKInfo = i;
        String str = this.values;
        int i2 = i + 101;
        cleanup = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String getSchemeLogoDark() {
        int i = cleanup + 101;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            int i2 = 28 / 0;
            return this.ThreeDS2ServiceInstance;
        }
        return this.ThreeDS2ServiceInstance;
    }

    public String getSchemeName() {
        int i = getSDKInfo + 37;
        cleanup = i % 128;
        if (i % 2 != 0) {
            int i2 = 41 / 0;
            return this.get;
        }
        return this.get;
    }

    public List<String> getSchemePublicRootKeys() {
        int i = (getSDKInfo + 119) % 128;
        cleanup = i;
        List<String> list = this.initialize;
        getSDKInfo = (i + 71) % 128;
        return list;
    }
}
