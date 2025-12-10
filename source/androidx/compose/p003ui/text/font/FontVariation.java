package androidx.compose.p003ui.text.font;

import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.configuration.tracker.TrackerConstant;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\t!\"# B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\fJ\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\fJ\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J7\u0010 \u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001b\"\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, m28850d2 = {"Landroidx/compose/ui/text/font/FontVariation;", "", "<init>", "()V", "", "name", "", "value", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "Setting", "(Ljava/lang/String;F)Landroidx/compose/ui/text/font/FontVariation$Setting;", "italic", "(F)Landroidx/compose/ui/text/font/FontVariation$Setting;", "Landroidx/compose/ui/unit/TextUnit;", "textSize", "opticalSizing--R2X_6o", "(J)Landroidx/compose/ui/text/font/FontVariation$Setting;", "opticalSizing", "slant", "width", "", "weight", "(I)Landroidx/compose/ui/text/font/FontVariation$Setting;", "grade", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "style", "", "settings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Settings-6EWAqTQ", "(Landroidx/compose/ui/text/font/FontWeight;I[Landroidx/compose/ui/text/font/FontVariation$Setting;)Landroidx/compose/ui/text/font/FontVariation$Settings;", TrackerConstant.SETTINGS, PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.font.FontVariation */
/* loaded from: classes2.dex */
public final class FontVariation {
    public static final int $stable = 0;
    @NotNull
    public static final FontVariation INSTANCE = new FontVariation();

    @Immutable
    @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u000f\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m28850d2 = {"Landroidx/compose/ui/text/font/FontVariation$Setting;", "", "Landroidx/compose/ui/unit/Density;", "density", "", "toVariationValue", "(Landroidx/compose/ui/unit/Density;)F", "", "getNeedsDensity", "()Z", "needsDensity", "", "getAxisName", "()Ljava/lang/String;", "axisName", "Landroidx/compose/ui/text/font/FontVariation$a;", "Landroidx/compose/ui/text/font/FontVariation$b;", "Landroidx/compose/ui/text/font/FontVariation$c;", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.text.font.FontVariation$Setting */
    /* loaded from: classes2.dex */
    public interface Setting {
        @NotNull
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(@Nullable Density density);
    }

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m28850d2 = {"Landroidx/compose/ui/text/font/FontVariation$Settings;", "", "", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "settings", "<init>", "([Landroidx/compose/ui/text/font/FontVariation$Setting;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getSettings", "()Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "getNeedsDensity$ui_text_release", "()Z", "needsDensity", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @Immutable
    @SourceDebugExtension({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,372:1\n10783#2:373\n11008#2,3:374\n11011#2,3:384\n361#3,7:377\n76#4:387\n96#4,5:388\n101#5,2:393\n33#5,6:395\n103#5:401\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n*L\n52#1:373\n52#1:374,3\n52#1:384,3\n52#1:377,7\n53#1:387\n53#1:388,5\n60#1:393,2\n60#1:395,6\n60#1:401\n*E\n"})
    /* renamed from: androidx.compose.ui.text.font.FontVariation$Settings */
    /* loaded from: classes2.dex */
    public static final class Settings {
        public static final int $stable = 0;

        /* renamed from: a */
        public final List f31294a;

        /* renamed from: b */
        public final boolean f31295b;

        public Settings(@NotNull Setting... settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z = false;
            for (Setting setting : settings) {
                String axisName = setting.getAxisName();
                Object obj = linkedHashMap.get(axisName);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(axisName, obj);
                }
                ((List) obj).add(setting);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() == 1) {
                    AbstractC10410hs.addAll(arrayList, list);
                } else {
                    throw new IllegalArgumentException((CoreConstants.SINGLE_QUOTE_CHAR + str + "' must be unique. Actual [ [" + CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63, null) + AbstractJsonLexerKt.END_LIST).toString());
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.f31294a = arrayList2;
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (((Setting) arrayList2.get(i)).getNeedsDensity()) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            this.f31295b = z;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Settings) && Intrinsics.areEqual(this.f31294a, ((Settings) obj).f31294a)) {
                return true;
            }
            return false;
        }

        public final boolean getNeedsDensity$ui_text_release() {
            return this.f31295b;
        }

        @NotNull
        public final List<Setting> getSettings() {
            return this.f31294a;
        }

        public int hashCode() {
            return this.f31294a.hashCode();
        }
    }

    /* renamed from: androidx.compose.ui.text.font.FontVariation$a */
    /* loaded from: classes2.dex */
    public static final class C3613a implements Setting {

        /* renamed from: a */
        public final String f31296a;

        /* renamed from: b */
        public final float f31297b;

        /* renamed from: c */
        public final boolean f31298c;

        public C3613a(String axisName, float f) {
            Intrinsics.checkNotNullParameter(axisName, "axisName");
            this.f31296a = axisName;
            this.f31297b = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3613a)) {
                return false;
            }
            C3613a c3613a = (C3613a) obj;
            if (Intrinsics.areEqual(getAxisName(), c3613a.getAxisName()) && this.f31297b == c3613a.f31297b) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.p003ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.f31296a;
        }

        @Override // androidx.compose.p003ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.f31298c;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + Float.floatToIntBits(this.f31297b);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.f31297b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // androidx.compose.p003ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.f31297b;
        }
    }

    /* renamed from: androidx.compose.ui.text.font.FontVariation$b */
    /* loaded from: classes2.dex */
    public static final class C3614b implements Setting {

        /* renamed from: a */
        public final String f31299a;

        /* renamed from: b */
        public final int f31300b;

        /* renamed from: c */
        public final boolean f31301c;

        public C3614b(String axisName, int i) {
            Intrinsics.checkNotNullParameter(axisName, "axisName");
            this.f31299a = axisName;
            this.f31300b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3614b)) {
                return false;
            }
            C3614b c3614b = (C3614b) obj;
            if (Intrinsics.areEqual(getAxisName(), c3614b.getAxisName()) && this.f31300b == c3614b.f31300b) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.p003ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.f31299a;
        }

        @Override // androidx.compose.p003ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.f31301c;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + this.f31300b;
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.f31300b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // androidx.compose.p003ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.f31300b;
        }
    }

    /* renamed from: androidx.compose.ui.text.font.FontVariation$c */
    /* loaded from: classes2.dex */
    public static final class C3615c implements Setting {

        /* renamed from: a */
        public final String f31302a;

        /* renamed from: b */
        public final long f31303b;

        /* renamed from: c */
        public final boolean f31304c;

        public /* synthetic */ C3615c(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3615c)) {
                return false;
            }
            C3615c c3615c = (C3615c) obj;
            if (Intrinsics.areEqual(getAxisName(), c3615c.getAxisName()) && TextUnit.m73836equalsimpl0(this.f31303b, c3615c.f31303b)) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.p003ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.f31302a;
        }

        @Override // androidx.compose.p003ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.f31304c;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + TextUnit.m73840hashCodeimpl(this.f31303b);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + ((Object) TextUnit.m73846toStringimpl(this.f31303b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // androidx.compose.p003ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            if (density != null) {
                return TextUnit.m73839getValueimpl(this.f31303b) * density.getFontScale();
            }
            throw new IllegalArgumentException("density must not be null".toString());
        }

        public C3615c(String axisName, long j) {
            Intrinsics.checkNotNullParameter(axisName, "axisName");
            this.f31302a = axisName;
            this.f31303b = j;
            this.f31304c = true;
        }
    }

    @NotNull
    public final Setting Setting(@NotNull String name, float f) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.length() == 4) {
            return new C3613a(name, f);
        }
        throw new IllegalArgumentException(("Name must be exactly four characters. Actual: '" + name + CoreConstants.SINGLE_QUOTE_CHAR).toString());
    }

    @NotNull
    /* renamed from: Settings-6EWAqTQ  reason: not valid java name */
    public final Settings m73331Settings6EWAqTQ(@NotNull FontWeight weight, int i, @NotNull Setting... settings) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(settings, "settings");
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.add(weight(weight.getWeight()));
        spreadBuilder.add(italic(i));
        spreadBuilder.addSpread(settings);
        return new Settings((Setting[]) spreadBuilder.toArray(new Setting[spreadBuilder.size()]));
    }

    @NotNull
    public final Setting grade(int i) {
        if (-1000 <= i && i < 1001) {
            return new C3614b("GRAD", i);
        }
        throw new IllegalArgumentException("'GRAD' must be in -1000..1000".toString());
    }

    @NotNull
    public final Setting italic(float f) {
        if (0.0f <= f && f <= 1.0f) {
            return new C3613a("ital", f);
        }
        throw new IllegalArgumentException(("'ital' must be in 0.0f..1.0f. Actual: " + f).toString());
    }

    @NotNull
    /* renamed from: opticalSizing--R2X_6o  reason: not valid java name */
    public final Setting m73332opticalSizingR2X_6o(long j) {
        if (TextUnit.m73842isSpimpl(j)) {
            return new C3615c("opsz", j, null);
        }
        throw new IllegalArgumentException("'opsz' must be provided in sp units".toString());
    }

    @NotNull
    public final Setting slant(float f) {
        if (-90.0f <= f && f <= 90.0f) {
            return new C3613a("slnt", f);
        }
        throw new IllegalArgumentException(("'slnt' must be in -90f..90f. Actual: " + f).toString());
    }

    @NotNull
    public final Setting weight(int i) {
        if (1 <= i && i < 1001) {
            return new C3614b("wght", i);
        }
        throw new IllegalArgumentException(("'wght' value must be in [1, 1000]. Actual: " + i).toString());
    }

    @NotNull
    public final Setting width(float f) {
        if (f > 0.0f) {
            return new C3613a("wdth", f);
        }
        throw new IllegalArgumentException(("'wdth' must be strictly > 0.0f. Actual: " + f).toString());
    }
}
