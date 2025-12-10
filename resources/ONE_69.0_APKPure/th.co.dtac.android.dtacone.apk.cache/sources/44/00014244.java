package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.existingTmhTvs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneRegisterTrueOnlineCvgDataItem;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.existingTmhTvs.OneRegisterTrueOnlineSelectNumberScreenKt$NumberCard$4 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineSelectNumberScreenKt$NumberCard$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ List<OneRegisterTrueOnlineCvgDataItem> $dataList;
    final /* synthetic */ String $emptyMessage;
    final /* synthetic */ Function1<String, String> $formatter;
    final /* synthetic */ Function1<String, Unit> $onSelected;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneRegisterTrueOnlineSelectNumberScreenKt$NumberCard$4(String str, List<OneRegisterTrueOnlineCvgDataItem> list, String str2, Function1<? super String, String> function1, Function1<? super String, Unit> function12, int i, int i2) {
        super(2);
        this.$title = str;
        this.$dataList = list;
        this.$emptyMessage = str2;
        this.$formatter = function1;
        this.$onSelected = function12;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneRegisterTrueOnlineSelectNumberScreenKt.m9566c(this.$title, this.$dataList, this.$emptyMessage, this.$formatter, this.$onSelected, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}