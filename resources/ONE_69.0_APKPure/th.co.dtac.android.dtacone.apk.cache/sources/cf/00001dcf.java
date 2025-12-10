package androidx.camera.camera2.internal.compat;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.annotation.DoNotInline;
import androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat;

/* renamed from: androidx.camera.camera2.internal.compat.g */
/* loaded from: classes.dex */
public class C2372g implements StreamConfigurationMapCompat.InterfaceC2362a {

    /* renamed from: a */
    public final StreamConfigurationMap f10579a;

    /* renamed from: androidx.camera.camera2.internal.compat.g$a */
    /* loaded from: classes.dex */
    public static class C2373a {
        @DoNotInline
        /* renamed from: a */
        public static Size[] m63617a(StreamConfigurationMap streamConfigurationMap, int i) {
            Size[] highResolutionOutputSizes;
            highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i);
            return highResolutionOutputSizes;
        }
    }

    public C2372g(StreamConfigurationMap streamConfigurationMap) {
        this.f10579a = streamConfigurationMap;
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.InterfaceC2362a
    /* renamed from: a */
    public Size[] mo910a(int i) {
        if (i == 34) {
            return this.f10579a.getOutputSizes(SurfaceTexture.class);
        }
        return this.f10579a.getOutputSizes(i);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.InterfaceC2362a
    /* renamed from: b */
    public Size[] mo63619b(Class cls) {
        return this.f10579a.getOutputSizes(cls);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.InterfaceC2362a
    /* renamed from: c */
    public Size[] mo63618c(int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C2373a.m63617a(this.f10579a, i);
        }
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.InterfaceC2362a
    public StreamConfigurationMap unwrap() {
        return this.f10579a;
    }
}