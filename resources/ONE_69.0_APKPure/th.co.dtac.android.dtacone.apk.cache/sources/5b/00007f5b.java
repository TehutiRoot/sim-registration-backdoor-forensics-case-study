package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.zxy.tiny.common.UriUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0090\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022H\b\u0002\u0010\u0011\u001aB\b\u0001\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aI\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a9\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a-\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a)\u0010'\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b'\u0010(\u001a\u0017\u0010)\u001a\u00020\"2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010*\u001a5\u0010+\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a1\u0010/\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u00100\u001a!\u00104\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105\u001a\u0017\u00106\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b6\u00107\u001a\u0013\u00108\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b8\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, m29142d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "spec", "", "imageAssetsFolder", "fontAssetsFolder", "fontFileExtension", "cacheKey", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "failCount", "", "previousException", "Lkotlin/coroutines/Continuation;", "", "", "onRetry", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "rememberLottieComposition", "(Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Lcom/airbnb/lottie/compose/LottieCompositionResult;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/airbnb/lottie/LottieComposition;", OperatorName.FILL_NON_ZERO, "(Landroid/content/Context;Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isWarmingCache", "Lcom/airbnb/lottie/LottieTask;", OperatorName.NON_STROKING_GRAY, "(Landroid/content/Context;Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Z)Lcom/airbnb/lottie/LottieTask;", "T", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lcom/airbnb/lottie/LottieTask;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "composition", "", "e", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/airbnb/lottie/LottieImageAsset;", UriUtil.LOCAL_ASSET_SCHEME, "i", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieImageAsset;Ljava/lang/String;)V", OperatorName.CLOSE_PATH, "(Lcom/airbnb/lottie/LottieImageAsset;)V", "d", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/airbnb/lottie/model/Font;", "font", OperatorName.SET_LINE_JOINSTYLE, "(Landroid/content/Context;Lcom/airbnb/lottie/model/Font;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/graphics/Typeface;", "typeface", "style", OperatorName.LINE_TO, "(Landroid/graphics/Typeface;Ljava/lang/String;)Landroid/graphics/Typeface;", OperatorName.CURVE_TO, "(Ljava/lang/String;)Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "lottie-compose_release"}, m29141k = 2, m29140mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class RememberLottieCompositionKt {

    /* renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$a */
    /* loaded from: classes3.dex */
    public static final class C5691a implements LottieListener {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation f41287a;

        public C5691a(CancellableContinuation cancellableContinuation) {
            this.f41287a = cancellableContinuation;
        }

        @Override // com.airbnb.lottie.LottieListener
        public final void onResult(Object obj) {
            if (!this.f41287a.isCompleted()) {
                this.f41287a.resumeWith(Result.m74271constructorimpl(obj));
            }
        }
    }

    /* renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$b */
    /* loaded from: classes3.dex */
    public static final class C5692b implements LottieListener {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation f41288a;

        public C5692b(CancellableContinuation cancellableContinuation) {
            this.f41288a = cancellableContinuation;
        }

        @Override // com.airbnb.lottie.LottieListener
        /* renamed from: a */
        public final void onResult(Throwable e) {
            if (!this.f41288a.isCompleted()) {
                CancellableContinuation cancellableContinuation = this.f41288a;
                Result.Companion companion = Result.Companion;
                Intrinsics.checkNotNullExpressionValue(e, "e");
                cancellableContinuation.resumeWith(Result.m74271constructorimpl(ResultKt.createFailure(e)));
            }
        }
    }

    /* renamed from: a */
    public static final Object m50812a(LottieTask lottieTask, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        lottieTask.addListener(new C5691a(cancellableContinuationImpl)).addFailureListener(new C5692b(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* renamed from: b */
    public static final String m50811b(String str) {
        if (!AbstractC19741eO1.isBlank(str) && !AbstractC19741eO1.startsWith$default(str, ".", false, 2, null)) {
            return Intrinsics.stringPlus(".", str);
        }
        return str;
    }

    /* renamed from: c */
    public static final String m50810c(String str) {
        if (str == null || AbstractC19741eO1.isBlank(str)) {
            return null;
        }
        if (!StringsKt__StringsKt.endsWith$default((CharSequence) str, '/', false, 2, (Object) null)) {
            return Intrinsics.stringPlus(str, RemoteSettings.FORWARD_SLASH_STRING);
        }
        return str;
    }

    /* renamed from: d */
    public static final Object m50809d(Context context, LottieComposition lottieComposition, String str, String str2, Continuation continuation) {
        if (lottieComposition.getFonts().isEmpty()) {
            return Unit.INSTANCE;
        }
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new RememberLottieCompositionKt$loadFontsFromAssets$2(lottieComposition, context, str, str2, null), continuation);
        if (withContext == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return withContext;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public static final Object m50808e(Context context, LottieComposition lottieComposition, String str, Continuation continuation) {
        if (!lottieComposition.hasImages()) {
            return Unit.INSTANCE;
        }
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new RememberLottieCompositionKt$loadImagesFromAssets$2(lottieComposition, context, str, null), continuation);
        if (withContext == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return withContext;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m50807f(android.content.Context r6, com.airbnb.lottie.compose.LottieCompositionSpec r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.RememberLottieCompositionKt.m50807f(android.content.Context, com.airbnb.lottie.compose.LottieCompositionSpec, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: g */
    public static final LottieTask m50806g(Context context, LottieCompositionSpec lottieCompositionSpec, String str, boolean z) {
        if (lottieCompositionSpec instanceof LottieCompositionSpec.RawRes) {
            if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                return LottieCompositionFactory.fromRawRes(context, ((LottieCompositionSpec.RawRes) lottieCompositionSpec).m74204unboximpl());
            }
            return LottieCompositionFactory.fromRawRes(context, ((LottieCompositionSpec.RawRes) lottieCompositionSpec).m74204unboximpl(), str);
        } else if (lottieCompositionSpec instanceof LottieCompositionSpec.Url) {
            if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                return LottieCompositionFactory.fromUrl(context, ((LottieCompositionSpec.Url) lottieCompositionSpec).m74211unboximpl());
            }
            return LottieCompositionFactory.fromUrl(context, ((LottieCompositionSpec.Url) lottieCompositionSpec).m74211unboximpl(), str);
        } else if (lottieCompositionSpec instanceof LottieCompositionSpec.File) {
            if (z) {
                return null;
            }
            LottieCompositionSpec.File file = (LottieCompositionSpec.File) lottieCompositionSpec;
            FileInputStream fileInputStream = new FileInputStream(file.m74190unboximpl());
            if (AbstractC19741eO1.endsWith$default(file.m74190unboximpl(), "zip", false, 2, null)) {
                ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
                if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                    str = file.m74190unboximpl();
                }
                return LottieCompositionFactory.fromZipStream(zipInputStream, str);
            }
            if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                str = file.m74190unboximpl();
            }
            return LottieCompositionFactory.fromJsonInputStream(fileInputStream, str);
        } else if (lottieCompositionSpec instanceof LottieCompositionSpec.Asset) {
            if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                return LottieCompositionFactory.fromAsset(context, ((LottieCompositionSpec.Asset) lottieCompositionSpec).m74176unboximpl());
            }
            return LottieCompositionFactory.fromAsset(context, ((LottieCompositionSpec.Asset) lottieCompositionSpec).m74176unboximpl(), str);
        } else if (lottieCompositionSpec instanceof LottieCompositionSpec.JsonString) {
            if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                str = String.valueOf(((LottieCompositionSpec.JsonString) lottieCompositionSpec).m74197unboximpl().hashCode());
            }
            return LottieCompositionFactory.fromJsonString(((LottieCompositionSpec.JsonString) lottieCompositionSpec).m74197unboximpl(), str);
        } else if (lottieCompositionSpec instanceof LottieCompositionSpec.ContentProvider) {
            LottieCompositionSpec.ContentProvider contentProvider = (LottieCompositionSpec.ContentProvider) lottieCompositionSpec;
            InputStream openInputStream = context.getContentResolver().openInputStream(contentProvider.m74183unboximpl());
            if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                str = contentProvider.m74183unboximpl().toString();
            }
            return LottieCompositionFactory.fromJsonInputStream(openInputStream, str);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: h */
    public static final void m50805h(LottieImageAsset lottieImageAsset) {
        if (lottieImageAsset.getBitmap() != null) {
            return;
        }
        String filename = lottieImageAsset.getFileName();
        Intrinsics.checkNotNullExpressionValue(filename, "filename");
        if (AbstractC19741eO1.startsWith$default(filename, "data:", false, 2, null) && StringsKt__StringsKt.indexOf$default((CharSequence) filename, "base64,", 0, false, 6, (Object) null) > 0) {
            try {
                String substring = filename.substring(StringsKt__StringsKt.indexOf$default((CharSequence) filename, ',', 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                byte[] decode = Base64.decode(substring, 0);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = SyslogConstants.LOG_LOCAL4;
                lottieImageAsset.setBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e) {
                Logger.warning("data URL did not have correct base64 format.", e);
            }
        }
    }

    /* renamed from: i */
    public static final void m50804i(Context context, LottieImageAsset lottieImageAsset, String str) {
        if (lottieImageAsset.getBitmap() == null && str != null) {
            try {
                InputStream open = context.getAssets().open(Intrinsics.stringPlus(str, lottieImageAsset.getFileName()));
                Intrinsics.checkNotNullExpressionValue(open, "try {\n        context.as…, e)\n        return\n    }");
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = SyslogConstants.LOG_LOCAL4;
                    lottieImageAsset.setBitmap(Utils.resizeBitmapIfNeeded(BitmapFactory.decodeStream(open, null, options), lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
                } catch (IllegalArgumentException e) {
                    Logger.warning("Unable to decode image.", e);
                }
            } catch (IOException e2) {
                Logger.warning("Unable to open asset.", e2);
            }
        }
    }

    /* renamed from: j */
    public static final void m50803j(Context context, Font font, String str, String str2) {
        String str3 = ((Object) str) + ((Object) font.getFamily()) + str2;
        try {
            Typeface typefaceWithDefaultStyle = Typeface.createFromAsset(context.getAssets(), str3);
            try {
                Intrinsics.checkNotNullExpressionValue(typefaceWithDefaultStyle, "typefaceWithDefaultStyle");
                String style = font.getStyle();
                Intrinsics.checkNotNullExpressionValue(style, "font.style");
                font.setTypeface(m50801l(typefaceWithDefaultStyle, style));
            } catch (Exception e) {
                Logger.error("Failed to create " + ((Object) font.getFamily()) + " typeface with style=" + ((Object) font.getStyle()) + '!', e);
            }
        } catch (Exception e2) {
            Logger.error("Failed to find typeface in assets with path " + str3 + '.', e2);
        }
    }

    /* renamed from: k */
    public static final LottieCompositionResultImpl m50802k(MutableState mutableState) {
        return (LottieCompositionResultImpl) mutableState.getValue();
    }

    /* renamed from: l */
    public static final Typeface m50801l(Typeface typeface, String str) {
        int i = 0;
        boolean contains$default = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "Italic", false, 2, (Object) null);
        boolean contains$default2 = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "Bold", false, 2, (Object) null);
        if (contains$default && contains$default2) {
            i = 3;
        } else if (contains$default) {
            i = 2;
        } else if (contains$default2) {
            i = 1;
        }
        if (typeface.getStyle() != i) {
            return Typeface.create(typeface, i);
        }
        return typeface;
    }

    @Composable
    @NotNull
    public static final LottieCompositionResult rememberLottieComposition(@NotNull LottieCompositionSpec spec, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Function3<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function3, @Nullable Composer composer, int i, int i2) {
        String str5;
        String str6;
        String str7;
        String str8;
        RememberLottieCompositionKt$rememberLottieComposition$1 rememberLottieCompositionKt$rememberLottieComposition$1;
        Intrinsics.checkNotNullParameter(spec, "spec");
        composer.startReplaceableGroup(1388713460);
        if ((i2 & 2) != 0) {
            str5 = null;
        } else {
            str5 = str;
        }
        if ((i2 & 4) != 0) {
            str6 = "fonts/";
        } else {
            str6 = str2;
        }
        if ((i2 & 8) != 0) {
            str7 = ".ttf";
        } else {
            str7 = str3;
        }
        if ((i2 & 16) != 0) {
            str8 = "__LottieInternalDefaultCacheKey__";
        } else {
            str8 = str4;
        }
        if ((i2 & 32) != 0) {
            rememberLottieCompositionKt$rememberLottieComposition$1 = new RememberLottieCompositionKt$rememberLottieComposition$1(null);
        } else {
            rememberLottieCompositionKt$rememberLottieComposition$1 = function3;
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        int i3 = i & 14;
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(spec);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = AbstractC19036aL1.m65148g(new LottieCompositionResultImpl(), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        int i4 = i3 | ((i >> 9) & 112);
        composer.startReplaceableGroup(-3686552);
        boolean changed2 = composer.changed(spec) | composer.changed(str8);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(m50806g(context, spec, str8, true));
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(spec, str8, new RememberLottieCompositionKt$rememberLottieComposition$3(rememberLottieCompositionKt$rememberLottieComposition$1, context, spec, str5, str6, str7, str8, mutableState, null), composer, i4);
        LottieCompositionResultImpl m50802k = m50802k(mutableState);
        composer.endReplaceableGroup();
        return m50802k;
    }
}