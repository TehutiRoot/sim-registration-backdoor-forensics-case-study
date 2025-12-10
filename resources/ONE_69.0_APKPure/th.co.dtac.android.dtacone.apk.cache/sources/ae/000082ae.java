package com.chuckerteam.chucker.internal.support;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.har.log.Creator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "com.chuckerteam.chucker.internal.support.HarUtils$harStringFromTransactions$2", m29092f = "HarUtils.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* loaded from: classes3.dex */
public final class HarUtils$harStringFromTransactions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ String $name;
    final /* synthetic */ List<HttpTransaction> $transactions;
    final /* synthetic */ String $version;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HarUtils$harStringFromTransactions$2(List<HttpTransaction> list, String str, String str2, Continuation<? super HarUtils$harStringFromTransactions$2> continuation) {
        super(2, continuation);
        this.$transactions = list;
        this.$name = str;
        this.$version = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new HarUtils$harStringFromTransactions$2(this.$transactions, this.$name, this.$version, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return JsonConverter.INSTANCE.getNonNullSerializerInstance().toJson(HarUtils.INSTANCE.fromHttpTransactions$com_github_ChuckerTeam_Chucker_library(this.$transactions, new Creator(this.$name, this.$version, null, 4, null)));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
        return ((HarUtils$harStringFromTransactions$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}