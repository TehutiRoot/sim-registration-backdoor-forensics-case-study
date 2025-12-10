package androidx.compose.p003ui.graphics;

import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010%\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, m29142d2 = {"Landroidx/compose/ui/graphics/AndroidPathMeasure;", "Landroidx/compose/ui/graphics/PathMeasure;", "Landroid/graphics/PathMeasure;", "internalPathMeasure", "<init>", "(Landroid/graphics/PathMeasure;)V", "", "startDistance", "stopDistance", "Landroidx/compose/ui/graphics/Path;", FirebaseAnalytics.Param.DESTINATION, "", "startWithMoveTo", "getSegment", "(FFLandroidx/compose/ui/graphics/Path;Z)Z", ClientCookie.PATH_ATTR, "forceClosed", "", "setPath", "(Landroidx/compose/ui/graphics/Path;Z)V", "distance", "Landroidx/compose/ui/geometry/Offset;", "getPosition-tuRUvjQ", "(F)J", "getPosition", "getTangent-tuRUvjQ", "getTangent", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/PathMeasure;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "[F", "positionArray", OperatorName.CURVE_TO, "tangentArray", "getLength", "()F", "length", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidPathMeasure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,86:1\n35#2,5:87\n35#2,5:92\n*S KotlinDebug\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n*L\n43#1:87,5\n49#1:92,5\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.AndroidPathMeasure */
/* loaded from: classes2.dex */
public final class AndroidPathMeasure implements PathMeasure {

    /* renamed from: a */
    public final PathMeasure f29072a;

    /* renamed from: b */
    public float[] f29073b;

    /* renamed from: c */
    public float[] f29074c;

    public AndroidPathMeasure(@NotNull PathMeasure internalPathMeasure) {
        Intrinsics.checkNotNullParameter(internalPathMeasure, "internalPathMeasure");
        this.f29072a = internalPathMeasure;
    }

    @Override // androidx.compose.p003ui.graphics.PathMeasure
    public float getLength() {
        return this.f29072a.getLength();
    }

    @Override // androidx.compose.p003ui.graphics.PathMeasure
    /* renamed from: getPosition-tuRUvjQ  reason: not valid java name */
    public long mo71826getPositiontuRUvjQ(float f) {
        if (this.f29073b == null) {
            this.f29073b = new float[2];
        }
        if (this.f29074c == null) {
            this.f29074c = new float[2];
        }
        if (this.f29072a.getPosTan(f, this.f29073b, this.f29074c)) {
            float[] fArr = this.f29073b;
            Intrinsics.checkNotNull(fArr);
            float f2 = fArr[0];
            float[] fArr2 = this.f29073b;
            Intrinsics.checkNotNull(fArr2);
            return OffsetKt.Offset(f2, fArr2[1]);
        }
        return Offset.Companion.m71701getUnspecifiedF1C5BW0();
    }

    @Override // androidx.compose.p003ui.graphics.PathMeasure
    public boolean getSegment(float f, float f2, @NotNull Path destination, boolean z) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        PathMeasure pathMeasure = this.f29072a;
        if (destination instanceof AndroidPath) {
            return pathMeasure.getSegment(f, f2, ((AndroidPath) destination).getInternalPath(), z);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.p003ui.graphics.PathMeasure
    /* renamed from: getTangent-tuRUvjQ  reason: not valid java name */
    public long mo71827getTangenttuRUvjQ(float f) {
        if (this.f29073b == null) {
            this.f29073b = new float[2];
        }
        if (this.f29074c == null) {
            this.f29074c = new float[2];
        }
        if (this.f29072a.getPosTan(f, this.f29073b, this.f29074c)) {
            float[] fArr = this.f29074c;
            Intrinsics.checkNotNull(fArr);
            float f2 = fArr[0];
            float[] fArr2 = this.f29074c;
            Intrinsics.checkNotNull(fArr2);
            return OffsetKt.Offset(f2, fArr2[1]);
        }
        return Offset.Companion.m71701getUnspecifiedF1C5BW0();
    }

    @Override // androidx.compose.p003ui.graphics.PathMeasure
    public void setPath(@Nullable Path path, boolean z) {
        Path path2;
        PathMeasure pathMeasure = this.f29072a;
        if (path != null) {
            if (path instanceof AndroidPath) {
                path2 = ((AndroidPath) path).getInternalPath();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            path2 = null;
        }
        pathMeasure.setPath(path2, z);
    }
}