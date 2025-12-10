package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.AbstractC7028a;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* renamed from: xK */
/* loaded from: classes4.dex */
public abstract class AbstractC17040xK {

    /* renamed from: a */
    public BaseProgressIndicatorSpec f108314a;

    /* renamed from: b */
    public AbstractC7028a f108315b;

    public AbstractC17040xK(BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.f108314a = baseProgressIndicatorSpec;
    }

    /* renamed from: a */
    public abstract void mo540a(Canvas canvas, Rect rect, float f);

    /* renamed from: b */
    public abstract void mo539b(Canvas canvas, Paint paint, float f, float f2, int i);

    /* renamed from: c */
    public abstract void mo538c(Canvas canvas, Paint paint);

    /* renamed from: d */
    public abstract int mo537d();

    /* renamed from: e */
    public abstract int mo536e();

    /* renamed from: f */
    public void m535f(AbstractC7028a abstractC7028a) {
        this.f108315b = abstractC7028a;
    }

    /* renamed from: g */
    public void m534g(Canvas canvas, Rect rect, float f) {
        this.f108314a.mo44417c();
        mo540a(canvas, rect, f);
    }
}
