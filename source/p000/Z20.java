package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import com.google.android.material.R;
import com.google.android.material.floatingactionbutton.AbstractC6954b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;

/* renamed from: Z20 */
/* loaded from: classes4.dex */
public class Z20 extends AbstractC6954b {

    /* renamed from: O */
    public StateListAnimator f7943O;

    /* renamed from: Z20$a */
    /* loaded from: classes4.dex */
    public static class C1797a extends MaterialShapeDrawable {
        public C1797a(ShapeAppearanceModel shapeAppearanceModel) {
            super(shapeAppearanceModel);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public Z20(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        super(floatingActionButton, shadowViewDelegate);
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6954b
    /* renamed from: B */
    public void mo44743B() {
        m44703h0();
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6954b
    /* renamed from: D */
    public void mo44741D(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.f50016w.isEnabled()) {
                this.f50016w.setElevation(this.f50001h);
                if (this.f50016w.isPressed()) {
                    this.f50016w.setTranslationZ(this.f50003j);
                    return;
                } else if (!this.f50016w.isFocused() && !this.f50016w.isHovered()) {
                    this.f50016w.setTranslationZ(0.0f);
                    return;
                } else {
                    this.f50016w.setTranslationZ(this.f50002i);
                    return;
                }
            }
            this.f50016w.setElevation(0.0f);
            this.f50016w.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6954b
    /* renamed from: E */
    public void mo44740E(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f50016w.refreshDrawableState();
        } else if (this.f50016w.getStateListAnimator() == this.f7943O) {
            StateListAnimator m65273l0 = m65273l0(f, f2, f3);
            this.f7943O = m65273l0;
            this.f50016w.setStateListAnimator(m65273l0);
        }
        if (mo44715b0()) {
            m44703h0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6954b
    /* renamed from: M */
    public boolean mo44732M() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6954b
    /* renamed from: X */
    public void mo44721X(ColorStateList colorStateList) {
        Drawable drawable = this.f49996c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        } else {
            super.mo44721X(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6954b
    /* renamed from: b0 */
    public boolean mo44715b0() {
        if (!this.f50017x.isCompatPaddingEnabled() && m44711d0()) {
            return false;
        }
        return true;
    }

    /* renamed from: k0 */
    public C10236fc m65274k0(int i, ColorStateList colorStateList) {
        Context context = this.f50016w.getContext();
        C10236fc c10236fc = new C10236fc((ShapeAppearanceModel) Preconditions.checkNotNull(this.f49994a));
        c10236fc.m31282e(ContextCompat.getColor(context, R.color.design_fab_stroke_top_outer_color), ContextCompat.getColor(context, R.color.design_fab_stroke_top_inner_color), ContextCompat.getColor(context, R.color.design_fab_stroke_end_inner_color), ContextCompat.getColor(context, R.color.design_fab_stroke_end_outer_color));
        c10236fc.m31283d(i);
        c10236fc.m31284c(colorStateList);
        return c10236fc;
    }

    /* renamed from: l0 */
    public final StateListAnimator m65273l0(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(AbstractC6954b.f49985I, m65272m0(f, f3));
        stateListAnimator.addState(AbstractC6954b.f49986J, m65272m0(f, f2));
        stateListAnimator.addState(AbstractC6954b.f49987K, m65272m0(f, f2));
        stateListAnimator.addState(AbstractC6954b.f49988L, m65272m0(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f50016w, "elevation", f).setDuration(0L));
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 24) {
            FloatingActionButton floatingActionButton = this.f50016w;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f50016w, View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(AbstractC6954b.f49980D);
        stateListAnimator.addState(AbstractC6954b.f49989M, animatorSet);
        stateListAnimator.addState(AbstractC6954b.f49990N, m65272m0(0.0f, 0.0f));
        return stateListAnimator;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6954b
    /* renamed from: m */
    public float mo44696m() {
        return this.f50016w.getElevation();
    }

    /* renamed from: m0 */
    public final Animator m65272m0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f50016w, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f50016w, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(AbstractC6954b.f49980D);
        return animatorSet;
    }

    /* renamed from: n0 */
    public MaterialShapeDrawable m65271n0() {
        return new C1797a((ShapeAppearanceModel) Preconditions.checkNotNull(this.f49994a));
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6954b
    /* renamed from: r */
    public void mo44691r(Rect rect) {
        if (this.f50017x.isCompatPaddingEnabled()) {
            super.mo44691r(rect);
        } else if (!m44711d0()) {
            int sizeDimension = (this.f50004k - this.f50016w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6954b
    /* renamed from: w */
    public void mo44686w(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        MaterialShapeDrawable m65271n0 = m65271n0();
        this.f49995b = m65271n0;
        m65271n0.setTintList(colorStateList);
        if (mode != null) {
            this.f49995b.setTintMode(mode);
        }
        this.f49995b.initializeElevationOverlay(this.f50016w.getContext());
        if (i > 0) {
            this.f49997d = m65274k0(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) Preconditions.checkNotNull(this.f49997d), (Drawable) Preconditions.checkNotNull(this.f49995b)});
        } else {
            this.f49997d = null;
            drawable = this.f49995b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList2), drawable, null);
        this.f49996c = rippleDrawable;
        this.f49998e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6954b
    /* renamed from: f0 */
    public void mo44707f0() {
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6954b
    /* renamed from: z */
    public void mo44683z() {
    }
}
