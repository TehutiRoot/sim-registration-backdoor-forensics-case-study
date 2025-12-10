package androidx.compose.p003ui.graphics.vector.compat;

import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\bn\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010!\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR\u001a\u0010$\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000eR\u001a\u0010'\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010\u000eR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR\u001a\u0010-\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b+\u0010\f\u001a\u0004\b,\u0010\u000eR\u001a\u00100\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b/\u0010\u000eR\u001a\u00103\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b1\u0010\f\u001a\u0004\b2\u0010\u000eR\u001a\u00106\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b5\u0010\u000eR\u001a\u00109\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b7\u0010\f\u001a\u0004\b8\u0010\u000eR\u001a\u0010<\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b:\u0010\f\u001a\u0004\b;\u0010\u000eR\u001a\u0010?\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b=\u0010\f\u001a\u0004\b>\u0010\u000eR\u001a\u0010B\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b@\u0010\f\u001a\u0004\bA\u0010\u000eR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u001a\u0010H\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bF\u0010\f\u001a\u0004\bG\u0010\u000eR\u001a\u0010K\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bI\u0010\f\u001a\u0004\bJ\u0010\u000eR\u001a\u0010N\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bL\u0010\f\u001a\u0004\bM\u0010\u000eR\u001a\u0010Q\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bO\u0010\f\u001a\u0004\bP\u0010\u000eR\u001a\u0010T\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bR\u0010\f\u001a\u0004\bS\u0010\u000eR\u001a\u0010W\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bU\u0010\f\u001a\u0004\bV\u0010\u000eR\u001a\u0010Z\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bX\u0010\f\u001a\u0004\bY\u0010\u000eR\u001a\u0010]\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b[\u0010\f\u001a\u0004\b\\\u0010\u000eR\u001a\u0010`\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b^\u0010\f\u001a\u0004\b_\u0010\u000eR\u001a\u0010c\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\ba\u0010\f\u001a\u0004\bb\u0010\u000eR\u001a\u0010f\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bd\u0010\f\u001a\u0004\be\u0010\u000eR\u001a\u0010i\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bg\u0010\f\u001a\u0004\bh\u0010\u000eR\u001a\u0010l\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bj\u0010\f\u001a\u0004\bk\u0010\u000eR\u001a\u0010o\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bm\u0010\f\u001a\u0004\bn\u0010\u000eR\u0017\u0010q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\bp\u0010\bR\u001a\u0010t\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\br\u0010\f\u001a\u0004\bs\u0010\u000eR\u001a\u0010w\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\bu\u0010\f\u001a\u0004\bv\u0010\u000e¨\u0006x"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/compat/AndroidVectorResources;", "", "<init>", "()V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "[I", "getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY", "()[I", "STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getSTYLEABLE_VECTOR_DRAWABLE_ALPHA", "()I", "STYLEABLE_VECTOR_DRAWABLE_ALPHA", OperatorName.CURVE_TO, "getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED", "STYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED", "d", "getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT", "STYLEABLE_VECTOR_DRAWABLE_HEIGHT", "e", "getSTYLEABLE_VECTOR_DRAWABLE_NAME", "STYLEABLE_VECTOR_DRAWABLE_NAME", OperatorName.FILL_NON_ZERO, "getSTYLEABLE_VECTOR_DRAWABLE_TINT", "STYLEABLE_VECTOR_DRAWABLE_TINT", OperatorName.NON_STROKING_GRAY, "getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE", "STYLEABLE_VECTOR_DRAWABLE_TINT_MODE", OperatorName.CLOSE_PATH, "getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT", "STYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT", "i", "getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH", "STYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH", OperatorName.SET_LINE_JOINSTYLE, "getSTYLEABLE_VECTOR_DRAWABLE_WIDTH", "STYLEABLE_VECTOR_DRAWABLE_WIDTH", OperatorName.NON_STROKING_CMYK, "getSTYLEABLE_VECTOR_DRAWABLE_GROUP", "STYLEABLE_VECTOR_DRAWABLE_GROUP", OperatorName.LINE_TO, "getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME", "STYLEABLE_VECTOR_DRAWABLE_GROUP_NAME", OperatorName.MOVE_TO, "getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X", "STYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X", OperatorName.ENDPATH, "getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y", "STYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y", "o", "getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION", "STYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION", "p", "getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X", "STYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X", OperatorName.SAVE, "getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y", "STYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y", PDPageLabelRange.STYLE_ROMAN_LOWER, "getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X", "STYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X", OperatorName.CLOSE_AND_STROKE, "getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y", "STYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y", "t", "getSTYLEABLE_VECTOR_DRAWABLE_PATH", "STYLEABLE_VECTOR_DRAWABLE_PATH", "u", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA", "STYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR", "STYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR", OperatorName.SET_LINE_WIDTH, "getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME", "STYLEABLE_VECTOR_DRAWABLE_PATH_NAME", "x", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA", "STYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA", "z", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR", "A", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP", "B", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN", "C", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT", "D", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH", ExifInterface.LONGITUDE_EAST, "getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END", "STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END", "F", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET", "STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET", OperatorName.STROKING_COLOR_GRAY, "getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START", "STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START", "H", "getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE", "STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE", "getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH", "STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH", OperatorName.SET_LINE_CAPSTYLE, "getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME", "STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME", "K", "getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA", "STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.vector.compat.AndroidVectorResources */
/* loaded from: classes2.dex */
public final class AndroidVectorResources {

    /* renamed from: J */
    public static final int f29637J = 0;

    /* renamed from: e */
    public static final int f29643e = 0;

    /* renamed from: l */
    public static final int f29650l = 0;

    /* renamed from: w */
    public static final int f29661w = 0;
    @NotNull
    public static final AndroidVectorResources INSTANCE = new AndroidVectorResources();

    /* renamed from: a */
    public static final int[] f29639a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};

    /* renamed from: b */
    public static final int f29640b = 4;

    /* renamed from: c */
    public static final int f29641c = 5;

    /* renamed from: d */
    public static final int f29642d = 2;

    /* renamed from: f */
    public static final int f29644f = 1;

    /* renamed from: g */
    public static final int f29645g = 6;

    /* renamed from: h */
    public static final int f29646h = 8;

    /* renamed from: i */
    public static final int f29647i = 7;

    /* renamed from: j */
    public static final int f29648j = 3;

    /* renamed from: k */
    public static final int[] f29649k = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};

    /* renamed from: m */
    public static final int f29651m = 1;

    /* renamed from: n */
    public static final int f29652n = 2;

    /* renamed from: o */
    public static final int f29653o = 5;

    /* renamed from: p */
    public static final int f29654p = 3;

    /* renamed from: q */
    public static final int f29655q = 4;

    /* renamed from: r */
    public static final int f29656r = 6;

    /* renamed from: s */
    public static final int f29657s = 7;

    /* renamed from: t */
    public static final int[] f29658t = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};

    /* renamed from: u */
    public static final int f29659u = 12;

    /* renamed from: v */
    public static final int f29660v = 1;

    /* renamed from: x */
    public static final int f29662x = 2;

    /* renamed from: y */
    public static final int f29663y = 11;

    /* renamed from: z */
    public static final int f29664z = 3;

    /* renamed from: A */
    public static final int f29628A = 8;

    /* renamed from: B */
    public static final int f29629B = 9;

    /* renamed from: C */
    public static final int f29630C = 10;

    /* renamed from: D */
    public static final int f29631D = 4;

    /* renamed from: E */
    public static final int f29632E = 6;

    /* renamed from: F */
    public static final int f29633F = 7;

    /* renamed from: G */
    public static final int f29634G = 5;

    /* renamed from: H */
    public static final int f29635H = 13;

    /* renamed from: I */
    public static final int[] f29636I = {16842755, 16843781};

    /* renamed from: K */
    public static final int f29638K = 1;

    public final int getSTYLEABLE_VECTOR_DRAWABLE_ALPHA() {
        return f29640b;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED() {
        return f29641c;
    }

    @NotNull
    public final int[] getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH() {
        return f29636I;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME() {
        return f29637J;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA() {
        return f29638K;
    }

    @NotNull
    public final int[] getSTYLEABLE_VECTOR_DRAWABLE_GROUP() {
        return f29649k;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME() {
        return f29650l;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X() {
        return f29651m;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y() {
        return f29652n;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION() {
        return f29653o;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X() {
        return f29654p;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y() {
        return f29655q;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X() {
        return f29656r;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y() {
        return f29657s;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT() {
        return f29642d;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_NAME() {
        return f29643e;
    }

    @NotNull
    public final int[] getSTYLEABLE_VECTOR_DRAWABLE_PATH() {
        return f29658t;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA() {
        return f29659u;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR() {
        return f29660v;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME() {
        return f29661w;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA() {
        return f29662x;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA() {
        return f29663y;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR() {
        return f29664z;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP() {
        return f29628A;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN() {
        return f29629B;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT() {
        return f29630C;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH() {
        return f29631D;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END() {
        return f29632E;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE() {
        return f29635H;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET() {
        return f29633F;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START() {
        return f29634G;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_TINT() {
        return f29644f;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE() {
        return f29645g;
    }

    @NotNull
    public final int[] getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY() {
        return f29639a;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT() {
        return f29646h;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH() {
        return f29647i;
    }

    public final int getSTYLEABLE_VECTOR_DRAWABLE_WIDTH() {
        return f29648j;
    }
}