package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.StrokeJoin;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.p003ui.graphics.vector.PathBuilder;
import androidx.compose.p003ui.graphics.vector.VectorKt;
import androidx.compose.p003ui.unit.C3641Dp;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_receipt", "Landroidx/compose/material/icons/Icons$TwoTone;", "getReceipt", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Receipt", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReceipt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Receipt.kt\nandroidx/compose/material/icons/twotone/ReceiptKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,112:1\n122#2:113\n116#2,3:114\n119#2,3:118\n132#2,18:121\n152#2:158\n132#2,18:159\n152#2:196\n174#3:117\n694#4,2:139\n706#4,2:141\n708#4,11:147\n694#4,2:177\n706#4,2:179\n708#4,11:185\n64#5,4:143\n64#5,4:181\n*S KotlinDebug\n*F\n+ 1 Receipt.kt\nandroidx/compose/material/icons/twotone/ReceiptKt\n*L\n29#1:113\n29#1:114,3\n29#1:118,3\n30#1:121,18\n30#1:158\n56#1:159,18\n56#1:196\n29#1:117\n30#1:139,2\n30#1:141,2\n30#1:147,11\n56#1:177,2\n56#1:179,2\n56#1:185,11\n30#1:143,4\n56#1:181,4\n*E\n"})
/* loaded from: classes.dex */
public final class ReceiptKt {

    /* renamed from: a */
    public static ImageVector f24738a;

    @NotNull
    public static final ImageVector getReceipt(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24738a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Receipt", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 19.09f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.lineTo(19.0f, 4.91f);
        pathBuilder.lineTo(5.0f, 4.91f);
        pathBuilder.verticalLineToRelative(14.18f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(6.0f, 9.0f);
        pathBuilder.lineTo(6.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(6.0f, 13.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(6.0f, 17.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.5f, 3.5f);
        pathBuilder2.lineTo(18.0f, 2.0f);
        pathBuilder2.lineToRelative(-1.5f, 1.5f);
        pathBuilder2.lineTo(15.0f, 2.0f);
        pathBuilder2.lineToRelative(-1.5f, 1.5f);
        pathBuilder2.lineTo(12.0f, 2.0f);
        pathBuilder2.lineToRelative(-1.5f, 1.5f);
        pathBuilder2.lineTo(9.0f, 2.0f);
        pathBuilder2.lineTo(7.5f, 3.5f);
        pathBuilder2.lineTo(6.0f, 2.0f);
        pathBuilder2.lineTo(4.5f, 3.5f);
        pathBuilder2.lineTo(3.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(20.0f);
        pathBuilder2.lineToRelative(1.5f, -1.5f);
        pathBuilder2.lineTo(6.0f, 22.0f);
        pathBuilder2.lineToRelative(1.5f, -1.5f);
        pathBuilder2.lineTo(9.0f, 22.0f);
        pathBuilder2.lineToRelative(1.5f, -1.5f);
        pathBuilder2.lineTo(12.0f, 22.0f);
        pathBuilder2.lineToRelative(1.5f, -1.5f);
        pathBuilder2.lineTo(15.0f, 22.0f);
        pathBuilder2.lineToRelative(1.5f, -1.5f);
        pathBuilder2.lineTo(18.0f, 22.0f);
        pathBuilder2.lineToRelative(1.5f, -1.5f);
        pathBuilder2.lineTo(21.0f, 22.0f);
        pathBuilder2.lineTo(21.0f, 2.0f);
        pathBuilder2.lineToRelative(-1.5f, 1.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 19.09f);
        pathBuilder2.lineTo(5.0f, 19.09f);
        pathBuilder2.lineTo(5.0f, 4.91f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.verticalLineToRelative(14.18f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.0f, 15.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineTo(6.0f, 17.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.0f, 11.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineTo(6.0f, 13.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.0f, 7.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineTo(6.0f, 9.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24738a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
