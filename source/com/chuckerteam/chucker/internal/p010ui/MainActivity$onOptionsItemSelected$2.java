package com.chuckerteam.chucker.internal.p010ui;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.Sharable;
import com.chuckerteam.chucker.internal.support.TransactionListDetailsSharable;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$onOptionsItemSelected$2 */
/* loaded from: classes3.dex */
public final class MainActivity$onOptionsItemSelected$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MainActivity this$0;

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, m28850d2 = {"<anonymous>", "Lcom/chuckerteam/chucker/internal/support/Sharable;", "transactions", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @DebugMetadata(m28801c = "com.chuckerteam.chucker.internal.ui.MainActivity$onOptionsItemSelected$2$1", m28800f = "MainActivity.kt", m28799i = {}, m28798l = {}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
    /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$onOptionsItemSelected$2$1 */
    /* loaded from: classes3.dex */
    public static final class C59781 extends SuspendLambda implements Function2<List<? extends HttpTransaction>, Continuation<? super Sharable>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C59781(Continuation<? super C59781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C59781 c59781 = new C59781(continuation);
            c59781.L$0 = obj;
            return c59781;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends HttpTransaction> list, Continuation<? super Sharable> continuation) {
            return invoke2((List<HttpTransaction>) list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return new TransactionListDetailsSharable((List) this.L$0, false);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull List<HttpTransaction> list, @Nullable Continuation<? super Sharable> continuation) {
            return ((C59781) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$onOptionsItemSelected$2(MainActivity mainActivity) {
        super(0);
        this.this$0 = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.m49883x("transactions.txt", new C59781(null));
    }
}
