package androidx.compose.p003ui.graphics.vector;

import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Matrix;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.drawscope.DrawContext;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawTransform;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import ch.qos.logback.classic.net.SyslogAppender;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b(\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0007*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0003R!\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR6\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R:\u00107\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001002\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001008\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u0010=\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u0016\"\u0004\b;\u0010<R*\u0010E\u001a\u00020>2\u0006\u0010!\u001a\u00020>8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR*\u0010I\u001a\u00020>2\u0006\u0010!\u001a\u00020>8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010@\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR*\u0010M\u001a\u00020>2\u0006\u0010!\u001a\u00020>8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010B\"\u0004\bL\u0010DR*\u0010Q\u001a\u00020>2\u0006\u0010!\u001a\u00020>8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010@\u001a\u0004\bO\u0010B\"\u0004\bP\u0010DR*\u0010U\u001a\u00020>2\u0006\u0010!\u001a\u00020>8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010@\u001a\u0004\bS\u0010B\"\u0004\bT\u0010DR*\u0010Y\u001a\u00020>2\u0006\u0010!\u001a\u00020>8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010@\u001a\u0004\bW\u0010B\"\u0004\bX\u0010DR*\u0010]\u001a\u00020>2\u0006\u0010!\u001a\u00020>8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010@\u001a\u0004\b[\u0010B\"\u0004\b\\\u0010DR\u0016\u0010_\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010*R\u0011\u0010b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010e\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "<init>", "()V", "", FirebaseAnalytics.Param.INDEX, "instance", "", "insertAt", "(ILandroidx/compose/ui/graphics/vector/VNode;)V", "from", TypedValues.TransitionType.S_TO, "count", "move", "(III)V", ProductAction.ACTION_REMOVE, "(II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "Landroidx/compose/ui/graphics/Matrix;", "[F", "groupMatrix", "", "Ljava/util/List;", "children", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "value", "d", "getClipPathData", "()Ljava/util/List;", "setClipPathData", "(Ljava/util/List;)V", "clipPathData", "", "e", "Z", "isClipPathDirty", "Landroidx/compose/ui/graphics/Path;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function0;", OperatorName.NON_STROKING_GRAY, "Lkotlin/jvm/functions/Function0;", "getInvalidateListener$ui_release", "()Lkotlin/jvm/functions/Function0;", "setInvalidateListener$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "invalidateListener", OperatorName.CLOSE_PATH, "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "name", "", "i", "F", "getRotation", "()F", "setRotation", "(F)V", Key.ROTATION, OperatorName.SET_LINE_JOINSTYLE, "getPivotX", "setPivotX", "pivotX", OperatorName.NON_STROKING_CMYK, "getPivotY", "setPivotY", "pivotY", OperatorName.LINE_TO, "getScaleX", "setScaleX", "scaleX", OperatorName.MOVE_TO, "getScaleY", "setScaleY", "scaleY", OperatorName.ENDPATH, "getTranslationX", "setTranslationX", "translationX", "o", "getTranslationY", "setTranslationY", "translationY", "p", "isMatrixDirty", "getNumChildren", "()I", "numChildren", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Z", "willClipPath", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,536:1\n33#2,6:537\n33#2,6:552\n33#2,6:561\n261#3,7:543\n268#3:551\n269#3,3:558\n1#4:550\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n*L\n364#1:537,6\n520#1:552,6\n530#1:561,6\n513#1:543,7\n513#1:551\n513#1:558,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.GroupComponent */
/* loaded from: classes2.dex */
public final class GroupComponent extends VNode {

    /* renamed from: b */
    public float[] f29446b;

    /* renamed from: c */
    public final List f29447c;

    /* renamed from: d */
    public List f29448d;

    /* renamed from: e */
    public boolean f29449e;

    /* renamed from: f */
    public Path f29450f;

    /* renamed from: g */
    public Function0 f29451g;

    /* renamed from: h */
    public String f29452h;

    /* renamed from: i */
    public float f29453i;

    /* renamed from: j */
    public float f29454j;

    /* renamed from: k */
    public float f29455k;

    /* renamed from: l */
    public float f29456l;

    /* renamed from: m */
    public float f29457m;

    /* renamed from: n */
    public float f29458n;

    /* renamed from: o */
    public float f29459o;

    /* renamed from: p */
    public boolean f29460p;

    public GroupComponent() {
        super(null);
        this.f29447c = new ArrayList();
        this.f29448d = VectorKt.getEmptyPath();
        this.f29449e = true;
        this.f29452h = "";
        this.f29456l = 1.0f;
        this.f29457m = 1.0f;
        this.f29460p = true;
    }

    /* renamed from: a */
    public final boolean m59622a() {
        return !this.f29448d.isEmpty();
    }

    /* renamed from: b */
    public final void m59621b() {
        if (m59622a()) {
            Path path = this.f29450f;
            if (path == null) {
                path = AndroidPath_androidKt.Path();
                this.f29450f = path;
            }
            PathParserKt.toPath(this.f29448d, path);
        }
    }

    /* renamed from: c */
    public final void m59620c() {
        float[] fArr = this.f29446b;
        if (fArr == null) {
            fArr = Matrix.m72111constructorimpl$default(null, 1, null);
            this.f29446b = fArr;
        } else {
            Matrix.m72120resetimpl(fArr);
        }
        Matrix.m72131translateimpl$default(fArr, this.f29454j + this.f29458n, this.f29455k + this.f29459o, 0.0f, 4, null);
        Matrix.m72123rotateZimpl(fArr, this.f29453i);
        Matrix.m72124scaleimpl(fArr, this.f29456l, this.f29457m, 1.0f);
        Matrix.m72131translateimpl$default(fArr, -this.f29454j, -this.f29455k, 0.0f, 4, null);
    }

    @Override // androidx.compose.p003ui.graphics.vector.VNode
    public void draw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (this.f29460p) {
            m59620c();
            this.f29460p = false;
        }
        if (this.f29449e) {
            m59621b();
            this.f29449e = false;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long mo72334getSizeNHjbRc = drawContext.mo72334getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        float[] fArr = this.f29446b;
        if (fArr != null) {
            transform.mo72342transform58bKbWc(Matrix.m72109boximpl(fArr).m72132unboximpl());
        }
        Path path = this.f29450f;
        if (m59622a() && path != null) {
            AbstractC12343nK.m26429c(transform, path, 0, 2, null);
        }
        List list = this.f29447c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((VNode) list.get(i)).draw(drawScope);
        }
        drawContext.getCanvas().restore();
        drawContext.mo72335setSizeuvyYCjk(mo72334getSizeNHjbRc);
    }

    @NotNull
    public final List<PathNode> getClipPathData() {
        return this.f29448d;
    }

    @Override // androidx.compose.p003ui.graphics.vector.VNode
    @Nullable
    public Function0<Unit> getInvalidateListener$ui_release() {
        return this.f29451g;
    }

    @NotNull
    public final String getName() {
        return this.f29452h;
    }

    public final int getNumChildren() {
        return this.f29447c.size();
    }

    public final float getPivotX() {
        return this.f29454j;
    }

    public final float getPivotY() {
        return this.f29455k;
    }

    public final float getRotation() {
        return this.f29453i;
    }

    public final float getScaleX() {
        return this.f29456l;
    }

    public final float getScaleY() {
        return this.f29457m;
    }

    public final float getTranslationX() {
        return this.f29458n;
    }

    public final float getTranslationY() {
        return this.f29459o;
    }

    public final void insertAt(int i, @NotNull VNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (i < getNumChildren()) {
            this.f29447c.set(i, instance);
        } else {
            this.f29447c.add(instance);
        }
        instance.setInvalidateListener$ui_release(getInvalidateListener$ui_release());
        invalidate();
    }

    public final void move(int i, int i2, int i3) {
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                this.f29447c.remove(i);
                this.f29447c.add(i2, (VNode) this.f29447c.get(i));
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                this.f29447c.remove(i);
                this.f29447c.add(i2 - 1, (VNode) this.f29447c.get(i));
                i4++;
            }
        }
        invalidate();
    }

    public final void remove(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (i < this.f29447c.size()) {
                ((VNode) this.f29447c.get(i)).setInvalidateListener$ui_release(null);
                this.f29447c.remove(i);
            }
        }
        invalidate();
    }

    public final void setClipPathData(@NotNull List<? extends PathNode> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f29448d = value;
        this.f29449e = true;
        invalidate();
    }

    @Override // androidx.compose.p003ui.graphics.vector.VNode
    public void setInvalidateListener$ui_release(@Nullable Function0<Unit> function0) {
        this.f29451g = function0;
        List list = this.f29447c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((VNode) list.get(i)).setInvalidateListener$ui_release(function0);
        }
    }

    public final void setName(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f29452h = value;
        invalidate();
    }

    public final void setPivotX(float f) {
        this.f29454j = f;
        this.f29460p = true;
        invalidate();
    }

    public final void setPivotY(float f) {
        this.f29455k = f;
        this.f29460p = true;
        invalidate();
    }

    public final void setRotation(float f) {
        this.f29453i = f;
        this.f29460p = true;
        invalidate();
    }

    public final void setScaleX(float f) {
        this.f29456l = f;
        this.f29460p = true;
        invalidate();
    }

    public final void setScaleY(float f) {
        this.f29457m = f;
        this.f29460p = true;
        invalidate();
    }

    public final void setTranslationX(float f) {
        this.f29458n = f;
        this.f29460p = true;
        invalidate();
    }

    public final void setTranslationY(float f) {
        this.f29459o = f;
        this.f29460p = true;
        invalidate();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.f29452h);
        List list = this.f29447c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
            sb.append(((VNode) list.get(i)).toString());
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}