package p000;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Size;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.view.C2697b;

/* renamed from: En1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17556En1 extends MeteringPointFactory {

    /* renamed from: d */
    public static final PointF f1395d = new PointF(2.0f, 2.0f);

    /* renamed from: b */
    public final C2697b f1396b;

    /* renamed from: c */
    public Matrix f1397c;

    public C17556En1(C2697b c2697b) {
        this.f1396b = c2697b;
    }

    /* renamed from: a */
    public void m68458a(Size size, int i) {
        Threads.checkMainThread();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0) {
                    this.f1397c = this.f1396b.m61848c(size, i);
                    return;
                }
                this.f1397c = null;
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
                Matrix matrix = this.f1397c;
                if (matrix == null) {
                    return f1395d;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
