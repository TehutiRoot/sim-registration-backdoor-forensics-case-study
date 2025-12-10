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
    public final TextFieldScrollerPosition f14053a;

    /* renamed from: b */
    public final int f14054b;

    /* renamed from: c */
    public final TransformedText f14055c;

    /* renamed from: d */
    public final Function0 f14056d;

    public HorizontalScrollLayoutModifier(TextFieldScrollerPosition scrollerPosition, int i, TransformedText transformedText, Function0 textLayoutResultProvider) {
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(transformedText, "transformedText");
        Intrinsics.checkNotNullParameter(textLayoutResultProvider, "textLayoutResultProvider");
        this.f14053a = scrollerPosition;
        this.f14054b = i;
        this.f14055c = transformedText;
        this.f14056d = textLayoutResultProvider;
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
    public final int m61019c() {
        return this.f14054b;
    }

    /* renamed from: d */
    public final TextFieldScrollerPosition m61018d() {
        return this.f14053a;
    }

    /* renamed from: e */
    public final Function0 m61017e() {
        return this.f14056d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HorizontalScrollLayoutModifier) {
            HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) obj;
            return Intrinsics.areEqual(this.f14053a, horizontalScrollLayoutModifier.f14053a) && this.f14054b == horizontalScrollLayoutModifier.f14054b && Intrinsics.areEqual(this.f14055c, horizontalScrollLayoutModifier.f14055c) && Intrinsics.areEqual(this.f14056d, horizontalScrollLayoutModifier.f14056d);
        }
        return false;
    }

    /* renamed from: f */
    public final TransformedText m61016f() {
        return this.f14055c;
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
        return (((((this.f14053a.hashCode() * 31) + this.f14054b) * 31) + this.f14055c.hashCode()) * 31) + this.f14056d.hashCode();
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
        long m73802copyZbe2FdA$default;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (measurable.maxIntrinsicWidth(Constraints.m73809getMaxHeightimpl(j)) < Constraints.m73810getMaxWidthimpl(j)) {
            m73802copyZbe2FdA$default = j;
        } else {
            m73802copyZbe2FdA$default = Constraints.m73802copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 13, null);
        }
        Placeable mo72995measureBRTryo0 = measurable.mo72995measureBRTryo0(m73802copyZbe2FdA$default);
        int min = Math.min(mo72995measureBRTryo0.getWidth(), Constraints.m73810getMaxWidthimpl(j));
        return MeasureScope.CC.m59482q(measure, min, mo72995measureBRTryo0.getHeight(), null, new HorizontalScrollLayoutModifier$measure$1(measure, this, mo72995measureBRTryo0, min), 4, null);
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
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f14053a + ", cursorOffset=" + this.f14054b + ", transformedText=" + this.f14055c + ", textLayoutResultProvider=" + this.f14056d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}