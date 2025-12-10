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
public class C17150yp extends ImageView {

    /* renamed from: a */
    public Animation.AnimationListener f108870a;

    /* renamed from: b */
    public int f108871b;

    /* renamed from: yp$a */
    /* loaded from: classes2.dex */
    public class C17151a extends OvalShape {

        /* renamed from: a */
        public RadialGradient f108872a;

        /* renamed from: b */
        public Paint f108873b = new Paint();

        public C17151a(int i) {
            C17150yp.this.f108871b = i;
            m181a((int) rect().width());
        }

        /* renamed from: a */
        public final void m181a(int i) {
            float f = i / 2;
            RadialGradient radialGradient = new RadialGradient(f, f, C17150yp.this.f108871b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f108872a = radialGradient;
            this.f108873b.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = C17150yp.this.getWidth() / 2;
            float height = C17150yp.this.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.f108873b);
            canvas.drawCircle(width2, height, width - C17150yp.this.f108871b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m181a((int) f);
        }
    }

    public C17150yp(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f108871b = (int) (3.5f * f);
        if (m183a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ViewCompat.setElevation(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C17151a(this.f108871b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f108871b, i3, i2, 503316480);
            int i4 = this.f108871b;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        ViewCompat.setBackground(this, shapeDrawable);
    }

    /* renamed from: a */
    public final boolean m183a() {
        return true;
    }

    /* renamed from: b */
    public void m182b(Animation.AnimationListener animationListener) {
        this.f108870a = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f108870a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f108870a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m183a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f108871b * 2), getMeasuredHeight() + (this.f108871b * 2));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
