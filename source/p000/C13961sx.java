package p000;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.modifier.ModifierLocalConsumer;
import androidx.compose.p003ui.modifier.ModifierLocalReadScope;
import androidx.compose.p003ui.platform.InspectorValueInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sx */
/* loaded from: classes.dex */
public final class C13961sx extends InspectorValueInfo implements ModifierLocalConsumer {

    /* renamed from: c */
    public final Function1 f79948c;

    /* renamed from: d */
    public WindowInsets f79949d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13961sx(Function1 block, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f79948c = block;
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
        if (!(obj instanceof C13961sx)) {
            return false;
        }
        return Intrinsics.areEqual(((C13961sx) obj).f79948c, this.f79948c);
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
        return this.f79948c.hashCode();
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        WindowInsets windowInsets = (WindowInsets) scope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
        if (!Intrinsics.areEqual(windowInsets, this.f79949d)) {
            this.f79949d = windowInsets;
            this.f79948c.invoke(windowInsets);
        }
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC19942ft0.m31254a(this, modifier);
    }
}
