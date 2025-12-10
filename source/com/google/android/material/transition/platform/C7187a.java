package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.transition.platform.MaterialContainerTransform;

/* renamed from: com.google.android.material.transition.platform.a */
/* loaded from: classes4.dex */
public class C7187a {

    /* renamed from: a */
    public final Path f51574a = new Path();

    /* renamed from: b */
    public final Path f51575b = new Path();

    /* renamed from: c */
    public final Path f51576c = new Path();

    /* renamed from: d */
    public final ShapeAppearancePathProvider f51577d = ShapeAppearancePathProvider.getInstance();

    /* renamed from: e */
    public ShapeAppearanceModel f51578e;

    /* renamed from: a */
    public void m43422a(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 23) {
            canvas.clipPath(this.f51574a);
            return;
        }
        canvas.clipPath(this.f51575b);
        canvas.clipPath(this.f51576c, Region.Op.UNION);
    }

    /* renamed from: b */
    public void m43421b(float f, ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, RectF rectF3, MaterialContainerTransform.ProgressThresholds progressThresholds) {
        ShapeAppearanceModel m23670q = AbstractC21596pV1.m23670q(shapeAppearanceModel, shapeAppearanceModel2, rectF, rectF3, progressThresholds.getStart(), progressThresholds.getEnd(), f);
        this.f51578e = m23670q;
        this.f51577d.calculatePath(m23670q, 1.0f, rectF2, this.f51575b);
        this.f51577d.calculatePath(this.f51578e, 1.0f, rectF3, this.f51576c);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f51574a.op(this.f51575b, this.f51576c, Path.Op.UNION);
        }
    }

    /* renamed from: c */
    public ShapeAppearanceModel m43420c() {
        return this.f51578e;
    }

    /* renamed from: d */
    public Path m43419d() {
        return this.f51574a;
    }
}
