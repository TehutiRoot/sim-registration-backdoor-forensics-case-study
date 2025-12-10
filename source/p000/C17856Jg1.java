package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.params.C2403c;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: Jg1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17856Jg1 extends C2403c {

    /* renamed from: Jg1$a */
    /* loaded from: classes.dex */
    public static final class C0689a {

        /* renamed from: a */
        public final OutputConfiguration f2878a;

        /* renamed from: b */
        public String f2879b;

        /* renamed from: c */
        public boolean f2880c;

        /* renamed from: d */
        public long f2881d = 1;

        public C0689a(OutputConfiguration outputConfiguration) {
            this.f2878a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0689a)) {
                return false;
            }
            C0689a c0689a = (C0689a) obj;
            if (!Objects.equals(this.f2878a, c0689a.f2878a) || this.f2880c != c0689a.f2880c || this.f2881d != c0689a.f2881d || !Objects.equals(this.f2879b, c0689a.f2879b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f2878a.hashCode() ^ 31;
            int i = (this.f2880c ? 1 : 0) ^ ((hashCode2 << 5) - hashCode2);
            int i2 = (i << 5) - i;
            String str = this.f2879b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = hashCode ^ i2;
            return AbstractC17792Ig1.m67882a(this.f2881d) ^ ((i3 << 5) - i3);
        }
    }

    public C17856Jg1(int i, Surface surface) {
        this(new C0689a(new OutputConfiguration(i, surface)));
    }

    /* renamed from: b */
    public static C17856Jg1 m67725b(OutputConfiguration outputConfiguration) {
        return new C17856Jg1(new C0689a(outputConfiguration));
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c
    /* renamed from: a */
    public boolean mo63649a() {
        return ((C0689a) this.f10513a).f2880c;
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void enableSurfaceSharing() {
        ((C0689a) this.f10513a).f2880c = true;
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public long getDynamicRangeProfile() {
        return ((C0689a) this.f10513a).f2881d;
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public Object getOutputConfiguration() {
        Preconditions.checkArgument(this.f10513a instanceof C0689a);
        return ((C0689a) this.f10513a).f2878a;
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public String getPhysicalCameraId() {
        return ((C0689a) this.f10513a).f2879b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public Surface getSurface() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurface();
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public int getSurfaceGroupId() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurfaceGroupId();
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public List getSurfaces() {
        return Collections.singletonList(getSurface());
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void setDynamicRangeProfile(long j) {
        ((C0689a) this.f10513a).f2881d = j;
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2403c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2397a
    public void setPhysicalCameraId(String str) {
        ((C0689a) this.f10513a).f2879b = str;
    }

    public C17856Jg1(Object obj) {
        super(obj);
    }
}
