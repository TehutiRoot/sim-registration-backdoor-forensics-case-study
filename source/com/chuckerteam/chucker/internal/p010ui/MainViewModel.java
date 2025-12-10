package com.chuckerteam.chucker.internal.p010ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.entity.HttpTransactionTuple;
import com.chuckerteam.chucker.internal.data.repository.RepositoryProvider;
import com.chuckerteam.chucker.internal.support.NotificationHelper;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0003R\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\b0\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "getAllTransactions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "searchQuery", "", "updateItemsFilter", "(Ljava/lang/String;)V", "clearTransactions", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/lifecycle/MutableLiveData;", "currentFilter", "Landroidx/lifecycle/LiveData;", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransactionTuple;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/lifecycle/LiveData;", "getTransactions", "()Landroidx/lifecycle/LiveData;", "transactions", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: com.chuckerteam.chucker.internal.ui.MainViewModel */
/* loaded from: classes3.dex */
public final class MainViewModel extends ViewModel {

    /* renamed from: a */
    public final MutableLiveData f42998a;

    /* renamed from: b */
    public final LiveData f42999b;

    public MainViewModel() {
        MutableLiveData mutableLiveData = new MutableLiveData("");
        this.f42998a = mutableLiveData;
        this.f42999b = Transformations.switchMap(mutableLiveData, MainViewModel$transactions$1.INSTANCE);
    }

    public final void clearTransactions() {
        AbstractC1552Vc.m65753e(ViewModelKt.getViewModelScope(this), null, null, new MainViewModel$clearTransactions$1(null), 3, null);
        NotificationHelper.Companion.clearBuffer();
    }

    @Nullable
    public final Object getAllTransactions(@NotNull Continuation<? super List<HttpTransaction>> continuation) {
        return RepositoryProvider.INSTANCE.transaction().getAllTransactions(continuation);
    }

    @NotNull
    public final LiveData<List<HttpTransactionTuple>> getTransactions() {
        return this.f42999b;
    }

    public final void updateItemsFilter(@NotNull String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f42998a.setValue(searchQuery);
    }
}
