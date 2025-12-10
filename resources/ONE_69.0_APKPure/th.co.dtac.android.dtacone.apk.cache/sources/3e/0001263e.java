package th.p047co.dtac.android.dtacone.repository.print_receipt;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Single;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.model.GetReceiptBase64Request;
import th.p047co.dtac.android.dtacone.model.GetReceiptBase64Response;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;

@StabilityInferred(parameters = 0)
@Singleton
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m29142d2 = {"Lth/co/dtac/android/dtacone/repository/print_receipt/PrintReceiptRepository;", "", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "rtrRx2Repository", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;)V", "", "orderID", "orderNumber", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/GetReceiptBase64Response;", "printReceipt", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.repository.print_receipt.PrintReceiptRepository */
/* loaded from: classes8.dex */
public final class PrintReceiptRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f86961a;

    /* renamed from: b */
    public final RtrRx2Repository f86962b;

    @Inject
    public PrintReceiptRepository(@NotNull RTRApiRx2 api, @NotNull RtrRx2Repository rtrRx2Repository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        this.f86961a = api;
        this.f86962b = rtrRx2Repository;
    }

    @NotNull
    public final Single<GetReceiptBase64Response> printReceipt(@NotNull String orderID, @NotNull String orderNumber) {
        Intrinsics.checkNotNullParameter(orderID, "orderID");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        TokenCollection userSession = this.f86962b.getUserSession();
        RTRApiRx2 rTRApiRx2 = this.f86961a;
        String userLan = userSession.getUserLan();
        Intrinsics.checkNotNullExpressionValue(userLan, "profile.userLan");
        String locationCode = userSession.getLocationCode();
        Intrinsics.checkNotNullExpressionValue(locationCode, "profile.locationCode");
        return rTRApiRx2.getReceiptBase64(new GetReceiptBase64Request(userLan, locationCode, orderID, orderNumber, false, 16, null));
    }
}