package com.chuckerteam.chucker.internal.support;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.internal.data.entity.HttpHeader;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import okio.Buffer;
import okio.Source;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/TransactionCurlCommandSharable;", "Lcom/chuckerteam/chucker/internal/support/Sharable;", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "<init>", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lokio/Source;", "toSharableContent", "(Landroid/content/Context;)Lokio/Source;", "Lcom/chuckerteam/chucker/internal/data/entity/HttpHeader;", "header", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lcom/chuckerteam/chucker/internal/data/entity/HttpHeader;)Z", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionCurlCommandSharable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionCurlCommandSharable.kt\ncom/chuckerteam/chucker/internal/support/TransactionCurlCommandSharable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1855#2,2:41\n*S KotlinDebug\n*F\n+ 1 TransactionCurlCommandSharable.kt\ncom/chuckerteam/chucker/internal/support/TransactionCurlCommandSharable\n*L\n17#1:41,2\n*E\n"})
/* loaded from: classes3.dex */
public final class TransactionCurlCommandSharable implements Sharable {

    /* renamed from: a */
    public final HttpTransaction f42983a;

    public TransactionCurlCommandSharable(@NotNull HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f42983a = transaction;
    }

    /* renamed from: a */
    public final boolean m49892a(HttpHeader httpHeader) {
        if ((AbstractC20204hN1.equals("Accept-Encoding", httpHeader.getName(), true) && StringsKt__StringsKt.contains((CharSequence) "gzip", (CharSequence) httpHeader.getValue(), true)) || StringsKt__StringsKt.contains((CharSequence) "br", (CharSequence) httpHeader.getValue(), true)) {
            return true;
        }
        return false;
    }

    @Override // com.chuckerteam.chucker.internal.support.Sharable
    @NotNull
    public Source toSharableContent(@NotNull Context context) {
        boolean z;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Buffer buffer = new Buffer();
        String method = this.f42983a.getMethod();
        buffer.writeUtf8("curl -X " + method);
        List<HttpHeader> parsedRequestHeaders = this.f42983a.getParsedRequestHeaders();
        if (parsedRequestHeaders != null) {
            z = false;
            for (HttpHeader httpHeader : parsedRequestHeaders) {
                if (m49892a(httpHeader)) {
                    z = true;
                }
                String name = httpHeader.getName();
                String value = httpHeader.getValue();
                buffer.writeUtf8(" -H \"" + name + ": " + value + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            }
        } else {
            z = false;
        }
        String requestBody = this.f42983a.getRequestBody();
        if (requestBody != null && requestBody.length() != 0) {
            String replace$default = AbstractC20204hN1.replace$default(requestBody, "\n", "\\n", false, 4, (Object) null);
            buffer.writeUtf8(" --data $'" + replace$default + OperatorName.SHOW_TEXT_LINE);
        }
        if (z) {
            str = " --compressed ";
        } else {
            str = HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
        }
        String formattedUrl = this.f42983a.getFormattedUrl(false);
        buffer.writeUtf8(str + formattedUrl);
        return buffer;
    }
}
