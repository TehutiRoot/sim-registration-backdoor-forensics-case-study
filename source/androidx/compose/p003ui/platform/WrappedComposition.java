package androidx.compose.p003ui.platform;

import androidx.compose.p003ui.R;
import androidx.compose.runtime.Composition;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.platform.WrappedComposition */
/* loaded from: classes2.dex */
public final class WrappedComposition implements Composition, LifecycleEventObserver {

    /* renamed from: a */
    public final AndroidComposeView f30821a;

    /* renamed from: b */
    public final Composition f30822b;

    /* renamed from: c */
    public boolean f30823c;

    /* renamed from: d */
    public Lifecycle f30824d;

    /* renamed from: e */
    public Function2 f30825e;

    public WrappedComposition(AndroidComposeView owner, Composition original) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(original, "original");
        this.f30821a = owner;
        this.f30822b = original;
        this.f30825e = ComposableSingletons$Wrapper_androidKt.INSTANCE.m73024getLambda1$ui_release();
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        if (!this.f30823c) {
            this.f30823c = true;
            this.f30821a.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.f30824d;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.f30822b.dispose();
    }

    /* renamed from: e */
    public final Composition m59181e() {
        return this.f30822b;
    }

    /* renamed from: f */
    public final AndroidComposeView m59180f() {
        return this.f30821a;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        return this.f30822b.getHasInvalidations();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.f30822b.isDisposed();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else if (event == Lifecycle.Event.ON_CREATE && !this.f30823c) {
            setContent(this.f30825e);
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(Function2 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f30821a.setOnViewTreeOwnersAvailable(new WrappedComposition$setContent$1(this, content));
    }
}
