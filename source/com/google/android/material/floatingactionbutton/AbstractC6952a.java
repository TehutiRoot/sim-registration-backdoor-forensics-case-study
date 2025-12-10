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
public abstract class AbstractC6952a implements InterfaceC6968c {

    /* renamed from: a */
    public final Context f49973a;

    /* renamed from: b */
    public final ExtendedFloatingActionButton f49974b;

    /* renamed from: c */
    public final ArrayList f49975c = new ArrayList();

    /* renamed from: d */
    public final C0844M4 f49976d;

    /* renamed from: e */
    public MotionSpec f49977e;

    /* renamed from: f */
    public MotionSpec f49978f;

    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    /* loaded from: classes4.dex */
    public class C6953a extends Property {
        public C6953a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(AnimationUtils.lerp(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), AbstractC6952a.this.f49974b.originalTextCsl.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            int colorForState = extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), AbstractC6952a.this.f49974b.originalTextCsl.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (AnimationUtils.lerp(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.silentlyUpdateTextColor(extendedFloatingActionButton.originalTextCsl);
            } else {
                extendedFloatingActionButton.silentlyUpdateTextColor(valueOf);
            }
        }
    }

    public AbstractC6952a(ExtendedFloatingActionButton extendedFloatingActionButton, C0844M4 c0844m4) {
        this.f49974b = extendedFloatingActionButton;
        this.f49973a = extendedFloatingActionButton.getContext();
        this.f49976d = c0844m4;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
    /* renamed from: a */
    public MotionSpec mo44676a() {
        return this.f49978f;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
    /* renamed from: c */
    public final void mo44674c(Animator.AnimatorListener animatorListener) {
        this.f49975c.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
    /* renamed from: e */
    public AnimatorSet mo44672e() {
        return m44748m(m44747n());
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
    /* renamed from: h */
    public void mo44669h() {
        this.f49976d.m67431b();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
    /* renamed from: i */
    public final void mo44668i(Animator.AnimatorListener animatorListener) {
        this.f49975c.add(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
    /* renamed from: j */
    public final void mo44667j(MotionSpec motionSpec) {
        this.f49978f = motionSpec;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
    /* renamed from: k */
    public final List mo44666k() {
        return this.f49975c;
    }

    /* renamed from: m */
    public AnimatorSet m44748m(MotionSpec motionSpec) {
        ArrayList arrayList = new ArrayList();
        if (motionSpec.hasPropertyValues("opacity")) {
            arrayList.add(motionSpec.getAnimator("opacity", this.f49974b, View.ALPHA));
        }
        if (motionSpec.hasPropertyValues("scale")) {
            arrayList.add(motionSpec.getAnimator("scale", this.f49974b, View.SCALE_Y));
            arrayList.add(motionSpec.getAnimator("scale", this.f49974b, View.SCALE_X));
        }
        if (motionSpec.hasPropertyValues("width")) {
            arrayList.add(motionSpec.getAnimator("width", this.f49974b, ExtendedFloatingActionButton.f49906L));
        }
        if (motionSpec.hasPropertyValues("height")) {
            arrayList.add(motionSpec.getAnimator("height", this.f49974b, ExtendedFloatingActionButton.f49907M));
        }
        if (motionSpec.hasPropertyValues("paddingStart")) {
            arrayList.add(motionSpec.getAnimator("paddingStart", this.f49974b, ExtendedFloatingActionButton.f49908N));
        }
        if (motionSpec.hasPropertyValues("paddingEnd")) {
            arrayList.add(motionSpec.getAnimator("paddingEnd", this.f49974b, ExtendedFloatingActionButton.f49909O));
        }
        if (motionSpec.hasPropertyValues("labelOpacity")) {
            arrayList.add(motionSpec.getAnimator("labelOpacity", this.f49974b, new C6953a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: n */
    public final MotionSpec m44747n() {
        MotionSpec motionSpec = this.f49978f;
        if (motionSpec != null) {
            return motionSpec;
        }
        if (this.f49977e == null) {
            this.f49977e = MotionSpec.createFromResource(this.f49973a, mo44673d());
        }
        return (MotionSpec) Preconditions.checkNotNull(this.f49977e);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
    public void onAnimationEnd() {
        this.f49976d.m67431b();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6968c
    public void onAnimationStart(Animator animator) {
        this.f49976d.m67430c(animator);
    }
}
