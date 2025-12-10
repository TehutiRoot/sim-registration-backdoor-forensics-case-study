package androidx.compose.foundation.layout;

import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.ConstraintsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.foundation.layout.IntrinsicSizeModifier$-CC  reason: invalid class name */
/* loaded from: classes.dex */
public abstract /* synthetic */ class IntrinsicSizeModifier$CC {
    /* renamed from: a */
    public static boolean m61380a(InterfaceC2903a interfaceC2903a) {
        return true;
    }

    /* renamed from: b */
    public static int m61379b(InterfaceC2903a interfaceC2903a, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicHeight(i);
    }

    /* renamed from: c */
    public static int m61378c(InterfaceC2903a interfaceC2903a, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicWidth(i);
    }

    /* renamed from: d */
    public static MeasureResult m61377d(InterfaceC2903a interfaceC2903a, MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long mo638a = interfaceC2903a.mo638a(measure, measurable, j);
        if (interfaceC2903a.mo637b()) {
            mo638a = ConstraintsKt.m73638constrainN9IONVI(j, mo638a);
        }
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(mo638a);
        return MeasureScope.CC.m59532q(measure, mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight(), null, new IntrinsicSizeModifier$measure$1(mo72811measureBRTryo0), 4, null);
    }

    /* renamed from: e */
    public static int m61376e(InterfaceC2903a interfaceC2903a, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.minIntrinsicHeight(i);
    }

    /* renamed from: f */
    public static int m61375f(InterfaceC2903a interfaceC2903a, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.minIntrinsicWidth(i);
    }
}
