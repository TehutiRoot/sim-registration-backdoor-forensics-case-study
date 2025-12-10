package th.p047co.dtac.android.dtacone.view.compose.upPassDemo.screen.component;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.compose.upPassDemo.model.LabelValue;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nLabelValuesList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LabelValuesList.kt\nth/co/dtac/android/dtacone/view/compose/upPassDemo/screen/component/LabelValuesListKt$LabelValuesList$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,20:1\n136#2,12:21\n*S KotlinDebug\n*F\n+ 1 LabelValuesList.kt\nth/co/dtac/android/dtacone/view/compose/upPassDemo/screen/component/LabelValuesListKt$LabelValuesList$1\n*L\n18#1:21,12\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPassDemo.screen.component.LabelValuesListKt$LabelValuesList$1 */
/* loaded from: classes10.dex */
public final class LabelValuesListKt$LabelValuesList$1 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ List<LabelValue> $data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelValuesListKt$LabelValuesList$1(List<LabelValue> list) {
        super(1);
        this.$data = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List<LabelValue> list = this.$data;
        LazyColumn.items(list.size(), null, new C15898x6093c731(C15896x6093c72f.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C15899x6093c732(list)));
    }
}