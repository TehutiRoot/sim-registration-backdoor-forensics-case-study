package com.chuckerteam.chucker.internal.data.entity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import androidx.core.app.NotificationCompat;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.internal.support.FormatUtils;
import com.chuckerteam.chucker.internal.support.FormattedUrl;
import com.chuckerteam.chucker.internal.support.JsonConverter;
import com.chuckerteam.chucker.internal.support.SpanTextUtil;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.gson.reflect.TypeToken;
import com.zxy.tiny.common.UriUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import org.apache.commons.cli.HelpFormatter;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Entity(tableName = "transactions")
@Metadata(m28851d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\bG\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0002«\u0001B\u0007\b\u0017¢\u0006\u0002\u0010\u0002B±\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010!\u001a\u00020\u0017\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010$\u001a\u00020\u0017\u0012\b\u0010%\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010&J\u001d\u0010\u0088\u0001\u001a\u00020\t2\u0007\u0010\u0089\u0001\u001a\u00020\t2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u008b\u0001\u001a\u00020\t2\u0007\u0010\u008c\u0001\u001a\u00020\u0004H\u0002J\u0010\u0010\u008d\u0001\u001a\u00020\t2\u0007\u0010\u008e\u0001\u001a\u00020\u0017J\u0007\u0010\u008f\u0001\u001a\u00020\tJ\u0007\u0010\u0090\u0001\u001a\u00020\tJ\u0010\u0010\u0091\u0001\u001a\u00020\t2\u0007\u0010\u008e\u0001\u001a\u00020\u0017J\u0007\u0010\u0092\u0001\u001a\u00020\u0004J\u0011\u0010\u0093\u0001\u001a\f\u0012\u0005\u0012\u00030\u0095\u0001\u0018\u00010\u0094\u0001J\u0011\u0010\u0096\u0001\u001a\f\u0012\u0005\u0012\u00030\u0095\u0001\u0018\u00010\u0094\u0001J\u0010\u0010\u0097\u0001\u001a\u00020\t2\u0007\u0010\u0098\u0001\u001a\u00020\u0017J\u0007\u0010\u0099\u0001\u001a\u00020\u0004J\u0010\u0010\u009a\u0001\u001a\u00020\t2\u0007\u0010\u0098\u0001\u001a\u00020\u0017J\u0007\u0010\u009b\u0001\u001a\u00020\u0004J\u0014\u0010\u009c\u0001\u001a\u00030\u009d\u00012\n\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u0001J\u0014\u0010 \u0001\u001a\u00030\u009d\u00012\n\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u0001J\u0012\u0010¡\u0001\u001a\u00020\u00172\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0000J\u0011\u0010£\u0001\u001a\u00020\u00002\b\u0010¤\u0001\u001a\u00030¥\u0001J\u0011\u00102\u001a\u00030¦\u00012\b\u0010§\u0001\u001a\u00030¨\u0001J\u0018\u0010P\u001a\u00030¦\u00012\u000f\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010\u0094\u0001J\u0011\u0010P\u001a\u00030¦\u00012\b\u0010§\u0001\u001a\u00030¨\u0001J\u0018\u0010g\u001a\u00030¦\u00012\u000f\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010\u0094\u0001J\u0011\u0010g\u001a\u00030¦\u00012\b\u0010§\u0001\u001a\u00030¨\u0001J+\u0010©\u0001\u001a\u00030\u009d\u00012\b\u0010\u0089\u0001\u001a\u00030\u009d\u00012\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\t2\n\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u0001H\u0002J\u001b\u0010ª\u0001\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010\u0094\u00012\b\u0010§\u0001\u001a\u00030¨\u0001H\u0002R\u0013\u0010'\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b(\u0010)R \u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010)\"\u0004\b+\u0010,R\u001e\u0010$\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u0010%\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010)\"\u0004\b2\u0010,R \u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010)\"\u0004\b4\u0010,R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010.\"\u0004\b9\u00100R\u001e\u0010!\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010.\"\u0004\b:\u00100R\u0011\u0010;\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b;\u0010.R \u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010)\"\u0004\b=\u0010,R\u0011\u0010>\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b?\u0010)R \u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010)\"\u0004\bA\u0010,R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010)\"\u0004\bC\u0010,R \u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010)\"\u0004\bE\u0010,R \u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010)\"\u0004\bG\u0010,R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010L\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0013\u0010M\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bN\u0010)R \u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010)\"\u0004\bP\u0010,R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010L\u001a\u0004\bQ\u0010I\"\u0004\bR\u0010KR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010L\u001a\u0004\bS\u0010I\"\u0004\bT\u0010KR\u0011\u0010U\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bV\u0010)R \u0010 \u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010)\"\u0004\bX\u0010,R \u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010)\"\u0004\bZ\u0010,R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010_\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R \u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010)\"\u0004\ba\u0010,R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010L\u001a\u0004\bb\u0010I\"\u0004\bc\u0010KR\u0013\u0010d\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\be\u0010)R \u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010)\"\u0004\bg\u0010,R\"\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010L\u001a\u0004\bh\u0010I\"\u0004\bi\u0010KR\u0013\u0010j\u001a\u0004\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bl\u0010mR \u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR \u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010)\"\u0004\bs\u0010,R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010L\u001a\u0004\bt\u0010I\"\u0004\bu\u0010KR\u0013\u0010v\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bw\u0010)R\u0013\u0010x\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\by\u0010)R \u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010)\"\u0004\b{\u0010,R \u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010)\"\u0004\b}\u0010,R\u0013\u0010~\u001a\u00020\u007f8F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010L\u001a\u0005\b\u0082\u0001\u0010I\"\u0005\b\u0083\u0001\u0010KR\u0013\u0010\u0084\u0001\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010)R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010)\"\u0005\b\u0087\u0001\u0010,¨\u0006¬\u0001"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "", "()V", "id", "", "requestDate", "responseDate", "tookMs", "protocol", "", FirebaseAnalytics.Param.METHOD, ImagesContract.URL, "host", ClientCookie.PATH_ATTR, "scheme", "responseTlsVersion", "responseCipherSuite", "requestPayloadSize", "requestContentType", "requestHeaders", "requestHeadersSize", "requestBody", "isRequestBodyEncoded", "", "responseCode", "", "responseMessage", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "responsePayloadSize", "responseContentType", "responseHeaders", "responseHeadersSize", "responseBody", "isResponseBodyEncoded", "responseImageData", "", "graphQlDetected", "graphQlOperationName", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Z[BZLjava/lang/String;)V", "durationString", "getDurationString", "()Ljava/lang/String;", "getError", "setError", "(Ljava/lang/String;)V", "getGraphQlDetected", "()Z", "setGraphQlDetected", "(Z)V", "getGraphQlOperationName", "setGraphQlOperationName", "getHost", "setHost", "getId", "()J", "setId", "(J)V", "setRequestBodyEncoded", "setResponseBodyEncoded", "isSsl", "getMethod", "setMethod", "notificationText", "getNotificationText", "getPath", "setPath", "getProtocol", "setProtocol", "getRequestBody", "setRequestBody", "getRequestContentType", "setRequestContentType", "getRequestDate", "()Ljava/lang/Long;", "setRequestDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "requestDateString", "getRequestDateString", "getRequestHeaders", "setRequestHeaders", "getRequestHeadersSize", "setRequestHeadersSize", "getRequestPayloadSize", "setRequestPayloadSize", "requestSizeString", "getRequestSizeString", "getResponseBody", "setResponseBody", "getResponseCipherSuite", "setResponseCipherSuite", "getResponseCode", "()Ljava/lang/Integer;", "setResponseCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getResponseContentType", "setResponseContentType", "getResponseDate", "setResponseDate", "responseDateString", "getResponseDateString", "getResponseHeaders", "setResponseHeaders", "getResponseHeadersSize", "setResponseHeadersSize", "responseImageBitmap", "Landroid/graphics/Bitmap;", "getResponseImageBitmap", "()Landroid/graphics/Bitmap;", "getResponseImageData", "()[B", "setResponseImageData", "([B)V", "getResponseMessage", "setResponseMessage", "getResponsePayloadSize", "setResponsePayloadSize", "responseSizeString", "getResponseSizeString", "responseSummaryText", "getResponseSummaryText", "getResponseTlsVersion", "setResponseTlsVersion", "getScheme", "setScheme", NotificationCompat.CATEGORY_STATUS, "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$Status;", "getStatus", "()Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$Status;", "getTookMs", "setTookMs", "totalSizeString", "getTotalSizeString", "getUrl", "setUrl", "formatBody", "body", "contentType", "formatBytes", "bytes", "getFormattedPath", "encode", "getFormattedRequestBody", "getFormattedResponseBody", "getFormattedUrl", "getHarResponseBodySize", "getParsedRequestHeaders", "", "Lcom/chuckerteam/chucker/internal/data/entity/HttpHeader;", "getParsedResponseHeaders", "getRequestHeadersString", "withMarkup", "getRequestTotalSize", "getResponseHeadersString", "getResponseTotalSize", "getSpannedRequestBody", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getSpannedResponseBody", "hasTheSameContent", "other", "populateUrl", "httpUrl", "Lokhttp3/HttpUrl;", "", "headers", "Lokhttp3/Headers;", "spanBody", "toHttpHeaderList", "Status", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nHttpTransaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpTransaction.kt\ncom/chuckerteam/chucker/internal/data/entity/HttpTransaction\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
/* loaded from: classes3.dex */
public final class HttpTransaction {
    @ColumnInfo(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    @Nullable
    private String error;
    @ColumnInfo(name = "graphQlDetected")
    private boolean graphQlDetected;
    @ColumnInfo(name = "graphQlOperationName")
    @Nullable
    private String graphQlOperationName;
    @ColumnInfo(name = "host")
    @Nullable
    private String host;
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")

    /* renamed from: id */
    private long f42790id;
    @ColumnInfo(name = "isRequestBodyEncoded")
    private boolean isRequestBodyEncoded;
    @ColumnInfo(name = "isResponseBodyEncoded")
    private boolean isResponseBodyEncoded;
    @ColumnInfo(name = FirebaseAnalytics.Param.METHOD)
    @Nullable
    private String method;
    @ColumnInfo(name = ClientCookie.PATH_ATTR)
    @Nullable
    private String path;
    @ColumnInfo(name = "protocol")
    @Nullable
    private String protocol;
    @ColumnInfo(name = "requestBody")
    @Nullable
    private String requestBody;
    @ColumnInfo(name = "requestContentType")
    @Nullable
    private String requestContentType;
    @ColumnInfo(name = "requestDate")
    @Nullable
    private Long requestDate;
    @ColumnInfo(name = "requestHeaders")
    @Nullable
    private String requestHeaders;
    @ColumnInfo(name = "requestHeadersSize")
    @Nullable
    private Long requestHeadersSize;
    @ColumnInfo(name = "requestPayloadSize")
    @Nullable
    private Long requestPayloadSize;
    @ColumnInfo(name = "responseBody")
    @Nullable
    private String responseBody;
    @ColumnInfo(name = "responseCipherSuite")
    @Nullable
    private String responseCipherSuite;
    @ColumnInfo(name = "responseCode")
    @Nullable
    private Integer responseCode;
    @ColumnInfo(name = "responseContentType")
    @Nullable
    private String responseContentType;
    @ColumnInfo(name = "responseDate")
    @Nullable
    private Long responseDate;
    @ColumnInfo(name = "responseHeaders")
    @Nullable
    private String responseHeaders;
    @ColumnInfo(name = "responseHeadersSize")
    @Nullable
    private Long responseHeadersSize;
    @ColumnInfo(name = "responseImageData")
    @Nullable
    private byte[] responseImageData;
    @ColumnInfo(name = "responseMessage")
    @Nullable
    private String responseMessage;
    @ColumnInfo(name = "responsePayloadSize")
    @Nullable
    private Long responsePayloadSize;
    @ColumnInfo(name = "responseTlsVersion")
    @Nullable
    private String responseTlsVersion;
    @ColumnInfo(name = "scheme")
    @Nullable
    private String scheme;
    @ColumnInfo(name = "tookMs")
    @Nullable
    private Long tookMs;
    @ColumnInfo(name = ImagesContract.URL)
    @Nullable
    private String url;

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$Status;", "", "(Ljava/lang/String;I)V", "Requested", "Complete", Constant.checkESimStatus.Failed, "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public enum Status {
        Requested,
        Complete,
        Failed
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.Failed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.Requested.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HttpTransaction(long j, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Long l4, @Nullable String str9, @Nullable String str10, @Nullable Long l5, @Nullable String str11, boolean z, @Nullable Integer num, @Nullable String str12, @Nullable String str13, @Nullable Long l6, @Nullable String str14, @Nullable String str15, @Nullable Long l7, @Nullable String str16, boolean z2, @Nullable byte[] bArr, boolean z3, @Nullable String str17) {
        this.f42790id = j;
        this.requestDate = l;
        this.responseDate = l2;
        this.tookMs = l3;
        this.protocol = str;
        this.method = str2;
        this.url = str3;
        this.host = str4;
        this.path = str5;
        this.scheme = str6;
        this.responseTlsVersion = str7;
        this.responseCipherSuite = str8;
        this.requestPayloadSize = l4;
        this.requestContentType = str9;
        this.requestHeaders = str10;
        this.requestHeadersSize = l5;
        this.requestBody = str11;
        this.isRequestBodyEncoded = z;
        this.responseCode = num;
        this.responseMessage = str12;
        this.error = str13;
        this.responsePayloadSize = l6;
        this.responseContentType = str14;
        this.responseHeaders = str15;
        this.responseHeadersSize = l7;
        this.responseBody = str16;
        this.isResponseBodyEncoded = z2;
        this.responseImageData = bArr;
        this.graphQlDetected = z3;
        this.graphQlOperationName = str17;
    }

    private final String formatBody(String str, String str2) {
        if (str2 != null && !AbstractC20204hN1.isBlank(str2)) {
            if (StringsKt__StringsKt.contains((CharSequence) str2, (CharSequence) "json", true)) {
                return FormatUtils.INSTANCE.formatJson(str);
            }
            if (StringsKt__StringsKt.contains((CharSequence) str2, (CharSequence) "xml", true)) {
                return FormatUtils.INSTANCE.formatXml(str);
            }
            if (StringsKt__StringsKt.contains((CharSequence) str2, (CharSequence) "x-www-form-urlencoded", true)) {
                return FormatUtils.INSTANCE.formatUrlEncodedForm(str);
            }
            return str;
        }
        return str;
    }

    private final String formatBytes(long j) {
        return FormatUtils.INSTANCE.formatByteCount(j, true);
    }

    private final CharSequence spanBody(CharSequence charSequence, String str, Context context) {
        if (str != null && !AbstractC20204hN1.isBlank(str)) {
            if (StringsKt__StringsKt.contains((CharSequence) str, (CharSequence) "json", true) && context != null) {
                return new SpanTextUtil(context).spanJson(charSequence);
            }
            return formatBody(charSequence.toString(), str);
        }
        return charSequence;
    }

    private final List<HttpHeader> toHttpHeaderList(Headers headers) {
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new HttpHeader(headers.name(i), headers.value(i)));
        }
        return arrayList;
    }

    @Nullable
    public final String getDurationString() {
        Long l = this.tookMs;
        if (l != null) {
            long longValue = l.longValue();
            return longValue + " ms";
        }
        return null;
    }

    @Nullable
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final String getFormattedPath(boolean z) {
        HttpUrl httpUrl;
        String str = this.url;
        if (str != null && (httpUrl = HttpUrl.Companion.get(str)) != null) {
            return FormattedUrl.Companion.fromHttpUrl(httpUrl, z).getPathWithQuery();
        }
        return "";
    }

    @NotNull
    public final String getFormattedRequestBody() {
        String formatBody;
        String str = this.requestBody;
        if (str == null || (formatBody = formatBody(str, this.requestContentType)) == null) {
            return "";
        }
        return formatBody;
    }

    @NotNull
    public final String getFormattedResponseBody() {
        String formatBody;
        String str = this.responseBody;
        if (str == null || (formatBody = formatBody(str, this.responseContentType)) == null) {
            return "";
        }
        return formatBody;
    }

    @NotNull
    public final String getFormattedUrl(boolean z) {
        HttpUrl httpUrl;
        String str = this.url;
        if (str != null && (httpUrl = HttpUrl.Companion.get(str)) != null) {
            return FormattedUrl.Companion.fromHttpUrl(httpUrl, z).getUrl();
        }
        return "";
    }

    public final boolean getGraphQlDetected() {
        return this.graphQlDetected;
    }

    @Nullable
    public final String getGraphQlOperationName() {
        return this.graphQlOperationName;
    }

    public final long getHarResponseBodySize() {
        Long l;
        Integer num = this.responseCode;
        if ((num != null && num.intValue() == 304) || (l = this.responsePayloadSize) == null) {
            return 0L;
        }
        return l.longValue();
    }

    @Nullable
    public final String getHost() {
        return this.host;
    }

    public final long getId() {
        return this.f42790id;
    }

    @Nullable
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final String getNotificationText() {
        int i = WhenMappings.$EnumSwitchMapping$0[getStatus().ordinal()];
        if (i != 1) {
            if (i != 2) {
                Integer num = this.responseCode;
                String str = this.method;
                String str2 = this.path;
                return num + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str2;
            }
            String str3 = this.method;
            String str4 = this.path;
            return " . . .  " + str3 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str4;
        }
        String str5 = this.method;
        String str6 = this.path;
        return " ! ! !  " + str5 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str6;
    }

    @Nullable
    public final List<HttpHeader> getParsedRequestHeaders() {
        return (List) JsonConverter.INSTANCE.getInstance().fromJson(this.requestHeaders, new TypeToken<List<? extends HttpHeader>>() { // from class: com.chuckerteam.chucker.internal.data.entity.HttpTransaction$getParsedRequestHeaders$1
        }.getType());
    }

    @Nullable
    public final List<HttpHeader> getParsedResponseHeaders() {
        return (List) JsonConverter.INSTANCE.getInstance().fromJson(this.responseHeaders, new TypeToken<List<? extends HttpHeader>>() { // from class: com.chuckerteam.chucker.internal.data.entity.HttpTransaction$getParsedResponseHeaders$1
        }.getType());
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final String getProtocol() {
        return this.protocol;
    }

    @Nullable
    public final String getRequestBody() {
        return this.requestBody;
    }

    @Nullable
    public final String getRequestContentType() {
        return this.requestContentType;
    }

    @Nullable
    public final Long getRequestDate() {
        return this.requestDate;
    }

    @Nullable
    public final String getRequestDateString() {
        Long l = this.requestDate;
        if (l != null) {
            return new Date(l.longValue()).toString();
        }
        return null;
    }

    @Nullable
    public final String getRequestHeaders() {
        return this.requestHeaders;
    }

    @Nullable
    public final Long getRequestHeadersSize() {
        return this.requestHeadersSize;
    }

    @NotNull
    public final String getRequestHeadersString(boolean z) {
        return FormatUtils.INSTANCE.formatHeaders(getParsedRequestHeaders(), z);
    }

    @Nullable
    public final Long getRequestPayloadSize() {
        return this.requestPayloadSize;
    }

    @NotNull
    public final String getRequestSizeString() {
        long j;
        Long l = this.requestPayloadSize;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        return formatBytes(j);
    }

    public final long getRequestTotalSize() {
        long j;
        Long l = this.requestHeadersSize;
        long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Long l2 = this.requestPayloadSize;
        if (l2 != null) {
            j2 = l2.longValue();
        }
        return j + j2;
    }

    @Nullable
    public final String getResponseBody() {
        return this.responseBody;
    }

    @Nullable
    public final String getResponseCipherSuite() {
        return this.responseCipherSuite;
    }

    @Nullable
    public final Integer getResponseCode() {
        return this.responseCode;
    }

    @Nullable
    public final String getResponseContentType() {
        return this.responseContentType;
    }

    @Nullable
    public final Long getResponseDate() {
        return this.responseDate;
    }

    @Nullable
    public final String getResponseDateString() {
        Long l = this.responseDate;
        if (l != null) {
            return new Date(l.longValue()).toString();
        }
        return null;
    }

    @Nullable
    public final String getResponseHeaders() {
        return this.responseHeaders;
    }

    @Nullable
    public final Long getResponseHeadersSize() {
        return this.responseHeadersSize;
    }

    @NotNull
    public final String getResponseHeadersString(boolean z) {
        return FormatUtils.INSTANCE.formatHeaders(getParsedResponseHeaders(), z);
    }

    @Nullable
    public final Bitmap getResponseImageBitmap() {
        byte[] bArr = this.responseImageData;
        if (bArr != null) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    @Nullable
    public final byte[] getResponseImageData() {
        return this.responseImageData;
    }

    @Nullable
    public final String getResponseMessage() {
        return this.responseMessage;
    }

    @Nullable
    public final Long getResponsePayloadSize() {
        return this.responsePayloadSize;
    }

    @Nullable
    public final String getResponseSizeString() {
        Long l = this.responsePayloadSize;
        if (l != null) {
            return formatBytes(l.longValue());
        }
        return null;
    }

    @Nullable
    public final String getResponseSummaryText() {
        int i = WhenMappings.$EnumSwitchMapping$0[getStatus().ordinal()];
        if (i != 1) {
            if (i != 2) {
                Integer num = this.responseCode;
                String str = this.responseMessage;
                return num + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str;
            }
            return null;
        }
        return this.error;
    }

    @Nullable
    public final String getResponseTlsVersion() {
        return this.responseTlsVersion;
    }

    public final long getResponseTotalSize() {
        long j;
        Long l = this.responseHeadersSize;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        return j + getHarResponseBodySize();
    }

    @Nullable
    public final String getScheme() {
        return this.scheme;
    }

    @NotNull
    public final CharSequence getSpannedRequestBody(@Nullable Context context) {
        CharSequence spanBody;
        String str = this.requestBody;
        if (str == null || (spanBody = spanBody(str, this.requestContentType, context)) == null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf("");
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(\"\")");
            return valueOf;
        }
        return spanBody;
    }

    @NotNull
    public final CharSequence getSpannedResponseBody(@Nullable Context context) {
        CharSequence spanBody;
        String str = this.responseBody;
        if (str == null || (spanBody = spanBody(str, this.responseContentType, context)) == null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf("");
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(\"\")");
            return valueOf;
        }
        return spanBody;
    }

    @NotNull
    public final Status getStatus() {
        if (this.error != null) {
            return Status.Failed;
        }
        if (this.responseCode == null) {
            return Status.Requested;
        }
        return Status.Complete;
    }

    @Nullable
    public final Long getTookMs() {
        return this.tookMs;
    }

    @NotNull
    public final String getTotalSizeString() {
        long j;
        Long l = this.requestPayloadSize;
        long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Long l2 = this.responsePayloadSize;
        if (l2 != null) {
            j2 = l2.longValue();
        }
        return formatBytes(j + j2);
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x011a, code lost:
        if (java.util.Arrays.equals(r2, r3) == false) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasTheSameContent(@org.jetbrains.annotations.Nullable com.chuckerteam.chucker.internal.data.entity.HttpTransaction r8) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.data.entity.HttpTransaction.hasTheSameContent(com.chuckerteam.chucker.internal.data.entity.HttpTransaction):boolean");
    }

    public final boolean isRequestBodyEncoded() {
        return this.isRequestBodyEncoded;
    }

    public final boolean isResponseBodyEncoded() {
        return this.isResponseBodyEncoded;
    }

    public final boolean isSsl() {
        return AbstractC20204hN1.equals(this.scheme, UriUtil.HTTPS_SCHEME, true);
    }

    @NotNull
    public final HttpTransaction populateUrl(@NotNull HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(httpUrl, "httpUrl");
        FormattedUrl fromHttpUrl = FormattedUrl.Companion.fromHttpUrl(httpUrl, false);
        this.url = fromHttpUrl.getUrl();
        this.host = fromHttpUrl.getHost();
        this.path = fromHttpUrl.getPathWithQuery();
        this.scheme = fromHttpUrl.getScheme();
        return this;
    }

    public final void setError(@Nullable String str) {
        this.error = str;
    }

    public final void setGraphQlDetected(boolean z) {
        this.graphQlDetected = z;
    }

    public final void setGraphQlOperationName(@Nullable String str) {
        this.graphQlOperationName = str;
    }

    public final void setHost(@Nullable String str) {
        this.host = str;
    }

    public final void setId(long j) {
        this.f42790id = j;
    }

    public final void setMethod(@Nullable String str) {
        this.method = str;
    }

    public final void setPath(@Nullable String str) {
        this.path = str;
    }

    public final void setProtocol(@Nullable String str) {
        this.protocol = str;
    }

    public final void setRequestBody(@Nullable String str) {
        this.requestBody = str;
    }

    public final void setRequestBodyEncoded(boolean z) {
        this.isRequestBodyEncoded = z;
    }

    public final void setRequestContentType(@Nullable String str) {
        this.requestContentType = str;
    }

    public final void setRequestDate(@Nullable Long l) {
        this.requestDate = l;
    }

    public final void setRequestHeaders(@Nullable String str) {
        this.requestHeaders = str;
    }

    public final void setRequestHeadersSize(@Nullable Long l) {
        this.requestHeadersSize = l;
    }

    public final void setRequestPayloadSize(@Nullable Long l) {
        this.requestPayloadSize = l;
    }

    public final void setResponseBody(@Nullable String str) {
        this.responseBody = str;
    }

    public final void setResponseBodyEncoded(boolean z) {
        this.isResponseBodyEncoded = z;
    }

    public final void setResponseCipherSuite(@Nullable String str) {
        this.responseCipherSuite = str;
    }

    public final void setResponseCode(@Nullable Integer num) {
        this.responseCode = num;
    }

    public final void setResponseContentType(@Nullable String str) {
        this.responseContentType = str;
    }

    public final void setResponseDate(@Nullable Long l) {
        this.responseDate = l;
    }

    public final void setResponseHeaders(@Nullable String str) {
        this.responseHeaders = str;
    }

    public final void setResponseHeadersSize(@Nullable Long l) {
        this.responseHeadersSize = l;
    }

    public final void setResponseImageData(@Nullable byte[] bArr) {
        this.responseImageData = bArr;
    }

    public final void setResponseMessage(@Nullable String str) {
        this.responseMessage = str;
    }

    public final void setResponsePayloadSize(@Nullable Long l) {
        this.responsePayloadSize = l;
    }

    public final void setResponseTlsVersion(@Nullable String str) {
        this.responseTlsVersion = str;
    }

    public final void setScheme(@Nullable String str) {
        this.scheme = str;
    }

    public final void setTookMs(@Nullable Long l) {
        this.tookMs = l;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final void setGraphQlOperationName(@NotNull Headers headers) {
        Object obj;
        Intrinsics.checkNotNullParameter(headers, "headers");
        Iterator<T> it = toHttpHeaderList(headers).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String lowerCase = ((HttpHeader) obj).getName().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "operation-name", false, 2, (Object) null)) {
                break;
            }
        }
        HttpHeader httpHeader = (HttpHeader) obj;
        this.graphQlOperationName = httpHeader != null ? httpHeader.getValue() : null;
    }

    public final void setRequestHeaders(@NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        setRequestHeaders(toHttpHeaderList(headers));
    }

    public final void setResponseHeaders(@NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        setResponseHeaders(toHttpHeaderList(headers));
    }

    public final void setRequestHeaders(@NotNull List<HttpHeader> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.requestHeaders = JsonConverter.INSTANCE.getInstance().toJson(headers);
    }

    public final void setResponseHeaders(@NotNull List<HttpHeader> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.responseHeaders = JsonConverter.INSTANCE.getInstance().toJson(headers);
    }

    public /* synthetic */ HttpTransaction(long j, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l4, String str9, String str10, Long l5, String str11, boolean z, Integer num, String str12, String str13, Long l6, String str14, String str15, Long l7, String str16, boolean z2, byte[] bArr, boolean z3, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, l, l2, l3, str, str2, str3, str4, str5, str6, str7, str8, l4, str9, str10, l5, str11, (i & 131072) != 0 ? false : z, num, str12, str13, l6, str14, str15, l7, str16, (i & 67108864) != 0 ? false : z2, bArr, (i & 268435456) != 0 ? false : z3, str17);
    }

    @Ignore
    public HttpTransaction() {
        this(0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, false, null, 335675393, null);
    }
}
