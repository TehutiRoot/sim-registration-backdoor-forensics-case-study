package androidx.compose.animation.graphics.res;

import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.graphics.vector.Animator;
import androidx.compose.animation.graphics.vector.compat.AndroidVectorResources;
import androidx.compose.animation.graphics.vector.compat.XmlAnimatorParser_androidKt;
import androidx.compose.animation.graphics.vector.compat.XmlPullParserUtils_androidKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.zxy.tiny.common.UriUtil;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0000R\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0017\u0010\u0010\u001a\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0018\u0010\u0010\u001a\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0019\u0010\u0010\u001a/\u0010\u001a\u001a\u00020\n2\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0000R\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u001a\u0010%\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u001a\u0010\u0018\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001f\"0\u0010,\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0(j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m28850d2 = {"Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", UriUtil.LOCAL_RESOURCE_SCHEME, "", "resId", "Landroidx/compose/animation/graphics/vector/Animator;", "loadAnimatorResource", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)Landroidx/compose/animation/graphics/vector/Animator;", "Landroid/animation/TimeInterpolator;", "Landroidx/compose/animation/core/Easing;", "toEasing", "(Landroid/animation/TimeInterpolator;)Landroidx/compose/animation/core/Easing;", "", "factor", "AccelerateEasing", "(F)Landroidx/compose/animation/core/Easing;", "tension", "AnticipateEasing", "extraTension", "AnticipateOvershootEasing", "(FF)Landroidx/compose/animation/core/Easing;", "cycle", "CycleEasing", "DecelerateEasing", "OvershootEasing", "loadInterpolatorResource", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)Landroidx/compose/animation/core/Easing;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/Easing;", "getAccelerateDecelerateEasing", "()Landroidx/compose/animation/core/Easing;", "AccelerateDecelerateEasing", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getAccelerateEasing", OperatorName.CURVE_TO, "getBounceEasing", "BounceEasing", "d", "getDecelerateEasing", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "e", "Ljava/util/HashMap;", "builtinInterpolators", "animation-graphics_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimatorResources_androidKt {

    /* renamed from: a */
    public static final Easing f12678a = C2755a.f12683a;

    /* renamed from: b */
    public static final Easing f12679b = C2756b.f12684a;

    /* renamed from: c */
    public static final Easing f12680c = toEasing(new BounceInterpolator());

    /* renamed from: d */
    public static final Easing f12681d = C2760f.f12688a;

    /* renamed from: e */
    public static final HashMap f12682e;

    /* renamed from: androidx.compose.animation.graphics.res.AnimatorResources_androidKt$a */
    /* loaded from: classes.dex */
    public static final class C2755a implements Easing {

        /* renamed from: a */
        public static final C2755a f12683a = new C2755a();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            return (float) ((Math.cos((f + 1) * 3.141592653589793d) / 2.0f) + 0.5f);
        }
    }

    /* renamed from: androidx.compose.animation.graphics.res.AnimatorResources_androidKt$b */
    /* loaded from: classes.dex */
    public static final class C2756b implements Easing {

        /* renamed from: a */
        public static final C2756b f12684a = new C2756b();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            return f * f;
        }
    }

    /* renamed from: androidx.compose.animation.graphics.res.AnimatorResources_androidKt$c */
    /* loaded from: classes.dex */
    public static final class C2757c implements Easing {

        /* renamed from: a */
        public final /* synthetic */ float f12685a;

        public C2757c(float f) {
            this.f12685a = f;
        }

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            return (float) Math.pow(f, this.f12685a * 2);
        }
    }

    /* renamed from: androidx.compose.animation.graphics.res.AnimatorResources_androidKt$d */
    /* loaded from: classes.dex */
    public static final class C2758d implements Easing {

        /* renamed from: a */
        public final /* synthetic */ float f12686a;

        public C2758d(float f) {
            this.f12686a = f;
        }

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float f2 = this.f12686a;
            return f * f * (((1 + f2) * f) - f2);
        }
    }

    /* renamed from: androidx.compose.animation.graphics.res.AnimatorResources_androidKt$e */
    /* loaded from: classes.dex */
    public static final class C2759e implements Easing {

        /* renamed from: a */
        public final /* synthetic */ float f12687a;

        public C2759e(float f) {
            this.f12687a = f;
        }

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            return (float) Math.sin(2 * this.f12687a * 3.141592653589793d * f);
        }
    }

    /* renamed from: androidx.compose.animation.graphics.res.AnimatorResources_androidKt$f */
    /* loaded from: classes.dex */
    public static final class C2760f implements Easing {

        /* renamed from: a */
        public static final C2760f f12688a = new C2760f();

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float f2 = 1.0f - f;
            return 1.0f - (f2 * f2);
        }
    }

    /* renamed from: androidx.compose.animation.graphics.res.AnimatorResources_androidKt$g */
    /* loaded from: classes.dex */
    public static final class C2761g implements Easing {

        /* renamed from: a */
        public final /* synthetic */ float f12689a;

        public C2761g(float f) {
            this.f12689a = f;
        }

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            return 1.0f - ((float) Math.pow(1.0f - f, 2 * this.f12689a));
        }
    }

    /* renamed from: androidx.compose.animation.graphics.res.AnimatorResources_androidKt$h */
    /* loaded from: classes.dex */
    public static final class C2762h implements Easing {

        /* renamed from: a */
        public final /* synthetic */ float f12690a;

        public C2762h(float f) {
            this.f12690a = f;
        }

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            float f2 = f - 1.0f;
            float f3 = this.f12690a;
            return (f2 * f2 * (((f3 + 1.0f) * f2) + f3)) + 1.0f;
        }
    }

    /* renamed from: androidx.compose.animation.graphics.res.AnimatorResources_androidKt$i */
    /* loaded from: classes.dex */
    public static final class C2763i implements Easing {

        /* renamed from: a */
        public final /* synthetic */ TimeInterpolator f12691a;

        public C2763i(TimeInterpolator timeInterpolator) {
            this.f12691a = timeInterpolator;
        }

        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f) {
            return this.f12691a.getInterpolation(f);
        }
    }

    static {
        Pair m28844to = TuplesKt.m28844to(17432587, EasingKt.getLinearEasing());
        Integer valueOf = Integer.valueOf((int) AndroidVectorResources.FAST_OUT_LINEAR_IN);
        Pair m28844to2 = TuplesKt.m28844to(valueOf, EasingKt.getFastOutLinearInEasing());
        Integer valueOf2 = Integer.valueOf((int) AndroidVectorResources.FAST_OUT_SLOW_IN);
        Pair m28844to3 = TuplesKt.m28844to(valueOf2, EasingKt.getFastOutSlowInEasing());
        Pair m28844to4 = TuplesKt.m28844to(17563659, EasingKt.getLinearEasing());
        Integer valueOf3 = Integer.valueOf((int) AndroidVectorResources.LINEAR_OUT_SLOW_IN);
        f12682e = AbstractC11687a.hashMapOf(m28844to, m28844to2, m28844to3, m28844to4, TuplesKt.m28844to(valueOf3, EasingKt.getLinearOutSlowInEasing()), TuplesKt.m28844to(valueOf, EasingKt.getFastOutLinearInEasing()), TuplesKt.m28844to(valueOf2, EasingKt.getFastOutSlowInEasing()), TuplesKt.m28844to(valueOf3, EasingKt.getLinearOutSlowInEasing()));
    }

    @NotNull
    public static final Easing AccelerateEasing(float f) {
        return new C2757c(f);
    }

    @NotNull
    public static final Easing AnticipateEasing(float f) {
        return new C2758d(f);
    }

    @NotNull
    public static final Easing AnticipateOvershootEasing(float f, float f2) {
        return toEasing(new AnticipateOvershootInterpolator(f, f2));
    }

    @NotNull
    public static final Easing CycleEasing(float f) {
        return new C2759e(f);
    }

    @NotNull
    public static final Easing DecelerateEasing(float f) {
        return new C2761g(f);
    }

    @NotNull
    public static final Easing OvershootEasing(float f) {
        return new C2762h(f);
    }

    @NotNull
    public static final Easing getAccelerateDecelerateEasing() {
        return f12678a;
    }

    @NotNull
    public static final Easing getAccelerateEasing() {
        return f12679b;
    }

    @NotNull
    public static final Easing getBounceEasing() {
        return f12680c;
    }

    @NotNull
    public static final Easing getDecelerateEasing() {
        return f12681d;
    }

    @NotNull
    public static final Animator loadAnimatorResource(@Nullable Resources.Theme theme, @NotNull Resources res, int i) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(res, "res");
        XmlResourceParser xml = res.getXml(i);
        Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(resId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        XmlPullParserUtils_androidKt.seekToStartTag(xml);
        String name = xml.getName();
        if (Intrinsics.areEqual(name, "set")) {
            Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
            return XmlAnimatorParser_androidKt.parseAnimatorSet(xml, res, theme, attrs);
        } else if (Intrinsics.areEqual(name, XmlAnimatorParser_androidKt.TagObjectAnimator)) {
            Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
            return XmlAnimatorParser_androidKt.parseObjectAnimator(xml, res, theme, attrs);
        } else {
            throw new XmlPullParserException("Unknown tag: " + xml.getName());
        }
    }

    public static /* synthetic */ Animator loadAnimatorResource$default(Resources.Theme theme, Resources resources, int i, int i2, Object obj) throws XmlPullParserException {
        if ((i2 & 1) != 0) {
            theme = null;
        }
        return loadAnimatorResource(theme, resources, i);
    }

    @NotNull
    public static final Easing loadInterpolatorResource(@Nullable Resources.Theme theme, @NotNull Resources res, int i) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(res, "res");
        Easing easing = (Easing) f12682e.get(Integer.valueOf(i));
        if (easing == null) {
            XmlResourceParser loadInterpolatorResource$lambda$0 = res.getXml(i);
            Intrinsics.checkNotNullExpressionValue(loadInterpolatorResource$lambda$0, "loadInterpolatorResource$lambda$0");
            XmlPullParser seekToStartTag = XmlPullParserUtils_androidKt.seekToStartTag(loadInterpolatorResource$lambda$0);
            AttributeSet asAttributeSet = Xml.asAttributeSet(loadInterpolatorResource$lambda$0);
            Intrinsics.checkNotNullExpressionValue(asAttributeSet, "asAttributeSet(this)");
            return XmlAnimatorParser_androidKt.parseInterpolator(seekToStartTag, res, theme, asAttributeSet);
        }
        return easing;
    }

    public static /* synthetic */ Easing loadInterpolatorResource$default(Resources.Theme theme, Resources resources, int i, int i2, Object obj) throws XmlPullParserException {
        if ((i2 & 1) != 0) {
            theme = null;
        }
        return loadInterpolatorResource(theme, resources, i);
    }

    @NotNull
    public static final Easing toEasing(@NotNull TimeInterpolator timeInterpolator) {
        Intrinsics.checkNotNullParameter(timeInterpolator, "<this>");
        return new C2763i(timeInterpolator);
    }
}
