package org.bouncycastle.jce.provider;

import android.view.ViewConfiguration;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.asn1.p031bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.jcajce.provider.bike.BIKEKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.cmce.CMCEKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.lms.LMSKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.newhope.NHKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.picnic.PicnicKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.sphincs.Sphincs256KeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.xmss.XMSSKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTKeyFactorySpi;
import org.bouncycastle.util.Strings;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes6.dex */
public final class NcaBouncyCastleProvider extends Provider implements ConfigurableProvider {
    private static final String[] ConfigParameters;
    private static int ConfigurationBuilder = 0;
    private static String ThreeDS2Service = null;
    private static final String[] ThreeDS2Service$InitializationCallback;
    public static long ThreeDS2ServiceInstance = 0;
    private static final String[] cleanup;
    public static final ProviderConfiguration get;
    private static final Class getSDKInfo;
    private static final CryptoServiceProperties[] getSDKVersion;
    private static final String[] getWarnings;
    private static final String[] initialize;
    private static final String[] onCompleted;
    private static final String[] onError;
    private static int removeParam = 1;
    private static final Map valueOf;
    private static final Logger values;
    private Map<String, Provider.Service> createTransaction;

    /* loaded from: classes6.dex */
    public static class values implements CryptoServiceProperties {
        private final String ThreeDS2Service;
        private final int get;

        public values(String str, int i) {
            this.ThreeDS2Service = str;
            this.get = i;
        }

        public int bitsOfSecurity() {
            return this.get;
        }

        public Object getParams() {
            return null;
        }

        public CryptoServicePurpose getPurpose() {
            return CryptoServicePurpose.ANY;
        }

        public String getServiceName() {
            return this.ThreeDS2Service;
        }
    }

    static {
        valueOf();
        values = Logger.getLogger(BouncyCastleProvider.class.getName());
        ThreeDS2Service = "NCA BouncyCastle Security Provider v1.77";
        get = new BouncyCastleProviderConfiguration();
        valueOf = new HashMap();
        getSDKInfo = ClassUtil.loadClass(BouncyCastleProvider.class, "java.security.cert.PKIXRevocationChecker");
        cleanup = new String[]{"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
        getWarnings = new String[]{"SipHash", "SipHash128", "Poly1305"};
        Object[] objArr = new Object[1];
        ThreeDS2Service("ᤌ奕馤", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16477, objArr);
        getSDKVersion = new CryptoServiceProperties[]{ThreeDS2ServiceInstance(((String) objArr[0]).intern(), 256), ThreeDS2ServiceInstance("ARC4", 20), ThreeDS2ServiceInstance("ARIA", 256), ThreeDS2ServiceInstance("Blowfish", 128), ThreeDS2ServiceInstance("Camellia", 256), ThreeDS2ServiceInstance("CAST5", 128), ThreeDS2ServiceInstance("CAST6", 256), ThreeDS2ServiceInstance("ChaCha", 128), ThreeDS2ServiceInstance("DES", 56), ThreeDS2ServiceInstance("DESede", 112), ThreeDS2ServiceInstance("GOST28147", 128), ThreeDS2ServiceInstance("Grainv1", 128), ThreeDS2ServiceInstance("Grain128", 128), ThreeDS2ServiceInstance("HC128", 128), ThreeDS2ServiceInstance("HC256", 256), ThreeDS2ServiceInstance("IDEA", 128), ThreeDS2ServiceInstance("Noekeon", 128), ThreeDS2ServiceInstance("RC2", 128), ThreeDS2ServiceInstance("RC5", 128), ThreeDS2ServiceInstance("RC6", 256), ThreeDS2ServiceInstance("Rijndael", 256), ThreeDS2ServiceInstance("Salsa20", 128), ThreeDS2ServiceInstance("SEED", 128), ThreeDS2ServiceInstance("Serpent", 256), ThreeDS2ServiceInstance("Shacal2", 128), ThreeDS2ServiceInstance("Skipjack", 80), ThreeDS2ServiceInstance("SM4", 128), ThreeDS2ServiceInstance("TEA", 128), ThreeDS2ServiceInstance("Twofish", 256), ThreeDS2ServiceInstance("Threefish", 128), ThreeDS2ServiceInstance("VMPC", 128), ThreeDS2ServiceInstance("VMPCKSA3", 128), ThreeDS2ServiceInstance("XTEA", 128), ThreeDS2ServiceInstance("XSalsa20", 128), ThreeDS2ServiceInstance("OpenSSLPBKDF", 128), ThreeDS2ServiceInstance("DSTU7624", 256), ThreeDS2ServiceInstance("GOST3412_2015", 256), ThreeDS2ServiceInstance("Zuc", 128)};
        initialize = new String[]{"X509", "IES", "COMPOSITE", Constant.MnpType.EXTERNAL_PORT};
        onError = new String[]{"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC", "LMS", "SPHINCSPlus", "Dilithium", "Falcon", "NTRU"};
        onCompleted = new String[]{"GOST3411", "Keccak", MessageDigestAlgorithms.MD2, "MD4", MessageDigestAlgorithms.MD5, "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka", "Blake3"};
        ConfigParameters = new String[]{BouncyCastleProvider.PROVIDER_NAME, "BCFKS", "PKCS12"};
        ThreeDS2Service$InitializationCallback = new String[]{"DRBG"};
        ConfigurationBuilder = (removeParam + 35) % 128;
    }

    public NcaBouncyCastleProvider() {
        super("NCABC", 1.77d, ThreeDS2Service);
        this.createTransaction = new ConcurrentHashMap();
        AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.jce.provider.NcaBouncyCastleProvider.3
            @Override // java.security.PrivilegedAction
            public Object run() {
                NcaBouncyCastleProvider.ThreeDS2ServiceInstance(NcaBouncyCastleProvider.this);
                return null;
            }
        });
    }

    private void ThreeDS2Service() {
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_128s_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_128f_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_128s_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_128f_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_128s_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_128f_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_192s_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_192f_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_192s_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_192f_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_192s_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_192f_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_256s_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_256f_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_256s_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_256f_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_256s_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_256f_r3, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_128s_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_128f_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_128s_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_128f_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_128s_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_128f_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_192s_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_192f_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_192s_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_192f_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_192s_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_192f_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_256s_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_256f_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_256s_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_256f_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_256s_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_haraka_256f_r3_simple, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_128s, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_192s, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_sha2_256s, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(new ASN1ObjectIdentifier("1.3.9999.6.4.10"), new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_128f, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_192f, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.sphincsPlus_shake_256f, new SPHINCSPlusKeyFactorySpi());
        addKeyInfoConverter(PQCObjectIdentifiers.sphincs256, new Sphincs256KeyFactorySpi());
        addKeyInfoConverter(PQCObjectIdentifiers.newHope, new NHKeyFactorySpi());
        addKeyInfoConverter(PQCObjectIdentifiers.xmss, new XMSSKeyFactorySpi());
        addKeyInfoConverter(IsaraObjectIdentifiers.id_alg_xmss, new XMSSKeyFactorySpi());
        addKeyInfoConverter(PQCObjectIdentifiers.xmss_mt, new XMSSMTKeyFactorySpi());
        addKeyInfoConverter(IsaraObjectIdentifiers.id_alg_xmssmt, new XMSSMTKeyFactorySpi());
        addKeyInfoConverter(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig, new LMSKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.picnic_key, new PicnicKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.falcon_512, new FalconKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.falcon_1024, new FalconKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.dilithium2, new DilithiumKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.dilithium3, new DilithiumKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.dilithium5, new DilithiumKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.dilithium2_aes, new DilithiumKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.dilithium3_aes, new DilithiumKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.dilithium5_aes, new DilithiumKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.kyber512, new KyberKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.kyber768, new KyberKeyFactorySpi());
        ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.kyber1024;
        addKeyInfoConverter(aSN1ObjectIdentifier, new KyberKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.mceliece348864_r3, new CMCEKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.mceliece460896_r3, new CMCEKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.mceliece6688128_r3, new CMCEKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.mceliece6960119_r3, new CMCEKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.mceliece8192128_r3, new CMCEKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.bike128, new BIKEKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.bike192, new BIKEKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.bike256, new BIKEKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.hqc128, new HQCKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.hqc192, new HQCKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.hqc256, new HQCKeyFactorySpi());
        addKeyInfoConverter(aSN1ObjectIdentifier, new KyberKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.kyber512_aes, new KyberKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.kyber768_aes, new KyberKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.kyber1024_aes, new KyberKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.ntruhps2048509, new NTRUKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.ntruhps2048677, new NTRUKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.ntruhps4096821, new NTRUKeyFactorySpi());
        addKeyInfoConverter(BCObjectIdentifiers.ntruhrss701, new NTRUKeyFactorySpi());
        int i = ConfigurationBuilder + 81;
        removeParam = i % 128;
        if (i % 2 == 0) {
            int i2 = 33 / 0;
        }
    }

    public static /* synthetic */ Provider.Service ThreeDS2ServiceInstance(NcaBouncyCastleProvider ncaBouncyCastleProvider, String str, String str2) {
        ConfigurationBuilder = (removeParam + 23) % 128;
        Provider.Service service = super.getService(str, str2);
        ConfigurationBuilder = (removeParam + 81) % 128;
        return service;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        if ((r2 % 2) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        return r0.generatePrivate(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r0 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r0 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        r2 = org.bouncycastle.jce.provider.NcaBouncyCastleProvider.removeParam + 7;
        org.bouncycastle.jce.provider.NcaBouncyCastleProvider.ConfigurationBuilder = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.PrivateKey getPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo r2) throws java.io.IOException {
        /*
            int r0 = org.bouncycastle.jce.provider.NcaBouncyCastleProvider.ConfigurationBuilder
            int r0 = r0 + 13
            int r1 = r0 % 128
            org.bouncycastle.jce.provider.NcaBouncyCastleProvider.removeParam = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L1f
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r0 = r2.getPrivateKeyAlgorithm()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r0 = r0.getAlgorithm()
            org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter r0 = valueOf(r0)
            r1 = 57
            int r1 = r1 / 0
            if (r0 != 0) goto L3c
            goto L2d
        L1f:
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r0 = r2.getPrivateKeyAlgorithm()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r0 = r0.getAlgorithm()
            org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter r0 = valueOf(r0)
            if (r0 != 0) goto L3c
        L2d:
            int r2 = org.bouncycastle.jce.provider.NcaBouncyCastleProvider.removeParam
            int r2 = r2 + 7
            int r0 = r2 % 128
            org.bouncycastle.jce.provider.NcaBouncyCastleProvider.ConfigurationBuilder = r0
            int r2 = r2 % 2
            r0 = 0
            if (r2 != 0) goto L3b
            return r0
        L3b:
            throw r0
        L3c:
            java.security.PrivateKey r2 = r0.generatePrivate(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.NcaBouncyCastleProvider.getPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo):java.security.PrivateKey");
    }

    public static PublicKey getPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        removeParam = (ConfigurationBuilder + 71) % 128;
        if (subjectPublicKeyInfo.getAlgorithm().getAlgorithm().m24543on(BCObjectIdentifiers.picnic_key)) {
            return new PicnicKeyFactorySpi().generatePublic(subjectPublicKeyInfo);
        }
        AsymmetricKeyInfoConverter valueOf2 = valueOf(subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        if (valueOf2 == null) {
            ConfigurationBuilder = (removeParam + 49) % 128;
            return null;
        }
        return valueOf2.generatePublic(subjectPublicKeyInfo);
    }

    public static void valueOf() {
        ThreeDS2ServiceInstance = 8347620234797324621L;
    }

    public static /* synthetic */ Object values(NcaBouncyCastleProvider ncaBouncyCastleProvider, Object obj) {
        removeParam = (ConfigurationBuilder + 73) % 128;
        Object remove = super.remove(obj);
        int i = removeParam + 27;
        ConfigurationBuilder = i % 128;
        if (i % 2 == 0) {
            return remove;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
        throw new java.lang.IllegalStateException("duplicate provider key (" + r3 + ") found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (containsKey(r3) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (containsKey(r3) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        put(r3, r4);
        org.bouncycastle.jce.provider.NcaBouncyCastleProvider.removeParam = (org.bouncycastle.jce.provider.NcaBouncyCastleProvider.ConfigurationBuilder + th.p047co.dtac.android.dtacone.view.activity.CameraActivity.REQUEST_CODE) % 128;
     */
    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addAlgorithm(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            int r0 = org.bouncycastle.jce.provider.NcaBouncyCastleProvider.ConfigurationBuilder
            int r0 = r0 + 27
            int r1 = r0 % 128
            org.bouncycastle.jce.provider.NcaBouncyCastleProvider.removeParam = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L17
            boolean r0 = r2.containsKey(r3)
            r1 = 54
            int r1 = r1 / 0
            if (r0 != 0) goto L29
            goto L1d
        L17:
            boolean r0 = r2.containsKey(r3)
            if (r0 != 0) goto L29
        L1d:
            r2.put(r3, r4)
            int r3 = org.bouncycastle.jce.provider.NcaBouncyCastleProvider.ConfigurationBuilder
            int r3 = r3 + 123
            int r3 = r3 % 128
            org.bouncycastle.jce.provider.NcaBouncyCastleProvider.removeParam = r3
            return
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "duplicate provider key ("
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ") found"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.NcaBouncyCastleProvider.addAlgorithm(java.lang.String, java.lang.String):void");
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAttributes(String str, Map<String, String> map) {
        put(str + " ImplementedIn", ExifInterface.TAG_SOFTWARE);
        for (String str2 : map.keySet()) {
            String str3 = str + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str2;
            if (!containsKey(str3)) {
                put(str3, map.get(str2));
            } else {
                throw new IllegalStateException("duplicate provider attribute key (" + str3 + ") found");
            }
        }
        ConfigurationBuilder = (removeParam + 21) % 128;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addKeyInfoConverter(ASN1ObjectIdentifier aSN1ObjectIdentifier, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        Map map = valueOf;
        synchronized (map) {
            map.put(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public AsymmetricKeyInfoConverter getKeyInfoConverter(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        ConfigurationBuilder = (removeParam + 77) % 128;
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) valueOf.get(aSN1ObjectIdentifier);
        int i = ConfigurationBuilder + 55;
        removeParam = i % 128;
        if (i % 2 != 0) {
            return asymmetricKeyInfoConverter;
        }
        throw null;
    }

    @Override // java.security.Provider
    public final Provider.Service getService(final String str, final String str2) {
        Provider.Service service;
        final String str3 = str + "." + Strings.toUpperCase(str2);
        Provider.Service service2 = this.createTransaction.get(str3);
        if (service2 == null) {
            synchronized (this) {
                try {
                    if (!this.createTransaction.containsKey(str3)) {
                        service = (Provider.Service) AccessController.doPrivileged(new PrivilegedAction<Provider.Service>() { // from class: org.bouncycastle.jce.provider.NcaBouncyCastleProvider.2
                            @Override // java.security.PrivilegedAction
                            /* renamed from: get */
                            public Provider.Service run() {
                                Provider.Service ThreeDS2ServiceInstance2 = NcaBouncyCastleProvider.ThreeDS2ServiceInstance(NcaBouncyCastleProvider.this, str, str2);
                                if (ThreeDS2ServiceInstance2 == null) {
                                    return null;
                                }
                                NcaBouncyCastleProvider.values(NcaBouncyCastleProvider.this).put(str3, ThreeDS2ServiceInstance2);
                                NcaBouncyCastleProvider ncaBouncyCastleProvider = NcaBouncyCastleProvider.this;
                                NcaBouncyCastleProvider.values(ncaBouncyCastleProvider, ThreeDS2ServiceInstance2.getType() + "." + ThreeDS2ServiceInstance2.getAlgorithm());
                                NcaBouncyCastleProvider.values(NcaBouncyCastleProvider.this, ThreeDS2ServiceInstance2);
                                return ThreeDS2ServiceInstance2;
                            }
                        });
                    } else {
                        service = this.createTransaction.get(str3);
                    }
                    service2 = service;
                } finally {
                }
            }
        }
        return service2;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public boolean hasAlgorithm(String str, String str2) {
        boolean z;
        if (!containsKey(str + "." + str2)) {
            if (!containsKey("Alg.Alias." + str + "." + str2)) {
                z = false;
                ConfigurationBuilder = (removeParam + 83) % 128;
                return z;
            }
        }
        ConfigurationBuilder = (removeParam + 41) % 128;
        z = true;
        ConfigurationBuilder = (removeParam + 83) % 128;
        return z;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void setParameter(String str, Object obj) {
        ProviderConfiguration providerConfiguration = get;
        synchronized (providerConfiguration) {
            ((BouncyCastleProviderConfiguration) providerConfiguration).setParameter(str, obj);
        }
    }

    public static /* synthetic */ void ThreeDS2ServiceInstance(NcaBouncyCastleProvider ncaBouncyCastleProvider) {
        ConfigurationBuilder = (removeParam + 37) % 128;
        ncaBouncyCastleProvider.ThreeDS2ServiceInstance();
        removeParam = (ConfigurationBuilder + 1) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void valueOf(java.lang.String r6, org.bouncycastle.crypto.CryptoServiceProperties[] r7) {
        /*
            r5 = this;
            int r0 = org.bouncycastle.jce.provider.NcaBouncyCastleProvider.removeParam
            int r0 = r0 + 93
            int r0 = r0 % 128
            org.bouncycastle.jce.provider.NcaBouncyCastleProvider.ConfigurationBuilder = r0
            r0 = 0
        L9:
            int r1 = r7.length
            if (r0 == r1) goto L67
            int r1 = org.bouncycastle.jce.provider.NcaBouncyCastleProvider.removeParam
            int r1 = r1 + 67
            int r2 = r1 % 128
            org.bouncycastle.jce.provider.NcaBouncyCastleProvider.ConfigurationBuilder = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L27
            r1 = r7[r0]
            org.bouncycastle.crypto.CryptoServicesRegistrar.checkConstraints(r1)     // Catch: org.bouncycastle.crypto.CryptoServiceConstraintsException -> L25
            java.lang.String r2 = r1.getServiceName()     // Catch: org.bouncycastle.crypto.CryptoServiceConstraintsException -> L25
            r5.valueOf(r6, r2)     // Catch: org.bouncycastle.crypto.CryptoServiceConstraintsException -> L25
            goto L64
        L25:
            goto L35
        L27:
            r1 = r7[r0]
            org.bouncycastle.crypto.CryptoServicesRegistrar.checkConstraints(r1)     // Catch: org.bouncycastle.crypto.CryptoServiceConstraintsException -> L25
            java.lang.String r2 = r1.getServiceName()     // Catch: org.bouncycastle.crypto.CryptoServiceConstraintsException -> L25
            r5.valueOf(r6, r2)     // Catch: org.bouncycastle.crypto.CryptoServiceConstraintsException -> L25
            r6 = 0
            throw r6
        L35:
            java.util.logging.Logger r2 = org.bouncycastle.jce.provider.NcaBouncyCastleProvider.values
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            boolean r3 = r2.isLoggable(r3)
            if (r3 == 0) goto L64
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "service for "
            r3.append(r4)
            java.lang.String r1 = r1.getServiceName()
            r3.append(r1)
            java.lang.String r1 = " ignored due to constraints"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.fine(r1)
            int r1 = org.bouncycastle.jce.provider.NcaBouncyCastleProvider.removeParam
            int r1 = r1 + 103
            int r1 = r1 % 128
            org.bouncycastle.jce.provider.NcaBouncyCastleProvider.ConfigurationBuilder = r1
        L64:
            int r0 = r0 + 1
            goto L9
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.NcaBouncyCastleProvider.valueOf(java.lang.String, org.bouncycastle.crypto.CryptoServiceProperties[]):void");
    }

    public static /* synthetic */ Map values(NcaBouncyCastleProvider ncaBouncyCastleProvider) {
        int i = ConfigurationBuilder;
        removeParam = (i + 97) % 128;
        Map<String, Provider.Service> map = ncaBouncyCastleProvider.createTransaction;
        int i2 = i + 57;
        removeParam = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
        return map;
    }

    private void ThreeDS2ServiceInstance() {
        ConfigurationBuilder = (removeParam + 117) % 128;
        values("org.bouncycastle.jcajce.provider.digest.", onCompleted);
        values("org.bouncycastle.jcajce.provider.symmetric.", cleanup);
        values("org.bouncycastle.jcajce.provider.symmetric.", getWarnings);
        valueOf("org.bouncycastle.jcajce.provider.symmetric.", getSDKVersion);
        values("org.bouncycastle.jcajce.provider.asymmetric.", initialize);
        values("org.bouncycastle.jcajce.provider.asymmetric.", onError);
        values("org.bouncycastle.jcajce.provider.keystore.", ConfigParameters);
        values("org.bouncycastle.jcajce.provider.drbg.", ThreeDS2Service$InitializationCallback);
        ThreeDS2Service();
        put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        if (getSDKInfo != null) {
            removeParam = (ConfigurationBuilder + 5) % 128;
            put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
            put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
            removeParam = (ConfigurationBuilder + 25) % 128;
        } else {
            put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
            put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        }
        put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
        getService("SecureRandom", "DEFAULT");
    }

    public static /* synthetic */ void values(NcaBouncyCastleProvider ncaBouncyCastleProvider, Provider.Service service) {
        ConfigurationBuilder = (removeParam + 81) % 128;
        super.putService(service);
        removeParam = (ConfigurationBuilder + CameraActivity.REQUEST_CODE) % 128;
    }

    private void values(String str, String[] strArr) {
        int i = removeParam + 105;
        ConfigurationBuilder = i % 128;
        int i2 = i % 2 != 0 ? 1 : 0;
        while (i2 != strArr.length) {
            valueOf(str, strArr[i2]);
            i2++;
            removeParam = (ConfigurationBuilder + 1) % 128;
        }
    }

    public void addAlgorithm(String str, String str2, Map<String, String> map) {
        int i = removeParam + 65;
        ConfigurationBuilder = i % 128;
        if (i % 2 != 0) {
            addAlgorithm(str, str2);
            addAttributes(str, map);
            int i2 = 0 / 0;
            return;
        }
        addAlgorithm(str, str2);
        addAttributes(str, map);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        addAlgorithm(str + "." + aSN1ObjectIdentifier, str2);
        addAlgorithm(str + ".OID." + aSN1ObjectIdentifier, str2);
        ConfigurationBuilder = (removeParam + 79) % 128;
    }

    private void valueOf(String str, String str2) {
        Class loadClass = ClassUtil.loadClass(BouncyCastleProvider.class, str + str2 + "$Mappings");
        if (loadClass != null) {
            ConfigurationBuilder = (removeParam + 39) % 128;
            try {
                ((AlgorithmProvider) loadClass.newInstance()).configure(this);
                ConfigurationBuilder = (removeParam + CameraActivity.REQUEST_CODE) % 128;
            } catch (Exception e) {
                throw new InternalError("cannot create instance of " + str + str2 + "$Mappings : " + e);
            }
        }
    }

    public void addAlgorithm(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2, Map<String, String> map) {
        addAlgorithm(str, aSN1ObjectIdentifier, str2);
        addAttributes(str + "." + aSN1ObjectIdentifier, map);
        addAttributes(str + ".OID." + aSN1ObjectIdentifier, map);
        removeParam = (ConfigurationBuilder + 43) % 128;
    }

    private static AsymmetricKeyInfoConverter valueOf(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter;
        Map map = valueOf;
        synchronized (map) {
            asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) map.get(aSN1ObjectIdentifier);
        }
        return asymmetricKeyInfoConverter;
    }

    private static CryptoServiceProperties ThreeDS2ServiceInstance(String str, int i) {
        values valuesVar = new values(str, i);
        ConfigurationBuilder = (removeParam + 97) % 128;
        return valuesVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r7 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(java.lang.String r7, int r8, java.lang.Object[] r9) {
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
            long r5 = org.bouncycastle.jce.provider.NcaBouncyCastleProvider.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
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
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.NcaBouncyCastleProvider.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }
}
