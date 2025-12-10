package coil.transition;

import android.graphics.drawable.Drawable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import coil.decode.DataSource;
import coil.drawable.CrossfadeDrawable;
import coil.request.ErrorResult;
import coil.request.ImageResult;
import coil.request.SuccessResult;
import coil.size.Scale;
import coil.transition.Transition;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u001bB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m28850d2 = {"Lcoil/transition/CrossfadeTransition;", "Lcoil/transition/Transition;", "Lcoil/transition/TransitionTarget;", TypedValues.AttributesType.S_TARGET, "Lcoil/request/ImageResult;", "result", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(Lcoil/transition/TransitionTarget;Lcoil/request/ImageResult;IZ)V", "", "transition", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcoil/transition/TransitionTarget;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/request/ImageResult;", OperatorName.CURVE_TO, "I", "getDurationMillis", "()I", "d", "Z", "getPreferExactIntrinsicSize", "()Z", "Factory", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCrossfadeTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadeTransition.kt\ncoil/transition/CrossfadeTransition\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
/* loaded from: classes3.dex */
public final class CrossfadeTransition implements Transition {

    /* renamed from: a */
    public final TransitionTarget f40846a;

    /* renamed from: b */
    public final ImageResult f40847b;

    /* renamed from: c */
    public final int f40848c;

    /* renamed from: d */
    public final boolean f40849d;

    @Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m28850d2 = {"Lcoil/transition/CrossfadeTransition$Factory;", "Lcoil/transition/Transition$Factory;", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(IZ)V", "Lcoil/transition/TransitionTarget;", TypedValues.AttributesType.S_TARGET, "Lcoil/request/ImageResult;", "result", "Lcoil/transition/Transition;", "create", "(Lcoil/transition/TransitionTarget;Lcoil/request/ImageResult;)Lcoil/transition/Transition;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getDurationMillis", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "getPreferExactIntrinsicSize", "()Z", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCrossfadeTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadeTransition.kt\ncoil/transition/CrossfadeTransition$Factory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class Factory implements Transition.Factory {

        /* renamed from: a */
        public final int f40850a;

        /* renamed from: b */
        public final boolean f40851b;

        @JvmOverloads
        public Factory() {
            this(0, false, 3, null);
        }

        @Override // coil.transition.Transition.Factory
        @NotNull
        public Transition create(@NotNull TransitionTarget transitionTarget, @NotNull ImageResult imageResult) {
            if (!(imageResult instanceof SuccessResult)) {
                return Transition.Factory.NONE.create(transitionTarget, imageResult);
            }
            if (((SuccessResult) imageResult).getDataSource() == DataSource.MEMORY_CACHE) {
                return Transition.Factory.NONE.create(transitionTarget, imageResult);
            }
            return new CrossfadeTransition(transitionTarget, imageResult, this.f40850a, this.f40851b);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Factory) {
                Factory factory = (Factory) obj;
                if (this.f40850a == factory.f40850a && this.f40851b == factory.f40851b) {
                    return true;
                }
            }
            return false;
        }

        public final int getDurationMillis() {
            return this.f40850a;
        }

        public final boolean getPreferExactIntrinsicSize() {
            return this.f40851b;
        }

        public int hashCode() {
            return (this.f40850a * 31) + AbstractC1705Xp.m65430a(this.f40851b);
        }

        @JvmOverloads
        public Factory(int i) {
            this(i, false, 2, null);
        }

        @JvmOverloads
        public Factory(int i, boolean z) {
            this.f40850a = i;
            this.f40851b = z;
            if (i <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.".toString());
            }
        }

        public /* synthetic */ Factory(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 100 : i, (i2 & 2) != 0 ? false : z);
        }
    }

    @JvmOverloads
    public CrossfadeTransition(@NotNull TransitionTarget transitionTarget, @NotNull ImageResult imageResult) {
        this(transitionTarget, imageResult, 0, false, 12, null);
    }

    public final int getDurationMillis() {
        return this.f40848c;
    }

    public final boolean getPreferExactIntrinsicSize() {
        return this.f40849d;
    }

    @Override // coil.transition.Transition
    public void transition() {
        boolean z;
        Drawable drawable = this.f40846a.getDrawable();
        Drawable drawable2 = this.f40847b.getDrawable();
        Scale scale = this.f40847b.getRequest().getScale();
        int i = this.f40848c;
        ImageResult imageResult = this.f40847b;
        if ((imageResult instanceof SuccessResult) && ((SuccessResult) imageResult).isPlaceholderCached()) {
            z = false;
        } else {
            z = true;
        }
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawable, drawable2, scale, i, z, this.f40849d);
        ImageResult imageResult2 = this.f40847b;
        if (imageResult2 instanceof SuccessResult) {
            this.f40846a.onSuccess(crossfadeDrawable);
        } else if (imageResult2 instanceof ErrorResult) {
            this.f40846a.onError(crossfadeDrawable);
        }
    }

    @JvmOverloads
    public CrossfadeTransition(@NotNull TransitionTarget transitionTarget, @NotNull ImageResult imageResult, int i) {
        this(transitionTarget, imageResult, i, false, 8, null);
    }

    @JvmOverloads
    public CrossfadeTransition(@NotNull TransitionTarget transitionTarget, @NotNull ImageResult imageResult, int i, boolean z) {
        this.f40846a = transitionTarget;
        this.f40847b = imageResult;
        this.f40848c = i;
        this.f40849d = z;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    public /* synthetic */ CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(transitionTarget, imageResult, (i2 & 4) != 0 ? 100 : i, (i2 & 8) != 0 ? false : z);
    }
}
