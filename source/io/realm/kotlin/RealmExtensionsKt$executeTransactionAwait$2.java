package io.realm.kotlin;

import io.realm.Realm;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.p023io.CloseableKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "io.realm.kotlin.RealmExtensionsKt$executeTransactionAwait$2", m28800f = "RealmExtensions.kt", m28799i = {}, m28798l = {}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* loaded from: classes5.dex */
public final class RealmExtensionsKt$executeTransactionAwait$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Realm $this_executeTransactionAwait;
    final /* synthetic */ Function1<Realm, Unit> $transaction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RealmExtensionsKt$executeTransactionAwait$2(Realm realm, Function1<? super Realm, Unit> function1, Continuation<? super RealmExtensionsKt$executeTransactionAwait$2> continuation) {
        super(2, continuation);
        this.$this_executeTransactionAwait = realm;
        this.$transaction = function1;
    }

    /* renamed from: a */
    public static /* synthetic */ void m29403a(Function1 function1, Realm realm) {
        function1.invoke(realm);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RealmExtensionsKt$executeTransactionAwait$2 realmExtensionsKt$executeTransactionAwait$2 = new RealmExtensionsKt$executeTransactionAwait$2(this.$this_executeTransactionAwait, this.$transaction, continuation);
        realmExtensionsKt$executeTransactionAwait$2.L$0 = obj;
        return realmExtensionsKt$executeTransactionAwait$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Realm realm = Realm.getInstance(this.$this_executeTransactionAwait.getConfiguration());
            final Function1<Realm, Unit> function1 = this.$transaction;
            try {
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                    realm.executeTransaction(new Realm.Transaction() { // from class: io.realm.kotlin.a
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm2) {
                            RealmExtensionsKt$executeTransactionAwait$2.m29403a(Function1.this, realm2);
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(realm, null);
                return Unit.INSTANCE;
            } finally {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((RealmExtensionsKt$executeTransactionAwait$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
