package p000;

import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.IntState;
import androidx.compose.runtime.MutableIntState;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: UK1 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class UK1 {
    /* renamed from: a */
    public static final int m66211a(IntState intState, Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(intState, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return intState.getIntValue();
    }

    /* renamed from: b */
    public static final MutableIntState m66210b(int i) {
        return ActualAndroid_androidKt.createSnapshotMutableIntState(i);
    }

    /* renamed from: c */
    public static final void m66209c(MutableIntState mutableIntState, Object obj, KProperty property, int i) {
        Intrinsics.checkNotNullParameter(mutableIntState, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        mutableIntState.setIntValue(i);
    }
}