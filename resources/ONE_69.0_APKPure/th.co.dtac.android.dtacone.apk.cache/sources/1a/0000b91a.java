package com.jakewharton.rxbinding3.view;

import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.RequiresApi;
import com.jakewharton.rxbinding3.InitialValueObservable;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"gD1", "hD1", "iD1", "jD1", "kD1", "lD1", "mD1", "nD1", "oD1", "pD1", "qD1", "rD1", "sD1", "tD1", "uD1", "vD1", "wD1"}, m29142d2 = {}, m29141k = 4, m29140mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class RxView {
    @CheckResult
    @NotNull
    public static final Observable<ViewAttachEvent> attachEvents(@NotNull View view) {
        return AbstractC20055gD1.m31430a(view);
    }

    @CheckResult
    @NotNull
    public static final Observable<Unit> attaches(@NotNull View view) {
        return AbstractC20228hD1.m31271a(view);
    }

    @CheckResult
    @NotNull
    public static final Observable<Unit> clicks(@NotNull View view) {
        return AbstractC20401iD1.m31030a(view);
    }

    @CheckResult
    @NotNull
    public static final Observable<Unit> detaches(@NotNull View view) {
        return AbstractC20228hD1.m31270b(view);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<DragEvent> drags(@NotNull View view) {
        return AbstractC20574jD1.m29604b(view, null, 1, null);
    }

    @CheckResult
    @RequiresApi(16)
    @NotNull
    public static final Observable<Unit> draws(@NotNull View view) {
        return AbstractC22304tD1.m22722a(view);
    }

    @CheckResult
    @NotNull
    public static final InitialValueObservable<Boolean> focusChanges(@NotNull View view) {
        return AbstractC20747kD1.m29270a(view);
    }

    @CheckResult
    @NotNull
    public static final Observable<Unit> globalLayouts(@NotNull View view) {
        return AbstractC22477uD1.m1245a(view);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<MotionEvent> hovers(@NotNull View view) {
        return AbstractC20920lD1.m26845b(view, null, 1, null);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<KeyEvent> keys(@NotNull View view) {
        return AbstractC21093mD1.m26726b(view, null, 1, null);
    }

    @CheckResult
    @NotNull
    public static final Observable<ViewLayoutChangeEvent> layoutChangeEvents(@NotNull View view) {
        return AbstractC21266nD1.m26444a(view);
    }

    @CheckResult
    @NotNull
    public static final Observable<Unit> layoutChanges(@NotNull View view) {
        return AbstractC21439oD1.m26145a(view);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<Unit> longClicks(@NotNull View view) {
        return AbstractC21612pD1.m23878b(view, null, 1, null);
    }

    @CheckResult
    @NotNull
    public static final Observable<Unit> preDraws(@NotNull View view, @NotNull Function0<Boolean> function0) {
        return AbstractC22650vD1.m944a(view, function0);
    }

    @CheckResult
    @RequiresApi(23)
    @NotNull
    public static final Observable<ViewScrollChangeEvent> scrollChangeEvents(@NotNull View view) {
        return AbstractC21785qD1.m23686a(view);
    }

    @CheckResult
    @NotNull
    public static final Observable<Integer> systemUiVisibilityChanges(@NotNull View view) {
        return AbstractC21958rD1.m23538a(view);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<MotionEvent> touches(@NotNull View view) {
        return AbstractC22131sD1.m22856b(view, null, 1, null);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Consumer<? super Boolean> visibility(@NotNull View view) {
        return AbstractC22823wD1.m791b(view, 0, 1, null);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<DragEvent> drags(@NotNull View view, @NotNull Function1<? super DragEvent, Boolean> function1) {
        return AbstractC20574jD1.m29605a(view, function1);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<MotionEvent> hovers(@NotNull View view, @NotNull Function1<? super MotionEvent, Boolean> function1) {
        return AbstractC20920lD1.m26846a(view, function1);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<KeyEvent> keys(@NotNull View view, @NotNull Function1<? super KeyEvent, Boolean> function1) {
        return AbstractC21093mD1.m26727a(view, function1);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<Unit> longClicks(@NotNull View view, @NotNull Function0<Boolean> function0) {
        return AbstractC21612pD1.m23879a(view, function0);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<MotionEvent> touches(@NotNull View view, @NotNull Function1<? super MotionEvent, Boolean> function1) {
        return AbstractC22131sD1.m22857a(view, function1);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Consumer<? super Boolean> visibility(@NotNull View view, int i) {
        return AbstractC22823wD1.m792a(view, i);
    }
}