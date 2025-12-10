package p000;

import android.os.Handler;
import androidx.camera.core.impl.CameraThreadConfig;
import java.util.concurrent.Executor;

/* renamed from: l8 */
/* loaded from: classes.dex */
public final class C12199l8 extends CameraThreadConfig {

    /* renamed from: a */
    public final Executor f71539a;

    /* renamed from: b */
    public final Handler f71540b;

    public C12199l8(Executor executor, Handler handler) {
        if (executor != null) {
            this.f71539a = executor;
            if (handler != null) {
                this.f71540b = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraThreadConfig)) {
            return false;
        }
        CameraThreadConfig cameraThreadConfig = (CameraThreadConfig) obj;
        if (this.f71539a.equals(cameraThreadConfig.getCameraExecutor()) && this.f71540b.equals(cameraThreadConfig.getSchedulerHandler())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    public Executor getCameraExecutor() {
        return this.f71539a;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    public Handler getSchedulerHandler() {
        return this.f71540b;
    }

    public int hashCode() {
        return ((this.f71539a.hashCode() ^ 1000003) * 1000003) ^ this.f71540b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f71539a + ", schedulerHandler=" + this.f71540b + "}";
    }
}
