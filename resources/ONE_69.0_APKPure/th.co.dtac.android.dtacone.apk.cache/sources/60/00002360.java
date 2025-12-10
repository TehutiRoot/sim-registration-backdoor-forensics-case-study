package androidx.compose.animation.graphics.vector.compat;

import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.graphics.vector.Keyframe;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Landroidx/compose/animation/graphics/vector/compat/ValueType;", "valueType", "keyframes", "", "Landroidx/compose/animation/graphics/vector/Keyframe;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nXmlAnimatorParser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlAnimatorParser.android.kt\nandroidx/compose/animation/graphics/vector/compat/XmlAnimatorParser_androidKt$parsePropertyValuesHolder$1$1\n+ 2 XmlPullParserUtils.android.kt\nandroidx/compose/animation/graphics/vector/compat/XmlPullParserUtils_androidKt\n*L\n1#1,525:1\n53#2,9:526\n*S KotlinDebug\n*F\n+ 1 XmlAnimatorParser.android.kt\nandroidx/compose/animation/graphics/vector/compat/XmlAnimatorParser_androidKt$parsePropertyValuesHolder$1$1\n*L\n181#1:526,9\n*E\n"})
/* loaded from: classes.dex */
public final class XmlAnimatorParser_androidKt$parsePropertyValuesHolder$1$1 extends Lambda implements Function2<ValueType, List<Keyframe<Object>>, ValueType> {
    final /* synthetic */ AttributeSet $attrs;
    final /* synthetic */ Easing $interpolator;
    final /* synthetic */ Resources $res;
    final /* synthetic */ Resources.Theme $theme;
    final /* synthetic */ XmlPullParser $this_parsePropertyValuesHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XmlAnimatorParser_androidKt$parsePropertyValuesHolder$1$1(XmlPullParser xmlPullParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, Easing easing) {
        super(2);
        this.$this_parsePropertyValuesHolder = xmlPullParser;
        this.$res = resources;
        this.$theme = theme;
        this.$attrs = attributeSet;
        this.$interpolator = easing;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final ValueType invoke(@Nullable ValueType valueType, @NotNull List<Keyframe<Object>> keyframes) {
        ValueType valueType2;
        Pair m61595g;
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        XmlPullParser xmlPullParser = this.$this_parsePropertyValuesHolder;
        Resources resources = this.$res;
        Resources.Theme theme = this.$theme;
        AttributeSet attributeSet = this.$attrs;
        Easing easing = this.$interpolator;
        xmlPullParser.next();
        ValueType valueType3 = null;
        while (!XmlPullParserUtils_androidKt.isAtEnd(xmlPullParser) && (xmlPullParser.getEventType() != 3 || !Intrinsics.areEqual(xmlPullParser.getName(), "propertyValuesHolder"))) {
            if (xmlPullParser.getEventType() == 2 && Intrinsics.areEqual(xmlPullParser.getName(), "keyframe")) {
                m61595g = XmlAnimatorParser_androidKt.m61595g(resources, theme, attributeSet, valueType, easing);
                Keyframe<Object> keyframe = (Keyframe) m61595g.component1();
                ValueType valueType4 = (ValueType) m61595g.component2();
                if (valueType3 == null) {
                    valueType3 = valueType4;
                }
                keyframes.add(keyframe);
            }
            xmlPullParser.next();
        }
        if (valueType3 == null) {
            if (valueType == null) {
                valueType2 = XmlAnimatorParser_androidKt.f12841a;
                return valueType2;
            }
            return valueType;
        }
        return valueType3;
    }
}