package p000;

import android.util.Base64;
import android.util.Log;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.security.spec.KeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: qO1  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C21754qO1 {

    /* renamed from: a */
    public KeySpec f76966a;

    /* renamed from: b */
    public SecretKey f76967b;

    /* renamed from: c */
    public IvParameterSpec f76968c;

    public C21754qO1() {
        m23504b("62v01fVsCWHfRcW");
    }

    /* renamed from: a */
    public String m23505a(String str) {
        try {
            Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
            cipher.init(1, this.f76967b, this.f76968c);
            if (str == null) {
                return null;
            }
            return Base64.encodeToString(cipher.doFinal(str.getBytes("UTF8")), 0).replaceAll("\\+", HelpFormatter.DEFAULT_OPT_PREFIX).replaceAll(RemoteSettings.FORWARD_SLASH_STRING, "_");
        } catch (Exception e) {
            Log.getStackTraceString(e);
            return null;
        }
    }

    /* renamed from: b */
    public final void m23504b(String str) {
        try {
            this.f76966a = new DESedeKeySpec(Arrays.copyOf(str.getBytes("utf-8"), 24));
            this.f76967b = SecretKeyFactory.getInstance("DESede").generateSecret(this.f76966a);
            this.f76968c = new IvParameterSpec(new byte[8]);
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
    }
}
