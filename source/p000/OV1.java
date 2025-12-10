package p000;

import androidx.compose.animation.core.TwoWayConverter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: OV1 */
/* loaded from: classes.dex */
public final class OV1 implements TwoWayConverter {

    /* renamed from: a */
    public final Function1 f4426a;

    /* renamed from: b */
    public final Function1 f4427b;

    public OV1(Function1 convertToVector, Function1 convertFromVector) {
        Intrinsics.checkNotNullParameter(convertToVector, "convertToVector");
        Intrinsics.checkNotNullParameter(convertFromVector, "convertFromVector");
        this.f4426a = convertToVector;
        this.f4427b = convertFromVector;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public Function1 getConvertFromVector() {
        return this.f4427b;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public Function1 getConvertToVector() {
        return this.f4426a;
    }
}
