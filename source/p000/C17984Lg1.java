package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.Preconditions;
import java.util.Objects;

/* renamed from: Lg1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17984Lg1 extends C17920Kg1 {

    /* renamed from: Lg1$a */
    /* loaded from: classes.dex */
    public static final class C0819a {

        /* renamed from: a */
        public final OutputConfiguration f3520a;

        /* renamed from: b */
        public long f3521b = 1;

        public C0819a(OutputConfiguration outputConfiguration) {
            this.f3520a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0819a)) {
                return false;
            }
            C0819a c0819a = (C0819a) obj;
            if (!Objects.equals(this.f3520a, c0819a.f3520a) || this.f3521b != c0819a.f3521b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f3520a.hashCode() ^ 31;
            return AbstractC17792Ig1.m67882a(this.f3521b) ^ ((hashCode << 5) - hashCode);
        }
    }

    public C17984Lg1(int i, Surface surface) {
        this(new C0819a(new OutputConfiguration(i, surface)));
    }

    /* renamed from: f */
    public static C17984Lg1 m67502f(OutputConfiguration outputConfiguration) {
        return new C17984Lg1(new C0819a(outputConfiguration));
    }

    @Override // p000.C17920Kg1, p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public long getDynamicRangeProfile() {
        return ((C0819a) this.f10513a).f3521b;
    }

    @Override // p000.C17920Kg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public int getMaxSharedSurfaceCount() {
        return ((OutputConfiguration) getOutputConfiguration()).getMaxSharedSurfaceCount();
    }

    @Override // p000.C17920Kg1, p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public Object getOutputConfiguration() {
        Preconditions.checkArgument(this.f10513a instanceof C0819a);
        return ((C0819a) this.f10513a).f3520a;
    }

    @Override // p000.C17920Kg1, p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public String getPhysicalCameraId() {
        return null;
    }

    @Override // p000.C17920Kg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void removeSurface(Surface surface) {
        ((OutputConfiguration) getOutputConfiguration()).removeSurface(surface);
    }

    @Override // p000.C17920Kg1, p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void setDynamicRangeProfile(long j) {
        ((C0819a) this.f10513a).f3521b = j;
    }

    @Override // p000.C17920Kg1, p000.C17856Jg1, androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void setPhysicalCameraId(String str) {
        ((OutputConfiguration) getOutputConfiguration()).setPhysicalCameraId(str);
    }

    public C17984Lg1(Object obj) {
        super(obj);
    }
}
