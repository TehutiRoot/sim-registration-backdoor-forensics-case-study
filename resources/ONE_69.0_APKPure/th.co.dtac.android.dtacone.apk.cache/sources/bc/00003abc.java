package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.StrokeJoin;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.p003ui.graphics.vector.PathBuilder;
import androidx.compose.p003ui.graphics.vector.VectorKt;
import androidx.compose.p003ui.unit.C3623Dp;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_pets", "Landroidx/compose/material/icons/Icons$Outlined;", "getPets", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Pets", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pets.kt\nandroidx/compose/material/icons/outlined/PetsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n122#2:79\n116#2,3:80\n119#2,3:84\n132#2,18:87\n152#2:124\n132#2,18:125\n152#2:162\n132#2,18:163\n152#2:200\n132#2,18:201\n152#2:238\n132#2,18:239\n152#2:276\n174#3:83\n694#4,2:105\n706#4,2:107\n708#4,11:113\n694#4,2:143\n706#4,2:145\n708#4,11:151\n694#4,2:181\n706#4,2:183\n708#4,11:189\n694#4,2:219\n706#4,2:221\n708#4,11:227\n694#4,2:257\n706#4,2:259\n708#4,11:265\n64#5,4:109\n64#5,4:147\n64#5,4:185\n64#5,4:223\n64#5,4:261\n*S KotlinDebug\n*F\n+ 1 Pets.kt\nandroidx/compose/material/icons/outlined/PetsKt\n*L\n29#1:79\n29#1:80,3\n29#1:84,3\n30#1:87,18\n30#1:124\n36#1:125,18\n36#1:162\n42#1:163,18\n42#1:200\n48#1:201,18\n48#1:238\n54#1:239,18\n54#1:276\n29#1:83\n30#1:105,2\n30#1:107,2\n30#1:113,11\n36#1:143,2\n36#1:145,2\n36#1:151,11\n42#1:181,2\n42#1:183,2\n42#1:189,11\n48#1:219,2\n48#1:221,2\n48#1:227,11\n54#1:257,2\n54#1:259,2\n54#1:265,11\n30#1:109,4\n36#1:147,4\n42#1:185,4\n48#1:223,4\n54#1:261,4\n*E\n"})
/* loaded from: classes.dex */
public final class PetsKt {

    /* renamed from: a */
    public static ImageVector f18306a;

    @NotNull
    public static final ImageVector getPets(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f18306a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Pets", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.5f, 9.5f);
        pathBuilder.moveToRelative(-2.5f, 0.0f);
        pathBuilder.arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f);
        pathBuilder.arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f);
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.0f, 5.5f);
        pathBuilder2.moveToRelative(-2.5f, 0.0f);
        pathBuilder2.arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f);
        pathBuilder2.arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f);
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(15.0f, 5.5f);
        pathBuilder3.moveToRelative(-2.5f, 0.0f);
        pathBuilder3.arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f);
        pathBuilder3.arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f);
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw4 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk84 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(19.5f, 9.5f);
        pathBuilder4.moveToRelative(-2.5f, 0.0f);
        pathBuilder4.arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f);
        pathBuilder4.arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f);
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw4, m72237getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw5 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk85 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(17.34f, 14.86f);
        pathBuilder5.curveToRelative(-0.87f, -1.02f, -1.6f, -1.89f, -2.48f, -2.91f);
        pathBuilder5.curveToRelative(-0.46f, -0.54f, -1.05f, -1.08f, -1.75f, -1.32f);
        pathBuilder5.curveToRelative(-0.11f, -0.04f, -0.22f, -0.07f, -0.33f, -0.09f);
        pathBuilder5.curveToRelative(-0.25f, -0.04f, -0.52f, -0.04f, -0.78f, -0.04f);
        pathBuilder5.reflectiveCurveToRelative(-0.53f, 0.0f, -0.79f, 0.05f);
        pathBuilder5.curveToRelative(-0.11f, 0.02f, -0.22f, 0.05f, -0.33f, 0.09f);
        pathBuilder5.curveToRelative(-0.7f, 0.24f, -1.28f, 0.78f, -1.75f, 1.32f);
        pathBuilder5.curveToRelative(-0.87f, 1.02f, -1.6f, 1.89f, -2.48f, 2.91f);
        pathBuilder5.curveToRelative(-1.31f, 1.31f, -2.92f, 2.76f, -2.62f, 4.79f);
        pathBuilder5.curveToRelative(0.29f, 1.02f, 1.02f, 2.03f, 2.33f, 2.32f);
        pathBuilder5.curveToRelative(0.73f, 0.15f, 3.06f, -0.44f, 5.54f, -0.44f);
        pathBuilder5.horizontalLineToRelative(0.18f);
        pathBuilder5.curveToRelative(2.48f, 0.0f, 4.81f, 0.58f, 5.54f, 0.44f);
        pathBuilder5.curveToRelative(1.31f, -0.29f, 2.04f, -1.31f, 2.33f, -2.32f);
        pathBuilder5.curveToRelative(0.31f, -2.04f, -1.3f, -3.49f, -2.61f, -4.8f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw5, m72237getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f18306a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}