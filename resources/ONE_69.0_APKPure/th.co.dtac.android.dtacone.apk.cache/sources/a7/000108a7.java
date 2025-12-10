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

/* renamed from: ri1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22038ri1 {

    /* renamed from: ri1$a */
    /* loaded from: classes.dex */
    public static class C13287a implements InterfaceC13289c {
        @Override // p000.AbstractC22038ri1.InterfaceC13289c
        /* renamed from: a */
        public List mo23452a(String str, PackageManager packageManager) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            ArrayList arrayList = new ArrayList();
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo.hasMultipleSigners()) {
                for (Signature signature : signingInfo.getApkContentsSigners()) {
                    arrayList.add(AbstractC22038ri1.m23456a(signature));
                }
            } else {
                arrayList.add(AbstractC22038ri1.m23456a(signingInfo.getSigningCertificateHistory()[0]));
            }
            return arrayList;
        }

        @Override // p000.AbstractC22038ri1.InterfaceC13289c
        /* renamed from: b */
        public boolean mo23451b(String str, PackageManager packageManager, C22694vU1 c22694vU1) {
            List mo23452a;
            if (!c22694vU1.m899g().equals(str) || (mo23452a = mo23452a(str, packageManager)) == null) {
                return false;
            }
            if (mo23452a.size() == 1) {
                return packageManager.hasSigningCertificate(str, c22694vU1.m900f(0), 1);
            }
            return c22694vU1.equals(C22694vU1.m903c(str, mo23452a));
        }
    }

    /* renamed from: ri1$b */
    /* loaded from: classes.dex */
    public static class C13288b implements InterfaceC13289c {
        @Override // p000.AbstractC22038ri1.InterfaceC13289c
        /* renamed from: a */
        public List mo23452a(String str, PackageManager packageManager) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                byte[] m23456a = AbstractC22038ri1.m23456a(signature);
                if (m23456a == null) {
                    return null;
                }
                arrayList.add(m23456a);
            }
            return arrayList;
        }

        @Override // p000.AbstractC22038ri1.InterfaceC13289c
        /* renamed from: b */
        public boolean mo23451b(String str, PackageManager packageManager, C22694vU1 c22694vU1) {
            List mo23452a;
            if (!str.equals(c22694vU1.m899g()) || (mo23452a = mo23452a(str, packageManager)) == null) {
                return false;
            }
            return c22694vU1.equals(C22694vU1.m903c(str, mo23452a));
        }
    }

    /* renamed from: ri1$c */
    /* loaded from: classes.dex */
    public interface InterfaceC13289c {
        /* renamed from: a */
        List mo23452a(String str, PackageManager packageManager);

        /* renamed from: b */
        boolean mo23451b(String str, PackageManager packageManager, C22694vU1 c22694vU1);
    }

    /* renamed from: a */
    public static byte[] m23456a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static List m23455b(String str, PackageManager packageManager) {
        try {
            return m23454c().mo23452a(str, packageManager);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static InterfaceC13289c m23454c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C13287a();
        }
        return new C13288b();
    }

    /* renamed from: d */
    public static boolean m23453d(String str, PackageManager packageManager, C22694vU1 c22694vU1) {
        try {
            return m23454c().mo23451b(str, packageManager, c22694vU1);
        } catch (PackageManager.NameNotFoundException | IOException unused) {
            return false;
        }
    }
}