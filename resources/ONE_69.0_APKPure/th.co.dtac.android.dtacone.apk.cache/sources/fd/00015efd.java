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
public abstract class AbstractC16889vB extends MaterialShapeDrawable {

    /* renamed from: z */
    public C16891b f108015z;

    /* renamed from: vB$c */
    /* loaded from: classes4.dex */
    public static class C16892c extends AbstractC16889vB {
        public C16892c(C16891b c16891b) {
            super(c16891b);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public void drawStrokeShape(Canvas canvas) {
            if (this.f108015z.f108016w.isEmpty()) {
                super.drawStrokeShape(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f108015z.f108016w);
            } else {
                canvas.clipRect(this.f108015z.f108016w, Region.Op.DIFFERENCE);
            }
            super.drawStrokeShape(canvas);
            canvas.restore();
        }
    }

    /* renamed from: A */
    public static AbstractC16889vB m953A(ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel == null) {
            shapeAppearanceModel = new ShapeAppearanceModel();
        }
        return m947z(new C16891b(shapeAppearanceModel, new RectF()));
    }

    /* renamed from: z */
    public static AbstractC16889vB m947z(C16891b c16891b) {
        return new C16892c(c16891b);
    }

    /* renamed from: B */
    public boolean m952B() {
        return !this.f108015z.f108016w.isEmpty();
    }

    /* renamed from: C */
    public void m951C() {
        m950D(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: D */
    public void m950D(float f, float f2, float f3, float f4) {
        if (f != this.f108015z.f108016w.left || f2 != this.f108015z.f108016w.top || f3 != this.f108015z.f108016w.right || f4 != this.f108015z.f108016w.bottom) {
            this.f108015z.f108016w.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* renamed from: E */
    public void m949E(RectF rectF) {
        m950D(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f108015z = new C16891b(this.f108015z);
        return this;
    }

    /* renamed from: vB$b */
    /* loaded from: classes4.dex */
    public static final class C16891b extends MaterialShapeDrawable.MaterialShapeDrawableState {

        /* renamed from: w */
        public final RectF f108016w;

        @Override // com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AbstractC16889vB m947z = AbstractC16889vB.m947z(this);
            m947z.invalidateSelf();
            return m947z;
        }

        public C16891b(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
            super(shapeAppearanceModel, null);
            this.f108016w = rectF;
        }

        public C16891b(C16891b c16891b) {
            super(c16891b);
            this.f108016w = c16891b.f108016w;
        }
    }

    public AbstractC16889vB(C16891b c16891b) {
        super(c16891b);
        this.f108015z = c16891b;
    }
}