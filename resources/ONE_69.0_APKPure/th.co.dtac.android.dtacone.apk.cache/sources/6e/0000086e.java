package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuationImpl;

/* renamed from: Iu */
/* loaded from: classes6.dex */
public final class C0619Iu {

    /* renamed from: a */
    public final Object f2834a;

    /* renamed from: b */
    public final CancelHandler f2835b;

    /* renamed from: c */
    public final Function1 f2836c;

    /* renamed from: d */
    public final Object f2837d;

    /* renamed from: e */
    public final Throwable f2838e;

    public C0619Iu(Object obj, CancelHandler cancelHandler, Function1 function1, Object obj2, Throwable th2) {
        this.f2834a = obj;
        this.f2835b = cancelHandler;
        this.f2836c = function1;
        this.f2837d = obj2;
        this.f2838e = th2;
    }

    /* renamed from: b */
    public static /* synthetic */ C0619Iu m67951b(C0619Iu c0619Iu, Object obj, CancelHandler cancelHandler, Function1 function1, Object obj2, Throwable th2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = c0619Iu.f2834a;
        }
        if ((i & 2) != 0) {
            cancelHandler = c0619Iu.f2835b;
        }
        CancelHandler cancelHandler2 = cancelHandler;
        if ((i & 4) != 0) {
            function1 = c0619Iu.f2836c;
        }
        Function1 function12 = function1;
        if ((i & 8) != 0) {
            obj2 = c0619Iu.f2837d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th2 = c0619Iu.f2838e;
        }
        return c0619Iu.m67952a(obj, cancelHandler2, function12, obj4, th2);
    }

    /* renamed from: a */
    public final C0619Iu m67952a(Object obj, CancelHandler cancelHandler, Function1 function1, Object obj2, Throwable th2) {
        return new C0619Iu(obj, cancelHandler, function1, obj2, th2);
    }

    /* renamed from: c */
    public final boolean m67950c() {
        if (this.f2838e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m67949d(CancellableContinuationImpl cancellableContinuationImpl, Throwable th2) {
        CancelHandler cancelHandler = this.f2835b;
        if (cancelHandler != null) {
            cancellableContinuationImpl.callCancelHandler(cancelHandler, th2);
        }
        Function1<? super Throwable, Unit> function1 = this.f2836c;
        if (function1 != null) {
            cancellableContinuationImpl.callOnCancellation(function1, th2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0619Iu)) {
            return false;
        }
        C0619Iu c0619Iu = (C0619Iu) obj;
        if (Intrinsics.areEqual(this.f2834a, c0619Iu.f2834a) && Intrinsics.areEqual(this.f2835b, c0619Iu.f2835b) && Intrinsics.areEqual(this.f2836c, c0619Iu.f2836c) && Intrinsics.areEqual(this.f2837d, c0619Iu.f2837d) && Intrinsics.areEqual(this.f2838e, c0619Iu.f2838e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Object obj = this.f2834a;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        CancelHandler cancelHandler = this.f2835b;
        if (cancelHandler == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cancelHandler.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Function1 function1 = this.f2836c;
        if (function1 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = function1.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Object obj2 = this.f2837d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Throwable th2 = this.f2838e;
        if (th2 != null) {
            i = th2.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f2834a + ", cancelHandler=" + this.f2835b + ", onCancellation=" + this.f2836c + ", idempotentResume=" + this.f2837d + ", cancelCause=" + this.f2838e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ C0619Iu(Object obj, CancelHandler cancelHandler, Function1 function1, Object obj2, Throwable th2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : cancelHandler, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th2);
    }
}