package androidx.compose.p003ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, m28850d2 = {"Landroidx/compose/ui/text/font/FontWeight;", "", "", "weight", "<init>", "(I)V", "other", "compareTo", "(Landroidx/compose/ui/text/font/FontWeight;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getWeight", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.font.FontWeight */
/* loaded from: classes2.dex */
public final class FontWeight implements Comparable<FontWeight> {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final FontWeight f31305b;

    /* renamed from: c */
    public static final FontWeight f31306c;

    /* renamed from: d */
    public static final FontWeight f31307d;

    /* renamed from: e */
    public static final FontWeight f31308e;

    /* renamed from: f */
    public static final FontWeight f31309f;

    /* renamed from: g */
    public static final FontWeight f31310g;

    /* renamed from: h */
    public static final FontWeight f31311h;

    /* renamed from: i */
    public static final FontWeight f31312i;

    /* renamed from: j */
    public static final FontWeight f31313j;

    /* renamed from: k */
    public static final FontWeight f31314k;

    /* renamed from: l */
    public static final FontWeight f31315l;

    /* renamed from: m */
    public static final FontWeight f31316m;

    /* renamed from: n */
    public static final FontWeight f31317n;

    /* renamed from: o */
    public static final FontWeight f31318o;

    /* renamed from: p */
    public static final FontWeight f31319p;

    /* renamed from: q */
    public static final FontWeight f31320q;

    /* renamed from: r */
    public static final FontWeight f31321r;

    /* renamed from: s */
    public static final FontWeight f31322s;

    /* renamed from: t */
    public static final List f31323t;

    /* renamed from: a */
    public final int f31324a;

    @Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007R\u001c\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0007R\u001c\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0007R\u001c\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0007R\u001c\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0007R\u001c\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0007R\u001c\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0007R\u001c\u0010)\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010\u0007R\u001c\u0010,\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010\u0007R\u001c\u0010/\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0007R\u001c\u00102\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0007R\u001c\u00105\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\u0007R\u001c\u00108\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\u0007R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040<X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>¨\u0006?"}, m28850d2 = {"Landroidx/compose/ui/text/font/FontWeight$Companion;", "", "()V", "Black", "Landroidx/compose/ui/text/font/FontWeight;", "getBlack$annotations", "getBlack", "()Landroidx/compose/ui/text/font/FontWeight;", "Bold", "getBold$annotations", "getBold", "ExtraBold", "getExtraBold$annotations", "getExtraBold", "ExtraLight", "getExtraLight$annotations", "getExtraLight", "Light", "getLight$annotations", "getLight", "Medium", "getMedium$annotations", "getMedium", PDLayoutAttributeObject.LINE_HEIGHT_NORMAL, "getNormal$annotations", "getNormal", "SemiBold", "getSemiBold$annotations", "getSemiBold", "Thin", "getThin$annotations", "getThin", "W100", "getW100$annotations", "getW100", "W200", "getW200$annotations", "getW200", "W300", "getW300$annotations", "getW300", "W400", "getW400$annotations", "getW400", "W500", "getW500$annotations", "getW500", "W600", "getW600$annotations", "getW600", "W700", "getW700$annotations", "getW700", "W800", "getW800$annotations", "getW800", "W900", "getW900$annotations", "getW900", "values", "", "getValues$ui_text_release", "()Ljava/util/List;", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.text.font.FontWeight$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        public static /* synthetic */ void getBlack$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getExtraBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getExtraLight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getLight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getMedium$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNormal$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSemiBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getThin$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW100$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW200$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW300$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW400$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW500$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW600$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW700$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW800$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW900$annotations() {
        }

        @NotNull
        public final FontWeight getBlack() {
            return FontWeight.f31322s;
        }

        @NotNull
        public final FontWeight getBold() {
            return FontWeight.f31320q;
        }

        @NotNull
        public final FontWeight getExtraBold() {
            return FontWeight.f31321r;
        }

        @NotNull
        public final FontWeight getExtraLight() {
            return FontWeight.f31315l;
        }

        @NotNull
        public final FontWeight getLight() {
            return FontWeight.f31316m;
        }

        @NotNull
        public final FontWeight getMedium() {
            return FontWeight.f31318o;
        }

        @NotNull
        public final FontWeight getNormal() {
            return FontWeight.f31317n;
        }

        @NotNull
        public final FontWeight getSemiBold() {
            return FontWeight.f31319p;
        }

        @NotNull
        public final FontWeight getThin() {
            return FontWeight.f31314k;
        }

        @NotNull
        public final List<FontWeight> getValues$ui_text_release() {
            return FontWeight.f31323t;
        }

        @NotNull
        public final FontWeight getW100() {
            return FontWeight.f31305b;
        }

        @NotNull
        public final FontWeight getW200() {
            return FontWeight.f31306c;
        }

        @NotNull
        public final FontWeight getW300() {
            return FontWeight.f31307d;
        }

        @NotNull
        public final FontWeight getW400() {
            return FontWeight.f31308e;
        }

        @NotNull
        public final FontWeight getW500() {
            return FontWeight.f31309f;
        }

        @NotNull
        public final FontWeight getW600() {
            return FontWeight.f31310g;
        }

        @NotNull
        public final FontWeight getW700() {
            return FontWeight.f31311h;
        }

        @NotNull
        public final FontWeight getW800() {
            return FontWeight.f31312i;
        }

        @NotNull
        public final FontWeight getW900() {
            return FontWeight.f31313j;
        }

        public Companion() {
        }
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        f31305b = fontWeight;
        FontWeight fontWeight2 = new FontWeight(200);
        f31306c = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(300);
        f31307d = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(400);
        f31308e = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        f31309f = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        f31310g = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        f31311h = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        f31312i = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        f31313j = fontWeight9;
        f31314k = fontWeight;
        f31315l = fontWeight2;
        f31316m = fontWeight3;
        f31317n = fontWeight4;
        f31318o = fontWeight5;
        f31319p = fontWeight6;
        f31320q = fontWeight7;
        f31321r = fontWeight8;
        f31322s = fontWeight9;
        f31323t = CollectionsKt__CollectionsKt.listOf((Object[]) new FontWeight[]{fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9});
    }

    public FontWeight(int i) {
        this.f31324a = i;
        if (1 <= i && i < 1001) {
            return;
        }
        throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i).toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FontWeight) && this.f31324a == ((FontWeight) obj).f31324a) {
            return true;
        }
        return false;
    }

    public final int getWeight() {
        return this.f31324a;
    }

    public int hashCode() {
        return this.f31324a;
    }

    @NotNull
    public String toString() {
        return "FontWeight(weight=" + this.f31324a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull FontWeight other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.f31324a, other.f31324a);
    }
}
