package co.omise.android.p009ui;

import android.app.Activity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import ch.qos.logback.classic.spi.CallerData;
import co.omise.android.AuthorizingPaymentURLVerifier;
import co.omise.android.OmiseException;
import co.omise.android.ThreeDS2ServiceWrapper;
import co.omise.android.api.Client;
import co.omise.android.models.Authentication;
import com.google.firebase.messaging.Constants;
import com.netcetera.threeds.sdk.api.transaction.Transaction;
import com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters;
import com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver;
import com.netcetera.threeds.sdk.api.transaction.challenge.events.CompletionEvent;
import com.netcetera.threeds.sdk.api.transaction.challenge.events.ProtocolErrorEvent;
import com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0017\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\b-J\u000e\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u000202J\u0012\u00103\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u000104H\u0016J\u0012\u00105\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u000106H\u0016J\u0019\u00107\u001a\u00020'2\u0006\u00108\u001a\u000209H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010:J\b\u0010;\u001a\u00020'H\u0016R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, m28850d2 = {"Lco/omise/android/ui/AuthorizingPaymentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/netcetera/threeds/sdk/api/transaction/challenge/ChallengeStatusReceiver;", "client", "Lco/omise/android/api/Client;", "urlVerifier", "Lco/omise/android/AuthorizingPaymentURLVerifier;", "threeDS2Service", "Lco/omise/android/ThreeDS2ServiceWrapper;", "passedThreeDSRequestorAppURL", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lco/omise/android/api/Client;Lco/omise/android/AuthorizingPaymentURLVerifier;Lco/omise/android/ThreeDS2ServiceWrapper;Ljava/lang/String;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_authenticationStatus", "Landroidx/lifecycle/MutableLiveData;", "Lco/omise/android/models/Authentication$AuthenticationStatus;", "_error", "Lco/omise/android/OmiseException;", "_isLoading", "", "_transactionStatus", "Lco/omise/android/ui/TransactionStatus;", "authenticationResponse", "Lco/omise/android/models/Authentication;", "authenticationStatus", "Landroidx/lifecycle/LiveData;", "getAuthenticationStatus", "()Landroidx/lifecycle/LiveData;", "configProvider", "LThreeDSConfigProvider;", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "getError", "isLoading", "transactionStatus", "getTransactionStatus", "cancelled", "", "completed", "event", "Lcom/netcetera/threeds/sdk/api/transaction/challenge/events/CompletionEvent;", "createThreeDSRequestorAppURL", "sdkTransID", "createThreeDSRequestorAppURL$sdk_productionRelease", "doChallenge", "activity", "Landroid/app/Activity;", "getTransaction", "Lcom/netcetera/threeds/sdk/api/transaction/Transaction;", "protocolError", "Lcom/netcetera/threeds/sdk/api/transaction/challenge/events/ProtocolErrorEvent;", "runtimeError", "Lcom/netcetera/threeds/sdk/api/transaction/challenge/events/RuntimeErrorEvent;", "sendAuthenticationRequest", "netceteraConfig", "Lco/omise/android/models/NetceteraConfig;", "(Lco/omise/android/models/NetceteraConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timedout", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.AuthorizingPaymentViewModel */
/* loaded from: classes3.dex */
public final class AuthorizingPaymentViewModel extends ViewModel implements ChallengeStatusReceiver {
    @NotNull
    private final MutableLiveData<Authentication.AuthenticationStatus> _authenticationStatus;
    @NotNull
    private final MutableLiveData<OmiseException> _error;
    @NotNull
    private final MutableLiveData<Boolean> _isLoading;
    @NotNull
    private final MutableLiveData<TransactionStatus> _transactionStatus;
    @NotNull
    private final MutableLiveData<Authentication> authenticationResponse;
    @NotNull
    private final LiveData<Authentication.AuthenticationStatus> authenticationStatus;
    @NotNull
    private final Client client;
    @NotNull
    private final ThreeDSConfigProvider configProvider;
    @NotNull
    private final CoroutineExceptionHandler coroutineExceptionHandler;
    @NotNull
    private final LiveData<OmiseException> error;
    @NotNull
    private final LiveData<Boolean> isLoading;
    @NotNull
    private final String passedThreeDSRequestorAppURL;
    @NotNull
    private final ThreeDS2ServiceWrapper threeDS2Service;
    @NotNull
    private final LiveData<TransactionStatus> transactionStatus;
    @NotNull
    private final AuthorizingPaymentURLVerifier urlVerifier;

    /* renamed from: co.omise.android.ui.AuthorizingPaymentViewModel$a */
    /* loaded from: classes3.dex */
    public static final class C5555a extends SuspendLambda implements Function2 {

        /* renamed from: a */
        Object f40287a;

        /* renamed from: b */
        Object f40288b;

        /* renamed from: c */
        int f40289c;

        public C5555a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C5555a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C5555a(continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
                int r1 = r8.f40289c
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L3c
                if (r1 == r5) goto L2e
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                kotlin.ResultKt.throwOnFailure(r9)
                goto Lc5
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f40287a
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                kotlin.ResultKt.throwOnFailure(r9)
                kotlin.Result r9 = (kotlin.Result) r9
                java.lang.Object r9 = r9.m74096unboximpl()
                goto L9a
            L2e:
                java.lang.Object r1 = r8.f40288b
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r5 = r8.f40287a
                kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
                kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L3a
                goto L64
            L3a:
                r9 = move-exception
                goto L6a
            L3c:
                kotlin.ResultKt.throwOnFailure(r9)
                co.omise.android.ui.AuthorizingPaymentViewModel r9 = co.omise.android.p009ui.AuthorizingPaymentViewModel.this
                co.omise.android.AuthorizingPaymentURLVerifier r9 = co.omise.android.p009ui.AuthorizingPaymentViewModel.access$getUrlVerifier$p(r9)
                boolean r9 = r9.verifyExternalURL()
                if (r9 != 0) goto Lc5
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                co.omise.android.ui.AuthorizingPaymentViewModel r9 = co.omise.android.p009ui.AuthorizingPaymentViewModel.this     // Catch: java.lang.Exception -> L68
                ThreeDSConfigProvider r9 = co.omise.android.p009ui.AuthorizingPaymentViewModel.access$getConfigProvider$p(r9)     // Catch: java.lang.Exception -> L68
                r8.f40287a = r1     // Catch: java.lang.Exception -> L68
                r8.f40288b = r1     // Catch: java.lang.Exception -> L68
                r8.f40289c = r5     // Catch: java.lang.Exception -> L68
                java.lang.Object r9 = r9.getThreeDSConfigs(r8)     // Catch: java.lang.Exception -> L68
                if (r9 != r0) goto L63
                return r0
            L63:
                r5 = r1
            L64:
                r1.element = r9     // Catch: java.lang.Exception -> L3a
            L66:
                r1 = r5
                goto L7f
            L68:
                r9 = move-exception
                r5 = r1
            L6a:
                co.omise.android.ui.AuthorizingPaymentViewModel r1 = co.omise.android.p009ui.AuthorizingPaymentViewModel.this
                androidx.lifecycle.MutableLiveData r1 = co.omise.android.p009ui.AuthorizingPaymentViewModel.access$get_error$p(r1)
                co.omise.android.OmiseException r6 = new co.omise.android.OmiseException
                co.omise.android.ui.OmiseSDKError r7 = co.omise.android.p009ui.OmiseSDKError.UNABLE_TO_GET_CONFIGS
                java.lang.String r7 = r7.getValue()
                r6.<init>(r7, r9)
                r1.postValue(r6)
                goto L66
            L7f:
                T r9 = r1.element
                if (r9 == 0) goto Lc5
                co.omise.android.ui.AuthorizingPaymentViewModel r9 = co.omise.android.p009ui.AuthorizingPaymentViewModel.this
                co.omise.android.ThreeDS2ServiceWrapper r9 = co.omise.android.p009ui.AuthorizingPaymentViewModel.access$getThreeDS2Service$p(r9)
                T r5 = r1.element
                co.omise.android.models.NetceteraConfig r5 = (co.omise.android.models.NetceteraConfig) r5
                r8.f40287a = r1
                r8.f40288b = r2
                r8.f40289c = r4
                java.lang.Object r9 = r9.m73914initializegIAlus(r5, r8)
                if (r9 != r0) goto L9a
                return r0
            L9a:
                co.omise.android.ui.AuthorizingPaymentViewModel r4 = co.omise.android.p009ui.AuthorizingPaymentViewModel.this
                java.lang.Throwable r5 = kotlin.Result.m74090exceptionOrNullimpl(r9)
                if (r5 != 0) goto Lb3
                kotlin.Unit r9 = (kotlin.Unit) r9
                T r9 = r1.element
                co.omise.android.models.NetceteraConfig r9 = (co.omise.android.models.NetceteraConfig) r9
                r8.f40287a = r2
                r8.f40289c = r3
                java.lang.Object r9 = co.omise.android.p009ui.AuthorizingPaymentViewModel.access$sendAuthenticationRequest(r4, r9, r8)
                if (r9 != r0) goto Lc5
                return r0
            Lb3:
                androidx.lifecycle.MutableLiveData r9 = co.omise.android.p009ui.AuthorizingPaymentViewModel.access$get_error$p(r4)
                co.omise.android.OmiseException r0 = new co.omise.android.OmiseException
                co.omise.android.ui.OmiseSDKError r1 = co.omise.android.p009ui.OmiseSDKError.THREE_DS2_INITIALIZATION_FAILED
                java.lang.String r1 = r1.getValue()
                r0.<init>(r1, r5)
                r9.postValue(r0)
            Lc5:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: co.omise.android.p009ui.AuthorizingPaymentViewModel.C5555a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: co.omise.android.ui.AuthorizingPaymentViewModel$b */
    /* loaded from: classes3.dex */
    public static final class C5556b extends ContinuationImpl {

        /* renamed from: a */
        Object f40291a;

        /* renamed from: b */
        Object f40292b;

        /* renamed from: c */
        /* synthetic */ Object f40293c;

        /* renamed from: e */
        int f40295e;

        public C5556b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f40293c = obj;
            this.f40295e |= Integer.MIN_VALUE;
            return AuthorizingPaymentViewModel.this.sendAuthenticationRequest(null, this);
        }
    }

    public /* synthetic */ AuthorizingPaymentViewModel(Client client, AuthorizingPaymentURLVerifier authorizingPaymentURLVerifier, ThreeDS2ServiceWrapper threeDS2ServiceWrapper, String str, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(client, authorizingPaymentURLVerifier, threeDS2ServiceWrapper, str, (i & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e7 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:12:0x002e, B:23:0x00dd, B:25:0x00e7, B:26:0x00f3), top: B:33:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendAuthenticationRequest(co.omise.android.models.NetceteraConfig r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: co.omise.android.p009ui.AuthorizingPaymentViewModel.sendAuthenticationRequest(co.omise.android.models.NetceteraConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver
    public void cancelled() {
        this._error.postValue(new OmiseException(ChallengeStatus.CANCELLED.getValue(), null, 2, null));
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver
    public void completed(@Nullable CompletionEvent completionEvent) {
        String str;
        String str2;
        if (completionEvent != null) {
            str = completionEvent.getTransactionStatus();
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str, "Y")) {
            this._transactionStatus.postValue(TransactionStatus.AUTHENTICATED);
        } else if (Intrinsics.areEqual(str, "N")) {
            this._transactionStatus.postValue(TransactionStatus.NOT_AUTHENTICATED);
        } else {
            MutableLiveData<OmiseException> mutableLiveData = this._error;
            ChallengeStatus challengeStatus = ChallengeStatus.COMPLETED_WITH_UNKNOWN_STATUS;
            if (completionEvent != null) {
                str2 = completionEvent.getTransactionStatus();
            } else {
                str2 = null;
            }
            mutableLiveData.postValue(new OmiseException(challengeStatus.includeUnknownTransactionStatusWithError(str2), null, 2, null));
        }
    }

    @NotNull
    public final String createThreeDSRequestorAppURL$sdk_productionRelease(@Nullable String str) {
        String str2 = this.passedThreeDSRequestorAppURL;
        String str3 = CallerData.f39639NA;
        if (StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) CallerData.f39639NA, false, 2, (Object) null)) {
            str3 = "&";
        }
        return this.passedThreeDSRequestorAppURL + str3 + "transID=" + str;
    }

    public final void doChallenge(@NotNull Activity activity) {
        Authentication.ARes ares;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Authentication value = this.authenticationResponse.getValue();
        if (value != null && (ares = value.getAres()) != null) {
            ChallengeParameters challengeParameters = new ChallengeParameters();
            challengeParameters.set3DSServerTransactionID(ares.getThreeDSServerTransID());
            challengeParameters.setThreeDSRequestorAppURL(createThreeDSRequestorAppURL$sdk_productionRelease(ares.getSdkTransID()));
            challengeParameters.setAcsTransactionID(ares.getAcsTransID());
            challengeParameters.setAcsRefNumber(ares.getAcsReferenceNumber());
            challengeParameters.setAcsSignedContent(ares.getAcsSignedContent());
            try {
                this.threeDS2Service.doChallenge(activity, challengeParameters, this, 5);
            } catch (Exception e) {
                this._error.postValue(new OmiseException(ChallengeStatus.FAILED.getValue(), e));
            }
        }
    }

    @NotNull
    public final LiveData<Authentication.AuthenticationStatus> getAuthenticationStatus() {
        return this.authenticationStatus;
    }

    @NotNull
    public final LiveData<OmiseException> getError() {
        return this.error;
    }

    @NotNull
    public final Transaction getTransaction() {
        return this.threeDS2Service.getTransaction();
    }

    @NotNull
    public final LiveData<TransactionStatus> getTransactionStatus() {
        return this.transactionStatus;
    }

    @NotNull
    public final LiveData<Boolean> isLoading() {
        return this.isLoading;
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver
    public void protocolError(@Nullable ProtocolErrorEvent protocolErrorEvent) {
        this._error.postValue(new OmiseException(ChallengeStatus.PROTOCOL_ERROR.getValue(), null, 2, null));
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver
    public void runtimeError(@Nullable RuntimeErrorEvent runtimeErrorEvent) {
        this._error.postValue(new OmiseException(ChallengeStatus.RUNTIME_ERROR.getValue(), null, 2, null));
    }

    @Override // com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver
    public void timedout() {
        this._error.postValue(new OmiseException(ChallengeStatus.TIMED_OUT.getValue(), null, 2, null));
    }

    public AuthorizingPaymentViewModel(@NotNull Client client, @NotNull AuthorizingPaymentURLVerifier urlVerifier, @NotNull ThreeDS2ServiceWrapper threeDS2Service, @NotNull String passedThreeDSRequestorAppURL, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(urlVerifier, "urlVerifier");
        Intrinsics.checkNotNullParameter(threeDS2Service, "threeDS2Service");
        Intrinsics.checkNotNullParameter(passedThreeDSRequestorAppURL, "passedThreeDSRequestorAppURL");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.client = client;
        this.urlVerifier = urlVerifier;
        this.threeDS2Service = threeDS2Service;
        this.passedThreeDSRequestorAppURL = passedThreeDSRequestorAppURL;
        this.configProvider = new ThreeDSConfigProvider(urlVerifier, client);
        MutableLiveData<Authentication.AuthenticationStatus> mutableLiveData = new MutableLiveData<>();
        this._authenticationStatus = mutableLiveData;
        this.authenticationStatus = mutableLiveData;
        MutableLiveData<TransactionStatus> mutableLiveData2 = new MutableLiveData<>();
        this._transactionStatus = mutableLiveData2;
        this.transactionStatus = mutableLiveData2;
        this.authenticationResponse = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this._isLoading = mutableLiveData3;
        this.isLoading = mutableLiveData3;
        MutableLiveData<OmiseException> mutableLiveData4 = new MutableLiveData<>();
        this._error = mutableLiveData4;
        this.error = mutableLiveData4;
        C5557x49d20eee c5557x49d20eee = new C5557x49d20eee(CoroutineExceptionHandler.Key, this);
        this.coroutineExceptionHandler = c5557x49d20eee;
        AbstractC1552Vc.m65753e(ViewModelKt.getViewModelScope(this), dispatcher.plus(c5557x49d20eee), null, new C5555a(null), 2, null);
    }
}
