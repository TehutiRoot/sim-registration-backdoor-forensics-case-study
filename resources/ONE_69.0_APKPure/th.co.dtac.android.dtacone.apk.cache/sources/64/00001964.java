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

/* renamed from: af0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC19082af0 extends InspectorValueInfo implements ModifierLocalConsumer, ModifierLocalProvider {

    /* renamed from: c */
    public final MutableState f8463c;

    public /* synthetic */ AbstractC19082af0(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    /* renamed from: e */
    private final WindowInsets m65093e() {
        return (WindowInsets) this.f8463c.getValue();
    }

    /* renamed from: f */
    private final void m65092f(WindowInsets windowInsets) {
        this.f8463c.setValue(windowInsets);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC21205mt0.m26489a(this, function1);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC21205mt0.m26488b(this, function1);
    }

    /* renamed from: d */
    public abstract WindowInsets mo871d(WindowInsets windowInsets);

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC21205mt0.m26487c(this, obj, function2);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC21205mt0.m26486d(this, obj, function2);
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal getKey() {
        return WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets();
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        m65092f(mo871d((WindowInsets) scope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC21032lt0.m26768a(this, modifier);
    }

    public AbstractC19082af0(Function1 function1) {
        super(function1);
        MutableState m65148g;
        m65148g = AbstractC19036aL1.m65148g(WindowInsetsKt.WindowInsets(0, 0, 0, 0), null, 2, null);
        this.f8463c = m65148g;
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalProvider
    public WindowInsets getValue() {
        return m65093e();
    }
}