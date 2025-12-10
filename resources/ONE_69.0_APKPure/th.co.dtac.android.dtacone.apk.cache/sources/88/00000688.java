package p000;

import androidx.compose.p003ui.MotionDurationScale;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* renamed from: Gt0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17725Gt0 implements MotionDurationScale {

    /* renamed from: a */
    public final MutableFloatState f2226a = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);

    /* renamed from: a */
    public void m68194a(float f) {
        this.f2226a.setFloatValue(f);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return MotionDurationScale.DefaultImpls.fold(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return MotionDurationScale.DefaultImpls.get(this, key);
    }

    @Override // androidx.compose.p003ui.MotionDurationScale, kotlin.coroutines.CoroutineContext.Element
    public /* synthetic */ CoroutineContext.Key getKey() {
        return AbstractC17660Ft0.m68375a(this);
    }

    @Override // androidx.compose.p003ui.MotionDurationScale
    public float getScaleFactor() {
        return this.f2226a.getFloatValue();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return MotionDurationScale.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return MotionDurationScale.DefaultImpls.plus(this, coroutineContext);
    }
}