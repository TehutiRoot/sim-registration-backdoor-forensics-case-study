package th.p047co.dtac.android.dtacone.manager.multipart;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.multipart.MultiPartService;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\rJ-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m28850d2 = {"Lth/co/dtac/android/dtacone/manager/multipart/MultiPartService;", "Lth/co/dtac/android/dtacone/manager/multipart/IMultipart;", "Lth/co/dtac/android/dtacone/manager/compressor/CompressImage;", "compressor", "<init>", "(Lth/co/dtac/android/dtacone/manager/compressor/CompressImage;)V", "", "bitmapName", "name", "", "quality", "Lokhttp3/MultipartBody$Part;", "getRequestBodyMultiPartFile", "(Ljava/lang/String;Ljava/lang/String;I)Lokhttp3/MultipartBody$Part;", ClientCookie.PATH_ATTR, "getRequestBodyMultiPartFileByPath", "Lio/reactivex/Observable;", "getRequestBodyMultiPartFileObservable", "(Ljava/lang/String;Ljava/lang/String;I)Lio/reactivex/Observable;", "content", "Lokhttp3/RequestBody;", "getRequestBodyMediaPlainText", "(Ljava/lang/String;)Lokhttp3/RequestBody;", "json", "getRequestBodyMediaJson", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/manager/compressor/CompressImage;", "getCompressor", "()Lth/co/dtac/android/dtacone/manager/compressor/CompressImage;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.manager.multipart.MultiPartService */
/* loaded from: classes7.dex */
public class MultiPartService implements IMultipart {
    public static final int $stable = 8;

    /* renamed from: a */
    public final CompressImage f84970a;

    @Inject
    public MultiPartService(@NotNull CompressImage compressor) {
        Intrinsics.checkNotNullParameter(compressor, "compressor");
        this.f84970a = compressor;
    }

    /* renamed from: a */
    public static /* synthetic */ MultipartBody.Part m19249a(MultiPartService multiPartService, String str, String str2, int i) {
        return m19248b(multiPartService, str, str2, i);
    }

    /* renamed from: b */
    public static final MultipartBody.Part m19248b(MultiPartService this$0, String bitmapName, String name, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmapName, "$bitmapName");
        Intrinsics.checkNotNullParameter(name, "$name");
        return this$0.getRequestBodyMultiPartFile(bitmapName, name, i);
    }

    @NotNull
    public final CompressImage getCompressor() {
        return this.f84970a;
    }

    @Override // th.p047co.dtac.android.dtacone.manager.multipart.IMultipart
    @NotNull
    public RequestBody getRequestBodyMediaJson(@Nullable String str) {
        RequestBody.Companion companion = RequestBody.Companion;
        MediaType parse = MediaType.Companion.parse("application/json");
        if (str == null) {
            str = "";
        }
        return companion.create(parse, str);
    }

    @Override // th.p047co.dtac.android.dtacone.manager.multipart.IMultipart
    @NotNull
    public RequestBody getRequestBodyMediaPlainText(@Nullable String str) {
        RequestBody.Companion companion = RequestBody.Companion;
        MediaType parse = MediaType.Companion.parse(HTTP.PLAIN_TEXT_TYPE);
        if (str == null) {
            str = "";
        }
        return companion.create(parse, str);
    }

    @Override // th.p047co.dtac.android.dtacone.manager.multipart.IMultipart
    @NotNull
    public MultipartBody.Part getRequestBodyMultiPartFile(@NotNull String bitmapName, @NotNull String name, int i) {
        Intrinsics.checkNotNullParameter(bitmapName, "bitmapName");
        Intrinsics.checkNotNullParameter(name, "name");
        return MultipartBody.Part.Companion.createFormData(name, this.f84970a.getFileByName(bitmapName, i).getName(), RequestBody.Companion.create(MediaType.Companion.parse("image/*"), this.f84970a.getFileByName(bitmapName, i)));
    }

    @Override // th.p047co.dtac.android.dtacone.manager.multipart.IMultipart
    @NotNull
    public MultipartBody.Part getRequestBodyMultiPartFileByPath(@NotNull String path, @NotNull String name, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(name, "name");
        return MultipartBody.Part.Companion.createFormData(name, this.f84970a.getFileByPath(path, i).getName(), RequestBody.Companion.create(MediaType.Companion.parse("image/*"), this.f84970a.getFileByPath(path, i)));
    }

    @Override // th.p047co.dtac.android.dtacone.manager.multipart.IMultipart
    @NotNull
    public Observable<MultipartBody.Part> getRequestBodyMultiPartFileObservable(@NotNull final String bitmapName, @NotNull final String name, final int i) {
        Intrinsics.checkNotNullParameter(bitmapName, "bitmapName");
        Intrinsics.checkNotNullParameter(name, "name");
        Observable<MultipartBody.Part> fromCallable = Observable.fromCallable(new Callable() { // from class: kG0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return MultiPartService.m19249a(MultiPartService.this, bitmapName, name, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(fromCallable, "fromCallable { getReques…mapName, name, quality) }");
        return fromCallable;
    }
}
