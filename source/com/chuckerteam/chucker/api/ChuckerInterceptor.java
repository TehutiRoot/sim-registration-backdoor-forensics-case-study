package com.chuckerteam.chucker.api;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.api.ChuckerInterceptor;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.CacheDirectoryProvider;
import com.chuckerteam.chucker.internal.support.PlainTextDecoder;
import com.chuckerteam.chucker.internal.support.RequestProcessor;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.zxy.tiny.common.UriUtil;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0002-\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ!\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0016¨\u0006."}, m28850d2 = {"Lcom/chuckerteam/chucker/api/ChuckerInterceptor;", "Lokhttp3/Interceptor;", "Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "builder", "<init>", "(Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "", "", "headerName", "", "redactHeader", "([Ljava/lang/String;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/Set;", "headersToRedact", "", "Lcom/chuckerteam/chucker/api/BodyDecoder;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "decoders", "Lcom/chuckerteam/chucker/api/ChuckerCollector;", OperatorName.CURVE_TO, "Lcom/chuckerteam/chucker/api/ChuckerCollector;", "collector", "Lcom/chuckerteam/chucker/internal/support/RequestProcessor;", "d", "Lcom/chuckerteam/chucker/internal/support/RequestProcessor;", "requestProcessor", "Lcom/chuckerteam/chucker/internal/support/ResponseProcessor;", "e", "Lcom/chuckerteam/chucker/internal/support/ResponseProcessor;", "responseProcessor", "", OperatorName.FILL_NON_ZERO, "skipPaths", OperatorName.NON_STROKING_GRAY, "Builder", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nChuckerInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChuckerInterceptor.kt\ncom/chuckerteam/chucker/api/ChuckerInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,198:1\n1747#2,3:199\n*S KotlinDebug\n*F\n+ 1 ChuckerInterceptor.kt\ncom/chuckerteam/chucker/api/ChuckerInterceptor\n*L\n74#1:199,3\n*E\n"})
/* loaded from: classes3.dex */
public final class ChuckerInterceptor implements Interceptor {

    /* renamed from: g */
    public static final C5957a f42757g = new C5957a(null);

    /* renamed from: h */
    public static final List f42758h = AbstractC10108ds.listOf(PlainTextDecoder.INSTANCE);

    /* renamed from: a */
    public final Set f42759a;

    /* renamed from: b */
    public final List f42760b;

    /* renamed from: c */
    public final ChuckerCollector f42761c;

    /* renamed from: d */
    public final RequestProcessor f42762d;

    /* renamed from: e */
    public final ResponseProcessor f42763e;

    /* renamed from: f */
    public final Set f42764f;

    @Metadata(m28851d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0012\"\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0017J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\u00002\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0012\"\u00020\u000e¢\u0006\u0004\b\"\u0010\u0013J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0005R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u000b\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010=\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0016\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000e0D8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00180L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010\u001c\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010?\u001a\u0004\bU\u0010A\"\u0004\bV\u0010CR(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010F\u001a\u0004\bY\u0010H\"\u0004\bZ\u0010J¨\u0006["}, m28850d2 = {"Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lcom/chuckerteam/chucker/api/ChuckerCollector;", "collector", "(Lcom/chuckerteam/chucker/api/ChuckerCollector;)Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "", "length", "maxContentLength", "(J)Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "", "", "headerNames", "redactHeaders", "(Ljava/lang/Iterable;)Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "", "([Ljava/lang/String;)Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "", "enable", "alwaysReadResponseBody", "(Z)Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "Lcom/chuckerteam/chucker/api/BodyDecoder;", "decoder", "addBodyDecoder", "(Lcom/chuckerteam/chucker/api/BodyDecoder;)Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "createShortcut", "Lcom/chuckerteam/chucker/internal/support/CacheDirectoryProvider;", "provider", "cacheDirectorProvider$com_github_ChuckerTeam_Chucker_library", "(Lcom/chuckerteam/chucker/internal/support/CacheDirectoryProvider;)Lcom/chuckerteam/chucker/api/ChuckerInterceptor$Builder;", "cacheDirectorProvider", "skipPaths", "Lcom/chuckerteam/chucker/api/ChuckerInterceptor;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Lcom/chuckerteam/chucker/api/ChuckerInterceptor;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "getContext$com_github_ChuckerTeam_Chucker_library", "()Landroid/content/Context;", "setContext$com_github_ChuckerTeam_Chucker_library", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/chuckerteam/chucker/api/ChuckerCollector;", "getCollector$com_github_ChuckerTeam_Chucker_library", "()Lcom/chuckerteam/chucker/api/ChuckerCollector;", "setCollector$com_github_ChuckerTeam_Chucker_library", "(Lcom/chuckerteam/chucker/api/ChuckerCollector;)V", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "getMaxContentLength$com_github_ChuckerTeam_Chucker_library", "()J", "setMaxContentLength$com_github_ChuckerTeam_Chucker_library", "(J)V", "d", "Lcom/chuckerteam/chucker/internal/support/CacheDirectoryProvider;", "getCacheDirectoryProvider$com_github_ChuckerTeam_Chucker_library", "()Lcom/chuckerteam/chucker/internal/support/CacheDirectoryProvider;", "setCacheDirectoryProvider$com_github_ChuckerTeam_Chucker_library", "(Lcom/chuckerteam/chucker/internal/support/CacheDirectoryProvider;)V", "cacheDirectoryProvider", "e", "Z", "getAlwaysReadResponseBody$com_github_ChuckerTeam_Chucker_library", "()Z", "setAlwaysReadResponseBody$com_github_ChuckerTeam_Chucker_library", "(Z)V", "", OperatorName.FILL_NON_ZERO, "Ljava/util/Set;", "getHeadersToRedact$com_github_ChuckerTeam_Chucker_library", "()Ljava/util/Set;", "setHeadersToRedact$com_github_ChuckerTeam_Chucker_library", "(Ljava/util/Set;)V", "headersToRedact", "", OperatorName.NON_STROKING_GRAY, "Ljava/util/List;", "getDecoders$com_github_ChuckerTeam_Chucker_library", "()Ljava/util/List;", "setDecoders$com_github_ChuckerTeam_Chucker_library", "(Ljava/util/List;)V", "decoders", OperatorName.CLOSE_PATH, "getCreateShortcut$com_github_ChuckerTeam_Chucker_library", "setCreateShortcut$com_github_ChuckerTeam_Chucker_library", "", "i", "getSkipPaths$com_github_ChuckerTeam_Chucker_library", "setSkipPaths$com_github_ChuckerTeam_Chucker_library", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nChuckerInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChuckerInterceptor.kt\ncom/chuckerteam/chucker/api/ChuckerInterceptor$Builder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,198:1\n13579#2,2:199\n*S KotlinDebug\n*F\n+ 1 ChuckerInterceptor.kt\ncom/chuckerteam/chucker/api/ChuckerInterceptor$Builder\n*L\n177#1:199,2\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public Context f42765a;

        /* renamed from: b */
        public ChuckerCollector f42766b;

        /* renamed from: c */
        public long f42767c;

        /* renamed from: d */
        public CacheDirectoryProvider f42768d;

        /* renamed from: e */
        public boolean f42769e;

        /* renamed from: f */
        public Set f42770f;

        /* renamed from: g */
        public List f42771g;

        /* renamed from: h */
        public boolean f42772h;

        /* renamed from: i */
        public Set f42773i;

        public Builder(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f42765a = context;
            this.f42767c = 250000L;
            this.f42770f = DG1.emptySet();
            this.f42771g = CollectionsKt__CollectionsKt.emptyList();
            this.f42772h = true;
            this.f42773i = new LinkedHashSet();
        }

        @NotNull
        public final Builder addBodyDecoder(@NotNull BodyDecoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            this.f42771g = CollectionsKt___CollectionsKt.plus((Collection<? extends BodyDecoder>) this.f42771g, decoder);
            return this;
        }

        @NotNull
        public final Builder alwaysReadResponseBody(boolean z) {
            this.f42769e = z;
            return this;
        }

        @NotNull
        public final ChuckerInterceptor build() {
            return new ChuckerInterceptor(this, null);
        }

        @VisibleForTesting
        @NotNull
        public final Builder cacheDirectorProvider$com_github_ChuckerTeam_Chucker_library(@NotNull CacheDirectoryProvider provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.f42768d = provider;
            return this;
        }

        @NotNull
        public final Builder collector(@NotNull ChuckerCollector collector) {
            Intrinsics.checkNotNullParameter(collector, "collector");
            this.f42766b = collector;
            return this;
        }

        @NotNull
        public final Builder createShortcut(boolean z) {
            this.f42772h = z;
            return this;
        }

        public final boolean getAlwaysReadResponseBody$com_github_ChuckerTeam_Chucker_library() {
            return this.f42769e;
        }

        @Nullable
        public final CacheDirectoryProvider getCacheDirectoryProvider$com_github_ChuckerTeam_Chucker_library() {
            return this.f42768d;
        }

        @Nullable
        public final ChuckerCollector getCollector$com_github_ChuckerTeam_Chucker_library() {
            return this.f42766b;
        }

        @NotNull
        public final Context getContext$com_github_ChuckerTeam_Chucker_library() {
            return this.f42765a;
        }

        public final boolean getCreateShortcut$com_github_ChuckerTeam_Chucker_library() {
            return this.f42772h;
        }

        @NotNull
        public final List<BodyDecoder> getDecoders$com_github_ChuckerTeam_Chucker_library() {
            return this.f42771g;
        }

        @NotNull
        public final Set<String> getHeadersToRedact$com_github_ChuckerTeam_Chucker_library() {
            return this.f42770f;
        }

        public final long getMaxContentLength$com_github_ChuckerTeam_Chucker_library() {
            return this.f42767c;
        }

        @NotNull
        public final Set<String> getSkipPaths$com_github_ChuckerTeam_Chucker_library() {
            return this.f42773i;
        }

        @NotNull
        public final Builder maxContentLength(long j) {
            this.f42767c = j;
            return this;
        }

        @NotNull
        public final Builder redactHeaders(@NotNull Iterable<String> headerNames) {
            Intrinsics.checkNotNullParameter(headerNames, "headerNames");
            this.f42770f = CollectionsKt___CollectionsKt.toSet(headerNames);
            return this;
        }

        public final void setAlwaysReadResponseBody$com_github_ChuckerTeam_Chucker_library(boolean z) {
            this.f42769e = z;
        }

        public final void setCacheDirectoryProvider$com_github_ChuckerTeam_Chucker_library(@Nullable CacheDirectoryProvider cacheDirectoryProvider) {
            this.f42768d = cacheDirectoryProvider;
        }

        public final void setCollector$com_github_ChuckerTeam_Chucker_library(@Nullable ChuckerCollector chuckerCollector) {
            this.f42766b = chuckerCollector;
        }

        public final void setContext$com_github_ChuckerTeam_Chucker_library(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "<set-?>");
            this.f42765a = context;
        }

        public final void setCreateShortcut$com_github_ChuckerTeam_Chucker_library(boolean z) {
            this.f42772h = z;
        }

        public final void setDecoders$com_github_ChuckerTeam_Chucker_library(@NotNull List<? extends BodyDecoder> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f42771g = list;
        }

        public final void setHeadersToRedact$com_github_ChuckerTeam_Chucker_library(@NotNull Set<String> set) {
            Intrinsics.checkNotNullParameter(set, "<set-?>");
            this.f42770f = set;
        }

        public final void setMaxContentLength$com_github_ChuckerTeam_Chucker_library(long j) {
            this.f42767c = j;
        }

        public final void setSkipPaths$com_github_ChuckerTeam_Chucker_library(@NotNull Set<String> set) {
            Intrinsics.checkNotNullParameter(set, "<set-?>");
            this.f42773i = set;
        }

        @NotNull
        public final Builder skipPaths(@NotNull String... skipPaths) {
            Intrinsics.checkNotNullParameter(skipPaths, "skipPaths");
            for (String str : skipPaths) {
                this.f42773i.add(new HttpUrl.Builder().scheme(UriUtil.HTTPS_SCHEME).host("example.com").addPathSegment(str).build().encodedPath());
            }
            return this;
        }

        @NotNull
        public final Builder redactHeaders(@NotNull String... headerNames) {
            Intrinsics.checkNotNullParameter(headerNames, "headerNames");
            this.f42770f = ArraysKt___ArraysKt.toSet(headerNames);
            return this;
        }
    }

    /* renamed from: com.chuckerteam.chucker.api.ChuckerInterceptor$a */
    /* loaded from: classes3.dex */
    public static final class C5957a {
        public /* synthetic */ C5957a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C5957a() {
        }
    }

    public /* synthetic */ ChuckerInterceptor(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* renamed from: a */
    public static /* synthetic */ File m49974a(Builder builder) {
        return m49973b(builder);
    }

    /* renamed from: b */
    public static final File m49973b(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "$builder");
        return builder.getContext$com_github_ChuckerTeam_Chucker_library().getFilesDir();
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        HttpTransaction httpTransaction = new HttpTransaction();
        Request request = chain.request();
        Set set = this.f42764f;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (Intrinsics.areEqual((String) it.next(), request.url().encodedPath())) {
                    z = true;
                    break;
                }
            }
        }
        boolean z2 = !z;
        if (z2) {
            this.f42762d.process(request, httpTransaction);
        }
        try {
            Response proceed = chain.proceed(request);
            if (z2) {
                return this.f42763e.process(proceed, httpTransaction);
            }
            return proceed;
        } catch (IOException e) {
            httpTransaction.setError(e.toString());
            this.f42761c.onResponseReceived$com_github_ChuckerTeam_Chucker_library(httpTransaction);
            throw e;
        }
    }

    public final void redactHeader(@NotNull String... headerName) {
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        AbstractC10410hs.addAll(this.f42759a, headerName);
    }

    public ChuckerInterceptor(final Builder builder) {
        Set mutableSet = CollectionsKt___CollectionsKt.toMutableSet(builder.getHeadersToRedact$com_github_ChuckerTeam_Chucker_library());
        this.f42759a = mutableSet;
        List plus = CollectionsKt___CollectionsKt.plus((Collection) builder.getDecoders$com_github_ChuckerTeam_Chucker_library(), (Iterable) f42758h);
        this.f42760b = plus;
        ChuckerCollector collector$com_github_ChuckerTeam_Chucker_library = builder.getCollector$com_github_ChuckerTeam_Chucker_library();
        ChuckerCollector chuckerCollector = collector$com_github_ChuckerTeam_Chucker_library == null ? new ChuckerCollector(builder.getContext$com_github_ChuckerTeam_Chucker_library(), false, null, 6, null) : collector$com_github_ChuckerTeam_Chucker_library;
        this.f42761c = chuckerCollector;
        this.f42762d = new RequestProcessor(builder.getContext$com_github_ChuckerTeam_Chucker_library(), chuckerCollector, builder.getMaxContentLength$com_github_ChuckerTeam_Chucker_library(), mutableSet, plus);
        CacheDirectoryProvider cacheDirectoryProvider$com_github_ChuckerTeam_Chucker_library = builder.getCacheDirectoryProvider$com_github_ChuckerTeam_Chucker_library();
        this.f42763e = new ResponseProcessor(chuckerCollector, cacheDirectoryProvider$com_github_ChuckerTeam_Chucker_library == null ? new CacheDirectoryProvider() { // from class: xp
            @Override // com.chuckerteam.chucker.internal.support.CacheDirectoryProvider
            public final File provide() {
                return ChuckerInterceptor.m49974a(builder);
            }
        } : cacheDirectoryProvider$com_github_ChuckerTeam_Chucker_library, builder.getMaxContentLength$com_github_ChuckerTeam_Chucker_library(), mutableSet, builder.getAlwaysReadResponseBody$com_github_ChuckerTeam_Chucker_library(), plus);
        this.f42764f = CollectionsKt___CollectionsKt.toSet(builder.getSkipPaths$com_github_ChuckerTeam_Chucker_library());
        if (builder.getCreateShortcut$com_github_ChuckerTeam_Chucker_library()) {
            Chucker.INSTANCE.createShortcut$com_github_ChuckerTeam_Chucker_library(builder.getContext$com_github_ChuckerTeam_Chucker_library());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChuckerInterceptor(@NotNull Context context) {
        this(new Builder(context));
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
