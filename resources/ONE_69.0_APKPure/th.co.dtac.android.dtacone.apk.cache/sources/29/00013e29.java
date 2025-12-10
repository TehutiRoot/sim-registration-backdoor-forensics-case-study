package th.p047co.dtac.android.dtacone.view.appOne.report.viewmodel;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.Resource;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.report.viewmodel.OneCommissionReportViewModel$getStatementPDF$2 */
/* loaded from: classes10.dex */
public final class OneCommissionReportViewModel$getStatementPDF$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ OneCommissionReportViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCommissionReportViewModel$getStatementPDF$2(OneCommissionReportViewModel oneCommissionReportViewModel, Context context) {
        super(1);
        this.this$0 = oneCommissionReportViewModel;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable it) {
        MutableLiveData m10233o;
        Intrinsics.checkNotNullParameter(it, "it");
        m10233o = this.this$0.m10233o();
        Resource.Companion companion = Resource.Companion;
        Context context = this.$context;
        m10233o.setValue(Resource.Companion.error$default(companion, (context == null || (r1 = context.getString(R.string.one_performance_load_report_error_message)) == null) ? "" : "", null, null, 4, null));
    }
}