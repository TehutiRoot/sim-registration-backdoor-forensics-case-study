package androidx.compose.p003ui.platform;

import androidx.compose.p003ui.graphics.CompositingStrategy;
import androidx.compose.p003ui.graphics.RenderEffect;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\bT\b\u0080\b\u0018\u00002\u00020\u0001BÔ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010&J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010&J\u0010\u0010,\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b/\u0010-J\u0010\u00100\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b0\u0010-J\u0010\u00101\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b1\u0010-J\u0010\u00102\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b2\u0010&J\u0010\u00103\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b3\u0010&J\u0010\u00104\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b4\u0010-J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b5\u0010-J\u0010\u00106\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b6\u0010-J\u0010\u00107\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b7\u0010-J\u0010\u00108\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b8\u0010-J\u0010\u00109\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b9\u0010-J\u0010\u0010:\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b<\u0010;J\u0010\u0010=\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b=\u0010-J\u0012\u0010>\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0019\u0010A\u001a\u00020\u001fHÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010&J\u0092\u0002\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fHÆ\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u0010\u0010F\u001a\u00020EHÖ\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bH\u0010&J\u001a\u0010J\u001a\u00020\u00192\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bJ\u0010KR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010P\u001a\u0004\bS\u0010&R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010P\u001a\u0004\bU\u0010&R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u0010P\u001a\u0004\bW\u0010&R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010P\u001a\u0004\bY\u0010&R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bZ\u0010P\u001a\u0004\b[\u0010&R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010-\"\u0004\b_\u0010`R\"\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010]\u001a\u0004\bb\u0010-\"\u0004\bc\u0010`R\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010]\u001a\u0004\be\u0010-\"\u0004\bf\u0010`R\"\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010]\u001a\u0004\bh\u0010-\"\u0004\bi\u0010`R\"\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010]\u001a\u0004\bk\u0010-\"\u0004\bl\u0010`R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010P\u001a\u0004\bn\u0010&\"\u0004\bo\u0010pR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010P\u001a\u0004\br\u0010&\"\u0004\bs\u0010pR\"\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010]\u001a\u0004\bu\u0010-\"\u0004\bv\u0010`R\"\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010]\u001a\u0004\bx\u0010-\"\u0004\by\u0010`R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010]\u001a\u0004\b{\u0010-\"\u0004\b|\u0010`R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010]\u001a\u0004\b~\u0010-\"\u0004\b\u007f\u0010`R%\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010]\u001a\u0005\b\u0081\u0001\u0010-\"\u0005\b\u0082\u0001\u0010`R%\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010]\u001a\u0005\b\u0084\u0001\u0010-\"\u0005\b\u0085\u0001\u0010`R'\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010;\"\u0006\b\u0089\u0001\u0010\u008a\u0001R'\u0010\u001b\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u0087\u0001\u001a\u0005\b\u008c\u0001\u0010;\"\u0006\b\u008d\u0001\u0010\u008a\u0001R%\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010]\u001a\u0005\b\u008f\u0001\u0010-\"\u0005\b\u0090\u0001\u0010`R)\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010?\"\u0006\b\u0094\u0001\u0010\u0095\u0001R.\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010P\u001a\u0005\b\u0097\u0001\u0010&\"\u0005\b\u0098\u0001\u0010p\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0099\u0001"}, m28850d2 = {"Landroidx/compose/ui/platform/DeviceRenderNodeData;", "", "", "uniqueId", "", "left", "top", "right", "bottom", "width", "height", "", "scaleX", "scaleY", "translationX", "translationY", "elevation", "ambientShadowColor", "spotShadowColor", "rotationZ", "rotationX", "rotationY", "cameraDistance", "pivotX", "pivotY", "", "clipToOutline", "clipToBounds", "alpha", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "<init>", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()J", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "()F", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "()Z", "component22", "component23", "component24", "()Landroidx/compose/ui/graphics/RenderEffect;", "component25--NrFUSI", "component25", "copy-fuCbV5c", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;I)Landroidx/compose/ui/platform/DeviceRenderNodeData;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getUniqueId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getLeft", OperatorName.CURVE_TO, "getTop", "d", "getRight", "e", "getBottom", OperatorName.FILL_NON_ZERO, "getWidth", OperatorName.NON_STROKING_GRAY, "getHeight", OperatorName.CLOSE_PATH, "F", "getScaleX", "setScaleX", "(F)V", "i", "getScaleY", "setScaleY", OperatorName.SET_LINE_JOINSTYLE, "getTranslationX", "setTranslationX", OperatorName.NON_STROKING_CMYK, "getTranslationY", "setTranslationY", OperatorName.LINE_TO, "getElevation", "setElevation", OperatorName.MOVE_TO, "getAmbientShadowColor", "setAmbientShadowColor", "(I)V", OperatorName.ENDPATH, "getSpotShadowColor", "setSpotShadowColor", "o", "getRotationZ", "setRotationZ", "p", "getRotationX", "setRotationX", OperatorName.SAVE, "getRotationY", "setRotationY", PDPageLabelRange.STYLE_ROMAN_LOWER, "getCameraDistance", "setCameraDistance", OperatorName.CLOSE_AND_STROKE, "getPivotX", "setPivotX", "t", "getPivotY", "setPivotY", "u", "Z", "getClipToOutline", "setClipToOutline", "(Z)V", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getClipToBounds", "setClipToBounds", OperatorName.SET_LINE_WIDTH, "getAlpha", "setAlpha", "x", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.DeviceRenderNodeData */
/* loaded from: classes2.dex */
public final class DeviceRenderNodeData {

    /* renamed from: a */
    public final long f30656a;

    /* renamed from: b */
    public final int f30657b;

    /* renamed from: c */
    public final int f30658c;

    /* renamed from: d */
    public final int f30659d;

    /* renamed from: e */
    public final int f30660e;

    /* renamed from: f */
    public final int f30661f;

    /* renamed from: g */
    public final int f30662g;

    /* renamed from: h */
    public float f30663h;

    /* renamed from: i */
    public float f30664i;

    /* renamed from: j */
    public float f30665j;

    /* renamed from: k */
    public float f30666k;

    /* renamed from: l */
    public float f30667l;

    /* renamed from: m */
    public int f30668m;

    /* renamed from: n */
    public int f30669n;

    /* renamed from: o */
    public float f30670o;

    /* renamed from: p */
    public float f30671p;

    /* renamed from: q */
    public float f30672q;

    /* renamed from: r */
    public float f30673r;

    /* renamed from: s */
    public float f30674s;

    /* renamed from: t */
    public float f30675t;

    /* renamed from: u */
    public boolean f30676u;

    /* renamed from: v */
    public boolean f30677v;

    /* renamed from: w */
    public float f30678w;

    /* renamed from: x */
    public RenderEffect f30679x;

    /* renamed from: y */
    public int f30680y;

    public /* synthetic */ DeviceRenderNodeData(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, RenderEffect renderEffect, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, i3, i4, i5, i6, f, f2, f3, f4, f5, i7, i8, f6, f7, f8, f9, f10, f11, z, z2, f12, renderEffect, i9);
    }

    public final long component1() {
        return this.f30656a;
    }

    public final float component10() {
        return this.f30665j;
    }

    public final float component11() {
        return this.f30666k;
    }

    public final float component12() {
        return this.f30667l;
    }

    public final int component13() {
        return this.f30668m;
    }

    public final int component14() {
        return this.f30669n;
    }

    public final float component15() {
        return this.f30670o;
    }

    public final float component16() {
        return this.f30671p;
    }

    public final float component17() {
        return this.f30672q;
    }

    public final float component18() {
        return this.f30673r;
    }

    public final float component19() {
        return this.f30674s;
    }

    public final int component2() {
        return this.f30657b;
    }

    public final float component20() {
        return this.f30675t;
    }

    public final boolean component21() {
        return this.f30676u;
    }

    public final boolean component22() {
        return this.f30677v;
    }

    public final float component23() {
        return this.f30678w;
    }

    @Nullable
    public final RenderEffect component24() {
        return this.f30679x;
    }

    /* renamed from: component25--NrFUSI  reason: not valid java name */
    public final int m73032component25NrFUSI() {
        return this.f30680y;
    }

    public final int component3() {
        return this.f30658c;
    }

    public final int component4() {
        return this.f30659d;
    }

    public final int component5() {
        return this.f30660e;
    }

    public final int component6() {
        return this.f30661f;
    }

    public final int component7() {
        return this.f30662g;
    }

    public final float component8() {
        return this.f30663h;
    }

    public final float component9() {
        return this.f30664i;
    }

    @NotNull
    /* renamed from: copy-fuCbV5c  reason: not valid java name */
    public final DeviceRenderNodeData m73033copyfuCbV5c(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, @Nullable RenderEffect renderEffect, int i9) {
        return new DeviceRenderNodeData(j, i, i2, i3, i4, i5, i6, f, f2, f3, f4, f5, i7, i8, f6, f7, f8, f9, f10, f11, z, z2, f12, renderEffect, i9, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceRenderNodeData) {
            DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) obj;
            return this.f30656a == deviceRenderNodeData.f30656a && this.f30657b == deviceRenderNodeData.f30657b && this.f30658c == deviceRenderNodeData.f30658c && this.f30659d == deviceRenderNodeData.f30659d && this.f30660e == deviceRenderNodeData.f30660e && this.f30661f == deviceRenderNodeData.f30661f && this.f30662g == deviceRenderNodeData.f30662g && Float.compare(this.f30663h, deviceRenderNodeData.f30663h) == 0 && Float.compare(this.f30664i, deviceRenderNodeData.f30664i) == 0 && Float.compare(this.f30665j, deviceRenderNodeData.f30665j) == 0 && Float.compare(this.f30666k, deviceRenderNodeData.f30666k) == 0 && Float.compare(this.f30667l, deviceRenderNodeData.f30667l) == 0 && this.f30668m == deviceRenderNodeData.f30668m && this.f30669n == deviceRenderNodeData.f30669n && Float.compare(this.f30670o, deviceRenderNodeData.f30670o) == 0 && Float.compare(this.f30671p, deviceRenderNodeData.f30671p) == 0 && Float.compare(this.f30672q, deviceRenderNodeData.f30672q) == 0 && Float.compare(this.f30673r, deviceRenderNodeData.f30673r) == 0 && Float.compare(this.f30674s, deviceRenderNodeData.f30674s) == 0 && Float.compare(this.f30675t, deviceRenderNodeData.f30675t) == 0 && this.f30676u == deviceRenderNodeData.f30676u && this.f30677v == deviceRenderNodeData.f30677v && Float.compare(this.f30678w, deviceRenderNodeData.f30678w) == 0 && Intrinsics.areEqual(this.f30679x, deviceRenderNodeData.f30679x) && CompositingStrategy.m71812equalsimpl0(this.f30680y, deviceRenderNodeData.f30680y);
        }
        return false;
    }

    public final float getAlpha() {
        return this.f30678w;
    }

    public final int getAmbientShadowColor() {
        return this.f30668m;
    }

    public final int getBottom() {
        return this.f30660e;
    }

    public final float getCameraDistance() {
        return this.f30673r;
    }

    public final boolean getClipToBounds() {
        return this.f30677v;
    }

    public final boolean getClipToOutline() {
        return this.f30676u;
    }

    /* renamed from: getCompositingStrategy--NrFUSI  reason: not valid java name */
    public final int m73034getCompositingStrategyNrFUSI() {
        return this.f30680y;
    }

    public final float getElevation() {
        return this.f30667l;
    }

    public final int getHeight() {
        return this.f30662g;
    }

    public final int getLeft() {
        return this.f30657b;
    }

    public final float getPivotX() {
        return this.f30674s;
    }

    public final float getPivotY() {
        return this.f30675t;
    }

    @Nullable
    public final RenderEffect getRenderEffect() {
        return this.f30679x;
    }

    public final int getRight() {
        return this.f30659d;
    }

    public final float getRotationX() {
        return this.f30671p;
    }

    public final float getRotationY() {
        return this.f30672q;
    }

    public final float getRotationZ() {
        return this.f30670o;
    }

    public final float getScaleX() {
        return this.f30663h;
    }

    public final float getScaleY() {
        return this.f30664i;
    }

    public final int getSpotShadowColor() {
        return this.f30669n;
    }

    public final int getTop() {
        return this.f30658c;
    }

    public final float getTranslationX() {
        return this.f30665j;
    }

    public final float getTranslationY() {
        return this.f30666k;
    }

    public final long getUniqueId() {
        return this.f30656a;
    }

    public final int getWidth() {
        return this.f30661f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int m67882a = ((((((((((((((((((((((((((((((((((((((AbstractC17792Ig1.m67882a(this.f30656a) * 31) + this.f30657b) * 31) + this.f30658c) * 31) + this.f30659d) * 31) + this.f30660e) * 31) + this.f30661f) * 31) + this.f30662g) * 31) + Float.floatToIntBits(this.f30663h)) * 31) + Float.floatToIntBits(this.f30664i)) * 31) + Float.floatToIntBits(this.f30665j)) * 31) + Float.floatToIntBits(this.f30666k)) * 31) + Float.floatToIntBits(this.f30667l)) * 31) + this.f30668m) * 31) + this.f30669n) * 31) + Float.floatToIntBits(this.f30670o)) * 31) + Float.floatToIntBits(this.f30671p)) * 31) + Float.floatToIntBits(this.f30672q)) * 31) + Float.floatToIntBits(this.f30673r)) * 31) + Float.floatToIntBits(this.f30674s)) * 31) + Float.floatToIntBits(this.f30675t)) * 31;
        boolean z = this.f30676u;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (m67882a + i2) * 31;
        boolean z2 = this.f30677v;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        int floatToIntBits = (((i3 + i) * 31) + Float.floatToIntBits(this.f30678w)) * 31;
        RenderEffect renderEffect = this.f30679x;
        if (renderEffect == null) {
            hashCode = 0;
        } else {
            hashCode = renderEffect.hashCode();
        }
        return ((floatToIntBits + hashCode) * 31) + CompositingStrategy.m71813hashCodeimpl(this.f30680y);
    }

    public final void setAlpha(float f) {
        this.f30678w = f;
    }

    public final void setAmbientShadowColor(int i) {
        this.f30668m = i;
    }

    public final void setCameraDistance(float f) {
        this.f30673r = f;
    }

    public final void setClipToBounds(boolean z) {
        this.f30677v = z;
    }

    public final void setClipToOutline(boolean z) {
        this.f30676u = z;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE  reason: not valid java name */
    public final void m73035setCompositingStrategyaDBOjCE(int i) {
        this.f30680y = i;
    }

    public final void setElevation(float f) {
        this.f30667l = f;
    }

    public final void setPivotX(float f) {
        this.f30674s = f;
    }

    public final void setPivotY(float f) {
        this.f30675t = f;
    }

    public final void setRenderEffect(@Nullable RenderEffect renderEffect) {
        this.f30679x = renderEffect;
    }

    public final void setRotationX(float f) {
        this.f30671p = f;
    }

    public final void setRotationY(float f) {
        this.f30672q = f;
    }

    public final void setRotationZ(float f) {
        this.f30670o = f;
    }

    public final void setScaleX(float f) {
        this.f30663h = f;
    }

    public final void setScaleY(float f) {
        this.f30664i = f;
    }

    public final void setSpotShadowColor(int i) {
        this.f30669n = i;
    }

    public final void setTranslationX(float f) {
        this.f30665j = f;
    }

    public final void setTranslationY(float f) {
        this.f30666k = f;
    }

    @NotNull
    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.f30656a + ", left=" + this.f30657b + ", top=" + this.f30658c + ", right=" + this.f30659d + ", bottom=" + this.f30660e + ", width=" + this.f30661f + ", height=" + this.f30662g + ", scaleX=" + this.f30663h + ", scaleY=" + this.f30664i + ", translationX=" + this.f30665j + ", translationY=" + this.f30666k + ", elevation=" + this.f30667l + ", ambientShadowColor=" + this.f30668m + ", spotShadowColor=" + this.f30669n + ", rotationZ=" + this.f30670o + ", rotationX=" + this.f30671p + ", rotationY=" + this.f30672q + ", cameraDistance=" + this.f30673r + ", pivotX=" + this.f30674s + ", pivotY=" + this.f30675t + ", clipToOutline=" + this.f30676u + ", clipToBounds=" + this.f30677v + ", alpha=" + this.f30678w + ", renderEffect=" + this.f30679x + ", compositingStrategy=" + ((Object) CompositingStrategy.m71814toStringimpl(this.f30680y)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public DeviceRenderNodeData(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, RenderEffect renderEffect, int i9) {
        this.f30656a = j;
        this.f30657b = i;
        this.f30658c = i2;
        this.f30659d = i3;
        this.f30660e = i4;
        this.f30661f = i5;
        this.f30662g = i6;
        this.f30663h = f;
        this.f30664i = f2;
        this.f30665j = f3;
        this.f30666k = f4;
        this.f30667l = f5;
        this.f30668m = i7;
        this.f30669n = i8;
        this.f30670o = f6;
        this.f30671p = f7;
        this.f30672q = f8;
        this.f30673r = f9;
        this.f30674s = f10;
        this.f30675t = f11;
        this.f30676u = z;
        this.f30677v = z2;
        this.f30678w = f12;
        this.f30679x = renderEffect;
        this.f30680y = i9;
    }
}
