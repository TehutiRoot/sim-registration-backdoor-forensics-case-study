package com.chuckerteam.chucker.api;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.Response;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000b"}, m28850d2 = {"Lcom/chuckerteam/chucker/api/BodyDecoder;", "", "decodeRequest", "", "request", "Lokhttp3/Request;", "body", "Lokio/ByteString;", "decodeResponse", "response", "Lokhttp3/Response;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public interface BodyDecoder {
    @Nullable
    String decodeRequest(@NotNull Request request, @NotNull ByteString byteString) throws IOException;

    @Nullable
    String decodeResponse(@NotNull Response response, @NotNull ByteString byteString) throws IOException;
}
