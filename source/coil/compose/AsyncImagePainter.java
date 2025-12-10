package coil.compose;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.painter.BitmapPainterKt;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.SuccessResult;
import coil.size.Precision;
import coil.size.SizeResolver;
import coil.target.Target;
import coil.transition.CrossfadeTransition;
import coil.transition.Transition;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(m28851d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u0000 x2\u00020\u00012\u00020\u0002:\u0002xyB\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u000e*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0001*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\t*\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010\u000bJ\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010\u000bJ\u000f\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010\u000bR\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00104\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b2\u00103R/\u0010:\u001a\u0004\u0018\u00010\u00012\b\u00105\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u00106\u001a\u0004\b2\u00107\"\u0004\b8\u00109R+\u0010!\u001a\u00020 2\u0006\u00105\u001a\u00020 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b;\u00106\u001a\u0004\b<\u0010=\"\u0004\b;\u0010>R/\u0010&\u001a\u0004\u0018\u00010%2\b\u00105\u001a\u0004\u0018\u00010%8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b?\u00106\u001a\u0004\b-\u0010@\"\u0004\b?\u0010AR$\u0010E\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u000e8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b8\u0010C\"\u0004\bD\u0010\u0011R(\u0010I\u001a\u0004\u0018\u00010\u00012\b\u0010B\u001a\u0004\u0018\u00010\u00018\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bF\u0010G\"\u0004\bH\u00109R.\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR0\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010K\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR\"\u0010Z\u001a\u00020T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR+\u0010a\u001a\u00020[8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010g\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR+\u0010j\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u00106\u001a\u0004\bh\u0010i\"\u0004\bF\u0010\u0011R+\u0010\u0004\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00038F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bk\u00106\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR+\u0010\u0006\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00058F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bp\u00106\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001d\u0010w\u001a\u0002018VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bu\u0010v\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006z"}, m28850d2 = {"Lcoil/compose/AsyncImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "Lcoil/request/ImageRequest;", "request", "Lcoil/ImageLoader;", "imageLoader", "<init>", "(Lcoil/request/ImageRequest;Lcoil/ImageLoader;)V", "", "e", "()V", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Lcoil/request/ImageRequest;)Lcoil/request/ImageRequest;", "Lcoil/compose/AsyncImagePainter$State;", "input", OperatorName.CLOSE_AND_STROKE, "(Lcoil/compose/AsyncImagePainter$State;)V", "previous", "current", "Lcoil/compose/CrossfadePainter;", "i", "(Lcoil/compose/AsyncImagePainter$State;Lcoil/compose/AsyncImagePainter$State;)Lcoil/compose/CrossfadePainter;", "Lcoil/request/ImageResult;", OperatorName.SAVE, "(Lcoil/request/ImageResult;)Lcoil/compose/AsyncImagePainter$State;", "Landroid/graphics/drawable/Drawable;", "p", "(Landroid/graphics/drawable/Drawable;)Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "onRemembered", "onForgotten", "onAbandoned", "Lkotlinx/coroutines/CoroutineScope;", OperatorName.NON_STROKING_GRAY, "Lkotlinx/coroutines/CoroutineScope;", "rememberScope", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/ui/geometry/Size;", OperatorName.CLOSE_PATH, "Lkotlinx/coroutines/flow/MutableStateFlow;", "drawSize", "<set-?>", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/ui/graphics/painter/Painter;", OperatorName.LINE_TO, "(Landroidx/compose/ui/graphics/painter/Painter;)V", "painter", OperatorName.SET_LINE_JOINSTYLE, OperatorName.FILL_NON_ZERO, "()F", "(F)V", OperatorName.NON_STROKING_CMYK, "()Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "value", "Lcoil/compose/AsyncImagePainter$State;", "o", "_state", OperatorName.MOVE_TO, "Landroidx/compose/ui/graphics/painter/Painter;", OperatorName.ENDPATH, "_painter", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getTransform$coil_compose_base_release", "()Lkotlin/jvm/functions/Function1;", "setTransform$coil_compose_base_release", "(Lkotlin/jvm/functions/Function1;)V", "transform", "getOnState$coil_compose_base_release", "setOnState$coil_compose_base_release", "onState", "Landroidx/compose/ui/layout/ContentScale;", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale$coil_compose_base_release", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale$coil_compose_base_release", "(Landroidx/compose/ui/layout/ContentScale;)V", "contentScale", "Landroidx/compose/ui/graphics/FilterQuality;", "I", "getFilterQuality-f-v9h1I$coil_compose_base_release", "()I", "setFilterQuality-vDHp3xo$coil_compose_base_release", "(I)V", "filterQuality", "Z", "isPreview$coil_compose_base_release", "()Z", "setPreview$coil_compose_base_release", "(Z)V", "isPreview", "getState", "()Lcoil/compose/AsyncImagePainter$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "t", "getRequest", "()Lcoil/request/ImageRequest;", "setRequest$coil_compose_base_release", "(Lcoil/request/ImageRequest;)V", "u", "getImageLoader", "()Lcoil/ImageLoader;", "setImageLoader$coil_compose_base_release", "(Lcoil/ImageLoader;)V", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "Companion", "State", "coil-compose-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,410:1\n76#2:411\n102#2,2:412\n76#2:414\n102#2,2:415\n76#2:417\n102#2,2:418\n76#2:420\n102#2,2:421\n76#2:423\n102#2,2:424\n76#2:426\n102#2,2:427\n1#3:429\n845#4,9:430\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter\n*L\n164#1:411\n164#1:412,2\n165#1:414\n165#1:415,2\n166#1:417\n166#1:418,2\n188#1:420\n188#1:421,2\n192#1:423\n192#1:424,2\n196#1:426\n196#1:427,2\n265#1:430,9\n*E\n"})
/* loaded from: classes3.dex */
public final class AsyncImagePainter extends Painter implements RememberObserver {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: v */
    public static final Function1 f40424v = AsyncImagePainter$Companion$DefaultTransform$1.INSTANCE;

    /* renamed from: g */
    public CoroutineScope f40425g;

    /* renamed from: h */
    public final MutableStateFlow f40426h = StateFlowKt.MutableStateFlow(Size.m71559boximpl(Size.Companion.m71580getZeroNHjbRc()));

    /* renamed from: i */
    public final MutableState f40427i;

    /* renamed from: j */
    public final MutableState f40428j;

    /* renamed from: k */
    public final MutableState f40429k;

    /* renamed from: l */
    public State f40430l;

    /* renamed from: m */
    public Painter f40431m;

    /* renamed from: n */
    public Function1 f40432n;

    /* renamed from: o */
    public Function1 f40433o;

    /* renamed from: p */
    public ContentScale f40434p;

    /* renamed from: q */
    public int f40435q;

    /* renamed from: r */
    public boolean f40436r;

    /* renamed from: s */
    public final MutableState f40437s;

    /* renamed from: t */
    public final MutableState f40438t;

    /* renamed from: u */
    public final MutableState f40439u;

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Lcoil/compose/AsyncImagePainter$Companion;", "", "()V", "DefaultTransform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "getDefaultTransform", "()Lkotlin/jvm/functions/Function1;", "coil-compose-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function1<State, State> getDefaultTransform() {
            return AsyncImagePainter.f40424v;
        }

        public Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, m28850d2 = {"Lcoil/compose/AsyncImagePainter$State;", "", "()V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "Empty", "Error", "Loading", "Success", "Lcoil/compose/AsyncImagePainter$State$Empty;", "Lcoil/compose/AsyncImagePainter$State$Error;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "Lcoil/compose/AsyncImagePainter$State$Success;", "coil-compose-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class State {
        public static final int $stable = 0;

        @StabilityInferred(parameters = 0)
        @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28850d2 = {"Lcoil/compose/AsyncImagePainter$State$Empty;", "Lcoil/compose/AsyncImagePainter$State;", "()V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "coil-compose-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* loaded from: classes3.dex */
        public static final class Empty extends State {
            public static final int $stable = 0;
            @NotNull
            public static final Empty INSTANCE = new Empty();

            public Empty() {
                super(null);
            }

            @Override // coil.compose.AsyncImagePainter.State
            @Nullable
            public Painter getPainter() {
                return null;
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b¨\u0006\u001f"}, m28850d2 = {"Lcoil/compose/AsyncImagePainter$State$Error;", "Lcoil/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Lcoil/request/ErrorResult;", "result", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Lcoil/request/ErrorResult;)V", "component1", "()Landroidx/compose/ui/graphics/painter/Painter;", "component2", "()Lcoil/request/ErrorResult;", "copy", "(Landroidx/compose/ui/graphics/painter/Painter;Lcoil/request/ErrorResult;)Lcoil/compose/AsyncImagePainter$State$Error;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/request/ErrorResult;", "getResult", "coil-compose-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
        /* loaded from: classes3.dex */
        public static final class Error extends State {
            public static final int $stable = 8;

            /* renamed from: a */
            public final Painter f40440a;

            /* renamed from: b */
            public final ErrorResult f40441b;

            public Error(@Nullable Painter painter, @NotNull ErrorResult errorResult) {
                super(null);
                this.f40440a = painter;
                this.f40441b = errorResult;
            }

            public static /* synthetic */ Error copy$default(Error error, Painter painter, ErrorResult errorResult, int i, Object obj) {
                if ((i & 1) != 0) {
                    painter = error.f40440a;
                }
                if ((i & 2) != 0) {
                    errorResult = error.f40441b;
                }
                return error.copy(painter, errorResult);
            }

            @Nullable
            public final Painter component1() {
                return this.f40440a;
            }

            @NotNull
            public final ErrorResult component2() {
                return this.f40441b;
            }

            @NotNull
            public final Error copy(@Nullable Painter painter, @NotNull ErrorResult errorResult) {
                return new Error(painter, errorResult);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Error) {
                    Error error = (Error) obj;
                    return Intrinsics.areEqual(this.f40440a, error.f40440a) && Intrinsics.areEqual(this.f40441b, error.f40441b);
                }
                return false;
            }

            @Override // coil.compose.AsyncImagePainter.State
            @Nullable
            public Painter getPainter() {
                return this.f40440a;
            }

            @NotNull
            public final ErrorResult getResult() {
                return this.f40441b;
            }

            public int hashCode() {
                Painter painter = this.f40440a;
                return ((painter == null ? 0 : painter.hashCode()) * 31) + this.f40441b.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(painter=" + this.f40440a + ", result=" + this.f40441b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m28850d2 = {"Lcoil/compose/AsyncImagePainter$State$Loading;", "Lcoil/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "component1", "()Landroidx/compose/ui/graphics/painter/Painter;", "copy", "(Landroidx/compose/ui/graphics/painter/Painter;)Lcoil/compose/AsyncImagePainter$State$Loading;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "coil-compose-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
        /* loaded from: classes3.dex */
        public static final class Loading extends State {
            public static final int $stable = 8;

            /* renamed from: a */
            public final Painter f40442a;

            public Loading(@Nullable Painter painter) {
                super(null);
                this.f40442a = painter;
            }

            public static /* synthetic */ Loading copy$default(Loading loading, Painter painter, int i, Object obj) {
                if ((i & 1) != 0) {
                    painter = loading.f40442a;
                }
                return loading.copy(painter);
            }

            @Nullable
            public final Painter component1() {
                return this.f40442a;
            }

            @NotNull
            public final Loading copy(@Nullable Painter painter) {
                return new Loading(painter);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loading) && Intrinsics.areEqual(this.f40442a, ((Loading) obj).f40442a);
            }

            @Override // coil.compose.AsyncImagePainter.State
            @Nullable
            public Painter getPainter() {
                return this.f40442a;
            }

            public int hashCode() {
                Painter painter = this.f40442a;
                if (painter == null) {
                    return 0;
                }
                return painter.hashCode();
            }

            @NotNull
            public String toString() {
                return "Loading(painter=" + this.f40442a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b¨\u0006\u001f"}, m28850d2 = {"Lcoil/compose/AsyncImagePainter$State$Success;", "Lcoil/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Lcoil/request/SuccessResult;", "result", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Lcoil/request/SuccessResult;)V", "component1", "()Landroidx/compose/ui/graphics/painter/Painter;", "component2", "()Lcoil/request/SuccessResult;", "copy", "(Landroidx/compose/ui/graphics/painter/Painter;Lcoil/request/SuccessResult;)Lcoil/compose/AsyncImagePainter$State$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/request/SuccessResult;", "getResult", "coil-compose-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
        /* loaded from: classes3.dex */
        public static final class Success extends State {
            public static final int $stable = 8;

            /* renamed from: a */
            public final Painter f40443a;

            /* renamed from: b */
            public final SuccessResult f40444b;

            public Success(@NotNull Painter painter, @NotNull SuccessResult successResult) {
                super(null);
                this.f40443a = painter;
                this.f40444b = successResult;
            }

            public static /* synthetic */ Success copy$default(Success success, Painter painter, SuccessResult successResult, int i, Object obj) {
                if ((i & 1) != 0) {
                    painter = success.f40443a;
                }
                if ((i & 2) != 0) {
                    successResult = success.f40444b;
                }
                return success.copy(painter, successResult);
            }

            @NotNull
            public final Painter component1() {
                return this.f40443a;
            }

            @NotNull
            public final SuccessResult component2() {
                return this.f40444b;
            }

            @NotNull
            public final Success copy(@NotNull Painter painter, @NotNull SuccessResult successResult) {
                return new Success(painter, successResult);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Success) {
                    Success success = (Success) obj;
                    return Intrinsics.areEqual(this.f40443a, success.f40443a) && Intrinsics.areEqual(this.f40444b, success.f40444b);
                }
                return false;
            }

            @Override // coil.compose.AsyncImagePainter.State
            @NotNull
            public Painter getPainter() {
                return this.f40443a;
            }

            @NotNull
            public final SuccessResult getResult() {
                return this.f40444b;
            }

            public int hashCode() {
                return (this.f40443a.hashCode() * 31) + this.f40444b.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(painter=" + this.f40443a + ", result=" + this.f40444b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public abstract Painter getPainter();

        public State() {
        }
    }

    public AsyncImagePainter(@NotNull ImageRequest imageRequest, @NotNull ImageLoader imageLoader) {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        MutableState m31891g4;
        MutableState m31891g5;
        MutableState m31891g6;
        m31891g = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f40427i = m31891g;
        m31891g2 = AbstractC19508dK1.m31891g(Float.valueOf(1.0f), null, 2, null);
        this.f40428j = m31891g2;
        m31891g3 = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f40429k = m31891g3;
        State.Empty empty = State.Empty.INSTANCE;
        this.f40430l = empty;
        this.f40432n = f40424v;
        this.f40434p = ContentScale.Companion.getFit();
        this.f40435q = DrawScope.Companion.m72175getDefaultFilterQualityfv9h1I();
        m31891g4 = AbstractC19508dK1.m31891g(empty, null, 2, null);
        this.f40437s = m31891g4;
        m31891g5 = AbstractC19508dK1.m31891g(imageRequest, null, 2, null);
        this.f40438t = m31891g5;
        m31891g6 = AbstractC19508dK1.m31891g(imageLoader, null, 2, null);
        this.f40439u = m31891g6;
    }

    public static final /* synthetic */ MutableStateFlow access$getDrawSize$p(AsyncImagePainter asyncImagePainter) {
        return asyncImagePainter.f40426h;
    }

    public static final /* synthetic */ Painter access$toPainter(AsyncImagePainter asyncImagePainter, Drawable drawable) {
        return asyncImagePainter.m51131p(drawable);
    }

    public static final /* synthetic */ void access$updateState(AsyncImagePainter asyncImagePainter, State state) {
        asyncImagePainter.m51128s(state);
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        m51137j(f);
        return true;
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        m51136k(colorFilter);
        return true;
    }

    /* renamed from: e */
    public final void m51142e() {
        CoroutineScope coroutineScope = this.f40425g;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.f40425g = null;
    }

    /* renamed from: f */
    public final float m51141f() {
        return ((Number) this.f40428j.getValue()).floatValue();
    }

    /* renamed from: g */
    public final ColorFilter m51140g() {
        return (ColorFilter) this.f40429k.getValue();
    }

    @NotNull
    public final ContentScale getContentScale$coil_compose_base_release() {
        return this.f40434p;
    }

    /* renamed from: getFilterQuality-f-v9h1I$coil_compose_base_release */
    public final int m73953getFilterQualityfv9h1I$coil_compose_base_release() {
        return this.f40435q;
    }

    @NotNull
    public final ImageLoader getImageLoader() {
        return (ImageLoader) this.f40439u.getValue();
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo72236getIntrinsicSizeNHjbRc() {
        Painter m51139h = m51139h();
        if (m51139h != null) {
            return m51139h.mo72236getIntrinsicSizeNHjbRc();
        }
        return Size.Companion.m71579getUnspecifiedNHjbRc();
    }

    @Nullable
    public final Function1<State, Unit> getOnState$coil_compose_base_release() {
        return this.f40433o;
    }

    @NotNull
    public final ImageRequest getRequest() {
        return (ImageRequest) this.f40438t.getValue();
    }

    @NotNull
    public final State getState() {
        return (State) this.f40437s.getValue();
    }

    @NotNull
    public final Function1<State, State> getTransform$coil_compose_base_release() {
        return this.f40432n;
    }

    /* renamed from: h */
    public final Painter m51139h() {
        return (Painter) this.f40427i.getValue();
    }

    /* renamed from: i */
    public final CrossfadePainter m51138i(State state, State state2) {
        ImageResult result;
        AsyncImagePainterKt$FakeTransitionTarget$1 asyncImagePainterKt$FakeTransitionTarget$1;
        Painter painter;
        boolean z;
        if (state2 instanceof State.Success) {
            result = ((State.Success) state2).getResult();
        } else {
            if (state2 instanceof State.Error) {
                result = ((State.Error) state2).getResult();
            }
            return null;
        }
        Transition.Factory transitionFactory = result.getRequest().getTransitionFactory();
        asyncImagePainterKt$FakeTransitionTarget$1 = AsyncImagePainterKt.f40450a;
        Transition create = transitionFactory.create(asyncImagePainterKt$FakeTransitionTarget$1, result);
        if (create instanceof CrossfadeTransition) {
            Painter painter2 = state.getPainter();
            if (state instanceof State.Loading) {
                painter = painter2;
            } else {
                painter = null;
            }
            Painter painter3 = state2.getPainter();
            ContentScale contentScale = this.f40434p;
            CrossfadeTransition crossfadeTransition = (CrossfadeTransition) create;
            int durationMillis = crossfadeTransition.getDurationMillis();
            if ((result instanceof SuccessResult) && ((SuccessResult) result).isPlaceholderCached()) {
                z = false;
            } else {
                z = true;
            }
            return new CrossfadePainter(painter, painter3, contentScale, durationMillis, z, crossfadeTransition.getPreferExactIntrinsicSize());
        }
        return null;
    }

    public final boolean isPreview$coil_compose_base_release() {
        return this.f40436r;
    }

    /* renamed from: j */
    public final void m51137j(float f) {
        this.f40428j.setValue(Float.valueOf(f));
    }

    /* renamed from: k */
    public final void m51136k(ColorFilter colorFilter) {
        this.f40429k.setValue(colorFilter);
    }

    /* renamed from: l */
    public final void m51135l(Painter painter) {
        this.f40427i.setValue(painter);
    }

    /* renamed from: m */
    public final void m51134m(State state) {
        this.f40437s.setValue(state);
    }

    /* renamed from: n */
    public final void m51133n(Painter painter) {
        this.f40431m = painter;
        m51135l(painter);
    }

    /* renamed from: o */
    public final void m51132o(State state) {
        this.f40430l = state;
        m51134m(state);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        RememberObserver rememberObserver;
        m51142e();
        Painter painter = this.f40431m;
        if (painter instanceof RememberObserver) {
            rememberObserver = (RememberObserver) painter;
        } else {
            rememberObserver = null;
        }
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
        }
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        this.f40426h.setValue(Size.m71559boximpl(drawScope.mo72144getSizeNHjbRc()));
        Painter m51139h = m51139h();
        if (m51139h != null) {
            m51139h.m72242drawx_KDEd0(drawScope, drawScope.mo72144getSizeNHjbRc(), m51141f(), m51140g());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        RememberObserver rememberObserver;
        m51142e();
        Painter painter = this.f40431m;
        if (painter instanceof RememberObserver) {
            rememberObserver = (RememberObserver) painter;
        } else {
            rememberObserver = null;
        }
        if (rememberObserver != null) {
            rememberObserver.onForgotten();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        RememberObserver rememberObserver;
        if (this.f40425g != null) {
            return;
        }
        Painter painter = null;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
        this.f40425g = CoroutineScope;
        Painter painter2 = this.f40431m;
        if (painter2 instanceof RememberObserver) {
            rememberObserver = (RememberObserver) painter2;
        } else {
            rememberObserver = null;
        }
        if (rememberObserver != null) {
            rememberObserver.onRemembered();
        }
        if (!this.f40436r) {
            AbstractC1552Vc.m65753e(CoroutineScope, null, null, new AsyncImagePainter$onRemembered$1(this, null), 3, null);
            return;
        }
        Drawable placeholder = ImageRequest.newBuilder$default(getRequest(), null, 1, null).defaults(getImageLoader().getDefaults()).build().getPlaceholder();
        if (placeholder != null) {
            painter = m51131p(placeholder);
        }
        m51128s(new State.Loading(painter));
    }

    /* renamed from: p */
    public final Painter m51131p(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return BitmapPainterKt.m72239BitmapPainterQZhYCtY$default(AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.f40435q, 6, null);
        }
        return new DrawablePainter(drawable.mutate());
    }

    /* renamed from: q */
    public final State m51130q(ImageResult imageResult) {
        Painter painter;
        if (imageResult instanceof SuccessResult) {
            SuccessResult successResult = (SuccessResult) imageResult;
            return new State.Success(m51131p(successResult.getDrawable()), successResult);
        } else if (imageResult instanceof ErrorResult) {
            Drawable drawable = imageResult.getDrawable();
            if (drawable != null) {
                painter = m51131p(drawable);
            } else {
                painter = null;
            }
            return new State.Error(painter, (ErrorResult) imageResult);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: r */
    public final ImageRequest m51129r(ImageRequest imageRequest) {
        ImageRequest.Builder target = ImageRequest.newBuilder$default(imageRequest, null, 1, null).target(new Target() { // from class: coil.compose.AsyncImagePainter$updateRequest$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable drawable) {
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable drawable) {
                Painter painter;
                AsyncImagePainter asyncImagePainter = AsyncImagePainter.this;
                if (drawable != null) {
                    painter = AsyncImagePainter.access$toPainter(AsyncImagePainter.this, drawable);
                } else {
                    painter = null;
                }
                AsyncImagePainter.access$updateState(asyncImagePainter, new AsyncImagePainter.State.Loading(painter));
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable drawable) {
            }
        });
        if (imageRequest.getDefined().getSizeResolver() == null) {
            target.size(new SizeResolver() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1
                @Override // coil.size.SizeResolver
                public final Object size(Continuation continuation) {
                    final MutableStateFlow access$getDrawSize$p = AsyncImagePainter.access$getDrawSize$p(AsyncImagePainter.this);
                    return FlowKt.first(new Flow<coil.size.Size>() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1

                        @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
                        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter$updateRequest$2$1\n*L\n1#1,222:1\n61#2:223\n62#2:225\n271#3:224\n*E\n"})
                        /* renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2 */
                        /* loaded from: classes3.dex */
                        public static final class C56392<T> implements FlowCollector {

                            /* renamed from: a */
                            public final /* synthetic */ FlowCollector f40447a;

                            @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
                            @DebugMetadata(m28801c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", m28800f = "AsyncImagePainter.kt", m28799i = {}, m28798l = {225}, m28797m = "emit", m28796n = {}, m28795s = {})
                            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                            /* renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 */
                            /* loaded from: classes3.dex */
                            public static final class C56401 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public C56401(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C56392.this.emit(null, this);
                                }
                            }

                            public C56392(FlowCollector flowCollector) {
                                this.f40447a = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            @org.jetbrains.annotations.Nullable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
                                /*
                                    r6 = this;
                                    boolean r0 = r8 instanceof coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.C56392.C56401
                                    if (r0 == 0) goto L13
                                    r0 = r8
                                    coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 r0 = (coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.C56392.C56401) r0
                                    int r1 = r0.label
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r1 & r2
                                    if (r3 == 0) goto L13
                                    int r1 = r1 - r2
                                    r0.label = r1
                                    goto L18
                                L13:
                                    coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 r0 = new coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1
                                    r0.<init>(r8)
                                L18:
                                    java.lang.Object r8 = r0.result
                                    java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
                                    int r2 = r0.label
                                    r3 = 1
                                    if (r2 == 0) goto L31
                                    if (r2 != r3) goto L29
                                    kotlin.ResultKt.throwOnFailure(r8)
                                    goto L4b
                                L29:
                                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                                    r7.<init>(r8)
                                    throw r7
                                L31:
                                    kotlin.ResultKt.throwOnFailure(r8)
                                    kotlinx.coroutines.flow.FlowCollector r8 = r6.f40447a
                                    androidx.compose.ui.geometry.Size r7 = (androidx.compose.p003ui.geometry.Size) r7
                                    long r4 = r7.m71576unboximpl()
                                    coil.size.Size r7 = coil.compose.AsyncImagePainterKt.m73955access$toSizeOrNulluvyYCjk(r4)
                                    if (r7 == 0) goto L4b
                                    r0.label = r3
                                    java.lang.Object r7 = r8.emit(r7, r0)
                                    if (r7 != r1) goto L4b
                                    return r1
                                L4b:
                                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                                    return r7
                                */
                                throw new UnsupportedOperationException("Method not decompiled: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1.C56392.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        @Nullable
                        public Object collect(@NotNull FlowCollector<? super coil.size.Size> flowCollector, @NotNull Continuation continuation2) {
                            Object collect = Flow.this.collect(new C56392(flowCollector), continuation2);
                            if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                                return collect;
                            }
                            return Unit.INSTANCE;
                        }
                    }, continuation);
                }
            });
        }
        if (imageRequest.getDefined().getScale() == null) {
            target.scale(UtilsKt.toScale(this.f40434p));
        }
        if (imageRequest.getDefined().getPrecision() != Precision.EXACT) {
            target.precision(Precision.INEXACT);
        }
        return target.build();
    }

    /* renamed from: s */
    public final void m51128s(State state) {
        RememberObserver rememberObserver;
        State state2 = this.f40430l;
        State state3 = (State) this.f40432n.invoke(state);
        m51132o(state3);
        Painter m51138i = m51138i(state2, state3);
        if (m51138i == null) {
            m51138i = state3.getPainter();
        }
        m51133n(m51138i);
        if (this.f40425g != null && state2.getPainter() != state3.getPainter()) {
            Painter painter = state2.getPainter();
            RememberObserver rememberObserver2 = null;
            if (painter instanceof RememberObserver) {
                rememberObserver = (RememberObserver) painter;
            } else {
                rememberObserver = null;
            }
            if (rememberObserver != null) {
                rememberObserver.onForgotten();
            }
            Painter painter2 = state3.getPainter();
            if (painter2 instanceof RememberObserver) {
                rememberObserver2 = (RememberObserver) painter2;
            }
            if (rememberObserver2 != null) {
                rememberObserver2.onRemembered();
            }
        }
        Function1 function1 = this.f40433o;
        if (function1 != null) {
            function1.invoke(state3);
        }
    }

    public final void setContentScale$coil_compose_base_release(@NotNull ContentScale contentScale) {
        this.f40434p = contentScale;
    }

    /* renamed from: setFilterQuality-vDHp3xo$coil_compose_base_release */
    public final void m73954setFilterQualityvDHp3xo$coil_compose_base_release(int i) {
        this.f40435q = i;
    }

    public final void setImageLoader$coil_compose_base_release(@NotNull ImageLoader imageLoader) {
        this.f40439u.setValue(imageLoader);
    }

    public final void setOnState$coil_compose_base_release(@Nullable Function1<? super State, Unit> function1) {
        this.f40433o = function1;
    }

    public final void setPreview$coil_compose_base_release(boolean z) {
        this.f40436r = z;
    }

    public final void setRequest$coil_compose_base_release(@NotNull ImageRequest imageRequest) {
        this.f40438t.setValue(imageRequest);
    }

    public final void setTransform$coil_compose_base_release(@NotNull Function1<? super State, ? extends State> function1) {
        this.f40432n = function1;
    }
}
