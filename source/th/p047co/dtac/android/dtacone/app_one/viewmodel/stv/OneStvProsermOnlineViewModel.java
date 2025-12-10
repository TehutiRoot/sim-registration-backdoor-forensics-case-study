package th.p047co.dtac.android.dtacone.app_one.viewmodel.stv;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.model.stv.BalanceResponse;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneCurrentPackagesRequest;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneCurrentPackagesResponse;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvGroupListCollection;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvPackageCollection;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvRecommendPackageRequest;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvRecommendPackageResp;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvRecommendPackageResponse;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvSubmitCollection;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvSubmitTrueRequest;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneSubmitProsermRecommendReq;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneSubmitSTVProsermResponse;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneTrueRecommendPackageAdditionalResponse;
import th.p047co.dtac.android.dtacone.app_one.model.stv.PackagesItem;
import th.p047co.dtac.android.dtacone.app_one.model.stv.UpdateInterestRecommendRequest;
import th.p047co.dtac.android.dtacone.app_one.repository.OneStvRepository;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.manager.security.OneSecurePin;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.Version;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpCheckSubscriberDataResponse;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpCheckSubscriberRequest;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpGetMainBalanceDataResponse;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpGetMainBalanceRequest;
import th.p047co.dtac.android.dtacone.model.appOne.topup.trueCompany.OneTopUpGetMainBalanceTrueCompanyDataResponse;
import th.p047co.dtac.android.dtacone.model.appOne.topup.trueCompany.OneTopUpGetMainBalanceTrueCompanyRequest;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolConsent;
import th.p047co.dtac.android.dtacone.model.customerenquiry.RequestKt;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.stv.StvOffer;
import th.p047co.dtac.android.dtacone.model.topup.offer.TopupOfferResponse;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.home.HomeRepository;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.OneBuyDolPriceListSimRModel;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.request.OneBuyDolAcceptConsentRequest;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolBankResponse;
import th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.model.ThemeColorModel;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0018¢\u0006\u0004\b+\u0010#J\r\u0010,\u001a\u00020\u0018¢\u0006\u0004\b,\u0010#J\u0019\u0010.\u001a\u00020\u00182\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b.\u0010\u001aJ\u0015\u0010/\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b/\u0010\u001aJ\r\u00100\u001a\u00020\u0018¢\u0006\u0004\b0\u0010#J\u0019\u00101\u001a\u00020\u00182\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b1\u0010\u001aJ5\u00107\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u0016¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0018¢\u0006\u0004\b9\u0010#J\r\u0010:\u001a\u00020\u0018¢\u0006\u0004\b:\u0010#J\u0017\u0010<\u001a\u00020\u00182\b\u0010;\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b<\u0010\u001aJ\u0015\u0010>\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u0016¢\u0006\u0004\b>\u0010\u001aJ+\u0010D\u001a\u00020\u00182\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010B\u001a\u00020A2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u0016¢\u0006\u0004\bF\u0010\u001aJ\r\u0010G\u001a\u00020\u0018¢\u0006\u0004\bG\u0010#J\u0015\u0010I\u001a\u00020\u00182\u0006\u0010H\u001a\u00020\u0016¢\u0006\u0004\bI\u0010\u001aJ\u001f\u0010K\u001a\u00020\u00182\u0006\u0010H\u001a\u00020\u00162\b\u0010J\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\bK\u0010LJ\u0015\u0010M\u001a\u00020\u00182\u0006\u0010H\u001a\u00020\u0016¢\u0006\u0004\bM\u0010\u001aJ\r\u0010N\u001a\u00020\u0016¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\u0018¢\u0006\u0004\bP\u0010#J\u000f\u0010Q\u001a\u00020\u0018H\u0014¢\u0006\u0004\bQ\u0010#J\r\u0010R\u001a\u00020\u0018¢\u0006\u0004\bR\u0010#J\u001d\u0010U\u001a\u00020\u00182\u0006\u0010S\u001a\u00020?2\u0006\u0010T\u001a\u00020?¢\u0006\u0004\bU\u0010VR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR'\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0n0m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR#\u0010x\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0n0m8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010sR'\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020y0n0m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010q\u001a\u0004\b{\u0010sR#\u0010\u007f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020y0n0m8\u0006¢\u0006\f\n\u0004\b}\u0010v\u001a\u0004\b~\u0010sR8\u0010\u0084\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020y\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00010n0m8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010q\u001a\u0005\b\u0083\u0001\u0010sR4\u0010\u0087\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020y\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00010n0m8\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010v\u001a\u0005\b\u0086\u0001\u0010sR*\u0010\u008a\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160n0m8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010q\u001a\u0005\b\u0089\u0001\u0010sR&\u0010\u008d\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160n0m8\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010v\u001a\u0005\b\u008c\u0001\u0010sR+\u0010\u0091\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008e\u00010n0m8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010q\u001a\u0005\b\u0090\u0001\u0010sR*\u0010\u0097\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008e\u00010n0\u0092\u00018\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R*\u0010\u009a\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0n0m8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010q\u001a\u0005\b\u0099\u0001\u0010sR)\u0010\u009d\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0n0\u0092\u00018\u0006¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u0094\u0001\u001a\u0006\b\u009c\u0001\u0010\u0096\u0001R+\u0010¡\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009e\u00010n0m8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010q\u001a\u0005\b \u0001\u0010sR*\u0010¤\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009e\u00010n0\u0092\u00018\u0006¢\u0006\u0010\n\u0006\b¢\u0001\u0010\u0094\u0001\u001a\u0006\b£\u0001\u0010\u0096\u0001R+\u0010§\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009e\u00010n0m8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¥\u0001\u0010q\u001a\u0005\b¦\u0001\u0010sR*\u0010ª\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009e\u00010n0\u0092\u00018\u0006¢\u0006\u0010\n\u0006\b¨\u0001\u0010\u0094\u0001\u001a\u0006\b©\u0001\u0010\u0096\u0001R+\u0010®\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030«\u00010n0m8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b¬\u0001\u0010q\u001a\u0005\b\u00ad\u0001\u0010sR*\u0010±\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030«\u00010n0\u0092\u00018\u0006¢\u0006\u0010\n\u0006\b¯\u0001\u0010\u0094\u0001\u001a\u0006\b°\u0001\u0010\u0096\u0001R0\u0010·\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010²\u00010m8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b³\u0001\u0010v\u001a\u0005\b´\u0001\u0010s\"\u0006\bµ\u0001\u0010¶\u0001R0\u0010¼\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010¸\u00010m8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b¹\u0001\u0010v\u001a\u0005\bº\u0001\u0010s\"\u0006\b»\u0001\u0010¶\u0001R/\u0010À\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160m8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b½\u0001\u0010v\u001a\u0005\b¾\u0001\u0010s\"\u0006\b¿\u0001\u0010¶\u0001R0\u0010Å\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010Á\u00010m8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bÂ\u0001\u0010v\u001a\u0005\bÃ\u0001\u0010s\"\u0006\bÄ\u0001\u0010¶\u0001R/\u0010É\u0001\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010m8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bÆ\u0001\u0010v\u001a\u0005\bÇ\u0001\u0010s\"\u0006\bÈ\u0001\u0010¶\u0001R-\u0010Í\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160m8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bÊ\u0001\u0010v\u001a\u0005\bË\u0001\u0010s\"\u0006\bÌ\u0001\u0010¶\u0001R-\u0010Ñ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160m8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bÎ\u0001\u0010v\u001a\u0005\bÏ\u0001\u0010s\"\u0006\bÐ\u0001\u0010¶\u0001R!\u0010Ô\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010Ò\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÓ\u0001\u0010vR/\u0010Ø\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160m8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bÕ\u0001\u0010v\u001a\u0005\bÖ\u0001\u0010s\"\u0006\b×\u0001\u0010¶\u0001R \u0010Ú\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160m8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÙ\u0001\u0010vR0\u0010ß\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010Û\u00010m8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bÜ\u0001\u0010v\u001a\u0005\bÝ\u0001\u0010s\"\u0006\bÞ\u0001\u0010¶\u0001R:\u0010ã\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?0\u0080\u00010m8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bà\u0001\u0010v\u001a\u0005\bá\u0001\u0010s\"\u0006\bâ\u0001\u0010¶\u0001R8\u0010ç\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0005\u0012\u00030ä\u0001\u0012\u0004\u0012\u00020\u00160\u0080\u00010n0m8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bå\u0001\u0010q\u001a\u0005\bæ\u0001\u0010sR7\u0010ê\u0001\u001a\u001d\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0005\u0012\u00030ä\u0001\u0012\u0004\u0012\u00020\u00160\u0080\u00010n0\u0092\u00018\u0006¢\u0006\u0010\n\u0006\bè\u0001\u0010\u0094\u0001\u001a\u0006\bé\u0001\u0010\u0096\u0001R8\u0010î\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0005\u0012\u00030ë\u00010\u0080\u00010n0m8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bì\u0001\u0010q\u001a\u0005\bí\u0001\u0010sR7\u0010ñ\u0001\u001a\u001d\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0005\u0012\u00030ë\u00010\u0080\u00010n0\u0092\u00018\u0006¢\u0006\u0010\n\u0006\bï\u0001\u0010\u0094\u0001\u001a\u0006\bð\u0001\u0010\u0096\u0001R*\u0010ô\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160n0m8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bò\u0001\u0010q\u001a\u0005\bó\u0001\u0010sR)\u0010÷\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160n0\u0092\u00018\u0006¢\u0006\u0010\n\u0006\bõ\u0001\u0010\u0094\u0001\u001a\u0006\bö\u0001\u0010\u0096\u0001R+\u0010û\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ø\u00010n0m8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\bù\u0001\u0010q\u001a\u0005\bú\u0001\u0010sR*\u0010þ\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ø\u00010n0\u0092\u00018\u0006¢\u0006\u0010\n\u0006\bü\u0001\u0010\u0094\u0001\u001a\u0006\bý\u0001\u0010\u0096\u0001R*\u0010\u0081\u0002\u001a\u00030Û\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÿ\u0001\u0010\u0080\u0002\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002\"\u0006\b\u0083\u0002\u0010\u0084\u0002R*\u0010\u0088\u0002\u001a\u00030Û\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0085\u0002\u0010\u0080\u0002\u001a\u0006\b\u0086\u0002\u0010\u0082\u0002\"\u0006\b\u0087\u0002\u0010\u0084\u0002R:\u0010\u008b\u0002\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0007\u0012\u0005\u0018\u00010\u0089\u00020\u0080\u00010n0m8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0080\u0002\u0010q\u001a\u0005\b\u008a\u0002\u0010sR6\u0010\u008e\u0002\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0007\u0012\u0005\u0018\u00010\u0089\u00020\u0080\u00010n0m8\u0006¢\u0006\u000e\n\u0005\b\u008c\u0002\u0010v\u001a\u0005\b\u008d\u0002\u0010sR+\u0010\u0092\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008f\u00020n0m8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0090\u0002\u0010q\u001a\u0005\b\u0091\u0002\u0010sR'\u0010\u0095\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008f\u00020n0m8\u0006¢\u0006\u000e\n\u0005\b\u0093\u0002\u0010v\u001a\u0005\b\u0094\u0002\u0010sR+\u0010\u0099\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0096\u00020n0m8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0097\u0002\u0010q\u001a\u0005\b\u0098\u0002\u0010sR'\u0010\u009c\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0096\u00020n0m8\u0006¢\u0006\u000e\n\u0005\b\u009a\u0002\u0010v\u001a\u0005\b\u009b\u0002\u0010sR!\u0010\u009f\u0002\u001a\t\u0012\u0005\u0012\u00030\u009d\u00020m8\u0006¢\u0006\u000e\n\u0005\b\u009e\u0002\u0010v\u001a\u0005\b\u009f\u0002\u0010sR9\u0010¢\u0002\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0013\u0012\u0011\u0012\u0005\u0012\u00030Û\u0001\u0012\u0005\u0012\u00030\u008e\u00010\u0080\u00010n0m8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b \u0002\u0010q\u001a\u0005\b¡\u0002\u0010sR8\u0010¥\u0002\u001a\u001e\u0012\u0019\u0012\u0017\u0012\u0013\u0012\u0011\u0012\u0005\u0012\u00030Û\u0001\u0012\u0005\u0012\u00030\u008e\u00010\u0080\u00010n0\u0092\u00018\u0006¢\u0006\u0010\n\u0006\b£\u0002\u0010\u0094\u0001\u001a\u0006\b¤\u0002\u0010\u0096\u0001R\u0018\u0010¦\u0002\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010Ê\u0001R\u0019\u0010¨\u0002\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0002\u0010Ê\u0001R0\u0010¯\u0002\u001a\u0005\u0018\u00010©\u00022\n\u0010ª\u0002\u001a\u0005\u0018\u00010©\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b«\u0002\u0010¬\u0002\"\u0006\b\u00ad\u0002\u0010®\u0002R\u0013\u0010±\u0002\u001a\u00020\u00168F¢\u0006\u0007\u001a\u0005\b°\u0002\u0010OR+\u0010H\u001a\u0004\u0018\u00010\u00162\t\u0010ª\u0002\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b²\u0002\u0010O\"\u0005\b³\u0002\u0010\u001aR+\u0010-\u001a\u0004\u0018\u00010\u00162\t\u0010ª\u0002\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b´\u0002\u0010O\"\u0005\bµ\u0002\u0010\u001aR\u001b\u0010¹\u0002\u001a\t\u0012\u0004\u0012\u00020\u00160¶\u00028F¢\u0006\b\u001a\u0006\b·\u0002\u0010¸\u0002R\u001c\u0010¼\u0002\u001a\u000b º\u0002*\u0004\u0018\u00010\u00160\u00168F¢\u0006\u0007\u001a\u0005\b»\u0002\u0010OR\u0015\u0010À\u0002\u001a\u00030½\u00028F¢\u0006\b\u001a\u0006\b¾\u0002\u0010¿\u0002¨\u0006Á\u0002"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/viewmodel/stv/OneStvProsermOnlineViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/app_one/repository/OneStvRepository;", "repository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "oneErrorService", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "pfViewModel", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "errorService", "Lth/co/dtac/android/dtacone/manager/service/UdidService;", "udidService", "Lth/co/dtac/android/dtacone/repository/home/HomeRepository;", "homeRepository", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "rtrRx2Repository", "<init>", "(Lth/co/dtac/android/dtacone/app_one/repository/OneStvRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;Lth/co/dtac/android/dtacone/manager/service/UdidService;Lth/co/dtac/android/dtacone/repository/home/HomeRepository;Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;)V", "", "mobileNumber", "", "i0", "(Ljava/lang/String;)V", "m0", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvSubmitCollection;", "r0", "()Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvSubmitCollection;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvSubmitTrueRequest;", "w0", "()Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvSubmitTrueRequest;", "R0", "()V", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitSTVProsermResponse;", "response", "O0", "(Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitSTVProsermResponse;)V", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitProsermRecommendReq;", "s0", "()Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitProsermRecommendReq;", "callBalance", "getSimRList", "subscriberGroup", "callGetSTVPackages", "getProsermRecommend", "callBalanceTrueCompany", "callGetSTVPackagesTrueCompany", "subscriber", "poqItemId", "transactionRefId", "categoryId", "poqItemProductOfferingId", "updateInterestRecommendForTrue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "submit", "submitProsermRecommend", "customerMobile", "callCurrentPackages", "featureCode", "getBuyDOLConsentByFeatureName", "", "mrtrConsentId", "Lth/co/dtac/android/dtacone/model/Version;", ClientCookie.VERSION_ATTR, "feature", "acceptBuyDOLConsent", "(Ljava/lang/Integer;Lth/co/dtac/android/dtacone/model/Version;Ljava/lang/String;)V", "getPriceList", "getBuyDolBankList", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "checkSubscriberPrepaid", "customerNumber", "getMainBalance", "(Ljava/lang/String;Ljava/lang/String;)V", "getMainBalanceTrueCompany", "getSimR", "()Ljava/lang/String;", "clearModel", "onCleared", "clearSelectedPackData", "position", "rowPosition", "updateSTVPackageItem", "(II)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/repository/OneStvRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "d", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "e", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", OperatorName.CLOSE_PATH, "Lth/co/dtac/android/dtacone/manager/service/UdidService;", "i", "Lth/co/dtac/android/dtacone/repository/home/HomeRepository;", OperatorName.SET_LINE_JOINSTYLE, "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.NON_STROKING_CMYK, "Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvGroupListCollection;", OperatorName.LINE_TO, "Lkotlin/Lazy;", "L0", "()Landroidx/lifecycle/MutableLiveData;", "_stvGroupListCollection", OperatorName.MOVE_TO, "Landroidx/lifecycle/MutableLiveData;", "getStvGroupListCollection", "stvGroupListCollection", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResponse;", OperatorName.ENDPATH, "M0", "_stvRecommendPackages", "o", "getStvRecommendPackages", "stvRecommendPackages", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneTrueRecommendPackageAdditionalResponse;", "p", "H0", "_recommendPackagesAndPackAdditionalTrueCompany", OperatorName.SAVE, "getRecommendPackagesAndPackAdditionalTrueCompany", "recommendPackagesAndPackAdditionalTrueCompany", PDPageLabelRange.STYLE_ROMAN_LOWER, "K0", "_showErrorStv", OperatorName.CLOSE_AND_STROKE, "getShowErrorStv", "showErrorStv", "Lth/co/dtac/android/dtacone/app_one/model/stv/BalanceResponse;", "t", "C0", "_getBalanceResponse", "Landroidx/lifecycle/LiveData;", "u", "Landroidx/lifecycle/LiveData;", "getGetBalanceResponse", "()Landroidx/lifecycle/LiveData;", "getBalanceResponse", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "N0", "_submitSuccess", OperatorName.SET_LINE_WIDTH, "getSubmitSuccess", "submitSuccess", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "x", "J0", "_showDialogError", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getShowDialogError", "showDialogError", "z", "I0", "_showDialogDuplicateStv", "A", "getShowDialogDuplicateStv", "showDialogDuplicateStv", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneCurrentPackagesResponse;", "B", "A0", "_currentPackages", "C", "getCurrentPackages", "currentPackages", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;", "D", "getSelectedStvPackage", "setSelectedStvPackage", "(Landroidx/lifecycle/MutableLiveData;)V", "selectedStvPackage", "Lth/co/dtac/android/dtacone/app_one/model/stv/PackagesItem;", ExifInterface.LONGITUDE_EAST, "getSelectedStvPackageForTrue", "setSelectedStvPackageForTrue", "selectedStvPackageForTrue", "F", "getTransactionRefIdRecommendForTrue", "setTransactionRefIdRecommendForTrue", "transactionRefIdRecommendForTrue", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneSubmitProsermRecommendReq$OneProsermRecommendInfo;", OperatorName.STROKING_COLOR_GRAY, "getRecommendPack", "setRecommendPack", "recommendPack", "H", "getSpeed", "setSpeed", "speed", "I", "getTransactionIdSift", "setTransactionIdSift", "transactionIdSift", OperatorName.SET_LINE_CAPSTYLE, "getSecurePin", "setSecurePin", "securePin", "Lth/co/dtac/android/dtacone/model/topup/offer/TopupOfferResponse;", "K", "offerResponse", "L", "getConfirmMultiTrans", "setConfirmMultiTrans", "confirmMultiTrans", "M", "ipkCode", "", "N", "getClearSelectedPackLiveData", "setClearSelectedPackLiveData", "clearSelectedPackLiveData", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getUpdateSelectedPackLiveData", "setUpdateSelectedPackLiveData", "updateSelectedPackLiveData", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolConsent;", "P", "B0", "_displayConsentLiveData", OperatorName.RESTORE, "getDisplayConsentLiveData", "displayConsentLiveData", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneBuyDolPriceListSimRModel;", "R", "G0", "_priceListLiveData", "S", "getPriceListLiveData", "priceListLiveData", "T", "x0", "_acceptOnConsentLiveData", PDBorderStyleDictionary.STYLE_UNDERLINE, "getAcceptOnConsentLiveData", "acceptOnConsentLiveData", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolBankResponse;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "y0", "_bankListLiveData", "W", "getBankListLiveData", "bankListLiveData", "X", "Z", "isRefresh", "()Z", "setRefresh", "(Z)V", "Y", "getNeedToRefreshData", "setNeedToRefreshData", "needToRefreshData", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpCheckSubscriberDataResponse;", "z0", "_checkSubscriberPrepaidLiveData", "a0", "getCheckSubscriberPrepaidLiveData", "checkSubscriberPrepaidLiveData", "Lth/co/dtac/android/dtacone/model/appOne/topup/OneTopUpGetMainBalanceDataResponse;", "b0", "E0", "_mainBalanceLiveData", "c0", "getMainBalanceLiveData", "mainBalanceLiveData", "Lth/co/dtac/android/dtacone/model/appOne/topup/trueCompany/OneTopUpGetMainBalanceTrueCompanyDataResponse;", OperatorName.TYPE3_D0, "F0", "_mainBalanceTrueCompanyLiveData", "e0", "getMainBalanceTrueCompanyLiveData", "mainBalanceTrueCompanyLiveData", "Lth/co/dtac/android/dtacone/model/StatusResource;", "f0", "isRefreshing", "g0", "D0", "_getBalanceTrueCompanyLiveData", "h0", "getGetBalanceTrueCompanyLiveData", "getBalanceTrueCompanyLiveData", "loopTransaction", "j0", "maxLoopTransaction", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;", "value", "getPackageResp", "()Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;", "setPackageResp", "(Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageResp;)V", "packageResp", "getSimRNumberDisplay", "simRNumberDisplay", "getSubscriberNumber", "setSubscriberNumber", "getSubscriberGroup", "setSubscriberGroup", "", "getPermissions", "()Ljava/util/List;", "permissions", "kotlin.jvm.PlatformType", "getCompany", "company", "Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/model/ThemeColorModel;", "getThemeColorModel", "()Lth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/model/ThemeColorModel;", "themeColorModel", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel */
/* loaded from: classes7.dex */
public final class OneStvProsermOnlineViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: A */
    public final LiveData f82654A;

    /* renamed from: B */
    public final Lazy f82655B;

    /* renamed from: C */
    public final LiveData f82656C;

    /* renamed from: D */
    public MutableLiveData f82657D;

    /* renamed from: E */
    public MutableLiveData f82658E;

    /* renamed from: F */
    public MutableLiveData f82659F;

    /* renamed from: G */
    public MutableLiveData f82660G;

    /* renamed from: H */
    public MutableLiveData f82661H;

    /* renamed from: I */
    public MutableLiveData f82662I;

    /* renamed from: J */
    public MutableLiveData f82663J;

    /* renamed from: K */
    public MutableLiveData f82664K;

    /* renamed from: L */
    public MutableLiveData f82665L;

    /* renamed from: M */
    public MutableLiveData f82666M;

    /* renamed from: N */
    public MutableLiveData f82667N;

    /* renamed from: O */
    public MutableLiveData f82668O;

    /* renamed from: P */
    public final Lazy f82669P;

    /* renamed from: Q */
    public final LiveData f82670Q;

    /* renamed from: R */
    public final Lazy f82671R;

    /* renamed from: S */
    public final LiveData f82672S;

    /* renamed from: T */
    public final Lazy f82673T;

    /* renamed from: U */
    public final LiveData f82674U;

    /* renamed from: V */
    public final Lazy f82675V;

    /* renamed from: W */
    public final LiveData f82676W;

    /* renamed from: X */
    public boolean f82677X;

    /* renamed from: Y */
    public boolean f82678Y;

    /* renamed from: Z */
    public final Lazy f82679Z;

    /* renamed from: a0 */
    public final MutableLiveData f82680a0;

    /* renamed from: b */
    public final OneStvRepository f82681b;

    /* renamed from: b0 */
    public final Lazy f82682b0;

    /* renamed from: c */
    public final Rx2ThreadService f82683c;

    /* renamed from: c0 */
    public final MutableLiveData f82684c0;

    /* renamed from: d */
    public final OneErrorService f82685d;

    /* renamed from: d0 */
    public final Lazy f82686d0;

    /* renamed from: e */
    public final ConfigurationRepository f82687e;

    /* renamed from: e0 */
    public final MutableLiveData f82688e0;

    /* renamed from: f */
    public PreferencesViewModel f82689f;

    /* renamed from: f0 */
    public final MutableLiveData f82690f0;

    /* renamed from: g */
    public final ServerErrorService f82691g;

    /* renamed from: g0 */
    public final Lazy f82692g0;

    /* renamed from: h */
    public final UdidService f82693h;

    /* renamed from: h0 */
    public final LiveData f82694h0;

    /* renamed from: i */
    public final HomeRepository f82695i;

    /* renamed from: i0 */
    public int f82696i0;

    /* renamed from: j */
    public final RtrRx2Repository f82697j;

    /* renamed from: j0 */
    public int f82698j0;

    /* renamed from: k */
    public final CompositeDisposable f82699k;

    /* renamed from: l */
    public final Lazy f82700l;

    /* renamed from: m */
    public final MutableLiveData f82701m;

    /* renamed from: n */
    public final Lazy f82702n;

    /* renamed from: o */
    public final MutableLiveData f82703o;

    /* renamed from: p */
    public final Lazy f82704p;

    /* renamed from: q */
    public final MutableLiveData f82705q;

    /* renamed from: r */
    public final Lazy f82706r;

    /* renamed from: s */
    public final MutableLiveData f82707s;

    /* renamed from: t */
    public final Lazy f82708t;

    /* renamed from: u */
    public final LiveData f82709u;

    /* renamed from: v */
    public final Lazy f82710v;

    /* renamed from: w */
    public final LiveData f82711w;

    /* renamed from: x */
    public final Lazy f82712x;

    /* renamed from: y */
    public final LiveData f82713y;

    /* renamed from: z */
    public final Lazy f82714z;

    @Inject
    public OneStvProsermOnlineViewModel(@NotNull OneStvRepository repository, @NotNull Rx2ThreadService threadService, @NotNull OneErrorService oneErrorService, @NotNull ConfigurationRepository configurationRepository, @NotNull PreferencesViewModel pfViewModel, @NotNull ServerErrorService errorService, @NotNull UdidService udidService, @NotNull HomeRepository homeRepository, @NotNull RtrRx2Repository rtrRx2Repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(oneErrorService, "oneErrorService");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(udidService, "udidService");
        Intrinsics.checkNotNullParameter(homeRepository, "homeRepository");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        this.f82681b = repository;
        this.f82683c = threadService;
        this.f82685d = oneErrorService;
        this.f82687e = configurationRepository;
        this.f82689f = pfViewModel;
        this.f82691g = errorService;
        this.f82693h = udidService;
        this.f82695i = homeRepository;
        this.f82697j = rtrRx2Repository;
        this.f82699k = new CompositeDisposable();
        this.f82700l = LazyKt__LazyJVMKt.lazy(OneStvProsermOnlineViewModel$_stvGroupListCollection$2.INSTANCE);
        this.f82701m = m19984L0();
        this.f82702n = LazyKt__LazyJVMKt.lazy(OneStvProsermOnlineViewModel$_stvRecommendPackages$2.INSTANCE);
        this.f82703o = m19982M0();
        this.f82704p = LazyKt__LazyJVMKt.lazy(C14160xd450bb4e.INSTANCE);
        this.f82705q = m19992H0();
        this.f82706r = LazyKt__LazyJVMKt.lazy(OneStvProsermOnlineViewModel$_showErrorStv$2.INSTANCE);
        this.f82707s = m19986K0();
        this.f82708t = LazyKt__LazyJVMKt.lazy(OneStvProsermOnlineViewModel$_getBalanceResponse$2.INSTANCE);
        this.f82709u = m20002C0();
        this.f82710v = LazyKt__LazyJVMKt.lazy(OneStvProsermOnlineViewModel$_submitSuccess$2.INSTANCE);
        this.f82711w = m19980N0();
        this.f82712x = LazyKt__LazyJVMKt.lazy(OneStvProsermOnlineViewModel$_showDialogError$2.INSTANCE);
        this.f82713y = m19988J0();
        this.f82714z = LazyKt__LazyJVMKt.lazy(OneStvProsermOnlineViewModel$_showDialogDuplicateStv$2.INSTANCE);
        this.f82654A = m19990I0();
        this.f82655B = LazyKt__LazyJVMKt.lazy(OneStvProsermOnlineViewModel$_currentPackages$2.INSTANCE);
        this.f82656C = m20006A0();
        this.f82657D = new MutableLiveData(null);
        this.f82658E = new MutableLiveData(null);
        this.f82659F = new MutableLiveData(null);
        this.f82660G = new MutableLiveData(null);
        this.f82661H = new MutableLiveData("");
        this.f82662I = new MutableLiveData("");
        this.f82663J = new MutableLiveData("");
        this.f82664K = new MutableLiveData(null);
        this.f82665L = new MutableLiveData("N");
        this.f82666M = new MutableLiveData(null);
        this.f82667N = new MutableLiveData(Boolean.FALSE);
        this.f82668O = new MutableLiveData();
        this.f82669P = LazyKt__LazyJVMKt.lazy(OneStvProsermOnlineViewModel$_displayConsentLiveData$2.INSTANCE);
        this.f82670Q = m20004B0();
        this.f82671R = LazyKt__LazyJVMKt.lazy(OneStvProsermOnlineViewModel$_priceListLiveData$2.INSTANCE);
        this.f82672S = m19994G0();
        this.f82673T = LazyKt__LazyJVMKt.lazy(OneStvProsermOnlineViewModel$_acceptOnConsentLiveData$2.INSTANCE);
        this.f82674U = m19914x0();
        this.f82675V = LazyKt__LazyJVMKt.lazy(OneStvProsermOnlineViewModel$_bankListLiveData$2.INSTANCE);
        this.f82676W = m19912y0();
        this.f82679Z = LazyKt__LazyJVMKt.lazy(OneStvProsermOnlineViewModel$_checkSubscriberPrepaidLiveData$2.INSTANCE);
        this.f82680a0 = m19910z0();
        this.f82682b0 = LazyKt__LazyJVMKt.lazy(OneStvProsermOnlineViewModel$_mainBalanceLiveData$2.INSTANCE);
        this.f82684c0 = m19998E0();
        this.f82686d0 = LazyKt__LazyJVMKt.lazy(OneStvProsermOnlineViewModel$_mainBalanceTrueCompanyLiveData$2.INSTANCE);
        this.f82688e0 = m19996F0();
        this.f82690f0 = new MutableLiveData();
        this.f82692g0 = LazyKt__LazyJVMKt.lazy(OneStvProsermOnlineViewModel$_getBalanceTrueCompanyLiveData$2.INSTANCE);
        this.f82694h0 = m20000D0();
        this.f82696i0 = 1;
        this.f82698j0 = 3;
    }

    /* renamed from: A */
    public static /* synthetic */ void m20007A(Function1 function1, Object obj) {
        m19981N(function1, obj);
    }

    /* renamed from: B */
    public static /* synthetic */ void m20005B(Function1 function1, Object obj) {
        m19967U(function1, obj);
    }

    /* renamed from: C */
    public static /* synthetic */ void m20003C(Function1 function1, Object obj) {
        m19977P(function1, obj);
    }

    /* renamed from: D */
    public static /* synthetic */ void m20001D(Function1 function1, Object obj) {
        m19922t0(function1, obj);
    }

    /* renamed from: E */
    public static /* synthetic */ void m19999E(Function1 function1, Object obj) {
        m19938l0(function1, obj);
    }

    /* renamed from: F */
    public static /* synthetic */ void m19997F(Function1 function1, Object obj) {
        m19918v0(function1, obj);
    }

    /* renamed from: G */
    public static /* synthetic */ void m19995G(Function1 function1, Object obj) {
        m19966U0(function1, obj);
    }

    /* renamed from: H */
    public static /* synthetic */ void m19993H(Function1 function1, Object obj) {
        m19928q0(function1, obj);
    }

    /* renamed from: I */
    public static /* synthetic */ void m19991I(Function1 function1, Object obj) {
        m19956c0(function1, obj);
    }

    /* renamed from: J */
    public static /* synthetic */ void m19989J(Function1 function1, Object obj) {
        m19975Q(function1, obj);
    }

    /* renamed from: K */
    public static /* synthetic */ void m19987K(Function1 function1, Object obj) {
        m19958b0(function1, obj);
    }

    /* renamed from: L */
    public static /* synthetic */ void m19985L(Function1 function1, Object obj) {
        m19954d0(function1, obj);
    }

    /* renamed from: M */
    public static final void m19983M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m19981N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m19979O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m19977P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P0 */
    public static final void m19976P0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m19975Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q0 */
    public static final void m19974Q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m19973R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m19971S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S0 */
    public static final void m19970S0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m19969T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T0 */
    public static final void m19968T0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m19967U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U0 */
    public static final void m19966U0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m19965V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m19964W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m19963X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m19962Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m19961Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m19960a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void acceptBuyDOLConsent$default(OneStvProsermOnlineViewModel oneStvProsermOnlineViewModel, Integer num, Version version, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        oneStvProsermOnlineViewModel.acceptBuyDOLConsent(num, version, str);
    }

    /* renamed from: b */
    public static /* synthetic */ void m19959b(Function1 function1, Object obj) {
        m19976P0(function1, obj);
    }

    /* renamed from: b0 */
    public static final void m19958b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m19957c(Function1 function1, Object obj) {
        m19983M(function1, obj);
    }

    /* renamed from: c0 */
    public static final void m19956c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void callGetSTVPackages$default(OneStvProsermOnlineViewModel oneStvProsermOnlineViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        oneStvProsermOnlineViewModel.callGetSTVPackages(str);
    }

    public static /* synthetic */ void callGetSTVPackagesTrueCompany$default(OneStvProsermOnlineViewModel oneStvProsermOnlineViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        oneStvProsermOnlineViewModel.callGetSTVPackagesTrueCompany(str);
    }

    /* renamed from: d */
    public static /* synthetic */ void m19955d(Function1 function1, Object obj) {
        m19940k0(function1, obj);
    }

    /* renamed from: d0 */
    public static final void m19954d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static /* synthetic */ void m19953e(Function1 function1, Object obj) {
        m19962Y(function1, obj);
    }

    /* renamed from: e0 */
    public static final void m19952e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static /* synthetic */ void m19951f(Function1 function1, Object obj) {
        m19946h0(function1, obj);
    }

    /* renamed from: f0 */
    public static final void m19950f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static /* synthetic */ void m19949g(Function1 function1, Object obj) {
        m19973R(function1, obj);
    }

    /* renamed from: g0 */
    public static final void m19948g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static /* synthetic */ void m19947h(Function1 function1, Object obj) {
        m19960a0(function1, obj);
    }

    /* renamed from: h0 */
    public static final void m19946h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static /* synthetic */ Pair m19945i(Function2 function2, Object obj, Object obj2) {
        return m19934n0(function2, obj, obj2);
    }

    /* renamed from: j */
    public static /* synthetic */ void m19943j(Function1 function1, Object obj) {
        m19979O(function1, obj);
    }

    /* renamed from: j0 */
    public static final void m19942j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static /* synthetic */ void m19941k(Function1 function1, Object obj) {
        m19942j0(function1, obj);
    }

    /* renamed from: k0 */
    public static final void m19940k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static /* synthetic */ void m19939l(Function1 function1, Object obj) {
        m19961Z(function1, obj);
    }

    /* renamed from: l0 */
    public static final void m19938l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static /* synthetic */ void m19937m(Function1 function1, Object obj) {
        m19920u0(function1, obj);
    }

    /* renamed from: n */
    public static /* synthetic */ void m19935n(Function1 function1, Object obj) {
        m19963X(function1, obj);
    }

    /* renamed from: n0 */
    public static final Pair m19934n0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: o */
    public static /* synthetic */ void m19933o(Function1 function1, Object obj) {
        m19968T0(function1, obj);
    }

    /* renamed from: o0 */
    public static final void m19932o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static /* synthetic */ void m19931p(Function1 function1, Object obj) {
        m19948g0(function1, obj);
    }

    /* renamed from: p0 */
    public static final void m19930p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static /* synthetic */ void m19929q(Function1 function1, Object obj) {
        m19974Q0(function1, obj);
    }

    /* renamed from: q0 */
    public static final void m19928q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static /* synthetic */ void m19927r(Function1 function1, Object obj) {
        m19964W(function1, obj);
    }

    /* renamed from: s */
    public static /* synthetic */ void m19925s(Function1 function1, Object obj) {
        m19971S(function1, obj);
    }

    /* renamed from: t */
    public static /* synthetic */ void m19923t(Function1 function1, Object obj) {
        m19965V(function1, obj);
    }

    /* renamed from: t0 */
    public static final void m19922t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static /* synthetic */ void m19921u(Function1 function1, Object obj) {
        m19932o0(function1, obj);
    }

    /* renamed from: u0 */
    public static final void m19920u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static /* synthetic */ void m19919v(Function1 function1, Object obj) {
        m19969T(function1, obj);
    }

    /* renamed from: v0 */
    public static final void m19918v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static /* synthetic */ void m19917w(Function1 function1, Object obj) {
        m19970S0(function1, obj);
    }

    /* renamed from: x */
    public static /* synthetic */ void m19915x(Function1 function1, Object obj) {
        m19950f0(function1, obj);
    }

    /* renamed from: y */
    public static /* synthetic */ void m19913y(Function1 function1, Object obj) {
        m19952e0(function1, obj);
    }

    /* renamed from: z */
    public static /* synthetic */ void m19911z(Function1 function1, Object obj) {
        m19930p0(function1, obj);
    }

    /* renamed from: A0 */
    public final MutableLiveData m20006A0() {
        return (MutableLiveData) this.f82655B.getValue();
    }

    /* renamed from: B0 */
    public final MutableLiveData m20004B0() {
        return (MutableLiveData) this.f82669P.getValue();
    }

    /* renamed from: C0 */
    public final MutableLiveData m20002C0() {
        return (MutableLiveData) this.f82708t.getValue();
    }

    /* renamed from: D0 */
    public final MutableLiveData m20000D0() {
        return (MutableLiveData) this.f82692g0.getValue();
    }

    /* renamed from: E0 */
    public final MutableLiveData m19998E0() {
        return (MutableLiveData) this.f82682b0.getValue();
    }

    /* renamed from: F0 */
    public final MutableLiveData m19996F0() {
        return (MutableLiveData) this.f82686d0.getValue();
    }

    /* renamed from: G0 */
    public final MutableLiveData m19994G0() {
        return (MutableLiveData) this.f82671R.getValue();
    }

    /* renamed from: H0 */
    public final MutableLiveData m19992H0() {
        return (MutableLiveData) this.f82704p.getValue();
    }

    /* renamed from: I0 */
    public final MutableLiveData m19990I0() {
        return (MutableLiveData) this.f82714z.getValue();
    }

    /* renamed from: J0 */
    public final MutableLiveData m19988J0() {
        return (MutableLiveData) this.f82712x.getValue();
    }

    /* renamed from: K0 */
    public final MutableLiveData m19986K0() {
        return (MutableLiveData) this.f82706r.getValue();
    }

    /* renamed from: L0 */
    public final MutableLiveData m19984L0() {
        return (MutableLiveData) this.f82700l.getValue();
    }

    /* renamed from: M0 */
    public final MutableLiveData m19982M0() {
        return (MutableLiveData) this.f82702n.getValue();
    }

    /* renamed from: N0 */
    public final MutableLiveData m19980N0() {
        return (MutableLiveData) this.f82710v.getValue();
    }

    /* renamed from: O0 */
    public final void m19978O0(OneSubmitSTVProsermResponse oneSubmitSTVProsermResponse) {
        long j;
        if (this.f82696i0 >= this.f82698j0) {
            j = 5;
        } else {
            j = 3;
        }
        TimeUnit.SECONDS.sleep(j);
        OneStvRepository oneStvRepository = this.f82681b;
        OneSubmitSTVProsermResponse.Data data = oneSubmitSTVProsermResponse.getData();
        Single<R> compose = oneStvRepository.queryTransaction((data == null || (r1 = data.getTrackingId()) == null) ? "" : "").compose(this.f82683c.applySingleAsync());
        final OneStvProsermOnlineViewModel$queryTransaction$1 oneStvProsermOnlineViewModel$queryTransaction$1 = new OneStvProsermOnlineViewModel$queryTransaction$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Ed1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19959b(oneStvProsermOnlineViewModel$queryTransaction$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "private fun queryTransac…    }\n            )\n    }");
        SubscribersKt.subscribeBy(doOnSubscribe, new OneStvProsermOnlineViewModel$queryTransaction$2(this, oneSubmitSTVProsermResponse), new OneStvProsermOnlineViewModel$queryTransaction$3(this, oneSubmitSTVProsermResponse));
    }

    /* renamed from: R0 */
    public final void m19972R0() {
        Single<OneSubmitSTVProsermResponse> oneStvSubmit;
        if (Intrinsics.areEqual(getCompany(), "TRUE")) {
            oneStvSubmit = this.f82681b.oneStvSubmitTrue(m19916w0());
        } else {
            oneStvSubmit = this.f82681b.oneStvSubmit(m19926r0());
        }
        Single<R> compose = oneStvSubmit.compose(this.f82683c.applySingleAsync());
        final OneStvProsermOnlineViewModel$submitSTVProserm$1 oneStvProsermOnlineViewModel$submitSTVProserm$1 = new OneStvProsermOnlineViewModel$submitSTVProserm$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Kd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19917w(oneStvProsermOnlineViewModel$submitSTVProserm$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "private fun submitSTVPro…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OneStvProsermOnlineViewModel$submitSTVProserm$2(this), new OneStvProsermOnlineViewModel$submitSTVProserm$3(this)), this.f82699k);
    }

    public final void acceptBuyDOLConsent(@Nullable Integer num, @NotNull Version version, @Nullable String str) {
        Intrinsics.checkNotNullParameter(version, "version");
        Observable<R> compose = this.f82695i.acceptBuyDOLConsent(new OneBuyDolAcceptConsentRequest(this.f82697j.getSessionNow().getToken().getId(), num, version.getPlatform(), version.getOsVersion(), version.getDeviceModel(), version.getAppVersion(), this.f82693h.getAndroidID())).compose(this.f82683c.applyAsync());
        final OneStvProsermOnlineViewModel$acceptBuyDOLConsent$1 oneStvProsermOnlineViewModel$acceptBuyDOLConsent$1 = new OneStvProsermOnlineViewModel$acceptBuyDOLConsent$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Md1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19957c(oneStvProsermOnlineViewModel$acceptBuyDOLConsent$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun acceptBuyDOLConsent(…\n                })\n    }");
        SubscribersKt.subscribeBy$default(doOnSubscribe, new OneStvProsermOnlineViewModel$acceptBuyDOLConsent$2(this), (Function0) null, new OneStvProsermOnlineViewModel$acceptBuyDOLConsent$3(this, str), 2, (Object) null);
    }

    public final void callBalance() {
        Observable<R> compose = this.f82681b.getBalance().compose(this.f82683c.applyAsync());
        final OneStvProsermOnlineViewModel$callBalance$1 oneStvProsermOnlineViewModel$callBalance$1 = new OneStvProsermOnlineViewModel$callBalance$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Hd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m20007A(oneStvProsermOnlineViewModel$callBalance$1, obj);
            }
        });
        final OneStvProsermOnlineViewModel$callBalance$2 oneStvProsermOnlineViewModel$callBalance$2 = new OneStvProsermOnlineViewModel$callBalance$2(this);
        Consumer consumer = new Consumer() { // from class: Id1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19943j(oneStvProsermOnlineViewModel$callBalance$2, obj);
            }
        };
        final OneStvProsermOnlineViewModel$callBalance$3 oneStvProsermOnlineViewModel$callBalance$3 = new OneStvProsermOnlineViewModel$callBalance$3(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: Jd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m20003C(oneStvProsermOnlineViewModel$callBalance$3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun callBalance() {\n    …).addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f82699k);
    }

    public final void callBalanceTrueCompany() {
        Observable<R> compose = this.f82681b.getBalance().compose(this.f82683c.applyAsync());
        final OneStvProsermOnlineViewModel$callBalanceTrueCompany$1 oneStvProsermOnlineViewModel$callBalanceTrueCompany$1 = new OneStvProsermOnlineViewModel$callBalanceTrueCompany$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Bd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19925s(oneStvProsermOnlineViewModel$callBalanceTrueCompany$1, obj);
            }
        });
        final OneStvProsermOnlineViewModel$callBalanceTrueCompany$2 oneStvProsermOnlineViewModel$callBalanceTrueCompany$2 = new OneStvProsermOnlineViewModel$callBalanceTrueCompany$2(this);
        Consumer consumer = new Consumer() { // from class: Cd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19989J(oneStvProsermOnlineViewModel$callBalanceTrueCompany$2, obj);
            }
        };
        final OneStvProsermOnlineViewModel$callBalanceTrueCompany$3 oneStvProsermOnlineViewModel$callBalanceTrueCompany$3 = new OneStvProsermOnlineViewModel$callBalanceTrueCompany$3(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: Dd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19949g(oneStvProsermOnlineViewModel$callBalanceTrueCompany$3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun callBalanceTrueCompa…).addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f82699k);
    }

    public final void callCurrentPackages(@Nullable String str) {
        Observable<R> compose = this.f82681b.oneCurrentPackages(new OneCurrentPackagesRequest(this.f82681b.encryptCBC(PhoneNumberExtKt.toInternational(PhoneNumberFormat.removeAllSpecialCharacter(str))))).compose(this.f82683c.applyAsync());
        final OneStvProsermOnlineViewModel$callCurrentPackages$1 oneStvProsermOnlineViewModel$callCurrentPackages$1 = new OneStvProsermOnlineViewModel$callCurrentPackages$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: be1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19919v(oneStvProsermOnlineViewModel$callCurrentPackages$1, obj);
            }
        });
        final OneStvProsermOnlineViewModel$callCurrentPackages$2 oneStvProsermOnlineViewModel$callCurrentPackages$2 = new OneStvProsermOnlineViewModel$callCurrentPackages$2(this);
        Consumer consumer = new Consumer() { // from class: ce1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m20005B(oneStvProsermOnlineViewModel$callCurrentPackages$2, obj);
            }
        };
        final OneStvProsermOnlineViewModel$callCurrentPackages$3 oneStvProsermOnlineViewModel$callCurrentPackages$3 = new OneStvProsermOnlineViewModel$callCurrentPackages$3(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: de1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19923t(oneStvProsermOnlineViewModel$callCurrentPackages$3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun callCurrentPackages(…).addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f82699k);
    }

    public final void callGetSTVPackages(@Nullable String str) {
        Observable<OneStvGroupListCollection> oneGetSTVPackages$default;
        if (str != null) {
            this.f82681b.setSubscriberGroup(str);
            oneGetSTVPackages$default = this.f82681b.oneGetSTVPackages(str);
        } else {
            oneGetSTVPackages$default = OneStvRepository.DefaultImpls.oneGetSTVPackages$default(this.f82681b, null, 1, null);
        }
        Observable<R> compose = oneGetSTVPackages$default.compose(this.f82683c.applyAsync());
        final OneStvProsermOnlineViewModel$callGetSTVPackages$1 oneStvProsermOnlineViewModel$callGetSTVPackages$1 = new OneStvProsermOnlineViewModel$callGetSTVPackages$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Vd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19927r(oneStvProsermOnlineViewModel$callGetSTVPackages$1, obj);
            }
        });
        final OneStvProsermOnlineViewModel$callGetSTVPackages$2 oneStvProsermOnlineViewModel$callGetSTVPackages$2 = new OneStvProsermOnlineViewModel$callGetSTVPackages$2(this);
        Consumer consumer = new Consumer() { // from class: Xd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19935n(oneStvProsermOnlineViewModel$callGetSTVPackages$2, obj);
            }
        };
        final OneStvProsermOnlineViewModel$callGetSTVPackages$3 oneStvProsermOnlineViewModel$callGetSTVPackages$3 = new OneStvProsermOnlineViewModel$callGetSTVPackages$3(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: Yd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19953e(oneStvProsermOnlineViewModel$callGetSTVPackages$3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun callGetSTVPackages(s…).addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f82699k);
    }

    public final void callGetSTVPackagesTrueCompany(@Nullable String str) {
        Observable<OneStvGroupListCollection> oneGetSTVPackages$default;
        if (str != null) {
            this.f82681b.setSubscriberGroup(str);
            oneGetSTVPackages$default = this.f82681b.oneGetSTVPackages(str);
        } else {
            oneGetSTVPackages$default = OneStvRepository.DefaultImpls.oneGetSTVPackages$default(this.f82681b, null, 1, null);
        }
        Observable<R> compose = oneGetSTVPackages$default.compose(this.f82683c.applyAsync());
        final OneStvProsermOnlineViewModel$callGetSTVPackagesTrueCompany$1 oneStvProsermOnlineViewModel$callGetSTVPackagesTrueCompany$1 = new OneStvProsermOnlineViewModel$callGetSTVPackagesTrueCompany$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Rd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19939l(oneStvProsermOnlineViewModel$callGetSTVPackagesTrueCompany$1, obj);
            }
        });
        final OneStvProsermOnlineViewModel$callGetSTVPackagesTrueCompany$2 oneStvProsermOnlineViewModel$callGetSTVPackagesTrueCompany$2 = new OneStvProsermOnlineViewModel$callGetSTVPackagesTrueCompany$2(this);
        Consumer consumer = new Consumer() { // from class: Sd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19947h(oneStvProsermOnlineViewModel$callGetSTVPackagesTrueCompany$2, obj);
            }
        };
        final OneStvProsermOnlineViewModel$callGetSTVPackagesTrueCompany$3 oneStvProsermOnlineViewModel$callGetSTVPackagesTrueCompany$3 = new OneStvProsermOnlineViewModel$callGetSTVPackagesTrueCompany$3(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: Td1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19987K(oneStvProsermOnlineViewModel$callGetSTVPackagesTrueCompany$3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun callGetSTVPackagesTr…).addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f82699k);
    }

    public final void checkSubscriberPrepaid(@NotNull String subscriberNumber) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        String encryptCBC = this.f82681b.encryptCBC(PhoneNumberExtKt.toInternational(subscriberNumber));
        Single<R> compose = this.f82681b.checkSubscriberPrepaid(new OneTopUpCheckSubscriberRequest(encryptCBC)).compose(this.f82683c.applySingleAsync());
        final OneStvProsermOnlineViewModel$checkSubscriberPrepaid$1 oneStvProsermOnlineViewModel$checkSubscriberPrepaid$1 = new OneStvProsermOnlineViewModel$checkSubscriberPrepaid$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: he1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19991I(oneStvProsermOnlineViewModel$checkSubscriberPrepaid$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun checkSubscriberPrepa…    }\n            )\n    }");
        SubscribersKt.subscribeBy(doOnSubscribe, new OneStvProsermOnlineViewModel$checkSubscriberPrepaid$2(this), new OneStvProsermOnlineViewModel$checkSubscriberPrepaid$3(this, encryptCBC));
    }

    public final void clearModel() {
        this.f82681b.clearModel();
    }

    public final void clearSelectedPackData() {
        this.f82667N.setValue(Boolean.TRUE);
    }

    @NotNull
    public final LiveData<Resource<String>> getAcceptOnConsentLiveData() {
        return this.f82674U;
    }

    @NotNull
    public final LiveData<Resource<OneBuyDolBankResponse>> getBankListLiveData() {
        return this.f82676W;
    }

    public final void getBuyDOLConsentByFeatureName(@NotNull String featureCode) {
        Intrinsics.checkNotNullParameter(featureCode, "featureCode");
        Single<R> compose = this.f82695i.getBuyDOLConsentByFeatureName().compose(this.f82683c.applySingleAsync());
        final OneStvProsermOnlineViewModel$getBuyDOLConsentByFeatureName$1 oneStvProsermOnlineViewModel$getBuyDOLConsentByFeatureName$1 = new OneStvProsermOnlineViewModel$getBuyDOLConsentByFeatureName$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Gd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19985L(oneStvProsermOnlineViewModel$getBuyDOLConsentByFeatureName$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getBuyDOLConsentByFe…    }\n            )\n    }");
        SubscribersKt.subscribeBy(doOnSubscribe, new OneStvProsermOnlineViewModel$getBuyDOLConsentByFeatureName$2(this), new OneStvProsermOnlineViewModel$getBuyDOLConsentByFeatureName$3(featureCode, this));
    }

    public final void getBuyDolBankList() {
        Observable<R> compose = this.f82695i.getOneBuyDolBankList().compose(this.f82683c.applyAsync());
        final OneStvProsermOnlineViewModel$getBuyDolBankList$1 oneStvProsermOnlineViewModel$getBuyDolBankList$1 = new OneStvProsermOnlineViewModel$getBuyDolBankList$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: ge1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19913y(oneStvProsermOnlineViewModel$getBuyDolBankList$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getBuyDolBankList() …\n                })\n    }");
        SubscribersKt.subscribeBy$default(doOnSubscribe, new OneStvProsermOnlineViewModel$getBuyDolBankList$2(this), (Function0) null, new OneStvProsermOnlineViewModel$getBuyDolBankList$3(this), 2, (Object) null);
    }

    @NotNull
    public final MutableLiveData<Resource<Pair<String, OneTopUpCheckSubscriberDataResponse>>> getCheckSubscriberPrepaidLiveData() {
        return this.f82680a0;
    }

    @NotNull
    public final MutableLiveData<Boolean> getClearSelectedPackLiveData() {
        return this.f82667N;
    }

    public final String getCompany() {
        return this.f82689f.getCompany();
    }

    @NotNull
    public final MutableLiveData<String> getConfirmMultiTrans() {
        return this.f82665L;
    }

    @NotNull
    public final LiveData<Resource<OneCurrentPackagesResponse>> getCurrentPackages() {
        return this.f82656C;
    }

    @NotNull
    public final LiveData<Resource<Pair<BuyDolConsent, String>>> getDisplayConsentLiveData() {
        return this.f82670Q;
    }

    @NotNull
    public final LiveData<Resource<BalanceResponse>> getGetBalanceResponse() {
        return this.f82709u;
    }

    @NotNull
    public final LiveData<Resource<Pair<Boolean, BalanceResponse>>> getGetBalanceTrueCompanyLiveData() {
        return this.f82694h0;
    }

    public final void getMainBalance(@NotNull String subscriberNumber, @Nullable String str) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Single<R> compose = this.f82681b.getMainBalance(new OneTopUpGetMainBalanceRequest(this.f82697j.getUserSession().getUserLan(), this.f82697j.getUserSession().getUserCode(), subscriberNumber, str)).compose(this.f82683c.applySingleAsync());
        final OneStvProsermOnlineViewModel$getMainBalance$1 oneStvProsermOnlineViewModel$getMainBalance$1 = new OneStvProsermOnlineViewModel$getMainBalance$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Ud1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19915x(oneStvProsermOnlineViewModel$getMainBalance$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getMainBalance(\n    …    }\n            )\n    }");
        SubscribersKt.subscribeBy(doOnSubscribe, new OneStvProsermOnlineViewModel$getMainBalance$2(this), new OneStvProsermOnlineViewModel$getMainBalance$3(this));
    }

    @NotNull
    public final MutableLiveData<Resource<OneTopUpGetMainBalanceDataResponse>> getMainBalanceLiveData() {
        return this.f82684c0;
    }

    public final void getMainBalanceTrueCompany(@NotNull String subscriberNumber) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Single<R> compose = this.f82681b.getMainBalanceTrueCompany(new OneTopUpGetMainBalanceTrueCompanyRequest(this.f82681b.encryptCBC(PhoneNumberExtKt.toInternational(subscriberNumber)))).compose(this.f82683c.applySingleAsync());
        final OneStvProsermOnlineViewModel$getMainBalanceTrueCompany$1 oneStvProsermOnlineViewModel$getMainBalanceTrueCompany$1 = new OneStvProsermOnlineViewModel$getMainBalanceTrueCompany$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: ee1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19931p(oneStvProsermOnlineViewModel$getMainBalanceTrueCompany$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getMainBalanceTrueCo…    }\n            )\n    }");
        SubscribersKt.subscribeBy(doOnSubscribe, new OneStvProsermOnlineViewModel$getMainBalanceTrueCompany$2(this), new OneStvProsermOnlineViewModel$getMainBalanceTrueCompany$3(this));
    }

    @NotNull
    public final MutableLiveData<Resource<OneTopUpGetMainBalanceTrueCompanyDataResponse>> getMainBalanceTrueCompanyLiveData() {
        return this.f82688e0;
    }

    public final boolean getNeedToRefreshData() {
        return this.f82678Y;
    }

    @Nullable
    public final OneStvRecommendPackageResp getPackageResp() {
        return this.f82681b.getPackageResp();
    }

    @NotNull
    public final List<String> getPermissions() {
        return this.f82681b.getPermissions();
    }

    public final void getPriceList(@NotNull String featureCode) {
        Intrinsics.checkNotNullParameter(featureCode, "featureCode");
        Single<R> compose = this.f82695i.getPriceList().compose(this.f82683c.applySingleAsync());
        final OneStvProsermOnlineViewModel$getPriceList$1 oneStvProsermOnlineViewModel$getPriceList$1 = new OneStvProsermOnlineViewModel$getPriceList$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: fe1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19951f(oneStvProsermOnlineViewModel$getPriceList$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getPriceList(feature…    }\n            )\n    }");
        SubscribersKt.subscribeBy(doOnSubscribe, new OneStvProsermOnlineViewModel$getPriceList$2(this), new OneStvProsermOnlineViewModel$getPriceList$3(featureCode, this));
    }

    @NotNull
    public final LiveData<Resource<Pair<String, OneBuyDolPriceListSimRModel>>> getPriceListLiveData() {
        return this.f82672S;
    }

    public final void getProsermRecommend(@NotNull String mobileNumber) {
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        if (this.f82689f.isCompanyTrue()) {
            m19936m0(mobileNumber);
        } else {
            m19944i0(mobileNumber);
        }
    }

    @NotNull
    public final MutableLiveData<OneSubmitProsermRecommendReq.OneProsermRecommendInfo> getRecommendPack() {
        return this.f82660G;
    }

    @NotNull
    public final MutableLiveData<Resource<Pair<OneStvRecommendPackageResponse, OneTrueRecommendPackageAdditionalResponse>>> getRecommendPackagesAndPackAdditionalTrueCompany() {
        return this.f82705q;
    }

    @NotNull
    public final MutableLiveData<String> getSecurePin() {
        return this.f82663J;
    }

    @NotNull
    public final MutableLiveData<OneStvPackageCollection> getSelectedStvPackage() {
        return this.f82657D;
    }

    @NotNull
    public final MutableLiveData<PackagesItem> getSelectedStvPackageForTrue() {
        return this.f82658E;
    }

    @NotNull
    public final LiveData<Resource<ErrorCollection>> getShowDialogDuplicateStv() {
        return this.f82654A;
    }

    @NotNull
    public final LiveData<Resource<ErrorCollection>> getShowDialogError() {
        return this.f82713y;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getShowErrorStv() {
        return this.f82707s;
    }

    @NotNull
    public final String getSimR() {
        String simR = this.f82697j.getSessionNow().getToken().getSimR();
        Intrinsics.checkNotNullExpressionValue(simR, "rtrRx2Repository.sessionNow.token.simR");
        return PhoneNumberExtKt.toPretty(simR);
    }

    public final void getSimRList() {
        Observable<R> compose = this.f82681b.getSimRList().compose(this.f82683c.applyAsync());
        final OneStvProsermOnlineViewModel$getSimRList$1 oneStvProsermOnlineViewModel$getSimRList$1 = new OneStvProsermOnlineViewModel$getSimRList$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Ad1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m20001D(oneStvProsermOnlineViewModel$getSimRList$1, obj);
            }
        });
        final OneStvProsermOnlineViewModel$getSimRList$2 oneStvProsermOnlineViewModel$getSimRList$2 = new OneStvProsermOnlineViewModel$getSimRList$2(this);
        Consumer consumer = new Consumer() { // from class: Ld1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19937m(oneStvProsermOnlineViewModel$getSimRList$2, obj);
            }
        };
        final OneStvProsermOnlineViewModel$getSimRList$3 oneStvProsermOnlineViewModel$getSimRList$3 = new OneStvProsermOnlineViewModel$getSimRList$3(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: Wd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19997F(oneStvProsermOnlineViewModel$getSimRList$3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun getSimRList() {\n    …).addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f82699k);
    }

    @NotNull
    public final String getSimRNumberDisplay() {
        return this.f82681b.getSimRNumberDisplay();
    }

    @Nullable
    public final MutableLiveData<String> getSpeed() {
        return this.f82661H;
    }

    @NotNull
    public final MutableLiveData<Resource<OneStvGroupListCollection>> getStvGroupListCollection() {
        return this.f82701m;
    }

    @NotNull
    public final MutableLiveData<Resource<OneStvRecommendPackageResponse>> getStvRecommendPackages() {
        return this.f82703o;
    }

    @NotNull
    public final LiveData<Resource<OneSubmitSTVProsermResponse>> getSubmitSuccess() {
        return this.f82711w;
    }

    @Nullable
    public final String getSubscriberGroup() {
        return this.f82681b.getSubscriberGroup();
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.f82681b.getSubscriberNumber();
    }

    @NotNull
    public final ThemeColorModel getThemeColorModel() {
        if (Intrinsics.areEqual(this.f82689f.getCompany(), "TRUE")) {
            int i = R.drawable.background_one_toolbar_red;
            int i2 = R.color.red5;
            return new ThemeColorModel(i, i2, R.color.highlightColorRed, R.color.red4, i2, R.drawable.selector_rectangle_red, R.drawable.background_cursor_red, i2, R.drawable.background_one_button_red, R.color.red8, R.color.redDark, R.color.red7, R.drawable.ic_one_success_dialog_red, R.color.jet_back, i2, R.drawable.background_remaining_package_red, R.drawable.one_selector_shortcut_buy_dol_blue, R.color.red6, R.drawable.ic_one_retry_red);
        }
        int i3 = R.drawable.background_one_toolbar_blue;
        int i4 = R.color.niceBlueFive;
        return new ThemeColorModel(i3, i4, R.color.highlightColor, i4, i4, R.drawable.selector_rectangle_blue, R.drawable.background_cursor_blue, i4, R.drawable.background_one_button_blue, R.color.darkBlueFive, R.color.niceBlue, R.color.darkBlueFour, R.drawable.ic_one_success_dialog, i4, i4, R.drawable.background_remaining_package, R.drawable.one_selector_shortcut_buy_dol_pink, R.color.iceBlue, R.drawable.ic_one_retry_blue);
    }

    @NotNull
    public final MutableLiveData<String> getTransactionIdSift() {
        return this.f82662I;
    }

    @NotNull
    public final MutableLiveData<String> getTransactionRefIdRecommendForTrue() {
        return this.f82659F;
    }

    @NotNull
    public final MutableLiveData<Pair<Integer, Integer>> getUpdateSelectedPackLiveData() {
        return this.f82668O;
    }

    /* renamed from: i0 */
    public final void m19944i0(String str) {
        Observable<R> compose = this.f82681b.oneGetSTVRecommendPackages(new OneStvRecommendPackageRequest(this.f82681b.encryptCBC(PhoneNumberExtKt.toInternational(str)))).compose(this.f82683c.applyAsync());
        final OneStvProsermOnlineViewModel$getProsermRecommendForDtac$1 oneStvProsermOnlineViewModel$getProsermRecommendForDtac$1 = new OneStvProsermOnlineViewModel$getProsermRecommendForDtac$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: ie1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19941k(oneStvProsermOnlineViewModel$getProsermRecommendForDtac$1, obj);
            }
        });
        final OneStvProsermOnlineViewModel$getProsermRecommendForDtac$2 oneStvProsermOnlineViewModel$getProsermRecommendForDtac$2 = new OneStvProsermOnlineViewModel$getProsermRecommendForDtac$2(this);
        Consumer consumer = new Consumer() { // from class: je1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19955d(oneStvProsermOnlineViewModel$getProsermRecommendForDtac$2, obj);
            }
        };
        final OneStvProsermOnlineViewModel$getProsermRecommendForDtac$3 oneStvProsermOnlineViewModel$getProsermRecommendForDtac$3 = new OneStvProsermOnlineViewModel$getProsermRecommendForDtac$3(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: ke1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19999E(oneStvProsermOnlineViewModel$getProsermRecommendForDtac$3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "private fun getProsermRe…).addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f82699k);
    }

    public final boolean isRefresh() {
        return this.f82677X;
    }

    @NotNull
    public final MutableLiveData<StatusResource> isRefreshing() {
        return this.f82690f0;
    }

    /* renamed from: m0 */
    public final void m19936m0(String str) {
        Observable<OneStvRecommendPackageResponse> onErrorResumeNext = this.f82681b.oneGetSTVRecommendPackages(new OneStvRecommendPackageRequest(this.f82681b.encryptCBC(PhoneNumberExtKt.toInternational(str)))).onErrorResumeNext(Observable.just(new OneStvRecommendPackageResponse(null, null, null, null, null, null, null, 127, null)));
        Observable<OneTrueRecommendPackageAdditionalResponse> oneGetTrueRecommendPackagesAdditional = this.f82681b.oneGetTrueRecommendPackagesAdditional(new OneStvRecommendPackageRequest(this.f82681b.encryptCBC(PhoneNumberExtKt.toInternational(str))));
        final OneStvProsermOnlineViewModel$getProsermRecommendForTrue$1 oneStvProsermOnlineViewModel$getProsermRecommendForTrue$1 = OneStvProsermOnlineViewModel$getProsermRecommendForTrue$1.INSTANCE;
        Observable compose = Observable.zip(onErrorResumeNext, oneGetTrueRecommendPackagesAdditional, new BiFunction() { // from class: Nd1
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return OneStvProsermOnlineViewModel.m19945i(oneStvProsermOnlineViewModel$getProsermRecommendForTrue$1, obj, obj2);
            }
        }).compose(this.f82683c.applyAsync());
        final OneStvProsermOnlineViewModel$getProsermRecommendForTrue$2 oneStvProsermOnlineViewModel$getProsermRecommendForTrue$2 = new OneStvProsermOnlineViewModel$getProsermRecommendForTrue$2(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Od1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19921u(oneStvProsermOnlineViewModel$getProsermRecommendForTrue$2, obj);
            }
        });
        final OneStvProsermOnlineViewModel$getProsermRecommendForTrue$3 oneStvProsermOnlineViewModel$getProsermRecommendForTrue$3 = new OneStvProsermOnlineViewModel$getProsermRecommendForTrue$3(this);
        Consumer consumer = new Consumer() { // from class: Pd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19911z(oneStvProsermOnlineViewModel$getProsermRecommendForTrue$3, obj);
            }
        };
        final OneStvProsermOnlineViewModel$getProsermRecommendForTrue$4 oneStvProsermOnlineViewModel$getProsermRecommendForTrue$4 = new OneStvProsermOnlineViewModel$getProsermRecommendForTrue$4(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: Qd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19993H(oneStvProsermOnlineViewModel$getProsermRecommendForTrue$4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "private fun getProsermRe…).addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f82699k);
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f82699k.clear();
        super.onCleared();
    }

    /* renamed from: r0 */
    public final OneStvSubmitCollection m19926r0() {
        StvOffer stvOffer;
        String str;
        float f;
        String str2;
        Float commissionValue;
        String str3;
        String str4;
        String str5 = null;
        if (this.f82664K.getValue() != null) {
            TopupOfferResponse topupOfferResponse = (TopupOfferResponse) this.f82664K.getValue();
            if (topupOfferResponse != null) {
                str3 = topupOfferResponse.getFlowId();
            } else {
                str3 = null;
            }
            TopupOfferResponse topupOfferResponse2 = (TopupOfferResponse) this.f82664K.getValue();
            if (topupOfferResponse2 != null) {
                str4 = topupOfferResponse2.getTransactionId();
            } else {
                str4 = null;
            }
            stvOffer = new StvOffer(Constant.OfferType.BANNER, str3, str4);
        } else {
            stvOffer = null;
        }
        String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(getSubscriberNumber());
        OneStvPackageCollection oneStvPackageCollection = (OneStvPackageCollection) this.f82657D.getValue();
        if (oneStvPackageCollection != null) {
            str = oneStvPackageCollection.getCode();
        } else {
            str = null;
        }
        OneStvPackageCollection oneStvPackageCollection2 = (OneStvPackageCollection) this.f82657D.getValue();
        if (oneStvPackageCollection2 != null) {
            str5 = oneStvPackageCollection2.getUssdCode();
        }
        String str6 = str5;
        String encryptCBC = this.f82681b.encryptCBC(PhoneNumberExtKt.toInternational(removeAllSpecialCharacter));
        String str7 = (String) this.f82663J.getValue();
        if (str7 == null) {
            str7 = "";
        }
        OneSecurePin oneSecurePin = new OneSecurePin(str7);
        OneStvPackageCollection oneStvPackageCollection3 = (OneStvPackageCollection) this.f82657D.getValue();
        if (oneStvPackageCollection3 != null && (commissionValue = oneStvPackageCollection3.getCommissionValue()) != null) {
            f = commissionValue.floatValue();
        } else {
            f = 0.0f;
        }
        Float valueOf = Float.valueOf(f);
        String str8 = (String) this.f82665L.getValue();
        String subscriberGroup = getSubscriberGroup();
        if (subscriberGroup == null) {
            str2 = "";
        } else {
            str2 = subscriberGroup;
        }
        return new OneStvSubmitCollection(str, str6, encryptCBC, oneSecurePin, stvOffer, valueOf, str8, str2);
    }

    /* renamed from: s0 */
    public final OneSubmitProsermRecommendReq m19924s0() {
        String str;
        String str2;
        Float f;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String requesterId;
        String requesterZone;
        String requesterChannel;
        Integer seq;
        String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(getSubscriberNumber());
        OneStvPackageCollection oneStvPackageCollection = (OneStvPackageCollection) this.f82657D.getValue();
        if (oneStvPackageCollection != null) {
            str = oneStvPackageCollection.getCode();
        } else {
            str = null;
        }
        OneStvPackageCollection oneStvPackageCollection2 = (OneStvPackageCollection) this.f82657D.getValue();
        if (oneStvPackageCollection2 != null) {
            str2 = oneStvPackageCollection2.getUssdCode();
        } else {
            str2 = null;
        }
        String encryptCBC = this.f82681b.encryptCBC(PhoneNumberExtKt.toInternational(removeAllSpecialCharacter));
        String str8 = (String) this.f82663J.getValue();
        if (str8 == null) {
            str8 = "";
        }
        OneSecurePin oneSecurePin = new OneSecurePin(str8);
        OneSubmitProsermRecommendReq.OneProsermRecommendInfo oneProsermRecommendInfo = (OneSubmitProsermRecommendReq.OneProsermRecommendInfo) this.f82660G.getValue();
        OneStvPackageCollection oneStvPackageCollection3 = (OneStvPackageCollection) this.f82657D.getValue();
        if (oneStvPackageCollection3 != null) {
            f = oneStvPackageCollection3.getCommissionValue();
        } else {
            f = null;
        }
        OneStvPackageCollection oneStvPackageCollection4 = (OneStvPackageCollection) this.f82657D.getValue();
        if (oneStvPackageCollection4 != null && (seq = oneStvPackageCollection4.getSeq()) != null) {
            i = seq.intValue();
        } else {
            i = 0;
        }
        String str9 = (String) this.f82665L.getValue();
        if (str9 == null) {
            str9 = "N";
        }
        String str10 = str9;
        String togglePrepaidEnable = this.f82681b.getTogglePrepaidEnable();
        OneStvRecommendPackageResp packageResp = getPackageResp();
        if (packageResp == null || (requesterChannel = packageResp.getRequesterChannel()) == null) {
            str3 = "";
        } else {
            str3 = requesterChannel;
        }
        OneStvRecommendPackageResp packageResp2 = getPackageResp();
        if (packageResp2 == null || (str4 = packageResp2.getRequesterApplication()) == null) {
            str4 = RequestKt.REQUESTER_APPLICATION;
        }
        String str11 = str4;
        OneStvRecommendPackageResp packageResp3 = getPackageResp();
        if (packageResp3 == null || (requesterZone = packageResp3.getRequesterZone()) == null) {
            str5 = "";
        } else {
            str5 = requesterZone;
        }
        OneStvRecommendPackageResp packageResp4 = getPackageResp();
        if (packageResp4 == null || (requesterId = packageResp4.getRequesterId()) == null) {
            str6 = "";
        } else {
            str6 = requesterId;
        }
        String userCode = this.f82681b.getUserCode();
        if (userCode == null) {
            str7 = "";
        } else {
            str7 = userCode;
        }
        return new OneSubmitProsermRecommendReq(str, str2, encryptCBC, oneSecurePin, oneProsermRecommendInfo, f, i, str10, togglePrepaidEnable, str3, str11, str5, str6, str7);
    }

    public final void setClearSelectedPackLiveData(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.f82667N = mutableLiveData;
    }

    public final void setConfirmMultiTrans(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.f82665L = mutableLiveData;
    }

    public final void setNeedToRefreshData(boolean z) {
        this.f82678Y = z;
    }

    public final void setPackageResp(@Nullable OneStvRecommendPackageResp oneStvRecommendPackageResp) {
        this.f82681b.setPackageResp(oneStvRecommendPackageResp);
    }

    public final void setRecommendPack(@NotNull MutableLiveData<OneSubmitProsermRecommendReq.OneProsermRecommendInfo> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.f82660G = mutableLiveData;
    }

    public final void setRefresh(boolean z) {
        this.f82677X = z;
    }

    public final void setSecurePin(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.f82663J = mutableLiveData;
    }

    public final void setSelectedStvPackage(@NotNull MutableLiveData<OneStvPackageCollection> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.f82657D = mutableLiveData;
    }

    public final void setSelectedStvPackageForTrue(@NotNull MutableLiveData<PackagesItem> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.f82658E = mutableLiveData;
    }

    public final void setSpeed(@Nullable MutableLiveData<String> mutableLiveData) {
        this.f82661H = mutableLiveData;
    }

    public final void setSubscriberGroup(@Nullable String str) {
        this.f82681b.setSubscriberGroup(str);
    }

    public final void setSubscriberNumber(@Nullable String str) {
        this.f82681b.setSubscriberNumber(str);
    }

    public final void setTransactionIdSift(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.f82662I = mutableLiveData;
    }

    public final void setTransactionRefIdRecommendForTrue(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.f82659F = mutableLiveData;
    }

    public final void setUpdateSelectedPackLiveData(@NotNull MutableLiveData<Pair<Integer, Integer>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.f82668O = mutableLiveData;
    }

    public final void submit() {
        if (Intrinsics.areEqual(getCompany(), "TRUE")) {
            m19972R0();
        } else if (this.f82660G.getValue() != null) {
            submitProsermRecommend();
        } else {
            m19972R0();
        }
        this.f82665L.setValue("N");
    }

    public final void submitProsermRecommend() {
        Single<R> compose = this.f82681b.oneProsermRecommend(m19924s0()).compose(this.f82683c.applySingleAsync());
        final OneStvProsermOnlineViewModel$submitProsermRecommend$1 oneStvProsermOnlineViewModel$submitProsermRecommend$1 = new OneStvProsermOnlineViewModel$submitProsermRecommend$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Fd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19929q(oneStvProsermOnlineViewModel$submitProsermRecommend$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun submitProsermRecomme…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OneStvProsermOnlineViewModel$submitProsermRecommend$2(this), new OneStvProsermOnlineViewModel$submitProsermRecommend$3(this)), this.f82699k);
    }

    public final void updateInterestRecommendForTrue(@NotNull String subscriber, @NotNull String poqItemId, @NotNull String transactionRefId, @NotNull String categoryId, @NotNull String poqItemProductOfferingId) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Intrinsics.checkNotNullParameter(poqItemId, "poqItemId");
        Intrinsics.checkNotNullParameter(transactionRefId, "transactionRefId");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(poqItemProductOfferingId, "poqItemProductOfferingId");
        Observable<R> compose = this.f82681b.updateInterestRecommendForTrue(new UpdateInterestRecommendRequest(this.f82681b.encryptCBC(PhoneNumberExtKt.toInternational(subscriber)), poqItemId, transactionRefId, categoryId, poqItemProductOfferingId)).compose(this.f82683c.applyBackground());
        final OneStvProsermOnlineViewModel$updateInterestRecommendForTrue$1 oneStvProsermOnlineViewModel$updateInterestRecommendForTrue$1 = OneStvProsermOnlineViewModel$updateInterestRecommendForTrue$1.INSTANCE;
        Consumer consumer = new Consumer() { // from class: Zd1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19933o(oneStvProsermOnlineViewModel$updateInterestRecommendForTrue$1, obj);
            }
        };
        final OneStvProsermOnlineViewModel$updateInterestRecommendForTrue$2 oneStvProsermOnlineViewModel$updateInterestRecommendForTrue$2 = OneStvProsermOnlineViewModel$updateInterestRecommendForTrue$2.INSTANCE;
        Disposable subscribe = compose.subscribe(consumer, new Consumer() { // from class: ae1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneStvProsermOnlineViewModel.m19995G(oneStvProsermOnlineViewModel$updateInterestRecommendForTrue$2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "repository.updateInteres…     }, {\n\n            })");
        DisposableKt.addTo(subscribe, this.f82699k);
    }

    public final void updateSTVPackageItem(int i, int i2) {
        this.f82668O.setValue(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* renamed from: w0 */
    public final OneStvSubmitTrueRequest m19916w0() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(getSubscriberNumber());
        String str10 = "";
        String str11 = null;
        if (this.f82658E.getValue() != null) {
            String encryptCBC = this.f82681b.encryptCBC(PhoneNumberExtKt.toInternational(removeAllSpecialCharacter));
            String str12 = (String) this.f82663J.getValue();
            if (str12 != null) {
                str10 = str12;
            }
            OneSecurePin oneSecurePin = new OneSecurePin(str10);
            OneSubmitProsermRecommendReq.OneProsermRecommendInfo oneProsermRecommendInfo = (OneSubmitProsermRecommendReq.OneProsermRecommendInfo) this.f82660G.getValue();
            if (oneProsermRecommendInfo != null) {
                str4 = oneProsermRecommendInfo.getIpkCode();
            } else {
                str4 = null;
            }
            OneStvPackageCollection oneStvPackageCollection = (OneStvPackageCollection) this.f82657D.getValue();
            if (oneStvPackageCollection != null) {
                str5 = oneStvPackageCollection.getUssdCode();
            } else {
                str5 = null;
            }
            OneStvPackageCollection oneStvPackageCollection2 = (OneStvPackageCollection) this.f82657D.getValue();
            if (oneStvPackageCollection2 != null) {
                str6 = oneStvPackageCollection2.getCode();
            } else {
                str6 = null;
            }
            String str13 = (String) this.f82665L.getValue();
            if (str13 == null) {
                str7 = "N";
            } else {
                str7 = str13;
            }
            PackagesItem packagesItem = (PackagesItem) this.f82658E.getValue();
            if (packagesItem != null) {
                str8 = packagesItem.getCategoryId();
            } else {
                str8 = null;
            }
            PackagesItem packagesItem2 = (PackagesItem) this.f82658E.getValue();
            if (packagesItem2 != null) {
                str9 = packagesItem2.getPoqItemId();
            } else {
                str9 = null;
            }
            PackagesItem packagesItem3 = (PackagesItem) this.f82658E.getValue();
            if (packagesItem3 != null) {
                str11 = packagesItem3.getPoqItemProductOfferingId();
            }
            return new OneStvSubmitTrueRequest(oneSecurePin, str4, str5, str6, encryptCBC, str7, str8, str9, str11, (String) this.f82659F.getValue());
        }
        String encryptCBC2 = this.f82681b.encryptCBC(PhoneNumberExtKt.toInternational(removeAllSpecialCharacter));
        String str14 = (String) this.f82663J.getValue();
        if (str14 != null) {
            str10 = str14;
        }
        OneSecurePin oneSecurePin2 = new OneSecurePin(str10);
        OneSubmitProsermRecommendReq.OneProsermRecommendInfo oneProsermRecommendInfo2 = (OneSubmitProsermRecommendReq.OneProsermRecommendInfo) this.f82660G.getValue();
        if (oneProsermRecommendInfo2 != null) {
            str = oneProsermRecommendInfo2.getIpkCode();
        } else {
            str = null;
        }
        OneStvPackageCollection oneStvPackageCollection3 = (OneStvPackageCollection) this.f82657D.getValue();
        if (oneStvPackageCollection3 != null) {
            str2 = oneStvPackageCollection3.getUssdCode();
        } else {
            str2 = null;
        }
        OneStvPackageCollection oneStvPackageCollection4 = (OneStvPackageCollection) this.f82657D.getValue();
        if (oneStvPackageCollection4 != null) {
            str11 = oneStvPackageCollection4.getCode();
        }
        String str15 = str11;
        String str16 = (String) this.f82665L.getValue();
        if (str16 == null) {
            str3 = "N";
        } else {
            str3 = str16;
        }
        return new OneStvSubmitTrueRequest(oneSecurePin2, str, str2, str15, encryptCBC2, str3, null, null, null, null, 960, null);
    }

    /* renamed from: x0 */
    public final MutableLiveData m19914x0() {
        return (MutableLiveData) this.f82673T.getValue();
    }

    /* renamed from: y0 */
    public final MutableLiveData m19912y0() {
        return (MutableLiveData) this.f82675V.getValue();
    }

    /* renamed from: z0 */
    public final MutableLiveData m19910z0() {
        return (MutableLiveData) this.f82679Z.getValue();
    }
}
