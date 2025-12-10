package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;

/* renamed from: yp */
/* loaded from: classes2.dex */
public class C17163yp extends ImageView {

    /* renamed from: a */
    public Animation.AnimationListener f109167a;

    /* renamed from: b */
    public int f109168b;

    /* renamed from: yp$a */
    /* loaded from: classes2.dex */
    public class C17164a extends OvalShape {

        /* renamed from: a */
        public RadialGradient f109169a;

        /* renamed from: b */
        public Paint f109170b = new Paint();

        public C17164a(int i) {
            C17163yp.this.f109168b = i;
            m243a((int) rect().width());
        }

        /* renamed from: a */
        public final void m243a(int i) {
            float f = i / 2;
            RadialGradient radialGradient = new RadialGradient(f, f, C17163yp.this.f109168b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f109169a = radialGradient;
            this.f109170b.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = C17163yp.this.getWidth() / 2;
            float height = C17163yp.this.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.f109170b);
            canvas.drawCircle(width2, height, width - C17163yp.this.f109168b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m243a((int) f);
        }
    }

    public C17163yp(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f109168b = (int) (3.5f * f);
        if (m245a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ViewCompat.setElevation(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C17164a(this.f109168b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f109168b, i3, i2, 503316480);
            int i4 = this.f109168b;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        ViewCompat.setBackground(this, shapeDrawable);
    }

    /* renamed from: a */
    public final boolean m245a() {
        return true;
    }

    /* renamed from: b */
    public void m244b(Animation.AnimationListener animationListener) {
        this.f109167a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f109167a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f109167a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m245a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f109168b * 2), getMeasuredHeight() + (this.f109168b * 2));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}