package p000;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* renamed from: vB */
/* loaded from: classes4.dex */
public abstract class AbstractC16876vB extends MaterialShapeDrawable {

    /* renamed from: z */
    public C16878b f107603z;

    /* renamed from: vB$c */
    /* loaded from: classes4.dex */
    public static class C16879c extends AbstractC16876vB {
        public C16879c(C16878b c16878b) {
            super(c16878b);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public void drawStrokeShape(Canvas canvas) {
            if (this.f107603z.f107604w.isEmpty()) {
                super.drawStrokeShape(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f107603z.f107604w);
            } else {
                canvas.clipRect(this.f107603z.f107604w, Region.Op.DIFFERENCE);
            }
            super.drawStrokeShape(canvas);
            canvas.restore();
        }
    }

    /* renamed from: A */
    public static AbstractC16876vB m1103A(ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel == null) {
            shapeAppearanceModel = new ShapeAppearanceModel();
        }
        return m1097z(new C16878b(shapeAppearanceModel, new RectF()));
    }

    /* renamed from: z */
    public static AbstractC16876vB m1097z(C16878b c16878b) {
        return new C16879c(c16878b);
    }

    /* renamed from: B */
    public boolean m1102B() {
        return !this.f107603z.f107604w.isEmpty();
    }

    /* renamed from: C */
    public void m1101C() {
        m1100D(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: D */
    public void m1100D(float f, float f2, float f3, float f4) {
        if (f != this.f107603z.f107604w.left || f2 != this.f107603z.f107604w.top || f3 != this.f107603z.f107604w.right || f4 != this.f107603z.f107604w.bottom) {
            this.f107603z.f107604w.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* renamed from: E */
    public void m1099E(RectF rectF) {
        m1100D(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f107603z = new C16878b(this.f107603z);
        return this;
    }

    /* renamed from: vB$b */
    /* loaded from: classes4.dex */
    public static final class C16878b extends MaterialShapeDrawable.MaterialShapeDrawableState {

        /* renamed from: w */
        public final RectF f107604w;

        @Override // com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AbstractC16876vB m1097z = AbstractC16876vB.m1097z(this);
            m1097z.invalidateSelf();
            return m1097z;
        }

        public C16878b(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
            super(shapeAppearanceModel, null);
            this.f107604w = rectF;
        }

        public C16878b(C16878b c16878b) {
            super(c16878b);
            this.f107604w = c16878b.f107604w;
        }
    }

    public AbstractC16876vB(C16878b c16878b) {
        super(c16878b);
        this.f107603z = c16878b;
    }
}
