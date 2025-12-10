package androidx.compose.foundation.text;

import androidx.compose.p003ui.input.key.Key_androidKt;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationText;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bK\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR \u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR \u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR \u0010\u0018\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR \u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR \u0010\u001e\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR \u0010!\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR \u0010$\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR \u0010'\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR \u0010*\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR \u0010-\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR \u00100\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR \u00103\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR \u00106\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR \u00109\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR \u0010<\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR \u0010?\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR \u0010B\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\bR \u0010E\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR \u0010H\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\bR \u0010K\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR \u0010N\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, m29142d2 = {"Landroidx/compose/foundation/text/MappedKeys;", "", "<init>", "()V", "Landroidx/compose/ui/input/key/Key;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getA-EK5gGoQ", "()J", "A", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getC-EK5gGoQ", "C", OperatorName.CURVE_TO, "getH-EK5gGoQ", "H", "d", "getV-EK5gGoQ", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "e", "getY-EK5gGoQ", "Y", OperatorName.FILL_NON_ZERO, "getX-EK5gGoQ", "X", OperatorName.NON_STROKING_GRAY, "getZ-EK5gGoQ", "Z", OperatorName.CLOSE_PATH, "getBackslash-EK5gGoQ", "Backslash", "i", "getDirectionLeft-EK5gGoQ", "DirectionLeft", OperatorName.SET_LINE_JOINSTYLE, "getDirectionRight-EK5gGoQ", "DirectionRight", OperatorName.NON_STROKING_CMYK, "getDirectionUp-EK5gGoQ", "DirectionUp", OperatorName.LINE_TO, "getDirectionDown-EK5gGoQ", "DirectionDown", OperatorName.MOVE_TO, "getPageUp-EK5gGoQ", "PageUp", OperatorName.ENDPATH, "getPageDown-EK5gGoQ", "PageDown", "o", "getMoveHome-EK5gGoQ", "MoveHome", "p", "getMoveEnd-EK5gGoQ", "MoveEnd", OperatorName.SAVE, "getInsert-EK5gGoQ", PDAnnotationText.NAME_INSERT, PDPageLabelRange.STYLE_ROMAN_LOWER, "getEnter-EK5gGoQ", "Enter", OperatorName.CLOSE_AND_STROKE, "getBackspace-EK5gGoQ", "Backspace", "t", "getDelete-EK5gGoQ", "Delete", "u", "getPaste-EK5gGoQ", "Paste", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getCut-EK5gGoQ", "Cut", OperatorName.SET_LINE_WIDTH, "getCopy-EK5gGoQ", "Copy", "x", "getTab-EK5gGoQ", "Tab", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MappedKeys {
    @NotNull
    public static final MappedKeys INSTANCE = new MappedKeys();

    /* renamed from: a */
    public static final long f14077a = Key_androidKt.Key(29);

    /* renamed from: b */
    public static final long f14078b = Key_androidKt.Key(31);

    /* renamed from: c */
    public static final long f14079c = Key_androidKt.Key(36);

    /* renamed from: d */
    public static final long f14080d = Key_androidKt.Key(50);

    /* renamed from: e */
    public static final long f14081e = Key_androidKt.Key(53);

    /* renamed from: f */
    public static final long f14082f = Key_androidKt.Key(52);

    /* renamed from: g */
    public static final long f14083g = Key_androidKt.Key(54);

    /* renamed from: h */
    public static final long f14084h = Key_androidKt.Key(73);

    /* renamed from: i */
    public static final long f14085i = Key_androidKt.Key(21);

    /* renamed from: j */
    public static final long f14086j = Key_androidKt.Key(22);

    /* renamed from: k */
    public static final long f14087k = Key_androidKt.Key(19);

    /* renamed from: l */
    public static final long f14088l = Key_androidKt.Key(20);

    /* renamed from: m */
    public static final long f14089m = Key_androidKt.Key(92);

    /* renamed from: n */
    public static final long f14090n = Key_androidKt.Key(93);

    /* renamed from: o */
    public static final long f14091o = Key_androidKt.Key(122);

    /* renamed from: p */
    public static final long f14092p = Key_androidKt.Key(CameraActivity.REQUEST_CODE);

    /* renamed from: q */
    public static final long f14093q = Key_androidKt.Key(124);

    /* renamed from: r */
    public static final long f14094r = Key_androidKt.Key(66);

    /* renamed from: s */
    public static final long f14095s = Key_androidKt.Key(67);

    /* renamed from: t */
    public static final long f14096t = Key_androidKt.Key(112);

    /* renamed from: u */
    public static final long f14097u = Key_androidKt.Key(279);

    /* renamed from: v */
    public static final long f14098v = Key_androidKt.Key(277);

    /* renamed from: w */
    public static final long f14099w = Key_androidKt.Key(278);

    /* renamed from: x */
    public static final long f14100x = Key_androidKt.Key(61);

    /* renamed from: getA-EK5gGoQ  reason: not valid java name */
    public final long m69931getAEK5gGoQ() {
        return f14077a;
    }

    /* renamed from: getBackslash-EK5gGoQ  reason: not valid java name */
    public final long m69932getBackslashEK5gGoQ() {
        return f14084h;
    }

    /* renamed from: getBackspace-EK5gGoQ  reason: not valid java name */
    public final long m69933getBackspaceEK5gGoQ() {
        return f14095s;
    }

    /* renamed from: getC-EK5gGoQ  reason: not valid java name */
    public final long m69934getCEK5gGoQ() {
        return f14078b;
    }

    /* renamed from: getCopy-EK5gGoQ  reason: not valid java name */
    public final long m69935getCopyEK5gGoQ() {
        return f14099w;
    }

    /* renamed from: getCut-EK5gGoQ  reason: not valid java name */
    public final long m69936getCutEK5gGoQ() {
        return f14098v;
    }

    /* renamed from: getDelete-EK5gGoQ  reason: not valid java name */
    public final long m69937getDeleteEK5gGoQ() {
        return f14096t;
    }

    /* renamed from: getDirectionDown-EK5gGoQ  reason: not valid java name */
    public final long m69938getDirectionDownEK5gGoQ() {
        return f14088l;
    }

    /* renamed from: getDirectionLeft-EK5gGoQ  reason: not valid java name */
    public final long m69939getDirectionLeftEK5gGoQ() {
        return f14085i;
    }

    /* renamed from: getDirectionRight-EK5gGoQ  reason: not valid java name */
    public final long m69940getDirectionRightEK5gGoQ() {
        return f14086j;
    }

    /* renamed from: getDirectionUp-EK5gGoQ  reason: not valid java name */
    public final long m69941getDirectionUpEK5gGoQ() {
        return f14087k;
    }

    /* renamed from: getEnter-EK5gGoQ  reason: not valid java name */
    public final long m69942getEnterEK5gGoQ() {
        return f14094r;
    }

    /* renamed from: getH-EK5gGoQ  reason: not valid java name */
    public final long m69943getHEK5gGoQ() {
        return f14079c;
    }

    /* renamed from: getInsert-EK5gGoQ  reason: not valid java name */
    public final long m69944getInsertEK5gGoQ() {
        return f14093q;
    }

    /* renamed from: getMoveEnd-EK5gGoQ  reason: not valid java name */
    public final long m69945getMoveEndEK5gGoQ() {
        return f14092p;
    }

    /* renamed from: getMoveHome-EK5gGoQ  reason: not valid java name */
    public final long m69946getMoveHomeEK5gGoQ() {
        return f14091o;
    }

    /* renamed from: getPageDown-EK5gGoQ  reason: not valid java name */
    public final long m69947getPageDownEK5gGoQ() {
        return f14090n;
    }

    /* renamed from: getPageUp-EK5gGoQ  reason: not valid java name */
    public final long m69948getPageUpEK5gGoQ() {
        return f14089m;
    }

    /* renamed from: getPaste-EK5gGoQ  reason: not valid java name */
    public final long m69949getPasteEK5gGoQ() {
        return f14097u;
    }

    /* renamed from: getTab-EK5gGoQ  reason: not valid java name */
    public final long m69950getTabEK5gGoQ() {
        return f14100x;
    }

    /* renamed from: getV-EK5gGoQ  reason: not valid java name */
    public final long m69951getVEK5gGoQ() {
        return f14080d;
    }

    /* renamed from: getX-EK5gGoQ  reason: not valid java name */
    public final long m69952getXEK5gGoQ() {
        return f14082f;
    }

    /* renamed from: getY-EK5gGoQ  reason: not valid java name */
    public final long m69953getYEK5gGoQ() {
        return f14081e;
    }

    /* renamed from: getZ-EK5gGoQ  reason: not valid java name */
    public final long m69954getZEK5gGoQ() {
        return f14083g;
    }
}