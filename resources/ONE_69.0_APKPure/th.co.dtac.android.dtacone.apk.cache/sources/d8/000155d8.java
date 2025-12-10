package th.p047co.dtac.android.dtacone.viewmodel.esim;

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
import kotlin.Unit;
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
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration.Package;
import th.p047co.dtac.android.dtacone.model.postpaid.PackageSet;
import th.p047co.dtac.android.dtacone.model.postpaid.PostpaidPackageSetResponse;
import th.p047co.dtac.android.dtacone.model.postpaid_registration.PostpaidSearchPackage;
import th.p047co.dtac.android.dtacone.model.postpaid_registration.PostpaidSearchPackageName;
import th.p047co.dtac.android.dtacone.model.postpaid_registration.PostpaidSearchPackagePaginate;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.listPack.ESimPostpaidAllPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.listPack.ESimPostpaidDefaultPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.listPack.ESimPostpaidDxAllPackageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.postpaid.listPack.ESimPostpaidDxDefaultPackageFragment;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.esim.ESimPostpaidPackagesViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020!¢\u0006\u0004\b&\u0010$J\u0015\u0010)\u001a\u00020\u00142\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b+\u0010\u001cJ\u001d\u0010-\u001a\u00020\u00142\u0006\u0010,\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0014¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b1\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R'\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR#\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR'\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0N0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010D\u001a\u0004\bQ\u0010FR#\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0N0H8\u0006¢\u0006\f\n\u0004\bS\u0010J\u001a\u0004\bT\u0010LR'\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0A0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010D\u001a\u0004\bW\u0010FR#\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0A0H8\u0006¢\u0006\f\n\u0004\bY\u0010J\u001a\u0004\bZ\u0010LR'\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0A0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010D\u001a\u0004\b^\u0010FR#\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0A0H8\u0006¢\u0006\f\n\u0004\b`\u0010J\u001a\u0004\ba\u0010LR'\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0A0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010D\u001a\u0004\bd\u0010FR#\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0A0H8\u0006¢\u0006\f\n\u0004\bf\u0010J\u001a\u0004\bg\u0010LR'\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0A0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010D\u001a\u0004\bc\u0010FR#\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0A0H8\u0006¢\u0006\f\n\u0004\bk\u0010J\u001a\u0004\bl\u0010LR'\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0A0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010D\u001a\u0004\bn\u0010FR#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0A0H8\u0006¢\u0006\f\n\u0004\b^\u0010J\u001a\u0004\bp\u0010LR'\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140N0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010D\u001a\u0004\bf\u0010FR#\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140N0H8\u0006¢\u0006\f\n\u0004\bE\u0010J\u001a\u0004\br\u0010LR'\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0A0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010D\u001a\u0004\bk\u0010FR#\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0A0H8\u0006¢\u0006\f\n\u0004\bW\u0010J\u001a\u0004\bv\u0010LR'\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020x0A0@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bt\u0010FR#\u0010{\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020x0A0H8\u0006¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bz\u0010LR\u0011\u0010|\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b|\u0010\u0018R&\u0010\u0081\u0001\u001a\u00020!2\u0006\u0010}\u001a\u00020!8F@FX\u0086\u000e¢\u0006\r\u001a\u0004\b~\u0010\u007f\"\u0005\b\u0080\u0001\u0010$R(\u0010\u0082\u0001\u001a\u00020\u000e2\u0006\u0010}\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u0082\u0001\u0010\u0018\"\u0006\b\u0083\u0001\u0010\u0084\u0001R(\u0010\u0085\u0001\u001a\u00020\u000e2\u0006\u0010}\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u0085\u0001\u0010\u0018\"\u0006\b\u0086\u0001\u0010\u0084\u0001R,\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00192\b\u0010}\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0005\b\u0089\u0001\u0010\u001cR-\u0010\u008f\u0001\u001a\u0004\u0018\u00010i2\b\u0010}\u001a\u0004\u0018\u00010i8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R/\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0090\u00012\t\u0010}\u001a\u0005\u0018\u00010\u0090\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R,\u0010\u0099\u0001\u001a\u0004\u0018\u00010'2\b\u0010}\u001a\u0004\u0018\u00010'8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0005\b\u0098\u0001\u0010*R-\u0010\u009e\u0001\u001a\u0004\u0018\u00010x2\b\u0010}\u001a\u0004\u0018\u00010x8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001¨\u0006\u009f\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/esim/ESimPostpaidPackagesViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/repository/esim/ESimRepository;", "repository", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/repository/esim/ESimRepository;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;)V", "Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;", "packages", "", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "(Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;)Z", "z", "D", "(Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;)Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;", "", "A", "(Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;)V", "isDefaultPackage", "()Z", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;", "validateBarcodeResponse", "getAllPackageGroup", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;)V", "refreshPackage", "isRefresh", "getAllPackageGroupRetailer", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;Z)V", "", "keyword", "searchPackageGroupRetailer", "(Ljava/lang/String;)V", "packageCode", "callPackageDetail", "Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;", "pack", "validatePackageGroupCode", "(Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;)V", "getAllPackageGroupBranded", "packageGroupRefNo", "getViewAllPackageGroupBranded", "(Ljava/lang/String;Z)V", "navigateNext", "()V", "getSearchPackageGroupBranded", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/esim/ESimRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "d", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "e", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.FILL_NON_ZERO, "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", OperatorName.NON_STROKING_GRAY, "Lkotlin/Lazy;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "()Landroidx/lifecycle/MutableLiveData;", "_showErrorMessage", "Landroidx/lifecycle/LiveData;", OperatorName.CLOSE_PATH, "Landroidx/lifecycle/LiveData;", "getShowErrorMessage", "()Landroidx/lifecycle/LiveData;", "showErrorMessage", "Lth/co/dtac/android/dtacone/model/Event;", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "i", OperatorName.SAVE, "_navigateNext", OperatorName.SET_LINE_JOINSTYLE, "getNavigateNext", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/MrtrBrandedViewAllPackageGroupResponse;", OperatorName.NON_STROKING_CMYK, "x", "_viewAllPackageGroupBrandedResponse", OperatorName.LINE_TO, "getGetViewAllPackageGroupBrandedResponse", "getViewAllPackageGroupBrandedResponse", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/MrtrBrandedSearchPackageGroupResponse;", OperatorName.MOVE_TO, "t", "_searchPackageGroupBrandedResponse", OperatorName.ENDPATH, "getGetSearchPackageGroupBrandedResponse", "getSearchPackageGroupBrandedResponse", "o", "u", "_searchPackageRetailerResponse", "p", "getGetSearchPackageRetailerResponse", "getSearchPackageRetailerResponse", "Lth/co/dtac/android/dtacone/model/postpaid/PostpaidPackageSetResponse;", "_allPackageGroupRetailerResponse", PDPageLabelRange.STYLE_ROMAN_LOWER, "getGetAllPackageGroupRetailerResponse", "getAllPackageGroupRetailerResponse", OperatorName.CLOSE_AND_STROKE, "_refreshPackage", "getRefreshPackage", "_navigateGoNext", "getNavigateGoNext", "navigateGoNext", OperatorName.SET_LINE_WIDTH, "_packageDetailRetailerResponse", "getGetPackageDetailRetailerResponse", "getPackageDetailRetailerResponse", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/PackageGroupCodeResponse;", "_validatePackageGroupCodeResponse", "getGetValidatePackageGroupCodeResponse", "getValidatePackageGroupCodeResponse", "isUserLan", "value", "getSimBarcode", "()Ljava/lang/String;", "setSimBarcode", "simBarcode", "isWithContract", "setWithContract", "(Z)V", "isDefaultPackageRetailer", "setDefaultPackageRetailer", "getValidateSimBarcodeResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;", "setValidateSimBarcodeResponse", "validateSimBarcodeResponse", "getPostpaidPackageSetRetailerResponse", "()Lth/co/dtac/android/dtacone/model/postpaid/PostpaidPackageSetResponse;", "setPostpaidPackageSetRetailerResponse", "(Lth/co/dtac/android/dtacone/model/postpaid/PostpaidPackageSetResponse;)V", "postpaidPackageSetRetailerResponse", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "getMPackage", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "setMPackage", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;)V", "mPackage", "getPackageSetRetailer", "()Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;", "setPackageSetRetailer", "packageSetRetailer", "getPackageGroupCodeResponse", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/PackageGroupCodeResponse;", "setPackageGroupCodeResponse", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/PackageGroupCodeResponse;)V", "packageGroupCodeResponse", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimPostpaidPackagesViewModel */
/* loaded from: classes9.dex */
public final class ESimPostpaidPackagesViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final ESimRepository f105665b;

    /* renamed from: c */
    public final ConfigurationRepository f105666c;

    /* renamed from: d */
    public final Rx2ThreadService f105667d;

    /* renamed from: e */
    public final MrtrErrorService f105668e;

    /* renamed from: f */
    public final CompositeDisposable f105669f;

    /* renamed from: g */
    public final Lazy f105670g;

    /* renamed from: h */
    public final LiveData f105671h;

    /* renamed from: i */
    public final Lazy f105672i;

    /* renamed from: j */
    public final LiveData f105673j;

    /* renamed from: k */
    public final Lazy f105674k;

    /* renamed from: l */
    public final LiveData f105675l;

    /* renamed from: m */
    public final Lazy f105676m;

    /* renamed from: n */
    public final LiveData f105677n;

    /* renamed from: o */
    public final Lazy f105678o;

    /* renamed from: p */
    public final LiveData f105679p;

    /* renamed from: q */
    public final Lazy f105680q;

    /* renamed from: r */
    public final LiveData f105681r;

    /* renamed from: s */
    public final Lazy f105682s;

    /* renamed from: t */
    public final LiveData f105683t;

    /* renamed from: u */
    public final Lazy f105684u;

    /* renamed from: v */
    public final LiveData f105685v;

    /* renamed from: w */
    public final Lazy f105686w;

    /* renamed from: x */
    public final LiveData f105687x;

    /* renamed from: y */
    public final Lazy f105688y;

    /* renamed from: z */
    public final LiveData f105689z;

    @Inject
    public ESimPostpaidPackagesViewModel(@NotNull ESimRepository repository, @NotNull ConfigurationRepository configurationRepository, @NotNull Rx2ThreadService threadService, @NotNull MrtrErrorService errorService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f105665b = repository;
        this.f105666c = configurationRepository;
        this.f105667d = threadService;
        this.f105668e = errorService;
        this.f105669f = new CompositeDisposable();
        this.f105670g = LazyKt__LazyJVMKt.lazy(ESimPostpaidPackagesViewModel$_showErrorMessage$2.INSTANCE);
        this.f105671h = m2874v();
        this.f105672i = LazyKt__LazyJVMKt.lazy(ESimPostpaidPackagesViewModel$_navigateNext$2.INSTANCE);
        this.f105673j = m2879q();
        this.f105674k = LazyKt__LazyJVMKt.lazy(C16529xb20fe8b4.INSTANCE);
        this.f105675l = m2872x();
        this.f105676m = LazyKt__LazyJVMKt.lazy(C16527xda623e20.INSTANCE);
        this.f105677n = m2876t();
        this.f105678o = LazyKt__LazyJVMKt.lazy(ESimPostpaidPackagesViewModel$_searchPackageRetailerResponse$2.INSTANCE);
        this.f105679p = m2875u();
        this.f105680q = LazyKt__LazyJVMKt.lazy(ESimPostpaidPackagesViewModel$_allPackageGroupRetailerResponse$2.INSTANCE);
        this.f105681r = m2881o();
        this.f105682s = LazyKt__LazyJVMKt.lazy(ESimPostpaidPackagesViewModel$_refreshPackage$2.INSTANCE);
        this.f105683t = m2877s();
        this.f105684u = LazyKt__LazyJVMKt.lazy(ESimPostpaidPackagesViewModel$_navigateGoNext$2.INSTANCE);
        this.f105685v = m2880p();
        this.f105686w = LazyKt__LazyJVMKt.lazy(ESimPostpaidPackagesViewModel$_packageDetailRetailerResponse$2.INSTANCE);
        this.f105687x = m2878r();
        this.f105688y = LazyKt__LazyJVMKt.lazy(C16528xd3cd6c9f.INSTANCE);
        this.f105689z = m2873w();
    }

    /* renamed from: B */
    public static final PostpaidSearchPackage m2898B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (PostpaidSearchPackage) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m2897C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m2895E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m2886j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m2885k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m2884l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m2883m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m2882n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    private final MutableLiveData m2879q() {
        return (MutableLiveData) this.f105672i.getValue();
    }

    /* renamed from: r */
    public final MutableLiveData m2878r() {
        return (MutableLiveData) this.f105686w.getValue();
    }

    /* renamed from: s */
    public final MutableLiveData m2877s() {
        return (MutableLiveData) this.f105682s.getValue();
    }

    /* renamed from: t */
    public final MutableLiveData m2876t() {
        return (MutableLiveData) this.f105676m.getValue();
    }

    /* renamed from: v */
    public final MutableLiveData m2874v() {
        return (MutableLiveData) this.f105670g.getValue();
    }

    /* renamed from: w */
    private final MutableLiveData m2873w() {
        return (MutableLiveData) this.f105688y.getValue();
    }

    /* renamed from: x */
    public final MutableLiveData m2872x() {
        return (MutableLiveData) this.f105674k.getValue();
    }

    /* renamed from: A */
    public final void m2899A(PostpaidSearchPackage postpaidSearchPackage) {
        getLiveDataState().setValue(StatusResource.DISMISS);
        if (m2871y(postpaidSearchPackage)) {
            m2875u().postValue(Resource.Companion.success(postpaidSearchPackage));
        } else {
            m2875u().postValue(Resource.Companion.success(postpaidSearchPackage));
        }
    }

    /* renamed from: D */
    public final PostpaidSearchPackage m2896D(PostpaidSearchPackage postpaidSearchPackage) {
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

    public final void callPackageDetail(@NotNull String packageCode) {
        String str;
        String str2;
        String minPrice;
        String simType;
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        ESimRepository eSimRepository = this.f105665b;
        MrtrPostpaidValidateSimBarcodeResponse validateSimBarcodeResponse = getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse == null || (simType = validateSimBarcodeResponse.getSimType()) == null) {
            str = "";
        } else {
            str = simType;
        }
        Boolean valueOf = Boolean.valueOf(this.f105665b.isWithDevice());
        MrtrPostpaidValidateSimBarcodeResponse validateSimBarcodeResponse2 = getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse2 == null || (minPrice = validateSimBarcodeResponse2.getMinPrice()) == null) {
            str2 = "";
        } else {
            str2 = minPrice;
        }
        Single<R> compose = eSimRepository.packageDetail(new MrtrRetailerPackageDetail(packageCode, str, valueOf, str2, "POSTPAID")).compose(this.f105667d.applySingleAsync());
        final ESimPostpaidPackagesViewModel$callPackageDetail$1 eSimPostpaidPackagesViewModel$callPackageDetail$1 = new ESimPostpaidPackagesViewModel$callPackageDetail$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: IO
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ESimPostpaidPackagesViewModel.m2886j(eSimPostpaidPackagesViewModel$callPackageDetail$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun callPackageDetail(pa… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new ESimPostpaidPackagesViewModel$callPackageDetail$2(this), new ESimPostpaidPackagesViewModel$callPackageDetail$3(this)), this.f105669f);
    }

    public final void getAllPackageGroup(@NotNull MrtrPostpaidValidateSimBarcodeResponse validateBarcodeResponse) {
        Intrinsics.checkNotNullParameter(validateBarcodeResponse, "validateBarcodeResponse");
        boolean isUserLan = this.f105665b.isUserLan();
        if (isUserLan) {
            getAllPackageGroupBranded(validateBarcodeResponse);
        } else if (!isUserLan) {
            getAllPackageGroupRetailer(validateBarcodeResponse, false);
        }
    }

    public final void getAllPackageGroupBranded(@NotNull MrtrPostpaidValidateSimBarcodeResponse validateBarcodeResponse) {
        String str;
        Intrinsics.checkNotNullParameter(validateBarcodeResponse, "validateBarcodeResponse");
        ESimRepository eSimRepository = this.f105665b;
        String userLan = this.f105665b.getUserLan();
        String userCode = this.f105665b.getUserCode();
        String companyCode = validateBarcodeResponse.getCompanyCode();
        String subscriberNumber = validateBarcodeResponse.getSubscriberNumber();
        String telephoneType = validateBarcodeResponse.getTelephoneType();
        String customerNumber = validateBarcodeResponse.getCustomerNumber();
        boolean isWithContract = isWithContract();
        if (isWithContract) {
            str = this.f105665b.getImie();
        } else if (!isWithContract) {
            str = "";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Single<R> compose = eSimRepository.allPackageGroupBranded(new MrtrBrandedAllPackageGroupRequest(userLan, userCode, companyCode, subscriberNumber, telephoneType, customerNumber, str, validateBarcodeResponse.getPackageGroupType(), validateBarcodeResponse.getMinPrice(), this.f105665b.getNewIdFlag())).compose(this.f105667d.applySingleAsync());
        final ESimPostpaidPackagesViewModel$getAllPackageGroupBranded$1 eSimPostpaidPackagesViewModel$getAllPackageGroupBranded$1 = new ESimPostpaidPackagesViewModel$getAllPackageGroupBranded$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: KO
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ESimPostpaidPackagesViewModel.m2885k(eSimPostpaidPackagesViewModel$getAllPackageGroupBranded$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getAllPackageGroupBr… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new ESimPostpaidPackagesViewModel$getAllPackageGroupBranded$2(this), new ESimPostpaidPackagesViewModel$getAllPackageGroupBranded$3(this)), this.f105669f);
    }

    public final void getAllPackageGroupRetailer(@NotNull MrtrPostpaidValidateSimBarcodeResponse validateBarcodeResponse, boolean z) {
        Intrinsics.checkNotNullParameter(validateBarcodeResponse, "validateBarcodeResponse");
        Single<R> compose = this.f105665b.allPackageGroupRetailer(new MrtrRetailerAllPackageGroupRequest(validateBarcodeResponse.getSimType(), validateBarcodeResponse.getPackageGroupCode(), this.f105665b.isWithContract(), validateBarcodeResponse.getMinPrice(), null, 16, null)).compose(this.f105667d.applySingleAsync());
        final ESimPostpaidPackagesViewModel$getAllPackageGroupRetailer$1 eSimPostpaidPackagesViewModel$getAllPackageGroupRetailer$1 = new ESimPostpaidPackagesViewModel$getAllPackageGroupRetailer$1(z, this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: JO
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ESimPostpaidPackagesViewModel.m2884l(eSimPostpaidPackagesViewModel$getAllPackageGroupRetailer$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getAllPackageGroupRe… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new ESimPostpaidPackagesViewModel$getAllPackageGroupRetailer$2(this), new ESimPostpaidPackagesViewModel$getAllPackageGroupRetailer$3(this, z)), this.f105669f);
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f105669f;
    }

    @NotNull
    public final LiveData<Resource<PostpaidPackageSetResponse>> getGetAllPackageGroupRetailerResponse() {
        return this.f105681r;
    }

    @NotNull
    public final LiveData<Resource<PackageSet>> getGetPackageDetailRetailerResponse() {
        return this.f105687x;
    }

    @NotNull
    public final LiveData<Resource<MrtrBrandedSearchPackageGroupResponse>> getGetSearchPackageGroupBrandedResponse() {
        return this.f105677n;
    }

    @NotNull
    public final LiveData<Resource<PostpaidSearchPackage>> getGetSearchPackageRetailerResponse() {
        return this.f105679p;
    }

    @NotNull
    public final LiveData<Resource<PackageGroupCodeResponse>> getGetValidatePackageGroupCodeResponse() {
        return this.f105689z;
    }

    @NotNull
    public final LiveData<Resource<MrtrBrandedViewAllPackageGroupResponse>> getGetViewAllPackageGroupBrandedResponse() {
        return this.f105675l;
    }

    @Nullable
    public final Package getMPackage() {
        return this.f105665b.getMPackage();
    }

    @NotNull
    public final LiveData<Event<Unit>> getNavigateGoNext() {
        return this.f105685v;
    }

    @NotNull
    public final LiveData<Event<FragmentNavEvent>> getNavigateNext() {
        return this.f105673j;
    }

    @Nullable
    public final PackageGroupCodeResponse getPackageGroupCodeResponse() {
        return this.f105665b.getPackageGroupCodeResponse();
    }

    @Nullable
    public final PackageSet getPackageSetRetailer() {
        return this.f105665b.getPackageSetRetailer();
    }

    @Nullable
    public final PostpaidPackageSetResponse getPostpaidPackageSetRetailerResponse() {
        return this.f105665b.getPostpaidPackageSetRetailerResponse();
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getRefreshPackage() {
        return this.f105683t;
    }

    public final void getSearchPackageGroupBranded(@NotNull String keyword) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Single<R> compose = this.f105665b.searchPackageGroupBranded(new MrtrBrandedSearchPackageGroupRequest(this.f105665b.getPackageGroupRefNo(), keyword)).compose(this.f105667d.applySingleAsync());
        final ESimPostpaidPackagesViewModel$getSearchPackageGroupBranded$1 eSimPostpaidPackagesViewModel$getSearchPackageGroupBranded$1 = new ESimPostpaidPackagesViewModel$getSearchPackageGroupBranded$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: LO
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ESimPostpaidPackagesViewModel.m2883m(eSimPostpaidPackagesViewModel$getSearchPackageGroupBranded$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getSearchPackageGrou… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new ESimPostpaidPackagesViewModel$getSearchPackageGroupBranded$2(this), new ESimPostpaidPackagesViewModel$getSearchPackageGroupBranded$3(this)), this.f105669f);
    }

    @NotNull
    public final LiveData<Resource<ErrorCollection>> getShowErrorMessage() {
        return this.f105671h;
    }

    @NotNull
    public final String getSimBarcode() {
        return this.f105665b.getSimBarcode();
    }

    @Nullable
    public final MrtrPostpaidValidateSimBarcodeResponse getValidateSimBarcodeResponse() {
        return this.f105665b.getValidateSimBarcodeResponse();
    }

    public final void getViewAllPackageGroupBranded(@NotNull String packageGroupRefNo, boolean z) {
        Intrinsics.checkNotNullParameter(packageGroupRefNo, "packageGroupRefNo");
        Single<R> compose = this.f105665b.viewAllPackageGroupBranded(new MrtrBrandedViewAllPackageGroupRequest(packageGroupRefNo)).compose(this.f105667d.applySingleAsync());
        final ESimPostpaidPackagesViewModel$getViewAllPackageGroupBranded$1 eSimPostpaidPackagesViewModel$getViewAllPackageGroupBranded$1 = new ESimPostpaidPackagesViewModel$getViewAllPackageGroupBranded$1(z, this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: HO
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ESimPostpaidPackagesViewModel.m2882n(eSimPostpaidPackagesViewModel$getViewAllPackageGroupBranded$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getViewAllPackageGro… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new ESimPostpaidPackagesViewModel$getViewAllPackageGroupBranded$2(this), new ESimPostpaidPackagesViewModel$getViewAllPackageGroupBranded$3(this, z)), this.f105669f);
    }

    public final boolean isDefaultPackage() {
        String packageGroupCode;
        MrtrPostpaidValidateSimBarcodeResponse validateSimBarcodeResponse = this.f105665b.getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse == null || (packageGroupCode = validateSimBarcodeResponse.getPackageGroupCode()) == null || packageGroupCode.length() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean isDefaultPackageRetailer() {
        return this.f105665b.isDefaultPackage();
    }

    public final boolean isUserLan() {
        return this.f105665b.isUserLan();
    }

    public final boolean isWithContract() {
        return this.f105665b.isWithContract();
    }

    public final void navigateNext() {
        getLiveDataState().setValue(StatusResource.DISMISS);
        boolean isUserLan = this.f105665b.isUserLan();
        StringBuilder sb = new StringBuilder();
        sb.append("navigateNext: isUserLan = ");
        sb.append(isUserLan);
        boolean isUserLan2 = this.f105665b.isUserLan();
        if (isUserLan2) {
            boolean isDefaultPackage = isDefaultPackage();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("navigateNext: isDefaultPackage = ");
            sb2.append(isDefaultPackage);
            if (isDefaultPackage()) {
                m2879q().setValue(new Event(new FragmentNavEvent(ESimPostpaidDxDefaultPackageFragment.class, null, null, 4, null)));
            } else {
                m2879q().setValue(new Event(new FragmentNavEvent(ESimPostpaidDxAllPackageFragment.class, null, null, 4, null)));
            }
        } else if (!isUserLan2) {
            boolean isDefaultPackage2 = isDefaultPackage();
            boolean isDefaultPackageRetailer = isDefaultPackageRetailer();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("navigateNext: isDefaultPackage = ");
            sb3.append(isDefaultPackage2);
            sb3.append(", isDefaultPackageRetailer = ");
            sb3.append(isDefaultPackageRetailer);
            if (isDefaultPackage() && isDefaultPackageRetailer()) {
                m2879q().setValue(new Event(new FragmentNavEvent(ESimPostpaidDefaultPackageFragment.class, null, null, 4, null)));
            } else {
                m2879q().setValue(new Event(new FragmentNavEvent(ESimPostpaidAllPackageFragment.class, null, null, 4, null)));
            }
        }
    }

    /* renamed from: o */
    public final MutableLiveData m2881o() {
        return (MutableLiveData) this.f105680q.getValue();
    }

    /* renamed from: p */
    public final MutableLiveData m2880p() {
        return (MutableLiveData) this.f105684u.getValue();
    }

    public final void refreshPackage(@NotNull MrtrPostpaidValidateSimBarcodeResponse validateBarcodeResponse) {
        Intrinsics.checkNotNullParameter(validateBarcodeResponse, "validateBarcodeResponse");
        boolean isUserLan = this.f105665b.isUserLan();
        if (isUserLan) {
            getViewAllPackageGroupBranded(this.f105665b.getPackageGroupRefNo(), true);
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
        ESimRepository eSimRepository = this.f105665b;
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
        Boolean valueOf = Boolean.valueOf(this.f105665b.isWithDevice());
        MrtrPostpaidValidateSimBarcodeResponse validateSimBarcodeResponse3 = getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse3 == null || (minPrice = validateSimBarcodeResponse3.getMinPrice()) == null) {
            str3 = "";
        } else {
            str3 = minPrice;
        }
        Single<PostpaidSearchPackage> searchPackageGroupRetailer = eSimRepository.searchPackageGroupRetailer(new MrtrRetailerRequestSearchPackage(keyword, str, str2, valueOf, str3, "POSTPAID"));
        final ESimPostpaidPackagesViewModel$searchPackageGroupRetailer$1 eSimPostpaidPackagesViewModel$searchPackageGroupRetailer$1 = new ESimPostpaidPackagesViewModel$searchPackageGroupRetailer$1(this);
        Single compose = searchPackageGroupRetailer.map(new Function() { // from class: EO
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                PostpaidSearchPackage m2898B;
                m2898B = ESimPostpaidPackagesViewModel.m2898B(eSimPostpaidPackagesViewModel$searchPackageGroupRetailer$1, obj);
                return m2898B;
            }
        }).compose(this.f105667d.applySingleAsync());
        final ESimPostpaidPackagesViewModel$searchPackageGroupRetailer$2 eSimPostpaidPackagesViewModel$searchPackageGroupRetailer$2 = new ESimPostpaidPackagesViewModel$searchPackageGroupRetailer$2(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: FO
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ESimPostpaidPackagesViewModel.m2897C(eSimPostpaidPackagesViewModel$searchPackageGroupRetailer$2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun searchPackageGroupRe… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new ESimPostpaidPackagesViewModel$searchPackageGroupRetailer$3(this), new ESimPostpaidPackagesViewModel$searchPackageGroupRetailer$4(this)), this.f105669f);
    }

    public final void setDefaultPackageRetailer(boolean z) {
        this.f105665b.setDefaultPackage(z);
    }

    public final void setMPackage(@Nullable Package r2) {
        this.f105665b.setMPackage(r2);
    }

    public final void setPackageGroupCodeResponse(@Nullable PackageGroupCodeResponse packageGroupCodeResponse) {
        this.f105665b.setPackageGroupCodeResponse(packageGroupCodeResponse);
    }

    public final void setPackageSetRetailer(@Nullable PackageSet packageSet) {
        this.f105665b.setPackageSetRetailer(packageSet);
    }

    public final void setPostpaidPackageSetRetailerResponse(@Nullable PostpaidPackageSetResponse postpaidPackageSetResponse) {
        this.f105665b.setPostpaidPackageSetRetailerResponse(postpaidPackageSetResponse);
    }

    public final void setSimBarcode(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f105665b.setSimBarcode(value);
    }

    public final void setValidateSimBarcodeResponse(@Nullable MrtrPostpaidValidateSimBarcodeResponse mrtrPostpaidValidateSimBarcodeResponse) {
        this.f105665b.setValidateSimBarcodeResponse(mrtrPostpaidValidateSimBarcodeResponse);
    }

    public final void setWithContract(boolean z) {
        this.f105665b.setWithContract(z);
    }

    /* renamed from: u */
    public final MutableLiveData m2875u() {
        return (MutableLiveData) this.f105678o.getValue();
    }

    public final void validatePackageGroupCode(@NotNull PackageSet pack) {
        String str;
        String str2;
        GetNewIMEIResponse hardwareNumberResponse;
        String hardwareNumber;
        Intrinsics.checkNotNullParameter(pack, "pack");
        ESimRepository eSimRepository = this.f105665b;
        String userCode = this.f105665b.getUserCode();
        MrtrPostpaidValidateSimBarcodeResponse validateSimBarcodeResponse = getValidateSimBarcodeResponse();
        Boolean bool = null;
        if (validateSimBarcodeResponse != null) {
            str = validateSimBarcodeResponse.getSubscriberNumber();
        } else {
            str = null;
        }
        GetNewIMEIResponse hardwareNumberResponse2 = this.f105665b.getHardwareNumberResponse();
        if (hardwareNumberResponse2 != null) {
            bool = Boolean.valueOf(hardwareNumberResponse2.isDtacDevice());
        }
        if (!Intrinsics.areEqual(bool, Boolean.TRUE) || (hardwareNumberResponse = this.f105665b.getHardwareNumberResponse()) == null || (hardwareNumber = hardwareNumberResponse.getHardwareNumber()) == null) {
            str2 = "";
        } else {
            str2 = hardwareNumber;
        }
        String packageCode = pack.getPackageCode();
        MrtrPostpaidValidateSimBarcodeResponse validateSimBarcodeResponse2 = getValidateSimBarcodeResponse();
        Single<R> compose = eSimRepository.validatePackageGroupCode(new PackageGroupCodeRequest(userCode, str, str2, packageCode, (validateSimBarcodeResponse2 == null || (r1 = validateSimBarcodeResponse2.getPackageGroupType()) == null) ? "10" : "10")).compose(this.f105667d.applySingleAsync());
        final ESimPostpaidPackagesViewModel$validatePackageGroupCode$1 eSimPostpaidPackagesViewModel$validatePackageGroupCode$1 = new ESimPostpaidPackagesViewModel$validatePackageGroupCode$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: GO
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ESimPostpaidPackagesViewModel.m2895E(eSimPostpaidPackagesViewModel$validatePackageGroupCode$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun validatePackageGroup… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new ESimPostpaidPackagesViewModel$validatePackageGroupCode$2(this), new ESimPostpaidPackagesViewModel$validatePackageGroupCode$3(this, pack)), this.f105669f);
    }

    /* renamed from: y */
    public final boolean m2871y(PostpaidSearchPackage postpaidSearchPackage) {
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

    /* renamed from: z */
    public final boolean m2870z(PostpaidSearchPackage postpaidSearchPackage) {
        PostpaidSearchPackagePaginate paginate = postpaidSearchPackage.getPaginate();
        if (paginate == null || paginate.getTotalItem() != 0) {
            return false;
        }
        return true;
    }
}