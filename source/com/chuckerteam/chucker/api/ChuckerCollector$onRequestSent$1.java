package com.chuckerteam.chucker.api;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.repository.HttpTransactionRepository;
import com.chuckerteam.chucker.internal.data.repository.RepositoryProvider;
import com.chuckerteam.chucker.internal.support.NotificationHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.bouncycastle.asn1.eac.EACTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "com.chuckerteam.chucker.api.ChuckerCollector$onRequestSent$1", m28800f = "ChuckerCollector.kt", m28799i = {}, m28798l = {50, 57}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* loaded from: classes3.dex */
public final class ChuckerCollector$onRequestSent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HttpTransaction $transaction;
    int label;
    final /* synthetic */ ChuckerCollector this$0;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @DebugMetadata(m28801c = "com.chuckerteam.chucker.api.ChuckerCollector$onRequestSent$1$1", m28800f = "ChuckerCollector.kt", m28799i = {}, m28798l = {EACTags.TRANSACTION_DATE}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
    /* renamed from: com.chuckerteam.chucker.api.ChuckerCollector$onRequestSent$1$1 */
    /* loaded from: classes3.dex */
    public static final class C59551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HttpTransaction $transaction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59551(HttpTransaction httpTransaction, Continuation<? super C59551> continuation) {
            super(2, continuation);
            this.$transaction = httpTransaction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C59551(this.$transaction, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                HttpTransactionRepository transaction = RepositoryProvider.INSTANCE.transaction();
                HttpTransaction httpTransaction = this.$transaction;
                this.label = 1;
                if (transaction.insertTransaction(httpTransaction, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C59551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @DebugMetadata(m28801c = "com.chuckerteam.chucker.api.ChuckerCollector$onRequestSent$1$2", m28800f = "ChuckerCollector.kt", m28799i = {}, m28798l = {EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
    /* renamed from: com.chuckerteam.chucker.api.ChuckerCollector$onRequestSent$1$2 */
    /* loaded from: classes3.dex */
    public static final class C59562 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ChuckerCollector this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59562(ChuckerCollector chuckerCollector, Continuation<? super C59562> continuation) {
            super(2, continuation);
            this.this$0 = chuckerCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C59562(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            RetentionManager retentionManager;
            Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                retentionManager = this.this$0.f42754b;
                this.label = 1;
                if (retentionManager.doMaintenance$com_github_ChuckerTeam_Chucker_library(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C59562) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChuckerCollector$onRequestSent$1(ChuckerCollector chuckerCollector, HttpTransaction httpTransaction, Continuation<? super ChuckerCollector$onRequestSent$1> continuation) {
        super(2, continuation);
        this.this$0 = chuckerCollector;
        this.$transaction = httpTransaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ChuckerCollector$onRequestSent$1(this.this$0, this.$transaction, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        NotificationHelper notificationHelper;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C59551 c59551 = new C59551(this.$transaction, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, c59551, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (this.this$0.getShowNotification()) {
            notificationHelper = this.this$0.f42755c;
            notificationHelper.show(this.$transaction);
        }
        CoroutineDispatcher io3 = Dispatchers.getIO();
        C59562 c59562 = new C59562(this.this$0, null);
        this.label = 2;
        if (BuildersKt.withContext(io3, c59562, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ChuckerCollector$onRequestSent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
