package p000;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Size;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.view.C2679b;

/* renamed from: Bo1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17391Bo1 extends MeteringPointFactory {

    /* renamed from: d */
    public static final PointF f513d = new PointF(2.0f, 2.0f);

    /* renamed from: b */
    public final C2679b f514b;

    /* renamed from: c */
    public Matrix f515c;

    public C17391Bo1(C2679b c2679b) {
        this.f514b = c2679b;
    }

    /* renamed from: a */
    public void m69075a(Size size, int i) {
        Threads.checkMainThread();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0) {
                    this.f515c = this.f514b.m61796c(size, i);
                    return;
                }
                this.f515c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.MeteringPointFactory
    public PointF convertPoint(float f, float f2) {
        float[] fArr = {f, f2};
        synchronized (this) {
            try {
                Matrix matrix = this.f515c;
                if (matrix == null) {
                    return f513d;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}