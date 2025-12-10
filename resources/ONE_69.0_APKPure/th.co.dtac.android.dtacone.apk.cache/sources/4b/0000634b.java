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

@Metadata(m29143d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000f\u001a\u00020\rø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0016\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0019\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u0018\u0010\u001b\u001a\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010\u0015J\u0018\u0010,\u001a\u00020+H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b,\u0010\u000bJ\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010\u001cJ\u0011\u0010/\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020)H\u0002¢\u0006\u0004\b1\u0010\u0015R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00103\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00065"}, m29142d2 = {"Landroidx/compose/ui/platform/DecodeHelper;", "", "", TypedValues.Custom.S_STRING, "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/SpanStyle;", "decodeSpanStyle", "()Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/graphics/Color;", "decodeColor-0d7_KjU", "()J", "decodeColor", "Landroidx/compose/ui/unit/TextUnit;", "decodeTextUnit-XSAIIZE", "decodeTextUnit", "Landroidx/compose/ui/text/font/FontWeight;", "decodeFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "decodeFontStyle-_-LCdwA", "()I", "decodeFontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "decodeFontSynthesis-GVVA2EU", "decodeFontSynthesis", "Landroidx/compose/ui/text/style/BaselineShift;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()F", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "i", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "Landroidx/compose/ui/text/style/TextDecoration;", OperatorName.CLOSE_PATH, "()Landroidx/compose/ui/text/style/TextDecoration;", "Landroidx/compose/ui/graphics/Shadow;", OperatorName.FILL_NON_ZERO, "()Landroidx/compose/ui/graphics/Shadow;", "", OperatorName.CURVE_TO, "()B", "", "e", "Lkotlin/ULong;", OperatorName.SET_LINE_JOINSTYLE, "", "d", OperatorName.NON_STROKING_GRAY, "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/os/Parcel;", "Landroid/os/Parcel;", "parcel", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.DecodeHelper */
/* loaded from: classes2.dex */
public final class DecodeHelper {

    /* renamed from: a */
    public final Parcel f30743a;

    public DecodeHelper(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.f30743a = obtain;
        byte[] decode = Base64.decode(string, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    /* renamed from: a */
    public final int m59182a() {
        return this.f30743a.dataAvail();
    }

    /* renamed from: b */
    public final float m59181b() {
        return BaselineShift.m73634constructorimpl(m59179d());
    }

    /* renamed from: c */
    public final byte m59180c() {
        return this.f30743a.readByte();
    }

    /* renamed from: d */
    public final float m59179d() {
        return this.f30743a.readFloat();
    }

    /* renamed from: decodeColor-0d7_KjU  reason: not valid java name */
    public final long m73209decodeColor0d7_KjU() {
        return Color.m71915constructorimpl(m59173j());
    }

    /* renamed from: decodeFontStyle-_-LCdwA  reason: not valid java name */
    public final int m73210decodeFontStyle_LCdwA() {
        byte m59180c = m59180c();
        if (m59180c == 0) {
            return FontStyle.Companion.m73500getNormal_LCdwA();
        }
        if (m59180c == 1) {
            return FontStyle.Companion.m73499getItalic_LCdwA();
        }
        return FontStyle.Companion.m73500getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU  reason: not valid java name */
    public final int m73211decodeFontSynthesisGVVA2EU() {
        byte m59180c = m59180c();
        if (m59180c == 0) {
            return FontSynthesis.Companion.m73511getNoneGVVA2EU();
        }
        if (m59180c == 1) {
            return FontSynthesis.Companion.m73510getAllGVVA2EU();
        }
        if (m59180c == 3) {
            return FontSynthesis.Companion.m73512getStyleGVVA2EU();
        }
        if (m59180c == 2) {
            return FontSynthesis.Companion.m73513getWeightGVVA2EU();
        }
        return FontSynthesis.Companion.m73511getNoneGVVA2EU();
    }

    @NotNull
    public final FontWeight decodeFontWeight() {
        return new FontWeight(m59178e());
    }

    @NotNull
    public final SpanStyle decodeSpanStyle() {
        IG0 ig0;
        IG0 ig02 = r15;
        IG0 ig03 = new IG0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.f30743a.dataAvail() > 1) {
            byte m59180c = m59180c();
            if (m59180c == 1) {
                if (m59182a() < 8) {
                    break;
                }
                ig02.m68049c(m73209decodeColor0d7_KjU());
            } else {
                ig0 = ig02;
                if (m59180c == 2) {
                    if (m59182a() < 5) {
                        break;
                    }
                    ig0.m68047e(m73212decodeTextUnitXSAIIZE());
                    ig02 = ig0;
                } else if (m59180c == 3) {
                    if (m59182a() < 4) {
                        break;
                    }
                    ig0.m68044h(decodeFontWeight());
                    ig02 = ig0;
                } else if (m59180c == 4) {
                    if (m59182a() < 1) {
                        break;
                    }
                    ig0.m68046f(FontStyle.m73492boximpl(m73210decodeFontStyle_LCdwA()));
                    ig02 = ig0;
                } else if (m59180c == 5) {
                    if (m59182a() < 1) {
                        break;
                    }
                    ig0.m68045g(FontSynthesis.m73501boximpl(m73211decodeFontSynthesisGVVA2EU()));
                    ig02 = ig0;
                } else {
                    if (m59180c == 6) {
                        ig0.m68048d(m59176g());
                    } else if (m59180c == 7) {
                        if (m59182a() < 5) {
                            break;
                        }
                        ig0.m68043i(m73212decodeTextUnitXSAIIZE());
                    } else if (m59180c == 8) {
                        if (m59182a() < 4) {
                            break;
                        }
                        ig0.m68050b(BaselineShift.m73633boximpl(m59181b()));
                    } else if (m59180c == 9) {
                        if (m59182a() < 8) {
                            break;
                        }
                        ig0.m68040l(m59174i());
                    } else if (m59180c == 10) {
                        if (m59182a() < 8) {
                            break;
                        }
                        ig0.m68051a(m73209decodeColor0d7_KjU());
                    } else if (m59180c == 11) {
                        if (m59182a() < 4) {
                            break;
                        }
                        ig0.m68041k(m59175h());
                    } else if (m59180c == 12) {
                        if (m59182a() < 20) {
                            break;
                        }
                        ig0.m68042j(m59177f());
                    }
                    ig02 = ig0;
                }
            }
        }
        ig0 = ig02;
        return ig0.m68039m();
    }

    /* renamed from: decodeTextUnit-XSAIIZE  reason: not valid java name */
    public final long m73212decodeTextUnitXSAIIZE() {
        long m74057getUnspecifiedUIouoOA;
        byte m59180c = m59180c();
        if (m59180c == 1) {
            m74057getUnspecifiedUIouoOA = TextUnitType.Companion.m74056getSpUIouoOA();
        } else if (m59180c == 2) {
            m74057getUnspecifiedUIouoOA = TextUnitType.Companion.m74055getEmUIouoOA();
        } else {
            m74057getUnspecifiedUIouoOA = TextUnitType.Companion.m74057getUnspecifiedUIouoOA();
        }
        if (TextUnitType.m74051equalsimpl0(m74057getUnspecifiedUIouoOA, TextUnitType.Companion.m74057getUnspecifiedUIouoOA())) {
            return TextUnit.Companion.m74034getUnspecifiedXSAIIZE();
        }
        return TextUnitKt.m74035TextUnitanM5pPY(m59179d(), m74057getUnspecifiedUIouoOA);
    }

    /* renamed from: e */
    public final int m59178e() {
        return this.f30743a.readInt();
    }

    /* renamed from: f */
    public final Shadow m59177f() {
        return new Shadow(m73209decodeColor0d7_KjU(), OffsetKt.Offset(m59179d(), m59179d()), m59179d(), null);
    }

    /* renamed from: g */
    public final String m59176g() {
        return this.f30743a.readString();
    }

    /* renamed from: h */
    public final TextDecoration m59175h() {
        boolean z;
        boolean z2;
        int m59178e = m59178e();
        TextDecoration.Companion companion = TextDecoration.Companion;
        if ((companion.getLineThrough().getMask() & m59178e) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((m59178e & companion.getUnderline().getMask()) != 0) {
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
    public final TextGeometricTransform m59174i() {
        return new TextGeometricTransform(m59179d(), m59179d());
    }

    /* renamed from: j */
    public final long m59173j() {
        return ULong.m74330constructorimpl(this.f30743a.readLong());
    }
}