package com.chuckerteam.chucker.internal.support;

import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Regex;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0010\u001a9\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a=\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m29142d2 = {"Landroid/text/SpannableStringBuilder;", "", FirebaseAnalytics.Event.SEARCH, "", "", "startIndices", "backgroundColor", "foregroundColor", "highlightWithDefinedColors", "(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/util/List;II)Landroid/text/SpannableStringBuilder;", "", "input", "indicesOf", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/util/List;", "startIndex", "highlightWithDefinedColorsSubstring", "(Landroid/text/SpannableStringBuilder;Ljava/lang/String;III)Landroid/text/SpannableStringBuilder;", TextBundle.TEXT_ENTRY, "subStringStartPosition", "subStringLength", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/text/SpannableStringBuilder;IIII)Landroid/text/SpannableStringBuilder;", "indexes", "length", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/text/SpannableStringBuilder;Ljava/util/List;III)Landroid/text/SpannableStringBuilder;", "com.github.ChuckerTeam.Chucker.library"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSearchHighlightUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchHighlightUtil.kt\ncom/chuckerteam/chucker/internal/support/SearchHighlightUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n1855#2,2:82\n*S KotlinDebug\n*F\n+ 1 SearchHighlightUtil.kt\ncom/chuckerteam/chucker/internal/support/SearchHighlightUtilKt\n*L\n76#1:82,2\n*E\n"})
/* loaded from: classes3.dex */
public final class SearchHighlightUtilKt {
    /* renamed from: a */
    public static final SpannableStringBuilder m49898a(SpannableStringBuilder spannableStringBuilder, List list, int i, int i2, int i3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m49897b(spannableStringBuilder, ((Number) it.next()).intValue(), i, i2, i3);
        }
        return spannableStringBuilder;
    }

    /* renamed from: b */
    public static final SpannableStringBuilder m49897b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i5, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i, i5, 33);
        spannableStringBuilder.setSpan(new BackgroundColorSpan(i3), i, i5, 33);
        return spannableStringBuilder;
    }

    @NotNull
    public static final SpannableStringBuilder highlightWithDefinedColors(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull String search, @NotNull List<Integer> startIndices, int i, int i2) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(search, "search");
        Intrinsics.checkNotNullParameter(startIndices, "startIndices");
        return m49898a(spannableStringBuilder, startIndices, search.length(), i, i2);
    }

    @NotNull
    public static final SpannableStringBuilder highlightWithDefinedColorsSubstring(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull String search, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(search, "search");
        return m49897b(spannableStringBuilder, i, search.length(), i2, i3);
    }

    @NotNull
    public static final List<Integer> indicesOf(@NotNull CharSequence charSequence, @NotNull String input) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Pattern compile = Pattern.compile(input, 2);
        Intrinsics.checkNotNullExpressionValue(compile, "compile(input, Pattern.CASE_INSENSITIVE)");
        return (List) SequencesKt___SequencesKt.toCollection(SequencesKt___SequencesKt.map(Regex.findAll$default(new Regex(compile), charSequence, 0, 2, null), SearchHighlightUtilKt$indicesOf$1.INSTANCE), new ArrayList());
    }
}