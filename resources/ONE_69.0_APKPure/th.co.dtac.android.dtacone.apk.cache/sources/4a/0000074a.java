package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.core.util.Preconditions;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

/* renamed from: Hh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17761Hh1 extends C17696Gh1 {

    /* renamed from: Hh1$a */
    /* loaded from: classes.dex */
    public static final class C0538a {

        /* renamed from: a */
        public final OutputConfiguration f2451a;

        /* renamed from: b */
        public String f2452b;

        /* renamed from: c */
        public long f2453c = 1;

        public C0538a(OutputConfiguration outputConfiguration) {
            this.f2451a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0538a)) {
                return false;
            }
            C0538a c0538a = (C0538a) obj;
            if (!Objects.equals(this.f2451a, c0538a.f2451a) || this.f2453c != c0538a.f2453c || !Objects.equals(this.f2452b, c0538a.f2452b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f2451a.hashCode() ^ 31;
            int i = (hashCode2 << 5) - hashCode2;
            String str = this.f2452b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode ^ i;
            return AbstractC17631Fh1.m68395a(this.f2453c) ^ ((i2 << 5) - i2);
        }
    }

    public C17761Hh1(int i, Surface surface) {
        this(new C0538a(new OutputConfiguration(i, surface)));
    }

    /* renamed from: c */
    public static int m68104c() {
        Field declaredField = OutputConfiguration.class.getDeclaredField("MAX_SURFACES_COUNT");
        declaredField.setAccessible(true);
        return declaredField.getInt(null);
    }

    /* renamed from: d */
    public static List m68103d(OutputConfiguration outputConfiguration) {
        Field declaredField = OutputConfiguration.class.getDeclaredField("mSurfaces");
        declaredField.setAccessible(true);
        return (List) declaredField.get(outputConfiguration);
    }

    /* renamed from: e */
    public static C17761Hh1 m68102e(OutputConfiguration outputConfiguration) {
        return new C17761Hh1(new C0538a(outputConfiguration));
    }

    @Override // p000.C17696Gh1, androidx.camera.camera2.internal.compat.params.C2385c
    /* renamed from: a */
    public final boolean mo63600a() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public void addSurface(Surface surface) {
        ((OutputConfiguration) getOutputConfiguration()).addSurface(surface);
    }

    @Override // p000.C17696Gh1, androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public void enableSurfaceSharing() {
        ((OutputConfiguration) getOutputConfiguration()).enableSurfaceSharing();
    }

    @Override // p000.C17696Gh1, androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public long getDynamicRangeProfile() {
        return ((C0538a) this.f10601a).f2453c;
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public int getMaxSharedSurfaceCount() {
        try {
            return m68104c();
        } catch (IllegalAccessException | NoSuchFieldException e) {
            Logger.m63175e("OutputConfigCompat", "Unable to retrieve max shared surface count.", e);
            return super.getMaxSharedSurfaceCount();
        }
    }

    @Override // p000.C17696Gh1, androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public Object getOutputConfiguration() {
        Preconditions.checkArgument(this.f10601a instanceof C0538a);
        return ((C0538a) this.f10601a).f2451a;
    }

    @Override // p000.C17696Gh1, androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public String getPhysicalCameraId() {
        return ((C0538a) this.f10601a).f2452b;
    }

    @Override // p000.C17696Gh1, androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public List getSurfaces() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurfaces();
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public void removeSurface(Surface surface) {
        if (getSurface() != surface) {
            try {
                if (!m68103d((OutputConfiguration) getOutputConfiguration()).remove(surface)) {
                    throw new IllegalArgumentException("Surface is not part of this output configuration");
                }
                return;
            } catch (IllegalAccessException | NoSuchFieldException e) {
                Logger.m63175e("OutputConfigCompat", "Unable to remove surface from this output configuration.", e);
                return;
            }
        }
        throw new IllegalArgumentException("Cannot remove surface associated with this output configuration");
    }

    @Override // p000.C17696Gh1, androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public void setDynamicRangeProfile(long j) {
        ((C0538a) this.f10601a).f2453c = j;
    }

    @Override // p000.C17696Gh1, androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public void setPhysicalCameraId(String str) {
        ((C0538a) this.f10601a).f2452b = str;
    }

    public C17761Hh1(Object obj) {
        super(obj);
    }
}