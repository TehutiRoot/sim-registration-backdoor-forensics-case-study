package p000;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tc */
/* loaded from: classes.dex */
public final class C14013tc implements BoxWithConstraintsScope, BoxScope {

    /* renamed from: a */
    public final Density f80159a;

    /* renamed from: b */
    public final long f80160b;

    /* renamed from: c */
    public final /* synthetic */ BoxScopeInstance f80161c;

    public /* synthetic */ C14013tc(Density density, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(density, j);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier align(Modifier modifier, Alignment alignment) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return this.f80161c.align(modifier, alignment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14013tc)) {
            return false;
        }
        C14013tc c14013tc = (C14013tc) obj;
        if (Intrinsics.areEqual(this.f80159a, c14013tc.f80159a) && Constraints.m73620equalsimpl0(this.f80160b, c14013tc.f80160b)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getConstraints-msEJaDk */
    public long mo69493getConstraintsmsEJaDk() {
        return this.f80160b;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxHeight-D9Ej5fM */
    public float mo69494getMaxHeightD9Ej5fM() {
        Density density = this.f80159a;
        if (Constraints.m73621getHasBoundedHeightimpl(mo69493getConstraintsmsEJaDk())) {
            return density.mo69435toDpu2uoSUM(Constraints.m73625getMaxHeightimpl(mo69493getConstraintsmsEJaDk()));
        }
        return C3641Dp.Companion.m73677getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxWidth-D9Ej5fM */
    public float mo69495getMaxWidthD9Ej5fM() {
        Density density = this.f80159a;
        if (Constraints.m73622getHasBoundedWidthimpl(mo69493getConstraintsmsEJaDk())) {
            return density.mo69435toDpu2uoSUM(Constraints.m73626getMaxWidthimpl(mo69493getConstraintsmsEJaDk()));
        }
        return C3641Dp.Companion.m73677getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinHeight-D9Ej5fM */
    public float mo69496getMinHeightD9Ej5fM() {
        return this.f80159a.mo69435toDpu2uoSUM(Constraints.m73627getMinHeightimpl(mo69493getConstraintsmsEJaDk()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinWidth-D9Ej5fM */
    public float mo69497getMinWidthD9Ej5fM() {
        return this.f80159a.mo69435toDpu2uoSUM(Constraints.m73628getMinWidthimpl(mo69493getConstraintsmsEJaDk()));
    }

    public int hashCode() {
        return (this.f80159a.hashCode() * 31) + Constraints.m73629hashCodeimpl(this.f80160b);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier matchParentSize(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return this.f80161c.matchParentSize(modifier);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f80159a + ", constraints=" + ((Object) Constraints.m73631toStringimpl(this.f80160b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C14013tc(Density density, long j) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f80159a = density;
        this.f80160b = j;
        this.f80161c = BoxScopeInstance.INSTANCE;
    }
}
