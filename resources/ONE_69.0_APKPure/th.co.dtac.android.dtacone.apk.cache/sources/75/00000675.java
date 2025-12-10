package p000;

import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.MutableFloatState;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: Go1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC17716Go1 {
    /* renamed from: a */
    public static final float m68207a(FloatState floatState, Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(floatState, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return floatState.getFloatValue();
    }

    /* renamed from: b */
    public static final MutableFloatState m68206b(float f) {
        return ActualAndroid_androidKt.createSnapshotMutableFloatState(f);
    }

    /* renamed from: c */
    public static final void m68205c(MutableFloatState mutableFloatState, Object obj, KProperty property, float f) {
        Intrinsics.checkNotNullParameter(mutableFloatState, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        mutableFloatState.setFloatValue(f);
    }
}