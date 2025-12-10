package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.transition.AbstractC5106c;
import java.util.Map;

/* loaded from: classes2.dex */
public class ChangeImageTransform extends Transition {

    /* renamed from: K */
    public static final String[] f37754K = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: L */
    public static final TypeEvaluator f37755L = new C5060a();

    /* renamed from: M */
    public static final Property f37756M = new C5061b(Matrix.class, "animatedTransform");

    /* renamed from: androidx.transition.ChangeImageTransform$a */
    /* loaded from: classes2.dex */
    public static class C5060a implements TypeEvaluator {
        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$b */
    /* loaded from: classes2.dex */
    public static class C5061b extends Property {
        public C5061b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(ImageView imageView, Matrix matrix) {
            AbstractC22887wd0.m692a(imageView, matrix);
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$c */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C5062c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37757a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f37757a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37757a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ChangeImageTransform() {
    }

    /* renamed from: C */
    private void m52647C(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = transitionValues.values;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put("android:changeImageTransform:matrix", m52645E(imageView));
        }
    }

    /* renamed from: D */
    public static Matrix m52646D(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f2 = intrinsicHeight;
        float max = Math.max(width / f, height / f2);
        int round = Math.round((width - (f * max)) / 2.0f);
        int round2 = Math.round((height - (f2 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate(round, round2);
        return matrix;
    }

    /* renamed from: E */
    public static Matrix m52645E(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i = C5062c.f37757a[imageView.getScaleType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return m52646D(imageView);
                }
            } else {
                return m52642H(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }

    /* renamed from: H */
    public static Matrix m52642H(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    /* renamed from: F */
    public final ObjectAnimator m52644F(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, f37756M, new AbstractC5106c.C5107a(), matrix, matrix2);
    }

    /* renamed from: G */
    public final ObjectAnimator m52643G(ImageView imageView) {
        Property property = f37756M;
        TypeEvaluator typeEvaluator = f37755L;
        Matrix matrix = AbstractC22756vr0.f108239a;
        return ObjectAnimator.ofObject(imageView, property, typeEvaluator, matrix, matrix);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        m52647C(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        m52647C(transitionValues);
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(@NonNull ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        boolean z;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues.values.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) transitionValues2.values.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) transitionValues.values.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) transitionValues2.values.get("android:changeImageTransform:matrix");
        if ((matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2))) {
            z = true;
        } else {
            z = false;
        }
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) transitionValues2.view;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            if (matrix == null) {
                matrix = AbstractC22756vr0.f108239a;
            }
            if (matrix2 == null) {
                matrix2 = AbstractC22756vr0.f108239a;
            }
            f37756M.set(imageView, matrix);
            return m52644F(imageView, matrix, matrix2);
        }
        return m52643G(imageView);
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return f37754K;
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}