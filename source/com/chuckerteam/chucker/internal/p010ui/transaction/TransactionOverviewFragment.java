package com.chuckerteam.chucker.internal.p010ui.transaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.databinding.ChuckerFragmentTransactionOverviewBinding;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.p010ui.transaction.TransactionOverviewFragment;
import com.chuckerteam.chucker.internal.support.LiveDataUtilsKt;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionOverviewFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "", "encodeUrl", OperatorName.SAVE, "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Z)V", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionViewModel;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/Lazy;", OperatorName.ENDPATH, "()Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionViewModel;", "viewModel", "Lcom/chuckerteam/chucker/databinding/ChuckerFragmentTransactionOverviewBinding;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/chuckerteam/chucker/databinding/ChuckerFragmentTransactionOverviewBinding;", "overviewBinding", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionOverviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionOverviewFragment.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionOverviewFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,93:1\n172#2,9:94\n*S KotlinDebug\n*F\n+ 1 TransactionOverviewFragment.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionOverviewFragment\n*L\n19#1:94,9\n*E\n"})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionOverviewFragment */
/* loaded from: classes3.dex */
public final class TransactionOverviewFragment extends Fragment {

    /* renamed from: a */
    public final Lazy f43018a;

    /* renamed from: b */
    public ChuckerFragmentTransactionOverviewBinding f43019b;

    public TransactionOverviewFragment() {
        Function0 function0 = TransactionOverviewFragment$viewModel$2.INSTANCE;
        this.f43018a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TransactionViewModel.class), new C5980x86f486bd(this), new C5981x86f486be(null, this), function0 == null ? new C5982x86f486bf(this) : function0);
    }

    /* renamed from: l */
    public static /* synthetic */ void m49862l(Menu menu, Boolean bool) {
        m49859o(menu, bool);
    }

    /* renamed from: m */
    public static /* synthetic */ void m49861m(TransactionOverviewFragment transactionOverviewFragment, Pair pair) {
        m49858p(transactionOverviewFragment, pair);
    }

    /* renamed from: n */
    private final TransactionViewModel m49860n() {
        return (TransactionViewModel) this.f43018a.getValue();
    }

    /* renamed from: o */
    public static final void m49859o(Menu menu, Boolean it) {
        Intrinsics.checkNotNullParameter(menu, "$menu");
        MenuItem findItem = menu.findItem(R.id.encode_url);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        findItem.setVisible(it.booleanValue());
    }

    /* renamed from: p */
    public static final void m49858p(TransactionOverviewFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m49857q((HttpTransaction) pair.component1(), ((Boolean) pair.component2()).booleanValue());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(@NotNull final Menu menu, @NotNull MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        menu.findItem(R.id.save_body).setVisible(false);
        m49860n().getDoesUrlRequireEncoding().observe(getViewLifecycleOwner(), new Observer() { // from class: OU1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TransactionOverviewFragment.m49862l(menu, (Boolean) obj);
            }
        });
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ChuckerFragmentTransactionOverviewBinding inflate = ChuckerFragmentTransactionOverviewBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.f43019b = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("overviewBinding");
            inflate = null;
        }
        return inflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        LiveDataUtilsKt.combineLatest(m49860n().getTransaction(), m49860n().getEncodeUrl()).observe(getViewLifecycleOwner(), new Observer() { // from class: PU1
            {
                TransactionOverviewFragment.this = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TransactionOverviewFragment.m49861m(TransactionOverviewFragment.this, (Pair) obj);
            }
        });
    }

    /* renamed from: q */
    public final void m49857q(HttpTransaction httpTransaction, boolean z) {
        String str;
        String str2;
        String str3;
        HttpTransaction.Status status;
        String str4;
        Boolean bool;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        ChuckerFragmentTransactionOverviewBinding chuckerFragmentTransactionOverviewBinding = this.f43019b;
        String str12 = null;
        if (chuckerFragmentTransactionOverviewBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("overviewBinding");
            chuckerFragmentTransactionOverviewBinding = null;
        }
        TextView textView = chuckerFragmentTransactionOverviewBinding.url;
        if (httpTransaction != null) {
            str = httpTransaction.getFormattedUrl(z);
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = chuckerFragmentTransactionOverviewBinding.method;
        if (httpTransaction != null) {
            str2 = httpTransaction.getMethod();
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        TextView textView3 = chuckerFragmentTransactionOverviewBinding.protocol;
        if (httpTransaction != null) {
            str3 = httpTransaction.getProtocol();
        } else {
            str3 = null;
        }
        textView3.setText(str3);
        TextView textView4 = chuckerFragmentTransactionOverviewBinding.status;
        if (httpTransaction != null) {
            status = httpTransaction.getStatus();
        } else {
            status = null;
        }
        textView4.setText(String.valueOf(status));
        TextView textView5 = chuckerFragmentTransactionOverviewBinding.response;
        if (httpTransaction != null) {
            str4 = httpTransaction.getResponseSummaryText();
        } else {
            str4 = null;
        }
        textView5.setText(str4);
        if (httpTransaction != null) {
            bool = Boolean.valueOf(httpTransaction.isSsl());
        } else {
            bool = null;
        }
        if (bool == null) {
            chuckerFragmentTransactionOverviewBinding.sslGroup.setVisibility(8);
        } else if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            chuckerFragmentTransactionOverviewBinding.sslGroup.setVisibility(0);
            chuckerFragmentTransactionOverviewBinding.sslValue.setText(R.string.chucker_yes);
        } else {
            chuckerFragmentTransactionOverviewBinding.sslGroup.setVisibility(0);
            chuckerFragmentTransactionOverviewBinding.sslValue.setText(R.string.chucker_no);
        }
        if (httpTransaction != null) {
            str5 = httpTransaction.getResponseTlsVersion();
        } else {
            str5 = null;
        }
        if (str5 != null) {
            chuckerFragmentTransactionOverviewBinding.tlsVersionValue.setText(httpTransaction.getResponseTlsVersion());
            chuckerFragmentTransactionOverviewBinding.tlsGroup.setVisibility(0);
        }
        if (httpTransaction != null) {
            str6 = httpTransaction.getResponseCipherSuite();
        } else {
            str6 = null;
        }
        if (str6 != null) {
            chuckerFragmentTransactionOverviewBinding.cipherSuiteValue.setText(httpTransaction.getResponseCipherSuite());
            chuckerFragmentTransactionOverviewBinding.cipherSuiteGroup.setVisibility(0);
        }
        TextView textView6 = chuckerFragmentTransactionOverviewBinding.requestTime;
        if (httpTransaction != null) {
            str7 = httpTransaction.getRequestDateString();
        } else {
            str7 = null;
        }
        textView6.setText(str7);
        TextView textView7 = chuckerFragmentTransactionOverviewBinding.responseTime;
        if (httpTransaction != null) {
            str8 = httpTransaction.getResponseDateString();
        } else {
            str8 = null;
        }
        textView7.setText(str8);
        TextView textView8 = chuckerFragmentTransactionOverviewBinding.duration;
        if (httpTransaction != null) {
            str9 = httpTransaction.getDurationString();
        } else {
            str9 = null;
        }
        textView8.setText(str9);
        TextView textView9 = chuckerFragmentTransactionOverviewBinding.requestSize;
        if (httpTransaction != null) {
            str10 = httpTransaction.getRequestSizeString();
        } else {
            str10 = null;
        }
        textView9.setText(str10);
        TextView textView10 = chuckerFragmentTransactionOverviewBinding.responseSize;
        if (httpTransaction != null) {
            str11 = httpTransaction.getResponseSizeString();
        } else {
            str11 = null;
        }
        textView10.setText(str11);
        TextView textView11 = chuckerFragmentTransactionOverviewBinding.totalSize;
        if (httpTransaction != null) {
            str12 = httpTransaction.getTotalSizeString();
        }
        textView11.setText(str12);
    }
}
