package p000;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.C2418l;
import androidx.camera.core.impl.SessionConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Map;

/* renamed from: Kl */
/* loaded from: classes.dex */
public interface InterfaceC0750Kl {
    /* renamed from: a */
    ListenableFuture mo63718a(boolean z);

    /* renamed from: b */
    void mo63717b(SessionConfig sessionConfig);

    /* renamed from: c */
    void mo63716c(List list);

    void close();

    /* renamed from: d */
    void mo63715d();

    /* renamed from: e */
    List mo63714e();

    /* renamed from: f */
    ListenableFuture mo63713f(SessionConfig sessionConfig, CameraDevice cameraDevice, C2418l c2418l);

    /* renamed from: g */
    void mo63712g(Map map);

    SessionConfig getSessionConfig();
}