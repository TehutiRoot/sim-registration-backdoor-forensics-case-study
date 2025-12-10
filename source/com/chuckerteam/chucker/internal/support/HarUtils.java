package com.chuckerteam.chucker.internal.support;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.har.Har;
import com.chuckerteam.chucker.internal.data.har.log.Creator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ/\u0010\u000b\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/HarUtils;", "", "()V", "fromHttpTransactions", "Lcom/chuckerteam/chucker/internal/data/har/Har;", "transactions", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "creator", "Lcom/chuckerteam/chucker/internal/data/har/log/Creator;", "fromHttpTransactions$com_github_ChuckerTeam_Chucker_library", "harStringFromTransactions", "", "name", ClientCookie.VERSION_ATTR, "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class HarUtils {
    @NotNull
    public static final HarUtils INSTANCE = new HarUtils();

    @NotNull
    public final Har fromHttpTransactions$com_github_ChuckerTeam_Chucker_library(@NotNull List<HttpTransaction> transactions, @NotNull Creator creator) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(creator, "creator");
        return new Har(transactions, creator);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object harStringFromTransactions(@org.jetbrains.annotations.NotNull java.util.List<com.chuckerteam.chucker.internal.data.entity.HttpTransaction> r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.String> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.chuckerteam.chucker.internal.support.HarUtils$harStringFromTransactions$1
            if (r0 == 0) goto L13
            r0 = r9
            com.chuckerteam.chucker.internal.support.HarUtils$harStringFromTransactions$1 r0 = (com.chuckerteam.chucker.internal.support.HarUtils$harStringFromTransactions$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.chuckerteam.chucker.internal.support.HarUtils$harStringFromTransactions$1 r0 = new com.chuckerteam.chucker.internal.support.HarUtils$harStringFromTransactions$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r9)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getDefault()
            com.chuckerteam.chucker.internal.support.HarUtils$harStringFromTransactions$2 r2 = new com.chuckerteam.chucker.internal.support.HarUtils$harStringFromTransactions$2
            r4 = 0
            r2.<init>(r6, r7, r8, r4)
            r0.label = r3
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r2, r0)
            if (r9 != r1) goto L47
            return r1
        L47:
            java.lang.String r6 = "transactions: List<HttpT…or(name, version)))\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.support.HarUtils.harStringFromTransactions(java.util.List, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
