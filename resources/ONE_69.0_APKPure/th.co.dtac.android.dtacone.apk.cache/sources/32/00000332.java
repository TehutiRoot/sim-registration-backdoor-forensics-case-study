package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.OnRemeasuredModifier;
import androidx.compose.p003ui.platform.InspectorValueInfo;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: DK0 */
/* loaded from: classes2.dex */
public final class DK0 extends InspectorValueInfo implements OnRemeasuredModifier {

    /* renamed from: c */
    public final Function1 f987c;

    /* renamed from: d */
    public long f988d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DK0(Function1 onSizeChanged, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(onSizeChanged, "onSizeChanged");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f987c = onSizeChanged;
        this.f988d = IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC21205mt0.m26489a(this, function1);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC21205mt0.m26488b(this, function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DK0)) {
            return false;
        }
        return Intrinsics.areEqual(this.f987c, ((DK0) obj).f987c);
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
        return this.f987c.hashCode();
    }

    @Override // androidx.compose.p003ui.layout.OnRemeasuredModifier
    /* renamed from: onRemeasured-ozmzZPI  reason: not valid java name */
    public void mo69340onRemeasuredozmzZPI(long j) {
        if (!IntSize.m74000equalsimpl0(this.f988d, j)) {
            this.f987c.invoke(IntSize.m73994boximpl(j));
            this.f988d = j;
        }
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC21032lt0.m26768a(this, modifier);
    }
}