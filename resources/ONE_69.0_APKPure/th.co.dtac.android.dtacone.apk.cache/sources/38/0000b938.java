package com.jakewharton.rxbinding3.widget;

import android.widget.TextView;
import androidx.annotation.CheckResult;
import com.jakewharton.rxbinding3.InitialValueObservable;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"SC1", "TC1", "UC1", "VC1", "WC1", "XC1"}, m29142d2 = {}, m29141k = 4, m29140mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class RxTextView {
    @CheckResult
    @NotNull
    public static final InitialValueObservable<TextViewAfterTextChangeEvent> afterTextChangeEvents(@NotNull TextView textView) {
        return SC1.m66530a(textView);
    }

    @CheckResult
    @NotNull
    public static final InitialValueObservable<TextViewBeforeTextChangeEvent> beforeTextChangeEvents(@NotNull TextView textView) {
        return TC1.m66365a(textView);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<TextViewEditorActionEvent> editorActionEvents(@NotNull TextView textView) {
        return UC1.m66227b(textView, null, 1, null);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<Integer> editorActions(@NotNull TextView textView) {
        return VC1.m66023b(textView, null, 1, null);
    }

    @CheckResult
    @NotNull
    public static final InitialValueObservable<TextViewTextChangeEvent> textChangeEvents(@NotNull TextView textView) {
        return WC1.m65794a(textView);
    }

    @CheckResult
    @NotNull
    public static final InitialValueObservable<CharSequence> textChanges(@NotNull TextView textView) {
        return XC1.m65624a(textView);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<TextViewEditorActionEvent> editorActionEvents(@NotNull TextView textView, @NotNull Function1<? super TextViewEditorActionEvent, Boolean> function1) {
        return UC1.m66228a(textView, function1);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public static final Observable<Integer> editorActions(@NotNull TextView textView, @NotNull Function1<? super Integer, Boolean> function1) {
        return VC1.m66024a(textView, function1);
    }
}