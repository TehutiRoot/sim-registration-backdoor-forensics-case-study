package com.chuckerteam.chucker.internal.support;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.Source;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/TransactionListDetailsSharable;", "Lcom/chuckerteam/chucker/internal/support/Sharable;", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transactions", "", "encodeUrls", "<init>", "(Ljava/util/List;Z)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lokio/Source;", "toSharableContent", "(Landroid/content/Context;)Lokio/Source;", "Lcom/chuckerteam/chucker/internal/support/TransactionDetailsSharable;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionListDetailsSharable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionListDetailsSharable.kt\ncom/chuckerteam/chucker/internal/support/TransactionListDetailsSharable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n1549#2:24\n1620#2,3:25\n*S KotlinDebug\n*F\n+ 1 TransactionListDetailsSharable.kt\ncom/chuckerteam/chucker/internal/support/TransactionListDetailsSharable\n*L\n13#1:24\n13#1:25,3\n*E\n"})
/* loaded from: classes3.dex */
public final class TransactionListDetailsSharable implements Sharable {

    /* renamed from: a */
    public final List f42987a;

    public TransactionListDetailsSharable(@NotNull List<HttpTransaction> transactions, boolean z) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        List<HttpTransaction> list = transactions;
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(list, 10));
        for (HttpTransaction httpTransaction : list) {
            arrayList.add(new TransactionDetailsSharable(httpTransaction, z));
        }
        this.f42987a = arrayList;
    }

    @Override // com.chuckerteam.chucker.internal.support.Sharable
    @NotNull
    public Source toSharableContent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new Buffer().writeUtf8(CollectionsKt___CollectionsKt.joinToString$default(this.f42987a, "\n" + context.getString(R.string.chucker_export_separator) + "\n", context.getString(R.string.chucker_export_prefix) + "\n", "\n" + context.getString(R.string.chucker_export_postfix) + "\n", 0, null, new TransactionListDetailsSharable$toSharableContent$1(context), 24, null));
    }
}
