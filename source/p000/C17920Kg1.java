package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

/* renamed from: Kg1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17920Kg1 extends C17856Jg1 {

    /* renamed from: Kg1$a */
    /* loaded from: classes.dex */
    public static final class C0755a {

        /* renamed from: a */
        public final OutputConfiguration f3246a;

        /* renamed from: b */
        public String f3247b;

        /* renamed from: c */
        public long f3248c = 1;

        public C0755a(OutputConfiguration outputConfiguration) {
            this.f3246a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0755a)) {
                return false;
            }
            C0755a c0755a = (C0755a) obj;
            if (!Objects.equals(this.f3246a, c0755a.f3246a) || this.f3248c != c0755a.f3248c || !Objects.equals(this.f3247b, c0755a.f3247b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f3246a.hashCode() ^ 31;
            int i = (hashCode2 << 5) - hashCode2;
            String str = this.f3247b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode ^ i;
            return AbstractC17792Ig1.m67882a(this.f3248c) ^ ((i2 << 5) - i2);
        }
    }

    public C17920Kg1(int i, Surface surface) {
        this(new C0755a(new OutputConfiguration(i, surface)));
    }

    /* renamed from: c */
    public static int m67602c() {
        Field declaredField = OutputConfiguration.class.getDeclaredField("MAX_SURFACES_COUNT");
        declaredField.setAccessible(true);
        return declaredField.getInt(null);
    }

    /* renamed from: d */
    public static List m67601d(OutputConfiguration outputConfiguration) {
        Field declaredField = OutputConfiguration.class.getDeclaredField("mSurfaces");
        declaredField.setAccessible(true);
        return (List) declaredField.get(outputConfiguration);
    }

    /* renamed from: e */
    public static C17920Kg1 m67600e(OutputConfiguration outputConfiguration) {
        return new C17920Kg1(new C0755a(outputConfiguration));
    }

    @Override // p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c
    /* renamed from: a */
    public final boolean mo63649a() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void addSurface(Surface surface) {
        ((OutputConfiguration) getOutputConfiguration()).addSurface(surface);
    }

    @Override // p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void enableSurfaceSharing() {
        ((OutputConfiguration) getOutputConfiguration()).enableSurfaceSharing();
    }

    @Override // p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public long getDynamicRangeProfile() {
        return ((C0755a) this.f10513a).f3248c;
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public int getMaxSharedSurfaceCount() {
        try {
            return m67602c();
        } catch (IllegalAccessException | NoSuchFieldException e) {
            Logger.m63227e("OutputConfigCompat", "Unable to retrieve max shared surface count.", e);
            return super.getMaxSharedSurfaceCount();
        }
    }

    @Override // p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public Object getOutputConfiguration() {
        Preconditions.checkArgument(this.f10513a instanceof C0755a);
        return ((C0755a) this.f10513a).f3246a;
    }

    @Override // p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public String getPhysicalCameraId() {
        return ((C0755a) this.f10513a).f3247b;
    }

    @Override // p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public List getSurfaces() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurfaces();
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void removeSurface(Surface surface) {
        if (getSurface() != surface) {
            try {
                if (!m67601d((OutputConfiguration) getOutputConfiguration()).remove(surface)) {
                    throw new IllegalArgumentException("Surface is not part of this output configuration");
                }
                return;
            } catch (IllegalAccessException | NoSuchFieldException e) {
                Logger.m63227e("OutputConfigCompat", "Unable to remove surface from this output configuration.", e);
                return;
            }
        }
        throw new IllegalArgumentException("Cannot remove surface associated with this output configuration");
    }

    @Override // p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void setDynamicRangeProfile(long j) {
        ((C0755a) this.f10513a).f3248c = j;
    }

    @Override // p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void setPhysicalCameraId(String str) {
        ((C0755a) this.f10513a).f3247b = str;
    }

    public C17920Kg1(Object obj) {
        super(obj);
    }
}
