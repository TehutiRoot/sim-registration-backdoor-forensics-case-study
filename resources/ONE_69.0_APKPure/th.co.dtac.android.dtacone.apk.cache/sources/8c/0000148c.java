package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.LabelFormatter;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: Va */
/* loaded from: classes4.dex */
public abstract class AbstractC1531Va extends View {

    /* renamed from: k0 */
    public static final String f6936k0 = "Va";

    /* renamed from: l0 */
    public static final int f6937l0 = R.style.Widget_MaterialComponents_Slider;

    /* renamed from: m0 */
    public static final int f6938m0 = R.attr.motionDurationMedium4;

    /* renamed from: n0 */
    public static final int f6939n0 = R.attr.motionDurationShort3;

    /* renamed from: o0 */
    public static final int f6940o0 = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: p0 */
    public static final int f6941p0 = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: A */
    public int f6942A;

    /* renamed from: B */
    public int f6943B;

    /* renamed from: C */
    public int f6944C;

    /* renamed from: D */
    public int f6945D;

    /* renamed from: E */
    public int f6946E;

    /* renamed from: F */
    public float f6947F;

    /* renamed from: G */
    public MotionEvent f6948G;

    /* renamed from: H */
    public LabelFormatter f6949H;

    /* renamed from: I */
    public boolean f6950I;

    /* renamed from: J */
    public float f6951J;

    /* renamed from: K */
    public float f6952K;

    /* renamed from: L */
    public ArrayList f6953L;

    /* renamed from: M */
    public int f6954M;

    /* renamed from: N */
    public int f6955N;

    /* renamed from: O */
    public float f6956O;

    /* renamed from: P */
    public float[] f6957P;

    /* renamed from: Q */
    public boolean f6958Q;

    /* renamed from: R */
    public int f6959R;

    /* renamed from: S */
    public int f6960S;

    /* renamed from: T */
    public int f6961T;

    /* renamed from: U */
    public boolean f6962U;

    /* renamed from: V */
    public boolean f6963V;

    /* renamed from: W */
    public boolean f6964W;

    /* renamed from: a */
    public final Paint f6965a;

    /* renamed from: a0 */
    public ColorStateList f6966a0;

    /* renamed from: b */
    public final Paint f6967b;

    /* renamed from: b0 */
    public ColorStateList f6968b0;

    /* renamed from: c */
    public final Paint f6969c;

    /* renamed from: c0 */
    public ColorStateList f6970c0;

    /* renamed from: d */
    public final Paint f6971d;

    /* renamed from: d0 */
    public ColorStateList f6972d0;

    /* renamed from: e */
    public final Paint f6973e;

    /* renamed from: e0 */
    public ColorStateList f6974e0;

    /* renamed from: f */
    public final Paint f6975f;

    /* renamed from: f0 */
    public final MaterialShapeDrawable f6976f0;

    /* renamed from: g */
    public final C1535d f6977g;

    /* renamed from: g0 */
    public Drawable f6978g0;

    /* renamed from: h */
    public final AccessibilityManager f6979h;

    /* renamed from: h0 */
    public List f6980h0;

    /* renamed from: i */
    public RunnableC1534c f6981i;

    /* renamed from: i0 */
    public float f6982i0;

    /* renamed from: j */
    public int f6983j;

    /* renamed from: j0 */
    public int f6984j0;

    /* renamed from: k */
    public final List f6985k;

    /* renamed from: l */
    public final List f6986l;

    /* renamed from: m */
    public final List f6987m;

    /* renamed from: n */
    public boolean f6988n;

    /* renamed from: o */
    public ValueAnimator f6989o;

    /* renamed from: p */
    public ValueAnimator f6990p;

    /* renamed from: q */
    public final int f6991q;

    /* renamed from: r */
    public int f6992r;

    /* renamed from: s */
    public int f6993s;

    /* renamed from: t */
    public int f6994t;

    /* renamed from: u */
    public int f6995u;

    /* renamed from: v */
    public int f6996v;

    /* renamed from: w */
    public int f6997w;

    /* renamed from: x */
    public int f6998x;

    /* renamed from: y */
    public int f6999y;

    /* renamed from: z */
    public int f7000z;

    /* renamed from: Va$a */
    /* loaded from: classes4.dex */
    public class C1532a implements ValueAnimator.AnimatorUpdateListener {
        public C1532a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (TooltipDrawable tooltipDrawable : AbstractC1531Va.this.f6985k) {
                tooltipDrawable.setRevealFraction(floatValue);
            }
            ViewCompat.postInvalidateOnAnimation(AbstractC1531Va.this);
        }
    }

    /* renamed from: Va$b */
    /* loaded from: classes4.dex */
    public class C1533b extends AnimatorListenerAdapter {
        public C1533b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(AbstractC1531Va.this);
            for (TooltipDrawable tooltipDrawable : AbstractC1531Va.this.f6985k) {
                contentViewOverlay.remove(tooltipDrawable);
            }
        }
    }

    /* renamed from: Va$d */
    /* loaded from: classes4.dex */
    public static class C1535d extends ExploreByTouchHelper {

        /* renamed from: q */
        public final AbstractC1531Va f7005q;

        /* renamed from: r */
        public final Rect f7006r;

        public C1535d(AbstractC1531Va abstractC1531Va) {
            super(abstractC1531Va);
            this.f7006r = new Rect();
            this.f7005q = abstractC1531Va;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f, float f2) {
            for (int i = 0; i < this.f7005q.getValues().size(); i++) {
                this.f7005q.m65924k0(i, this.f7006r);
                if (this.f7006r.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(List list) {
            for (int i = 0; i < this.f7005q.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (!this.f7005q.isEnabled()) {
                return false;
            }
            if (i2 == 4096 || i2 == 8192) {
                float m65925k = this.f7005q.m65925k(20);
                if (i2 == 8192) {
                    m65925k = -m65925k;
                }
                if (this.f7005q.m65959M()) {
                    m65925k = -m65925k;
                }
                if (this.f7005q.m65928i0(i, MathUtils.clamp(this.f7005q.getValues().get(i).floatValue() + m65925k, this.f7005q.getValueFrom(), this.f7005q.getValueTo()))) {
                    this.f7005q.m65922l0();
                    this.f7005q.postInvalidate();
                    invalidateVirtualView(i);
                    return true;
                }
                return false;
            }
            if (i2 == 16908349 && bundle != null && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)) {
                if (this.f7005q.m65928i0(i, bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE))) {
                    this.f7005q.m65922l0();
                    this.f7005q.postInvalidate();
                    invalidateVirtualView(i);
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            List<Float> values = this.f7005q.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.f7005q.getValueFrom();
            float valueTo = this.f7005q.getValueTo();
            if (this.f7005q.isEnabled()) {
                if (floatValue > valueFrom) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (floatValue < valueTo) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, valueFrom, valueTo, floatValue));
            accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f7005q.getContentDescription() != null) {
                sb.append(this.f7005q.getContentDescription());
                sb.append(",");
            }
            String m65897z = this.f7005q.m65897z(floatValue);
            String string = this.f7005q.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                string = m65895x(i);
            }
            sb.append(String.format(Locale.US, "%s, %s", string, m65897z));
            accessibilityNodeInfoCompat.setContentDescription(sb.toString());
            this.f7005q.m65924k0(i, this.f7006r);
            accessibilityNodeInfoCompat.setBoundsInParent(this.f7006r);
        }

        /* renamed from: x */
        public final String m65895x(int i) {
            if (i == this.f7005q.getValues().size() - 1) {
                return this.f7005q.getContext().getString(R.string.material_slider_range_end);
            }
            if (i == 0) {
                return this.f7005q.getContext().getString(R.string.material_slider_range_start);
            }
            return "";
        }
    }

    /* renamed from: Va$e */
    /* loaded from: classes4.dex */
    public static class C1536e extends View.BaseSavedState {
        public static final Parcelable.Creator<C1536e> CREATOR = new C1537a();

        /* renamed from: a */
        public float f7007a;

        /* renamed from: b */
        public float f7008b;

        /* renamed from: c */
        public ArrayList f7009c;

        /* renamed from: d */
        public float f7010d;

        /* renamed from: e */
        public boolean f7011e;

        /* renamed from: Va$e$a */
        /* loaded from: classes4.dex */
        public class C1537a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1536e createFromParcel(Parcel parcel) {
                return new C1536e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C1536e[] newArray(int i) {
                return new C1536e[i];
            }
        }

        public /* synthetic */ C1536e(Parcel parcel, C1532a c1532a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f7007a);
            parcel.writeFloat(this.f7008b);
            parcel.writeList(this.f7009c);
            parcel.writeFloat(this.f7010d);
            parcel.writeBooleanArray(new boolean[]{this.f7011e});
        }

        public C1536e(Parcelable parcelable) {
            super(parcelable);
        }

        public C1536e(Parcel parcel) {
            super(parcel);
            this.f7007a = parcel.readFloat();
            this.f7008b = parcel.readFloat();
            ArrayList arrayList = new ArrayList();
            this.f7009c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f7010d = parcel.readFloat();
            this.f7011e = parcel.createBooleanArray()[0];
        }
    }

    public AbstractC1531Va(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, f6937l0), attributeSet, i);
        this.f6985k = new ArrayList();
        this.f6986l = new ArrayList();
        this.f6987m = new ArrayList();
        this.f6988n = false;
        this.f6950I = false;
        this.f6953L = new ArrayList();
        this.f6954M = -1;
        this.f6955N = -1;
        this.f6956O = 0.0f;
        this.f6958Q = true;
        this.f6963V = false;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f6976f0 = materialShapeDrawable;
        this.f6980h0 = Collections.emptyList();
        this.f6984j0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f6965a = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.f6967b = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.f6969c = paint3;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f6971d = paint4;
        paint4.setStyle(style2);
        Paint paint5 = new Paint();
        this.f6973e = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Paint paint6 = new Paint();
        this.f6975f = paint6;
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        m65958N(context2.getResources());
        m65944a0(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.f6991q = ViewConfiguration.get(context2).getScaledTouchSlop();
        C1535d c1535d = new C1535d(this);
        this.f6977g = c1535d;
        ViewCompat.setAccessibilityDelegate(this, c1535d);
        this.f6979h = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    /* renamed from: B */
    public static float m65970B(ValueAnimator valueAnimator, float f) {
        if (valueAnimator != null && valueAnimator.isRunning()) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
            return floatValue;
        }
        return f;
    }

    /* renamed from: J */
    public static boolean m65962J(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    public static int m65946Z(float[] fArr, float f) {
        return Math.round(f * ((fArr.length / 2) - 1));
    }

    /* renamed from: A */
    public final float[] m65971A() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f6953L.size() == 1) {
            floatValue2 = this.f6951J;
        }
        float m65950V = m65950V(floatValue2);
        float m65950V2 = m65950V(floatValue);
        return m65959M() ? new float[]{m65950V2, m65950V} : new float[]{m65950V, m65950V2};
    }

    /* renamed from: C */
    public final float m65969C(int i, float f) {
        float floatValue;
        float floatValue2;
        float minSeparation = getMinSeparation();
        if (this.f6984j0 == 0) {
            minSeparation = m65915p(minSeparation);
        }
        if (m65959M()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        if (i2 >= this.f6953L.size()) {
            floatValue = this.f6952K;
        } else {
            floatValue = ((Float) this.f6953L.get(i2)).floatValue() - minSeparation;
        }
        int i3 = i - 1;
        if (i3 < 0) {
            floatValue2 = this.f6951J;
        } else {
            floatValue2 = ((Float) this.f6953L.get(i3)).floatValue() + minSeparation;
        }
        return MathUtils.clamp(f, floatValue2, floatValue);
    }

    /* renamed from: D */
    public final int m65968D(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* renamed from: E */
    public final float m65967E() {
        double m65930h0 = m65930h0(this.f6982i0);
        if (m65959M()) {
            m65930h0 = 1.0d - m65930h0;
        }
        float f = this.f6952K;
        float f2 = this.f6951J;
        return (float) ((m65930h0 * (f - f2)) + f2);
    }

    /* renamed from: F */
    public final float m65966F() {
        float f = this.f6982i0;
        if (m65959M()) {
            f = 1.0f - f;
        }
        float f2 = this.f6952K;
        float f3 = this.f6951J;
        return (f * (f2 - f3)) + f3;
    }

    /* renamed from: G */
    public final Drawable m65965G(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        m65933g(newDrawable);
        return newDrawable;
    }

    /* renamed from: H */
    public final void m65964H() {
        this.f6965a.setStrokeWidth(this.f6942A);
        this.f6967b.setStrokeWidth(this.f6942A);
    }

    /* renamed from: I */
    public final boolean m65963I() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public final boolean m65961K(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.f6956O)), MathContext.DECIMAL64).doubleValue();
        if (Math.abs(Math.round(doubleValue) - doubleValue) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m65960L(MotionEvent motionEvent) {
        if (!m65962J(motionEvent) && m65963I()) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final boolean m65959M() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final void m65958N(Resources resources) {
        this.f6998x = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f6992r = dimensionPixelOffset;
        this.f6943B = dimensionPixelOffset;
        this.f6993s = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f6994t = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f6995u = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f6996v = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f6946E = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
    }

    /* renamed from: O */
    public final void m65957O() {
        if (this.f6956O <= 0.0f) {
            return;
        }
        m65916o0();
        int min = Math.min((int) (((this.f6952K - this.f6951J) / this.f6956O) + 1.0f), (this.f6961T / (this.f6942A * 2)) + 1);
        float[] fArr = this.f6957P;
        if (fArr == null || fArr.length != min * 2) {
            this.f6957P = new float[min * 2];
        }
        float f = this.f6961T / (min - 1);
        for (int i = 0; i < min * 2; i += 2) {
            float[] fArr2 = this.f6957P;
            fArr2[i] = this.f6943B + ((i / 2.0f) * f);
            fArr2[i + 1] = m65923l();
        }
    }

    /* renamed from: P */
    public final void m65956P(Canvas canvas, int i, int i2) {
        if (m65934f0()) {
            int m65950V = (int) (this.f6943B + (m65950V(((Float) this.f6953L.get(this.f6955N)).floatValue()) * i));
            if (Build.VERSION.SDK_INT < 28) {
                int i3 = this.f6945D;
                canvas.clipRect(m65950V - i3, i2 - i3, m65950V + i3, i3 + i2, Region.Op.UNION);
            }
            canvas.drawCircle(m65950V, i2, this.f6945D, this.f6971d);
        }
    }

    /* renamed from: Q */
    public final void m65955Q(Canvas canvas) {
        if (this.f6958Q && this.f6956O > 0.0f) {
            float[] m65971A = m65971A();
            int m65946Z = m65946Z(this.f6957P, m65971A[0]);
            int m65946Z2 = m65946Z(this.f6957P, m65971A[1]);
            int i = m65946Z * 2;
            canvas.drawPoints(this.f6957P, 0, i, this.f6973e);
            int i2 = m65946Z2 * 2;
            canvas.drawPoints(this.f6957P, i, i2 - i, this.f6975f);
            float[] fArr = this.f6957P;
            canvas.drawPoints(fArr, i2, fArr.length - i2, this.f6973e);
        }
    }

    /* renamed from: R */
    public final boolean m65954R() {
        int max = this.f6992r + Math.max(Math.max(Math.max(this.f6944C - this.f6993s, 0), Math.max((this.f6942A - this.f6994t) / 2, 0)), Math.max(Math.max(this.f6959R - this.f6995u, 0), Math.max(this.f6960S - this.f6996v, 0)));
        if (this.f6943B == max) {
            return false;
        }
        this.f6943B = max;
        if (ViewCompat.isLaidOut(this)) {
            m65920m0(getWidth());
            return true;
        }
        return true;
    }

    /* renamed from: S */
    public final boolean m65953S() {
        int max = Math.max(this.f6998x, Math.max(this.f6942A + getPaddingTop() + getPaddingBottom(), (this.f6944C * 2) + getPaddingTop() + getPaddingBottom()));
        if (max == this.f6999y) {
            return false;
        }
        this.f6999y = max;
        return true;
    }

    /* renamed from: T */
    public final boolean m65952T(int i) {
        int i2 = this.f6955N;
        int clamp = (int) MathUtils.clamp(i2 + i, 0L, this.f6953L.size() - 1);
        this.f6955N = clamp;
        if (clamp == i2) {
            return false;
        }
        if (this.f6954M != -1) {
            this.f6954M = clamp;
        }
        m65922l0();
        postInvalidate();
        return true;
    }

    /* renamed from: U */
    public final boolean m65951U(int i) {
        if (m65959M()) {
            if (i == Integer.MIN_VALUE) {
                i = Integer.MAX_VALUE;
            } else {
                i = -i;
            }
        }
        return m65952T(i);
    }

    /* renamed from: V */
    public final float m65950V(float f) {
        float f2 = this.f6951J;
        float f3 = (f - f2) / (this.f6952K - f2);
        if (m65959M()) {
            return 1.0f - f3;
        }
        return f3;
    }

    /* renamed from: W */
    public final Boolean m65949W(int i, KeyEvent keyEvent) {
        if (i != 61) {
            if (i != 66) {
                if (i != 81) {
                    if (i != 69) {
                        if (i != 70) {
                            switch (i) {
                                case 21:
                                    m65951U(-1);
                                    return Boolean.TRUE;
                                case 22:
                                    m65951U(1);
                                    return Boolean.TRUE;
                                case 23:
                                    break;
                                default:
                                    return null;
                            }
                        }
                    } else {
                        m65952T(-1);
                        return Boolean.TRUE;
                    }
                }
                m65952T(1);
                return Boolean.TRUE;
            }
            this.f6954M = this.f6955N;
            postInvalidate();
            return Boolean.TRUE;
        } else if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(m65952T(1));
        } else {
            if (keyEvent.isShiftPressed()) {
                return Boolean.valueOf(m65952T(-1));
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: X */
    public final void m65948X() {
        for (BaseOnSliderTouchListener baseOnSliderTouchListener : this.f6987m) {
            baseOnSliderTouchListener.onStartTrackingTouch(this);
        }
    }

    /* renamed from: Y */
    public final void m65947Y() {
        for (BaseOnSliderTouchListener baseOnSliderTouchListener : this.f6987m) {
            baseOnSliderTouchListener.onStopTrackingTouch(this);
        }
    }

    /* renamed from: a0 */
    public final void m65944a0(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Slider, i, f6937l0, new int[0]);
        this.f6983j = obtainStyledAttributes.getResourceId(R.styleable.Slider_labelStyle, R.style.Widget_MaterialComponents_Tooltip);
        this.f6951J = obtainStyledAttributes.getFloat(R.styleable.Slider_android_valueFrom, 0.0f);
        this.f6952K = obtainStyledAttributes.getFloat(R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f6951J));
        this.f6956O = obtainStyledAttributes.getFloat(R.styleable.Slider_android_stepSize, 0.0f);
        this.f6997w = (int) Math.ceil(obtainStyledAttributes.getDimension(R.styleable.Slider_minTouchTargetSize, (float) Math.ceil(ViewUtils.dpToPx(getContext(), 48))));
        boolean hasValue = obtainStyledAttributes.hasValue(R.styleable.Slider_trackColor);
        if (hasValue) {
            i2 = R.styleable.Slider_trackColor;
        } else {
            i2 = R.styleable.Slider_trackColorInactive;
        }
        if (hasValue) {
            i3 = R.styleable.Slider_trackColor;
        } else {
            i3 = R.styleable.Slider_trackColorActive;
        }
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, obtainStyledAttributes, i2);
        if (colorStateList == null) {
            colorStateList = AppCompatResources.getColorStateList(context, R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateList);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, obtainStyledAttributes, i3);
        if (colorStateList2 == null) {
            colorStateList2 = AppCompatResources.getColorStateList(context, R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateList2);
        this.f6976f0.setFillColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.Slider_thumbColor));
        if (obtainStyledAttributes.hasValue(R.styleable.Slider_thumbStrokeColor)) {
            setThumbStrokeColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.Slider_thumbStrokeColor));
        }
        setThumbStrokeWidth(obtainStyledAttributes.getDimension(R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.Slider_haloColor);
        if (colorStateList3 == null) {
            colorStateList3 = AppCompatResources.getColorStateList(context, R.color.material_slider_halo_color);
        }
        setHaloTintList(colorStateList3);
        this.f6958Q = obtainStyledAttributes.getBoolean(R.styleable.Slider_tickVisible, true);
        boolean hasValue2 = obtainStyledAttributes.hasValue(R.styleable.Slider_tickColor);
        if (hasValue2) {
            i4 = R.styleable.Slider_tickColor;
        } else {
            i4 = R.styleable.Slider_tickColorInactive;
        }
        if (hasValue2) {
            i5 = R.styleable.Slider_tickColor;
        } else {
            i5 = R.styleable.Slider_tickColorActive;
        }
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context, obtainStyledAttributes, i4);
        if (colorStateList4 == null) {
            colorStateList4 = AppCompatResources.getColorStateList(context, R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateList4);
        ColorStateList colorStateList5 = MaterialResources.getColorStateList(context, obtainStyledAttributes, i5);
        if (colorStateList5 == null) {
            colorStateList5 = AppCompatResources.getColorStateList(context, R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateList5);
        setThumbRadius(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbRadius, 0));
        setHaloRadius(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_haloRadius, 0));
        setThumbElevation(obtainStyledAttributes.getDimension(R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackHeight, 0));
        setTickActiveRadius(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusActive, 0));
        setTickInactiveRadius(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusInactive, 0));
        setLabelBehavior(obtainStyledAttributes.getInt(R.styleable.Slider_labelBehavior, 0));
        if (!obtainStyledAttributes.getBoolean(R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        obtainStyledAttributes.recycle();
    }

    public void addOnChangeListener(BaseOnChangeListener baseOnChangeListener) {
        this.f6986l.add(baseOnChangeListener);
    }

    public void addOnSliderTouchListener(BaseOnSliderTouchListener baseOnSliderTouchListener) {
        this.f6987m.add(baseOnSliderTouchListener);
    }

    /* renamed from: b0 */
    public final void m65942b0(int i) {
        RunnableC1534c runnableC1534c = this.f6981i;
        if (runnableC1534c == null) {
            this.f6981i = new RunnableC1534c(this, null);
        } else {
            removeCallbacks(runnableC1534c);
        }
        this.f6981i.m65896a(i);
        postDelayed(this.f6981i, 200L);
    }

    /* renamed from: c0 */
    public final void m65940c0(TooltipDrawable tooltipDrawable, float f) {
        tooltipDrawable.setText(m65897z(f));
        int m65950V = (this.f6943B + ((int) (m65950V(f) * this.f6961T))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        int m65923l = m65923l() - (this.f6946E + this.f6944C);
        tooltipDrawable.setBounds(m65950V, m65923l - tooltipDrawable.getIntrinsicHeight(), tooltipDrawable.getIntrinsicWidth() + m65950V, m65923l);
        Rect rect = new Rect(tooltipDrawable.getBounds());
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, rect);
        tooltipDrawable.setBounds(rect);
        ViewUtils.getContentViewOverlay(this).add(tooltipDrawable);
    }

    public void clearOnChangeListeners() {
        this.f6986l.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.f6987m.clear();
    }

    /* renamed from: d0 */
    public final void m65938d0(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f6953L.size() == arrayList.size() && this.f6953L.equals(arrayList)) {
                return;
            }
            this.f6953L = arrayList;
            this.f6964W = true;
            this.f6955N = 0;
            m65922l0();
            m65919n();
            m65911r();
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f6977g.dispatchHoverEvent(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f6965a.setColor(m65968D(this.f6974e0));
        this.f6967b.setColor(m65968D(this.f6972d0));
        this.f6973e.setColor(m65968D(this.f6970c0));
        this.f6975f.setColor(m65968D(this.f6968b0));
        for (TooltipDrawable tooltipDrawable : this.f6985k) {
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        if (this.f6976f0.isStateful()) {
            this.f6976f0.setState(getDrawableState());
        }
        this.f6971d.setColor(m65968D(this.f6966a0));
        this.f6971d.setAlpha(63);
    }

    /* renamed from: e0 */
    public final boolean m65936e0() {
        if (this.f7000z == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public final boolean m65934f0() {
        if (!this.f6962U && (getBackground() instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void m65933g(Drawable drawable) {
        int i = this.f6944C * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
            return;
        }
        float max = i / Math.max(intrinsicWidth, intrinsicHeight);
        drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
    }

    /* renamed from: g0 */
    public final boolean m65932g0(float f) {
        return m65928i0(this.f6954M, f);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f6977g.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.f6954M;
    }

    public int getFocusedThumbIndex() {
        return this.f6955N;
    }

    public int getHaloRadius() {
        return this.f6945D;
    }

    public ColorStateList getHaloTintList() {
        return this.f6966a0;
    }

    public int getLabelBehavior() {
        return this.f7000z;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f6956O;
    }

    public float getThumbElevation() {
        return this.f6976f0.getElevation();
    }

    public int getThumbRadius() {
        return this.f6944C;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f6976f0.getStrokeColor();
    }

    public float getThumbStrokeWidth() {
        return this.f6976f0.getStrokeWidth();
    }

    public ColorStateList getThumbTintList() {
        return this.f6976f0.getFillColor();
    }

    public int getTickActiveRadius() {
        return this.f6959R;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f6968b0;
    }

    public int getTickInactiveRadius() {
        return this.f6960S;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f6970c0;
    }

    public ColorStateList getTickTintList() {
        if (this.f6970c0.equals(this.f6968b0)) {
            return this.f6968b0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f6972d0;
    }

    public int getTrackHeight() {
        return this.f6942A;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f6974e0;
    }

    public int getTrackSidePadding() {
        return this.f6943B;
    }

    public ColorStateList getTrackTintList() {
        if (this.f6974e0.equals(this.f6972d0)) {
            return this.f6972d0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f6961T;
    }

    public float getValueFrom() {
        return this.f6951J;
    }

    public float getValueTo() {
        return this.f6952K;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.f6953L);
    }

    /* renamed from: h */
    public final void m65931h(TooltipDrawable tooltipDrawable) {
        tooltipDrawable.setRelativeToView(ViewUtils.getContentView(this));
    }

    /* renamed from: h0 */
    public final double m65930h0(float f) {
        float f2 = this.f6956O;
        if (f2 > 0.0f) {
            int i = (int) ((this.f6952K - this.f6951J) / f2);
            return Math.round(f * i) / i;
        }
        return f;
    }

    public boolean hasLabelFormatter() {
        if (this.f6949H != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final Float m65929i(int i) {
        float m65927j;
        if (this.f6963V) {
            m65927j = m65925k(20);
        } else {
            m65927j = m65927j();
        }
        if (i != 21) {
            if (i != 22) {
                if (i != 69) {
                    if (i != 70 && i != 81) {
                        return null;
                    }
                    return Float.valueOf(m65927j);
                }
                return Float.valueOf(-m65927j);
            }
            if (m65959M()) {
                m65927j = -m65927j;
            }
            return Float.valueOf(m65927j);
        }
        if (!m65959M()) {
            m65927j = -m65927j;
        }
        return Float.valueOf(m65927j);
    }

    /* renamed from: i0 */
    public final boolean m65928i0(int i, float f) {
        this.f6955N = i;
        if (Math.abs(f - ((Float) this.f6953L.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.f6953L.set(i, Float.valueOf(m65969C(i, f)));
        m65913q(i);
        return true;
    }

    public boolean isTickVisible() {
        return this.f6958Q;
    }

    /* renamed from: j */
    public final float m65927j() {
        float f = this.f6956O;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: j0 */
    public final boolean m65926j0() {
        return m65932g0(m65967E());
    }

    /* renamed from: k */
    public final float m65925k(int i) {
        float f;
        float f2;
        float m65927j = m65927j();
        if ((this.f6952K - this.f6951J) / m65927j <= i) {
            return m65927j;
        }
        return Math.round(f / f2) * m65927j;
    }

    /* renamed from: k0 */
    public void m65924k0(int i, Rect rect) {
        int m65950V = this.f6943B + ((int) (m65950V(getValues().get(i).floatValue()) * this.f6961T));
        int m65923l = m65923l();
        int i2 = this.f6944C;
        int i3 = this.f6997w;
        if (i2 <= i3) {
            i2 = i3;
        }
        int i4 = i2 / 2;
        rect.set(m65950V - i4, m65923l - i4, m65950V + i4, m65923l + i4);
    }

    /* renamed from: l */
    public final int m65923l() {
        int i = this.f6999y / 2;
        int i2 = 0;
        if (this.f7000z == 1 || m65936e0()) {
            i2 = ((TooltipDrawable) this.f6985k.get(0)).getIntrinsicHeight();
        }
        return i + i2;
    }

    /* renamed from: l0 */
    public final void m65922l0() {
        if (!m65934f0() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int m65950V = (int) ((m65950V(((Float) this.f6953L.get(this.f6955N)).floatValue()) * this.f6961T) + this.f6943B);
                int m65923l = m65923l();
                int i = this.f6945D;
                DrawableCompat.setHotspotBounds(background, m65950V - i, m65923l - i, m65950V + i, m65923l + i);
            }
        }
    }

    /* renamed from: m */
    public final ValueAnimator m65921m(boolean z) {
        float f;
        ValueAnimator valueAnimator;
        int resolveThemeDuration;
        TimeInterpolator resolveThemeInterpolator;
        float f2 = 1.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (z) {
            valueAnimator = this.f6990p;
        } else {
            valueAnimator = this.f6989o;
        }
        float m65970B = m65970B(valueAnimator, f);
        if (!z) {
            f2 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m65970B, f2);
        if (z) {
            resolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), f6938m0, 83);
            resolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), f6940o0, AnimationUtils.DECELERATE_INTERPOLATOR);
        } else {
            resolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), f6939n0, 117);
            resolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), f6941p0, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        }
        ofFloat.setDuration(resolveThemeDuration);
        ofFloat.setInterpolator(resolveThemeInterpolator);
        ofFloat.addUpdateListener(new C1532a());
        return ofFloat;
    }

    /* renamed from: m0 */
    public final void m65920m0(int i) {
        this.f6961T = Math.max(i - (this.f6943B * 2), 0);
        m65957O();
    }

    /* renamed from: n */
    public final void m65919n() {
        int i;
        if (this.f6985k.size() > this.f6953L.size()) {
            List<TooltipDrawable> subList = this.f6985k.subList(this.f6953L.size(), this.f6985k.size());
            for (TooltipDrawable tooltipDrawable : subList) {
                if (ViewCompat.isAttachedToWindow(this)) {
                    m65917o(tooltipDrawable);
                }
            }
            subList.clear();
        }
        while (true) {
            i = 0;
            if (this.f6985k.size() >= this.f6953L.size()) {
                break;
            }
            TooltipDrawable createFromAttributes = TooltipDrawable.createFromAttributes(getContext(), null, 0, this.f6983j);
            this.f6985k.add(createFromAttributes);
            if (ViewCompat.isAttachedToWindow(this)) {
                m65931h(createFromAttributes);
            }
        }
        if (this.f6985k.size() != 1) {
            i = 1;
        }
        for (TooltipDrawable tooltipDrawable2 : this.f6985k) {
            tooltipDrawable2.setStrokeWidth(i);
        }
    }

    /* renamed from: n0 */
    public final void m65918n0() {
        boolean m65953S = m65953S();
        boolean m65954R = m65954R();
        if (m65953S) {
            requestLayout();
        } else if (m65954R) {
            postInvalidate();
        }
    }

    /* renamed from: o */
    public final void m65917o(TooltipDrawable tooltipDrawable) {
        ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(this);
        if (contentViewOverlay != null) {
            contentViewOverlay.remove(tooltipDrawable);
            tooltipDrawable.detachView(ViewUtils.getContentView(this));
        }
    }

    /* renamed from: o0 */
    public final void m65916o0() {
        if (this.f6964W) {
            m65910r0();
            m65908s0();
            m65912q0();
            m65906t0();
            m65914p0();
            m65900w0();
            this.f6964W = false;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (TooltipDrawable tooltipDrawable : this.f6985k) {
            m65931h(tooltipDrawable);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        RunnableC1534c runnableC1534c = this.f6981i;
        if (runnableC1534c != null) {
            removeCallbacks(runnableC1534c);
        }
        this.f6988n = false;
        for (TooltipDrawable tooltipDrawable : this.f6985k) {
            m65917o(tooltipDrawable);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.f6964W) {
            m65916o0();
            m65957O();
        }
        super.onDraw(canvas);
        int m65923l = m65923l();
        m65907t(canvas, this.f6961T, m65923l);
        if (((Float) Collections.max(getValues())).floatValue() > this.f6951J) {
            m65909s(canvas, this.f6961T, m65923l);
        }
        m65955Q(canvas);
        if ((this.f6950I || isFocused()) && isEnabled()) {
            m65956P(canvas, this.f6961T, m65923l);
        }
        if ((this.f6954M != -1 || m65936e0()) && isEnabled()) {
            m65901w();
        } else {
            m65899x();
        }
        m65903v(canvas, this.f6961T, m65923l);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.f6954M = -1;
            this.f6977g.clearKeyboardFocusForVirtualView(this.f6955N);
            return;
        }
        m65898y(i);
        this.f6977g.requestKeyboardFocusForVirtualView(this.f6955N);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f6953L.size() == 1) {
            this.f6954M = 0;
        }
        if (this.f6954M == -1) {
            Boolean m65949W = m65949W(i, keyEvent);
            if (m65949W != null) {
                return m65949W.booleanValue();
            }
            return super.onKeyDown(i, keyEvent);
        }
        this.f6963V |= keyEvent.isLongPress();
        Float m65929i = m65929i(i);
        if (m65929i != null) {
            if (m65932g0(((Float) this.f6953L.get(this.f6954M)).floatValue() + m65929i.floatValue())) {
                m65922l0();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return m65952T(1);
            } else {
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return m65952T(-1);
            }
        }
        this.f6954M = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f6963V = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.f6999y;
        int i4 = 0;
        if (this.f7000z == 1 || m65936e0()) {
            i4 = ((TooltipDrawable) this.f6985k.get(0)).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C1536e c1536e = (C1536e) parcelable;
        super.onRestoreInstanceState(c1536e.getSuperState());
        this.f6951J = c1536e.f7007a;
        this.f6952K = c1536e.f7008b;
        m65938d0(c1536e.f7009c);
        this.f6956O = c1536e.f7010d;
        if (c1536e.f7011e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1536e c1536e = new C1536e(super.onSaveInstanceState());
        c1536e.f7007a = this.f6951J;
        c1536e.f7008b = this.f6952K;
        c1536e.f7009c = new ArrayList(this.f6953L);
        c1536e.f7010d = this.f6956O;
        c1536e.f7011e = hasFocus();
        return c1536e;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m65920m0(i);
        m65922l0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r2 != 3) goto L12;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC1531Va.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        ViewOverlayImpl contentViewOverlay;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (contentViewOverlay = ViewUtils.getContentViewOverlay(this)) == null) {
            return;
        }
        for (TooltipDrawable tooltipDrawable : this.f6985k) {
            contentViewOverlay.remove(tooltipDrawable);
        }
    }

    /* renamed from: p */
    public final float m65915p(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - this.f6943B) / this.f6961T;
        float f3 = this.f6951J;
        return (f2 * (f3 - this.f6952K)) + f3;
    }

    /* renamed from: p0 */
    public final void m65914p0() {
        float minSeparation = getMinSeparation();
        if (minSeparation >= 0.0f) {
            float f = this.f6956O;
            if (f > 0.0f && minSeparation > 0.0f) {
                if (this.f6984j0 == 1) {
                    if (minSeparation < f || !m65961K(minSeparation)) {
                        throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f6956O), Float.valueOf(this.f6956O)));
                    }
                    return;
                }
                throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f6956O)));
            }
            return;
        }
        throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
    }

    public boolean pickActiveThumb() {
        boolean z;
        if (this.f6954M != -1) {
            return true;
        }
        float m65966F = m65966F();
        float m65902v0 = m65902v0(m65966F);
        this.f6954M = 0;
        float abs = Math.abs(((Float) this.f6953L.get(0)).floatValue() - m65966F);
        for (int i = 1; i < this.f6953L.size(); i++) {
            float abs2 = Math.abs(((Float) this.f6953L.get(i)).floatValue() - m65966F);
            float m65902v02 = m65902v0(((Float) this.f6953L.get(i)).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            if (!m65959M() ? m65902v02 - m65902v0 < 0.0f : m65902v02 - m65902v0 > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.f6954M = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(m65902v02 - m65902v0) < this.f6991q) {
                    this.f6954M = -1;
                    return false;
                } else if (z) {
                    this.f6954M = i;
                }
            }
            abs = abs2;
        }
        if (this.f6954M != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final void m65913q(int i) {
        for (BaseOnChangeListener baseOnChangeListener : this.f6986l) {
            baseOnChangeListener.onValueChange(this, ((Float) this.f6953L.get(i)).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f6979h;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            m65942b0(i);
        }
    }

    /* renamed from: q0 */
    public final void m65912q0() {
        if (this.f6956O > 0.0f && !m65904u0(this.f6952K)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.f6956O), Float.valueOf(this.f6951J), Float.valueOf(this.f6952K)));
        }
    }

    /* renamed from: r */
    public final void m65911r() {
        for (BaseOnChangeListener baseOnChangeListener : this.f6986l) {
            Iterator it = this.f6953L.iterator();
            while (it.hasNext()) {
                baseOnChangeListener.onValueChange(this, ((Float) it.next()).floatValue(), false);
            }
        }
    }

    /* renamed from: r0 */
    public final void m65910r0() {
        if (this.f6951J < this.f6952K) {
            return;
        }
        throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.f6951J), Float.valueOf(this.f6952K)));
    }

    public void removeOnChangeListener(BaseOnChangeListener baseOnChangeListener) {
        this.f6986l.remove(baseOnChangeListener);
    }

    public void removeOnSliderTouchListener(BaseOnSliderTouchListener baseOnSliderTouchListener) {
        this.f6987m.remove(baseOnSliderTouchListener);
    }

    /* renamed from: s */
    public final void m65909s(Canvas canvas, int i, int i2) {
        float[] m65971A = m65971A();
        int i3 = this.f6943B;
        float f = i;
        float f2 = i2;
        canvas.drawLine(i3 + (m65971A[0] * f), f2, i3 + (m65971A[1] * f), f2, this.f6967b);
    }

    /* renamed from: s0 */
    public final void m65908s0() {
        if (this.f6952K > this.f6951J) {
            return;
        }
        throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.f6952K), Float.valueOf(this.f6951J)));
    }

    public void setActiveThumbIndex(int i) {
        this.f6954M = i;
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (z) {
            i = 0;
        } else {
            i = 2;
        }
        setLayerType(i, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i >= 0 && i < this.f6953L.size()) {
            this.f6955N = i;
            this.f6977g.requestKeyboardFocusForVirtualView(i);
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("index out of range");
    }

    public void setHaloRadius(int i) {
        if (i == this.f6945D) {
            return;
        }
        this.f6945D = i;
        Drawable background = getBackground();
        if (!m65934f0() && (background instanceof RippleDrawable)) {
            DrawableUtils.setRippleDrawableRadius((RippleDrawable) background, this.f6945D);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f6966a0)) {
            return;
        }
        this.f6966a0 = colorStateList;
        Drawable background = getBackground();
        if (!m65934f0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f6971d.setColor(m65968D(colorStateList));
        this.f6971d.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.f7000z != i) {
            this.f7000z = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(LabelFormatter labelFormatter) {
        this.f6949H = labelFormatter;
    }

    public void setSeparationUnit(int i) {
        this.f6984j0 = i;
        this.f6964W = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.f6956O != f) {
                this.f6956O = f;
                this.f6964W = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f), Float.valueOf(this.f6951J), Float.valueOf(this.f6952K)));
    }

    public void setThumbElevation(float f) {
        this.f6976f0.setElevation(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(int i) {
        if (i == this.f6944C) {
            return;
        }
        this.f6944C = i;
        this.f6976f0.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCorners(0, this.f6944C).build());
        MaterialShapeDrawable materialShapeDrawable = this.f6976f0;
        int i2 = this.f6944C;
        materialShapeDrawable.setBounds(0, 0, i2 * 2, i2 * 2);
        Drawable drawable = this.f6978g0;
        if (drawable != null) {
            m65933g(drawable);
        }
        for (Drawable drawable2 : this.f6980h0) {
            m65933g(drawable2);
        }
        m65918n0();
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f6976f0.setStrokeColor(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.f6976f0.setStrokeWidth(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f6976f0.getFillColor())) {
            return;
        }
        this.f6976f0.setFillColor(colorStateList);
        invalidate();
    }

    public void setTickActiveRadius(int i) {
        if (this.f6959R != i) {
            this.f6959R = i;
            this.f6975f.setStrokeWidth(i * 2);
            m65918n0();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f6968b0)) {
            return;
        }
        this.f6968b0 = colorStateList;
        this.f6975f.setColor(m65968D(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(int i) {
        if (this.f6960S != i) {
            this.f6960S = i;
            this.f6973e.setStrokeWidth(i * 2);
            m65918n0();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f6970c0)) {
            return;
        }
        this.f6970c0 = colorStateList;
        this.f6973e.setColor(m65968D(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f6958Q != z) {
            this.f6958Q = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f6972d0)) {
            return;
        }
        this.f6972d0 = colorStateList;
        this.f6967b.setColor(m65968D(colorStateList));
        invalidate();
    }

    public void setTrackHeight(int i) {
        if (this.f6942A != i) {
            this.f6942A = i;
            m65964H();
            m65918n0();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f6974e0)) {
            return;
        }
        this.f6974e0 = colorStateList;
        this.f6965a.setColor(m65968D(colorStateList));
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.f6951J = f;
        this.f6964W = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f6952K = f;
        this.f6964W = true;
        postInvalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        m65938d0(arrayList);
    }

    /* renamed from: t */
    public final void m65907t(Canvas canvas, int i, int i2) {
        int i3;
        float[] m65971A = m65971A();
        float f = i;
        float f2 = this.f6943B + (m65971A[1] * f);
        if (f2 < i3 + i) {
            float f3 = i2;
            canvas.drawLine(f2, f3, i3 + i, f3, this.f6965a);
        }
        int i4 = this.f6943B;
        float f4 = i4 + (m65971A[0] * f);
        if (f4 > i4) {
            float f5 = i2;
            canvas.drawLine(i4, f5, f4, f5, this.f6965a);
        }
    }

    /* renamed from: t0 */
    public final void m65906t0() {
        Iterator it = this.f6953L.iterator();
        while (it.hasNext()) {
            Float f = (Float) it.next();
            if (f.floatValue() >= this.f6951J && f.floatValue() <= this.f6952K) {
                if (this.f6956O > 0.0f && !m65904u0(f.floatValue())) {
                    throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f, Float.valueOf(this.f6951J), Float.valueOf(this.f6956O), Float.valueOf(this.f6956O)));
                }
            } else {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f, Float.valueOf(this.f6951J), Float.valueOf(this.f6952K)));
            }
        }
    }

    /* renamed from: u */
    public final void m65905u(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        canvas.translate((this.f6943B + ((int) (m65950V(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* renamed from: u0 */
    public final boolean m65904u0(float f) {
        return m65961K(f - this.f6951J);
    }

    /* renamed from: v */
    public final void m65903v(Canvas canvas, int i, int i2) {
        for (int i3 = 0; i3 < this.f6953L.size(); i3++) {
            float floatValue = ((Float) this.f6953L.get(i3)).floatValue();
            Drawable drawable = this.f6978g0;
            if (drawable != null) {
                m65905u(canvas, i, i2, floatValue, drawable);
            } else if (i3 < this.f6980h0.size()) {
                m65905u(canvas, i, i2, floatValue, (Drawable) this.f6980h0.get(i3));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle(this.f6943B + (m65950V(floatValue) * i), i2, this.f6944C, this.f6969c);
                }
                m65905u(canvas, i, i2, floatValue, this.f6976f0);
            }
        }
    }

    /* renamed from: v0 */
    public final float m65902v0(float f) {
        return (m65950V(f) * this.f6961T) + this.f6943B;
    }

    /* renamed from: w */
    public final void m65901w() {
        if (this.f7000z == 2) {
            return;
        }
        if (!this.f6988n) {
            this.f6988n = true;
            ValueAnimator m65921m = m65921m(true);
            this.f6989o = m65921m;
            this.f6990p = null;
            m65921m.start();
        }
        Iterator it = this.f6985k.iterator();
        for (int i = 0; i < this.f6953L.size() && it.hasNext(); i++) {
            if (i != this.f6955N) {
                m65940c0((TooltipDrawable) it.next(), ((Float) this.f6953L.get(i)).floatValue());
            }
        }
        if (it.hasNext()) {
            m65940c0((TooltipDrawable) it.next(), ((Float) this.f6953L.get(this.f6955N)).floatValue());
            return;
        }
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f6985k.size()), Integer.valueOf(this.f6953L.size())));
    }

    /* renamed from: w0 */
    public final void m65900w0() {
        float f = this.f6956O;
        if (f == 0.0f) {
            return;
        }
        if (((int) f) != f) {
            Log.w(f6936k0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f)));
        }
        float f2 = this.f6951J;
        if (((int) f2) != f2) {
            Log.w(f6936k0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f2)));
        }
        float f3 = this.f6952K;
        if (((int) f3) != f3) {
            Log.w(f6936k0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f3)));
        }
    }

    /* renamed from: x */
    public final void m65899x() {
        if (this.f6988n) {
            this.f6988n = false;
            ValueAnimator m65921m = m65921m(false);
            this.f6990p = m65921m;
            this.f6989o = null;
            m65921m.addListener(new C1533b());
            this.f6990p.start();
        }
    }

    /* renamed from: y */
    public final void m65898y(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i == 66) {
                        m65951U(Integer.MIN_VALUE);
                        return;
                    }
                    return;
                }
                m65951U(Integer.MAX_VALUE);
                return;
            }
            m65952T(Integer.MIN_VALUE);
            return;
        }
        m65952T(Integer.MAX_VALUE);
    }

    /* renamed from: z */
    public final String m65897z(float f) {
        String str;
        if (hasLabelFormatter()) {
            return this.f6949H.getFormattedValue(f);
        }
        if (((int) f) == f) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        return String.format(str, Float.valueOf(f));
    }

    /* renamed from: Va$c */
    /* loaded from: classes4.dex */
    public class RunnableC1534c implements Runnable {

        /* renamed from: a */
        public int f7003a;

        public RunnableC1534c() {
            this.f7003a = -1;
        }

        /* renamed from: a */
        public void m65896a(int i) {
            this.f7003a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1531Va.this.f6977g.sendEventForVirtualView(this.f7003a, 4);
        }

        public /* synthetic */ RunnableC1534c(AbstractC1531Va abstractC1531Va, C1532a c1532a) {
            this();
        }
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        this.f6978g0 = m65965G(drawable);
        this.f6980h0.clear();
        postInvalidate();
    }

    public void setValues(@NonNull List<Float> list) {
        m65938d0(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.f6978g0 = null;
        this.f6980h0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.f6980h0.add(m65965G(drawable));
        }
        postInvalidate();
    }
}