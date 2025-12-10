package com.chuckerteam.chucker.internal.support;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.ShareCompat;
import androidx.core.content.FileProvider;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.internal.support.Logger;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p023io.CloseableKt;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a-\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28850d2 = {"shareAsFile", "Landroid/content/Intent;", "Lcom/chuckerteam/chucker/internal/support/Sharable;", "activity", "Landroid/app/Activity;", "fileName", "", "intentTitle", "intentSubject", "clipDataLabel", "shareAsUtf8Text", "(Lcom/chuckerteam/chucker/internal/support/Sharable;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSharableUtf8Content", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "writeToFile", "Landroid/net/Uri;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSharable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sharable.kt\ncom/chuckerteam/chucker/internal/support/SharableKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
/* loaded from: classes3.dex */
public final class SharableKt {
    @Nullable
    public static final Intent shareAsFile(@NotNull Sharable sharable, @NotNull Activity activity, @NotNull String fileName, @NotNull String intentTitle, @NotNull String intentSubject, @NotNull String clipDataLabel) {
        Intrinsics.checkNotNullParameter(sharable, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(intentTitle, "intentTitle");
        Intrinsics.checkNotNullParameter(intentSubject, "intentSubject");
        Intrinsics.checkNotNullParameter(clipDataLabel, "clipDataLabel");
        Uri writeToFile = writeToFile(sharable, activity, fileName);
        if (writeToFile == null) {
            return null;
        }
        Intent intent = new ShareCompat.IntentBuilder(activity).setType(activity.getContentResolver().getType(writeToFile)).setChooserTitle(intentTitle).setSubject(intentSubject).setStream(writeToFile).getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "IntentBuilder(activity)\n…ream(uri)\n        .intent");
        intent.setClipData(ClipData.newRawUri(clipDataLabel, writeToFile));
        intent.addFlags(1);
        return Intent.createChooser(intent, intentTitle);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object shareAsUtf8Text(@org.jetbrains.annotations.NotNull com.chuckerteam.chucker.internal.support.Sharable r5, @org.jetbrains.annotations.NotNull android.app.Activity r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super android.content.Intent> r9) {
        /*
            boolean r0 = r9 instanceof com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$1
            if (r0 == 0) goto L13
            r0 = r9
            com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$1 r0 = (com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$1 r0 = new com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r5 = r0.L$2
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r5 = r0.L$1
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.L$0
            r6 = r5
            android.app.Activity r6 = (android.app.Activity) r6
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5c
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getDefault()
            com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$content$1 r2 = new com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$content$1
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r2, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            java.lang.String r9 = (java.lang.String) r9
            androidx.core.app.ShareCompat$IntentBuilder r5 = new androidx.core.app.ShareCompat$IntentBuilder
            r5.<init>(r6)
            java.lang.String r6 = "text/plain"
            androidx.core.app.ShareCompat$IntentBuilder r5 = r5.setType(r6)
            androidx.core.app.ShareCompat$IntentBuilder r5 = r5.setChooserTitle(r7)
            androidx.core.app.ShareCompat$IntentBuilder r5 = r5.setSubject(r8)
            androidx.core.app.ShareCompat$IntentBuilder r5 = r5.setText(r9)
            android.content.Intent r5 = r5.createChooserIntent()
            java.lang.String r6 = "IntentBuilder(activity)\n…   .createChooserIntent()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.support.SharableKt.shareAsUtf8Text(com.chuckerteam.chucker.internal.support.Sharable, android.app.Activity, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final String toSharableUtf8Content(@NotNull Sharable sharable, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(sharable, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        BufferedSource buffer = Okio.buffer(sharable.toSharableContent(context));
        try {
            String readUtf8 = buffer.readUtf8();
            CloseableKt.closeFinally(buffer, null);
            return readUtf8;
        } finally {
        }
    }

    @Nullable
    public static final Uri writeToFile(@NotNull Sharable sharable, @NotNull Context context, @NotNull String fileName) {
        Sink m28940q;
        Intrinsics.checkNotNullParameter(sharable, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            Logger.DefaultImpls.warn$default(Logger.Companion, "Failed to obtain a valid cache directory for file export", null, 2, null);
            return null;
        }
        File create = FileFactory.INSTANCE.create(cacheDir, fileName);
        if (create == null) {
            Logger.DefaultImpls.warn$default(Logger.Companion, "Failed to create an export file", null, 2, null);
            return null;
        }
        Source sharableContent = sharable.toSharableContent(context);
        m28940q = AbstractC20711kK0.m28940q(create, false, 1, null);
        BufferedSink buffer = Okio.buffer(m28940q);
        try {
            buffer.writeAll(sharableContent);
            CloseableKt.closeFinally(buffer, null);
            String packageName = context.getPackageName();
            return FileProvider.getUriForFile(context, packageName + ".com.chuckerteam.chucker.provider", create);
        } finally {
        }
    }
}
