package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class Layer {

    /* renamed from: a */
    public final List f41462a;

    /* renamed from: b */
    public final LottieComposition f41463b;

    /* renamed from: c */
    public final String f41464c;

    /* renamed from: d */
    public final long f41465d;

    /* renamed from: e */
    public final LayerType f41466e;

    /* renamed from: f */
    public final long f41467f;

    /* renamed from: g */
    public final String f41468g;

    /* renamed from: h */
    public final List f41469h;

    /* renamed from: i */
    public final AnimatableTransform f41470i;

    /* renamed from: j */
    public final int f41471j;

    /* renamed from: k */
    public final int f41472k;

    /* renamed from: l */
    public final int f41473l;

    /* renamed from: m */
    public final float f41474m;

    /* renamed from: n */
    public final float f41475n;

    /* renamed from: o */
    public final float f41476o;

    /* renamed from: p */
    public final float f41477p;

    /* renamed from: q */
    public final AnimatableTextFrame f41478q;

    /* renamed from: r */
    public final AnimatableTextProperties f41479r;

    /* renamed from: s */
    public final AnimatableFloatValue f41480s;

    /* renamed from: t */
    public final List f41481t;

    /* renamed from: u */
    public final MatteType f41482u;

    /* renamed from: v */
    public final boolean f41483v;

    /* renamed from: w */
    public final BlurEffect f41484w;

    /* renamed from: x */
    public final DropShadowEffect f41485x;

    /* loaded from: classes3.dex */
    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* loaded from: classes3.dex */
    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<ContentModel> list, LottieComposition lottieComposition, String str, long j, LayerType layerType, long j2, @Nullable String str2, List<Mask> list2, AnimatableTransform animatableTransform, int i, int i2, int i3, float f, float f2, float f3, float f4, @Nullable AnimatableTextFrame animatableTextFrame, @Nullable AnimatableTextProperties animatableTextProperties, List<Keyframe<Float>> list3, MatteType matteType, @Nullable AnimatableFloatValue animatableFloatValue, boolean z, @Nullable BlurEffect blurEffect, @Nullable DropShadowEffect dropShadowEffect) {
        this.f41462a = list;
        this.f41463b = lottieComposition;
        this.f41464c = str;
        this.f41465d = j;
        this.f41466e = layerType;
        this.f41467f = j2;
        this.f41468g = str2;
        this.f41469h = list2;
        this.f41470i = animatableTransform;
        this.f41471j = i;
        this.f41472k = i2;
        this.f41473l = i3;
        this.f41474m = f;
        this.f41475n = f2;
        this.f41476o = f3;
        this.f41477p = f4;
        this.f41478q = animatableTextFrame;
        this.f41479r = animatableTextProperties;
        this.f41481t = list3;
        this.f41482u = matteType;
        this.f41480s = animatableFloatValue;
        this.f41483v = z;
        this.f41484w = blurEffect;
        this.f41485x = dropShadowEffect;
    }

    /* renamed from: a */
    public LottieComposition m50767a() {
        return this.f41463b;
    }

    /* renamed from: b */
    public List m50766b() {
        return this.f41481t;
    }

    /* renamed from: c */
    public List m50765c() {
        return this.f41469h;
    }

    /* renamed from: d */
    public MatteType m50764d() {
        return this.f41482u;
    }

    /* renamed from: e */
    public long m50763e() {
        return this.f41467f;
    }

    /* renamed from: f */
    public float m50762f() {
        return this.f41477p;
    }

    /* renamed from: g */
    public float m50761g() {
        return this.f41476o;
    }

    @Nullable
    public BlurEffect getBlurEffect() {
        return this.f41484w;
    }

    @Nullable
    public DropShadowEffect getDropShadowEffect() {
        return this.f41485x;
    }

    public long getId() {
        return this.f41465d;
    }

    public LayerType getLayerType() {
        return this.f41466e;
    }

    public String getName() {
        return this.f41464c;
    }

    @Nullable
    public String getRefId() {
        return this.f41468g;
    }

    /* renamed from: h */
    public List m50760h() {
        return this.f41462a;
    }

    /* renamed from: i */
    public int m50759i() {
        return this.f41473l;
    }

    public boolean isHidden() {
        return this.f41483v;
    }

    /* renamed from: j */
    public int m50758j() {
        return this.f41472k;
    }

    /* renamed from: k */
    public int m50757k() {
        return this.f41471j;
    }

    /* renamed from: l */
    public float m50756l() {
        return this.f41475n / this.f41463b.getDurationFrames();
    }

    /* renamed from: m */
    public AnimatableTextFrame m50755m() {
        return this.f41478q;
    }

    /* renamed from: n */
    public AnimatableTextProperties m50754n() {
        return this.f41479r;
    }

    /* renamed from: o */
    public AnimatableFloatValue m50753o() {
        return this.f41480s;
    }

    /* renamed from: p */
    public float m50752p() {
        return this.f41474m;
    }

    /* renamed from: q */
    public AnimatableTransform m50751q() {
        return this.f41470i;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getName());
        sb.append("\n");
        Layer layerModelForId = this.f41463b.layerModelForId(m50763e());
        if (layerModelForId != null) {
            sb.append("\t\tParents: ");
            sb.append(layerModelForId.getName());
            Layer layerModelForId2 = this.f41463b.layerModelForId(layerModelForId.m50763e());
            while (layerModelForId2 != null) {
                sb.append("->");
                sb.append(layerModelForId2.getName());
                layerModelForId2 = this.f41463b.layerModelForId(layerModelForId2.m50763e());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!m50765c().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(m50765c().size());
            sb.append("\n");
        }
        if (m50757k() != 0 && m50758j() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(m50757k()), Integer.valueOf(m50758j()), Integer.valueOf(m50759i())));
        }
        if (!this.f41462a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : this.f41462a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
