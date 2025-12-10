package com.chuckerteam.chucker.internal.support;

import com.chuckerteam.chucker.api.BodyDecoder;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u0004\u0018\u00010\b*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/PlainTextDecoder;", "Lcom/chuckerteam/chucker/api/BodyDecoder;", "<init>", "()V", "Lokhttp3/Request;", "request", "Lokio/ByteString;", "body", "", "decodeRequest", "(Lokhttp3/Request;Lokio/ByteString;)Ljava/lang/String;", "Lokhttp3/Response;", "response", "decodeResponse", "(Lokhttp3/Response;Lokio/ByteString;)Ljava/lang/String;", "Lokhttp3/Headers;", "headers", "Lokhttp3/MediaType;", "contentType", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lokio/ByteString;Lokhttp3/Headers;Lokhttp3/MediaType;)Ljava/lang/String;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class PlainTextDecoder implements BodyDecoder {
    @NotNull
    public static final PlainTextDecoder INSTANCE = new PlainTextDecoder();

    /* renamed from: a */
    public final String m49914a(ByteString byteString, Headers headers, MediaType mediaType) {
        Charset charset;
        if (!OkHttpUtilsKt.getHasSupportedContentEncoding(headers) || !OkioUtilsKt.isProbablyPlainText(byteString)) {
            return null;
        }
        if (mediaType == null || (charset = MediaType.charset$default(mediaType, null, 1, null)) == null) {
            charset = Charsets.UTF_8;
        }
        return byteString.string(charset);
    }

    @Override // com.chuckerteam.chucker.api.BodyDecoder
    @Nullable
    public String decodeRequest(@NotNull Request request, @NotNull ByteString body) {
        MediaType mediaType;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(body, "body");
        Headers headers = request.headers();
        RequestBody body2 = request.body();
        if (body2 != null) {
            mediaType = body2.contentType();
        } else {
            mediaType = null;
        }
        return m49914a(body, headers, mediaType);
    }

    @Override // com.chuckerteam.chucker.api.BodyDecoder
    @Nullable
    public String decodeResponse(@NotNull Response response, @NotNull ByteString body) {
        MediaType mediaType;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(body, "body");
        Headers headers = response.headers();
        ResponseBody body2 = response.body();
        if (body2 != null) {
            mediaType = body2.contentType();
        } else {
            mediaType = null;
        }
        return m49914a(body, headers, mediaType);
    }
}
