package p000;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.core.graphics.PathParser;
import androidx.transition.PathMotion;
import androidx.transition.PatternPathMotion;
import androidx.transition.Transition;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.transition.MaterialArcMotion;

/* renamed from: qV1 */
/* loaded from: classes4.dex */
public abstract class AbstractC21768qV1 {

    /* renamed from: a */
    public static final RectF f76984a = new RectF();

    /* renamed from: qV1$a */
    /* loaded from: classes4.dex */
    public class C13188a implements InterfaceC13189b {

        /* renamed from: a */
        public final /* synthetic */ RectF f76985a;

        /* renamed from: b */
        public final /* synthetic */ RectF f76986b;

        /* renamed from: c */
        public final /* synthetic */ float f76987c;

        /* renamed from: d */
        public final /* synthetic */ float f76988d;

        /* renamed from: e */
        public final /* synthetic */ float f76989e;

        public C13188a(RectF rectF, RectF rectF2, float f, float f2, float f3) {
            this.f76985a = rectF;
            this.f76986b = rectF2;
            this.f76987c = f;
            this.f76988d = f2;
            this.f76989e = f3;
        }

        @Override // p000.AbstractC21768qV1.InterfaceC13189b
        /* renamed from: a */
        public CornerSize mo23471a(CornerSize cornerSize, CornerSize cornerSize2) {
            return new AbsoluteCornerSize(AbstractC21768qV1.m23482m(cornerSize.getCornerSize(this.f76985a), cornerSize2.getCornerSize(this.f76986b), this.f76987c, this.f76988d, this.f76989e));
        }
    }

    /* renamed from: qV1$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC13189b {
        /* renamed from: a */
        CornerSize mo23471a(CornerSize cornerSize, CornerSize cornerSize2);
    }

    /* renamed from: a */
    public static /* synthetic */ CornerSize m23494a(RectF rectF, CornerSize cornerSize) {
        return RelativeCornerSize.createFromCornerSize(rectF, cornerSize);
    }

    /* renamed from: b */
    public static float m23493b(RectF rectF) {
        return rectF.width() * rectF.height();
    }

    /* renamed from: c */
    public static ShapeAppearanceModel m23492c(ShapeAppearanceModel shapeAppearanceModel, final RectF rectF) {
        return shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: oV1
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize apply(CornerSize cornerSize) {
                return AbstractC21768qV1.m23494a(rectF, cornerSize);
            }
        });
    }

    /* renamed from: d */
    public static Shader m23491d(int i) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i, i, Shader.TileMode.CLAMP);
    }

    /* renamed from: e */
    public static Object m23490e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        return obj;
    }

    /* renamed from: f */
    public static View m23489f(View view, int i) {
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
    public static View m23488g(View view, int i) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        return m23489f(view, i);
    }

    /* renamed from: h */
    public static RectF m23487h(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new RectF(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    /* renamed from: i */
    public static RectF m23486i(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: j */
    public static boolean m23485j(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        if (shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(rectF) == 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static float m23483l(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: m */
    public static float m23482m(float f, float f2, float f3, float f4, float f5) {
        return m23481n(f, f2, f3, f4, f5, false);
    }

    /* renamed from: n */
    public static float m23481n(float f, float f2, float f3, float f4, float f5, boolean z) {
        if (z && (f5 < 0.0f || f5 > 1.0f)) {
            return m23483l(f, f2, f5);
        }
        if (f5 < f3) {
            return f;
        }
        if (f5 > f4) {
            return f2;
        }
        return m23483l(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: o */
    public static int m23480o(int i, int i2, float f, float f2, float f3) {
        if (f3 < f) {
            return i;
        }
        if (f3 > f2) {
            return i2;
        }
        return (int) m23483l(i, i2, (f3 - f) / (f2 - f));
    }

    /* renamed from: p */
    public static ShapeAppearanceModel m23479p(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, float f, float f2, float f3) {
        if (f3 < f) {
            return shapeAppearanceModel;
        }
        if (f3 > f2) {
            return shapeAppearanceModel2;
        }
        return m23472w(shapeAppearanceModel, shapeAppearanceModel2, rectF, new C13188a(rectF, rectF2, f, f2, f3));
    }

    /* renamed from: q */
    public static boolean m23478q(Transition transition, Context context, int i) {
        int resolveThemeDuration;
        if (i != 0 && transition.getDuration() == -1 && (resolveThemeDuration = MotionUtils.resolveThemeDuration(context, i, -1)) != -1) {
            transition.setDuration(resolveThemeDuration);
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static boolean m23477r(Transition transition, Context context, int i, TimeInterpolator timeInterpolator) {
        if (i != 0 && transition.getInterpolator() == null) {
            transition.setInterpolator(MotionUtils.resolveThemeInterpolator(context, i, timeInterpolator));
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static boolean m23476s(Transition transition, Context context, int i) {
        PathMotion m23475t;
        if (i != 0 && (m23475t = m23475t(context, i)) != null) {
            transition.setPathMotion(m23475t);
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static PathMotion m23475t(Context context, int i) {
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

    /* renamed from: u */
    public static int m23474u(Canvas canvas, Rect rect, int i) {
        RectF rectF = f76984a;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i);
    }

    /* renamed from: v */
    public static void m23473v(Canvas canvas, Rect rect, float f, float f2, float f3, int i, CanvasCompat.CanvasOperation canvasOperation) {
        if (i <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        if (i < 255) {
            m23474u(canvas, rect, i);
        }
        canvasOperation.run(canvas);
        canvas.restoreToCount(save);
    }

    /* renamed from: w */
    public static ShapeAppearanceModel m23472w(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, InterfaceC13189b interfaceC13189b) {
        ShapeAppearanceModel shapeAppearanceModel3;
        if (m23485j(shapeAppearanceModel, rectF)) {
            shapeAppearanceModel3 = shapeAppearanceModel;
        } else {
            shapeAppearanceModel3 = shapeAppearanceModel2;
        }
        return shapeAppearanceModel3.toBuilder().setTopLeftCornerSize(interfaceC13189b.mo23471a(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel2.getTopLeftCornerSize())).setTopRightCornerSize(interfaceC13189b.mo23471a(shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel2.getTopRightCornerSize())).setBottomLeftCornerSize(interfaceC13189b.mo23471a(shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel2.getBottomLeftCornerSize())).setBottomRightCornerSize(interfaceC13189b.mo23471a(shapeAppearanceModel.getBottomRightCornerSize(), shapeAppearanceModel2.getBottomRightCornerSize())).build();
    }
}
