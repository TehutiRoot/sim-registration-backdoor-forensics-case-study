package com.chuckerteam.chucker.internal.p010ui.transaction;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.databinding.ChuckerTransactionItemBodyLineBinding;
import com.chuckerteam.chucker.databinding.ChuckerTransactionItemHeadersBinding;
import com.chuckerteam.chucker.databinding.ChuckerTransactionItemImageBinding;
import com.chuckerteam.chucker.internal.p010ui.transaction.TransactionPayloadItem;
import com.chuckerteam.chucker.internal.support.ChessboardDrawable;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", Promotion.ACTION_VIEW, "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem;", "BodyLineViewHolder", "HeaderViewHolder", "ImageViewHolder", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadViewHolder$BodyLineViewHolder;", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadViewHolder$HeaderViewHolder;", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadViewHolder$ImageViewHolder;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadViewHolder */
/* loaded from: classes3.dex */
public abstract class TransactionPayloadViewHolder extends RecyclerView.ViewHolder {

    @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadViewHolder$BodyLineViewHolder;", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadViewHolder;", "Lcom/chuckerteam/chucker/databinding/ChuckerTransactionItemBodyLineBinding;", "bodyBinding", "<init>", "(Lcom/chuckerteam/chucker/databinding/ChuckerTransactionItemBodyLineBinding;)V", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem;", "item", "", "bind", "(Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/chuckerteam/chucker/databinding/ChuckerTransactionItemBodyLineBinding;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadViewHolder$BodyLineViewHolder */
    /* loaded from: classes3.dex */
    public static final class BodyLineViewHolder extends TransactionPayloadViewHolder {

        /* renamed from: a */
        public final ChuckerTransactionItemBodyLineBinding f43037a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public BodyLineViewHolder(@org.jetbrains.annotations.NotNull com.chuckerteam.chucker.databinding.ChuckerTransactionItemBodyLineBinding r3) {
            /*
                r2 = this;
                java.lang.String r0 = "bodyBinding"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                android.widget.TextView r0 = r3.getRoot()
                java.lang.String r1 = "bodyBinding.root"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r1 = 0
                r2.<init>(r0, r1)
                r2.f43037a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.p010ui.transaction.TransactionPayloadViewHolder.BodyLineViewHolder.<init>(com.chuckerteam.chucker.databinding.ChuckerTransactionItemBodyLineBinding):void");
        }

        @Override // com.chuckerteam.chucker.internal.p010ui.transaction.TransactionPayloadViewHolder
        public void bind(@NotNull TransactionPayloadItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof TransactionPayloadItem.BodyLineItem) {
                this.f43037a.bodyLine.setText(((TransactionPayloadItem.BodyLineItem) item).getLine());
            }
        }
    }

    @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadViewHolder$HeaderViewHolder;", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadViewHolder;", "Lcom/chuckerteam/chucker/databinding/ChuckerTransactionItemHeadersBinding;", "headerBinding", "<init>", "(Lcom/chuckerteam/chucker/databinding/ChuckerTransactionItemHeadersBinding;)V", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem;", "item", "", "bind", "(Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/chuckerteam/chucker/databinding/ChuckerTransactionItemHeadersBinding;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadViewHolder$HeaderViewHolder */
    /* loaded from: classes3.dex */
    public static final class HeaderViewHolder extends TransactionPayloadViewHolder {

        /* renamed from: a */
        public final ChuckerTransactionItemHeadersBinding f43038a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public HeaderViewHolder(@org.jetbrains.annotations.NotNull com.chuckerteam.chucker.databinding.ChuckerTransactionItemHeadersBinding r3) {
            /*
                r2 = this;
                java.lang.String r0 = "headerBinding"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                android.widget.TextView r0 = r3.getRoot()
                java.lang.String r1 = "headerBinding.root"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r1 = 0
                r2.<init>(r0, r1)
                r2.f43038a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.p010ui.transaction.TransactionPayloadViewHolder.HeaderViewHolder.<init>(com.chuckerteam.chucker.databinding.ChuckerTransactionItemHeadersBinding):void");
        }

        @Override // com.chuckerteam.chucker.internal.p010ui.transaction.TransactionPayloadViewHolder
        public void bind(@NotNull TransactionPayloadItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof TransactionPayloadItem.HeaderItem) {
                this.f43038a.responseHeaders.setText(((TransactionPayloadItem.HeaderItem) item).getHeaders());
            }
        }
    }

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadViewHolder$ImageViewHolder;", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadViewHolder;", "Lcom/chuckerteam/chucker/databinding/ChuckerTransactionItemImageBinding;", "imageBinding", "<init>", "(Lcom/chuckerteam/chucker/databinding/ChuckerTransactionItemImageBinding;)V", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem;", "item", "", "bind", "(Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem;)V", "", "luminance", "Landroid/graphics/drawable/Drawable;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/Double;)Landroid/graphics/drawable/Drawable;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/chuckerteam/chucker/databinding/ChuckerTransactionItemImageBinding;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadViewHolder$ImageViewHolder */
    /* loaded from: classes3.dex */
    public static final class ImageViewHolder extends TransactionPayloadViewHolder {
        @Deprecated
        public static final double LUMINANCE_THRESHOLD = 0.25d;

        /* renamed from: b */
        public static final C5988a f43039b = new C5988a(null);

        /* renamed from: a */
        public final ChuckerTransactionItemImageBinding f43040a;

        /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadViewHolder$ImageViewHolder$a */
        /* loaded from: classes3.dex */
        public static final class C5988a {
            public /* synthetic */ C5988a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C5988a() {
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public ImageViewHolder(@org.jetbrains.annotations.NotNull com.chuckerteam.chucker.databinding.ChuckerTransactionItemImageBinding r3) {
            /*
                r2 = this;
                java.lang.String r0 = "imageBinding"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                android.widget.FrameLayout r0 = r3.getRoot()
                java.lang.String r1 = "imageBinding.root"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r1 = 0
                r2.<init>(r0, r1)
                r2.f43040a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.p010ui.transaction.TransactionPayloadViewHolder.ImageViewHolder.<init>(com.chuckerteam.chucker.databinding.ChuckerTransactionItemImageBinding):void");
        }

        /* renamed from: b */
        public final Drawable m49830b(Double d) {
            if (d == null) {
                return null;
            }
            if (d.doubleValue() < 0.25d) {
                ChessboardDrawable.Companion companion = ChessboardDrawable.Companion;
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                return companion.createPattern(context, R.color.chucker_chessboard_even_square_light, R.color.chucker_chessboard_odd_square_light, R.dimen.chucker_half_grid);
            }
            ChessboardDrawable.Companion companion2 = ChessboardDrawable.Companion;
            Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "itemView.context");
            return companion2.createPattern(context2, R.color.chucker_chessboard_even_square_dark, R.color.chucker_chessboard_odd_square_dark, R.dimen.chucker_half_grid);
        }

        @Override // com.chuckerteam.chucker.internal.p010ui.transaction.TransactionPayloadViewHolder
        public void bind(@NotNull TransactionPayloadItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof TransactionPayloadItem.ImageItem) {
                TransactionPayloadItem.ImageItem imageItem = (TransactionPayloadItem.ImageItem) item;
                this.f43040a.binaryData.setImageBitmap(imageItem.getImage());
                this.f43040a.getRoot().setBackground(m49830b(imageItem.getLuminance()));
            }
        }
    }

    public /* synthetic */ TransactionPayloadViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    public abstract void bind(@NotNull TransactionPayloadItem transactionPayloadItem);

    public TransactionPayloadViewHolder(View view) {
        super(view);
    }
}
