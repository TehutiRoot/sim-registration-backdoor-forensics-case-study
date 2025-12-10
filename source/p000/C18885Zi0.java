package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

/* renamed from: Zi0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18885Zi0 extends AbstractC17040xK {

    /* renamed from: c */
    public float f8107c;

    /* renamed from: d */
    public float f8108d;

    /* renamed from: e */
    public float f8109e;

    /* renamed from: f */
    public Path f8110f;

    public C18885Zi0(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f8107c = 300.0f;
    }

    @Override // p000.AbstractC17040xK
    /* renamed from: a */
    public void mo540a(Canvas canvas, Rect rect, float f) {
        this.f8107c = rect.width();
        float f2 = ((LinearProgressIndicatorSpec) this.f108314a).trackThickness;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - ((LinearProgressIndicatorSpec) this.f108314a).trackThickness) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f108314a).f50452a) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f108315b.isShowing() && ((LinearProgressIndicatorSpec) this.f108314a).showAnimationBehavior == 1) || (this.f108315b.isHiding() && ((LinearProgressIndicatorSpec) this.f108314a).hideAnimationBehavior == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f108315b.isShowing() || this.f108315b.isHiding()) {
            canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.f108314a).trackThickness * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.f8107c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f108314a;
        this.f8108d = ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackThickness * f;
        this.f8109e = ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackCornerRadius * f;
    }

    @Override // p000.AbstractC17040xK
    /* renamed from: b */
    public void mo539b(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.f8107c;
        float f4 = (-f3) / 2.0f;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.save();
        canvas.clipPath(this.f8110f);
        float f5 = this.f8108d;
        RectF rectF = new RectF(((f * f3) + f4) - (this.f8109e * 2.0f), (-f5) / 2.0f, f4 + (f2 * f3), f5 / 2.0f);
        float f6 = this.f8109e;
        canvas.drawRoundRect(rectF, f6, f6, paint);
        canvas.restore();
    }

    @Override // p000.AbstractC17040xK
    /* renamed from: c */
    public void mo538c(Canvas canvas, Paint paint) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(((LinearProgressIndicatorSpec) this.f108314a).trackColor, this.f108315b.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(compositeARGBWithAlpha);
        Path path = new Path();
        this.f8110f = path;
        float f = this.f8107c;
        float f2 = this.f8108d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f8109e;
        path.addRoundRect(rectF, f3, f3, Path.Direction.CCW);
        canvas.drawPath(this.f8110f, paint);
    }

    @Override // p000.AbstractC17040xK
    /* renamed from: d */
    public int mo537d() {
        return ((LinearProgressIndicatorSpec) this.f108314a).trackThickness;
    }

    @Override // p000.AbstractC17040xK
    /* renamed from: e */
    public int mo536e() {
        return -1;
    }
}
