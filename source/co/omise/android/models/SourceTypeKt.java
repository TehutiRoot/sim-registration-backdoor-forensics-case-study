package co.omise.android.models;

import co.omise.android.models.SourceType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28850d2 = {"allElements", "", "Lco/omise/android/models/SourceType;", "Lco/omise/android/models/SourceType$Companion;", "getAllElements", "(Lco/omise/android/models/SourceType$Companion;)Ljava/util/List;", "sdk_productionRelease"}, m28849k = 2, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class SourceTypeKt {
    @NotNull
    public static final List<SourceType> getAllElements(@NotNull SourceType.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return CollectionsKt__CollectionsKt.listOf((Object[]) new SourceType[]{SourceType.InternetBanking.Bay.INSTANCE, SourceType.InternetBanking.Bbl.INSTANCE, SourceType.Alipay.INSTANCE, SourceType.BillPaymentTescoLotus.INSTANCE, SourceType.BarcodeAlipay.INSTANCE, SourceType.Econtext.INSTANCE, new SourceType.Fpx(null, 1, null), SourceType.TrueMoney.INSTANCE, SourceType.Installment.Bay.INSTANCE, SourceType.Installment.BayWlb.INSTANCE, SourceType.Installment.FirstChoice.INSTANCE, SourceType.Installment.FirstChoiceWlb.INSTANCE, SourceType.Installment.Bbl.INSTANCE, SourceType.Installment.BblWlb.INSTANCE, SourceType.Installment.Mbb.INSTANCE, SourceType.Installment.Ktc.INSTANCE, SourceType.Installment.KtcWlb.INSTANCE, SourceType.Installment.KBank.INSTANCE, SourceType.Installment.KBankWlb.INSTANCE, SourceType.Installment.Scb.INSTANCE, SourceType.Installment.ScbWlb.INSTANCE, SourceType.Installment.Ttb.INSTANCE, SourceType.Installment.TtbWlb.INSTANCE, SourceType.Installment.Uob.INSTANCE, SourceType.Atome.INSTANCE});
    }
}
