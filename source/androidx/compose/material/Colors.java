package androidx.compose.material;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b/\b\u0007\u0018\u00002\u00020\u0001Br\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0095\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R4\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR4\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR4\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR4\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001fR4\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR4\u0010\b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR4\u0010\t\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b/\u0010\u001b\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR4\u0010\n\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b2\u0010\u001b\u001a\u0004\b3\u0010\u001d\"\u0004\b4\u0010\u001fR4\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001b\u001a\u0004\b6\u0010\u001d\"\u0004\b7\u0010\u001fR4\u0010\f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b8\u0010\u001b\u001a\u0004\b9\u0010\u001d\"\u0004\b:\u0010\u001fR4\u0010\r\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b;\u0010\u001b\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010\u001fR4\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b>\u0010\u001b\u001a\u0004\b?\u0010\u001d\"\u0004\b@\u0010\u001fR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010\u001b\u001a\u0004\b\u0010\u0010B\"\u0004\bC\u0010D\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, m28850d2 = {"Landroidx/compose/material/Colors;", "", "Landroidx/compose/ui/graphics/Color;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "", "isLight", "<init>", "(JJJJJJJJJJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-pvPzIIM", "(JJJJJJJJJJJJZ)Landroidx/compose/material/Colors;", "copy", "", "toString", "()Ljava/lang/String;", "<set-?>", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/MutableState;", "getPrimary-0d7_KjU", "()J", "setPrimary-8_81llA$material_release", "(J)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getPrimaryVariant-0d7_KjU", "setPrimaryVariant-8_81llA$material_release", OperatorName.CURVE_TO, "getSecondary-0d7_KjU", "setSecondary-8_81llA$material_release", "d", "getSecondaryVariant-0d7_KjU", "setSecondaryVariant-8_81llA$material_release", "e", "getBackground-0d7_KjU", "setBackground-8_81llA$material_release", OperatorName.FILL_NON_ZERO, "getSurface-0d7_KjU", "setSurface-8_81llA$material_release", OperatorName.NON_STROKING_GRAY, "getError-0d7_KjU", "setError-8_81llA$material_release", OperatorName.CLOSE_PATH, "getOnPrimary-0d7_KjU", "setOnPrimary-8_81llA$material_release", "i", "getOnSecondary-0d7_KjU", "setOnSecondary-8_81llA$material_release", OperatorName.SET_LINE_JOINSTYLE, "getOnBackground-0d7_KjU", "setOnBackground-8_81llA$material_release", OperatorName.NON_STROKING_CMYK, "getOnSurface-0d7_KjU", "setOnSurface-8_81llA$material_release", OperatorName.LINE_TO, "getOnError-0d7_KjU", "setOnError-8_81llA$material_release", OperatorName.MOVE_TO, "()Z", "setLight$material_release", "(Z)V", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/Colors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,337:1\n81#2:338\n107#2,2:339\n81#2:341\n107#2,2:342\n81#2:344\n107#2,2:345\n81#2:347\n107#2,2:348\n81#2:350\n107#2,2:351\n81#2:353\n107#2,2:354\n81#2:356\n107#2,2:357\n81#2:359\n107#2,2:360\n81#2:362\n107#2,2:363\n81#2:365\n107#2,2:366\n81#2:368\n107#2,2:369\n81#2:371\n107#2,2:372\n81#2:374\n107#2,2:375\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/Colors\n*L\n82#1:338\n82#1:339,2\n84#1:341\n84#1:342,2\n86#1:344\n86#1:345,2\n88#1:347\n88#1:348,2\n90#1:350\n90#1:351,2\n92#1:353\n92#1:354,2\n94#1:356\n94#1:357,2\n96#1:359\n96#1:360,2\n98#1:362\n98#1:363,2\n100#1:365\n100#1:366,2\n102#1:368\n102#1:369,2\n104#1:371\n104#1:372,2\n106#1:374\n106#1:375,2\n*E\n"})
/* loaded from: classes.dex */
public final class Colors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final MutableState f14417a;

    /* renamed from: b */
    public final MutableState f14418b;

    /* renamed from: c */
    public final MutableState f14419c;

    /* renamed from: d */
    public final MutableState f14420d;

    /* renamed from: e */
    public final MutableState f14421e;

    /* renamed from: f */
    public final MutableState f14422f;

    /* renamed from: g */
    public final MutableState f14423g;

    /* renamed from: h */
    public final MutableState f14424h;

    /* renamed from: i */
    public final MutableState f14425i;

    /* renamed from: j */
    public final MutableState f14426j;

    /* renamed from: k */
    public final MutableState f14427k;

    /* renamed from: l */
    public final MutableState f14428l;

    /* renamed from: m */
    public final MutableState f14429m;

    public /* synthetic */ Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, z);
    }

    @NotNull
    /* renamed from: copy-pvPzIIM  reason: not valid java name */
    public final Colors m69962copypvPzIIM(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, z, null);
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m69963getBackground0d7_KjU() {
        return ((Color) this.f14421e.getValue()).m71745unboximpl();
    }

    /* renamed from: getError-0d7_KjU  reason: not valid java name */
    public final long m69964getError0d7_KjU() {
        return ((Color) this.f14423g.getValue()).m71745unboximpl();
    }

    /* renamed from: getOnBackground-0d7_KjU  reason: not valid java name */
    public final long m69965getOnBackground0d7_KjU() {
        return ((Color) this.f14426j.getValue()).m71745unboximpl();
    }

    /* renamed from: getOnError-0d7_KjU  reason: not valid java name */
    public final long m69966getOnError0d7_KjU() {
        return ((Color) this.f14428l.getValue()).m71745unboximpl();
    }

    /* renamed from: getOnPrimary-0d7_KjU  reason: not valid java name */
    public final long m69967getOnPrimary0d7_KjU() {
        return ((Color) this.f14424h.getValue()).m71745unboximpl();
    }

    /* renamed from: getOnSecondary-0d7_KjU  reason: not valid java name */
    public final long m69968getOnSecondary0d7_KjU() {
        return ((Color) this.f14425i.getValue()).m71745unboximpl();
    }

    /* renamed from: getOnSurface-0d7_KjU  reason: not valid java name */
    public final long m69969getOnSurface0d7_KjU() {
        return ((Color) this.f14427k.getValue()).m71745unboximpl();
    }

    /* renamed from: getPrimary-0d7_KjU  reason: not valid java name */
    public final long m69970getPrimary0d7_KjU() {
        return ((Color) this.f14417a.getValue()).m71745unboximpl();
    }

    /* renamed from: getPrimaryVariant-0d7_KjU  reason: not valid java name */
    public final long m69971getPrimaryVariant0d7_KjU() {
        return ((Color) this.f14418b.getValue()).m71745unboximpl();
    }

    /* renamed from: getSecondary-0d7_KjU  reason: not valid java name */
    public final long m69972getSecondary0d7_KjU() {
        return ((Color) this.f14419c.getValue()).m71745unboximpl();
    }

    /* renamed from: getSecondaryVariant-0d7_KjU  reason: not valid java name */
    public final long m69973getSecondaryVariant0d7_KjU() {
        return ((Color) this.f14420d.getValue()).m71745unboximpl();
    }

    /* renamed from: getSurface-0d7_KjU  reason: not valid java name */
    public final long m69974getSurface0d7_KjU() {
        return ((Color) this.f14422f.getValue()).m71745unboximpl();
    }

    public final boolean isLight() {
        return ((Boolean) this.f14429m.getValue()).booleanValue();
    }

    /* renamed from: setBackground-8_81llA$material_release  reason: not valid java name */
    public final void m69975setBackground8_81llA$material_release(long j) {
        this.f14421e.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setError-8_81llA$material_release  reason: not valid java name */
    public final void m69976setError8_81llA$material_release(long j) {
        this.f14423g.setValue(Color.m71725boximpl(j));
    }

    public final void setLight$material_release(boolean z) {
        this.f14429m.setValue(Boolean.valueOf(z));
    }

    /* renamed from: setOnBackground-8_81llA$material_release  reason: not valid java name */
    public final void m69977setOnBackground8_81llA$material_release(long j) {
        this.f14426j.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOnError-8_81llA$material_release  reason: not valid java name */
    public final void m69978setOnError8_81llA$material_release(long j) {
        this.f14428l.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOnPrimary-8_81llA$material_release  reason: not valid java name */
    public final void m69979setOnPrimary8_81llA$material_release(long j) {
        this.f14424h.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOnSecondary-8_81llA$material_release  reason: not valid java name */
    public final void m69980setOnSecondary8_81llA$material_release(long j) {
        this.f14425i.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setOnSurface-8_81llA$material_release  reason: not valid java name */
    public final void m69981setOnSurface8_81llA$material_release(long j) {
        this.f14427k.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setPrimary-8_81llA$material_release  reason: not valid java name */
    public final void m69982setPrimary8_81llA$material_release(long j) {
        this.f14417a.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setPrimaryVariant-8_81llA$material_release  reason: not valid java name */
    public final void m69983setPrimaryVariant8_81llA$material_release(long j) {
        this.f14418b.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setSecondary-8_81llA$material_release  reason: not valid java name */
    public final void m69984setSecondary8_81llA$material_release(long j) {
        this.f14419c.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setSecondaryVariant-8_81llA$material_release  reason: not valid java name */
    public final void m69985setSecondaryVariant8_81llA$material_release(long j) {
        this.f14420d.setValue(Color.m71725boximpl(j));
    }

    /* renamed from: setSurface-8_81llA$material_release  reason: not valid java name */
    public final void m69986setSurface8_81llA$material_release(long j) {
        this.f14422f.setValue(Color.m71725boximpl(j));
    }

    @NotNull
    public String toString() {
        return "Colors(primary=" + ((Object) Color.m71743toStringimpl(m69970getPrimary0d7_KjU())) + ", primaryVariant=" + ((Object) Color.m71743toStringimpl(m69971getPrimaryVariant0d7_KjU())) + ", secondary=" + ((Object) Color.m71743toStringimpl(m69972getSecondary0d7_KjU())) + ", secondaryVariant=" + ((Object) Color.m71743toStringimpl(m69973getSecondaryVariant0d7_KjU())) + ", background=" + ((Object) Color.m71743toStringimpl(m69963getBackground0d7_KjU())) + ", surface=" + ((Object) Color.m71743toStringimpl(m69974getSurface0d7_KjU())) + ", error=" + ((Object) Color.m71743toStringimpl(m69964getError0d7_KjU())) + ", onPrimary=" + ((Object) Color.m71743toStringimpl(m69967getOnPrimary0d7_KjU())) + ", onSecondary=" + ((Object) Color.m71743toStringimpl(m69968getOnSecondary0d7_KjU())) + ", onBackground=" + ((Object) Color.m71743toStringimpl(m69965getOnBackground0d7_KjU())) + ", onSurface=" + ((Object) Color.m71743toStringimpl(m69969getOnSurface0d7_KjU())) + ", onError=" + ((Object) Color.m71743toStringimpl(m69966getOnError0d7_KjU())) + ", isLight=" + isLight() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        this.f14417a = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j), SnapshotStateKt.structuralEqualityPolicy());
        this.f14418b = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j2), SnapshotStateKt.structuralEqualityPolicy());
        this.f14419c = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j3), SnapshotStateKt.structuralEqualityPolicy());
        this.f14420d = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j4), SnapshotStateKt.structuralEqualityPolicy());
        this.f14421e = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j5), SnapshotStateKt.structuralEqualityPolicy());
        this.f14422f = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j6), SnapshotStateKt.structuralEqualityPolicy());
        this.f14423g = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j7), SnapshotStateKt.structuralEqualityPolicy());
        this.f14424h = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j8), SnapshotStateKt.structuralEqualityPolicy());
        this.f14425i = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j9), SnapshotStateKt.structuralEqualityPolicy());
        this.f14426j = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.f14427k = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.f14428l = SnapshotStateKt.mutableStateOf(Color.m71725boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.f14429m = SnapshotStateKt.mutableStateOf(Boolean.valueOf(z), SnapshotStateKt.structuralEqualityPolicy());
    }
}
