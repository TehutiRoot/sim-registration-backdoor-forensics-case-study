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
    public final Context f33886a;

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
        public final CryptoObject f33887a;

        public AuthenticationResult(CryptoObject cryptoObject) {
            this.f33887a = cryptoObject;
        }

        public CryptoObject getCryptoObject() {
            return this.f33887a;
        }
    }

    /* renamed from: androidx.core.hardware.fingerprint.FingerprintManagerCompat$a */
    /* loaded from: classes2.dex */
    public class C4009a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a */
        public final /* synthetic */ AuthenticationCallback f33891a;

        public C4009a(AuthenticationCallback authenticationCallback) {
            this.f33891a = authenticationCallback;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.f33891a.onAuthenticationError(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f33891a.onAuthenticationFailed();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.f33891a.onAuthenticationHelp(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f33891a.onAuthenticationSucceeded(new AuthenticationResult(FingerprintManagerCompat.m57294b(C4010b.m57290b(authenticationResult))));
        }
    }

    /* renamed from: androidx.core.hardware.fingerprint.FingerprintManagerCompat$b */
    /* loaded from: classes2.dex */
    public static class C4010b {
        @RequiresPermission("android.permission.USE_FINGERPRINT")
        @DoNotInline
        /* renamed from: a */
        public static void m57291a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @DoNotInline
        /* renamed from: b */
        public static FingerprintManager.CryptoObject m57290b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @DoNotInline
        /* renamed from: c */
        public static FingerprintManager m57289c(Context context) {
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
        public static boolean m57288d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @RequiresPermission("android.permission.USE_FINGERPRINT")
        @DoNotInline
        /* renamed from: e */
        public static boolean m57287e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @DoNotInline
        /* renamed from: f */
        public static CryptoObject m57286f(Object obj) {
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
        public static FingerprintManager.CryptoObject m57285g(CryptoObject cryptoObject) {
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
        this.f33886a = context;
    }

    /* renamed from: a */
    public static FingerprintManager m57295a(Context context) {
        return C4010b.m57289c(context);
    }

    /* renamed from: b */
    public static CryptoObject m57294b(FingerprintManager.CryptoObject cryptoObject) {
        return C4010b.m57286f(cryptoObject);
    }

    /* renamed from: c */
    public static FingerprintManager.AuthenticationCallback m57293c(AuthenticationCallback authenticationCallback) {
        return new C4009a(authenticationCallback);
    }

    /* renamed from: d */
    public static FingerprintManager.CryptoObject m57292d(CryptoObject cryptoObject) {
        return C4010b.m57285g(cryptoObject);
    }

    @NonNull
    public static FingerprintManagerCompat from(@NonNull Context context) {
        return new FingerprintManagerCompat(context);
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public void authenticate(@Nullable CryptoObject cryptoObject, int i, @Nullable androidx.core.p005os.CancellationSignal cancellationSignal, @NonNull AuthenticationCallback authenticationCallback, @Nullable Handler handler) {
        FingerprintManager m57295a;
        CancellationSignal cancellationSignal2;
        if (Build.VERSION.SDK_INT >= 23 && (m57295a = m57295a(this.f33886a)) != null) {
            if (cancellationSignal != null) {
                cancellationSignal2 = (CancellationSignal) cancellationSignal.getCancellationSignalObject();
            } else {
                cancellationSignal2 = null;
            }
            C4010b.m57291a(m57295a, m57292d(cryptoObject), cancellationSignal2, i, m57293c(authenticationCallback), handler);
        }
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public boolean hasEnrolledFingerprints() {
        FingerprintManager m57295a;
        if (Build.VERSION.SDK_INT < 23 || (m57295a = m57295a(this.f33886a)) == null || !C4010b.m57288d(m57295a)) {
            return false;
        }
        return true;
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public boolean isHardwareDetected() {
        FingerprintManager m57295a;
        if (Build.VERSION.SDK_INT < 23 || (m57295a = m57295a(this.f33886a)) == null || !C4010b.m57287e(m57295a)) {
            return false;
        }
        return true;
    }

    /* loaded from: classes2.dex */
    public static class CryptoObject {

        /* renamed from: a */
        public final Signature f33888a;

        /* renamed from: b */
        public final Cipher f33889b;

        /* renamed from: c */
        public final Mac f33890c;

        public CryptoObject(@NonNull Signature signature) {
            this.f33888a = signature;
            this.f33889b = null;
            this.f33890c = null;
        }

        @Nullable
        public Cipher getCipher() {
            return this.f33889b;
        }

        @Nullable
        public Mac getMac() {
            return this.f33890c;
        }

        @Nullable
        public Signature getSignature() {
            return this.f33888a;
        }

        public CryptoObject(@NonNull Cipher cipher) {
            this.f33889b = cipher;
            this.f33888a = null;
            this.f33890c = null;
        }

        public CryptoObject(@NonNull Mac mac) {
            this.f33890c = mac;
            this.f33889b = null;
            this.f33888a = null;
        }
    }
}
