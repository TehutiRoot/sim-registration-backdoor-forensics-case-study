package co.omise.android;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import ch.qos.logback.core.CoreConstants;
import com.netcetera.threeds.sdk.api.ThreeDS2Service;
import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;
import com.netcetera.threeds.sdk.api.transaction.Transaction;
import com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters;
import com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J\b\u0010 \u001a\u00020\u0012H\u0002J*\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\"2\u0006\u0010#\u001a\u00020$H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b%\u0010&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, m29142d2 = {"Lco/omise/android/ThreeDS2ServiceWrapper;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "threeDS2Service", "Lcom/netcetera/threeds/sdk/api/ThreeDS2Service;", "uiCustomizationMap", "", "Lcom/netcetera/threeds/sdk/api/ui/logic/UiCustomization$UiCustomizationType;", "Lcom/netcetera/threeds/sdk/api/ui/logic/UiCustomization;", "(Landroid/content/Context;Lcom/netcetera/threeds/sdk/api/ThreeDS2Service;Ljava/util/Map;)V", "<set-?>", "Lcom/netcetera/threeds/sdk/api/transaction/Transaction;", "transaction", "getTransaction", "()Lcom/netcetera/threeds/sdk/api/transaction/Transaction;", "createTransaction", "directoryServerId", "", "messageVersion", "doChallenge", "", "activity", "Landroid/app/Activity;", "challengeParameters", "Lcom/netcetera/threeds/sdk/api/transaction/challenge/ChallengeParameters;", "receiver", "Lcom/netcetera/threeds/sdk/api/transaction/challenge/ChallengeStatusReceiver;", "maxTimeout", "", "formatPemCertificate", "input", "getLocale", "initialize", "Lkotlin/Result;", "netceteraConfig", "Lco/omise/android/models/NetceteraConfig;", "initialize-gIAlu-s", "(Lco/omise/android/models/NetceteraConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class ThreeDS2ServiceWrapper {
    @NotNull
    private final Context context;
    @NotNull
    private final ThreeDS2Service threeDS2Service;
    private Transaction transaction;
    @NotNull
    private final Map<UiCustomization.UiCustomizationType, UiCustomization> uiCustomizationMap;

    /* renamed from: co.omise.android.ThreeDS2ServiceWrapper$a */
    /* loaded from: classes2.dex */
    public static final class C5509a extends ContinuationImpl {

        /* renamed from: a */
        Object f40238a;

        /* renamed from: b */
        Object f40239b;

        /* renamed from: c */
        /* synthetic */ Object f40240c;

        /* renamed from: e */
        int f40242e;

        public C5509a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f40240c = obj;
            this.f40242e |= Integer.MIN_VALUE;
            Object m74098initializegIAlus = ThreeDS2ServiceWrapper.this.m74098initializegIAlus(null, this);
            return m74098initializegIAlus == AbstractC19782eg0.getCOROUTINE_SUSPENDED() ? m74098initializegIAlus : Result.m74270boximpl(m74098initializegIAlus);
        }
    }

    public ThreeDS2ServiceWrapper(@NotNull Context context, @NotNull ThreeDS2Service threeDS2Service, @NotNull Map<UiCustomization.UiCustomizationType, UiCustomization> uiCustomizationMap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(threeDS2Service, "threeDS2Service");
        Intrinsics.checkNotNullParameter(uiCustomizationMap, "uiCustomizationMap");
        this.context = context;
        this.threeDS2Service = threeDS2Service;
        this.uiCustomizationMap = uiCustomizationMap;
    }

    private final String formatPemCertificate(String str) {
        return AbstractC19741eO1.replace$default(AbstractC19741eO1.replace$default(AbstractC19741eO1.replace$default(str, "-----BEGIN CERTIFICATE-----", "", false, 4, (Object) null), "-----END CERTIFICATE-----", "", false, 4, (Object) null), "\r\n", "", false, 4, (Object) null);
    }

    private final String getLocale() {
        Locale locale;
        LocaleList locales;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = this.context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
        } else {
            locale = this.context.getResources().getConfiguration().locale;
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        return language + '-' + country;
    }

    @NotNull
    public final Transaction createTransaction(@NotNull String directoryServerId, @NotNull String messageVersion) {
        Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        Transaction createTransaction = this.threeDS2Service.createTransaction(directoryServerId, messageVersion);
        Intrinsics.checkNotNullExpressionValue(createTransaction, "threeDS2Service.createTr…ServerId, messageVersion)");
        this.transaction = createTransaction;
        return getTransaction();
    }

    public final void doChallenge(@NotNull Activity activity, @NotNull ChallengeParameters challengeParameters, @NotNull ChallengeStatusReceiver receiver, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(challengeParameters, "challengeParameters");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        getTransaction().doChallenge(activity, challengeParameters, receiver, i);
    }

    @NotNull
    public final Transaction getTransaction() {
        Transaction transaction = this.transaction;
        if (transaction != null) {
            return transaction;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transaction");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: initialize-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m74098initializegIAlus(@org.jetbrains.annotations.NotNull co.omise.android.models.NetceteraConfig r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r10) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: co.omise.android.ThreeDS2ServiceWrapper.m74098initializegIAlus(co.omise.android.models.NetceteraConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }
}