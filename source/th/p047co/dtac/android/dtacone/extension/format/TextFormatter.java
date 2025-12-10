package th.p047co.dtac.android.dtacone.extension.format;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\bJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\bR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0011\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%¨\u0006)"}, m28850d2 = {"Lth/co/dtac/android/dtacone/extension/format/TextFormatter;", "", "", "template", "<init>", "(Ljava/lang/String;)V", TextBundle.TEXT_ENTRY, "delete", "(Ljava/lang/String;)Ljava/lang/String;", "removeMaskText", "char", "", FirebaseAnalytics.Param.INDEX, "counter", "Lth/co/dtac/android/dtacone/extension/format/WrapData;", "value", "(Ljava/lang/String;II)Lth/co/dtac/android/dtacone/extension/format/WrapData;", "maskText", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "maximumLength", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "formatChar", "", OperatorName.CURVE_TO, "Ljava/util/List;", "maskIndexes", "", "d", "[C", "templateArray", "", "e", "C", "Lkotlin/text/Regex;", OperatorName.FILL_NON_ZERO, "Lkotlin/text/Regex;", "patternCharEng", OperatorName.NON_STROKING_GRAY, "patternCharNumber", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFormatter.kt\nth/co/dtac/android/dtacone/extension/format/TextFormatter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n11235#2:82\n11370#2,4:83\n3864#2:90\n4387#2,2:91\n11235#2:93\n11370#2,4:94\n766#3:87\n857#3,2:88\n*S KotlinDebug\n*F\n+ 1 TextFormatter.kt\nth/co/dtac/android/dtacone/extension/format/TextFormatter\n*L\n7#1:82\n7#1:83,4\n23#1:90\n23#1:91,2\n50#1:93\n50#1:94,4\n8#1:87\n8#1:88,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.extension.format.TextFormatter */
/* loaded from: classes7.dex */
public final class TextFormatter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final int f84758a;

    /* renamed from: b */
    public final String f84759b;

    /* renamed from: c */
    public final List f84760c;

    /* renamed from: d */
    public final char[] f84761d;

    /* renamed from: e */
    public char f84762e;

    /* renamed from: f */
    public final Regex f84763f;

    /* renamed from: g */
    public final Regex f84764g;

    public TextFormatter(@NotNull String template) {
        Intrinsics.checkNotNullParameter(template, "template");
        this.f84758a = template.length();
        this.f84759b = "#A9";
        char[] charArray = template.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        ArrayList arrayList = new ArrayList(charArray.length);
        int length = charArray.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            if (StringsKt__StringsKt.contains$default((CharSequence) this.f84759b, charArray[i], false, 2, (Object) null)) {
                i2 = 0;
            }
            arrayList.add(Integer.valueOf(i2));
            i++;
            i2 = i3;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) obj).intValue() > 0) {
                arrayList2.add(obj);
            }
        }
        this.f84760c = arrayList2;
        char[] charArray2 = template.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
        this.f84761d = charArray2;
        this.f84762e = charArray2[((Number) arrayList2.get(0)).intValue()];
        this.f84763f = new Regex("[a-zA-Z]");
        this.f84764g = new Regex("[0-9]");
    }

    @NotNull
    public final String delete(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() == 1) {
            return "";
        }
        return text;
    }

    @NotNull
    public final String maskText(@NotNull String text) {
        String component1;
        Intrinsics.checkNotNullParameter(text, "text");
        char[] charArray = text.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        ArrayList arrayList = new ArrayList(charArray.length);
        int length = charArray.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            char c = charArray[i];
            int i4 = i2 + 1;
            int i5 = i2 + i3;
            if (this.f84760c.contains(Integer.valueOf(i5)) && c != this.f84762e) {
                WrapData value = value(String.valueOf(c), i5 + 1, i3);
                component1 = value.component1();
                int component2 = value.component2();
                if (StringExtKt.isNotEmpty(component1)) {
                    i3++;
                    component1 = this.f84762e + component1;
                } else {
                    i3 = component2;
                }
            } else if (!this.f84760c.contains(Integer.valueOf(i5)) && c == this.f84762e) {
                component1 = "";
            } else {
                WrapData value2 = value(String.valueOf(c), i5, i3);
                component1 = value2.component1();
                i3 = value2.component2();
            }
            arrayList.add(component1);
            i++;
            i2 = i4;
        }
        String joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
        int length2 = joinToString$default.length();
        int i6 = this.f84758a;
        if (length2 > i6) {
            String substring = joinToString$default.substring(0, i6);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return joinToString$default;
    }

    @NotNull
    public final String removeMaskText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        char[] charArray = text.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        ArrayList arrayList = new ArrayList();
        for (char c : charArray) {
            if (c != this.f84762e) {
                arrayList.add(Character.valueOf(c));
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    @NotNull
    public final WrapData value(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "char");
        char[] cArr = this.f84761d;
        if (cArr.length == i) {
            return new WrapData("", i2 - 1);
        }
        char c = cArr[i];
        if (c == 'A') {
            if (this.f84763f.matches(str)) {
                String upperCase = str.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                return new WrapData(upperCase, i2);
            }
            return new WrapData("", i2 - 1);
        } else if (c == '9') {
            if (this.f84764g.matches(str)) {
                return new WrapData(str, i2);
            }
            return new WrapData("", i2 - 1);
        } else {
            return new WrapData(str, i2);
        }
    }
}
