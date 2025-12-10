package p000;

import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.DoubleState;
import androidx.compose.runtime.MutableDoubleState;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: TK1 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class TK1 {
    /* renamed from: a */
    public static final double m66356a(DoubleState doubleState, Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(doubleState, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return doubleState.getDoubleValue();
    }

    /* renamed from: b */
    public static final MutableDoubleState m66355b(double d) {
        return ActualAndroid_androidKt.createSnapshotMutableDoubleState(d);
    }

    /* renamed from: c */
    public static final void m66354c(MutableDoubleState mutableDoubleState, Object obj, KProperty property, double d) {
        Intrinsics.checkNotNullParameter(mutableDoubleState, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        mutableDoubleState.setDoubleValue(d);
    }
}