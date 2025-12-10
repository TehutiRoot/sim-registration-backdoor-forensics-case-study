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
    public final AndroidComposeView f30909a;

    /* renamed from: b */
    public final Composition f30910b;

    /* renamed from: c */
    public boolean f30911c;

    /* renamed from: d */
    public Lifecycle f30912d;

    /* renamed from: e */
    public Function2 f30913e;

    public WrappedComposition(AndroidComposeView owner, Composition original) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(original, "original");
        this.f30909a = owner;
        this.f30910b = original;
        this.f30913e = ComposableSingletons$Wrapper_androidKt.INSTANCE.m73208getLambda1$ui_release();
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        if (!this.f30911c) {
            this.f30911c = true;
            this.f30909a.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.f30912d;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.f30910b.dispose();
    }

    /* renamed from: e */
    public final Composition m59131e() {
        return this.f30910b;
    }

    /* renamed from: f */
    public final AndroidComposeView m59130f() {
        return this.f30909a;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        return this.f30910b.getHasInvalidations();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.f30910b.isDisposed();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else if (event == Lifecycle.Event.ON_CREATE && !this.f30911c) {
            setContent(this.f30913e);
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(Function2 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f30909a.setOnViewTreeOwnersAvailable(new WrappedComposition$setContent$1(this, content));
    }
}