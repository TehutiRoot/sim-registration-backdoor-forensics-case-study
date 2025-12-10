package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.OnRemeasuredModifier;
import androidx.compose.p003ui.platform.InspectorValueInfo;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xK0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C22947xK0 extends InspectorValueInfo implements OnRemeasuredModifier {

    /* renamed from: c */
    public final Function1 f108316c;

    /* renamed from: d */
    public long f108317d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22947xK0(Function1 onSizeChanged, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(onSizeChanged, "onSizeChanged");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f108316c = onSizeChanged;
        this.f108317d = IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC20114gt0.m30962a(this, function1);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC20114gt0.m30961b(this, function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22947xK0)) {
            return false;
        }
        return Intrinsics.areEqual(this.f108316c, ((C22947xK0) obj).f108316c);
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
        return this.f108316c.hashCode();
    }

    @Override // androidx.compose.p003ui.layout.OnRemeasuredModifier
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo69383onRemeasuredozmzZPI(long j) {
        if (!IntSize.m73816equalsimpl0(this.f108317d, j)) {
            this.f108316c.invoke(IntSize.m73810boximpl(j));
            this.f108317d = j;
        }
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC19942ft0.m31254a(this, modifier);
    }
}
