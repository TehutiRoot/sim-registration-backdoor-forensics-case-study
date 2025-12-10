package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public class PathParser implements N02 {
    public static final PathParser INSTANCE = new PathParser();

    @Override // p000.N02
    public PointF parse(JsonReader jsonReader, float f) throws IOException {
        return AbstractC23002xh0.m411e(jsonReader, f);
    }
}
