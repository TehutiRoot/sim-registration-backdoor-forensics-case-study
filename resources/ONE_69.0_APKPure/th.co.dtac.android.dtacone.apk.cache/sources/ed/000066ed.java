package androidx.compose.p003ui.window;

import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1 */
/* loaded from: classes2.dex */
public final class AndroidDialog_androidKt$DialogLayout$1 implements MeasurePolicy {

    /* renamed from: a */
    public static final AndroidDialog_androidKt$DialogLayout$1 f31904a = new AndroidDialog_androidKt$DialogLayout$1();

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC23448zr0.m68a(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC23448zr0.m67b(this, intrinsicMeasureScope, list, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17 */
    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo69380measure3p2s80s(MeasureScope Layout, List measurables, long j) {
        Object obj;
        int m73812getMinWidthimpl;
        int m73811getMinHeightimpl;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Measurable) measurables.get(i)).mo72995measureBRTryo0(j));
        }
        Placeable placeable = null;
        int i2 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((Placeable) obj).getWidth();
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i3 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i3);
                    int width2 = ((Placeable) obj2).getWidth();
                    if (width < width2) {
                        obj = obj2;
                        width = width2;
                    }
                    if (i3 == lastIndex) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj;
        if (placeable2 != null) {
            m73812getMinWidthimpl = placeable2.getWidth();
        } else {
            m73812getMinWidthimpl = Constraints.m73812getMinWidthimpl(j);
        }
        int i4 = m73812getMinWidthimpl;
        if (!arrayList.isEmpty()) {
            Object obj3 = arrayList.get(0);
            int height = ((Placeable) obj3).getHeight();
            int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            Object obj4 = obj3;
            if (1 <= lastIndex2) {
                while (true) {
                    Object obj5 = arrayList.get(i2);
                    int height2 = ((Placeable) obj5).getHeight();
                    obj3 = obj4;
                    if (height < height2) {
                        obj3 = obj5;
                        height = height2;
                    }
                    if (i2 == lastIndex2) {
                        break;
                    }
                    i2++;
                    obj4 = obj3;
                }
            }
            placeable = obj3;
        }
        Placeable placeable3 = placeable;
        if (placeable3 != null) {
            m73811getMinHeightimpl = placeable3.getHeight();
        } else {
            m73811getMinHeightimpl = Constraints.m73811getMinHeightimpl(j);
        }
        return MeasureScope.CC.m59482q(Layout, i4, m73811getMinHeightimpl, null, new AndroidDialog_androidKt$DialogLayout$1$measure$1(arrayList), 4, null);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC23448zr0.m66c(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC23448zr0.m65d(this, intrinsicMeasureScope, list, i);
    }
}