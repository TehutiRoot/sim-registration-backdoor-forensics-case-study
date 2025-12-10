package androidx.navigation.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$PopulateVisibleList$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,120:1\n63#2,5:121\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$PopulateVisibleList$1$1\n*L\n93#1:121,5\n*E\n"})
/* loaded from: classes2.dex */
public final class DialogHostKt$PopulateVisibleList$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ NavBackStackEntry $entry;
    final /* synthetic */ boolean $isInspecting;
    final /* synthetic */ List<NavBackStackEntry> $this_PopulateVisibleList;

    /* renamed from: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$1$1$a */
    /* loaded from: classes2.dex */
    public static final class C4819a implements LifecycleEventObserver {

        /* renamed from: a */
        public final /* synthetic */ boolean f36414a;

        /* renamed from: b */
        public final /* synthetic */ List f36415b;

        /* renamed from: c */
        public final /* synthetic */ NavBackStackEntry f36416c;

        public C4819a(boolean z, List list, NavBackStackEntry navBackStackEntry) {
            this.f36414a = z;
            this.f36415b = list;
            this.f36416c = navBackStackEntry;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (this.f36414a && !this.f36415b.contains(this.f36416c)) {
                this.f36415b.add(this.f36416c);
            }
            if (event == Lifecycle.Event.ON_START && !this.f36415b.contains(this.f36416c)) {
                this.f36415b.add(this.f36416c);
            }
            if (event == Lifecycle.Event.ON_STOP) {
                this.f36415b.remove(this.f36416c);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$PopulateVisibleList$1$1(NavBackStackEntry navBackStackEntry, boolean z, List<NavBackStackEntry> list) {
        super(1);
        this.$entry = navBackStackEntry;
        this.$isInspecting = z;
        this.$this_PopulateVisibleList = list;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        final C4819a c4819a = new C4819a(this.$isInspecting, this.$this_PopulateVisibleList, this.$entry);
        this.$entry.getLifecycle().addObserver(c4819a);
        final NavBackStackEntry navBackStackEntry = this.$entry;
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                NavBackStackEntry.this.getLifecycle().removeObserver(c4819a);
            }
        };
    }
}
