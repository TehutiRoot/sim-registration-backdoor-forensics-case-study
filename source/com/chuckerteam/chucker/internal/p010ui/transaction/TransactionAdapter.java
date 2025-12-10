package com.chuckerteam.chucker.internal.p010ui.transaction;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.databinding.ChuckerListItemTransactionBinding;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.entity.HttpTransactionTuple;
import com.chuckerteam.chucker.internal.p010ui.transaction.ProtocolResources;
import com.chuckerteam.chucker.internal.p010ui.transaction.TransactionAdapter;
import com.chuckerteam.chucker.internal.support.TransactionDiffCallback;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.text.DateFormat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001%B%\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\b2\n\u0010\u0012\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010 \u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010\"\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0014\u0010$\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006&"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransactionTuple;", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionAdapter$TransactionViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "", "", "onTransactionClick", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionAdapter$TransactionViewHolder;", "holder", "position", "onBindViewHolder", "(Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionAdapter$TransactionViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/jvm/functions/Function1;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "colorDefault", OperatorName.CURVE_TO, "colorRequested", "d", "colorError", "e", "color500", OperatorName.FILL_NON_ZERO, "color400", OperatorName.NON_STROKING_GRAY, "color300", "TransactionViewHolder", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionAdapter */
/* loaded from: classes3.dex */
public final class TransactionAdapter extends ListAdapter<HttpTransactionTuple, TransactionViewHolder> {

    /* renamed from: a */
    public final Function1 f43005a;

    /* renamed from: b */
    public final int f43006b;

    /* renamed from: c */
    public final int f43007c;

    /* renamed from: d */
    public final int f43008d;

    /* renamed from: e */
    public final int f43009e;

    /* renamed from: f */
    public final int f43010f;

    /* renamed from: g */
    public final int f43011g;

    @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionAdapter$TransactionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/chuckerteam/chucker/databinding/ChuckerListItemTransactionBinding;", "itemBinding", "<init>", "(Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionAdapter;Lcom/chuckerteam/chucker/databinding/ChuckerListItemTransactionBinding;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransactionTuple;", "transaction", "", "bind", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransactionTuple;)V", "Lcom/chuckerteam/chucker/internal/ui/transaction/ProtocolResources;", "resources", "d", "(Lcom/chuckerteam/chucker/internal/ui/transaction/ProtocolResources;)V", "e", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/chuckerteam/chucker/databinding/ChuckerListItemTransactionBinding;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Long;", "transactionId", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionAdapter$TransactionViewHolder */
    /* loaded from: classes3.dex */
    public final class TransactionViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ChuckerListItemTransactionBinding f43012a;

        /* renamed from: b */
        public Long f43013b;

        /* renamed from: c */
        public final /* synthetic */ TransactionAdapter f43014c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionViewHolder(@NotNull final TransactionAdapter transactionAdapter, ChuckerListItemTransactionBinding itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.f43014c = transactionAdapter;
            this.f43012a = itemBinding;
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: MU1
                {
                    TransactionAdapter.TransactionViewHolder.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransactionAdapter.TransactionViewHolder.m49869b(TransactionAdapter.TransactionViewHolder.this, transactionAdapter, view);
                }
            });
        }

        /* renamed from: b */
        public static /* synthetic */ void m49869b(TransactionViewHolder transactionViewHolder, TransactionAdapter transactionAdapter, View view) {
            m49868c(transactionViewHolder, transactionAdapter, view);
        }

        /* renamed from: c */
        public static final void m49868c(TransactionViewHolder this$0, TransactionAdapter this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Long l = this$0.f43013b;
            if (l != null) {
                this$1.f43005a.invoke(Long.valueOf(l.longValue()));
            }
        }

        @SuppressLint({"SetTextI18n"})
        public final void bind(@NotNull HttpTransactionTuple transaction) {
            ProtocolResources http;
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.f43013b = Long.valueOf(transaction.getId());
            ChuckerListItemTransactionBinding chuckerListItemTransactionBinding = this.f43012a;
            TransactionAdapterKt.m49865a(chuckerListItemTransactionBinding, transaction.getGraphQlOperationName(), transaction.getGraphQlDetected());
            TextView textView = chuckerListItemTransactionBinding.path;
            String method = transaction.getMethod();
            String formattedPath = transaction.getFormattedPath(false);
            textView.setText(method + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + formattedPath);
            chuckerListItemTransactionBinding.host.setText(transaction.getHost());
            chuckerListItemTransactionBinding.timeStart.setText(DateFormat.getTimeInstance().format(transaction.getRequestDate()));
            if (transaction.isSsl()) {
                http = new ProtocolResources.Https();
            } else {
                http = new ProtocolResources.Http();
            }
            m49867d(http);
            if (transaction.getStatus() == HttpTransaction.Status.Complete) {
                chuckerListItemTransactionBinding.code.setText(String.valueOf(transaction.getResponseCode()));
                chuckerListItemTransactionBinding.duration.setText(transaction.getDurationString());
                chuckerListItemTransactionBinding.size.setText(transaction.getTotalSizeString());
            } else {
                chuckerListItemTransactionBinding.code.setText("");
                chuckerListItemTransactionBinding.duration.setText("");
                chuckerListItemTransactionBinding.size.setText("");
            }
            if (transaction.getStatus() == HttpTransaction.Status.Failed) {
                chuckerListItemTransactionBinding.code.setText("!!!");
            }
            m49866e(transaction);
        }

        /* renamed from: d */
        public final void m49867d(ProtocolResources protocolResources) {
            this.f43012a.ssl.setImageDrawable(AppCompatResources.getDrawable(this.itemView.getContext(), protocolResources.getIcon()));
            ImageViewCompat.setImageTintList(this.f43012a.ssl, ColorStateList.valueOf(ContextCompat.getColor(this.itemView.getContext(), protocolResources.getColor())));
        }

        /* renamed from: e */
        public final void m49866e(HttpTransactionTuple httpTransactionTuple) {
            int i;
            if (httpTransactionTuple.getStatus() == HttpTransaction.Status.Failed) {
                i = this.f43014c.f43008d;
            } else if (httpTransactionTuple.getStatus() == HttpTransaction.Status.Requested) {
                i = this.f43014c.f43007c;
            } else if (httpTransactionTuple.getResponseCode() == null) {
                i = this.f43014c.f43006b;
            } else {
                Integer responseCode = httpTransactionTuple.getResponseCode();
                Intrinsics.checkNotNull(responseCode);
                if (responseCode.intValue() >= 500) {
                    i = this.f43014c.f43009e;
                } else {
                    Integer responseCode2 = httpTransactionTuple.getResponseCode();
                    Intrinsics.checkNotNull(responseCode2);
                    if (responseCode2.intValue() >= 400) {
                        i = this.f43014c.f43010f;
                    } else {
                        Integer responseCode3 = httpTransactionTuple.getResponseCode();
                        Intrinsics.checkNotNull(responseCode3);
                        i = responseCode3.intValue() >= 300 ? this.f43014c.f43011g : this.f43014c.f43006b;
                    }
                }
            }
            this.f43012a.code.setTextColor(i);
            this.f43012a.path.setTextColor(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionAdapter(@NotNull Context context, @NotNull Function1<? super Long, Unit> onTransactionClick) {
        super(TransactionDiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onTransactionClick, "onTransactionClick");
        this.f43005a = onTransactionClick;
        this.f43006b = ContextCompat.getColor(context, R.color.chucker_status_default);
        this.f43007c = ContextCompat.getColor(context, R.color.chucker_status_requested);
        this.f43008d = ContextCompat.getColor(context, R.color.chucker_status_error);
        this.f43009e = ContextCompat.getColor(context, R.color.chucker_status_500);
        this.f43010f = ContextCompat.getColor(context, R.color.chucker_status_400);
        this.f43011g = ContextCompat.getColor(context, R.color.chucker_status_300);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull TransactionViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HttpTransactionTuple item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(position)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public TransactionViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ChuckerListItemTransactionBinding inflate = ChuckerListItemTransactionBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…          false\n        )");
        return new TransactionViewHolder(this, inflate);
    }
}
