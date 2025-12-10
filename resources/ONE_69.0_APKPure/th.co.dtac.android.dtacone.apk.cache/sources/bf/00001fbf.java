package androidx.camera.core.impl.utils;

import android.os.Build;
import android.util.CloseGuard;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class CloseGuardHelper {

    /* renamed from: a */
    public final InterfaceC2510b f11361a;

    /* renamed from: androidx.camera.core.impl.utils.CloseGuardHelper$a */
    /* loaded from: classes.dex */
    public static final class C2509a implements InterfaceC2510b {

        /* renamed from: a */
        public final CloseGuard f11362a = new CloseGuard();

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.InterfaceC2510b
        /* renamed from: a */
        public void mo62829a(String str) {
            this.f11362a.open(str);
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.InterfaceC2510b
        /* renamed from: b */
        public void mo62828b() {
            this.f11362a.warnIfOpen();
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.InterfaceC2510b
        public void close() {
            this.f11362a.close();
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.CloseGuardHelper$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2510b {
        /* renamed from: a */
        void mo62829a(String str);

        /* renamed from: b */
        void mo62828b();

        void close();
    }

    /* renamed from: androidx.camera.core.impl.utils.CloseGuardHelper$c */
    /* loaded from: classes.dex */
    public static final class C2511c implements InterfaceC2510b {
        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.InterfaceC2510b
        /* renamed from: a */
        public void mo62829a(String str) {
            Preconditions.checkNotNull(str, "CloseMethodName must not be null.");
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.InterfaceC2510b
        /* renamed from: b */
        public void mo62828b() {
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.InterfaceC2510b
        public void close() {
        }
    }

    public CloseGuardHelper(InterfaceC2510b interfaceC2510b) {
        this.f11361a = interfaceC2510b;
    }

    @NonNull
    public static CloseGuardHelper create() {
        if (Build.VERSION.SDK_INT >= 30) {
            return new CloseGuardHelper(new C2509a());
        }
        return new CloseGuardHelper(new C2511c());
    }

    public void close() {
        this.f11361a.close();
    }

    public void open(@NonNull String str) {
        this.f11361a.mo62829a(str);
    }

    public void warnIfOpen() {
        this.f11361a.mo62828b();
    }
}