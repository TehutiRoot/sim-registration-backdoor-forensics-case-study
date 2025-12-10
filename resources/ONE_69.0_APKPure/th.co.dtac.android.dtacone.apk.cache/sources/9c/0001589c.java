package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.device_sale.GetNewIMEIResponse;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.MrtrPostpaidValidateSimBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.MrtrBrandedAllPackageGroupRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.MrtrBrandedSearchPackageGroupRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.MrtrBrandedSearchPackageGroupResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.MrtrBrandedViewAllPackageGroupRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.MrtrBrandedViewAllPackageGroupResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.MrtrRetailerAllPackageGroupRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.MrtrRetailerPackageDetail;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.MrtrRetailerRequestSearchPackage;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.PackageGroupCodeRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.PackageGroupCodeResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.postpaid_validation.SpecialPackageItem;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration.Package;
import th.p047co.dtac.android.dtacone.model.postpaid.PackageSet;
import th.p047co.dtac.android.dtacone.model.postpaid.PostpaidPackageSetResponse;
import th.p047co.dtac.android.dtacone.model.postpaid_registration.PostpaidSearchPackage;
import th.p047co.dtac.android.dtacone.model.postpaid_registration.PostpaidSearchPackageName;
import th.p047co.dtac.android.dtacone.model.postpaid_registration.PostpaidSearchPackagePaginate;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_postpaid.MrtrPostpaidRepository;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.packages.MrtrPostpaidAllPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.packages.MrtrPostpaidDefaultPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.packages.MrtrPostpaidDxAllPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.packages.MrtrPostpaidDxDefaultPackageFragment;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidPackagesViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020!¢\u0006\u0004\b&\u0010$J\u0015\u0010)\u001a\u00020\u00142\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b+\u0010\u001cJ\u001d\u0010-\u001a\u00020\u00142\u0006\u0010,\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0014¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u000e¢\u0006\u0004\b1\u0010\u0018J\u0015\u00102\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b2\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R'\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR#\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR'\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0O0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010E\u001a\u0004\bR\u0010GR#\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0O0I8\u0006¢\u0006\f\n\u0004\bT\u0010K\u001a\u0004\bU\u0010MR'\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0B0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010E\u001a\u0004\bX\u0010GR#\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0B0I8\u0006¢\u0006\f\n\u0004\bZ\u0010K\u001a\u0004\b[\u0010MR'\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0B0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010E\u001a\u0004\b_\u0010GR#\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0B0I8\u0006¢\u0006\f\n\u0004\ba\u0010K\u001a\u0004\bb\u0010MR'\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0B0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010E\u001a\u0004\be\u0010GR#\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0B0I8\u0006¢\u0006\f\n\u0004\bR\u0010K\u001a\u0004\bg\u0010MR'\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0B0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010E\u001a\u0004\bd\u0010GR#\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0B0I8\u0006¢\u0006\f\n\u0004\bl\u0010K\u001a\u0004\bm\u0010MR'\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0B0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010E\u001a\u0004\bl\u0010GR#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0B0I8\u0006¢\u0006\f\n\u0004\be\u0010K\u001a\u0004\bp\u0010MR'\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0B0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010E\u001a\u0004\bj\u0010GR#\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0B0I8\u0006¢\u0006\f\n\u0004\br\u0010K\u001a\u0004\bs\u0010MR'\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020u0B0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010E\u001a\u0004\br\u0010GR#\u0010x\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020u0B0I8\u0006¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bw\u0010MR\u0011\u0010y\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\by\u0010\u0018R$\u0010~\u001a\u00020!2\u0006\u0010z\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010|\"\u0004\b}\u0010$R&\u0010\u007f\u001a\u00020\u000e2\u0006\u0010z\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0004\b\u007f\u0010\u0018\"\u0006\b\u0080\u0001\u0010\u0081\u0001R(\u0010\u0082\u0001\u001a\u00020\u000e2\u0006\u0010z\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u0082\u0001\u0010\u0018\"\u0006\b\u0083\u0001\u0010\u0081\u0001R,\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010z\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0005\b\u0086\u0001\u0010\u001cR-\u0010\u008c\u0001\u001a\u0004\u0018\u00010i2\b\u0010z\u001a\u0004\u0018\u00010i8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R/\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008d\u00012\t\u0010z\u001a\u0005\u0018\u00010\u008d\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R,\u0010\u0096\u0001\u001a\u0004\u0018\u00010'2\b\u0010z\u001a\u0004\u0018\u00010'8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0005\b\u0095\u0001\u0010*R-\u0010\u009b\u0001\u001a\u0004\u0018\u00010u2\b\u0010z\u001a\u0004\u0018\u00010u8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R/\u0010¡\u0001\u001a\u0005\u0018\u00010\u009c\u00012\t\u0010z\u001a\u0005\u0018\u00010\u009c\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001¨\u0006¢\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/mrtr_postpaid_registration/MrtrPostpaidPackagesViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/repository/mrtr_postpaid/MrtrPostpaidRepository;", "repository", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/repository/mrtr_postpaid/MrtrPostpaidRepository;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;)V", "Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;", "packages", "", "x", "(Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;)Z", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "C", "(Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;)Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;", "", "z", "(Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;)V", "isDefaultPackage", "()Z", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;", "validateBarcodeResponse", "getAllPackageGroup", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;)V", "refreshPackage", "isRefresh", "getAllPackageGroupRetailer", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;Z)V", "", "keyword", "searchPackageGroupRetailer", "(Ljava/lang/String;)V", "packageCode", "callPackageDetail", "Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;", "pack", "validatePackageGroupCode", "(Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;)V", "getAllPackageGroupBranded", "packageGroupRefNo", "getViewAllPackageGroupBranded", "(Ljava/lang/String;Z)V", "navigateNext", "()V", "isSpecialPackage", "getSearchPackageGroupBranded", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/mrtr_postpaid/MrtrPostpaidRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "d", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "e", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.FILL_NON_ZERO, "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", OperatorName.NON_STROKING_GRAY, "Lkotlin/Lazy;", "u", "()Landroidx/lifecycle/MutableLiveData;", "_showErrorMessage", "Landroidx/lifecycle/LiveData;", OperatorName.CLOSE_PATH, "Landroidx/lifecycle/LiveData;", "getShowErrorMessage", "()Landroidx/lifecycle/LiveData;", "showErrorMessage", "Lth/co/dtac/android/dtacone/model/Event;", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "i", "p", "_navigateNext", OperatorName.SET_LINE_JOINSTYLE, "getNavigateNext", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/MrtrBrandedViewAllPackageGroupResponse;", OperatorName.NON_STROKING_CMYK, OperatorName.SET_LINE_WIDTH, "_viewAllPackageGroupBrandedResponse", OperatorName.LINE_TO, "getGetViewAllPackageGroupBrandedResponse", "getViewAllPackageGroupBrandedResponse", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/MrtrBrandedSearchPackageGroupResponse;", OperatorName.MOVE_TO, OperatorName.CLOSE_AND_STROKE, "_searchPackageGroupBrandedResponse", OperatorName.ENDPATH, "getGetSearchPackageGroupBrandedResponse", "getSearchPackageGroupBrandedResponse", "o", "t", "_searchPackageRetailerResponse", "getGetSearchPackageRetailerResponse", "getSearchPackageRetailerResponse", "Lth/co/dtac/android/dtacone/model/postpaid/PostpaidPackageSetResponse;", OperatorName.SAVE, "_allPackageGroupRetailerResponse", PDPageLabelRange.STYLE_ROMAN_LOWER, "getGetAllPackageGroupRetailerResponse", "getAllPackageGroupRetailerResponse", "_refreshPackage", "getRefreshPackage", "_packageDetailRetailerResponse", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getGetPackageDetailRetailerResponse", "getPackageDetailRetailerResponse", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/PackageGroupCodeResponse;", "_validatePackageGroupCodeResponse", "getGetValidatePackageGroupCodeResponse", "getValidatePackageGroupCodeResponse", "isUserLan", "value", "getSimBarcode", "()Ljava/lang/String;", "setSimBarcode", "simBarcode", "isWithContract", "setWithContract", "(Z)V", "isDefaultPackageRetailer", "setDefaultPackageRetailer", "getValidateSimBarcodeResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;", "setValidateSimBarcodeResponse", "validateSimBarcodeResponse", "getPostpaidPackageSetRetailerResponse", "()Lth/co/dtac/android/dtacone/model/postpaid/PostpaidPackageSetResponse;", "setPostpaidPackageSetRetailerResponse", "(Lth/co/dtac/android/dtacone/model/postpaid/PostpaidPackageSetResponse;)V", "postpaidPackageSetRetailerResponse", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "getMPackage", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "setMPackage", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;)V", "mPackage", "getPackageSetRetailer", "()Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;", "setPackageSetRetailer", "packageSetRetailer", "getPackageGroupCodeResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/PackageGroupCodeResponse;", "setPackageGroupCodeResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/PackageGroupCodeResponse;)V", "packageGroupCodeResponse", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;", "getSpecialPackageItem", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;", "setSpecialPackageItem", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;)V", "specialPackageItem", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidPackagesViewModel */
/* loaded from: classes9.dex */
public final class MrtrPostpaidPackagesViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final MrtrPostpaidRepository f106402b;

    /* renamed from: c */
    public final ConfigurationRepository f106403c;

    /* renamed from: d */
    public final Rx2ThreadService f106404d;

    /* renamed from: e */
    public final MrtrErrorService f106405e;

    /* renamed from: f */
    public final CompositeDisposable f106406f;

    /* renamed from: g */
    public final Lazy f106407g;

    /* renamed from: h */
    public final LiveData f106408h;

    /* renamed from: i */
    public final Lazy f106409i;

    /* renamed from: j */
    public final LiveData f106410j;

    /* renamed from: k */
    public final Lazy f106411k;

    /* renamed from: l */
    public final LiveData f106412l;

    /* renamed from: m */
    public final Lazy f106413m;

    /* renamed from: n */
    public final LiveData f106414n;

    /* renamed from: o */
    public final Lazy f106415o;

    /* renamed from: p */
    public final LiveData f106416p;

    /* renamed from: q */
    public final Lazy f106417q;

    /* renamed from: r */
    public final LiveData f106418r;

    /* renamed from: s */
    public final Lazy f106419s;

    /* renamed from: t */
    public final LiveData f106420t;

    /* renamed from: u */
    public final Lazy f106421u;

    /* renamed from: v */
    public final LiveData f106422v;

    /* renamed from: w */
    public final Lazy f106423w;

    /* renamed from: x */
    public final LiveData f106424x;

    @Inject
    public MrtrPostpaidPackagesViewModel(@NotNull MrtrPostpaidRepository repository, @NotNull ConfigurationRepository configurationRepository, @NotNull Rx2ThreadService threadService, @NotNull MrtrErrorService errorService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f106402b = repository;
        this.f106403c = configurationRepository;
        this.f106404d = threadService;
        this.f106405e = errorService;
        this.f106406f = new CompositeDisposable();
        this.f106407g = LazyKt__LazyJVMKt.lazy(MrtrPostpaidPackagesViewModel$_showErrorMessage$2.INSTANCE);
        this.f106408h = m2316u();
        this.f106409i = LazyKt__LazyJVMKt.lazy(MrtrPostpaidPackagesViewModel$_navigateNext$2.INSTANCE);
        this.f106410j = m2321p();
        this.f106411k = LazyKt__LazyJVMKt.lazy(C16599x3afc7de3.INSTANCE);
        this.f106412l = m2314w();
        this.f106413m = LazyKt__LazyJVMKt.lazy(C16597xc606c711.INSTANCE);
        this.f106414n = m2318s();
        this.f106415o = LazyKt__LazyJVMKt.lazy(MrtrPostpaidPackagesViewModel$_searchPackageRetailerResponse$2.INSTANCE);
        this.f106416p = m2317t();
        this.f106417q = LazyKt__LazyJVMKt.lazy(MrtrPostpaidPackagesViewModel$_allPackageGroupRetailerResponse$2.INSTANCE);
        this.f106418r = m2322o();
        this.f106419s = LazyKt__LazyJVMKt.lazy(MrtrPostpaidPackagesViewModel$_refreshPackage$2.INSTANCE);
        this.f106420t = m2319r();
        this.f106421u = LazyKt__LazyJVMKt.lazy(MrtrPostpaidPackagesViewModel$_packageDetailRetailerResponse$2.INSTANCE);
        this.f106422v = m2320q();
        this.f106423w = LazyKt__LazyJVMKt.lazy(C16598xebeb818e.INSTANCE);
        this.f106424x = m2315v();
    }

    /* renamed from: A */
    public static final PostpaidSearchPackage m2339A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (PostpaidSearchPackage) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m2338B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public final PostpaidSearchPackage m2337C(PostpaidSearchPackage postpaidSearchPackage) {
        int i;
        List<PostpaidSearchPackageName> packages = postpaidSearchPackage.getPackages();
        if (packages != null) {
            packages.add(new PostpaidSearchPackageName(null, null));
        }
        PostpaidSearchPackagePaginate paginate = postpaidSearchPackage.getPaginate();
        if (paginate != null) {
            i = paginate.getItemPerPage();
        } else {
            i = 0;
        }
        return new PostpaidSearchPackage(packages, postpaidSearchPackage.getPaginate(), "ค้นพบแพ็กเกจมากกว่า " + i + " รายการ ใส่คำค้นหาเพิ่มเติม หรือใส่รหัสแพ็กเกจที่ต้องการดูนะคะ");
    }

    /* renamed from: D */
    public static final void m2336D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m2327j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m2326k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m2325l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m2324m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m2323n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public final MutableLiveData m2322o() {
        return (MutableLiveData) this.f106417q.getValue();
    }

    /* renamed from: p */
    private final MutableLiveData m2321p() {
        return (MutableLiveData) this.f106409i.getValue();
    }

    /* renamed from: q */
    public final MutableLiveData m2320q() {
        return (MutableLiveData) this.f106421u.getValue();
    }

    /* renamed from: r */
    public final MutableLiveData m2319r() {
        return (MutableLiveData) this.f106419s.getValue();
    }

    /* renamed from: s */
    public final MutableLiveData m2318s() {
        return (MutableLiveData) this.f106413m.getValue();
    }

    /* renamed from: t */
    private final MutableLiveData m2317t() {
        return (MutableLiveData) this.f106415o.getValue();
    }

    /* renamed from: u */
    public final MutableLiveData m2316u() {
        return (MutableLiveData) this.f106407g.getValue();
    }

    /* renamed from: v */
    private final MutableLiveData m2315v() {
        return (MutableLiveData) this.f106423w.getValue();
    }

    /* renamed from: w */
    public final MutableLiveData m2314w() {
        return (MutableLiveData) this.f106411k.getValue();
    }

    /* renamed from: x */
    public final boolean m2313x(PostpaidSearchPackage postpaidSearchPackage) {
        int i;
        int i2;
        PostpaidSearchPackagePaginate paginate = postpaidSearchPackage.getPaginate();
        if (paginate != null) {
            i = paginate.getTotalItem();
        } else {
            i = 0;
        }
        PostpaidSearchPackagePaginate paginate2 = postpaidSearchPackage.getPaginate();
        if (paginate2 != null) {
            i2 = paginate2.getItemPerPage();
        } else {
            i2 = 0;
        }
        if (i <= i2) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final boolean m2312y(PostpaidSearchPackage postpaidSearchPackage) {
        PostpaidSearchPackagePaginate paginate = postpaidSearchPackage.getPaginate();
        if (paginate == null || paginate.getTotalItem() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public final void m2311z(PostpaidSearchPackage postpaidSearchPackage) {
        getLiveDataState().setValue(StatusResource.DISMISS);
        if (m2313x(postpaidSearchPackage)) {
            m2317t().postValue(Resource.Companion.success(postpaidSearchPackage));
        } else {
            m2317t().postValue(Resource.Companion.success(postpaidSearchPackage));
        }
    }

    public final void callPackageDetail(@NotNull String packageCode) {
        String str;
        String str2;
        String minPrice;
        String simType;
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        MrtrPostpaidRepository mrtrPostpaidRepository = this.f106402b;
        MrtrPostpaidValidateSimBarcodeResponse validateSimBarcodeResponse = getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse == null || (simType = validateSimBarcodeResponse.getSimType()) == null) {
            str = "";
        } else {
            str = simType;
        }
        Boolean valueOf = Boolean.valueOf(this.f106402b.getWithDevice());
        MrtrPostpaidValidateSimBarcodeResponse validateSimBarcodeResponse2 = getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse2 == null || (minPrice = validateSimBarcodeResponse2.getMinPrice()) == null) {
            str2 = "";
        } else {
            str2 = minPrice;
        }
        Single<R> compose = mrtrPostpaidRepository.packageDetail(new MrtrRetailerPackageDetail(packageCode, str, valueOf, str2, "POSTPAID")).compose(this.f106404d.applySingleAsync());
        final MrtrPostpaidPackagesViewModel$callPackageDetail$1 mrtrPostpaidPackagesViewModel$callPackageDetail$1 = new MrtrPostpaidPackagesViewModel$callPackageDetail$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Oz0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrPostpaidPackagesViewModel.m2327j(mrtrPostpaidPackagesViewModel$callPackageDetail$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun callPackageDetail(pa… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrPostpaidPackagesViewModel$callPackageDetail$2(this), new MrtrPostpaidPackagesViewModel$callPackageDetail$3(this)), this.f106406f);
    }

    public final void getAllPackageGroup(@NotNull MrtrPostpaidValidateSimBarcodeResponse validateBarcodeResponse) {
        Intrinsics.checkNotNullParameter(validateBarcodeResponse, "validateBarcodeResponse");
        boolean isUserLan = this.f106402b.isUserLan();
        if (isUserLan) {
            getAllPackageGroupBranded(validateBarcodeResponse);
        } else if (!isUserLan) {
            getAllPackageGroupRetailer(validateBarcodeResponse, false);
        }
    }

    public final void getAllPackageGroupBranded(@NotNull MrtrPostpaidValidateSimBarcodeResponse validateBarcodeResponse) {
        String str;
        Intrinsics.checkNotNullParameter(validateBarcodeResponse, "validateBarcodeResponse");
        MrtrPostpaidRepository mrtrPostpaidRepository = this.f106402b;
        String userLan = this.f106402b.getUserLan();
        String userCode = this.f106402b.getUserCode();
        String companyCode = validateBarcodeResponse.getCompanyCode();
        String subscriberNumber = validateBarcodeResponse.getSubscriberNumber();
        String telephoneType = validateBarcodeResponse.getTelephoneType();
        String customerNumber = validateBarcodeResponse.getCustomerNumber();
        boolean isWithContract = isWithContract();
        if (isWithContract) {
            str = this.f106402b.getImie();
        } else if (!isWithContract) {
            str = "";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Single<R> compose = mrtrPostpaidRepository.allPackageGroupBranded(new MrtrBrandedAllPackageGroupRequest(userLan, userCode, companyCode, subscriberNumber, telephoneType, customerNumber, str, validateBarcodeResponse.getPackageGroupType(), validateBarcodeResponse.getMinPrice(), this.f106402b.getNewIdFlag())).compose(this.f106404d.applySingleAsync());
        final MrtrPostpaidPackagesViewModel$getAllPackageGroupBranded$1 mrtrPostpaidPackagesViewModel$getAllPackageGroupBranded$1 = new MrtrPostpaidPackagesViewModel$getAllPackageGroupBranded$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Nz0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrPostpaidPackagesViewModel.m2326k(mrtrPostpaidPackagesViewModel$getAllPackageGroupBranded$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getAllPackageGroupBr… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrPostpaidPackagesViewModel$getAllPackageGroupBranded$2(this), new MrtrPostpaidPackagesViewModel$getAllPackageGroupBranded$3(this)), this.f106406f);
    }

    public final void getAllPackageGroupRetailer(@NotNull MrtrPostpaidValidateSimBarcodeResponse validateBarcodeResponse, boolean z) {
        Intrinsics.checkNotNullParameter(validateBarcodeResponse, "validateBarcodeResponse");
        Single<R> compose = this.f106402b.allPackageGroupRetailer(new MrtrRetailerAllPackageGroupRequest(validateBarcodeResponse.getSimType(), validateBarcodeResponse.getPackageGroupCode(), this.f106402b.getWithDevice(), validateBarcodeResponse.getMinPrice(), null, 16, null)).compose(this.f106404d.applySingleAsync());
        final MrtrPostpaidPackagesViewModel$getAllPackageGroupRetailer$1 mrtrPostpaidPackagesViewModel$getAllPackageGroupRetailer$1 = new MrtrPostpaidPackagesViewModel$getAllPackageGroupRetailer$1(z, this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Kz0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrPostpaidPackagesViewModel.m2325l(mrtrPostpaidPackagesViewModel$getAllPackageGroupRetailer$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getAllPackageGroupRe… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrPostpaidPackagesViewModel$getAllPackageGroupRetailer$2(this), new MrtrPostpaidPackagesViewModel$getAllPackageGroupRetailer$3(this, z)), this.f106406f);
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f106406f;
    }

    @NotNull
    public final LiveData<Resource<PostpaidPackageSetResponse>> getGetAllPackageGroupRetailerResponse() {
        return this.f106418r;
    }

    @NotNull
    public final LiveData<Resource<PackageSet>> getGetPackageDetailRetailerResponse() {
        return this.f106422v;
    }

    @NotNull
    public final LiveData<Resource<MrtrBrandedSearchPackageGroupResponse>> getGetSearchPackageGroupBrandedResponse() {
        return this.f106414n;
    }

    @NotNull
    public final LiveData<Resource<PostpaidSearchPackage>> getGetSearchPackageRetailerResponse() {
        return this.f106416p;
    }

    @NotNull
    public final LiveData<Resource<PackageGroupCodeResponse>> getGetValidatePackageGroupCodeResponse() {
        return this.f106424x;
    }

    @NotNull
    public final LiveData<Resource<MrtrBrandedViewAllPackageGroupResponse>> getGetViewAllPackageGroupBrandedResponse() {
        return this.f106412l;
    }

    @Nullable
    public final Package getMPackage() {
        return this.f106402b.getMPackage();
    }

    @NotNull
    public final LiveData<Event<FragmentNavEvent>> getNavigateNext() {
        return this.f106410j;
    }

    @Nullable
    public final PackageGroupCodeResponse getPackageGroupCodeResponse() {
        return this.f106402b.getPackageGroupCodeResponse();
    }

    @Nullable
    public final PackageSet getPackageSetRetailer() {
        return this.f106402b.getPackageSetRetailer();
    }

    @Nullable
    public final PostpaidPackageSetResponse getPostpaidPackageSetRetailerResponse() {
        return this.f106402b.getPostpaidPackageSetRetailerResponse();
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getRefreshPackage() {
        return this.f106420t;
    }

    public final void getSearchPackageGroupBranded(@NotNull String keyword) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Single<R> compose = this.f106402b.searchPackageGroupBranded(new MrtrBrandedSearchPackageGroupRequest(this.f106402b.getPackageGroupRefNo(), keyword)).compose(this.f106404d.applySingleAsync());
        final MrtrPostpaidPackagesViewModel$getSearchPackageGroupBranded$1 mrtrPostpaidPackagesViewModel$getSearchPackageGroupBranded$1 = new MrtrPostpaidPackagesViewModel$getSearchPackageGroupBranded$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Mz0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrPostpaidPackagesViewModel.m2324m(mrtrPostpaidPackagesViewModel$getSearchPackageGroupBranded$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getSearchPackageGrou… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrPostpaidPackagesViewModel$getSearchPackageGroupBranded$2(this), new MrtrPostpaidPackagesViewModel$getSearchPackageGroupBranded$3(this)), this.f106406f);
    }

    @NotNull
    public final LiveData<Resource<ErrorCollection>> getShowErrorMessage() {
        return this.f106408h;
    }

    @NotNull
    public final String getSimBarcode() {
        return this.f106402b.getSimBarcode();
    }

    @Nullable
    public final SpecialPackageItem getSpecialPackageItem() {
        return this.f106402b.getSpecialPackageItem();
    }

    @Nullable
    public final MrtrPostpaidValidateSimBarcodeResponse getValidateSimBarcodeResponse() {
        return this.f106402b.getValidateSimBarcodeResponse();
    }

    public final void getViewAllPackageGroupBranded(@NotNull String packageGroupRefNo, boolean z) {
        Intrinsics.checkNotNullParameter(packageGroupRefNo, "packageGroupRefNo");
        Single<R> compose = this.f106402b.viewAllPackageGroupBranded(new MrtrBrandedViewAllPackageGroupRequest(packageGroupRefNo)).compose(this.f106404d.applySingleAsync());
        final MrtrPostpaidPackagesViewModel$getViewAllPackageGroupBranded$1 mrtrPostpaidPackagesViewModel$getViewAllPackageGroupBranded$1 = new MrtrPostpaidPackagesViewModel$getViewAllPackageGroupBranded$1(z, this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Lz0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrPostpaidPackagesViewModel.m2323n(mrtrPostpaidPackagesViewModel$getViewAllPackageGroupBranded$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getViewAllPackageGro… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrPostpaidPackagesViewModel$getViewAllPackageGroupBranded$2(this), new MrtrPostpaidPackagesViewModel$getViewAllPackageGroupBranded$3(this, z)), this.f106406f);
    }

    public final boolean isDefaultPackage() {
        String packageGroupCode;
        MrtrPostpaidValidateSimBarcodeResponse validateSimBarcodeResponse = this.f106402b.getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse == null || (packageGroupCode = validateSimBarcodeResponse.getPackageGroupCode()) == null || packageGroupCode.length() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean isDefaultPackageRetailer() {
        return this.f106402b.isDefaultPackage();
    }

    public final boolean isSpecialPackage() {
        if (this.f106402b.getSpecialPackageItem() != null) {
            return true;
        }
        return false;
    }

    public final boolean isUserLan() {
        return this.f106402b.isUserLan();
    }

    public final boolean isWithContract() {
        return this.f106402b.getWithContract();
    }

    public final void navigateNext() {
        getLiveDataState().setValue(StatusResource.DISMISS);
        boolean isUserLan = this.f106402b.isUserLan();
        if (isUserLan) {
            if (!isDefaultPackage() && !isSpecialPackage()) {
                m2321p().setValue(new Event(new FragmentNavEvent(MrtrPostpaidDxAllPackageFragment.class, null, null, 4, null)));
            } else {
                m2321p().setValue(new Event(new FragmentNavEvent(MrtrPostpaidDxDefaultPackageFragment.class, null, null, 4, null)));
            }
        } else if (!isUserLan) {
            if (isDefaultPackage() && isDefaultPackageRetailer()) {
                m2321p().setValue(new Event(new FragmentNavEvent(MrtrPostpaidDefaultPackageFragment.class, null, null, 4, null)));
            } else {
                m2321p().setValue(new Event(new FragmentNavEvent(MrtrPostpaidAllPackageFragment.class, null, null, 4, null)));
            }
        }
    }

    public final void refreshPackage(@NotNull MrtrPostpaidValidateSimBarcodeResponse validateBarcodeResponse) {
        Intrinsics.checkNotNullParameter(validateBarcodeResponse, "validateBarcodeResponse");
        boolean isUserLan = this.f106402b.isUserLan();
        if (isUserLan) {
            getViewAllPackageGroupBranded(this.f106402b.getPackageGroupRefNo(), true);
        } else if (!isUserLan) {
            getAllPackageGroupRetailer(validateBarcodeResponse, true);
        }
    }

    public final void searchPackageGroupRetailer(@NotNull String keyword) {
        String str;
        String str2;
        String str3;
        String minPrice;
        String simType;
        String packageGroupCode;
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        MrtrPostpaidRepository mrtrPostpaidRepository = this.f106402b;
        MrtrPostpaidValidateSimBarcodeResponse validateSimBarcodeResponse = getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse == null || (packageGroupCode = validateSimBarcodeResponse.getPackageGroupCode()) == null) {
            str = "";
        } else {
            str = packageGroupCode;
        }
        MrtrPostpaidValidateSimBarcodeResponse validateSimBarcodeResponse2 = getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse2 == null || (simType = validateSimBarcodeResponse2.getSimType()) == null) {
            str2 = "";
        } else {
            str2 = simType;
        }
        Boolean valueOf = Boolean.valueOf(this.f106402b.getWithDevice());
        MrtrPostpaidValidateSimBarcodeResponse validateSimBarcodeResponse3 = getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse3 == null || (minPrice = validateSimBarcodeResponse3.getMinPrice()) == null) {
            str3 = "";
        } else {
            str3 = minPrice;
        }
        Single<PostpaidSearchPackage> searchPackageGroupRetailer = mrtrPostpaidRepository.searchPackageGroupRetailer(new MrtrRetailerRequestSearchPackage(keyword, str, str2, valueOf, str3, "POSTPAID"));
        final MrtrPostpaidPackagesViewModel$searchPackageGroupRetailer$1 mrtrPostpaidPackagesViewModel$searchPackageGroupRetailer$1 = new MrtrPostpaidPackagesViewModel$searchPackageGroupRetailer$1(this);
        Single compose = searchPackageGroupRetailer.map(new Function() { // from class: Iz0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                PostpaidSearchPackage m2339A;
                m2339A = MrtrPostpaidPackagesViewModel.m2339A(mrtrPostpaidPackagesViewModel$searchPackageGroupRetailer$1, obj);
                return m2339A;
            }
        }).compose(this.f106404d.applySingleAsync());
        final MrtrPostpaidPackagesViewModel$searchPackageGroupRetailer$2 mrtrPostpaidPackagesViewModel$searchPackageGroupRetailer$2 = new MrtrPostpaidPackagesViewModel$searchPackageGroupRetailer$2(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Jz0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrPostpaidPackagesViewModel.m2338B(mrtrPostpaidPackagesViewModel$searchPackageGroupRetailer$2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun searchPackageGroupRe… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrPostpaidPackagesViewModel$searchPackageGroupRetailer$3(this), new MrtrPostpaidPackagesViewModel$searchPackageGroupRetailer$4(this)), this.f106406f);
    }

    public final void setDefaultPackageRetailer(boolean z) {
        this.f106402b.setDefaultPackage(z);
    }

    public final void setMPackage(@Nullable Package r2) {
        this.f106402b.setMPackage(r2);
    }

    public final void setPackageGroupCodeResponse(@Nullable PackageGroupCodeResponse packageGroupCodeResponse) {
        this.f106402b.setPackageGroupCodeResponse(packageGroupCodeResponse);
    }

    public final void setPackageSetRetailer(@Nullable PackageSet packageSet) {
        this.f106402b.setPackageSetRetailer(packageSet);
    }

    public final void setPostpaidPackageSetRetailerResponse(@Nullable PostpaidPackageSetResponse postpaidPackageSetResponse) {
        this.f106402b.setPostpaidPackageSetRetailerResponse(postpaidPackageSetResponse);
    }

    public final void setSimBarcode(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f106402b.setSimBarcode(value);
    }

    public final void setSpecialPackageItem(@Nullable SpecialPackageItem specialPackageItem) {
        this.f106402b.setSpecialPackageItem(specialPackageItem);
    }

    public final void setValidateSimBarcodeResponse(@Nullable MrtrPostpaidValidateSimBarcodeResponse mrtrPostpaidValidateSimBarcodeResponse) {
        this.f106402b.setValidateSimBarcodeResponse(mrtrPostpaidValidateSimBarcodeResponse);
    }

    public final void setWithContract(boolean z) {
        this.f106402b.setWithContract(z);
    }

    public final void validatePackageGroupCode(@NotNull PackageSet pack) {
        String str;
        String str2;
        GetNewIMEIResponse hardwareNumberResponse;
        String hardwareNumber;
        Intrinsics.checkNotNullParameter(pack, "pack");
        MrtrPostpaidRepository mrtrPostpaidRepository = this.f106402b;
        String userCode = this.f106402b.getUserCode();
        MrtrPostpaidValidateSimBarcodeResponse validateSimBarcodeResponse = getValidateSimBarcodeResponse();
        Boolean bool = null;
        if (validateSimBarcodeResponse != null) {
            str = validateSimBarcodeResponse.getSubscriberNumber();
        } else {
            str = null;
        }
        GetNewIMEIResponse hardwareNumberResponse2 = this.f106402b.getHardwareNumberResponse();
        if (hardwareNumberResponse2 != null) {
            bool = Boolean.valueOf(hardwareNumberResponse2.isDtacDevice());
        }
        if (!Intrinsics.areEqual(bool, Boolean.TRUE) || (hardwareNumberResponse = this.f106402b.getHardwareNumberResponse()) == null || (hardwareNumber = hardwareNumberResponse.getHardwareNumber()) == null) {
            str2 = "";
        } else {
            str2 = hardwareNumber;
        }
        String packageCode = pack.getPackageCode();
        MrtrPostpaidValidateSimBarcodeResponse validateSimBarcodeResponse2 = getValidateSimBarcodeResponse();
        Single<R> compose = mrtrPostpaidRepository.validatePackageGroupCode(new PackageGroupCodeRequest(userCode, str, str2, packageCode, (validateSimBarcodeResponse2 == null || (r1 = validateSimBarcodeResponse2.getPackageGroupType()) == null) ? "10" : "10")).compose(this.f106404d.applySingleAsync());
        final MrtrPostpaidPackagesViewModel$validatePackageGroupCode$1 mrtrPostpaidPackagesViewModel$validatePackageGroupCode$1 = new MrtrPostpaidPackagesViewModel$validatePackageGroupCode$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Hz0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrPostpaidPackagesViewModel.m2336D(mrtrPostpaidPackagesViewModel$validatePackageGroupCode$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun validatePackageGroup… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrPostpaidPackagesViewModel$validatePackageGroupCode$2(this), new MrtrPostpaidPackagesViewModel$validatePackageGroupCode$3(this, pack)), this.f106406f);
    }
}