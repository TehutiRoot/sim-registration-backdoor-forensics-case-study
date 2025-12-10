package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.Modifier;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class FocusableInteractionNode extends Modifier.Node {

    /* renamed from: n */
    public MutableInteractionSource f12929n;

    /* renamed from: o */
    public FocusInteraction.Focus f12930o;

    public FocusableInteractionNode(MutableInteractionSource mutableInteractionSource) {
        this.f12929n = mutableInteractionSource;
    }

    /* renamed from: a */
    private final void m61537a() {
        FocusInteraction.Focus focus;
        MutableInteractionSource mutableInteractionSource = this.f12929n;
        if (mutableInteractionSource != null && (focus = this.f12930o) != null) {
            mutableInteractionSource.tryEmit(new FocusInteraction.Unfocus(focus));
        }
        this.f12930o = null;
    }

    /* renamed from: b */
    public final void m61536b(MutableInteractionSource mutableInteractionSource, Interaction interaction) {
        if (isAttached()) {
            AbstractC1539Vc.m65885e(getCoroutineScope(), null, null, new FocusableInteractionNode$emitWithFallback$1(mutableInteractionSource, interaction, null), 3, null);
        } else {
            mutableInteractionSource.tryEmit(interaction);
        }
    }

    /* renamed from: c */
    public final void m61535c(MutableInteractionSource mutableInteractionSource) {
        if (!Intrinsics.areEqual(this.f12929n, mutableInteractionSource)) {
            m61537a();
            this.f12929n = mutableInteractionSource;
        }
    }

    public final void setFocus(boolean z) {
        MutableInteractionSource mutableInteractionSource = this.f12929n;
        if (mutableInteractionSource != null) {
            if (z) {
                FocusInteraction.Focus focus = this.f12930o;
                if (focus != null) {
                    m61536b(mutableInteractionSource, new FocusInteraction.Unfocus(focus));
                    this.f12930o = null;
                }
                FocusInteraction.Focus focus2 = new FocusInteraction.Focus();
                m61536b(mutableInteractionSource, focus2);
                this.f12930o = focus2;
                return;
            }
            FocusInteraction.Focus focus3 = this.f12930o;
            if (focus3 != null) {
                m61536b(mutableInteractionSource, new FocusInteraction.Unfocus(focus3));
                this.f12930o = null;
            }
        }
    }
}