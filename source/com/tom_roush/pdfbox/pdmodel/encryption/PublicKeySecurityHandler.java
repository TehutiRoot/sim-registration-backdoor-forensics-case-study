package com.tom_roush.pdfbox.pdmodel.encryption;

import androidx.core.p005os.EnvironmentCompat;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.EncryptedContentInfo;
import org.bouncycastle.asn1.cms.EnvelopedData;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.KeyTransRecipientInfo;
import org.bouncycastle.asn1.cms.OriginatorInfo;
import org.bouncycastle.asn1.cms.RecipientIdentifier;
import org.bouncycastle.asn1.cms.RecipientInfo;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSEnvelopedData;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.KeyTransRecipientId;
import org.bouncycastle.cms.RecipientId;
import org.bouncycastle.cms.RecipientInformation;
import org.bouncycastle.cms.jcajce.JceKeyTransEnvelopedRecipient;
import org.bouncycastle.util.Arrays;

/* loaded from: classes5.dex */
public final class PublicKeySecurityHandler extends SecurityHandler {
    public static final String FILTER = "Adobe.PubSec";

    public PublicKeySecurityHandler() {
    }

    /* renamed from: k */
    public final void m32517k(StringBuilder sb, KeyTransRecipientId keyTransRecipientId, X509Certificate x509Certificate, X509CertificateHolder x509CertificateHolder) {
        String str;
        Object issuer;
        BigInteger serialNumber = keyTransRecipientId.getSerialNumber();
        if (serialNumber != null) {
            BigInteger serialNumber2 = x509Certificate.getSerialNumber();
            if (serialNumber2 != null) {
                str = serialNumber2.toString(16);
            } else {
                str = EnvironmentCompat.MEDIA_UNKNOWN;
            }
            sb.append("serial-#: rid ");
            sb.append(serialNumber.toString(16));
            sb.append(" vs. cert ");
            sb.append(str);
            sb.append(" issuer: rid '");
            sb.append(keyTransRecipientId.getIssuer());
            sb.append("' vs. cert '");
            if (x509CertificateHolder == null) {
                issuer = AbstractJsonLexerKt.NULL;
            } else {
                issuer = x509CertificateHolder.getIssuer();
            }
            sb.append(issuer);
            sb.append("' ");
        }
    }

    /* renamed from: l */
    public final KeyTransRecipientInfo m32516l(X509Certificate x509Certificate, byte[] bArr) {
        ASN1InputStream aSN1InputStream = new ASN1InputStream(x509Certificate.getTBSCertificate());
        TBSCertificate tBSCertificate = TBSCertificate.getInstance(aSN1InputStream.readObject());
        aSN1InputStream.close();
        AlgorithmIdentifier algorithm = tBSCertificate.getSubjectPublicKeyInfo().getAlgorithm();
        IssuerAndSerialNumber issuerAndSerialNumber = new IssuerAndSerialNumber(tBSCertificate.getIssuer(), tBSCertificate.getSerialNumber().getValue());
        try {
            Cipher cipher = Cipher.getInstance(algorithm.getAlgorithm().getId(), SecurityProvider.getProvider());
            cipher.init(1, x509Certificate.getPublicKey());
            return new KeyTransRecipientInfo(new RecipientIdentifier(issuerAndSerialNumber), algorithm, new DEROctetString(cipher.doFinal(bArr)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Could not find a suitable javax.crypto provider", e);
        } catch (NoSuchPaddingException e2) {
            throw new RuntimeException("Could not find a suitable javax.crypto provider", e2);
        }
    }

    /* renamed from: m */
    public final byte[][] m32515m(byte[] bArr) {
        PublicKeyProtectionPolicy publicKeyProtectionPolicy = (PublicKeyProtectionPolicy) getProtectionPolicy();
        byte[][] bArr2 = new byte[publicKeyProtectionPolicy.getNumberOfRecipients()];
        Iterator<PublicKeyRecipient> recipientsIterator = publicKeyProtectionPolicy.getRecipientsIterator();
        int i = 0;
        while (recipientsIterator.hasNext()) {
            PublicKeyRecipient next = recipientsIterator.next();
            X509Certificate x509 = next.getX509();
            int permissionBytesForPublicKey = next.getPermission().getPermissionBytesForPublicKey();
            byte[] bArr3 = new byte[24];
            System.arraycopy(bArr, 0, bArr3, 0, 20);
            bArr3[20] = (byte) (permissionBytesForPublicKey >>> 24);
            bArr3[21] = (byte) (permissionBytesForPublicKey >>> 16);
            bArr3[22] = (byte) (permissionBytesForPublicKey >>> 8);
            bArr3[23] = (byte) permissionBytesForPublicKey;
            ASN1Primitive m32514n = m32514n(bArr3, x509);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            m32514n.encodeTo(byteArrayOutputStream, ASN1Encoding.DER);
            bArr2[i] = byteArrayOutputStream.toByteArray();
            i++;
        }
        return bArr2;
    }

    /* renamed from: n */
    public final ASN1Primitive m32514n(byte[] bArr, X509Certificate x509Certificate) {
        String id2 = PKCSObjectIdentifiers.RC2_CBC.getId();
        try {
            Provider provider = SecurityProvider.getProvider();
            AlgorithmParameterGenerator algorithmParameterGenerator = AlgorithmParameterGenerator.getInstance(id2, provider);
            KeyGenerator keyGenerator = KeyGenerator.getInstance(id2, provider);
            Cipher cipher = Cipher.getInstance(id2, provider);
            AlgorithmParameters generateParameters = algorithmParameterGenerator.generateParameters();
            ASN1InputStream aSN1InputStream = new ASN1InputStream(generateParameters.getEncoded("ASN.1"));
            ASN1Primitive readObject = aSN1InputStream.readObject();
            aSN1InputStream.close();
            keyGenerator.init(128);
            SecretKey generateKey = keyGenerator.generateKey();
            cipher.init(1, generateKey, generateParameters);
            byte[] doFinal = cipher.doFinal(bArr);
            return new ContentInfo(PKCSObjectIdentifiers.envelopedData, new EnvelopedData((OriginatorInfo) null, new DERSet(new RecipientInfo(m32516l(x509Certificate, generateKey.getEncoded()))), new EncryptedContentInfo(PKCSObjectIdentifiers.data, new AlgorithmIdentifier(new ASN1ObjectIdentifier(id2), readObject), new DEROctetString(doFinal)), (ASN1Set) null)).toASN1Primitive();
        } catch (NoSuchAlgorithmException e) {
            throw new IOException("Could not find a suitable javax.crypto provider for algorithm " + id2 + "; possible reason: using an unsigned .jar file", e);
        } catch (NoSuchPaddingException e2) {
            throw new RuntimeException("Could not find a suitable javax.crypto provider", e2);
        }
    }

    /* renamed from: o */
    public final void m32513o(PDEncryption pDEncryption, COSName cOSName, byte[][] bArr) {
        PDCryptFilterDictionary pDCryptFilterDictionary = new PDCryptFilterDictionary();
        pDCryptFilterDictionary.setCryptFilterMethod(cOSName);
        pDCryptFilterDictionary.setLength(getKeyLength());
        COSArray cOSArray = new COSArray();
        for (byte[] bArr2 : bArr) {
            cOSArray.add((COSBase) new COSString(bArr2));
        }
        pDCryptFilterDictionary.getCOSObject().setItem(COSName.RECIPIENTS, (COSBase) cOSArray);
        cOSArray.setDirect(true);
        pDEncryption.setDefaultCryptFilterDictionary(pDCryptFilterDictionary);
        COSName cOSName2 = COSName.DEFAULT_CRYPT_FILTER;
        pDEncryption.setStreamFilterName(cOSName2);
        pDEncryption.setStringFilterName(cOSName2);
        pDCryptFilterDictionary.getCOSObject().setDirect(true);
        setAES(true);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.encryption.SecurityHandler
    public void prepareDocumentForEncryption(PDDocument pDDocument) throws IOException {
        byte[] digest;
        try {
            PDEncryption encryption = pDDocument.getEncryption();
            if (encryption == null) {
                encryption = new PDEncryption();
            }
            encryption.setFilter(FILTER);
            encryption.setLength(getKeyLength());
            int computeVersionNumber = computeVersionNumber();
            encryption.setVersion(computeVersionNumber);
            encryption.removeV45filters();
            int i = 20;
            byte[] bArr = new byte[20];
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(CertificateHolderAuthorization.CVCA, new SecureRandom());
                System.arraycopy(keyGenerator.generateKey().getEncoded(), 0, bArr, 0, 20);
                byte[][] m32515m = m32515m(bArr);
                int i2 = 20;
                for (byte[] bArr2 : m32515m) {
                    i2 += bArr2.length;
                }
                byte[] bArr3 = new byte[i2];
                System.arraycopy(bArr, 0, bArr3, 0, 20);
                for (byte[] bArr4 : m32515m) {
                    System.arraycopy(bArr4, 0, bArr3, i, bArr4.length);
                    i += bArr4.length;
                }
                if (computeVersionNumber != 4) {
                    if (computeVersionNumber != 5) {
                        encryption.setSubFilter("adbe.pkcs7.s4");
                        digest = AbstractC20627js0.m29036b().digest(bArr3);
                        encryption.setRecipients(m32515m);
                    } else {
                        encryption.setSubFilter("adbe.pkcs7.s5");
                        digest = AbstractC20627js0.m29035c().digest(bArr3);
                        m32513o(encryption, COSName.AESV3, m32515m);
                    }
                } else {
                    encryption.setSubFilter("adbe.pkcs7.s5");
                    digest = AbstractC20627js0.m29036b().digest(bArr3);
                    m32513o(encryption, COSName.AESV2, m32515m);
                }
                setEncryptionKey(new byte[getKeyLength() / 8]);
                System.arraycopy(digest, 0, getEncryptionKey(), 0, getKeyLength() / 8);
                pDDocument.setEncryptionDictionary(encryption);
                pDDocument.getDocument().setEncryptionDictionary(encryption.getCOSObject());
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        } catch (GeneralSecurityException e2) {
            throw new IOException(e2);
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.encryption.SecurityHandler
    public void prepareForDecryption(PDEncryption pDEncryption, COSArray cOSArray, DecryptionMaterial decryptionMaterial) throws IOException {
        X509CertificateHolder x509CertificateHolder;
        byte[] digest;
        boolean z;
        PublicKeyDecryptionMaterial publicKeyDecryptionMaterial;
        if (decryptionMaterial instanceof PublicKeyDecryptionMaterial) {
            PDCryptFilterDictionary defaultCryptFilterDictionary = pDEncryption.getDefaultCryptFilterDictionary();
            if (defaultCryptFilterDictionary != null && defaultCryptFilterDictionary.getLength() != 0) {
                setKeyLength(defaultCryptFilterDictionary.getLength());
                setDecryptMetadata(defaultCryptFilterDictionary.isEncryptMetaData());
            } else if (pDEncryption.getLength() != 0) {
                setKeyLength(pDEncryption.getLength());
                setDecryptMetadata(pDEncryption.isEncryptMetaData());
            }
            PublicKeyDecryptionMaterial publicKeyDecryptionMaterial2 = (PublicKeyDecryptionMaterial) decryptionMaterial;
            try {
                X509Certificate certificate = publicKeyDecryptionMaterial2.getCertificate();
                byte[] bArr = null;
                if (certificate != null) {
                    x509CertificateHolder = new X509CertificateHolder(certificate.getEncoded());
                } else {
                    x509CertificateHolder = null;
                }
                COSDictionary cOSObject = pDEncryption.getCOSObject();
                COSName cOSName = COSName.RECIPIENTS;
                COSArray cOSArray2 = cOSObject.getCOSArray(cOSName);
                if (cOSArray2 == null && defaultCryptFilterDictionary != null) {
                    cOSArray2 = defaultCryptFilterDictionary.getCOSObject().getCOSArray(cOSName);
                }
                if (cOSArray2 != null) {
                    int size = cOSArray2.size();
                    byte[][] bArr2 = new byte[size];
                    StringBuilder sb = new StringBuilder();
                    int i = 0;
                    boolean z2 = false;
                    int i2 = 0;
                    while (i < cOSArray2.size()) {
                        byte[] bytes = ((COSString) cOSArray2.getObject(i)).getBytes();
                        Iterator it = new CMSEnvelopedData(bytes).getRecipientInfos().getRecipients().iterator();
                        int i3 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                RecipientInformation recipientInformation = (RecipientInformation) it.next();
                                RecipientId rid = recipientInformation.getRID();
                                if (!z2 && rid.match(x509CertificateHolder)) {
                                    publicKeyDecryptionMaterial = publicKeyDecryptionMaterial2;
                                    bArr = recipientInformation.getContent(new JceKeyTransEnvelopedRecipient((PrivateKey) publicKeyDecryptionMaterial2.getPrivateKey()));
                                    z2 = true;
                                    break;
                                }
                                PublicKeyDecryptionMaterial publicKeyDecryptionMaterial3 = publicKeyDecryptionMaterial2;
                                int i4 = i3 + 1;
                                if (certificate != null) {
                                    sb.append('\n');
                                    sb.append(i4);
                                    sb.append(": ");
                                    if (rid instanceof KeyTransRecipientId) {
                                        m32517k(sb, (KeyTransRecipientId) rid, certificate, x509CertificateHolder);
                                    }
                                }
                                i3 = i4;
                                publicKeyDecryptionMaterial2 = publicKeyDecryptionMaterial3;
                            } else {
                                publicKeyDecryptionMaterial = publicKeyDecryptionMaterial2;
                                break;
                            }
                        }
                        bArr2[i] = bytes;
                        i2 += bytes.length;
                        i++;
                        publicKeyDecryptionMaterial2 = publicKeyDecryptionMaterial;
                    }
                    if (z2 && bArr != null) {
                        if (bArr.length == 24) {
                            byte[] bArr3 = new byte[4];
                            int i5 = 20;
                            System.arraycopy(bArr, 20, bArr3, 0, 4);
                            AccessPermission accessPermission = new AccessPermission(bArr3);
                            accessPermission.setReadOnly();
                            setCurrentAccessPermission(accessPermission);
                            byte[] bArr4 = new byte[i2 + 20];
                            int i6 = 0;
                            System.arraycopy(bArr, 0, bArr4, 0, 20);
                            int i7 = 0;
                            while (i7 < size) {
                                byte[] bArr5 = bArr2[i7];
                                System.arraycopy(bArr5, i6, bArr4, i5, bArr5.length);
                                i5 += bArr5.length;
                                i7++;
                                i6 = 0;
                            }
                            if (pDEncryption.getVersion() != 4 && pDEncryption.getVersion() != 5) {
                                digest = AbstractC20627js0.m29036b().digest(bArr4);
                                setEncryptionKey(new byte[getKeyLength() / 8]);
                                System.arraycopy(digest, 0, getEncryptionKey(), 0, getKeyLength() / 8);
                                return;
                            }
                            if (!isDecryptMetadata()) {
                                bArr4 = Arrays.copyOf(bArr4, i2 + 24);
                                System.arraycopy(new byte[]{-1, -1, -1, -1}, 0, bArr4, bArr4.length - 4, 4);
                            }
                            if (pDEncryption.getVersion() == 4) {
                                digest = AbstractC20627js0.m29036b().digest(bArr4);
                            } else {
                                digest = AbstractC20627js0.m29035c().digest(bArr4);
                            }
                            if (defaultCryptFilterDictionary != null) {
                                COSName cryptFilterMethod = defaultCryptFilterDictionary.getCryptFilterMethod();
                                if (!COSName.AESV2.equals(cryptFilterMethod) && !COSName.AESV3.equals(cryptFilterMethod)) {
                                    z = false;
                                    setAES(z);
                                }
                                z = true;
                                setAES(z);
                            }
                            setEncryptionKey(new byte[getKeyLength() / 8]);
                            System.arraycopy(digest, 0, getEncryptionKey(), 0, getKeyLength() / 8);
                            return;
                        }
                        throw new IOException("The enveloped data does not contain 24 bytes");
                    }
                    throw new IOException("The certificate matches none of " + cOSArray2.size() + " recipient entries" + sb.toString());
                }
                throw new IOException("/Recipients entry is missing in encryption dictionary");
            } catch (KeyStoreException e) {
                throw new IOException(e);
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2);
            } catch (CMSException e3) {
                throw new IOException((Throwable) e3);
            }
        }
        throw new IOException("Provided decryption material is not compatible with the document - did you pass a null keyStore?");
    }

    public PublicKeySecurityHandler(PublicKeyProtectionPolicy publicKeyProtectionPolicy) {
        setProtectionPolicy(publicKeyProtectionPolicy);
        setKeyLength(publicKeyProtectionPolicy.getEncryptionKeyLength());
    }
}
