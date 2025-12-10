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

@Metadata(m28851d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u000b\u0010\u0016J\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b\u000b\u0010$J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b\u000b\u0010'J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b\u000b\u0010*J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b\u000b\u0010-J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b\u000b\u0010\u001aJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u00101\u001a\u000200¢\u0006\u0004\b\u000b\u0010!J\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u00103\u001a\u000202ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u0010\u0010J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u00106R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006;"}, m28850d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "<init>", "()V", "", "reset", "", "encodedString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "encode", "(Landroidx/compose/ui/text/SpanStyle;)V", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "encode-8_81llA", "(J)V", "Landroidx/compose/ui/unit/TextUnit;", "textUnit", "encode--R2X_6o", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "(Landroidx/compose/ui/text/font/FontWeight;)V", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "encode-nzbMABs", "(I)V", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "encode-6p3vJLY", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "encode-4Dl_Bck", "(F)V", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "(Landroidx/compose/ui/text/style/TextGeometricTransform;)V", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "(Landroidx/compose/ui/text/style/TextDecoration;)V", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "(Landroidx/compose/ui/graphics/Shadow;)V", "", "byte", "(B)V", "", "int", "", TypedValues.Custom.S_FLOAT, "Lkotlin/ULong;", "uLong", "encode-VKZWuLQ", TypedValues.Custom.S_STRING, "(Ljava/lang/String;)V", "Landroid/os/Parcel;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/os/Parcel;", "parcel", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.EncodeHelper */
/* loaded from: classes2.dex */
public final class EncodeHelper {

    /* renamed from: a */
    public Parcel f30686a;

    public EncodeHelper() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.f30686a = obtain;
    }

    public final void encode(@NotNull SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        long m73176getColor0d7_KjU = spanStyle.m73176getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m71736equalsimpl0(m73176getColor0d7_KjU, companion.m71771getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m73039encode8_81llA(spanStyle.m73176getColor0d7_KjU());
        }
        long m73177getFontSizeXSAIIZE = spanStyle.m73177getFontSizeXSAIIZE();
        TextUnit.Companion companion2 = TextUnit.Companion;
        if (!TextUnit.m73836equalsimpl0(m73177getFontSizeXSAIIZE, companion2.m73850getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m73036encodeR2X_6o(spanStyle.m73177getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle m73178getFontStyle4Lr2A7w = spanStyle.m73178getFontStyle4Lr2A7w();
        if (m73178getFontStyle4Lr2A7w != null) {
            int m73314unboximpl = m73178getFontStyle4Lr2A7w.m73314unboximpl();
            encode((byte) 4);
            m73041encodenzbMABs(m73314unboximpl);
        }
        FontSynthesis m73179getFontSynthesisZQGJjVo = spanStyle.m73179getFontSynthesisZQGJjVo();
        if (m73179getFontSynthesisZQGJjVo != null) {
            int m73325unboximpl = m73179getFontSynthesisZQGJjVo.m73325unboximpl();
            encode((byte) 5);
            m73038encode6p3vJLY(m73325unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m73836equalsimpl0(spanStyle.m73180getLetterSpacingXSAIIZE(), companion2.m73850getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m73036encodeR2X_6o(spanStyle.m73180getLetterSpacingXSAIIZE());
        }
        BaselineShift m73175getBaselineShift5SSeXJ0 = spanStyle.m73175getBaselineShift5SSeXJ0();
        if (m73175getBaselineShift5SSeXJ0 != null) {
            float m73455unboximpl = m73175getBaselineShift5SSeXJ0.m73455unboximpl();
            encode((byte) 8);
            m73037encode4Dl_Bck(m73455unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m71736equalsimpl0(spanStyle.m73174getBackground0d7_KjU(), companion.m71771getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m73039encode8_81llA(spanStyle.m73174getBackground0d7_KjU());
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
    public final void m73036encodeR2X_6o(long j) {
        long m73838getTypeUIouoOA = TextUnit.m73838getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        byte b = 0;
        if (!TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA, companion.m73873getUnspecifiedUIouoOA())) {
            if (TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA, companion.m73872getSpUIouoOA())) {
                b = 1;
            } else if (TextUnitType.m73867equalsimpl0(m73838getTypeUIouoOA, companion.m73871getEmUIouoOA())) {
                b = 2;
            }
        }
        encode(b);
        if (!TextUnitType.m73867equalsimpl0(TextUnit.m73838getTypeUIouoOA(j), companion.m73873getUnspecifiedUIouoOA())) {
            encode(TextUnit.m73839getValueimpl(j));
        }
    }

    /* renamed from: encode-4Dl_Bck  reason: not valid java name */
    public final void m73037encode4Dl_Bck(float f) {
        encode(f);
    }

    /* renamed from: encode-6p3vJLY  reason: not valid java name */
    public final void m73038encode6p3vJLY(int i) {
        FontSynthesis.Companion companion = FontSynthesis.Companion;
        byte b = 0;
        if (!FontSynthesis.m73320equalsimpl0(i, companion.m73327getNoneGVVA2EU())) {
            if (FontSynthesis.m73320equalsimpl0(i, companion.m73326getAllGVVA2EU())) {
                b = 1;
            } else if (FontSynthesis.m73320equalsimpl0(i, companion.m73329getWeightGVVA2EU())) {
                b = 2;
            } else if (FontSynthesis.m73320equalsimpl0(i, companion.m73328getStyleGVVA2EU())) {
                b = 3;
            }
        }
        encode(b);
    }

    /* renamed from: encode-8_81llA  reason: not valid java name */
    public final void m73039encode8_81llA(long j) {
        m73040encodeVKZWuLQ(j);
    }

    /* renamed from: encode-VKZWuLQ  reason: not valid java name */
    public final void m73040encodeVKZWuLQ(long j) {
        this.f30686a.writeLong(j);
    }

    /* renamed from: encode-nzbMABs  reason: not valid java name */
    public final void m73041encodenzbMABs(int i) {
        FontStyle.Companion companion = FontStyle.Companion;
        byte b = 0;
        if (!FontStyle.m73311equalsimpl0(i, companion.m73316getNormal_LCdwA()) && FontStyle.m73311equalsimpl0(i, companion.m73315getItalic_LCdwA())) {
            b = 1;
        }
        encode(b);
    }

    @NotNull
    public final String encodedString() {
        String encodeToString = Base64.encodeToString(this.f30686a.marshall(), 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return encodeToString;
    }

    public final void reset() {
        this.f30686a.recycle();
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.f30686a = obtain;
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
        m73039encode8_81llA(shadow.m72015getColor0d7_KjU());
        encode(Offset.m71502getXimpl(shadow.m72016getOffsetF1C5BW0()));
        encode(Offset.m71503getYimpl(shadow.m72016getOffsetF1C5BW0()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b) {
        this.f30686a.writeByte(b);
    }

    public final void encode(int i) {
        this.f30686a.writeInt(i);
    }

    public final void encode(float f) {
        this.f30686a.writeFloat(f);
    }

    public final void encode(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.f30686a.writeString(string);
    }
}
