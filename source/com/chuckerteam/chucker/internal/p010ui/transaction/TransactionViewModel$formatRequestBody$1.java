package com.chuckerteam.chucker.internal.p010ui.transaction;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "requiresEncoding", "encodeUrl", "invoke", "(ZZ)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionViewModel$formatRequestBody$1 */
/* loaded from: classes3.dex */
public final class TransactionViewModel$formatRequestBody$1 extends Lambda implements Function2<Boolean, Boolean, Boolean> {
    public static final TransactionViewModel$formatRequestBody$1 INSTANCE = new TransactionViewModel$formatRequestBody$1();

    public TransactionViewModel$formatRequestBody$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
        return invoke(bool.booleanValue(), bool2.booleanValue());
    }

    @NotNull
    public final Boolean invoke(boolean z, boolean z2) {
        return Boolean.valueOf((z && z2) ? false : true);
    }
}
