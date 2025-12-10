package th.p047co.dtac.android.dtacone.presenter.reports;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.rtr_performance.WithholdTaxDocCollection;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/rtr_performance/WithholdTaxDocCollection;", "invoke", "(Lth/co/dtac/android/dtacone/model/rtr_performance/WithholdTaxDocCollection;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.reports.RtrWithholdTaxPhotoPresenter$getDoc$1 */
/* loaded from: classes8.dex */
public final class RtrWithholdTaxPhotoPresenter$getDoc$1 extends Lambda implements Function1<WithholdTaxDocCollection, Boolean> {
    public static final RtrWithholdTaxPhotoPresenter$getDoc$1 INSTANCE = new RtrWithholdTaxPhotoPresenter$getDoc$1();

    public RtrWithholdTaxPhotoPresenter$getDoc$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull WithholdTaxDocCollection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String doc = it.getDoc();
        if (doc != null && doc.length() != 0) {
            return Boolean.TRUE;
        }
        throw new ValidatedRuleException(R.string.can_not_load_data);
    }
}