package com.tom_roush.pdfbox.pdmodel.encryption;

import android.util.Log;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.util.Charsets;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public abstract class SecurityHandler {

    /* renamed from: j */
    public static final byte[] f60312j = {115, 65, 108, 84};

    /* renamed from: b */
    public boolean f60314b;

    /* renamed from: c */
    public SecureRandom f60315c;

    /* renamed from: e */
    public boolean f60317e;
    protected byte[] encryptionKey;

    /* renamed from: h */
    public COSName f60320h;

    /* renamed from: i */
    public COSName f60321i;
    protected short keyLength = 40;

    /* renamed from: a */
    public final C22001rr1 f60313a = new C22001rr1();

    /* renamed from: d */
    public final Set f60316d = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: f */
    public ProtectionPolicy f60318f = null;

    /* renamed from: g */
    public AccessPermission f60319g = null;

    /* renamed from: a */
    public final byte[] m32512a(long j, long j2) {
        byte[] bArr = this.encryptionKey;
        int length = bArr.length;
        int i = length + 5;
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[length] = (byte) (j & 255);
        bArr2[length + 1] = (byte) ((j >> 8) & 255);
        bArr2[length + 2] = (byte) ((j >> 16) & 255);
        bArr2[length + 3] = (byte) (j2 & 255);
        bArr2[length + 4] = (byte) ((j2 >> 8) & 255);
        MessageDigest m29037a = AbstractC20627js0.m29037a();
        m29037a.update(bArr2);
        if (this.f60317e) {
            m29037a.update(f60312j);
        }
        byte[] digest = m29037a.digest();
        int min = Math.min(i, 16);
        byte[] bArr3 = new byte[min];
        System.arraycopy(digest, 0, bArr3, 0, min);
        return bArr3;
    }

    /* renamed from: b */
    public final Cipher m32511b(byte[] bArr, byte[] bArr2, boolean z) {
        int i;
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        cipher.init(i, secretKeySpec, ivParameterSpec);
        return cipher;
    }

    /* renamed from: c */
    public final void m32510c(COSArray cOSArray, long j, long j2) {
        for (int i = 0; i < cOSArray.size(); i++) {
            decrypt(cOSArray.get(i), j, j2);
        }
    }

    public int computeVersionNumber() {
        short s = this.keyLength;
        if (s == 40) {
            return 1;
        }
        if (s == 128 && this.f60318f.isPreferAES()) {
            return 4;
        }
        if (this.keyLength == 256) {
            return 5;
        }
        return 2;
    }

    /* renamed from: d */
    public final void m32509d(COSDictionary cOSDictionary, long j, long j2) {
        boolean z;
        if (cOSDictionary.getItem(COSName.f59763CF) != null) {
            return;
        }
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(COSName.TYPE);
        if (!COSName.SIG.equals(dictionaryObject) && !COSName.DOC_TIME_STAMP.equals(dictionaryObject) && (!(cOSDictionary.getDictionaryObject(COSName.CONTENTS) instanceof COSString) || !(cOSDictionary.getDictionaryObject(COSName.BYTERANGE) instanceof COSArray))) {
            z = false;
        } else {
            z = true;
        }
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            if (!z || !COSName.CONTENTS.equals(entry.getKey())) {
                COSBase value = entry.getValue();
                if ((value instanceof COSString) || (value instanceof COSArray) || (value instanceof COSDictionary)) {
                    decrypt(value, j, j2);
                }
            }
        }
    }

    public void decrypt(COSBase cOSBase, long j, long j2) throws IOException {
        if (cOSBase instanceof COSString) {
            if (this.f60316d.contains(cOSBase)) {
                return;
            }
            this.f60316d.add(cOSBase);
            m32508e((COSString) cOSBase, j, j2);
        } else if (cOSBase instanceof COSStream) {
            if (this.f60316d.contains(cOSBase)) {
                return;
            }
            this.f60316d.add(cOSBase);
            decryptStream((COSStream) cOSBase, j, j2);
        } else if (cOSBase instanceof COSDictionary) {
            m32509d((COSDictionary) cOSBase, j, j2);
        } else if (cOSBase instanceof COSArray) {
            m32510c((COSArray) cOSBase, j, j2);
        }
    }

    public void decryptStream(COSStream cOSStream, long j, long j2) throws IOException {
        if (COSName.IDENTITY.equals(this.f60320h)) {
            return;
        }
        COSName cOSName = cOSStream.getCOSName(COSName.TYPE);
        if ((!this.f60314b && COSName.METADATA.equals(cOSName)) || COSName.XREF.equals(cOSName)) {
            return;
        }
        if (COSName.METADATA.equals(cOSName)) {
            InputStream createRawInputStream = cOSStream.createRawInputStream();
            byte[] bArr = new byte[10];
            IOUtils.populateBuffer(createRawInputStream, bArr);
            createRawInputStream.close();
            if (Arrays.equals(bArr, "<?xpacket ".getBytes(Charsets.ISO_8859_1))) {
                Log.w("PdfBox-Android", "Metadata is not encrypted, but was expected to be");
                Log.w("PdfBox-Android", "Read PDF specification about EncryptMetadata (default value: true)");
                return;
            }
        }
        m32509d(cOSStream, j, j2);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(IOUtils.toByteArray(cOSStream.createRawInputStream()));
        OutputStream createRawOutputStream = cOSStream.createRawOutputStream();
        try {
            try {
                m32507f(j, j2, byteArrayInputStream, createRawOutputStream, true);
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(e.getClass().getSimpleName());
                sb.append(" thrown when decrypting object ");
                sb.append(j);
                sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                sb.append(j2);
                sb.append(" obj");
                throw e;
            }
        } finally {
            createRawOutputStream.close();
        }
    }

    /* renamed from: e */
    public final void m32508e(COSString cOSString, long j, long j2) {
        if (COSName.IDENTITY.equals(this.f60321i)) {
            return;
        }
        InputStream byteArrayInputStream = new ByteArrayInputStream(cOSString.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m32507f(j, j2, byteArrayInputStream, byteArrayOutputStream, true);
            cOSString.setValue(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to decrypt COSString of length ");
            sb.append(cOSString.getBytes().length);
            sb.append(" in object ");
            sb.append(j);
            sb.append(": ");
            sb.append(e.getMessage());
        }
    }

    public void encryptDataRC4(byte[] bArr, InputStream inputStream, OutputStream outputStream) throws IOException {
        this.f60313a.m23259b(bArr);
        this.f60313a.m23256e(inputStream, outputStream);
    }

    public void encryptStream(COSStream cOSStream, long j, int i) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(IOUtils.toByteArray(cOSStream.createRawInputStream()));
        OutputStream createRawOutputStream = cOSStream.createRawOutputStream();
        try {
            m32507f(j, i, byteArrayInputStream, createRawOutputStream, false);
        } finally {
            createRawOutputStream.close();
        }
    }

    public void encryptString(COSString cOSString, long j, int i) throws IOException {
        InputStream byteArrayInputStream = new ByteArrayInputStream(cOSString.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m32507f(j, i, byteArrayInputStream, byteArrayOutputStream, false);
        cOSString.setValue(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: f */
    public final void m32507f(long j, long j2, InputStream inputStream, OutputStream outputStream, boolean z) {
        if (this.f60317e && this.encryptionKey.length == 32) {
            m32506g(inputStream, outputStream, z);
        } else {
            byte[] m32512a = m32512a(j, j2);
            if (this.f60317e) {
                m32505h(m32512a, inputStream, outputStream, z);
            } else {
                encryptDataRC4(m32512a, inputStream, outputStream);
            }
        }
        outputStream.flush();
    }

    /* renamed from: g */
    public final void m32506g(InputStream inputStream, OutputStream outputStream, boolean z) {
        byte[] bArr = new byte[16];
        if (!m32503j(z, bArr, inputStream, outputStream)) {
            return;
        }
        try {
            CipherInputStream cipherInputStream = new CipherInputStream(inputStream, m32511b(this.encryptionKey, bArr, z));
            try {
                try {
                    IOUtils.copy(cipherInputStream, outputStream);
                } catch (IOException e) {
                    if (!(e.getCause() instanceof GeneralSecurityException)) {
                        throw e;
                    }
                }
            } finally {
                cipherInputStream.close();
            }
        } catch (GeneralSecurityException e2) {
            throw new IOException(e2);
        }
    }

    public AccessPermission getCurrentAccessPermission() {
        return this.f60319g;
    }

    public byte[] getEncryptionKey() {
        return this.encryptionKey;
    }

    public int getKeyLength() {
        return this.keyLength;
    }

    public ProtectionPolicy getProtectionPolicy() {
        return this.f60318f;
    }

    /* renamed from: h */
    public final void m32505h(byte[] bArr, InputStream inputStream, OutputStream outputStream, boolean z) {
        byte[] bArr2 = new byte[16];
        if (!m32503j(z, bArr2, inputStream, outputStream)) {
            return;
        }
        try {
            Cipher m32511b = m32511b(bArr, bArr2, z);
            byte[] bArr3 = new byte[256];
            while (true) {
                int read = inputStream.read(bArr3);
                if (read != -1) {
                    byte[] update = m32511b.update(bArr3, 0, read);
                    if (update != null) {
                        outputStream.write(update);
                    }
                } else {
                    outputStream.write(m32511b.doFinal());
                    return;
                }
            }
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }

    public boolean hasProtectionPolicy() {
        if (this.f60318f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final SecureRandom m32504i() {
        SecureRandom secureRandom = this.f60315c;
        if (secureRandom != null) {
            return secureRandom;
        }
        return new SecureRandom();
    }

    public boolean isAES() {
        return this.f60317e;
    }

    public boolean isDecryptMetadata() {
        return this.f60314b;
    }

    /* renamed from: j */
    public final boolean m32503j(boolean z, byte[] bArr, InputStream inputStream, OutputStream outputStream) {
        if (z) {
            int populateBuffer = (int) IOUtils.populateBuffer(inputStream, bArr);
            if (populateBuffer == 0) {
                return false;
            }
            if (populateBuffer != bArr.length) {
                throw new IOException("AES initialization vector not fully read: only " + populateBuffer + " bytes read instead of " + bArr.length);
            }
            return true;
        }
        m32504i().nextBytes(bArr);
        outputStream.write(bArr);
        return true;
    }

    public abstract void prepareDocumentForEncryption(PDDocument pDDocument) throws IOException;

    public abstract void prepareForDecryption(PDEncryption pDEncryption, COSArray cOSArray, DecryptionMaterial decryptionMaterial) throws IOException;

    public void setAES(boolean z) {
        this.f60317e = z;
    }

    public void setCurrentAccessPermission(AccessPermission accessPermission) {
        this.f60319g = accessPermission;
    }

    public void setCustomSecureRandom(SecureRandom secureRandom) {
        this.f60315c = secureRandom;
    }

    public void setDecryptMetadata(boolean z) {
        this.f60314b = z;
    }

    public void setEncryptionKey(byte[] bArr) {
        this.encryptionKey = bArr;
    }

    public void setKeyLength(int i) {
        this.keyLength = (short) i;
    }

    public void setProtectionPolicy(ProtectionPolicy protectionPolicy) {
        this.f60318f = protectionPolicy;
    }

    public void setStreamFilterName(COSName cOSName) {
        this.f60320h = cOSName;
    }

    public void setStringFilterName(COSName cOSName) {
        this.f60321i = cOSName;
    }

    public void encryptDataRC4(byte[] bArr, byte[] bArr2, OutputStream outputStream) throws IOException {
        this.f60313a.m23259b(bArr);
        this.f60313a.m23254g(bArr2, outputStream);
    }
}
