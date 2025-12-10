package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public class FloatParser implements K12 {
    public static final FloatParser INSTANCE = new FloatParser();

    @Override // p000.K12
    public Float parse(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(AbstractC17500Dh0.m68800g(jsonReader) * f);
    }
}