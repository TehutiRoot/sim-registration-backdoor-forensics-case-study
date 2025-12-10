package com.chuckerteam.chucker.internal.support;

import com.chuckerteam.chucker.api.BodyDecoder;
import com.chuckerteam.chucker.internal.support.Logger;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.Response;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "decoder", "Lcom/chuckerteam/chucker/api/BodyDecoder;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class ResponseProcessor$decodePayload$1 extends Lambda implements Function1<BodyDecoder, String> {
    final /* synthetic */ ByteString $body;
    final /* synthetic */ Response $response;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseProcessor$decodePayload$1(Response response, ByteString byteString) {
        super(1);
        this.$response = response;
        this.$body = byteString;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final String invoke(@NotNull BodyDecoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        try {
            return decoder.decodeResponse(this.$response, this.$body);
        } catch (IOException e) {
            Logger.Companion companion = Logger.Companion;
            companion.warn("Decoder " + decoder + " failed to process response payload", e);
            return null;
        }
    }
}