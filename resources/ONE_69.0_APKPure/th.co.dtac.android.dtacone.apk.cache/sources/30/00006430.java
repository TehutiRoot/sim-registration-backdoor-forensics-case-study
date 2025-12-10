package androidx.compose.p003ui.text;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0014\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m29142d2 = {"Landroidx/compose/ui/text/EmojiSupportMatch;", "", "", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "Companion", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.text.EmojiSupportMatch */
/* loaded from: classes2.dex */
public final class EmojiSupportMatch {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final int f31076b = m59059a(0);

    /* renamed from: c */
    public static final int f31077c = m59059a(1);

    /* renamed from: a */
    public final int f31078a;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m29142d2 = {"Landroidx/compose/ui/text/EmojiSupportMatch$Companion;", "", "()V", Constant.OnePostpaidVerifyKey.Default, "Landroidx/compose/ui/text/EmojiSupportMatch;", "getDefault-_3YsG6Y", "()I", "I", "None", "getNone-_3YsG6Y", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.text.EmojiSupportMatch$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDefault-_3YsG6Y  reason: not valid java name */
        public final int m73287getDefault_3YsG6Y() {
            return EmojiSupportMatch.f31076b;
        }

        /* renamed from: getNone-_3YsG6Y  reason: not valid java name */
        public final int m73288getNone_3YsG6Y() {
            return EmojiSupportMatch.f31077c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ EmojiSupportMatch(int i) {
        this.f31078a = i;
    }

    /* renamed from: a */
    public static int m59059a(int i) {
        return i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ EmojiSupportMatch m73281boximpl(int i) {
        return new EmojiSupportMatch(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73282equalsimpl(int i, Object obj) {
        return (obj instanceof EmojiSupportMatch) && i == ((EmojiSupportMatch) obj).m73286unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73283equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73284hashCodeimpl(int i) {
        return i;
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73285toStringimpl(int i) {
        if (i == f31076b) {
            return "EmojiSupportMatch.Default";
        }
        if (i == f31077c) {
            return "EmojiSupportMatch.None";
        }
        return "Invalid(value=" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m73282equalsimpl(this.f31078a, obj);
    }

    public int hashCode() {
        return m73284hashCodeimpl(this.f31078a);
    }

    @NotNull
    public String toString() {
        return m73285toStringimpl(this.f31078a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m73286unboximpl() {
        return this.f31078a;
    }
}