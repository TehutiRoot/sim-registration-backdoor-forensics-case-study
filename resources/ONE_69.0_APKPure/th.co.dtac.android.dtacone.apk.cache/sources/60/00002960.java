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
    public final TextFieldScrollerPosition f14174a;

    /* renamed from: b */
    public final int f14175b;

    /* renamed from: c */
    public final TransformedText f14176c;

    /* renamed from: d */
    public final Function0 f14177d;

    public VerticalScrollLayoutModifier(TextFieldScrollerPosition scrollerPosition, int i, TransformedText transformedText, Function0 textLayoutResultProvider) {
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(transformedText, "transformedText");
        Intrinsics.checkNotNullParameter(textLayoutResultProvider, "textLayoutResultProvider");
        this.f14174a = scrollerPosition;
        this.f14175b = i;
        this.f14176c = transformedText;
        this.f14177d = textLayoutResultProvider;
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC21205mt0.m26489a(this, function1);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC21205mt0.m26488b(this, function1);
    }

    /* renamed from: c */
    public final int m60995c() {
        return this.f14175b;
    }

    /* renamed from: d */
    public final TextFieldScrollerPosition m60994d() {
        return this.f14174a;
    }

    /* renamed from: e */
    public final Function0 m60993e() {
        return this.f14177d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerticalScrollLayoutModifier) {
            VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj;
            return Intrinsics.areEqual(this.f14174a, verticalScrollLayoutModifier.f14174a) && this.f14175b == verticalScrollLayoutModifier.f14175b && Intrinsics.areEqual(this.f14176c, verticalScrollLayoutModifier.f14176c) && Intrinsics.areEqual(this.f14177d, verticalScrollLayoutModifier.f14177d);
        }
        return false;
    }

    /* renamed from: f */
    public final TransformedText m60992f() {
        return this.f14176c;
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC21205mt0.m26487c(this, obj, function2);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC21205mt0.m26486d(this, obj, function2);
    }

    public int hashCode() {
        return (((((this.f14174a.hashCode() * 31) + this.f14175b) * 31) + this.f14176c.hashCode()) * 31) + this.f14177d.hashCode();
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC21518oi0.m26084a(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC21518oi0.m26083b(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69364measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo72995measureBRTryo0 = measurable.mo72995measureBRTryo0(Constraints.m73802copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int min = Math.min(mo72995measureBRTryo0.getHeight(), Constraints.m73809getMaxHeightimpl(j));
        return MeasureScope.CC.m59482q(measure, mo72995measureBRTryo0.getWidth(), min, null, new VerticalScrollLayoutModifier$measure$1(measure, this, mo72995measureBRTryo0, min), 4, null);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC21518oi0.m26082c(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC21518oi0.m26081d(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC21032lt0.m26768a(this, modifier);
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f14174a + ", cursorOffset=" + this.f14175b + ", transformedText=" + this.f14176c + ", textLayoutResultProvider=" + this.f14177d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}