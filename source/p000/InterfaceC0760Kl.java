package p000;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.C2436l;
import androidx.camera.core.impl.SessionConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Map;

/* renamed from: Kl */
/* loaded from: classes.dex */
public interface InterfaceC0760Kl {
    /* renamed from: a */
    ListenableFuture mo63767a(boolean z);

    /* renamed from: b */
    void mo63766b(SessionConfig sessionConfig);

    /* renamed from: c */
    void mo63765c(List list);

    void close();

    /* renamed from: d */
    void mo63764d();

    /* renamed from: e */
    List mo63763e();

    /* renamed from: f */
    ListenableFuture mo63762f(SessionConfig sessionConfig, CameraDevice cameraDevice, C2436l c2436l);

    /* renamed from: g */
    void mo63761g(Map map);

    SessionConfig getSessionConfig();
}
