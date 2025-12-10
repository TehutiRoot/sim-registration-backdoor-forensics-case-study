package androidx.compose.p003ui.window;

import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,833:1\n151#2,3:834\n33#2,4:837\n154#2,2:841\n38#2:843\n156#2:844\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1\n*L\n351#1:834,3\n351#1:837,4\n351#1:841,2\n351#1:843\n351#1:844\n*E\n"})
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1 */
/* loaded from: classes2.dex */
public final class AndroidPopup_androidKt$SimpleStack$1 implements MeasurePolicy {
    public static final AndroidPopup_androidKt$SimpleStack$1 INSTANCE = new AndroidPopup_androidKt$SimpleStack$1();

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC22344tr0.m1366a(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC22344tr0.m1365b(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo69194measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size();
        if (size != 0) {
            int i3 = 0;
            if (size != 1) {
                ArrayList arrayList = new ArrayList(measurables.size());
                int size2 = measurables.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.add(measurables.get(i4).mo72811measureBRTryo0(j));
                }
                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                if (lastIndex >= 0) {
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        Placeable placeable = (Placeable) arrayList.get(i3);
                        i5 = Math.max(i5, placeable.getWidth());
                        i6 = Math.max(i6, placeable.getHeight());
                        if (i3 == lastIndex) {
                            break;
                        }
                        i3++;
                    }
                    i = i5;
                    i2 = i6;
                } else {
                    i = 0;
                    i2 = 0;
                }
                return MeasureScope.CC.m59532q(Layout, i, i2, null, new AndroidPopup_androidKt$SimpleStack$1$measure$3(arrayList), 4, null);
            }
            Placeable mo72811measureBRTryo0 = measurables.get(0).mo72811measureBRTryo0(j);
            return MeasureScope.CC.m59532q(Layout, mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight(), null, new AndroidPopup_androidKt$SimpleStack$1$measure$2(mo72811measureBRTryo0), 4, null);
        }
        return MeasureScope.CC.m59532q(Layout, 0, 0, null, AndroidPopup_androidKt$SimpleStack$1$measure$1.INSTANCE, 4, null);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC22344tr0.m1364c(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC22344tr0.m1363d(this, intrinsicMeasureScope, list, i);
    }
}
