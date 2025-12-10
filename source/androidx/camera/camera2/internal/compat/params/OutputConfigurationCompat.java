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
    public final InterfaceC2397a f10500a;

    /* renamed from: androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2397a {
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
        InterfaceC2397a interfaceC2397a;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            interfaceC2397a = OutputConfigurationCompatApi33Impl.m63663g(AbstractC17728Hg1.m68057a(obj));
        } else if (i >= 28) {
            interfaceC2397a = C17984Lg1.m67502f(AbstractC17728Hg1.m68057a(obj));
        } else if (i >= 26) {
            interfaceC2397a = C17920Kg1.m67600e(AbstractC17728Hg1.m68057a(obj));
        } else if (i >= 24) {
            interfaceC2397a = C17856Jg1.m67725b(AbstractC17728Hg1.m68057a(obj));
        } else {
            interfaceC2397a = null;
        }
        if (interfaceC2397a == null) {
            return null;
        }
        return new OutputConfigurationCompat(interfaceC2397a);
    }

    public void addSurface(@NonNull Surface surface) {
        this.f10500a.addSurface(surface);
    }

    public void enableSurfaceSharing() {
        this.f10500a.enableSurfaceSharing();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof OutputConfigurationCompat)) {
            return false;
        }
        return this.f10500a.equals(((OutputConfigurationCompat) obj).f10500a);
    }

    public long getDynamicRangeProfile() {
        return this.f10500a.getDynamicRangeProfile();
    }

    public int getMaxSharedSurfaceCount() {
        return this.f10500a.getMaxSharedSurfaceCount();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String getPhysicalCameraId() {
        return this.f10500a.getPhysicalCameraId();
    }

    public long getStreamUseCase() {
        return this.f10500a.getStreamUseCase();
    }

    @Nullable
    public Surface getSurface() {
        return this.f10500a.getSurface();
    }

    public int getSurfaceGroupId() {
        return this.f10500a.getSurfaceGroupId();
    }

    @NonNull
    public List<Surface> getSurfaces() {
        return this.f10500a.getSurfaces();
    }

    public int hashCode() {
        return this.f10500a.hashCode();
    }

    public void removeSurface(@NonNull Surface surface) {
        this.f10500a.removeSurface(surface);
    }

    public void setDynamicRangeProfile(long j) {
        this.f10500a.setDynamicRangeProfile(j);
    }

    public void setPhysicalCameraId(@Nullable String str) {
        this.f10500a.setPhysicalCameraId(str);
    }

    public void setStreamUseCase(long j) {
        this.f10500a.setStreamUseCase(j);
    }

    @Nullable
    public Object unwrap() {
        return this.f10500a.getOutputConfiguration();
    }

    public OutputConfigurationCompat(int i, @NonNull Surface surface) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.f10500a = new OutputConfigurationCompatApi33Impl(i, surface);
        } else if (i2 >= 28) {
            this.f10500a = new C17984Lg1(i, surface);
        } else if (i2 >= 26) {
            this.f10500a = new C17920Kg1(i, surface);
        } else if (i2 >= 24) {
            this.f10500a = new C17856Jg1(i, surface);
        } else {
            this.f10500a = new C2403c(surface);
        }
    }

    @RequiresApi(26)
    public <T> OutputConfigurationCompat(@NonNull Size size, @NonNull Class<T> cls) {
        OutputConfiguration newOutputConfiguration = ApiCompat.Api26Impl.newOutputConfiguration(size, cls);
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f10500a = OutputConfigurationCompatApi33Impl.m63663g(newOutputConfiguration);
        } else if (i >= 28) {
            this.f10500a = C17984Lg1.m67502f(newOutputConfiguration);
        } else {
            this.f10500a = C17920Kg1.m67600e(newOutputConfiguration);
        }
    }

    public OutputConfigurationCompat(InterfaceC2397a interfaceC2397a) {
        this.f10500a = interfaceC2397a;
    }
}
