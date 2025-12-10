package com.chuckerteam.chucker.internal.p010ui;

import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.HarUtils;
import com.chuckerteam.chucker.internal.support.Sharable;
import com.chuckerteam.chucker.internal.support.TransactionDetailsHarSharable;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$onOptionsItemSelected$3 */
/* loaded from: classes3.dex */
public final class MainActivity$onOptionsItemSelected$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MainActivity this$0;

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, m28850d2 = {"<anonymous>", "Lcom/chuckerteam/chucker/internal/support/Sharable;", "transactions", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @DebugMetadata(m28801c = "com.chuckerteam.chucker.internal.ui.MainActivity$onOptionsItemSelected$3$1", m28800f = "MainActivity.kt", m28799i = {}, m28798l = {175}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
    /* renamed from: com.chuckerteam.chucker.internal.ui.MainActivity$onOptionsItemSelected$3$1 */
    /* loaded from: classes3.dex */
    public static final class C59791 extends SuspendLambda implements Function2<List<? extends HttpTransaction>, Continuation<? super Sharable>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MainActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59791(MainActivity mainActivity, Continuation<? super C59791> continuation) {
            super(2, continuation);
            this.this$0 = mainActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C59791 c59791 = new C59791(this.this$0, continuation);
            c59791.L$0 = obj;
            return c59791;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends HttpTransaction> list, Continuation<? super Sharable> continuation) {
            return invoke2((List<HttpTransaction>) list, continuation);
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
                HarUtils harUtils = HarUtils.INSTANCE;
                String string = this.this$0.getString(R.string.chucker_name);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.chucker_name)");
                String string2 = this.this$0.getString(R.string.chucker_version);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chucker_version)");
                this.label = 1;
                obj = harUtils.harStringFromTransactions((List) this.L$0, string, string2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return new TransactionDetailsHarSharable((String) obj);
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull List<HttpTransaction> list, @Nullable Continuation<? super Sharable> continuation) {
            return ((C59791) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$onOptionsItemSelected$3(MainActivity mainActivity) {
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
        MainActivity mainActivity = this.this$0;
        mainActivity.m49883x("transactions.har", new C59791(mainActivity, null));
    }
}
