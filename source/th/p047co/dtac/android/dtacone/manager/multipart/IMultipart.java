package th.p047co.dtac.android.dtacone.manager.multipart;

import io.reactivex.Observable;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rH&J\"\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rH&J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rH&¨\u0006\u0012"}, m28850d2 = {"Lth/co/dtac/android/dtacone/manager/multipart/IMultipart;", "", "getRequestBodyMediaJson", "Lokhttp3/RequestBody;", "json", "", "getRequestBodyMediaPlainText", "content", "getRequestBodyMultiPartFile", "Lokhttp3/MultipartBody$Part;", "bitmapName", "name", "quality", "", "getRequestBodyMultiPartFileByPath", ClientCookie.PATH_ATTR, "getRequestBodyMultiPartFileObservable", "Lio/reactivex/Observable;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.manager.multipart.IMultipart */
/* loaded from: classes7.dex */
public interface IMultipart {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.manager.multipart.IMultipart$DefaultImpls */
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ MultipartBody.Part getRequestBodyMultiPartFile$default(IMultipart iMultipart, String str, String str2, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    i = 80;
                }
                return iMultipart.getRequestBodyMultiPartFile(str, str2, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRequestBodyMultiPartFile");
        }

        public static /* synthetic */ MultipartBody.Part getRequestBodyMultiPartFileByPath$default(IMultipart iMultipart, String str, String str2, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    i = 80;
                }
                return iMultipart.getRequestBodyMultiPartFileByPath(str, str2, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRequestBodyMultiPartFileByPath");
        }

        public static /* synthetic */ Observable getRequestBodyMultiPartFileObservable$default(IMultipart iMultipart, String str, String str2, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    i = 80;
                }
                return iMultipart.getRequestBodyMultiPartFileObservable(str, str2, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRequestBodyMultiPartFileObservable");
        }
    }

    @NotNull
    RequestBody getRequestBodyMediaJson(@Nullable String str);

    @NotNull
    RequestBody getRequestBodyMediaPlainText(@Nullable String str);

    @NotNull
    MultipartBody.Part getRequestBodyMultiPartFile(@NotNull String str, @NotNull String str2, int i);

    @NotNull
    MultipartBody.Part getRequestBodyMultiPartFileByPath(@NotNull String str, @NotNull String str2, int i);

    @NotNull
    Observable<MultipartBody.Part> getRequestBodyMultiPartFileObservable(@NotNull String str, @NotNull String str2, int i);
}
