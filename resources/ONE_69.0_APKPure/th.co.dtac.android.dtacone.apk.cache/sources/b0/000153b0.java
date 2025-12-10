package th.p047co.dtac.android.dtacone.view.fragment.upPass.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.compose.SelectOptionsScreenKt$SelectOcrSection$3 */
/* loaded from: classes9.dex */
public final class SelectOptionsScreenKt$SelectOcrSection$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ List<String> $allowDocumentType;
    final /* synthetic */ int $ocrIndex;
    final /* synthetic */ Function1<List<String>, Unit> $onAllowDocumentTypeChange;
    final /* synthetic */ Function1<Integer, Unit> $onSelectOcr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectOptionsScreenKt$SelectOcrSection$3(int i, List<String> list, Function1<? super Integer, Unit> function1, Function1<? super List<String>, Unit> function12, int i2, int i3) {
        super(2);
        this.$ocrIndex = i;
        this.$allowDocumentType = list;
        this.$onSelectOcr = function1;
        this.$onAllowDocumentTypeChange = function12;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        SelectOptionsScreenKt.m3409g(this.$ocrIndex, this.$allowDocumentType, this.$onSelectOcr, this.$onAllowDocumentTypeChange, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}