package androidx.compose.material.icons.twotone;

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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_phoneBluetoothSpeaker", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPhoneBluetoothSpeaker", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "PhoneBluetoothSpeaker", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhoneBluetoothSpeaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneBluetoothSpeaker.kt\nandroidx/compose/material/icons/twotone/PhoneBluetoothSpeakerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,106:1\n122#2:107\n116#2,3:108\n119#2,3:112\n132#2,18:115\n152#2:152\n132#2,18:153\n152#2:190\n174#3:111\n694#4,2:133\n706#4,2:135\n708#4,11:141\n694#4,2:171\n706#4,2:173\n708#4,11:179\n64#5,4:137\n64#5,4:175\n*S KotlinDebug\n*F\n+ 1 PhoneBluetoothSpeaker.kt\nandroidx/compose/material/icons/twotone/PhoneBluetoothSpeakerKt\n*L\n29#1:107\n29#1:108,3\n29#1:112,3\n30#1:115,18\n30#1:152\n44#1:153,18\n44#1:190\n29#1:111\n30#1:133,2\n30#1:135,2\n30#1:141,11\n44#1:171,2\n44#1:173,2\n44#1:179,11\n30#1:137,4\n44#1:175,4\n*E\n"})
/* loaded from: classes.dex */
public final class PhoneBluetoothSpeakerKt {

    /* renamed from: a */
    public static ImageVector f24705a;

    @NotNull
    public static final ImageVector getPhoneBluetoothSpeaker(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24705a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PhoneBluetoothSpeaker", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.2f, 18.21f);
        pathBuilder.curveToRelative(1.21f, 0.41f, 2.48f, 0.67f, 3.8f, 0.76f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.curveToRelative(-0.88f, -0.07f, -1.75f, -0.22f, -2.6f, -0.45f);
        pathBuilder.lineToRelative(-1.2f, 1.19f);
        pathBuilder.close();
        pathBuilder.moveTo(6.54f, 5.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.curveToRelative(0.09f, 1.32f, 0.34f, 2.58f, 0.75f, 3.79f);
        pathBuilder.lineToRelative(1.2f, -1.21f);
        pathBuilder.curveToRelative(-0.24f, -0.83f, -0.39f, -1.7f, -0.45f, -2.58f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 15.5f);
        pathBuilder2.curveToRelative(-1.25f, 0.0f, -2.45f, -0.2f, -3.57f, -0.57f);
        pathBuilder2.curveToRelative(-0.1f, -0.03f, -0.21f, -0.05f, -0.31f, -0.05f);
        pathBuilder2.curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        pathBuilder2.lineToRelative(-2.2f, 2.2f);
        pathBuilder2.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        pathBuilder2.lineToRelative(2.2f, -2.21f);
        pathBuilder2.curveToRelative(0.28f, -0.26f, 0.36f, -0.65f, 0.25f, -1.0f);
        pathBuilder2.curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder2.lineTo(4.0f, 3.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder2.curveToRelative(0.0f, 9.39f, 7.61f, 17.0f, 17.0f, 17.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder2.verticalLineToRelative(-3.5f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.03f, 5.0f);
        pathBuilder2.horizontalLineToRelative(1.5f);
        pathBuilder2.curveToRelative(0.07f, 0.88f, 0.22f, 1.75f, 0.45f, 2.58f);
        pathBuilder2.lineToRelative(-1.2f, 1.21f);
        pathBuilder2.curveToRelative(-0.4f, -1.21f, -0.66f, -2.47f, -0.75f, -3.79f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 18.97f);
        pathBuilder2.curveToRelative(-1.32f, -0.09f, -2.6f, -0.35f, -3.8f, -0.76f);
        pathBuilder2.lineToRelative(1.2f, -1.2f);
        pathBuilder2.curveToRelative(0.85f, 0.24f, 1.72f, 0.39f, 2.6f, 0.45f);
        pathBuilder2.verticalLineToRelative(1.51f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.71f, 9.5f);
        pathBuilder2.lineTo(17.0f, 7.21f);
        pathBuilder2.lineTo(17.0f, 11.0f);
        pathBuilder2.horizontalLineToRelative(0.5f);
        pathBuilder2.lineToRelative(2.85f, -2.85f);
        pathBuilder2.lineTo(18.21f, 6.0f);
        pathBuilder2.lineToRelative(2.15f, -2.15f);
        pathBuilder2.lineTo(17.5f, 1.0f);
        pathBuilder2.lineTo(17.0f, 1.0f);
        pathBuilder2.verticalLineToRelative(3.79f);
        pathBuilder2.lineTo(14.71f, 2.5f);
        pathBuilder2.lineToRelative(-0.71f, 0.71f);
        pathBuilder2.lineTo(16.79f, 6.0f);
        pathBuilder2.lineTo(14.0f, 8.79f);
        pathBuilder2.lineToRelative(0.71f, 0.71f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 2.91f);
        pathBuilder2.lineToRelative(0.94f, 0.94f);
        pathBuilder2.lineToRelative(-0.94f, 0.94f);
        pathBuilder2.lineTo(18.0f, 2.91f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 7.21f);
        pathBuilder2.lineToRelative(0.94f, 0.94f);
        pathBuilder2.lineToRelative(-0.94f, 0.94f);
        pathBuilder2.lineTo(18.0f, 7.21f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24705a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}