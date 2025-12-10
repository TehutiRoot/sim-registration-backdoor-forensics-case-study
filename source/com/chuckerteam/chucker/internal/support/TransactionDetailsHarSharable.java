package com.chuckerteam.chucker.internal.support;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Source;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/TransactionDetailsHarSharable;", "Lcom/chuckerteam/chucker/internal/support/Sharable;", "", "content", "<init>", "(Ljava/lang/String;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lokio/Source;", "toSharableContent", "(Landroid/content/Context;)Lokio/Source;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class TransactionDetailsHarSharable implements Sharable {

    /* renamed from: a */
    public final String f42984a;

    public TransactionDetailsHarSharable(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f42984a = content;
    }

    @Override // com.chuckerteam.chucker.internal.support.Sharable
    @NotNull
    public Source toSharableContent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Buffer buffer = new Buffer();
        String str = this.f42984a;
        return buffer.writeUtf8(str + "\n");
    }
}
