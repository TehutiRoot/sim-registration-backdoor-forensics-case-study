package th.p047co.dtac.android.dtacone.model.simTermSuk.cutSimStock;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.simTermSuk.checkSimStock.DiscountItem;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bQ\b\u0087\b\u0018\u00002\u00020\u0001Bù\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010'\u001a\u00020\u001a¢\u0006\u0002\u0010(J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010W\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\bHÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u00102J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010#HÆ\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u001aHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010i\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0082\u0003\u0010n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010'\u001a\u00020\u001aHÆ\u0001¢\u0006\u0002\u0010oJ\u0013\u0010p\u001a\u00020\u001a2\b\u0010q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010r\u001a\u00020\u0017HÖ\u0001J\t\u0010s\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010'\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00103\u001a\u0004\b\u0019\u00102R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0018\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R \u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010-R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010*R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010*R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010*R\u001a\u0010&\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00107\u001a\u0004\b@\u00106R\u001a\u0010$\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\bA\u0010:R\u0018\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010*R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010*R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010*R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010*R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010*R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010*R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010*R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010*R\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010*R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010*R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010*¨\u0006t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/simTermSuk/cutSimStock/SimTermSukCutSimStockRequest;", "", "rtrCode", "", "lastName", "simCardNumber", "channel", FirebaseAnalytics.Param.DISCOUNT, "", "Lth/co/dtac/android/dtacone/model/simTermSuk/checkSimStock/DiscountItem;", "source", "priceLevel", MessageBundle.TITLE_ENTRY, "idNumber", "productName", "userCode", "userTeam", "retailerName", "subChannel", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "payment", "Lth/co/dtac/android/dtacone/model/simTermSuk/cutSimStock/PaymentItemCutSim;", "orderID", "", "customerNumber", "isPrintReceipt", "", "retailerNumber", "userName", "lineAmount", "", "firstName", "productCode", "userLan", "receiptInfo", "Lth/co/dtac/android/dtacone/model/simTermSuk/cutSimStock/ReceiptInfo;", "productQty", "locationCode", "productPrice", "eSIMFlag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/simTermSuk/cutSimStock/ReceiptInfo;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Z)V", "getChannel", "()Ljava/lang/String;", "getCustomerNumber", "getDiscount", "()Ljava/util/List;", "getESIMFlag", "()Z", "getFirstName", "getIdNumber", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastName", "getLineAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLocationCode", "getOrderID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPayment", "getPriceLevel", "getProductCode", "getProductName", "getProductPrice", "getProductQty", "getReceiptInfo", "()Lth/co/dtac/android/dtacone/model/simTermSuk/cutSimStock/ReceiptInfo;", "getRetailerName", "getRetailerNumber", "getRtrCode", "getSimCardNumber", "getSource", "getSubChannel", "getSubscriberNumber", "getTitle", "getUserCode", "getUserLan", "getUserName", "getUserTeam", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/simTermSuk/cutSimStock/ReceiptInfo;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Z)Lth/co/dtac/android/dtacone/model/simTermSuk/cutSimStock/SimTermSukCutSimStockRequest;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.simTermSuk.cutSimStock.SimTermSukCutSimStockRequest */
/* loaded from: classes8.dex */
public final class SimTermSukCutSimStockRequest {
    public static final int $stable = 8;
    @SerializedName("channel")
    @Nullable
    private final String channel;
    @SerializedName("customerNumber")
    @Nullable
    private final String customerNumber;
    @SerializedName(FirebaseAnalytics.Param.DISCOUNT)
    @Nullable
    private final List<DiscountItem> discount;
    @SerializedName("eSIMFlag")
    private final boolean eSIMFlag;
    @SerializedName("firstName")
    @Nullable
    private final String firstName;
    @SerializedName("idNumber")
    @Nullable
    private final String idNumber;
    @SerializedName("isPrintReceipt")
    @Nullable
    private final Boolean isPrintReceipt;
    @SerializedName("lastName")
    @Nullable
    private final String lastName;
    @SerializedName("lineAmount")
    @Nullable
    private final Double lineAmount;
    @SerializedName("locationCode")
    @Nullable
    private final String locationCode;
    @SerializedName("orderID")
    @Nullable
    private final Integer orderID;
    @SerializedName("payment")
    @Nullable
    private final List<PaymentItemCutSim> payment;
    @SerializedName("priceLevel")
    @Nullable
    private final String priceLevel;
    @SerializedName("productCode")
    @Nullable
    private final String productCode;
    @SerializedName("productName")
    @Nullable
    private final String productName;
    @SerializedName("productPrice")
    @Nullable
    private final Double productPrice;
    @SerializedName("productQty")
    @Nullable
    private final Integer productQty;
    @SerializedName("receiptInfo")
    @Nullable
    private final ReceiptInfo receiptInfo;
    @SerializedName("retailerName")
    @Nullable
    private final String retailerName;
    @SerializedName("retailerNumber")
    @Nullable
    private final String retailerNumber;
    @SerializedName("rtrCode")
    @Nullable
    private final String rtrCode;
    @SerializedName("simCardNumber")
    @Nullable
    private final String simCardNumber;
    @SerializedName("source")
    @Nullable
    private final String source;
    @SerializedName("subChannel")
    @Nullable
    private final String subChannel;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @Nullable
    private final String title;
    @SerializedName("userCode")
    @Nullable
    private final String userCode;
    @SerializedName("userLan")
    @Nullable
    private final String userLan;
    @SerializedName("userName")
    @Nullable
    private final String userName;
    @SerializedName("userTeam")
    @Nullable
    private final String userTeam;

    public SimTermSukCutSimStockRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null);
    }

    @Nullable
    public final String component1() {
        return this.rtrCode;
    }

    @Nullable
    public final String component10() {
        return this.productName;
    }

    @Nullable
    public final String component11() {
        return this.userCode;
    }

    @Nullable
    public final String component12() {
        return this.userTeam;
    }

    @Nullable
    public final String component13() {
        return this.retailerName;
    }

    @Nullable
    public final String component14() {
        return this.subChannel;
    }

    @Nullable
    public final String component15() {
        return this.subscriberNumber;
    }

    @Nullable
    public final List<PaymentItemCutSim> component16() {
        return this.payment;
    }

    @Nullable
    public final Integer component17() {
        return this.orderID;
    }

    @Nullable
    public final String component18() {
        return this.customerNumber;
    }

    @Nullable
    public final Boolean component19() {
        return this.isPrintReceipt;
    }

    @Nullable
    public final String component2() {
        return this.lastName;
    }

    @Nullable
    public final String component20() {
        return this.retailerNumber;
    }

    @Nullable
    public final String component21() {
        return this.userName;
    }

    @Nullable
    public final Double component22() {
        return this.lineAmount;
    }

    @Nullable
    public final String component23() {
        return this.firstName;
    }

    @Nullable
    public final String component24() {
        return this.productCode;
    }

    @Nullable
    public final String component25() {
        return this.userLan;
    }

    @Nullable
    public final ReceiptInfo component26() {
        return this.receiptInfo;
    }

    @Nullable
    public final Integer component27() {
        return this.productQty;
    }

    @Nullable
    public final String component28() {
        return this.locationCode;
    }

    @Nullable
    public final Double component29() {
        return this.productPrice;
    }

    @Nullable
    public final String component3() {
        return this.simCardNumber;
    }

    public final boolean component30() {
        return this.eSIMFlag;
    }

    @Nullable
    public final String component4() {
        return this.channel;
    }

    @Nullable
    public final List<DiscountItem> component5() {
        return this.discount;
    }

    @Nullable
    public final String component6() {
        return this.source;
    }

    @Nullable
    public final String component7() {
        return this.priceLevel;
    }

    @Nullable
    public final String component8() {
        return this.title;
    }

    @Nullable
    public final String component9() {
        return this.idNumber;
    }

    @NotNull
    public final SimTermSukCutSimStockRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<DiscountItem> list, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable List<PaymentItemCutSim> list2, @Nullable Integer num, @Nullable String str15, @Nullable Boolean bool, @Nullable String str16, @Nullable String str17, @Nullable Double d, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable ReceiptInfo receiptInfo, @Nullable Integer num2, @Nullable String str21, @Nullable Double d2, boolean z) {
        return new SimTermSukCutSimStockRequest(str, str2, str3, str4, list, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, list2, num, str15, bool, str16, str17, d, str18, str19, str20, receiptInfo, num2, str21, d2, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimTermSukCutSimStockRequest) {
            SimTermSukCutSimStockRequest simTermSukCutSimStockRequest = (SimTermSukCutSimStockRequest) obj;
            return Intrinsics.areEqual(this.rtrCode, simTermSukCutSimStockRequest.rtrCode) && Intrinsics.areEqual(this.lastName, simTermSukCutSimStockRequest.lastName) && Intrinsics.areEqual(this.simCardNumber, simTermSukCutSimStockRequest.simCardNumber) && Intrinsics.areEqual(this.channel, simTermSukCutSimStockRequest.channel) && Intrinsics.areEqual(this.discount, simTermSukCutSimStockRequest.discount) && Intrinsics.areEqual(this.source, simTermSukCutSimStockRequest.source) && Intrinsics.areEqual(this.priceLevel, simTermSukCutSimStockRequest.priceLevel) && Intrinsics.areEqual(this.title, simTermSukCutSimStockRequest.title) && Intrinsics.areEqual(this.idNumber, simTermSukCutSimStockRequest.idNumber) && Intrinsics.areEqual(this.productName, simTermSukCutSimStockRequest.productName) && Intrinsics.areEqual(this.userCode, simTermSukCutSimStockRequest.userCode) && Intrinsics.areEqual(this.userTeam, simTermSukCutSimStockRequest.userTeam) && Intrinsics.areEqual(this.retailerName, simTermSukCutSimStockRequest.retailerName) && Intrinsics.areEqual(this.subChannel, simTermSukCutSimStockRequest.subChannel) && Intrinsics.areEqual(this.subscriberNumber, simTermSukCutSimStockRequest.subscriberNumber) && Intrinsics.areEqual(this.payment, simTermSukCutSimStockRequest.payment) && Intrinsics.areEqual(this.orderID, simTermSukCutSimStockRequest.orderID) && Intrinsics.areEqual(this.customerNumber, simTermSukCutSimStockRequest.customerNumber) && Intrinsics.areEqual(this.isPrintReceipt, simTermSukCutSimStockRequest.isPrintReceipt) && Intrinsics.areEqual(this.retailerNumber, simTermSukCutSimStockRequest.retailerNumber) && Intrinsics.areEqual(this.userName, simTermSukCutSimStockRequest.userName) && Intrinsics.areEqual((Object) this.lineAmount, (Object) simTermSukCutSimStockRequest.lineAmount) && Intrinsics.areEqual(this.firstName, simTermSukCutSimStockRequest.firstName) && Intrinsics.areEqual(this.productCode, simTermSukCutSimStockRequest.productCode) && Intrinsics.areEqual(this.userLan, simTermSukCutSimStockRequest.userLan) && Intrinsics.areEqual(this.receiptInfo, simTermSukCutSimStockRequest.receiptInfo) && Intrinsics.areEqual(this.productQty, simTermSukCutSimStockRequest.productQty) && Intrinsics.areEqual(this.locationCode, simTermSukCutSimStockRequest.locationCode) && Intrinsics.areEqual((Object) this.productPrice, (Object) simTermSukCutSimStockRequest.productPrice) && this.eSIMFlag == simTermSukCutSimStockRequest.eSIMFlag;
        }
        return false;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final List<DiscountItem> getDiscount() {
        return this.discount;
    }

    public final boolean getESIMFlag() {
        return this.eSIMFlag;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final Double getLineAmount() {
        return this.lineAmount;
    }

    @Nullable
    public final String getLocationCode() {
        return this.locationCode;
    }

    @Nullable
    public final Integer getOrderID() {
        return this.orderID;
    }

    @Nullable
    public final List<PaymentItemCutSim> getPayment() {
        return this.payment;
    }

    @Nullable
    public final String getPriceLevel() {
        return this.priceLevel;
    }

    @Nullable
    public final String getProductCode() {
        return this.productCode;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    public final Double getProductPrice() {
        return this.productPrice;
    }

    @Nullable
    public final Integer getProductQty() {
        return this.productQty;
    }

    @Nullable
    public final ReceiptInfo getReceiptInfo() {
        return this.receiptInfo;
    }

    @Nullable
    public final String getRetailerName() {
        return this.retailerName;
    }

    @Nullable
    public final String getRetailerNumber() {
        return this.retailerNumber;
    }

    @Nullable
    public final String getRtrCode() {
        return this.rtrCode;
    }

    @Nullable
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getSubChannel() {
        return this.subChannel;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUserCode() {
        return this.userCode;
    }

    @Nullable
    public final String getUserLan() {
        return this.userLan;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    public final String getUserTeam() {
        return this.userTeam;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.rtrCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.simCardNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.channel;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<DiscountItem> list = this.discount;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.source;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.priceLevel;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.title;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.idNumber;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.productName;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.userCode;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.userTeam;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.retailerName;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.subChannel;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.subscriberNumber;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        List<PaymentItemCutSim> list2 = this.payment;
        int hashCode16 = (hashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.orderID;
        int hashCode17 = (hashCode16 + (num == null ? 0 : num.hashCode())) * 31;
        String str15 = this.customerNumber;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool = this.isPrintReceipt;
        int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str16 = this.retailerNumber;
        int hashCode20 = (hashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.userName;
        int hashCode21 = (hashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Double d = this.lineAmount;
        int hashCode22 = (hashCode21 + (d == null ? 0 : d.hashCode())) * 31;
        String str18 = this.firstName;
        int hashCode23 = (hashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.productCode;
        int hashCode24 = (hashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.userLan;
        int hashCode25 = (hashCode24 + (str20 == null ? 0 : str20.hashCode())) * 31;
        ReceiptInfo receiptInfo = this.receiptInfo;
        int hashCode26 = (hashCode25 + (receiptInfo == null ? 0 : receiptInfo.hashCode())) * 31;
        Integer num2 = this.productQty;
        int hashCode27 = (hashCode26 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str21 = this.locationCode;
        int hashCode28 = (hashCode27 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Double d2 = this.productPrice;
        int hashCode29 = (hashCode28 + (d2 != null ? d2.hashCode() : 0)) * 31;
        boolean z = this.eSIMFlag;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode29 + i;
    }

    @Nullable
    public final Boolean isPrintReceipt() {
        return this.isPrintReceipt;
    }

    @NotNull
    public String toString() {
        String str = this.rtrCode;
        String str2 = this.lastName;
        String str3 = this.simCardNumber;
        String str4 = this.channel;
        List<DiscountItem> list = this.discount;
        String str5 = this.source;
        String str6 = this.priceLevel;
        String str7 = this.title;
        String str8 = this.idNumber;
        String str9 = this.productName;
        String str10 = this.userCode;
        String str11 = this.userTeam;
        String str12 = this.retailerName;
        String str13 = this.subChannel;
        String str14 = this.subscriberNumber;
        List<PaymentItemCutSim> list2 = this.payment;
        Integer num = this.orderID;
        String str15 = this.customerNumber;
        Boolean bool = this.isPrintReceipt;
        String str16 = this.retailerNumber;
        String str17 = this.userName;
        Double d = this.lineAmount;
        String str18 = this.firstName;
        String str19 = this.productCode;
        String str20 = this.userLan;
        ReceiptInfo receiptInfo = this.receiptInfo;
        Integer num2 = this.productQty;
        String str21 = this.locationCode;
        Double d2 = this.productPrice;
        boolean z = this.eSIMFlag;
        return "SimTermSukCutSimStockRequest(rtrCode=" + str + ", lastName=" + str2 + ", simCardNumber=" + str3 + ", channel=" + str4 + ", discount=" + list + ", source=" + str5 + ", priceLevel=" + str6 + ", title=" + str7 + ", idNumber=" + str8 + ", productName=" + str9 + ", userCode=" + str10 + ", userTeam=" + str11 + ", retailerName=" + str12 + ", subChannel=" + str13 + ", subscriberNumber=" + str14 + ", payment=" + list2 + ", orderID=" + num + ", customerNumber=" + str15 + ", isPrintReceipt=" + bool + ", retailerNumber=" + str16 + ", userName=" + str17 + ", lineAmount=" + d + ", firstName=" + str18 + ", productCode=" + str19 + ", userLan=" + str20 + ", receiptInfo=" + receiptInfo + ", productQty=" + num2 + ", locationCode=" + str21 + ", productPrice=" + d2 + ", eSIMFlag=" + z + ")";
    }

    public SimTermSukCutSimStockRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<DiscountItem> list, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable List<PaymentItemCutSim> list2, @Nullable Integer num, @Nullable String str15, @Nullable Boolean bool, @Nullable String str16, @Nullable String str17, @Nullable Double d, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable ReceiptInfo receiptInfo, @Nullable Integer num2, @Nullable String str21, @Nullable Double d2, boolean z) {
        this.rtrCode = str;
        this.lastName = str2;
        this.simCardNumber = str3;
        this.channel = str4;
        this.discount = list;
        this.source = str5;
        this.priceLevel = str6;
        this.title = str7;
        this.idNumber = str8;
        this.productName = str9;
        this.userCode = str10;
        this.userTeam = str11;
        this.retailerName = str12;
        this.subChannel = str13;
        this.subscriberNumber = str14;
        this.payment = list2;
        this.orderID = num;
        this.customerNumber = str15;
        this.isPrintReceipt = bool;
        this.retailerNumber = str16;
        this.userName = str17;
        this.lineAmount = d;
        this.firstName = str18;
        this.productCode = str19;
        this.userLan = str20;
        this.receiptInfo = receiptInfo;
        this.productQty = num2;
        this.locationCode = str21;
        this.productPrice = d2;
        this.eSIMFlag = z;
    }

    public /* synthetic */ SimTermSukCutSimStockRequest(String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list2, Integer num, String str15, Boolean bool, String str16, String str17, Double d, String str18, String str19, String str20, ReceiptInfo receiptInfo, Integer num2, String str21, Double d2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : list2, (i & 65536) != 0 ? null : num, (i & 131072) != 0 ? null : str15, (i & 262144) != 0 ? null : bool, (i & 524288) != 0 ? null : str16, (i & 1048576) != 0 ? null : str17, (i & 2097152) != 0 ? null : d, (i & 4194304) != 0 ? null : str18, (i & 8388608) != 0 ? null : str19, (i & 16777216) != 0 ? null : str20, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : receiptInfo, (i & 67108864) != 0 ? null : num2, (i & 134217728) != 0 ? null : str21, (i & 268435456) != 0 ? null : d2, (i & PKIFailureInfo.duplicateCertReq) != 0 ? false : z);
    }
}