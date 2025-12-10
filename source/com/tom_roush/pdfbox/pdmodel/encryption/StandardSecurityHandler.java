package com.tom_roush.pdfbox.pdmodel.encryption;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.util.Charsets;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public final class StandardSecurityHandler extends SecurityHandler {
    public static final String FILTER = "Standard";
    public static final Class<?> PROTECTION_POLICY_CLASS = StandardProtectionPolicy.class;

    /* renamed from: k */
    public static final byte[] f60329k = {40, ByteSourceJsonBootstrapper.UTF8_BOM_3, 78, 94, 78, 117, -118, 65, 100, 0, 78, 86, -1, -6, 1, 8, 46, 46, 0, -74, -48, 104, 62, Byte.MIN_VALUE, 47, 12, -87, -2, 100, 83, 105, 122};

    /* renamed from: l */
    public static final String[] f60330l = {"SHA-256", "SHA-384", "SHA-512"};

    public StandardSecurityHandler() {
    }

    /* renamed from: A */
    public static byte[] m32501A(byte[] bArr) {
        if (bArr.length <= 127) {
            return bArr;
        }
        byte[] bArr2 = new byte[127];
        System.arraycopy(bArr, 0, bArr2, 0, 127);
        return bArr2;
    }

    /* renamed from: n */
    public static byte[] m32495n(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4;
        try {
            byte[] digest = AbstractC20627js0.m29035c().digest(bArr);
            byte[] bArr5 = null;
            int i = 0;
            while (true) {
                if (i >= 64 && (bArr5[bArr5.length - 1] & 255) <= i - 32) {
                    break;
                }
                if (bArr3 != null && bArr3.length >= 48) {
                    bArr4 = new byte[(bArr2.length + digest.length + 48) * 64];
                } else {
                    bArr4 = new byte[(bArr2.length + digest.length) * 64];
                }
                int i2 = 0;
                for (int i3 = 0; i3 < 64; i3++) {
                    System.arraycopy(bArr2, 0, bArr4, i2, bArr2.length);
                    int length = i2 + bArr2.length;
                    System.arraycopy(digest, 0, bArr4, length, digest.length);
                    i2 = length + digest.length;
                    if (bArr3 != null && bArr3.length >= 48) {
                        System.arraycopy(bArr3, 0, bArr4, i2, 48);
                        i2 += 48;
                    }
                }
                byte[] bArr6 = new byte[16];
                byte[] bArr7 = new byte[16];
                System.arraycopy(digest, 0, bArr6, 0, 16);
                System.arraycopy(digest, 16, bArr7, 0, 16);
                Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
                cipher.init(1, new SecretKeySpec(bArr6, "AES"), new IvParameterSpec(bArr7));
                byte[] doFinal = cipher.doFinal(bArr4);
                byte[] bArr8 = new byte[16];
                System.arraycopy(doFinal, 0, bArr8, 0, 16);
                i++;
                bArr5 = doFinal;
                digest = MessageDigest.getInstance(f60330l[new BigInteger(1, bArr8).mod(new BigInteger(ExifInterface.GPS_MEASUREMENT_3D)).intValue()]).digest(doFinal);
            }
            if (digest.length > 32) {
                byte[] bArr9 = new byte[32];
                System.arraycopy(digest, 0, bArr9, 0, 32);
                return bArr9;
            }
            return digest;
        } catch (GeneralSecurityException e) {
            m32486w();
            throw new IOException(e);
        }
    }

    /* renamed from: q */
    public static byte[] m32492q(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        MessageDigest m29035c = AbstractC20627js0.m29035c();
        m29035c.update(bArr);
        m29035c.update(bArr2);
        if (bArr3 == null) {
            return m29035c.digest();
        }
        return m29035c.digest(bArr3);
    }

    /* renamed from: r */
    public static byte[] m32491r(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* renamed from: s */
    public static byte[] m32490s(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, bArr.length + bArr2.length, bArr3.length);
        return bArr4;
    }

    /* renamed from: w */
    public static void m32486w() {
        try {
            if (Cipher.getMaxAllowedKeyLength("AES") != Integer.MAX_VALUE) {
                Log.w("PdfBox-Android", "JCE unlimited strength jurisdiction policy files are not installed");
            }
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    /* renamed from: B */
    public final byte[] m32500B(byte[] bArr) {
        byte[] bArr2 = f60329k;
        int length = bArr2.length;
        byte[] bArr3 = new byte[length];
        int min = Math.min(bArr.length, length);
        System.arraycopy(bArr, 0, bArr3, 0, min);
        System.arraycopy(bArr2, 0, bArr3, min, bArr2.length - min);
        return bArr3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[Catch: GeneralSecurityException -> 0x003c, TryCatch #0 {GeneralSecurityException -> 0x003c, blocks: (B:3:0x0004, B:7:0x002d, B:9:0x0033, B:15:0x0043, B:17:0x0060, B:19:0x009b, B:24:0x00a9, B:22:0x00a3, B:14:0x003e), top: B:28:0x0004 }] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m32499C(com.tom_roush.pdfbox.pdmodel.encryption.PDEncryption r9, int r10, boolean r11) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "%08X"
            java.lang.String r3 = "AES/ECB/NoPadding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: java.security.GeneralSecurityException -> L3c
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.GeneralSecurityException -> L3c
            byte[] r5 = r8.getEncryptionKey()     // Catch: java.security.GeneralSecurityException -> L3c
            java.lang.String r6 = "AES"
            r4.<init>(r5, r6)     // Catch: java.security.GeneralSecurityException -> L3c
            r5 = 2
            r3.init(r5, r4)     // Catch: java.security.GeneralSecurityException -> L3c
            byte[] r9 = r9.getPerms()     // Catch: java.security.GeneralSecurityException -> L3c
            byte[] r9 = r3.doFinal(r9)     // Catch: java.security.GeneralSecurityException -> L3c
            r3 = 9
            r3 = r9[r3]     // Catch: java.security.GeneralSecurityException -> L3c
            r4 = 97
            java.lang.String r6 = "PdfBox-Android"
            if (r3 != r4) goto L3e
            r3 = 10
            r3 = r9[r3]     // Catch: java.security.GeneralSecurityException -> L3c
            r4 = 100
            if (r3 != r4) goto L3e
            r3 = 11
            r3 = r9[r3]     // Catch: java.security.GeneralSecurityException -> L3c
            r4 = 98
            if (r3 == r4) goto L43
            goto L3e
        L3c:
            r9 = move-exception
            goto Laf
        L3e:
            java.lang.String r3 = "Verification of permissions failed (constant)"
            android.util.Log.w(r6, r3)     // Catch: java.security.GeneralSecurityException -> L3c
        L43:
            r3 = r9[r1]     // Catch: java.security.GeneralSecurityException -> L3c
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = r9[r0]     // Catch: java.security.GeneralSecurityException -> L3c
            r4 = r4 & 255(0xff, float:3.57E-43)
            r7 = 8
            int r4 = r4 << r7
            r3 = r3 | r4
            r4 = r9[r5]     // Catch: java.security.GeneralSecurityException -> L3c
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r3 = r3 | r4
            r4 = 3
            r4 = r9[r4]     // Catch: java.security.GeneralSecurityException -> L3c
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 24
            r3 = r3 | r4
            if (r3 == r10) goto L99
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.security.GeneralSecurityException -> L3c
            r4.<init>()     // Catch: java.security.GeneralSecurityException -> L3c
            java.lang.String r5 = "Verification of permissions failed ("
            r4.append(r5)     // Catch: java.security.GeneralSecurityException -> L3c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.security.GeneralSecurityException -> L3c
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.security.GeneralSecurityException -> L3c
            r5[r1] = r3     // Catch: java.security.GeneralSecurityException -> L3c
            java.lang.String r3 = java.lang.String.format(r2, r5)     // Catch: java.security.GeneralSecurityException -> L3c
            r4.append(r3)     // Catch: java.security.GeneralSecurityException -> L3c
            java.lang.String r3 = " != "
            r4.append(r3)     // Catch: java.security.GeneralSecurityException -> L3c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.security.GeneralSecurityException -> L3c
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.security.GeneralSecurityException -> L3c
            r0[r1] = r10     // Catch: java.security.GeneralSecurityException -> L3c
            java.lang.String r10 = java.lang.String.format(r2, r0)     // Catch: java.security.GeneralSecurityException -> L3c
            r4.append(r10)     // Catch: java.security.GeneralSecurityException -> L3c
            java.lang.String r10 = ")"
            r4.append(r10)     // Catch: java.security.GeneralSecurityException -> L3c
            java.lang.String r10 = r4.toString()     // Catch: java.security.GeneralSecurityException -> L3c
            android.util.Log.w(r6, r10)     // Catch: java.security.GeneralSecurityException -> L3c
        L99:
            if (r11 == 0) goto La1
            r10 = r9[r7]     // Catch: java.security.GeneralSecurityException -> L3c
            r0 = 84
            if (r10 != r0) goto La9
        La1:
            if (r11 != 0) goto Lae
            r9 = r9[r7]     // Catch: java.security.GeneralSecurityException -> L3c
            r10 = 70
            if (r9 == r10) goto Lae
        La9:
            java.lang.String r9 = "Verification of permissions failed (EncryptMetadata)"
            android.util.Log.w(r6, r9)     // Catch: java.security.GeneralSecurityException -> L3c
        Lae:
            return
        Laf:
            m32486w()
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.encryption.StandardSecurityHandler.m32499C(com.tom_roush.pdfbox.pdmodel.encryption.PDEncryption, int, boolean):void");
    }

    public byte[] computeEncryptedKey(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i, byte[] bArr6, int i2, int i3, boolean z, boolean z2) throws IOException {
        if (i2 != 6 && i2 != 5) {
            return m32498k(bArr, bArr2, i, bArr6, z, i3, i2);
        }
        return m32497l(bArr, z2, bArr2, bArr3, bArr4, bArr5, i2);
    }

    public byte[] computeOwnerPassword(byte[] bArr, byte[] bArr2, int i, int i2) throws IOException {
        if (i == 2 && i2 != 5) {
            throw new IOException("Expected length=5 actual=" + i2);
        }
        byte[] m32494o = m32494o(bArr, i, i2);
        byte[] m32500B = m32500B(bArr2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encryptDataRC4(m32494o, new ByteArrayInputStream(m32500B), byteArrayOutputStream);
        if (i == 3 || i == 4) {
            int length = m32494o.length;
            byte[] bArr3 = new byte[length];
            for (int i3 = 1; i3 < 20; i3++) {
                System.arraycopy(m32494o, 0, bArr3, 0, m32494o.length);
                for (int i4 = 0; i4 < length; i4++) {
                    bArr3[i4] = (byte) (bArr3[i4] ^ ((byte) i3));
                }
                InputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.reset();
                encryptDataRC4(bArr3, byteArrayInputStream, byteArrayOutputStream);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] computeUserPassword(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, int i3, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] computeEncryptedKey = computeEncryptedKey(bArr, bArr2, null, null, null, i, bArr3, i2, i3, z, true);
        if (i2 == 2) {
            encryptDataRC4(computeEncryptedKey, f60329k, byteArrayOutputStream);
        } else if (i2 == 3 || i2 == 4) {
            MessageDigest m29037a = AbstractC20627js0.m29037a();
            m29037a.update(f60329k);
            m29037a.update(bArr3);
            byteArrayOutputStream.write(m29037a.digest());
            int length = computeEncryptedKey.length;
            byte[] bArr4 = new byte[length];
            for (int i4 = 0; i4 < 20; i4++) {
                System.arraycopy(computeEncryptedKey, 0, bArr4, 0, length);
                for (int i5 = 0; i5 < length; i5++) {
                    bArr4[i5] = (byte) (bArr4[i5] ^ i4);
                }
                InputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                byteArrayOutputStream.reset();
                encryptDataRC4(bArr4, byteArrayInputStream, byteArrayOutputStream);
            }
            byte[] bArr5 = new byte[32];
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr5, 0, 16);
            System.arraycopy(f60329k, 0, bArr5, 16, 16);
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(bArr5);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] getUserPassword(byte[] bArr, byte[] bArr2, int i, int i2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] m32494o = m32494o(bArr, i, i2);
        if (i == 2) {
            encryptDataRC4(m32494o, bArr2, byteArrayOutputStream);
        } else if (i == 3 || i == 4) {
            int length = m32494o.length;
            byte[] bArr3 = new byte[length];
            byte[] bArr4 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
            for (int i3 = 19; i3 >= 0; i3--) {
                System.arraycopy(m32494o, 0, bArr3, 0, m32494o.length);
                for (int i4 = 0; i4 < length; i4++) {
                    bArr3[i4] = (byte) (bArr3[i4] ^ ((byte) i3));
                }
                byteArrayOutputStream.reset();
                encryptDataRC4(bArr3, bArr4, byteArrayOutputStream);
                bArr4 = byteArrayOutputStream.toByteArray();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public boolean isOwnerPassword(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, int i2, int i3, boolean z) throws IOException {
        byte[] m32496m;
        if (i2 != 6 && i2 != 5) {
            return isUserPassword(getUserPassword(bArr, bArr3, i2, i3), bArr2, bArr3, i, bArr4, i2, i3, z);
        }
        byte[] m32501A = m32501A(bArr);
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[8];
        if (bArr3.length >= 40) {
            System.arraycopy(bArr3, 0, bArr5, 0, 32);
            System.arraycopy(bArr3, 32, bArr6, 0, 8);
            if (i2 == 5) {
                m32496m = m32492q(m32501A, bArr6, bArr2);
            } else {
                m32496m = m32496m(m32501A, bArr6, bArr2);
            }
            return Arrays.equals(m32496m, bArr5);
        }
        throw new IOException("Owner password is too short");
    }

    public boolean isUserPassword(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, int i2, int i3, boolean z) throws IOException {
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            return m32488u(bArr, bArr2, bArr3, i, bArr4, i2, i3, z);
        }
        if (i2 != 5 && i2 != 6) {
            throw new IOException("Unknown Encryption Revision " + i2);
        }
        return m32487v(bArr, bArr2, i2);
    }

    /* renamed from: k */
    public final byte[] m32498k(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, boolean z, int i2, int i3) {
        byte[] m32500B = m32500B(bArr);
        MessageDigest m29037a = AbstractC20627js0.m29037a();
        m29037a.update(m32500B);
        m29037a.update(bArr2);
        m29037a.update((byte) i);
        m29037a.update((byte) (i >>> 8));
        m29037a.update((byte) (i >>> 16));
        m29037a.update((byte) (i >>> 24));
        m29037a.update(bArr3);
        if (i3 == 4 && !z) {
            m29037a.update(new byte[]{-1, -1, -1, -1});
        }
        byte[] digest = m29037a.digest();
        if (i3 == 3 || i3 == 4) {
            for (int i4 = 0; i4 < 50; i4++) {
                m29037a.update(digest, 0, i2);
                digest = m29037a.digest();
            }
        }
        byte[] bArr4 = new byte[i2];
        System.arraycopy(digest, 0, bArr4, 0, i2);
        return bArr4;
    }

    /* renamed from: l */
    public final byte[] m32497l(byte[] bArr, boolean z, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i) {
        byte[] m32496m;
        if (z) {
            if (bArr4 != null) {
                byte[] bArr6 = new byte[8];
                System.arraycopy(bArr2, 40, bArr6, 0, 8);
                if (i == 5) {
                    m32496m = m32492q(bArr, bArr6, bArr3);
                } else {
                    m32496m = m32496m(bArr, bArr6, bArr3);
                }
            } else {
                throw new IOException("/Encrypt/OE entry is missing");
            }
        } else if (bArr5 != null) {
            byte[] bArr7 = new byte[8];
            System.arraycopy(bArr3, 40, bArr7, 0, 8);
            if (i == 5) {
                m32496m = m32492q(bArr, bArr7, null);
            } else {
                m32496m = m32496m(bArr, bArr7, null);
            }
            bArr4 = bArr5;
        } else {
            throw new IOException("/Encrypt/UE entry is missing");
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            cipher.init(2, new SecretKeySpec(m32496m, "AES"), new IvParameterSpec(new byte[16]));
            return cipher.doFinal(bArr4);
        } catch (GeneralSecurityException e) {
            m32486w();
            throw new IOException(e);
        }
    }

    /* renamed from: m */
    public final byte[] m32496m(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 == null) {
            bArr3 = new byte[0];
        } else if (bArr3.length >= 48) {
            if (bArr3.length > 48) {
                byte[] bArr4 = new byte[48];
                System.arraycopy(bArr3, 0, bArr4, 0, 48);
                bArr3 = bArr4;
            }
        } else {
            throw new IOException("Bad U length");
        }
        byte[] m32501A = m32501A(bArr);
        return m32495n(m32490s(m32501A, bArr2, bArr3), m32501A, bArr3);
    }

    /* renamed from: o */
    public final byte[] m32494o(byte[] bArr, int i, int i2) {
        MessageDigest m29037a = AbstractC20627js0.m29037a();
        byte[] digest = m29037a.digest(m32500B(bArr));
        if (i == 3 || i == 4) {
            for (int i3 = 0; i3 < 50; i3++) {
                m29037a.update(digest, 0, i2);
                digest = m29037a.digest();
            }
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(digest, 0, bArr2, 0, i2);
        return bArr2;
    }

    /* renamed from: p */
    public final int m32493p(int i) {
        AccessPermission permissions = ((StandardProtectionPolicy) getProtectionPolicy()).getPermissions();
        if (i < 2 && !permissions.hasAnyRevision3PermissionSet()) {
            return 2;
        }
        if (i == 5) {
            return 6;
        }
        if (i == 4) {
            return 4;
        }
        if (i != 2 && i != 3 && !permissions.hasAnyRevision3PermissionSet()) {
            return 4;
        }
        return 3;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.encryption.SecurityHandler
    public void prepareDocumentForEncryption(PDDocument pDDocument) throws IOException {
        PDEncryption encryption = pDDocument.getEncryption();
        if (encryption == null) {
            encryption = new PDEncryption();
        }
        int computeVersionNumber = computeVersionNumber();
        int m32493p = m32493p(computeVersionNumber);
        encryption.setFilter("Standard");
        encryption.setVersion(computeVersionNumber);
        if (computeVersionNumber != 4 && computeVersionNumber != 5) {
            encryption.removeV45filters();
        }
        encryption.setRevision(m32493p);
        encryption.setLength(getKeyLength());
        StandardProtectionPolicy standardProtectionPolicy = (StandardProtectionPolicy) getProtectionPolicy();
        String ownerPassword = standardProtectionPolicy.getOwnerPassword();
        String userPassword = standardProtectionPolicy.getUserPassword();
        if (ownerPassword == null) {
            ownerPassword = "";
        }
        if (userPassword == null) {
            userPassword = "";
        }
        if (ownerPassword.isEmpty()) {
            ownerPassword = userPassword;
        }
        int permissionBytes = standardProtectionPolicy.getPermissions().getPermissionBytes();
        encryption.setPermissions(permissionBytes);
        int keyLength = getKeyLength() / 8;
        if (m32493p == 6) {
            m32483z(AbstractC20863lD1.m26540m(ownerPassword), AbstractC20863lD1.m26540m(userPassword), encryption, permissionBytes);
        } else {
            m32484y(ownerPassword, userPassword, encryption, permissionBytes, pDDocument, m32493p, keyLength);
        }
        pDDocument.setEncryptionDictionary(encryption);
        pDDocument.getDocument().setEncryptionDictionary(encryption.getCOSObject());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    @Override // com.tom_roush.pdfbox.pdmodel.encryption.SecurityHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void prepareForDecryption(com.tom_roush.pdfbox.pdmodel.encryption.PDEncryption r23, com.tom_roush.pdfbox.cos.COSArray r24, com.tom_roush.pdfbox.pdmodel.encryption.DecryptionMaterial r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.encryption.StandardSecurityHandler.prepareForDecryption(com.tom_roush.pdfbox.pdmodel.encryption.PDEncryption, com.tom_roush.pdfbox.cos.COSArray, com.tom_roush.pdfbox.pdmodel.encryption.DecryptionMaterial):void");
    }

    /* renamed from: t */
    public final byte[] m32489t(COSArray cOSArray) {
        if (cOSArray != null && cOSArray.size() >= 1) {
            return ((COSString) cOSArray.getObject(0)).getBytes();
        }
        return new byte[0];
    }

    /* renamed from: u */
    public final boolean m32488u(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, int i2, int i3, boolean z) {
        byte[] computeUserPassword = computeUserPassword(bArr, bArr3, i, bArr4, i2, i3, z);
        if (i2 == 2) {
            return Arrays.equals(bArr2, computeUserPassword);
        }
        return Arrays.equals(Arrays.copyOf(bArr2, 16), Arrays.copyOf(computeUserPassword, 16));
    }

    /* renamed from: v */
    public final boolean m32487v(byte[] bArr, byte[] bArr2, int i) {
        byte[] m32496m;
        byte[] m32501A = m32501A(bArr);
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[8];
        System.arraycopy(bArr2, 0, bArr3, 0, 32);
        System.arraycopy(bArr2, 32, bArr4, 0, 8);
        if (i == 5) {
            m32496m = m32492q(m32501A, bArr4, null);
        } else {
            m32496m = m32496m(m32501A, bArr4, null);
        }
        return Arrays.equals(m32496m, bArr3);
    }

    /* renamed from: x */
    public final void m32485x(PDEncryption pDEncryption, COSName cOSName) {
        PDCryptFilterDictionary pDCryptFilterDictionary = new PDCryptFilterDictionary();
        pDCryptFilterDictionary.setCryptFilterMethod(cOSName);
        pDCryptFilterDictionary.setLength(getKeyLength());
        pDEncryption.setStdCryptFilterDictionary(pDCryptFilterDictionary);
        COSName cOSName2 = COSName.STD_CF;
        pDEncryption.setStreamFilterName(cOSName2);
        pDEncryption.setStringFilterName(cOSName2);
        setAES(true);
    }

    /* renamed from: y */
    public final void m32484y(String str, String str2, PDEncryption pDEncryption, int i, PDDocument pDDocument, int i2, int i3) {
        COSArray documentID = pDDocument.getDocument().getDocumentID();
        if (documentID == null || documentID.size() < 2) {
            MessageDigest m29037a = AbstractC20627js0.m29037a();
            m29037a.update(BigInteger.valueOf(System.currentTimeMillis()).toByteArray());
            Charset charset = Charsets.ISO_8859_1;
            m29037a.update(str.getBytes(charset));
            m29037a.update(str2.getBytes(charset));
            m29037a.update(pDDocument.getDocument().toString().getBytes(charset));
            COSString cOSString = new COSString(m29037a.digest(toString().getBytes(charset)));
            documentID = new COSArray();
            documentID.add((COSBase) cOSString);
            documentID.add((COSBase) cOSString);
            pDDocument.getDocument().setDocumentID(documentID);
        }
        COSString cOSString2 = (COSString) documentID.getObject(0);
        Charset charset2 = Charsets.ISO_8859_1;
        byte[] computeOwnerPassword = computeOwnerPassword(str.getBytes(charset2), str2.getBytes(charset2), i2, i3);
        byte[] computeUserPassword = computeUserPassword(str2.getBytes(charset2), computeOwnerPassword, i, cOSString2.getBytes(), i2, i3, true);
        setEncryptionKey(computeEncryptedKey(str2.getBytes(charset2), computeOwnerPassword, null, null, null, i, cOSString2.getBytes(), i2, i3, true, false));
        pDEncryption.setOwnerKey(computeOwnerPassword);
        pDEncryption.setUserKey(computeUserPassword);
        if (i2 == 4) {
            m32485x(pDEncryption, COSName.AESV2);
        }
    }

    /* renamed from: z */
    public final void m32483z(String str, String str2, PDEncryption pDEncryption, int i) {
        try {
            SecureRandom secureRandom = new SecureRandom();
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            setEncryptionKey(new byte[32]);
            secureRandom.nextBytes(getEncryptionKey());
            Charset charset = Charsets.UTF_8;
            byte[] m32501A = m32501A(str2.getBytes(charset));
            byte[] bArr = new byte[8];
            byte[] bArr2 = new byte[8];
            secureRandom.nextBytes(bArr);
            secureRandom.nextBytes(bArr2);
            byte[] m32490s = m32490s(m32495n(m32491r(m32501A, bArr), m32501A, null), bArr, bArr2);
            cipher.init(1, new SecretKeySpec(m32495n(m32491r(m32501A, bArr2), m32501A, null), "AES"), new IvParameterSpec(new byte[16]));
            byte[] doFinal = cipher.doFinal(getEncryptionKey());
            byte[] m32501A2 = m32501A(str.getBytes(charset));
            byte[] bArr3 = new byte[8];
            byte[] bArr4 = new byte[8];
            secureRandom.nextBytes(bArr3);
            secureRandom.nextBytes(bArr4);
            byte[] m32490s2 = m32490s(m32495n(m32490s(m32501A2, bArr3, m32490s), m32501A2, m32490s), bArr3, bArr4);
            cipher.init(1, new SecretKeySpec(m32495n(m32490s(m32501A2, bArr4, m32490s), m32501A2, m32490s), "AES"), new IvParameterSpec(new byte[16]));
            byte[] doFinal2 = cipher.doFinal(getEncryptionKey());
            pDEncryption.setUserKey(m32490s);
            pDEncryption.setUserEncryptionKey(doFinal);
            pDEncryption.setOwnerKey(m32490s2);
            pDEncryption.setOwnerEncryptionKey(doFinal2);
            m32485x(pDEncryption, COSName.AESV3);
            byte[] bArr5 = new byte[16];
            bArr5[0] = (byte) i;
            bArr5[1] = (byte) (i >>> 8);
            bArr5[2] = (byte) (i >>> 16);
            bArr5[3] = (byte) (i >>> 24);
            bArr5[4] = -1;
            bArr5[5] = -1;
            bArr5[6] = -1;
            bArr5[7] = -1;
            bArr5[8] = 84;
            bArr5[9] = 97;
            bArr5[10] = 100;
            bArr5[11] = 98;
            for (int i2 = 12; i2 <= 15; i2++) {
                bArr5[i2] = (byte) secureRandom.nextInt();
            }
            cipher.init(1, new SecretKeySpec(getEncryptionKey(), "AES"), new IvParameterSpec(new byte[16]));
            pDEncryption.setPerms(cipher.doFinal(bArr5));
        } catch (GeneralSecurityException e) {
            m32486w();
            throw new IOException(e);
        }
    }

    public StandardSecurityHandler(StandardProtectionPolicy standardProtectionPolicy) {
        setProtectionPolicy(standardProtectionPolicy);
        setKeyLength(standardProtectionPolicy.getEncryptionKeyLength());
    }

    public boolean isUserPassword(String str, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, int i3, boolean z) throws IOException {
        if (i2 != 6 && i2 != 5) {
            return isUserPassword(str.getBytes(Charsets.ISO_8859_1), bArr, bArr2, i, bArr3, i2, i3, z);
        }
        return isUserPassword(str.getBytes(Charsets.UTF_8), bArr, bArr2, i, bArr3, i2, i3, z);
    }

    public boolean isOwnerPassword(String str, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, int i3, boolean z) throws IOException {
        return isOwnerPassword(str.getBytes(Charsets.ISO_8859_1), bArr, bArr2, i, bArr3, i2, i3, z);
    }
}
