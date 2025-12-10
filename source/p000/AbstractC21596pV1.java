package p000;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.core.graphics.PathParser;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.transition.platform.MaterialArcMotion;

/* renamed from: pV1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC21596pV1 {

    /* renamed from: a */
    public static final RectF f76600a = new RectF();

    /* renamed from: pV1$a */
    /* loaded from: classes4.dex */
    public class C13090a implements InterfaceC13091b {

        /* renamed from: a */
        public final /* synthetic */ RectF f76601a;

        /* renamed from: b */
        public final /* synthetic */ RectF f76602b;

        /* renamed from: c */
        public final /* synthetic */ float f76603c;

        /* renamed from: d */
        public final /* synthetic */ float f76604d;

        /* renamed from: e */
        public final /* synthetic */ float f76605e;

        public C13090a(RectF rectF, RectF rectF2, float f, float f2, float f3) {
            this.f76601a = rectF;
            this.f76602b = rectF2;
            this.f76603c = f;
            this.f76604d = f2;
            this.f76605e = f3;
        }

        @Override // p000.AbstractC21596pV1.InterfaceC13091b
        /* renamed from: a */
        public CornerSize mo23662a(CornerSize cornerSize, CornerSize cornerSize2) {
            return new AbsoluteCornerSize(AbstractC21596pV1.m23673n(cornerSize.getCornerSize(this.f76601a), cornerSize2.getCornerSize(this.f76602b), this.f76603c, this.f76604d, this.f76605e));
        }
    }

    /* renamed from: pV1$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC13091b {
        /* renamed from: a */
        CornerSize mo23662a(CornerSize cornerSize, CornerSize cornerSize2);
    }

    /* renamed from: b */
    public static float m23685b(RectF rectF) {
        return rectF.width() * rectF.height();
    }

    /* renamed from: c */
    public static ShapeAppearanceModel m23684c(ShapeAppearanceModel shapeAppearanceModel, final RectF rectF) {
        return shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: nV1
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize apply(CornerSize cornerSize) {
                CornerSize createFromCornerSize;
                createFromCornerSize = RelativeCornerSize.createFromCornerSize(rectF, cornerSize);
                return createFromCornerSize;
            }
        });
    }

    /* renamed from: d */
    public static Shader m23683d(int i) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i, i, Shader.TileMode.CLAMP);
    }

    /* renamed from: e */
    public static Object m23682e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        return obj;
    }

    /* renamed from: f */
    public static View m23681f(View view, int i) {
        String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() == i) {
                return view;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    /* renamed from: g */
    public static View m23680g(View view, int i) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        return m23681f(view, i);
    }

    /* renamed from: h */
    public static RectF m23679h(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new RectF(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    /* renamed from: i */
    public static RectF m23678i(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: j */
    public static Rect m23677j(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: k */
    public static boolean m23676k(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        if (shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(rectF) == 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static float m23674m(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: n */
    public static float m23673n(float f, float f2, float f3, float f4, float f5) {
        return m23672o(f, f2, f3, f4, f5, false);
    }

    /* renamed from: o */
    public static float m23672o(float f, float f2, float f3, float f4, float f5, boolean z) {
        if (z && (f5 < 0.0f || f5 > 1.0f)) {
            return m23674m(f, f2, f5);
        }
        if (f5 < f3) {
            return f;
        }
        if (f5 > f4) {
            return f2;
        }
        return m23674m(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: p */
    public static int m23671p(int i, int i2, float f, float f2, float f3) {
        if (f3 < f) {
            return i;
        }
        if (f3 > f2) {
            return i2;
        }
        return (int) m23674m(i, i2, (f3 - f) / (f2 - f));
    }

    /* renamed from: q */
    public static ShapeAppearanceModel m23670q(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, float f, float f2, float f3) {
        if (f3 < f) {
            return shapeAppearanceModel;
        }
        if (f3 > f2) {
            return shapeAppearanceModel2;
        }
        return m23663x(shapeAppearanceModel, shapeAppearanceModel2, rectF, new C13090a(rectF, rectF2, f, f2, f3));
    }

    /* renamed from: r */
    public static boolean m23669r(Transition transition, Context context, int i) {
        int resolveThemeDuration;
        if (i != 0 && transition.getDuration() == -1 && (resolveThemeDuration = MotionUtils.resolveThemeDuration(context, i, -1)) != -1) {
            transition.setDuration(resolveThemeDuration);
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static boolean m23668s(Transition transition, Context context, int i, TimeInterpolator timeInterpolator) {
        if (i != 0 && transition.getInterpolator() == null) {
            transition.setInterpolator(MotionUtils.resolveThemeInterpolator(context, i, timeInterpolator));
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m23667t(Transition transition, Context context, int i) {
        PathMotion m23666u;
        if (i != 0 && (m23666u = m23666u(context, i)) != null) {
            transition.setPathMotion(m23666u);
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static PathMotion m23666u(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.type;
        if (i2 == 16) {
            int i3 = typedValue.data;
            if (i3 == 0) {
                return null;
            }
            if (i3 == 1) {
                return new MaterialArcMotion();
            }
            throw new IllegalArgumentException("Invalid motion path type: " + i3);
        } else if (i2 == 3) {
            return new PatternPathMotion(PathParser.createPathFromPathData(String.valueOf(typedValue.string)));
        } else {
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
    }

    /* renamed from: v */
    public static int m23665v(Canvas canvas, Rect rect, int i) {
        RectF rectF = f76600a;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i);
    }

    /* renamed from: w */
    public static void m23664w(Canvas canvas, Rect rect, float f, float f2, float f3, int i, CanvasCompat.CanvasOperation canvasOperation) {
        if (i <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        if (i < 255) {
            m23665v(canvas, rect, i);
        }
        canvasOperation.run(canvas);
        canvas.restoreToCount(save);
    }

    /* renamed from: x */
    public static ShapeAppearanceModel m23663x(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, InterfaceC13091b interfaceC13091b) {
        ShapeAppearanceModel shapeAppearanceModel3;
        if (m23676k(shapeAppearanceModel, rectF)) {
            shapeAppearanceModel3 = shapeAppearanceModel;
        } else {
            shapeAppearanceModel3 = shapeAppearanceModel2;
        }
        return shapeAppearanceModel3.toBuilder().setTopLeftCornerSize(interfaceC13091b.mo23662a(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel2.getTopLeftCornerSize())).setTopRightCornerSize(interfaceC13091b.mo23662a(shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel2.getTopRightCornerSize())).setBottomLeftCornerSize(interfaceC13091b.mo23662a(shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel2.getBottomLeftCornerSize())).setBottomRightCornerSize(interfaceC13091b.mo23662a(shapeAppearanceModel.getBottomRightCornerSize(), shapeAppearanceModel2.getBottomRightCornerSize())).build();
    }
}
