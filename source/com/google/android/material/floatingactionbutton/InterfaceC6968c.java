package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;

/* renamed from: com.google.android.material.floatingactionbutton.c */
/* loaded from: classes4.dex */
public interface InterfaceC6968c {
    /* renamed from: a */
    MotionSpec mo44676a();

    /* renamed from: b */
    boolean mo44675b();

    /* renamed from: c */
    void mo44674c(Animator.AnimatorListener animatorListener);

    /* renamed from: d */
    int mo44673d();

    /* renamed from: e */
    AnimatorSet mo44672e();

    /* renamed from: f */
    void mo44671f(ExtendedFloatingActionButton.OnChangedCallback onChangedCallback);

    /* renamed from: g */
    void mo44670g();

    /* renamed from: h */
    void mo44669h();

    /* renamed from: i */
    void mo44668i(Animator.AnimatorListener animatorListener);

    /* renamed from: j */
    void mo44667j(MotionSpec motionSpec);

    /* renamed from: k */
    List mo44666k();

    void onAnimationEnd();

    void onAnimationStart(Animator animator);
}
