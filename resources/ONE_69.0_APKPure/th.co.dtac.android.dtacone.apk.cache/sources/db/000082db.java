package com.chuckerteam.chucker.internal.support;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Source;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m29142d2 = {"Lcom/chuckerteam/chucker/internal/support/TransactionDetailsSharable;", "Lcom/chuckerteam/chucker/internal/support/Sharable;", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "", "encodeUrls", "<init>", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Z)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lokio/Source;", "toSharableContent", "(Landroid/content/Context;)Lokio/Source;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "com.github.ChuckerTeam.Chucker.library"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class TransactionDetailsSharable implements Sharable {

    /* renamed from: a */
    public final HttpTransaction f42997a;

    /* renamed from: b */
    public final boolean f42998b;

    public TransactionDetailsSharable(@NotNull HttpTransaction transaction, boolean z) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f42997a = transaction;
        this.f42998b = z;
    }

    @Override // com.chuckerteam.chucker.internal.support.Sharable
    @NotNull
    public Source toSharableContent(@NotNull Context context) {
        int i;
        int i2;
        String string;
        int i3;
        String string2;
        Intrinsics.checkNotNullParameter(context, "context");
        Buffer buffer = new Buffer();
        String string3 = context.getString(R.string.chucker_url);
        String formattedUrl = this.f42997a.getFormattedUrl(this.f42998b);
        buffer.writeUtf8(string3 + ": " + formattedUrl + "\n");
        String string4 = context.getString(R.string.chucker_method);
        String method = this.f42997a.getMethod();
        buffer.writeUtf8(string4 + ": " + method + "\n");
        String string5 = context.getString(R.string.chucker_protocol);
        String protocol = this.f42997a.getProtocol();
        buffer.writeUtf8(string5 + ": " + protocol + "\n");
        String string6 = context.getString(R.string.chucker_status);
        HttpTransaction.Status status = this.f42997a.getStatus();
        buffer.writeUtf8(string6 + ": " + status + "\n");
        String string7 = context.getString(R.string.chucker_response);
        String responseSummaryText = this.f42997a.getResponseSummaryText();
        buffer.writeUtf8(string7 + ": " + responseSummaryText + "\n");
        if (this.f42997a.isSsl()) {
            i = R.string.chucker_yes;
        } else {
            i = R.string.chucker_no;
        }
        String string8 = context.getString(R.string.chucker_ssl);
        String string9 = context.getString(i);
        buffer.writeUtf8(string8 + ": " + string9 + "\n");
        buffer.writeUtf8("\n");
        String string10 = context.getString(R.string.chucker_request_time);
        String requestDateString = this.f42997a.getRequestDateString();
        buffer.writeUtf8(string10 + ": " + requestDateString + "\n");
        String string11 = context.getString(R.string.chucker_response_time);
        String responseDateString = this.f42997a.getResponseDateString();
        buffer.writeUtf8(string11 + ": " + responseDateString + "\n");
        String string12 = context.getString(R.string.chucker_duration);
        String durationString = this.f42997a.getDurationString();
        buffer.writeUtf8(string12 + ": " + durationString + "\n");
        buffer.writeUtf8("\n");
        String string13 = context.getString(R.string.chucker_request_size);
        String requestSizeString = this.f42997a.getRequestSizeString();
        buffer.writeUtf8(string13 + ": " + requestSizeString + "\n");
        String string14 = context.getString(R.string.chucker_response_size);
        String responseSizeString = this.f42997a.getResponseSizeString();
        buffer.writeUtf8(string14 + ": " + responseSizeString + "\n");
        String string15 = context.getString(R.string.chucker_total_size);
        String totalSizeString = this.f42997a.getTotalSizeString();
        buffer.writeUtf8(string15 + ": " + totalSizeString + "\n");
        buffer.writeUtf8("\n");
        String string16 = context.getString(R.string.chucker_request);
        buffer.writeUtf8("---------- " + string16 + " ----------\n\n");
        FormatUtils formatUtils = FormatUtils.INSTANCE;
        String formatHeaders = formatUtils.formatHeaders(this.f42997a.getParsedRequestHeaders(), false);
        if (!AbstractC19741eO1.isBlank(formatHeaders)) {
            buffer.writeUtf8(formatHeaders);
            buffer.writeUtf8("\n");
        }
        String requestBody = this.f42997a.getRequestBody();
        if (requestBody != null && !AbstractC19741eO1.isBlank(requestBody)) {
            string = this.f42997a.getFormattedRequestBody();
        } else {
            if (this.f42997a.isResponseBodyEncoded()) {
                i2 = R.string.chucker_body_omitted;
            } else {
                i2 = R.string.chucker_body_empty;
            }
            string = context.getString(i2);
        }
        Intrinsics.checkNotNullExpressionValue(string, "if (transaction.requestB…questBody()\n            }");
        buffer.writeUtf8(string);
        buffer.writeUtf8("\n\n");
        String string17 = context.getString(R.string.chucker_response);
        buffer.writeUtf8("---------- " + string17 + " ----------\n\n");
        String formatHeaders2 = formatUtils.formatHeaders(this.f42997a.getParsedResponseHeaders(), false);
        if (!AbstractC19741eO1.isBlank(formatHeaders2)) {
            buffer.writeUtf8(formatHeaders2);
            buffer.writeUtf8("\n");
        }
        String responseBody = this.f42997a.getResponseBody();
        if (responseBody != null && !AbstractC19741eO1.isBlank(responseBody)) {
            string2 = this.f42997a.getFormattedResponseBody();
        } else {
            if (this.f42997a.isResponseBodyEncoded()) {
                i3 = R.string.chucker_body_omitted;
            } else {
                i3 = R.string.chucker_body_empty;
            }
            string2 = context.getString(i3);
        }
        Intrinsics.checkNotNullExpressionValue(string2, "if (transaction.response…ponseBody()\n            }");
        buffer.writeUtf8(string2);
        return buffer;
    }
}