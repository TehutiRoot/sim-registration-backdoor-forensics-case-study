package androidx.compose.p003ui.graphics.drawscope;

import androidx.compose.p003ui.graphics.PathEffect;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.StrokeJoin;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 '2\u00020\u0001:\u0001'B>\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR \u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, m28850d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "", "width", "miter", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/StrokeJoin;", "join", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "<init>", "(FFIILandroidx/compose/ui/graphics/PathEffect;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getWidth", "()F", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMiter", OperatorName.CURVE_TO, "I", "getCap-KaPHkGw", "d", "getJoin-LxFBmk8", "e", "Landroidx/compose/ui/graphics/PathEffect;", "getPathEffect", "()Landroidx/compose/ui/graphics/PathEffect;", "Companion", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.drawscope.Stroke */
/* loaded from: classes2.dex */
public final class Stroke extends DrawStyle {
    public static final float DefaultMiter = 4.0f;
    public static final float HairlineWidth = 0.0f;

    /* renamed from: a */
    public final float f29323a;

    /* renamed from: b */
    public final float f29324b;

    /* renamed from: c */
    public final int f29325c;

    /* renamed from: d */
    public final int f29326d;

    /* renamed from: e */
    public final PathEffect f29327e;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final int f29321f = StrokeCap.Companion.m72043getButtKaPHkGw();

    /* renamed from: g */
    public static final int f29322g = StrokeJoin.Companion.m72054getMiterLxFBmk8();

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u0006R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, m28850d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke$Companion;", "", "()V", "DefaultCap", "Landroidx/compose/ui/graphics/StrokeCap;", "getDefaultCap-KaPHkGw", "()I", "I", "DefaultJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getDefaultJoin-LxFBmk8", "DefaultMiter", "", "HairlineWidth", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.graphics.drawscope.Stroke$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDefaultCap-KaPHkGw  reason: not valid java name */
        public final int m72233getDefaultCapKaPHkGw() {
            return Stroke.f29321f;
        }

        /* renamed from: getDefaultJoin-LxFBmk8  reason: not valid java name */
        public final int m72234getDefaultJoinLxFBmk8() {
            return Stroke.f29322g;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Stroke(float f, float f2, int i, int i2, PathEffect pathEffect, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, i, i2, pathEffect);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        if (this.f29323a == stroke.f29323a && this.f29324b == stroke.f29324b && StrokeCap.m72039equalsimpl0(this.f29325c, stroke.f29325c) && StrokeJoin.m72049equalsimpl0(this.f29326d, stroke.f29326d) && Intrinsics.areEqual(this.f29327e, stroke.f29327e)) {
            return true;
        }
        return false;
    }

    /* renamed from: getCap-KaPHkGw  reason: not valid java name */
    public final int m72231getCapKaPHkGw() {
        return this.f29325c;
    }

    /* renamed from: getJoin-LxFBmk8  reason: not valid java name */
    public final int m72232getJoinLxFBmk8() {
        return this.f29326d;
    }

    public final float getMiter() {
        return this.f29324b;
    }

    @Nullable
    public final PathEffect getPathEffect() {
        return this.f29327e;
    }

    public final float getWidth() {
        return this.f29323a;
    }

    public int hashCode() {
        int i;
        int floatToIntBits = ((((((Float.floatToIntBits(this.f29323a) * 31) + Float.floatToIntBits(this.f29324b)) * 31) + StrokeCap.m72040hashCodeimpl(this.f29325c)) * 31) + StrokeJoin.m72050hashCodeimpl(this.f29326d)) * 31;
        PathEffect pathEffect = this.f29327e;
        if (pathEffect != null) {
            i = pathEffect.hashCode();
        } else {
            i = 0;
        }
        return floatToIntBits + i;
    }

    @NotNull
    public String toString() {
        return "Stroke(width=" + this.f29323a + ", miter=" + this.f29324b + ", cap=" + ((Object) StrokeCap.m72041toStringimpl(this.f29325c)) + ", join=" + ((Object) StrokeJoin.m72051toStringimpl(this.f29326d)) + ", pathEffect=" + this.f29327e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ Stroke(float f, float f2, int i, int i2, PathEffect pathEffect, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0.0f : f, (i3 & 2) != 0 ? 4.0f : f2, (i3 & 4) != 0 ? f29321f : i, (i3 & 8) != 0 ? f29322g : i2, (i3 & 16) != 0 ? null : pathEffect, null);
    }

    public Stroke(float f, float f2, int i, int i2, PathEffect pathEffect) {
        super(null);
        this.f29323a = f;
        this.f29324b = f2;
        this.f29325c = i;
        this.f29326d = i2;
        this.f29327e = pathEffect;
    }
}
