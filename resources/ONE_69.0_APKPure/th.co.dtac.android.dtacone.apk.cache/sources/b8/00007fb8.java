package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public class IntegerParser implements K12 {
    public static final IntegerParser INSTANCE = new IntegerParser();

    @Override // p000.K12
    public Integer parse(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(AbstractC17500Dh0.m68800g(jsonReader) * f));
    }
}