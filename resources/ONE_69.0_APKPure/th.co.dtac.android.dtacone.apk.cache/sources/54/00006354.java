package androidx.compose.p003ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.text.SpanStyle;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u000b\u0010\u0016J\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b\u000b\u0010$J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b\u000b\u0010'J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b\u000b\u0010*J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b\u000b\u0010-J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b\u000b\u0010\u001aJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u00101\u001a\u000200¢\u0006\u0004\b\u000b\u0010!J\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u00103\u001a\u000202ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u0010\u0010J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u00106R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006;"}, m29142d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "<init>", "()V", "", "reset", "", "encodedString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "encode", "(Landroidx/compose/ui/text/SpanStyle;)V", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "encode-8_81llA", "(J)V", "Landroidx/compose/ui/unit/TextUnit;", "textUnit", "encode--R2X_6o", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "(Landroidx/compose/ui/text/font/FontWeight;)V", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "encode-nzbMABs", "(I)V", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "encode-6p3vJLY", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "encode-4Dl_Bck", "(F)V", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "(Landroidx/compose/ui/text/style/TextGeometricTransform;)V", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "(Landroidx/compose/ui/text/style/TextDecoration;)V", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "(Landroidx/compose/ui/graphics/Shadow;)V", "", "byte", "(B)V", "", "int", "", TypedValues.Custom.S_FLOAT, "Lkotlin/ULong;", "uLong", "encode-VKZWuLQ", TypedValues.Custom.S_STRING, "(Ljava/lang/String;)V", "Landroid/os/Parcel;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/os/Parcel;", "parcel", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.EncodeHelper */
/* loaded from: classes2.dex */
public final class EncodeHelper {

    /* renamed from: a */
    public Parcel f30774a;

    public EncodeHelper() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.f30774a = obtain;
    }

    public final void encode(@NotNull SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        long m73360getColor0d7_KjU = spanStyle.m73360getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m71920equalsimpl0(m73360getColor0d7_KjU, companion.m71955getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m73223encode8_81llA(spanStyle.m73360getColor0d7_KjU());
        }
        long m73361getFontSizeXSAIIZE = spanStyle.m73361getFontSizeXSAIIZE();
        TextUnit.Companion companion2 = TextUnit.Companion;
        if (!TextUnit.m74020equalsimpl0(m73361getFontSizeXSAIIZE, companion2.m74034getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m73220encodeR2X_6o(spanStyle.m73361getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle m73362getFontStyle4Lr2A7w = spanStyle.m73362getFontStyle4Lr2A7w();
        if (m73362getFontStyle4Lr2A7w != null) {
            int m73498unboximpl = m73362getFontStyle4Lr2A7w.m73498unboximpl();
            encode((byte) 4);
            m73225encodenzbMABs(m73498unboximpl);
        }
        FontSynthesis m73363getFontSynthesisZQGJjVo = spanStyle.m73363getFontSynthesisZQGJjVo();
        if (m73363getFontSynthesisZQGJjVo != null) {
            int m73509unboximpl = m73363getFontSynthesisZQGJjVo.m73509unboximpl();
            encode((byte) 5);
            m73222encode6p3vJLY(m73509unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m74020equalsimpl0(spanStyle.m73364getLetterSpacingXSAIIZE(), companion2.m74034getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m73220encodeR2X_6o(spanStyle.m73364getLetterSpacingXSAIIZE());
        }
        BaselineShift m73359getBaselineShift5SSeXJ0 = spanStyle.m73359getBaselineShift5SSeXJ0();
        if (m73359getBaselineShift5SSeXJ0 != null) {
            float m73639unboximpl = m73359getBaselineShift5SSeXJ0.m73639unboximpl();
            encode((byte) 8);
            m73221encode4Dl_Bck(m73639unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m71920equalsimpl0(spanStyle.m73358getBackground0d7_KjU(), companion.m71955getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m73223encode8_81llA(spanStyle.m73358getBackground0d7_KjU());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    /* renamed from: encode--R2X_6o  reason: not valid java name */
    public final void m73220encodeR2X_6o(long j) {
        long m74022getTypeUIouoOA = TextUnit.m74022getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        byte b = 0;
        if (!TextUnitType.m74051equalsimpl0(m74022getTypeUIouoOA, companion.m74057getUnspecifiedUIouoOA())) {
            if (TextUnitType.m74051equalsimpl0(m74022getTypeUIouoOA, companion.m74056getSpUIouoOA())) {
                b = 1;
            } else if (TextUnitType.m74051equalsimpl0(m74022getTypeUIouoOA, companion.m74055getEmUIouoOA())) {
                b = 2;
            }
        }
        encode(b);
        if (!TextUnitType.m74051equalsimpl0(TextUnit.m74022getTypeUIouoOA(j), companion.m74057getUnspecifiedUIouoOA())) {
            encode(TextUnit.m74023getValueimpl(j));
        }
    }

    /* renamed from: encode-4Dl_Bck  reason: not valid java name */
    public final void m73221encode4Dl_Bck(float f) {
        encode(f);
    }

    /* renamed from: encode-6p3vJLY  reason: not valid java name */
    public final void m73222encode6p3vJLY(int i) {
        FontSynthesis.Companion companion = FontSynthesis.Companion;
        byte b = 0;
        if (!FontSynthesis.m73504equalsimpl0(i, companion.m73511getNoneGVVA2EU())) {
            if (FontSynthesis.m73504equalsimpl0(i, companion.m73510getAllGVVA2EU())) {
                b = 1;
            } else if (FontSynthesis.m73504equalsimpl0(i, companion.m73513getWeightGVVA2EU())) {
                b = 2;
            } else if (FontSynthesis.m73504equalsimpl0(i, companion.m73512getStyleGVVA2EU())) {
                b = 3;
            }
        }
        encode(b);
    }

    /* renamed from: encode-8_81llA  reason: not valid java name */
    public final void m73223encode8_81llA(long j) {
        m73224encodeVKZWuLQ(j);
    }

    /* renamed from: encode-VKZWuLQ  reason: not valid java name */
    public final void m73224encodeVKZWuLQ(long j) {
        this.f30774a.writeLong(j);
    }

    /* renamed from: encode-nzbMABs  reason: not valid java name */
    public final void m73225encodenzbMABs(int i) {
        FontStyle.Companion companion = FontStyle.Companion;
        byte b = 0;
        if (!FontStyle.m73495equalsimpl0(i, companion.m73500getNormal_LCdwA()) && FontStyle.m73495equalsimpl0(i, companion.m73499getItalic_LCdwA())) {
            b = 1;
        }
        encode(b);
    }

    @NotNull
    public final String encodedString() {
        String encodeToString = Base64.encodeToString(this.f30774a.marshall(), 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return encodeToString;
    }

    public final void reset() {
        this.f30774a.recycle();
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.f30774a = obtain;
    }

    public final void encode(@NotNull FontWeight fontWeight) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        encode(fontWeight.getWeight());
    }

    public final void encode(@NotNull TextGeometricTransform textGeometricTransform) {
        Intrinsics.checkNotNullParameter(textGeometricTransform, "textGeometricTransform");
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(@NotNull TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(textDecoration, "textDecoration");
        encode(textDecoration.getMask());
    }

    public final void encode(@NotNull Shadow shadow) {
        Intrinsics.checkNotNullParameter(shadow, "shadow");
        m73223encode8_81llA(shadow.m72199getColor0d7_KjU());
        encode(Offset.m71686getXimpl(shadow.m72200getOffsetF1C5BW0()));
        encode(Offset.m71687getYimpl(shadow.m72200getOffsetF1C5BW0()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b) {
        this.f30774a.writeByte(b);
    }

    public final void encode(int i) {
        this.f30774a.writeInt(i);
    }

    public final void encode(float f) {
        this.f30774a.writeFloat(f);
    }

    public final void encode(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.f30774a.writeString(string);
    }
}