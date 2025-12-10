package com.chuckerteam.chucker.internal.support;

import android.content.Context;
import android.content.DialogInterface;
import com.chuckerteam.chucker.internal.data.model.DialogData;
import com.chuckerteam.chucker.internal.support.ContextExtKt;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H\u0000¨\u0006\b"}, m28850d2 = {"showDialog", "", "Landroid/content/Context;", "dialogData", "Lcom/chuckerteam/chucker/internal/data/model/DialogData;", "onPositiveClick", "Lkotlin/Function0;", "onNegativeClick", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class ContextExtKt {
    /* renamed from: a */
    public static /* synthetic */ void m49932a(Function0 function0, DialogInterface dialogInterface, int i) {
        m49929d(function0, dialogInterface, i);
    }

    /* renamed from: b */
    public static /* synthetic */ void m49931b(Function0 function0, DialogInterface dialogInterface, int i) {
        m49930c(function0, dialogInterface, i);
    }

    /* renamed from: c */
    public static final void m49930c(Function0 function0, DialogInterface dialogInterface, int i) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* renamed from: d */
    public static final void m49929d(Function0 function0, DialogInterface dialogInterface, int i) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void showDialog(@NotNull Context context, @NotNull DialogData dialogData, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        new MaterialAlertDialogBuilder(context).setTitle((CharSequence) dialogData.getTitle()).setMessage((CharSequence) dialogData.getMessage()).setPositiveButton((CharSequence) dialogData.getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: fy
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ContextExtKt.m49931b(function0, dialogInterface, i);
            }
        }).setNegativeButton((CharSequence) dialogData.getNegativeButtonText(), new DialogInterface.OnClickListener() { // from class: gy
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ContextExtKt.m49932a(function02, dialogInterface, i);
            }
        }).show();
    }
}
