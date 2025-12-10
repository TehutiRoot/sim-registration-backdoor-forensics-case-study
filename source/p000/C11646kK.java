package p000;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.DrawModifier;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.platform.InspectorValueInfo;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kK */
/* loaded from: classes.dex */
public final class C11646kK extends InspectorValueInfo implements DrawModifier {

    /* renamed from: c */
    public final AndroidEdgeEffectOverscrollEffect f67889c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11646kK(AndroidEdgeEffectOverscrollEffect overscrollEffect, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(overscrollEffect, "overscrollEffect");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f67889c = overscrollEffect;
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC20114gt0.m30962a(this, function1);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC20114gt0.m30961b(this, function1);
    }

    @Override // androidx.compose.p003ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        contentDrawScope.drawContent();
        this.f67889c.drawOverscroll(contentDrawScope);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11646kK)) {
            return false;
        }
        return Intrinsics.areEqual(this.f67889c, ((C11646kK) obj).f67889c);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC20114gt0.m30960c(this, obj, function2);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC20114gt0.m30959d(this, obj, function2);
    }

    public int hashCode() {
        return this.f67889c.hashCode();
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC19942ft0.m31254a(this, modifier);
    }

    public String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f67889c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
