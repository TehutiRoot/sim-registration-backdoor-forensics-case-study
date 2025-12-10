package androidx.compose.p003ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.p003ui.geometry.OffsetKt;
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
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.p003ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000f\u001a\u00020\rø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0016\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0019\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u0018\u0010\u001b\u001a\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010\u0015J\u0018\u0010,\u001a\u00020+H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b,\u0010\u000bJ\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010\u001cJ\u0011\u0010/\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020)H\u0002¢\u0006\u0004\b1\u0010\u0015R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00103\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00065"}, m28850d2 = {"Landroidx/compose/ui/platform/DecodeHelper;", "", "", TypedValues.Custom.S_STRING, "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/SpanStyle;", "decodeSpanStyle", "()Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/graphics/Color;", "decodeColor-0d7_KjU", "()J", "decodeColor", "Landroidx/compose/ui/unit/TextUnit;", "decodeTextUnit-XSAIIZE", "decodeTextUnit", "Landroidx/compose/ui/text/font/FontWeight;", "decodeFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "decodeFontStyle-_-LCdwA", "()I", "decodeFontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "decodeFontSynthesis-GVVA2EU", "decodeFontSynthesis", "Landroidx/compose/ui/text/style/BaselineShift;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()F", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "i", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "Landroidx/compose/ui/text/style/TextDecoration;", OperatorName.CLOSE_PATH, "()Landroidx/compose/ui/text/style/TextDecoration;", "Landroidx/compose/ui/graphics/Shadow;", OperatorName.FILL_NON_ZERO, "()Landroidx/compose/ui/graphics/Shadow;", "", OperatorName.CURVE_TO, "()B", "", "e", "Lkotlin/ULong;", OperatorName.SET_LINE_JOINSTYLE, "", "d", OperatorName.NON_STROKING_GRAY, "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/os/Parcel;", "Landroid/os/Parcel;", "parcel", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.DecodeHelper */
/* loaded from: classes2.dex */
public final class DecodeHelper {

    /* renamed from: a */
    public final Parcel f30655a;

    public DecodeHelper(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.f30655a = obtain;
        byte[] decode = Base64.decode(string, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    /* renamed from: a */
    public final int m59232a() {
        return this.f30655a.dataAvail();
    }

    /* renamed from: b */
    public final float m59231b() {
        return BaselineShift.m73450constructorimpl(m59229d());
    }

    /* renamed from: c */
    public final byte m59230c() {
        return this.f30655a.readByte();
    }

    /* renamed from: d */
    public final float m59229d() {
        return this.f30655a.readFloat();
    }

    /* renamed from: decodeColor-0d7_KjU  reason: not valid java name */
    public final long m73025decodeColor0d7_KjU() {
        return Color.m71731constructorimpl(m59223j());
    }

    /* renamed from: decodeFontStyle-_-LCdwA  reason: not valid java name */
    public final int m73026decodeFontStyle_LCdwA() {
        byte m59230c = m59230c();
        if (m59230c == 0) {
            return FontStyle.Companion.m73316getNormal_LCdwA();
        }
        if (m59230c == 1) {
            return FontStyle.Companion.m73315getItalic_LCdwA();
        }
        return FontStyle.Companion.m73316getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU  reason: not valid java name */
    public final int m73027decodeFontSynthesisGVVA2EU() {
        byte m59230c = m59230c();
        if (m59230c == 0) {
            return FontSynthesis.Companion.m73327getNoneGVVA2EU();
        }
        if (m59230c == 1) {
            return FontSynthesis.Companion.m73326getAllGVVA2EU();
        }
        if (m59230c == 3) {
            return FontSynthesis.Companion.m73328getStyleGVVA2EU();
        }
        if (m59230c == 2) {
            return FontSynthesis.Companion.m73329getWeightGVVA2EU();
        }
        return FontSynthesis.Companion.m73327getNoneGVVA2EU();
    }

    @NotNull
    public final FontWeight decodeFontWeight() {
        return new FontWeight(m59228e());
    }

    @NotNull
    public final SpanStyle decodeSpanStyle() {
        CG0 cg0;
        CG0 cg02 = r15;
        CG0 cg03 = new CG0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.f30655a.dataAvail() > 1) {
            byte m59230c = m59230c();
            if (m59230c == 1) {
                if (m59232a() < 8) {
                    break;
                }
                cg02.m68812c(m73025decodeColor0d7_KjU());
            } else {
                cg0 = cg02;
                if (m59230c == 2) {
                    if (m59232a() < 5) {
                        break;
                    }
                    cg0.m68810e(m73028decodeTextUnitXSAIIZE());
                    cg02 = cg0;
                } else if (m59230c == 3) {
                    if (m59232a() < 4) {
                        break;
                    }
                    cg0.m68807h(decodeFontWeight());
                    cg02 = cg0;
                } else if (m59230c == 4) {
                    if (m59232a() < 1) {
                        break;
                    }
                    cg0.m68809f(FontStyle.m73308boximpl(m73026decodeFontStyle_LCdwA()));
                    cg02 = cg0;
                } else if (m59230c == 5) {
                    if (m59232a() < 1) {
                        break;
                    }
                    cg0.m68808g(FontSynthesis.m73317boximpl(m73027decodeFontSynthesisGVVA2EU()));
                    cg02 = cg0;
                } else {
                    if (m59230c == 6) {
                        cg0.m68811d(m59226g());
                    } else if (m59230c == 7) {
                        if (m59232a() < 5) {
                            break;
                        }
                        cg0.m68806i(m73028decodeTextUnitXSAIIZE());
                    } else if (m59230c == 8) {
                        if (m59232a() < 4) {
                            break;
                        }
                        cg0.m68813b(BaselineShift.m73449boximpl(m59231b()));
                    } else if (m59230c == 9) {
                        if (m59232a() < 8) {
                            break;
                        }
                        cg0.m68803l(m59224i());
                    } else if (m59230c == 10) {
                        if (m59232a() < 8) {
                            break;
                        }
                        cg0.m68814a(m73025decodeColor0d7_KjU());
                    } else if (m59230c == 11) {
                        if (m59232a() < 4) {
                            break;
                        }
                        cg0.m68804k(m59225h());
                    } else if (m59230c == 12) {
                        if (m59232a() < 20) {
                            break;
                        }
                        cg0.m68805j(m59227f());
                    }
                    cg02 = cg0;
                }
            }
        }
        cg0 = cg02;
        return cg0.m68802m();
    }

    /* renamed from: decodeTextUnit-XSAIIZE  reason: not valid java name */
    public final long m73028decodeTextUnitXSAIIZE() {
        long m73873getUnspecifiedUIouoOA;
        byte m59230c = m59230c();
        if (m59230c == 1) {
            m73873getUnspecifiedUIouoOA = TextUnitType.Companion.m73872getSpUIouoOA();
        } else if (m59230c == 2) {
            m73873getUnspecifiedUIouoOA = TextUnitType.Companion.m73871getEmUIouoOA();
        } else {
            m73873getUnspecifiedUIouoOA = TextUnitType.Companion.m73873getUnspecifiedUIouoOA();
        }
        if (TextUnitType.m73867equalsimpl0(m73873getUnspecifiedUIouoOA, TextUnitType.Companion.m73873getUnspecifiedUIouoOA())) {
            return TextUnit.Companion.m73850getUnspecifiedXSAIIZE();
        }
        return TextUnitKt.m73851TextUnitanM5pPY(m59229d(), m73873getUnspecifiedUIouoOA);
    }

    /* renamed from: e */
    public final int m59228e() {
        return this.f30655a.readInt();
    }

    /* renamed from: f */
    public final Shadow m59227f() {
        return new Shadow(m73025decodeColor0d7_KjU(), OffsetKt.Offset(m59229d(), m59229d()), m59229d(), null);
    }

    /* renamed from: g */
    public final String m59226g() {
        return this.f30655a.readString();
    }

    /* renamed from: h */
    public final TextDecoration m59225h() {
        boolean z;
        boolean z2;
        int m59228e = m59228e();
        TextDecoration.Companion companion = TextDecoration.Companion;
        if ((companion.getLineThrough().getMask() & m59228e) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((m59228e & companion.getUnderline().getMask()) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return companion.combine(CollectionsKt__CollectionsKt.listOf((Object[]) new TextDecoration[]{companion.getLineThrough(), companion.getUnderline()}));
        }
        if (z) {
            return companion.getLineThrough();
        }
        if (z2) {
            return companion.getUnderline();
        }
        return companion.getNone();
    }

    /* renamed from: i */
    public final TextGeometricTransform m59224i() {
        return new TextGeometricTransform(m59229d(), m59229d());
    }

    /* renamed from: j */
    public final long m59223j() {
        return ULong.m74146constructorimpl(this.f30655a.readLong());
    }
}
