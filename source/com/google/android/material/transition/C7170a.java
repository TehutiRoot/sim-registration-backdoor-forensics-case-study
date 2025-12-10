package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.transition.MaterialContainerTransform;

/* renamed from: com.google.android.material.transition.a */
/* loaded from: classes4.dex */
public class C7170a {

    /* renamed from: a */
    public final Path f51428a = new Path();

    /* renamed from: b */
    public final Path f51429b = new Path();

    /* renamed from: c */
    public final Path f51430c = new Path();

    /* renamed from: d */
    public final ShapeAppearancePathProvider f51431d = ShapeAppearancePathProvider.getInstance();

    /* renamed from: e */
    public ShapeAppearanceModel f51432e;

    /* renamed from: a */
    public void m43487a(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 23) {
            canvas.clipPath(this.f51428a);
            return;
        }
        canvas.clipPath(this.f51429b);
        canvas.clipPath(this.f51430c, Region.Op.UNION);
    }

    /* renamed from: b */
    public void m43486b(float f, ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, RectF rectF3, MaterialContainerTransform.ProgressThresholds progressThresholds) {
        ShapeAppearanceModel m23479p = AbstractC21768qV1.m23479p(shapeAppearanceModel, shapeAppearanceModel2, rectF, rectF3, progressThresholds.getStart(), progressThresholds.getEnd(), f);
        this.f51432e = m23479p;
        this.f51431d.calculatePath(m23479p, 1.0f, rectF2, this.f51429b);
        this.f51431d.calculatePath(this.f51432e, 1.0f, rectF3, this.f51430c);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f51428a.op(this.f51429b, this.f51430c, Path.Op.UNION);
        }
    }

    /* renamed from: c */
    public ShapeAppearanceModel m43485c() {
        return this.f51432e;
    }

    /* renamed from: d */
    public Path m43484d() {
        return this.f51428a;
    }
}
