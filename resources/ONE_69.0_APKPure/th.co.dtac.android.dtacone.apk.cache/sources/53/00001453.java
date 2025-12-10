package p000;

import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.LongState;
import androidx.compose.runtime.MutableLongState;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: VK1 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class VK1 {
    /* renamed from: a */
    public static final long m66008a(LongState longState, Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(longState, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return longState.getLongValue();
    }

    /* renamed from: b */
    public static final MutableLongState m66007b(long j) {
        return ActualAndroid_androidKt.createSnapshotMutableLongState(j);
    }

    /* renamed from: c */
    public static final void m66006c(MutableLongState mutableLongState, Object obj, KProperty property, long j) {
        Intrinsics.checkNotNullParameter(mutableLongState, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        mutableLongState.setLongValue(j);
    }
}