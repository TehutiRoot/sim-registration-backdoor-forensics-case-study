package androidx.compose.foundation.text;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutModifier;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.text.input.TransformedText;
import androidx.compose.p003ui.unit.Constraints;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class HorizontalScrollLayoutModifier implements LayoutModifier {

    /* renamed from: a */
    public final TextFieldScrollerPosition f13965a;

    /* renamed from: b */
    public final int f13966b;

    /* renamed from: c */
    public final TransformedText f13967c;

    /* renamed from: d */
    public final Function0 f13968d;

    public HorizontalScrollLayoutModifier(TextFieldScrollerPosition scrollerPosition, int i, TransformedText transformedText, Function0 textLayoutResultProvider) {
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(transformedText, "transformedText");
        Intrinsics.checkNotNullParameter(textLayoutResultProvider, "textLayoutResultProvider");
        this.f13965a = scrollerPosition;
        this.f13966b = i;
        this.f13967c = transformedText;
        this.f13968d = textLayoutResultProvider;
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC20114gt0.m30962a(this, function1);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC20114gt0.m30961b(this, function1);
    }

    /* renamed from: c */
    public final int m61069c() {
        return this.f13966b;
    }

    /* renamed from: d */
    public final TextFieldScrollerPosition m61068d() {
        return this.f13965a;
    }

    /* renamed from: e */
    public final Function0 m61067e() {
        return this.f13968d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HorizontalScrollLayoutModifier) {
            HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) obj;
            return Intrinsics.areEqual(this.f13965a, horizontalScrollLayoutModifier.f13965a) && this.f13966b == horizontalScrollLayoutModifier.f13966b && Intrinsics.areEqual(this.f13967c, horizontalScrollLayoutModifier.f13967c) && Intrinsics.areEqual(this.f13968d, horizontalScrollLayoutModifier.f13968d);
        }
        return false;
    }

    /* renamed from: f */
    public final TransformedText m61066f() {
        return this.f13967c;
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
        return (((((this.f13965a.hashCode() * 31) + this.f13966b) * 31) + this.f13967c.hashCode()) * 31) + this.f13968d.hashCode();
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC20425ii0.m30600a(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC20425ii0.m30599b(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69160measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        long m73618copyZbe2FdA$default;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (measurable.maxIntrinsicWidth(Constraints.m73625getMaxHeightimpl(j)) < Constraints.m73626getMaxWidthimpl(j)) {
            m73618copyZbe2FdA$default = j;
        } else {
            m73618copyZbe2FdA$default = Constraints.m73618copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 13, null);
        }
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(m73618copyZbe2FdA$default);
        int min = Math.min(mo72811measureBRTryo0.getWidth(), Constraints.m73626getMaxWidthimpl(j));
        return MeasureScope.CC.m59532q(measure, min, mo72811measureBRTryo0.getHeight(), null, new HorizontalScrollLayoutModifier$measure$1(measure, this, mo72811measureBRTryo0, min), 4, null);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC20425ii0.m30598c(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC20425ii0.m30597d(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC19942ft0.m31254a(this, modifier);
    }

    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f13965a + ", cursorOffset=" + this.f13966b + ", transformedText=" + this.f13967c + ", textLayoutResultProvider=" + this.f13968d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
