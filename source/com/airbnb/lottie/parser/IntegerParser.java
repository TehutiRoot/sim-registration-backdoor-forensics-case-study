package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public class IntegerParser implements N02 {
    public static final IntegerParser INSTANCE = new IntegerParser();

    @Override // p000.N02
    public Integer parse(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(AbstractC23002xh0.m409g(jsonReader) * f));
    }
}
