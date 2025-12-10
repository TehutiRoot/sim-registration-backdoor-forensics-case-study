package th.p047co.dtac.android.dtacone.view.appOne.common.composable;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.PlatformSpanStyle;
import androidx.compose.p003ui.text.SpanStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.cli.HelpFormatter;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.TypeKt;

@Metadata(m29143d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\n\u0010\u0010\u001a\u00020\u0003*\u00020\u0003\u001a\n\u0010\u0011\u001a\u00020\u0003*\u00020\u0003\u001a\n\u0010\u0012\u001a\u00020\u0003*\u00020\u0003\u001a\n\u0010\u0013\u001a\u00020\u0003*\u00020\u0003\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u0004\u0018\u00010\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, m29142d2 = {"highlightText", "Landroidx/compose/ui/text/AnnotatedString;", TextBundle.TEXT_ENTRY, "", SearchIntents.EXTRA_QUERY, "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "lineHeight", "isBlackForNonMatching", "", "highlightText-OSu0eDM", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/font/FontWeight;JZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/AnnotatedString;", "formatIdCard", "formatMobileNumber", "formatTelephoneNumber", "substringPDFFormat", "toBitmap", "Landroid/graphics/Bitmap;", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nStringHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringHelper.kt\nth/co/dtac/android/dtacone/view/appOne/common/composable/StringHelperKt\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,109:1\n1098#2:110\n927#2,6:111\n927#2,6:117\n927#2,6:123\n*S KotlinDebug\n*F\n+ 1 StringHelper.kt\nth/co/dtac/android/dtacone/view/appOne/common/composable/StringHelperKt\n*L\n70#1:110\n76#1:111,6\n87#1:117,6\n96#1:123,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.common.composable.StringHelperKt */
/* loaded from: classes10.dex */
public final class StringHelperKt {
    @NotNull
    public static final String formatIdCard(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 13) {
            String substring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            String substring2 = str.substring(1, 5);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            String substring3 = str.substring(5, 10);
            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            String substring4 = str.substring(10, 12);
            Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
            String substring5 = str.substring(12, 13);
            Intrinsics.checkNotNullExpressionValue(substring5, "substring(...)");
            return substring + HelpFormatter.DEFAULT_OPT_PREFIX + substring2 + HelpFormatter.DEFAULT_OPT_PREFIX + substring3 + HelpFormatter.DEFAULT_OPT_PREFIX + substring4 + HelpFormatter.DEFAULT_OPT_PREFIX + substring5;
        }
        return str;
    }

    @NotNull
    public static final String formatMobileNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 10) {
            String substring = str.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            String substring2 = str.substring(3, 6);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            String substring3 = str.substring(6, 10);
            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            return substring + HelpFormatter.DEFAULT_OPT_PREFIX + substring2 + HelpFormatter.DEFAULT_OPT_PREFIX + substring3;
        }
        return str;
    }

    @NotNull
    public static final String formatTelephoneNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 9) {
            String substring = str.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            String substring2 = str.substring(2, 5);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            String substring3 = str.substring(5, 9);
            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            return substring + HelpFormatter.DEFAULT_OPT_PREFIX + substring2 + HelpFormatter.DEFAULT_OPT_PREFIX + substring3;
        }
        return str;
    }

    @Composable
    @NotNull
    /* renamed from: highlightText-OSu0eDM  reason: not valid java name */
    public static final AnnotatedString m75164highlightTextOSu0eDM(@NotNull String text, @NotNull String str, @Nullable FontFamily fontFamily, long j, @Nullable FontWeight fontWeight, long j2, boolean z, @Nullable Composer composer, int i, int i2) {
        FontFamily fontFamily2;
        long j3;
        FontWeight fontWeight2;
        boolean z2;
        long Color;
        int pushStyle;
        int i3;
        String str2;
        long Color2;
        String query = str;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(query, "query");
        composer.startReplaceableGroup(-46061730);
        if ((i2 & 4) != 0) {
            fontFamily2 = TypeKt.getBetterTogetherFont();
        } else {
            fontFamily2 = fontFamily;
        }
        if ((i2 & 8) != 0) {
            j3 = TextUnitKt.getSp(16);
        } else {
            j3 = j;
        }
        if ((i2 & 16) != 0) {
            fontWeight2 = FontWeight.Companion.getNormal();
        } else {
            fontWeight2 = fontWeight;
        }
        if ((i2 & 32) != 0) {
            TextUnitKt.getSp(26);
        }
        int i4 = 0;
        if ((i2 & 64) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        int i5 = -1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-46061730, i, -1, "th.co.dtac.android.dtacone.view.appOne.common.composable.highlightText (StringHelper.kt:56)");
        }
        if (str.length() == 0) {
            AnnotatedString annotatedString = new AnnotatedString(text, null, null, 6, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return annotatedString;
        }
        boolean z3 = true;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        int i6 = 0;
        while (true) {
            if (i6 >= text.length()) {
                break;
            }
            int indexOf = StringsKt__StringsKt.indexOf(text, query, i6, z3);
            if (indexOf == i5) {
                composer.startReplaceableGroup(1260847826);
                if (z2) {
                    Color = ColorResources_androidKt.colorResource(R.color.jet_back, composer, i4);
                } else {
                    Color = ColorKt.Color(4290361785L);
                }
                int i7 = i6;
                pushStyle = builder.pushStyle(new SpanStyle(Color, j3, fontWeight2, (FontStyle) null, (FontSynthesis) null, fontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65496, (DefaultConstructorMarker) null));
                try {
                    String substring = text.substring(i7);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    builder.append(substring);
                    Unit unit = Unit.INSTANCE;
                    builder.pop(pushStyle);
                    composer.endReplaceableGroup();
                } finally {
                }
            } else {
                composer.startReplaceableGroup(1260848255);
                if (indexOf > i6) {
                    if (z2) {
                        Color2 = ColorResources_androidKt.colorResource(R.color.jet_back, composer, i4);
                    } else {
                        Color2 = ColorKt.Color(4290361785L);
                    }
                    int i8 = i6;
                    pushStyle = builder.pushStyle(new SpanStyle(Color2, j3, fontWeight2, (FontStyle) null, (FontSynthesis) null, fontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65496, (DefaultConstructorMarker) null));
                    i3 = indexOf;
                    try {
                        String substring2 = text.substring(i8, i3);
                        str2 = "substring(...)";
                        Intrinsics.checkNotNullExpressionValue(substring2, str2);
                        builder.append(substring2);
                        Unit unit2 = Unit.INSTANCE;
                    } finally {
                    }
                } else {
                    i3 = indexOf;
                    str2 = "substring(...)";
                }
                int i9 = i3;
                String str3 = str2;
                pushStyle = builder.pushStyle(new SpanStyle(ColorKt.Color(4290052366L), j3, fontWeight2, (FontStyle) null, (FontSynthesis) null, fontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65496, (DefaultConstructorMarker) null));
                try {
                    String substring3 = text.substring(i9, str.length() + i9);
                    Intrinsics.checkNotNullExpressionValue(substring3, str3);
                    builder.append(substring3);
                    Unit unit3 = Unit.INSTANCE;
                    builder.pop(pushStyle);
                    i6 = i9 + str.length();
                    composer.endReplaceableGroup();
                    query = str;
                    z3 = true;
                    i5 = -1;
                    i4 = 0;
                } finally {
                }
            }
        }
        AnnotatedString annotatedString2 = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedString2;
    }

    @NotNull
    public static final String substringPDFFormat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (AbstractC19741eO1.startsWith$default(str, "data:application/pdf;base64,", false, 2, null)) {
            String substring = str.substring(28);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    @Nullable
    public static final Bitmap toBitmap(@Nullable String str) {
        if (str != null && str.length() != 0) {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        }
        return null;
    }
}