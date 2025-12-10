package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.ClipOp;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.drawscope.DrawContext;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.State;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class StateLayer {

    /* renamed from: a */
    public final boolean f25599a;

    /* renamed from: b */
    public final State f25600b;

    /* renamed from: c */
    public final Animatable f25601c;

    /* renamed from: d */
    public final List f25602d;

    /* renamed from: e */
    public Interaction f25603e;

    public StateLayer(boolean z, State rippleAlpha) {
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.f25599a = z;
        this.f25600b = rippleAlpha;
        this.f25601c = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.f25602d = new ArrayList();
    }

    /* renamed from: b */
    public final void m60660b(DrawScope drawStateLayer, float f, long j) {
        float mo69622toPx0680j_4;
        Intrinsics.checkNotNullParameter(drawStateLayer, "$this$drawStateLayer");
        if (Float.isNaN(f)) {
            mo69622toPx0680j_4 = RippleAnimationKt.m70359getRippleEndRadiuscSwnlzA(drawStateLayer, this.f25599a, drawStateLayer.mo72328getSizeNHjbRc());
        } else {
            mo69622toPx0680j_4 = drawStateLayer.mo69622toPx0680j_4(f);
        }
        float f2 = mo69622toPx0680j_4;
        float floatValue = ((Number) this.f25601c.getValue()).floatValue();
        if (floatValue > 0.0f) {
            long m71918copywmQWz5c$default = Color.m71918copywmQWz5c$default(j, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (this.f25599a) {
                float m71755getWidthimpl = Size.m71755getWidthimpl(drawStateLayer.mo72328getSizeNHjbRc());
                float m71752getHeightimpl = Size.m71752getHeightimpl(drawStateLayer.mo72328getSizeNHjbRc());
                int m71908getIntersectrtfAjoo = ClipOp.Companion.m71908getIntersectrtfAjoo();
                DrawContext drawContext = drawStateLayer.getDrawContext();
                long mo72334getSizeNHjbRc = drawContext.mo72334getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo72337clipRectN_I0leg(0.0f, 0.0f, m71755getWidthimpl, m71752getHeightimpl, m71908getIntersectrtfAjoo);
                AbstractC12264mK.m26679x(drawStateLayer, m71918copywmQWz5c$default, f2, 0L, 0.0f, null, null, 0, 124, null);
                drawContext.getCanvas().restore();
                drawContext.mo72335setSizeuvyYCjk(mo72334getSizeNHjbRc);
                return;
            }
            AbstractC12264mK.m26679x(drawStateLayer, m71918copywmQWz5c$default, f2, 0L, 0.0f, null, null, 0, 124, null);
        }
    }

    /* renamed from: c */
    public final void m60659c(Interaction interaction, CoroutineScope scope) {
        AnimationSpec m60662b;
        float f;
        AnimationSpec m60663a;
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        boolean z = interaction instanceof HoverInteraction.Enter;
        if (z) {
            this.f25602d.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            this.f25602d.remove(((HoverInteraction.Exit) interaction).getEnter());
        } else if (interaction instanceof FocusInteraction.Focus) {
            this.f25602d.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.f25602d.remove(((FocusInteraction.Unfocus) interaction).getFocus());
        } else if (interaction instanceof DragInteraction.Start) {
            this.f25602d.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            this.f25602d.remove(((DragInteraction.Stop) interaction).getStart());
        } else if (interaction instanceof DragInteraction.Cancel) {
            this.f25602d.remove(((DragInteraction.Cancel) interaction).getStart());
        } else {
            return;
        }
        Interaction interaction2 = (Interaction) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) this.f25602d);
        if (!Intrinsics.areEqual(this.f25603e, interaction2)) {
            if (interaction2 == null) {
                m60662b = RippleKt.m60662b(this.f25603e);
                AbstractC1539Vc.m65885e(scope, null, null, new StateLayer$handleInteraction$2(this, m60662b, null), 3, null);
            } else {
                if (z) {
                    f = ((RippleAlpha) this.f25600b.getValue()).getHoveredAlpha();
                } else if (interaction instanceof FocusInteraction.Focus) {
                    f = ((RippleAlpha) this.f25600b.getValue()).getFocusedAlpha();
                } else if (interaction instanceof DragInteraction.Start) {
                    f = ((RippleAlpha) this.f25600b.getValue()).getDraggedAlpha();
                } else {
                    f = 0.0f;
                }
                m60663a = RippleKt.m60663a(interaction2);
                AbstractC1539Vc.m65885e(scope, null, null, new StateLayer$handleInteraction$1(this, f, m60663a, null), 3, null);
            }
            this.f25603e = interaction2;
        }
    }
}