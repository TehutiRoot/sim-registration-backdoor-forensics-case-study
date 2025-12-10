package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.device_sale.Campaign;
import th.p047co.dtac.android.dtacone.model.device_sale.Check1IDXDeviceRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.Check1IDXDeviceResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.CustomerProfile;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSaleCampaignResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSaleVerifySubrResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.Discount;
import th.p047co.dtac.android.dtacone.model.device_sale.GetDiscountResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.GetInputFieldResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.GetNewIMEIResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.InputField;
import th.p047co.dtac.android.dtacone.model.device_sale.MrtrDiscountItem;
import th.p047co.dtac.android.dtacone.model.device_sale.Subscriber;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;
import th.p047co.dtac.android.dtacone.util.p052enum.DeviceSaleCampaignType;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleCampaignViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.DeviceType;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\f0\u001d¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d¢\u0006\u0004\b!\u0010 J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001d¢\u0006\u0004\b#\u0010 J\u0019\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u001d¢\u0006\u0004\b&\u0010 J\u0015\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u000fH\u0014¢\u0006\u0004\b,\u0010-J\u001b\u0010.\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b.\u0010\u0011J\u001f\u0010/\u001a\u00020\u000f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b/\u0010\u0011J\u0015\u00100\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b0\u0010\u0015J\u0015\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u000f¢\u0006\u0004\b5\u0010-J\r\u00106\u001a\u00020\u000f¢\u0006\u0004\b6\u0010-J\r\u00107\u001a\u00020\u000f¢\u0006\u0004\b7\u0010-J\u0015\u00108\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b8\u0010\u0015J\u0015\u0010;\u001a\u00020\u000f2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0017\u0010J\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR'\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\f0K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR#\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\f0\u001d8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010 R'\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010M\u001a\u0004\bV\u0010OR#\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u001d8\u0006¢\u0006\f\n\u0004\bX\u0010R\u001a\u0004\bY\u0010 R!\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001a0K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010M\u001a\u0004\b\\\u0010OR\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0006¢\u0006\f\n\u0004\b^\u0010R\u001a\u0004\b_\u0010 R'\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0$0K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bb\u0010OR#\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0$0\u001d8\u0006¢\u0006\f\n\u0004\bd\u0010R\u001a\u0004\be\u0010 R'\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160$0K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010M\u001a\u0004\bh\u0010OR#\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160$0\u001d8\u0006¢\u0006\f\n\u0004\b\u0014\u0010R\u001a\u0004\bj\u0010 R'\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0$0K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010M\u001a\u0004\bn\u0010OR#\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0$0\u001d8\u0006¢\u0006\f\n\u0004\bp\u0010R\u001a\u0004\bq\u0010 R-\u0010t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\f0$0K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010M\u001a\u0004\bs\u0010OR)\u0010v\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\f0$0\u001d8\u0006¢\u0006\f\n\u0004\b\\\u0010R\u001a\u0004\bu\u0010 R'\u0010x\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160$0K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010M\u001a\u0004\bw\u0010OR#\u0010z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160$0\u001d8\u0006¢\u0006\f\n\u0004\bn\u0010R\u001a\u0004\by\u0010 R'\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160$0K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010M\u001a\u0004\b{\u0010OR#\u0010~\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160$0\u001d8\u0006¢\u0006\f\n\u0004\bb\u0010R\u001a\u0004\b}\u0010 R\"\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\"0K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u007f\u0010M\u001a\u0004\b\u007f\u0010OR\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001d8\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010R\u001a\u0005\b\u0082\u0001\u0010 R*\u0010\u0084\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0083\u00010$0K8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\bs\u0010M\u001a\u0005\b\u0081\u0001\u0010OR&\u0010\u0086\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0083\u00010$0\u001d8\u0006¢\u0006\r\n\u0004\bw\u0010R\u001a\u0005\b\u0085\u0001\u0010 R-\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00122\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0005\b\u008a\u0001\u0010\u0015R\u0016\u0010\u008e\u0001\u001a\u0004\u0018\u0001018F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u008f\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/device_sale/DeviceSaleCampaignViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/repository/device_sale/DeviceSaleRepository;", "repository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/repository/device_sale/DeviceSaleRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;)V", "", "Lth/co/dtac/android/dtacone/model/device_sale/InputField;", FirebaseAnalytics.Param.ITEMS, "", OperatorName.MOVE_TO, "(Ljava/util/List;)V", "Lth/co/dtac/android/dtacone/model/device_sale/Discount;", FirebaseAnalytics.Param.DISCOUNT, "p", "(Lth/co/dtac/android/dtacone/model/device_sale/Discount;)V", "", "userLan", "()Ljava/lang/String;", HintConstants.AUTOFILL_HINT_USERNAME, "", "isRequirePaymentInfo", "()Z", "Landroidx/lifecycle/LiveData;", "Lth/co/dtac/android/dtacone/model/device_sale/MrtrDiscountItem;", "getDiscountItem", "()Landroidx/lifecycle/LiveData;", "getIsContract", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/DeviceType;", "showDeviceType", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleCampaignResponse;", "callGetCampaign", "Lth/co/dtac/android/dtacone/model/device_sale/Campaign;", "campaign", "storeCampaign", "(Lth/co/dtac/android/dtacone/model/device_sale/Campaign;)V", "getInputFieldCampaign", "onCleared", "()V", "validateInputFieldAndgetDiscount", "callGetDiscount", "addDiscount", "", "pos", "deleteDiscount", "(I)V", "callAPICheck1IDXDevice", "dismissSecondaryLoading", "check1IDXDeviceSuccess", "validateContract", "", "amount", "storeExtraAdvanceAmount", "(F)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/device_sale/DeviceSaleRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "d", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "e", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.FILL_NON_ZERO, "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", OperatorName.NON_STROKING_GRAY, "Lkotlin/Lazy;", OperatorName.CLOSE_AND_STROKE, "()Landroidx/lifecycle/MutableLiveData;", "_discountItemList", OperatorName.CLOSE_PATH, "Landroidx/lifecycle/LiveData;", "getDiscountItemList", "discountItemList", "i", "u", "_getCampaign", OperatorName.SET_LINE_JOINSTYLE, "getGetCampaign", "getCampaign", OperatorName.NON_STROKING_CMYK, "t", "_displayIsContract", OperatorName.LINE_TO, "getDisplayIsContract", "displayIsContract", "Lth/co/dtac/android/dtacone/model/device_sale/GetInputFieldResponse;", "x", "_getInputField", OperatorName.ENDPATH, "getGetInputField", "getInputField", "o", "C", "_validateInputField", "getValidateInputField", "validateInputField", "Lth/co/dtac/android/dtacone/model/device_sale/GetDiscountResponse;", OperatorName.SAVE, OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "_getDiscountList", PDPageLabelRange.STYLE_ROMAN_LOWER, "getGetDiscountList", "getDiscountList", "A", "_updateDiscountItem", "getUpdateDiscountItem", "updateDiscountItem", "B", "_validateDiscount", "getValidateDiscount", "validateDiscount", OperatorName.SET_LINE_WIDTH, "_getExtraAdvance", "getGetExtraAdvance", "getExtraAdvance", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "_showDeviceType", "z", "getShowDeviceType", "Lth/co/dtac/android/dtacone/model/device_sale/Check1IDXDeviceResponse;", "_showWarningDialog", "getShowWarningDialog", "showWarningDialog", "value", "getSelectedDiscount", "()Lth/co/dtac/android/dtacone/model/device_sale/Discount;", "setSelectedDiscount", "selectedDiscount", "getAdvancePayment", "()Ljava/lang/Integer;", "advancePayment", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceSaleCampaignViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSaleCampaignViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/device_sale/DeviceSaleCampaignViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,329:1\n1855#2,2:330\n766#2:332\n857#2,2:333\n1#3:335\n*S KotlinDebug\n*F\n+ 1 DeviceSaleCampaignViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/device_sale/DeviceSaleCampaignViewModel\n*L\n150#1:330,2\n173#1:332\n173#1:333,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleCampaignViewModel */
/* loaded from: classes9.dex */
public final class DeviceSaleCampaignViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: A */
    public final Lazy f105443A;

    /* renamed from: B */
    public final LiveData f105444B;

    /* renamed from: b */
    public final DeviceSaleRepository f105445b;

    /* renamed from: c */
    public final Rx2ThreadService f105446c;

    /* renamed from: d */
    public final ConfigurationRepository f105447d;

    /* renamed from: e */
    public final MrtrErrorService f105448e;

    /* renamed from: f */
    public final CompositeDisposable f105449f;

    /* renamed from: g */
    public final Lazy f105450g;

    /* renamed from: h */
    public final LiveData f105451h;

    /* renamed from: i */
    public final Lazy f105452i;

    /* renamed from: j */
    public final LiveData f105453j;

    /* renamed from: k */
    public final Lazy f105454k;

    /* renamed from: l */
    public final LiveData f105455l;

    /* renamed from: m */
    public final Lazy f105456m;

    /* renamed from: n */
    public final LiveData f105457n;

    /* renamed from: o */
    public final Lazy f105458o;

    /* renamed from: p */
    public final LiveData f105459p;

    /* renamed from: q */
    public final Lazy f105460q;

    /* renamed from: r */
    public final LiveData f105461r;

    /* renamed from: s */
    public final Lazy f105462s;

    /* renamed from: t */
    public final LiveData f105463t;

    /* renamed from: u */
    public final Lazy f105464u;

    /* renamed from: v */
    public final LiveData f105465v;

    /* renamed from: w */
    public final Lazy f105466w;

    /* renamed from: x */
    public final LiveData f105467x;

    /* renamed from: y */
    public final Lazy f105468y;

    /* renamed from: z */
    public final LiveData f105469z;

    @Inject
    public DeviceSaleCampaignViewModel(@NotNull DeviceSaleRepository repository, @NotNull Rx2ThreadService threadService, @NotNull ConfigurationRepository configurationRepository, @NotNull MrtrErrorService errorService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f105445b = repository;
        this.f105446c = threadService;
        this.f105447d = configurationRepository;
        this.f105448e = errorService;
        this.f105449f = new CompositeDisposable();
        this.f105450g = LazyKt__LazyJVMKt.lazy(DeviceSaleCampaignViewModel$_discountItemList$2.INSTANCE);
        this.f105451h = m3033s();
        this.f105452i = LazyKt__LazyJVMKt.lazy(DeviceSaleCampaignViewModel$_getCampaign$2.INSTANCE);
        this.f105453j = m3031u();
        this.f105454k = LazyKt__LazyJVMKt.lazy(DeviceSaleCampaignViewModel$_displayIsContract$2.INSTANCE);
        this.f105455l = m3032t();
        this.f105456m = LazyKt__LazyJVMKt.lazy(DeviceSaleCampaignViewModel$_getInputField$2.INSTANCE);
        this.f105457n = m3028x();
        this.f105458o = LazyKt__LazyJVMKt.lazy(DeviceSaleCampaignViewModel$_validateInputField$2.INSTANCE);
        this.f105459p = m3052C();
        this.f105460q = LazyKt__LazyJVMKt.lazy(DeviceSaleCampaignViewModel$_getDiscountList$2.INSTANCE);
        this.f105461r = m3030v();
        this.f105462s = LazyKt__LazyJVMKt.lazy(DeviceSaleCampaignViewModel$_updateDiscountItem$2.INSTANCE);
        this.f105463t = m3054A();
        this.f105464u = LazyKt__LazyJVMKt.lazy(DeviceSaleCampaignViewModel$_validateDiscount$2.INSTANCE);
        this.f105465v = m3053B();
        this.f105466w = LazyKt__LazyJVMKt.lazy(DeviceSaleCampaignViewModel$_getExtraAdvance$2.INSTANCE);
        this.f105467x = m3029w();
        this.f105468y = LazyKt__LazyJVMKt.lazy(DeviceSaleCampaignViewModel$_showDeviceType$2.INSTANCE);
        this.f105469z = m3027y();
        this.f105443A = LazyKt__LazyJVMKt.lazy(DeviceSaleCampaignViewModel$_showWarningDialog$2.INSTANCE);
        this.f105444B = m3026z();
    }

    /* renamed from: A */
    private final MutableLiveData m3054A() {
        return (MutableLiveData) this.f105462s.getValue();
    }

    /* renamed from: B */
    public final MutableLiveData m3053B() {
        return (MutableLiveData) this.f105464u.getValue();
    }

    /* renamed from: C */
    private final MutableLiveData m3052C() {
        return (MutableLiveData) this.f105458o.getValue();
    }

    /* renamed from: D */
    public static final void m3051D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void callGetDiscount$default(DeviceSaleCampaignViewModel deviceSaleCampaignViewModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        deviceSaleCampaignViewModel.callGetDiscount(list);
    }

    /* renamed from: j */
    public static final void m3042j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m3041k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m3040l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    private final void m3039m(List list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Boolean idPinValidation = ((InputField) obj).getIdPinValidation();
            if (idPinValidation != null) {
                z = idPinValidation.booleanValue();
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        Observable fromIterable = Observable.fromIterable(CollectionsKt___CollectionsKt.take(arrayList, 1));
        final DeviceSaleCampaignViewModel$callVerifyIDPin$1 deviceSaleCampaignViewModel$callVerifyIDPin$1 = new DeviceSaleCampaignViewModel$callVerifyIDPin$1(this);
        Observable compose = fromIterable.flatMap(new Function() { // from class: RG
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                ObservableSource m3037o;
                m3037o = DeviceSaleCampaignViewModel.m3037o(deviceSaleCampaignViewModel$callVerifyIDPin$1, obj2);
                return m3037o;
            }
        }).compose(this.f105446c.applyAsync());
        final DeviceSaleCampaignViewModel$callVerifyIDPin$2 deviceSaleCampaignViewModel$callVerifyIDPin$2 = new DeviceSaleCampaignViewModel$callVerifyIDPin$2(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: SG
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                DeviceSaleCampaignViewModel.m3038n(deviceSaleCampaignViewModel$callVerifyIDPin$2, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "private fun callVerifyID…}\n                )\n    }");
        SubscribersKt.subscribeBy(doOnSubscribe, new DeviceSaleCampaignViewModel$callVerifyIDPin$3(this), new DeviceSaleCampaignViewModel$callVerifyIDPin$4(this, list), DeviceSaleCampaignViewModel$callVerifyIDPin$5.INSTANCE);
    }

    /* renamed from: n */
    public static final void m3038n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final ObservableSource m3037o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public final void m3036p(Discount discount) {
        Single<R> compose = this.f105445b.getExtraAdvanceDetail().compose(this.f105446c.applySingleAsync());
        final DeviceSaleCampaignViewModel$getExtraAdvanceDetail$1 deviceSaleCampaignViewModel$getExtraAdvanceDetail$1 = DeviceSaleCampaignViewModel$getExtraAdvanceDetail$1.INSTANCE;
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: MG
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DeviceSaleCampaignViewModel.m3035q(deviceSaleCampaignViewModel$getExtraAdvanceDetail$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "repository.getExtraAdvan…       .doOnSubscribe { }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new DeviceSaleCampaignViewModel$getExtraAdvanceDetail$2(this), new DeviceSaleCampaignViewModel$getExtraAdvanceDetail$3(this, discount)), this.f105449f);
    }

    /* renamed from: q */
    public static final void m3035q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final void m3034r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    private final MutableLiveData m3033s() {
        return (MutableLiveData) this.f105450g.getValue();
    }

    /* renamed from: t */
    private final MutableLiveData m3032t() {
        return (MutableLiveData) this.f105454k.getValue();
    }

    /* renamed from: u */
    public final MutableLiveData m3031u() {
        return (MutableLiveData) this.f105452i.getValue();
    }

    /* renamed from: v */
    public final MutableLiveData m3030v() {
        return (MutableLiveData) this.f105460q.getValue();
    }

    /* renamed from: w */
    public final MutableLiveData m3029w() {
        return (MutableLiveData) this.f105466w.getValue();
    }

    /* renamed from: x */
    public final MutableLiveData m3028x() {
        return (MutableLiveData) this.f105456m.getValue();
    }

    /* renamed from: y */
    private final MutableLiveData m3027y() {
        return (MutableLiveData) this.f105468y.getValue();
    }

    /* renamed from: z */
    public final MutableLiveData m3026z() {
        return (MutableLiveData) this.f105443A.getValue();
    }

    public final void addDiscount(@NotNull Discount discount) {
        Intrinsics.checkNotNullParameter(discount, "discount");
        m3054A().setValue(Resource.Companion.success(this.f105445b.addDiscount(discount)));
    }

    public final void callAPICheck1IDXDevice() {
        String str;
        Discount selectedDiscount = getSelectedDiscount();
        if (selectedDiscount != null) {
            str = selectedDiscount.getIfrs();
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str, "1")) {
            Single<R> compose = this.f105445b.check1IDXDevice(new Check1IDXDeviceRequest(this.f105445b.getUserTypeFormat(), this.f105445b.getUserCode(), this.f105445b.getSubscriberNumber(), null, 8, null)).compose(this.f105446c.applySingleAsync());
            final DeviceSaleCampaignViewModel$callAPICheck1IDXDevice$1 deviceSaleCampaignViewModel$callAPICheck1IDXDevice$1 = new DeviceSaleCampaignViewModel$callAPICheck1IDXDevice$1(this);
            Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: OG
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DeviceSaleCampaignViewModel.m3042j(deviceSaleCampaignViewModel$callAPICheck1IDXDevice$1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun callAPICheck1IDXDevi…1IDXDeviceSuccess()\n    }");
            DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new DeviceSaleCampaignViewModel$callAPICheck1IDXDevice$2(this), new DeviceSaleCampaignViewModel$callAPICheck1IDXDevice$3(this)), this.f105449f);
            return;
        }
        check1IDXDeviceSuccess();
    }

    @NotNull
    public final LiveData<Resource<DeviceSaleCampaignResponse>> callGetCampaign() {
        Single<R> compose = this.f105445b.getDeviceSaleCampaign().compose(this.f105446c.applySingleAsync());
        final DeviceSaleCampaignViewModel$callGetCampaign$1 deviceSaleCampaignViewModel$callGetCampaign$1 = new DeviceSaleCampaignViewModel$callGetCampaign$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: QG
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DeviceSaleCampaignViewModel.m3041k(deviceSaleCampaignViewModel$callGetCampaign$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun callGetCampaign(): L… return getCampaign\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new DeviceSaleCampaignViewModel$callGetCampaign$2(this), new DeviceSaleCampaignViewModel$callGetCampaign$3(this)), this.f105449f);
        return this.f105453j;
    }

    public final void callGetDiscount(@Nullable List<InputField> list) {
        Single<R> compose = this.f105445b.getDiscountListAPI(list).compose(this.f105446c.applySingleAsync());
        final DeviceSaleCampaignViewModel$callGetDiscount$1 deviceSaleCampaignViewModel$callGetDiscount$1 = new DeviceSaleCampaignViewModel$callGetDiscount$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: NG
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DeviceSaleCampaignViewModel.m3040l(deviceSaleCampaignViewModel$callGetDiscount$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun callGetDiscount(item… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new DeviceSaleCampaignViewModel$callGetDiscount$2(this), new DeviceSaleCampaignViewModel$callGetDiscount$3(this)), this.f105449f);
    }

    public final void check1IDXDeviceSuccess() {
        String blacklistSharingStatus = this.f105445b.getBlacklistSharingStatus();
        if (blacklistSharingStatus != null && (Intrinsics.areEqual(blacklistSharingStatus, "01") || Intrinsics.areEqual(blacklistSharingStatus, "10"))) {
            Discount selectedDiscount = getSelectedDiscount();
            if (selectedDiscount != null) {
                m3036p(selectedDiscount);
                return;
            }
            return;
        }
        Discount selectedDiscount2 = getSelectedDiscount();
        if (selectedDiscount2 != null) {
            addDiscount(selectedDiscount2);
        }
        m3053B().postValue(Resource.Companion.success(""));
    }

    public final void deleteDiscount(int i) {
        List<MrtrDiscountItem> removeDiscountFromItemInfo = this.f105445b.removeDiscountFromItemInfo(i);
        if (removeDiscountFromItemInfo != null) {
            m3054A().setValue(Resource.Companion.success(removeDiscountFromItemInfo));
        }
    }

    public final void dismissSecondaryLoading() {
        m3053B().postValue(Resource.Companion.error$default(Resource.Companion, "", "", null, 4, null));
    }

    @Nullable
    public final Integer getAdvancePayment() {
        CustomerProfile customerProfile;
        Subscriber subscriber;
        DeviceSaleVerifySubrResponse verifySubrResponse = this.f105445b.getVerifySubrResponse();
        if (verifySubrResponse != null && (customerProfile = verifySubrResponse.getCustomerProfile()) != null && (subscriber = customerProfile.getSubscriber()) != null) {
            return Integer.valueOf(subscriber.getAdvancePayment());
        }
        return null;
    }

    @NotNull
    public final LiveData<List<MrtrDiscountItem>> getDiscountItem() {
        m3033s().setValue(this.f105445b.getDiscountItem());
        return this.f105451h;
    }

    @NotNull
    public final LiveData<List<MrtrDiscountItem>> getDiscountItemList() {
        return this.f105451h;
    }

    @NotNull
    public final LiveData<Boolean> getDisplayIsContract() {
        return this.f105455l;
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f105449f;
    }

    @NotNull
    public final LiveData<Resource<DeviceSaleCampaignResponse>> getGetCampaign() {
        return this.f105453j;
    }

    @NotNull
    public final LiveData<Resource<GetDiscountResponse>> getGetDiscountList() {
        return this.f105461r;
    }

    @NotNull
    public final LiveData<Resource<String>> getGetExtraAdvance() {
        return this.f105467x;
    }

    @NotNull
    public final LiveData<Resource<GetInputFieldResponse>> getGetInputField() {
        return this.f105457n;
    }

    public final void getInputFieldCampaign(@NotNull Campaign campaign) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Single<R> compose = this.f105445b.getInputFieldCampaign(campaign).compose(this.f105446c.applySingleAsync());
        final DeviceSaleCampaignViewModel$getInputFieldCampaign$1 deviceSaleCampaignViewModel$getInputFieldCampaign$1 = new DeviceSaleCampaignViewModel$getInputFieldCampaign$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: LG
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DeviceSaleCampaignViewModel.m3034r(deviceSaleCampaignViewModel$getInputFieldCampaign$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getInputFieldCampaig….addTo(disposable)\n\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new DeviceSaleCampaignViewModel$getInputFieldCampaign$2(this), new DeviceSaleCampaignViewModel$getInputFieldCampaign$3(this)), this.f105449f);
    }

    @NotNull
    public final LiveData<Boolean> getIsContract() {
        boolean z;
        DeviceSaleCampaignType flowIdCampaignType = this.f105445b.getFlowIdCampaignType();
        MutableLiveData m3032t = m3032t();
        if (flowIdCampaignType == DeviceSaleCampaignType.WITH_CONTRACT) {
            z = true;
        } else {
            z = false;
        }
        m3032t.setValue(Boolean.valueOf(z));
        return this.f105455l;
    }

    @Nullable
    public final Discount getSelectedDiscount() {
        return this.f105445b.getSelectedDiscount();
    }

    @NotNull
    public final LiveData<DeviceType> getShowDeviceType() {
        return this.f105469z;
    }

    @NotNull
    public final LiveData<Resource<Check1IDXDeviceResponse>> getShowWarningDialog() {
        return this.f105444B;
    }

    @NotNull
    public final LiveData<Resource<List<MrtrDiscountItem>>> getUpdateDiscountItem() {
        return this.f105463t;
    }

    @NotNull
    public final LiveData<Resource<String>> getValidateDiscount() {
        return this.f105465v;
    }

    @NotNull
    public final LiveData<Resource<String>> getValidateInputField() {
        return this.f105459p;
    }

    public final boolean isRequirePaymentInfo() {
        return this.f105445b.isRequirePaymentInfo();
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f105449f.dispose();
        super.onCleared();
    }

    public final void setSelectedDiscount(@Nullable Discount discount) {
        this.f105445b.setSelectedDiscount(discount);
    }

    @NotNull
    public final LiveData<DeviceType> showDeviceType() {
        String str;
        DeviceType deviceType;
        CustomerProfile customerProfile;
        Subscriber subscriber;
        MutableLiveData m3027y = m3027y();
        if (this.f105445b.getNewIMEIResponse() != null) {
            GetNewIMEIResponse newIMEIResponse = this.f105445b.getNewIMEIResponse();
            Intrinsics.checkNotNull(newIMEIResponse);
            if (newIMEIResponse.isDtacDevice()) {
                deviceType = DeviceType.DTACDEVICE;
            } else {
                deviceType = DeviceType.OPENMARKET;
            }
        } else {
            DeviceSaleVerifySubrResponse verifySubrResponse = this.f105445b.getVerifySubrResponse();
            if (verifySubrResponse != null && (customerProfile = verifySubrResponse.getCustomerProfile()) != null && (subscriber = customerProfile.getSubscriber()) != null) {
                str = subscriber.getImeiNumber();
            } else {
                str = null;
            }
            if (!Intrinsics.areEqual(str, "")) {
                deviceType = DeviceType.DTACDEVICE;
            } else {
                deviceType = DeviceType.NONE;
            }
        }
        m3027y.setValue(deviceType);
        return this.f105469z;
    }

    public final void storeCampaign(@NotNull Campaign campaign) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        this.f105445b.setCampaign(campaign);
    }

    public final void storeExtraAdvanceAmount(float f) {
        this.f105445b.setExtraAdvanceAmount(Float.valueOf(f));
    }

    @NotNull
    public final String userLan() {
        return this.f105445b.getUserLan();
    }

    @NotNull
    public final String username() {
        return this.f105445b.getUserName();
    }

    public final void validateContract(@NotNull Discount discount) {
        Intrinsics.checkNotNullParameter(discount, "discount");
        Single<R> compose = this.f105445b.validateContract(this.f105445b.getValidateContractRequest(discount)).compose(this.f105446c.applySingleAsync());
        final DeviceSaleCampaignViewModel$validateContract$1 deviceSaleCampaignViewModel$validateContract$1 = new DeviceSaleCampaignViewModel$validateContract$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: PG
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DeviceSaleCampaignViewModel.m3051D(deviceSaleCampaignViewModel$validateContract$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun validateContract(dis… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new DeviceSaleCampaignViewModel$validateContract$2(this), new DeviceSaleCampaignViewModel$validateContract$3(this, discount)), this.f105449f);
    }

    public final void validateInputFieldAndgetDiscount(@NotNull List<InputField> items) {
        boolean z;
        Intrinsics.checkNotNullParameter(items, "items");
        boolean z2 = false;
        for (InputField inputField : items) {
            Boolean required = inputField.getRequired();
            if (required != null) {
                boolean booleanValue = required.booleanValue();
                String value = inputField.getValue();
                if (value != null && value.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (booleanValue & z) {
                    m3052C().setValue(Resource.Companion.error$default(Resource.Companion, String.valueOf(inputField.getLabel()), null, null, 4, null));
                    return;
                }
            }
            Boolean idPinValidation = inputField.getIdPinValidation();
            if (idPinValidation != null && idPinValidation.booleanValue()) {
                z2 = true;
            }
        }
        if (z2) {
            m3039m(items);
        } else {
            callGetDiscount(items);
        }
    }
}