package com.chuckerteam.chucker.internal.support;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class JsonConverter$nonNullSerializerInstance$2 extends Lambda implements Function0<Gson> {
    public static final JsonConverter$nonNullSerializerInstance$2 INSTANCE = new JsonConverter$nonNullSerializerInstance$2();

    public JsonConverter$nonNullSerializerInstance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Gson invoke() {
        return new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
    }
}