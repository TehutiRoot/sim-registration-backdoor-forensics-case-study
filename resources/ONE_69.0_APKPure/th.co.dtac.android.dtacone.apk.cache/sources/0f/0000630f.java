package androidx.compose.p003ui.platform;

import android.content.res.Configuration;
import androidx.compose.p003ui.unit.LayoutDirection;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000,\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\b\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0014\u001a\u00020\u0002*\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, m29142d2 = {"", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(I)Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/graphics/Matrix;", "other", "", OperatorName.CURVE_TO, "([F[F)V", "m1", "row", "m2", "column", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "([FI[FI)F", "Landroid/content/res/Configuration;", "getLocaleLayoutDirection", "(Landroid/content/res/Configuration;)Landroidx/compose/ui/unit/LayoutDirection;", "localeLayoutDirection", "ui_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,2051:1\n42#2,2:2052\n42#2,2:2054\n42#2,2:2056\n42#2,2:2058\n42#2,2:2060\n42#2,2:2062\n42#2,2:2064\n42#2,2:2066\n42#2,2:2068\n42#2,2:2070\n42#2,2:2072\n42#2,2:2074\n42#2,2:2076\n42#2,2:2078\n42#2,2:2080\n42#2,2:2082\n39#2:2084\n39#2:2085\n39#2:2086\n39#2:2087\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n1940#1:2052,2\n1941#1:2054,2\n1942#1:2056,2\n1943#1:2058,2\n1944#1:2060,2\n1945#1:2062,2\n1946#1:2064,2\n1947#1:2066,2\n1948#1:2068,2\n1949#1:2070,2\n1950#1:2072,2\n1951#1:2074,2\n1952#1:2076,2\n1953#1:2078,2\n1954#1:2080,2\n1955#1:2082,2\n1960#1:2084\n1961#1:2085\n1962#1:2086\n1963#1:2087\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView_androidKt */
/* loaded from: classes2.dex */
public final class AndroidComposeView_androidKt {
    /* renamed from: a */
    public static final float m59194a(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    /* renamed from: b */
    public static final LayoutDirection m59193b(int i) {
        if (i != 0) {
            if (i != 1) {
                return LayoutDirection.Ltr;
            }
            return LayoutDirection.Rtl;
        }
        return LayoutDirection.Ltr;
    }

    /* renamed from: c */
    public static final void m59192c(float[] fArr, float[] fArr2) {
        float m59194a = m59194a(fArr2, 0, fArr, 0);
        float m59194a2 = m59194a(fArr2, 0, fArr, 1);
        float m59194a3 = m59194a(fArr2, 0, fArr, 2);
        float m59194a4 = m59194a(fArr2, 0, fArr, 3);
        float m59194a5 = m59194a(fArr2, 1, fArr, 0);
        float m59194a6 = m59194a(fArr2, 1, fArr, 1);
        float m59194a7 = m59194a(fArr2, 1, fArr, 2);
        float m59194a8 = m59194a(fArr2, 1, fArr, 3);
        float m59194a9 = m59194a(fArr2, 2, fArr, 0);
        float m59194a10 = m59194a(fArr2, 2, fArr, 1);
        float m59194a11 = m59194a(fArr2, 2, fArr, 2);
        float m59194a12 = m59194a(fArr2, 2, fArr, 3);
        float m59194a13 = m59194a(fArr2, 3, fArr, 0);
        float m59194a14 = m59194a(fArr2, 3, fArr, 1);
        float m59194a15 = m59194a(fArr2, 3, fArr, 2);
        float m59194a16 = m59194a(fArr2, 3, fArr, 3);
        fArr[0] = m59194a;
        fArr[1] = m59194a2;
        fArr[2] = m59194a3;
        fArr[3] = m59194a4;
        fArr[4] = m59194a5;
        fArr[5] = m59194a6;
        fArr[6] = m59194a7;
        fArr[7] = m59194a8;
        fArr[8] = m59194a9;
        fArr[9] = m59194a10;
        fArr[10] = m59194a11;
        fArr[11] = m59194a12;
        fArr[12] = m59194a13;
        fArr[13] = m59194a14;
        fArr[14] = m59194a15;
        fArr[15] = m59194a16;
    }

    @NotNull
    public static final LayoutDirection getLocaleLayoutDirection(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        return m59193b(configuration.getLayoutDirection());
    }
}