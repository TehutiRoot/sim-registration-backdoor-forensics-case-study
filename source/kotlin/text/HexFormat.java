package kotlin.text;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@SinceKotlin(version = "1.9")
@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0004\u001a\u001b\u0019\u001cB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, m28850d2 = {"Lkotlin/text/HexFormat;", "", "", "upperCase", "Lkotlin/text/HexFormat$BytesHexFormat;", "bytes", "Lkotlin/text/HexFormat$NumberHexFormat;", "number", "<init>", "(ZLkotlin/text/HexFormat$BytesHexFormat;Lkotlin/text/HexFormat$NumberHexFormat;)V", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getUpperCase", "()Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/text/HexFormat$BytesHexFormat;", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat;", OperatorName.CURVE_TO, "Lkotlin/text/HexFormat$NumberHexFormat;", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat;", "Companion", "Builder", "BytesHexFormat", "NumberHexFormat", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
@ExperimentalStdlibApi
/* loaded from: classes6.dex */
public final class HexFormat {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: d */
    public static final HexFormat f70507d;

    /* renamed from: e */
    public static final HexFormat f70508e;

    /* renamed from: a */
    public final boolean f70509a;

    /* renamed from: b */
    public final BytesHexFormat f70510b;

    /* renamed from: c */
    public final NumberHexFormat f70511c;

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m28850d2 = {"Lkotlin/text/HexFormat$Builder;", "", "<init>", "()V", "Lkotlin/text/HexFormat;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Lkotlin/text/HexFormat;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getUpperCase", "()Z", "setUpperCase", "(Z)V", "upperCase", "Lkotlin/text/HexFormat$BytesHexFormat$Builder;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "_bytes", "Lkotlin/text/HexFormat$NumberHexFormat$Builder;", OperatorName.CURVE_TO, "Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "_number", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "bytes", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "number", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
    /* loaded from: classes6.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f70512a = HexFormat.Companion.getDefault().getUpperCase();

        /* renamed from: b */
        public BytesHexFormat.Builder f70513b;

        /* renamed from: c */
        public NumberHexFormat.Builder f70514c;

        @PublishedApi
        @NotNull
        public final HexFormat build() {
            BytesHexFormat default$kotlin_stdlib;
            NumberHexFormat default$kotlin_stdlib2;
            boolean z = this.f70512a;
            BytesHexFormat.Builder builder = this.f70513b;
            if (builder == null || (default$kotlin_stdlib = builder.build$kotlin_stdlib()) == null) {
                default$kotlin_stdlib = BytesHexFormat.Companion.getDefault$kotlin_stdlib();
            }
            NumberHexFormat.Builder builder2 = this.f70514c;
            if (builder2 == null || (default$kotlin_stdlib2 = builder2.build$kotlin_stdlib()) == null) {
                default$kotlin_stdlib2 = NumberHexFormat.Companion.getDefault$kotlin_stdlib();
            }
            return new HexFormat(z, default$kotlin_stdlib, default$kotlin_stdlib2);
        }

        @NotNull
        public final BytesHexFormat.Builder getBytes() {
            if (this.f70513b == null) {
                this.f70513b = new BytesHexFormat.Builder();
            }
            BytesHexFormat.Builder builder = this.f70513b;
            Intrinsics.checkNotNull(builder);
            return builder;
        }

        @NotNull
        public final NumberHexFormat.Builder getNumber() {
            if (this.f70514c == null) {
                this.f70514c = new NumberHexFormat.Builder();
            }
            NumberHexFormat.Builder builder = this.f70514c;
            Intrinsics.checkNotNull(builder);
            return builder;
        }

        public final boolean getUpperCase() {
            return this.f70512a;
        }

        public final void setUpperCase(boolean z) {
            this.f70512a = z;
        }
    }

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 $2\u00020\u0001:\u0002%$B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00060\u000ej\u0002`\u000f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\rR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\r¨\u0006&"}, m28850d2 = {"Lkotlin/text/HexFormat$BytesHexFormat;", "", "", "bytesPerLine", "bytesPerGroup", "", "groupSeparator", "byteSeparator", "bytePrefix", "byteSuffix", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "appendOptionsTo$kotlin_stdlib", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "appendOptionsTo", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getBytesPerLine", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getBytesPerGroup", OperatorName.CURVE_TO, "Ljava/lang/String;", "getGroupSeparator", "d", "getByteSeparator", "e", "getBytePrefix", OperatorName.FILL_NON_ZERO, "getByteSuffix", "Companion", "Builder", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
    /* loaded from: classes6.dex */
    public static final class BytesHexFormat {
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* renamed from: g */
        public static final BytesHexFormat f70515g = new BytesHexFormat(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* renamed from: a */
        public final int f70516a;

        /* renamed from: b */
        public final int f70517b;

        /* renamed from: c */
        public final String f70518c;

        /* renamed from: d */
        public final String f70519d;

        /* renamed from: e */
        public final String f70520e;

        /* renamed from: f */
        public final String f70521f;

        @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010 \u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR*\u0010$\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR*\u0010(\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001b¨\u0006)"}, m28850d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "", "<init>", "()V", "Lkotlin/text/HexFormat$BytesHexFormat;", "build$kotlin_stdlib", "()Lkotlin/text/HexFormat$BytesHexFormat;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getBytesPerLine", "()I", "setBytesPerLine", "(I)V", "bytesPerLine", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getBytesPerGroup", "setBytesPerGroup", "bytesPerGroup", "", OperatorName.CURVE_TO, "Ljava/lang/String;", "getGroupSeparator", "()Ljava/lang/String;", "setGroupSeparator", "(Ljava/lang/String;)V", "groupSeparator", "d", "getByteSeparator", "setByteSeparator", "byteSeparator", "e", "getBytePrefix", "setBytePrefix", "bytePrefix", OperatorName.FILL_NON_ZERO, "getByteSuffix", "setByteSuffix", "byteSuffix", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
        /* loaded from: classes6.dex */
        public static final class Builder {

            /* renamed from: a */
            public int f70522a;

            /* renamed from: b */
            public int f70523b;

            /* renamed from: c */
            public String f70524c;

            /* renamed from: d */
            public String f70525d;

            /* renamed from: e */
            public String f70526e;

            /* renamed from: f */
            public String f70527f;

            public Builder() {
                Companion companion = BytesHexFormat.Companion;
                this.f70522a = companion.getDefault$kotlin_stdlib().getBytesPerLine();
                this.f70523b = companion.getDefault$kotlin_stdlib().getBytesPerGroup();
                this.f70524c = companion.getDefault$kotlin_stdlib().getGroupSeparator();
                this.f70525d = companion.getDefault$kotlin_stdlib().getByteSeparator();
                this.f70526e = companion.getDefault$kotlin_stdlib().getBytePrefix();
                this.f70527f = companion.getDefault$kotlin_stdlib().getByteSuffix();
            }

            @NotNull
            public final BytesHexFormat build$kotlin_stdlib() {
                return new BytesHexFormat(this.f70522a, this.f70523b, this.f70524c, this.f70525d, this.f70526e, this.f70527f);
            }

            @NotNull
            public final String getBytePrefix() {
                return this.f70526e;
            }

            @NotNull
            public final String getByteSeparator() {
                return this.f70525d;
            }

            @NotNull
            public final String getByteSuffix() {
                return this.f70527f;
            }

            public final int getBytesPerGroup() {
                return this.f70523b;
            }

            public final int getBytesPerLine() {
                return this.f70522a;
            }

            @NotNull
            public final String getGroupSeparator() {
                return this.f70524c;
            }

            public final void setBytePrefix(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (!StringsKt__StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) value, (char) TokenParser.f74557CR, false, 2, (Object) null)) {
                    this.f70526e = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was " + value);
            }

            public final void setByteSeparator(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (!StringsKt__StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) value, (char) TokenParser.f74557CR, false, 2, (Object) null)) {
                    this.f70525d = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was " + value);
            }

            public final void setByteSuffix(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (!StringsKt__StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) value, (char) TokenParser.f74557CR, false, 2, (Object) null)) {
                    this.f70527f = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was " + value);
            }

            public final void setBytesPerGroup(int i) {
                if (i > 0) {
                    this.f70523b = i;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was " + i);
            }

            public final void setBytesPerLine(int i) {
                if (i > 0) {
                    this.f70522a = i;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was " + i);
            }

            public final void setGroupSeparator(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.f70524c = str;
            }
        }

        @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28850d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Companion;", "", "()V", Constant.OnePostpaidVerifyKey.Default, "Lkotlin/text/HexFormat$BytesHexFormat;", "getDefault$kotlin_stdlib", "()Lkotlin/text/HexFormat$BytesHexFormat;", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0}, m28846xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final BytesHexFormat getDefault$kotlin_stdlib() {
                return BytesHexFormat.f70515g;
            }

            public Companion() {
            }
        }

        public BytesHexFormat(int i, int i2, @NotNull String groupSeparator, @NotNull String byteSeparator, @NotNull String bytePrefix, @NotNull String byteSuffix) {
            Intrinsics.checkNotNullParameter(groupSeparator, "groupSeparator");
            Intrinsics.checkNotNullParameter(byteSeparator, "byteSeparator");
            Intrinsics.checkNotNullParameter(bytePrefix, "bytePrefix");
            Intrinsics.checkNotNullParameter(byteSuffix, "byteSuffix");
            this.f70516a = i;
            this.f70517b = i2;
            this.f70518c = groupSeparator;
            this.f70519d = byteSeparator;
            this.f70520e = bytePrefix;
            this.f70521f = byteSuffix;
        }

        @NotNull
        public final StringBuilder appendOptionsTo$kotlin_stdlib(@NotNull StringBuilder sb, @NotNull String indent) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb.append(indent);
            sb.append("bytesPerLine = ");
            sb.append(this.f70516a);
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append(",");
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append(indent);
            sb.append("bytesPerGroup = ");
            sb.append(this.f70517b);
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append(",");
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append(indent);
            sb.append("groupSeparator = \"");
            sb.append(this.f70518c);
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append(indent);
            sb.append("byteSeparator = \"");
            sb.append(this.f70519d);
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append(indent);
            sb.append("bytePrefix = \"");
            sb.append(this.f70520e);
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append(indent);
            sb.append("byteSuffix = \"");
            sb.append(this.f70521f);
            sb.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            return sb;
        }

        @NotNull
        public final String getBytePrefix() {
            return this.f70520e;
        }

        @NotNull
        public final String getByteSeparator() {
            return this.f70519d;
        }

        @NotNull
        public final String getByteSuffix() {
            return this.f70521f;
        }

        public final int getBytesPerGroup() {
            return this.f70517b;
        }

        public final int getBytesPerLine() {
            return this.f70516a;
        }

        @NotNull
        public final String getGroupSeparator() {
            return this.f70518c;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(");
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            StringBuilder appendOptionsTo$kotlin_stdlib = appendOptionsTo$kotlin_stdlib(sb, "    ");
            appendOptionsTo$kotlin_stdlib.append('\n');
            Intrinsics.checkNotNullExpressionValue(appendOptionsTo$kotlin_stdlib, "append(...)");
            sb.append(")");
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            return sb2;
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m28850d2 = {"Lkotlin/text/HexFormat$Companion;", "", "()V", Constant.OnePostpaidVerifyKey.Default, "Lkotlin/text/HexFormat;", "getDefault", "()Lkotlin/text/HexFormat;", "UpperCase", "getUpperCase", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HexFormat getDefault() {
            return HexFormat.f70507d;
        }

        @NotNull
        public final HexFormat getUpperCase() {
            return HexFormat.f70508e;
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00060\u000bj\u0002`\f2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m28850d2 = {"Lkotlin/text/HexFormat$NumberHexFormat;", "", "", "prefix", "suffix", "", "removeLeadingZeros", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "appendOptionsTo$kotlin_stdlib", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "appendOptionsTo", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPrefix", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getSuffix", OperatorName.CURVE_TO, "Z", "getRemoveLeadingZeros", "()Z", "Companion", "Builder", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
    /* loaded from: classes6.dex */
    public static final class NumberHexFormat {
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* renamed from: d */
        public static final NumberHexFormat f70528d = new NumberHexFormat("", "", false);

        /* renamed from: a */
        public final String f70529a;

        /* renamed from: b */
        public final String f70530b;

        /* renamed from: c */
        public final boolean f70531c;

        @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m28850d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "", "<init>", "()V", "Lkotlin/text/HexFormat$NumberHexFormat;", "build$kotlin_stdlib", "()Lkotlin/text/HexFormat$NumberHexFormat;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPrefix", "()Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", "prefix", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getSuffix", "setSuffix", "suffix", "", OperatorName.CURVE_TO, "Z", "getRemoveLeadingZeros", "()Z", "setRemoveLeadingZeros", "(Z)V", "removeLeadingZeros", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
        /* loaded from: classes6.dex */
        public static final class Builder {

            /* renamed from: a */
            public String f70532a;

            /* renamed from: b */
            public String f70533b;

            /* renamed from: c */
            public boolean f70534c;

            public Builder() {
                Companion companion = NumberHexFormat.Companion;
                this.f70532a = companion.getDefault$kotlin_stdlib().getPrefix();
                this.f70533b = companion.getDefault$kotlin_stdlib().getSuffix();
                this.f70534c = companion.getDefault$kotlin_stdlib().getRemoveLeadingZeros();
            }

            @NotNull
            public final NumberHexFormat build$kotlin_stdlib() {
                return new NumberHexFormat(this.f70532a, this.f70533b, this.f70534c);
            }

            @NotNull
            public final String getPrefix() {
                return this.f70532a;
            }

            public final boolean getRemoveLeadingZeros() {
                return this.f70534c;
            }

            @NotNull
            public final String getSuffix() {
                return this.f70533b;
            }

            public final void setPrefix(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (!StringsKt__StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) value, (char) TokenParser.f74557CR, false, 2, (Object) null)) {
                    this.f70532a = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was " + value);
            }

            public final void setRemoveLeadingZeros(boolean z) {
                this.f70534c = z;
            }

            public final void setSuffix(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (!StringsKt__StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) value, (char) TokenParser.f74557CR, false, 2, (Object) null)) {
                    this.f70533b = value;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was " + value);
            }
        }

        @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28850d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Companion;", "", "()V", Constant.OnePostpaidVerifyKey.Default, "Lkotlin/text/HexFormat$NumberHexFormat;", "getDefault$kotlin_stdlib", "()Lkotlin/text/HexFormat$NumberHexFormat;", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0}, m28846xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final NumberHexFormat getDefault$kotlin_stdlib() {
                return NumberHexFormat.f70528d;
            }

            public Companion() {
            }
        }

        public NumberHexFormat(@NotNull String prefix, @NotNull String suffix, boolean z) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            this.f70529a = prefix;
            this.f70530b = suffix;
            this.f70531c = z;
        }

        @NotNull
        public final StringBuilder appendOptionsTo$kotlin_stdlib(@NotNull StringBuilder sb, @NotNull String indent) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb.append(indent);
            sb.append("prefix = \"");
            sb.append(this.f70529a);
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append(indent);
            sb.append("suffix = \"");
            sb.append(this.f70530b);
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append(indent);
            sb.append("removeLeadingZeros = ");
            sb.append(this.f70531c);
            return sb;
        }

        @NotNull
        public final String getPrefix() {
            return this.f70529a;
        }

        public final boolean getRemoveLeadingZeros() {
            return this.f70531c;
        }

        @NotNull
        public final String getSuffix() {
            return this.f70530b;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(");
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            StringBuilder appendOptionsTo$kotlin_stdlib = appendOptionsTo$kotlin_stdlib(sb, "    ");
            appendOptionsTo$kotlin_stdlib.append('\n');
            Intrinsics.checkNotNullExpressionValue(appendOptionsTo$kotlin_stdlib, "append(...)");
            sb.append(")");
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            return sb2;
        }
    }

    static {
        BytesHexFormat.Companion companion = BytesHexFormat.Companion;
        BytesHexFormat default$kotlin_stdlib = companion.getDefault$kotlin_stdlib();
        NumberHexFormat.Companion companion2 = NumberHexFormat.Companion;
        f70507d = new HexFormat(false, default$kotlin_stdlib, companion2.getDefault$kotlin_stdlib());
        f70508e = new HexFormat(true, companion.getDefault$kotlin_stdlib(), companion2.getDefault$kotlin_stdlib());
    }

    public HexFormat(boolean z, @NotNull BytesHexFormat bytes, @NotNull NumberHexFormat number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f70509a = z;
        this.f70510b = bytes;
        this.f70511c = number;
    }

    @NotNull
    public final BytesHexFormat getBytes() {
        return this.f70510b;
    }

    @NotNull
    public final NumberHexFormat getNumber() {
        return this.f70511c;
    }

    public final boolean getUpperCase() {
        return this.f70509a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("    upperCase = ");
        sb.append(this.f70509a);
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(",");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("    bytes = BytesHexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        StringBuilder appendOptionsTo$kotlin_stdlib = this.f70510b.appendOptionsTo$kotlin_stdlib(sb, "        ");
        appendOptionsTo$kotlin_stdlib.append('\n');
        Intrinsics.checkNotNullExpressionValue(appendOptionsTo$kotlin_stdlib, "append(...)");
        sb.append("    ),");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append("    number = NumberHexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        StringBuilder appendOptionsTo$kotlin_stdlib2 = this.f70511c.appendOptionsTo$kotlin_stdlib(sb, "        ");
        appendOptionsTo$kotlin_stdlib2.append('\n');
        Intrinsics.checkNotNullExpressionValue(appendOptionsTo$kotlin_stdlib2, "append(...)");
        sb.append("    )");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(")");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
