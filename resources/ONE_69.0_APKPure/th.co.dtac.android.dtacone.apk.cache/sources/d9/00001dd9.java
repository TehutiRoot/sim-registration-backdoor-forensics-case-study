package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.ApiCompat;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class OutputConfigurationCompat {
    public static final int STREAM_USE_CASE_NONE = -1;
    public static final int SURFACE_GROUP_ID_NONE = -1;

    /* renamed from: a */
    public final InterfaceC2379a f10588a;

    /* renamed from: androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2379a {
        void addSurface(Surface surface);

        void enableSurfaceSharing();

        long getDynamicRangeProfile();

        int getMaxSharedSurfaceCount();

        Object getOutputConfiguration();

        String getPhysicalCameraId();

        long getStreamUseCase();

        Surface getSurface();

        int getSurfaceGroupId();

        List getSurfaces();

        void removeSurface(Surface surface);

        void setDynamicRangeProfile(long j);

        void setPhysicalCameraId(String str);

        void setStreamUseCase(long j);
    }

    public OutputConfigurationCompat(@NonNull Surface surface) {
        this(-1, surface);
    }

    @Nullable
    public static OutputConfigurationCompat wrap(@Nullable Object obj) {
        InterfaceC2379a interfaceC2379a;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            interfaceC2379a = OutputConfigurationCompatApi33Impl.m63614g(AbstractC17566Eh1.m68594a(obj));
        } else if (i >= 28) {
            interfaceC2379a = C17826Ih1.m67995f(AbstractC17566Eh1.m68594a(obj));
        } else if (i >= 26) {
            interfaceC2379a = C17761Hh1.m68102e(AbstractC17566Eh1.m68594a(obj));
        } else if (i >= 24) {
            interfaceC2379a = C17696Gh1.m68259b(AbstractC17566Eh1.m68594a(obj));
        } else {
            interfaceC2379a = null;
        }
        if (interfaceC2379a == null) {
            return null;
        }
        return new OutputConfigurationCompat(interfaceC2379a);
    }

    public void addSurface(@NonNull Surface surface) {
        this.f10588a.addSurface(surface);
    }

    public void enableSurfaceSharing() {
        this.f10588a.enableSurfaceSharing();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof OutputConfigurationCompat)) {
            return false;
        }
        return this.f10588a.equals(((OutputConfigurationCompat) obj).f10588a);
    }

    public long getDynamicRangeProfile() {
        return this.f10588a.getDynamicRangeProfile();
    }

    public int getMaxSharedSurfaceCount() {
        return this.f10588a.getMaxSharedSurfaceCount();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String getPhysicalCameraId() {
        return this.f10588a.getPhysicalCameraId();
    }

    public long getStreamUseCase() {
        return this.f10588a.getStreamUseCase();
    }

    @Nullable
    public Surface getSurface() {
        return this.f10588a.getSurface();
    }

    public int getSurfaceGroupId() {
        return this.f10588a.getSurfaceGroupId();
    }

    @NonNull
    public List<Surface> getSurfaces() {
        return this.f10588a.getSurfaces();
    }

    public int hashCode() {
        return this.f10588a.hashCode();
    }

    public void removeSurface(@NonNull Surface surface) {
        this.f10588a.removeSurface(surface);
    }

    public void setDynamicRangeProfile(long j) {
        this.f10588a.setDynamicRangeProfile(j);
    }

    public void setPhysicalCameraId(@Nullable String str) {
        this.f10588a.setPhysicalCameraId(str);
    }

    public void setStreamUseCase(long j) {
        this.f10588a.setStreamUseCase(j);
    }

    @Nullable
    public Object unwrap() {
        return this.f10588a.getOutputConfiguration();
    }

    public OutputConfigurationCompat(int i, @NonNull Surface surface) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.f10588a = new OutputConfigurationCompatApi33Impl(i, surface);
        } else if (i2 >= 28) {
            this.f10588a = new C17826Ih1(i, surface);
        } else if (i2 >= 26) {
            this.f10588a = new C17761Hh1(i, surface);
        } else if (i2 >= 24) {
            this.f10588a = new C17696Gh1(i, surface);
        } else {
            this.f10588a = new C2385c(surface);
        }
    }

    @RequiresApi(26)
    public <T> OutputConfigurationCompat(@NonNull Size size, @NonNull Class<T> cls) {
        OutputConfiguration newOutputConfiguration = ApiCompat.Api26Impl.newOutputConfiguration(size, cls);
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f10588a = OutputConfigurationCompatApi33Impl.m63614g(newOutputConfiguration);
        } else if (i >= 28) {
            this.f10588a = C17826Ih1.m67995f(newOutputConfiguration);
        } else {
            this.f10588a = C17761Hh1.m68102e(newOutputConfiguration);
        }
    }

    public OutputConfigurationCompat(InterfaceC2379a interfaceC2379a) {
        this.f10588a = interfaceC2379a;
    }
}