package p000;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.params.C2385c;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: Gh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17696Gh1 extends C2385c {

    /* renamed from: Gh1$a */
    /* loaded from: classes.dex */
    public static final class C0467a {

        /* renamed from: a */
        public final OutputConfiguration f2052a;

        /* renamed from: b */
        public String f2053b;

        /* renamed from: c */
        public boolean f2054c;

        /* renamed from: d */
        public long f2055d = 1;

        public C0467a(OutputConfiguration outputConfiguration) {
            this.f2052a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0467a)) {
                return false;
            }
            C0467a c0467a = (C0467a) obj;
            if (!Objects.equals(this.f2052a, c0467a.f2052a) || this.f2054c != c0467a.f2054c || this.f2055d != c0467a.f2055d || !Objects.equals(this.f2053b, c0467a.f2053b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f2052a.hashCode() ^ 31;
            int i = (this.f2054c ? 1 : 0) ^ ((hashCode2 << 5) - hashCode2);
            int i2 = (i << 5) - i;
            String str = this.f2053b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = hashCode ^ i2;
            return AbstractC17631Fh1.m68395a(this.f2055d) ^ ((i3 << 5) - i3);
        }
    }

    public C17696Gh1(int i, Surface surface) {
        this(new C0467a(new OutputConfiguration(i, surface)));
    }

    /* renamed from: b */
    public static C17696Gh1 m68259b(OutputConfiguration outputConfiguration) {
        return new C17696Gh1(new C0467a(outputConfiguration));
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2385c
    /* renamed from: a */
    public boolean mo63600a() {
        return ((C0467a) this.f10601a).f2054c;
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public void enableSurfaceSharing() {
        ((C0467a) this.f10601a).f2054c = true;
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public long getDynamicRangeProfile() {
        return ((C0467a) this.f10601a).f2055d;
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public Object getOutputConfiguration() {
        Preconditions.checkArgument(this.f10601a instanceof C0467a);
        return ((C0467a) this.f10601a).f2052a;
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public String getPhysicalCameraId() {
        return ((C0467a) this.f10601a).f2053b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public Surface getSurface() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurface();
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public int getSurfaceGroupId() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurfaceGroupId();
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public List getSurfaces() {
        return Collections.singletonList(getSurface());
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public void setDynamicRangeProfile(long j) {
        ((C0467a) this.f10601a).f2055d = j;
    }

    @Override // androidx.camera.camera2.internal.compat.params.C2385c, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.InterfaceC2379a
    public void setPhysicalCameraId(String str) {
        ((C0467a) this.f10601a).f2053b = str;
    }

    public C17696Gh1(Object obj) {
        super(obj);
    }
}