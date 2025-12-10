package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22487uh1 {

    /* renamed from: uh1$a */
    /* loaded from: classes.dex */
    public static class C16840a implements InterfaceC16842c {
        @Override // p000.AbstractC22487uh1.InterfaceC16842c
        /* renamed from: a */
        public List mo1227a(String str, PackageManager packageManager) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            ArrayList arrayList = new ArrayList();
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo.hasMultipleSigners()) {
                for (Signature signature : signingInfo.getApkContentsSigners()) {
                    arrayList.add(AbstractC22487uh1.m1231a(signature));
                }
            } else {
                arrayList.add(AbstractC22487uh1.m1231a(signingInfo.getSigningCertificateHistory()[0]));
            }
            return arrayList;
        }

        @Override // p000.AbstractC22487uh1.InterfaceC16842c
        /* renamed from: b */
        public boolean mo1226b(String str, PackageManager packageManager, C23140yT1 c23140yT1) {
            List mo1227a;
            if (!c23140yT1.m251g().equals(str) || (mo1227a = mo1227a(str, packageManager)) == null) {
                return false;
            }
            if (mo1227a.size() == 1) {
                return packageManager.hasSigningCertificate(str, c23140yT1.m252f(0), 1);
            }
            return c23140yT1.equals(C23140yT1.m255c(str, mo1227a));
        }
    }

    /* renamed from: uh1$b */
    /* loaded from: classes.dex */
    public static class C16841b implements InterfaceC16842c {
        @Override // p000.AbstractC22487uh1.InterfaceC16842c
        /* renamed from: a */
        public List mo1227a(String str, PackageManager packageManager) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                byte[] m1231a = AbstractC22487uh1.m1231a(signature);
                if (m1231a == null) {
                    return null;
                }
                arrayList.add(m1231a);
            }
            return arrayList;
        }

        @Override // p000.AbstractC22487uh1.InterfaceC16842c
        /* renamed from: b */
        public boolean mo1226b(String str, PackageManager packageManager, C23140yT1 c23140yT1) {
            List mo1227a;
            if (!str.equals(c23140yT1.m251g()) || (mo1227a = mo1227a(str, packageManager)) == null) {
                return false;
            }
            return c23140yT1.equals(C23140yT1.m255c(str, mo1227a));
        }
    }

    /* renamed from: uh1$c */
    /* loaded from: classes.dex */
    public interface InterfaceC16842c {
        /* renamed from: a */
        List mo1227a(String str, PackageManager packageManager);

        /* renamed from: b */
        boolean mo1226b(String str, PackageManager packageManager, C23140yT1 c23140yT1);
    }

    /* renamed from: a */
    public static byte[] m1231a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static List m1230b(String str, PackageManager packageManager) {
        try {
            return m1229c().mo1227a(str, packageManager);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static InterfaceC16842c m1229c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C16840a();
        }
        return new C16841b();
    }

    /* renamed from: d */
    public static boolean m1228d(String str, PackageManager packageManager, C23140yT1 c23140yT1) {
        try {
            return m1229c().mo1226b(str, packageManager, c23140yT1);
        } catch (PackageManager.NameNotFoundException | IOException unused) {
            return false;
        }
    }
}
