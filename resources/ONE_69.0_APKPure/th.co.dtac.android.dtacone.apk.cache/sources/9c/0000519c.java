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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_games", "Landroidx/compose/material/icons/Icons$TwoTone;", "getGames", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Games", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Games.kt\nandroidx/compose/material/icons/twotone/GamesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,119:1\n122#2:120\n116#2,3:121\n119#2,3:125\n132#2,18:128\n152#2:165\n132#2,18:166\n152#2:203\n174#3:124\n694#4,2:146\n706#4,2:148\n708#4,11:154\n694#4,2:184\n706#4,2:186\n708#4,11:192\n64#5,4:150\n64#5,4:188\n*S KotlinDebug\n*F\n+ 1 Games.kt\nandroidx/compose/material/icons/twotone/GamesKt\n*L\n29#1:120\n29#1:121,3\n29#1:125,3\n30#1:128,18\n30#1:165\n56#1:166,18\n56#1:203\n29#1:124\n30#1:146,2\n30#1:148,2\n30#1:154,11\n56#1:184,2\n56#1:186,2\n56#1:192,11\n30#1:150,4\n56#1:188,4\n*E\n"})
/* loaded from: classes.dex */
public final class GamesKt {

    /* renamed from: a */
    public static ImageVector f24162a;

    @NotNull
    public static final ImageVector getGames(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24162a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Games", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 17.33f);
        pathBuilder.lineTo(11.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.67f);
        pathBuilder.lineToRelative(-1.0f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 6.67f);
        pathBuilder.lineTo(13.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.67f);
        pathBuilder.lineToRelative(1.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.33f, 12.0f);
        pathBuilder.lineToRelative(1.0f, 1.0f);
        pathBuilder.lineTo(20.0f, 13.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-2.67f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 11.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.67f);
        pathBuilder.lineToRelative(1.0f, -1.0f);
        pathBuilder.lineToRelative(-1.0f, -1.0f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(2.0f, 9.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.horizontalLineToRelative(5.5f);
        pathBuilder2.lineToRelative(3.0f, -3.0f);
        pathBuilder2.lineToRelative(-3.0f, -3.0f);
        pathBuilder2.lineTo(2.0f, 9.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.67f, 13.0f);
        pathBuilder2.lineTo(4.0f, 13.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineToRelative(2.67f);
        pathBuilder2.lineToRelative(1.0f, 1.0f);
        pathBuilder2.lineToRelative(-1.0f, 1.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(22.0f, 9.0f);
        pathBuilder2.horizontalLineToRelative(-5.5f);
        pathBuilder2.lineToRelative(-3.0f, 3.0f);
        pathBuilder2.lineToRelative(3.0f, 3.0f);
        pathBuilder2.lineTo(22.0f, 15.0f);
        pathBuilder2.lineTo(22.0f, 9.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 13.0f);
        pathBuilder2.horizontalLineToRelative(-2.67f);
        pathBuilder2.lineToRelative(-1.0f, -1.0f);
        pathBuilder2.lineToRelative(1.0f, -1.0f);
        pathBuilder2.lineTo(20.0f, 11.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 16.5f);
        pathBuilder2.lineToRelative(-3.0f, -3.0f);
        pathBuilder2.lineToRelative(-3.0f, 3.0f);
        pathBuilder2.lineTo(9.0f, 22.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.verticalLineToRelative(-5.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 20.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(-2.67f);
        pathBuilder2.lineToRelative(1.0f, -1.0f);
        pathBuilder2.lineToRelative(1.0f, 1.0f);
        pathBuilder2.lineTo(13.0f, 20.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.0f, 7.5f);
        pathBuilder2.lineToRelative(3.0f, 3.0f);
        pathBuilder2.lineToRelative(3.0f, -3.0f);
        pathBuilder2.lineTo(15.0f, 2.0f);
        pathBuilder2.lineTo(9.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(5.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 4.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(2.67f);
        pathBuilder2.lineToRelative(-1.0f, 1.0f);
        pathBuilder2.lineToRelative(-1.0f, -1.0f);
        pathBuilder2.lineTo(11.0f, 4.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24162a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}