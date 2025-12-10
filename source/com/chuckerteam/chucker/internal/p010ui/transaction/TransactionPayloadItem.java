package com.chuckerteam.chucker.internal.p010ui.transaction;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem;", "", "()V", "BodyLineItem", "HeaderItem", "ImageItem", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem$BodyLineItem;", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem$HeaderItem;", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem$ImageItem;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadItem */
/* loaded from: classes3.dex */
public abstract class TransactionPayloadItem {

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005¨\u0006\u000b"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem$BodyLineItem;", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem;", "Landroid/text/SpannableStringBuilder;", "line", "<init>", "(Landroid/text/SpannableStringBuilder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/text/SpannableStringBuilder;", "getLine", "()Landroid/text/SpannableStringBuilder;", "setLine", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadItem$BodyLineItem */
    /* loaded from: classes3.dex */
    public static final class BodyLineItem extends TransactionPayloadItem {

        /* renamed from: a */
        public SpannableStringBuilder f43033a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BodyLineItem(@NotNull SpannableStringBuilder line) {
            super(null);
            Intrinsics.checkNotNullParameter(line, "line");
            this.f43033a = line;
        }

        @NotNull
        public final SpannableStringBuilder getLine() {
            return this.f43033a;
        }

        public final void setLine(@NotNull SpannableStringBuilder spannableStringBuilder) {
            Intrinsics.checkNotNullParameter(spannableStringBuilder, "<set-?>");
            this.f43033a = spannableStringBuilder;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem$HeaderItem;", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem;", "Landroid/text/Spanned;", "headers", "<init>", "(Landroid/text/Spanned;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/text/Spanned;", "getHeaders", "()Landroid/text/Spanned;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadItem$HeaderItem */
    /* loaded from: classes3.dex */
    public static final class HeaderItem extends TransactionPayloadItem {

        /* renamed from: a */
        public final Spanned f43034a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderItem(@NotNull Spanned headers) {
            super(null);
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f43034a = headers;
        }

        @NotNull
        public final Spanned getHeaders() {
            return this.f43034a;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem$ImageItem;", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem;", "Landroid/graphics/Bitmap;", ResponseProcessor.CONTENT_TYPE_IMAGE, "", "luminance", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/Double;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/Bitmap;", "getImage", "()Landroid/graphics/Bitmap;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Double;", "getLuminance", "()Ljava/lang/Double;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadItem$ImageItem */
    /* loaded from: classes3.dex */
    public static final class ImageItem extends TransactionPayloadItem {

        /* renamed from: a */
        public final Bitmap f43035a;

        /* renamed from: b */
        public final Double f43036b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageItem(@NotNull Bitmap image, @Nullable Double d) {
            super(null);
            Intrinsics.checkNotNullParameter(image, "image");
            this.f43035a = image;
            this.f43036b = d;
        }

        @NotNull
        public final Bitmap getImage() {
            return this.f43035a;
        }

        @Nullable
        public final Double getLuminance() {
            return this.f43036b;
        }
    }

    public /* synthetic */ TransactionPayloadItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public TransactionPayloadItem() {
    }
}
