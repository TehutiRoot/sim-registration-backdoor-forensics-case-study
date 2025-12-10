package p000;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RememberObserver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: oJ */
/* loaded from: classes2.dex */
public final class C12433oJ implements RememberObserver {

    /* renamed from: a */
    public final Function1 f72666a;

    /* renamed from: b */
    public DisposableEffectResult f72667b;

    public C12433oJ(Function1 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f72666a = effect;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        DisposableEffectResult disposableEffectResult = this.f72667b;
        if (disposableEffectResult != null) {
            disposableEffectResult.dispose();
        }
        this.f72667b = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        DisposableEffectScope disposableEffectScope;
        Function1 function1 = this.f72666a;
        disposableEffectScope = EffectsKt.f28326a;
        this.f72667b = (DisposableEffectResult) function1.invoke(disposableEffectScope);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }
}
