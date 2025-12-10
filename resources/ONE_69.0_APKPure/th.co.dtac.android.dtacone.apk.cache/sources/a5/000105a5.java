package p000;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RememberObserver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pJ */
/* loaded from: classes2.dex */
public final class C13076pJ implements RememberObserver {

    /* renamed from: a */
    public final Function1 f76774a;

    /* renamed from: b */
    public DisposableEffectResult f76775b;

    public C13076pJ(Function1 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f76774a = effect;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        DisposableEffectResult disposableEffectResult = this.f76775b;
        if (disposableEffectResult != null) {
            disposableEffectResult.dispose();
        }
        this.f76775b = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        DisposableEffectScope disposableEffectScope;
        Function1 function1 = this.f76774a;
        disposableEffectScope = EffectsKt.f28414a;
        this.f76775b = (DisposableEffectResult) function1.invoke(disposableEffectScope);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }
}