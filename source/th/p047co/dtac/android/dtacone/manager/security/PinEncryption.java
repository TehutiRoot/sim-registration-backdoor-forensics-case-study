package th.p047co.dtac.android.dtacone.manager.security;

import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: th.co.dtac.android.dtacone.manager.security.PinEncryption */
/* loaded from: classes7.dex */
public class PinEncryption {

    /* renamed from: b */
    public static final Charset f84974b = Charset.forName("UTF-8");

    /* renamed from: a */
    public Cipher f84975a = Cipher.getInstance("DESede/CBC/PKCS5Padding");

    /* renamed from: a */
    public final IvParameterSpec m19246a(String str) {
        return new IvParameterSpec(str.getBytes(f84974b));
    }

    /* renamed from: b */
    public final SecretKeySpec m19245b(String str) {
        return new SecretKeySpec(str.getBytes(f84974b), "DESede");
    }

    public String decrypt(byte[] bArr, String str) throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException {
        this.f84975a.init(2, m19245b(str.substring(0, 24)), m19246a(str.substring(24, 32)));
        return new String(this.f84975a.doFinal(bArr), f84974b);
    }

    public byte[] encrypt(String str, String str2) throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException {
        this.f84975a.init(1, m19245b(str2.substring(0, 24)), m19246a(str2.substring(24, 32)));
        return this.f84975a.doFinal(str.getBytes(f84974b));
    }
}
