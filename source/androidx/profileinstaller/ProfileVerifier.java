package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ProfileVerifier {

    /* renamed from: a */
    public static final ResolvableFuture f36528a = ResolvableFuture.create();

    /* renamed from: b */
    public static final Object f36529b = new Object();

    /* renamed from: c */
    public static CompilationStatus f36530c = null;

    /* loaded from: classes2.dex */
    public static class CompilationStatus {
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE = 1;
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE_NON_MATCHING = 3;
        public static final int RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ = 131072;

        /* renamed from: RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE */
        public static final int f36531xf2722a21 = 196608;
        public static final int RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST = 65536;
        public static final int RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION = 262144;
        public static final int RESULT_CODE_NO_PROFILE = 0;
        public static final int RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION = 2;

        /* renamed from: a */
        public final int f36532a;

        /* renamed from: b */
        public final boolean f36533b;

        /* renamed from: c */
        public final boolean f36534c;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* loaded from: classes2.dex */
        public @interface ResultCode {
        }

        public CompilationStatus(int i, boolean z, boolean z2) {
            this.f36532a = i;
            this.f36534c = z2;
            this.f36533b = z;
        }

        public int getProfileInstallResultCode() {
            return this.f36532a;
        }

        public boolean hasProfileEnqueuedForCompilation() {
            return this.f36534c;
        }

        public boolean isCompiledWithProfile() {
            return this.f36533b;
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileVerifier$a */
    /* loaded from: classes2.dex */
    public static class C4865a {
        @DoNotInline
        /* renamed from: a */
        public static PackageInfo m53718a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileVerifier$b */
    /* loaded from: classes2.dex */
    public static class C4866b {

        /* renamed from: a */
        public final int f36535a;

        /* renamed from: b */
        public final int f36536b;

        /* renamed from: c */
        public final long f36537c;

        /* renamed from: d */
        public final long f36538d;

        public C4866b(int i, int i2, long j, long j2) {
            this.f36535a = i;
            this.f36536b = i2;
            this.f36537c = j;
            this.f36538d = j2;
        }

        /* renamed from: a */
        public static C4866b m53717a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                C4866b c4866b = new C4866b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return c4866b;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        /* renamed from: b */
        public void m53716b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f36535a);
                dataOutputStream.writeInt(this.f36536b);
                dataOutputStream.writeLong(this.f36537c);
                dataOutputStream.writeLong(this.f36538d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C4866b)) {
                return false;
            }
            C4866b c4866b = (C4866b) obj;
            if (this.f36536b == c4866b.f36536b && this.f36537c == c4866b.f36537c && this.f36535a == c4866b.f36535a && this.f36538d == c4866b.f36538d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f36536b), Long.valueOf(this.f36537c), Integer.valueOf(this.f36535a), Long.valueOf(this.f36538d));
        }
    }

    /* renamed from: a */
    public static long m53721a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return C4865a.m53718a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: b */
    public static CompilationStatus m53720b(int i, boolean z, boolean z2) {
        CompilationStatus compilationStatus = new CompilationStatus(i, z, z2);
        f36530c = compilationStatus;
        f36528a.set(compilationStatus);
        return f36530c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00cf, code lost:
        r3 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.f36531xf2722a21;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.profileinstaller.ProfileVerifier.CompilationStatus m53719c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.ProfileVerifier.m53719c(android.content.Context, boolean):androidx.profileinstaller.ProfileVerifier$CompilationStatus");
    }

    @NonNull
    public static ListenableFuture<CompilationStatus> getCompilationStatusAsync() {
        return f36528a;
    }

    @NonNull
    @WorkerThread
    public static CompilationStatus writeProfileVerification(@NonNull Context context) {
        return m53719c(context, false);
    }
}
