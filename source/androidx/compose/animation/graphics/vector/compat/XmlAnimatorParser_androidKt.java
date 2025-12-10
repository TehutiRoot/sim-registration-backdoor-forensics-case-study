package androidx.compose.animation.graphics.vector.compat;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.animation.PathInterpolator;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.graphics.res.AnimatorResources_androidKt;
import androidx.compose.animation.graphics.vector.AnimatorSet;
import androidx.compose.animation.graphics.vector.Keyframe;
import androidx.compose.animation.graphics.vector.Ordering;
import androidx.compose.animation.graphics.vector.PropertyValuesHolder;
import androidx.compose.animation.graphics.vector.PropertyValuesHolder1D;
import androidx.compose.animation.graphics.vector.PropertyValuesHolderColor;
import androidx.compose.animation.graphics.vector.PropertyValuesHolderFloat;
import androidx.compose.animation.graphics.vector.PropertyValuesHolderInt;
import androidx.compose.animation.graphics.vector.PropertyValuesHolderPath;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.vector.VectorKt;
import androidx.core.graphics.PathParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.zxy.tiny.common.UriUtil;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

@Metadata(m28851d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0018\u00010\u0003R\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001aQ\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0018\u00010\u0003R\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a9\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a=\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d*\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0018\u00010\u0003R\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\u00052\n\u0010!\u001a\u00020 \"\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0087\u0001\u00100\u001a\u0006\u0012\u0002\b\u00030/*\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00072F\b\u0002\u0010.\u001a@\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0018\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110,¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\r0)H\u0002¢\u0006\u0004\b0\u00101\u001a\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\u0005H\u0002¢\u0006\u0004\b4\u00105\u001a1\u00107\u001a\u000206*\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0018\u00010\u0003R\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b7\u00108\u001a1\u0010:\u001a\u000209*\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0018\u00010\u0003R\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b:\u0010;\u001a1\u0010<\u001a\u00020\u0007*\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0018\u00010\u0003R\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b<\u0010=\"\u0014\u0010>\u001a\u00020$8\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010?\"\u0014\u0010@\u001a\u00020$8\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u0010?\"\u0014\u0010B\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010A¨\u0006C"}, m28850d2 = {"Landroid/content/res/TypedArray;", "Landroid/content/res/Resources;", UriUtil.LOCAL_RESOURCE_SCHEME, "Landroid/content/res/Resources$Theme;", "theme", "", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/animation/core/Easing;", "defaultValue", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/content/res/TypedArray;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;ILandroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/Easing;", "Landroid/util/AttributeSet;", "attrs", "Landroidx/compose/animation/graphics/vector/compat/ValueType;", "holderValueType", "defaultInterpolator", "Lkotlin/Pair;", "Landroidx/compose/animation/graphics/vector/Keyframe;", "", OperatorName.NON_STROKING_GRAY, "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroidx/compose/animation/graphics/vector/compat/ValueType;Landroidx/compose/animation/core/Easing;)Lkotlin/Pair;", "", "fraction", "interpolator", "valueType", "valueIndex", OperatorName.CURVE_TO, "(Landroid/content/res/TypedArray;FLandroidx/compose/animation/core/Easing;Landroidx/compose/animation/graphics/vector/compat/ValueType;I)Landroidx/compose/animation/graphics/vector/Keyframe;", "Lorg/xmlpull/v1/XmlPullParser;", "Landroidx/compose/animation/graphics/vector/PropertyValuesHolder;", OperatorName.CLOSE_PATH, "(Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroidx/compose/animation/core/Easing;)Landroidx/compose/animation/graphics/vector/PropertyValuesHolder;", "", "typedValueTypes", OperatorName.FILL_NON_ZERO, "(I[I)Landroidx/compose/animation/graphics/vector/compat/ValueType;", "", "propertyName", "valueTypeIndex", "valueFromIndex", "valueToIndex", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "", "keyframes", "parseKeyframes", "Landroidx/compose/animation/graphics/vector/PropertyValuesHolder1D;", "d", "(Landroid/content/res/TypedArray;Ljava/lang/String;IIILandroidx/compose/animation/core/Easing;Lkotlin/jvm/functions/Function2;)Landroidx/compose/animation/graphics/vector/PropertyValuesHolder1D;", "repeatMode", "Landroidx/compose/animation/core/RepeatMode;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)Landroidx/compose/animation/core/RepeatMode;", "Landroidx/compose/animation/graphics/vector/ObjectAnimator;", "parseObjectAnimator", "(Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Landroidx/compose/animation/graphics/vector/ObjectAnimator;", "Landroidx/compose/animation/graphics/vector/AnimatorSet;", "parseAnimatorSet", "(Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Landroidx/compose/animation/graphics/vector/AnimatorSet;", "parseInterpolator", "(Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Landroidx/compose/animation/core/Easing;", "TagSet", "Ljava/lang/String;", "TagObjectAnimator", "Landroidx/compose/animation/graphics/vector/compat/ValueType;", "FallbackValueType", "animation-graphics_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nXmlAnimatorParser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlAnimatorParser.android.kt\nandroidx/compose/animation/graphics/vector/compat/XmlAnimatorParser_androidKt\n+ 2 XmlPullParserUtils.android.kt\nandroidx/compose/animation/graphics/vector/compat/XmlPullParserUtils_androidKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,525:1\n69#2,6:526\n69#2,6:532\n69#2,4:542\n69#2,4:546\n53#2,9:550\n74#2:559\n74#2:560\n69#2,4:561\n53#2,9:565\n74#2:574\n69#2,6:575\n69#2,6:581\n69#2,6:587\n69#2,6:593\n69#2,6:599\n69#2,6:605\n69#2,6:611\n12583#3,2:538\n1002#4,2:540\n*S KotlinDebug\n*F\n+ 1 XmlAnimatorParser.android.kt\nandroidx/compose/animation/graphics/vector/compat/XmlAnimatorParser_androidKt\n*L\n99#1:526,6\n166#1:532,6\n305#1:542,4\n306#1:546,4\n348#1:550,9\n306#1:559\n305#1:560\n382#1:561,4\n385#1:565,9\n382#1:574\n408#1:575,6\n417#1:581,6\n427#1:587,6\n437#1:593,6\n450#1:599,6\n461#1:605,6\n480#1:611,6\n211#1:538,2\n273#1:540,2\n*E\n"})
/* loaded from: classes.dex */
public final class XmlAnimatorParser_androidKt {
    @NotNull
    public static final String TagObjectAnimator = "objectAnimator";
    @NotNull
    public static final String TagSet = "set";

    /* renamed from: a */
    public static final ValueType f12753a = ValueType.Float;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValueType.values().length];
            try {
                iArr[ValueType.Float.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValueType.Int.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValueType.Color.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValueType.Path.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final RepeatMode m61651a(int i) {
        if (i == 2) {
            return RepeatMode.Reverse;
        }
        return RepeatMode.Restart;
    }

    /* renamed from: b */
    public static final Easing m61650b(TypedArray typedArray, Resources resources, Resources.Theme theme, int i, Easing easing) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            return AnimatorResources_androidKt.loadInterpolatorResource(theme, resources, resourceId);
        }
        return easing;
    }

    /* renamed from: c */
    public static final Keyframe m61649c(TypedArray typedArray, float f, Easing easing, ValueType valueType, int i) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[valueType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        return new Keyframe(f, VectorKt.addPathNodes(typedArray.getString(i)), easing);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return new Keyframe(f, Color.m71725boximpl(ColorKt.Color(typedArray.getColor(i, 0))), easing);
            }
            return new Keyframe(f, Integer.valueOf(typedArray.getInt(i, 0)), easing);
        }
        return new Keyframe(f, Float.valueOf(typedArray.getFloat(i, 0.0f)), easing);
    }

    /* renamed from: d */
    public static final PropertyValuesHolder1D m61648d(TypedArray typedArray, String str, int i, int i2, int i3, Easing easing, Function2 function2) {
        boolean z;
        int i4;
        int i5;
        int i6 = typedArray.getInt(i, 4);
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z2 = false;
        if (peekValue != null) {
            z = true;
        } else {
            z = false;
        }
        if (peekValue != null) {
            i4 = peekValue.type;
        } else {
            i4 = 4;
        }
        TypedValue peekValue2 = typedArray.peekValue(i3);
        if (peekValue2 != null) {
            z2 = true;
        }
        if (peekValue2 != null) {
            i5 = peekValue2.type;
        } else {
            i5 = 4;
        }
        ValueType m61646f = m61646f(i6, i4, i5);
        ArrayList arrayList = new ArrayList();
        if (m61646f == null && (z || z2)) {
            m61646f = ValueType.Float;
        }
        if (z) {
            Intrinsics.checkNotNull(m61646f);
            arrayList.add(m61649c(typedArray, 0.0f, easing, m61646f, i2));
        }
        if (z2) {
            Intrinsics.checkNotNull(m61646f);
            arrayList.add(m61649c(typedArray, 1.0f, easing, m61646f, i3));
        }
        ValueType valueType = (ValueType) function2.invoke(m61646f, arrayList);
        if (arrayList.size() > 1) {
            AbstractC10334gs.sortWith(arrayList, new Comparator() { // from class: androidx.compose.animation.graphics.vector.compat.XmlAnimatorParser_androidKt$getPropertyValuesHolder1D$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return AbstractC16857uu.compareValues(Float.valueOf(((Keyframe) t).getFraction()), Float.valueOf(((Keyframe) t2).getFraction()));
                }
            });
        }
        int i7 = WhenMappings.$EnumSwitchMapping$0[valueType.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        return new PropertyValuesHolderPath(str, arrayList);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return new PropertyValuesHolderColor(str, arrayList);
            }
            return new PropertyValuesHolderInt(str, arrayList);
        }
        return new PropertyValuesHolderFloat(str, arrayList);
    }

    /* renamed from: e */
    public static /* synthetic */ PropertyValuesHolder1D m61647e(TypedArray typedArray, String str, int i, int i2, int i3, Easing easing, Function2 function2, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            function2 = XmlAnimatorParser_androidKt$getPropertyValuesHolder1D$1.INSTANCE;
        }
        return m61648d(typedArray, str, i, i2, i3, easing, function2);
    }

    /* renamed from: f */
    public static final ValueType m61646f(int i, int... iArr) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        for (int i2 : iArr) {
                            if (28 > i2 || i2 >= 32) {
                                return null;
                            }
                        }
                        return ValueType.Color;
                    }
                    return ValueType.Color;
                }
                return ValueType.Path;
            }
            return ValueType.Int;
        }
        return ValueType.Float;
    }

    /* renamed from: g */
    public static final Pair m61645g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueType valueType, Easing easing) {
        TypedArray a;
        int[] styleable_keyframe = AndroidVectorResources.INSTANCE.getSTYLEABLE_KEYFRAME();
        if (theme == null || (a = theme.obtainStyledAttributes(attributeSet, styleable_keyframe, 0, 0)) == null) {
            a = resources.obtainAttributes(attributeSet, styleable_keyframe);
        }
        try {
            Intrinsics.checkNotNullExpressionValue(a, "a");
            if (valueType == null && (valueType = m61646f(a.getInt(2, 4), a.peekValue(0).type)) == null) {
                valueType = f12753a;
            }
            Pair m28844to = TuplesKt.m28844to(m61649c(a, a.getFloat(3, 0.0f), m61650b(a, resources, theme, 1, easing), valueType, 0), valueType);
            a.recycle();
            return m28844to;
        } catch (Throwable th2) {
            a.recycle();
            throw th2;
        }
    }

    /* renamed from: h */
    public static final PropertyValuesHolder m61644h(XmlPullParser xmlPullParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, Easing easing) {
        TypedArray a;
        int[] styleable_property_values_holder = AndroidVectorResources.INSTANCE.getSTYLEABLE_PROPERTY_VALUES_HOLDER();
        if (theme == null || (a = theme.obtainStyledAttributes(attributeSet, styleable_property_values_holder, 0, 0)) == null) {
            a = resources.obtainAttributes(attributeSet, styleable_property_values_holder);
        }
        try {
            Intrinsics.checkNotNullExpressionValue(a, "a");
            String string = a.getString(3);
            Intrinsics.checkNotNull(string);
            return m61648d(a, string, 2, 0, 1, easing, new XmlAnimatorParser_androidKt$parsePropertyValuesHolder$1$1(xmlPullParser, resources, theme, attributeSet, easing));
        } finally {
            a.recycle();
        }
    }

    @NotNull
    public static final AnimatorSet parseAnimatorSet(@NotNull XmlPullParser xmlPullParser, @NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet attrs) {
        TypedArray a;
        Ordering ordering;
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        int[] styleable_animator_set = AndroidVectorResources.INSTANCE.getSTYLEABLE_ANIMATOR_SET();
        if (theme == null || (a = theme.obtainStyledAttributes(attrs, styleable_animator_set, 0, 0)) == null) {
            a = res.obtainAttributes(attrs, styleable_animator_set);
        }
        try {
            Intrinsics.checkNotNullExpressionValue(a, "a");
            int i = a.getInt(0, 0);
            ArrayList arrayList = new ArrayList();
            xmlPullParser.next();
            while (!XmlPullParserUtils_androidKt.isAtEnd(xmlPullParser) && (xmlPullParser.getEventType() != 3 || !Intrinsics.areEqual(xmlPullParser.getName(), "set"))) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    if (Intrinsics.areEqual(name, "set")) {
                        arrayList.add(parseAnimatorSet(xmlPullParser, res, theme, attrs));
                    } else if (Intrinsics.areEqual(name, TagObjectAnimator)) {
                        arrayList.add(parseObjectAnimator(xmlPullParser, res, theme, attrs));
                    }
                }
                xmlPullParser.next();
            }
            if (i != 0) {
                ordering = Ordering.Sequentially;
            } else {
                ordering = Ordering.Together;
            }
            AnimatorSet animatorSet = new AnimatorSet(arrayList, ordering);
            a.recycle();
            return animatorSet;
        } catch (Throwable th2) {
            a.recycle();
            throw th2;
        }
    }

    @NotNull
    public static final Easing parseInterpolator(@NotNull XmlPullParser xmlPullParser, @NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet attrs) {
        TypedArray a;
        Easing easing;
        Easing AccelerateEasing;
        Easing DecelerateEasing;
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        String name = xmlPullParser.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -2140409460:
                    if (name.equals("pathInterpolator")) {
                        int[] styleable_path_interpolator = AndroidVectorResources.INSTANCE.getSTYLEABLE_PATH_INTERPOLATOR();
                        if (theme == null || (r9 = theme.obtainStyledAttributes(attrs, styleable_path_interpolator, 0, 0)) == null) {
                            TypedArray obtainAttributes = res.obtainAttributes(attrs, styleable_path_interpolator);
                        }
                        try {
                            Intrinsics.checkNotNullExpressionValue(a, "a");
                            String string = a.getString(4);
                            if (string != null) {
                                easing = AnimatorResources_androidKt.toEasing(new PathInterpolator(PathParser.createPathFromPathData(string)));
                            } else {
                                if (a.hasValue(2) && a.hasValue(3)) {
                                    easing = new CubicBezierEasing(a.getFloat(0, 0.0f), a.getFloat(1, 0.0f), a.getFloat(2, 1.0f), a.getFloat(3, 1.0f));
                                }
                                easing = AnimatorResources_androidKt.toEasing(new PathInterpolator(a.getFloat(0, 0.0f), a.getFloat(1, 0.0f)));
                            }
                            return easing;
                        } finally {
                        }
                    }
                    break;
                case -2120889007:
                    if (name.equals("anticipateInterpolator")) {
                        int[] styleable_anticipateovershoot_interpolator = AndroidVectorResources.INSTANCE.getSTYLEABLE_ANTICIPATEOVERSHOOT_INTERPOLATOR();
                        if (theme == null || (r9 = theme.obtainStyledAttributes(attrs, styleable_anticipateovershoot_interpolator, 0, 0)) == null) {
                            TypedArray obtainAttributes2 = res.obtainAttributes(attrs, styleable_anticipateovershoot_interpolator);
                        }
                        try {
                            Intrinsics.checkNotNullExpressionValue(a, "a");
                            return AnimatorResources_androidKt.AnticipateEasing(a.getFloat(0, 2.0f));
                        } finally {
                        }
                    }
                    break;
                case -1248486260:
                    if (name.equals("linearInterpolator")) {
                        return EasingKt.getLinearEasing();
                    }
                    break;
                case -935873468:
                    if (name.equals("accelerateInterpolator")) {
                        int[] styleable_accelerate_interpolator = AndroidVectorResources.INSTANCE.getSTYLEABLE_ACCELERATE_INTERPOLATOR();
                        if (theme == null || (r9 = theme.obtainStyledAttributes(attrs, styleable_accelerate_interpolator, 0, 0)) == null) {
                            TypedArray obtainAttributes3 = res.obtainAttributes(attrs, styleable_accelerate_interpolator);
                        }
                        try {
                            Intrinsics.checkNotNullExpressionValue(a, "a");
                            float f = a.getFloat(0, 1.0f);
                            if (f == 1.0f) {
                                AccelerateEasing = AnimatorResources_androidKt.getAccelerateEasing();
                            } else {
                                AccelerateEasing = AnimatorResources_androidKt.AccelerateEasing(f);
                            }
                            return AccelerateEasing;
                        } finally {
                        }
                    }
                    break;
                case -425326737:
                    if (name.equals("bounceInterpolator")) {
                        return AnimatorResources_androidKt.getBounceEasing();
                    }
                    break;
                case 1192587314:
                    if (name.equals("overshootInterpolator")) {
                        int[] styleable_overshoot_interpolator = AndroidVectorResources.INSTANCE.getSTYLEABLE_OVERSHOOT_INTERPOLATOR();
                        if (theme == null || (r9 = theme.obtainStyledAttributes(attrs, styleable_overshoot_interpolator, 0, 0)) == null) {
                            TypedArray obtainAttributes4 = res.obtainAttributes(attrs, styleable_overshoot_interpolator);
                        }
                        try {
                            Intrinsics.checkNotNullExpressionValue(a, "a");
                            return AnimatorResources_androidKt.OvershootEasing(a.getFloat(0, 2.0f));
                        } finally {
                        }
                    }
                    break;
                case 1472030440:
                    if (name.equals("anticipateOvershootInterpolator")) {
                        int[] styleable_anticipateovershoot_interpolator2 = AndroidVectorResources.INSTANCE.getSTYLEABLE_ANTICIPATEOVERSHOOT_INTERPOLATOR();
                        if (theme == null || (r9 = theme.obtainStyledAttributes(attrs, styleable_anticipateovershoot_interpolator2, 0, 0)) == null) {
                            TypedArray obtainAttributes5 = res.obtainAttributes(attrs, styleable_anticipateovershoot_interpolator2);
                        }
                        try {
                            Intrinsics.checkNotNullExpressionValue(a, "a");
                            return AnimatorResources_androidKt.AnticipateOvershootEasing(a.getFloat(0, 2.0f), a.getFloat(1, 1.5f));
                        } finally {
                        }
                    }
                    break;
                case 1962594083:
                    if (name.equals("decelerateInterpolator")) {
                        int[] styleable_decelerate_interpolator = AndroidVectorResources.INSTANCE.getSTYLEABLE_DECELERATE_INTERPOLATOR();
                        if (theme == null || (r9 = theme.obtainStyledAttributes(attrs, styleable_decelerate_interpolator, 0, 0)) == null) {
                            TypedArray obtainAttributes6 = res.obtainAttributes(attrs, styleable_decelerate_interpolator);
                        }
                        try {
                            Intrinsics.checkNotNullExpressionValue(a, "a");
                            float f2 = a.getFloat(0, 1.0f);
                            if (f2 == 1.0f) {
                                DecelerateEasing = AnimatorResources_androidKt.getDecelerateEasing();
                            } else {
                                DecelerateEasing = AnimatorResources_androidKt.DecelerateEasing(f2);
                            }
                            return DecelerateEasing;
                        } finally {
                        }
                    }
                    break;
                case 2019672672:
                    if (name.equals("accelerateDecelerateInterpolator")) {
                        return AnimatorResources_androidKt.getAccelerateDecelerateEasing();
                    }
                    break;
                case 2038238413:
                    if (name.equals("cycleInterpolator")) {
                        int[] styleable_cycle_interpolator = AndroidVectorResources.INSTANCE.getSTYLEABLE_CYCLE_INTERPOLATOR();
                        if (theme == null || (a = theme.obtainStyledAttributes(attrs, styleable_cycle_interpolator, 0, 0)) == null) {
                            a = res.obtainAttributes(attrs, styleable_cycle_interpolator);
                        }
                        try {
                            Intrinsics.checkNotNullExpressionValue(a, "a");
                            return AnimatorResources_androidKt.CycleEasing(a.getFloat(0, 1.0f));
                        } finally {
                        }
                    }
                    break;
            }
        }
        throw new RuntimeException("Unknown interpolator: " + xmlPullParser.getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x003d, blocks: (B:7:0x002d, B:9:0x0036, B:39:0x00fa, B:14:0x0040, B:15:0x0044, B:17:0x005d, B:38:0x00d9, B:20:0x007c, B:22:0x0082, B:24:0x009d, B:25:0x00a3, B:27:0x00a9, B:29:0x00af, B:32:0x00ba, B:34:0x00c1, B:36:0x00ce, B:37:0x00d5), top: B:46:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x003d, blocks: (B:7:0x002d, B:9:0x0036, B:39:0x00fa, B:14:0x0040, B:15:0x0044, B:17:0x005d, B:38:0x00d9, B:20:0x007c, B:22:0x0082, B:24:0x009d, B:25:0x00a3, B:27:0x00a9, B:29:0x00af, B:32:0x00ba, B:34:0x00c1, B:36:0x00ce, B:37:0x00d5), top: B:46:0x002d }] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.animation.graphics.vector.ObjectAnimator parseObjectAnimator(@org.jetbrains.annotations.NotNull org.xmlpull.v1.XmlPullParser r20, @org.jetbrains.annotations.NotNull android.content.res.Resources r21, @org.jetbrains.annotations.Nullable android.content.res.Resources.Theme r22, @org.jetbrains.annotations.NotNull android.util.AttributeSet r23) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.graphics.vector.compat.XmlAnimatorParser_androidKt.parseObjectAnimator(org.xmlpull.v1.XmlPullParser, android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet):androidx.compose.animation.graphics.vector.ObjectAnimator");
    }
}
