package androidx.compose.material.icons.rounded;

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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_bluetoothAudio", "Landroidx/compose/material/icons/Icons$Rounded;", "getBluetoothAudio", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "BluetoothAudio", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBluetoothAudio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothAudio.kt\nandroidx/compose/material/icons/rounded/BluetoothAudioKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n122#2:87\n116#2,3:88\n119#2,3:92\n132#2,18:95\n152#2:132\n174#3:91\n694#4,2:113\n706#4,2:115\n708#4,11:121\n64#5,4:117\n*S KotlinDebug\n*F\n+ 1 BluetoothAudio.kt\nandroidx/compose/material/icons/rounded/BluetoothAudioKt\n*L\n29#1:87\n29#1:88,3\n29#1:92,3\n30#1:95,18\n30#1:132\n29#1:91\n30#1:113,2\n30#1:115,2\n30#1:121,11\n30#1:117,4\n*E\n"})
/* loaded from: classes.dex */
public final class BluetoothAudioKt {

    /* renamed from: a */
    public static ImageVector f19217a;

    @NotNull
    public static final ImageVector getBluetoothAudio(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f19217a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BluetoothAudio", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw = StrokeCap.Companion.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk8 = StrokeJoin.Companion.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.98f, 10.28f);
        pathBuilder.lineToRelative(-1.38f, 1.38f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(1.38f, 1.38f);
        pathBuilder.curveToRelative(0.28f, 0.28f, 0.75f, 0.15f, 0.85f, -0.23f);
        pathBuilder.curveToRelative(0.11f, -0.5f, 0.17f, -1.0f, 0.17f, -1.52f);
        pathBuilder.curveToRelative(0.0f, -0.51f, -0.06f, -1.01f, -0.18f, -1.48f);
        pathBuilder.curveToRelative(-0.09f, -0.38f, -0.56f, -0.52f, -0.84f, -0.24f);
        pathBuilder.close();
        pathBuilder.moveTo(20.1f, 7.78f);
        pathBuilder.curveToRelative(-0.25f, -0.55f, -0.98f, -0.67f, -1.4f, -0.24f);
        pathBuilder.curveToRelative(-0.26f, 0.26f, -0.31f, 0.64f, -0.17f, 0.98f);
        pathBuilder.curveToRelative(0.46f, 1.07f, 0.72f, 2.24f, 0.72f, 3.47f);
        pathBuilder.curveToRelative(0.0f, 1.24f, -0.26f, 2.42f, -0.73f, 3.49f);
        pathBuilder.curveToRelative(-0.14f, 0.32f, -0.09f, 0.69f, 0.16f, 0.94f);
        pathBuilder.curveToRelative(0.41f, 0.41f, 1.1f, 0.29f, 1.35f, -0.23f);
        pathBuilder.curveToRelative(0.63f, -1.3f, 0.98f, -2.76f, 0.98f, -4.3f);
        pathBuilder.curveToRelative(-0.01f, -1.45f, -0.33f, -2.85f, -0.91f, -4.11f);
        pathBuilder.close();
        pathBuilder.moveTo(11.39f, 12.0f);
        pathBuilder.lineToRelative(3.59f, -3.58f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f);
        pathBuilder.lineToRelative(-4.29f, -4.29f);
        pathBuilder.curveToRelative(-0.63f, -0.63f, -1.71f, -0.18f, -1.71f, 0.71f);
        pathBuilder.lineTo(8.98f, 9.6f);
        pathBuilder.lineTo(5.09f, 5.7f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(8.57f, 12.0f);
        pathBuilder.lineToRelative(-4.89f, 4.89f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(3.89f, -3.89f);
        pathBuilder.verticalLineToRelative(6.18f);
        pathBuilder.curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f);
        pathBuilder.lineToRelative(4.3f, -4.3f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f);
        pathBuilder.lineTo(11.39f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.98f, 5.83f);
        pathBuilder.lineToRelative(1.88f, 1.88f);
        pathBuilder.lineToRelative(-1.88f, 1.88f);
        pathBuilder.lineTo(10.98f, 5.83f);
        pathBuilder.close();
        pathBuilder.moveTo(10.98f, 18.17f);
        pathBuilder.verticalLineToRelative(-3.76f);
        pathBuilder.lineToRelative(1.88f, 1.88f);
        pathBuilder.lineToRelative(-1.88f, 1.88f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f19217a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
