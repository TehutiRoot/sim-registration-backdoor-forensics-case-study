package p000;

import androidx.compose.animation.core.TwoWayConverter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: LW1 */
/* loaded from: classes.dex */
public final class LW1 implements TwoWayConverter {

    /* renamed from: a */
    public final Function1 f3631a;

    /* renamed from: b */
    public final Function1 f3632b;

    public LW1(Function1 convertToVector, Function1 convertFromVector) {
        Intrinsics.checkNotNullParameter(convertToVector, "convertToVector");
        Intrinsics.checkNotNullParameter(convertFromVector, "convertFromVector");
        this.f3631a = convertToVector;
        this.f3632b = convertFromVector;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public Function1 getConvertFromVector() {
        return this.f3632b;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public Function1 getConvertToVector() {
        return this.f3631a;
    }
}