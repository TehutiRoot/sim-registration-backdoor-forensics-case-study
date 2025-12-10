package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public class FloatParser implements N02 {
    public static final FloatParser INSTANCE = new FloatParser();

    @Override // p000.N02
    public Float parse(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(AbstractC23002xh0.m409g(jsonReader) * f);
    }
}
