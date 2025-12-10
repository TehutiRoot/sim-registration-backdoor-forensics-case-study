package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.device_sale.BundleItem;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSaleItemInfo;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSalePayment;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSalePaymentHeader;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;
import th.p047co.dtac.android.dtacone.util.format.MoneyFormat;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0014*\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/device_sale/DeviceSalePaymentViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/repository/device_sale/DeviceSaleRepository;", "repository", "<init>", "(Lth/co/dtac/android/dtacone/repository/device_sale/DeviceSaleRepository;)V", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/device_sale/DeviceSalePaymentHeader;", "getDeviceSalePaymentHeader", "()Landroidx/lifecycle/MutableLiveData;", "", "updatePaymentHeader", "()V", "Lth/co/dtac/android/dtacone/model/device_sale/DeviceSalePayment;", "data", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lth/co/dtac/android/dtacone/model/device_sale/DeviceSalePayment;)Lth/co/dtac/android/dtacone/model/device_sale/DeviceSalePaymentHeader;", "", "e", "()F", "", "d", "(F)Ljava/lang/String;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/repository/device_sale/DeviceSaleRepository;", "Landroidx/lifecycle/MutableLiveData;", "deviceSalePaymentHeader", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSalePaymentViewModel */
/* loaded from: classes9.dex */
public final class DeviceSalePaymentViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final DeviceSaleRepository f105482b;

    /* renamed from: c */
    public final MutableLiveData f105483c;

    @Inject
    public DeviceSalePaymentViewModel(@NotNull DeviceSaleRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f105482b = repository;
        this.f105483c = new MutableLiveData();
    }

    /* renamed from: b */
    public final DeviceSalePaymentHeader m3025b(DeviceSalePayment deviceSalePayment) {
        float balanceAmount;
        float totalAmount = deviceSalePayment.getTotalAmount() + m3022e();
        String totalAmountText = MoneyFormat.convertToMoneyFormat(totalAmount);
        deviceSalePayment.setDiscountAmount(0.0f);
        if (deviceSalePayment.getDiscountAmount() >= totalAmount) {
            deviceSalePayment.setBalanceAmount(0.0f);
            deviceSalePayment.setDiscountAmount(totalAmount);
            Intrinsics.checkNotNullExpressionValue(totalAmountText, "totalAmountText");
            return new DeviceSalePaymentHeader(totalAmountText, totalAmountText, "0.00", "0.00");
        }
        deviceSalePayment.setBalanceAmount(totalAmount - deviceSalePayment.getDiscountAmount());
        String m3024c = m3024c(deviceSalePayment.getDiscountAmount());
        String m3024c2 = m3024c(deviceSalePayment.getBalanceAmount());
        if (deviceSalePayment.getPayType() != null) {
            balanceAmount = (deviceSalePayment.getBalanceAmount() - deviceSalePayment.getPaymentCreditAmount()) - deviceSalePayment.getPaymentCashAmount();
        } else {
            balanceAmount = deviceSalePayment.getBalanceAmount();
        }
        String m3023d = m3023d(balanceAmount);
        Intrinsics.checkNotNullExpressionValue(totalAmountText, "totalAmountText");
        return new DeviceSalePaymentHeader(totalAmountText, m3024c, m3023d, m3024c2);
    }

    /* renamed from: c */
    public final String m3024c(float f) {
        return StringExtKt.formatMoneyWithDecimal(String.valueOf(f));
    }

    /* renamed from: d */
    public final String m3023d(float f) {
        return AbstractC19741eO1.replace$default(AbstractC19741eO1.replace$default(m3024c(f), "(", Marker.ANY_NON_NULL_MARKER, false, 4, (Object) null), ")", "", false, 4, (Object) null);
    }

    /* renamed from: e */
    public final float m3022e() {
        List<BundleItem> bundleItem;
        Sequence asSequence;
        Sequence filter;
        Sequence map;
        DeviceSaleItemInfo itemInfo = this.f105482b.getModel().getItemInfo();
        if (itemInfo != null && (bundleItem = itemInfo.getBundleItem()) != null && (asSequence = CollectionsKt___CollectionsKt.asSequence(bundleItem)) != null && (filter = SequencesKt___SequencesKt.filter(asSequence, DeviceSalePaymentViewModel$sumBundleItem$1.INSTANCE)) != null && (map = SequencesKt___SequencesKt.map(filter, DeviceSalePaymentViewModel$sumBundleItem$2.INSTANCE)) != null) {
            return SequencesKt___SequencesKt.sumOfFloat(map);
        }
        return 0.0f;
    }

    @NotNull
    public final MutableLiveData<DeviceSalePaymentHeader> getDeviceSalePaymentHeader() {
        return this.f105483c;
    }

    public final void updatePaymentHeader() {
        DeviceSalePayment payment = this.f105482b.getPayment();
        if (payment != null) {
            this.f105483c.postValue(m3025b(payment));
        }
    }
}