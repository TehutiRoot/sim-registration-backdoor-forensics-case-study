package com.chuckerteam.chucker.internal.p010ui.transaction;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.chuckerteam.chucker.databinding.ChuckerTransactionItemBodyLineBinding;
import com.chuckerteam.chucker.databinding.ChuckerTransactionItemHeadersBinding;
import com.chuckerteam.chucker.databinding.ChuckerTransactionItemImageBinding;
import com.chuckerteam.chucker.internal.p010ui.transaction.TransactionPayloadItem;
import com.chuckerteam.chucker.internal.p010ui.transaction.TransactionPayloadViewHolder;
import com.chuckerteam.chucker.internal.support.SearchHighlightUtilKt;
import com.chuckerteam.chucker.internal.support.SpanTextUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/0B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010%\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010'\u001a\u00020\bH\u0000¢\u0006\u0004\b&\u0010\u0004J\u0013\u0010)\u001a\u00020\f*\u00020(H\u0002¢\u0006\u0004\b)\u0010*R$\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u00060+j\b\u0012\u0004\u0012\u00020\u0006`,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010-¨\u00061"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionBodyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadViewHolder;", "<init>", "()V", "", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem;", "bodyItems", "", "setItems", "(Ljava/util/List;)V", "holder", "", "position", "onBindViewHolder", "(Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadViewHolder;", "getItemCount", "()I", "getItemViewType", "(I)I", "", "newText", "backgroundColor", "foregroundColor", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionBodyAdapter$SearchItemBodyLine;", "highlightQueryWithColors$com_github_ChuckerTeam_Chucker_library", "(Ljava/lang/String;II)Ljava/util/List;", "highlightQueryWithColors", "queryStartPosition", "queryText", "highlightItemWithColorOnPosition$com_github_ChuckerTeam_Chucker_library", "(IILjava/lang/String;II)V", "highlightItemWithColorOnPosition", "resetHighlight$com_github_ChuckerTeam_Chucker_library", "resetHighlight", "Landroid/text/SpannableStringBuilder;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/text/SpannableStringBuilder;)I", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", FirebaseAnalytics.Param.ITEMS, "Companion", "SearchItemBodyLine", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionPayloadAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionPayloadAdapter.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionBodyAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n*L\n1#1,236:1\n800#2,11:237\n1855#2:248\n1855#2,2:249\n1856#2:251\n800#2,11:252\n1855#2,2:263\n34#3:265\n*S KotlinDebug\n*F\n+ 1 TransactionPayloadAdapter.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionBodyAdapter\n*L\n79#1:237,11\n81#1:248\n85#1:249,2\n81#1:251\n134#1:252,11\n136#1:263,2\n156#1:265\n*E\n"})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionBodyAdapter */
/* loaded from: classes3.dex */
public final class TransactionBodyAdapter extends RecyclerView.Adapter<TransactionPayloadViewHolder> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final ArrayList f43015a = new ArrayList();

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionBodyAdapter$Companion;", "", "()V", "TYPE_BODY_LINE", "", "TYPE_HEADERS", "TYPE_IMAGE", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionBodyAdapter$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionBodyAdapter$SearchItemBodyLine;", "", "", "indexBodyLine", "indexStartOfQuerySubString", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionBodyAdapter$SearchItemBodyLine;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getIndexBodyLine", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getIndexStartOfQuerySubString", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionBodyAdapter$SearchItemBodyLine */
    /* loaded from: classes3.dex */
    public static final class SearchItemBodyLine {

        /* renamed from: a */
        public final int f43016a;

        /* renamed from: b */
        public final int f43017b;

        public SearchItemBodyLine(int i, int i2) {
            this.f43016a = i;
            this.f43017b = i2;
        }

        public static /* synthetic */ SearchItemBodyLine copy$default(SearchItemBodyLine searchItemBodyLine, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = searchItemBodyLine.f43016a;
            }
            if ((i3 & 2) != 0) {
                i2 = searchItemBodyLine.f43017b;
            }
            return searchItemBodyLine.copy(i, i2);
        }

        public final int component1() {
            return this.f43016a;
        }

        public final int component2() {
            return this.f43017b;
        }

        @NotNull
        public final SearchItemBodyLine copy(int i, int i2) {
            return new SearchItemBodyLine(i, i2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SearchItemBodyLine) {
                SearchItemBodyLine searchItemBodyLine = (SearchItemBodyLine) obj;
                return this.f43016a == searchItemBodyLine.f43016a && this.f43017b == searchItemBodyLine.f43017b;
            }
            return false;
        }

        public final int getIndexBodyLine() {
            return this.f43016a;
        }

        public final int getIndexStartOfQuerySubString() {
            return this.f43017b;
        }

        public int hashCode() {
            return (this.f43016a * 31) + this.f43017b;
        }

        @NotNull
        public String toString() {
            int i = this.f43016a;
            int i2 = this.f43017b;
            return "SearchItemBodyLine(indexBodyLine=" + i + ", indexStartOfQuerySubString=" + i2 + ")";
        }
    }

    /* renamed from: a */
    public final int m49864a(SpannableStringBuilder spannableStringBuilder) {
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(start, end, T::class.java)");
        int i = 0;
        for (Object obj : spans) {
            if (!(obj instanceof SpanTextUtil.ChuckerForegroundColorSpan)) {
                spannableStringBuilder.removeSpan(obj);
                i++;
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f43015a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        TransactionPayloadItem transactionPayloadItem = (TransactionPayloadItem) this.f43015a.get(i);
        if (transactionPayloadItem instanceof TransactionPayloadItem.HeaderItem) {
            return 1;
        }
        if (transactionPayloadItem instanceof TransactionPayloadItem.BodyLineItem) {
            return 2;
        }
        if (transactionPayloadItem instanceof TransactionPayloadItem.ImageItem) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: highlightItemWithColorOnPosition$com_github_ChuckerTeam_Chucker_library */
    public final void m49863xbb91ef2c(int i, int i2, @NotNull String queryText, int i3, int i4) {
        TransactionPayloadItem.BodyLineItem bodyLineItem;
        Intrinsics.checkNotNullParameter(queryText, "queryText");
        Object orNull = CollectionsKt___CollectionsKt.getOrNull(this.f43015a, i);
        if (orNull instanceof TransactionPayloadItem.BodyLineItem) {
            bodyLineItem = (TransactionPayloadItem.BodyLineItem) orNull;
        } else {
            bodyLineItem = null;
        }
        if (bodyLineItem != null) {
            bodyLineItem.setLine(SearchHighlightUtilKt.highlightWithDefinedColorsSubstring(bodyLineItem.getLine(), queryText, i2, i3, i4));
            notifyItemChanged(i);
        }
    }

    @NotNull
    public final List<SearchItemBodyLine> highlightQueryWithColors$com_github_ChuckerTeam_Chucker_library(@NotNull String newText, int i, int i2) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f43015a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof TransactionPayloadItem.BodyLineItem) {
                arrayList3.add(obj);
            }
        }
        for (IndexedValue indexedValue : CollectionsKt___CollectionsKt.withIndex(arrayList3)) {
            int component1 = indexedValue.component1();
            TransactionPayloadItem.BodyLineItem bodyLineItem = (TransactionPayloadItem.BodyLineItem) indexedValue.component2();
            List<Integer> indicesOf = SearchHighlightUtilKt.indicesOf(bodyLineItem.getLine(), newText);
            if (!indicesOf.isEmpty()) {
                for (Number number : indicesOf) {
                    arrayList.add(new SearchItemBodyLine(component1 + 1, number.intValue()));
                }
                m49864a(bodyLineItem.getLine());
                bodyLineItem.setLine(SearchHighlightUtilKt.highlightWithDefinedColors(bodyLineItem.getLine(), newText, indicesOf, i, i2));
                notifyItemChanged(component1 + 1);
            } else if (m49864a(bodyLineItem.getLine()) > 0) {
                notifyItemChanged(component1 + 1);
            }
        }
        return arrayList;
    }

    public final void resetHighlight$com_github_ChuckerTeam_Chucker_library() {
        ArrayList arrayList = this.f43015a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof TransactionPayloadItem.BodyLineItem) {
                arrayList2.add(obj);
            }
        }
        for (IndexedValue indexedValue : CollectionsKt___CollectionsKt.withIndex(arrayList2)) {
            int component1 = indexedValue.component1();
            if (m49864a(((TransactionPayloadItem.BodyLineItem) indexedValue.component2()).getLine()) > 0) {
                notifyItemChanged(component1 + 1);
            }
        }
    }

    public final void setItems(@NotNull List<? extends TransactionPayloadItem> bodyItems) {
        Intrinsics.checkNotNullParameter(bodyItems, "bodyItems");
        int size = this.f43015a.size();
        this.f43015a.clear();
        this.f43015a.addAll(bodyItems);
        notifyItemRangeRemoved(0, size);
        notifyItemRangeInserted(0, this.f43015a.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull TransactionPayloadViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.f43015a.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "items[position]");
        holder.bind((TransactionPayloadItem) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public TransactionPayloadViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        if (i == 1) {
            ChuckerTransactionItemHeadersBinding inflate = ChuckerTransactionItemHeadersBinding.inflate(from, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, parent, false)");
            return new TransactionPayloadViewHolder.HeaderViewHolder(inflate);
        } else if (i != 2) {
            ChuckerTransactionItemImageBinding inflate2 = ChuckerTransactionItemImageBinding.inflate(from, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(inflater, parent, false)");
            return new TransactionPayloadViewHolder.ImageViewHolder(inflate2);
        } else {
            ChuckerTransactionItemBodyLineBinding inflate3 = ChuckerTransactionItemBodyLineBinding.inflate(from, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(inflater, parent, false)");
            return new TransactionPayloadViewHolder.BodyLineViewHolder(inflate3);
        }
    }
}
