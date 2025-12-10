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

@Metadata(m28851d1 = {"jC1", "kC1", "lC1", "mC1", "nC1", "oC1", "pC1", "qC1", "rC1", "sC1", "tC1", "uC1", "vC1", "wC1", "xC1", "yC1", "zC1"}, m28850d2 = {}, m28849k = 4, m28848mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class RxView {
    @CheckResult
    @NotNull
    public static final Observable<ViewAttachEvent> attachEvents(@NotNull View view) {
        return AbstractC20516jC1.m29280a(view);
    }

    @CheckResult
    @NotNull
    public static final Observable<Unit> attaches(@NotNull View view) {
        return AbstractC20688kC1.m28985a(view);
    }

    @CheckResult
    @NotNull
    public static final Observable<Unit> clicks(@NotNull View view) {
        return AbstractC20860lC1.m26553a(view);
    }

    @CheckResult
    @NotNull
    public static final Observable<Unit> detaches(@NotNull View view) {
        return AbstractC20688kC1.m28984b(view);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<DragEvent> drags(@NotNull View view) {
        return AbstractC21032mC1.m26370b(view, null, 1, null);
    }

    @CheckResult
    @RequiresApi(16)
    @NotNull
    public static final Observable<Unit> draws(@NotNull View view) {
        return AbstractC22752wC1.m896a(view);
    }

    @CheckResult
    @NotNull
    public static final InitialValueObservable<Boolean> focusChanges(@NotNull View view) {
        return AbstractC21204nC1.m26155a(view);
    }

    @CheckResult
    @NotNull
    public static final Observable<Unit> globalLayouts(@NotNull View view) {
        return AbstractC22924xC1.m594a(view);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<MotionEvent> hovers(@NotNull View view) {
        return AbstractC21376oC1.m25946b(view, null, 1, null);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<KeyEvent> keys(@NotNull View view) {
        return AbstractC21548pC1.m23721b(view, null, 1, null);
    }

    @CheckResult
    @NotNull
    public static final Observable<ViewLayoutChangeEvent> layoutChangeEvents(@NotNull View view) {
        return AbstractC21720qC1.m23527a(view);
    }

    @CheckResult
    @NotNull
    public static final Observable<Unit> layoutChanges(@NotNull View view) {
        return AbstractC21892rC1.m23354a(view);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<Unit> longClicks(@NotNull View view) {
        return AbstractC22064sC1.m22655b(view, null, 1, null);
    }

    @CheckResult
    @NotNull
    public static final Observable<Unit> preDraws(@NotNull View view, @NotNull Function0<Boolean> function0) {
        return AbstractC23096yC1.m325a(view, function0);
    }

    @CheckResult
    @RequiresApi(23)
    @NotNull
    public static final Observable<ViewScrollChangeEvent> scrollChangeEvents(@NotNull View view) {
        return AbstractC22236tC1.m22488a(view);
    }

    @CheckResult
    @NotNull
    public static final Observable<Integer> systemUiVisibilityChanges(@NotNull View view) {
        return AbstractC22408uC1.m1312a(view);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<MotionEvent> touches(@NotNull View view) {
        return AbstractC22580vC1.m1094b(view, null, 1, null);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Consumer<? super Boolean> visibility(@NotNull View view) {
        return AbstractC23268zC1.m126b(view, 0, 1, null);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<DragEvent> drags(@NotNull View view, @NotNull Function1<? super DragEvent, Boolean> function1) {
        return AbstractC21032mC1.m26371a(view, function1);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<MotionEvent> hovers(@NotNull View view, @NotNull Function1<? super MotionEvent, Boolean> function1) {
        return AbstractC21376oC1.m25947a(view, function1);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<KeyEvent> keys(@NotNull View view, @NotNull Function1<? super KeyEvent, Boolean> function1) {
        return AbstractC21548pC1.m23722a(view, function1);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<Unit> longClicks(@NotNull View view, @NotNull Function0<Boolean> function0) {
        return AbstractC22064sC1.m22656a(view, function0);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<MotionEvent> touches(@NotNull View view, @NotNull Function1<? super MotionEvent, Boolean> function1) {
        return AbstractC22580vC1.m1095a(view, function1);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Consumer<? super Boolean> visibility(@NotNull View view, int i) {
        return AbstractC23268zC1.m127a(view, i);
    }
}
