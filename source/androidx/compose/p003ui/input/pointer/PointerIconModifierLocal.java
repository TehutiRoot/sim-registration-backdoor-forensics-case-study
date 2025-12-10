package androidx.compose.p003ui.input.pointer;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.modifier.ModifierLocalConsumer;
import androidx.compose.p003ui.modifier.ModifierLocalProvider;
import androidx.compose.p003ui.modifier.ModifierLocalReadScope;
import androidx.compose.p003ui.modifier.ProvidableModifierLocal;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.input.pointer.PointerIconModifierLocal */
/* loaded from: classes2.dex */
public final class PointerIconModifierLocal implements PointerIcon, ModifierLocalProvider, ModifierLocalConsumer {

    /* renamed from: a */
    public PointerIcon f29943a;

    /* renamed from: b */
    public boolean f29944b;

    /* renamed from: c */
    public Function1 f29945c;

    /* renamed from: d */
    public final MutableState f29946d;

    /* renamed from: e */
    public boolean f29947e;

    /* renamed from: f */
    public boolean f29948f;

    /* renamed from: g */
    public final ProvidableModifierLocal f29949g;

    /* renamed from: h */
    public final PointerIconModifierLocal f29950h;

    public PointerIconModifierLocal(PointerIcon icon, boolean z, Function1 onSetIcon) {
        MutableState m31891g;
        ProvidableModifierLocal providableModifierLocal;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onSetIcon, "onSetIcon");
        this.f29943a = icon;
        this.f29944b = z;
        this.f29945c = onSetIcon;
        m31891g = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f29946d = m31891g;
        providableModifierLocal = PointerIconKt.f29942a;
        this.f29949g = providableModifierLocal;
        this.f29950h = this;
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
    public final void m59615c() {
        this.f29948f = true;
        if (!this.f29947e) {
            PointerIconModifierLocal m59612f = m59612f();
            if (m59612f != null) {
                m59612f.m59609i();
            }
            this.f29945c.invoke(this.f29943a);
        }
    }

    /* renamed from: d */
    public final void m59614d() {
        m59613e(m59612f());
    }

    /* renamed from: e */
    public final void m59613e(PointerIconModifierLocal pointerIconModifierLocal) {
        if (this.f29948f) {
            if (pointerIconModifierLocal == null) {
                this.f29945c.invoke(null);
            } else {
                pointerIconModifierLocal.m59608j();
            }
        }
        this.f29948f = false;
    }

    /* renamed from: f */
    public final PointerIconModifierLocal m59612f() {
        return (PointerIconModifierLocal) this.f29946d.getValue();
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC20114gt0.m30960c(this, obj, function2);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC20114gt0.m30959d(this, obj, function2);
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalProvider
    /* renamed from: g */
    public PointerIconModifierLocal getValue() {
        return this.f29950h;
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal getKey() {
        return this.f29949g;
    }

    /* renamed from: h */
    public final boolean m59610h() {
        if (this.f29944b) {
            return true;
        }
        PointerIconModifierLocal m59612f = m59612f();
        if (m59612f != null && m59612f.m59610h()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void m59609i() {
        this.f29947e = true;
        PointerIconModifierLocal m59612f = m59612f();
        if (m59612f != null) {
            m59612f.m59609i();
        }
    }

    /* renamed from: j */
    public final void m59608j() {
        this.f29947e = false;
        if (this.f29948f) {
            this.f29945c.invoke(this.f29943a);
        } else if (m59612f() == null) {
            this.f29945c.invoke(null);
        } else {
            PointerIconModifierLocal m59612f = m59612f();
            if (m59612f != null) {
                m59612f.m59608j();
            }
        }
    }

    /* renamed from: k */
    public final void m59607k(PointerIconModifierLocal pointerIconModifierLocal) {
        this.f29946d.setValue(pointerIconModifierLocal);
    }

    /* renamed from: l */
    public final boolean m59606l() {
        PointerIconModifierLocal m59612f = m59612f();
        if (m59612f != null && m59612f.m59610h()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final void m59605m(PointerIcon icon, boolean z, Function1 onSetIcon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onSetIcon, "onSetIcon");
        if (!Intrinsics.areEqual(this.f29943a, icon) && this.f29948f && !this.f29947e) {
            onSetIcon.invoke(icon);
        }
        this.f29943a = icon;
        this.f29944b = z;
        this.f29945c = onSetIcon;
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        ProvidableModifierLocal providableModifierLocal;
        Intrinsics.checkNotNullParameter(scope, "scope");
        PointerIconModifierLocal m59612f = m59612f();
        providableModifierLocal = PointerIconKt.f29942a;
        m59607k((PointerIconModifierLocal) scope.getCurrent(providableModifierLocal));
        if (m59612f != null && m59612f() == null) {
            m59613e(m59612f);
            this.f29945c = PointerIconModifierLocal$onModifierLocalsUpdated$1$1.INSTANCE;
        }
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC19942ft0.m31254a(this, modifier);
    }
}
