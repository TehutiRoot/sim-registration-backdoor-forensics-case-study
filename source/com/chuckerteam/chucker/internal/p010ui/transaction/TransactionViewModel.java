package com.chuckerteam.chucker.internal.p010ui.transaction;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.repository.RepositoryProvider;
import com.chuckerteam.chucker.internal.support.LiveDataUtilsKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R\u001f\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00118\u0006¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0006¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u0015¨\u0006'"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionViewModel;", "Landroidx/lifecycle/ViewModel;", "", "transactionId", "<init>", "(J)V", "", "switchUrlEncoding", "()V", "", "encode", "encodeUrl", "(Z)V", "Landroidx/lifecycle/MutableLiveData;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/lifecycle/MutableLiveData;", "mutableEncodeUrl", "Landroidx/lifecycle/LiveData;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/lifecycle/LiveData;", "getEncodeUrl", "()Landroidx/lifecycle/LiveData;", "", OperatorName.CURVE_TO, "getTransactionTitle", "transactionTitle", "d", "getDoesUrlRequireEncoding", "doesUrlRequireEncoding", "e", "getDoesRequestBodyRequireEncoding", "doesRequestBodyRequireEncoding", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", OperatorName.FILL_NON_ZERO, "getTransaction", "transaction", OperatorName.NON_STROKING_GRAY, "getFormatRequestBody", "formatRequestBody", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionViewModel */
/* loaded from: classes3.dex */
public final class TransactionViewModel extends ViewModel {

    /* renamed from: a */
    public final MutableLiveData f43041a;

    /* renamed from: b */
    public final LiveData f43042b;

    /* renamed from: c */
    public final LiveData f43043c;

    /* renamed from: d */
    public final LiveData f43044d;

    /* renamed from: e */
    public final LiveData f43045e;

    /* renamed from: f */
    public final LiveData f43046f;

    /* renamed from: g */
    public final LiveData f43047g;

    public TransactionViewModel(long j) {
        MutableLiveData mutableLiveData = new MutableLiveData(Boolean.FALSE);
        this.f43041a = mutableLiveData;
        this.f43042b = mutableLiveData;
        RepositoryProvider repositoryProvider = RepositoryProvider.INSTANCE;
        this.f43043c = LiveDataUtilsKt.combineLatest(repositoryProvider.transaction().getTransaction(j), mutableLiveData, TransactionViewModel$transactionTitle$1.INSTANCE);
        this.f43044d = Transformations.map(repositoryProvider.transaction().getTransaction(j), TransactionViewModel$doesUrlRequireEncoding$1.INSTANCE);
        LiveData map = Transformations.map(repositoryProvider.transaction().getTransaction(j), TransactionViewModel$doesRequestBodyRequireEncoding$1.INSTANCE);
        this.f43045e = map;
        this.f43046f = repositoryProvider.transaction().getTransaction(j);
        this.f43047g = LiveDataUtilsKt.combineLatest(map, mutableLiveData, TransactionViewModel$formatRequestBody$1.INSTANCE);
    }

    public final void encodeUrl(boolean z) {
        this.f43041a.setValue(Boolean.valueOf(z));
    }

    @NotNull
    public final LiveData<Boolean> getDoesRequestBodyRequireEncoding() {
        return this.f43045e;
    }

    @NotNull
    public final LiveData<Boolean> getDoesUrlRequireEncoding() {
        return this.f43044d;
    }

    @NotNull
    public final LiveData<Boolean> getEncodeUrl() {
        return this.f43042b;
    }

    @NotNull
    public final LiveData<Boolean> getFormatRequestBody() {
        return this.f43047g;
    }

    @NotNull
    public final LiveData<HttpTransaction> getTransaction() {
        return this.f43046f;
    }

    @NotNull
    public final LiveData<String> getTransactionTitle() {
        return this.f43043c;
    }

    public final void switchUrlEncoding() {
        Object value = this.f43042b.getValue();
        Intrinsics.checkNotNull(value);
        encodeUrl(!((Boolean) value).booleanValue());
    }
}
