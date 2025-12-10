package th.p047co.dtac.android.dtacone.viewmodel.home;

import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.model.stv.BalanceResponse;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.campaign.count.CampaignCountResponse;
import th.p047co.dtac.android.dtacone.model.campaign_redemption.CampaignRedeemNotRequest;
import th.p047co.dtac.android.dtacone.model.esim.GetAuthorizationByRtrESimResponse;
import th.p047co.dtac.android.dtacone.model.home.groupService.response.GroupItemItem;
import th.p047co.dtac.android.dtacone.model.home.groupService.response.GroupServiceItem;
import th.p047co.dtac.android.dtacone.model.home.homeDetail.HomeDetailResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_pre2post.GetPre2PostAuthorizationByRtrResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.GetAuthorizationByRtrResponse;
import th.p047co.dtac.android.dtacone.model.profile.GroupItem;
import th.p047co.dtac.android.dtacone.model.profile.GroupPermission;
import th.p047co.dtac.android.dtacone.model.staff.StaffDetailCollection;
import th.p047co.dtac.android.dtacone.model.topup.BalanceCollection;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.home.HomeRepository;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.home.HomeViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b$\u0010#J\r\u0010%\u001a\u00020\u001b¢\u0006\u0004\b%\u0010\u001fJ\u0015\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020 ¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001b¢\u0006\u0004\b)\u0010\u001fJ\u0015\u0010+\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020 ¢\u0006\u0004\b+\u0010#J\r\u0010,\u001a\u00020\u001b¢\u0006\u0004\b,\u0010\u001fJ\r\u0010-\u001a\u00020\u001b¢\u0006\u0004\b-\u0010\u001fJ\r\u0010.\u001a\u00020\u001b¢\u0006\u0004\b.\u0010\u001fJ\r\u0010/\u001a\u00020\u001b¢\u0006\u0004\b/\u0010\u001fJ\u0015\u00100\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b0\u0010\u001dJ\u0015\u00101\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b1\u0010#J\u0019\u00103\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 02¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001bH\u0014¢\u0006\u0004\b5\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR'\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160I0H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR#\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160I0O8\u0006¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\bQ\u0010RR'\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0I0H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010MR#\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0I0O8\u0006¢\u0006\f\n\u0004\bX\u0010P\u001a\u0004\bY\u0010RR'\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0I0H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010K\u001a\u0004\b]\u0010MR#\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0I0O8\u0006¢\u0006\f\n\u0004\b_\u0010P\u001a\u0004\b\u001e\u0010RR'\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0I0H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010K\u001a\u0004\bc\u0010MR#\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0I0O8\u0006¢\u0006\f\n\u0004\be\u0010P\u001a\u0004\b\"\u0010RR'\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0I0H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010K\u001a\u0004\bh\u0010MR#\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0I0O8\u0006¢\u0006\f\n\u0004\bj\u0010P\u001a\u0004\b$\u0010RR'\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0I0H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010K\u001a\u0004\bm\u0010MR#\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0I0O8\u0006¢\u0006\f\n\u0004\bo\u0010P\u001a\u0004\b%\u0010RR'\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0I0H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010K\u001a\u0004\bs\u0010MR#\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0I0O8\u0006¢\u0006\f\n\u0004\bs\u0010P\u001a\u0004\b)\u0010RR'\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160I0H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010K\u001a\u0004\bj\u0010MR#\u0010x\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160I0O8\u0006¢\u0006\f\n\u0004\bc\u0010P\u001a\u0004\bw\u0010RR'\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160I0H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010K\u001a\u0004\bg\u0010MR#\u0010{\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160I0O8\u0006¢\u0006\f\n\u0004\bm\u0010P\u001a\u0004\bz\u0010RR!\u0010}\u001a\b\u0012\u0004\u0012\u00020 0H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010K\u001a\u0004\bo\u0010MR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0O8\u0006¢\u0006\f\n\u0004\bL\u0010P\u001a\u0004\b~\u0010RR(\u0010\u0080\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u007f0I0H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010K\u001a\u0004\bl\u0010MR&\u0010\u0083\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u007f0I0O8\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010P\u001a\u0005\b\u0082\u0001\u0010RR*\u0010\u0086\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00010I0H8BX\u0082\u0084\u0002¢\u0006\r\n\u0005\b\u0085\u0001\u0010K\u001a\u0004\b|\u0010MR'\u0010\u0089\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00010I0O8\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010P\u001a\u0005\b\u0088\u0001\u0010RR/\u0010\u008b\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120I0H8BX\u0082\u0084\u0002¢\u0006\r\n\u0005\b\u008a\u0001\u0010K\u001a\u0004\br\u0010MR,\u0010\u008e\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120I0O8\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010P\u001a\u0005\b\u008d\u0001\u0010R¨\u0006\u008f\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/home/HomeViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/repository/home/HomeRepository;", "homeRepository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "rtrRx2Repository", "Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;", "preference", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "errorService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "oneErrorService", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "<init>", "(Lth/co/dtac/android/dtacone/repository/home/HomeRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;)V", "", "Lth/co/dtac/android/dtacone/model/home/groupService/response/GroupServiceItem;", OperatorName.NON_STROKING_CMYK, "()Ljava/util/List;", "", "isUserLan", "()Z", "", "staffId", "", "getStaffDetail", "(J)V", "getMrtrPre2PostAuthorization", "()V", "", "featureCode", "getMrtrPrepaidAuthorization", "(Ljava/lang/String;)V", "getMrtrPrepaidMultiSimAuthorization", "getMrtrPrepaidReregistAuthorization", "screenCode", "hasAuthorizationScreen", "(Ljava/lang/String;)Z", "getMrtrESimAuthorization", "rtrCode", "callRedeemNoti", "callApiGetCampaignCount", "getCurrentBalance", "getOneBalance", "oneGetCurrentBalanceAndGroupMenu", "oneGetCurrentBalanceAndStaffDetailAndGroupMenu", "getMrtrPrepaidAuthorizationw", "", "mapParamNBTC", "()Ljava/util/Map;", "onCleared", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/home/HomeRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "d", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "e", "Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", OperatorName.CLOSE_PATH, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "Lio/reactivex/disposables/CompositeDisposable;", "i", "Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", OperatorName.SET_LINE_JOINSTYLE, "Lkotlin/Lazy;", "C", "()Landroidx/lifecycle/MutableLiveData;", "_showSwipeRefreshLoading", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LiveData;", "getShowSwipeRefreshLoading", "()Landroidx/lifecycle/LiveData;", "showSwipeRefreshLoading", "Lth/co/dtac/android/dtacone/model/staff/StaffDetailCollection;", OperatorName.LINE_TO, "D", "_staffDetailResponse", OperatorName.MOVE_TO, "getStaffDetailResponse", "staffDetailResponse", "Lth/co/dtac/android/dtacone/model/mrtr_pre2post/GetPre2PostAuthorizationByRtrResponse;", OperatorName.ENDPATH, "x", "_mrtrPre2PostAuthorization", "o", "mrtrPre2PostAuthorization", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrResponse;", "p", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "_mrtrPrepaidAuthorization", OperatorName.SAVE, "mrtrPrepaidAuthorization", PDPageLabelRange.STYLE_ROMAN_LOWER, "z", "_mrtrPrepaidMultiSimAuthorization", OperatorName.CLOSE_AND_STROKE, "mrtrPrepaidMultiSimAuthorization", "t", "A", "_mrtrPrepaidReregistAuthorization", "u", "mrtrPrepaidReregistAuthorization", "Lth/co/dtac/android/dtacone/model/esim/GetAuthorizationByRtrESimResponse;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, OperatorName.SET_LINE_WIDTH, "_mrtrESimAuthorization", "mrtrESimAuthorization", "_campaignRedemptionNoti", "getCampaignRedemptionNoti", "campaignRedemptionNoti", "_campaignCount", "getCampaignCount", "campaignCount", "B", "_featureCode", "getFeatureCode", "Lth/co/dtac/android/dtacone/model/topup/BalanceCollection;", "_currentBalanceResponse", ExifInterface.LONGITUDE_EAST, "getCurrentBalanceResponse", "currentBalanceResponse", "Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;", "F", "_oneCurrentBalanceResponse", OperatorName.STROKING_COLOR_GRAY, "getOneCurrentBalanceResponse", "oneCurrentBalanceResponse", "H", "_groupMenuCollection", "I", "getGroupMenuCollection", "groupMenuCollection", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/home/HomeViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,385:1\n1549#2:386\n1620#2,2:387\n1549#2:389\n1620#2,3:390\n1622#2:393\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/home/HomeViewModel\n*L\n330#1:386\n330#1:387,2\n333#1:389\n333#1:390,3\n330#1:393\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.home.HomeViewModel */
/* loaded from: classes9.dex */
public final class HomeViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: A */
    public final LiveData f105985A;

    /* renamed from: B */
    public final Lazy f105986B;

    /* renamed from: C */
    public final LiveData f105987C;

    /* renamed from: D */
    public final Lazy f105988D;

    /* renamed from: E */
    public final LiveData f105989E;

    /* renamed from: F */
    public final Lazy f105990F;

    /* renamed from: G */
    public final LiveData f105991G;

    /* renamed from: H */
    public final Lazy f105992H;

    /* renamed from: I */
    public final LiveData f105993I;

    /* renamed from: b */
    public final HomeRepository f105994b;

    /* renamed from: c */
    public final Rx2ThreadService f105995c;

    /* renamed from: d */
    public final RtrRx2Repository f105996d;

    /* renamed from: e */
    public final PreferencesRepository f105997e;

    /* renamed from: f */
    public final ServerErrorService f105998f;

    /* renamed from: g */
    public final OneErrorService f105999g;

    /* renamed from: h */
    public final ConfigurationRepository f106000h;

    /* renamed from: i */
    public final CompositeDisposable f106001i;

    /* renamed from: j */
    public final Lazy f106002j;

    /* renamed from: k */
    public final LiveData f106003k;

    /* renamed from: l */
    public final Lazy f106004l;

    /* renamed from: m */
    public final LiveData f106005m;

    /* renamed from: n */
    public final Lazy f106006n;

    /* renamed from: o */
    public final LiveData f106007o;

    /* renamed from: p */
    public final Lazy f106008p;

    /* renamed from: q */
    public final LiveData f106009q;

    /* renamed from: r */
    public final Lazy f106010r;

    /* renamed from: s */
    public final LiveData f106011s;

    /* renamed from: t */
    public final Lazy f106012t;

    /* renamed from: u */
    public final LiveData f106013u;

    /* renamed from: v */
    public final Lazy f106014v;

    /* renamed from: w */
    public final LiveData f106015w;

    /* renamed from: x */
    public final Lazy f106016x;

    /* renamed from: y */
    public final LiveData f106017y;

    /* renamed from: z */
    public final Lazy f106018z;

    @Inject
    public HomeViewModel(@NotNull HomeRepository homeRepository, @NotNull Rx2ThreadService threadService, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull PreferencesRepository preference, @NotNull ServerErrorService errorService, @NotNull OneErrorService oneErrorService, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(homeRepository, "homeRepository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(oneErrorService, "oneErrorService");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.f105994b = homeRepository;
        this.f105995c = threadService;
        this.f105996d = rtrRx2Repository;
        this.f105997e = preference;
        this.f105998f = errorService;
        this.f105999g = oneErrorService;
        this.f106000h = configurationRepository;
        this.f106001i = new CompositeDisposable();
        this.f106002j = LazyKt__LazyJVMKt.lazy(HomeViewModel$_showSwipeRefreshLoading$2.INSTANCE);
        this.f106003k = m2601C();
        this.f106004l = LazyKt__LazyJVMKt.lazy(HomeViewModel$_staffDetailResponse$2.INSTANCE);
        this.f106005m = m2600D();
        this.f106006n = LazyKt__LazyJVMKt.lazy(HomeViewModel$_mrtrPre2PostAuthorization$2.INSTANCE);
        this.f106007o = m2576x();
        this.f106008p = LazyKt__LazyJVMKt.lazy(HomeViewModel$_mrtrPrepaidAuthorization$2.INSTANCE);
        this.f106009q = m2575y();
        this.f106010r = LazyKt__LazyJVMKt.lazy(HomeViewModel$_mrtrPrepaidMultiSimAuthorization$2.INSTANCE);
        this.f106011s = m2574z();
        this.f106012t = LazyKt__LazyJVMKt.lazy(HomeViewModel$_mrtrPrepaidReregistAuthorization$2.INSTANCE);
        this.f106013u = m2603A();
        this.f106014v = LazyKt__LazyJVMKt.lazy(HomeViewModel$_mrtrESimAuthorization$2.INSTANCE);
        this.f106015w = m2577w();
        this.f106016x = LazyKt__LazyJVMKt.lazy(HomeViewModel$_campaignRedemptionNoti$2.INSTANCE);
        this.f106017y = m2581s();
        this.f106018z = LazyKt__LazyJVMKt.lazy(HomeViewModel$_campaignCount$2.INSTANCE);
        this.f105985A = m2582r();
        this.f105986B = LazyKt__LazyJVMKt.lazy(HomeViewModel$_featureCode$2.INSTANCE);
        this.f105987C = m2579u();
        this.f105988D = LazyKt__LazyJVMKt.lazy(HomeViewModel$_currentBalanceResponse$2.INSTANCE);
        this.f105989E = m2580t();
        this.f105990F = LazyKt__LazyJVMKt.lazy(HomeViewModel$_oneCurrentBalanceResponse$2.INSTANCE);
        this.f105991G = m2602B();
        this.f105992H = LazyKt__LazyJVMKt.lazy(HomeViewModel$_groupMenuCollection$2.INSTANCE);
        this.f105993I = m2578v();
    }

    /* renamed from: A */
    public final MutableLiveData m2603A() {
        return (MutableLiveData) this.f106012t.getValue();
    }

    /* renamed from: B */
    public final MutableLiveData m2602B() {
        return (MutableLiveData) this.f105990F.getValue();
    }

    /* renamed from: C */
    private final MutableLiveData m2601C() {
        return (MutableLiveData) this.f106002j.getValue();
    }

    /* renamed from: D */
    public final MutableLiveData m2600D() {
        return (MutableLiveData) this.f106004l.getValue();
    }

    /* renamed from: E */
    public static final HomeDetailResponse m2599E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (HomeDetailResponse) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final CampaignCountResponse m2590j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (CampaignCountResponse) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public final List m2589k() {
        String featureName;
        List<GroupPermission> listGroupPermission = this.f105996d.getSessionNow().getListGroupPermission();
        Intrinsics.checkNotNullExpressionValue(listGroupPermission, "rtrRx2Repository.sessionNow.listGroupPermission");
        List<GroupPermission> list = listGroupPermission;
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list, 10));
        for (GroupPermission groupPermission : list) {
            Integer valueOf = Integer.valueOf(groupPermission.getOrder());
            List<GroupItem> groupItem = groupPermission.getGroupItem();
            ArrayList arrayList2 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(groupItem, 10));
            for (GroupItem groupItem2 : groupItem) {
                if (Intrinsics.areEqual(groupItem2.getFeatureCode(), PermissionConstant.M_SALE_ORDR)) {
                    featureName = "ซื้อเครื่อง";
                } else {
                    featureName = groupItem2.getFeatureName();
                }
                String allow = groupItem2.getAllow();
                int menuOrder = groupItem2.getMenuOrder();
                arrayList2.add(new GroupItemItem(allow, Integer.valueOf(menuOrder), groupItem2.getFeatureCode(), featureName));
            }
            arrayList.add(new GroupServiceItem(valueOf, new ArrayList(arrayList2), groupPermission.getTitle()));
        }
        return arrayList;
    }

    /* renamed from: l */
    public static final void m2588l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m2587m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m2586n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m2585o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m2584p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m2583q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public final MutableLiveData m2582r() {
        return (MutableLiveData) this.f106018z.getValue();
    }

    /* renamed from: s */
    public final MutableLiveData m2581s() {
        return (MutableLiveData) this.f106016x.getValue();
    }

    /* renamed from: t */
    public final MutableLiveData m2580t() {
        return (MutableLiveData) this.f105988D.getValue();
    }

    /* renamed from: u */
    public final MutableLiveData m2579u() {
        return (MutableLiveData) this.f105986B.getValue();
    }

    /* renamed from: v */
    public final MutableLiveData m2578v() {
        return (MutableLiveData) this.f105992H.getValue();
    }

    /* renamed from: w */
    public final MutableLiveData m2577w() {
        return (MutableLiveData) this.f106014v.getValue();
    }

    /* renamed from: x */
    public final MutableLiveData m2576x() {
        return (MutableLiveData) this.f106006n.getValue();
    }

    /* renamed from: z */
    public final MutableLiveData m2574z() {
        return (MutableLiveData) this.f106010r.getValue();
    }

    public final void callApiGetCampaignCount() {
        Observable<R> compose = this.f105994b.getCampaignCount().compose(this.f105995c.applyAsync());
        final HomeViewModel$callApiGetCampaignCount$1 homeViewModel$callApiGetCampaignCount$1 = new HomeViewModel$callApiGetCampaignCount$1(this);
        Observable compose2 = compose.map(new Function() { // from class: X80
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                CampaignCountResponse m2590j;
                m2590j = HomeViewModel.m2590j(homeViewModel$callApiGetCampaignCount$1, obj);
                return m2590j;
            }
        }).compose(this.f105995c.applyBackground());
        Intrinsics.checkNotNullExpressionValue(compose2, "fun callApiGetCampaignCo… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy$default(compose2, new HomeViewModel$callApiGetCampaignCount$2(this), (Function0) null, new HomeViewModel$callApiGetCampaignCount$3(this), 2, (Object) null), this.f106001i);
    }

    public final void callRedeemNoti(@NotNull String rtrCode) {
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        Single<R> compose = this.f105994b.cmsRetailerCampaignRedeemNoti(new CampaignRedeemNotRequest(rtrCode, "dtacOne")).compose(this.f105995c.applySingleAsync());
        Intrinsics.checkNotNullExpressionValue(compose, "homeRepository.cmsRetail…rvice.applySingleAsync())");
        DisposableKt.addTo(SubscribersKt.subscribeBy(compose, new HomeViewModel$callRedeemNoti$1(this), new HomeViewModel$callRedeemNoti$2(this)), this.f106001i);
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getCampaignCount() {
        return this.f105985A;
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getCampaignRedemptionNoti() {
        return this.f106017y;
    }

    public final void getCurrentBalance() {
        Single<R> compose = this.f105994b.getCurrentBalance().compose(this.f105995c.applySingleAsync());
        Intrinsics.checkNotNullExpressionValue(compose, "homeRepository.getCurren…rvice.applySingleAsync())");
        DisposableKt.addTo(SubscribersKt.subscribeBy(compose, new HomeViewModel$getCurrentBalance$1(this), new HomeViewModel$getCurrentBalance$2(this)), this.f106001i);
    }

    @NotNull
    public final LiveData<Resource<BalanceCollection>> getCurrentBalanceResponse() {
        return this.f105989E;
    }

    @NotNull
    public final LiveData<String> getFeatureCode() {
        return this.f105987C;
    }

    @NotNull
    public final LiveData<Resource<List<GroupServiceItem>>> getGroupMenuCollection() {
        return this.f105993I;
    }

    @NotNull
    public final LiveData<Resource<GetAuthorizationByRtrESimResponse>> getMrtrESimAuthorization() {
        return this.f106015w;
    }

    @NotNull
    public final LiveData<Resource<GetPre2PostAuthorizationByRtrResponse>> getMrtrPre2PostAuthorization() {
        return this.f106007o;
    }

    @NotNull
    public final LiveData<Resource<GetAuthorizationByRtrResponse>> getMrtrPrepaidAuthorization() {
        return this.f106009q;
    }

    public final void getMrtrPrepaidAuthorizationw(@NotNull String featureCode) {
        Intrinsics.checkNotNullParameter(featureCode, "featureCode");
        Single<R> compose = this.f105994b.getPrepaidAuthorizationByRTR(featureCode).compose(this.f105995c.applySingleAsync());
        final HomeViewModel$getMrtrPrepaidAuthorizationw$1 homeViewModel$getMrtrPrepaidAuthorizationw$1 = new HomeViewModel$getMrtrPrepaidAuthorizationw$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: S80
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HomeViewModel.m2585o(homeViewModel$getMrtrPrepaidAuthorizationw$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getMrtrPrepaidAuthor…    }\n            )\n    }");
        SubscribersKt.subscribeBy(doOnSubscribe, new HomeViewModel$getMrtrPrepaidAuthorizationw$2(this), new HomeViewModel$getMrtrPrepaidAuthorizationw$3(this, featureCode));
    }

    @NotNull
    public final LiveData<Resource<GetAuthorizationByRtrResponse>> getMrtrPrepaidMultiSimAuthorization() {
        return this.f106011s;
    }

    @NotNull
    public final LiveData<Resource<GetAuthorizationByRtrResponse>> getMrtrPrepaidReregistAuthorization() {
        return this.f106013u;
    }

    public final void getOneBalance() {
        Observable<R> compose = this.f105994b.getOneBalance().compose(this.f105995c.applyAsync());
        Intrinsics.checkNotNullExpressionValue(compose, "homeRepository.getOneBal…readService.applyAsync())");
        DisposableKt.addTo(SubscribersKt.subscribeBy$default(compose, new HomeViewModel$getOneBalance$1(this), (Function0) null, new HomeViewModel$getOneBalance$2(this), 2, (Object) null), this.f106001i);
    }

    @NotNull
    public final LiveData<Resource<BalanceResponse>> getOneCurrentBalanceResponse() {
        return this.f105991G;
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getShowSwipeRefreshLoading() {
        return this.f106003k;
    }

    public final void getStaffDetail(long j) {
        Single<R> compose = this.f105994b.getStaffDetail(j).compose(this.f105995c.applySingleAsync());
        Intrinsics.checkNotNullExpressionValue(compose, "homeRepository.getStaffD…rvice.applySingleAsync())");
        DisposableKt.addTo(SubscribersKt.subscribeBy(compose, HomeViewModel$getStaffDetail$1.INSTANCE, new HomeViewModel$getStaffDetail$2(this)), this.f106001i);
    }

    @NotNull
    public final LiveData<Resource<StaffDetailCollection>> getStaffDetailResponse() {
        return this.f106005m;
    }

    public final boolean hasAuthorizationScreen(@NotNull String screenCode) {
        Intrinsics.checkNotNullParameter(screenCode, "screenCode");
        return this.f105994b.hasAuthorizationScreen(screenCode);
    }

    public final boolean isUserLan() {
        return this.f105994b.isUserLan();
    }

    @NotNull
    public final Map<String, String> mapParamNBTC() {
        String rtrCode = this.f105996d.getSessionNow().getToken().getRtrCode();
        String retailerNumber = this.f105996d.getSessionNow().getRetailerNumber();
        String token = this.f105996d.getSessionNow().getToken().getToken();
        byte[] bytes = (rtrCode + "|" + retailerNumber + "|" + token).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(originalS…eArray(), Base64.NO_WRAP)");
        HashMap hashMap = new HashMap();
        hashMap.put("datatoken", encodeToString);
        return hashMap;
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f106001i.dispose();
    }

    public final void oneGetCurrentBalanceAndGroupMenu() {
        m2578v().setValue(Resource.Companion.success(m2589k()));
    }

    public final void oneGetCurrentBalanceAndStaffDetailAndGroupMenu(long j) {
        Single<StaffDetailCollection> staffDetail = this.f105994b.getStaffDetail(j);
        final HomeViewModel$oneGetCurrentBalanceAndStaffDetailAndGroupMenu$1 homeViewModel$oneGetCurrentBalanceAndStaffDetailAndGroupMenu$1 = new HomeViewModel$oneGetCurrentBalanceAndStaffDetailAndGroupMenu$1(this);
        Single compose = staffDetail.map(new Function() { // from class: W80
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                HomeDetailResponse m2599E;
                m2599E = HomeViewModel.m2599E(homeViewModel$oneGetCurrentBalanceAndStaffDetailAndGroupMenu$1, obj);
                return m2599E;
            }
        }).compose(this.f105995c.applySingleAsync());
        Intrinsics.checkNotNullExpressionValue(compose, "fun oneGetCurrentBalance… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(compose, new HomeViewModel$oneGetCurrentBalanceAndStaffDetailAndGroupMenu$2(this), new HomeViewModel$oneGetCurrentBalanceAndStaffDetailAndGroupMenu$3(this)), this.f106001i);
    }

    /* renamed from: y */
    public final MutableLiveData m2575y() {
        return (MutableLiveData) this.f106008p.getValue();
    }

    /* renamed from: getMrtrESimAuthorization */
    public final void m75301getMrtrESimAuthorization() {
        Single<R> compose = this.f105994b.getMrtrESimAuthorization().compose(this.f105995c.applySingleAsync());
        final HomeViewModel$getMrtrESimAuthorization$1 homeViewModel$getMrtrESimAuthorization$1 = new HomeViewModel$getMrtrESimAuthorization$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Z80
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HomeViewModel.m2588l(homeViewModel$getMrtrESimAuthorization$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getMrtrESimAuthoriza…    }\n            )\n    }");
        SubscribersKt.subscribeBy(doOnSubscribe, new HomeViewModel$getMrtrESimAuthorization$2(this), new HomeViewModel$getMrtrESimAuthorization$3(this));
    }

    /* renamed from: getMrtrPre2PostAuthorization */
    public final void m75302getMrtrPre2PostAuthorization() {
        Single<R> compose = this.f105994b.getMrtrPre2PostAuthorization().compose(this.f105995c.applySingleAsync());
        final HomeViewModel$getMrtrPre2PostAuthorization$1 homeViewModel$getMrtrPre2PostAuthorization$1 = new HomeViewModel$getMrtrPre2PostAuthorization$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: U80
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HomeViewModel.m2587m(homeViewModel$getMrtrPre2PostAuthorization$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getMrtrPre2PostAutho…    }\n            )\n    }");
        SubscribersKt.subscribeBy(doOnSubscribe, new HomeViewModel$getMrtrPre2PostAuthorization$2(this), new HomeViewModel$getMrtrPre2PostAuthorization$3(this));
    }

    public final void getMrtrPrepaidAuthorization(@NotNull String featureCode) {
        Intrinsics.checkNotNullParameter(featureCode, "featureCode");
        Single<R> compose = this.f105994b.getPrepaidAuthorizationByRTR(featureCode).compose(this.f105995c.applySingleAsync());
        final HomeViewModel$getMrtrPrepaidAuthorization$1 homeViewModel$getMrtrPrepaidAuthorization$1 = new HomeViewModel$getMrtrPrepaidAuthorization$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Y80
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HomeViewModel.m2586n(homeViewModel$getMrtrPrepaidAuthorization$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getMrtrPrepaidAuthor…    }\n            )\n    }");
        SubscribersKt.subscribeBy(doOnSubscribe, new HomeViewModel$getMrtrPrepaidAuthorization$2(this), new HomeViewModel$getMrtrPrepaidAuthorization$3(this, featureCode));
    }

    public final void getMrtrPrepaidMultiSimAuthorization(@NotNull String featureCode) {
        Intrinsics.checkNotNullParameter(featureCode, "featureCode");
        Single<R> compose = this.f105994b.getPrepaidMultiSimAuthorizationByRTR(featureCode).compose(this.f105995c.applySingleAsync());
        final HomeViewModel$getMrtrPrepaidMultiSimAuthorization$1 homeViewModel$getMrtrPrepaidMultiSimAuthorization$1 = new HomeViewModel$getMrtrPrepaidMultiSimAuthorization$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: V80
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HomeViewModel.m2584p(homeViewModel$getMrtrPrepaidMultiSimAuthorization$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getMrtrPrepaidMultiS…    }\n            )\n    }");
        SubscribersKt.subscribeBy(doOnSubscribe, new HomeViewModel$getMrtrPrepaidMultiSimAuthorization$2(this), new HomeViewModel$getMrtrPrepaidMultiSimAuthorization$3(this, featureCode));
    }

    /* renamed from: getMrtrPrepaidReregistAuthorization */
    public final void m75303getMrtrPrepaidReregistAuthorization() {
        Single<R> compose = this.f105994b.getPrepaidReregistAuthorizationByRTR().compose(this.f105995c.applySingleAsync());
        final HomeViewModel$getMrtrPrepaidReregistAuthorization$1 homeViewModel$getMrtrPrepaidReregistAuthorization$1 = new HomeViewModel$getMrtrPrepaidReregistAuthorization$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: T80
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HomeViewModel.m2583q(homeViewModel$getMrtrPrepaidReregistAuthorization$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getMrtrPrepaidReregi…    }\n            )\n    }");
        SubscribersKt.subscribeBy(doOnSubscribe, new HomeViewModel$getMrtrPrepaidReregistAuthorization$2(this), new HomeViewModel$getMrtrPrepaidReregistAuthorization$3(this));
    }
}