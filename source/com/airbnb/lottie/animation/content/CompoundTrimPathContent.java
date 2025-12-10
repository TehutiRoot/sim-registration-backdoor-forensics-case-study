package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class CompoundTrimPathContent {

    /* renamed from: a */
    public final List f41031a = new ArrayList();

    /* renamed from: a */
    public void m50904a(TrimPathContent trimPathContent) {
        this.f41031a.add(trimPathContent);
    }

    public void apply(Path path) {
        for (int size = this.f41031a.size() - 1; size >= 0; size--) {
            Utils.applyTrimPathIfNeeded(path, (TrimPathContent) this.f41031a.get(size));
        }
    }
}
