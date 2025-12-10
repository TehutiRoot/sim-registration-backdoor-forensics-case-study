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
public abstract class AbstractC1544Va extends View {

    /* renamed from: k0 */
    public static final String f6670k0 = "Va";

    /* renamed from: l0 */
    public static final int f6671l0 = R.style.Widget_MaterialComponents_Slider;

    /* renamed from: m0 */
    public static final int f6672m0 = R.attr.motionDurationMedium4;

    /* renamed from: n0 */
    public static final int f6673n0 = R.attr.motionDurationShort3;

    /* renamed from: o0 */
    public static final int f6674o0 = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: p0 */
    public static final int f6675p0 = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: A */
    public int f6676A;

    /* renamed from: B */
    public int f6677B;

    /* renamed from: C */
    public int f6678C;

    /* renamed from: D */
    public int f6679D;

    /* renamed from: E */
    public int f6680E;

    /* renamed from: F */
    public float f6681F;

    /* renamed from: G */
    public MotionEvent f6682G;

    /* renamed from: H */
    public LabelFormatter f6683H;

    /* renamed from: I */
    public boolean f6684I;

    /* renamed from: J */
    public float f6685J;

    /* renamed from: K */
    public float f6686K;

    /* renamed from: L */
    public ArrayList f6687L;

    /* renamed from: M */
    public int f6688M;

    /* renamed from: N */
    public int f6689N;

    /* renamed from: O */
    public float f6690O;

    /* renamed from: P */
    public float[] f6691P;

    /* renamed from: Q */
    public boolean f6692Q;

    /* renamed from: R */
    public int f6693R;

    /* renamed from: S */
    public int f6694S;

    /* renamed from: T */
    public int f6695T;

    /* renamed from: U */
    public boolean f6696U;

    /* renamed from: V */
    public boolean f6697V;

    /* renamed from: W */
    public boolean f6698W;

    /* renamed from: a */
    public final Paint f6699a;

    /* renamed from: a0 */
    public ColorStateList f6700a0;

    /* renamed from: b */
    public final Paint f6701b;

    /* renamed from: b0 */
    public ColorStateList f6702b0;

    /* renamed from: c */
    public final Paint f6703c;

    /* renamed from: c0 */
    public ColorStateList f6704c0;

    /* renamed from: d */
    public final Paint f6705d;

    /* renamed from: d0 */
    public ColorStateList f6706d0;

    /* renamed from: e */
    public final Paint f6707e;

    /* renamed from: e0 */
    public ColorStateList f6708e0;

    /* renamed from: f */
    public final Paint f6709f;

    /* renamed from: f0 */
    public final MaterialShapeDrawable f6710f0;

    /* renamed from: g */
    public final C1548d f6711g;

    /* renamed from: g0 */
    public Drawable f6712g0;

    /* renamed from: h */
    public final AccessibilityManager f6713h;

    /* renamed from: h0 */
    public List f6714h0;

    /* renamed from: i */
    public RunnableC1547c f6715i;

    /* renamed from: i0 */
    public float f6716i0;

    /* renamed from: j */
    public int f6717j;

    /* renamed from: j0 */
    public int f6718j0;

    /* renamed from: k */
    public final List f6719k;

    /* renamed from: l */
    public final List f6720l;

    /* renamed from: m */
    public final List f6721m;

    /* renamed from: n */
    public boolean f6722n;

    /* renamed from: o */
    public ValueAnimator f6723o;

    /* renamed from: p */
    public ValueAnimator f6724p;

    /* renamed from: q */
    public final int f6725q;

    /* renamed from: r */
    public int f6726r;

    /* renamed from: s */
    public int f6727s;

    /* renamed from: t */
    public int f6728t;

    /* renamed from: u */
    public int f6729u;

    /* renamed from: v */
    public int f6730v;

    /* renamed from: w */
    public int f6731w;

    /* renamed from: x */
    public int f6732x;

    /* renamed from: y */
    public int f6733y;

    /* renamed from: z */
    public int f6734z;

    /* renamed from: Va$a */
    /* loaded from: classes4.dex */
    public class C1545a implements ValueAnimator.AnimatorUpdateListener {
        public C1545a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (TooltipDrawable tooltipDrawable : AbstractC1544Va.this.f6719k) {
                tooltipDrawable.setRevealFraction(floatValue);
            }
            ViewCompat.postInvalidateOnAnimation(AbstractC1544Va.this);
        }
    }

    /* renamed from: Va$b */
    /* loaded from: classes4.dex */
    public class C1546b extends AnimatorListenerAdapter {
        public C1546b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(AbstractC1544Va.this);
            for (TooltipDrawable tooltipDrawable : AbstractC1544Va.this.f6719k) {
                contentViewOverlay.remove(tooltipDrawable);
            }
        }
    }

    /* renamed from: Va$d */
    /* loaded from: classes4.dex */
    public static class C1548d extends ExploreByTouchHelper {

        /* renamed from: q */
        public final AbstractC1544Va f6739q;

        /* renamed from: r */
        public final Rect f6740r;

        public C1548d(AbstractC1544Va abstractC1544Va) {
            super(abstractC1544Va);
            this.f6740r = new Rect();
            this.f6739q = abstractC1544Va;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f, float f2) {
            for (int i = 0; i < this.f6739q.getValues().size(); i++) {
                this.f6739q.m65792k0(i, this.f6740r);
                if (this.f6740r.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(List list) {
            for (int i = 0; i < this.f6739q.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (!this.f6739q.isEnabled()) {
                return false;
            }
            if (i2 == 4096 || i2 == 8192) {
                float m65793k = this.f6739q.m65793k(20);
                if (i2 == 8192) {
                    m65793k = -m65793k;
                }
                if (this.f6739q.m65827M()) {
                    m65793k = -m65793k;
                }
                if (this.f6739q.m65796i0(i, MathUtils.clamp(this.f6739q.getValues().get(i).floatValue() + m65793k, this.f6739q.getValueFrom(), this.f6739q.getValueTo()))) {
                    this.f6739q.m65790l0();
                    this.f6739q.postInvalidate();
                    invalidateVirtualView(i);
                    return true;
                }
                return false;
            }
            if (i2 == 16908349 && bundle != null && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)) {
                if (this.f6739q.m65796i0(i, bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE))) {
                    this.f6739q.m65790l0();
                    this.f6739q.postInvalidate();
                    invalidateVirtualView(i);
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            List<Float> values = this.f6739q.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.f6739q.getValueFrom();
            float valueTo = this.f6739q.getValueTo();
            if (this.f6739q.isEnabled()) {
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
            if (this.f6739q.getContentDescription() != null) {
                sb.append(this.f6739q.getContentDescription());
                sb.append(",");
            }
            String m65765z = this.f6739q.m65765z(floatValue);
            String string = this.f6739q.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                string = m65763x(i);
            }
            sb.append(String.format(Locale.US, "%s, %s", string, m65765z));
            accessibilityNodeInfoCompat.setContentDescription(sb.toString());
            this.f6739q.m65792k0(i, this.f6740r);
            accessibilityNodeInfoCompat.setBoundsInParent(this.f6740r);
        }

        /* renamed from: x */
        public final String m65763x(int i) {
            if (i == this.f6739q.getValues().size() - 1) {
                return this.f6739q.getContext().getString(R.string.material_slider_range_end);
            }
            if (i == 0) {
                return this.f6739q.getContext().getString(R.string.material_slider_range_start);
            }
            return "";
        }
    }

    /* renamed from: Va$e */
    /* loaded from: classes4.dex */
    public static class C1549e extends View.BaseSavedState {
        public static final Parcelable.Creator<C1549e> CREATOR = new C1550a();

        /* renamed from: a */
        public float f6741a;

        /* renamed from: b */
        public float f6742b;

        /* renamed from: c */
        public ArrayList f6743c;

        /* renamed from: d */
        public float f6744d;

        /* renamed from: e */
        public boolean f6745e;

        /* renamed from: Va$e$a */
        /* loaded from: classes4.dex */
        public class C1550a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1549e createFromParcel(Parcel parcel) {
                return new C1549e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C1549e[] newArray(int i) {
                return new C1549e[i];
            }
        }

        public /* synthetic */ C1549e(Parcel parcel, C1545a c1545a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f6741a);
            parcel.writeFloat(this.f6742b);
            parcel.writeList(this.f6743c);
            parcel.writeFloat(this.f6744d);
            parcel.writeBooleanArray(new boolean[]{this.f6745e});
        }

        public C1549e(Parcelable parcelable) {
            super(parcelable);
        }

        public C1549e(Parcel parcel) {
            super(parcel);
            this.f6741a = parcel.readFloat();
            this.f6742b = parcel.readFloat();
            ArrayList arrayList = new ArrayList();
            this.f6743c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f6744d = parcel.readFloat();
            this.f6745e = parcel.createBooleanArray()[0];
        }
    }

    public AbstractC1544Va(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, f6671l0), attributeSet, i);
        this.f6719k = new ArrayList();
        this.f6720l = new ArrayList();
        this.f6721m = new ArrayList();
        this.f6722n = false;
        this.f6684I = false;
        this.f6687L = new ArrayList();
        this.f6688M = -1;
        this.f6689N = -1;
        this.f6690O = 0.0f;
        this.f6692Q = true;
        this.f6697V = false;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f6710f0 = materialShapeDrawable;
        this.f6714h0 = Collections.emptyList();
        this.f6718j0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f6699a = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = new Paint();
        this.f6701b = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.f6703c = paint3;
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f6705d = paint4;
        paint4.setStyle(style2);
        Paint paint5 = new Paint();
        this.f6707e = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Paint paint6 = new Paint();
        this.f6709f = paint6;
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        m65826N(context2.getResources());
        m65812a0(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.f6725q = ViewConfiguration.get(context2).getScaledTouchSlop();
        C1548d c1548d = new C1548d(this);
        this.f6711g = c1548d;
        ViewCompat.setAccessibilityDelegate(this, c1548d);
        this.f6713h = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    /* renamed from: B */
    public static float m65838B(ValueAnimator valueAnimator, float f) {
        if (valueAnimator != null && valueAnimator.isRunning()) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
            return floatValue;
        }
        return f;
    }

    /* renamed from: J */
    public static boolean m65830J(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: Z */
    public static int m65814Z(float[] fArr, float f) {
        return Math.round(f * ((fArr.length / 2) - 1));
    }

    /* renamed from: A */
    public final float[] m65839A() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f6687L.size() == 1) {
            floatValue2 = this.f6685J;
        }
        float m65818V = m65818V(floatValue2);
        float m65818V2 = m65818V(floatValue);
        return m65827M() ? new float[]{m65818V2, m65818V} : new float[]{m65818V, m65818V2};
    }

    /* renamed from: C */
    public final float m65837C(int i, float f) {
        float floatValue;
        float floatValue2;
        float minSeparation = getMinSeparation();
        if (this.f6718j0 == 0) {
            minSeparation = m65783p(minSeparation);
        }
        if (m65827M()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        if (i2 >= this.f6687L.size()) {
            floatValue = this.f6686K;
        } else {
            floatValue = ((Float) this.f6687L.get(i2)).floatValue() - minSeparation;
        }
        int i3 = i - 1;
        if (i3 < 0) {
            floatValue2 = this.f6685J;
        } else {
            floatValue2 = ((Float) this.f6687L.get(i3)).floatValue() + minSeparation;
        }
        return MathUtils.clamp(f, floatValue2, floatValue);
    }

    /* renamed from: D */
    public final int m65836D(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* renamed from: E */
    public final float m65835E() {
        double m65798h0 = m65798h0(this.f6716i0);
        if (m65827M()) {
            m65798h0 = 1.0d - m65798h0;
        }
        float f = this.f6686K;
        float f2 = this.f6685J;
        return (float) ((m65798h0 * (f - f2)) + f2);
    }

    /* renamed from: F */
    public final float m65834F() {
        float f = this.f6716i0;
        if (m65827M()) {
            f = 1.0f - f;
        }
        float f2 = this.f6686K;
        float f3 = this.f6685J;
        return (f * (f2 - f3)) + f3;
    }

    /* renamed from: G */
    public final Drawable m65833G(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        m65801g(newDrawable);
        return newDrawable;
    }

    /* renamed from: H */
    public final void m65832H() {
        this.f6699a.setStrokeWidth(this.f6676A);
        this.f6701b.setStrokeWidth(this.f6676A);
    }

    /* renamed from: I */
    public final boolean m65831I() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public final boolean m65829K(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.f6690O)), MathContext.DECIMAL64).doubleValue();
        if (Math.abs(Math.round(doubleValue) - doubleValue) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m65828L(MotionEvent motionEvent) {
        if (!m65830J(motionEvent) && m65831I()) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final boolean m65827M() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final void m65826N(Resources resources) {
        this.f6732x = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f6726r = dimensionPixelOffset;
        this.f6677B = dimensionPixelOffset;
        this.f6727s = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f6728t = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.f6729u = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f6730v = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.f6680E = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
    }

    /* renamed from: O */
    public final void m65825O() {
        if (this.f6690O <= 0.0f) {
            return;
        }
        m65784o0();
        int min = Math.min((int) (((this.f6686K - this.f6685J) / this.f6690O) + 1.0f), (this.f6695T / (this.f6676A * 2)) + 1);
        float[] fArr = this.f6691P;
        if (fArr == null || fArr.length != min * 2) {
            this.f6691P = new float[min * 2];
        }
        float f = this.f6695T / (min - 1);
        for (int i = 0; i < min * 2; i += 2) {
            float[] fArr2 = this.f6691P;
            fArr2[i] = this.f6677B + ((i / 2.0f) * f);
            fArr2[i + 1] = m65791l();
        }
    }

    /* renamed from: P */
    public final void m65824P(Canvas canvas, int i, int i2) {
        if (m65802f0()) {
            int m65818V = (int) (this.f6677B + (m65818V(((Float) this.f6687L.get(this.f6689N)).floatValue()) * i));
            if (Build.VERSION.SDK_INT < 28) {
                int i3 = this.f6679D;
                canvas.clipRect(m65818V - i3, i2 - i3, m65818V + i3, i3 + i2, Region.Op.UNION);
            }
            canvas.drawCircle(m65818V, i2, this.f6679D, this.f6705d);
        }
    }

    /* renamed from: Q */
    public final void m65823Q(Canvas canvas) {
        if (this.f6692Q && this.f6690O > 0.0f) {
            float[] m65839A = m65839A();
            int m65814Z = m65814Z(this.f6691P, m65839A[0]);
            int m65814Z2 = m65814Z(this.f6691P, m65839A[1]);
            int i = m65814Z * 2;
            canvas.drawPoints(this.f6691P, 0, i, this.f6707e);
            int i2 = m65814Z2 * 2;
            canvas.drawPoints(this.f6691P, i, i2 - i, this.f6709f);
            float[] fArr = this.f6691P;
            canvas.drawPoints(fArr, i2, fArr.length - i2, this.f6707e);
        }
    }

    /* renamed from: R */
    public final boolean m65822R() {
        int max = this.f6726r + Math.max(Math.max(Math.max(this.f6678C - this.f6727s, 0), Math.max((this.f6676A - this.f6728t) / 2, 0)), Math.max(Math.max(this.f6693R - this.f6729u, 0), Math.max(this.f6694S - this.f6730v, 0)));
        if (this.f6677B == max) {
            return false;
        }
        this.f6677B = max;
        if (ViewCompat.isLaidOut(this)) {
            m65788m0(getWidth());
            return true;
        }
        return true;
    }

    /* renamed from: S */
    public final boolean m65821S() {
        int max = Math.max(this.f6732x, Math.max(this.f6676A + getPaddingTop() + getPaddingBottom(), (this.f6678C * 2) + getPaddingTop() + getPaddingBottom()));
        if (max == this.f6733y) {
            return false;
        }
        this.f6733y = max;
        return true;
    }

    /* renamed from: T */
    public final boolean m65820T(int i) {
        int i2 = this.f6689N;
        int clamp = (int) MathUtils.clamp(i2 + i, 0L, this.f6687L.size() - 1);
        this.f6689N = clamp;
        if (clamp == i2) {
            return false;
        }
        if (this.f6688M != -1) {
            this.f6688M = clamp;
        }
        m65790l0();
        postInvalidate();
        return true;
    }

    /* renamed from: U */
    public final boolean m65819U(int i) {
        if (m65827M()) {
            if (i == Integer.MIN_VALUE) {
                i = Integer.MAX_VALUE;
            } else {
                i = -i;
            }
        }
        return m65820T(i);
    }

    /* renamed from: V */
    public final float m65818V(float f) {
        float f2 = this.f6685J;
        float f3 = (f - f2) / (this.f6686K - f2);
        if (m65827M()) {
            return 1.0f - f3;
        }
        return f3;
    }

    /* renamed from: W */
    public final Boolean m65817W(int i, KeyEvent keyEvent) {
        if (i != 61) {
            if (i != 66) {
                if (i != 81) {
                    if (i != 69) {
                        if (i != 70) {
                            switch (i) {
                                case 21:
                                    m65819U(-1);
                                    return Boolean.TRUE;
                                case 22:
                                    m65819U(1);
                                    return Boolean.TRUE;
                                case 23:
                                    break;
                                default:
                                    return null;
                            }
                        }
                    } else {
                        m65820T(-1);
                        return Boolean.TRUE;
                    }
                }
                m65820T(1);
                return Boolean.TRUE;
            }
            this.f6688M = this.f6689N;
            postInvalidate();
            return Boolean.TRUE;
        } else if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(m65820T(1));
        } else {
            if (keyEvent.isShiftPressed()) {
                return Boolean.valueOf(m65820T(-1));
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: X */
    public final void m65816X() {
        for (BaseOnSliderTouchListener baseOnSliderTouchListener : this.f6721m) {
            baseOnSliderTouchListener.onStartTrackingTouch(this);
        }
    }

    /* renamed from: Y */
    public final void m65815Y() {
        for (BaseOnSliderTouchListener baseOnSliderTouchListener : this.f6721m) {
            baseOnSliderTouchListener.onStopTrackingTouch(this);
        }
    }

    /* renamed from: a0 */
    public final void m65812a0(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Slider, i, f6671l0, new int[0]);
        this.f6717j = obtainStyledAttributes.getResourceId(R.styleable.Slider_labelStyle, R.style.Widget_MaterialComponents_Tooltip);
        this.f6685J = obtainStyledAttributes.getFloat(R.styleable.Slider_android_valueFrom, 0.0f);
        this.f6686K = obtainStyledAttributes.getFloat(R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f6685J));
        this.f6690O = obtainStyledAttributes.getFloat(R.styleable.Slider_android_stepSize, 0.0f);
        this.f6731w = (int) Math.ceil(obtainStyledAttributes.getDimension(R.styleable.Slider_minTouchTargetSize, (float) Math.ceil(ViewUtils.dpToPx(getContext(), 48))));
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
        this.f6710f0.setFillColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.Slider_thumbColor));
        if (obtainStyledAttributes.hasValue(R.styleable.Slider_thumbStrokeColor)) {
            setThumbStrokeColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.Slider_thumbStrokeColor));
        }
        setThumbStrokeWidth(obtainStyledAttributes.getDimension(R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.Slider_haloColor);
        if (colorStateList3 == null) {
            colorStateList3 = AppCompatResources.getColorStateList(context, R.color.material_slider_halo_color);
        }
        setHaloTintList(colorStateList3);
        this.f6692Q = obtainStyledAttributes.getBoolean(R.styleable.Slider_tickVisible, true);
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
        this.f6720l.add(baseOnChangeListener);
    }

    public void addOnSliderTouchListener(BaseOnSliderTouchListener baseOnSliderTouchListener) {
        this.f6721m.add(baseOnSliderTouchListener);
    }

    /* renamed from: b0 */
    public final void m65810b0(int i) {
        RunnableC1547c runnableC1547c = this.f6715i;
        if (runnableC1547c == null) {
            this.f6715i = new RunnableC1547c(this, null);
        } else {
            removeCallbacks(runnableC1547c);
        }
        this.f6715i.m65764a(i);
        postDelayed(this.f6715i, 200L);
    }

    /* renamed from: c0 */
    public final void m65808c0(TooltipDrawable tooltipDrawable, float f) {
        tooltipDrawable.setText(m65765z(f));
        int m65818V = (this.f6677B + ((int) (m65818V(f) * this.f6695T))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        int m65791l = m65791l() - (this.f6680E + this.f6678C);
        tooltipDrawable.setBounds(m65818V, m65791l - tooltipDrawable.getIntrinsicHeight(), tooltipDrawable.getIntrinsicWidth() + m65818V, m65791l);
        Rect rect = new Rect(tooltipDrawable.getBounds());
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, rect);
        tooltipDrawable.setBounds(rect);
        ViewUtils.getContentViewOverlay(this).add(tooltipDrawable);
    }

    public void clearOnChangeListeners() {
        this.f6720l.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.f6721m.clear();
    }

    /* renamed from: d0 */
    public final void m65806d0(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f6687L.size() == arrayList.size() && this.f6687L.equals(arrayList)) {
                return;
            }
            this.f6687L = arrayList;
            this.f6698W = true;
            this.f6689N = 0;
            m65790l0();
            m65787n();
            m65779r();
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f6711g.dispatchHoverEvent(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
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
        this.f6699a.setColor(m65836D(this.f6708e0));
        this.f6701b.setColor(m65836D(this.f6706d0));
        this.f6707e.setColor(m65836D(this.f6704c0));
        this.f6709f.setColor(m65836D(this.f6702b0));
        for (TooltipDrawable tooltipDrawable : this.f6719k) {
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        if (this.f6710f0.isStateful()) {
            this.f6710f0.setState(getDrawableState());
        }
        this.f6705d.setColor(m65836D(this.f6700a0));
        this.f6705d.setAlpha(63);
    }

    /* renamed from: e0 */
    public final boolean m65804e0() {
        if (this.f6734z == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public final boolean m65802f0() {
        if (!this.f6696U && (getBackground() instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void m65801g(Drawable drawable) {
        int i = this.f6678C * 2;
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
    public final boolean m65800g0(float f) {
        return m65796i0(this.f6688M, f);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f6711g.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.f6688M;
    }

    public int getFocusedThumbIndex() {
        return this.f6689N;
    }

    public int getHaloRadius() {
        return this.f6679D;
    }

    public ColorStateList getHaloTintList() {
        return this.f6700a0;
    }

    public int getLabelBehavior() {
        return this.f6734z;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f6690O;
    }

    public float getThumbElevation() {
        return this.f6710f0.getElevation();
    }

    public int getThumbRadius() {
        return this.f6678C;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f6710f0.getStrokeColor();
    }

    public float getThumbStrokeWidth() {
        return this.f6710f0.getStrokeWidth();
    }

    public ColorStateList getThumbTintList() {
        return this.f6710f0.getFillColor();
    }

    public int getTickActiveRadius() {
        return this.f6693R;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f6702b0;
    }

    public int getTickInactiveRadius() {
        return this.f6694S;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f6704c0;
    }

    public ColorStateList getTickTintList() {
        if (this.f6704c0.equals(this.f6702b0)) {
            return this.f6702b0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f6706d0;
    }

    public int getTrackHeight() {
        return this.f6676A;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f6708e0;
    }

    public int getTrackSidePadding() {
        return this.f6677B;
    }

    public ColorStateList getTrackTintList() {
        if (this.f6708e0.equals(this.f6706d0)) {
            return this.f6706d0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f6695T;
    }

    public float getValueFrom() {
        return this.f6685J;
    }

    public float getValueTo() {
        return this.f6686K;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.f6687L);
    }

    /* renamed from: h */
    public final void m65799h(TooltipDrawable tooltipDrawable) {
        tooltipDrawable.setRelativeToView(ViewUtils.getContentView(this));
    }

    /* renamed from: h0 */
    public final double m65798h0(float f) {
        float f2 = this.f6690O;
        if (f2 > 0.0f) {
            int i = (int) ((this.f6686K - this.f6685J) / f2);
            return Math.round(f * i) / i;
        }
        return f;
    }

    public boolean hasLabelFormatter() {
        if (this.f6683H != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final Float m65797i(int i) {
        float m65795j;
        if (this.f6697V) {
            m65795j = m65793k(20);
        } else {
            m65795j = m65795j();
        }
        if (i != 21) {
            if (i != 22) {
                if (i != 69) {
                    if (i != 70 && i != 81) {
                        return null;
                    }
                    return Float.valueOf(m65795j);
                }
                return Float.valueOf(-m65795j);
            }
            if (m65827M()) {
                m65795j = -m65795j;
            }
            return Float.valueOf(m65795j);
        }
        if (!m65827M()) {
            m65795j = -m65795j;
        }
        return Float.valueOf(m65795j);
    }

    /* renamed from: i0 */
    public final boolean m65796i0(int i, float f) {
        this.f6689N = i;
        if (Math.abs(f - ((Float) this.f6687L.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.f6687L.set(i, Float.valueOf(m65837C(i, f)));
        m65781q(i);
        return true;
    }

    public boolean isTickVisible() {
        return this.f6692Q;
    }

    /* renamed from: j */
    public final float m65795j() {
        float f = this.f6690O;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: j0 */
    public final boolean m65794j0() {
        return m65800g0(m65835E());
    }

    /* renamed from: k */
    public final float m65793k(int i) {
        float f;
        float f2;
        float m65795j = m65795j();
        if ((this.f6686K - this.f6685J) / m65795j <= i) {
            return m65795j;
        }
        return Math.round(f / f2) * m65795j;
    }

    /* renamed from: k0 */
    public void m65792k0(int i, Rect rect) {
        int m65818V = this.f6677B + ((int) (m65818V(getValues().get(i).floatValue()) * this.f6695T));
        int m65791l = m65791l();
        int i2 = this.f6678C;
        int i3 = this.f6731w;
        if (i2 <= i3) {
            i2 = i3;
        }
        int i4 = i2 / 2;
        rect.set(m65818V - i4, m65791l - i4, m65818V + i4, m65791l + i4);
    }

    /* renamed from: l */
    public final int m65791l() {
        int i = this.f6733y / 2;
        int i2 = 0;
        if (this.f6734z == 1 || m65804e0()) {
            i2 = ((TooltipDrawable) this.f6719k.get(0)).getIntrinsicHeight();
        }
        return i + i2;
    }

    /* renamed from: l0 */
    public final void m65790l0() {
        if (!m65802f0() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int m65818V = (int) ((m65818V(((Float) this.f6687L.get(this.f6689N)).floatValue()) * this.f6695T) + this.f6677B);
                int m65791l = m65791l();
                int i = this.f6679D;
                DrawableCompat.setHotspotBounds(background, m65818V - i, m65791l - i, m65818V + i, m65791l + i);
            }
        }
    }

    /* renamed from: m */
    public final ValueAnimator m65789m(boolean z) {
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
            valueAnimator = this.f6724p;
        } else {
            valueAnimator = this.f6723o;
        }
        float m65838B = m65838B(valueAnimator, f);
        if (!z) {
            f2 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m65838B, f2);
        if (z) {
            resolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), f6672m0, 83);
            resolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), f6674o0, AnimationUtils.DECELERATE_INTERPOLATOR);
        } else {
            resolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), f6673n0, 117);
            resolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), f6675p0, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        }
        ofFloat.setDuration(resolveThemeDuration);
        ofFloat.setInterpolator(resolveThemeInterpolator);
        ofFloat.addUpdateListener(new C1545a());
        return ofFloat;
    }

    /* renamed from: m0 */
    public final void m65788m0(int i) {
        this.f6695T = Math.max(i - (this.f6677B * 2), 0);
        m65825O();
    }

    /* renamed from: n */
    public final void m65787n() {
        int i;
        if (this.f6719k.size() > this.f6687L.size()) {
            List<TooltipDrawable> subList = this.f6719k.subList(this.f6687L.size(), this.f6719k.size());
            for (TooltipDrawable tooltipDrawable : subList) {
                if (ViewCompat.isAttachedToWindow(this)) {
                    m65785o(tooltipDrawable);
                }
            }
            subList.clear();
        }
        while (true) {
            i = 0;
            if (this.f6719k.size() >= this.f6687L.size()) {
                break;
            }
            TooltipDrawable createFromAttributes = TooltipDrawable.createFromAttributes(getContext(), null, 0, this.f6717j);
            this.f6719k.add(createFromAttributes);
            if (ViewCompat.isAttachedToWindow(this)) {
                m65799h(createFromAttributes);
            }
        }
        if (this.f6719k.size() != 1) {
            i = 1;
        }
        for (TooltipDrawable tooltipDrawable2 : this.f6719k) {
            tooltipDrawable2.setStrokeWidth(i);
        }
    }

    /* renamed from: n0 */
    public final void m65786n0() {
        boolean m65821S = m65821S();
        boolean m65822R = m65822R();
        if (m65821S) {
            requestLayout();
        } else if (m65822R) {
            postInvalidate();
        }
    }

    /* renamed from: o */
    public final void m65785o(TooltipDrawable tooltipDrawable) {
        ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(this);
        if (contentViewOverlay != null) {
            contentViewOverlay.remove(tooltipDrawable);
            tooltipDrawable.detachView(ViewUtils.getContentView(this));
        }
    }

    /* renamed from: o0 */
    public final void m65784o0() {
        if (this.f6698W) {
            m65778r0();
            m65776s0();
            m65780q0();
            m65774t0();
            m65782p0();
            m65768w0();
            this.f6698W = false;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (TooltipDrawable tooltipDrawable : this.f6719k) {
            m65799h(tooltipDrawable);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        RunnableC1547c runnableC1547c = this.f6715i;
        if (runnableC1547c != null) {
            removeCallbacks(runnableC1547c);
        }
        this.f6722n = false;
        for (TooltipDrawable tooltipDrawable : this.f6719k) {
            m65785o(tooltipDrawable);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.f6698W) {
            m65784o0();
            m65825O();
        }
        super.onDraw(canvas);
        int m65791l = m65791l();
        m65775t(canvas, this.f6695T, m65791l);
        if (((Float) Collections.max(getValues())).floatValue() > this.f6685J) {
            m65777s(canvas, this.f6695T, m65791l);
        }
        m65823Q(canvas);
        if ((this.f6684I || isFocused()) && isEnabled()) {
            m65824P(canvas, this.f6695T, m65791l);
        }
        if ((this.f6688M != -1 || m65804e0()) && isEnabled()) {
            m65769w();
        } else {
            m65767x();
        }
        m65771v(canvas, this.f6695T, m65791l);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.f6688M = -1;
            this.f6711g.clearKeyboardFocusForVirtualView(this.f6689N);
            return;
        }
        m65766y(i);
        this.f6711g.requestKeyboardFocusForVirtualView(this.f6689N);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f6687L.size() == 1) {
            this.f6688M = 0;
        }
        if (this.f6688M == -1) {
            Boolean m65817W = m65817W(i, keyEvent);
            if (m65817W != null) {
                return m65817W.booleanValue();
            }
            return super.onKeyDown(i, keyEvent);
        }
        this.f6697V |= keyEvent.isLongPress();
        Float m65797i = m65797i(i);
        if (m65797i != null) {
            if (m65800g0(((Float) this.f6687L.get(this.f6688M)).floatValue() + m65797i.floatValue())) {
                m65790l0();
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
                return m65820T(1);
            } else {
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return m65820T(-1);
            }
        }
        this.f6688M = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f6697V = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.f6733y;
        int i4 = 0;
        if (this.f6734z == 1 || m65804e0()) {
            i4 = ((TooltipDrawable) this.f6719k.get(0)).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C1549e c1549e = (C1549e) parcelable;
        super.onRestoreInstanceState(c1549e.getSuperState());
        this.f6685J = c1549e.f6741a;
        this.f6686K = c1549e.f6742b;
        m65806d0(c1549e.f6743c);
        this.f6690O = c1549e.f6744d;
        if (c1549e.f6745e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1549e c1549e = new C1549e(super.onSaveInstanceState());
        c1549e.f6741a = this.f6685J;
        c1549e.f6742b = this.f6686K;
        c1549e.f6743c = new ArrayList(this.f6687L);
        c1549e.f6744d = this.f6690O;
        c1549e.f6745e = hasFocus();
        return c1549e;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m65788m0(i);
        m65790l0();
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
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC1544Va.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        ViewOverlayImpl contentViewOverlay;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (contentViewOverlay = ViewUtils.getContentViewOverlay(this)) == null) {
            return;
        }
        for (TooltipDrawable tooltipDrawable : this.f6719k) {
            contentViewOverlay.remove(tooltipDrawable);
        }
    }

    /* renamed from: p */
    public final float m65783p(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - this.f6677B) / this.f6695T;
        float f3 = this.f6685J;
        return (f2 * (f3 - this.f6686K)) + f3;
    }

    /* renamed from: p0 */
    public final void m65782p0() {
        float minSeparation = getMinSeparation();
        if (minSeparation >= 0.0f) {
            float f = this.f6690O;
            if (f > 0.0f && minSeparation > 0.0f) {
                if (this.f6718j0 == 1) {
                    if (minSeparation < f || !m65829K(minSeparation)) {
                        throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f6690O), Float.valueOf(this.f6690O)));
                    }
                    return;
                }
                throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f6690O)));
            }
            return;
        }
        throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
    }

    public boolean pickActiveThumb() {
        boolean z;
        if (this.f6688M != -1) {
            return true;
        }
        float m65834F = m65834F();
        float m65770v0 = m65770v0(m65834F);
        this.f6688M = 0;
        float abs = Math.abs(((Float) this.f6687L.get(0)).floatValue() - m65834F);
        for (int i = 1; i < this.f6687L.size(); i++) {
            float abs2 = Math.abs(((Float) this.f6687L.get(i)).floatValue() - m65834F);
            float m65770v02 = m65770v0(((Float) this.f6687L.get(i)).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            if (!m65827M() ? m65770v02 - m65770v0 < 0.0f : m65770v02 - m65770v0 > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.f6688M = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(m65770v02 - m65770v0) < this.f6725q) {
                    this.f6688M = -1;
                    return false;
                } else if (z) {
                    this.f6688M = i;
                }
            }
            abs = abs2;
        }
        if (this.f6688M != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final void m65781q(int i) {
        for (BaseOnChangeListener baseOnChangeListener : this.f6720l) {
            baseOnChangeListener.onValueChange(this, ((Float) this.f6687L.get(i)).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f6713h;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            m65810b0(i);
        }
    }

    /* renamed from: q0 */
    public final void m65780q0() {
        if (this.f6690O > 0.0f && !m65772u0(this.f6686K)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.f6690O), Float.valueOf(this.f6685J), Float.valueOf(this.f6686K)));
        }
    }

    /* renamed from: r */
    public final void m65779r() {
        for (BaseOnChangeListener baseOnChangeListener : this.f6720l) {
            Iterator it = this.f6687L.iterator();
            while (it.hasNext()) {
                baseOnChangeListener.onValueChange(this, ((Float) it.next()).floatValue(), false);
            }
        }
    }

    /* renamed from: r0 */
    public final void m65778r0() {
        if (this.f6685J < this.f6686K) {
            return;
        }
        throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.f6685J), Float.valueOf(this.f6686K)));
    }

    public void removeOnChangeListener(BaseOnChangeListener baseOnChangeListener) {
        this.f6720l.remove(baseOnChangeListener);
    }

    public void removeOnSliderTouchListener(BaseOnSliderTouchListener baseOnSliderTouchListener) {
        this.f6721m.remove(baseOnSliderTouchListener);
    }

    /* renamed from: s */
    public final void m65777s(Canvas canvas, int i, int i2) {
        float[] m65839A = m65839A();
        int i3 = this.f6677B;
        float f = i;
        float f2 = i2;
        canvas.drawLine(i3 + (m65839A[0] * f), f2, i3 + (m65839A[1] * f), f2, this.f6701b);
    }

    /* renamed from: s0 */
    public final void m65776s0() {
        if (this.f6686K > this.f6685J) {
            return;
        }
        throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.f6686K), Float.valueOf(this.f6685J)));
    }

    public void setActiveThumbIndex(int i) {
        this.f6688M = i;
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
        if (i >= 0 && i < this.f6687L.size()) {
            this.f6689N = i;
            this.f6711g.requestKeyboardFocusForVirtualView(i);
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("index out of range");
    }

    public void setHaloRadius(int i) {
        if (i == this.f6679D) {
            return;
        }
        this.f6679D = i;
        Drawable background = getBackground();
        if (!m65802f0() && (background instanceof RippleDrawable)) {
            DrawableUtils.setRippleDrawableRadius((RippleDrawable) background, this.f6679D);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f6700a0)) {
            return;
        }
        this.f6700a0 = colorStateList;
        Drawable background = getBackground();
        if (!m65802f0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f6705d.setColor(m65836D(colorStateList));
        this.f6705d.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.f6734z != i) {
            this.f6734z = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(LabelFormatter labelFormatter) {
        this.f6683H = labelFormatter;
    }

    public void setSeparationUnit(int i) {
        this.f6718j0 = i;
        this.f6698W = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.f6690O != f) {
                this.f6690O = f;
                this.f6698W = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f), Float.valueOf(this.f6685J), Float.valueOf(this.f6686K)));
    }

    public void setThumbElevation(float f) {
        this.f6710f0.setElevation(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(int i) {
        if (i == this.f6678C) {
            return;
        }
        this.f6678C = i;
        this.f6710f0.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCorners(0, this.f6678C).build());
        MaterialShapeDrawable materialShapeDrawable = this.f6710f0;
        int i2 = this.f6678C;
        materialShapeDrawable.setBounds(0, 0, i2 * 2, i2 * 2);
        Drawable drawable = this.f6712g0;
        if (drawable != null) {
            m65801g(drawable);
        }
        for (Drawable drawable2 : this.f6714h0) {
            m65801g(drawable2);
        }
        m65786n0();
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f6710f0.setStrokeColor(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.f6710f0.setStrokeWidth(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f6710f0.getFillColor())) {
            return;
        }
        this.f6710f0.setFillColor(colorStateList);
        invalidate();
    }

    public void setTickActiveRadius(int i) {
        if (this.f6693R != i) {
            this.f6693R = i;
            this.f6709f.setStrokeWidth(i * 2);
            m65786n0();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f6702b0)) {
            return;
        }
        this.f6702b0 = colorStateList;
        this.f6709f.setColor(m65836D(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(int i) {
        if (this.f6694S != i) {
            this.f6694S = i;
            this.f6707e.setStrokeWidth(i * 2);
            m65786n0();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f6704c0)) {
            return;
        }
        this.f6704c0 = colorStateList;
        this.f6707e.setColor(m65836D(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f6692Q != z) {
            this.f6692Q = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f6706d0)) {
            return;
        }
        this.f6706d0 = colorStateList;
        this.f6701b.setColor(m65836D(colorStateList));
        invalidate();
    }

    public void setTrackHeight(int i) {
        if (this.f6676A != i) {
            this.f6676A = i;
            m65832H();
            m65786n0();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f6708e0)) {
            return;
        }
        this.f6708e0 = colorStateList;
        this.f6699a.setColor(m65836D(colorStateList));
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.f6685J = f;
        this.f6698W = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f6686K = f;
        this.f6698W = true;
        postInvalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        m65806d0(arrayList);
    }

    /* renamed from: t */
    public final void m65775t(Canvas canvas, int i, int i2) {
        int i3;
        float[] m65839A = m65839A();
        float f = i;
        float f2 = this.f6677B + (m65839A[1] * f);
        if (f2 < i3 + i) {
            float f3 = i2;
            canvas.drawLine(f2, f3, i3 + i, f3, this.f6699a);
        }
        int i4 = this.f6677B;
        float f4 = i4 + (m65839A[0] * f);
        if (f4 > i4) {
            float f5 = i2;
            canvas.drawLine(i4, f5, f4, f5, this.f6699a);
        }
    }

    /* renamed from: t0 */
    public final void m65774t0() {
        Iterator it = this.f6687L.iterator();
        while (it.hasNext()) {
            Float f = (Float) it.next();
            if (f.floatValue() >= this.f6685J && f.floatValue() <= this.f6686K) {
                if (this.f6690O > 0.0f && !m65772u0(f.floatValue())) {
                    throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f, Float.valueOf(this.f6685J), Float.valueOf(this.f6690O), Float.valueOf(this.f6690O)));
                }
            } else {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f, Float.valueOf(this.f6685J), Float.valueOf(this.f6686K)));
            }
        }
    }

    /* renamed from: u */
    public final void m65773u(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        canvas.translate((this.f6677B + ((int) (m65818V(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* renamed from: u0 */
    public final boolean m65772u0(float f) {
        return m65829K(f - this.f6685J);
    }

    /* renamed from: v */
    public final void m65771v(Canvas canvas, int i, int i2) {
        for (int i3 = 0; i3 < this.f6687L.size(); i3++) {
            float floatValue = ((Float) this.f6687L.get(i3)).floatValue();
            Drawable drawable = this.f6712g0;
            if (drawable != null) {
                m65773u(canvas, i, i2, floatValue, drawable);
            } else if (i3 < this.f6714h0.size()) {
                m65773u(canvas, i, i2, floatValue, (Drawable) this.f6714h0.get(i3));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle(this.f6677B + (m65818V(floatValue) * i), i2, this.f6678C, this.f6703c);
                }
                m65773u(canvas, i, i2, floatValue, this.f6710f0);
            }
        }
    }

    /* renamed from: v0 */
    public final float m65770v0(float f) {
        return (m65818V(f) * this.f6695T) + this.f6677B;
    }

    /* renamed from: w */
    public final void m65769w() {
        if (this.f6734z == 2) {
            return;
        }
        if (!this.f6722n) {
            this.f6722n = true;
            ValueAnimator m65789m = m65789m(true);
            this.f6723o = m65789m;
            this.f6724p = null;
            m65789m.start();
        }
        Iterator it = this.f6719k.iterator();
        for (int i = 0; i < this.f6687L.size() && it.hasNext(); i++) {
            if (i != this.f6689N) {
                m65808c0((TooltipDrawable) it.next(), ((Float) this.f6687L.get(i)).floatValue());
            }
        }
        if (it.hasNext()) {
            m65808c0((TooltipDrawable) it.next(), ((Float) this.f6687L.get(this.f6689N)).floatValue());
            return;
        }
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f6719k.size()), Integer.valueOf(this.f6687L.size())));
    }

    /* renamed from: w0 */
    public final void m65768w0() {
        float f = this.f6690O;
        if (f == 0.0f) {
            return;
        }
        if (((int) f) != f) {
            Log.w(f6670k0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f)));
        }
        float f2 = this.f6685J;
        if (((int) f2) != f2) {
            Log.w(f6670k0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f2)));
        }
        float f3 = this.f6686K;
        if (((int) f3) != f3) {
            Log.w(f6670k0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f3)));
        }
    }

    /* renamed from: x */
    public final void m65767x() {
        if (this.f6722n) {
            this.f6722n = false;
            ValueAnimator m65789m = m65789m(false);
            this.f6724p = m65789m;
            this.f6723o = null;
            m65789m.addListener(new C1546b());
            this.f6724p.start();
        }
    }

    /* renamed from: y */
    public final void m65766y(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i == 66) {
                        m65819U(Integer.MIN_VALUE);
                        return;
                    }
                    return;
                }
                m65819U(Integer.MAX_VALUE);
                return;
            }
            m65820T(Integer.MIN_VALUE);
            return;
        }
        m65820T(Integer.MAX_VALUE);
    }

    /* renamed from: z */
    public final String m65765z(float f) {
        String str;
        if (hasLabelFormatter()) {
            return this.f6683H.getFormattedValue(f);
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
    public class RunnableC1547c implements Runnable {

        /* renamed from: a */
        public int f6737a;

        public RunnableC1547c() {
            this.f6737a = -1;
        }

        /* renamed from: a */
        public void m65764a(int i) {
            this.f6737a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1544Va.this.f6711g.sendEventForVirtualView(this.f6737a, 4);
        }

        public /* synthetic */ RunnableC1547c(AbstractC1544Va abstractC1544Va, C1545a c1545a) {
            this();
        }
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        this.f6712g0 = m65833G(drawable);
        this.f6714h0.clear();
        postInvalidate();
    }

    public void setValues(@NonNull List<Float> list) {
        m65806d0(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.f6712g0 = null;
        this.f6714h0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.f6714h0.add(m65833G(drawable));
        }
        postInvalidate();
    }
}
