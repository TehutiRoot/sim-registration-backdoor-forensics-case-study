package th.p047co.dtac.android.dtacone.data.cache.realm_rx2;

import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.Scopes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.realm.ImportFlag;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.AbstractC11687a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.XCompany;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.OneCommonTrueLocationResponse;
import th.p047co.dtac.android.dtacone.model.appOne.getProfile.Company;
import th.p047co.dtac.android.dtacone.model.appOne.getProfile.Data;
import th.p047co.dtac.android.dtacone.model.database.CacheModel;
import th.p047co.dtac.android.dtacone.model.login.SessionEntity;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;
import th.p047co.dtac.android.dtacone.model.messaging.FirebaseSubscribeTopic;
import th.p047co.dtac.android.dtacone.model.profile.DataGroup;
import th.p047co.dtac.android.dtacone.model.profile.GetProfileResponse;
import th.p047co.dtac.android.dtacone.model.profile.Group;
import th.p047co.dtac.android.dtacone.model.profile.GroupPermission;
import th.p047co.dtac.android.dtacone.model.profile.Permission;
import th.p047co.dtac.android.dtacone.model.rtr_performance.SaleReportListCollection;
import th.p047co.dtac.android.dtacone.model.stv.StvCollection;
import th.p047co.dtac.android.dtacone.model.stv.StvGroupListCollection;
import th.p047co.dtac.android.dtacone.model.topup.TopUpPriceListCollection;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.p052enum.UserNameType;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u0085\u00012\u00020\u0001:\u0002\u0085\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001c0\f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001c¢\u0006\u0004\b#\u0010 J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J3\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0(0\f2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0(¢\u0006\u0004\b*\u0010+J\u001b\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\f2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J-\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\f2\b\u00100\u001a\u0004\u0018\u00010\n2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\n¢\u0006\u0004\b.\u00104J#\u00107\u001a\b\u0012\u0004\u0012\u00020,0\f2\u0006\u0010-\u001a\u00020,2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J5\u00107\u001a\b\u0012\u0004\u0012\u00020,0\f2\b\u00100\u001a\u0004\u0018\u00010\n2\u0006\u00102\u001a\u0002092\u0006\u00103\u001a\u00020\n2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u0010:J1\u0010<\u001a\u00020,2\u0006\u00102\u001a\u0002092\b\u00106\u001a\u0004\u0018\u00010;2\b\u00100\u001a\u0004\u0018\u00010\n2\u0006\u00103\u001a\u00020\n¢\u0006\u0004\b<\u0010=J'\u0010>\u001a\u00020,2\u0006\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\n2\u0006\u00103\u001a\u00020\n¢\u0006\u0004\b>\u0010?J!\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b@\u0010AJ'\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\bB\u0010CJ\u0013\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00170\f¢\u0006\u0004\bD\u0010\u001bJ\u001b\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\u0006\u00106\u001a\u000205¢\u0006\u0004\bE\u0010FJ\u001b\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\f2\u0006\u0010\t\u001a\u00020G¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00170\f¢\u0006\u0004\bJ\u0010\u001bJ\u001b\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\f2\u0006\u0010\t\u001a\u00020K¢\u0006\u0004\bL\u0010MJ\u0013\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00170\f¢\u0006\u0004\bN\u0010\u001bJ\r\u0010O\u001a\u00020\n¢\u0006\u0004\bO\u0010PJ\u0015\u0010S\u001a\u00020R2\u0006\u0010Q\u001a\u00020\n¢\u0006\u0004\bS\u0010TR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010Q\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u001d\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\f8F¢\u0006\u0006\u001a\u0004\b_\u0010\u001bR\u001d\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001c0\f8F¢\u0006\u0006\u001a\u0004\ba\u0010\u001bR\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020$0\f8F¢\u0006\u0006\u001a\u0004\bc\u0010\u001bR#\u0010f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0(0\f8F¢\u0006\u0006\u001a\u0004\be\u0010\u001bR\u001d\u0010i\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0(8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0017\u0010l\u001a\b\u0012\u0004\u0012\u00020j0\f8F¢\u0006\u0006\u001a\u0004\bk\u0010\u001bR\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020,0\f8F¢\u0006\u0006\u001a\u0004\bm\u0010\u001bR\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020,0\f8F¢\u0006\u0006\u001a\u0004\bo\u0010\u001bR\u0017\u0010r\u001a\b\u0012\u0004\u0012\u00020,0\f8F¢\u0006\u0006\u001a\u0004\bq\u0010\u001bR\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\f8F¢\u0006\u0006\u001a\u0004\bs\u0010\u001bR\u0011\u0010v\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0011\u0010y\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0011\u0010{\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bz\u0010xR\u0011\u0010~\u001a\u00020K8F¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0014\u0010\u0082\u0001\u001a\u00020\u007f8F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020G0\f8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u001b¨\u0006\u0086\u0001"}, m28850d2 = {"Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "", "Lio/realm/RealmConfiguration;", "configuration", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "pfViewModel", "<init>", "(Lio/realm/RealmConfiguration;Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;)V", "T", "collection", "", Action.KEY_ATTRIBUTE, "Lio/reactivex/Observable;", OperatorName.SAVE, "(Ljava/lang/Object;Ljava/lang/String;)Lio/reactivex/Observable;", "Ljava/lang/Class;", "type", OperatorName.MOVE_TO, "(Ljava/lang/Class;Ljava/lang/String;)Lio/reactivex/Observable;", "Ljava/lang/reflect/Type;", "typeOfT", OperatorName.ENDPATH, "(Ljava/lang/reflect/Type;Ljava/lang/String;)Lio/reactivex/Observable;", "", "i", "(Ljava/lang/String;)Lio/reactivex/Observable;", OperatorName.CLOSE_PATH, "()Lio/reactivex/Observable;", "", "Lth/co/dtac/android/dtacone/model/topup/TopUpPriceListCollection;", "topUpPriceListCollections", "savePriceList", "(Ljava/util/List;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/stv/StvCollection;", "stvCollections", "saveStvPackage", "Lth/co/dtac/android/dtacone/model/stv/StvGroupListCollection;", "stv", "saveStvPhoenixPackage", "(Lth/co/dtac/android/dtacone/model/stv/StvGroupListCollection;)Lio/reactivex/Observable;", "", "map", "saveMobileConfig", "(Ljava/util/Map;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/login/SessionEntity;", "session", "saveSession", "(Lth/co/dtac/android/dtacone/model/login/SessionEntity;)Lio/reactivex/Observable;", "token", "Lth/co/dtac/android/dtacone/model/profile/GetProfileResponse;", Scopes.PROFILE, "retailerNumber", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/profile/GetProfileResponse;Ljava/lang/String;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/XCompany;", "company", "saveSessionWithCompany", "(Lth/co/dtac/android/dtacone/model/login/SessionEntity;Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/XCompany;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/appOne/getProfile/Data;", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/getProfile/Data;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/XCompany;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/appOne/getProfile/Company;", "oneMappingSessionEntity", "(Lth/co/dtac/android/dtacone/model/appOne/getProfile/Data;Lth/co/dtac/android/dtacone/model/appOne/getProfile/Company;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/login/SessionEntity;", "mappingSessionEntity", "(Lth/co/dtac/android/dtacone/model/profile/GetProfileResponse;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/login/SessionEntity;", "savePerformanceReports", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "getPerformanceReports", "(Ljava/lang/Class;)Lio/reactivex/Observable;", "deletePerformanceReports", "deleteCompanySession", "(Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/XCompany;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/rtr_performance/SaleReportListCollection;", "saveSaleReports", "(Lth/co/dtac/android/dtacone/model/rtr_performance/SaleReportListCollection;)Lio/reactivex/Observable;", "deleteSaleReports", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/OneCommonTrueLocationResponse;", "saveTrueLocationData", "(Lth/co/dtac/android/dtacone/model/appOne/common/true_company/OneCommonTrueLocationResponse;)Lio/reactivex/Observable;", "deleteAllCache", "getHeaderApplication", "()Ljava/lang/String;", "headerApplication", "", "setHeaderApplication", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/realm/RealmConfiguration;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "Lcom/google/gson/Gson;", OperatorName.CURVE_TO, "Lcom/google/gson/Gson;", "gson", "d", "Ljava/lang/String;", "getPriceList", "priceList", "getStvPackage", "stvPackage", "getStvPhoenixPackage", "stvPhoenixPackage", "getMobileConfig", "mobileConfig", "getMobileConfigNow", "()Ljava/util/Map;", "mobileConfigNow", "Lth/co/dtac/android/dtacone/model/messaging/FirebaseSubscribeTopic;", "getAllTopicSubscribe", "allTopicSubscribe", "getSessionMrtr", "sessionMrtr", "getSessionDtac", "sessionDtac", "getSessionTrue", "sessionTrue", "getSession", "getSessionNow", "()Lth/co/dtac/android/dtacone/model/login/SessionEntity;", "sessionNow", "getHasSessionTrue", "()Z", "hasSessionTrue", "getHasSessionDtac", "hasSessionDtac", "getLocationData", "()Lth/co/dtac/android/dtacone/model/appOne/common/true_company/OneCommonTrueLocationResponse;", "locationData", "Lth/co/dtac/android/dtacone/model/login/TokenCollection;", "getUserSession", "()Lth/co/dtac/android/dtacone/model/login/TokenCollection;", "userSession", "getSaleReports", "saleReports", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@Singleton
@SourceDebugExtension({"SMAP\nRtrRx2Repository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RtrRx2Repository.kt\nth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,371:1\n766#2:372\n857#2,2:373\n1549#2:375\n1620#2,3:376\n766#2:379\n857#2,2:380\n1549#2:382\n1620#2,3:383\n*S KotlinDebug\n*F\n+ 1 RtrRx2Repository.kt\nth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository\n*L\n124#1:372\n124#1:373,2\n127#1:375\n127#1:376,3\n167#1:379\n167#1:380,2\n170#1:382\n170#1:383,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository */
/* loaded from: classes7.dex */
public class RtrRx2Repository {
    @NotNull
    public static final String DTACX = "DTACX";
    @NotNull
    public static final String MRTR = "MRTR";

    /* renamed from: a */
    public final RealmConfiguration f83453a;

    /* renamed from: b */
    public final PreferencesViewModel f83454b;

    /* renamed from: c */
    public final Gson f83455c;

    /* renamed from: d */
    public String f83456d;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m28850d2 = {"Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository$Companion;", "", "()V", "DTACX", "", "KEY_FIREBASE_SUBSCRIBE_TOPIC", "KEY_LOGIN_SESSION", "KEY_LOGIN_SESSION_DTAC", "KEY_LOGIN_SESSION_TRUE", "KEY_MOBILE_CONFIG", "KEY_PERFORMANCE_REPORTS", "KEY_PRICE_LIST", "KEY_RETAILER_SALE_REPORTS", "KEY_STV_PACKAGE", "KEY_STV_PHOENIX_PACKAGE", "KEY_TRUE_LOCATION_DATA", "MRTR", "NUMBER_OF_DATE_TO_KEEP", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Inject
    public RtrRx2Repository(@NotNull RealmConfiguration configuration, @NotNull PreferencesViewModel pfViewModel) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        this.f83453a = configuration;
        this.f83454b = pfViewModel;
        Gson create = new GsonBuilder().create();
        Intrinsics.checkNotNullExpressionValue(create, "GsonBuilder().create()");
        this.f83455c = create;
        this.f83456d = "MRTR";
    }

    /* renamed from: a */
    public static /* synthetic */ ObservableSource m19555a(Function1 function1, Object obj) {
        return m19540p(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ ObservableSource m19550f(Function1 function1, Object obj) {
        return m19546j(function1, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m19549g(Function1 function1, Object obj) {
        return m19537s(function1, obj);
    }

    /* renamed from: j */
    public static final ObservableSource m19546j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m19545k(Realm realm) {
        realm.delete(CacheModel.class);
    }

    /* renamed from: l */
    public static final CacheModel m19544l(String key, Realm it) {
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(it, "it");
        CacheModel cacheModel = (CacheModel) it.where(CacheModel.class).equalTo(Action.KEY_ATTRIBUTE, key).findFirst();
        if (cacheModel != null) {
            cacheModel.deleteFromRealm();
        }
        return cacheModel;
    }

    /* renamed from: o */
    public static final CacheModel m19541o(String key, Realm it) {
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(it, "it");
        return (CacheModel) it.where(CacheModel.class).equalTo(Action.KEY_ATTRIBUTE, key).findFirst();
    }

    /* renamed from: p */
    public static final ObservableSource m19540p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final CacheModel m19538r(String key, RtrRx2Repository this$0, Object obj, Realm it) {
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        CacheModel cacheModel = new CacheModel();
        cacheModel.setKey(key);
        cacheModel.setValue(this$0.f83455c.toJson(obj));
        cacheModel.setUpdatedDate(new Date());
        return (CacheModel) it.copyToRealmOrUpdate((Realm) cacheModel, new ImportFlag[0]);
    }

    /* renamed from: s */
    public static final Object m19537s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    @NotNull
    public final Observable<Boolean> deleteAllCache() {
        return m19548h();
    }

    @NotNull
    public final Observable<Boolean> deleteCompanySession(@NotNull XCompany company) {
        String str;
        Intrinsics.checkNotNullParameter(company, "company");
        if (company == XCompany.TRUE) {
            str = "KEY_LOGIN_SESSION_TRUE";
        } else {
            str = "KEY_LOGIN_SESSION_DTAC";
        }
        return m19547i(str);
    }

    @NotNull
    public final Observable<Boolean> deletePerformanceReports() {
        return m19547i("KEY_PERFORMANCE_REPORTS");
    }

    @NotNull
    public final Observable<Boolean> deleteSaleReports() {
        return m19547i("KEY_RETAILER_SALE_REPORTS");
    }

    @NotNull
    public final Observable<FirebaseSubscribeTopic> getAllTopicSubscribe() {
        return m19543m(FirebaseSubscribeTopic.class, "KEY_FIREBASE_SUBSCRIBE_TOPIC");
    }

    public final boolean getHasSessionDtac() {
        try {
            return !getSessionDtac().isEmpty().blockingGet().booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean getHasSessionTrue() {
        try {
            return !getSessionTrue().isEmpty().blockingGet().booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    public final String getHeaderApplication() {
        return this.f83456d;
    }

    @NotNull
    public final OneCommonTrueLocationResponse getLocationData() {
        Object blockingFirst = m19543m(OneCommonTrueLocationResponse.class, "KEY_TRUE_LOCATION_DATA").defaultIfEmpty(new OneCommonTrueLocationResponse("", "", "", "", null, CollectionsKt__CollectionsKt.emptyList(), "")).blockingFirst();
        Intrinsics.checkNotNullExpressionValue(blockingFirst, "getCollection(OneCommonT…        ).blockingFirst()");
        return (OneCommonTrueLocationResponse) blockingFirst;
    }

    @NotNull
    public final Observable<Map<String, String>> getMobileConfig() {
        Type type = new TypeToken<Map<String, ? extends String>>() { // from class: th.co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository$mobileConfig$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<Map<String, String>>() {}.type");
        return m19542n(type, "KEY_MOBILE_CONFIG");
    }

    @NotNull
    public final Map<String, String> getMobileConfigNow() {
        Map<String, String> blockingFirst = getMobileConfig().defaultIfEmpty(AbstractC11687a.emptyMap()).blockingFirst();
        Intrinsics.checkNotNullExpressionValue(blockingFirst, "mobileConfig.defaultIfEm…ptyMap()).blockingFirst()");
        return blockingFirst;
    }

    @NotNull
    public final <T> Observable<T> getPerformanceReports(@NotNull Class<T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return m19543m(type, "KEY_PERFORMANCE_REPORTS");
    }

    @NotNull
    public final Observable<List<TopUpPriceListCollection>> getPriceList() {
        Type type = new TypeToken<List<? extends TopUpPriceListCollection>>() { // from class: th.co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository$priceList$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<List<…istCollection>>() {}.type");
        return m19542n(type, "KEY_PRICE_LIST");
    }

    @NotNull
    public final Observable<SaleReportListCollection> getSaleReports() {
        return m19543m(SaleReportListCollection.class, "KEY_RETAILER_SALE_REPORTS");
    }

    @NotNull
    public final Observable<SessionEntity> getSession() {
        String company = this.f83454b.getCompany();
        if (Intrinsics.areEqual(company, "TRUE")) {
            return getSessionTrue();
        }
        if (Intrinsics.areEqual(company, Constant.withDeviceType.WITH_DEVICE_DTAC_DEVICE)) {
            return getSessionDtac();
        }
        return getSessionMrtr();
    }

    @NotNull
    public final Observable<SessionEntity> getSessionDtac() {
        return m19543m(SessionEntity.class, "KEY_LOGIN_SESSION_DTAC");
    }

    @NotNull
    public final Observable<SessionEntity> getSessionMrtr() {
        return m19543m(SessionEntity.class, "KEY_LOGIN_SESSION");
    }

    @NotNull
    public final SessionEntity getSessionNow() {
        SessionEntity blockingFirst;
        try {
            String company = this.f83454b.getCompany();
            if (Intrinsics.areEqual(company, "TRUE")) {
                blockingFirst = getSessionTrue().defaultIfEmpty(new SessionEntity(new TokenCollection(0L, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), "", "", new Group("", ""), new DataGroup("", ""), CollectionsKt__CollectionsKt.emptyList(), new ArrayList())).blockingFirst();
            } else if (Intrinsics.areEqual(company, Constant.withDeviceType.WITH_DEVICE_DTAC_DEVICE)) {
                blockingFirst = getSessionDtac().defaultIfEmpty(new SessionEntity(new TokenCollection(0L, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), "", "", new Group("", ""), new DataGroup("", ""), CollectionsKt__CollectionsKt.emptyList(), new ArrayList())).blockingFirst();
            } else {
                blockingFirst = getSession().defaultIfEmpty(new SessionEntity(new TokenCollection(0L, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), "", "", new Group("", ""), new DataGroup("", ""), CollectionsKt__CollectionsKt.emptyList(), new ArrayList())).blockingFirst();
            }
            Intrinsics.checkNotNullExpressionValue(blockingFirst, "{\n            when (pfVi…)\n            }\n        }");
            return blockingFirst;
        } catch (Exception unused) {
            return new SessionEntity(new TokenCollection(0L, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), "", "", new ArrayList());
        }
    }

    @NotNull
    public final Observable<SessionEntity> getSessionTrue() {
        return m19543m(SessionEntity.class, "KEY_LOGIN_SESSION_TRUE");
    }

    @NotNull
    public final Observable<List<StvCollection>> getStvPackage() {
        Type type = new TypeToken<List<? extends StvCollection>>() { // from class: th.co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository$stvPackage$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<List<StvCollection>>() {}.type");
        return m19542n(type, "KEY_STV_PACKAGE");
    }

    @NotNull
    public final Observable<StvGroupListCollection> getStvPhoenixPackage() {
        return m19543m(StvGroupListCollection.class, "KEY_STV_PHOENIX_PACKAGE");
    }

    @NotNull
    public final TokenCollection getUserSession() {
        TokenCollection token = getSessionNow().getToken();
        Intrinsics.checkNotNullExpressionValue(token, "sessionNow.token");
        return token;
    }

    /* renamed from: h */
    public final Observable m19548h() {
        return RealmObservable.INSTANCE.call(this.f83453a, new Consumer() { // from class: Nz1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RtrRx2Repository.m19545k((Realm) obj);
            }
        });
    }

    /* renamed from: i */
    public final Observable m19547i(final String str) {
        Observable create = RealmObservable.INSTANCE.create(this.f83453a, new Function() { // from class: Oz1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                CacheModel m19544l;
                m19544l = RtrRx2Repository.m19544l(str, (Realm) obj);
                return m19544l;
            }
        });
        final RtrRx2Repository$deleteCollection$2 rtrRx2Repository$deleteCollection$2 = RtrRx2Repository$deleteCollection$2.INSTANCE;
        Observable defaultIfEmpty = create.flatMap(new Function() { // from class: Pz1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RtrRx2Repository.m19550f(rtrRx2Repository$deleteCollection$2, obj);
            }
        }).defaultIfEmpty(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(defaultIfEmpty, "RealmObservable\n        …   .defaultIfEmpty(false)");
        return defaultIfEmpty;
    }

    /* renamed from: m */
    public final Observable m19543m(Class cls, String str) {
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.reflect.Type");
        return m19542n(cls, str);
    }

    @NotNull
    public final SessionEntity mappingSessionEntity(@NotNull GetProfileResponse profile, @Nullable String str, @NotNull String retailerNumber) {
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(retailerNumber, "retailerNumber");
        Long valueOf = Long.valueOf(profile.getId());
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        String rtrName = profile.getRtrName();
        String simR = profile.getSimR();
        String rtrCode = profile.getRtrCode();
        String dtrCode = profile.getDtrCode();
        String status = profile.getStatus();
        String userType = profile.getUserType();
        String channel = profile.getChannel();
        String subChannel = profile.getSubChannel();
        String retailerType = profile.getRetailerType();
        String retailerSubType = profile.getRetailerSubType();
        String userLan = profile.getUserLan();
        String userCode = profile.getUserCode();
        String locationCode = profile.getLocationCode();
        String locationName = profile.getLocationName();
        String userFormatType = profile.getUserFormatType();
        String userName = profile.getUserName();
        if (userName != null && userName.length() != 0) {
            str3 = profile.getUserName();
        } else {
            str3 = retailerNumber;
        }
        TokenCollection tokenCollection = new TokenCollection(valueOf, str2, rtrName, simR, rtrCode, dtrCode, status, userType, channel, subChannel, retailerType, retailerSubType, userLan, userCode, locationCode, locationName, userFormatType, str3);
        String dolStatus = profile.getDolStatus();
        Group group = profile.getGroup();
        DataGroup dataGroup = profile.getDataGroup();
        List<GroupPermission> groupPermission = profile.getGroupPermission();
        ArrayList<Permission> arrayList = new ArrayList();
        for (Object obj : profile.getPermissions()) {
            if (AbstractC20204hN1.equals(((Permission) obj).getAllow(), "Y", true)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(arrayList, 10));
        for (Permission permission : arrayList) {
            arrayList2.add(permission.getCode());
        }
        return new SessionEntity(tokenCollection, retailerNumber, dolStatus, group, dataGroup, groupPermission, CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2));
    }

    /* renamed from: n */
    public final Observable m19542n(Type type, final String str) {
        Observable create = RealmObservable.INSTANCE.create(this.f83453a, new Function() { // from class: Jz1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                CacheModel m19541o;
                m19541o = RtrRx2Repository.m19541o(str, (Realm) obj);
                return m19541o;
            }
        });
        final RtrRx2Repository$getCollection$2 rtrRx2Repository$getCollection$2 = new RtrRx2Repository$getCollection$2(this, type);
        Observable flatMap = create.flatMap(new Function() { // from class: Kz1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RtrRx2Repository.m19555a(rtrRx2Repository$getCollection$2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "private fun <T> getColle…        }\n        }\n    }");
        return flatMap;
    }

    @NotNull
    public final SessionEntity oneMappingSessionEntity(@NotNull Data profile, @Nullable Company company, @Nullable String str, @NotNull String retailerNumber) {
        Integer id2;
        Long l;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        List<GroupPermission> list;
        List list2;
        List<Permission> permissions;
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(retailerNumber, "retailerNumber");
        if (profile.getId() != null) {
            l = Long.valueOf(id2.intValue());
        } else {
            l = null;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        if (company != null) {
            str3 = company.getRtrName();
        } else {
            str3 = null;
        }
        if (company != null) {
            str4 = company.getSimR();
        } else {
            str4 = null;
        }
        if (company != null) {
            str5 = company.getRtrCode();
        } else {
            str5 = null;
        }
        if (company != null) {
            str6 = company.getDtrCode();
        } else {
            str6 = null;
        }
        if (company != null) {
            str7 = company.getDolStatus();
        } else {
            str7 = null;
        }
        String userType = profile.getUserType();
        if (company != null) {
            str8 = company.getChannel();
        } else {
            str8 = null;
        }
        if (company != null) {
            str9 = company.getSubChannel();
        } else {
            str9 = null;
        }
        if (company != null) {
            str10 = company.getRetailerType();
        } else {
            str10 = null;
        }
        if (company != null) {
            str11 = company.getRetailerSubType();
        } else {
            str11 = null;
        }
        if (company != null) {
            str12 = company.getUserLan();
        } else {
            str12 = null;
        }
        if (company != null) {
            str13 = company.getUserCode();
        } else {
            str13 = null;
        }
        if (company != null) {
            str14 = company.getLocationCode();
        } else {
            str14 = null;
        }
        if (company != null) {
            str15 = company.getLocationName();
        } else {
            str15 = null;
        }
        TokenCollection tokenCollection = new TokenCollection(l, str2, str3, str4, str5, str6, str7, userType, str8, str9, str10, str11, str12, str13, str14, str15, UserNameType.TELEPHONE_NUMBER.INSTANCE.getUserFormatType(), retailerNumber);
        if (company != null) {
            str16 = company.getDolStatus();
        } else {
            str16 = null;
        }
        if (company != null) {
            list = company.getGroupPermission();
        } else {
            list = null;
        }
        if (company != null && (permissions = company.getPermissions()) != null) {
            ArrayList<Permission> arrayList = new ArrayList();
            for (Object obj : permissions) {
                if (AbstractC20204hN1.equals(((Permission) obj).getAllow(), "Y", true)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(arrayList, 10));
            for (Permission permission : arrayList) {
                arrayList2.add(permission.getCode());
            }
            list2 = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        } else {
            list2 = null;
        }
        return new SessionEntity(tokenCollection, retailerNumber, str16, null, null, list, list2);
    }

    /* renamed from: q */
    public final Observable m19539q(final Object obj, final String str) {
        Observable create = RealmObservable.INSTANCE.create(this.f83453a, new Function() { // from class: Lz1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                CacheModel m19538r;
                m19538r = RtrRx2Repository.m19538r(str, this, obj, (Realm) obj2);
                return m19538r;
            }
        });
        final RtrRx2Repository$saveCollection$2 rtrRx2Repository$saveCollection$2 = new RtrRx2Repository$saveCollection$2(obj);
        Observable map = create.map(new Function() { // from class: Mz1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                return RtrRx2Repository.m19549g(rtrRx2Repository$saveCollection$2, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "collection: T, key: Stri…).map { _ -> collection }");
        return map;
    }

    @NotNull
    public final Observable<Map<String, String>> saveMobileConfig(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return m19539q(map, "KEY_MOBILE_CONFIG");
    }

    @NotNull
    public final <T> Observable<T> savePerformanceReports(T t) {
        return m19539q(t, "KEY_PERFORMANCE_REPORTS");
    }

    @NotNull
    public final Observable<List<TopUpPriceListCollection>> savePriceList(@NotNull List<TopUpPriceListCollection> topUpPriceListCollections) {
        Intrinsics.checkNotNullParameter(topUpPriceListCollections, "topUpPriceListCollections");
        return m19539q(topUpPriceListCollections, "KEY_PRICE_LIST");
    }

    @NotNull
    public final Observable<SaleReportListCollection> saveSaleReports(@NotNull SaleReportListCollection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        return m19539q(collection, "KEY_RETAILER_SALE_REPORTS");
    }

    @NotNull
    public final Observable<SessionEntity> saveSession(@NotNull SessionEntity session) {
        Intrinsics.checkNotNullParameter(session, "session");
        return m19539q(session, "KEY_LOGIN_SESSION");
    }

    @NotNull
    public final Observable<SessionEntity> saveSessionWithCompany(@NotNull SessionEntity session, @NotNull XCompany company) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(company, "company");
        return m19539q(session, company == XCompany.TRUE ? "KEY_LOGIN_SESSION_TRUE" : "KEY_LOGIN_SESSION_DTAC");
    }

    @NotNull
    public final Observable<List<StvCollection>> saveStvPackage(@NotNull List<? extends StvCollection> stvCollections) {
        Intrinsics.checkNotNullParameter(stvCollections, "stvCollections");
        return m19539q(stvCollections, "KEY_STV_PACKAGE");
    }

    @NotNull
    public final Observable<StvGroupListCollection> saveStvPhoenixPackage(@NotNull StvGroupListCollection stv) {
        Intrinsics.checkNotNullParameter(stv, "stv");
        return m19539q(stv, "KEY_STV_PHOENIX_PACKAGE");
    }

    @NotNull
    public final Observable<OneCommonTrueLocationResponse> saveTrueLocationData(@NotNull OneCommonTrueLocationResponse collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        return m19539q(collection, "KEY_TRUE_LOCATION_DATA");
    }

    public final void setHeaderApplication(@NotNull String headerApplication) {
        Intrinsics.checkNotNullParameter(headerApplication, "headerApplication");
        this.f83456d = headerApplication;
    }

    @NotNull
    public final Observable<SessionEntity> saveSession(@Nullable String str, @NotNull GetProfileResponse profile, @NotNull String retailerNumber) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(retailerNumber, "retailerNumber");
        return m19539q(mappingSessionEntity(profile, str, retailerNumber), "KEY_LOGIN_SESSION");
    }

    @NotNull
    public final Observable<SessionEntity> saveSessionWithCompany(@Nullable String str, @NotNull Data profile, @NotNull String retailerNumber, @NotNull XCompany company) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(retailerNumber, "retailerNumber");
        Intrinsics.checkNotNullParameter(company, "company");
        XCompany xCompany = XCompany.TRUE;
        return m19539q(oneMappingSessionEntity(profile, company == xCompany ? profile.getTrueCompany() : profile.getDtacCompany(), str, retailerNumber), company == xCompany ? "KEY_LOGIN_SESSION_TRUE" : "KEY_LOGIN_SESSION_DTAC");
    }
}
