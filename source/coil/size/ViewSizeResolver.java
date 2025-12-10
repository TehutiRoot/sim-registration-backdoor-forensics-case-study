package coil.size;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import coil.size.Dimension;
import coil.size.ViewSizeResolver;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\"\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0002J\u0011\u0010\u0015\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0003"}, m28850d2 = {"Lcoil/size/ViewSizeResolver;", "T", "Landroid/view/View;", "Lcoil/size/SizeResolver;", "subtractPadding", "", "getSubtractPadding", "()Z", Promotion.ACTION_VIEW, "getView", "()Landroid/view/View;", "getDimension", "Lcoil/size/Dimension;", "paramSize", "", "viewSize", "paddingSize", "getHeight", "getSize", "Lcoil/size/Size;", "getWidth", "size", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removePreDrawListenerSafe", "", "Landroid/view/ViewTreeObserver;", "victim", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nViewSizeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewSizeResolver.kt\ncoil/size/ViewSizeResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,118:1\n1#2:119\n314#3,11:120\n*S KotlinDebug\n*F\n+ 1 ViewSizeResolver.kt\ncoil/size/ViewSizeResolver\n*L\n42#1:120,11\n*E\n"})
/* loaded from: classes3.dex */
public interface ViewSizeResolver<T extends View> extends SizeResolver {

    /* renamed from: coil.size.ViewSizeResolver$-CC */
    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class CC {
        /* renamed from: a */
        public static boolean m51032a(ViewSizeResolver viewSizeResolver) {
            return true;
        }

        /* renamed from: b */
        public static Object m51031b(ViewSizeResolver viewSizeResolver, Continuation continuation) {
            return m51021l(viewSizeResolver, continuation);
        }

        /* renamed from: c */
        public static Dimension m51030c(ViewSizeResolver viewSizeResolver, int i, int i2, int i3) {
            if (i == -2) {
                return Dimension.Undefined.INSTANCE;
            }
            int i4 = i - i3;
            if (i4 > 0) {
                return Dimensions.Dimension(i4);
            }
            int i5 = i2 - i3;
            if (i5 > 0) {
                return Dimensions.Dimension(i5);
            }
            return null;
        }

        /* renamed from: d */
        public static Dimension m51029d(ViewSizeResolver viewSizeResolver) {
            int i;
            int i2;
            ViewGroup.LayoutParams layoutParams = viewSizeResolver.getView().getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = -1;
            }
            int height = viewSizeResolver.getView().getHeight();
            if (viewSizeResolver.getSubtractPadding()) {
                i2 = viewSizeResolver.getView().getPaddingTop() + viewSizeResolver.getView().getPaddingBottom();
            } else {
                i2 = 0;
            }
            return m51030c(viewSizeResolver, i, height, i2);
        }

        /* renamed from: e */
        public static Size m51028e(ViewSizeResolver viewSizeResolver) {
            Dimension m51029d;
            Dimension m51027f = m51027f(viewSizeResolver);
            if (m51027f == null || (m51029d = m51029d(viewSizeResolver)) == null) {
                return null;
            }
            return new Size(m51027f, m51029d);
        }

        /* renamed from: f */
        public static Dimension m51027f(ViewSizeResolver viewSizeResolver) {
            int i;
            int i2;
            ViewGroup.LayoutParams layoutParams = viewSizeResolver.getView().getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = -1;
            }
            int width = viewSizeResolver.getView().getWidth();
            if (viewSizeResolver.getSubtractPadding()) {
                i2 = viewSizeResolver.getView().getPaddingLeft() + viewSizeResolver.getView().getPaddingRight();
            } else {
                i2 = 0;
            }
            return m51030c(viewSizeResolver, i, width, i2);
        }

        /* renamed from: g */
        public static void m51026g(ViewSizeResolver viewSizeResolver, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } else {
                viewSizeResolver.getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }

        /* renamed from: h */
        public static /* synthetic */ Size m51025h(ViewSizeResolver viewSizeResolver) {
            return m51028e(viewSizeResolver);
        }

        /* renamed from: j */
        public static /* synthetic */ void m51023j(ViewSizeResolver viewSizeResolver, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            m51026g(viewSizeResolver, viewTreeObserver, onPreDrawListener);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, coil.size.ViewSizeResolver$size$3$preDrawListener$1] */
        /* renamed from: l */
        public static /* synthetic */ Object m51021l(final ViewSizeResolver viewSizeResolver, Continuation continuation) {
            Size m51028e = m51028e(viewSizeResolver);
            if (m51028e != null) {
                return m51028e;
            }
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            final ViewTreeObserver viewTreeObserver = viewSizeResolver.getView().getViewTreeObserver();
            ?? r2 = new ViewTreeObserver.OnPreDrawListener() { // from class: coil.size.ViewSizeResolver$size$3$preDrawListener$1

                /* renamed from: a */
                public boolean f40834a;

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    Size m51025h = ViewSizeResolver.CC.m51025h(ViewSizeResolver.this);
                    if (m51025h != null) {
                        ViewSizeResolver.CC.m51023j(ViewSizeResolver.this, viewTreeObserver, this);
                        if (!this.f40834a) {
                            this.f40834a = true;
                            cancellableContinuationImpl.resumeWith(Result.m74087constructorimpl(m51025h));
                        }
                    }
                    return true;
                }
            };
            viewTreeObserver.addOnPreDrawListener(r2);
            cancellableContinuationImpl.invokeOnCancellation(new ViewSizeResolver$size$3$1(viewSizeResolver, viewTreeObserver, r2));
            Object result = cancellableContinuationImpl.getResult();
            if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(continuation);
            }
            return result;
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T extends View> boolean getSubtractPadding(@NotNull ViewSizeResolver<T> viewSizeResolver) {
            return CC.m51032a(viewSizeResolver);
        }

        @Deprecated
        @Nullable
        public static <T extends View> Object size(@NotNull ViewSizeResolver<T> viewSizeResolver, @NotNull Continuation<? super Size> continuation) {
            return CC.m51031b(viewSizeResolver, continuation);
        }
    }

    boolean getSubtractPadding();

    @NotNull
    T getView();

    @Override // coil.size.SizeResolver
    @Nullable
    Object size(@NotNull Continuation<? super Size> continuation);
}
