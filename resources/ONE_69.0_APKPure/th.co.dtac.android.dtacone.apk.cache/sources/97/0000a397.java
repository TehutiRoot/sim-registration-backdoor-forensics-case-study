package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;

/* loaded from: classes4.dex */
class ClockFaceView extends AbstractC22587us1 implements ClockHandView.OnRotateListener {

    /* renamed from: A */
    public final ClockHandView f51142A;

    /* renamed from: B */
    public final Rect f51143B;

    /* renamed from: C */
    public final RectF f51144C;

    /* renamed from: D */
    public final Rect f51145D;

    /* renamed from: E */
    public final SparseArray f51146E;

    /* renamed from: F */
    public final AccessibilityDelegateCompat f51147F;

    /* renamed from: G */
    public final int[] f51148G;

    /* renamed from: H */
    public final float[] f51149H;

    /* renamed from: I */
    public final int f51150I;

    /* renamed from: J */
    public final int f51151J;

    /* renamed from: K */
    public final int f51152K;

    /* renamed from: L */
    public final int f51153L;

    /* renamed from: M */
    public String[] f51154M;

    /* renamed from: N */
    public float f51155N;

    /* renamed from: O */
    public final ColorStateList f51156O;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    /* loaded from: classes4.dex */
    public class ViewTreeObserver$OnPreDrawListenerC7114a implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserver$OnPreDrawListenerC7114a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo1005m(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f51142A.m43647j()) - ClockFaceView.this.f51150I);
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    /* loaded from: classes4.dex */
    public class C7115b extends AccessibilityDelegateCompat {
        public C7115b() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
            if (intValue > 0) {
                accessibilityNodeInfoCompat.setTraversalAfter((View) ClockFaceView.this.f51146E.get(intValue - 1));
            }
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, intValue, 1, false, view.isSelected()));
            accessibilityNodeInfoCompat.setClickable(true);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 16) {
                long uptimeMillis = SystemClock.uptimeMillis();
                view.getHitRect(ClockFaceView.this.f51143B);
                float centerX = ClockFaceView.this.f51143B.centerX();
                float centerY = ClockFaceView.this.f51143B.centerY();
                ClockFaceView.this.f51142A.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                ClockFaceView.this.f51142A.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                return true;
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    /* renamed from: y */
    public static float m43658y(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    /* renamed from: A */
    public void m43668A(String[] strArr, int i) {
        this.f51154M = strArr;
        m43667B(i);
    }

    /* renamed from: B */
    public final void m43667B(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f51146E.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.f51154M.length, size); i2++) {
            TextView textView = (TextView) this.f51146E.get(i2);
            if (i2 >= this.f51154M.length) {
                removeView(textView);
                this.f51146E.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.f51146E.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f51154M[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                ViewCompat.setAccessibilityDelegate(textView, this.f51147F);
                textView.setTextColor(this.f51156O);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.f51154M[i2]));
                }
            }
        }
        this.f51142A.m43637t(z);
    }

    @Override // p000.AbstractC22587us1
    /* renamed from: m */
    public void mo1005m(int i) {
        if (i != m1006l()) {
            super.mo1005m(i);
            this.f51142A.m43642o(m1006l());
        }
    }

    @Override // p000.AbstractC22587us1
    /* renamed from: o */
    public void mo1003o() {
        super.mo1003o();
        for (int i = 0; i < this.f51146E.size(); i++) {
            ((TextView) this.f51146E.get(i)).setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.f51154M.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m43662u();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int m43658y = (int) (this.f51153L / m43658y(this.f51151J / displayMetrics.heightPixels, this.f51152K / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m43658y, 1073741824);
        setMeasuredDimension(m43658y, m43658y);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f, boolean z) {
        if (Math.abs(this.f51155N - f) > 0.001f) {
            this.f51155N = f;
            m43662u();
        }
    }

    /* renamed from: u */
    public final void m43662u() {
        boolean z;
        RectF m43651f = this.f51142A.m43651f();
        TextView m43659x = m43659x(m43651f);
        for (int i = 0; i < this.f51146E.size(); i++) {
            TextView textView = (TextView) this.f51146E.get(i);
            if (textView != null) {
                if (textView == m43659x) {
                    z = true;
                } else {
                    z = false;
                }
                textView.setSelected(z);
                textView.getPaint().setShader(m43660w(m43651f, textView));
                textView.invalidate();
            }
        }
    }

    /* renamed from: v */
    public int m43661v() {
        return this.f51142A.m43652e();
    }

    /* renamed from: w */
    public final RadialGradient m43660w(RectF rectF, TextView textView) {
        textView.getHitRect(this.f51143B);
        this.f51144C.set(this.f51143B);
        textView.getLineBounds(0, this.f51145D);
        RectF rectF2 = this.f51144C;
        Rect rect = this.f51145D;
        rectF2.inset(rect.left, rect.top);
        if (!RectF.intersects(rectF, this.f51144C)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f51144C.left, rectF.centerY() - this.f51144C.top, rectF.width() * 0.5f, this.f51148G, this.f51149H, Shader.TileMode.CLAMP);
    }

    /* renamed from: x */
    public final TextView m43659x(RectF rectF) {
        float f = Float.MAX_VALUE;
        TextView textView = null;
        for (int i = 0; i < this.f51146E.size(); i++) {
            TextView textView2 = (TextView) this.f51146E.get(i);
            if (textView2 != null) {
                textView2.getHitRect(this.f51143B);
                this.f51144C.set(this.f51143B);
                this.f51144C.union(rectF);
                float width = this.f51144C.width() * this.f51144C.height();
                if (width < f) {
                    textView = textView2;
                    f = width;
                }
            }
        }
        return textView;
    }

    /* renamed from: z */
    public void m43657z(int i) {
        this.f51142A.m43641p(i);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51143B = new Rect();
        this.f51144C = new RectF();
        this.f51145D = new Rect();
        this.f51146E = new SparseArray();
        this.f51149H = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockFaceView, i, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.ClockFaceView_clockNumberTextColor);
        this.f51156O = colorStateList;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f51142A = clockHandView;
        this.f51150I = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateList.getColorForState(new int[]{16842913}, colorStateList.getDefaultColor());
        this.f51148G = new int[]{colorForState, colorForState, colorStateList.getDefaultColor()};
        clockHandView.m43655b(this);
        int defaultColor = AppCompatResources.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC7114a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f51147F = new C7115b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        m43668A(strArr, 0);
        this.f51151J = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f51152K = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f51153L = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }
}