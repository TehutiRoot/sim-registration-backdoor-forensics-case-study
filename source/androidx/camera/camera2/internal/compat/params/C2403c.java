package androidx.camera.camera2.internal.compat.params;

import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: androidx.camera.camera2.internal.compat.params.c */
/* loaded from: classes.dex */
public class C2403c implements OutputConfigurationCompat.InterfaceC2397a {

    /* renamed from: a */
    public final Object f10513a;

    /* renamed from: androidx.camera.camera2.internal.compat.params.c$a */
    /* loaded from: classes.dex */
    public static final class C2404a {

        /* renamed from: a */
        public final List f10514a;

        /* renamed from: b */
        public final Size f10515b;

        /* renamed from: c */
        public final int f10516c;

        /* renamed from: d */
        public final int f10517d;

        /* renamed from: e */
        public String f10518e;

        /* renamed from: f */
        public boolean f10519f = false;

        /* renamed from: g */
        public long f10520g = 1;

        public C2404a(Surface surface) {
            Preconditions.checkNotNull(surface, "Surface must not be null");
            this.f10514a = Collections.singletonList(surface);
            this.f10515b = m63646c(surface);
            this.f10516c = m63648a(surface);
            this.f10517d = m63647b(surface);
        }

        /* renamed from: a */
        public static int m63648a(Surface surface) {
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class);
                if (Build.VERSION.SDK_INT < 22) {
                    declaredMethod.setAccessible(true);
                }
                return ((Integer) declaredMethod.invoke(null, surface)).intValue();
            } catch (ClassNotFoundException e) {
                e = e;
                Logger.m63227e("OutputConfigCompat", "Unable to retrieve surface format.", e);
                return 0;
            } catch (IllegalAccessException e2) {
                e = e2;
                Logger.m63227e("OutputConfigCompat", "Unable to retrieve surface format.", e);
                return 0;
            } catch (NoSuchMethodException e3) {
                e = e3;
                Logger.m63227e("OutputConfigCompat", "Unable to retrieve surface format.", e);
                return 0;
            } catch (InvocationTargetException e4) {
                e = e4;
                Logger.m63227e("OutputConfigCompat", "Unable to retrieve surface format.", e);
                return 0;
            }
        }

        /* renamed from: b */
        public static int m63647b(Surface surface) {
            try {
                return ((Integer) Surface.class.getDeclaredMethod("getGenerationId", null).invoke(surface, null)).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                Logger.m63227e("OutputConfigCompat", "Unable to retrieve surface generation id.", e);
                return -1;
            }
        }

        /* renamed from: c */
        public static Size m63646c(Surface surface) {
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
                declaredMethod.setAccessible(true);
                return (Size) declaredMethod.invoke(null, surface);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                Logger.m63227e("OutputConfigCompat", "Unable to retrieve surface size.", e);
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2404a)) {
                return false;
            }
            C2404a c2404a = (C2404a) obj;
            if (!this.f10515b.equals(c2404a.f10515b) || this.f10516c != c2404a.f10516c || this.f10517d != c2404a.f10517d || this.f10519f != c2404a.f10519f || this.f10520g != c2404a.f10520g || !Objects.equals(this.f10518e, c2404a.f10518e)) {
                return false;
            }
            int min = Math.min(this.f10514a.size(), c2404a.f10514a.size());
            for (int i = 0; i < min; i++) {
                if (this.f10514a.get(i) != c2404a.f10514a.get(i)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f10514a.hashCode() ^ 31;
            int i = this.f10517d ^ ((hashCode2 << 5) - hashCode2);
            int hashCode3 = this.f10515b.hashCode() ^ ((i << 5) - i);
            int i2 = this.f10516c ^ ((hashCode3 << 5) - hashCode3);
            int i3 = (this.f10519f ? 1 : 0) ^ ((i2 << 5) - i2);
            int i4 = (i3 << 5) - i3;
            String str = this.f10518e;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i5 = hashCode ^ i4;
            return AbstractC17792Ig1.m67882a(this.f10520g) ^ ((i5 << 5) - i5);
        }
    }

    public C2403c(Surface surface) {
        this.f10513a = new C2404a(surface);
    }

    /* renamed from: a */
    public boolean mo63649a() {
        return ((C2404a) this.f10513a).f10519f;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void addSurface(Surface surface) {
        Preconditions.checkNotNull(surface, "Surface must not be null");
        if (getSurface() != surface) {
            if (!mo63649a()) {
                throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
            }
            throw new IllegalArgumentException("Exceeds maximum number of surfaces");
        }
        throw new IllegalStateException("Surface is already added!");
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void enableSurfaceSharing() {
        ((C2404a) this.f10513a).f10519f = true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2403c)) {
            return false;
        }
        return Objects.equals(this.f10513a, ((C2403c) obj).f10513a);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public long getDynamicRangeProfile() {
        return ((C2404a) this.f10513a).f10520g;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public int getMaxSharedSurfaceCount() {
        return 1;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public Object getOutputConfiguration() {
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public String getPhysicalCameraId() {
        return ((C2404a) this.f10513a).f10518e;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public long getStreamUseCase() {
        return -1L;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public Surface getSurface() {
        List list = ((C2404a) this.f10513a).f10514a;
        if (list.size() == 0) {
            return null;
        }
        return (Surface) list.get(0);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public int getSurfaceGroupId() {
        return -1;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public List getSurfaces() {
        return ((C2404a) this.f10513a).f10514a;
    }

    public int hashCode() {
        return this.f10513a.hashCode();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void removeSurface(Surface surface) {
        if (getSurface() == surface) {
            throw new IllegalArgumentException("Cannot remove surface associated with this output configuration");
        }
        throw new IllegalArgumentException("Surface is not part of this output configuration");
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void setDynamicRangeProfile(long j) {
        ((C2404a) this.f10513a).f10520g = j;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void setPhysicalCameraId(String str) {
        ((C2404a) this.f10513a).f10518e = str;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void setStreamUseCase(long j) {
    }

    public C2403c(Object obj) {
        this.f10513a = obj;
    }
}
