package androidx.compose.animation.graphics.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.compose.animation.graphics.ExperimentalAnimationGraphicsApi;
import androidx.compose.animation.graphics.vector.AnimatedImageVector;
import androidx.compose.animation.graphics.vector.compat.XmlAnimatedVectorParser_androidKt;
import androidx.compose.animation.graphics.vector.compat.XmlPullParserUtils_androidKt;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.zxy.tiny.common.UriUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(m29143d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0003R\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"loadAnimatedVectorResource", "Landroidx/compose/animation/graphics/vector/AnimatedImageVector;", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", UriUtil.LOCAL_RESOURCE_SCHEME, "resId", "", "animatedVectorResource", "Landroidx/compose/animation/graphics/vector/AnimatedImageVector$Companion;", "id", "(Landroidx/compose/animation/graphics/vector/AnimatedImageVector$Companion;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/animation/graphics/vector/AnimatedImageVector;", "animation-graphics_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nAnimatedVectorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVectorResources.android.kt\nandroidx/compose/animation/graphics/res/AnimatedVectorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,63:1\n76#2:64\n36#3:65\n1097#4,6:66\n*S KotlinDebug\n*F\n+ 1 AnimatedVectorResources.android.kt\nandroidx/compose/animation/graphics/res/AnimatedVectorResources_androidKt\n*L\n44#1:64\n47#1:65\n47#1:66,6\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedVectorResources_androidKt {
    @ExperimentalAnimationGraphicsApi
    @Composable
    @NotNull
    public static final AnimatedImageVector animatedVectorResource(@NotNull AnimatedImageVector.Companion companion, @DrawableRes int i, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        composer.startReplaceableGroup(-976666674);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-976666674, i2, -1, "androidx.compose.animation.graphics.res.animatedVectorResource (AnimatedVectorResources.android.kt:40)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources res = context.getResources();
        Resources.Theme theme = context.getTheme();
        Integer valueOf = Integer.valueOf(i);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(valueOf);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            Intrinsics.checkNotNullExpressionValue(res, "res");
            rememberedValue = loadAnimatedVectorResource(theme, res, i);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        AnimatedImageVector animatedImageVector = (AnimatedImageVector) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animatedImageVector;
    }

    @ExperimentalAnimationGraphicsApi
    @NotNull
    public static final AnimatedImageVector loadAnimatedVectorResource(@Nullable Resources.Theme theme, @NotNull Resources res, int i) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(res, "res");
        XmlResourceParser xml = res.getXml(i);
        Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(resId)");
        XmlPullParser seekToStartTag = XmlPullParserUtils_androidKt.seekToStartTag(xml);
        AttributeSet attrs = Xml.asAttributeSet(seekToStartTag);
        Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
        return XmlAnimatedVectorParser_androidKt.parseAnimatedImageVector(seekToStartTag, res, theme, attrs);
    }

    public static /* synthetic */ AnimatedImageVector loadAnimatedVectorResource$default(Resources.Theme theme, Resources resources, int i, int i2, Object obj) throws XmlPullParserException {
        if ((i2 & 1) != 0) {
            theme = null;
        }
        return loadAnimatedVectorResource(theme, resources, i);
    }
}