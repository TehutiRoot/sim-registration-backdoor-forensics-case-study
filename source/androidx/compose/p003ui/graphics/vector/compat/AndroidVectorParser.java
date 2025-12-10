package androidx.compose.p003ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleableRes;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.zxy.tiny.common.UriUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

@Metadata(m28851d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0018\u00010\nR\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010!\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J%\u0010(\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001a¢\u0006\u0004\b(\u0010\"J?\u0010*\u001a\u00020)2\u0006\u0010\u0013\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0018\u00010\nR\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J7\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010\u0013\u001a\u00020\u00102\f\u0010\u000b\u001a\b\u0018\u00010\nR\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b1\u00102J$\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b7\u00102J\u001a\u00109\u001a\u00020\u001d2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020\u0004H\u0002¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010?\u001a\u0004\b@\u00100R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u00102\"\u0004\bD\u0010>¨\u0006E"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "", "Lorg/xmlpull/v1/XmlPullParser;", "xmlParser", "", "config", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "Landroid/content/res/Resources;", UriUtil.LOCAL_RESOURCE_SCHEME, "Landroid/content/res/Resources$Theme;", "theme", "Landroid/util/AttributeSet;", "set", "", "attrs", "Landroid/content/res/TypedArray;", "obtainAttributes", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;", "typedArray", "", "attrName", "resId", "defaultValue", "getNamedInt", "(Landroid/content/res/TypedArray;Ljava/lang/String;II)I", "", "getNamedFloat", "(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F", "", "getNamedBoolean", "(Landroid/content/res/TypedArray;Ljava/lang/String;IZ)Z", FirebaseAnalytics.Param.INDEX, "getFloat", "(Landroid/content/res/TypedArray;IF)F", "getInt", "(Landroid/content/res/TypedArray;II)I", "getString", "(Landroid/content/res/TypedArray;I)Ljava/lang/String;", "defValue", "getDimension", "Landroidx/core/content/res/ComplexColorCompat;", "getNamedComplexColor", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Landroidx/core/content/res/ComplexColorCompat;", "Landroid/content/res/ColorStateList;", "getNamedColorStateList", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Landroid/content/res/ColorStateList;", "component1", "()Lorg/xmlpull/v1/XmlPullParser;", "component2", "()I", "copy", "(Lorg/xmlpull/v1/XmlPullParser;I)Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "resConfig", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)V", "Lorg/xmlpull/v1/XmlPullParser;", "getXmlParser", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getConfig", "setConfig", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.vector.compat.AndroidVectorParser */
/* loaded from: classes2.dex */
public final class AndroidVectorParser {

    /* renamed from: a */
    public final XmlPullParser f29538a;

    /* renamed from: b */
    public int f29539b;

    public AndroidVectorParser(@NotNull XmlPullParser xmlParser, int i) {
        Intrinsics.checkNotNullParameter(xmlParser, "xmlParser");
        this.f29538a = xmlParser;
        this.f29539b = i;
    }

    public static /* synthetic */ AndroidVectorParser copy$default(AndroidVectorParser androidVectorParser, XmlPullParser xmlPullParser, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xmlPullParser = androidVectorParser.f29538a;
        }
        if ((i2 & 2) != 0) {
            i = androidVectorParser.f29539b;
        }
        return androidVectorParser.copy(xmlPullParser, i);
    }

    /* renamed from: a */
    public final void m59642a(int i) {
        this.f29539b = i | this.f29539b;
    }

    @NotNull
    public final XmlPullParser component1() {
        return this.f29538a;
    }

    public final int component2() {
        return this.f29539b;
    }

    @NotNull
    public final AndroidVectorParser copy(@NotNull XmlPullParser xmlParser, int i) {
        Intrinsics.checkNotNullParameter(xmlParser, "xmlParser");
        return new AndroidVectorParser(xmlParser, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidVectorParser) {
            AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
            return Intrinsics.areEqual(this.f29538a, androidVectorParser.f29538a) && this.f29539b == androidVectorParser.f29539b;
        }
        return false;
    }

    public final int getConfig() {
        return this.f29539b;
    }

    public final float getDimension(@NotNull TypedArray typedArray, int i, float f) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        float dimension = typedArray.getDimension(i, f);
        m59642a(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float getFloat(@NotNull TypedArray typedArray, int i, float f) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        float f2 = typedArray.getFloat(i, f);
        m59642a(typedArray.getChangingConfigurations());
        return f2;
    }

    public final int getInt(@NotNull TypedArray typedArray, int i, int i2) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        int i3 = typedArray.getInt(i, i2);
        m59642a(typedArray.getChangingConfigurations());
        return i3;
    }

    public final boolean getNamedBoolean(@NotNull TypedArray typedArray, @NotNull String attrName, @StyleableRes int i, boolean z) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(typedArray, this.f29538a, attrName, i, z);
        m59642a(typedArray.getChangingConfigurations());
        return namedBoolean;
    }

    @Nullable
    public final ColorStateList getNamedColorStateList(@NotNull TypedArray typedArray, @Nullable Resources.Theme theme, @NotNull String attrName, @StyleableRes int i) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        ColorStateList namedColorStateList = TypedArrayUtils.getNamedColorStateList(typedArray, this.f29538a, theme, attrName, i);
        m59642a(typedArray.getChangingConfigurations());
        return namedColorStateList;
    }

    @NotNull
    public final ComplexColorCompat getNamedComplexColor(@NotNull TypedArray typedArray, @Nullable Resources.Theme theme, @NotNull String attrName, @StyleableRes int i, @ColorInt int i2) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        ComplexColorCompat result = TypedArrayUtils.getNamedComplexColor(typedArray, this.f29538a, theme, attrName, i, i2);
        m59642a(typedArray.getChangingConfigurations());
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public final float getNamedFloat(@NotNull TypedArray typedArray, @NotNull String attrName, @StyleableRes int i, float f) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, this.f29538a, attrName, i, f);
        m59642a(typedArray.getChangingConfigurations());
        return namedFloat;
    }

    public final int getNamedInt(@NotNull TypedArray typedArray, @NotNull String attrName, @StyleableRes int i, int i2) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        int namedInt = TypedArrayUtils.getNamedInt(typedArray, this.f29538a, attrName, i, i2);
        m59642a(typedArray.getChangingConfigurations());
        return namedInt;
    }

    @Nullable
    public final String getString(@NotNull TypedArray typedArray, int i) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        String string = typedArray.getString(i);
        m59642a(typedArray.getChangingConfigurations());
        return string;
    }

    @NotNull
    public final XmlPullParser getXmlParser() {
        return this.f29538a;
    }

    public int hashCode() {
        return (this.f29538a.hashCode() * 31) + this.f29539b;
    }

    @NotNull
    public final TypedArray obtainAttributes(@NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet set, @NotNull int[] attrs) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(set, "set");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(res, theme, set, attrs);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "obtainAttributes(\n      …          attrs\n        )");
        m59642a(obtainAttributes.getChangingConfigurations());
        return obtainAttributes;
    }

    public final void setConfig(int i) {
        this.f29539b = i;
    }

    @NotNull
    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f29538a + ", config=" + this.f29539b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }
}
