package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.core.util.Preconditions;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.MotionSpec;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.floatingactionbutton.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6941a implements InterfaceC6957c {

    /* renamed from: a */
    public final Context f49985a;

    /* renamed from: b */
    public final ExtendedFloatingActionButton f49986b;

    /* renamed from: c */
    public final ArrayList f49987c = new ArrayList();

    /* renamed from: d */
    public final C0841M4 f49988d;

    /* renamed from: e */
    public MotionSpec f49989e;

    /* renamed from: f */
    public MotionSpec f49990f;

    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    /* loaded from: classes4.dex */
    public class C6942a extends Property {
        public C6942a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(AnimationUtils.lerp(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), AbstractC6941a.this.f49986b.originalTextCsl.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            int colorForState = extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), AbstractC6941a.this.f49986b.originalTextCsl.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (AnimationUtils.lerp(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.silentlyUpdateTextColor(extendedFloatingActionButton.originalTextCsl);
            } else {
                extendedFloatingActionButton.silentlyUpdateTextColor(valueOf);
            }
        }
    }

    public AbstractC6941a(ExtendedFloatingActionButton extendedFloatingActionButton, C0841M4 c0841m4) {
        this.f49986b = extendedFloatingActionButton;
        this.f49985a = extendedFloatingActionButton.getContext();
        this.f49988d = c0841m4;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6957c
    /* renamed from: a */
    public MotionSpec mo44663a() {
        return this.f49990f;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6957c
    /* renamed from: c */
    public final void mo44661c(Animator.AnimatorListener animatorListener) {
        this.f49987c.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6957c
    /* renamed from: e */
    public AnimatorSet mo44659e() {
        return m44724m(m44723n());
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6957c
    /* renamed from: h */
    public void mo44656h() {
        this.f49988d.m67454b();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6957c
    /* renamed from: i */
    public final void mo44655i(Animator.AnimatorListener animatorListener) {
        this.f49987c.add(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6957c
    /* renamed from: j */
    public final void mo44654j(MotionSpec motionSpec) {
        this.f49990f = motionSpec;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6957c
    /* renamed from: k */
    public final List mo44653k() {
        return this.f49987c;
    }

    /* renamed from: m */
    public AnimatorSet m44724m(MotionSpec motionSpec) {
        ArrayList arrayList = new ArrayList();
        if (motionSpec.hasPropertyValues("opacity")) {
            arrayList.add(motionSpec.getAnimator("opacity", this.f49986b, View.ALPHA));
        }
        if (motionSpec.hasPropertyValues("scale")) {
            arrayList.add(motionSpec.getAnimator("scale", this.f49986b, View.SCALE_Y));
            arrayList.add(motionSpec.getAnimator("scale", this.f49986b, View.SCALE_X));
        }
        if (motionSpec.hasPropertyValues("width")) {
            arrayList.add(motionSpec.getAnimator("width", this.f49986b, ExtendedFloatingActionButton.f49918L));
        }
        if (motionSpec.hasPropertyValues("height")) {
            arrayList.add(motionSpec.getAnimator("height", this.f49986b, ExtendedFloatingActionButton.f49919M));
        }
        if (motionSpec.hasPropertyValues("paddingStart")) {
            arrayList.add(motionSpec.getAnimator("paddingStart", this.f49986b, ExtendedFloatingActionButton.f49920N));
        }
        if (motionSpec.hasPropertyValues("paddingEnd")) {
            arrayList.add(motionSpec.getAnimator("paddingEnd", this.f49986b, ExtendedFloatingActionButton.f49921O));
        }
        if (motionSpec.hasPropertyValues("labelOpacity")) {
            arrayList.add(motionSpec.getAnimator("labelOpacity", this.f49986b, new C6942a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: n */
    public final MotionSpec m44723n() {
        MotionSpec motionSpec = this.f49990f;
        if (motionSpec != null) {
            return motionSpec;
        }
        if (this.f49989e == null) {
            this.f49989e = MotionSpec.createFromResource(this.f49985a, mo44660d());
        }
        return (MotionSpec) Preconditions.checkNotNull(this.f49989e);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6957c
    public void onAnimationEnd() {
        this.f49988d.m67454b();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6957c
    public void onAnimationStart(Animator animator) {
        this.f49988d.m67453c(animator);
    }
}