package androidx.compose.animation.graphics.vector.compat;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.animation.graphics.ExperimentalAnimationGraphicsApi;
import androidx.compose.animation.graphics.res.AnimatorResources_androidKt;
import androidx.compose.animation.graphics.vector.AnimatedImageVector;
import androidx.compose.animation.graphics.vector.AnimatedVectorTarget;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.p003ui.res.VectorResources_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.zxy.tiny.common.UriUtil;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0018\u00010\u0002R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\u000b\u001a\u00020\n*\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0018\u00010\u0002R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Landroid/content/res/Resources;", UriUtil.LOCAL_RESOURCE_SCHEME, "Landroid/content/res/Resources$Theme;", "theme", "Landroid/util/AttributeSet;", "attrs", "Landroidx/compose/animation/graphics/vector/AnimatedVectorTarget;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Landroidx/compose/animation/graphics/vector/AnimatedVectorTarget;", "Lorg/xmlpull/v1/XmlPullParser;", "Landroidx/compose/animation/graphics/vector/AnimatedImageVector;", "parseAnimatedImageVector", "(Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Landroidx/compose/animation/graphics/vector/AnimatedImageVector;", "animation-graphics_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nXmlAnimatedVectorParser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlAnimatedVectorParser.android.kt\nandroidx/compose/animation/graphics/vector/compat/XmlAnimatedVectorParser_androidKt\n+ 2 XmlPullParserUtils.android.kt\nandroidx/compose/animation/graphics/vector/compat/XmlPullParserUtils_androidKt\n*L\n1#1,79:1\n69#2,6:80\n69#2,4:86\n53#2,9:90\n74#2:99\n*S KotlinDebug\n*F\n+ 1 XmlAnimatedVectorParser.android.kt\nandroidx/compose/animation/graphics/vector/compat/XmlAnimatedVectorParser_androidKt\n*L\n37#1:80,6\n62#1:86,4\n68#1:90,9\n62#1:99\n*E\n"})
/* loaded from: classes.dex */
public final class XmlAnimatedVectorParser_androidKt {
    /* renamed from: a */
    public static final AnimatedVectorTarget m61652a(Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        TypedArray a;
        int[] styleable_animated_vector_drawable_target = AndroidVectorResources.INSTANCE.getSTYLEABLE_ANIMATED_VECTOR_DRAWABLE_TARGET();
        if (theme == null || (a = theme.obtainStyledAttributes(attributeSet, styleable_animated_vector_drawable_target, 0, 0)) == null) {
            a = resources.obtainAttributes(attributeSet, styleable_animated_vector_drawable_target);
        }
        try {
            Intrinsics.checkNotNullExpressionValue(a, "a");
            String string = a.getString(0);
            if (string == null) {
                string = "";
            }
            Intrinsics.checkNotNullExpressionValue(string, "a.getString(\n           …_NAME\n            ) ?: \"\"");
            AnimatedVectorTarget animatedVectorTarget = new AnimatedVectorTarget(string, AnimatorResources_androidKt.loadAnimatorResource(theme, resources, a.getResourceId(1, 0)));
            a.recycle();
            return animatedVectorTarget;
        } catch (Throwable th2) {
            a.recycle();
            throw th2;
        }
    }

    @ExperimentalAnimationGraphicsApi
    @NotNull
    public static final AnimatedImageVector parseAnimatedImageVector(@NotNull XmlPullParser xmlPullParser, @NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet attrs) {
        TypedArray a;
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        int[] styleable_animated_vector_drawable = AndroidVectorResources.INSTANCE.getSTYLEABLE_ANIMATED_VECTOR_DRAWABLE();
        if (theme == null || (a = theme.obtainStyledAttributes(attrs, styleable_animated_vector_drawable, 0, 0)) == null) {
            a = res.obtainAttributes(attrs, styleable_animated_vector_drawable);
        }
        try {
            Intrinsics.checkNotNullExpressionValue(a, "a");
            int resourceId = a.getResourceId(0, 0);
            ArrayList arrayList = new ArrayList();
            xmlPullParser.next();
            while (!XmlPullParserUtils_androidKt.isAtEnd(xmlPullParser) && (xmlPullParser.getEventType() != 3 || !Intrinsics.areEqual(xmlPullParser.getName(), "animated-vector"))) {
                if (xmlPullParser.getEventType() == 2 && Intrinsics.areEqual(xmlPullParser.getName(), TypedValues.AttributesType.S_TARGET)) {
                    arrayList.add(m61652a(res, theme, attrs));
                }
                xmlPullParser.next();
            }
            AnimatedImageVector animatedImageVector = new AnimatedImageVector(VectorResources_androidKt.vectorResource(ImageVector.Companion, theme, res, resourceId), arrayList);
            a.recycle();
            return animatedImageVector;
        } catch (Throwable th2) {
            a.recycle();
            throw th2;
        }
    }
}
