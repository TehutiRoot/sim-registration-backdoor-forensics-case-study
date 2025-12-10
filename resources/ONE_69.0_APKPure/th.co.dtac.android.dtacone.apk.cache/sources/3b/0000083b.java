package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.Preconditions;
import java.util.Objects;

/* renamed from: Ih1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17826Ih1 extends C17761Hh1 {

    /* renamed from: Ih1$a */
    /* loaded from: classes.dex */
    public static final class C0606a {

        /* renamed from: a */
        public final OutputConfiguration f2748a;

        /* renamed from: b */
        public long f2749b = 1;

        public C0606a(OutputConfiguration outputConfiguration) {
            this.f2748a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0606a)) {
                return false;
            }
            C0606a c0606a = (C0606a) obj;
            if (!Objects.equals(this.f2748a, c0606a.f2748a) || this.f2749b != c0606a.f2749b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f2748a.hashCode() ^ 31;
            return AbstractC17631Fh1.m68395a(this.f2749b) ^ ((hashCode << 5) - hashCode);
        }
    }

    public C17826Ih1(int i, Surface surface) {
        this(new C0606a(new OutputConfiguration(i, surface)));
    }

    /* renamed from: f */
    public static C17826Ih1 m67995f(OutputConfiguration outputConfiguration) {
        return new C17826Ih1(new C0606a(outputConfiguration));
    }

    @Override // p000.C17761Hh1, p000.C17696Gh1, androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public long getDynamicRangeProfile() {
        return ((C0606a) this.f10601a).f2749b;
    }

    @Override // p000.C17761Hh1, androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public int getMaxSharedSurfaceCount() {
        return ((OutputConfiguration) getOutputConfiguration()).getMaxSharedSurfaceCount();
    }

    @Override // p000.C17761Hh1, p000.C17696Gh1, androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public Object getOutputConfiguration() {
        Preconditions.checkArgument(this.f10601a instanceof C0606a);
        return ((C0606a) this.f10601a).f2748a;
    }

    @Override // p000.C17761Hh1, p000.C17696Gh1, androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public String getPhysicalCameraId() {
        return null;
    }

    @Override // p000.C17761Hh1, androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public void removeSurface(Surface surface) {
        ((OutputConfiguration) getOutputConfiguration()).removeSurface(surface);
    }

    @Override // p000.C17761Hh1, p000.C17696Gh1, androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public void setDynamicRangeProfile(long j) {
        ((C0606a) this.f10601a).f2749b = j;
    }

    @Override // p000.C17761Hh1, p000.C17696Gh1, androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public void setPhysicalCameraId(String str) {
        ((OutputConfiguration) getOutputConfiguration()).setPhysicalCameraId(str);
    }

    public C17826Ih1(Object obj) {
        super(obj);
    }
}