package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
/* loaded from: classes2.dex */
public class FingerprintManagerCompat {

    /* renamed from: a */
    public final Context f33974a;

    /* loaded from: classes2.dex */
    public static abstract class AuthenticationCallback {
        public void onAuthenticationError(int i, CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class AuthenticationResult {

        /* renamed from: a */
        public final CryptoObject f33975a;

        public AuthenticationResult(CryptoObject cryptoObject) {
            this.f33975a = cryptoObject;
        }

        public CryptoObject getCryptoObject() {
            return this.f33975a;
        }
    }

    /* renamed from: androidx.core.hardware.fingerprint.FingerprintManagerCompat$a */
    /* loaded from: classes2.dex */
    public class C3991a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a */
        public final /* synthetic */ AuthenticationCallback f33979a;

        public C3991a(AuthenticationCallback authenticationCallback) {
            this.f33979a = authenticationCallback;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.f33979a.onAuthenticationError(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f33979a.onAuthenticationFailed();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.f33979a.onAuthenticationHelp(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f33979a.onAuthenticationSucceeded(new AuthenticationResult(FingerprintManagerCompat.m57244b(C3992b.m57240b(authenticationResult))));
        }
    }

    /* renamed from: androidx.core.hardware.fingerprint.FingerprintManagerCompat$b */
    /* loaded from: classes2.dex */
    public static class C3992b {
        @RequiresPermission("android.permission.USE_FINGERPRINT")
        @DoNotInline
        /* renamed from: a */
        public static void m57241a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @DoNotInline
        /* renamed from: b */
        public static FingerprintManager.CryptoObject m57240b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @DoNotInline
        /* renamed from: c */
        public static FingerprintManager m57239c(Context context) {
            int i = Build.VERSION.SDK_INT;
            if (i == 23) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            if (i > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        @RequiresPermission("android.permission.USE_FINGERPRINT")
        @DoNotInline
        /* renamed from: d */
        public static boolean m57238d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @RequiresPermission("android.permission.USE_FINGERPRINT")
        @DoNotInline
        /* renamed from: e */
        public static boolean m57237e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @DoNotInline
        /* renamed from: f */
        public static CryptoObject m57236f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() == null) {
                return null;
            }
            return new CryptoObject(cryptoObject.getMac());
        }

        @DoNotInline
        /* renamed from: g */
        public static FingerprintManager.CryptoObject m57235g(CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() == null) {
                return null;
            }
            return new FingerprintManager.CryptoObject(cryptoObject.getMac());
        }
    }

    public FingerprintManagerCompat(Context context) {
        this.f33974a = context;
    }

    /* renamed from: a */
    public static FingerprintManager m57245a(Context context) {
        return C3992b.m57239c(context);
    }

    /* renamed from: b */
    public static CryptoObject m57244b(FingerprintManager.CryptoObject cryptoObject) {
        return C3992b.m57236f(cryptoObject);
    }

    /* renamed from: c */
    public static FingerprintManager.AuthenticationCallback m57243c(AuthenticationCallback authenticationCallback) {
        return new C3991a(authenticationCallback);
    }

    /* renamed from: d */
    public static FingerprintManager.CryptoObject m57242d(CryptoObject cryptoObject) {
        return C3992b.m57235g(cryptoObject);
    }

    @NonNull
    public static FingerprintManagerCompat from(@NonNull Context context) {
        return new FingerprintManagerCompat(context);
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public void authenticate(@Nullable CryptoObject cryptoObject, int i, @Nullable androidx.core.p005os.CancellationSignal cancellationSignal, @NonNull AuthenticationCallback authenticationCallback, @Nullable Handler handler) {
        FingerprintManager m57245a;
        CancellationSignal cancellationSignal2;
        if (Build.VERSION.SDK_INT >= 23 && (m57245a = m57245a(this.f33974a)) != null) {
            if (cancellationSignal != null) {
                cancellationSignal2 = (CancellationSignal) cancellationSignal.getCancellationSignalObject();
            } else {
                cancellationSignal2 = null;
            }
            C3992b.m57241a(m57245a, m57242d(cryptoObject), cancellationSignal2, i, m57243c(authenticationCallback), handler);
        }
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public boolean hasEnrolledFingerprints() {
        FingerprintManager m57245a;
        if (Build.VERSION.SDK_INT < 23 || (m57245a = m57245a(this.f33974a)) == null || !C3992b.m57238d(m57245a)) {
            return false;
        }
        return true;
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public boolean isHardwareDetected() {
        FingerprintManager m57245a;
        if (Build.VERSION.SDK_INT < 23 || (m57245a = m57245a(this.f33974a)) == null || !C3992b.m57237e(m57245a)) {
            return false;
        }
        return true;
    }

    /* loaded from: classes2.dex */
    public static class CryptoObject {

        /* renamed from: a */
        public final Signature f33976a;

        /* renamed from: b */
        public final Cipher f33977b;

        /* renamed from: c */
        public final Mac f33978c;

        public CryptoObject(@NonNull Signature signature) {
            this.f33976a = signature;
            this.f33977b = null;
            this.f33978c = null;
        }

        @Nullable
        public Cipher getCipher() {
            return this.f33977b;
        }

        @Nullable
        public Mac getMac() {
            return this.f33978c;
        }

        @Nullable
        public Signature getSignature() {
            return this.f33976a;
        }

        public CryptoObject(@NonNull Cipher cipher) {
            this.f33977b = cipher;
            this.f33976a = null;
            this.f33978c = null;
        }

        public CryptoObject(@NonNull Mac mac) {
            this.f33978c = mac;
            this.f33977b = null;
            this.f33976a = null;
        }
    }
}