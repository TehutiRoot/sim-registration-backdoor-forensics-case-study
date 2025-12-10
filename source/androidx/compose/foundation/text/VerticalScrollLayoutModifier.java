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
public final class VerticalScrollLayoutModifier implements LayoutModifier {

    /* renamed from: a */
    public final TextFieldScrollerPosition f14086a;

    /* renamed from: b */
    public final int f14087b;

    /* renamed from: c */
    public final TransformedText f14088c;

    /* renamed from: d */
    public final Function0 f14089d;

    public VerticalScrollLayoutModifier(TextFieldScrollerPosition scrollerPosition, int i, TransformedText transformedText, Function0 textLayoutResultProvider) {
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(transformedText, "transformedText");
        Intrinsics.checkNotNullParameter(textLayoutResultProvider, "textLayoutResultProvider");
        this.f14086a = scrollerPosition;
        this.f14087b = i;
        this.f14088c = transformedText;
        this.f14089d = textLayoutResultProvider;
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
    public final int m61045c() {
        return this.f14087b;
    }

    /* renamed from: d */
    public final TextFieldScrollerPosition m61044d() {
        return this.f14086a;
    }

    /* renamed from: e */
    public final Function0 m61043e() {
        return this.f14089d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerticalScrollLayoutModifier) {
            VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj;
            return Intrinsics.areEqual(this.f14086a, verticalScrollLayoutModifier.f14086a) && this.f14087b == verticalScrollLayoutModifier.f14087b && Intrinsics.areEqual(this.f14088c, verticalScrollLayoutModifier.f14088c) && Intrinsics.areEqual(this.f14089d, verticalScrollLayoutModifier.f14089d);
        }
        return false;
    }

    /* renamed from: f */
    public final TransformedText m61042f() {
        return this.f14088c;
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
        return (((((this.f14086a.hashCode() * 31) + this.f14087b) * 31) + this.f14088c.hashCode()) * 31) + this.f14089d.hashCode();
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
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(Constraints.m73618copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int min = Math.min(mo72811measureBRTryo0.getHeight(), Constraints.m73625getMaxHeightimpl(j));
        return MeasureScope.CC.m59532q(measure, mo72811measureBRTryo0.getWidth(), min, null, new VerticalScrollLayoutModifier$measure$1(measure, this, mo72811measureBRTryo0, min), 4, null);
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
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f14086a + ", cursorOffset=" + this.f14087b + ", transformedText=" + this.f14088c + ", textLayoutResultProvider=" + this.f14089d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
