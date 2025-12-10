package p000;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.modifier.ModifierLocalConsumer;
import androidx.compose.p003ui.modifier.ModifierLocalProvider;
import androidx.compose.p003ui.modifier.ModifierLocalReadScope;
import androidx.compose.p003ui.modifier.ProvidableModifierLocal;
import androidx.compose.p003ui.platform.InspectorValueInfo;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ue0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18553Ue0 extends InspectorValueInfo implements ModifierLocalConsumer, ModifierLocalProvider {

    /* renamed from: c */
    public final MutableState f6388c;

    public /* synthetic */ AbstractC18553Ue0(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    /* renamed from: e */
    private final WindowInsets m65998e() {
        return (WindowInsets) this.f6388c.getValue();
    }

    /* renamed from: f */
    private final void m65997f(WindowInsets windowInsets) {
        this.f6388c.setValue(windowInsets);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC20114gt0.m30962a(this, function1);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC20114gt0.m30961b(this, function1);
    }

    /* renamed from: d */
    public abstract WindowInsets mo208d(WindowInsets windowInsets);

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC20114gt0.m30960c(this, obj, function2);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC20114gt0.m30959d(this, obj, function2);
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal getKey() {
        return WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets();
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        m65997f(mo208d((WindowInsets) scope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC19942ft0.m31254a(this, modifier);
    }

    public AbstractC18553Ue0(Function1 function1) {
        super(function1);
        MutableState m31891g;
        m31891g = AbstractC19508dK1.m31891g(WindowInsetsKt.WindowInsets(0, 0, 0, 0), null, 2, null);
        this.f6388c = m31891g;
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalProvider
    public WindowInsets getValue() {
        return m65998e();
    }
}
