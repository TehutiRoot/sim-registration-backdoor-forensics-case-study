package p000;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.ElevationKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jR */
/* loaded from: classes2.dex */
public final class C11520jR {

    /* renamed from: a */
    public static final C11520jR f67316a = new C11520jR();

    /* renamed from: a */
    public final AnimationSpec m29529a(Interaction interaction) {
        TweenSpec tweenSpec;
        TweenSpec tweenSpec2;
        TweenSpec tweenSpec3;
        TweenSpec tweenSpec4;
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        if (interaction instanceof PressInteraction.Press) {
            tweenSpec4 = ElevationKt.f25850b;
            return tweenSpec4;
        } else if (interaction instanceof DragInteraction.Start) {
            tweenSpec3 = ElevationKt.f25850b;
            return tweenSpec3;
        } else if (interaction instanceof HoverInteraction.Enter) {
            tweenSpec2 = ElevationKt.f25850b;
            return tweenSpec2;
        } else if (interaction instanceof FocusInteraction.Focus) {
            tweenSpec = ElevationKt.f25850b;
            return tweenSpec;
        } else {
            return null;
        }
    }

    /* renamed from: b */
    public final AnimationSpec m29528b(Interaction interaction) {
        TweenSpec tweenSpec;
        TweenSpec tweenSpec2;
        TweenSpec tweenSpec3;
        TweenSpec tweenSpec4;
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        if (interaction instanceof PressInteraction.Press) {
            tweenSpec4 = ElevationKt.f25851c;
            return tweenSpec4;
        } else if (interaction instanceof DragInteraction.Start) {
            tweenSpec3 = ElevationKt.f25851c;
            return tweenSpec3;
        } else if (interaction instanceof HoverInteraction.Enter) {
            tweenSpec2 = ElevationKt.f25852d;
            return tweenSpec2;
        } else if (interaction instanceof FocusInteraction.Focus) {
            tweenSpec = ElevationKt.f25851c;
            return tweenSpec;
        } else {
            return null;
        }
    }
}