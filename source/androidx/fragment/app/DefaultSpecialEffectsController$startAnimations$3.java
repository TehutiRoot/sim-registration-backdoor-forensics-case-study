package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$3;
import androidx.fragment.app.SpecialEffectsController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, m28850d2 = {"androidx/fragment/app/DefaultSpecialEffectsController$startAnimations$3", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "fragment_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class DefaultSpecialEffectsController$startAnimations$3 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ SpecialEffectsController.Operation f35395a;

    /* renamed from: b */
    public final /* synthetic */ DefaultSpecialEffectsController f35396b;

    /* renamed from: c */
    public final /* synthetic */ View f35397c;

    /* renamed from: d */
    public final /* synthetic */ DefaultSpecialEffectsController.C4564a f35398d;

    public DefaultSpecialEffectsController$startAnimations$3(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController defaultSpecialEffectsController, View view, DefaultSpecialEffectsController.C4564a c4564a) {
        this.f35395a = operation;
        this.f35396b = defaultSpecialEffectsController;
        this.f35397c = view;
        this.f35398d = c4564a;
    }

    /* renamed from: b */
    public static final void m54494b(DefaultSpecialEffectsController this$0, View view, DefaultSpecialEffectsController.C4564a animationInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
        this$0.getContainer().endViewTransition(view);
        animationInfo.m54492a();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        ViewGroup container = this.f35396b.getContainer();
        final DefaultSpecialEffectsController defaultSpecialEffectsController = this.f35396b;
        final View view = this.f35397c;
        final DefaultSpecialEffectsController.C4564a c4564a = this.f35398d;
        container.post(new Runnable() { // from class: YE
            @Override // java.lang.Runnable
            public final void run() {
                DefaultSpecialEffectsController$startAnimations$3.m54494b(DefaultSpecialEffectsController.this, view, c4564a);
            }
        });
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animation from operation ");
            sb.append(this.f35395a);
            sb.append(" has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Animation from operation ");
            sb.append(this.f35395a);
            sb.append(" has reached onAnimationStart.");
        }
    }
}
