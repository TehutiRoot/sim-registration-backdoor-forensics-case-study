package com.chuckerteam.chucker.internal.p010ui;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.chuckerteam.chucker.internal.data.entity.HttpTransactionTuple;
import com.chuckerteam.chucker.internal.data.repository.HttpTransactionRepository;
import com.chuckerteam.chucker.internal.data.repository.RepositoryProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0001¢\u0006\u0002\b\u00042\u0018\u0010\u0005\u001a\u0014 \u0007*\t\u0018\u00010\u0006¢\u0006\u0002\b\u00040\u0006¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "Landroidx/lifecycle/LiveData;", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransactionTuple;", "Lkotlin/jvm/JvmSuppressWildcards;", "searchQuery", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: com.chuckerteam.chucker.internal.ui.MainViewModel$transactions$1 */
/* loaded from: classes3.dex */
public final class MainViewModel$transactions$1 extends Lambda implements Function1<String, LiveData<List<HttpTransactionTuple>>> {
    public static final MainViewModel$transactions$1 INSTANCE = new MainViewModel$transactions$1();

    public MainViewModel$transactions$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final LiveData<List<HttpTransactionTuple>> invoke(String searchQuery) {
        HttpTransactionRepository transaction = RepositoryProvider.INSTANCE.transaction();
        if (searchQuery != null && !AbstractC19741eO1.isBlank(searchQuery)) {
            if (TextUtils.isDigitsOnly(searchQuery)) {
                Intrinsics.checkNotNullExpressionValue(searchQuery, "searchQuery");
                return transaction.getFilteredTransactionTuples(searchQuery, "");
            }
            Intrinsics.checkNotNullExpressionValue(searchQuery, "searchQuery");
            return transaction.getFilteredTransactionTuples("", searchQuery);
        }
        return transaction.getSortedTransactionTuples();
    }
}