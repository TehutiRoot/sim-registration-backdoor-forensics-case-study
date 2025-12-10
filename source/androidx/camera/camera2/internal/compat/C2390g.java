package androidx.camera.camera2.internal.compat;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.annotation.DoNotInline;
import androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat;

/* renamed from: androidx.camera.camera2.internal.compat.g */
/* loaded from: classes.dex */
public class C2390g implements StreamConfigurationMapCompat.InterfaceC2380a {

    /* renamed from: a */
    public final StreamConfigurationMap f10491a;

    /* renamed from: androidx.camera.camera2.internal.compat.g$a */
    /* loaded from: classes.dex */
    public static class C2391a {
        @DoNotInline
        /* renamed from: a */
        public static Size[] m63666a(StreamConfigurationMap streamConfigurationMap, int i) {
            Size[] highResolutionOutputSizes;
            highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i);
            return highResolutionOutputSizes;
        }
    }

    public C2390g(StreamConfigurationMap streamConfigurationMap) {
        this.f10491a = streamConfigurationMap;
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.InterfaceC2380a
    /* renamed from: a */
    public Size[] mo278a(int i) {
        if (i == 34) {
            return this.f10491a.getOutputSizes(SurfaceTexture.class);
        }
        return this.f10491a.getOutputSizes(i);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.InterfaceC2380a
    /* renamed from: b */
    public Size[] mo63668b(Class cls) {
        return this.f10491a.getOutputSizes(cls);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.InterfaceC2380a
    /* renamed from: c */
    public Size[] mo63667c(int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C2391a.m63666a(this.f10491a, i);
        }
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.InterfaceC2380a
    public StreamConfigurationMap unwrap() {
        return this.f10491a;
    }
}
