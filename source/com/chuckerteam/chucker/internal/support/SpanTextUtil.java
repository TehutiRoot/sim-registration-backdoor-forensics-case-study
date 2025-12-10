package com.chuckerteam.chucker.internal.support;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.R;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.constant.mixpanel.top_up.TopUpMixpanel;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 $2\u00020\u0001:\u0003%\u000f&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u000b*\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\u00020\b*\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001c\u001a\u0004\u0018\u00010\u000b*\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0014\u0010#\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001e¨\u0006'"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/SpanTextUtil;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "input", "Landroid/text/SpannableStringBuilder;", "spanJson", "(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;", "", "startIndex", "Lkotlin/Pair;", "Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$TokenType;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/CharSequence;I)Lkotlin/Pair;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/CharSequence;I)I", "start", "end", TypedValues.Custom.S_COLOR, "d", "(Landroid/text/SpannableStringBuilder;III)Landroid/text/SpannableStringBuilder;", "tokenIndex", OperatorName.CURVE_TO, "(Landroid/text/SpannableStringBuilder;I)I", "lastTokenType", "e", "(Landroid/text/SpannableStringBuilder;ILcom/chuckerteam/chucker/internal/support/SpanTextUtil$TokenType;)Ljava/lang/Integer;", "I", "jsonKeyColor", "jsonValueColor", "jsonDigitsAndNullValueColor", "jsonSignElementsColor", "jsonBooleanColor", OperatorName.FILL_NON_ZERO, "ChuckerForegroundColorSpan", "TokenType", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class SpanTextUtil {

    /* renamed from: f */
    public static final C5975a f42973f = new C5975a(null);

    /* renamed from: a */
    public final int f42974a;

    /* renamed from: b */
    public final int f42975b;

    /* renamed from: c */
    public final int f42976c;

    /* renamed from: d */
    public final int f42977d;

    /* renamed from: e */
    public final int f42978e;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$ChuckerForegroundColorSpan;", "Landroid/text/style/ForegroundColorSpan;", TypedValues.Custom.S_COLOR, "", "(I)V", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class ChuckerForegroundColorSpan extends ForegroundColorSpan {
        public ChuckerForegroundColorSpan(int i) {
            super(i);
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$TokenType;", "", "delimiters", "", "", "(Ljava/lang/String;ILjava/util/Set;)V", "getDelimiters", "()Ljava/util/Set;", "STRING", "ARRAY", "OBJECT", "KEY_SEPARATOR", "VALUE_SEPARATOR", "BOOLEAN", TopUpMixpanel.OFFER_NONE, "Companion", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nSpanTextUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanTextUtil.kt\ncom/chuckerteam/chucker/internal/support/SpanTextUtil$TokenType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,188:1\n11335#2:189\n11670#2,3:190\n*S KotlinDebug\n*F\n+ 1 SpanTextUtil.kt\ncom/chuckerteam/chucker/internal/support/SpanTextUtil$TokenType\n*L\n44#1:189\n44#1:190,3\n*E\n"})
    /* loaded from: classes3.dex */
    public enum TokenType {
        STRING(CG1.setOf(OperatorName.SHOW_TEXT_LINE_AND_SPACE)),
        ARRAY(DG1.setOf((Object[]) new String[]{"[", "]"})),
        OBJECT(DG1.setOf((Object[]) new String[]{"{", "}"})),
        KEY_SEPARATOR(CG1.setOf(":")),
        VALUE_SEPARATOR(CG1.setOf(",")),
        BOOLEAN(DG1.setOf((Object[]) new String[]{"true", "false"})),
        NONE(DG1.emptySet());
        
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private static final Set<String> allPossibleTokens;
        @NotNull
        private final Set<String> delimiters;

        @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$TokenType$Companion;", "", "()V", "allPossibleTokens", "", "", "getAllPossibleTokens", "()Ljava/util/Set;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Set<String> getAllPossibleTokens() {
                return TokenType.allPossibleTokens;
            }

            public Companion() {
            }
        }

        static {
            TokenType[] values = values();
            ArrayList arrayList = new ArrayList(values.length);
            for (TokenType tokenType : values) {
                arrayList.add(tokenType.delimiters);
            }
            allPossibleTokens = CollectionsKt___CollectionsKt.toSet(AbstractC10176es.flatten(arrayList));
        }

        TokenType(Set set) {
            this.delimiters = set;
        }

        @NotNull
        public final Set<String> getDelimiters() {
            return this.delimiters;
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TokenType.values().length];
            try {
                iArr[TokenType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TokenType.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TokenType.OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TokenType.KEY_SEPARATOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TokenType.VALUE_SEPARATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TokenType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TokenType.NONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.chuckerteam.chucker.internal.support.SpanTextUtil$a */
    /* loaded from: classes3.dex */
    public static final class C5975a {
        public /* synthetic */ C5975a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C5975a() {
        }
    }

    public SpanTextUtil(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42974a = ContextCompat.getColor(context, R.color.chucker_json_key_color);
        this.f42975b = ContextCompat.getColor(context, R.color.chucker_json_value_color);
        this.f42976c = ContextCompat.getColor(context, R.color.chucker_json_digit_and_null_value_color);
        this.f42977d = ContextCompat.getColor(context, R.color.chucker_json_elements_color);
        this.f42978e = ContextCompat.getColor(context, R.color.chucker_json_boolean_color);
    }

    /* renamed from: a */
    public final Pair m49899a(CharSequence charSequence, int i) {
        Pair<Integer, String> findAnyOf = StringsKt__StringsKt.findAnyOf(charSequence, TokenType.Companion.getAllPossibleTokens(), i, true);
        if (findAnyOf == null) {
            return TuplesKt.m28844to(-1, TokenType.NONE);
        }
        int intValue = findAnyOf.component1().intValue();
        String component2 = findAnyOf.component2();
        TokenType tokenType = TokenType.ARRAY;
        if (!tokenType.getDelimiters().contains(component2)) {
            tokenType = TokenType.OBJECT;
            if (!tokenType.getDelimiters().contains(component2)) {
                tokenType = TokenType.KEY_SEPARATOR;
                if (!tokenType.getDelimiters().contains(component2)) {
                    tokenType = TokenType.VALUE_SEPARATOR;
                    if (!tokenType.getDelimiters().contains(component2)) {
                        tokenType = TokenType.STRING;
                        if (!tokenType.getDelimiters().contains(component2)) {
                            tokenType = TokenType.BOOLEAN;
                            if (!tokenType.getDelimiters().contains(component2)) {
                                tokenType = null;
                            }
                        }
                    }
                }
            }
        }
        if (tokenType != null) {
            return TuplesKt.m28844to(Integer.valueOf(intValue), tokenType);
        }
        return TuplesKt.m28844to(-1, TokenType.NONE);
    }

    /* renamed from: b */
    public final int m49898b(CharSequence charSequence, int i) {
        int indexOf$default = StringsKt__StringsKt.indexOf$default(charSequence, '\"', i, false, 4, (Object) null);
        while (indexOf$default < charSequence.length()) {
            if (charSequence.charAt(indexOf$default) == '\"' && (indexOf$default == 0 || charSequence.charAt(indexOf$default - 1) != '\\')) {
                return indexOf$default;
            }
            indexOf$default = StringsKt__StringsKt.indexOf$default(charSequence, '\"', indexOf$default + 1, false, 4, (Object) null);
        }
        return -1;
    }

    /* renamed from: c */
    public final int m49897c(SpannableStringBuilder spannableStringBuilder, int i) {
        int i2;
        if (AbstractC5403bp.equals(spannableStringBuilder.charAt(i), 't', true)) {
            i2 = i + 4;
        } else {
            i2 = i + 5;
        }
        m49896d(spannableStringBuilder, i, i2, this.f42978e);
        return i2;
    }

    /* renamed from: d */
    public final SpannableStringBuilder m49896d(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        spannableStringBuilder.setSpan(new ChuckerForegroundColorSpan(i3), i, i2, 18);
        return spannableStringBuilder;
    }

    /* renamed from: e */
    public final Integer m49895e(SpannableStringBuilder spannableStringBuilder, int i, TokenType tokenType) {
        int i2;
        int i3;
        int i4 = -1;
        if (tokenType == null) {
            i2 = -1;
        } else {
            i2 = WhenMappings.$EnumSwitchMapping$0[tokenType.ordinal()];
        }
        if (i2 != -1 && i2 != 5 && i2 != 7 && i2 != 2 && i2 != 3) {
            i3 = this.f42975b;
        } else {
            i3 = this.f42974a;
        }
        try {
            i4 = m49898b(spannableStringBuilder, i + 1);
        } catch (Exception unused) {
        }
        if (i4 < i) {
            return null;
        }
        m49896d(spannableStringBuilder, i, i4 + 1, i3);
        return Integer.valueOf(i4);
    }

    @NotNull
    public final SpannableStringBuilder spanJson(@NotNull CharSequence input) {
        int m49897c;
        Intrinsics.checkNotNullParameter(input, "input");
        String formatJson = FormatUtils.INSTANCE.formatJson(input.toString());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatJson);
        int i = 0;
        m49896d(spannableStringBuilder, 0, formatJson.length(), this.f42976c);
        TokenType tokenType = null;
        while (i < formatJson.length()) {
            Pair m49899a = m49899a(formatJson, i);
            int intValue = ((Number) m49899a.component1()).intValue();
            TokenType tokenType2 = (TokenType) m49899a.component2();
            switch (WhenMappings.$EnumSwitchMapping$0[tokenType2.ordinal()]) {
                case 1:
                    m49897c = m49897c(spannableStringBuilder, intValue);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    m49897c = intValue + 1;
                    m49896d(spannableStringBuilder, intValue, m49897c, this.f42977d);
                    break;
                case 6:
                    Integer m49895e = m49895e(spannableStringBuilder, intValue, tokenType);
                    if (m49895e != null) {
                        m49897c = m49895e.intValue() + 1;
                        break;
                    } else {
                        return spannableStringBuilder;
                    }
                case 7:
                    return spannableStringBuilder;
                default:
                    tokenType = tokenType2;
            }
            i = m49897c;
            tokenType = tokenType2;
        }
        return spannableStringBuilder;
    }
}
