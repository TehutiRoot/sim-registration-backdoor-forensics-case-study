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
import com.google.android.material.floatingactionbutton.AbstractC6943b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;

/* renamed from: d30  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C19505d30 extends AbstractC6943b {

    /* renamed from: O */
    public StateListAnimator f61073O;

    /* renamed from: d30$a */
    /* loaded from: classes4.dex */
    public static class C10033a extends MaterialShapeDrawable {
        public C10033a(ShapeAppearanceModel shapeAppearanceModel) {
            super(shapeAppearanceModel);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public C19505d30(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        super(floatingActionButton, shadowViewDelegate);
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6943b
    /* renamed from: B */
    public void mo31941B() {
        m44686h0();
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6943b
    /* renamed from: D */
    public void mo31940D(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.f50028w.isEnabled()) {
                this.f50028w.setElevation(this.f50013h);
                if (this.f50028w.isPressed()) {
                    this.f50028w.setTranslationZ(this.f50015j);
                    return;
                } else if (!this.f50028w.isFocused() && !this.f50028w.isHovered()) {
                    this.f50028w.setTranslationZ(0.0f);
                    return;
                } else {
                    this.f50028w.setTranslationZ(this.f50014i);
                    return;
                }
            }
            this.f50028w.setElevation(0.0f);
            this.f50028w.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6943b
    /* renamed from: E */
    public void mo31939E(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f50028w.refreshDrawableState();
        } else if (this.f50028w.getStateListAnimator() == this.f61073O) {
            StateListAnimator m31933l0 = m31933l0(f, f2, f3);
            this.f61073O = m31933l0;
            this.f50028w.setStateListAnimator(m31933l0);
        }
        if (mo31936b0()) {
            m44686h0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6943b
    /* renamed from: M */
    public boolean mo31938M() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6943b
    /* renamed from: X */
    public void mo31937X(ColorStateList colorStateList) {
        Drawable drawable = this.f50008c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        } else {
            super.mo31937X(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6943b
    /* renamed from: b0 */
    public boolean mo31936b0() {
        if (!this.f50029x.isCompatPaddingEnabled() && m44693d0()) {
            return false;
        }
        return true;
    }

    /* renamed from: k0 */
    public C10233fc m31934k0(int i, ColorStateList colorStateList) {
        Context context = this.f50028w.getContext();
        C10233fc c10233fc = new C10233fc((ShapeAppearanceModel) Preconditions.checkNotNull(this.f50006a));
        c10233fc.m31497e(ContextCompat.getColor(context, R.color.design_fab_stroke_top_outer_color), ContextCompat.getColor(context, R.color.design_fab_stroke_top_inner_color), ContextCompat.getColor(context, R.color.design_fab_stroke_end_inner_color), ContextCompat.getColor(context, R.color.design_fab_stroke_end_outer_color));
        c10233fc.m31498d(i);
        c10233fc.m31499c(colorStateList);
        return c10233fc;
    }

    /* renamed from: l0 */
    public final StateListAnimator m31933l0(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(AbstractC6943b.f49997I, m31931m0(f, f3));
        stateListAnimator.addState(AbstractC6943b.f49998J, m31931m0(f, f2));
        stateListAnimator.addState(AbstractC6943b.f49999K, m31931m0(f, f2));
        stateListAnimator.addState(AbstractC6943b.f50000L, m31931m0(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f50028w, "elevation", f).setDuration(0L));
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 24) {
            FloatingActionButton floatingActionButton = this.f50028w;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f50028w, View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(AbstractC6943b.f49992D);
        stateListAnimator.addState(AbstractC6943b.f50001M, animatorSet);
        stateListAnimator.addState(AbstractC6943b.f50002N, m31931m0(0.0f, 0.0f));
        return stateListAnimator;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6943b
    /* renamed from: m */
    public float mo31932m() {
        return this.f50028w.getElevation();
    }

    /* renamed from: m0 */
    public final Animator m31931m0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f50028w, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f50028w, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(AbstractC6943b.f49992D);
        return animatorSet;
    }

    /* renamed from: n0 */
    public MaterialShapeDrawable m31930n0() {
        return new C10033a((ShapeAppearanceModel) Preconditions.checkNotNull(this.f50006a));
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6943b
    /* renamed from: r */
    public void mo31929r(Rect rect) {
        if (this.f50029x.isCompatPaddingEnabled()) {
            super.mo31929r(rect);
        } else if (!m44693d0()) {
            int sizeDimension = (this.f50016k - this.f50028w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6943b
    /* renamed from: w */
    public void mo31928w(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        MaterialShapeDrawable m31930n0 = m31930n0();
        this.f50007b = m31930n0;
        m31930n0.setTintList(colorStateList);
        if (mode != null) {
            this.f50007b.setTintMode(mode);
        }
        this.f50007b.initializeElevationOverlay(this.f50028w.getContext());
        if (i > 0) {
            this.f50009d = m31934k0(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) Preconditions.checkNotNull(this.f50009d), (Drawable) Preconditions.checkNotNull(this.f50007b)});
        } else {
            this.f50009d = null;
            drawable = this.f50007b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList2), drawable, null);
        this.f50008c = rippleDrawable;
        this.f50010e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6943b
    /* renamed from: f0 */
    public void mo31935f0() {
    }

    @Override // com.google.android.material.floatingactionbutton.AbstractC6943b
    /* renamed from: z */
    public void mo31927z() {
    }
}