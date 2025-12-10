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

/* renamed from: nP1  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C21300nP1 {

    /* renamed from: a */
    public KeySpec f72341a;

    /* renamed from: b */
    public SecretKey f72342b;

    /* renamed from: c */
    public IvParameterSpec f72343c;

    public C21300nP1() {
        m26417b("62v01fVsCWHfRcW");
    }

    /* renamed from: a */
    public String m26418a(String str) {
        try {
            Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
            cipher.init(1, this.f72342b, this.f72343c);
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
    public final void m26417b(String str) {
        try {
            this.f72341a = new DESedeKeySpec(Arrays.copyOf(str.getBytes("utf-8"), 24));
            this.f72342b = SecretKeyFactory.getInstance("DESede").generateSecret(this.f72341a);
            this.f72343c = new IvParameterSpec(new byte[8]);
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
    }
}