package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import android.os.Bundle;
import androidx.autofill.HintConstants;
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
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.WhatNewCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.livedata.ActivityNavEvent;
import th.p047co.dtac.android.dtacone.model.login.LoginCollection;
import th.p047co.dtac.android.dtacone.model.login_mrtr.LoginMrtr;
import th.p047co.dtac.android.dtacone.model.login_mrtr.LoginMrtrRequest;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.constant.UserType;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.util.p052enum.UserNameType;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.view.activity.otp_v3.OtpV3Activity;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.login_mrtr.LoginMrtrViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J-\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJC\u0010\u001f\u001a&\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a \u001b*\u0012\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a\u0018\u00010\u001e0\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 JC\u0010!\u001a&\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a \u001b*\u0012\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a\u0018\u00010\u001e0\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010 J'\u0010$\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b&\u0010%J'\u0010'\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b'\u0010%J\u0015\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0012¢\u0006\u0004\b+\u0010\u0014J\u0015\u0010,\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0012H\u0014¢\u0006\u0004\b.\u0010\u0014J\u000f\u0010/\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR'\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160G0F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR#\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160G0M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR'\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160G0F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010I\u001a\u0004\bT\u0010KR#\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160G0M8\u0006¢\u0006\f\n\u0004\bV\u0010O\u001a\u0004\bW\u0010QR'\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0G0F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010I\u001a\u0004\b[\u0010KR#\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0G0M8\u0006¢\u0006\f\n\u0004\b]\u0010O\u001a\u0004\b^\u0010QR'\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0G0F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010I\u001a\u0004\ba\u0010KR#\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0G0M8\u0006¢\u0006\f\n\u0004\bc\u0010O\u001a\u0004\bd\u0010QR3\u0010j\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020g0f0G0F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010I\u001a\u0004\bi\u0010KR/\u0010m\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020g0f0G0M8\u0006¢\u0006\f\n\u0004\bk\u0010O\u001a\u0004\bl\u0010QR'\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160G0F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010I\u001a\u0004\bo\u0010KR#\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160G0M8\u0006¢\u0006\f\n\u0004\bq\u0010O\u001a\u0004\br\u0010QR'\u0010x\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020u0t0F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010I\u001a\u0004\bw\u0010KR#\u0010{\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020u0t0M8\u0006¢\u0006\f\n\u0004\by\u0010O\u001a\u0004\bz\u0010QR'\u0010~\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160t0F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010I\u001a\u0004\b}\u0010KR%\u0010\u0081\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160t0M8\u0006¢\u0006\r\n\u0004\b\u007f\u0010O\u001a\u0005\b\u0080\u0001\u0010QR*\u0010\u0084\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160t0F8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010I\u001a\u0005\b\u0083\u0001\u0010KR&\u0010\u0087\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160t0M8\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010O\u001a\u0005\b\u0086\u0001\u0010QR)\u0010\u0089\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160t0F8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\bJ\u0010I\u001a\u0005\b\u0088\u0001\u0010KR%\u0010\u008b\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160t0M8\u0006¢\u0006\r\n\u0004\bT\u0010O\u001a\u0005\b\u008a\u0001\u0010QR+\u0010\u008d\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160G0F8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b[\u0010I\u001a\u0005\b\u008c\u0001\u0010KR(\u0010\u0090\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160G0M8\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010O\u001a\u0005\b\u008f\u0001\u0010QR*\u0010\u0093\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0091\u00010G0F8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\bo\u0010I\u001a\u0005\b\u0092\u0001\u0010KR&\u0010\u0095\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0091\u00010G0M8\u0006¢\u0006\r\n\u0004\bi\u0010O\u001a\u0005\b\u0094\u0001\u0010QR*\u0010\u0097\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0G0F8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010I\u001a\u0005\b\u0096\u0001\u0010KR&\u0010\u0099\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0G0M8\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010O\u001a\u0005\b\u0098\u0001\u0010QR)\u0010\u009a\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160t0F8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b}\u0010I\u001a\u0005\b\u008e\u0001\u0010KR%\u0010\u009c\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160t0M8\u0006¢\u0006\r\n\u0004\bw\u0010O\u001a\u0005\b\u009b\u0001\u0010QR+\u0010\u009e\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0091\u00010G0F8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010I\u001a\u0005\b\u009d\u0001\u0010KR'\u0010¡\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0091\u00010G0M8\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010O\u001a\u0005\b \u0001\u0010QR*\u0010¢\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160G0F8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010I\u001a\u0005\b\u009f\u0001\u0010KR&\u0010¤\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160G0M8\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010O\u001a\u0005\b£\u0001\u0010Q¨\u0006¥\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/login_mrtr/LoginMrtrViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/repository/login/LoginRepository;", "loginRepository", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;", "preference", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "rtrRx2Repository", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "errorService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "oneErrorService", "<init>", "(Lth/co/dtac/android/dtacone/repository/login/LoginRepository;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;)V", "", "T", "()V", PDBorderStyleDictionary.STYLE_UNDERLINE, "", "userName", HintConstants.AUTOFILL_HINT_PASSWORD, "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/login_mrtr/LoginMrtrRequest;", "kotlin.jvm.PlatformType", "S", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;", "Lio/reactivex/Observable;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;", "a0", "", "isForceChangedPass", "callApiLogin", "(Ljava/lang/String;Ljava/lang/String;Z)V", "callOneLoginApi", "callAPILoginMrtr", "Lth/co/dtac/android/dtacone/util/enum/UserNameType;", "checkUserTypeByUserName", "(Ljava/lang/String;)Lth/co/dtac/android/dtacone/util/enum/UserNameType;", "onRedirectLogin", "onRedirectForgotPassword", "(Ljava/lang/String;)V", "onCleared", "getRememberUsername", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/login/LoginRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "d", "Lth/co/dtac/android/dtacone/data/cache/preference/PreferencesRepository;", "e", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", OperatorName.CLOSE_PATH, "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "i", "Ljava/lang/String;", "secretKey", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.SET_LINE_JOINSTYLE, "Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", OperatorName.NON_STROKING_CMYK, "Lkotlin/Lazy;", "C", "()Landroidx/lifecycle/MutableLiveData;", "_callGetUserProfile", "Landroidx/lifecycle/LiveData;", OperatorName.LINE_TO, "Landroidx/lifecycle/LiveData;", "getCallGetUserProfile", "()Landroidx/lifecycle/LiveData;", "callGetUserProfile", OperatorName.MOVE_TO, "D", "_forceChangePassword", OperatorName.ENDPATH, "getForceChangePassword", "forceChangePassword", "Lth/co/dtac/android/dtacone/model/WhatNewCollection$Android;", "o", ExifInterface.LONGITUDE_EAST, "_forceUpdate", "p", "getForceUpdate", "forceUpdate", OperatorName.SAVE, OperatorName.RESTORE, "_showForceUpdateDialog", PDPageLabelRange.STYLE_ROMAN_LOWER, "getShowForceUpdateDialog", "showForceUpdateDialog", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/error/ServerErrorException;", OperatorName.CLOSE_AND_STROKE, "H", "_loginFail", "t", "getLoginFail", "loginFail", "u", OperatorName.STROKING_COLOR_GRAY, "_invalidUserPassword", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getInvalidUserPassword", "invalidUserPassword", "Lth/co/dtac/android/dtacone/model/Event;", "Lth/co/dtac/android/dtacone/model/livedata/ActivityNavEvent;", OperatorName.SET_LINE_WIDTH, "L", "_navigateTwoFactor", "x", "getNavigateTwoFactor", "navigateTwoFactor", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "K", "_navigateSellerID", "z", "getNavigateSellerID", "navigateSellerID", "A", "I", "_navigateHome", "B", "getNavigateHome", "navigateHome", OperatorName.SET_LINE_CAPSTYLE, "_navigateOneHome", "getNavigateOneHome", "navigateOneHome", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "_requestOTPEventFirstLogin", "F", "getRequestOTPEventFirstLogin", "requestOTPEventFirstLogin", "", "P", "_showDialogLoginFail", "getShowDialogLoginFail", "showDialogLoginFail", "R", "_showLoginLoading", "getShowLoginLoading", "showLoginLoading", "_forgotPasswordGetOtp", "getForgotPasswordGetOtp", "forgotPasswordGetOtp", "M", "_redirectForgotPasswordFail", "N", "getRedirectForgotPasswordFail", "redirectForgotPasswordFail", "_rememberUserName", "getRememberUserName", "rememberUserName", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.LoginMrtrViewModel */
/* loaded from: classes9.dex */
public final class LoginMrtrViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: A */
    public final Lazy f106129A;

    /* renamed from: B */
    public final LiveData f106130B;

    /* renamed from: C */
    public final Lazy f106131C;

    /* renamed from: D */
    public final LiveData f106132D;

    /* renamed from: E */
    public final Lazy f106133E;

    /* renamed from: F */
    public final LiveData f106134F;

    /* renamed from: G */
    public final Lazy f106135G;

    /* renamed from: H */
    public final LiveData f106136H;

    /* renamed from: I */
    public final Lazy f106137I;

    /* renamed from: J */
    public final LiveData f106138J;

    /* renamed from: K */
    public final Lazy f106139K;

    /* renamed from: L */
    public final LiveData f106140L;

    /* renamed from: M */
    public final Lazy f106141M;

    /* renamed from: N */
    public final LiveData f106142N;

    /* renamed from: O */
    public final Lazy f106143O;

    /* renamed from: P */
    public final LiveData f106144P;

    /* renamed from: b */
    public final LoginRepository f106145b;

    /* renamed from: c */
    public final ConfigurationRepository f106146c;

    /* renamed from: d */
    public final PreferencesRepository f106147d;

    /* renamed from: e */
    public final Rx2ThreadService f106148e;

    /* renamed from: f */
    public final RtrRx2Repository f106149f;

    /* renamed from: g */
    public final MrtrErrorService f106150g;

    /* renamed from: h */
    public final OneErrorService f106151h;

    /* renamed from: i */
    public final String f106152i;

    /* renamed from: j */
    public final CompositeDisposable f106153j;

    /* renamed from: k */
    public final Lazy f106154k;

    /* renamed from: l */
    public final LiveData f106155l;

    /* renamed from: m */
    public final Lazy f106156m;

    /* renamed from: n */
    public final LiveData f106157n;

    /* renamed from: o */
    public final Lazy f106158o;

    /* renamed from: p */
    public final LiveData f106159p;

    /* renamed from: q */
    public final Lazy f106160q;

    /* renamed from: r */
    public final LiveData f106161r;

    /* renamed from: s */
    public final Lazy f106162s;

    /* renamed from: t */
    public final LiveData f106163t;

    /* renamed from: u */
    public final Lazy f106164u;

    /* renamed from: v */
    public final LiveData f106165v;

    /* renamed from: w */
    public final Lazy f106166w;

    /* renamed from: x */
    public final LiveData f106167x;

    /* renamed from: y */
    public final Lazy f106168y;

    /* renamed from: z */
    public final LiveData f106169z;

    @Inject
    public LoginMrtrViewModel(@NotNull LoginRepository loginRepository, @NotNull ConfigurationRepository configurationRepository, @NotNull PreferencesRepository preference, @NotNull Rx2ThreadService threadService, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull MrtrErrorService errorService, @NotNull OneErrorService oneErrorService) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(oneErrorService, "oneErrorService");
        this.f106145b = loginRepository;
        this.f106146c = configurationRepository;
        this.f106147d = preference;
        this.f106148e = threadService;
        this.f106149f = rtrRx2Repository;
        this.f106150g = errorService;
        this.f106151h = oneErrorService;
        this.f106152i = "JfMhPmSpUrXuZw4z6B8EbGdJgNjQmTKl";
        this.f106153j = new CompositeDisposable();
        this.f106154k = LazyKt__LazyJVMKt.lazy(LoginMrtrViewModel$_callGetUserProfile$2.INSTANCE);
        this.f106155l = m2490C();
        this.f106156m = LazyKt__LazyJVMKt.lazy(LoginMrtrViewModel$_forceChangePassword$2.INSTANCE);
        this.f106157n = m2489D();
        this.f106158o = LazyKt__LazyJVMKt.lazy(LoginMrtrViewModel$_forceUpdate$2.INSTANCE);
        this.f106159p = m2488E();
        this.f106160q = LazyKt__LazyJVMKt.lazy(LoginMrtrViewModel$_showForceUpdateDialog$2.INSTANCE);
        this.f106161r = m2476Q();
        this.f106162s = LazyKt__LazyJVMKt.lazy(LoginMrtrViewModel$_loginFail$2.INSTANCE);
        this.f106163t = m2485H();
        this.f106164u = LazyKt__LazyJVMKt.lazy(LoginMrtrViewModel$_invalidUserPassword$2.INSTANCE);
        this.f106165v = m2486G();
        this.f106166w = LazyKt__LazyJVMKt.lazy(LoginMrtrViewModel$_navigateTwoFactor$2.INSTANCE);
        this.f106167x = m2481L();
        this.f106168y = LazyKt__LazyJVMKt.lazy(LoginMrtrViewModel$_navigateSellerID$2.INSTANCE);
        this.f106169z = m2482K();
        this.f106129A = LazyKt__LazyJVMKt.lazy(LoginMrtrViewModel$_navigateHome$2.INSTANCE);
        this.f106130B = m2484I();
        this.f106131C = LazyKt__LazyJVMKt.lazy(LoginMrtrViewModel$_navigateOneHome$2.INSTANCE);
        this.f106132D = m2483J();
        this.f106133E = LazyKt__LazyJVMKt.lazy(LoginMrtrViewModel$_requestOTPEventFirstLogin$2.INSTANCE);
        this.f106134F = m2478O();
        this.f106135G = LazyKt__LazyJVMKt.lazy(LoginMrtrViewModel$_showDialogLoginFail$2.INSTANCE);
        this.f106136H = m2477P();
        this.f106137I = LazyKt__LazyJVMKt.lazy(LoginMrtrViewModel$_showLoginLoading$2.INSTANCE);
        this.f106138J = m2475R();
        this.f106139K = LazyKt__LazyJVMKt.lazy(LoginMrtrViewModel$_forgotPasswordGetOtp$2.INSTANCE);
        this.f106140L = m2487F();
        this.f106141M = LazyKt__LazyJVMKt.lazy(LoginMrtrViewModel$_redirectForgotPasswordFail$2.INSTANCE);
        this.f106142N = m2480M();
        this.f106143O = LazyKt__LazyJVMKt.lazy(LoginMrtrViewModel$_rememberUserName$2.INSTANCE);
        this.f106144P = m2479N();
    }

    /* renamed from: A */
    public static final SingleSource m2492A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (SingleSource) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m2491B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final boolean m2470W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: X */
    public static final LoginCollection m2469X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LoginCollection) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final boolean m2468Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: Z */
    public static final LoginMrtrRequest m2467Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LoginMrtrRequest) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final LoginCollection m2464b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LoginCollection) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final boolean m2462c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    public static /* synthetic */ void callAPILoginMrtr$default(LoginMrtrViewModel loginMrtrViewModel, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        loginMrtrViewModel.callAPILoginMrtr(str, str2, z);
    }

    public static /* synthetic */ void callApiLogin$default(LoginMrtrViewModel loginMrtrViewModel, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        loginMrtrViewModel.callApiLogin(str, str2, z);
    }

    public static /* synthetic */ void callOneLoginApi$default(LoginMrtrViewModel loginMrtrViewModel, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        loginMrtrViewModel.callOneLoginApi(str, str2, z);
    }

    /* renamed from: d0 */
    public static final LoginMrtrRequest m2460d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LoginMrtrRequest) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final SingleSource m2445s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (SingleSource) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m2444t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final LoginMrtrRequest m2443u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LoginMrtrRequest) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final SingleSource m2442v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (SingleSource) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final SingleSource m2441w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (SingleSource) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final LoginMrtrRequest m2440x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (LoginMrtrRequest) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final SingleSource m2439y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (SingleSource) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final SingleSource m2438z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (SingleSource) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public final MutableLiveData m2490C() {
        return (MutableLiveData) this.f106154k.getValue();
    }

    /* renamed from: D */
    public final MutableLiveData m2489D() {
        return (MutableLiveData) this.f106156m.getValue();
    }

    /* renamed from: E */
    public final MutableLiveData m2488E() {
        return (MutableLiveData) this.f106158o.getValue();
    }

    /* renamed from: F */
    public final MutableLiveData m2487F() {
        return (MutableLiveData) this.f106139K.getValue();
    }

    /* renamed from: G */
    public final MutableLiveData m2486G() {
        return (MutableLiveData) this.f106164u.getValue();
    }

    /* renamed from: H */
    public final MutableLiveData m2485H() {
        return (MutableLiveData) this.f106162s.getValue();
    }

    /* renamed from: I */
    public final MutableLiveData m2484I() {
        return (MutableLiveData) this.f106129A.getValue();
    }

    /* renamed from: J */
    public final MutableLiveData m2483J() {
        return (MutableLiveData) this.f106131C.getValue();
    }

    /* renamed from: K */
    public final MutableLiveData m2482K() {
        return (MutableLiveData) this.f106168y.getValue();
    }

    /* renamed from: L */
    public final MutableLiveData m2481L() {
        return (MutableLiveData) this.f106166w.getValue();
    }

    /* renamed from: M */
    public final MutableLiveData m2480M() {
        return (MutableLiveData) this.f106141M.getValue();
    }

    /* renamed from: N */
    public final MutableLiveData m2479N() {
        return (MutableLiveData) this.f106143O.getValue();
    }

    /* renamed from: O */
    public final MutableLiveData m2478O() {
        return (MutableLiveData) this.f106133E.getValue();
    }

    /* renamed from: P */
    public final MutableLiveData m2477P() {
        return (MutableLiveData) this.f106135G.getValue();
    }

    /* renamed from: Q */
    public final MutableLiveData m2476Q() {
        return (MutableLiveData) this.f106160q.getValue();
    }

    /* renamed from: R */
    public final MutableLiveData m2475R() {
        return (MutableLiveData) this.f106137I.getValue();
    }

    /* renamed from: S */
    public final Single m2474S(String str, String str2) {
        Observable m2466a0;
        if (str.length() == 0) {
            m2466a0 = Observable.error(new ValidatedRuleException(R.string.common_please_enter_username_phone_number));
        } else if (Intrinsics.areEqual(UserNameType.TELEPHONE_NUMBER.INSTANCE, checkUserTypeByUserName(str))) {
            m2466a0 = m2471V(str, str2);
        } else {
            m2466a0 = m2466a0(str, str2);
        }
        Single fromObservable = Single.fromObservable(m2466a0);
        Intrinsics.checkNotNullExpressionValue(fromObservable, "fromObservable(when {\n  …ssword = password)\n    })");
        return fromObservable;
    }

    /* renamed from: T */
    public final void m2473T() {
        m2490C().setValue(Resource.Companion.success(this.f106145b.getModel().getToken()));
    }

    /* renamed from: U */
    public final void m2472U() {
        this.f106147d.setBoolean(Constant.REQUIRE_CALL_CAMPAIGN_REDEMPTION, true);
        this.f106147d.setBoolean(Constant.REQUIRE_CALL_CAMPAIGN_COUNT, true);
        this.f106147d.setBoolean(Constant.CAMPAIGN_REDEMPTION_BACK_TO_HOME, false);
        LoginMrtr model = this.f106145b.getModel();
        if (model.isForceChangePassword()) {
            m2489D().setValue(Resource.Companion.success(this.f106145b.getUserName()));
        } else if (model.isRequire2Factor()) {
            Bundle bundle = new Bundle();
            bundle.putString(Constant.BUNDLE_MOBILE_NUMBER, model.getTelephoneNumber());
            m2481L().setValue(new Event(new ActivityNavEvent(OtpV3Activity.class, bundle)));
        } else {
            m2490C().setValue(Resource.Companion.success(model.getToken()));
        }
    }

    /* renamed from: V */
    public final Observable m2471V(String str, String str2) {
        Observable just = Observable.just(str);
        final LoginMrtrViewModel$validateTelephoneNumber$1 loginMrtrViewModel$validateTelephoneNumber$1 = LoginMrtrViewModel$validateTelephoneNumber$1.INSTANCE;
        Observable filter = just.filter(new Predicate() { // from class: ql0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m2470W;
                m2470W = LoginMrtrViewModel.m2470W(loginMrtrViewModel$validateTelephoneNumber$1, obj);
                return m2470W;
            }
        });
        final LoginMrtrViewModel$validateTelephoneNumber$2 loginMrtrViewModel$validateTelephoneNumber$2 = new LoginMrtrViewModel$validateTelephoneNumber$2(str2);
        Observable map = filter.map(new Function() { // from class: rl0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                LoginCollection m2469X;
                m2469X = LoginMrtrViewModel.m2469X(loginMrtrViewModel$validateTelephoneNumber$2, obj);
                return m2469X;
            }
        });
        final LoginMrtrViewModel$validateTelephoneNumber$3 loginMrtrViewModel$validateTelephoneNumber$3 = LoginMrtrViewModel$validateTelephoneNumber$3.INSTANCE;
        Observable filter2 = map.filter(new Predicate() { // from class: sl0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m2468Y;
                m2468Y = LoginMrtrViewModel.m2468Y(loginMrtrViewModel$validateTelephoneNumber$3, obj);
                return m2468Y;
            }
        });
        final LoginMrtrViewModel$validateTelephoneNumber$4 loginMrtrViewModel$validateTelephoneNumber$4 = new LoginMrtrViewModel$validateTelephoneNumber$4(str2, this);
        return filter2.map(new Function() { // from class: tl0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                LoginMrtrRequest m2467Z;
                m2467Z = LoginMrtrViewModel.m2467Z(Function1.this, obj);
                return m2467Z;
            }
        });
    }

    /* renamed from: a0 */
    public final Observable m2466a0(String str, String str2) {
        Observable just = Observable.just(str);
        final LoginMrtrViewModel$validateUsername$1 loginMrtrViewModel$validateUsername$1 = new LoginMrtrViewModel$validateUsername$1(str2);
        Observable map = just.map(new Function() { // from class: ul0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                LoginCollection m2464b0;
                m2464b0 = LoginMrtrViewModel.m2464b0(loginMrtrViewModel$validateUsername$1, obj);
                return m2464b0;
            }
        });
        final LoginMrtrViewModel$validateUsername$2 loginMrtrViewModel$validateUsername$2 = LoginMrtrViewModel$validateUsername$2.INSTANCE;
        Observable filter = map.filter(new Predicate() { // from class: vl0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m2462c0;
                m2462c0 = LoginMrtrViewModel.m2462c0(loginMrtrViewModel$validateUsername$2, obj);
                return m2462c0;
            }
        });
        final LoginMrtrViewModel$validateUsername$3 loginMrtrViewModel$validateUsername$3 = new LoginMrtrViewModel$validateUsername$3(str2, this);
        return filter.map(new Function() { // from class: wl0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                LoginMrtrRequest m2460d0;
                m2460d0 = LoginMrtrViewModel.m2460d0(Function1.this, obj);
                return m2460d0;
            }
        });
    }

    public final void callAPILoginMrtr(@NotNull String userName, @NotNull String password, boolean z) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(password, "password");
        PreferencesRepository preferencesRepository = this.f106147d;
        preferencesRepository.setBoolean(Constant.PREF_IS_FIRST_LOGIN, true);
        preferencesRepository.setString(Constant.PROFILE_IMAGE_URL, "");
        Single m2474S = m2474S(userName, password);
        final LoginMrtrViewModel$callAPILoginMrtr$2 loginMrtrViewModel$callAPILoginMrtr$2 = new LoginMrtrViewModel$callAPILoginMrtr$2(this, userName);
        Single map = m2474S.map(new Function() { // from class: Bl0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                LoginMrtrRequest m2443u;
                m2443u = LoginMrtrViewModel.m2443u(loginMrtrViewModel$callAPILoginMrtr$2, obj);
                return m2443u;
            }
        });
        final LoginMrtrViewModel$callAPILoginMrtr$3 loginMrtrViewModel$callAPILoginMrtr$3 = new LoginMrtrViewModel$callAPILoginMrtr$3(this);
        Single flatMap = map.flatMap(new Function() { // from class: Cl0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource m2442v;
                m2442v = LoginMrtrViewModel.m2442v(loginMrtrViewModel$callAPILoginMrtr$3, obj);
                return m2442v;
            }
        });
        final LoginMrtrViewModel$callAPILoginMrtr$4 loginMrtrViewModel$callAPILoginMrtr$4 = new LoginMrtrViewModel$callAPILoginMrtr$4(this, userName);
        Single flatMap2 = flatMap.flatMap(new Function() { // from class: Dl0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource m2441w;
                m2441w = LoginMrtrViewModel.m2441w(loginMrtrViewModel$callAPILoginMrtr$4, obj);
                return m2441w;
            }
        });
        final LoginMrtrViewModel$callAPILoginMrtr$5 loginMrtrViewModel$callAPILoginMrtr$5 = new LoginMrtrViewModel$callAPILoginMrtr$5(this);
        Single compose = flatMap2.flatMap(new Function() { // from class: El0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource m2445s;
                m2445s = LoginMrtrViewModel.m2445s(loginMrtrViewModel$callAPILoginMrtr$5, obj);
                return m2445s;
            }
        }).compose(this.f106148e.applySingleAsync());
        final LoginMrtrViewModel$callAPILoginMrtr$6 loginMrtrViewModel$callAPILoginMrtr$6 = new LoginMrtrViewModel$callAPILoginMrtr$6(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Fl0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LoginMrtrViewModel.m2444t(loginMrtrViewModel$callAPILoginMrtr$6, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun callAPILoginMrtr(use… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new LoginMrtrViewModel$callAPILoginMrtr$7(this, userName), new LoginMrtrViewModel$callAPILoginMrtr$8(this, userName, z)), this.f106153j);
    }

    public final void callApiLogin(@NotNull String userName, @NotNull String password, boolean z) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(password, "password");
        if (Intrinsics.areEqual(checkUserTypeByUserName(userName), UserNameType.TELEPHONE_NUMBER.INSTANCE)) {
            callOneLoginApi(userName, password, z);
        } else {
            callAPILoginMrtr(userName, password, z);
        }
    }

    public final void callOneLoginApi(@NotNull String userName, @NotNull String password, boolean z) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(password, "password");
        PreferencesRepository preferencesRepository = this.f106147d;
        preferencesRepository.setBoolean(Constant.PREF_IS_FIRST_LOGIN, true);
        preferencesRepository.setString(Constant.PROFILE_IMAGE_URL, "");
        Single m2474S = m2474S(userName, password);
        final LoginMrtrViewModel$callOneLoginApi$2 loginMrtrViewModel$callOneLoginApi$2 = new LoginMrtrViewModel$callOneLoginApi$2(this, userName);
        Single map = m2474S.map(new Function() { // from class: pl0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                LoginMrtrRequest m2440x;
                m2440x = LoginMrtrViewModel.m2440x(loginMrtrViewModel$callOneLoginApi$2, obj);
                return m2440x;
            }
        });
        final LoginMrtrViewModel$callOneLoginApi$3 loginMrtrViewModel$callOneLoginApi$3 = new LoginMrtrViewModel$callOneLoginApi$3(this);
        Single flatMap = map.flatMap(new Function() { // from class: xl0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource m2439y;
                m2439y = LoginMrtrViewModel.m2439y(Function1.this, obj);
                return m2439y;
            }
        });
        final LoginMrtrViewModel$callOneLoginApi$4 loginMrtrViewModel$callOneLoginApi$4 = new LoginMrtrViewModel$callOneLoginApi$4(this, userName);
        Single flatMap2 = flatMap.flatMap(new Function() { // from class: yl0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource m2438z;
                m2438z = LoginMrtrViewModel.m2438z(Function1.this, obj);
                return m2438z;
            }
        });
        final LoginMrtrViewModel$callOneLoginApi$5 loginMrtrViewModel$callOneLoginApi$5 = new LoginMrtrViewModel$callOneLoginApi$5(this);
        Single compose = flatMap2.flatMap(new Function() { // from class: zl0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource m2492A;
                m2492A = LoginMrtrViewModel.m2492A(Function1.this, obj);
                return m2492A;
            }
        }).compose(this.f106148e.applySingleAsync());
        final LoginMrtrViewModel$callOneLoginApi$6 loginMrtrViewModel$callOneLoginApi$6 = new LoginMrtrViewModel$callOneLoginApi$6(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Al0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LoginMrtrViewModel.m2491B(loginMrtrViewModel$callOneLoginApi$6, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun callOneLoginApi(user… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new LoginMrtrViewModel$callOneLoginApi$7(this, userName), new LoginMrtrViewModel$callOneLoginApi$8(this, userName, z)), this.f106153j);
    }

    @NotNull
    public final UserNameType checkUserTypeByUserName(@NotNull String userName) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        return this.f106145b.checkUserTypeByUserName(userName);
    }

    @NotNull
    public final LiveData<Resource<String>> getCallGetUserProfile() {
        return this.f106155l;
    }

    @NotNull
    public final LiveData<Resource<String>> getForceChangePassword() {
        return this.f106157n;
    }

    @NotNull
    public final LiveData<Resource<WhatNewCollection.Android>> getForceUpdate() {
        return this.f106159p;
    }

    @NotNull
    public final LiveData<Event<String>> getForgotPasswordGetOtp() {
        return this.f106140L;
    }

    @NotNull
    public final LiveData<Resource<String>> getInvalidUserPassword() {
        return this.f106165v;
    }

    @NotNull
    public final LiveData<Resource<Pair<String, ServerErrorException>>> getLoginFail() {
        return this.f106163t;
    }

    @NotNull
    public final LiveData<Event<String>> getNavigateHome() {
        return this.f106130B;
    }

    @NotNull
    public final LiveData<Event<String>> getNavigateOneHome() {
        return this.f106132D;
    }

    @NotNull
    public final LiveData<Event<String>> getNavigateSellerID() {
        return this.f106169z;
    }

    @NotNull
    public final LiveData<Event<ActivityNavEvent>> getNavigateTwoFactor() {
        return this.f106167x;
    }

    @NotNull
    public final LiveData<Resource<Integer>> getRedirectForgotPasswordFail() {
        return this.f106142N;
    }

    @NotNull
    public final LiveData<Resource<String>> getRememberUserName() {
        return this.f106144P;
    }

    @Nullable
    public final String getRememberUsername() {
        String string = this.f106147d.getString(Constant.SHARE_REMEMBER_USERNAME, "");
        if (!StringUtil.hasText(string)) {
            return "";
        }
        return PhoneNumberFormat.removeDashCharacter(string);
    }

    @NotNull
    public final LiveData<Resource<String>> getRequestOTPEventFirstLogin() {
        return this.f106134F;
    }

    @NotNull
    public final LiveData<Resource<Integer>> getShowDialogLoginFail() {
        return this.f106136H;
    }

    @NotNull
    public final LiveData<Resource<WhatNewCollection.Android>> getShowForceUpdateDialog() {
        return this.f106161r;
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getShowLoginLoading() {
        return this.f106138J;
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f106153j.dispose();
    }

    public final void onRedirectForgotPassword(@NotNull String userName) {
        Resource success;
        Intrinsics.checkNotNullParameter(userName, "userName");
        if (Intrinsics.areEqual(checkUserTypeByUserName(userName), UserNameType.TELEPHONE_NUMBER.INSTANCE)) {
            m2487F().setValue(new Event(userName));
            return;
        }
        MutableLiveData m2480M = m2480M();
        if (userName.length() == 0) {
            success = Resource.Companion.success(Integer.valueOf(R.string.common_please_enter_username_phone_number));
        } else {
            success = Resource.Companion.success(Integer.valueOf(R.string.one_user_lan_password));
        }
        m2480M.setValue(success);
    }

    public final void onRedirectLogin() {
        String userType = this.f106145b.getUserType();
        if (userType != null) {
            String str = "";
            if (Intrinsics.areEqual(userType, UserType.PROMOTER)) {
                MutableLiveData m2482K = m2482K();
                String userName = this.f106145b.getUserName();
                if (userName != null) {
                    str = userName;
                }
                m2482K.setValue(new Event(str));
                return;
            }
            String userFormatType = this.f106145b.getUserFormatType();
            if (userFormatType == null) {
                userFormatType = UserNameType.USER_LAN.INSTANCE.getUserFormatType();
            }
            if (Intrinsics.areEqual(userFormatType, UserNameType.TELEPHONE_NUMBER.INSTANCE.getUserFormatType())) {
                MutableLiveData m2483J = m2483J();
                String userName2 = this.f106145b.getUserName();
                if (userName2 != null) {
                    str = userName2;
                }
                m2483J.setValue(new Event(str));
                return;
            }
            MutableLiveData m2484I = m2484I();
            String userName3 = this.f106145b.getUserName();
            if (userName3 != null) {
                str = userName3;
            }
            m2484I.setValue(new Event(str));
        }
    }
}