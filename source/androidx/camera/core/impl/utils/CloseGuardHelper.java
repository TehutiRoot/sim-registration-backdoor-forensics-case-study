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
    public final InterfaceC2528b f11273a;

    /* renamed from: androidx.camera.core.impl.utils.CloseGuardHelper$a */
    /* loaded from: classes.dex */
    public static final class C2527a implements InterfaceC2528b {

        /* renamed from: a */
        public final CloseGuard f11274a = new CloseGuard();

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.InterfaceC2528b
        /* renamed from: a */
        public void mo62881a(String str) {
            this.f11274a.open(str);
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.InterfaceC2528b
        /* renamed from: b */
        public void mo62880b() {
            this.f11274a.warnIfOpen();
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.InterfaceC2528b
        public void close() {
            this.f11274a.close();
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.CloseGuardHelper$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2528b {
        /* renamed from: a */
        void mo62881a(String str);

        /* renamed from: b */
        void mo62880b();

        void close();
    }

    /* renamed from: androidx.camera.core.impl.utils.CloseGuardHelper$c */
    /* loaded from: classes.dex */
    public static final class C2529c implements InterfaceC2528b {
        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.InterfaceC2528b
        /* renamed from: a */
        public void mo62881a(String str) {
            Preconditions.checkNotNull(str, "CloseMethodName must not be null.");
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.InterfaceC2528b
        /* renamed from: b */
        public void mo62880b() {
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.InterfaceC2528b
        public void close() {
        }
    }

    public CloseGuardHelper(InterfaceC2528b interfaceC2528b) {
        this.f11273a = interfaceC2528b;
    }

    @NonNull
    public static CloseGuardHelper create() {
        if (Build.VERSION.SDK_INT >= 30) {
            return new CloseGuardHelper(new C2527a());
        }
        return new CloseGuardHelper(new C2529c());
    }

    public void close() {
        this.f11273a.close();
    }

    public void open(@NonNull String str) {
        this.f11273a.mo62881a(str);
    }

    public void warnIfOpen() {
        this.f11273a.mo62880b();
    }
}
