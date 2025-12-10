package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
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
    public final boolean f25511a;

    /* renamed from: b */
    public final State f25512b;

    /* renamed from: c */
    public final Animatable f25513c;

    /* renamed from: d */
    public final List f25514d;

    /* renamed from: e */
    public Interaction f25515e;

    public StateLayer(boolean z, State rippleAlpha) {
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.f25511a = z;
        this.f25512b = rippleAlpha;
        this.f25513c = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.f25514d = new ArrayList();
    }

    /* renamed from: b */
    public final void m60710b(DrawScope drawStateLayer, float f, long j) {
        float mo69438toPx0680j_4;
        Intrinsics.checkNotNullParameter(drawStateLayer, "$this$drawStateLayer");
        if (Float.isNaN(f)) {
            mo69438toPx0680j_4 = RippleAnimationKt.m70175getRippleEndRadiuscSwnlzA(drawStateLayer, this.f25511a, drawStateLayer.mo72144getSizeNHjbRc());
        } else {
            mo69438toPx0680j_4 = drawStateLayer.mo69438toPx0680j_4(f);
        }
        float f2 = mo69438toPx0680j_4;
        float floatValue = ((Number) this.f25513c.getValue()).floatValue();
        if (floatValue > 0.0f) {
            long m71734copywmQWz5c$default = Color.m71734copywmQWz5c$default(j, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (this.f25511a) {
                float m71571getWidthimpl = Size.m71571getWidthimpl(drawStateLayer.mo72144getSizeNHjbRc());
                float m71568getHeightimpl = Size.m71568getHeightimpl(drawStateLayer.mo72144getSizeNHjbRc());
                int m71724getIntersectrtfAjoo = ClipOp.Companion.m71724getIntersectrtfAjoo();
                DrawContext drawContext = drawStateLayer.getDrawContext();
                long mo72150getSizeNHjbRc = drawContext.mo72150getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo72153clipRectN_I0leg(0.0f, 0.0f, m71571getWidthimpl, m71568getHeightimpl, m71724getIntersectrtfAjoo);
                AbstractC12212lK.m26490x(drawStateLayer, m71734copywmQWz5c$default, f2, 0L, 0.0f, null, null, 0, 124, null);
                drawContext.getCanvas().restore();
                drawContext.mo72151setSizeuvyYCjk(mo72150getSizeNHjbRc);
                return;
            }
            AbstractC12212lK.m26490x(drawStateLayer, m71734copywmQWz5c$default, f2, 0L, 0.0f, null, null, 0, 124, null);
        }
    }

    /* renamed from: c */
    public final void m60709c(Interaction interaction, CoroutineScope scope) {
        float f;
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        boolean z = interaction instanceof HoverInteraction.Enter;
        if (z) {
            this.f25514d.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            this.f25514d.remove(((HoverInteraction.Exit) interaction).getEnter());
        } else if (interaction instanceof FocusInteraction.Focus) {
            this.f25514d.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.f25514d.remove(((FocusInteraction.Unfocus) interaction).getFocus());
        } else if (interaction instanceof DragInteraction.Start) {
            this.f25514d.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            this.f25514d.remove(((DragInteraction.Stop) interaction).getStart());
        } else if (interaction instanceof DragInteraction.Cancel) {
            this.f25514d.remove(((DragInteraction.Cancel) interaction).getStart());
        } else {
            return;
        }
        Interaction interaction2 = (Interaction) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) this.f25514d);
        if (!Intrinsics.areEqual(this.f25515e, interaction2)) {
            if (interaction2 == null) {
                AbstractC1552Vc.m65753e(scope, null, null, new StateLayer$handleInteraction$2(this, RippleKt.access$outgoingStateLayerAnimationSpecFor(this.f25515e), null), 3, null);
            } else {
                if (z) {
                    f = ((RippleAlpha) this.f25512b.getValue()).getHoveredAlpha();
                } else if (interaction instanceof FocusInteraction.Focus) {
                    f = ((RippleAlpha) this.f25512b.getValue()).getFocusedAlpha();
                } else if (interaction instanceof DragInteraction.Start) {
                    f = ((RippleAlpha) this.f25512b.getValue()).getDraggedAlpha();
                } else {
                    f = 0.0f;
                }
                AbstractC1552Vc.m65753e(scope, null, null, new StateLayer$handleInteraction$1(this, f, RippleKt.access$incomingStateLayerAnimationSpecFor(interaction2), null), 3, null);
            }
            this.f25515e = interaction2;
        }
    }
}
