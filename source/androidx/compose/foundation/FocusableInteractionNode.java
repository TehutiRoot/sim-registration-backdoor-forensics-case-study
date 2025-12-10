package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.Modifier;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class FocusableInteractionNode extends Modifier.Node {

    /* renamed from: n */
    public MutableInteractionSource f12841n;

    /* renamed from: o */
    public FocusInteraction.Focus f12842o;

    public FocusableInteractionNode(MutableInteractionSource mutableInteractionSource) {
        this.f12841n = mutableInteractionSource;
    }

    /* renamed from: a */
    private final void m61587a() {
        FocusInteraction.Focus focus;
        MutableInteractionSource mutableInteractionSource = this.f12841n;
        if (mutableInteractionSource != null && (focus = this.f12842o) != null) {
            mutableInteractionSource.tryEmit(new FocusInteraction.Unfocus(focus));
        }
        this.f12842o = null;
    }

    /* renamed from: b */
    public final void m61586b(MutableInteractionSource mutableInteractionSource, Interaction interaction) {
        if (isAttached()) {
            AbstractC1552Vc.m65753e(getCoroutineScope(), null, null, new FocusableInteractionNode$emitWithFallback$1(mutableInteractionSource, interaction, null), 3, null);
        } else {
            mutableInteractionSource.tryEmit(interaction);
        }
    }

    /* renamed from: c */
    public final void m61585c(MutableInteractionSource mutableInteractionSource) {
        if (!Intrinsics.areEqual(this.f12841n, mutableInteractionSource)) {
            m61587a();
            this.f12841n = mutableInteractionSource;
        }
    }

    public final void setFocus(boolean z) {
        MutableInteractionSource mutableInteractionSource = this.f12841n;
        if (mutableInteractionSource != null) {
            if (z) {
                FocusInteraction.Focus focus = this.f12842o;
                if (focus != null) {
                    m61586b(mutableInteractionSource, new FocusInteraction.Unfocus(focus));
                    this.f12842o = null;
                }
                FocusInteraction.Focus focus2 = new FocusInteraction.Focus();
                m61586b(mutableInteractionSource, focus2);
                this.f12842o = focus2;
                return;
            }
            FocusInteraction.Focus focus3 = this.f12842o;
            if (focus3 != null) {
                m61586b(mutableInteractionSource, new FocusInteraction.Unfocus(focus3));
                this.f12842o = null;
            }
        }
    }
}
