package p000;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.modifier.ModifierLocalConsumer;
import androidx.compose.p003ui.modifier.ModifierLocalReadScope;
import androidx.compose.p003ui.platform.InspectorValueInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: it0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C20458it0 extends InspectorValueInfo implements ModifierLocalConsumer {

    /* renamed from: c */
    public final Function1 f67088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20458it0(Function1 consumer, Function1 debugInspectorInfo) {
        super(debugInspectorInfo);
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(debugInspectorInfo, "debugInspectorInfo");
        this.f67088c = consumer;
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
        if ((obj instanceof C20458it0) && Intrinsics.areEqual(((C20458it0) obj).f67088c, this.f67088c)) {
            return true;
        }
        return false;
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
        return this.f67088c.hashCode();
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f67088c.invoke(scope);
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC19942ft0.m31254a(this, modifier);
    }
}
