package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.view.c */
/* loaded from: classes.dex */
public abstract class AbstractC2699c {

    /* renamed from: a */
    public Size f12211a;

    /* renamed from: b */
    public FrameLayout f12212b;

    /* renamed from: c */
    public final C2697b f12213c;

    /* renamed from: d */
    public boolean f12214d = false;

    /* renamed from: androidx.camera.view.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2700a {
        /* renamed from: a */
        void mo61828a();
    }

    public AbstractC2699c(FrameLayout frameLayout, C2697b c2697b) {
        this.f12212b = frameLayout;
        this.f12213c = c2697b;
    }

    /* renamed from: a */
    public Bitmap m61831a() {
        Bitmap mo61812c = mo61812c();
        if (mo61812c == null) {
            return null;
        }
        return this.f12213c.m61850a(mo61812c, new Size(this.f12212b.getWidth(), this.f12212b.getHeight()), this.f12212b.getLayoutDirection());
    }

    /* renamed from: b */
    public abstract View mo61813b();

    /* renamed from: c */
    public abstract Bitmap mo61812c();

    /* renamed from: d */
    public abstract void mo61811d();

    /* renamed from: e */
    public abstract void mo61810e();

    /* renamed from: f */
    public void m61830f() {
        this.f12214d = true;
        m61829h();
    }

    /* renamed from: g */
    public abstract void mo61809g(SurfaceRequest surfaceRequest, InterfaceC2700a interfaceC2700a);

    /* renamed from: h */
    public void m61829h() {
        View mo61813b = mo61813b();
        if (mo61813b != null && this.f12214d) {
            this.f12213c.m61832s(new Size(this.f12212b.getWidth(), this.f12212b.getHeight()), this.f12212b.getLayoutDirection(), mo61813b);
        }
    }

    /* renamed from: i */
    public abstract void mo61808i(Executor executor, PreviewView.OnFrameUpdateListener onFrameUpdateListener);

    /* renamed from: j */
    public abstract ListenableFuture mo61807j();
}
