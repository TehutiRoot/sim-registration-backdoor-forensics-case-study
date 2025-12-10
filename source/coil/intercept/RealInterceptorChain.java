package coil.intercept;

import coil.EventListener;
import coil.intercept.Interceptor;
import coil.request.ImageRequest;
import coil.request.NullRequestData;
import coil.size.Size;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u000f\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, m28850d2 = {"Lcoil/intercept/RealInterceptorChain;", "Lcoil/intercept/Interceptor$Chain;", "Lcoil/request/ImageRequest;", "initialRequest", "", "Lcoil/intercept/Interceptor;", "interceptors", "", FirebaseAnalytics.Param.INDEX, "request", "Lcoil/size/Size;", "size", "Lcoil/EventListener;", "eventListener", "", "isPlaceholderCached", "<init>", "(Lcoil/request/ImageRequest;Ljava/util/List;ILcoil/request/ImageRequest;Lcoil/size/Size;Lcoil/EventListener;Z)V", "withSize", "(Lcoil/size/Size;)Lcoil/intercept/RealInterceptorChain;", "Lcoil/request/ImageResult;", "proceed", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "interceptor", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lcoil/request/ImageRequest;Lcoil/intercept/Interceptor;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(ILcoil/request/ImageRequest;Lcoil/size/Size;)Lcoil/intercept/RealInterceptorChain;", "Lcoil/request/ImageRequest;", "getInitialRequest", "()Lcoil/request/ImageRequest;", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", OperatorName.CURVE_TO, "I", "getIndex", "()I", "d", "getRequest", "e", "Lcoil/size/Size;", "getSize", "()Lcoil/size/Size;", OperatorName.FILL_NON_ZERO, "Lcoil/EventListener;", "getEventListener", "()Lcoil/EventListener;", OperatorName.NON_STROKING_GRAY, "Z", "()Z", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a */
    public final ImageRequest f40602a;

    /* renamed from: b */
    public final List f40603b;

    /* renamed from: c */
    public final int f40604c;

    /* renamed from: d */
    public final ImageRequest f40605d;

    /* renamed from: e */
    public final Size f40606e;

    /* renamed from: f */
    public final EventListener f40607f;

    /* renamed from: g */
    public final boolean f40608g;

    public RealInterceptorChain(@NotNull ImageRequest imageRequest, @NotNull List<? extends Interceptor> list, int i, @NotNull ImageRequest imageRequest2, @NotNull Size size, @NotNull EventListener eventListener, boolean z) {
        this.f40602a = imageRequest;
        this.f40603b = list;
        this.f40604c = i;
        this.f40605d = imageRequest2;
        this.f40606e = size;
        this.f40607f = eventListener;
        this.f40608g = z;
    }

    /* renamed from: c */
    public static /* synthetic */ RealInterceptorChain m51058c(RealInterceptorChain realInterceptorChain, int i, ImageRequest imageRequest, Size size, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = realInterceptorChain.f40604c;
        }
        if ((i2 & 2) != 0) {
            imageRequest = realInterceptorChain.getRequest();
        }
        if ((i2 & 4) != 0) {
            size = realInterceptorChain.getSize();
        }
        return realInterceptorChain.m51059b(i, imageRequest, size);
    }

    /* renamed from: a */
    public final void m51060a(ImageRequest imageRequest, Interceptor interceptor) {
        if (imageRequest.getContext() == this.f40602a.getContext()) {
            if (imageRequest.getData() != NullRequestData.INSTANCE) {
                if (imageRequest.getTarget() == this.f40602a.getTarget()) {
                    if (imageRequest.getLifecycle() == this.f40602a.getLifecycle()) {
                        if (imageRequest.getSizeResolver() == this.f40602a.getSizeResolver()) {
                            return;
                        }
                        throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
                    }
                    throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's lifecycle.").toString());
                }
                throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's target.").toString());
            }
            throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot set the request's data to null.").toString());
        }
        throw new IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's context.").toString());
    }

    /* renamed from: b */
    public final RealInterceptorChain m51059b(int i, ImageRequest imageRequest, Size size) {
        return new RealInterceptorChain(this.f40602a, this.f40603b, i, imageRequest, size, this.f40607f, this.f40608g);
    }

    @NotNull
    public final EventListener getEventListener() {
        return this.f40607f;
    }

    public final int getIndex() {
        return this.f40604c;
    }

    @NotNull
    public final ImageRequest getInitialRequest() {
        return this.f40602a;
    }

    @NotNull
    public final List<Interceptor> getInterceptors() {
        return this.f40603b;
    }

    @Override // coil.intercept.Interceptor.Chain
    @NotNull
    public ImageRequest getRequest() {
        return this.f40605d;
    }

    @Override // coil.intercept.Interceptor.Chain
    @NotNull
    public Size getSize() {
        return this.f40606e;
    }

    public final boolean isPlaceholderCached() {
        return this.f40608g;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // coil.intercept.Interceptor.Chain
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object proceed(@org.jetbrains.annotations.NotNull coil.request.ImageRequest r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super coil.request.ImageResult> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof coil.intercept.RealInterceptorChain$proceed$1
            if (r0 == 0) goto L13
            r0 = r13
            coil.intercept.RealInterceptorChain$proceed$1 r0 = (coil.intercept.RealInterceptorChain$proceed$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil.intercept.RealInterceptorChain$proceed$1 r0 = new coil.intercept.RealInterceptorChain$proceed$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r12 = r0.L$1
            coil.intercept.Interceptor r12 = (coil.intercept.Interceptor) r12
            java.lang.Object r0 = r0.L$0
            coil.intercept.RealInterceptorChain r0 = (coil.intercept.RealInterceptorChain) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto L74
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            kotlin.ResultKt.throwOnFailure(r13)
            int r13 = r11.f40604c
            if (r13 <= 0) goto L4c
            java.util.List r2 = r11.f40603b
            int r13 = r13 - r3
            java.lang.Object r13 = r2.get(r13)
            coil.intercept.Interceptor r13 = (coil.intercept.Interceptor) r13
            r11.m51060a(r12, r13)
        L4c:
            java.util.List r13 = r11.f40603b
            int r2 = r11.f40604c
            java.lang.Object r13 = r13.get(r2)
            coil.intercept.Interceptor r13 = (coil.intercept.Interceptor) r13
            int r2 = r11.f40604c
            int r5 = r2 + 1
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r11
            r6 = r12
            coil.intercept.RealInterceptorChain r12 = m51058c(r4, r5, r6, r7, r8, r9)
            r0.L$0 = r11
            r0.L$1 = r13
            r0.label = r3
            java.lang.Object r12 = r13.intercept(r12, r0)
            if (r12 != r1) goto L70
            return r1
        L70:
            r0 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L74:
            coil.request.ImageResult r13 = (coil.request.ImageResult) r13
            coil.request.ImageRequest r1 = r13.getRequest()
            r0.m51060a(r1, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.RealInterceptorChain.proceed(coil.request.ImageRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // coil.intercept.Interceptor.Chain
    @NotNull
    public RealInterceptorChain withSize(@NotNull Size size) {
        return m51058c(this, 0, null, size, 3, null);
    }
}
