package androidx.compose.p003ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p003ui.text.font.Font;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontListFontFamily;
import androidx.compose.p003ui.text.font.FontMatcher;
import androidx.compose.p003ui.text.font.FontSynthesis_androidKt;
import androidx.compose.p003ui.text.font.FontWeight;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "This is not supported after downloadable fonts.")
@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001\u0017BB\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00130\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006&"}, m28850d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "fontFamily", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lkotlin/Pair;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "necessaryStyles", "Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher", "<init>", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroid/content/Context;Ljava/util/List;Landroidx/compose/ui/text/font/FontMatcher;)V", "fontWeight", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", "Landroid/graphics/Typeface;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getNativeTypeface", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "", "Landroidx/compose/ui/text/font/Font;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/Map;", "loadedTypefaces", "Landroidx/compose/ui/text/font/FontFamily;", OperatorName.CURVE_TO, "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "d", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,173:1\n35#2,3:174\n38#2,2:181\n40#2:184\n56#2,4:196\n60#2,3:204\n63#2:208\n33#3,4:177\n38#3:183\n151#3,3:185\n33#3,4:188\n154#3,2:192\n38#3:194\n156#3:195\n33#3,4:200\n38#3:207\n33#3,6:209\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n*L\n66#1:174,3\n66#1:181,2\n66#1:184\n71#1:196,4\n71#1:204,3\n71#1:208\n66#1:177,4\n66#1:183\n69#1:185,3\n69#1:188,4\n69#1:192,2\n69#1:194\n69#1:195\n71#1:200,4\n71#1:207\n79#1:209,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.AndroidFontListTypeface */
/* loaded from: classes2.dex */
public final class AndroidFontListTypeface implements AndroidTypeface {

    /* renamed from: d */
    public static final C3626a f31475d = new C3626a(null);

    /* renamed from: e */
    public static final FontMatcher f31476e = new FontMatcher();

    /* renamed from: a */
    public final FontMatcher f31477a;

    /* renamed from: b */
    public final Map f31478b;

    /* renamed from: c */
    public final FontFamily f31479c;

    /* renamed from: androidx.compose.ui.text.platform.AndroidFontListTypeface$a */
    /* loaded from: classes2.dex */
    public static final class C3626a {
        public /* synthetic */ C3626a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C3626a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AndroidFontListTypeface(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.font.FontListFontFamily r8, @org.jetbrains.annotations.NotNull android.content.Context r9, @org.jetbrains.annotations.Nullable java.util.List<kotlin.Pair<androidx.compose.p003ui.text.font.FontWeight, androidx.compose.p003ui.text.font.FontStyle>> r10, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.font.FontMatcher r11) {
        /*
            r7 = this;
            java.lang.String r0 = "fontFamily"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "fontMatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r7.<init>()
            r7.f31477a = r11
            java.util.List r11 = r8.getFonts()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            int r1 = r11.size()
            r2 = 0
            r3 = 0
        L27:
            if (r3 >= r1) goto L46
            java.lang.Object r4 = r11.get(r3)
            r5 = r4
            androidx.compose.ui.text.font.Font r5 = (androidx.compose.p003ui.text.font.Font) r5
            int r5 = r5.mo73258getLoadingStrategyPKNRLFQ()
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r6 = androidx.compose.p003ui.text.font.FontLoadingStrategy.Companion
            int r6 = r6.m73303getBlockingPKNRLFQ()
            boolean r5 = androidx.compose.p003ui.text.font.FontLoadingStrategy.m73298equalsimpl0(r5, r6)
            if (r5 == 0) goto L43
            r0.add(r4)
        L43:
            int r3 = r3 + 1
            goto L27
        L46:
            if (r10 == 0) goto Lb2
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = r10.size()
            r11.<init>(r1)
            int r1 = r10.size()
            r3 = 0
        L56:
            if (r3 >= r1) goto L80
            java.lang.Object r4 = r10.get(r3)
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.component1()
            androidx.compose.ui.text.font.FontWeight r5 = (androidx.compose.p003ui.text.font.FontWeight) r5
            java.lang.Object r4 = r4.component2()
            androidx.compose.ui.text.font.FontStyle r4 = (androidx.compose.p003ui.text.font.FontStyle) r4
            int r4 = r4.m73314unboximpl()
            androidx.compose.ui.text.font.FontMatcher r6 = r7.f31477a
            java.util.List r4 = r6.m73307matchFontRetOiIg(r0, r5, r4)
            java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.firstOrNull(r4)
            androidx.compose.ui.text.font.Font r4 = (androidx.compose.p003ui.text.font.Font) r4
            r11.add(r4)
            int r3 = r3 + 1
            goto L56
        L80:
            java.util.List r10 = androidx.compose.p003ui.text.TempListUtilsKt.fastFilterNotNull(r11)
            if (r10 == 0) goto Lb2
            java.util.HashSet r11 = new java.util.HashSet
            int r1 = r10.size()
            r11.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r10.size()
            r1.<init>(r3)
            int r3 = r10.size()
            r4 = 0
        L9d:
            if (r4 >= r3) goto Lb3
            java.lang.Object r5 = r10.get(r4)
            r6 = r5
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.p003ui.text.font.Font) r6
            boolean r6 = r11.add(r6)
            if (r6 == 0) goto Laf
            r1.add(r5)
        Laf:
            int r4 = r4 + 1
            goto L9d
        Lb2:
            r1 = 0
        Lb3:
            if (r1 != 0) goto Lb6
            goto Lb7
        Lb6:
            r0 = r1
        Lb7:
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto Lf6
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            int r11 = r0.size()
        Lc6:
            if (r2 >= r11) goto Lf1
            java.lang.Object r1 = r0.get(r2)
            androidx.compose.ui.text.font.Font r1 = (androidx.compose.p003ui.text.font.Font) r1
            androidx.compose.ui.text.platform.AndroidTypefaceCache r3 = androidx.compose.p003ui.text.platform.AndroidTypefaceCache.INSTANCE     // Catch: java.lang.Exception -> Lda
            android.graphics.Typeface r3 = r3.getOrCreate(r9, r1)     // Catch: java.lang.Exception -> Lda
            r10.put(r1, r3)     // Catch: java.lang.Exception -> Lda
            int r2 = r2 + 1
            goto Lc6
        Lda:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Cannot create Typeface from "
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lf1:
            r7.f31478b = r10
            r7.f31479c = r8
            return
        Lf6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Could not match font"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.text.platform.AndroidFontListTypeface.<init>(androidx.compose.ui.text.font.FontListFontFamily, android.content.Context, java.util.List, androidx.compose.ui.text.font.FontMatcher):void");
    }

    @Override // androidx.compose.p003ui.text.font.Typeface
    @NotNull
    public FontFamily getFontFamily() {
        return this.f31479c;
    }

    @NotNull
    public final FontMatcher getFontMatcher() {
        return this.f31477a;
    }

    @Override // androidx.compose.p003ui.text.platform.AndroidTypeface
    @NotNull
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo73428getNativeTypefacePYhJU0U(@NotNull FontWeight fontWeight, int i, int i2) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Font font = (Font) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) this.f31477a.m73307matchFontRetOiIg(new ArrayList(this.f31478b.keySet()), fontWeight, i));
        if (font != null) {
            Typeface typeface = (Typeface) this.f31478b.get(font);
            if (typeface != null) {
                Object m73330synthesizeTypefaceFxwP2eA = FontSynthesis_androidKt.m73330synthesizeTypefaceFxwP2eA(i2, typeface, font, fontWeight, i);
                Intrinsics.checkNotNull(m73330synthesizeTypefaceFxwP2eA, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) m73330synthesizeTypefaceFxwP2eA;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalStateException("Could not load font");
    }

    public /* synthetic */ AndroidFontListTypeface(FontListFontFamily fontListFontFamily, Context context, List list, FontMatcher fontMatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontListFontFamily, context, (i & 4) != 0 ? null : list, (i & 8) != 0 ? f31476e : fontMatcher);
    }
}
